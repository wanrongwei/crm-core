package com.asiainfo.crm.cm.dk.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmAcctSubStatusValue extends DataStructInterface{

  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_SubAcctStatus = "SUB_ACCT_STATUS";


public String getRegionId();

public long getCreateOpId();

public long getCustId();

public Timestamp getDoneDate();

public long getOrgId();

public long getDoneCode();

public long getAcctId();

public long getOpId();

public String getState();

public String getRemarks();

public Timestamp getCreateDate();

public long getCreateOrgId();

public long getSubAcctStatus();


public  void setRegionId(String value);

public  void setCreateOpId(long value);

public  void setCustId(long value);

public  void setDoneDate(Timestamp value);

public  void setOrgId(long value);

public  void setDoneCode(long value);

public  void setAcctId(long value);

public  void setOpId(long value);

public  void setState(String value);

public  void setRemarks(String value);

public  void setCreateDate(Timestamp value);

public  void setCreateOrgId(long value);

public  void setSubAcctStatus(long value);
}
