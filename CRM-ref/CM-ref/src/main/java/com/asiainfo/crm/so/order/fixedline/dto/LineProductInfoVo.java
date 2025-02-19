/**  
* <p>Title: LineProductInfoVo.java</p>  
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
* <p>Title: LineProductInfoVo</p>  
* <p>Description: </p>  
* @author YJ  
* @date 2019年8月13日  
*/

public class LineProductInfoVo implements Serializable{
	private static final long serialVersionUID = -11539194220263541L;
    private String productOperator;
    private String productNo;
    private String productType;
    public void setProductOperator(String productOperator) {
         this.productOperator = productOperator;
     }
     public String getProductOperator() {
         return productOperator;
     }

    public void setProductNo(String productNo) {
         this.productNo = productNo;
     }
     public String getProductNo() {
         return productNo;
     }

    public void setProductType(String productType) {
         this.productType = productType;
     }
     public String getProductType() {
         return productType;
     }
}
