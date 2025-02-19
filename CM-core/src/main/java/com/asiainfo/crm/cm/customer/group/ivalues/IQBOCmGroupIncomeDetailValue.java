package com.asiainfo.crm.cm.customer.group.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IQBOCmGroupIncomeDetailValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_EndMonth = "END_MONTH";
  public final static  String S_PlanType = "PLAN_TYPE";
  public final static  String S_FeeType = "FEE_TYPE";
  public final static  String S_Realnewincome = "REALNEWINCOME";
  public final static  String S_IncomeStatus = "INCOME_STATUS";
  public final static  String S_TotalFee = "TOTAL_FEE";
  public final static  String S_OperDesc = "OPER_DESC";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_TerminalReason = "TERMINAL_REASON";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_Notes = "NOTES";
  public final static  String S_ContractId = "CONTRACT_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_ContractDate = "CONTRACT_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_Realincome = "REALINCOME";
  public final static  String S_BeginMonth = "BEGIN_MONTH";
  public final static  String S_GroupCustId = "GROUP_CUST_ID";
  public final static  String S_PayCycType = "PAY_CYC_TYPE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_ReceivingUnitsType = "RECEIVING_UNITS_TYPE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_AccessNo = "ACCESS_NO";
  public final static  String S_OnceIncomeId = "ONCE_INCOME_ID";


public String getState();

public String getEndMonth();

public long getPlanType();

public long getFeeType();

public double getRealnewincome();

public long getIncomeStatus();

public double getTotalFee();

public String getOperDesc();

public long getAcctId();

public String getTerminalReason();

public long getCreateOpId();

public long getDoneCode();

public String getNotes();

public String getContractId();

public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public Timestamp getContractDate();

public long getOpId();

public double getRealincome();

public String getBeginMonth();

public long getGroupCustId();

public long getPayCycType();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public long getReceivingUnitsType();

public Timestamp getDoneDate();

public String getBillId();

public Timestamp getCreateDate();

public String getAccessNo();

public long getOnceIncomeId();


public  void setState(String value);

public  void setEndMonth(String value);

public  void setPlanType(long value);

public  void setFeeType(long value);

public  void setRealnewincome(double value);

public  void setIncomeStatus(long value);

public  void setTotalFee(double value);

public  void setOperDesc(String value);

public  void setAcctId(long value);

public  void setTerminalReason(String value);

public  void setCreateOpId(long value);

public  void setDoneCode(long value);

public  void setNotes(String value);

public  void setContractId(String value);

public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setContractDate(Timestamp value);

public  void setOpId(long value);

public  void setRealincome(double value);

public  void setBeginMonth(String value);

public  void setGroupCustId(long value);

public  void setPayCycType(long value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setReceivingUnitsType(long value);

public  void setDoneDate(Timestamp value);

public  void setBillId(String value);

public  void setCreateDate(Timestamp value);

public  void setAccessNo(String value);

public  void setOnceIncomeId(long value);
}
