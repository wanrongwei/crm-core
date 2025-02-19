package com.asiainfo.crm.so.common.party.ivalues;

import com.ai.appframe2.common.DataStructInterface;

import java.sql.Timestamp;

public interface IBOSoAuditInfoValue extends DataStructInterface{

  public final static  String S_AuditType = "AUDIT_TYPE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_AnnexId = "ANNEX_ID";
  public final static  String S_Ext02 = "EXT_02";
  public final static  String S_Ext03 = "EXT_03";
  public final static  String S_AuditNextStaffid = "AUDIT_NEXT_STAFFID";
  public final static  String S_Ext01 = "EXT_01";
  public final static  String S_ObjectId = "OBJECT_ID";
  public final static  String S_TaskId = "TASK_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_AuditOpinion = "AUDIT_OPINION";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_WorkFlowId = "WORK_FLOW_ID";
  public final static  String S_AuditDate = "AUDIT_DATE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_AuditId = "AUDIT_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_AuditResult = "AUDIT_RESULT";


public int getAuditType();

public long getOpId();

public long getAnnexId();

public String getExt02();

public String getExt03();

public String getAuditNextStaffid();

public String getExt01();

public long getObjectId();

public String getTaskId();

public long getOrgId();

public String getAuditOpinion();

public String getRegionId();

public String getWorkFlowId();

public Timestamp getAuditDate();

public Timestamp getDoneDate();

public long getAuditId();

public Timestamp getCreateDate();

public long getDoneCode();

public String getAuditResult();


public  void setAuditType(int value);

public  void setOpId(long value);

public  void setAnnexId(long value);

public  void setExt02(String value);

public  void setExt03(String value);

public  void setAuditNextStaffid(String value);

public  void setExt01(String value);

public  void setObjectId(long value);

public  void setTaskId(String value);

public  void setOrgId(long value);

public  void setAuditOpinion(String value);

public  void setRegionId(String value);

public  void setWorkFlowId(String value);

public  void setAuditDate(Timestamp value);

public  void setDoneDate(Timestamp value);

public  void setAuditId(long value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setAuditResult(String value);
}
