package com.asiainfo.crm.so.order.fixedline.dto;

import java.io.Serializable;

public class NewContactInfoVO implements Serializable{

	/** serialVersionUID*/  
	private static final long serialVersionUID = 11232321332L;
	private String regionId;
	private long customerOrderId; 
	private long userId; 
	private String oldContactNumber;
	private String oldContactName;
	private String oldContactEmail;
	private String contactName;
	private String contactEmail;
	private String contactNumber;
	public String getRegionId() {
		return regionId;
	}
	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}
	public long getCustomerOrderId() {
		return customerOrderId;
	}
	public void setCustomerOrderId(long customerOrderId) {
		this.customerOrderId = customerOrderId;
	}
	public String getOldContactNumber() {
		return oldContactNumber;
	}
	public void setOldContactNumber(String oldContactNumber) {
		this.oldContactNumber = oldContactNumber;
	}
	public String getOldContactName() {
		return oldContactName;
	}
	public void setOldContactName(String oldContactName) {
		this.oldContactName = oldContactName;
	}
	public String getOldContactEmail() {
		return oldContactEmail;
	}
	public void setOldContactEmail(String oldContactEmail) {
		this.oldContactEmail = oldContactEmail;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
 
 
	
	
}
