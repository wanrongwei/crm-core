/**  
* <p>Title: ProductVo.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* <p>Company: www.asiainfo.com</p>  
* @author YJ  
* @date 2019年8月13日  
* @version SR 0.83  
*/  
package com.asiainfo.crm.so.order.fixedline.dto;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

/**  
* <p>Title: ProductVo</p>  
* <p>Description: </p>  
* @author YJ  
* @date 2019年8月13日  
*/

public class ProductVo implements Serializable {
 	    /** serialVersionUID*/  
	private static final long serialVersionUID = 5599124229263543L;
		private long prodId;
	    private boolean isChecked;
	    private List<AttrVo> attrList;
	    private Date expDate;
	    private Date effDate;
	    private String effType;
	    private String prodName;
	    private String expType;
	    private long prodInstId;
	    public void setProdId(long prodId) {
	         this.prodId = prodId;
	     }
	     public long getProdId() {
	         return prodId;
	     }

	    public void setIsChecked(boolean isChecked) {
	         this.isChecked = isChecked;
	     }
	     public boolean getIsChecked() {
	         return isChecked;
	     }

	    public void setAttrList(List<AttrVo> attrList) {
	         this.attrList = attrList;
	     }
	     public List<AttrVo> getAttrList() {
	         return attrList;
	     }

	    public void setExpDate(Date expDate) {
	         this.expDate = expDate;
	     }
	     public Date getExpDate() {
	         return expDate;
	     }

	    public void setEffDate(Date effDate) {
	         this.effDate = effDate;
	     }
	     public Date getEffDate() {
	         return effDate;
	     }

	    public void setEffType(String effType) {
	         this.effType = effType;
	     }
	     public String getEffType() {
	         return effType;
	     }

	    public void setProdName(String prodName) {
	         this.prodName = prodName;
	     }
	     public String getProdName() {
	         return prodName;
	     }

	    public void setExpType(String expType) {
	         this.expType = expType;
	     }
	     public String getExpType() {
	         return expType;
	     }

	    public void setProdInstId(long prodInstId) {
	         this.prodInstId = prodInstId;
	     }
	     public long getProdInstId() {
	         return prodInstId;
	     }

}
