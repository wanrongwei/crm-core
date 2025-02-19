package com.asiainfo.crm.cm.inner.club.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmxClubServiceRecValue extends DataStructInterface{

  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_State = "STATE";
  public final static  String S_TrainAirportName = "TRAIN_AIRPORT_NAME";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_ServiceId = "SERVICE_ID";
  public final static  String S_BelongCity = "BELONG_CITY";
  public final static  String S_ClassesNo = "CLASSES_NO";
  public final static  String S_MemberId = "MEMBER_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_RecordId = "RECORD_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";


public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public long getOpId();

public String getState();

public String getTrainAirportName();

public String getRemarks();

public long getServiceId();

public String getBelongCity();

public String getClassesNo();

public long getMemberId();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public long getRecordId();

public long getCreateOpId();

public Timestamp getDoneDate();

public Timestamp getCreateDate();

public long getDoneCode();


public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setState(String value);

public  void setTrainAirportName(String value);

public  void setRemarks(String value);

public  void setServiceId(long value);

public  void setBelongCity(String value);

public  void setClassesNo(String value);

public  void setMemberId(long value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setRecordId(long value);

public  void setCreateOpId(long value);

public  void setDoneDate(Timestamp value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);
}
