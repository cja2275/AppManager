package cn.appmanager.pojo;

import java.util.Date;

public class App_Category {
	  private Integer id;
	  private String categoryCode;
	  private String categoryName;
	  private Integer parentId;
	  private Integer createdBy;
	  private Date creationTime;
	  private Integer modifyBy;
	  private Date amodifyDate;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public Integer getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}
	public Integer getModifyBy() {
		return modifyBy;
	}
	public void setModifyBy(Integer modifyBy) {
		this.modifyBy = modifyBy;
	}
	public Date getAmodifyDate() {
		return amodifyDate;
	}
	public void setAmodifyDate(Date amodifyDate) {
		this.amodifyDate = amodifyDate;
	}

}
