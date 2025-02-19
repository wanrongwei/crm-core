package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class CreatePromotionContactTaskEventRetInfo implements Serializable {
	
	@JsonProperty(value="ReturnMessage")
	public String returnMessage;

	public String getReturnMessage() {
		return returnMessage;
	}

	public void setReturnMessage(String returnMessage) {
		this.returnMessage = returnMessage;
	}

}
