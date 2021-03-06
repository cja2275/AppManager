package cn.appmanager.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import cn.appmanager.pojo.App_Category;
import cn.appmanager.pojo.App_Info;
import cn.appmanager.pojo.Data_Dictionary;

import cn.appmanager.service.app_category.App_categoryService;
import cn.appmanager.service.app_info.App_infoService;
import cn.appmanager.service.data_dictionary.Data_dictionaryService;
import cn.appmanager.tools.Constants;
import cn.appmanager.tools.PageSupport;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	@Resource
	private App_infoService app_infoService;
	@Resource
	private Data_dictionaryService data_dictionaryService;
	@Resource
	private App_categoryService app_categoryService;

	// 查看全部信息
	@RequestMapping(value = "/app_infolist.html")
	public String getApp_InfoList(Model model,
			@RequestParam(value = "softwareName", required = false) String softwareName,
			@RequestParam(value = "status", required = false) String _status,
			@RequestParam(value = "flatformId", required = false) String _flatformId,
			@RequestParam(value = "categoryLevel1", required = false) String _categoryLevel1,
			@RequestParam(value = "categoryLevel2", required = false) String _categoryLevel2,
			@RequestParam(value = "categoryLevel3", required = false) String _categoryLevel3,
			@RequestParam(value = "pageIndex", required = false) String pageIndex) {
		List<App_Info> app_InfoList = null;
		List<Data_Dictionary> statusList = null;
		List<Data_Dictionary> flatformIdList = null;
		List<App_Category> categoryLevel1List = null;
		// 设置页面容量
		int pageSize = Constants.pageSize;
		// 当前页码
		int currentPageNo = 1;
		if (softwareName == null) {
			softwareName = "";
		}

		if (pageIndex != null) {
			currentPageNo = Integer.valueOf(pageIndex);
		}

		Integer status = null;
		if (_status != null && !(("").equals(_status))) {
			System.out.println("能进来吗查状态");
			status = Integer.parseInt(_status);
			
		}
		Integer flatformId = null;
		if (_flatformId != null && !(("").equals(_flatformId))) {
			System.out.println("能进来吗查平台");
			flatformId = Integer.parseInt(_flatformId);
		}

		Integer categoryLevel1 = null;
		if (_categoryLevel1 != null && !(("").equals(_categoryLevel1))) {
			categoryLevel1 = Integer.parseInt(_categoryLevel1);
		}

		Integer categoryLevel2 = null;
		if (_categoryLevel2 != null && !(("").equals(_categoryLevel2))) {
			categoryLevel2 = Integer.parseInt(_categoryLevel2);
		}

		Integer categoryLevel3 = null;
		if (_categoryLevel3 != null && !(("").equals(_categoryLevel3))) {
			categoryLevel3 = Integer.parseInt(_categoryLevel3);
		}


		// 信息总数
		int totalCount = app_infoService.getApp_InfoCount(softwareName, status, flatformId, categoryLevel1,
				categoryLevel2, categoryLevel3);
		// 总页数
		PageSupport pages = new PageSupport();

		pages.setPageSize(pageSize);
		pages.setCurrentPageNo(currentPageNo);
		pages.setTotalCount(totalCount);
		int totalPageCount = pages.getTotalPageCount();
		// 控制首页和尾页
		if (currentPageNo < 1) {
			currentPageNo = 1;
		} else if (currentPageNo > totalPageCount) {
			currentPageNo = totalPageCount;
		}

		Integer start=(currentPageNo-1)*pageSize;
		app_InfoList = app_infoService.getInfoList(softwareName, status, flatformId, categoryLevel1, categoryLevel2,
				categoryLevel3, start,pageSize);
		statusList = data_dictionaryService.getData_DictionaryList("APP_STATUS");
		flatformIdList = data_dictionaryService.getData_DictionaryList("APP_FLATFORM");
		categoryLevel1List = app_categoryService.getCategoryLevelListByParentId(null);
		model.addAttribute("app_InfoList", app_InfoList);
		model.addAttribute("statusList", statusList);
		model.addAttribute("flatformIdList", flatformIdList);
		model.addAttribute("categoryLevel1List", categoryLevel1List);
		model.addAttribute("softwareName", softwareName);
		model.addAttribute("status", status);
		model.addAttribute("flatformId", flatformId);
		model.addAttribute("categoryLevel1", categoryLevel1);
		model.addAttribute("categoryLevel2", categoryLevel2);
		model.addAttribute("categoryLevel3", categoryLevel3);
		model.addAttribute("currentPageNo", currentPageNo);
		model.addAttribute("totalPageCount", totalPageCount);
		model.addAttribute("totalCount", totalCount);
		model.addAttribute("pages", pages);
		return "app_infolist";
	}

	// 接受ajax请求返回分类列表
	@RequestMapping(value = "/abc.html")
	public List getplatformlistbyparentid(HttpServletRequest request) {
		Integer parentId = Integer.parseInt(request.getParameter("parentId"));
		return app_categoryService.getCategoryLevelListByParentId(parentId);
	}
	
		
	//跳转修改APP基本信息
	@RequestMapping(value="/updateApp_Info.html")
	public String updateApp_Info(@RequestParam("id")int id,Model model){
		System.out.println("id======================"+id);
		App_Info a=app_infoService.appInfoById(id);
		List<Data_Dictionary> statusList=data_dictionaryService.getAPP_STATUSList();
		System.out.println(a.getAPKName());
		//查二级分类列表
		Integer parentId2=app_categoryService.getParentIdByID(a.getCategoryLevel2());
		System.out.println("parentId2==========="+parentId2);
		//查三级分类列表
		Integer parentId3=app_categoryService.getParentIdByID(a.getCategoryLevel3());
		System.out.println("parentId3==========="+parentId3);
		List<Data_Dictionary> list=data_dictionaryService.getPlatformList();
		List<App_Category> categeoryList=app_infoService.getCategoryList(null);
		List<App_Category> categeoryList2=app_infoService.getCategoryList(parentId2);
		List<App_Category> categeoryList3=app_infoService.getCategoryList(parentId3);
		
		model.addAttribute("status",statusList);
		model.addAttribute("app_Info",a);
		model.addAttribute("flatformList",list);
		
		return "updateApp";
	}

		// 增加app信息
	@RequestMapping(value = "/addapp_info.html")
	public String addApp_Info(Model model) {
		List<Data_Dictionary> flatformIdList = data_dictionaryService.getData_DictionaryList("APP_FLATFORM");
		List<App_Category> categoryLevel1List = app_categoryService.getCategoryLevelListByParentId(null);
		model.addAttribute("flatformIdList", flatformIdList);
		model.addAttribute("categoryLevel1List", categoryLevel1List);
		return "addapp_info";
	}

	// 增加保存
	@RequestMapping(value = "/addapp_infosave.html", method = RequestMethod.POST)
	public String addApp_InfoSave(App_Info app_Info, Model model) {
		if (app_infoService.addApp_Info(app_Info) > 0) {
			return "redirect:/user/app_infolist.html";
		}
		model.addAttribute("id", app_Info.getId());
		return "addapp_info";
	}

	
	// 保存修改
	@RequestMapping(value = "/updateApp_InfoSave.html", method = RequestMethod.POST)
	public String updateApp_InfoSave(@RequestParam("App_Info") App_Info app_Info, Model model) {
		if (app_infoService.updateAppInfo(app_Info) > 0) {
			return "app_infolist";
		}
		model.addAttribute("id", app_Info.getId());
		return "updateApp";
	}

	// 显示分级列表
	@RequestMapping("/getcategoryname.html")
	@ResponseBody
	public void getcategoryname(@RequestParam("id") Integer id, HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		List list = app_categoryService.getCategoryLevelListByParentId(id);

		String json = JSON.toJSONString(list);

		out.print(json);
		out.flush();
		out.close();
	}

	// 删除app信息
	@RequestMapping("/delappinfo.html")
	public String delAppInfo(@RequestParam("id") Integer id, Model model) {
		int i = app_infoService.delAppInfo(id);
		if (i > 0) {
			model.addAttribute("error", "删除成功");
		} else {
			model.addAttribute("error", "删除失败");
		}
		return "redirect:/user/app_infolist.html";
	}

	@RequestMapping("/login.html")
	public String login(){
		return "login";
	}



}
