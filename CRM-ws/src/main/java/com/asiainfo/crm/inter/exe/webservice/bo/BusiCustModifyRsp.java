package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class BusiCustModifyRsp implements Serializable {
	@JsonProperty(value="ErrorInfo")
	public ErrorInfo errorInfo;
	@JsonProperty(value="RetInfo")
	public BusiCustModifyRetInfo retInfo;

	public ErrorInfo getErrorInfo() {
		return errorInfo;
	}

	public void setErrorInfo(ErrorInfo errorInfo) {
		this.errorInfo = errorInfo;
	}

	public BusiCustModifyRetInfo getRetInfo() {
		return retInfo;
	}

	public void setRetInfo(BusiCustModifyRetInfo retInfo) {
		this.retInfo = retInfo;
	}
	
}
