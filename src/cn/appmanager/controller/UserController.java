package cn.appmanager.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cn.appmanager.pojo.App_Info;
import cn.appmanager.service.app_info.App_infoService;

@Controller
@RequestMapping(value="/user")
public class UserController {
	@Resource
	private App_infoService app_infoService;
	
	@RequestMapping(value="/test.html")
	public String test(){
		System.out.println(">>>>>>>>>>>>>>>>>>>>>.");
		return "test";
	}
	//修改APP基本信息
	@RequestMapping(value="/updateApp_Info.html")
	public String updateApp_Info(){
		return "updateApp_Info";
	}
	
	@RequestMapping(value="/updateApp_InfoSave.html",method=RequestMethod.POST)
	public String updateApp_InfoSave(@RequestParam("App_Info")App_Info app_Info){
		if()
		return "a";
	}

	
	
}
