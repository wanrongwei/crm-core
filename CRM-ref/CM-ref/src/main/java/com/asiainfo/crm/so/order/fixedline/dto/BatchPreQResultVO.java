package com.asiainfo.crm.so.order.fixedline.dto;

import java.io.Serializable;
import java.util.List;

public class BatchPreQResultVO implements Serializable {
	private static final long serialVersionUID = 4226263641L;
    private String customerId;
    private String accountID;
    private String dslId;
    private String userName;
    private String invoiceName;
    private String referenceId;
    private AddressInfoVo addressInfo;
    private BatchPreQOfferInfoVo[] offerInfo;
    private List<String> errReason;
 	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getAccountID() {
		return accountID;
	}
	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}
	public String getDslId() {
		return dslId;
	}
	public void setDslId(String dslId) {
		this.dslId = dslId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getInvoiceName() {
		return invoiceName;
	}
	public void setInvoiceName(String invoiceName) {
		this.invoiceName = invoiceName;
	}
	public String getReferenceId() {
		return referenceId;
	}
	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}
	public AddressInfoVo getAddressInfo() {
		return addressInfo;
	}
	public void setAddressInfo(AddressInfoVo addressInfo) {
		this.addressInfo = addressInfo;
	}
	public BatchPreQOfferInfoVo[] getOfferInfo() {
		return offerInfo;
	}
	public void setOfferInfo(BatchPreQOfferInfoVo[] offerInfo) {
		this.offerInfo = offerInfo;
	}
	public List<String> getErrReason() {
		return errReason;
	}
	public void setErrReason(List<String> errReason) {
		this.errReason = errReason;
	}
 
	 
   
}
