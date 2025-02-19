package com.asiainfo.crm.cm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmMultThreadDealValue extends DataStructInterface{

  public final static  String S_TaskParam = "task_param";
  public final static  String S_ExpireDate = "expire_date";
  public final static  String S_DoneDate = "done_date";
  public final static  String S_TaskStatus = "task_status";
  public final static  String S_DoneCode = "done_code";
  public final static  String S_RegionId = "region_id";
  public final static  String S_TaskId = "task_id";
  public final static  String S_Remarks = "remarks";
  public final static  String S_CreateOrgId = "create_org_id";
  public final static  String S_TaskSeq = "task_seq";
  public final static  String S_BatchId = "batch_id";
  public final static  String S_OrgId = "org_id";
  public final static  String S_OpId = "op_id";
  public final static  String S_CreateDate = "create_date";
  public final static  String S_EffectiveDate = "effective_date";
  public final static  String S_CreateOpId = "create_op_id";


public String getTaskParam();

public Timestamp getExpireDate();

public Timestamp getDoneDate();

public long getTaskStatus();

public long getDoneCode();

public String getRegionId();

public String getTaskId();

public String getRemarks();

public long getCreateOrgId();

public long getTaskSeq();

public String getBatchId();

public long getOrgId();

public long getOpId();

public Timestamp getCreateDate();

public Timestamp getEffectiveDate();

public long getCreateOpId();


public  void setTaskParam(String value);

public  void setExpireDate(Timestamp value);

public  void setDoneDate(Timestamp value);

public  void setTaskStatus(long value);

public  void setDoneCode(long value);

public  void setRegionId(String value);

public  void setTaskId(String value);

public  void setRemarks(String value);

public  void setCreateOrgId(long value);

public  void setTaskSeq(long value);

public  void setBatchId(String value);

public  void setOrgId(long value);

public  void setOpId(long value);

public  void setCreateDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setCreateOpId(long value);
}
