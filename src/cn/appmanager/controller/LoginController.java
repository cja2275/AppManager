package cn.appmanager.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.appmanager.pojo.Div_User;
import cn.appmanager.service.dev_user.Dev_userService;

@Controller

public class LoginController {
	@Resource
	private Dev_userService dev_userService;
	
	@RequestMapping(value="/login.html")
	public String login(){
		System.out.println("in");
		return "login";
	}
	
	@RequestMapping(value="/userlogin")
	public String userlogin(HttpServletRequest request,Div_User div_user ){
		int result = this.dev_userService.userlogin(div_user);
		if(result==1){
			return "";
		}
		
		return null;
	
	}
}
