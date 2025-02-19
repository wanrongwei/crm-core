package com.asiainfo.crm.so.teaminvoke.out.service.bean;

import java.io.Serializable;

public class HandsetOfferInfo implements Serializable {

	/** serialVersionUID*/  
	private static final long serialVersionUID = -3390233951084289496L;
	private long offerId;   
	private String offerIndexId;
	private String offerType;
	private String offerName;
	private int quantity = 1; //数量  默认为1，修改订单后数量传0给crm
	private String offerStatus;   //是否delay   1.delay 0.normal
	private String original_delivery_date;//发货时间
	private String expect_delivery_date;//最新发货时间
	private boolean isAbleDelete;
	public long getOfferId() {
		return offerId;
	}
	public void setOfferId(long offerId) {
		this.offerId = offerId;
	}
	public String getOfferIndexId() {
		return offerIndexId;
	}
	public void setOfferIndexId(String offerIndexId) {
		this.offerIndexId = offerIndexId;
	}
	public String getOfferType() {
		return offerType;
	}
	public void setOfferType(String offerType) {
		this.offerType = offerType;
	}
	public String getOfferName() {
		return offerName;
	}
	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getOfferStatus() {
		return offerStatus;
	}
	public void setOfferStatus(String offerStatus) {
		this.offerStatus = offerStatus;
	}
	public String getOriginal_delivery_date() {
		return original_delivery_date;
	}
	public void setOriginal_delivery_date(String original_delivery_date) {
		this.original_delivery_date = original_delivery_date;
	}
	public String getExpect_delivery_date() {
		return expect_delivery_date;
	}
	public void setExpect_delivery_date(String expect_delivery_date) {
		this.expect_delivery_date = expect_delivery_date;
	}
	public boolean isAbleDelete() {
		return isAbleDelete;
	}
	public void setAbleDelete(boolean isAbleDelete) {
		this.isAbleDelete = isAbleDelete;
	}

	
}
