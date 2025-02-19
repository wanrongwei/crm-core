package com.asiainfo.crm.cm.common.util.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "root")
public class root {
	@XmlElement(name = "districtId")
	private String districtId = null;
	private addresses addresses = null;
	private addressids addressids = null;

	
	public String getDistrictId() {
		return districtId;
	}

	
	public void setDistrictId(String districtId) {
		this.districtId = districtId;
	}

	public addressids getAddressids() {
		return addressids;
	}

	public void setAddressids(addressids addressids) {
		this.addressids = addressids;
	}

	public addresses getAddresses() {
		return addresses;
	}

	public void setAddresses(addresses addresses) {
		this.addresses = addresses;
	}
}
