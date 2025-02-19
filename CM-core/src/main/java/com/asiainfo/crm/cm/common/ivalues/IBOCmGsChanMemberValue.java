package com.asiainfo.crm.cm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmGsChanMemberValue extends DataStructInterface{

  public final static  String S_WorkArea = "WORK_AREA";
  public final static  String S_State = "STATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_Headship = "HEADSHIP";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_GraduateDate = "GRADUATE_DATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_TeamName = "TEAM_NAME";
  public final static  String S_MemberId = "MEMBER_ID";
  public final static  String S_IsPrincipal = "IS_PRINCIPAL";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_AuditSts = "AUDIT_STS";
  public final static  String S_MemberName = "MEMBER_NAME";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_MemberPhone = "MEMBER_PHONE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_Salariat = "SALARIAT";
  public final static  String S_MemberGender = "MEMBER_GENDER";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_TeamId = "TEAM_ID";
  public final static  String S_AuditId = "AUDIT_ID";
  public final static  String S_WorkType = "WORK_TYPE";
  public final static  String S_AuditNote = "AUDIT_NOTE";
  public final static  String S_OperType = "OPER_TYPE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_SchoolId = "SCHOOL_ID";
  public final static  String S_MemberDegree = "MEMBER_DEGREE";


public String getWorkArea();

public String getState();

public Timestamp getEffectiveDate();

public String getHeadship();

public Timestamp getDoneDate();

public Timestamp getGraduateDate();

public String getRemarks();

public String getTeamName();

public long getMemberId();

public int getIsPrincipal();

public Timestamp getCreateDate();

public int getAuditSts();

public String getMemberName();

public long getDoneCode();

public String getMemberPhone();

public long getOpId();

public String getRegionId();

public long getCreateOpId();

public String getSalariat();

public int getMemberGender();

public long getOrgId();

public long getTeamId();

public long getAuditId();

public int getWorkType();

public String getAuditNote();

public int getOperType();

public Timestamp getExpireDate();

public long getCreateOrgId();

public long getSchoolId();

public int getMemberDegree();


public  void setWorkArea(String value);

public  void setState(String value);

public  void setEffectiveDate(Timestamp value);

public  void setHeadship(String value);

public  void setDoneDate(Timestamp value);

public  void setGraduateDate(Timestamp value);

public  void setRemarks(String value);

public  void setTeamName(String value);

public  void setMemberId(long value);

public  void setIsPrincipal(int value);

public  void setCreateDate(Timestamp value);

public  void setAuditSts(int value);

public  void setMemberName(String value);

public  void setDoneCode(long value);

public  void setMemberPhone(String value);

public  void setOpId(long value);

public  void setRegionId(String value);

public  void setCreateOpId(long value);

public  void setSalariat(String value);

public  void setMemberGender(int value);

public  void setOrgId(long value);

public  void setTeamId(long value);

public  void setAuditId(long value);

public  void setWorkType(int value);

public  void setAuditNote(String value);

public  void setOperType(int value);

public  void setExpireDate(Timestamp value);

public  void setCreateOrgId(long value);

public  void setSchoolId(long value);

public  void setMemberDegree(int value);
}
