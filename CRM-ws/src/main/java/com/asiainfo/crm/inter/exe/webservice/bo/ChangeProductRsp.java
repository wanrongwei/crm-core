package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

public class ChangeProductRsp implements Serializable {
	
	public ErrorInfo errorInfo;
	
	public ErrorInfo getErrorInfo() {
		return errorInfo;
	}

	public void setErrorInfo(ErrorInfo errorInfo) {
		this.errorInfo = errorInfo;
	}


}
