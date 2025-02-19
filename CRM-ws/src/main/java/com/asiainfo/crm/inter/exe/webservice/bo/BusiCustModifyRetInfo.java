package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class BusiCustModifyRetInfo implements Serializable {
	@JsonProperty(value="BusiCustID")
	public long busiCustID;

	public long getBusiCustID() {
		return busiCustID;
	}

	public void setBusiCustID(long busiCustID) {
		this.busiCustID = busiCustID;
	}
	
	
}
