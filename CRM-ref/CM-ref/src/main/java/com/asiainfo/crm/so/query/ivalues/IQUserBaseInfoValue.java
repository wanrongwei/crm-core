package com.asiainfo.crm.so.query.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IQUserBaseInfoValue extends DataStructInterface{

  public final static  String S_StateDesc = "STATE_DESC";
  public final static  String S_State = "STATE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_AddressId = "ADDRESS_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_CustType = "CUST_TYPE";
  public final static  String S_OfferType = "OFFER_TYPE";
  public final static  String S_OfferInstId = "OFFER_INST_ID";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_CountryCode = "COUNTRY_CODE";
  public final static  String S_OfferExpireDate = "OFFER_EXPIRE_DATE";
  public final static  String S_RiskFlagDesc = "RISK_FLAG_DESC";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_OsStatusDesc = "OS_STATUS_DESC";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_NoticeFlagDesc = "NOTICE_FLAG_DESC";
  public final static  String S_BrandIdDesc = "BRAND_ID_DESC";
  public final static  String S_PayFeeType = "PAY_FEE_TYPE";
  public final static  String S_UserType = "USER_TYPE";
  public final static  String S_AreaCode = "AREA_CODE";
  public final static  String S_CustTypeDesc = "CUST_TYPE_DESC";
  public final static  String S_IsOutNet = "IS_OUT_NET";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OfferId = "OFFER_ID";
  public final static  String S_FirstUseDate = "FIRST_USE_DATE";
  public final static  String S_OfferName = "OFFER_NAME";
  public final static  String S_SubBillId = "SUB_BILL_ID";
  public final static  String S_ExpireDateType = "EXPIRE_DATE_TYPE";
  public final static  String S_NoticeFlag = "NOTICE_FLAG";
  public final static  String S_UserTypeDesc = "USER_TYPE_DESC";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OsStatus = "OS_STATUS";
  public final static  String S_CreditLevel = "CREDIT_LEVEL";
  public final static  String S_OrderName = "ORDER_NAME";
  public final static  String S_RiskFlag = "RISK_FLAG";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_OfferPlanGsm = "OFFER_PLAN_GSM";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_BrandId = "BRAND_ID";
  public final static  String S_OfferEffectiveDate = "OFFER_EFFECTIVE_DATE";
  public final static  String S_AddressDesc = "ADDRESS_DESC";
  public final static  String S_OweAmount = "OWE_AMOUNT";
  public final static  String S_EffectiveDateType = "EFFECTIVE_DATE_TYPE";
  public final static  String S_AreaId = "AREA_ID";
  public final static  String S_BalOrgId = "BAL_ORG_ID";
  public final static  String S_ContId = "CONT_ID";
  public final static  String S_OfferPlanGsmDesc = "OFFER_PLAN_GSM_DESC";
  public final static  String S_OfferDesc = "OFFER_DESC";
  public final static  String S_Password = "PASSWORD";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_ProdCatalogId = "PROD_CATALOG_ID";
  public final static  String S_CreditLevelDesc = "CREDIT_LEVEL_DESC";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_PasswordType = "PASSWORD_TYPE";


public String getStateDesc();

public String getState();

public Timestamp getDoneDate();

public String getAddressId();

public Timestamp getCreateDate();

public long getDoneCode();

public String getCustType();

public String getOfferType();

public long getOfferInstId();

public long getOpId();

public String getCountryCode();

public Timestamp getOfferExpireDate();

public String getRiskFlagDesc();

public long getUserId();

public String getOsStatusDesc();

public long getCreateOpId();

public String getNoticeFlagDesc();

public String getBrandIdDesc();

public String getPayFeeType();

public long getUserType();

public String getAreaCode();

public String getCustTypeDesc();

public long getIsOutNet();

public Timestamp getExpireDate();

public long getOfferId();

public Timestamp getFirstUseDate();

public String getOfferName();

public String getSubBillId();

public long getExpireDateType();

public long getNoticeFlag();

public String getUserTypeDesc();

public long getCustId();

public Timestamp getEffectiveDate();

public String getOsStatus();

public long getCreditLevel();

public String getOrderName();

public long getRiskFlag();

public String getRemarks();

public long getOfferPlanGsm();

public String getRegionId();

public long getBrandId();

public Timestamp getOfferEffectiveDate();

public String getAddressDesc();

public long getOweAmount();

public long getEffectiveDateType();

public long getAreaId();

public long getBalOrgId();

public long getContId();

public String getOfferPlanGsmDesc();

public String getOfferDesc();

public String getPassword();

public long getOrgId();

public long getProdCatalogId();

public String getCreditLevelDesc();

public long getCreateOrgId();

public String getBillId();

public long getPasswordType();


public  void setStateDesc(String value);

public  void setState(String value);

public  void setDoneDate(Timestamp value);

public  void setAddressId(String value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setCustType(String value);

public  void setOfferType(String value);

public  void setOfferInstId(long value);

public  void setOpId(long value);

public  void setCountryCode(String value);

public  void setOfferExpireDate(Timestamp value);

public  void setRiskFlagDesc(String value);

public  void setUserId(long value);

public  void setOsStatusDesc(String value);

public  void setCreateOpId(long value);

public  void setNoticeFlagDesc(String value);

public  void setBrandIdDesc(String value);

public  void setPayFeeType(String value);

public  void setUserType(long value);

public  void setAreaCode(String value);

public  void setCustTypeDesc(String value);

public  void setIsOutNet(long value);

public  void setExpireDate(Timestamp value);

public  void setOfferId(long value);

public  void setFirstUseDate(Timestamp value);

public  void setOfferName(String value);

public  void setSubBillId(String value);

public  void setExpireDateType(long value);

public  void setNoticeFlag(long value);

public  void setUserTypeDesc(String value);

public  void setCustId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setOsStatus(String value);

public  void setCreditLevel(long value);

public  void setOrderName(String value);

public  void setRiskFlag(long value);

public  void setRemarks(String value);

public  void setOfferPlanGsm(long value);

public  void setRegionId(String value);

public  void setBrandId(long value);

public  void setOfferEffectiveDate(Timestamp value);

public  void setAddressDesc(String value);

public  void setOweAmount(long value);

public  void setEffectiveDateType(long value);

public  void setAreaId(long value);

public  void setBalOrgId(long value);

public  void setContId(long value);

public  void setOfferPlanGsmDesc(String value);

public  void setOfferDesc(String value);

public  void setPassword(String value);

public  void setOrgId(long value);

public  void setProdCatalogId(long value);

public  void setCreditLevelDesc(String value);

public  void setCreateOrgId(long value);

public  void setBillId(String value);

public  void setPasswordType(long value);
}
