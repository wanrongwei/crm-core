package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class CreateUserNetRsp implements Serializable {
	@JsonProperty(value="ErrorInfo")
	public ErrorInfo errorInfo;
	@JsonProperty(value="RetInfo")
	public CreateUserNetRetInfo retInfo;
	
	public ErrorInfo getErrorInfo() {
		return errorInfo;
	}
	public void setErrorInfo(ErrorInfo errorInfo) {
		this.errorInfo = errorInfo;
	}
	public CreateUserNetRetInfo getRetInfo() {
		return retInfo;
	}
	public void setRetInfo(CreateUserNetRetInfo retInfo) {
		this.retInfo = retInfo;
	}
	
}
