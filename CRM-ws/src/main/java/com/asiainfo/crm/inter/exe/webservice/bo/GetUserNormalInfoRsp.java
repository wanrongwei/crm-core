package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class GetUserNormalInfoRsp implements Serializable {
	
	@JsonProperty(value="ErrorInfo")
	public ErrorInfo errorInfo;
	@JsonProperty(value="RetInfo")
	public GetUserNormalInfoRetInfo retInfo;
	public ErrorInfo getErrorInfo() {
		return errorInfo;
	}
	public void setErrorInfo(ErrorInfo errorInfo) {
		this.errorInfo = errorInfo;
	}
	public GetUserNormalInfoRetInfo getRetInfo() {
		return retInfo;
	}
	public void setRetInfo(GetUserNormalInfoRetInfo retInfo) {
		this.retInfo = retInfo;
	}
	
	

}
