package com.asiainfo.crm.cm.inner.club.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmClubServiceVdoingValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DimensionType = "DIMENSION_TYPE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_DefaultTimes = "DEFAULT_TIMES";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_DimensionWeight = "DIMENSION_WEIGHT";
  public final static  String S_DimensionId = "DIMENSION_ID";
  public final static  String S_ServiceId = "SERVICE_ID";


public String getState();

public long getCreateOpId();

public int getDimensionType();

public Timestamp getEffectiveDate();

public Timestamp getDoneDate();

public String getRemarks();

public long getOrgId();

public Timestamp getCreateDate();

public long getDoneCode();

public int getDefaultTimes();

public String getRegionId();

public Timestamp getExpireDate();

public long getOpId();

public long getCreateOrgId();

public int getDimensionWeight();

public long getDimensionId();

public long getServiceId();


public  void setState(String value);

public  void setCreateOpId(long value);

public  void setDimensionType(int value);

public  void setEffectiveDate(Timestamp value);

public  void setDoneDate(Timestamp value);

public  void setRemarks(String value);

public  void setOrgId(long value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setDefaultTimes(int value);

public  void setRegionId(String value);

public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setCreateOrgId(long value);

public  void setDimensionWeight(int value);

public  void setDimensionId(long value);

public  void setServiceId(long value);
}
