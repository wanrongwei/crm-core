package com.asiainfo.crm.cm.puremobile.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmInsOfferinstRelValue extends DataStructInterface{

  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_CmrelId = "CMREL_ID";
  public final static  String S_OfferId = "OFFER_ID";
  public final static  String S_State = "STATE";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_SubType = "SUB_TYPE";
  public final static  String S_PricingOfferId = "PRICING_OFFER_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_OfferInstId = "OFFER_INST_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_UserRegionCode = "USER_REGION_CODE";


public Timestamp getEffectiveDate();

public long getCustId();

public Timestamp getDoneDate();

public long getOrgId();

public long getDoneCode();

public long getOpId();

public long getCmrelId();

public long getOfferId();

public long getState();

public long getUserId();

public String getSubType();

public long getPricingOfferId();

public Timestamp getCreateDate();

public long getOfferInstId();

public Timestamp getExpireDate();

public String getUserRegionCode();


public  void setEffectiveDate(Timestamp value);

public  void setCustId(long value);

public  void setDoneDate(Timestamp value);

public  void setOrgId(long value);

public  void setDoneCode(long value);

public  void setOpId(long value);

public  void setCmrelId(long value);

public  void setOfferId(long value);

public  void setState(long value);

public  void setUserId(long value);

public  void setSubType(String value);

public  void setPricingOfferId(long value);

public  void setCreateDate(Timestamp value);

public  void setOfferInstId(long value);

public  void setExpireDate(Timestamp value);

public  void setUserRegionCode(String value);
}
