package cn.appmanager.service.app_info;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;


import cn.appmanager.dao.app_info.App_InfoMapper;

import cn.appmanager.dao.app_info.App_InfoMapper;
import cn.appmanager.pojo.App_Info;

@Service
public class App_infoServiceImpl implements App_infoService {
	@Resource
	private App_InfoMapper app_InfoMapper;
	
	public List<App_Info> getInfoList(String softwareName, String status, String flatformId, String categoryLevel1,
			String categoryLevel2, String categoryLevel3, int start, int pageSize) {
		return app_InfoMapper.getApp_InfoList(softwareName, status, flatformId, categoryLevel1, categoryLevel2, categoryLevel3, start, pageSize);
	}

	@Override
	public int getApp_InfoCount(String softwareName, String status, String flatformId, String categoryLevel1,
			String categoryLevel2, String categoryLevel3) {
		return app_InfoMapper.getApp_InfoCount(softwareName, status, flatformId, categoryLevel1, categoryLevel2, categoryLevel3);
	}


	//修改APP信息
	public int updateAppInfo(App_Info app_Info){
		return app_InfoMapper.updateAppInfo(app_Info);
	}
	//查APP信息ById
	public App_Info appInfoById(Integer id){
		return app_InfoMapper.appInfoById(id);
	}

}
