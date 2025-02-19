package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class PreOccupyPhoneNumRsp implements Serializable {
	
	@JsonProperty(value="ErrorInfo")
	public ErrorInfo errorInfo;
	@JsonProperty(value="RetInfo")
	public PreOccupyPhoneNumRetInfo retInfo;
	public ErrorInfo getErrorInfo() {
		return errorInfo;
	}
	public void setErrorInfo(ErrorInfo errorInfo) {
		this.errorInfo = errorInfo;
	}
	public PreOccupyPhoneNumRetInfo getRetInfo() {
		return retInfo;
	}
	public void setRetInfo(PreOccupyPhoneNumRetInfo retInfo) {
		this.retInfo = retInfo;
	}

	
}
