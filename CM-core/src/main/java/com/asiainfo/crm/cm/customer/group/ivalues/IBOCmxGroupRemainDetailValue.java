package com.asiainfo.crm.cm.customer.group.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmxGroupRemainDetailValue extends DataStructInterface{

  public final static  String S_CurUnionFee = "CUR_UNION_FEE";
  public final static  String S_GroupLevel = "GROUP_LEVEL";
  public final static  String S_CityId = "CITY_ID";
  public final static  String S_IsValid = "IS_VALID";
  public final static  String S_TotalLeftRate = "TOTAL_LEFT_RATE";
  public final static  String S_ProdTotalNum = "PROD_TOTAL_NUM";
  public final static  String S_GroupName = "GROUP_NAME";
  public final static  String S_IncomingChg = "INCOMING_CHG";
  public final static  String S_StatisticMonth = "STATISTIC_MONTH";
  public final static  String S_GroupLeftMonth = "GROUP_LEFT_MONTH";
  public final static  String S_M12MemFee = "M12_MEM_FEE";
  public final static  String S_MemVpmnRate = "MEM_VPMN_RATE";
  public final static  String S_IncomingDownFlag = "INCOMING_DOWN_FLAG";
  public final static  String S_M12TotalFee = "M12_TOTAL_FEE";
  public final static  String S_TotalLeftCounts = "TOTAL_LEFT_COUNTS";
  public final static  String S_CurMemFee = "CUR_MEM_FEE";
  public final static  String S_ManagerName = "MANAGER_NAME";
  public final static  String S_MemCoverRate = "MEM_COVER_RATE";
  public final static  String S_TotalCounts = "TOTAL_COUNTS";
  public final static  String S_GroupCustId = "GROUP_CUST_ID";
  public final static  String S_M12MemberCounts = "M12_MEMBER_COUNTS";
  public final static  String S_FeeTakeRate = "FEE_TAKE_RATE";
  public final static  String S_OpTime = "OP_TIME";
  public final static  String S_MemTakeRate = "MEM_TAKE_RATE";
  public final static  String S_CountyId = "COUNTY_ID";
  public final static  String S_CurTotalFee = "CUR_TOTAL_FEE";
  public final static  String S_M12UnionFee = "M12_UNION_FEE";


public double getCurUnionFee();

public int getGroupLevel();

public String getCityId();

public int getIsValid();

public double getTotalLeftRate();

public int getProdTotalNum();

public String getGroupName();

public double getIncomingChg();

public int getStatisticMonth();

public String getGroupLeftMonth();

public double getM12MemFee();

public double getMemVpmnRate();

public int getIncomingDownFlag();

public double getM12TotalFee();

public long getTotalLeftCounts();

public double getCurMemFee();

public String getManagerName();

public double getMemCoverRate();

public long getTotalCounts();

public long getGroupCustId();

public long getM12MemberCounts();

public double getFeeTakeRate();

public Timestamp getOpTime();

public double getMemTakeRate();

public String getCountyId();

public double getCurTotalFee();

public double getM12UnionFee();


public  void setCurUnionFee(double value);

public  void setGroupLevel(int value);

public  void setCityId(String value);

public  void setIsValid(int value);

public  void setTotalLeftRate(double value);

public  void setProdTotalNum(int value);

public  void setGroupName(String value);

public  void setIncomingChg(double value);

public  void setStatisticMonth(int value);

public  void setGroupLeftMonth(String value);

public  void setM12MemFee(double value);

public  void setMemVpmnRate(double value);

public  void setIncomingDownFlag(int value);

public  void setM12TotalFee(double value);

public  void setTotalLeftCounts(long value);

public  void setCurMemFee(double value);

public  void setManagerName(String value);

public  void setMemCoverRate(double value);

public  void setTotalCounts(long value);

public  void setGroupCustId(long value);

public  void setM12MemberCounts(long value);

public  void setFeeTakeRate(double value);

public  void setOpTime(Timestamp value);

public  void setMemTakeRate(double value);

public  void setCountyId(String value);

public  void setCurTotalFee(double value);

public  void setM12UnionFee(double value);
}
