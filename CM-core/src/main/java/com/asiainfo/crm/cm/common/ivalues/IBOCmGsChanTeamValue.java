package com.asiainfo.crm.cm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmGsChanTeamValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_TeamName = "TEAM_NAME";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_AuditSts = "AUDIT_STS";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_TeamNum = "TEAM_NUM";
  public final static  String S_HeaderPhone = "HEADER_PHONE";
  public final static  String S_CountyCode = "COUNTY_CODE";
  public final static  String S_HeaderNam = "HEADER_NAM";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_Pricipal = "PRICIPAL";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_RegionCode = "REGION_CODE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_AuditId = "AUDIT_ID";
  public final static  String S_TeamId = "TEAM_ID";
  public final static  String S_AuditNote = "AUDIT_NOTE";
  public final static  String S_OperType = "OPER_TYPE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_SchoolId = "SCHOOL_ID";


public String getState();

public Timestamp getEffectiveDate();

public Timestamp getDoneDate();

public String getRemarks();

public String getTeamName();

public Timestamp getCreateDate();

public int getAuditSts();

public long getDoneCode();

public long getTeamNum();

public String getHeaderPhone();

public String getCountyCode();

public String getHeaderNam();

public long getOpId();

public String getRegionId();

public String getPricipal();

public long getCreateOpId();

public String getRegionCode();

public long getOrgId();

public long getAuditId();

public long getTeamId();

public String getAuditNote();

public int getOperType();

public Timestamp getExpireDate();

public long getCreateOrgId();

public long getSchoolId();


public  void setState(String value);

public  void setEffectiveDate(Timestamp value);

public  void setDoneDate(Timestamp value);

public  void setRemarks(String value);

public  void setTeamName(String value);

public  void setCreateDate(Timestamp value);

public  void setAuditSts(int value);

public  void setDoneCode(long value);

public  void setTeamNum(long value);

public  void setHeaderPhone(String value);

public  void setCountyCode(String value);

public  void setHeaderNam(String value);

public  void setOpId(long value);

public  void setRegionId(String value);

public  void setPricipal(String value);

public  void setCreateOpId(long value);

public  void setRegionCode(String value);

public  void setOrgId(long value);

public  void setAuditId(long value);

public  void setTeamId(long value);

public  void setAuditNote(String value);

public  void setOperType(int value);

public  void setExpireDate(Timestamp value);

public  void setCreateOrgId(long value);

public  void setSchoolId(long value);
}
