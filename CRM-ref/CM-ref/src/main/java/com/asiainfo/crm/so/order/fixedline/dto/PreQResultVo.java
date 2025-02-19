package com.asiainfo.crm.so.order.fixedline.dto;

import java.io.Serializable;

public class PreQResultVo implements Serializable {
	private static final long serialVersionUID = -25356121942282631L;
	private AddressInfoVo validAddress;
	private int resultCode;
	private String resultMsg;
	private String isModifyAddress ;
	private String activeBB;
	private PreQItemInfoVo[] itemInfo;//pb,DSL,fiber,coax的相关信息
	private String [] label;
	
	
	public String getActiveBB() {
		return activeBB;
	}
	public void setActiveBB(String activeBB) {
		this.activeBB = activeBB;
	}
	public String[] getLabel() {
		return label;
	}
	public void setLabel(String[] label) {
		this.label = label;
	}
	public AddressInfoVo getValidAddress() {
		return validAddress;
	}
	public void setValidAddress(AddressInfoVo validAddress) {
		this.validAddress = validAddress;
	}
	public PreQItemInfoVo[] getItemInfo() {
		return itemInfo;
	}
	public void setItemInfo(PreQItemInfoVo[] itemInfo) {
		this.itemInfo = itemInfo;
	}
	public int getResultCode() {
		return resultCode;
	}
	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultMsg() {
		return resultMsg;
	}
	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getIsModifyAddress() {
		return isModifyAddress;
	}
	public void setIsModifyAddress(String isModifyAddress) {
		this.isModifyAddress = isModifyAddress;
	}
	
}
