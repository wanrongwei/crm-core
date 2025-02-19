package com.asiainfo.crm.so.order.fixedline.dto;

import java.io.Serializable;

public class AdditionalInfoVo implements Serializable {
	   private static final long serialVersionUID = 15191909842261500L;
	   private String agencyPerson;
	    private String notifyOption;
	    private String remarks;
	    private String customerReference;
	    private String otherInfo;
	    private String purchaseOrderId;
	    public void setAgencyPerson(String agencyPerson) {
	         this.agencyPerson = agencyPerson;
	     }
	     public String getAgencyPerson() {
	         return agencyPerson;
	     }

	    public void setNotifyOption(String notifyOption) {
	         this.notifyOption = notifyOption;
	     }
	     public String getNotifyOption() {
	         return notifyOption;
	     }

	    public void setRemarks(String remarks) {
	         this.remarks = remarks;
	     }
	     public String getRemarks() {
	         return remarks;
	     }

	    public void setCustomerReference(String customerReference) {
	         this.customerReference = customerReference;
	     }
	     public String getCustomerReference() {
	         return customerReference;
	     }

	    public void setOtherInfo(String otherInfo) {
	         this.otherInfo = otherInfo;
	     }
	     public String getOtherInfo() {
	         return otherInfo;
	     }

	    public void setPurchaseOrderId(String purchaseOrderId) {
	         this.purchaseOrderId = purchaseOrderId;
	     }
	     public String getPurchaseOrderId() {
	         return purchaseOrderId;
	     }
}
