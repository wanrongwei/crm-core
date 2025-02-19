package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class CreateUserNetRetInfo implements Serializable {
	
	@JsonProperty(value="DoneCode")
	public String doneCode;

	public String getDoneCode() {
		return doneCode;
	}

	public void setDoneCode(String doneCode) {
		this.doneCode = doneCode;
	}
	
}
