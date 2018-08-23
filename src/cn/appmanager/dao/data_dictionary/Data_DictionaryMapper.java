package cn.appmanager.dao.data_dictionary;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.appmanager.pojo.Data_Dictionary;

public interface Data_DictionaryMapper {
	public List<Data_Dictionary> getData_DictionaryList(@Param("typeCode")String typeCode);

	public List<Data_Dictionary> getPlatformList();

}
