package com.asiainfo.crm.so.order.rboss.ivalues;

import java.io.Serializable;

public interface IActValue extends Serializable {

	public String getActCode();

	public void setActCode(String actCode);

	public String getOperator();

	public void setOperator(String operator);

	public String getCustomerNo();

	public void setCustomerNo(String customerNo);

	public String getCircuitNo();

	public void setCircuitNo(String circuitNo);

	public String getXDSLManually();

	public void setXDSLManually(String manually);

	public String getCustomerName();

	public void setCustomerName(String customerName);

	public String getCvr();

	public void setCvr(String cvr);

	public String getOnlineDate();

	public void setOnlineDate(String onlineDate);

	public String getContactCustomerFlag();

	public void setContactCustomerFlag(String contactCustomerFlag);

	public String getAcceptTermsFlag();

	public void setAcceptTermsFlag(String acceptTermsFlag);

	public String getLegalAddress();

	public void setLegalAddress(String legalAddress);

	public String getInstallAddress();

	public void setInstallAddress(String installAddress);

	public String getSignName() ;

	public void setSignName(String signName) ;
}
