package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class BusiCustCheckRsp implements Serializable {
	@JsonProperty(value="ErrorInfo")
	public ErrorInfo errorInfo ;
	@JsonProperty(value="RetInfo")
	public BusiCustCheckRetInfo retInfo;

	public ErrorInfo getErrorInfo() {
		return errorInfo;
	}

	public void setErrorInfo(ErrorInfo errorInfo) {
		this.errorInfo = errorInfo;
	}

	public BusiCustCheckRetInfo getRetInfo() {
		return retInfo;
	}

	public void setRetInfo(BusiCustCheckRetInfo retInfo) {
		this.retInfo = retInfo;
	}
	
	
}
