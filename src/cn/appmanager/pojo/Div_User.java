package cn.appmanager.pojo;

import java.util.Date;

public class Div_User {

	private Integer id;//bigint(30) 
	private String devCode;//varchar(50) NULL�������ʺ�
	private String devName;//varchar(50) NULL����������
	private String devPassword;//varchar(50) NULL����������
	private String devEmail;//varchar(50) NULL�����ߵ�������
	private String devInfo;//varchar(500) NULL�����߼��
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
