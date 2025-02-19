package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class StopOrStartUserRsp implements Serializable {
	@JsonProperty(value="ErrorInfo")
	public ErrorInfo errorInfo;
	@JsonProperty(value="RetInfo")
	public StopOrStartUserRetInfo retInfo;

	public ErrorInfo getErrorInfo() {
		return errorInfo;
	}

	public void setErrorInfo(ErrorInfo errorInfo) {
		this.errorInfo = errorInfo;
	}

	public StopOrStartUserRetInfo getRetInfo() {
		return retInfo;
	}

	public void setRetInfo(StopOrStartUserRetInfo retInfo) {
		this.retInfo = retInfo;
	}
	
}
