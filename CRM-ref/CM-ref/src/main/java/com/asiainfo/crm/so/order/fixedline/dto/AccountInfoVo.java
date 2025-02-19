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

public class AccountInfoVo implements Serializable {
	private static final long serialVersionUID = 15391909842263500L;
	private String invoiceName;
    private NormalAccountVo normalAccount;
    private SplitAccountVo splitAccount;
    public void setNormalAccount(NormalAccountVo normalAccount) {
         this.normalAccount = normalAccount;
     }
     public NormalAccountVo getNormalAccount() {
         return normalAccount;
     }

    public void setSplitAccount(SplitAccountVo splitAccount) {
         this.splitAccount = splitAccount;
     }
     public SplitAccountVo getSplitAccount() {
         return splitAccount;
     }
	public String getInvoiceName() {
		return invoiceName;
	}
	public void setInvoiceName(String invoiceName) {
		this.invoiceName = invoiceName;
	}
}
