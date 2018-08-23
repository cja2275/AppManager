package cn.appmanager.service.data_dictionary;

import java.util.List;

import cn.appmanager.pojo.Data_Dictionary;

public interface Data_dictionaryService {
	public List<Data_Dictionary> getData_DictionaryList(String typeCode);
	//查询平台
		public List<Data_Dictionary> getPlatformList();
}
