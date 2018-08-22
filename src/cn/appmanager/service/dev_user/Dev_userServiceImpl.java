package cn.appmanager.service.dev_user.Dev_userService;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.appmanager.dao.div_user.Div_UserMapper;
import cn.appmanager.pojo.Div_User;

@Service
public class Dev_userServiceImpl implements Dev_userService{
	@Resource
	private Div_UserMapper  div_UserMapper;
	
	@Override
	public int userlogin(Div_User div_user) {
		// TODO Auto-generated method stub
		return div_UserMapper.div_UserLogin(div_user.getDevCode(), div_user.getDevPassword());
	}
	
}
