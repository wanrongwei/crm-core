package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class GetCustomerInfoRsp implements Serializable{
	
	@JsonProperty(value="ErrorInfo")
	public ErrorInfo errorInfo;
	@JsonProperty(value="RetInfo")
	public GetCustomerInfoRetInfo retInfo;
	
	public ErrorInfo getErrorInfo() {
		return errorInfo;
	}
	public void setErrorInfo(ErrorInfo errorInfo) {
		this.errorInfo = errorInfo;
	}
	public GetCustomerInfoRetInfo getRetInfo() {
		return retInfo;
	}
	public void setRetInfo(GetCustomerInfoRetInfo retInfo) {
		this.retInfo = retInfo;
	}
	
	

}
