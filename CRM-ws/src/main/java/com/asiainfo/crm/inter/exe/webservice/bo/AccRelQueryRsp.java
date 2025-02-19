package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class AccRelQueryRsp implements Serializable {
	
	@JsonProperty(value="ErrorInfo")
	public ErrorInfo errorInfo;
	@JsonProperty(value="RetInfo")
	public AccRelQueryRetInfo retInfo;
	
	public ErrorInfo getErrorInfo() {
		return errorInfo;
	}
	public void setErrorInfo(ErrorInfo errorInfo) {
		this.errorInfo = errorInfo;
	}
	public AccRelQueryRetInfo getRetInfo() {
		return retInfo;
	}
	public void setRetInfo(AccRelQueryRetInfo retInfo) {
		this.retInfo = retInfo;
	}
	
}
