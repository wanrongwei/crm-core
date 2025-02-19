package com.asiainfo.crm.so.exe.remote.third;

import java.io.Serializable;
import java.util.Map;

public class CustInfoItem implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1599411432273124597L;
	private String itemId;// 条目代码
	private String itemCont;// 内容值
	private Map childItems;//List中放置二级科目的Map<String,String> 二级条目 key:二级条目编码，value:内容值

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemCont() {
		return itemCont;
	}

	public void setItemCont(String itemCont) {
		this.itemCont = itemCont;
	}

	public Map getChildItems() {
		return childItems;
	}

	public void setChildItems(Map childItems) {
		this.childItems = childItems;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("itemId:").append(getItemId()).append("\n");
		sb.append("itemCont:").append(getItemCont()).append("\n");
		sb.append("childItems:").append(getChildItems()).append("\n");
		return sb.toString();
	}
}
