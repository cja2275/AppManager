package cn.appmanager.pojo;

import java.util.Date;

public class Data_Dictionary {

	private Integer id;//bigint(30) NOT NULL主键ID
	private String typeCode;//varchar(50) NULL类型编码
	private String typeName;//varchar(50) NULL类型名称
	private Integer valueId;//bigint(30) NULL类型值ID
	private String valueName;//varchar(50) NULL类型值Name
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
	public String getTypeCode() {
		return typeCode;
	}
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public Integer getValueId() {
		return valueId;
	}
	public void setValueId(Integer valueId) {
		this.valueId = valueId;
	}
	public String getValueName() {
		return valueName;
	}
	public void setValueName(String valueName) {
		this.valueName = valueName;
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
