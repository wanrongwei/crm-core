package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

public class BillItemInfo implements Serializable {
	
	public String itemName;
	
	public double fee;
	
	public int billStatus;

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public int getBillStatus() {
		return billStatus;
	}

	public void setBillStatus(int billStatus) {
		this.billStatus = billStatus;
	}
	
}
