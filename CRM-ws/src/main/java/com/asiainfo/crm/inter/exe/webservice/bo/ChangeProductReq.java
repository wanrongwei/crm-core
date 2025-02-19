package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

public class ChangeProductReq implements Serializable {
	
	public int effectiveType;
	
	public String serviceNum;
	
	public String offerCode;

	public String productCode;
	
	public String effectiveDate;
	
	public String expireDate;
	
	public int getEffectiveType() {
		return effectiveType;
	}

	public void setEffectiveType(int effectiveType) {
		this.effectiveType = effectiveType;
	}

	public String getServiceNum() {
		return serviceNum;
	}

	public void setServiceNum(String serviceNum) {
		this.serviceNum = serviceNum;
	}
	
	public String getOfferCode() {
		return offerCode;
	}

	public void setOfferCode(String offerCode) {
		this.offerCode = offerCode;
	}
	
	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	
	public String getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	
	public String getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}
}
