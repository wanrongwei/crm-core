package com.asiainfo.crm.so.order.fixedline.dto;

import java.io.Serializable;

public class VoipNumInfoVo implements Serializable {

	private static final long serialVersionUID = -1539190220463500L;
	private long referenceId;
	private String oldVoipNum;
	private String newVoipNum;
	private String numType;
	public long getReferenceId() {
		return referenceId;
	}
	public void setReferenceId(long referenceId) {
		this.referenceId = referenceId;
	}
	public String getOldVoipNum() {
		return oldVoipNum;
	}
	public void setOldVoipNum(String oldVoipNum) {
		this.oldVoipNum = oldVoipNum;
	}
	public String getNewVoipNum() {
		return newVoipNum;
	}
	public void setNewVoipNum(String newVoipNum) {
		this.newVoipNum = newVoipNum;
	}
	public String getNumType() {
		return numType;
	}
	public void setNumType(String numType) {
		this.numType = numType;
	}
	
}
