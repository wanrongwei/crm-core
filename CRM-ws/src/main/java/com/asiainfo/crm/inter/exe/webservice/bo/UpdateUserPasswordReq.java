package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class UpdateUserPasswordReq implements Serializable {
	@JsonProperty(value="ServiceNum")
	public String serviceNum;
	@JsonProperty(value="IsVerifyOldPwd")
	public int isVerifyOldPwd;
	@JsonProperty(value="OldPwd")
	public String oldPwd;
	@JsonProperty(value="NewPwd")
	public String newPwd;
	@JsonProperty(value="IsVerifyCertCard")
	public String isVerifyCertCard;
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
	public int getIsVerifyOldPwd() {
		return isVerifyOldPwd;
	}
	public void setIsVerifyOldPwd(int isVerifyOldPwd) {
		this.isVerifyOldPwd = isVerifyOldPwd;
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
	public String getIsVerifyCertCard() {
		return isVerifyCertCard;
	}
	public void setIsVerifyCertCard(String isVerifyCertCard) {
		this.isVerifyCertCard = isVerifyCertCard;
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
