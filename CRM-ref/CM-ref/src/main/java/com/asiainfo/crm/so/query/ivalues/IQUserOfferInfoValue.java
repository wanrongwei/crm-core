package com.asiainfo.crm.so.query.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IQUserOfferInfoValue extends DataStructInterface{

  public final static  String S_SrcSystemType = "SRC_SYSTEM_TYPE";
  public final static  String S_RelatType = "RELAT_TYPE";
  public final static  String S_CountyCode = "COUNTY_CODE";
  public final static  String S_OsReason = "OS_REASON";
  public final static  String S_ContId = "CONT_ID";
  public final static  String S_AreaCode = "AREA_CODE";
  public final static  String S_IsOutNet = "IS_OUT_NET";
  public final static  String S_AStopDate = "A_STOP_DATE";
  public final static  String S_ExpireProcessType = "EXPIRE_PROCESS_TYPE";
  public final static  String S_SubBillId = "SUB_BILL_ID";
  public final static  String S_ChannelType = "CHANNEL_TYPE";
  public final static  String S_BalOrgId = "BAL_ORG_ID";
  public final static  String S_ProdCatalogId = "PROD_CATALOG_ID";
  public final static  String S_PasswordType = "PASSWORD_TYPE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";

  public final static  String S_CountryCode = "COUNTRY_CODE";
  public final static  String S_AddressDesc = "ADDRESS_DESC";
  public final static  String S_CustType = "CUST_TYPE";
  public final static  String S_RStopDate = "R_STOP_DATE";
  public final static  String S_MStopDate = "M_STOP_DATE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_ActiveDate = "ACTIVE_DATE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_ExchangeId = "EXCHANGE_ID";
  public final static  String S_NoticeFlag = "NOTICE_FLAG";
  public final static  String S_SalePartyRoleId = "SALE_PARTY_ROLE_ID";
  public final static  String S_AddressId = "ADDRESS_ID";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_AreaId = "AREA_ID";
  public final static  String S_EffectiveDateType = "EFFECTIVE_DATE_TYPE";
  public final static  String S_FirstUseDate = "FIRST_USE_DATE";
  public final static  String S_OweAmount = "OWE_AMOUNT";
  public final static  String S_OldOfferId = "OLD_OFFER_ID";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_PreDestoryTime = "PRE_DESTORY_TIME";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_BStopDate = "B_STOP_DATE";
  public final static  String S_Password = "PASSWORD";
  public final static  String S_OfferType = "OFFER_TYPE";
  public final static  String S_CreditLevel = "CREDIT_LEVEL";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_SaleType = "SALE_TYPE";
  public final static  String S_OsStatus = "OS_STATUS";
  public final static  String S_BrandId = "BRAND_ID";
  public final static  String S_State = "STATE";
  public final static  String S_OsStatusPre = "OS_STATUS_PRE";
  public final static  String S_OStopDate = "O_STOP_DATE";
  public final static  String S_UserType = "USER_TYPE";
  public final static  String S_OrderName = "ORDER_NAME";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_LastTransDate = "LAST_TRANS_DATE";
  public final static  String S_OfferId = "OFFER_ID";
  public final static  String S_RiskFlag = "RISK_FLAG";
  public final static  String S_ExpireDateType = "EXPIRE_DATE_TYPE";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_OfferInstId = "OFFER_INST_ID";


public String getState();
  
public int getSrcSystemType();

public String getRelatType();

public String getCountyCode();

public int getOsReason();

public long getContId();

public String getAreaCode();

public int getIsOutNet();

public Timestamp getAStopDate();

public int getExpireProcessType();

public String getSubBillId();

public long getChannelType();

public long getBalOrgId();

public long getProdCatalogId();

public int getPasswordType();

public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public long getOpId();



public String getCountryCode();

public String getAddressDesc();

public String getCustType();

public Timestamp getRStopDate();

public Timestamp getMStopDate();

public Timestamp getDoneDate();

public Timestamp getActiveDate();

public Timestamp getCreateDate();

public String getExchangeId();

public int getNoticeFlag();

public long getSalePartyRoleId();

public long getAddressId();

public String getRemarks();

public long getAreaId();

public int getEffectiveDateType();

public Timestamp getFirstUseDate();

public long getOweAmount();

public long getOldOfferId();

public long getCustId();

public long getCreateOpId();

public Timestamp getPreDestoryTime();

public long getDoneCode();

public Timestamp getBStopDate();

public String getPassword();

public String getOfferType();

public int getCreditLevel();

public long getUserId();

public int getSaleType();

public String getOsStatus();

public long getBrandId();

public String getOsStatusPre();

public Timestamp getOStopDate();

public int getUserType();

public String getOrderName();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public Timestamp getLastTransDate();

public long getOfferId();

public int getRiskFlag();

public int getExpireDateType();

public String getBillId();

public long getOfferInstId();


public  void setState(String value);

public  void setSrcSystemType(int value);

public  void setRelatType(String value);

public  void setCountyCode(String value);

public  void setOsReason(int value);

public  void setContId(long value);

public  void setAreaCode(String value);

public  void setIsOutNet(int value);

public  void setAStopDate(Timestamp value);

public  void setExpireProcessType(int value);

public  void setSubBillId(String value);

public  void setChannelType(long value);

public  void setBalOrgId(long value);

public  void setProdCatalogId(long value);

public  void setPasswordType(int value);

public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);


public  void setCountryCode(String value);

public  void setAddressDesc(String value);

public  void setCustType(String value);

public  void setRStopDate(Timestamp value);

public  void setMStopDate(Timestamp value);

public  void setDoneDate(Timestamp value);

public  void setActiveDate(Timestamp value);

public  void setCreateDate(Timestamp value);

public  void setExchangeId(String value);

public  void setNoticeFlag(int value);

public  void setSalePartyRoleId(long value);

public  void setAddressId(long value);

public  void setRemarks(String value);

public  void setAreaId(long value);

public  void setEffectiveDateType(int value);

public  void setFirstUseDate(Timestamp value);

public  void setOweAmount(long value);

public  void setOldOfferId(long value);

public  void setCustId(long value);

public  void setCreateOpId(long value);

public  void setPreDestoryTime(Timestamp value);

public  void setDoneCode(long value);

public  void setBStopDate(Timestamp value);

public  void setPassword(String value);

public  void setOfferType(String value);

public  void setCreditLevel(int value);

public  void setUserId(long value);

public  void setSaleType(int value);

public  void setOsStatus(String value);

public  void setBrandId(long value);

public  void setOsStatusPre(String value);

public  void setOStopDate(Timestamp value);

public  void setUserType(int value);

public  void setOrderName(String value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setLastTransDate(Timestamp value);

public  void setOfferId(long value);

public  void setRiskFlag(int value);

public  void setExpireDateType(int value);

public  void setBillId(String value);

public  void setOfferInstId(long value);
}
