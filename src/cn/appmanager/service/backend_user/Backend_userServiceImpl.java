package cn.appmanager.service.backend_user;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.appmanager.dao.backend_user.Backend_UserMapper;
import cn.appmanager.pojo.Backend_User;

@Service
public class Backend_userServiceImpl implements Backend_userService {
	@Resource
	Backend_UserMapper backend_UserMapper;
	@Override
	public int login(Backend_User backend_User) {
		// TODO Auto-generated method stub
		return this.backend_UserMapper.login(backend_User);
	}

}
