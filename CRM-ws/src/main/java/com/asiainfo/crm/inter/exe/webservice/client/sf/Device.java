package com.asiainfo.crm.inter.exe.webservice.client.sf;

import java.io.Serializable;

public class Device implements Serializable{
	private static final long serialVersionUID = 9175851802166508116L;
	private String type;
	private String macAddress;
	private String serialNumber;
	private String model;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMacAddress() {
		return macAddress;
	}
	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
}
