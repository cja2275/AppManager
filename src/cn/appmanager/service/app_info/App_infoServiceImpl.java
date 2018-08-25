package cn.appmanager.service.app_info;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;


import cn.appmanager.dao.app_info.App_InfoMapper;

import cn.appmanager.pojo.App_Info;
import cn.appmanager.tools.PageSupport;

@Service
public class App_infoServiceImpl implements App_infoService {
	@Resource
	private App_InfoMapper app_InfoMapper;
	//查询全部信息
	public List<App_Info> getInfoList(String softwareName, Integer status, Integer flatformId, Integer categoryLevel1,
			Integer categoryLevel2, Integer categoryLevel3, Integer currentPageNo, Integer pageSize) {
		return app_InfoMapper.getApp_InfoList(softwareName, status, flatformId, categoryLevel1, categoryLevel2, categoryLevel3, currentPageNo, pageSize);
	}

	//查询全部数量
	public int getApp_InfoCount(String softwareName, Integer status, Integer flatformId, Integer categoryLevel1,
			Integer categoryLevel2, Integer categoryLevel3) {
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

	
	//获得待审核APP列表
	@Override
	public PageSupport getCheckingApp(PageSupport page) {
		// TODO Auto-generated method stub
		page.setTotalCount(this.app_InfoMapper.countCheckingApp());

		page.setList(this.app_InfoMapper.getCheckingAppList(page));
		return page;
	}

	//审核APP
	public int checkApp(Integer id) {
		// TODO Auto-generated method stub
		return this.app_InfoMapper.checkApp(id);
	}
	//删除app信息byID
			public int delAppInfo(Integer id){
				return this.app_InfoMapper.delAppInfo(id);
			}
}
