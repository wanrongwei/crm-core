package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

import com.asiainfo.crm.common.jsonparse.DateDeserializer;

public class BillInfo implements Serializable {
	@JsonProperty(value="BeginTime")
	@JsonDeserialize(using=DateDeserializer.class)
	public Date beginTime;
	@JsonProperty(value="EndTime")
	@JsonDeserialize(using=DateDeserializer.class)
	public Date endTime;
	@JsonProperty(value="BillCycle")
	public String billCycle;
	@JsonProperty(value="PayFee")
	public double payFee;
	@JsonProperty(value="OtherPayFee")
	public double otherPayFee;
	@JsonProperty(value="UnpayFee")
	public double unpayFee;
	@JsonProperty(value="DiscountFee")
	public double discountFee;
	@JsonProperty(value="BillingDetail")
	public BillingDetail[] billingDetail;
	public Date getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public String getBillCycle() {
		return billCycle;
	}
	public void setBillCycle(String billCycle) {
		this.billCycle = billCycle;
	}
	public double getPayFee() {
		return payFee;
	}
	public void setPayFee(double payFee) {
		this.payFee = payFee;
	}
	public double getOtherPayFee() {
		return otherPayFee;
	}
	public void setOtherPayFee(double otherPayFee) {
		this.otherPayFee = otherPayFee;
	}
	public double getUnpayFee() {
		return unpayFee;
	}
	public void setUnpayFee(double unpayFee) {
		this.unpayFee = unpayFee;
	}
	public double getDiscountFee() {
		return discountFee;
	}
	public void setDiscountFee(double discountFee) {
		this.discountFee = discountFee;
	}
	public BillingDetail[] getBillingDetail() {
		return billingDetail;
	}
	public void setBillingDetail(BillingDetail[] billingDetail) {
		this.billingDetail = billingDetail;
	}
	
}
