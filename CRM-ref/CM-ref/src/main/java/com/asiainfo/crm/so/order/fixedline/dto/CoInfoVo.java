package com.asiainfo.crm.so.order.fixedline.dto;

import java.io.Serializable;
import java.util.List;

public class CoInfoVo implements Serializable {
	private static final long serialVersionUID = 15891909842268500L;
    private int db150;
    private List<TechnologiesVo> technologies;
    private String coDesc;
    private String isDefault;
    private String pbVisitService;
    private String pstnNumber;
    private String coType;
    private String coName;
    private String visitService;
    private String coKind;
    private String hasPstn;
    public void setDb150(int db150) {
         this.db150 = db150;
     }
     public int getDb150() {
         return db150;
     }

    public void setTechnologies(List<TechnologiesVo> technologies) {
         this.technologies = technologies;
     }
     public List<TechnologiesVo> getTechnologies() {
         return technologies;
     }

    public void setCoDesc(String coDesc) {
         this.coDesc = coDesc;
     }
     public String getCoDesc() {
         return coDesc;
     }

    public void setIsDefault(String isDefault) {
         this.isDefault = isDefault;
     }
     public String getIsDefault() {
         return isDefault;
     }

    public void setPbVisitService(String pbVisitService) {
         this.pbVisitService = pbVisitService;
     }
     public String getPbVisitService() {
         return pbVisitService;
     }

    public void setPstnNumber(String pstnNumber) {
         this.pstnNumber = pstnNumber;
     }
     public String getPstnNumber() {
         return pstnNumber;
     }

    public void setCoType(String coType) {
         this.coType = coType;
     }
     public String getCoType() {
         return coType;
     }

    public void setCoName(String coName) {
         this.coName = coName;
     }
     public String getCoName() {
         return coName;
     }

    public void setVisitService(String visitService) {
         this.visitService = visitService;
     }
     public String getVisitService() {
         return visitService;
     }

    public void setCoKind(String coKind) {
         this.coKind = coKind;
     }
     public String getCoKind() {
         return coKind;
     }

    public void setHasPstn(String hasPstn) {
         this.hasPstn = hasPstn;
     }
     public String getHasPstn() {
         return hasPstn;
     }
}
