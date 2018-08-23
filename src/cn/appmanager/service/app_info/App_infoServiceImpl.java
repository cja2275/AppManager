package cn.appmanager.service.app_info;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.appmanager.dao.app_info.App_InfoMapper;
import cn.appmanager.pojo.App_Info;

@Service
public class App_infoServiceImpl implements App_infoService {
	@Resource
	private App_InfoMapper app_InfoMapper;
	
	//修改APP信息
	public int updateAppInfo(App_Info app_Info){
		return app_InfoMapper.updateAppInfo(app_Info);
	}
	//查APP信息ById
	public App_Info appInfoById(Integer id){
		return app_InfoMapper.appInfoById(id);
	}
}
