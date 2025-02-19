package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class GetUserOrderInfoRsp implements Serializable {
	
	@JsonProperty(value="ErrorInfo")
	public ErrorInfo errorInfo;
	@JsonProperty(value="RetInfo")
	public GetUserOrderInfoRetInfo retInfo;
	
	public ErrorInfo getErrorInfo() {
		return errorInfo;
	}
	public void setErrorInfo(ErrorInfo errorInfo) {
		this.errorInfo = errorInfo;
	}
	public GetUserOrderInfoRetInfo getRetInfo() {
		return retInfo;
	}
	public void setRetInfo(GetUserOrderInfoRetInfo retInfo) {
		this.retInfo = retInfo;
	}
	
}
