package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.asiainfo.crm.common.jsonparse.DateSerializer;
import com.asiainfo.crm.common.jsonparse.DateDeserializer;


public class IOfferValue implements Serializable {
	
	@JsonProperty(value="OfferId")
	public long offerId;
	public long getOfferId() {
		return offerId;
	}

	public void setOfferId(long offerId) {
		this.offerId = offerId;
	}
	@JsonProperty(value="OfferName")
	public String offerName;
	public String getOfferName() {
		return offerName;
	}

	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}
	@JsonProperty(value="BrandId")
	public long brandId;
	public long getBrandId() {
		return brandId;
	}

	public void setBrandId(long brandId) {
		this.brandId = brandId;
	}
	@JsonProperty(value="RegionId")
	public String[] regionId;
	public String[] getRegionId() {
		return regionId;
	}

	public void setRegionId(String[] regionId) {
		this.regionId = regionId;
	}


}