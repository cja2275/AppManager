package cn.appmanager.dao.backend_user;

import org.apache.ibatis.annotations.Param;

import cn.appmanager.pojo.Backend_User;

public interface Backend_UserMapper {


	int login(@Param("backend_User")Backend_User backend_User);

}
