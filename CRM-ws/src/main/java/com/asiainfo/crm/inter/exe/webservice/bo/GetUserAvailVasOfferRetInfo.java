package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class GetUserAvailVasOfferRetInfo implements Serializable {
	
	@JsonProperty(value="OfferInfo")
	public OfferInfo[] offerInfo;

	public OfferInfo[] getOfferInfo() {
		return offerInfo;
	}

	public void setOfferInfo(OfferInfo[] offerInfo) {
		this.offerInfo = offerInfo;
	}

	
	
}
