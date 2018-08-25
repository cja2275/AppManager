package cn.appmanager.service.data_dictionary;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.appmanager.dao.data_dictionary.Data_DictionaryMapper;
import cn.appmanager.pojo.Data_Dictionary;

@Service
public class Data_dictionaryServiceImpl implements Data_dictionaryService{
	@Resource
	private Data_DictionaryMapper data_DictionaryMapper;


	@Override
	public List<Data_Dictionary> getData_DictionaryList(String typeCode) {
		return data_DictionaryMapper.getData_DictionaryList(typeCode);
	}


	//查询平台
		public List<Data_Dictionary> getPlatformList(){
			return data_DictionaryMapper.getPlatformList();
		}


}
