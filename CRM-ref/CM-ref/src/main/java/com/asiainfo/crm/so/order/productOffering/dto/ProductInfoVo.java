package com.asiainfo.crm.so.order.productOffering.dto;

import java.io.Serializable;


public class ProductInfoVo implements Serializable{
	
	private static final long serialVersionUID = 1773788898744743079L;
	
	private long productId;
	private String productName;
	private String selectFlag;
	
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getSelectFlag() {
		return selectFlag;
	}
	public void setSelectFlag(String selectFlag) {
		this.selectFlag = selectFlag;
	}
	
}
