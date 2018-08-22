package cn.appmanager.service.app_info;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.appmanager.dao.app_info.App_InfoMapper;

@Service
public class App_infoServiceImpl implements App_infoService {
	@Resource
	private App_InfoMapper app_InfoMapper;
}
