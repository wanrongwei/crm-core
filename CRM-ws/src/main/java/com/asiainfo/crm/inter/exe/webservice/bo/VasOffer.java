package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

import com.asiainfo.crm.common.jsonparse.DateDeserializer;

public class VasOffer implements Serializable {
	
	@JsonProperty(value="OfferId")
	public long offerId;
	@JsonProperty(value="OfferName")
	public String offerName;
	@JsonProperty(value="OfferType")
	public int offerType;
	@JsonProperty(value="OfferDesc")
	public String offerDesc;
	@JsonProperty(value="EffectiveDate")
	@JsonDeserialize(using=DateDeserializer.class)
	public Date effectiveDate;
	@JsonProperty(value="ExpireDate")
	@JsonDeserialize(using=DateDeserializer.class)
	public Date expireDate;
	@JsonProperty(value="ProductSpec")
	public String productSpec;
	
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
	public int getOfferType() {
		return offerType;
	}
	public void setOfferType(int offerType) {
		this.offerType = offerType;
	}
	public String getOfferDesc() {
		return offerDesc;
	}
	public void setOfferDesc(String offerDesc) {
		this.offerDesc = offerDesc;
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
	public String getProductSpec() {
		return productSpec;
	}
	public void setProductSpec(String productSpec) {
		this.productSpec = productSpec;
	}
	
}
