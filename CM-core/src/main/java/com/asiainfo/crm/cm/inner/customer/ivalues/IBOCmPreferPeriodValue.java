package com.asiainfo.crm.cm.inner.customer.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmPreferPeriodValue extends DataStructInterface{

  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_TimeBeginUnit = "TIME_BEGIN_UNIT";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_UpPreferPeriodId = "UP_PREFER_PERIOD_ID";
  public final static  String S_State = "STATE";
  public final static  String S_PreferChannelId = "PREFER_CHANNEL_ID";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_PreferPeriodId = "PREFER_PERIOD_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_TimeEndUnit = "TIME_END_UNIT";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_TimeType = "TIME_TYPE";


public Timestamp getExpireDate();

public long getTimeBeginUnit();

public Timestamp getEffectiveDate();

public long getOpId();

public long getUpPreferPeriodId();

public String getState();

public long getPreferChannelId();

public String getRemarks();

public long getPreferPeriodId();

public long getOrgId();

public long getCreateOrgId();

public String getRegionId();

public long getCreateOpId();

public long getTimeEndUnit();

public Timestamp getDoneDate();

public Timestamp getCreateDate();

public long getDoneCode();

public long getTimeType();


public  void setExpireDate(Timestamp value);

public  void setTimeBeginUnit(long value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setUpPreferPeriodId(long value);

public  void setState(String value);

public  void setPreferChannelId(long value);

public  void setRemarks(String value);

public  void setPreferPeriodId(long value);

public  void setOrgId(long value);

public  void setCreateOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOpId(long value);

public  void setTimeEndUnit(long value);

public  void setDoneDate(Timestamp value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setTimeType(long value);
}
