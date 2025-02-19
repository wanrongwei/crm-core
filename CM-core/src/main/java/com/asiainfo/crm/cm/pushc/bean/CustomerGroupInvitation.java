package com.asiainfo.crm.cm.pushc.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class CustomerGroupInvitation implements Serializable{

	private long inviteMode;
	private String phoneNumber;
	private String inviteCode;
	private String expirationDate;
	private long inviteRefCustId;
    private String inviteRefCustName;
	private List<OfferGroupDiscount> offerGroupDiscountList;

	public long getInviteMode() {
		return inviteMode;
	}
	public void setInviteMode(long inviteMode) {
		this.inviteMode = inviteMode;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getInviteCode() {
		return inviteCode;
	}
	public void setInviteCode(String inviteCode) {
		this.inviteCode = inviteCode;
	}
	public String getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	public long getInviteRefCustId() {
		return inviteRefCustId;
	}
	public void setInviteRefCustId(long inviteRefCustId) {
		this.inviteRefCustId = inviteRefCustId;
	}
	public String getInviteRefCustName() {
		return inviteRefCustName;
	}
	public void setInviteRefCustName(String inviteRefCustName) {
		this.inviteRefCustName = inviteRefCustName;
	}
	public List<OfferGroupDiscount> getOfferGroupDiscountList() {
		return offerGroupDiscountList;
	}
	public void setOfferGroupDiscountList(List<OfferGroupDiscount> offerGroupDiscountList) {
		this.offerGroupDiscountList = offerGroupDiscountList;
	}
	
}
