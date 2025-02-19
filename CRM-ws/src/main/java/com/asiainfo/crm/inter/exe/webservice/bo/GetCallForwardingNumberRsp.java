package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class GetCallForwardingNumberRsp implements Serializable {
	
	@JsonProperty(value="ErrorInfo")
	public ErrorInfo errorInfo;
	@JsonProperty(value="RetInfo")
	public GetCallForwardingNumberRetInfo retInfo;
	public ErrorInfo getErrorInfo() {
		return errorInfo;
	}
	public void setErrorInfo(ErrorInfo errorInfo) {
		this.errorInfo = errorInfo;
	}
	public GetCallForwardingNumberRetInfo getRetInfo() {
		return retInfo;
	}
	public void setRetInfo(GetCallForwardingNumberRetInfo retInfo) {
		this.retInfo = retInfo;
	}
	
	


}
