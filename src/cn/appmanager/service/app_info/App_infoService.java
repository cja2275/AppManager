package cn.appmanager.service.app_info;


import java.util.List;

import org.springframework.ui.Model;

import cn.appmanager.pojo.App_Info;

public interface App_infoService {
	public List<App_Info> getInfoList(String softwareName,String status,String flatformId,
			String categoryLevel1,String categoryLevel2,String categoryLevel3,
			int start,int pageSize);
	
	
	public int getApp_InfoCount(String softwareName,String status,String flatformId,
								String categoryLevel1,String categoryLevel2,String categoryLevel3);

	//修改APP信息
		public int updateAppInfo(App_Info app_Info);
		//查app信息byID
	public App_Info appInfoById(Integer id);

}
