package com.asiainfo.crm.cm.customer.group.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.customer.group.ivalues.*;

public class BOCmGroupCustScoreBean extends DataContainer implements DataContainerInterface,IBOCmGroupCustScoreValue{

  private static String  m_boName = "com.asiainfo.crm.cm.customer.group.bo.BOCmGroupCustScore";



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

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmGroupCustScoreBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initState(String value){
     this.initProperty(S_State,value);
  }
  public  void setState(String value){
     this.set(S_State,value);
  }
  public  void setStateNull(){
     this.set(S_State,null);
  }

  public String getState(){
       return DataType.getAsString(this.get(S_State));
  
  }
  public String getStateInitialValue(){
        return DataType.getAsString(this.getOldObj(S_State));
      }

  public void initGroupInfoFee(long value){
     this.initProperty(S_GroupInfoFee,new Long(value));
  }
  public  void setGroupInfoFee(long value){
     this.set(S_GroupInfoFee,new Long(value));
  }
  public  void setGroupInfoFeeNull(){
     this.set(S_GroupInfoFee,null);
  }

  public long getGroupInfoFee(){
        return DataType.getAsLong(this.get(S_GroupInfoFee));
  
  }
  public long getGroupInfoFeeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_GroupInfoFee));
      }

  public void initGroupUpayFee(long value){
     this.initProperty(S_GroupUpayFee,new Long(value));
  }
  public  void setGroupUpayFee(long value){
     this.set(S_GroupUpayFee,new Long(value));
  }
  public  void setGroupUpayFeeNull(){
     this.set(S_GroupUpayFee,null);
  }

  public long getGroupUpayFee(){
        return DataType.getAsLong(this.get(S_GroupUpayFee));
  
  }
  public long getGroupUpayFeeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_GroupUpayFee));
      }

  public void initAreaScaleRankRank(int value){
     this.initProperty(S_AreaScaleRankRank,new Integer(value));
  }
  public  void setAreaScaleRankRank(int value){
     this.set(S_AreaScaleRankRank,new Integer(value));
  }
  public  void setAreaScaleRankRankNull(){
     this.set(S_AreaScaleRankRank,null);
  }

  public int getAreaScaleRankRank(){
        return DataType.getAsInt(this.get(S_AreaScaleRankRank));
  
  }
  public int getAreaScaleRankRankInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_AreaScaleRankRank));
      }

  public void initTradeScaleRank(long value){
     this.initProperty(S_TradeScaleRank,new Long(value));
  }
  public  void setTradeScaleRank(long value){
     this.set(S_TradeScaleRank,new Long(value));
  }
  public  void setTradeScaleRankNull(){
     this.set(S_TradeScaleRank,null);
  }

  public long getTradeScaleRank(){
        return DataType.getAsLong(this.get(S_TradeScaleRank));
  
  }
  public long getTradeScaleRankInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_TradeScaleRank));
      }

  public void initEmployeeNumScore(int value){
     this.initProperty(S_EmployeeNumScore,new Integer(value));
  }
  public  void setEmployeeNumScore(int value){
     this.set(S_EmployeeNumScore,new Integer(value));
  }
  public  void setEmployeeNumScoreNull(){
     this.set(S_EmployeeNumScore,null);
  }

  public int getEmployeeNumScore(){
        return DataType.getAsInt(this.get(S_EmployeeNumScore));
  
  }
  public int getEmployeeNumScoreInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_EmployeeNumScore));
      }

  public void initGroupConsumptionFee(long value){
     this.initProperty(S_GroupConsumptionFee,new Long(value));
  }
  public  void setGroupConsumptionFee(long value){
     this.set(S_GroupConsumptionFee,new Long(value));
  }
  public  void setGroupConsumptionFeeNull(){
     this.set(S_GroupConsumptionFee,null);
  }

  public long getGroupConsumptionFee(){
        return DataType.getAsLong(this.get(S_GroupConsumptionFee));
  
  }
  public long getGroupConsumptionFeeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_GroupConsumptionFee));
      }

  public void initYear(int value){
     this.initProperty(S_Year,new Integer(value));
  }
  public  void setYear(int value){
     this.set(S_Year,new Integer(value));
  }
  public  void setYearNull(){
     this.set(S_Year,null);
  }

  public int getYear(){
        return DataType.getAsInt(this.get(S_Year));
  
  }
  public int getYearInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_Year));
      }

  public void initPlanNumScore(int value){
     this.initProperty(S_PlanNumScore,new Integer(value));
  }
  public  void setPlanNumScore(int value){
     this.set(S_PlanNumScore,new Integer(value));
  }
  public  void setPlanNumScoreNull(){
     this.set(S_PlanNumScore,null);
  }

  public int getPlanNumScore(){
        return DataType.getAsInt(this.get(S_PlanNumScore));
  
  }
  public int getPlanNumScoreInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_PlanNumScore));
      }

  public void initEmployeeNum(long value){
     this.initProperty(S_EmployeeNum,new Long(value));
  }
  public  void setEmployeeNum(long value){
     this.set(S_EmployeeNum,new Long(value));
  }
  public  void setEmployeeNumNull(){
     this.set(S_EmployeeNum,null);
  }

  public long getEmployeeNum(){
        return DataType.getAsLong(this.get(S_EmployeeNum));
  
  }
  public long getEmployeeNumInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_EmployeeNum));
      }

  public void initVipNumScore(int value){
     this.initProperty(S_VipNumScore,new Integer(value));
  }
  public  void setVipNumScore(int value){
     this.set(S_VipNumScore,new Integer(value));
  }
  public  void setVipNumScoreNull(){
     this.set(S_VipNumScore,null);
  }

  public int getVipNumScore(){
        return DataType.getAsInt(this.get(S_VipNumScore));
  
  }
  public int getVipNumScoreInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_VipNumScore));
      }

  public void initCreateOpId(long value){
     this.initProperty(S_CreateOpId,new Long(value));
  }
  public  void setCreateOpId(long value){
     this.set(S_CreateOpId,new Long(value));
  }
  public  void setCreateOpIdNull(){
     this.set(S_CreateOpId,null);
  }

  public long getCreateOpId(){
        return DataType.getAsLong(this.get(S_CreateOpId));
  
  }
  public long getCreateOpIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CreateOpId));
      }

  public void initAreaScaleRank(long value){
     this.initProperty(S_AreaScaleRank,new Long(value));
  }
  public  void setAreaScaleRank(long value){
     this.set(S_AreaScaleRank,new Long(value));
  }
  public  void setAreaScaleRankNull(){
     this.set(S_AreaScaleRank,null);
  }

  public long getAreaScaleRank(){
        return DataType.getAsLong(this.get(S_AreaScaleRank));
  
  }
  public long getAreaScaleRankInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_AreaScaleRank));
      }

  public void initPlanNum(long value){
     this.initProperty(S_PlanNum,new Long(value));
  }
  public  void setPlanNum(long value){
     this.set(S_PlanNum,new Long(value));
  }
  public  void setPlanNumNull(){
     this.set(S_PlanNum,null);
  }

  public long getPlanNum(){
        return DataType.getAsLong(this.get(S_PlanNum));
  
  }
  public long getPlanNumInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_PlanNum));
      }

  public void initGwFee(long value){
     this.initProperty(S_GwFee,new Long(value));
  }
  public  void setGwFee(long value){
     this.set(S_GwFee,new Long(value));
  }
  public  void setGwFeeNull(){
     this.set(S_GwFee,null);
  }

  public long getGwFee(){
        return DataType.getAsLong(this.get(S_GwFee));
  
  }
  public long getGwFeeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_GwFee));
      }

  public void initGroupInfoFeeScore(int value){
     this.initProperty(S_GroupInfoFeeScore,new Integer(value));
  }
  public  void setGroupInfoFeeScore(int value){
     this.set(S_GroupInfoFeeScore,new Integer(value));
  }
  public  void setGroupInfoFeeScoreNull(){
     this.set(S_GroupInfoFeeScore,null);
  }

  public int getGroupInfoFeeScore(){
        return DataType.getAsInt(this.get(S_GroupInfoFeeScore));
  
  }
  public int getGroupInfoFeeScoreInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_GroupInfoFeeScore));
      }

  public void initDoneCode(long value){
     this.initProperty(S_DoneCode,new Long(value));
  }
  public  void setDoneCode(long value){
     this.set(S_DoneCode,new Long(value));
  }
  public  void setDoneCodeNull(){
     this.set(S_DoneCode,null);
  }

  public long getDoneCode(){
        return DataType.getAsLong(this.get(S_DoneCode));
  
  }
  public long getDoneCodeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_DoneCode));
      }

  public void initTradeAddScore(int value){
     this.initProperty(S_TradeAddScore,new Integer(value));
  }
  public  void setTradeAddScore(int value){
     this.set(S_TradeAddScore,new Integer(value));
  }
  public  void setTradeAddScoreNull(){
     this.set(S_TradeAddScore,null);
  }

  public int getTradeAddScore(){
        return DataType.getAsInt(this.get(S_TradeAddScore));
  
  }
  public int getTradeAddScoreInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_TradeAddScore));
      }

  public void initNotes(String value){
     this.initProperty(S_Notes,value);
  }
  public  void setNotes(String value){
     this.set(S_Notes,value);
  }
  public  void setNotesNull(){
     this.set(S_Notes,null);
  }

  public String getNotes(){
       return DataType.getAsString(this.get(S_Notes));
  
  }
  public String getNotesInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Notes));
      }

  public void initAdjustLevel(int value){
     this.initProperty(S_AdjustLevel,new Integer(value));
  }
  public  void setAdjustLevel(int value){
     this.set(S_AdjustLevel,new Integer(value));
  }
  public  void setAdjustLevelNull(){
     this.set(S_AdjustLevel,null);
  }

  public int getAdjustLevel(){
        return DataType.getAsInt(this.get(S_AdjustLevel));
  
  }
  public int getAdjustLevelInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_AdjustLevel));
      }

  public void initExpireDate(Timestamp value){
     this.initProperty(S_ExpireDate,value);
  }
  public  void setExpireDate(Timestamp value){
     this.set(S_ExpireDate,value);
  }
  public  void setExpireDateNull(){
     this.set(S_ExpireDate,null);
  }

  public Timestamp getExpireDate(){
        return DataType.getAsDateTime(this.get(S_ExpireDate));
  
  }
  public Timestamp getExpireDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_ExpireDate));
      }

  public void initGroupMemFeeScore(int value){
     this.initProperty(S_GroupMemFeeScore,new Integer(value));
  }
  public  void setGroupMemFeeScore(int value){
     this.set(S_GroupMemFeeScore,new Integer(value));
  }
  public  void setGroupMemFeeScoreNull(){
     this.set(S_GroupMemFeeScore,null);
  }

  public int getGroupMemFeeScore(){
        return DataType.getAsInt(this.get(S_GroupMemFeeScore));
  
  }
  public int getGroupMemFeeScoreInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_GroupMemFeeScore));
      }

  public void initOpId(long value){
     this.initProperty(S_OpId,new Long(value));
  }
  public  void setOpId(long value){
     this.set(S_OpId,new Long(value));
  }
  public  void setOpIdNull(){
     this.set(S_OpId,null);
  }

  public long getOpId(){
        return DataType.getAsLong(this.get(S_OpId));
  
  }
  public long getOpIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_OpId));
      }

  public void initEffectiveDate(Timestamp value){
     this.initProperty(S_EffectiveDate,value);
  }
  public  void setEffectiveDate(Timestamp value){
     this.set(S_EffectiveDate,value);
  }
  public  void setEffectiveDateNull(){
     this.set(S_EffectiveDate,null);
  }

  public Timestamp getEffectiveDate(){
        return DataType.getAsDateTime(this.get(S_EffectiveDate));
  
  }
  public Timestamp getEffectiveDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_EffectiveDate));
      }

  public void initVipNum(long value){
     this.initProperty(S_VipNum,new Long(value));
  }
  public  void setVipNum(long value){
     this.set(S_VipNum,new Long(value));
  }
  public  void setVipNumNull(){
     this.set(S_VipNum,null);
  }

  public long getVipNum(){
        return DataType.getAsLong(this.get(S_VipNum));
  
  }
  public long getVipNumInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_VipNum));
      }

  public void initLevRateScore(int value){
     this.initProperty(S_LevRateScore,new Integer(value));
  }
  public  void setLevRateScore(int value){
     this.set(S_LevRateScore,new Integer(value));
  }
  public  void setLevRateScoreNull(){
     this.set(S_LevRateScore,null);
  }

  public int getLevRateScore(){
        return DataType.getAsInt(this.get(S_LevRateScore));
  
  }
  public int getLevRateScoreInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_LevRateScore));
      }

  public void initSignYear(int value){
     this.initProperty(S_SignYear,new Integer(value));
  }
  public  void setSignYear(int value){
     this.set(S_SignYear,new Integer(value));
  }
  public  void setSignYearNull(){
     this.set(S_SignYear,null);
  }

  public int getSignYear(){
        return DataType.getAsInt(this.get(S_SignYear));
  
  }
  public int getSignYearInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_SignYear));
      }

  public void initGroupUpayFeeScore(int value){
     this.initProperty(S_GroupUpayFeeScore,new Integer(value));
  }
  public  void setGroupUpayFeeScore(int value){
     this.set(S_GroupUpayFeeScore,new Integer(value));
  }
  public  void setGroupUpayFeeScoreNull(){
     this.set(S_GroupUpayFeeScore,null);
  }

  public int getGroupUpayFeeScore(){
        return DataType.getAsInt(this.get(S_GroupUpayFeeScore));
  
  }
  public int getGroupUpayFeeScoreInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_GroupUpayFeeScore));
      }

  public void initTradeScaleRankScore(int value){
     this.initProperty(S_TradeScaleRankScore,new Integer(value));
  }
  public  void setTradeScaleRankScore(int value){
     this.set(S_TradeScaleRankScore,new Integer(value));
  }
  public  void setTradeScaleRankScoreNull(){
     this.set(S_TradeScaleRankScore,null);
  }

  public int getTradeScaleRankScore(){
        return DataType.getAsInt(this.get(S_TradeScaleRankScore));
  
  }
  public int getTradeScaleRankScoreInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_TradeScaleRankScore));
      }

  public void initQuarter(int value){
     this.initProperty(S_Quarter,new Integer(value));
  }
  public  void setQuarter(int value){
     this.set(S_Quarter,new Integer(value));
  }
  public  void setQuarterNull(){
     this.set(S_Quarter,null);
  }

  public int getQuarter(){
        return DataType.getAsInt(this.get(S_Quarter));
  
  }
  public int getQuarterInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_Quarter));
      }

  public void initLevRate(int value){
     this.initProperty(S_LevRate,new Integer(value));
  }
  public  void setLevRate(int value){
     this.set(S_LevRate,new Integer(value));
  }
  public  void setLevRateNull(){
     this.set(S_LevRate,null);
  }

  public int getLevRate(){
        return DataType.getAsInt(this.get(S_LevRate));
  
  }
  public int getLevRateInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_LevRate));
      }

  public void initCmccUserNum(int value){
     this.initProperty(S_CmccUserNum,new Integer(value));
  }
  public  void setCmccUserNum(int value){
     this.set(S_CmccUserNum,new Integer(value));
  }
  public  void setCmccUserNumNull(){
     this.set(S_CmccUserNum,null);
  }

  public int getCmccUserNum(){
        return DataType.getAsInt(this.get(S_CmccUserNum));
  
  }
  public int getCmccUserNumInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CmccUserNum));
      }

  public void initGroupMemFee(long value){
     this.initProperty(S_GroupMemFee,new Long(value));
  }
  public  void setGroupMemFee(long value){
     this.set(S_GroupMemFee,new Long(value));
  }
  public  void setGroupMemFeeNull(){
     this.set(S_GroupMemFee,null);
  }

  public long getGroupMemFee(){
        return DataType.getAsLong(this.get(S_GroupMemFee));
  
  }
  public long getGroupMemFeeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_GroupMemFee));
      }

  public void initGroupCustId(long value){
     this.initProperty(S_GroupCustId,new Long(value));
  }
  public  void setGroupCustId(long value){
     this.set(S_GroupCustId,new Long(value));
  }
  public  void setGroupCustIdNull(){
     this.set(S_GroupCustId,null);
  }

  public long getGroupCustId(){
        return DataType.getAsLong(this.get(S_GroupCustId));
  
  }
  public long getGroupCustIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_GroupCustId));
      }

  public void initScoreFlag(int value){
     this.initProperty(S_ScoreFlag,new Integer(value));
  }
  public  void setScoreFlag(int value){
     this.set(S_ScoreFlag,new Integer(value));
  }
  public  void setScoreFlagNull(){
     this.set(S_ScoreFlag,null);
  }

  public int getScoreFlag(){
        return DataType.getAsInt(this.get(S_ScoreFlag));
  
  }
  public int getScoreFlagInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ScoreFlag));
      }

  public void initTradeAddFlag(int value){
     this.initProperty(S_TradeAddFlag,new Integer(value));
  }
  public  void setTradeAddFlag(int value){
     this.set(S_TradeAddFlag,new Integer(value));
  }
  public  void setTradeAddFlagNull(){
     this.set(S_TradeAddFlag,null);
  }

  public int getTradeAddFlag(){
        return DataType.getAsInt(this.get(S_TradeAddFlag));
  
  }
  public int getTradeAddFlagInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_TradeAddFlag));
      }

  public void initTotalScore(int value){
     this.initProperty(S_TotalScore,new Integer(value));
  }
  public  void setTotalScore(int value){
     this.set(S_TotalScore,new Integer(value));
  }
  public  void setTotalScoreNull(){
     this.set(S_TotalScore,null);
  }

  public int getTotalScore(){
        return DataType.getAsInt(this.get(S_TotalScore));
  
  }
  public int getTotalScoreInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_TotalScore));
      }

  public void initOrgId(long value){
     this.initProperty(S_OrgId,new Long(value));
  }
  public  void setOrgId(long value){
     this.set(S_OrgId,new Long(value));
  }
  public  void setOrgIdNull(){
     this.set(S_OrgId,null);
  }

  public long getOrgId(){
        return DataType.getAsLong(this.get(S_OrgId));
  
  }
  public long getOrgIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_OrgId));
      }

  public void initRegionId(String value){
     this.initProperty(S_RegionId,value);
  }
  public  void setRegionId(String value){
     this.set(S_RegionId,value);
  }
  public  void setRegionIdNull(){
     this.set(S_RegionId,null);
  }

  public String getRegionId(){
       return DataType.getAsString(this.get(S_RegionId));
  
  }
  public String getRegionIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_RegionId));
      }

  public void initCreateOrgId(long value){
     this.initProperty(S_CreateOrgId,new Long(value));
  }
  public  void setCreateOrgId(long value){
     this.set(S_CreateOrgId,new Long(value));
  }
  public  void setCreateOrgIdNull(){
     this.set(S_CreateOrgId,null);
  }

  public long getCreateOrgId(){
        return DataType.getAsLong(this.get(S_CreateOrgId));
  
  }
  public long getCreateOrgIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CreateOrgId));
      }

  public void initCmccUserNumScore(int value){
     this.initProperty(S_CmccUserNumScore,new Integer(value));
  }
  public  void setCmccUserNumScore(int value){
     this.set(S_CmccUserNumScore,new Integer(value));
  }
  public  void setCmccUserNumScoreNull(){
     this.set(S_CmccUserNumScore,null);
  }

  public int getCmccUserNumScore(){
        return DataType.getAsInt(this.get(S_CmccUserNumScore));
  
  }
  public int getCmccUserNumScoreInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CmccUserNumScore));
      }

  public void initCurLevel(int value){
     this.initProperty(S_CurLevel,new Integer(value));
  }
  public  void setCurLevel(int value){
     this.set(S_CurLevel,new Integer(value));
  }
  public  void setCurLevelNull(){
     this.set(S_CurLevel,null);
  }

  public int getCurLevel(){
        return DataType.getAsInt(this.get(S_CurLevel));
  
  }
  public int getCurLevelInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CurLevel));
      }

  public void initDoneDate(Timestamp value){
     this.initProperty(S_DoneDate,value);
  }
  public  void setDoneDate(Timestamp value){
     this.set(S_DoneDate,value);
  }
  public  void setDoneDateNull(){
     this.set(S_DoneDate,null);
  }

  public Timestamp getDoneDate(){
        return DataType.getAsDateTime(this.get(S_DoneDate));
  
  }
  public Timestamp getDoneDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_DoneDate));
      }

  public void initGradeFlag(int value){
     this.initProperty(S_GradeFlag,new Integer(value));
  }
  public  void setGradeFlag(int value){
     this.set(S_GradeFlag,new Integer(value));
  }
  public  void setGradeFlagNull(){
     this.set(S_GradeFlag,null);
  }

  public int getGradeFlag(){
        return DataType.getAsInt(this.get(S_GradeFlag));
  
  }
  public int getGradeFlagInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_GradeFlag));
      }

  public void initGroupConsumptionScore(int value){
     this.initProperty(S_GroupConsumptionScore,new Integer(value));
  }
  public  void setGroupConsumptionScore(int value){
     this.set(S_GroupConsumptionScore,new Integer(value));
  }
  public  void setGroupConsumptionScoreNull(){
     this.set(S_GroupConsumptionScore,null);
  }

  public int getGroupConsumptionScore(){
        return DataType.getAsInt(this.get(S_GroupConsumptionScore));
  
  }
  public int getGroupConsumptionScoreInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_GroupConsumptionScore));
      }

  public void initCreateDate(Timestamp value){
     this.initProperty(S_CreateDate,value);
  }
  public  void setCreateDate(Timestamp value){
     this.set(S_CreateDate,value);
  }
  public  void setCreateDateNull(){
     this.set(S_CreateDate,null);
  }

  public Timestamp getCreateDate(){
        return DataType.getAsDateTime(this.get(S_CreateDate));
  
  }
  public Timestamp getCreateDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_CreateDate));
      }

  public void initAdviceLevel(int value){
     this.initProperty(S_AdviceLevel,new Integer(value));
  }
  public  void setAdviceLevel(int value){
     this.set(S_AdviceLevel,new Integer(value));
  }
  public  void setAdviceLevelNull(){
     this.set(S_AdviceLevel,null);
  }

  public int getAdviceLevel(){
        return DataType.getAsInt(this.get(S_AdviceLevel));
  
  }
  public int getAdviceLevelInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_AdviceLevel));
      }

  public void initSignYearScore(int value){
     this.initProperty(S_SignYearScore,new Integer(value));
  }
  public  void setSignYearScore(int value){
     this.set(S_SignYearScore,new Integer(value));
  }
  public  void setSignYearScoreNull(){
     this.set(S_SignYearScore,null);
  }

  public int getSignYearScore(){
        return DataType.getAsInt(this.get(S_SignYearScore));
  
  }
  public int getSignYearScoreInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_SignYearScore));
      }


 
 }

