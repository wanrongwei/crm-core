package com.asiainfo.crm.cm.inner.customer.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IQBOCmGroupOrgDifferValue extends DataStructInterface{

  public final static  String S_DeptId = "DEPT_ID";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_PartyId = "PARTY_ID";
  public final static  String S_ImportSource = "IMPORT_SOURCE";
  public final static  String S_DeptName = "DEPT_NAME";
  public final static  String S_ParentCustservId = "PARENT_CUSTSERV_ID";
  public final static  String S_ParentDeptNameOld = "PARENT_DEPT_NAME_OLD";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_ParentDeptId = "PARENT_DEPT_ID";
  public final static  String S_ImportParentDeptId = "IMPORT_PARENT_DEPT_ID";
  public final static  String S_DifferId = "DIFFER_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_CustServiceId = "CUST_SERVICE_ID";
  public final static  String S_ParentDeptNameNew = "PARENT_DEPT_NAME_NEW";
  public final static  String S_ParentCustId = "PARENT_CUST_ID";
  public final static  String S_ImportDate = "IMPORT_DATE";
  public final static  String S_ImportParentCustservId = "IMPORT_PARENT_CUSTSERV_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_ProcessStatus = "PROCESS_STATUS";
  public final static  String S_CustName = "CUST_NAME";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_IsAlert = "IS_ALERT";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_ImportParentCustId = "IMPORT_PARENT_CUST_ID";


public long getDeptId();

public String getState();

public String getRemarks();

public long getPartyId();

public String getImportSource();

public String getDeptName();

public String getParentCustservId();

public String getParentDeptNameOld();

public long getCustId();

public long getCreateOpId();

public long getParentDeptId();

public long getImportParentDeptId();

public long getDifferId();

public long getDoneCode();

public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public long getOpId();

public String getCustServiceId();

public String getParentDeptNameNew();

public long getParentCustId();

public Timestamp getImportDate();

public String getImportParentCustservId();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public int getProcessStatus();

public String getCustName();

public Timestamp getDoneDate();

public int getIsAlert();

public Timestamp getCreateDate();

public long getImportParentCustId();


public  void setDeptId(long value);

public  void setState(String value);

public  void setRemarks(String value);

public  void setPartyId(long value);

public  void setImportSource(String value);

public  void setDeptName(String value);

public  void setParentCustservId(String value);

public  void setParentDeptNameOld(String value);

public  void setCustId(long value);

public  void setCreateOpId(long value);

public  void setParentDeptId(long value);

public  void setImportParentDeptId(long value);

public  void setDifferId(long value);

public  void setDoneCode(long value);

public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setCustServiceId(String value);

public  void setParentDeptNameNew(String value);

public  void setParentCustId(long value);

public  void setImportDate(Timestamp value);

public  void setImportParentCustservId(String value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setProcessStatus(int value);

public  void setCustName(String value);

public  void setDoneDate(Timestamp value);

public  void setIsAlert(int value);

public  void setCreateDate(Timestamp value);

public  void setImportParentCustId(long value);
}
