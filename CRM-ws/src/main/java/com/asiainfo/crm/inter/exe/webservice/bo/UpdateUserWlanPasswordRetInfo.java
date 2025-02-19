package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class UpdateUserWlanPasswordRetInfo implements Serializable {
	@JsonProperty(value="NewPwd")
	public String newPwd;

	public String getNewPwd() {
		return newPwd;
	}

	public void setNewPwd(String newPwd) {
		this.newPwd = newPwd;
	}
	
}
