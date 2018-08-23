package cn.appmanager.service.app_info;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;


import cn.appmanager.dao.app_info.App_InfoMapper;

import cn.appmanager.dao.app_info.App_InfoMapper;
import cn.appmanager.pojo.App_Info;
import cn.appmanager.tools.PageSupport;

@Service
public class App_infoServiceImpl implements App_infoService {
	@Resource
	private App_InfoMapper app_InfoMapper;
	//查询全部信息
	public List<App_Info> getInfoList(String softwareName, String status, String flatformId, String categoryLevel1,
			String categoryLevel2, String categoryLevel3, int start, int pageSize) {
		return app_InfoMapper.getApp_InfoList(softwareName, status, flatformId, categoryLevel1, categoryLevel2, categoryLevel3, start, pageSize);
	}

	//查询全部数量
	public int getApp_InfoCount(String softwareName, String status, String flatformId, String categoryLevel1,
			String categoryLevel2, String categoryLevel3) {
		return app_InfoMapper.getApp_InfoCount(softwareName, status, flatformId, categoryLevel1, categoryLevel2, categoryLevel3);
	}

	
	//查询分级列表
	public List<App_Info> getCategoryLevel1List(String categoryLevel1) {
		return app_InfoMapper.getCategoryLevel1List(categoryLevel1);
	}
	public List<App_Info> getCategoryLevel2List(String categoryLevel2) {
		return app_InfoMapper.getCategoryLevel2List(categoryLevel2);
	}
	public List<App_Info> getCategoryLevel3List(String categoryLevel3) {
		return app_InfoMapper.getCategoryLevel3List(categoryLevel3);
	}
	
	

	//修改APP信息
	public int updateAppInfo(App_Info app_Info){
		return app_InfoMapper.updateAppInfo(app_Info);
	}
	//查APP信息ById
	public App_Info appInfoById(Integer id){
		return app_InfoMapper.appInfoById(id);
	}

	
	//获得待审核APP列表
	@Override
	public PageSupport getCheckingApp(PageSupport page) {
		// TODO Auto-generated method stub
		page.setTotalCount(this.app_InfoMapper.countCheckingApp());
		page.setPageSize(5);
		page.setList(this.app_InfoMapper.getCheckingAppList(page));
		return page;
	}

	//审核APP
	public int checkApp(Integer id) {
		// TODO Auto-generated method stub
		return this.app_InfoMapper.checkApp(id);
	}

}
