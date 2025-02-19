package com.asiainfo.crm.cm.inner.account.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmAcctBillCycleValue extends DataStructInterface{

  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_State = "STATE";
  public final static  String S_CycleUnit = "CYCLE_UNIT";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_CycleId = "CYCLE_ID";
  public final static  String S_CycleReason = "CYCLE_REASON";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_CycleType = "CYCLE_TYPE";
  public final static  String S_BillDueDate = "BILL_DUE_DATE";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_BillDay = "BILL_DAY";


public Timestamp getExpireDate();

public long getOpId();

public Timestamp getEffectiveDate();

public String getState();

public long getCycleUnit();

public String getRemarks();

public long getCycleId();

public String getCycleReason();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public long getCycleType();

public long getBillDueDate();

public long getAcctId();

public long getCreateOpId();

public Timestamp getDoneDate();

public Timestamp getCreateDate();

public long getDoneCode();

public long getBillDay();


public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setState(String value);

public  void setCycleUnit(long value);

public  void setRemarks(String value);

public  void setCycleId(long value);

public  void setCycleReason(String value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setCycleType(long value);

public  void setBillDueDate(long value);

public  void setAcctId(long value);

public  void setCreateOpId(long value);

public  void setDoneDate(Timestamp value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setBillDay(long value);
}
