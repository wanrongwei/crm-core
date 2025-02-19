package com.asiainfo.crm.cm.dk.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmGroupApprovalValue extends DataStructInterface{

  public final static  String S_WkFlowName = "wk_flow_name";
  public final static  String S_ExpireDate = "expire_date";
  public final static  String S_DoneDate = "done_date";
  public final static  String S_TaskId = "task_id";
  public final static  String S_State = "state";
  public final static  String S_RegionId = "region_id";
  public final static  String S_Remarks = "remarks";
  public final static  String S_CreateOrgId = "create_org_id";
  public final static  String S_RootCustId = "root_cust_id";
  public final static  String S_OpId = "op_id";
  public final static  String S_CreateDate = "create_date";
  public final static  String S_Action = "action";
  public final static  String S_WkFlowId = "wk_flow_id";
  public final static  String S_CurrentInfo = "current_info";
  public final static  String S_CreateOpId = "create_op_id";
  public final static  String S_ApprovalDetail = "approval_detail";
  public final static  String S_Approver = "approver";
  public final static  String S_ApprovalStatus = "approval_status";
  public final static  String S_DoneCode = "done_code";
  public final static  String S_Resource = "resource";
  public final static  String S_ApproverId = "approver_id";
  public final static  String S_CustId = "cust_id";
  public final static  String S_OrgId = "org_id";
  public final static  String S_CustName = "CUST_NAME";
  public final static  String S_ApplyChangeInfo = "apply_change_info";
  public final static  String S_PsType = "ps_type";
  public final static  String S_ApprovalDate = "approval_date";
  public final static  String S_EffectiveDate = "effective_date";
  public final static  String S_ApprovalResults = "approval_results";
  public final static  String S_Step = "step";


public String getWkFlowName();

public Timestamp getExpireDate();

public Timestamp getDoneDate();

public String getTaskId();

public String getState();

public String getRegionId();

public String getRemarks();

public long getCreateOrgId();

public long getRootCustId();

public long getOpId();

public Timestamp getCreateDate();

public String getAction();

public String getWkFlowId();

public String getCurrentInfo();

public long getCreateOpId();

public String getApprovalDetail();

public String getApprover();

public long getApprovalStatus();

public long getDoneCode();

public long getResource();

public long getApproverId();

public long getCustId();

public long getOrgId();

public String getCustName();

public String getApplyChangeInfo();

public long getPsType();

public Timestamp getApprovalDate();

public Timestamp getEffectiveDate();

public long getApprovalResults();

public long getStep();


public  void setWkFlowName(String value);

public  void setExpireDate(Timestamp value);

public  void setDoneDate(Timestamp value);

public  void setTaskId(String value);

public  void setState(String value);

public  void setRegionId(String value);

public  void setRemarks(String value);

public  void setCreateOrgId(long value);

public  void setRootCustId(long value);

public  void setOpId(long value);

public  void setCreateDate(Timestamp value);

public  void setAction(String value);

public  void setWkFlowId(String value);

public  void setCurrentInfo(String value);

public  void setCreateOpId(long value);

public  void setApprovalDetail(String value);

public  void setApprover(String value);

public  void setApprovalStatus(long value);

public  void setDoneCode(long value);

public  void setResource(long value);

public  void setApproverId(long value);

public  void setCustId(long value);

public  void setOrgId(long value);

public  void setCustName(String value);

public  void setApplyChangeInfo(String value);

public  void setPsType(long value);

public  void setApprovalDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setApprovalResults(long value);

public  void setStep(long value);
}
