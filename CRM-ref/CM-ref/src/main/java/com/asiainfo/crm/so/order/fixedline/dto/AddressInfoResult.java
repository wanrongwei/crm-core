package com.asiainfo.crm.so.order.fixedline.dto;

import java.io.Serializable;

public class AddressInfoResult implements Serializable  {
	private static final long serialVersionUID = 15292909842262500L;
	private String text;
	private AddressInfoVo addressInfo;
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public AddressInfoVo getAddressInfo() {
		return addressInfo;
	}
	public void setAddressInfo(AddressInfoVo addressInfo) {
		this.addressInfo = addressInfo;
	}
	
}
