package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class BusiCustCheckRetInfo implements Serializable {
	
	@JsonProperty(value="BusiCustInfo")
	public BusiCustInfo busiCustInfo;

	public BusiCustInfo getBusiCustInfo() {
		return busiCustInfo;
	}

	public void setBusiCustInfo(BusiCustInfo busiCustInfo) {
		this.busiCustInfo = busiCustInfo;
	}
	
}
