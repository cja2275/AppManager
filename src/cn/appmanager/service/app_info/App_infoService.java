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
}
