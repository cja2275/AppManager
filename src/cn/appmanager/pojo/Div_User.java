package cn.appmanager.pojo;

import java.util.Date;

public class Div_User {

	private Integer id;//bigint(30) NOT NULL主键id
	private String devCode;//varchar(50) NULL开发者帐号
	private String devName;//varchar(50) NULL开发者名称
	private String devPassword;//varchar(50) NULL开发者密码
	private String devEmail;//varchar(50) NULL开发者电子邮箱
	private String devInfo;//varchar(500) NULL开发者简介
	private Integer createdBy;//bigint(30) NULL创建者（来源于backend_user用户表的用户id）
	private Date creationDate;//datetime NULL创建时间
	private Integer modifyBy;//bigint(30) NULL更新者（来源于backend_user用户表的用户id）
	private Date modifyDate;//datetime NULL最新更新时间
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDevCode() {
		return devCode;
	}
	public void setDevCode(String devCode) {
		this.devCode = devCode;
	}
	public String getDevName() {
		return devName;
	}
	public void setDevName(String devName) {
		this.devName = devName;
	}
	public String getDevPassword() {
		return devPassword;
	}
	public void setDevPassword(String devPassword) {
		this.devPassword = devPassword;
	}
	public String getDevEmail() {
		return devEmail;
	}
	public void setDevEmail(String devEmail) {
		this.devEmail = devEmail;
	}
	public String getDevInfo() {
		return devInfo;
	}
	public void setDevInfo(String devInfo) {
		this.devInfo = devInfo;
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
	
}
