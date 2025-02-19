package com.asiainfo.crm.cm.customer.group.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmRepOnceIncomeBusiValue extends DataStructInterface{

  public final static  String S_EndMonth = "END_MONTH";
  public final static  String S_PlanType = "PLAN_TYPE";
  public final static  String S_FeeType = "FEE_TYPE";
  public final static  String S_TotalFee = "TOTAL_FEE";
  public final static  String S_AccRealIncome = "ACC_REAL_INCOME";
  public final static  String S_MonthRealIncome = "MONTH_REAL_INCOME";
  public final static  String S_GroupName = "GROUP_NAME";
  public final static  String S_FinanceId = "FINANCE_ID";
  public final static  String S_ContractId = "CONTRACT_ID";
  public final static  String S_ContractDate = "CONTRACT_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_GroupId = "GROUP_ID";
  public final static  String S_GroupCity = "GROUP_CITY";
  public final static  String S_BeginMonth = "BEGIN_MONTH";
  public final static  String S_ManagerName = "MANAGER_NAME";
  public final static  String S_RegionType = "REGION_TYPE";
  public final static  String S_StatMonth = "STAT_MONTH";
  public final static  String S_MonthAppIncome = "MONTH_APP_INCOME";
  public final static  String S_RecStatus = "REC_STATUS";
  public final static  String S_ManagerId = "MANAGER_ID";
  public final static  String S_OpName = "OP_NAME";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_IsNew = "IS_NEW";
  public final static  String S_AccessNo = "ACCESS_NO";
  public final static  String S_OnceIncomeId = "ONCE_INCOME_ID";
  public final static  String S_AccAppIncome = "ACC_APP_INCOME";


public String getEndMonth();

public long getPlanType();

public long getFeeType();

public double getTotalFee();

public double getAccRealIncome();

public double getMonthRealIncome();

public String getGroupName();

public String getFinanceId();

public String getContractId();

public Timestamp getContractDate();

public long getOpId();

public long getGroupId();

public String getGroupCity();

public String getBeginMonth();

public String getManagerName();

public String getRegionType();

public String getStatMonth();

public double getMonthAppIncome();

public int getRecStatus();

public long getManagerId();

public String getOpName();

public String getBillId();

public int getIsNew();

public String getAccessNo();

public long getOnceIncomeId();

public double getAccAppIncome();


public  void setEndMonth(String value);

public  void setPlanType(long value);

public  void setFeeType(long value);

public  void setTotalFee(double value);

public  void setAccRealIncome(double value);

public  void setMonthRealIncome(double value);

public  void setGroupName(String value);

public  void setFinanceId(String value);

public  void setContractId(String value);

public  void setContractDate(Timestamp value);

public  void setOpId(long value);

public  void setGroupId(long value);

public  void setGroupCity(String value);

public  void setBeginMonth(String value);

public  void setManagerName(String value);

public  void setRegionType(String value);

public  void setStatMonth(String value);

public  void setMonthAppIncome(double value);

public  void setRecStatus(int value);

public  void setManagerId(long value);

public  void setOpName(String value);

public  void setBillId(String value);

public  void setIsNew(int value);

public  void setAccessNo(String value);

public  void setOnceIncomeId(long value);

public  void setAccAppIncome(double value);
}
