package com.asiainfo.crm.cm.model.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.model.ivalues.*;

public class SoUserBean extends DataContainer implements DataContainerInterface,ISoUserValue{

  private static String  m_boName = "com.asiainfo.crm.cm.model.bo.SoUser";



  public final static  String S_ContId = "CONT_ID";
  public final static  String S_AreaCode = "AREA_CODE";
  public final static  String S_IsOutNet = "IS_OUT_NET";
  public final static  String S_PayFeeType = "PAY_FEE_TYPE";
  public final static  String S_OfferPlanGsmDesc = "OFFER_PLAN_GSM_DESC";
  public final static  String S_SubBillId = "SUB_BILL_ID";
  public final static  String S_BrandIdDesc = "BRAND_ID_DESC";
  public final static  String S_CustTypeDesc = "CUST_TYPE_DESC";
  public final static  String S_BalOrgId = "BAL_ORG_ID";
  public final static  String S_NoticeFlagDesc = "NOTICE_FLAG_DESC";
  public final static  String S_PasswordType = "PASSWORD_TYPE";
  public final static  String S_ProdCatalogId = "PROD_CATALOG_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_AddressDesc = "ADDRESS_DESC";
  public final static  String S_CountryCode = "COUNTRY_CODE";
  public final static  String S_CustType = "CUST_TYPE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_ActiveDate = "ACTIVE_DATE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_NoticeFlag = "NOTICE_FLAG";
  public final static  String S_OfferEffectiveDate = "OFFER_EFFECTIVE_DATE";
  public final static  String S_AddressId = "ADDRESS_ID";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_AreaId = "AREA_ID";
  public final static  String S_EffectiveDateType = "EFFECTIVE_DATE_TYPE";
  public final static  String S_OfferExpireDate = "OFFER_EXPIRE_DATE";
  public final static  String S_RiskFlagDesc = "RISK_FLAG_DESC";
  public final static  String S_FirstUseDate = "FIRST_USE_DATE";
  public final static  String S_OweAmount = "OWE_AMOUNT";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_OsStatusDesc = "OS_STATUS_DESC";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_OfferDesc = "OFFER_DESC";
  public final static  String S_Password = "PASSWORD";
  public final static  String S_OfferType = "OFFER_TYPE";
  public final static  String S_CreditLevel = "CREDIT_LEVEL";
  public final static  String S_StateDesc = "STATE_DESC";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_OfferName = "OFFER_NAME";
  public final static  String S_OsStatus = "OS_STATUS";
  public final static  String S_BrandId = "BRAND_ID";
  public final static  String S_UserType = "USER_TYPE";
  public final static  String S_OfferPlanGsm = "OFFER_PLAN_GSM";
  public final static  String S_OrderName = "ORDER_NAME";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreditLevelDesc = "CREDIT_LEVEL_DESC";
  public final static  String S_UserTypeDesc = "USER_TYPE_DESC";
  public final static  String S_OfferId = "OFFER_ID";
  public final static  String S_RiskFlag = "RISK_FLAG";
  public final static  String S_ExpireDateType = "EXPIRE_DATE_TYPE";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_OfferInstId = "OFFER_INST_ID";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public SoUserBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initContId(long value){
     this.initProperty(S_ContId,new Long(value));
  }
  public  void setContId(long value){
     this.set(S_ContId,new Long(value));
  }
  public  void setContIdNull(){
     this.set(S_ContId,null);
  }

