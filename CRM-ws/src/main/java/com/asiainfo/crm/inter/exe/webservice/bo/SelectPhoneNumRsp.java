package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class SelectPhoneNumRsp implements Serializable {
	
	@JsonProperty(value="ErrorInfo")
	public ErrorInfo errorInfo;
	
	@JsonProperty(value="RetInfo")
	public SelectPhoneNumRetInfo  retInfo;
	
	public SelectPhoneNumRetInfo getRetInfo() {
		return retInfo;
	}

	public void setRetInfo(SelectPhoneNumRetInfo retInfo) {
		this.retInfo = retInfo;
	}


	public ErrorInfo getErrorInfo() {
		return errorInfo;
	}

	public void setErrorInfo(ErrorInfo errorInfo) {
		this.errorInfo = errorInfo;
	}
}
