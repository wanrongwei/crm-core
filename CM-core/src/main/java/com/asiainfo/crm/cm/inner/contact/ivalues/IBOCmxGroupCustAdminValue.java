package com.asiainfo.crm.cm.inner.contact.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmxGroupCustAdminValue extends DataStructInterface{

  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_ContName = "CONT_NAME";
  public final static  String S_AcctCode = "ACCT_CODE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_JobPosition = "JOB_POSITION";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_Gender = "GENDER";
  public final static  String S_AcctPassword = "ACCT_PASSWORD";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_CustContId = "CUST_CONT_ID";


public Timestamp getExpireDate();

public long getOpId();

public Timestamp getEffectiveDate();

public String getState();

public String getRemarks();

public String getContName();

public String getAcctCode();

public long getOrgId();

public String getJobPosition();

public String getRegionId();

public long getCreateOrgId();

public long getCustId();

public int getGender();

public String getAcctPassword();

public long getCreateOpId();

public Timestamp getDoneDate();

public String getBillId();

public Timestamp getCreateDate();

public long getDoneCode();

public long getCustContId();


public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setState(String value);

public  void setRemarks(String value);

public  void setContName(String value);

public  void setAcctCode(String value);

public  void setOrgId(long value);

public  void setJobPosition(String value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setCustId(long value);

public  void setGender(int value);

public  void setAcctPassword(String value);

public  void setCreateOpId(long value);

public  void setDoneDate(Timestamp value);

public  void setBillId(String value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setCustContId(long value);
}
