package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class PriceInfo implements Serializable {
	@JsonProperty(value="PriceItemID")
	public long priceItemID;
	@JsonProperty(value="PriceItemName")
	public String priceItemName;
	@JsonProperty(value="PriceItemValue")
	public double priceItemValue;
	@JsonProperty(value="ShouldMoney")
	public double shouldMoney;
	@JsonProperty(value="FactMoney")
	public double factMoney;
	public long getPriceItemID() {
		return priceItemID;
	}
	public void setPriceItemID(long priceItemID) {
		this.priceItemID = priceItemID;
	}
	public String getPriceItemName() {
		return priceItemName;
	}
	public void setPriceItemName(String priceItemName) {
		this.priceItemName = priceItemName;
	}
	public double getPriceItemValue() {
		return priceItemValue;
	}
	public void setPriceItemValue(double priceItemValue) {
		this.priceItemValue = priceItemValue;
	}
	public double getShouldMoney() {
		return shouldMoney;
	}
	public void setShouldMoney(double shouldMoney) {
		this.shouldMoney = shouldMoney;
	}
	public double getFactMoney() {
		return factMoney;
	}
	public void setFactMoney(double factMoney) {
		this.factMoney = factMoney;
	}
}
