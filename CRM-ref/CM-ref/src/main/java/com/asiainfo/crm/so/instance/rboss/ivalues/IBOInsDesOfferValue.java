package com.asiainfo.crm.so.instance.rboss.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOInsDesOfferValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_OldOfferId = "OLD_OFFER_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_SaleType = "SALE_TYPE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_OrderName = "ORDER_NAME";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_CustType = "CUST_TYPE";
  public final static  String S_OfferType = "OFFER_TYPE";
  public final static  String S_OfferInstId = "OFFER_INST_ID";
  public final static  String S_SrcSystemType = "SRC_SYSTEM_TYPE";
  public final static  String S_CountyCode = "COUNTY_CODE";
  public final static  String S_RelatType = "RELAT_TYPE";
  public final static  String S_ExpireProcessType = "EXPIRE_PROCESS_TYPE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_BrandId = "BRAND_ID";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_ChannelType = "CHANNEL_TYPE";
  public final static  String S_EffectiveDateType = "EFFECTIVE_DATE_TYPE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OfferId = "OFFER_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_ExpireDateType = "EXPIRE_DATE_TYPE";
  public final static  String S_SalePartyRoleId = "SALE_PARTY_ROLE_ID";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_OsState = "OS_STATE";


public int getState();

public long getOldOfferId();

public Timestamp getEffectiveDate();

public int getSaleType();

public Timestamp getDoneDate();

public String getOrderName();

public Timestamp getCreateDate();

public long getDoneCode();

public String getCustType();

public String getOfferType();

public long getOfferInstId();

public int getSrcSystemType();

public String getCountyCode();

public String getRelatType();

public int getExpireProcessType();

public long getOpId();

public String getRegionId();

public long getBrandId();

public long getUserId();

public int getChannelType();

public int getEffectiveDateType();

public long getCreateOpId();

public long getOrgId();

public Timestamp getExpireDate();

public long getOfferId();

public long getCreateOrgId();

public int getExpireDateType();

public long getSalePartyRoleId();

public long getCustId();
public String getOsState();


public  void setState(int value);

public  void setOldOfferId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setSaleType(int value);

public  void setDoneDate(Timestamp value);

public  void setOrderName(String value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setCustType(String value);

public  void setOfferType(String value);

public  void setOfferInstId(long value);

public  void setSrcSystemType(int value);

public  void setCountyCode(String value);

public  void setRelatType(String value);

public  void setExpireProcessType(int value);

public  void setOpId(long value);

public  void setRegionId(String value);

public  void setBrandId(long value);

public  void setUserId(long value);

public  void setChannelType(int value);

public  void setEffectiveDateType(int value);

public  void setCreateOpId(long value);

public  void setOrgId(long value);

public  void setExpireDate(Timestamp value);

public  void setOfferId(long value);

public  void setCreateOrgId(long value);

public  void setExpireDateType(int value);

public  void setSalePartyRoleId(long value);

public  void setCustId(long value);

public  void setOsState(String value);
}
