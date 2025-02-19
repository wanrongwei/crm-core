package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

import com.asiainfo.crm.common.jsonparse.DateDeserializer;

public class BusiRecInfo implements Serializable {

	@JsonProperty(value="RecId")
	public long recId;
	@JsonProperty(value="RecDate")
	@JsonDeserialize(using=DateDeserializer.class)
	public Date recDate;
	@JsonProperty(value="BusiCode")
	public String busiCode;
	@JsonProperty(value="BusiName")
	public String busiName;
	@JsonProperty(value="ServiceNum")
	public String serviceNum;
	@JsonProperty(value="Status")
	public String status;
	@JsonProperty(value="BrandId")
	public String brandId;
	@JsonProperty(value="OfferId")
	public long offerId;
	@JsonProperty(value="OfferName")
	public String offerName;
	@JsonProperty(value="OpCode")
	public String opCode;
	@JsonProperty(value="Remark")
	public String remark;
	@JsonProperty(value="ChannelName")
	public String channelName;
	@JsonProperty(value="OrgName")
	public String orgName;
	public String getBusiName() {
		return busiName;
	}
	public void setBusiName(String busiName) {
		this.busiName = busiName;
	}
	public String getOfferName() {
		return offerName;
	}
	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}

	public long getRecId() {
		return recId;
	}
	public void setRecId(long recId) {
		this.recId = recId;
	}
	public Date getRecDate() {
		return recDate;
	}
	public void setRecDate(Date recDate) {
		this.recDate = recDate;
	}
	public String getBusiCode() {
		return busiCode;
	}
	public void setBusiCode(String busiCode) {
		this.busiCode = busiCode;
	}
	public String getServiceNum() {
		return serviceNum;
	}
	public void setServiceNum(String serviceNum) {
		this.serviceNum = serviceNum;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getBrandId() {
		return brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}
	public long getOfferId() {
		return offerId;
	}
	public void setOfferId(long offerId) {
		this.offerId = offerId;
	}
	public String getOpCode() {
		return opCode;
	}
	public void setOpCode(String opCode) {
		this.opCode = opCode;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	
	

}
