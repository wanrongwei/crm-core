package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

import com.asiainfo.crm.common.jsonparse.DateDeserializer;

public class OrderInfo implements Serializable {
	@JsonProperty(value="DoneDate")
	@JsonDeserialize(using=DateDeserializer.class)
	public Date doneDate;
	@JsonProperty(value="BusiCode")
	public String busiCode;
	@JsonProperty(value="BusiName")
	public String busiName;
	@JsonProperty(value="BrandId")
	public long brandId;
	@JsonProperty(value="BrandName")
	public String brandName;
	@JsonProperty(value="UserId")
	public long userId;
	@JsonProperty(value="OfferId")
	public long offerId;
	@JsonProperty(value="OfferName")
	public String offerName;
	@JsonProperty(value="OperType")
	public String operType;
	@JsonProperty(value="Status")
	public String status;
	@JsonProperty(value="PriceInfo")
	public PriceInfo[] priceInfo;
	public Date getDoneDate() {
		return doneDate;
	}
	public void setDoneDate(Date doneDate) {
		this.doneDate = doneDate;
	}
	public String getBusiCode() {
		return busiCode;
	}
	public void setBusiCode(String busiCode) {
		this.busiCode = busiCode;
	}
	public String getBusiName() {
		return busiName;
	}
	public void setBusiName(String busiName) {
		this.busiName = busiName;
	}
	public long getBrandId() {
		return brandId;
	}
	public void setBrandId(long brandId) {
		this.brandId = brandId;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getOfferId() {
		return offerId;
	}
	public void setOfferId(long offerId) {
		this.offerId = offerId;
	}
	public String getOfferName() {
		return offerName;
	}
	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}
	public String getOperType() {
		return operType;
	}
	public void setOperType(String operType) {
		this.operType = operType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public PriceInfo[] getPriceInfo() {
		return priceInfo;
	}
	public void setPriceInfo(PriceInfo[] priceInfo) {
		this.priceInfo = priceInfo;
	}
	
}
