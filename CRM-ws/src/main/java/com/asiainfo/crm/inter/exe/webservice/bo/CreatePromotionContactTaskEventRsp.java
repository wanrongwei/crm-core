package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class CreatePromotionContactTaskEventRsp implements Serializable {

	@JsonProperty(value="ErrorInfo")
	public ErrorInfo errorInfo;
	@JsonProperty(value="RetInfo")
	public CreatePromotionContactTaskEventRetInfo retInfo;
	public ErrorInfo getErrorInfo() {
		return errorInfo;
	}
	public void setErrorInfo(ErrorInfo errorInfo) {
		this.errorInfo = errorInfo;
	}
	public CreatePromotionContactTaskEventRetInfo getRetInfo() {
		return retInfo;
	}
	public void setRetInfo(CreatePromotionContactTaskEventRetInfo retInfo) {
		this.retInfo = retInfo;
	}
	
	
	
}
