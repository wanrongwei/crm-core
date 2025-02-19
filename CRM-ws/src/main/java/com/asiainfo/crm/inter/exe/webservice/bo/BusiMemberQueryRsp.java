package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonProperty;

public class BusiMemberQueryRsp implements Serializable {
	@JsonProperty(value="ErrorInfo")
	public ErrorInfo errorInfo;
	@JsonProperty(value="RetInfo")
	public BusiMemberQueryRetInfo retInfo;
	public ErrorInfo getErrorInfo() {
		return errorInfo;
	}
	public void setErrorInfo(ErrorInfo errorInfo) {
		this.errorInfo = errorInfo;
	}
	public BusiMemberQueryRetInfo getRetInfo() {
		return retInfo;
	}
	public void setRetInfo(BusiMemberQueryRetInfo retInfo) {
		this.retInfo = retInfo;
	}
	
	

}
