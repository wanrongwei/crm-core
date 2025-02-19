package com.asiainfo.crm.so.order.fixedline.dto;

import java.io.Serializable;

public class CustomerVo implements Serializable {
	private static final long serialVersionUID = -11539190220463500L;
	   private long custId;
	    private String custName;
	    private String custType;
	    public void setCustId(long custId) {
	         this.custId = custId;
	     }
	     public long getCustId() {
	         return custId;
	     }

	    public void setCustName(String custName) {
	         this.custName = custName;
	     }
	     public String getCustName() {
	         return custName;
	     }

	    public void setCustType(String custType) {
	         this.custType = custType;
	     }
	     public String getCustType() {
	         return custType;
	     }	
}
