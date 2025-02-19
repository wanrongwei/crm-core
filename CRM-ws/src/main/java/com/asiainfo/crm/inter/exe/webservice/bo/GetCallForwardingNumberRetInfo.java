package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonProperty;

public class GetCallForwardingNumberRetInfo implements Serializable {
	
	@JsonProperty(value="ForwardType")
	public int forwardType;
 
	@JsonProperty(value="ForwardNum")
	public String forwardNum;
	
	public int getForwardType() {
		return forwardType;
	}

	public void setForwardType(int forwardType) {
		this.forwardType = forwardType;
	}

	public String getForwardNum() {
		return forwardNum;
	}

	public void setForwardNum(String forwardNum) {
		this.forwardNum = forwardNum;
	}

	
}
