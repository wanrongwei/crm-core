package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class UpdateUserWlanPasswordRsp implements Serializable {
	@JsonProperty(value="ErrorInfo")
	public ErrorInfo errorInfo;
	@JsonProperty(value="RetInfo")
	public UpdateUserWlanPasswordRetInfo retInfo;

	public ErrorInfo getErrorInfo() {
		return errorInfo;
	}

	public void setErrorInfo(ErrorInfo errorInfo) {
		this.errorInfo = errorInfo;
	}

	public UpdateUserWlanPasswordRetInfo getRetInfo() {
		return retInfo;
	}

	public void setRetInfo(UpdateUserWlanPasswordRetInfo retInfo) {
		this.retInfo = retInfo;
	}
	
}
