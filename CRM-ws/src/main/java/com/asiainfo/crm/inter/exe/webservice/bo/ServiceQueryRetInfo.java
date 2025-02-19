package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class ServiceQueryRetInfo implements Serializable {
	@JsonProperty(value="ProdInfo")
	public ProdInfo[] prodInfo;

	public ProdInfo[] getProdInfo() {
		return prodInfo;
	}

	public void setProdInfo(ProdInfo[] prodInfo) {
		this.prodInfo = prodInfo;
	}

}
