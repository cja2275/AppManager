package cn.appmanager.dao.app_info;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.appmanager.pojo.App_Category;
import cn.appmanager.pojo.App_Info;
import cn.appmanager.tools.PageSupport;

public interface App_InfoMapper {
	//查看全部信息
	public List<App_Info> getApp_InfoList(@Param("softwareName")String softwareName,
			  						  	  @Param("status")Integer status,
			  						  	  @Param("flatformId")Integer flatformId,
			  						  	  @Param("categoryLevel1")Integer categoryLevel1,
			  						  	  @Param("categoryLevel2")Integer categoryLevel2,
			  						  	  @Param("categoryLevel3")Integer categoryLevel3,
			  						  	  @Param("start")Integer currentPageNo,
			  						  	  @Param("pageSize")Integer pageSize);
	
	//查询总数
	public int getApp_InfoCount(@Param("softwareName")String softwareName,
		  	  					@Param("status")Integer status,
		  	  					@Param("flatformId")Integer flatformId,
		  	  					@Param("categoryLevel1")Integer categoryLevel1,
		  	  					@Param("categoryLevel2")Integer categoryLevel2,
		  	  					@Param("categoryLevel3")Integer categoryLevel3);

	//增加APP信息
	public int addApp_Info(App_Info app_Info);
	
	
	//修改APP信息
	public int updateAppInfo(@Param("app_Info")App_Info app_Info);
	//根据id查app信息
	public App_Info appInfoById(@Param("id")Integer id);
	//删除app信息byID
	public int delAppInfo(@Param("id")Integer id);
	//查询分级
	public List<App_Category> getCategoryList(@Param("parentId")Integer parentId);
	
	
	
	
	
	public int countCheckingApp();

	public List getCheckingAppList(@Param("page")PageSupport page);

	public int checkApp(@Param("id")Integer id);
	
}
