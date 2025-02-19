package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.asiainfo.crm.common.jsonparse.DateSerializer;
import com.asiainfo.crm.common.jsonparse.DateDeserializer;


public class GetSubCatalogsRetInfo implements Serializable {
	
	@JsonProperty(value="ICatalogValue")
	public ICatalogValue[] iCatalogValue;
	public ICatalogValue[] getICatalogValue() {
		return iCatalogValue;
	}

	public void setICatalogValue(ICatalogValue[] iCatalogValue) {
		this.iCatalogValue = iCatalogValue;
	}


}