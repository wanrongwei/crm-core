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
* <p>Title: AttrVo</p>  
* <p>Description: </p>  
* @author YJ  
* @date 2019年8月13日  
*/

public class LineOptionVo implements Serializable {
	private static final long serialVersionUID = -11539193223263531L;
    private String actCode;
    private String actName;
    private String operator;
    private String customerNo;
    private String circuitNo;
    private String preTechnologyType;
    private String pstnNumber;
    private String boxId;
  
	private String acceptContract;
	private String acceptSBBUCheck;
	private String cvr;
	private String addressIdentifier;
	private String customerNumber;
    private String legalAddress;
    private String installationAddress;
	private String customerName;
	private String operatorName;
	private String fillOutPoa;
	private String agreementId;
	private String signName;

	private String applyDiscount;
    
    public String getPstnNumber() {
		return pstnNumber;
	}
	public void setPstnNumber(String pstnNumber) {
		this.pstnNumber = pstnNumber;
	}
	public String getBoxId() {
		return boxId;
	}
	public void setBoxId(String boxId) {
		this.boxId = boxId;
	}
	public void setActCode(String actCode) {
         this.actCode = actCode;
     }
     public String getActCode() {
         return actCode;
     }

    public void setOperator(String operator) {
         this.operator = operator;
     }
     public String getOperator() {
         return operator;
     }

    public void setCustomerNo(String customerNo) {
         this.customerNo = customerNo;
     }
     public String getCustomerNo() {
         return customerNo;
     }

    public void setCircuitNo(String circuitNo) {
         this.circuitNo = circuitNo;
     }
     public String getCircuitNo() {
         return circuitNo;
     }
	public String getPreTechnologyType() {
		return preTechnologyType;
	}
	public void setPreTechnologyType(String preTechnologyType) {
		this.preTechnologyType = preTechnologyType;
	}
	public String getActName() {
		return actName;
	}
	public void setActName(String actName) {
		this.actName = actName;
	}
	public String getOperatorName() {
		return operatorName;
	}
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getCvr() {
		return cvr;
	}
	public void setCvr(String cvr) {
		this.cvr = cvr;
	}
	public String getAcceptSBBUCheck() {
		return acceptSBBUCheck;
	}
	public void setAcceptSBBUCheck(String acceptSBBUCheck) {
		this.acceptSBBUCheck = acceptSBBUCheck;
	}
	public String getAcceptContract() {
		return acceptContract;
	}
	public void setAcceptContract(String acceptContract) {
		this.acceptContract = acceptContract;
	}
	public String getInstallationAddress() {
		return installationAddress;
	}
	public void setInstallationAddress(String installationAddress) {
		this.installationAddress = installationAddress;
	}
	public String getLegalAddress() {
		return legalAddress;
	}
	public void setLegalAddress(String legalAddress) {
		this.legalAddress = legalAddress;
	}
	public String getAddressIdentifier() {
		return addressIdentifier;
	}
	public void setAddressIdentifier(String addressIdentifier) {
		this.addressIdentifier = addressIdentifier;
	}
	public String getFillOutPoa() {
		return fillOutPoa;
	}
	public void setFillOutPoa(String fillOutPoa) {
		this.fillOutPoa = fillOutPoa;
	}
	public String getAgreementId() {
		return agreementId;
	}
	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}

	public String getSignName() {
		return signName;
	}

	public void setSignName(String signName) {
		this.signName = signName;
	}

	public String getApplyDiscount() {
		return applyDiscount;
	}

	public void setApplyDiscount(String applyDiscount) {
		this.applyDiscount = applyDiscount;
	}
}
