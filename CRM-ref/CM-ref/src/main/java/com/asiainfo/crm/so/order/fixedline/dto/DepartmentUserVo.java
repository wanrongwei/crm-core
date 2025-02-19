package com.asiainfo.crm.so.order.fixedline.dto;

import java.io.Serializable;

public class DepartmentUserVo implements Serializable {
	private static final long serialVersionUID = 11539192222263521L;
	private DepartInfoVo departInfo;
    private CustUserInfoVo userInfo;
    public void setDepartInfo(DepartInfoVo departInfo) {
         this.departInfo = departInfo;
     }
     public DepartInfoVo getDepartInfo() {
         return departInfo;
     }

    public void setUserInfo(CustUserInfoVo userInfo) {
         this.userInfo = userInfo;
     }
     public CustUserInfoVo getUserInfo() {
         return userInfo;
     }
}
