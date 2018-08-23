package cn.appmanager.service.app_info;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.appmanager.pojo.App_Info;
import cn.appmanager.tools.PageSupport;

public interface App_infoService {
	// 查询全部信息
	public List<App_Info> getInfoList(String softwareName, Integer status, Integer flatformId, Integer categoryLevel1,
			Integer categoryLevel2, Integer categoryLevel3, Integer currentPageNo, Integer pageSize);

	// 查询总数量
	public int getApp_InfoCount(String softwareName, Integer status, Integer flatformId, Integer categoryLevel1,
			Integer categoryLevel2, Integer categoryLevel3);

	// 修改APP信息
	public int updateAppInfo(App_Info app_Info);

	// 查app信息byID
	public App_Info appInfoById(Integer id);

	// 获得待审核APP列表
	public PageSupport getCheckingApp(PageSupport page);

	// 通过id改变审核状态
	public int checkApp(Integer id);

}
