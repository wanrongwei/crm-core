package com.asiainfo.crm.so.order.fixedline.dto;

import java.io.Serializable;

public class ElectronicConfirmationVo implements Serializable {

	private static final long serialVersionUID = -1539190220463500L;
	private String sendType;
	private String contactNum;
	private String email;
	private String cpr;
	
	public String getSendType() {
		return sendType;
	}
	public void setSendType(String sendType) {
		this.sendType = sendType;
	}
	public String getContactNum() {
		return contactNum;
	}
	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpr() {
		return cpr;
	}
	public void setCpr(String cpr) {
		this.cpr = cpr;
	}
	
}
