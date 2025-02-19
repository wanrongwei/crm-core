package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class ShippingAddressInfo implements Serializable {
	
	@JsonProperty(value="RegionID")
	public String regionID;
	@JsonProperty(value="ZoneID")
	public String zoneID;
	@JsonProperty(value="DistrictID")
	public String districtID;
	@JsonProperty(value="Address")
	public String address;
	
	public String getRegionID() {
		return regionID;
	}
	public void setRegionID(String regionID) {
		this.regionID = regionID;
	}
	public String getZoneID() {
		return zoneID;
	}
	public void setZoneID(String zoneID) {
		this.zoneID = zoneID;
	}
	public String getDistrictID() {
		return districtID;
	}
	public void setDistrictID(String districtID) {
		this.districtID = districtID;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
