package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class UpdateUserWlanPasswordReq implements Serializable {
	@JsonProperty(value="ServiceNum")
	public String serviceNum;
	@JsonProperty(value="OperType")
	public int operType;
	@JsonProperty(value="OldPwd")
	public String oldPwd;
	@JsonProperty(value="NewPwd")
	public String newPwd;
	@JsonProperty(value="WLANType")
	public String wlanType;
	
	public String getServiceNum() {
		return serviceNum;
	}
	public void setServiceNum(String serviceNum) {
		this.serviceNum = serviceNum;
	}
	public int getOperType() {
		return operType;
	}
	public void setOperType(int operType) {
		this.operType = operType;
	}
	public String getOldPwd() {
		return oldPwd;
	}
	public void setOldPwd(String oldPwd) {
		this.oldPwd = oldPwd;
	}
	public String getNewPwd() {
		return newPwd;
	}
	public void setNewPwd(String newPwd) {
		this.newPwd = newPwd;
	}
	public String getWlanType() {
		return wlanType;
	}
	public void setWlanType(String wlanType) {
		this.wlanType = wlanType;
	}
	
}
