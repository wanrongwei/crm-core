package com.asiainfo.crm.so.order.fixedline.dto;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

public class OfferVo implements Serializable {
	private static final long serialVersionUID = -11639194226263641L;
    private String offerName;
    private long oldOfferId;
    private String expParam;
    private long businessId;
    private String businessName;
    private long offerIndexId;
    private String operType;
    private List<RoleVo> roleList;
    private Timestamp expDate;
    private String instalmentFlag;
    private String offerType;
    private Timestamp effDate;
    private long oldOfferInstId;
    private String effType;
    private long offerId;
    private String expType;
    private long offerInstId;
    private long relatedOfferId;
    public void setOfferName(String offerName) {
         this.offerName = offerName;
     }
     public String getOfferName() {
         return offerName;
     }

    public void setOldOfferId(long oldOfferId) {
         this.oldOfferId = oldOfferId;
     }
     public long getOldOfferId() {
         return oldOfferId;
     }

    public void setExpParam(String expParam) {
         this.expParam = expParam;
     }
     public String getExpParam() {
         return expParam;
     }

    public void setBusinessId(long businessId) {
         this.businessId = businessId;
     }
     public long getBusinessId() {
         return businessId;
     }

    public void setBusinessName(String businessName) {
         this.businessName = businessName;
     }
     public String getBusinessName() {
         return businessName;
     }

    public void setOfferIndexId(long offerIndexId) {
         this.offerIndexId = offerIndexId;
     }
     public long getOfferIndexId() {
         return offerIndexId;
     }

    public void setOperType(String operType) {
         this.operType = operType;
     }
     public String getOperType() {
         return operType;
     }

    public void setRoleList(List<RoleVo> roleList) {
         this.roleList = roleList;
     }
     public List<RoleVo> getRoleList() {
         return roleList;
     }

    public void setExpDate(Timestamp expDate) {
         this.expDate = expDate;
     }
     public Timestamp getExpDate() {
         return expDate;
     }

    public void setInstalmentFlag(String instalmentFlag) {
         this.instalmentFlag = instalmentFlag;
     }
     public String getInstalmentFlag() {
         return instalmentFlag;
     }

    public void setOfferType(String offerType) {
         this.offerType = offerType;
     }
     public String getOfferType() {
         return offerType;
     }

    public void setEffDate(Timestamp effDate) {
         this.effDate = effDate;
     }
     public Timestamp getEffDate() {
         return effDate;
     }

    public void setOldOfferInstId(long oldOfferInstId) {
         this.oldOfferInstId = oldOfferInstId;
     }
     public long getOldOfferInstId() {
         return oldOfferInstId;
     }

    public void setEffType(String effType) {
         this.effType = effType;
     }
     public String getEffType() {
         return effType;
     }

    public void setOfferId(long offerId) {
         this.offerId = offerId;
     }
     public long getOfferId() {
         return offerId;
     }

    public void setExpType(String expType) {
         this.expType = expType;
     }
     public String getExpType() {
         return expType;
     }

    public void setOfferInstId(long offerInstId) {
         this.offerInstId = offerInstId;
     }
     public long getOfferInstId() {
         return offerInstId;
     }

    public void setRelatedOfferId(int relatedOfferId) {
         this.relatedOfferId = relatedOfferId;
     }
     public long getRelatedOfferId() {
         return relatedOfferId;
     }
}
