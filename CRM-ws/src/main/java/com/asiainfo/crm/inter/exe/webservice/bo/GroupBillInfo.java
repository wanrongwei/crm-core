package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class GroupBillInfo implements Serializable {
	@JsonProperty(value="prodID")
	public long prodID;
	@JsonProperty(value="prodName")
	public String prodName;
	@JsonProperty(value="acctID")
	public long acctID;
	@JsonProperty(value="acctName")
	public String acctName;
	@JsonProperty(value="oweMonth")
	public String oweMonth;
	@JsonProperty(value="TotalFee")
	public double totalFee;
	@JsonProperty(value="FeeValue")
	public double feeValue;
	@JsonProperty(value="OweValue")
	public double oweValue;
	@JsonProperty(value="PayedFee")
	public double payedFee;
	@JsonProperty(value="DiscountFee")
	public double discountFee;
	@JsonProperty(value="AdjustFee")
	public double adjustFee;
	@JsonProperty(value="FinalOweFee")
	public double finalOweFee;
	@JsonProperty(value="FinalBalance")
	public double finalBalance;
	@JsonProperty(value="MonthBillDetail")
	public BillInfo monthBillDetail;
	public long getProdID() {
		return prodID;
	}
	public void setProdID(long prodID) {
		this.prodID = prodID;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public long getAcctID() {
		return acctID;
	}
	public void setAcctID(long acctID) {
		this.acctID = acctID;
	}
	public String getAcctName() {
		return acctName;
	}
	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}
	public String getOweMonth() {
		return oweMonth;
	}
	public void setOweMonth(String oweMonth) {
		this.oweMonth = oweMonth;
	}
	public double getTotalFee() {
		return totalFee;
	}
	public void setTotalFee(double totalFee) {
		this.totalFee = totalFee;
	}
	public double getFeeValue() {
		return feeValue;
	}
	public void setFeeValue(double feeValue) {
		this.feeValue = feeValue;
	}
	public double getOweValue() {
		return oweValue;
	}
	public void setOweValue(double oweValue) {
		this.oweValue = oweValue;
	}
	public double getPayedFee() {
		return payedFee;
	}
	public void setPayedFee(double payedFee) {
		this.payedFee = payedFee;
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
	public double getFinalOweFee() {
		return finalOweFee;
	}
	public void setFinalOweFee(double finalOweFee) {
		this.finalOweFee = finalOweFee;
	}
	public double getFinalBalance() {
		return finalBalance;
	}
	public void setFinalBalance(double finalBalance) {
		this.finalBalance = finalBalance;
	}
	public BillInfo getMonthBillDetail() {
		return monthBillDetail;
	}
	public void setMonthBillDetail(BillInfo monthBillDetail) {
		this.monthBillDetail = monthBillDetail;
	}
	

	
}
