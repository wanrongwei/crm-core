package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class GetCallForwardingNumberReq implements Serializable {
	

	@JsonProperty(value="ServiceNum")
	public String serviceNum;


	public String getServiceNum() {
		return serviceNum;
	}

	public void setServiceNum(String serviceNum) {
		this.serviceNum = serviceNum;
	}
	

	
}
