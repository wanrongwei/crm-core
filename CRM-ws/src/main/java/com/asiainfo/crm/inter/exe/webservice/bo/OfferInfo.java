package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

import com.asiainfo.crm.common.jsonparse.DateDeserializer;

public class OfferInfo implements Serializable {
	@JsonProperty(value="OfferId")
	public long offerId;
	@JsonProperty(value="OfferName")
	public String offerName;
	@JsonProperty(value="OfferDesc")
	public String offerDesc;
	@JsonProperty(value="OfferType")
	public String offerType;
	@JsonProperty(value="BrandId")
	public String brandId;
	@JsonProperty(value="BaseFee")
	public double baseFee;
	@JsonProperty(value="EffectiveDate")
	@JsonDeserialize(using=DateDeserializer.class)
	public Date effectiveDate;
	@JsonProperty(value="ExpireDate")
	@JsonDeserialize(using=DateDeserializer.class)
	public Date expireDate;
	@JsonProperty(value="ProdInfo")
	public ProdInfo[] prodInfo;
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
	public String getOfferDesc() {
		return offerDesc;
	}
	public void setOfferDesc(String offerDesc) {
		this.offerDesc = offerDesc;
	}
	public String getOfferType() {
		return offerType;
	}
	public void setOfferType(String offerType) {
		this.offerType = offerType;
	}
	public String getBrandId() {
		return brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}
	public double getBaseFee() {
		return baseFee;
	}
	public void setBaseFee(double baseFee) {
		this.baseFee = baseFee;
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
	public ProdInfo[] getProdInfo() {
		return prodInfo;
	}
	public void setProdInfo(ProdInfo[] prodInfo) {
		this.prodInfo = prodInfo;
	}
	
	
	
}
