package cn.appmanager.pojo;

import java.util.Date;

public class Backend_User {

private Integer id ;//bigint(30) NOT NULL����id
private String userCode;//varchar(50) NULL�û�����
private String userName;//varchar(50) NULL�û�����
private Integer userType;//bigint(30) NULL�û���ɫ���ͣ���Դ�������ֵ����Ϊ�����ܡ������г�����Ӫ�����ۣ�
private Integer createdBy;//bigint(30) NULL�����ߣ���Դ��backend_user�û�����û�id��
private Date creationDate;//datetime NULL����ʱ��
private Integer modifyBy;//bigint(30) NULL�����ߣ���Դ��backend_user�û�����û�id��
private Date modifyDate;//datetime NULL���¸���ʱ��
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getUserCode() {
	return userCode;
}
public void setUserCode(String userCode) {
	this.userCode = userCode;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public Integer getUserType() {
	return userType;
}
public void setUserType(Integer userType) {
	this.userType = userType;
}
public Integer getCreatedBy() {
	return createdBy;
}
public void setCreatedBy(Integer createdBy) {
	this.createdBy = createdBy;
}
public Date getCreationDate() {
	return creationDate;
}
public void setCreationDate(Date creationDate) {
	this.creationDate = creationDate;
}
public Integer getModifyBy() {
	return modifyBy;
}
public void setModifyBy(Integer modifyBy) {
	this.modifyBy = modifyBy;
}
public Date getModifyDate() {
	return modifyDate;
}
public void setModifyDate(Date modifyDate) {
	this.modifyDate = modifyDate;
}
public String getUserPassword() {
	return userPassword;
}
public void setUserPassword(String userPassword) {
	this.userPassword = userPassword;
}
private String userPassword;//varchar(50) NULL�û�����
}
