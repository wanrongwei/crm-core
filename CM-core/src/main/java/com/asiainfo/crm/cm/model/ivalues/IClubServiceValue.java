package com.asiainfo.crm.cm.model.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IClubServiceValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_ServiceType = "SERVICE_TYPE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_TimesStrategy = "TIMES_STRATEGY";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_ValueType = "VALUE_TYPE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_IsCycleLimited = "IS_CYCLE_LIMITED";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_ValueAmount = "VALUE_AMOUNT";
  public final static  String S_ServiceName = "SERVICE_NAME";
  public final static  String S_ServiceId = "SERVICE_ID";
  public final static  String S_ClubId = "CLUB_ID";


public String getState();

public int getServiceType();

public long getCreateOpId();

public Timestamp getEffectiveDate();

public int getTimesStrategy();

public Timestamp getDoneDate();

public long getOrgId();

public String getRemarks();

public Timestamp getCreateDate();

public int getValueType();

public long getDoneCode();

public Timestamp getExpireDate();

public int getIsCycleLimited();

public long getOpId();

public String getRegionId();

public long getCreateOrgId();

public long getValueAmount();

public String getServiceName();

public long getServiceId();

public long getClubId();


public  void setState(String value);

public  void setServiceType(int value);

public  void setCreateOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setTimesStrategy(int value);

public  void setDoneDate(Timestamp value);

public  void setOrgId(long value);

public  void setRemarks(String value);

public  void setCreateDate(Timestamp value);

public  void setValueType(int value);

public  void setDoneCode(long value);

public  void setExpireDate(Timestamp value);

public  void setIsCycleLimited(int value);

public  void setOpId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setValueAmount(long value);

public  void setServiceName(String value);

public  void setServiceId(long value);

public  void setClubId(long value);
}
