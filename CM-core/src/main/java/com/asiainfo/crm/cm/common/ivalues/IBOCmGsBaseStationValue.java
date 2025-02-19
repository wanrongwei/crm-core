package com.asiainfo.crm.cm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmGsBaseStationValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_AuditSts = "AUDIT_STS";
  public final static  String S_BaseCname = "BASE_CNAME";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_LacId = "LAC_ID";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_BaseName = "BASE_NAME";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_CoverSchools = "COVER_SCHOOLS";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_AuditId = "AUDIT_ID";
  public final static  String S_BaseStationId = "BASE_STATION_ID";
  public final static  String S_AuditNote = "AUDIT_NOTE";
  public final static  String S_CellId = "CELL_ID";
  public final static  String S_OperType = "OPER_TYPE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_BaseType = "BASE_TYPE";
  public final static  String S_GsmType = "GSM_TYPE";
  public final static  String S_SchoolId = "SCHOOL_ID";


public String getState();

public Timestamp getEffectiveDate();

public Timestamp getDoneDate();

public String getRemarks();

public Timestamp getCreateDate();

public int getAuditSts();

public String getBaseCname();

public long getDoneCode();

public String getLacId();

public long getOpId();

public String getRegionId();

public String getBaseName();

public long getCreateOpId();

public int getCoverSchools();

public long getOrgId();

public long getAuditId();

public long getBaseStationId();

public String getAuditNote();

public String getCellId();

public int getOperType();

public Timestamp getExpireDate();

public long getCreateOrgId();

public int getBaseType();

public int getGsmType();

public long getSchoolId();


public  void setState(String value);

public  void setEffectiveDate(Timestamp value);

public  void setDoneDate(Timestamp value);

public  void setRemarks(String value);

public  void setCreateDate(Timestamp value);

public  void setAuditSts(int value);

public  void setBaseCname(String value);

public  void setDoneCode(long value);

public  void setLacId(String value);

public  void setOpId(long value);

public  void setRegionId(String value);

public  void setBaseName(String value);

public  void setCreateOpId(long value);

public  void setCoverSchools(int value);

public  void setOrgId(long value);

public  void setAuditId(long value);

public  void setBaseStationId(long value);

public  void setAuditNote(String value);

public  void setCellId(String value);

public  void setOperType(int value);

public  void setExpireDate(Timestamp value);

public  void setCreateOrgId(long value);

public  void setBaseType(int value);

public  void setGsmType(int value);

public  void setSchoolId(long value);
}
