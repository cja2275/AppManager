package cn.appmanager.dao.data_dictionary;

import java.util.List;

import cn.appmanager.pojo.Data_Dictionary;

public interface Data_DictionaryMapper {
	//查询平台
	public List<Data_Dictionary> getPlatformList();
}
