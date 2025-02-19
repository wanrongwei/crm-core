package com.asiainfo.crm.cm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmCprToTTValue extends DataStructInterface{

  public final static  String S_ErrorMsg = "error_msg";
  public final static  String S_DoneCode = "done_code";
  public final static  String S_DoneDate = "done_date";
  public final static  String S_CreateOrgId = "create_org_id";
  public final static  String S_RegionId = "region_id";
  public final static  String S_OpId = "op_id";
  public final static  String S_CreateOpId = "create_op_id";
  public final static  String S_TaskId = "task_id";
  public final static  String S_ExpireDate = "expire_date";
  public final static  String S_OrgId = "org_id";
  public final static  String S_EffectiveDate = "effective_date";
  public final static  String S_CprId = "cpr_id";
  public final static  String S_ErrorCode = "error_code";
  public final static  String S_State = "state";
  public final static  String S_CreateDate = "create_date";
  public final static  String S_Remarks = "remarks";


public String getErrorMsg();

public long getDoneCode();

public Timestamp getDoneDate();

public long getCreateOrgId();

public String getRegionId();

public long getOpId();

public long getCreateOpId();

public long getTaskId();

public Timestamp getExpireDate();

public long getOrgId();

public Timestamp getEffectiveDate();

public long getCprId();

public String getErrorCode();

public String getState();

public Timestamp getCreateDate();

public String getRemarks();


public  void setErrorMsg(String value);

public  void setDoneCode(long value);

public  void setDoneDate(Timestamp value);

public  void setCreateOrgId(long value);

public  void setRegionId(String value);

public  void setOpId(long value);

public  void setCreateOpId(long value);

public  void setTaskId(long value);

public  void setExpireDate(Timestamp value);

public  void setOrgId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setCprId(long value);

public  void setErrorCode(String value);

public  void setState(String value);

public  void setCreateDate(Timestamp value);

public  void setRemarks(String value);
}
