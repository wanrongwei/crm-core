package com.asiainfo.crm.cm.common.util.ws;

import java.io.Serializable;

public class addresses4Qry implements Serializable {

	/**
	 * 查询地址对象
	 */
	private static final long serialVersionUID = 1L;
	private address[] address = null;

	public address[] getAddress() {
		return address;
	}

	public void setAddress(address[] address) {
		this.address = address;
	}

}
