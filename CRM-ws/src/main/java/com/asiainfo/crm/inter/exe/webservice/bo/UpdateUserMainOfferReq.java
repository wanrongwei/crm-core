package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;

public class UpdateUserMainOfferReq implements Serializable {
	@JsonProperty(value="ServiceNum")
	public String serviceNum;
	@JsonProperty(value="UserId")
	public long userId;
	@JsonProperty(value="OfferId")
	public long offerId;
	@JsonProperty(value="EffectiveType")
	public int effectiveType;
	@JsonProperty(value="EffectiveDate")
	public Date effectiveDate;
	@JsonProperty(value="ExpireDate")
	public Date expireDate;
	@JsonProperty(value="VasOfferInfo")
	public OfferInstInfo[] vasOfferInfo;
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
	public long getOfferId() {
		return offerId;
	}
	public void setOfferId(long offerId) {
		this.offerId = offerId;
	}
	public int getEffectiveType() {
		return effectiveType;
	}
	public void setEffectiveType(int effectiveType) {
		this.effectiveType = effectiveType;
	}
	public Date getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public Date getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}
	public OfferInstInfo[] getVasOfferInfo() {
		return vasOfferInfo;
	}
	public void setVasOfferInfo(OfferInstInfo[] vasOfferInfo) {
		this.vasOfferInfo = vasOfferInfo;
	}
	
	
}
