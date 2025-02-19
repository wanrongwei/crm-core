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

public class QueryCpeVo implements Serializable {
	private static final long serialVersionUID = 1391909842263500L;
	
	private long userId;
	private String cpeSn;
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getCpeSn() {
		return cpeSn;
	}
	public void setCpeSn(String cpeSn) {
		this.cpeSn = cpeSn;
	}
	
}
