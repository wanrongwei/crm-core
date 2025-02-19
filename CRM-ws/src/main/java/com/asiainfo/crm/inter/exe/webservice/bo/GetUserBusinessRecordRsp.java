package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class GetUserBusinessRecordRsp implements Serializable {
	
	@JsonProperty(value="ErrorInfo")
	public ErrorInfo errorInfo;
	@JsonProperty(value="RetInfo")
	public GetUserBusinessRecordRetInfo retInfo;
	public ErrorInfo getErrorInfo() {
		return errorInfo;
	}
	public void setErrorInfo(ErrorInfo errorInfo) {
		this.errorInfo = errorInfo;
	}
	public GetUserBusinessRecordRetInfo getRetInfo() {
		return retInfo;
	}
	public void setRetInfo(GetUserBusinessRecordRetInfo retInfo) {
		this.retInfo = retInfo;
	}

}
