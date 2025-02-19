package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class VerifyUserPasswordRetInfo implements Serializable {
	
	@JsonProperty(value="RetryTimes")
	public int retryTimes;
	@JsonProperty(value="IsWeakPwd")
	public int isWeakPwd;
	public int getRetryTimes() {
		return retryTimes;
	}
	public void setRetryTimes(int retryTimes) {
		this.retryTimes = retryTimes;
	}
	public int getIsWeakPwd() {
		return isWeakPwd;
	}
	public void setIsWeakPwd(int isWeakPwd) {
		this.isWeakPwd = isWeakPwd;
	}
	

}
