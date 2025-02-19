package com.asiainfo.crm.cm.pushc.bean;

import java.io.Serializable;

public class OfferGroupDiscount implements Serializable{
	private long offerGroupId;
	private String offerGroupType;
	private String oldDiscountTier;
	private String oldDiscountPercentage;
	private String newDiscountTier;
	private String newDiscountPercentage;
	private String remark;
	
	public long getOfferGroupId() {
		return offerGroupId;
	}
	public void setOfferGroupId(long offerGroupId) {
		this.offerGroupId = offerGroupId;
	}
	public String getOfferGroupType() {
		return offerGroupType;
	}
	public void setOfferGroupType(String offerGroupType) {
		this.offerGroupType = offerGroupType;
	}
	public String getOldDiscountTier() {
		return oldDiscountTier;
	}
	public void setOldDiscountTier(String oldDiscountTier) {
		this.oldDiscountTier = oldDiscountTier;
	}
	public String getOldDiscountPercentage() {
		return oldDiscountPercentage;
	}
	public void setOldDiscountPercentage(String oldDiscountPercentage) {
		this.oldDiscountPercentage = oldDiscountPercentage;
	}
	public String getNewDiscountTier() {
		return newDiscountTier;
	}
	public void setNewDiscountTier(String newDiscountTier) {
		this.newDiscountTier = newDiscountTier;
	}
	public String getNewDiscountPercentage() {
		return newDiscountPercentage;
	}
	public void setNewDiscountPercentage(String newDiscountPercentage) {
		this.newDiscountPercentage = newDiscountPercentage;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	} 
	
	
}
