package cn.appmanager.dao.app_category;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.appmanager.pojo.App_Category;
import cn.appmanager.pojo.App_Info;

public interface App_CategoryMapper {
	//查询分类列表
	public List<App_Category> getCategoryLevelListByParentId(@Param("parentId")Integer parentId);


}
