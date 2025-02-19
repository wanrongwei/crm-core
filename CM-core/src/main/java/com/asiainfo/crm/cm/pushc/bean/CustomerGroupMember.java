package com.asiainfo.crm.cm.pushc.bean;

import java.io.Serializable;
import java.util.List;

public class CustomerGroupMember implements Serializable{

	private long custId;
    private String custName;
	private List<OfferGroupDiscount> offerGroupDiscountList;

	public long getCustId() {
		return custId;
	}
	public void setCustId(long custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public List<OfferGroupDiscount> getOfferGroupDiscountList() {
		return offerGroupDiscountList;
	}
	public void setOfferGroupDiscountList(List<OfferGroupDiscount> offerGroupDiscountList) {
		this.offerGroupDiscountList = offerGroupDiscountList;
	}
    
}
