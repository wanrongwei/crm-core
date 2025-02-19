package com.asiainfo.crm.so.order.fixedline.dto;

import java.io.Serializable;

public class SettingVo implements Serializable {
	private static final long serialVersionUID = 15991909842269500L;
    private String agencyPerson;
    private int notifyOption;
    private String additionalInformation;
    private String customerReference;
    private String otherInfo;
    private String purchaseOrderId;
    private String invoiceName;
    private String visibleInOse;

	private boolean waiveOrderSummary;

	private boolean commitmentPeriodThan24;

	public boolean isWaiveOrderSummary() {
		return waiveOrderSummary;
	}

	public void setWaiveOrderSummary(boolean waiveOrderSummary) {
		this.waiveOrderSummary = waiveOrderSummary;
	}

	public boolean isCommitmentPeriodThan24() {
		return commitmentPeriodThan24;
	}

	public void setCommitmentPeriodThan24(boolean commitmentPeriodThan24) {
		this.commitmentPeriodThan24 = commitmentPeriodThan24;
	}

	public String getVisibleInOse() {
		return visibleInOse;
	}
	public void setVisibleInOse(String visibleInOse) {
		this.visibleInOse = visibleInOse;
	}
	public String getAgencyPerson() {
		return agencyPerson;
	}
	public void setAgencyPerson(String agencyPerson) {
		this.agencyPerson = agencyPerson;
	}
	public int getNotifyOption() {
		return notifyOption;
	}
	public void setNotifyOption(int notifyOption) {
		this.notifyOption = notifyOption;
	}
	public String getAdditionalInformation() {
		return additionalInformation;
	}
	public void setAdditionalInformation(String additionalInformation) {
		this.additionalInformation = additionalInformation;
	}
	public String getCustomerReference() {
		return customerReference;
	}
	public void setCustomerReference(String customerReference) {
		this.customerReference = customerReference;
	}
	public String getOtherInfo() {
		return otherInfo;
	}
	public void setOtherInfo(String otherInfo) {
		this.otherInfo = otherInfo;
	}
	public String getPurchaseOrderId() {
		return purchaseOrderId;
	}
	public void setPurchaseOrderId(String purchaseOrderId) {
		this.purchaseOrderId = purchaseOrderId;
	}
	public String getInvoiceName() {
		return invoiceName;
	}
	public void setInvoiceName(String invoiceName) {
		this.invoiceName = invoiceName;
	}


}
