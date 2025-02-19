package com.asiainfo.crm.so.order.productOffering.dto.condition;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class OrderOfferFeeVo implements Serializable {

	private static final long serialVersionUID = 1773788898744743079L;
	
	private long orderOfferId;
	private long offerIndexId;
	private long custId;
	private long agreementId = 0L;
	private long businessId;
	private String serviceNumber;
	private long relationOfferID;
	private long regionId;
	private String effInfo;
	private String expInfo;
	private long offerInstId;
	private String offerIds;
	private String busiOperIds;
	private String offerInstIds;
	private HashMap paramMap;
	
	
	public String getOfferInstIds() {
		return offerInstIds;
	}
	public void setOfferInstIds(String offerInstIds) {
		this.offerInstIds = offerInstIds;
	}
	public HashMap getParamMap() {
		return paramMap;
	}
	public void setParamMap(HashMap paramMap) {
		this.paramMap = paramMap;
	}
	public String getOfferIds() {
		return offerIds;
	}
	public void setOfferIds(String offerIds) {
		this.offerIds = offerIds;
	}
	public String getBusiOperIds() {
		return busiOperIds;
	}
	public void setBusiOperIds(String busiOperIds) {
		this.busiOperIds = busiOperIds;
	}
	public long getOfferInstId() {
		return offerInstId;
	}
	public void setOfferInstId(long offerInstId) {
		this.offerInstId = offerInstId;
	}
	public String getEffInfo() {
		return effInfo;
	}
	public void setEffInfo(String effInfo) {
		this.effInfo = effInfo;
	}
	public String getExpInfo() {
		return expInfo;
	}
	public void setExpInfo(String expInfo) {
		this.expInfo = expInfo;
	}
	public long getOrderOfferId() {
		return orderOfferId;
	}
	public void setOrderOfferId(long orderOfferId) {
		this.orderOfferId = orderOfferId;
	}
	public long getOfferIndexId() {
		return offerIndexId;
	}
	public void setOfferIndexId(long offerIndexId) {
		this.offerIndexId = offerIndexId;
	}
	public long getCustId() {
		return custId;
	}
	public void setCustId(long custId) {
		this.custId = custId;
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
	public String getServiceNumber() {
		return serviceNumber;
	}
	public void setServiceNumber(String serviceNumber) {
		this.serviceNumber = serviceNumber;
	}
	public long getRelationOfferID() {
		return relationOfferID;
	}
	public void setRelationOfferID(long relationOfferID) {
		this.relationOfferID = relationOfferID;
	}
	public long getRegionId() {
		return regionId;
	}
	public void setRegionId(long regionId) {
		this.regionId = regionId;
	}

}
