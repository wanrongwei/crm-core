package com.asiainfo.crm.so.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOUserInfoValue extends DataStructInterface{

  public final static  String S_RegionName = "REGION_NAME";
  public final static  String S_AccessDate = "ACCESS_DATE";
  public final static  String S_UserStateName = "USER_STATE_NAME";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_ChannelName = "CHANNEL_NAME";
  public final static  String S_UserType = "USER_TYPE";
  public final static  String S_IccId = "ICC_ID";
  public final static  String S_BrandName = "BRAND_NAME";
  public final static  String S_OfferInstId = "OFFER_INST_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_UserTypeName = "USER_TYPE_NAME";
  public final static  String S_BrandId = "BRAND_ID";
  public final static  String S_OfferId = "OFFER_ID";
  public final static  String S_UserState = "USER_STATE";
  public final static  String S_OfferName = "OFFER_NAME";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_StopOpenName = "STOP_OPEN_NAME";
  public final static  String S_ChannelType = "CHANNEL_TYPE";
  public final static  String S_StopOpen = "STOP_OPEN";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_MzoneAbFlag = "MZONE_AB_FLAG";
  public final static  String S_CustId = "CUST_ID";


public String getRegionName();

public Timestamp getAccessDate();

public String getUserStateName();

public long getAcctId();

public String getChannelName();

public String getUserType();

public String getIccId();

public String getBrandName();

public long getOfferInstId();

public String getRegionId();

public String getUserTypeName();

public long getBrandId();

public long getOfferId();

public String getUserState();

public String getOfferName();

public long getUserId();

public String getStopOpenName();

public int getChannelType();

public int getStopOpen();

public String getBillId();

public String getMzoneAbFlag();

public long getCustId();


public  void setRegionName(String value);

public  void setAccessDate(Timestamp value);

public  void setUserStateName(String value);

public  void setAcctId(long value);

public  void setChannelName(String value);

public  void setUserType(String value);

public  void setIccId(String value);

public  void setBrandName(String value);

public  void setOfferInstId(long value);

public  void setRegionId(String value);

public  void setUserTypeName(String value);

public  void setBrandId(long value);

public  void setOfferId(long value);

public  void setUserState(String value);

public  void setOfferName(String value);

public  void setUserId(long value);

public  void setStopOpenName(String value);

public  void setChannelType(int value);

public  void setStopOpen(int value);

public  void setBillId(String value);

public  void setMzoneAbFlag(String value);

public  void setCustId(long value);
}
