package cn.appmanager.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.appmanager.pojo.Backend_User;
import cn.appmanager.pojo.Div_User;

import cn.appmanager.service.backend_user.Backend_userService;
import cn.appmanager.service.dev_user.Dev_userService;

@Controller

public class LoginController {
	@Resource
	private Dev_userService dev_userService;
	@Resource
	private Backend_userService backend_userService;
	
	@RequestMapping(value="/devUserlogin.html")
	public String login(){
		return "userlogin";
	}
	@RequestMapping(value="/managerlogin.html")
	public String managerlogin(){
		return "managerlogin";
	}
	
	//开发用户登录
	@RequestMapping(value="/devUserlogin",method=RequestMethod.POST)
	public String devUserlogin(HttpServletRequest request,Div_User div_user ){
		int result = this.dev_userService.userlogin(div_user);
		if(result==1){
			request.getSession().setAttribute("login", "divUser");
			System.out.println("login");
			return "redirect:/user/app_infolist.html";
		}else{
			System.out.println("faillogin");
		}
		return "userlogin";
	}
	
	//后台用户登录
	@RequestMapping(value="/backUserlogin",method=RequestMethod.POST)
	public String backUserlogin(HttpServletRequest request,Backend_User backend_User ){
		int result = this.backend_userService.login(backend_User);
		if(1==result){
			request.getSession().setAttribute("login", "backendUser");
			return "redirect:/manager/checkapp";
		}
		return "managerlogin";
	}
	
	//注销
	@RequestMapping(value="/cancel")
	public String cancel(HttpServletRequest request){
		request.getSession().removeAttribute("login");
		return "nologin";
	}
	
	@RequestMapping(value="/nologin")
	public String nologin(){
		return "nologin";
	}
}
