package cn.appmanager.service.app_info;

import java.util.List;

import cn.appmanager.pojo.App_Info;

public interface App_infoService {
	public List<App_Info> getInfoList(String softwareName,Integer status,Integer flatformId,
			Integer categoryLevel1,Integer categoryLevel2,Integer categoryLevel3,
			int start,int pageSize);
}
