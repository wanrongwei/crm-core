package com.asiainfo.crm.so.order.productOffering.dto.condition;

import com.asiainfo.crm.so.order.productOffering.dto.offer.EffExpDateVO;

import java.io.Serializable;
import java.util.Map;

public class OfferConditionVo implements Serializable{
	private static final long serialVersionUID = -8203530152557108947L;
	private long prodSpecId;
	private long agreementId;

	private long offerId;
	private String offerType;
	private long offerInstId;
	
	private long businessId;
	private long oldOfferId;
	private long relatedOfferId;

	private EffExpDateVO effExpData;
	private Map<String, String> params;
	
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
	public long getOfferInstId() {
		return offerInstId;
	}
	public void setOfferInstId(long offerInstId) {
		this.offerInstId = offerInstId;
	}
	public long getOldOfferId() {
		return oldOfferId;
	}
	public void setOldOfferId(long oldOfferId) {
		this.oldOfferId = oldOfferId;
	}
	public long getProdSpecId() {
		return prodSpecId;
	}
	public void setProdSpecId(long prodSpecId) {
		this.prodSpecId = prodSpecId;
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
	public long getRelatedOfferId() {
		return relatedOfferId;
	}
	public void setRelatedOfferId(long relatedOfferId) {
		this.relatedOfferId = relatedOfferId;
	}
	public EffExpDateVO getEffExpData() {
		return effExpData;
	}
	public void setEffExpData(EffExpDateVO effExpData) {
		this.effExpData = effExpData;
	}
	public Map<String, String> getParams() {
		return params;
	}
	public void setParams(Map<String, String> params) {
		this.params = params;
	}
	
}
