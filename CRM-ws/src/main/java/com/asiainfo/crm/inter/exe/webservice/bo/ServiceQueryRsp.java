package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class ServiceQueryRsp implements Serializable {
	
	@JsonProperty(value="ErrorInfo")
	public ErrorInfo errorInfo;
	@JsonProperty(value="RetInfo")
	public ServiceQueryRetInfo retInfo;
	public ErrorInfo getErrorInfo() {
		return errorInfo;
	}
	public void setErrorInfo(ErrorInfo errorInfo) {
		this.errorInfo = errorInfo;
	}
	public ServiceQueryRetInfo getRetInfo() {
		return retInfo;
	}
	public void setRetInfo(ServiceQueryRetInfo retInfo) {
		this.retInfo = retInfo;
	}
	
	

}
