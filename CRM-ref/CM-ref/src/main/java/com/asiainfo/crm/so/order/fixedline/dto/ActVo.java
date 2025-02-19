/**  
* <p>Title: AttrVo.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* <p>Company: www.asiainfo.com</p>  
* @author YJ  
* @date 2019年8月13日  
* @version SR 0.83  
*/
package com.asiainfo.crm.so.order.fixedline.dto;

import java.io.Serializable;

/**
 * <p>
 * Title: AttrVo
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author cxw
 * @date 2019年8月13日
 */

public class ActVo implements Serializable {
	private static final long serialVersionUID = 15791909842267500L;
	private String actCode;
	private String operator;
	private String customerNo;
	private String circuitNo;
	private String customerName;
	private String CVR;
	private String onlineDate;
	private String contactCustomerFlag;
	private String acceptTermsFlag;
	private String legalAddress;
	private String installAddress;
	private String agreementId;
	private String addressIndentify;
	private String signName;
	
	public String getActCode() {
		return actCode;
	}
	public void setActCode(String actCode) {
		this.actCode = actCode;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getCustomerNo() {
		return customerNo;
	}
	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}
	public String getCircuitNo() {
		return circuitNo;
	}
	public void setCircuitNo(String circuitNo) {
		this.circuitNo = circuitNo;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCVR() {
		return CVR;
	}
	public void setCVR(String CVR) {
		this.CVR = CVR;
	}
	public String getOnlineDate() {
		return onlineDate;
	}
	public void setOnlineDate(String onlineDate) {
		this.onlineDate = onlineDate;
	}
	public String getContactCustomerFlag() {
		return contactCustomerFlag;
	}
	public void setContactCustomerFlag(String contactCustomerFlag) {
		this.contactCustomerFlag = contactCustomerFlag;
	}
	public String getAcceptTermsFlag() {
		return acceptTermsFlag;
	}
	public void setAcceptTermsFlag(String acceptTermsFlag) {
		this.acceptTermsFlag = acceptTermsFlag;
	}
	public String getLegalAddress() {
		return legalAddress;
	}
	public void setLegalAddress(String legalAddress) {
		this.legalAddress = legalAddress;
	}
	public String getInstallAddress() {
		return installAddress;
	}
	public void setInstallAddress(String installAddress) {
		this.installAddress = installAddress;
	}
	public String getAgreementId() {
		return agreementId;
	}
	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}
	public String getAddressIndentify() {
		return addressIndentify;
	}
	public void setAddressIndentify(String addressIndentify) {
		this.addressIndentify = addressIndentify;
	}

	public String getSignName() {
		return signName;
	}

	public void setSignName(String signName) {
		this.signName = signName;
	}
}
