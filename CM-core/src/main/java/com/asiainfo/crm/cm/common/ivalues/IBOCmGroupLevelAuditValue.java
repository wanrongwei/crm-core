package com.asiainfo.crm.cm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmGroupLevelAuditValue extends DataStructInterface{

  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_ApplyOpId = "APPLY_OP_ID";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_State = "STATE";
  public final static  String S_GroupId = "GROUP_ID";
  public final static  String S_AuditDesc = "AUDIT_DESC";
  public final static  String S_AuditOpId = "AUDIT_OP_ID";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_OldValue = "OLD_VALUE";
  public final static  String S_ApplyDate = "APPLY_DATE";
  public final static  String S_NewValue = "NEW_VALUE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_AuditSts = "AUDIT_STS";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_ApplyDesc = "APPLY_DESC";
  public final static  String S_AuditId = "AUDIT_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";


public Timestamp getExpireDate();

public long getApplyOpId();

public long getOpId();

public Timestamp getEffectiveDate();

public String getState();

public long getGroupId();

public String getAuditDesc();

public long getAuditOpId();

public String getRemarks();

public String getOldValue();

public Timestamp getApplyDate();

public String getNewValue();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public int getAuditSts();

public long getCreateOpId();

public Timestamp getDoneDate();

public String getApplyDesc();

public long getAuditId();

public Timestamp getCreateDate();

public long getDoneCode();


public  void setExpireDate(Timestamp value);

public  void setApplyOpId(long value);

public  void setOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setState(String value);

public  void setGroupId(long value);

public  void setAuditDesc(String value);

public  void setAuditOpId(long value);

public  void setRemarks(String value);

public  void setOldValue(String value);

public  void setApplyDate(Timestamp value);

public  void setNewValue(String value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setAuditSts(int value);

public  void setCreateOpId(long value);

public  void setDoneDate(Timestamp value);

public  void setApplyDesc(String value);

public  void setAuditId(long value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);
}
