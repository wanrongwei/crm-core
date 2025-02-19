/**  
* <p>Title: RoleVo.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* <p>Company: www.asiainfo.com</p>  
* @author YJ  
* @date 2019年8月13日  
* @version SR 0.83  
*/  
package com.asiainfo.crm.so.order.fixedline.dto;

import java.io.Serializable;
import java.util.List;

/**  
* <p>Title: RoleVo</p>  
* <p>Description: </p>  
* @author YJ  
* @date 2019年8月13日  
*/

public class RoleVo implements Serializable {
    /** serialVersionUID*/  
	private static final long serialVersionUID = 123324435654L;
	/** serialVersionUID*/  
	private long prodSpecId;
    private long roleId;
    private boolean isMain;
    private String effType;
    private String roleName;
    private String expType;
    private List<ProductVo> prodLst;
    public void setProdSpecId(long prodSpecId) {
         this.prodSpecId = prodSpecId;
     }
     public long getProdSpecId() {
         return prodSpecId;
     }

    public void setRoleId(long roleId) {
         this.roleId = roleId;
     }
     public long getRoleId() {
         return roleId;
     }

    public void setIsMain(boolean isMain) {
         this.isMain = isMain;
     }
     public boolean getIsMain() {
         return isMain;
     }

    public void setEffType(String effType) {
         this.effType = effType;
     }
     public String getEffType() {
         return effType;
     }

    public void setRoleName(String roleName) {
         this.roleName = roleName;
     }
     public String getRoleName() {
         return roleName;
     }

    public void setExpType(String expType) {
         this.expType = expType;
     }
     public String getExpType() {
         return expType;
     }

    public void setProdLst(List<ProductVo> prodLst) {
         this.prodLst = prodLst;
     }
     public List<ProductVo> getProdLst() {
         return prodLst;
     }

}
