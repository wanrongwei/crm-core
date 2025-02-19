package com.asiainfo.crm.cm.common.util.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "root")
public class root4Qry {

	private addresses4Qry addresses = null;

	public addresses4Qry getAddresses() {
		return addresses;
	}

	public void setAddresses(addresses4Qry addresses) {
		this.addresses = addresses;
	}
}
