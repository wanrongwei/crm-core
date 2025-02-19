package com.asiainfo.crm.so.order.fixedline.dto;

import java.io.Serializable;

public class ValidateCommonVo implements Serializable{
	
	private static final long serialVersionUID = 1773788898744743079L;
	private String checkType;
	private String retVal;
	private String retMsg;
	public String getRetVal() {
		return retVal;
	}
	public void setRetVal(String retVal) {
		this.retVal = retVal;
	}
	public String getRetMsg() {
		return retMsg;
	}
	public void setRetMsg(String retMsg) {
		this.retMsg = retMsg;
	}
	public String getCheckType() {
		return checkType;
	}
	public void setCheckType(String checkType) {
		this.checkType = checkType;
	}
	
}
