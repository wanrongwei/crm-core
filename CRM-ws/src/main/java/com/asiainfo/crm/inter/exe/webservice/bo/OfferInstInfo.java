package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

import com.asiainfo.crm.common.jsonparse.DateDeserializer;

public class OfferInstInfo implements Serializable {
	
	@JsonProperty(value="OperType")
	public int operType;
	@JsonProperty(value="OfferId")
	public long offerId;
	@JsonProperty(value="OfferName")
	public String offerName;
	@JsonProperty(value="OfferType")
	public String offerType;
	@JsonProperty(value="OfferInsId")
	public long offerInsId;
	@JsonProperty(value="ParentOfferInsId")
	public long parentOfferInsId;
	@JsonProperty(value="OfferDesc")
	public String offerDesc;
	@JsonProperty(value="BillingType")
	public int billingType;
	@JsonProperty(value="Price")
	public double price;
	@JsonProperty(value="EffectiveType")
	public int effectiveType;
	@JsonProperty(value="EffectiveDate")
	@JsonDeserialize(using=DateDeserializer.class)
	public Date  effectiveDate;
	@JsonProperty(value="ExpireDate")
	@JsonDeserialize(using=DateDeserializer.class)
	public Date expireDate;
	@JsonProperty(value="ProdInstInfo")
	public ProdInstInfo[] prodInstInfo;
	@JsonProperty(value="AttrInstInfo")
	public AttrInfo[] attrInstInfo;
	@JsonProperty(value="MemberCount")
	public long memberCount;
	public int getOperType() {
		return operType;
	}
	public void setOperType(int operType) {
		this.operType = operType;
	}
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
	public String getOfferType() {
		return offerType;
	}
	public void setOfferType(String offerType) {
		this.offerType = offerType;
	}
	public long getOfferInsId() {
		return offerInsId;
	}
	public void setOfferInsId(long offerInsId) {
		this.offerInsId = offerInsId;
	}
	public long getParentOfferInsId() {
		return parentOfferInsId;
	}
	public void setParentOfferInsId(long parentOfferInsId) {
		this.parentOfferInsId = parentOfferInsId;
	}
	public String getOfferDesc() {
		return offerDesc;
	}
	public void setOfferDesc(String offerDesc) {
		this.offerDesc = offerDesc;
	}
	public int getBillingType() {
		return billingType;
	}
	public void setBillingType(int billingType) {
		this.billingType = billingType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getEffectiveType() {
		return effectiveType;
	}
	public void setEffectiveType(int effectiveType) {
		this.effectiveType = effectiveType;
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
	public ProdInstInfo[] getProdInstInfo() {
		return prodInstInfo;
	}
	public void setProdInstInfo(ProdInstInfo[] prodInstInfo) {
		this.prodInstInfo = prodInstInfo;
	}
	public AttrInfo[] getAttrInstInfo() {
		return attrInstInfo;
	}
	public void setAttrInstInfo(AttrInfo[] attrInstInfo) {
		this.attrInstInfo = attrInstInfo;
	}
	public long getMemberCount() {
		return memberCount;
	}
	public void setMemberCount(long memberCount) {
		this.memberCount = memberCount;
	}

	

}
