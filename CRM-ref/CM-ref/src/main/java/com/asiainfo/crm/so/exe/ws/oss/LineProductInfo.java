package com.asiainfo.crm.so.exe.ws.oss;

import java.io.Serializable;

public class LineProductInfo implements Serializable{
	private String productType;
	private String productNo;
	private String productOperator;
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getProductNo() {
		return productNo;
	}
	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}
	public String getProductOperator() {
		return productOperator;
	}
	public void setProductOperator(String productOperator) {
		this.productOperator = productOperator;
	}
	
}
