package com.asiainfo.crm.so.order.fixedline.dto;

import java.io.Serializable;

public class CheckExtraRCVo implements Serializable {
	private static final long serialVersionUID = -2539195225263541L;
	
	private String needExtraRCFlag;//Y/N
	private String rcEndDateStr ;
	private String message ;
	
	public String getNeedExtraRCFlag() {
		return needExtraRCFlag;
	}
	public void setNeedExtraRCFlag(String needExtraRCFlag) {
		this.needExtraRCFlag = needExtraRCFlag;
	}
	public String getRcEndDateStr() {
		return rcEndDateStr;
	}
	public void setRcEndDateStr(String rcEndDateStr) {
		this.rcEndDateStr = rcEndDateStr;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
