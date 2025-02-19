package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class EmployeeQueryRsp implements Serializable {
	
	@JsonProperty(value="ErrorInfo")
	public ErrorInfo errorInfo; 
	@JsonProperty(value="RetInfo")
	public EmployeeQueryRetInfo retInfo;
	public ErrorInfo getErrorInfo() {
		return errorInfo;
	}
	public void setErrorInfo(ErrorInfo errorInfo) {
		this.errorInfo = errorInfo;
	}
	public EmployeeQueryRetInfo getRetInfo() {
		return retInfo;
	}
	public void setRetInfo(EmployeeQueryRetInfo retInfo) {
		this.retInfo = retInfo;
	}
	



}
