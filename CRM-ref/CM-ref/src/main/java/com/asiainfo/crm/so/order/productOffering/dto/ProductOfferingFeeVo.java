package com.asiainfo.crm.so.order.productOffering.dto;

import java.io.Serializable;

public class ProductOfferingFeeVo implements Serializable{
	
	private static final long serialVersionUID = 1773788898744743079L;
	
	private long seqId;
	private long pricePlan;
	private String pricePlanName;
	private long chargeMode;
	private long payType;
	private String priceType;
	private long priceId;
	private long priceItemId;
	private String priceName;
	private boolean editType;
	private long taxInclude;
	private String fee;
	private String shouldMoney;
	private String beforeTaxMoney;
	private String taxName;
	private String taxFee;
	private String discountMoney;
	private String factFee;
	private String recurringChargePeriod;
	private String offerId;
	
	private long globalDiscountRuleId;
	private long globalDiscountValidMode;
	private long globalDiscountValidTimeLength;
	private long globalDiscountValidTimeUnit;
	private long globalDiscountNumberator;
	private long globalDiscountDenominator;
	
	public String getOfferId() {
		return offerId;
	}
	public void setOfferId(String offerId) {
		this.offerId = offerId;
	}
	public long getSeqId() {
		return seqId;
	}
	public void setSeqId(long seqId) {
		this.seqId = seqId;
	}
	public long getPricePlan() {
		return pricePlan;
	}
	public void setPricePlan(long pricePlan) {
		this.pricePlan = pricePlan;
	}
	public String getPricePlanName() {
		return pricePlanName;
	}
	public void setPricePlanName(String pricePlanName) {
		this.pricePlanName = pricePlanName;
	}
	public long getChargeMode() {
		return chargeMode;
	}
	public void setChargeMode(long chargeMode) {
		this.chargeMode = chargeMode;
	}
	public long getPayType() {
		return payType;
	}
	public void setPayType(long payType) {
		this.payType = payType;
	}
	public String getPriceType() {
		return priceType;
	}
	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}
	public long getPriceId() {
		return priceId;
	}
	public void setPriceId(long priceId) {
		this.priceId = priceId;
	}
	public long getPriceItemId() {
		return priceItemId;
	}
	public void setPriceItemId(long priceItemId) {
		this.priceItemId = priceItemId;
	}
	public String getPriceName() {
		return priceName;
	}
	public void setPriceName(String priceName) {
		this.priceName = priceName;
	}
	public boolean isEditType() {
		return editType;
	}
	public void setEditType(boolean editType) {
		this.editType = editType;
	}
	public long getTaxInclude() {
		return taxInclude;
	}
	public void setTaxInclude(long taxInclude) {
		this.taxInclude = taxInclude;
	}
	public String getFee() {
		return fee;
	}
	public void setFee(String fee) {
		this.fee = fee;
	}
	public String getShouldMoney() {
		return shouldMoney;
	}
	public void setShouldMoney(String shouldMoney) {
		this.shouldMoney = shouldMoney;
	}
	public String getBeforeTaxMoney() {
		return beforeTaxMoney;
	}
	public void setBeforeTaxMoney(String beforeTaxMoney) {
		this.beforeTaxMoney = beforeTaxMoney;
	}
	public String getTaxName() {
		return taxName;
	}
	public void setTaxName(String taxName) {
		this.taxName = taxName;
	}
	public String getTaxFee() {
		return taxFee;
	}
	public void setTaxFee(String taxFee) {
		this.taxFee = taxFee;
	}
	public String getDiscountMoney() {
		return discountMoney;
	}
	public void setDiscountMoney(String discountMoney) {
		this.discountMoney = discountMoney;
	}
	public String getFactFee() {
		return factFee;
	}
	public void setFactFee(String factFee) {
		this.factFee = factFee;
	}
	public String getRecurringChargePeriod() {
		return recurringChargePeriod;
	}
	public void setRecurringChargePeriod(String recurringChargePeriod) {
		this.recurringChargePeriod = recurringChargePeriod;
	}
	public long getGlobalDiscountRuleId() {
		return globalDiscountRuleId;
	}
	public void setGlobalDiscountRuleId(long globalDiscountRuleId) {
		this.globalDiscountRuleId = globalDiscountRuleId;
	}
	public long getGlobalDiscountValidMode() {
		return globalDiscountValidMode;
	}
	public void setGlobalDiscountValidMode(long globalDiscountValidMode) {
		this.globalDiscountValidMode = globalDiscountValidMode;
	}
	public long getGlobalDiscountValidTimeLength() {
		return globalDiscountValidTimeLength;
	}
	public void setGlobalDiscountValidTimeLength(long globalDiscountValidTimeLength) {
		this.globalDiscountValidTimeLength = globalDiscountValidTimeLength;
	}
	public long getGlobalDiscountValidTimeUnit() {
		return globalDiscountValidTimeUnit;
	}
	public void setGlobalDiscountValidTimeUnit(long globalDiscountValidTimeUnit) {
		this.globalDiscountValidTimeUnit = globalDiscountValidTimeUnit;
	}
	public long getGlobalDiscountNumberator() {
		return globalDiscountNumberator;
	}
	public void setGlobalDiscountNumberator(long globalDiscountNumberator) {
		this.globalDiscountNumberator = globalDiscountNumberator;
	}
	public long getGlobalDiscountDenominator() {
		return globalDiscountDenominator;
	}
	public void setGlobalDiscountDenominator(long globalDiscountDenominator) {
		this.globalDiscountDenominator = globalDiscountDenominator;
	}
	
}
