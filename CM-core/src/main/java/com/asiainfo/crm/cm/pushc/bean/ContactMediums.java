package com.asiainfo.crm.cm.pushc.bean;

import java.io.Serializable;

public class ContactMediums implements Serializable{

	private String phoneNumber;
	private String email;
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
