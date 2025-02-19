package com.asiainfo.crm.cm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmPsTaskDealValue extends DataStructInterface{

  public final static  String S_TaskParam = "task_param";
  public final static  String S_ExpireDate = "expire_date";
  public final static  String S_DoneDate = "done_date";
  public final static  String S_TaskId = "task_id";
  public final static  String S_DoneCode = "done_code";
  public final static  String S_RegionId = "region_id";
  public final static  String S_State = "state";
  public final static  String S_TaskType = "task_type";
  public final static  String S_Remarks = "remarks";
  public final static  String S_CreateOrgId = "create_org_id";
  public final static  String S_EntityId = "entity_id";
  public final static  String S_OrgId = "org_id";
  public final static  String S_OpId = "op_id";
  public final static  String S_CreateDate = "create_date";
  public final static  String S_EffectiveDate = "effective_date";
  public final static  String S_CreateOpId = "create_op_id";


public String getTaskParam();

public Timestamp getExpireDate();

public Timestamp getDoneDate();

public long getTaskId();

public long getDoneCode();

public String getRegionId();

public String getState();

public long getTaskType();

public String getRemarks();

public long getCreateOrgId();

public long getEntityId();

public long getOrgId();

public long getOpId();

public Timestamp getCreateDate();

public Timestamp getEffectiveDate();

public long getCreateOpId();


public  void setTaskParam(String value);

public  void setExpireDate(Timestamp value);

public  void setDoneDate(Timestamp value);

public  void setTaskId(long value);

public  void setDoneCode(long value);

public  void setRegionId(String value);

public  void setState(String value);

public  void setTaskType(long value);

public  void setRemarks(String value);

public  void setCreateOrgId(long value);

public  void setEntityId(long value);

public  void setOrgId(long value);

public  void setOpId(long value);

public  void setCreateDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setCreateOpId(long value);
}
