package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class DepartmentQueryRsp implements Serializable {
	@JsonProperty(value="ErrorInfo")
	public ErrorInfo errorInfo;
	@JsonProperty(value="RetInfo")
	public DepartmentQueryRetInfo retInfo;
	public ErrorInfo getErrorInfo() {
		return errorInfo;
	}
	public void setErrorInfo(ErrorInfo errorInfo) {
		this.errorInfo = errorInfo;
	}
	public DepartmentQueryRetInfo getRetInfo() {
		return retInfo;
	}
	public void setRetInfo(DepartmentQueryRetInfo retInfo) {
		this.retInfo = retInfo;
	}
	
}
