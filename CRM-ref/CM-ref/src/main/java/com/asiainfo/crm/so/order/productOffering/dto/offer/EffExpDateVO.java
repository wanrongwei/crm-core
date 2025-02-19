package com.asiainfo.crm.so.order.productOffering.dto.offer;

import java.io.Serializable;

public class EffExpDateVO implements Serializable{
	
	private static final long serialVersionUID = 2885217154165507075L;
	
	private String effType;
	private String expType;
	private String effParameter;
	private String expParameter;
	private String effDate;
	private String expDate;
	
	public String getEffType() {
		return effType;
	}
	public void setEffType(String effType) {
		this.effType = effType;
	}
	public String getExpType() {
		return expType;
	}
	public void setExpType(String expType) {
		this.expType = expType;
	}
	public String getEffParameter() {
		return effParameter;
	}
	public void setEffParameter(String effParameter) {
		this.effParameter = effParameter;
	}
	public String getExpParameter() {
		return expParameter;
	}
	public void setExpParameter(String expParameter) {
		this.expParameter = expParameter;
	}
	public String getEffDate() {
		return effDate;
	}
	public void setEffDate(String effDate) {
		this.effDate = effDate;
	}
	public String getExpDate() {
		return expDate;
	}
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	
}
