package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class BusiCustCheckReq implements Serializable {
	@JsonProperty(value="IDType")
	public String iDType;
	@JsonProperty(value="IDNumber")
	public String iDNumber;
	
	public String getiDType() {
		return iDType;
	}
	public void setiDType(String iDType) {
		this.iDType = iDType;
	}
	public String getiDNumber() {
		return iDNumber;
	}
	public void setiDNumber(String iDNumber) {
		this.iDNumber = iDNumber;
	}
	
}
