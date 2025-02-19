package com.asiainfo.crm.inter.exe.webservice.client.sf;

import java.util.ArrayList;

public class Root {

	private ArrayList<Address> addresses = new ArrayList<Address>();
	private ArrayList<String> addressIds = new ArrayList<String>();

	public ArrayList<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(ArrayList<Address> addresses) {
		this.addresses = addresses;
	}

	public ArrayList<String> getAddressIds() {
		return addressIds;
	}

	public void setAddressIds(ArrayList<String> addressIds) {
		this.addressIds = addressIds;
	}

}
