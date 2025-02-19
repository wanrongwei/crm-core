package com.asiainfo.crm.cm.customer.group.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.customer.group.ivalues.*;

public class BOCmRepOnceIncomeBusiBean extends DataContainer implements DataContainerInterface,IBOCmRepOnceIncomeBusiValue{

  private static String  m_boName = "com.asiainfo.crm.cm.customer.group.bo.BOCmRepOnceIncomeBusi";



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

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmRepOnceIncomeBusiBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initEndMonth(String value){
     this.initProperty(S_EndMonth,value);
  }
  public  void setEndMonth(String value){
     this.set(S_EndMonth,value);
  }
  public  void setEndMonthNull(){
     this.set(S_EndMonth,null);
  }

  public String getEndMonth(){
       return DataType.getAsString(this.get(S_EndMonth));
  
  }
  public String getEndMonthInitialValue(){
        return DataType.getAsString(this.getOldObj(S_EndMonth));
      }

  public void initPlanType(long value){
     this.initProperty(S_PlanType,new Long(value));
  }
  public  void setPlanType(long value){
     this.set(S_PlanType,new Long(value));
  }
  public  void setPlanTypeNull(){
     this.set(S_PlanType,null);
  }

  public long getPlanType(){
        return DataType.getAsLong(this.get(S_PlanType));
  
  }
  public long getPlanTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_PlanType));
      }

  public void initFeeType(long value){
     this.initProperty(S_FeeType,new Long(value));
  }
  public  void setFeeType(long value){
     this.set(S_FeeType,new Long(value));
  }
  public  void setFeeTypeNull(){
     this.set(S_FeeType,null);
  }

  public long getFeeType(){
        return DataType.getAsLong(this.get(S_FeeType));
  
  }
  public long getFeeTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_FeeType));
      }

  public void initTotalFee(double value){
     this.initProperty(S_TotalFee,new Double(value));
  }
  public  void setTotalFee(double value){
     this.set(S_TotalFee,new Double(value));
  }
  public  void setTotalFeeNull(){
     this.set(S_TotalFee,null);
  }

  public double getTotalFee(){
        return DataType.getAsDouble(this.get(S_TotalFee));
  
  }
  public double getTotalFeeInitialValue(){
        return DataType.getAsDouble(this.getOldObj(S_TotalFee));
      }

  public void initAccRealIncome(double value){
     this.initProperty(S_AccRealIncome,new Double(value));
  }
  public  void setAccRealIncome(double value){
     this.set(S_AccRealIncome,new Double(value));
  }
  public  void setAccRealIncomeNull(){
     this.set(S_AccRealIncome,null);
  }

  public double getAccRealIncome(){
        return DataType.getAsDouble(this.get(S_AccRealIncome));
  
  }
  public double getAccRealIncomeInitialValue(){
        return DataType.getAsDouble(this.getOldObj(S_AccRealIncome));
      }

  public void initMonthRealIncome(double value){
     this.initProperty(S_MonthRealIncome,new Double(value));
  }
  public  void setMonthRealIncome(double value){
     this.set(S_MonthRealIncome,new Double(value));
  }
  public  void setMonthRealIncomeNull(){
     this.set(S_MonthRealIncome,null);
  }

  public double getMonthRealIncome(){
        return DataType.getAsDouble(this.get(S_MonthRealIncome));
  
  }
  public double getMonthRealIncomeInitialValue(){
        return DataType.getAsDouble(this.getOldObj(S_MonthRealIncome));
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

  public void initFinanceId(String value){
     this.initProperty(S_FinanceId,value);
  }
  public  void setFinanceId(String value){
     this.set(S_FinanceId,value);
  }
  public  void setFinanceIdNull(){
     this.set(S_FinanceId,null);
  }

  public String getFinanceId(){
       return DataType.getAsString(this.get(S_FinanceId));
  
  }
  public String getFinanceIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FinanceId));
      }

  public void initContractId(String value){
     this.initProperty(S_ContractId,value);
  }
  public  void setContractId(String value){
     this.set(S_ContractId,value);
  }
  public  void setContractIdNull(){
     this.set(S_ContractId,null);
  }

  public String getContractId(){
       return DataType.getAsString(this.get(S_ContractId));
  
  }
  public String getContractIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContractId));
      }

  public void initContractDate(Timestamp value){
     this.initProperty(S_ContractDate,value);
  }
  public  void setContractDate(Timestamp value){
     this.set(S_ContractDate,value);
  }
  public  void setContractDateNull(){
     this.set(S_ContractDate,null);
  }

  public Timestamp getContractDate(){
        return DataType.getAsDateTime(this.get(S_ContractDate));
  
  }
  public Timestamp getContractDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_ContractDate));
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

  public void initGroupId(long value){
     this.initProperty(S_GroupId,new Long(value));
  }
  public  void setGroupId(long value){
     this.set(S_GroupId,new Long(value));
  }
  public  void setGroupIdNull(){
     this.set(S_GroupId,null);
  }

  public long getGroupId(){
        return DataType.getAsLong(this.get(S_GroupId));
  
  }
  public long getGroupIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_GroupId));
      }

  public void initGroupCity(String value){
     this.initProperty(S_GroupCity,value);
  }
  public  void setGroupCity(String value){
     this.set(S_GroupCity,value);
  }
  public  void setGroupCityNull(){
     this.set(S_GroupCity,null);
  }

  public String getGroupCity(){
       return DataType.getAsString(this.get(S_GroupCity));
  
  }
  public String getGroupCityInitialValue(){
        return DataType.getAsString(this.getOldObj(S_GroupCity));
      }

  public void initBeginMonth(String value){
     this.initProperty(S_BeginMonth,value);
  }
  public  void setBeginMonth(String value){
     this.set(S_BeginMonth,value);
  }
  public  void setBeginMonthNull(){
     this.set(S_BeginMonth,null);
  }

  public String getBeginMonth(){
       return DataType.getAsString(this.get(S_BeginMonth));
  
  }
  public String getBeginMonthInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BeginMonth));
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

  public void initRegionType(String value){
     this.initProperty(S_RegionType,value);
  }
  public  void setRegionType(String value){
     this.set(S_RegionType,value);
  }
  public  void setRegionTypeNull(){
     this.set(S_RegionType,null);
  }

  public String getRegionType(){
       return DataType.getAsString(this.get(S_RegionType));
  
  }
  public String getRegionTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_RegionType));
      }

  public void initStatMonth(String value){
     this.initProperty(S_StatMonth,value);
  }
  public  void setStatMonth(String value){
     this.set(S_StatMonth,value);
  }
  public  void setStatMonthNull(){
     this.set(S_StatMonth,null);
  }

  public String getStatMonth(){
       return DataType.getAsString(this.get(S_StatMonth));
  
  }
  public String getStatMonthInitialValue(){
        return DataType.getAsString(this.getOldObj(S_StatMonth));
      }

  public void initMonthAppIncome(double value){
     this.initProperty(S_MonthAppIncome,new Double(value));
  }
  public  void setMonthAppIncome(double value){
     this.set(S_MonthAppIncome,new Double(value));
  }
  public  void setMonthAppIncomeNull(){
     this.set(S_MonthAppIncome,null);
  }

  public double getMonthAppIncome(){
        return DataType.getAsDouble(this.get(S_MonthAppIncome));
  
  }
  public double getMonthAppIncomeInitialValue(){
        return DataType.getAsDouble(this.getOldObj(S_MonthAppIncome));
      }

  public void initRecStatus(int value){
     this.initProperty(S_RecStatus,new Integer(value));
  }
  public  void setRecStatus(int value){
     this.set(S_RecStatus,new Integer(value));
  }
  public  void setRecStatusNull(){
     this.set(S_RecStatus,null);
  }

  public int getRecStatus(){
        return DataType.getAsInt(this.get(S_RecStatus));
  
  }
  public int getRecStatusInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_RecStatus));
      }

  public void initManagerId(long value){
     this.initProperty(S_ManagerId,new Long(value));
  }
  public  void setManagerId(long value){
     this.set(S_ManagerId,new Long(value));
  }
  public  void setManagerIdNull(){
     this.set(S_ManagerId,null);
  }

  public long getManagerId(){
        return DataType.getAsLong(this.get(S_ManagerId));
  
  }
  public long getManagerIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ManagerId));
      }

  public void initOpName(String value){
     this.initProperty(S_OpName,value);
  }
  public  void setOpName(String value){
     this.set(S_OpName,value);
  }
  public  void setOpNameNull(){
     this.set(S_OpName,null);
  }

  public String getOpName(){
       return DataType.getAsString(this.get(S_OpName));
  
  }
  public String getOpNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OpName));
      }

  public void initBillId(String value){
     this.initProperty(S_BillId,value);
  }
  public  void setBillId(String value){
     this.set(S_BillId,value);
  }
  public  void setBillIdNull(){
     this.set(S_BillId,null);
  }

  public String getBillId(){
       return DataType.getAsString(this.get(S_BillId));
  
  }
  public String getBillIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BillId));
      }

  public void initIsNew(int value){
     this.initProperty(S_IsNew,new Integer(value));
  }
  public  void setIsNew(int value){
     this.set(S_IsNew,new Integer(value));
  }
  public  void setIsNewNull(){
     this.set(S_IsNew,null);
  }

  public int getIsNew(){
        return DataType.getAsInt(this.get(S_IsNew));
  
  }
  public int getIsNewInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IsNew));
      }

  public void initAccessNo(String value){
     this.initProperty(S_AccessNo,value);
  }
  public  void setAccessNo(String value){
     this.set(S_AccessNo,value);
  }
  public  void setAccessNoNull(){
     this.set(S_AccessNo,null);
  }

  public String getAccessNo(){
       return DataType.getAsString(this.get(S_AccessNo));
  
  }
  public String getAccessNoInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AccessNo));
      }

  public void initOnceIncomeId(long value){
     this.initProperty(S_OnceIncomeId,new Long(value));
  }
  public  void setOnceIncomeId(long value){
     this.set(S_OnceIncomeId,new Long(value));
  }
  public  void setOnceIncomeIdNull(){
     this.set(S_OnceIncomeId,null);
  }

  public long getOnceIncomeId(){
        return DataType.getAsLong(this.get(S_OnceIncomeId));
  
  }
  public long getOnceIncomeIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_OnceIncomeId));
      }

  public void initAccAppIncome(double value){
     this.initProperty(S_AccAppIncome,new Double(value));
  }
  public  void setAccAppIncome(double value){
     this.set(S_AccAppIncome,new Double(value));
  }
  public  void setAccAppIncomeNull(){
     this.set(S_AccAppIncome,null);
  }

  public double getAccAppIncome(){
        return DataType.getAsDouble(this.get(S_AccAppIncome));
  
  }
  public double getAccAppIncomeInitialValue(){
        return DataType.getAsDouble(this.getOldObj(S_AccAppIncome));
      }


 
 }

