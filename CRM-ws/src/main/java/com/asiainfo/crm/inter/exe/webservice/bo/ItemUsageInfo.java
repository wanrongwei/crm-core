package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

public class ItemUsageInfo implements Serializable {
	
	public long itemID;

	public String itemName;

	public long productID;

	public String amount;

	public String usedAmount;

	public String availableAmount;

	public String unit;

	public long getItemID() {
		return itemID;
	}

	public void setItemID(long itemID) {
		this.itemID = itemID;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public long getProductID() {
		return productID;
	}

	public void setProductID(long productID) {
		this.productID = productID;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getUsedAmount() {
		return usedAmount;
	}

	public void setUsedAmount(String usedAmount) {
		this.usedAmount = usedAmount;
	}

	public String getAvailableAmount() {
		return availableAmount;
	}

	public void setAvailableAmount(String availableAmount) {
		this.availableAmount = availableAmount;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}
}
