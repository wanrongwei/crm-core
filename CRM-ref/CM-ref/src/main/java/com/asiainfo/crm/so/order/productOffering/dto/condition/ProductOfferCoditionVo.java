package com.asiainfo.crm.so.order.productOffering.dto.condition;

import java.io.Serializable;

public class ProductOfferCoditionVo implements Serializable{
	
	private static final long serialVersionUID = 1773788898744743079L;
	
	private long customerId;
	private long segmentId;
	private long agreementId;
	private long userId;
	private long businessId;
	private long prodSpecId;
	private String offerType;
	private String productOfferingCatalog;
	private long productOfferingId;
	private String productOfferingName;
	private String expireDate;
	private String oldMainOfferId;
	private String oldAddonOfferId;
	private String offerIds;
	private String serviceIds;
	private String attrIds;
	
	private String rcMin;
	private String rcMax;
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getOfferIds() {
		return offerIds;
	}
	public void setOfferIds(String offerIds) {
		this.offerIds = offerIds;
	}
	private long mutexOfferId;
	
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public long getSegmentId() {
		return segmentId;
	}
	public void setSegmentId(long segmentId) {
		this.segmentId = segmentId;
	}
	public long getAgreementId() {
		return agreementId;
	}
	public void setAgreementId(long agreementId) {
		this.agreementId = agreementId;
	}
	public long getBusinessId() {
		return businessId;
	}
	public void setBusinessId(long businessId) {
		this.businessId = businessId;
	}
	public long getProdSpecId() {
		return prodSpecId;
	}
	public void setProdSpecId(long prodSpecId) {
		this.prodSpecId = prodSpecId;
	}
	public String getOfferType() {
		return offerType;
	}
	public void setOfferType(String offerType) {
		this.offerType = offerType;
	}
	public String getProductOfferingCatalog() {
		return productOfferingCatalog;
	}
	public void setProductOfferingCatalog(String productOfferingCatalog) {
		this.productOfferingCatalog = productOfferingCatalog;
	}
	public long getProductOfferingId() {
		return productOfferingId;
	}
	public void setProductOfferingId(long productOfferingId) {
		this.productOfferingId = productOfferingId;
	}
	public String getProductOfferingName() {
		return productOfferingName;
	}
	public void setProductOfferingName(String productOfferingName) {
		this.productOfferingName = productOfferingName;
	}
	public String getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}
	public String getOldMainOfferId() {
		return oldMainOfferId;
	}
	public void setOldMainOfferId(String oldMainOfferId) {
		this.oldMainOfferId = oldMainOfferId;
	}
	public String getOldAddonOfferId() {
		return oldAddonOfferId;
	}
	public void setOldAddonOfferId(String oldAddonOfferId) {
		this.oldAddonOfferId = oldAddonOfferId;
	}
	public long getMutexOfferId() {
		return mutexOfferId;
	}
	public void setMutexOfferId(long mutexOfferId) {
		this.mutexOfferId = mutexOfferId;
	}
	public String getServiceIds() {
		return serviceIds;
	}
	public void setServiceIds(String serviceIds) {
		this.serviceIds = serviceIds;
	}
	public String getRcMin() {
		return rcMin;
	}
	public void setRcMin(String rcMin) {
		this.rcMin = rcMin;
	}
	public String getRcMax() {
		return rcMax;
	}
	public void setRcMax(String rcMax) {
		this.rcMax = rcMax;
	}
	public String getAttrIds() {
		return attrIds;
	}
	public void setAttrIds(String attrIds) {
		this.attrIds = attrIds;
	}
	
}	