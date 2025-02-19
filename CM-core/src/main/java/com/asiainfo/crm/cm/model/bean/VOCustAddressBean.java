package com.asiainfo.crm.cm.model.bean;

import com.asiainfo.crm.cm.common.util.ws.address;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustContactMediumValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustAddressValue;

public class VOCustAddressBean extends ValueObjectBean implements IVOCustAddressValue {

	private address address;
	private IBOCmCustContactMediumValue contMedium;
	private long addressId = -1;

	public long getId() {
		return this.addressId;
	}

	public long getAddressId() {
		return this.addressId;
	}

	public address getAddress() throws Exception {
		return this.address;
	}

	public IBOCmCustContactMediumValue getContMedium() throws Exception {
		return this.contMedium;
	}

	public void addAddress(address address) throws Exception {
		this.address = address;
	}

	public void addContMedium(IBOCmCustContactMediumValue contMedium) throws Exception {
		this.contMedium = contMedium;
	}

	public void setAddressId(long addressId) throws Exception {
		this.addressId = addressId;
	}

}
