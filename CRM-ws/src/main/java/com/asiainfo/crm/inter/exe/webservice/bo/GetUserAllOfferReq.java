package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class GetUserAllOfferReq implements Serializable {
	@JsonProperty(value="ServiceNum")
	public String serviceNum;
	@JsonProperty(value="UserId")
	public long userId;
	@JsonProperty(value="ValidType")
	public int validType;
	@JsonProperty(value="OfferId")
	public long offerId;
	@JsonProperty(value="OfferType")
	public String offerType;
	@JsonProperty(value="OfferCatalog")
	public long offerCatalog;
	public String getServiceNum() {
		return serviceNum;
	}
	public void setServiceNum(String serviceNum) {
		this.serviceNum = serviceNum;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public int getValidType() {
		return validType;
	}
	public void setValidType(int validType) {
		this.validType = validType;
	}
	public long getOfferId() {
		return offerId;
	}
	public void setOfferId(long offerId) {
		this.offerId = offerId;
	}
	public String getOfferType() {
		return offerType;
	}
	public void setOfferType(String offerType) {
		this.offerType = offerType;
	}
	public long getOfferCatalog() {
		return offerCatalog;
	}
	public void setOfferCatalog(long offerCatalog) {
		this.offerCatalog = offerCatalog;
	}

	
	
}
