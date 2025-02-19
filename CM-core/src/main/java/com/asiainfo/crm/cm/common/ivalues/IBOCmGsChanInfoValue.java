package com.asiainfo.crm.cm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmGsChanInfoValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_SaleStationType = "SALE_STATION_TYPE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_SaleType = "SALE_TYPE";
  public final static  String S_RegionCode = "REGION_CODE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_SaleName = "SALE_NAME";
  public final static  String S_AuditSts = "AUDIT_STS";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_AuditId = "AUDIT_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_AuditNote = "AUDIT_NOTE";
  public final static  String S_SaleId = "SALE_ID";
  public final static  String S_CountyCode = "COUNTY_CODE";
  public final static  String S_OperType = "OPER_TYPE";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_SchoolId = "SCHOOL_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_SaleTypeId = "SALE_TYPE_ID";


public String getState();

public int getSaleStationType();

public long getCreateOpId();

public Timestamp getEffectiveDate();

public int getSaleType();

public String getRegionCode();

public Timestamp getDoneDate();

public String getRemarks();

public long getOrgId();

public String getSaleName();

public int getAuditSts();

public Timestamp getCreateDate();

public long getAuditId();

public long getDoneCode();

public String getAuditNote();

public long getSaleId();

public String getCountyCode();

public int getOperType();

public String getRegionId();

public Timestamp getExpireDate();

public long getOpId();

public long getSchoolId();

public long getCreateOrgId();

public int getSaleTypeId();


public  void setState(String value);

public  void setSaleStationType(int value);

public  void setCreateOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setSaleType(int value);

public  void setRegionCode(String value);

public  void setDoneDate(Timestamp value);

public  void setRemarks(String value);

public  void setOrgId(long value);

public  void setSaleName(String value);

public  void setAuditSts(int value);

public  void setCreateDate(Timestamp value);

public  void setAuditId(long value);

public  void setDoneCode(long value);

public  void setAuditNote(String value);

public  void setSaleId(long value);

public  void setCountyCode(String value);

public  void setOperType(int value);

public  void setRegionId(String value);

public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setSchoolId(long value);

public  void setCreateOrgId(long value);

public  void setSaleTypeId(int value);
}
