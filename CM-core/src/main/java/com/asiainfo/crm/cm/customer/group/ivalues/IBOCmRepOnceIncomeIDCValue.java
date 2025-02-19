package com.asiainfo.crm.cm.customer.group.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmRepOnceIncomeIDCValue extends DataStructInterface{

  public final static  String S_IsOwing = "IS_OWING";
  public final static  String S_CurPaidFee = "CUR_PAID_FEE";
  public final static  String S_UnpayFee = "UNPAY_FEE";
  public final static  String S_TotalPaidFee = "TOTAL_PAID_FEE";
  public final static  String S_BusiName = "BUSI_NAME";
  public final static  String S_ContractBegDate = "CONTRACT_BEG_DATE";
  public final static  String S_CurAddRecFee = "CUR_ADD_REC_FEE";
  public final static  String S_RecDate = "REC_DATE";
  public final static  String S_GroupContactTel = "GROUP_CONTACT_TEL";
  public final static  String S_Status = "STATUS";
  public final static  String S_TotalFee = "TOTAL_FEE";
  public final static  String S_GroupName = "GROUP_NAME";
  public final static  String S_ReceivingUnits = "RECEIVING_UNITS";
  public final static  String S_ContractEndDate = "CONTRACT_END_DATE";
  public final static  String S_ContractId = "CONTRACT_ID";
  public final static  String S_ContractDate = "CONTRACT_DATE";
  public final static  String S_GroupId = "GROUP_ID";
  public final static  String S_GroupCity = "GROUP_CITY";
  public final static  String S_RegionType = "REGION_TYPE";
  public final static  String S_StatMonth = "STAT_MONTH";
  public final static  String S_PayCycType = "PAY_CYC_TYPE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_GroupContactName = "GROUP_CONTACT_NAME";
  public final static  String S_GroupContactAdr = "GROUP_CONTACT_ADR";
  public final static  String S_TotalRecFee = "TOTAL_REC_FEE";
  public final static  String S_OnceIncomeId = "ONCE_INCOME_ID";


public int getIsOwing();

public double getCurPaidFee();

public double getUnpayFee();

public double getTotalPaidFee();

public String getBusiName();

public String getContractBegDate();

public double getCurAddRecFee();

public String getRecDate();

public String getGroupContactTel();

public int getStatus();

public double getTotalFee();

public String getGroupName();

public String getReceivingUnits();

public String getContractEndDate();

public String getContractId();

public Timestamp getContractDate();

public long getGroupId();

public String getGroupCity();

public String getRegionType();

public String getStatMonth();

public int getPayCycType();

public Timestamp getDoneDate();

public String getGroupContactName();

public String getGroupContactAdr();

public double getTotalRecFee();

public long getOnceIncomeId();


public  void setIsOwing(int value);

public  void setCurPaidFee(double value);

public  void setUnpayFee(double value);

public  void setTotalPaidFee(double value);

public  void setBusiName(String value);

public  void setContractBegDate(String value);

public  void setCurAddRecFee(double value);

public  void setRecDate(String value);

public  void setGroupContactTel(String value);

public  void setStatus(int value);

public  void setTotalFee(double value);

public  void setGroupName(String value);

public  void setReceivingUnits(String value);

public  void setContractEndDate(String value);

public  void setContractId(String value);

public  void setContractDate(Timestamp value);

public  void setGroupId(long value);

public  void setGroupCity(String value);

public  void setRegionType(String value);

public  void setStatMonth(String value);

public  void setPayCycType(int value);

public  void setDoneDate(Timestamp value);

public  void setGroupContactName(String value);

public  void setGroupContactAdr(String value);

public  void setTotalRecFee(double value);

public  void setOnceIncomeId(long value);
}
