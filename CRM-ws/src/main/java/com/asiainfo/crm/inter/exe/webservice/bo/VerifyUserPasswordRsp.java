package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class VerifyUserPasswordRsp implements Serializable {
	
	@JsonProperty(value="ErrorInfo")
	public ErrorInfo errorInfo;
	@JsonProperty(value="RetInfo")
	public VerifyUserPasswordRetInfo retInfo;
	public ErrorInfo getErrorInfo() {
		return errorInfo;
	}
	public void setErrorInfo(ErrorInfo errorInfo) {
		this.errorInfo = errorInfo;
	}
	public VerifyUserPasswordRetInfo getRetInfo() {
		return retInfo;
	}
	public void setRetInfo(VerifyUserPasswordRetInfo retInfo) {
		this.retInfo = retInfo;
	}
	

}
