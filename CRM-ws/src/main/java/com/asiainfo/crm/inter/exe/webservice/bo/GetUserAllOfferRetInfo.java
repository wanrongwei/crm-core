package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class GetUserAllOfferRetInfo implements Serializable {
	@JsonProperty(value="OfferInstInfo")
	public OfferInstInfo[] offerInstInfo;

	public OfferInstInfo[] getOfferInstInfo() {
		return offerInstInfo;
	}

	public void setOfferInstInfo(OfferInstInfo[] offerInstInfo) {
		this.offerInstInfo = offerInstInfo;
	}
	
	

}
