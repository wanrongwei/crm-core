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

public class initInstallAddressVo implements Serializable {
	private static final long serialVersionUID = 5139190984226350022L;
    private long  custId;
    private long  customerOrderId;
    private long  userId;
    private String  isModify;
	public long getCustId() {
		return custId;
	}
	public void setCustId(long custId) {
		this.custId = custId;
	}

	public long getCustomerOrderId() {
		return customerOrderId;
	}
	public void setCustomerOrderId(long customerOrderId) {
		this.customerOrderId = customerOrderId;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getIsModify() {
		return isModify;
	}
	public void setIsModify(String isModify) {
		this.isModify = isModify;
	}
    
}
