package com.asiainfo.crm.cm.pushc.bean;

import java.io.Serializable;

public class CustomerGroupAdmin implements Serializable{

	private long custId;
    private String custName;
    
	public long getCustId() {
		return custId;
	}
	public void setCustId(long custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
    
}
