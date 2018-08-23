package cn.appmanager.dao.app_info;

import org.apache.ibatis.annotations.Param;

import cn.appmanager.pojo.App_Info;
//APP基本信息
public interface App_InfoMapper {
	
	//修改APP信息
	public int updateAppInfo(@Param("app_Info")App_Info app_Info);
	//根据id查app信息
	public App_Info appInfoById(@Param("id")Integer id);
	
}
