package cn.appmanager.service.app_info;


import java.util.List;



import cn.appmanager.pojo.App_Info;
import cn.appmanager.tools.PageSupport;

public interface App_infoService {
	//查询全部信息
	public List<App_Info> getInfoList(String softwareName,String status,String flatformId,
			String categoryLevel1,String categoryLevel2,String categoryLevel3,
			int start,int pageSize);
	
	//查询分类列表
	public List<App_Info> getCategoryLevel1List(String categoryLevel1);
	public List<App_Info> getCategoryLevel2List(String categoryLevel2);
	public List<App_Info> getCategoryLevel3List(String categoryLevel3);
	
	
	//查询总数量
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
	//删除app信息byID
		public int delAppInfo(Integer id);
	
}
