/**  
* <p>Title: AttrVo.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* <p>Company: www.asiainfo.com</p>  
* @author cxw  
* @date 2019年10月2日  
* @version SR 0.83  
*/  
package com.asiainfo.crm.so.order.fixedline.dto;

import java.io.Serializable;


/**  
* <p>Title: AttrVo</p>  
* <p>Description: </p>  
* @author cxw  
* @date 2019年10月2日  
*/

public class CpeVo implements Serializable {
	private static final long serialVersionUID = 15391909842263500L;
	
	private String attrInstId;
	private String offerInstId;
	private String offerId;
	private String billId;
	private String offerName;
	private String userId;
	private String serviceId;
	private String cpeAttrId;
	private String cpeSn;
	private String isReturn;
	public String getAttrInstId() {
		return attrInstId;
	}
	public void setAttrInstId(String attrInstId) {
		this.attrInstId = attrInstId;
	}
	public String getOfferInstId() {
		return offerInstId;
	}
	public void setOfferInstId(String offerInstId) {
		this.offerInstId = offerInstId;
	}
	public String getOfferId() {
		return offerId;
	}
	public void setOfferId(String offerId) {
		this.offerId = offerId;
	}
	public String getBillId() {
		return billId;
	}
	public void setBillId(String billId) {
		this.billId = billId;
	}
	public String getOfferName() {
		return offerName;
	}
	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getServiceId() {
		return serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	public String getCpeAttrId() {
		return cpeAttrId;
	}
	public void setCpeAttrId(String cpeAttrId) {
		this.cpeAttrId = cpeAttrId;
	}
	public String getCpeSn() {
		return cpeSn;
	}
	public void setCpeSn(String cpeSn) {
		this.cpeSn = cpeSn;
	}
	public String getIsReturn() {
		return isReturn;
	}
	public void setIsReturn(String isReturn) {
		this.isReturn = isReturn;
	}
	
	
}
