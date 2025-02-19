package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class GetGroupOrderRsp implements Serializable {

	@JsonProperty(value="ErrorInfo")
	public ErrorInfo errorInfo;
	@JsonProperty(value="RetInfo")
	public GetGroupOrderRetInfo retInfo;
	public ErrorInfo getErrorInfo() {
		return errorInfo;
	}
	public void setErrorInfo(ErrorInfo errorInfo) {
		this.errorInfo = errorInfo;
	}
	public GetGroupOrderRetInfo getRetInfo() {
		return retInfo;
	}
	public void setRetInfo(GetGroupOrderRetInfo retInfo) {
		this.retInfo = retInfo;
	}
	
	
}
