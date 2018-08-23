package cn.appmanager.service.app_info;


import java.util.List;


import cn.appmanager.pojo.App_Info;
import cn.appmanager.tools.PageSupport;

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

	
	//获得待审核APP列表
	public PageSupport getCheckingApp(PageSupport page);
	
	//通过id改变审核状态
	public int checkApp(Integer id);
	
}
