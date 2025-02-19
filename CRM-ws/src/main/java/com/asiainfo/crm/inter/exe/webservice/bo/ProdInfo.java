package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class ProdInfo implements Serializable {
	@JsonProperty(value="ProdId")
	public long prodId;
	@JsonProperty(value="ProdName")
	public String prodName;
	@JsonProperty(value="SelectStatus")
	public int selectStatus;
	@JsonProperty(value="AttrInfo")
	public AttrInfo[] attrInfo;
	@JsonProperty(value="Desc")
	public String desc;
	public long getProdId() {
		return prodId;
	}
	public void setProdId(long prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getSelectStatus() {
		return selectStatus;
	}
	public void setSelectStatus(int selectStatus) {
		this.selectStatus = selectStatus;
	}
	public AttrInfo[] getAttrInfo() {
		return attrInfo;
	}
	public void setAttrInfo(AttrInfo[] attrInfo) {
		this.attrInfo = attrInfo;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	

	
}
