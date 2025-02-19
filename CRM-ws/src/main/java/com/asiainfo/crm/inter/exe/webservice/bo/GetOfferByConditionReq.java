package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.asiainfo.crm.common.jsonparse.DateSerializer;
import com.asiainfo.crm.common.jsonparse.DateDeserializer;


public class GetOfferByConditionReq implements Serializable {
	
	@JsonProperty(value="catalogId")
	public long catalogId;
	public long getCatalogId() {
		return catalogId;
	}

	public void setCatalogId(long catalogId) {
		this.catalogId = catalogId;
	}
	@JsonProperty(value="regionId")
	public String regionId;
	public String getRegionId() {
		return regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}
	@JsonProperty(value="operId")
	public long operId;
	public long getOperId() {
		return operId;
	}

	public void setOperId(long operId) {
		this.operId = operId;
	}
	@JsonProperty(value="offerType")
	public String offerType;
	public String getOfferType() {
		return offerType;
	}

	public void setOfferType(String offerType) {
		this.offerType = offerType;
	}
	@JsonProperty(value="oldOfferId")
	public String oldOfferId;
	public String getOldOfferId() {
		return oldOfferId;
	}

	public void setOldOfferId(String oldOfferId) {
		this.oldOfferId = oldOfferId;
	}
	@JsonProperty(value="busiType")
	public String busiType;
	public String getBusiType() {
		return busiType;
	}

	public void setBusiType(String busiType) {
		this.busiType = busiType;
	}
	@JsonProperty(value="paramOfferId")
	public long paramOfferId;
	public long getParamOfferId() {
		return paramOfferId;
	}

	public void setParamOfferId(long paramOfferId) {
		this.paramOfferId = paramOfferId;
	}
	@JsonProperty(value="name")
	public String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@JsonProperty(value="prepayType")
	public String prepayType;
	public String getPrepayType() {
		return prepayType;
	}

	public void setPrepayType(String prepayType) {
		this.prepayType = prepayType;
	}
	@JsonProperty(value="busiId")
	public String busiId;
	public String getBusiId() {
		return busiId;
	}

	public void setBusiId(String busiId) {
		this.busiId = busiId;
	}


}