package cn.appmanager.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cn.appmanager.service.app_info.App_infoService;
import cn.appmanager.tools.PageSupport;

@Controller
@RequestMapping(value="/manager")
public class ManagerController {
	@Resource
	App_infoService app_infoService;
	
	//获取审核列表页面
	@RequestMapping(value="/checkapp")
	public ModelAndView checkapp(HttpServletRequest request){
		ModelAndView model = new ModelAndView("checkapp");
		PageSupport page = new PageSupport();
		int pageIndex = 1;
		if(null!=request.getParameter("pageIndex")){
			pageIndex=Integer.parseInt(request.getParameter("pageIndex"));
		}

		page.setCurrentPageNo(pageIndex);
		page.setPageSize(5);
		page=this.app_infoService.getCheckingApp(page);
		model.addObject(page);
		return model;
	}
	
	//用Ajax异步提交审核APP,返回Json数据装载审核结果
	@RequestMapping(value="/checkappbyid")
	public void checkAppById(HttpServletResponse response,HttpServletRequest request) throws IOException{
		PrintWriter out = response.getWriter();
		Integer id = Integer.parseInt(request.getParameter("id"));
		if(this.app_infoService.checkApp(id)==1){
			out.print("checksuccess");
		}
		out.print("checkfail");
        out.flush();
        out.close();
		
	}
}
