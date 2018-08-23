package cn.appmanager.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cn.appmanager.pojo.App_Category;
import cn.appmanager.pojo.App_Info;
import cn.appmanager.service.app_info.App_infoService;
import cn.appmanager.tools.Constants;
import cn.appmanager.tools.PageSupport;

@Controller
@RequestMapping(value="/user")
public class UserController {
	@Resource
	private App_infoService app_infoService;
	

	
	//查看全部信息
	@RequestMapping(value="/App_InfoList.html")
	public String getApp_InfoList(Model model,
								  @RequestParam(value="softwareName",required=false)String softwareName,
								  @RequestParam(value="status",required=false)String status,
								  @RequestParam(value="flatformId",required=false)String flatformId,
								  @RequestParam(value="categoryLevel1",required=false)String categoryLevel1,
								  @RequestParam(value="categoryLevel2",required=false)String categoryLevel2,
								  @RequestParam(value="categoryLevel3",required=false)String categoryLevel3,
								  @RequestParam(value="start",required=false)int start,
								  @RequestParam(value="pageIndex",required=false)String pageIndex){
		
		List<App_Info> app_InfoList = null;
		List<App_Category> categoryLevel1List=null;
		List<App_Category> categoryLevel2List=null;
		List<App_Category> categoryLevel3List=null;
		// 设置页面容量
		int pageSize = Constants.pageSize;
		// 当前页码
		int currentPageNo = 1;
		if (softwareName == null) {
			softwareName = "";
		}
		if (status == null) {
			status = "";
		}
		if (flatformId == null) {
			flatformId = "";
		}
		if (categoryLevel1 == null) {
			categoryLevel1 = "";
		}
		if (categoryLevel2 == null) {
			categoryLevel2 = "";
		}
		if (categoryLevel3 == null) {
			categoryLevel3 = "";
		}
		if (pageIndex!= null) {
			currentPageNo = Integer.valueOf(pageIndex);

		}
		// 信息总数
		int totalCount = app_infoService.getApp_InfoCount(softwareName, status, flatformId, categoryLevel1, categoryLevel2, categoryLevel3);
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

		int from = (currentPageNo - 1) * pageSize;

		app_InfoList = app_infoService.getInfoList(softwareName, status, flatformId, categoryLevel1, categoryLevel2, categoryLevel3, start, pageSize);
		model.addAttribute("app_InfoList", app_InfoList);
		model.addAttribute("categoryLevel1List",categoryLevel1List);
		model.addAttribute("categoryLevel2List",categoryLevel2List);
		model.addAttribute("categoryLevel3List",categoryLevel3List);
		model.addAttribute("softwareName", softwareName);
		model.addAttribute("status", status);
		model.addAttribute("flatformId", flatformId);
		model.addAttribute("categoryLevel1", categoryLevel1);
		model.addAttribute("categoryLevel2", categoryLevel2);
		model.addAttribute("categoryLevel3", categoryLevel3);
		model.addAttribute("currentPageNo", currentPageNo);
		model.addAttribute("totalPageCount", totalPageCount);
		model.addAttribute("totalCount", totalCount);
		return "app_infolist";
	}
		

	
	//跳转修改APP基本信息
	@RequestMapping(value="/updateApp_Info.html")
	public String updateApp_Info(int id){
		return "updateApp";
	}
	//保存修改
	@RequestMapping(value="/updateApp_InfoSave.html",method=RequestMethod.POST)
	public String updateApp_InfoSave(@RequestParam("App_Info")App_Info app_Info,
										Model model){
		if(app_infoService.updateAppInfo(app_Info)>0){
			return "app_infolist";
		}
		model.addAttribute("id",app_Info.getId());
		return "updateApp";
	}
	
	
}
