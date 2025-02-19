package com.asiainfo.crm.cm.customer.group.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmGroupAuditInfoValue extends DataStructInterface{

  public final static  String S_ApplyOpId = "APPLY_OP_ID";
  public final static  String S_State = "STATE";
  public final static  String S_CityId = "CITY_ID";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_ApplyDate = "APPLY_DATE";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_ApplyDesc = "APPLY_DESC";
  public final static  String S_AuditId = "AUDIT_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_AuditType = "AUDIT_TYPE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_AuditDesc = "AUDIT_DESC";
  public final static  String S_AuditOpId = "AUDIT_OP_ID";
  public final static  String S_OldValue = "OLD_VALUE";
  public final static  String S_NewValue = "NEW_VALUE";
  public final static  String S_ReqCoin = "REQ_COIN";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_OldAuditId = "OLD_AUDIT_ID";
  public final static  String S_AuditSts = "AUDIT_STS";
  public final static  String S_CountyId = "COUNTY_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_CustContId = "CUST_CONT_ID";


public long getApplyOpId();

public String getState();

public String getCityId();

public String getRemarks();

public Timestamp getApplyDate();

public long getCustId();

public long getCreateOpId();

public String getApplyDesc();

public long getAuditId();

public long getDoneCode();

public int getAuditType();

public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public long getOpId();

public String getAuditDesc();

public long getAuditOpId();

public String getOldValue();

public String getNewValue();

public long getReqCoin();

public long getOrgId();

public long getCreateOrgId();

public String getRegionId();

public long getOldAuditId();

public int getAuditSts();

public String getCountyId();

public Timestamp getDoneDate();

public Timestamp getCreateDate();

public long getCustContId();


public  void setApplyOpId(long value);

public  void setState(String value);

public  void setCityId(String value);

public  void setRemarks(String value);

public  void setApplyDate(Timestamp value);

public  void setCustId(long value);

public  void setCreateOpId(long value);

public  void setApplyDesc(String value);

public  void setAuditId(long value);

public  void setDoneCode(long value);

public  void setAuditType(int value);

public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setAuditDesc(String value);

public  void setAuditOpId(long value);

public  void setOldValue(String value);

public  void setNewValue(String value);

public  void setReqCoin(long value);

public  void setOrgId(long value);

public  void setCreateOrgId(long value);

public  void setRegionId(String value);

public  void setOldAuditId(long value);

public  void setAuditSts(int value);

public  void setCountyId(String value);

public  void setDoneDate(Timestamp value);

public  void setCreateDate(Timestamp value);

public  void setCustContId(long value);
}
