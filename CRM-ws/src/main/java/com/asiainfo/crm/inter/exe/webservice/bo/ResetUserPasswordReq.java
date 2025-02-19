package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class ResetUserPasswordReq implements Serializable {
	@JsonProperty(value="ServiceNum")
	public String serviceNum;
	@JsonProperty(value="NewPwd")
	public String newPwd;
	@JsonProperty(value="CertCardType")
	public int certCardType;
	@JsonProperty(value="CertCardCode")
	public String certCardCode;
	@JsonProperty(value="IsSMSNotify")
	public int isSMSNotify;
	public String getServiceNum() {
		return serviceNum;
	}
	public void setServiceNum(String serviceNum) {
		this.serviceNum = serviceNum;
	}
	public String getNewPwd() {
		return newPwd;
	}
	public void setNewPwd(String newPwd) {
		this.newPwd = newPwd;
	}
	public int getCertCardType() {
		return certCardType;
	}
	public void setCertCardType(int certCardType) {
		this.certCardType = certCardType;
	}
	public String getCertCardCode() {
		return certCardCode;
	}
	public void setCertCardCode(String certCardCode) {
		this.certCardCode = certCardCode;
	}
	public int getIsSMSNotify() {
		return isSMSNotify;
	}
	public void setIsSMSNotify(int isSMSNotify) {
		this.isSMSNotify = isSMSNotify;
	}
	
	
}
