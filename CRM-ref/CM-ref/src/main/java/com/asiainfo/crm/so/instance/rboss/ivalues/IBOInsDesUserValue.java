package com.asiainfo.crm.so.instance.rboss.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOInsDesUserValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_CreditLevel = "CREDIT_LEVEL";
  public final static  String S_AddressId = "ADDRESS_ID";
  public final static  String S_LastTransDate = "LAST_TRANS_DATE";
  public final static  String S_RiskFlag = "RISK_FLAG";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_ActiveDate = "ACTIVE_DATE";
  public final static  String S_CustType = "CUST_TYPE";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_PreDestoryTime = "PRE_DESTORY_TIME";
  public final static  String S_CountryCode = "COUNTRY_CODE";
  public final static  String S_ExchangeId = "EXCHANGE_ID";
  public final static  String S_AddressDesc = "ADDRESS_DESC";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_OweAmount = "OWE_AMOUNT";
  public final static  String S_EffectiveDateType = "EFFECTIVE_DATE_TYPE";
  public final static  String S_BalOrgId = "BAL_ORG_ID";
  public final static  String S_AreaId = "AREA_ID";
  public final static  String S_ContId = "CONT_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_Password = "PASSWORD";
  public final static  String S_UserType = "USER_TYPE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_ProdCatalogId = "PROD_CATALOG_ID";
  public final static  String S_AreaCode = "AREA_CODE";
  public final static  String S_IsOutNet = "IS_OUT_NET";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_FirstUseDate = "FIRST_USE_DATE";
  public final static  String S_SubBillId = "SUB_BILL_ID";
  public final static  String S_ExpireDateType = "EXPIRE_DATE_TYPE";
  public final static  String S_PasswordType = "PASSWORD_TYPE";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_NoticeFlag = "NOTICE_FLAG";
  public final static  String S_CustId = "CUST_ID";


public String getState();

public Timestamp getEffectiveDate();

public Timestamp getDoneDate();

public int getCreditLevel();

public long getAddressId();

public Timestamp getLastTransDate();

public int getRiskFlag();

public String getRemarks();

public Timestamp getCreateDate();

public long getDoneCode();

public Timestamp getActiveDate();

public String getCustType();

public String getRegionId();

public long getOpId();

public Timestamp getPreDestoryTime();

public String getCountryCode();

public String getExchangeId();

public String getAddressDesc();

public long getUserId();

public long getOweAmount();

public int getEffectiveDateType();

public long getBalOrgId();

public long getAreaId();

public long getContId();

public long getCreateOpId();

public String getPassword();

public int getUserType();

public long getOrgId();

public long getProdCatalogId();

public String getAreaCode();

public int getIsOutNet();

public Timestamp getExpireDate();

public long getCreateOrgId();

public Timestamp getFirstUseDate();

public String getSubBillId();

public int getExpireDateType();

public int getPasswordType();

public String getBillId();

public int getNoticeFlag();

public long getCustId();


public  void setState(String value);

public  void setEffectiveDate(Timestamp value);

public  void setDoneDate(Timestamp value);

public  void setCreditLevel(int value);

public  void setAddressId(long value);

public  void setLastTransDate(Timestamp value);

public  void setRiskFlag(int value);

public  void setRemarks(String value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setActiveDate(Timestamp value);

public  void setCustType(String value);

public  void setRegionId(String value);

public  void setOpId(long value);

public  void setPreDestoryTime(Timestamp value);

public  void setCountryCode(String value);

public  void setExchangeId(String value);

public  void setAddressDesc(String value);

public  void setUserId(long value);

public  void setOweAmount(long value);

public  void setEffectiveDateType(int value);

public  void setBalOrgId(long value);

public  void setAreaId(long value);

public  void setContId(long value);

public  void setCreateOpId(long value);

public  void setPassword(String value);

public  void setUserType(int value);

public  void setOrgId(long value);

public  void setProdCatalogId(long value);

public  void setAreaCode(String value);

public  void setIsOutNet(int value);

public  void setExpireDate(Timestamp value);

public  void setCreateOrgId(long value);

public  void setFirstUseDate(Timestamp value);

public  void setSubBillId(String value);

public  void setExpireDateType(int value);

public  void setPasswordType(int value);

public  void setBillId(String value);

public  void setNoticeFlag(int value);

public  void setCustId(long value);
}
