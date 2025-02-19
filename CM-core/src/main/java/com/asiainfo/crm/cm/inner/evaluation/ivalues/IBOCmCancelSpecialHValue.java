package com.asiainfo.crm.cm.inner.evaluation.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmCancelSpecialHValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_CertType = "CERT_TYPE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OperState = "OPER_STATE";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_CertCode = "CERT_CODE";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_CustId = "CUST_ID";


public String getState();

public long getCreateOpId();

public Timestamp getEffectiveDate();

public int getCertType();

public Timestamp getDoneDate();

public long getAcctId();

public String getRemarks();

public long getOrgId();

public Timestamp getCreateDate();

public long getDoneCode();

public String getRegionId();

public long getOpId();

public Timestamp getExpireDate();

public int getOperState();

public long getCreateOrgId();

public String getCertCode();

public long getUserId();

public String getBillId();

public long getCustId();


public  void setState(String value);

public  void setCreateOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setCertType(int value);

public  void setDoneDate(Timestamp value);

public  void setAcctId(long value);

public  void setRemarks(String value);

public  void setOrgId(long value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setRegionId(String value);

public  void setOpId(long value);

public  void setExpireDate(Timestamp value);

public  void setOperState(int value);

public  void setCreateOrgId(long value);

public  void setCertCode(String value);

public  void setUserId(long value);

public  void setBillId(String value);

public  void setCustId(long value);
}
