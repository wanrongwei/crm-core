package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

public class ItemInfo implements Serializable {

	public long itemID;

	public String itemName;

	public long getItemID() {
		return itemID;
	}

	public void setItemID(long itemID) {
		this.itemID = itemID;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

}
