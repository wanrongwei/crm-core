package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class DepartmentQueryReq implements Serializable {
	
	@JsonProperty(value="BusiCustID")
	public String busiCustID;

	public String getBusiCustID() {
		return busiCustID;
	}

	public void setBusiCustID(String busiCustID) {
		this.busiCustID = busiCustID;
	}
	
}
