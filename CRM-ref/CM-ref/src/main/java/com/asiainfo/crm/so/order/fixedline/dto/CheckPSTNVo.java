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

public class CheckPSTNVo implements Serializable {
	private static final long serialVersionUID = 15791909842267500L;
	   private String hasPSTN;
	    private String pstnNo;
	    private String pstnCheck;
	    public void setHasPSTN(String hasPSTN) {
	         this.hasPSTN = hasPSTN;
	     }
	     public String getHasPSTN() {
	         return hasPSTN;
	     }

	    public void setPstnNo(String pstnNo) {
	         this.pstnNo = pstnNo;
	     }
	     public String getPstnNo() {
	         return pstnNo;
	     }

	    public void setPstnCheck(String pstnCheck) {
	         this.pstnCheck = pstnCheck;
	     }
	     public String getPstnCheck() {
	         return pstnCheck;
	     }
}
