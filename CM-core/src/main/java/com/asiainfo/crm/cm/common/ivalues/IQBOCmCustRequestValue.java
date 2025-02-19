package com.asiainfo.crm.cm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IQBOCmCustRequestValue extends DataStructInterface{

  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_State = "STATE";
  public final static  String S_RequestStatus = "REQUEST_STATUS";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_Priority = "PRIORITY";
  public final static  String S_TaskId = "TASK_ID";
  public final static  String S_StatusDate = "STATUS_DATE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_CustName = "CUST_NAME";
  public final static  String S_Count = "COUNT";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_Results = "RESULTS";
  public final static  String S_RequestType = "REQUEST_TYPE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_Action = "ACTION";


public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public long getOpId();

public String getState();

public String getRequestStatus();

public String getRemarks();

public long getPriority();

public long getTaskId();

public Timestamp getStatusDate();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public String getCustName();

public long getCount();

public long getCustId();

public long getCreateOpId();

public Timestamp getDoneDate();

public String getResults();

public int getRequestType();

public Timestamp getCreateDate();

public long getDoneCode();

public String getAction();


public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setState(String value);

public  void setRequestStatus(String value);

public  void setRemarks(String value);

public  void setPriority(long value);

public  void setTaskId(long value);

public  void setStatusDate(Timestamp value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setCustName(String value);

public  void setCount(long value);

public  void setCustId(long value);

public  void setCreateOpId(long value);

public  void setDoneDate(Timestamp value);

public  void setResults(String value);

public  void setRequestType(int value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setAction(String value);
}
