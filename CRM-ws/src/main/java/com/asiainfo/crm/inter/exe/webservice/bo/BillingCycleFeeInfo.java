package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class BillingCycleFeeInfo implements Serializable {
	@JsonProperty(value="BillingCycle")
	public String billingCycle;
	@JsonProperty(value="ServiceNumber")
	public String serviceNumber;
	@JsonProperty(value="AccountID")
	public long accountID;
	@JsonProperty(value="Total")
	public double total;
	@JsonProperty(value="UnpaidFee")
	public double unpaidFee;
	@JsonProperty(value="LateFee")
	public double lateFee;
	@JsonProperty(value="Unit")
	public String unit;
	@JsonProperty(value="BillItemInfo")
	public BillItemInfo[] billItemInfo;

	public String getBillingCycle() {
		return billingCycle;
	}

	public void setBillingCycle(String billingCycle) {
		this.billingCycle = billingCycle;
	}

	public String getServiceNumber() {
		return serviceNumber;
	}

	public void setServiceNumber(String serviceNumber) {
		this.serviceNumber = serviceNumber;
	}

	public long getAccountID() {
		return accountID;
	}

	public void setAccountID(long accountID) {
		this.accountID = accountID;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getUnpaidFee() {
		return unpaidFee;
	}

	public void setUnpaidFee(double unpaidFee) {
		this.unpaidFee = unpaidFee;
	}

	public double getLateFee() {
		return lateFee;
	}

	public void setLateFee(double lateFee) {
		this.lateFee = lateFee;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public BillItemInfo[] getBillItemInfo() {
		return billItemInfo;
	}

	public void setBillItemInfo(BillItemInfo[] billItemInfo) {
		this.billItemInfo = billItemInfo;
	}
	
}
