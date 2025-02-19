package com.asiainfo.crm.cm.inner.account.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmCustAcctRelValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_BillDueDate = "bill_due_date";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_AcctAliasName = "ACCT_ALIAS_NAME";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_InstallmentFlag = "installment_flag";
  public final static  String S_BillDay = "bill_day";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_Action = "ACTION";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_RelType = "REL_TYPE";
  public final static  String S_RelCustId = "REL_CUST_ID";
  public final static  String S_AcctName = "acct_name";
  public final static  String S_CycleType = "cycle_type";
  public final static  String S_CustType = "CUST_TYPE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_Ext5 = "ext5";
  public final static  String S_PayMethod = "pay_method";
  public final static  String S_Ext1 = "ext1";
  public final static  String S_Ext2 = "ext2";
  public final static  String S_Ext3 = "ext3";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_Ext4 = "ext4";
  public final static  String S_CreateDate = "CREATE_DATE";


public String getState();

public long getBillDueDate();

public String getRemarks();

public String getAcctAliasName();

public long getAcctId();

public long getCreateOpId();

public long getInstallmentFlag();

public long getBillDay();

public long getDoneCode();

public String getAction();

public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public long getOpId();

public long getRelType();

public long getRelCustId();

public String getAcctName();

public long getCycleType();

public long getCustType();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public String getExt5();

public long getPayMethod();

public String getExt1();

public String getExt2();

public String getExt3();

public Timestamp getDoneDate();

public String getExt4();

public Timestamp getCreateDate();


public  void setState(String value);

public  void setBillDueDate(long value);

public  void setRemarks(String value);

public  void setAcctAliasName(String value);

public  void setAcctId(long value);

public  void setCreateOpId(long value);

public  void setInstallmentFlag(long value);

public  void setBillDay(long value);

public  void setDoneCode(long value);

public  void setAction(String value);

public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setRelType(long value);

public  void setRelCustId(long value);

public  void setAcctName(String value);

public  void setCycleType(long value);

public  void setCustType(long value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setExt5(String value);

public  void setPayMethod(long value);

public  void setExt1(String value);

public  void setExt2(String value);

public  void setExt3(String value);

public  void setDoneDate(Timestamp value);

public  void setExt4(String value);

public  void setCreateDate(Timestamp value);
}
