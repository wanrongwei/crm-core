package com.asiainfo.crm.cm.customer.group.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmGroupCustScoreValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_GroupInfoFee = "GROUP_INFO_FEE";
  public final static  String S_GroupUpayFee = "GROUP_UPAY_FEE";
  public final static  String S_AreaScaleRankRank = "AREA_SCALE_RANK_RANK";
  public final static  String S_TradeScaleRank = "TRADE_SCALE_RANK";
  public final static  String S_EmployeeNumScore = "EMPLOYEE_NUM_SCORE";
  public final static  String S_GroupConsumptionFee = "GROUP_CONSUMPTION_FEE";
  public final static  String S_Year = "YEAR";
  public final static  String S_PlanNumScore = "PLAN_NUM_SCORE";
  public final static  String S_EmployeeNum = "EMPLOYEE_NUM";
  public final static  String S_VipNumScore = "VIP_NUM_SCORE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_AreaScaleRank = "AREA_SCALE_RANK";
  public final static  String S_PlanNum = "PLAN_NUM";
  public final static  String S_GwFee = "GW_FEE";
  public final static  String S_GroupInfoFeeScore = "GROUP_INFO_FEE_SCORE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_TradeAddScore = "TRADE_ADD_SCORE";
  public final static  String S_Notes = "NOTES";
  public final static  String S_AdjustLevel = "ADJUST_LEVEL";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_GroupMemFeeScore = "GROUP_MEM_FEE_SCORE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_VipNum = "VIP_NUM";
  public final static  String S_LevRateScore = "LEV_RATE_SCORE";
  public final static  String S_SignYear = "SIGN_YEAR";
  public final static  String S_GroupUpayFeeScore = "GROUP_UPAY_FEE_SCORE";
  public final static  String S_TradeScaleRankScore = "TRADE_SCALE_RANK_SCORE";
  public final static  String S_Quarter = "QUARTER";
  public final static  String S_LevRate = "LEV_RATE";
  public final static  String S_CmccUserNum = "CMCC_USER_NUM";
  public final static  String S_GroupMemFee = "GROUP_MEM_FEE";
  public final static  String S_GroupCustId = "GROUP_CUST_ID";
  public final static  String S_ScoreFlag = "SCORE_FLAG";
  public final static  String S_TradeAddFlag = "TRADE_ADD_FLAG";
  public final static  String S_TotalScore = "TOTAL_SCORE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_CmccUserNumScore = "CMCC_USER_NUM_SCORE";
  public final static  String S_CurLevel = "CUR_LEVEL";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_GradeFlag = "GRADE_FLAG";
  public final static  String S_GroupConsumptionScore = "GROUP_CONSUMPTION_SCORE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_AdviceLevel = "ADVICE_LEVEL";
  public final static  String S_SignYearScore = "SIGN_YEAR_SCORE";


public String getState();

public long getGroupInfoFee();

public long getGroupUpayFee();

public int getAreaScaleRankRank();

public long getTradeScaleRank();

public int getEmployeeNumScore();

public long getGroupConsumptionFee();

public int getYear();

public int getPlanNumScore();

public long getEmployeeNum();

public int getVipNumScore();

public long getCreateOpId();

public long getAreaScaleRank();

public long getPlanNum();

public long getGwFee();

public int getGroupInfoFeeScore();

public long getDoneCode();

public int getTradeAddScore();

public String getNotes();

public int getAdjustLevel();

public Timestamp getExpireDate();

public int getGroupMemFeeScore();

public long getOpId();

public Timestamp getEffectiveDate();

public long getVipNum();

public int getLevRateScore();

public int getSignYear();

public int getGroupUpayFeeScore();

public int getTradeScaleRankScore();

public int getQuarter();

public int getLevRate();

public int getCmccUserNum();

public long getGroupMemFee();

public long getGroupCustId();

public int getScoreFlag();

public int getTradeAddFlag();

public int getTotalScore();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public int getCmccUserNumScore();

public int getCurLevel();

public Timestamp getDoneDate();

public int getGradeFlag();

public int getGroupConsumptionScore();

public Timestamp getCreateDate();

public int getAdviceLevel();

public int getSignYearScore();


public  void setState(String value);

public  void setGroupInfoFee(long value);

public  void setGroupUpayFee(long value);

public  void setAreaScaleRankRank(int value);

public  void setTradeScaleRank(long value);

public  void setEmployeeNumScore(int value);

public  void setGroupConsumptionFee(long value);

public  void setYear(int value);

public  void setPlanNumScore(int value);

public  void setEmployeeNum(long value);

public  void setVipNumScore(int value);

public  void setCreateOpId(long value);

public  void setAreaScaleRank(long value);

public  void setPlanNum(long value);

public  void setGwFee(long value);

public  void setGroupInfoFeeScore(int value);

public  void setDoneCode(long value);

public  void setTradeAddScore(int value);

public  void setNotes(String value);

public  void setAdjustLevel(int value);

public  void setExpireDate(Timestamp value);

public  void setGroupMemFeeScore(int value);

public  void setOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setVipNum(long value);

public  void setLevRateScore(int value);

public  void setSignYear(int value);

public  void setGroupUpayFeeScore(int value);

public  void setTradeScaleRankScore(int value);

public  void setQuarter(int value);

public  void setLevRate(int value);

public  void setCmccUserNum(int value);

public  void setGroupMemFee(long value);

public  void setGroupCustId(long value);

public  void setScoreFlag(int value);

public  void setTradeAddFlag(int value);

public  void setTotalScore(int value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setCmccUserNumScore(int value);

public  void setCurLevel(int value);

public  void setDoneDate(Timestamp value);

public  void setGradeFlag(int value);

public  void setGroupConsumptionScore(int value);

public  void setCreateDate(Timestamp value);

public  void setAdviceLevel(int value);

public  void setSignYearScore(int value);
}
