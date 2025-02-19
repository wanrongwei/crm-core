package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class QueryUnpaidBillRetInfo implements Serializable {
	
	@JsonProperty(value="BillingCycleFeeInfo")
	public BillingCycleFeeInfo[] billingCycleFeeInfo;
	
	public BillingCycleFeeInfo[] getBillingCycleFeeInfo() {
		return billingCycleFeeInfo;
	}

	public void setBillingCycleFeeInfo(BillingCycleFeeInfo[] billingCycleFeeInfo) {
		this.billingCycleFeeInfo = billingCycleFeeInfo;
	}
	
}
