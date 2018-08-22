package cn.appmanager.dao.div_user;

import org.apache.ibatis.annotations.Param;

public interface Div_UserMapper {
	public int div_UserLogin(@Param("devCode")String devCode,@Param("devPassword")String devPassword);
}
