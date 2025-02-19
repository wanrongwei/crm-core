package com.asiainfo.crm.so.order.fixedline.dto;

import java.io.Serializable;

public class OrderExtVo implements Serializable {
	private static final long serialVersionUID = -2539194227263541L;
    private String code;
    private String name;
    private String value;
    public void setCode(String code) {
         this.code = code;
     }
     public String getCode() {
         return code;
     }

    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setValue(String value) {
         this.value = value;
     }
     public String getValue() {
         return value;
     }
}
