package cn.appmanager.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.appmanager.service.app_info.App_infoService;
import cn.appmanager.tools.PageSupport;

@Controller
@RequestMapping(value="/manager")
public class ManagerController {
	@Resource
	App_infoService app_infoService;
	@RequestMapping(value="checkapp")
	public ModelAndView checkapp(HttpServletRequest request){
		ModelAndView model = new ModelAndView("checkapp");
		int pageIndex = 1;
		if(null!=request.getParameter("page")){
			pageIndex=Integer.parseInt(request.getParameter("page"));
		}
		PageSupport page = new PageSupport();
		page.setCurrentPageNo(pageIndex);
		page=this.app_infoService.getCheckingApp(page);
		return null;
	}
}
