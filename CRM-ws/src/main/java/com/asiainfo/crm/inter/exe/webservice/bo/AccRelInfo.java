package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class AccRelInfo implements Serializable {
	
	@JsonProperty(value="CusID")
	public long cusID;
	@JsonProperty(value="CusName")
	public String cusName;
	@JsonProperty(value="AccID")
	public long accID;
	@JsonProperty(value="AccName")
	public String accName;
	@JsonProperty(value="ServiceNumber")
	public String serviceNumber;
	@JsonProperty(value="PayMode")
	public int payMode;
	@JsonProperty(value="PayValue")
	public String payValue;
	@JsonProperty(value="ThreadHold")
	public String threadHold;
	@JsonProperty(value="ItemID")
	public String itemID;
	@JsonProperty(value="ItemName")
	public String itemName;
	
	public long getCusID() {
		return cusID;
	}
	public void setCusID(long cusID) {
		this.cusID = cusID;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public long getAccID() {
		return accID;
	}
	public void setAccID(long accID) {
		this.accID = accID;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public String getServiceNumber() {
		return serviceNumber;
	}
	public void setServiceNumber(String serviceNumber) {
		this.serviceNumber = serviceNumber;
	}
	public int getPayMode() {
		return payMode;
	}
	public void setPayMode(int payMode) {
		this.payMode = payMode;
	}
	public String getPayValue() {
		return payValue;
	}
	public void setPayValue(String payValue) {
		this.payValue = payValue;
	}
	public String getThreadHold() {
		return threadHold;
	}
	public void setThreadHold(String threadHold) {
		this.threadHold = threadHold;
	}
	public String getItemID() {
		return itemID;
	}
	public void setItemID(String itemID) {
		this.itemID = itemID;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
}
