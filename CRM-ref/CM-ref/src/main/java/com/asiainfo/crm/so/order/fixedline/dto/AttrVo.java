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

public class AttrVo implements Serializable {
	private static final long serialVersionUID = 15592909855565500L;
	 private String attrName;
	    private long attrInstId;
	    private String oldVal;
	    private long attrId;
	    private String oldText;
	    private String attrValue;
	    private String attrText;
	    public void setAttrName(String attrName) {
	         this.attrName = attrName;
	     }
	     public String getAttrName() {
	         return attrName;
	     }

	    public void setAttrInstId(long attrInstId) {
	         this.attrInstId = attrInstId;
	     }
	     public long getAttrInstId() {
	         return attrInstId;
	     }

	    public void setOldVal(String oldVal) {
	         this.oldVal = oldVal;
	     }
	     public String getOldVal() {
	         return oldVal;
	     }

	    public void setAttrId(long attrId) {
	         this.attrId = attrId;
	     }
	     public long getAttrId() {
	         return attrId;
	     }

	    public void setOldText(String oldText) {
	         this.oldText = oldText;
	     }
	     public String getOldText() {
	         return oldText;
	     }

	    public void setAttrValue(String attrValue) {
	         this.attrValue = attrValue;
	     }
	     public String getAttrValue() {
	         return attrValue;
	     }

	    public void setAttrText(String attrText) {
	         this.attrText = attrText;
	     }
	     public String getAttrText() {
	         return attrText;
	     }
}
