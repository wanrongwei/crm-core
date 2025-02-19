package com.asiainfo.crm.so.teaminvoke.out.service.bean;

import java.io.Serializable;

public class BackOrderInfo implements Serializable {

	/** serialVersionUID*/  
	private static final long serialVersionUID = -501957980317401204L;
	private long offerId;
	private long custId;
	private long quantity=1L;
	private String mobilePhone;
	private String email;
	private String outletsIn;//门店号

	private String offerName;
	private String custName;
	private String material;
	private String sapOrderId;
	
	
	public long getOfferId() {
		return offerId;
	}
	public String getOutletsIn() {
		return outletsIn;
	}
	public void setOutletsIn(String outletsIn) {
		this.outletsIn = outletsIn;
	}
	public String getOfferName() {
		return offerName;
	}
	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getSapOrderId() {
		return sapOrderId;
	}
	public void setSapOrderId(String sapOrderId) {
		this.sapOrderId = sapOrderId;
	}
	public void setOfferId(long offerId) {
		this.offerId = offerId;
	}
	public long getCustId() {
		return custId;
	}
	public void setCustId(long custId) {
		this.custId = custId;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
