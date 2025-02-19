package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

public class AccItemQueryRsp implements Serializable {
	
	public ErrorInfo errorInfo;
	
	public AccItemQueryRetInfo retInfo;

	public ErrorInfo getErrorInfo() {
		return errorInfo;
	}

	public void setErrorInfo(ErrorInfo errorInfo) {
		this.errorInfo = errorInfo;
	}

	public AccItemQueryRetInfo getRetInfo() {
		return retInfo;
	}

	public void setRetInfo(AccItemQueryRetInfo retInfo) {
		this.retInfo = retInfo;
	}

}
