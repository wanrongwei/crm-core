package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class GetGroupOrderReq implements Serializable {
	@JsonProperty(value="GroupId")
	public long groupId ;
	@JsonProperty(value="OfferId")
	public long offerId;
	@JsonProperty(value="ProdSpecNum")
	public long prodSpecNum;
	public long getGroupId() {
		return groupId;
	}
	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}
	public long getOfferId() {
		return offerId;
	}
	public void setOfferId(long offerId) {
		this.offerId = offerId;
	}
	public long getProdSpecNum() {
		return prodSpecNum;
	}
	public void setProdSpecNum(long prodSpecNum) {
		this.prodSpecNum = prodSpecNum;
	}
	
	

}
