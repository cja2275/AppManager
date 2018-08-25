package cn.appmanager.service.app_category;

import java.util.List;


import cn.appmanager.pojo.App_Category;


public interface App_categoryService {
	//查询分类列表
	public List<App_Category> getCategoryLevelListByParentId(Integer parentId);
	//根据Id 查parentId
		public int getParentIdByID(Integer id);
}
