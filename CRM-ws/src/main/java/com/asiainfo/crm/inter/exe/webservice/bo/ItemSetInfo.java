package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

public class ItemSetInfo implements Serializable {
	
	public long itemID;
	
	public String payType;
	
	public String value;
	
	public String threadHold;
	
	public long getItemID() {
		return itemID;
	}
	public void setItemID(long itemID) {
		this.itemID = itemID;
	}
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getThreadHold() {
		return threadHold;
	}
	public void setThreadHold(String threadHold) {
		this.threadHold = threadHold;
	}
	
	
}
