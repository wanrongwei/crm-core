package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

public class BalanceTransformSetRsp implements Serializable {
	
	public ErrorInfo errorInfo;
	
	public BalanceTransformSetRetInfo retInfo;

	public ErrorInfo getErrorInfo() {
		return errorInfo;
	}

	public void setErrorInfo(ErrorInfo errorInfo) {
		this.errorInfo = errorInfo;
	}

	public BalanceTransformSetRetInfo getRetInfo() {
		return retInfo;
	}

	public void setRetInfo(BalanceTransformSetRetInfo retInfo) {
		this.retInfo = retInfo;
	}

}
