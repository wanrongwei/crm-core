package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

public class AccItemQueryRetInfo implements Serializable {
	
	public ItemInfo[] itemInfo;

	public ItemInfo[] getItemInfo() {
		return itemInfo;
	}

	public void setItemInfo(ItemInfo[] itemInfo) {
		this.itemInfo = itemInfo;
	}
	
}
