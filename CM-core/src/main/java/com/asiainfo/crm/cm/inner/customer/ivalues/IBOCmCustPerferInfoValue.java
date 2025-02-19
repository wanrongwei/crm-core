package com.asiainfo.crm.cm.inner.customer.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmCustPerferInfoValue extends DataStructInterface{

  public final static  String S_ChannelDoneCode = "CHANNEL_DONE_CODE";
  public final static  String S_TimeBeginUnit = "TIME_BEGIN_UNIT";
  public final static  String S_State = "STATE";
  public final static  String S_TimeBeginAttr = "TIME_BEGIN_ATTR";
  public final static  String S_ChannelCreateOrgId = "CHANNEL_CREATE_ORG_ID";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_PreferChannelId = "PREFER_CHANNEL_ID";
  public final static  String S_ChannelCreateOpId = "CHANNEL_CREATE_OP_ID";
  public final static  String S_PreferPeriodId = "PREFER_PERIOD_ID";
  public final static  String S_ChannelRegionId = "CHANNEL_REGION_ID";
  public final static  String S_PreferChannelName = "PREFER_CHANNEL_NAME";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_ChannelDoneDate = "CHANNEL_DONE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_Action = "ACTION";
  public final static  String S_TimeType = "TIME_TYPE";
  public final static  String S_ChannelEffectiveDate = "CHANNEL_EFFECTIVE_DATE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_TimeEndAttr = "TIME_END_ATTR";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_UpPreferPeriodId = "UP_PREFER_PERIOD_ID";
  public final static  String S_ChannelRemarks = "CHANNEL_REMARKS";
  public final static  String S_ChannelExpireDate = "CHANNEL_EXPIRE_DATE";
  public final static  String S_ChannelCreateDate = "CHANNEL_CREATE_DATE";
  public final static  String S_ChannelOrgId = "CHANNEL_ORG_ID";
  public final static  String S_ChannelState = "CHANNEL_STATE";
  public final static  String S_CustContRelaId = "CUST_CONT_RELA_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_PerferType = "PERFER_TYPE";
  public final static  String S_ChannelOpId = "CHANNEL_OP_ID";
  public final static  String S_TimeEndUnit = "TIME_END_UNIT";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_Prior = "PRIOR";


public long getChannelDoneCode();

public int getTimeBeginUnit();

public String getState();

public String getTimeBeginAttr();

public long getChannelCreateOrgId();

public String getRemarks();

public long getPreferChannelId();

public long getChannelCreateOpId();

public long getPreferPeriodId();

public String getChannelRegionId();

public String getPreferChannelName();

public long getCustId();

public long getCreateOpId();

public Timestamp getChannelDoneDate();

public long getDoneCode();

public String getAction();

public long getTimeType();

public Timestamp getChannelEffectiveDate();

public Timestamp getExpireDate();

public String getTimeEndAttr();

public Timestamp getEffectiveDate();

public long getOpId();

public long getUpPreferPeriodId();

public String getChannelRemarks();

public Timestamp getChannelExpireDate();

public Timestamp getChannelCreateDate();

public long getChannelOrgId();

public String getChannelState();

public long getCustContRelaId();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public int getPerferType();

public long getChannelOpId();

public int getTimeEndUnit();

public Timestamp getDoneDate();

public Timestamp getCreateDate();

public int getPrior();


public  void setChannelDoneCode(long value);

public  void setTimeBeginUnit(int value);

public  void setState(String value);

public  void setTimeBeginAttr(String value);

public  void setChannelCreateOrgId(long value);

public  void setRemarks(String value);

public  void setPreferChannelId(long value);

public  void setChannelCreateOpId(long value);

public  void setPreferPeriodId(long value);

public  void setChannelRegionId(String value);

public  void setPreferChannelName(String value);

public  void setCustId(long value);

public  void setCreateOpId(long value);

public  void setChannelDoneDate(Timestamp value);

public  void setDoneCode(long value);

public  void setAction(String value);

public  void setTimeType(long value);

public  void setChannelEffectiveDate(Timestamp value);

public  void setExpireDate(Timestamp value);

public  void setTimeEndAttr(String value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setUpPreferPeriodId(long value);

public  void setChannelRemarks(String value);

public  void setChannelExpireDate(Timestamp value);

public  void setChannelCreateDate(Timestamp value);

public  void setChannelOrgId(long value);

public  void setChannelState(String value);

public  void setCustContRelaId(long value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setPerferType(int value);

public  void setChannelOpId(long value);

public  void setTimeEndUnit(int value);

public  void setDoneDate(Timestamp value);

public  void setCreateDate(Timestamp value);

public  void setPrior(int value);
}
