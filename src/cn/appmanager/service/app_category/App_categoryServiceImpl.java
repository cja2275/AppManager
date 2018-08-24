package cn.appmanager.service.app_category;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.appmanager.dao.app_category.App_CategoryMapper;
import cn.appmanager.pojo.App_Category;

@Service
public class App_categoryServiceImpl implements App_categoryService {
	@Resource
	private App_CategoryMapper app_categoryMapper;
	//查询分级列表

	@Override
	public List<App_Category> getCategoryLevelListByParentId(Integer parentId) {
		return app_categoryMapper.getCategoryLevelListByParentId(parentId);
	}


	
}
