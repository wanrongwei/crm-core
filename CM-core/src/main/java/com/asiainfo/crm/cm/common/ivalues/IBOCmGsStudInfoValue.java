package com.asiainfo.crm.cm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmGsStudInfoValue extends DataStructInterface{

  public final static  String S_Degree = "DEGREE";
  public final static  String S_ClassName = "CLASS_NAME";
  public final static  String S_State = "STATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_AuditSts = "AUDIT_STS";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_IdCode = "ID_CODE";
  public final static  String S_Year = "YEAR";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_IdentifyMethod = "IDENTIFY_METHOD";
  public final static  String S_StudId = "STUD_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_Academy = "ACADEMY";
  public final static  String S_Brand = "BRAND";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_AuditId = "AUDIT_ID";
  public final static  String S_AuditNote = "AUDIT_NOTE";
  public final static  String S_OperType = "OPER_TYPE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_SchoolId = "SCHOOL_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_PhoneId = "PHONE_ID";
  public final static  String S_Gender = "GENDER";
  public final static  String S_HomeAddress = "HOME_ADDRESS";
  public final static  String S_Name = "NAME";


public int getDegree();

public String getClassName();

public String getState();

public Timestamp getEffectiveDate();

public Timestamp getDoneDate();

public String getRemarks();

public Timestamp getCreateDate();

public int getAuditSts();

public long getDoneCode();

public String getIdCode();

public String getYear();

public long getOpId();

public String getRegionId();

public int getIdentifyMethod();

public long getStudId();

public long getCreateOpId();

public String getAcademy();

public int getBrand();

public long getOrgId();

public long getAuditId();

public String getAuditNote();

public int getOperType();

public Timestamp getExpireDate();

public long getSchoolId();

public long getCreateOrgId();

public String getPhoneId();

public int getGender();

public String getHomeAddress();

public String getName();


public  void setDegree(int value);

public  void setClassName(String value);

public  void setState(String value);

public  void setEffectiveDate(Timestamp value);

public  void setDoneDate(Timestamp value);

public  void setRemarks(String value);

public  void setCreateDate(Timestamp value);

public  void setAuditSts(int value);

public  void setDoneCode(long value);

public  void setIdCode(String value);

public  void setYear(String value);

public  void setOpId(long value);

public  void setRegionId(String value);

public  void setIdentifyMethod(int value);

public  void setStudId(long value);

public  void setCreateOpId(long value);

public  void setAcademy(String value);

public  void setBrand(int value);

public  void setOrgId(long value);

public  void setAuditId(long value);

public  void setAuditNote(String value);

public  void setOperType(int value);

public  void setExpireDate(Timestamp value);

public  void setSchoolId(long value);

public  void setCreateOrgId(long value);

public  void setPhoneId(String value);

public  void setGender(int value);

public  void setHomeAddress(String value);

public  void setName(String value);
}
