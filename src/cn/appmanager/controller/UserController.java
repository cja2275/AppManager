package cn.appmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/user")
public class UserController {
	
	@RequestMapping(value="/test.html")
	public String test(){
		System.out.println(">>>>>>>>>>>>>>>>>>>>>.");
		return "test";
	}
}
