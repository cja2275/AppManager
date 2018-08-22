package cn.appmanager.dao.app_info;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.ui.Model;

import cn.appmanager.pojo.App_Info;

public interface App_InfoMapper {
	public List<App_Info> getInfoList(@Param("softwareName")String softwareName,
			  						  @Param("status")Integer status,
			  						  @Param("flatformId")Integer flatformId,
			  						  @Param("categoryLevel1")Integer categoryLevel1,
			  						  @Param("categoryLevel2")Integer categoryLevel2,
			  						  @Param("categoryLevel3")Integer categoryLevel3,
			  						  @Param("start")int start,
			  						  @Param("pageSize")int pageSize,
			  						  @Param("model")Model model);
	
	
	//修改APP信息
	public int updateAppInfo(@Param("app_Info")App_Info app_Info);
	
}
