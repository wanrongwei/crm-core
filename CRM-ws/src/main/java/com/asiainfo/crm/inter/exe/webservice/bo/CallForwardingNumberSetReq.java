package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class CallForwardingNumberSetReq implements Serializable {
	
	@JsonProperty(value="ForwardType")
	public int forwardType;
	@JsonProperty(value="ServiceNum")
	public String serviceNum;
	@JsonProperty(value="ForwardNum")
	public String forwardNum;
	
	
	public int getForwardType() {
		return forwardType;
	}

	public void setForwardType(int forwardType) {
		this.forwardType = forwardType;
	}

	public String getServiceNum() {
		return serviceNum;
	}

	public void setServiceNum(String serviceNum) {
		this.serviceNum = serviceNum;
	}
	
	public String getForwardNum() {
		return forwardNum;
	}

	public void setForwardNum(String forwardNum) {
		this.forwardNum = forwardNum;
	}
	
	
	
	
}
