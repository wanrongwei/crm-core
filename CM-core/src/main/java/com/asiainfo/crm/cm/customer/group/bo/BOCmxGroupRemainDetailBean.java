package com.asiainfo.crm.cm.customer.group.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.customer.group.ivalues.*;

public class BOCmxGroupRemainDetailBean extends DataContainer implements DataContainerInterface,IBOCmxGroupRemainDetailValue{

  private static String  m_boName = "com.asiainfo.crm.cm.customer.group.bo.BOCmxGroupRemainDetail";



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

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmxGroupRemainDetailBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initCurUnionFee(double value){
     this.initProperty(S_CurUnionFee,new Double(value));
  }
  public  void setCurUnionFee(double value){
     this.set(S_CurUnionFee,new Double(value));
  }
  public  void setCurUnionFeeNull(){
     this.set(S_CurUnionFee,null);
  }

  public double getCurUnionFee(){
        return DataType.getAsDouble(this.get(S_CurUnionFee));
  
  }
  public double getCurUnionFeeInitialValue(){
        return DataType.getAsDouble(this.getOldObj(S_CurUnionFee));
      }

  public void initGroupLevel(int value){
     this.initProperty(S_GroupLevel,new Integer(value));
  }
  public  void setGroupLevel(int value){
     this.set(S_GroupLevel,new Integer(value));
  }
  public  void setGroupLevelNull(){
     this.set(S_GroupLevel,null);
  }

