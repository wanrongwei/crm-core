package com.asiainfo.crm.so.shop.bo;

import java.io.Serializable;
import java.sql.Timestamp;

public class OfferMutexDependInfo implements Serializable {
	private long offerId;
	private long offerInsId;
	private Timestamp effectDate;
	private Timestamp expireDate;
	private String state;
	
	public long getOfferId() {
		return offerId;
	}
	public void setOfferId(long offerId) {
		this.offerId = offerId;
	}
	public long getOfferInsId() {
		return offerInsId;
	}
	public void setOfferInsId(long offerInsId) {
		this.offerInsId = offerInsId;
	}
	public Timestamp getEffectDate() {
		return effectDate;
	}
	public void setEffectDate(Timestamp effectDate) {
		this.effectDate = effectDate;
	}
	public Timestamp getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(Timestamp expireDate) {
		this.expireDate = expireDate;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
