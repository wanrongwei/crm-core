/**  
* <p>Title: AttrVo.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* <p>Company: www.asiainfo.com</p>  
* @author cxw 
* @date 2019年10月11日  
* @version SR 0.83  
*/  
package com.asiainfo.crm.so.order.fixedline.dto;

import java.io.Serializable;

/**  
* <p>Title: AttrVo</p>  
* <p>Description: </p>  
* @author cxw  
* @date 2019年10月11日  
*/

public class ReturnInfoVo implements Serializable {
	private static final long serialVersionUID = 15391909842263500L;
	
	private String userId;
	private String billId;
	private String offerInstId;
	private String offerId;
	public String getOfferId() {
		return offerId;
	}
	public void setOfferId(String offerId) {
		this.offerId = offerId;
	}
	private String offerName;
	private String cpeSn;
	private String manualNeedReturnFlag;
	private String upcReturnFlag;
	private String returnInShop;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getBillId() {
		return billId;
	}
	public void setBillId(String billId) {
		this.billId = billId;
	}
	public String getOfferInstId() {
		return offerInstId;
	}
	public void setOfferInstId(String offerInstId) {
		this.offerInstId = offerInstId;
	}
	public String getOfferName() {
		return offerName;
	}
	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}
	public String getCpeSn() {
		return cpeSn;
	}
	public void setCpeSn(String cpeSn) {
		this.cpeSn = cpeSn;
	}
	public String getManualNeedReturnFlag() {
		return manualNeedReturnFlag;
	}
	public void setManualNeedReturnFlag(String manualNeedReturnFlag) {
		this.manualNeedReturnFlag = manualNeedReturnFlag;
	}
	public String getUpcReturnFlag() {
		return upcReturnFlag;
	}
	public void setUpcReturnFlag(String upcReturnFlag) {
		this.upcReturnFlag = upcReturnFlag;
	}
	public String getReturnInShop() {
		return returnInShop;
	}
	public void setReturnInShop(String returnInShop) {
		this.returnInShop = returnInShop;
	}
}
