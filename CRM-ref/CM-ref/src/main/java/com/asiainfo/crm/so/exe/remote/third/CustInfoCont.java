package com.asiainfo.crm.so.exe.remote.third;

import java.io.Serializable;
import java.util.List;

public class CustInfoCont implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -659451845532584708L;
	private String infoTypeId;// 资料类型 参见资料类型编码
	private List infoItems;// List<CustInfoItem> 资料条目 每个资料条目一组数据

	public String getInfoTypeId() {
		return infoTypeId;
	}

	public void setInfoTypeId(String infoTypeId) {
		this.infoTypeId = infoTypeId;
	}

	public List getInfoItems() {
		return infoItems;
	}

	public void setInfoItems(List infoItems) {
		this.infoItems = infoItems;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("infoTypeId:").append(getInfoTypeId()).append("\n");
		sb.append("infoItems:").append(getInfoItems()).append("\n");
		return sb.toString();
	}

}
