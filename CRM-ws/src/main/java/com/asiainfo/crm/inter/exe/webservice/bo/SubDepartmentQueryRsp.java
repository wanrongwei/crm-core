package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class SubDepartmentQueryRsp implements Serializable {

	@JsonProperty(value="ErrorInfo")
	public ErrorInfo errorInfo;
	
	@JsonProperty(value="RetInfo")
	public SubDepartmentRetInfo retInfo;

	public ErrorInfo getErrorInfo() {
		return errorInfo;
	}

	public void setErrorInfo(ErrorInfo errorInfo) {
		this.errorInfo = errorInfo;
	}

	public SubDepartmentRetInfo getRetInfo() {
		return retInfo;
	}

	public void setRetInfo(SubDepartmentRetInfo retInfo) {
		this.retInfo = retInfo;
	}
}
