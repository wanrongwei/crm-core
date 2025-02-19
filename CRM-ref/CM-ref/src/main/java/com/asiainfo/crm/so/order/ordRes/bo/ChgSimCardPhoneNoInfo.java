package com.asiainfo.crm.so.order.ordRes.bo;

public class ChgSimCardPhoneNoInfo {	 
	private String iccId;//新的卡号

	private String oldIccId;//老的卡号
	
	private String phonNumber;//新的号码
	
	private String oldPhonNumber;//老的号码
	
	private long offerInstId;
	
	private long ordOfferId;
	
	private int deliveryType;//发货方式
	
	private int activeType;//激活类型
	
	private boolean isMainOffer;//是否为主offer
	
	private String imsi;//imsi号
	
	private String resSpecId;//资源表对应的卡类型
	
	private String oldResSpecId;//资源表对应的卡类型
	
	private String operation;
	

	public String getIccId() {
		return iccId;
	}

	public void setIccId(String iccId) {
		this.iccId = iccId;
	}

	public String getOldIccId() {
		return oldIccId;
	}

	public void setOldIccId(String oldIccId) {
		this.oldIccId = oldIccId;
	}

	public String getPhonNumber() {
		return phonNumber;
	}

	public void setPhonNumber(String phonNumber) {
		this.phonNumber = phonNumber;
	}

	public String getOldPhonNumber() {
		return oldPhonNumber;
	}

	public void setOldPhonNumber(String oldPhonNumber) {
		this.oldPhonNumber = oldPhonNumber;
	}

	public long getOfferInstId() {
		return offerInstId;
	}

	public void setOfferInstId(long offerInstId) {
		this.offerInstId = offerInstId;
	}

	public long getOrdOfferId() {
		return ordOfferId;
	}

	public void setOrdOfferId(long ordOfferId) {
		this.ordOfferId = ordOfferId;
	}

	public int getDeliveryType() {
		return deliveryType;
	}

	public void setDeliveryType(int deliveryType) {
		this.deliveryType = deliveryType;
	}

	public int getActiveType() {
		return activeType;
	}

	public void setActiveType(int activeType) {
		this.activeType = activeType;
	}

	public boolean isMainOffer() {
		return isMainOffer;
	}

	public void setMainOffer(boolean isMainOffer) {
		this.isMainOffer = isMainOffer;
	}

	public String getImsi() {
		return imsi;
	}

	public void setImsi(String imsi) {
		this.imsi = imsi;
	}

	public String getResSpecId() {
		return resSpecId;
	}

	public void setResSpecId(String resSpecId) {
		this.resSpecId = resSpecId;
	}

	public String getOldResSpecId() {
		return oldResSpecId;
	}

	public void setOldResSpecId(String oldResSpecId) {
		this.oldResSpecId = oldResSpecId;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	

}