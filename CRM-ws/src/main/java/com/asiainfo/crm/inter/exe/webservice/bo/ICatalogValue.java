package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.asiainfo.crm.common.jsonparse.DateSerializer;
import com.asiainfo.crm.common.jsonparse.DateDeserializer;


public class ICatalogValue implements Serializable {
	
	@JsonProperty(value="CatalogId")
	public long catalogId;
	public long getCatalogId() {
		return catalogId;
	}

	public void setCatalogId(long catalogId) {
		this.catalogId = catalogId;
	}
	@JsonProperty(value="CatalogName")
	public String catalogName;
	public String getCatalogName() {
		return catalogName;
	}

	public void setCatalogName(String catalogName) {
		this.catalogName = catalogName;
	}
	@JsonProperty(value="CatalogType")
	public String catalogType;
	public String getCatalogType() {
		return catalogType;
	}

	public void setCatalogType(String catalogType) {
		this.catalogType = catalogType;
	}
	@JsonProperty(value="CatalogCode")
	public String catalogCode;
	public String getCatalogCode() {
		return catalogCode;
	}

	public void setCatalogCode(String catalogCode) {
		this.catalogCode = catalogCode;
	}
	@JsonProperty(value="ParentCatalogId")
	public long parentCatalogId;
	public long getParentCatalogId() {
		return parentCatalogId;
	}

	public void setParentCatalogId(long parentCatalogId) {
		this.parentCatalogId = parentCatalogId;
	}
	@JsonProperty(value="Level")
	public long level;
	public long getLevel() {
		return level;
	}

	public void setLevel(long level) {
		this.level = level;
	}
	@JsonProperty(value="IsLeaf")
	public String isLeaf;
	public String getIsLeaf() {
		return isLeaf;
	}

	public void setIsLeaf(String isLeaf) {
		this.isLeaf = isLeaf;
	}


}