  public long getContId(){
        return DataType.getAsLong(this.get(S_ContId));
  
  }
  public long getContIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ContId));
      }

  public void initAreaCode(String value){
     this.initProperty(S_AreaCode,value);
  }
  public  void setAreaCode(String value){
     this.set(S_AreaCode,value);
  }
  public  void setAreaCodeNull(){
     this.set(S_AreaCode,null);
  }

  public String getAreaCode(){
       return DataType.getAsString(this.get(S_AreaCode));
  
  }
  public String getAreaCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AreaCode));
      }

  public void initIsOutNet(int value){
     this.initProperty(S_IsOutNet,new Integer(value));
  }
  public  void setIsOutNet(int value){
     this.set(S_IsOutNet,new Integer(value));
  }
  public  void setIsOutNetNull(){
     this.set(S_IsOutNet,null);
  }

  public int getIsOutNet(){
        return DataType.getAsInt(this.get(S_IsOutNet));
  
  }
  public int getIsOutNetInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IsOutNet));
      }

  public void initPayFeeType(String value){
     this.initProperty(S_PayFeeType,value);
  }
  public  void setPayFeeType(String value){
     this.set(S_PayFeeType,value);
  }
  public  void setPayFeeTypeNull(){
     this.set(S_PayFeeType,null);
  }

  public String getPayFeeType(){
       return DataType.getAsString(this.get(S_PayFeeType));
  
  }
  public String getPayFeeTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PayFeeType));
      }

  public void initOfferPlanGsmDesc(String value){
     this.initProperty(S_OfferPlanGsmDesc,value);
  }
  public  void setOfferPlanGsmDesc(String value){
     this.set(S_OfferPlanGsmDesc,value);
  }
  public  void setOfferPlanGsmDescNull(){
     this.set(S_OfferPlanGsmDesc,null);
  }

  public String getOfferPlanGsmDesc(){
       return DataType.getAsString(this.get(S_OfferPlanGsmDesc));
  
  }
  public String getOfferPlanGsmDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OfferPlanGsmDesc));
      }

  public void initSubBillId(String value){
     this.initProperty(S_SubBillId,value);
  }
  public  void setSubBillId(String value){
     this.set(S_SubBillId,value);
  }
  public  void setSubBillIdNull(){
     this.set(S_SubBillId,null);
  }

  public String getSubBillId(){
       return DataType.getAsString(this.get(S_SubBillId));
  
  }
  public String getSubBillIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SubBillId));
      }

  public void initBrandIdDesc(String value){
     this.initProperty(S_BrandIdDesc,value);
  }
  public  void setBrandIdDesc(String value){
     this.set(S_BrandIdDesc,value);
  }
  public  void setBrandIdDescNull(){
     this.set(S_BrandIdDesc,null);
  }

  public String getBrandIdDesc(){
       return DataType.getAsString(this.get(S_BrandIdDesc));
  
  }
  public String getBrandIdDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BrandIdDesc));
      }

  public void initCustTypeDesc(String value){
     this.initProperty(S_CustTypeDesc,value);
  }
  public  void setCustTypeDesc(String value){
     this.set(S_CustTypeDesc,value);
  }
  public  void setCustTypeDescNull(){
     this.set(S_CustTypeDesc,null);
  }

  public String getCustTypeDesc(){
       return DataType.getAsString(this.get(S_CustTypeDesc));
  
  }
  public String getCustTypeDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CustTypeDesc));
      }

  public void initBalOrgId(long value){
     this.initProperty(S_BalOrgId,new Long(value));
  }
  public  void setBalOrgId(long value){
     this.set(S_BalOrgId,new Long(value));
  }
  public  void setBalOrgIdNull(){
     this.set(S_BalOrgId,null);
  }

  public long getBalOrgId(){
        return DataType.getAsLong(this.get(S_BalOrgId));
  
  }
  public long getBalOrgIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_BalOrgId));
      }

  public void initNoticeFlagDesc(String value){
     this.initProperty(S_NoticeFlagDesc,value);
  }
  public  void setNoticeFlagDesc(String value){
     this.set(S_NoticeFlagDesc,value);
  }
  public  void setNoticeFlagDescNull(){
     this.set(S_NoticeFlagDesc,null);
  }

  public String getNoticeFlagDesc(){
       return DataType.getAsString(this.get(S_NoticeFlagDesc));
  
  }
  public String getNoticeFlagDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_NoticeFlagDesc));
      }

  public void initPasswordType(int value){
     this.initProperty(S_PasswordType,new Integer(value));
  }
  public  void setPasswordType(int value){
     this.set(S_PasswordType,new Integer(value));
  }
  public  void setPasswordTypeNull(){
     this.set(S_PasswordType,null);
  }

  public int getPasswordType(){
        return DataType.getAsInt(this.get(S_PasswordType));
  
  }
  public int getPasswordTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_PasswordType));
      }

  public void initProdCatalogId(long value){
     this.initProperty(S_ProdCatalogId,new Long(value));
  }
  public  void setProdCatalogId(long value){
     this.set(S_ProdCatalogId,new Long(value));
  }
  public  void setProdCatalogIdNull(){
     this.set(S_ProdCatalogId,null);
  }

  public long getProdCatalogId(){
        return DataType.getAsLong(this.get(S_ProdCatalogId));
  
  }
  public long getProdCatalogIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ProdCatalogId));
      }

  public void initExpireDate(Timestamp value){
     this.initProperty(S_ExpireDate,value);
  }
  public  void setExpireDate(Timestamp value){
     this.set(S_ExpireDate,value);
  }
  public  void setExpireDateNull(){
     this.set(S_ExpireDate,null);
  }

  public Timestamp getExpireDate(){
        return DataType.getAsDateTime(this.get(S_ExpireDate));
  
  }
  public Timestamp getExpireDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_ExpireDate));
      }

  public void initEffectiveDate(Timestamp value){
     this.initProperty(S_EffectiveDate,value);
  }
  public  void setEffectiveDate(Timestamp value){
     this.set(S_EffectiveDate,value);
  }
  public  void setEffectiveDateNull(){
     this.set(S_EffectiveDate,null);
  }

  public Timestamp getEffectiveDate(){
        return DataType.getAsDateTime(this.get(S_EffectiveDate));
  
  }
  public Timestamp getEffectiveDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_EffectiveDate));
      }

  public void initOpId(long value){
     this.initProperty(S_OpId,new Long(value));
  }
  public  void setOpId(long value){
     this.set(S_OpId,new Long(value));
  }
  public  void setOpIdNull(){
     this.set(S_OpId,null);
  }

  public long getOpId(){
        return DataType.getAsLong(this.get(S_OpId));
  
  }
  public long getOpIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_OpId));
      }

  public void initAddressDesc(String value){
     this.initProperty(S_AddressDesc,value);
  }
  public  void setAddressDesc(String value){
     this.set(S_AddressDesc,value);
  }
  public  void setAddressDescNull(){
     this.set(S_AddressDesc,null);
  }

  public String getAddressDesc(){
       return DataType.getAsString(this.get(S_AddressDesc));
  
  }
  public String getAddressDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AddressDesc));
      }

  public void initCountryCode(String value){
     this.initProperty(S_CountryCode,value);
  }
  public  void setCountryCode(String value){
     this.set(S_CountryCode,value);
  }
  public  void setCountryCodeNull(){
     this.set(S_CountryCode,null);
  }

  public String getCountryCode(){
       return DataType.getAsString(this.get(S_CountryCode));
  
  }
  public String getCountryCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CountryCode));
      }

  public void initCustType(int value){
     this.initProperty(S_CustType,new Integer(value));
  }
  public  void setCustType(int value){
     this.set(S_CustType,new Integer(value));
  }
  public  void setCustTypeNull(){
     this.set(S_CustType,null);
  }

  public int getCustType(){
        return DataType.getAsInt(this.get(S_CustType));
  
  }
  public int getCustTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CustType));
      }

  public void initDoneDate(Timestamp value){
     this.initProperty(S_DoneDate,value);
  }
  public  void setDoneDate(Timestamp value){
     this.set(S_DoneDate,value);
  }
  public  void setDoneDateNull(){
     this.set(S_DoneDate,null);
  }

  public Timestamp getDoneDate(){
        return DataType.getAsDateTime(this.get(S_DoneDate));
  
  }
  public Timestamp getDoneDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_DoneDate));
      }

  public void initActiveDate(Timestamp value){
     this.initProperty(S_ActiveDate,value);
  }
  public  void setActiveDate(Timestamp value){
     this.set(S_ActiveDate,value);
  }
  public  void setActiveDateNull(){
     this.set(S_ActiveDate,null);
  }

  public Timestamp getActiveDate(){
        return DataType.getAsDateTime(this.get(S_ActiveDate));
  
  }
  public Timestamp getActiveDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_ActiveDate));
      }

  public void initCreateDate(Timestamp value){
     this.initProperty(S_CreateDate,value);
  }
  public  void setCreateDate(Timestamp value){
     this.set(S_CreateDate,value);
  }
  public  void setCreateDateNull(){
     this.set(S_CreateDate,null);
  }

  public Timestamp getCreateDate(){
        return DataType.getAsDateTime(this.get(S_CreateDate));
  
  }
  public Timestamp getCreateDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_CreateDate));
      }

  public void initNoticeFlag(int value){
     this.initProperty(S_NoticeFlag,new Integer(value));
  }
  public  void setNoticeFlag(int value){
     this.set(S_NoticeFlag,new Integer(value));
  }
  public  void setNoticeFlagNull(){
     this.set(S_NoticeFlag,null);
  }

  public int getNoticeFlag(){
        return DataType.getAsInt(this.get(S_NoticeFlag));
  
  }
  public int getNoticeFlagInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_NoticeFlag));
      }

  public void initOfferEffectiveDate(Timestamp value){
     this.initProperty(S_OfferEffectiveDate,value);
  }
  public  void setOfferEffectiveDate(Timestamp value){
     this.set(S_OfferEffectiveDate,value);
  }
  public  void setOfferEffectiveDateNull(){
     this.set(S_OfferEffectiveDate,null);
  }

  public Timestamp getOfferEffectiveDate(){
        return DataType.getAsDateTime(this.get(S_OfferEffectiveDate));
  
  }
  public Timestamp getOfferEffectiveDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_OfferEffectiveDate));
      }

  public void initAddressId(long value){
     this.initProperty(S_AddressId,new Long(value));
  }
  public  void setAddressId(long value){
     this.set(S_AddressId,new Long(value));
  }
  public  void setAddressIdNull(){
     this.set(S_AddressId,null);
  }

  public long getAddressId(){
        return DataType.getAsLong(this.get(S_AddressId));
  
  }
  public long getAddressIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_AddressId));
      }

  public void initState(String value){
     this.initProperty(S_State,value);
  }
  public  void setState(String value){
     this.set(S_State,value);
  }
  public  void setStateNull(){
     this.set(S_State,null);
  }

  public String getState(){
       return DataType.getAsString(this.get(S_State));
  
  }
  public String getStateInitialValue(){
        return DataType.getAsString(this.getOldObj(S_State));
      }

  public void initRemarks(String value){
     this.initProperty(S_Remarks,value);
  }
  public  void setRemarks(String value){
     this.set(S_Remarks,value);
  }
  public  void setRemarksNull(){
     this.set(S_Remarks,null);
  }

  public String getRemarks(){
       return DataType.getAsString(this.get(S_Remarks));
  
  }
  public String getRemarksInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Remarks));
      }

  public void initAreaId(long value){
     this.initProperty(S_AreaId,new Long(value));
  }
  public  void setAreaId(long value){
     this.set(S_AreaId,new Long(value));
  }
  public  void setAreaIdNull(){
     this.set(S_AreaId,null);
  }

  public long getAreaId(){
        return DataType.getAsLong(this.get(S_AreaId));
  
  }
  public long getAreaIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_AreaId));
      }

  public void initEffectiveDateType(long value){
     this.initProperty(S_EffectiveDateType,new Long(value));
  }
  public  void setEffectiveDateType(long value){
     this.set(S_EffectiveDateType,new Long(value));
  }
  public  void setEffectiveDateTypeNull(){
     this.set(S_EffectiveDateType,null);
  }

  public long getEffectiveDateType(){
        return DataType.getAsLong(this.get(S_EffectiveDateType));
  
  }
  public long getEffectiveDateTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_EffectiveDateType));
      }

  public void initOfferExpireDate(Timestamp value){
     this.initProperty(S_OfferExpireDate,value);
  }
  public  void setOfferExpireDate(Timestamp value){
     this.set(S_OfferExpireDate,value);
  }
  public  void setOfferExpireDateNull(){
     this.set(S_OfferExpireDate,null);
  }

  public Timestamp getOfferExpireDate(){
        return DataType.getAsDateTime(this.get(S_OfferExpireDate));
  
  }
  public Timestamp getOfferExpireDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_OfferExpireDate));
      }

  public void initRiskFlagDesc(String value){
     this.initProperty(S_RiskFlagDesc,value);
  }
  public  void setRiskFlagDesc(String value){
     this.set(S_RiskFlagDesc,value);
  }
  public  void setRiskFlagDescNull(){
     this.set(S_RiskFlagDesc,null);
  }

  public String getRiskFlagDesc(){
       return DataType.getAsString(this.get(S_RiskFlagDesc));
  
  }
  public String getRiskFlagDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_RiskFlagDesc));
      }

  public void initFirstUseDate(Timestamp value){
     this.initProperty(S_FirstUseDate,value);
  }
  public  void setFirstUseDate(Timestamp value){
     this.set(S_FirstUseDate,value);
  }
  public  void setFirstUseDateNull(){
     this.set(S_FirstUseDate,null);
  }

  public Timestamp getFirstUseDate(){
        return DataType.getAsDateTime(this.get(S_FirstUseDate));
  
  }
  public Timestamp getFirstUseDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_FirstUseDate));
      }

  public void initOweAmount(long value){
     this.initProperty(S_OweAmount,new Long(value));
  }
  public  void setOweAmount(long value){
     this.set(S_OweAmount,new Long(value));
  }
  public  void setOweAmountNull(){
     this.set(S_OweAmount,null);
  }

  public long getOweAmount(){
        return DataType.getAsLong(this.get(S_OweAmount));
  
  }
  public long getOweAmountInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_OweAmount));
      }

  public void initCustId(long value){
     this.initProperty(S_CustId,new Long(value));
  }
  public  void setCustId(long value){
     this.set(S_CustId,new Long(value));
  }
  public  void setCustIdNull(){
     this.set(S_CustId,null);
  }

  public long getCustId(){
        return DataType.getAsLong(this.get(S_CustId));
  
  }
  public long getCustIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CustId));
      }

  public void initCreateOpId(long value){
     this.initProperty(S_CreateOpId,new Long(value));
  }
  public  void setCreateOpId(long value){
     this.set(S_CreateOpId,new Long(value));
  }
  public  void setCreateOpIdNull(){
     this.set(S_CreateOpId,null);
  }

  public long getCreateOpId(){
        return DataType.getAsLong(this.get(S_CreateOpId));
  
  }
  public long getCreateOpIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CreateOpId));
      }

  public void initOsStatusDesc(String value){
     this.initProperty(S_OsStatusDesc,value);
  }
  public  void setOsStatusDesc(String value){
     this.set(S_OsStatusDesc,value);
  }
  public  void setOsStatusDescNull(){
     this.set(S_OsStatusDesc,null);
  }

  public String getOsStatusDesc(){
       return DataType.getAsString(this.get(S_OsStatusDesc));
  
  }
  public String getOsStatusDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OsStatusDesc));
      }

  public void initDoneCode(long value){
     this.initProperty(S_DoneCode,new Long(value));
  }
  public  void setDoneCode(long value){
     this.set(S_DoneCode,new Long(value));
  }
  public  void setDoneCodeNull(){
     this.set(S_DoneCode,null);
  }

  public long getDoneCode(){
        return DataType.getAsLong(this.get(S_DoneCode));
  
  }
  public long getDoneCodeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_DoneCode));
      }

  public void initOfferDesc(String value){
     this.initProperty(S_OfferDesc,value);
  }
  public  void setOfferDesc(String value){
     this.set(S_OfferDesc,value);
  }
  public  void setOfferDescNull(){
     this.set(S_OfferDesc,null);
  }

  public String getOfferDesc(){
       return DataType.getAsString(this.get(S_OfferDesc));
  
  }
  public String getOfferDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OfferDesc));
      }

  public void initPassword(String value){
     this.initProperty(S_Password,value);
  }
  public  void setPassword(String value){
     this.set(S_Password,value);
  }
  public  void setPasswordNull(){
     this.set(S_Password,null);
  }

  public String getPassword(){
       return DataType.getAsString(this.get(S_Password));
  
  }
  public String getPasswordInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Password));
      }

  public void initOfferType(int value){
     this.initProperty(S_OfferType,new Integer(value));
  }
  public  void setOfferType(int value){
     this.set(S_OfferType,new Integer(value));
  }
  public  void setOfferTypeNull(){
     this.set(S_OfferType,null);
  }

  public int getOfferType(){
        return DataType.getAsInt(this.get(S_OfferType));
  
  }
  public int getOfferTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_OfferType));
      }

  public void initCreditLevel(int value){
     this.initProperty(S_CreditLevel,new Integer(value));
  }
  public  void setCreditLevel(int value){
     this.set(S_CreditLevel,new Integer(value));
  }
  public  void setCreditLevelNull(){
     this.set(S_CreditLevel,null);
  }

  public int getCreditLevel(){
        return DataType.getAsInt(this.get(S_CreditLevel));
  
  }
  public int getCreditLevelInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CreditLevel));
      }

  public void initStateDesc(String value){
     this.initProperty(S_StateDesc,value);
  }
  public  void setStateDesc(String value){
     this.set(S_StateDesc,value);
  }
  public  void setStateDescNull(){
     this.set(S_StateDesc,null);
  }

  public String getStateDesc(){
       return DataType.getAsString(this.get(S_StateDesc));
  
  }
  public String getStateDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_StateDesc));
      }

  public void initUserId(long value){
     this.initProperty(S_UserId,new Long(value));
  }
  public  void setUserId(long value){
     this.set(S_UserId,new Long(value));
  }
  public  void setUserIdNull(){
     this.set(S_UserId,null);
  }

  public long getUserId(){
        return DataType.getAsLong(this.get(S_UserId));
  
  }
  public long getUserIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_UserId));
      }

  public void initOfferName(String value){
     this.initProperty(S_OfferName,value);
  }
  public  void setOfferName(String value){
     this.set(S_OfferName,value);
  }
  public  void setOfferNameNull(){
     this.set(S_OfferName,null);
  }

  public String getOfferName(){
       return DataType.getAsString(this.get(S_OfferName));
  
  }
  public String getOfferNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OfferName));
      }

  public void initOsStatus(String value){
     this.initProperty(S_OsStatus,value);
  }
  public  void setOsStatus(String value){
     this.set(S_OsStatus,value);
  }
  public  void setOsStatusNull(){
     this.set(S_OsStatus,null);
  }

  public String getOsStatus(){
       return DataType.getAsString(this.get(S_OsStatus));
  
  }
  public String getOsStatusInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OsStatus));
      }

  public void initBrandId(long value){
     this.initProperty(S_BrandId,new Long(value));
  }
  public  void setBrandId(long value){
     this.set(S_BrandId,new Long(value));
  }
  public  void setBrandIdNull(){
     this.set(S_BrandId,null);
  }

  public long getBrandId(){
        return DataType.getAsLong(this.get(S_BrandId));
  
  }
  public long getBrandIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_BrandId));
      }

  public void initUserType(int value){
     this.initProperty(S_UserType,new Integer(value));
  }
  public  void setUserType(int value){
     this.set(S_UserType,new Integer(value));
  }
  public  void setUserTypeNull(){
     this.set(S_UserType,null);
  }

  public int getUserType(){
        return DataType.getAsInt(this.get(S_UserType));
  
  }
  public int getUserTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_UserType));
      }

  public void initOfferPlanGsm(long value){
     this.initProperty(S_OfferPlanGsm,new Long(value));
  }
  public  void setOfferPlanGsm(long value){
     this.set(S_OfferPlanGsm,new Long(value));
  }
  public  void setOfferPlanGsmNull(){
     this.set(S_OfferPlanGsm,null);
  }

  public long getOfferPlanGsm(){
        return DataType.getAsLong(this.get(S_OfferPlanGsm));
  
  }
  public long getOfferPlanGsmInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_OfferPlanGsm));
      }

  public void initOrderName(String value){
     this.initProperty(S_OrderName,value);
  }
  public  void setOrderName(String value){
     this.set(S_OrderName,value);
  }
  public  void setOrderNameNull(){
     this.set(S_OrderName,null);
  }

  public String getOrderName(){
       return DataType.getAsString(this.get(S_OrderName));
  
  }
  public String getOrderNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OrderName));
      }

  public void initOrgId(long value){
     this.initProperty(S_OrgId,new Long(value));
  }
  public  void setOrgId(long value){
     this.set(S_OrgId,new Long(value));
  }
  public  void setOrgIdNull(){
     this.set(S_OrgId,null);
  }

  public long getOrgId(){
        return DataType.getAsLong(this.get(S_OrgId));
  
  }
  public long getOrgIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_OrgId));
      }

  public void initCreateOrgId(long value){
     this.initProperty(S_CreateOrgId,new Long(value));
  }
  public  void setCreateOrgId(long value){
     this.set(S_CreateOrgId,new Long(value));
  }
  public  void setCreateOrgIdNull(){
     this.set(S_CreateOrgId,null);
  }

  public long getCreateOrgId(){
        return DataType.getAsLong(this.get(S_CreateOrgId));
  
  }
  public long getCreateOrgIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CreateOrgId));
      }

  public void initRegionId(String value){
     this.initProperty(S_RegionId,value);
  }
  public  void setRegionId(String value){
     this.set(S_RegionId,value);
  }
  public  void setRegionIdNull(){
     this.set(S_RegionId,null);
  }

  public String getRegionId(){
       return DataType.getAsString(this.get(S_RegionId));
  
  }
  public String getRegionIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_RegionId));
      }

  public void initCreditLevelDesc(String value){
     this.initProperty(S_CreditLevelDesc,value);
  }
  public  void setCreditLevelDesc(String value){
     this.set(S_CreditLevelDesc,value);
  }
  public  void setCreditLevelDescNull(){
     this.set(S_CreditLevelDesc,null);
  }

  public String getCreditLevelDesc(){
       return DataType.getAsString(this.get(S_CreditLevelDesc));
  
  }
  public String getCreditLevelDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CreditLevelDesc));
      }

  public void initUserTypeDesc(String value){
     this.initProperty(S_UserTypeDesc,value);
  }
  public  void setUserTypeDesc(String value){
     this.set(S_UserTypeDesc,value);
  }
  public  void setUserTypeDescNull(){
     this.set(S_UserTypeDesc,null);
  }

  public String getUserTypeDesc(){
       return DataType.getAsString(this.get(S_UserTypeDesc));
  
  }
  public String getUserTypeDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_UserTypeDesc));
      }

  public void initOfferId(long value){
     this.initProperty(S_OfferId,new Long(value));
  }
  public  void setOfferId(long value){
     this.set(S_OfferId,new Long(value));
  }
  public  void setOfferIdNull(){
     this.set(S_OfferId,null);
  }

  public long getOfferId(){
        return DataType.getAsLong(this.get(S_OfferId));
  
  }
  public long getOfferIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_OfferId));
      }

  public void initRiskFlag(int value){
     this.initProperty(S_RiskFlag,new Integer(value));
  }
  public  void setRiskFlag(int value){
     this.set(S_RiskFlag,new Integer(value));
  }
  public  void setRiskFlagNull(){
     this.set(S_RiskFlag,null);
  }

  public int getRiskFlag(){
        return DataType.getAsInt(this.get(S_RiskFlag));
  
  }
  public int getRiskFlagInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_RiskFlag));
      }

  public void initExpireDateType(int value){
     this.initProperty(S_ExpireDateType,new Integer(value));
  }
  public  void setExpireDateType(int value){
     this.set(S_ExpireDateType,new Integer(value));
  }
  public  void setExpireDateTypeNull(){
     this.set(S_ExpireDateType,null);
  }

  public int getExpireDateType(){
        return DataType.getAsInt(this.get(S_ExpireDateType));
  
  }
  public int getExpireDateTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ExpireDateType));
      }

  public void initBillId(String value){
     this.initProperty(S_BillId,value);
  }
  public  void setBillId(String value){
     this.set(S_BillId,value);
  }
  public  void setBillIdNull(){
     this.set(S_BillId,null);
  }

  public String getBillId(){
       return DataType.getAsString(this.get(S_BillId));
  
  }
  public String getBillIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BillId));
      }

  public void initOfferInstId(long value){
     this.initProperty(S_OfferInstId,new Long(value));
  }
  public  void setOfferInstId(long value){
     this.set(S_OfferInstId,new Long(value));
  }
  public  void setOfferInstIdNull(){
     this.set(S_OfferInstId,null);
  }

  public long getOfferInstId(){
        return DataType.getAsLong(this.get(S_OfferInstId));
  
  }
  public long getOfferInstIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_OfferInstId));
      }


 
 }

