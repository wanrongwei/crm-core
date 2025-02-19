package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class GetGroupMemberRsp implements Serializable {
	
	@JsonProperty(value="ErrorInfo")
	public ErrorInfo errorInfo;
	@JsonProperty(value="RetInfo")
	public GetGroupMemberRetInfo retInfo;
	
	public ErrorInfo getErrorInfo() {
		return errorInfo;
	}
	public void setErrorInfo(ErrorInfo errorInfo) {
		this.errorInfo = errorInfo;
	}
	public GetGroupMemberRetInfo getRetInfo() {
		return retInfo;
	}
	public void setRetInfo(GetGroupMemberRetInfo retInfo) {
		this.retInfo = retInfo;
	}
	
}
