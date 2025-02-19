package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

public class OfferUsageRetInfo implements Serializable {
	
	public ItemUsageInfo[] itemUsageInfo;

	public ItemUsageInfo[] getItemUsageInfo() {
		return itemUsageInfo;
	}

	public void setItemUsageInfo(ItemUsageInfo[] itemUsageInfo) {
		this.itemUsageInfo = itemUsageInfo;
	}
	
}