  public int getGroupLevel(){
        return DataType.getAsInt(this.get(S_GroupLevel));
  
  }
  public int getGroupLevelInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_GroupLevel));
      }

  public void initCityId(String value){
     this.initProperty(S_CityId,value);
  }
  public  void setCityId(String value){
     this.set(S_CityId,value);
  }
  public  void setCityIdNull(){
     this.set(S_CityId,null);
  }

  public String getCityId(){
       return DataType.getAsString(this.get(S_CityId));
  
  }
  public String getCityIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CityId));
      }

  public void initIsValid(int value){
     this.initProperty(S_IsValid,new Integer(value));
  }
  public  void setIsValid(int value){
     this.set(S_IsValid,new Integer(value));
  }
  public  void setIsValidNull(){
     this.set(S_IsValid,null);
  }

  public int getIsValid(){
        return DataType.getAsInt(this.get(S_IsValid));
  
  }
  public int getIsValidInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IsValid));
      }

  public void initTotalLeftRate(double value){
     this.initProperty(S_TotalLeftRate,new Double(value));
  }
  public  void setTotalLeftRate(double value){
     this.set(S_TotalLeftRate,new Double(value));
  }
  public  void setTotalLeftRateNull(){
     this.set(S_TotalLeftRate,null);
  }

  public double getTotalLeftRate(){
        return DataType.getAsDouble(this.get(S_TotalLeftRate));
  
  }
  public double getTotalLeftRateInitialValue(){
        return DataType.getAsDouble(this.getOldObj(S_TotalLeftRate));
      }

  public void initProdTotalNum(int value){
     this.initProperty(S_ProdTotalNum,new Integer(value));
  }
  public  void setProdTotalNum(int value){
     this.set(S_ProdTotalNum,new Integer(value));
  }
  public  void setProdTotalNumNull(){
     this.set(S_ProdTotalNum,null);
  }

  public int getProdTotalNum(){
        return DataType.getAsInt(this.get(S_ProdTotalNum));
  
  }
  public int getProdTotalNumInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ProdTotalNum));
      }

  public void initGroupName(String value){
     this.initProperty(S_GroupName,value);
  }
  public  void setGroupName(String value){
     this.set(S_GroupName,value);
  }
  public  void setGroupNameNull(){
     this.set(S_GroupName,null);
  }

  public String getGroupName(){
       return DataType.getAsString(this.get(S_GroupName));
  
  }
  public String getGroupNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_GroupName));
      }

  public void initIncomingChg(double value){
     this.initProperty(S_IncomingChg,new Double(value));
  }
  public  void setIncomingChg(double value){
     this.set(S_IncomingChg,new Double(value));
  }
  public  void setIncomingChgNull(){
     this.set(S_IncomingChg,null);
  }

  public double getIncomingChg(){
        return DataType.getAsDouble(this.get(S_IncomingChg));
  
  }
  public double getIncomingChgInitialValue(){
        return DataType.getAsDouble(this.getOldObj(S_IncomingChg));
      }

  public void initStatisticMonth(int value){
     this.initProperty(S_StatisticMonth,new Integer(value));
  }
  public  void setStatisticMonth(int value){
     this.set(S_StatisticMonth,new Integer(value));
  }
  public  void setStatisticMonthNull(){
     this.set(S_StatisticMonth,null);
  }

  public int getStatisticMonth(){
        return DataType.getAsInt(this.get(S_StatisticMonth));
  
  }
  public int getStatisticMonthInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_StatisticMonth));
      }

  public void initGroupLeftMonth(String value){
     this.initProperty(S_GroupLeftMonth,value);
  }
  public  void setGroupLeftMonth(String value){
     this.set(S_GroupLeftMonth,value);
  }
  public  void setGroupLeftMonthNull(){
     this.set(S_GroupLeftMonth,null);
  }

  public String getGroupLeftMonth(){
       return DataType.getAsString(this.get(S_GroupLeftMonth));
  
  }
  public String getGroupLeftMonthInitialValue(){
        return DataType.getAsString(this.getOldObj(S_GroupLeftMonth));
      }

  public void initM12MemFee(double value){
     this.initProperty(S_M12MemFee,new Double(value));
  }
  public  void setM12MemFee(double value){
     this.set(S_M12MemFee,new Double(value));
  }
  public  void setM12MemFeeNull(){
     this.set(S_M12MemFee,null);
  }

  public double getM12MemFee(){
        return DataType.getAsDouble(this.get(S_M12MemFee));
  
  }
  public double getM12MemFeeInitialValue(){
        return DataType.getAsDouble(this.getOldObj(S_M12MemFee));
      }

  public void initMemVpmnRate(double value){
     this.initProperty(S_MemVpmnRate,new Double(value));
  }
  public  void setMemVpmnRate(double value){
     this.set(S_MemVpmnRate,new Double(value));
  }
  public  void setMemVpmnRateNull(){
     this.set(S_MemVpmnRate,null);
  }

  public double getMemVpmnRate(){
        return DataType.getAsDouble(this.get(S_MemVpmnRate));
  
  }
  public double getMemVpmnRateInitialValue(){
        return DataType.getAsDouble(this.getOldObj(S_MemVpmnRate));
      }

  public void initIncomingDownFlag(int value){
     this.initProperty(S_IncomingDownFlag,new Integer(value));
  }
  public  void setIncomingDownFlag(int value){
     this.set(S_IncomingDownFlag,new Integer(value));
  }
  public  void setIncomingDownFlagNull(){
     this.set(S_IncomingDownFlag,null);
  }

  public int getIncomingDownFlag(){
        return DataType.getAsInt(this.get(S_IncomingDownFlag));
  
  }
  public int getIncomingDownFlagInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IncomingDownFlag));
      }

  public void initM12TotalFee(double value){
     this.initProperty(S_M12TotalFee,new Double(value));
  }
  public  void setM12TotalFee(double value){
     this.set(S_M12TotalFee,new Double(value));
  }
  public  void setM12TotalFeeNull(){
     this.set(S_M12TotalFee,null);
  }

  public double getM12TotalFee(){
        return DataType.getAsDouble(this.get(S_M12TotalFee));
  
  }
  public double getM12TotalFeeInitialValue(){
        return DataType.getAsDouble(this.getOldObj(S_M12TotalFee));
      }

  public void initTotalLeftCounts(long value){
     this.initProperty(S_TotalLeftCounts,new Long(value));
  }
  public  void setTotalLeftCounts(long value){
     this.set(S_TotalLeftCounts,new Long(value));
  }
  public  void setTotalLeftCountsNull(){
     this.set(S_TotalLeftCounts,null);
  }

  public long getTotalLeftCounts(){
        return DataType.getAsLong(this.get(S_TotalLeftCounts));
  
  }
  public long getTotalLeftCountsInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_TotalLeftCounts));
      }

  public void initCurMemFee(double value){
     this.initProperty(S_CurMemFee,new Double(value));
  }
  public  void setCurMemFee(double value){
     this.set(S_CurMemFee,new Double(value));
  }
  public  void setCurMemFeeNull(){
     this.set(S_CurMemFee,null);
  }

  public double getCurMemFee(){
        return DataType.getAsDouble(this.get(S_CurMemFee));
  
  }
  public double getCurMemFeeInitialValue(){
        return DataType.getAsDouble(this.getOldObj(S_CurMemFee));
      }

  public void initManagerName(String value){
     this.initProperty(S_ManagerName,value);
  }
  public  void setManagerName(String value){
     this.set(S_ManagerName,value);
  }
  public  void setManagerNameNull(){
     this.set(S_ManagerName,null);
  }

  public String getManagerName(){
       return DataType.getAsString(this.get(S_ManagerName));
  
  }
  public String getManagerNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ManagerName));
      }

  public void initMemCoverRate(double value){
     this.initProperty(S_MemCoverRate,new Double(value));
  }
  public  void setMemCoverRate(double value){
     this.set(S_MemCoverRate,new Double(value));
  }
  public  void setMemCoverRateNull(){
     this.set(S_MemCoverRate,null);
  }

  public double getMemCoverRate(){
        return DataType.getAsDouble(this.get(S_MemCoverRate));
  
  }
  public double getMemCoverRateInitialValue(){
        return DataType.getAsDouble(this.getOldObj(S_MemCoverRate));
      }

  public void initTotalCounts(long value){
     this.initProperty(S_TotalCounts,new Long(value));
  }
  public  void setTotalCounts(long value){
     this.set(S_TotalCounts,new Long(value));
  }
  public  void setTotalCountsNull(){
     this.set(S_TotalCounts,null);
  }

  public long getTotalCounts(){
        return DataType.getAsLong(this.get(S_TotalCounts));
  
  }
  public long getTotalCountsInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_TotalCounts));
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

  public void initM12MemberCounts(long value){
     this.initProperty(S_M12MemberCounts,new Long(value));
  }
  public  void setM12MemberCounts(long value){
     this.set(S_M12MemberCounts,new Long(value));
  }
  public  void setM12MemberCountsNull(){
     this.set(S_M12MemberCounts,null);
  }

  public long getM12MemberCounts(){
        return DataType.getAsLong(this.get(S_M12MemberCounts));
  
  }
  public long getM12MemberCountsInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_M12MemberCounts));
      }

  public void initFeeTakeRate(double value){
     this.initProperty(S_FeeTakeRate,new Double(value));
  }
  public  void setFeeTakeRate(double value){
     this.set(S_FeeTakeRate,new Double(value));
  }
  public  void setFeeTakeRateNull(){
     this.set(S_FeeTakeRate,null);
  }

  public double getFeeTakeRate(){
        return DataType.getAsDouble(this.get(S_FeeTakeRate));
  
  }
  public double getFeeTakeRateInitialValue(){
        return DataType.getAsDouble(this.getOldObj(S_FeeTakeRate));
      }

  public void initOpTime(Timestamp value){
     this.initProperty(S_OpTime,value);
  }
  public  void setOpTime(Timestamp value){
     this.set(S_OpTime,value);
  }
  public  void setOpTimeNull(){
     this.set(S_OpTime,null);
  }

  public Timestamp getOpTime(){
        return DataType.getAsDateTime(this.get(S_OpTime));
  
  }
  public Timestamp getOpTimeInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_OpTime));
      }

  public void initMemTakeRate(double value){
     this.initProperty(S_MemTakeRate,new Double(value));
  }
  public  void setMemTakeRate(double value){
     this.set(S_MemTakeRate,new Double(value));
  }
  public  void setMemTakeRateNull(){
     this.set(S_MemTakeRate,null);
  }

  public double getMemTakeRate(){
        return DataType.getAsDouble(this.get(S_MemTakeRate));
  
  }
  public double getMemTakeRateInitialValue(){
        return DataType.getAsDouble(this.getOldObj(S_MemTakeRate));
      }

  public void initCountyId(String value){
     this.initProperty(S_CountyId,value);
  }
  public  void setCountyId(String value){
     this.set(S_CountyId,value);
  }
  public  void setCountyIdNull(){
     this.set(S_CountyId,null);
  }

  public String getCountyId(){
       return DataType.getAsString(this.get(S_CountyId));
  
  }
  public String getCountyIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CountyId));
      }

  public void initCurTotalFee(double value){
     this.initProperty(S_CurTotalFee,new Double(value));
  }
  public  void setCurTotalFee(double value){
     this.set(S_CurTotalFee,new Double(value));
  }
  public  void setCurTotalFeeNull(){
     this.set(S_CurTotalFee,null);
  }

  public double getCurTotalFee(){
        return DataType.getAsDouble(this.get(S_CurTotalFee));
  
  }
  public double getCurTotalFeeInitialValue(){
        return DataType.getAsDouble(this.getOldObj(S_CurTotalFee));
      }

  public void initM12UnionFee(double value){
     this.initProperty(S_M12UnionFee,new Double(value));
  }
  public  void setM12UnionFee(double value){
     this.set(S_M12UnionFee,new Double(value));
  }
  public  void setM12UnionFeeNull(){
     this.set(S_M12UnionFee,null);
  }

  public double getM12UnionFee(){
        return DataType.getAsDouble(this.get(S_M12UnionFee));
  
  }
  public double getM12UnionFeeInitialValue(){
        return DataType.getAsDouble(this.getOldObj(S_M12UnionFee));
      }


 
 }

