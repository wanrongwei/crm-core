package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

public class SplitMemberInfo implements Serializable {
	
	public int operatorType;
	
	public String serviceNumber;
	
	public ItemSetInfo[] itemSetInfo;

	public int getOperatorType() {
		return operatorType;
	}

	public void setOperatorType(int operatorType) {
		this.operatorType = operatorType;
	}

	public String getServiceNumber() {
		return serviceNumber;
	}

	public void setServiceNumber(String serviceNumber) {
		this.serviceNumber = serviceNumber;
	}

	public ItemSetInfo[] getItemSetInfo() {
		return itemSetInfo;
	}

	public void setItemSetInfo(ItemSetInfo[] itemSetInfo) {
		this.itemSetInfo = itemSetInfo;
	}
	
}
