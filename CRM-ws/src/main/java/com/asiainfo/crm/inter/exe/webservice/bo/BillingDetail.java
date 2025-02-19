package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class BillingDetail implements Serializable {
	@JsonProperty(value="billItemId")
	public String billItemId;
	@JsonProperty(value="itemName")
	public String itemName;
	@JsonProperty(value="OriginFee")
	public double originFee;
	@JsonProperty(value="TotalCharge")
	public double totalCharge;
	@JsonProperty(value="discountFee")
	public double discountFee;
	@JsonProperty(value="AdjustFee")
	public double adjustFee;
	@JsonProperty(value="totalFee")
	public double totalFee;
	@JsonProperty(value="ParentItemId")
	public String parentItemId; 
	@JsonProperty(value="ParentItemName")
	public String parentItemName;
	@JsonProperty(value="itemNodeLevel")
	public int itemNodeLevel;
	@JsonProperty(value="ItemType")
	public int itemType;
	public String getBillItemId() {
		return billItemId;
	}
	public void setBillItemId(String billItemId) {
		this.billItemId = billItemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getOriginFee() {
		return originFee;
	}
	public void setOriginFee(double originFee) {
		this.originFee = originFee;
	}
	public double getTotalCharge() {
		return totalCharge;
	}
	public void setTotalCharge(double totalCharge) {
		this.totalCharge = totalCharge;
	}
	public double getDiscountFee() {
		return discountFee;
	}
	public void setDiscountFee(double discountFee) {
		this.discountFee = discountFee;
	}
	public double getAdjustFee() {
		return adjustFee;
	}
	public void setAdjustFee(double adjustFee) {
		this.adjustFee = adjustFee;
	}
	public double getTotalFee() {
		return totalFee;
	}
	public void setTotalFee(double totalFee) {
		this.totalFee = totalFee;
	}
	public String getParentItemId() {
		return parentItemId;
	}
	public void setParentItemId(String parentItemId) {
		this.parentItemId = parentItemId;
	}
	public String getParentItemName() {
		return parentItemName;
	}
	public void setParentItemName(String parentItemName) {
		this.parentItemName = parentItemName;
	}
	public int getItemNodeLevel() {
		return itemNodeLevel;
	}
	public void setItemNodeLevel(int itemNodeLevel) {
		this.itemNodeLevel = itemNodeLevel;
	}
	public int getItemType() {
		return itemType;
	}
	public void setItemType(int itemType) {
		this.itemType = itemType;
	}
	
}
