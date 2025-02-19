package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class SetBillDeliveryTypeRsp implements Serializable {

	@JsonProperty(value="ErrorInfo")
	public ErrorInfo errorInfo;
	@JsonProperty(value="RetInfo")
	public SetBillDeliveryTypeRetInfo retInfo;
	public ErrorInfo getErrorInfo() {
		return errorInfo;
	}
	public void setErrorInfo(ErrorInfo errorInfo) {
		this.errorInfo = errorInfo;
	}
	public SetBillDeliveryTypeRetInfo getRetInfo() {
		return retInfo;
	}
	public void setRetInfo(SetBillDeliveryTypeRetInfo retInfo) {
		this.retInfo = retInfo;
	}
	
	
	
}
