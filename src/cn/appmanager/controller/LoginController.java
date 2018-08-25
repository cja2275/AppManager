package cn.appmanager.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
	
	@RequestMapping(value="/login.html")
	public String login(){
		System.out.println("in");
		return "login";
	}
	
	//开发用户登录
	@RequestMapping(value="/devUserlogin")
	public String devUserlogin(HttpServletRequest request,Div_User div_user ){
		int result = this.dev_userService.userlogin(div_user);
		if(result==1){
			request.getSession().setAttribute("login", "divUser");
			return "";
		}
		return "";
	}
	
	//后台用户登录
	@RequestMapping(value="/backUserlogin")
	public String backUserlogin(HttpServletRequest request,Backend_User backend_User ){
		int result = this.backend_userService.login(backend_User);
		if(1==result){
			request.getSession().setAttribute("login", "backendUser");
			return "checkapp";
		}
		return "login";
	}
	
	//注销
	@RequestMapping(value="/cancel")
	public String cancel(@RequestBody HttpServletRequest request){
		request.getSession().removeAttribute("login");
		return "true";
	}
}
