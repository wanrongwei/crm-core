package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.asiainfo.crm.common.jsonparse.DateSerializer;
import com.asiainfo.crm.common.jsonparse.DateDeserializer;


public class GetOfferByConditionRetInfo implements Serializable {
	
	@JsonProperty(value="IOfferValue")
	public IOfferValue[] iOfferValue;
	public IOfferValue[] getIOfferValue() {
		return iOfferValue;
	}

	public void setIOfferValue(IOfferValue[] iOfferValue) {
		this.iOfferValue = iOfferValue;
	}


}