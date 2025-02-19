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

public class DepartInfoVo implements Serializable {
	private static final long serialVersionUID = 2539191221263511L;
    private String deptName;
    private long deptId;
    private long parentDeptId;
    public void setDeptName(String deptName) {
         this.deptName = deptName;
     }
     public String getDeptName() {
         return deptName;
     }

    public void setDeptId(long deptId) {
         this.deptId = deptId;
     }
     public long getDeptId() {
         return deptId;
     }

    public void setParentDeptId(long parentDeptId) {
         this.parentDeptId = parentDeptId;
     }
     public long getParentDeptId() {
         return parentDeptId;
     }
}
