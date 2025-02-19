package com.asiainfo.crm.cm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmGsScheduleInfoValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_SchoolAreaCode = "SCHOOL_AREA_CODE";
  public final static  String S_AuditSts = "AUDIT_STS";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_AuditId = "AUDIT_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_AuditNote = "AUDIT_NOTE";
  public final static  String S_PromoteType = "PROMOTE_TYPE";
  public final static  String S_OperType = "OPER_TYPE";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_SchoolId = "SCHOOL_ID";
  public final static  String S_PhoneId = "PHONE_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_IsFreshman = "IS_FRESHMAN";
  public final static  String S_InstId = "INST_ID";


public String getState();

public long getCreateOpId();

public Timestamp getEffectiveDate();

public Timestamp getDoneDate();

public String getRemarks();

public long getOrgId();

public String getSchoolAreaCode();

public int getAuditSts();

public Timestamp getCreateDate();

public long getAuditId();

public long getDoneCode();

public String getAuditNote();

public int getPromoteType();

public int getOperType();

public String getRegionId();

public long getOpId();

public Timestamp getExpireDate();

public long getSchoolId();

public String getPhoneId();

public long getCreateOrgId();

public int getIsFreshman();

public long getInstId();


public  void setState(String value);

public  void setCreateOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setDoneDate(Timestamp value);

public  void setRemarks(String value);

public  void setOrgId(long value);

public  void setSchoolAreaCode(String value);

public  void setAuditSts(int value);

public  void setCreateDate(Timestamp value);

public  void setAuditId(long value);

public  void setDoneCode(long value);

public  void setAuditNote(String value);

public  void setPromoteType(int value);

public  void setOperType(int value);

public  void setRegionId(String value);

public  void setOpId(long value);

public  void setExpireDate(Timestamp value);

public  void setSchoolId(long value);

public  void setPhoneId(String value);

public  void setCreateOrgId(long value);

public  void setIsFreshman(int value);

public  void setInstId(long value);
}
