package cn.appmanager.service.app_info;


import org.apache.ibatis.annotations.Param;

import cn.appmanager.pojo.App_Info;

public interface App_infoService {
	//修改APP信息
		public int updateAppInfo(App_Info app_Info);
		//查app信息byID
	public App_Info appInfoById(Integer id);
}
