package com.asiainfo.crm.cm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmGsTchrInfoValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_Headship = "HEADSHIP";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_AuditSts = "AUDIT_STS";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_TchrId = "TCHR_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_Brand = "BRAND";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_Dept = "DEPT";
  public final static  String S_AuditId = "AUDIT_ID";
  public final static  String S_AuditNote = "AUDIT_NOTE";
  public final static  String S_IsCounselor = "IS_COUNSELOR";
  public final static  String S_OperType = "OPER_TYPE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_PhoneId = "PHONE_ID";
  public final static  String S_SchoolId = "SCHOOL_ID";
  public final static  String S_Gender = "GENDER";
  public final static  String S_Name = "NAME";


public String getState();

public Timestamp getEffectiveDate();

public String getHeadship();

public Timestamp getDoneDate();

public String getRemarks();

public Timestamp getCreateDate();

public int getAuditSts();

public long getDoneCode();

public long getOpId();

public String getRegionId();

public long getTchrId();

public long getCreateOpId();

public int getBrand();

public long getOrgId();

public String getDept();

public long getAuditId();

public String getAuditNote();

public int getIsCounselor();

public int getOperType();

public Timestamp getExpireDate();

public long getCreateOrgId();

public String getPhoneId();

public long getSchoolId();

public int getGender();

public String getName();


public  void setState(String value);

public  void setEffectiveDate(Timestamp value);

public  void setHeadship(String value);

public  void setDoneDate(Timestamp value);

public  void setRemarks(String value);

public  void setCreateDate(Timestamp value);

public  void setAuditSts(int value);

public  void setDoneCode(long value);

public  void setOpId(long value);

public  void setRegionId(String value);

public  void setTchrId(long value);

public  void setCreateOpId(long value);

public  void setBrand(int value);

public  void setOrgId(long value);

public  void setDept(String value);

public  void setAuditId(long value);

public  void setAuditNote(String value);

public  void setIsCounselor(int value);

public  void setOperType(int value);

public  void setExpireDate(Timestamp value);

public  void setCreateOrgId(long value);

public  void setPhoneId(String value);

public  void setSchoolId(long value);

public  void setGender(int value);

public  void setName(String value);
}
