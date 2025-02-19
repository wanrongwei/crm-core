package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class CheckUserIDNoReq implements Serializable {
	@JsonProperty(value="ServiceNum")
	public String serviceNum;
	@JsonProperty(value="CertCardType")
	public String certCardType;
	@JsonProperty(value="CertCardCode")
	public String certCardCode;
	
	public String getServiceNum() {
		return serviceNum;
	}
	public void setServiceNum(String serviceNum) {
		this.serviceNum = serviceNum;
	}
	public String getCertCardType() {
		return certCardType;
	}
	public void setCertCardType(String certCardType) {
		this.certCardType = certCardType;
	}
	public String getCertCardCode() {
		return certCardCode;
	}
	public void setCertCardCode(String certCardCode) {
		this.certCardCode = certCardCode;
	}

}
