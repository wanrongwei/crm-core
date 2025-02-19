package com.asiainfo.crm.cm.inner.customer.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmCustRequestTaskValue extends DataStructInterface{

  public final static  String S_ExpireDate = "expire_date";
  public final static  String S_RequestStatus = "request_status";
  public final static  String S_Count = "count";
  public final static  String S_DoneDate = "done_date";
  public final static  String S_RequestType = "request_type";
  public final static  String S_TaskId = "task_id";
  public final static  String S_State = "state";
  public final static  String S_DoneCode = "done_code";
  public final static  String S_RegionId = "region_id";
  public final static  String S_Remarks = "remarks";
  public final static  String S_CreateOrgId = "create_org_id";
  public final static  String S_CustId = "cust_id";
  public final static  String S_OrgId = "org_id";
  public final static  String S_OpId = "op_id";
  public final static  String S_Results = "results";
  public final static  String S_CreateDate = "create_date";
  public final static  String S_Priority = "priority";
  public final static  String S_EffectiveDate = "effective_date";
  public final static  String S_StatusDate = "status_date";
  public final static  String S_CreateOpId = "create_op_id";


public Timestamp getExpireDate();

public String getRequestStatus();

public long getCount();

public Timestamp getDoneDate();

public long getRequestType();

public long getTaskId();

public String getState();

public long getDoneCode();

public String getRegionId();

public String getRemarks();

public long getCreateOrgId();

public long getCustId();

public long getOrgId();

public long getOpId();

public String getResults();

public Timestamp getCreateDate();

public long getPriority();

public Timestamp getEffectiveDate();

public Timestamp getStatusDate();

public long getCreateOpId();


public  void setExpireDate(Timestamp value);

public  void setRequestStatus(String value);

public  void setCount(long value);

public  void setDoneDate(Timestamp value);

public  void setRequestType(long value);

public  void setTaskId(long value);

public  void setState(String value);

public  void setDoneCode(long value);

public  void setRegionId(String value);

public  void setRemarks(String value);

public  void setCreateOrgId(long value);

public  void setCustId(long value);

public  void setOrgId(long value);

public  void setOpId(long value);

public  void setResults(String value);

public  void setCreateDate(Timestamp value);

public  void setPriority(long value);

public  void setEffectiveDate(Timestamp value);

public  void setStatusDate(Timestamp value);

public  void setCreateOpId(long value);
}
