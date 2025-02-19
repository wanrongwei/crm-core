package com.asiainfo.crm.cm.customer.group.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmGrpContactAndCreReqAuditValue extends DataStructInterface{

  public final static  String S_AuditClass = "AUDIT_CLASS";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_State = "STATE";
  public final static  String S_AuditPopedom = "AUDIT_POPEDOM";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_DefinitionType = "DEFINITION_TYPE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_AuditId = "AUDIT_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";


public int getAuditClass();

public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public long getOpId();

public String getState();

public String getAuditPopedom();

public String getRemarks();

public int getDefinitionType();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public long getCreateOpId();

public Timestamp getDoneDate();

public long getAuditId();

public Timestamp getCreateDate();

public long getDoneCode();


public  void setAuditClass(int value);

public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setState(String value);

public  void setAuditPopedom(String value);

public  void setRemarks(String value);

public  void setDefinitionType(int value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setCreateOpId(long value);

public  void setDoneDate(Timestamp value);

public  void setAuditId(long value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);
}
