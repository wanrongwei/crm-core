package com.asiainfo.crm.cm.inner.customer.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmGroupOrgDifferValue extends DataStructInterface{

  public final static  String S_ImportSource = "import_source";
  public final static  String S_ExpireDate = "expire_date";
  public final static  String S_ParentCustId = "parent_cust_id";
  public final static  String S_DoneDate = "done_date";
  public final static  String S_State = "state";
  public final static  String S_RegionId = "region_id";
  public final static  String S_ImportDate = "import_date";
  public final static  String S_CustServiceId = "cust_service_id";
  public final static  String S_Remarks = "remarks";
  public final static  String S_CreateOrgId = "create_org_id";
  public final static  String S_DeptId = "dept_id";
  public final static  String S_OpId = "op_id";
  public final static  String S_CreateDate = "create_date";
  public final static  String S_ProcessStatus = "process_status";
  public final static  String S_ImportParentCustId = "import_parent_cust_id";
  public final static  String S_ParentCustservId = "parent_custserv_id";
  public final static  String S_ImportParentCustservId = "import_parent_custserv_id";
  public final static  String S_IsAlert = "is_alert";
  public final static  String S_CreateOpId = "create_op_id";
  public final static  String S_DoneCode = "done_code";
  public final static  String S_CustId = "cust_id";
  public final static  String S_ImportParentDeptId = "import_parent_dept_id";
  public final static  String S_OrgId = "org_id";
  public final static  String S_DifferId = "differ_id";
  public final static  String S_ParentDeptId = "parent_dept_id";
  public final static  String S_EffectiveDate = "effective_date";


public String getImportSource();

public Timestamp getExpireDate();

public long getParentCustId();

public Timestamp getDoneDate();

public String getState();

public String getRegionId();

public Timestamp getImportDate();

public String getCustServiceId();

public String getRemarks();

public long getCreateOrgId();

public long getDeptId();

public long getOpId();

public Timestamp getCreateDate();

public long getProcessStatus();

public long getImportParentCustId();

public String getParentCustservId();

public String getImportParentCustservId();

public long getIsAlert();

public long getCreateOpId();

public long getDoneCode();

public long getCustId();

public long getImportParentDeptId();

public long getOrgId();

public long getDifferId();

public long getParentDeptId();

public Timestamp getEffectiveDate();


public  void setImportSource(String value);

public  void setExpireDate(Timestamp value);

public  void setParentCustId(long value);

public  void setDoneDate(Timestamp value);

public  void setState(String value);

public  void setRegionId(String value);

public  void setImportDate(Timestamp value);

public  void setCustServiceId(String value);

public  void setRemarks(String value);

public  void setCreateOrgId(long value);

public  void setDeptId(long value);

public  void setOpId(long value);

public  void setCreateDate(Timestamp value);

public  void setProcessStatus(long value);

public  void setImportParentCustId(long value);

public  void setParentCustservId(String value);

public  void setImportParentCustservId(String value);

public  void setIsAlert(long value);

public  void setCreateOpId(long value);

public  void setDoneCode(long value);

public  void setCustId(long value);

public  void setImportParentDeptId(long value);

public  void setOrgId(long value);

public  void setDifferId(long value);

public  void setParentDeptId(long value);

public  void setEffectiveDate(Timestamp value);
}
