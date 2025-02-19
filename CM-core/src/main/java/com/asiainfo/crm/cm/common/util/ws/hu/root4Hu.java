package com.asiainfo.crm.cm.common.util.ws.hu;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "root")
public class root4Hu implements Serializable {

	private addresses4Hu addresses = null;

	public addresses4Hu getAddresses() {
		return addresses;
	}

	public void setAddresses(addresses4Hu addresses) {
		this.addresses = addresses;
	}
}
