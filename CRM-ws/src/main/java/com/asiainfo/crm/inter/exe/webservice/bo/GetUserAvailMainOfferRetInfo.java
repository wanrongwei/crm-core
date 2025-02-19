package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class GetUserAvailMainOfferRetInfo implements Serializable {
	
	@JsonProperty(value="CurMainOffer")
	public OfferInfo curMainOffer;
	@JsonProperty(value="AvailOffers")
	public OfferInfo[] availOffers;
	@JsonProperty(value="AppointId")
	public String appointId;
	public OfferInfo getCurMainOffer() {
		return curMainOffer;
	}
	public void setCurMainOffer(OfferInfo curMainOffer) {
		this.curMainOffer = curMainOffer;
	}
	public OfferInfo[] getAvailOffers() {
		return availOffers;
	}
	public void setAvailOffers(OfferInfo[] availOffers) {
		this.availOffers = availOffers;
	}
	public String getAppointId() {
		return appointId;
	}
	public void setAppointId(String appointId) {
		this.appointId = appointId;
	} 
	

}
