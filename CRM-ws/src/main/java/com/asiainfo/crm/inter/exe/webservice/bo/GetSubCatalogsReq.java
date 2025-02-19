package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.asiainfo.crm.common.jsonparse.DateSerializer;
import com.asiainfo.crm.common.jsonparse.DateDeserializer;


public class GetSubCatalogsReq implements Serializable {
	
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
	@JsonProperty(value="catalogType")
	public String catalogType;
	public String getCatalogType() {
		return catalogType;
	}

	public void setCatalogType(String catalogType) {
		this.catalogType = catalogType;
	}


}