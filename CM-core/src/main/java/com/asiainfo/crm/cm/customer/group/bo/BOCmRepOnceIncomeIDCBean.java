package com.asiainfo.crm.cm.customer.group.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.customer.group.ivalues.*;

public class BOCmRepOnceIncomeIDCBean extends DataContainer implements DataContainerInterface,IBOCmRepOnceIncomeIDCValue{

  private static String  m_boName = "com.asiainfo.crm.cm.customer.group.bo.BOCmRepOnceIncomeIDC";



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

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmRepOnceIncomeIDCBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initIsOwing(int value){
     this.initProperty(S_IsOwing,new Integer(value));
  }
  public  void setIsOwing(int value){
     this.set(S_IsOwing,new Integer(value));
  }
  public  void setIsOwingNull(){
     this.set(S_IsOwing,null);
  }

  public int getIsOwing(){
        return DataType.getAsInt(this.get(S_IsOwing));
  
  }
  public int getIsOwingInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IsOwing));
      }

  public void initCurPaidFee(double value){
     this.initProperty(S_CurPaidFee,new Double(value));
  }
  public  void setCurPaidFee(double value){
     this.set(S_CurPaidFee,new Double(value));
  }
  public  void setCurPaidFeeNull(){
     this.set(S_CurPaidFee,null);
  }

  public double getCurPaidFee(){
        return DataType.getAsDouble(this.get(S_CurPaidFee));
  
  }
  public double getCurPaidFeeInitialValue(){
        return DataType.getAsDouble(this.getOldObj(S_CurPaidFee));
      }

  public void initUnpayFee(double value){
     this.initProperty(S_UnpayFee,new Double(value));
  }
  public  void setUnpayFee(double value){
     this.set(S_UnpayFee,new Double(value));
  }
  public  void setUnpayFeeNull(){
     this.set(S_UnpayFee,null);
  }

  public double getUnpayFee(){
        return DataType.getAsDouble(this.get(S_UnpayFee));
  
  }
  public double getUnpayFeeInitialValue(){
        return DataType.getAsDouble(this.getOldObj(S_UnpayFee));
      }

  public void initTotalPaidFee(double value){
     this.initProperty(S_TotalPaidFee,new Double(value));
  }
  public  void setTotalPaidFee(double value){
     this.set(S_TotalPaidFee,new Double(value));
  }
  public  void setTotalPaidFeeNull(){
     this.set(S_TotalPaidFee,null);
  }

  public double getTotalPaidFee(){
        return DataType.getAsDouble(this.get(S_TotalPaidFee));
  
  }
  public double getTotalPaidFeeInitialValue(){
        return DataType.getAsDouble(this.getOldObj(S_TotalPaidFee));
      }

  public void initBusiName(String value){
     this.initProperty(S_BusiName,value);
  }
  public  void setBusiName(String value){
     this.set(S_BusiName,value);
  }
  public  void setBusiNameNull(){
     this.set(S_BusiName,null);
  }

  public String getBusiName(){
       return DataType.getAsString(this.get(S_BusiName));
  
  }
  public String getBusiNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BusiName));
      }

  public void initContractBegDate(String value){
     this.initProperty(S_ContractBegDate,value);
  }
  public  void setContractBegDate(String value){
     this.set(S_ContractBegDate,value);
  }
  public  void setContractBegDateNull(){
     this.set(S_ContractBegDate,null);
  }

  public String getContractBegDate(){
       return DataType.getAsString(this.get(S_ContractBegDate));
  
  }
  public String getContractBegDateInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContractBegDate));
      }

  public void initCurAddRecFee(double value){
     this.initProperty(S_CurAddRecFee,new Double(value));
  }
  public  void setCurAddRecFee(double value){
     this.set(S_CurAddRecFee,new Double(value));
  }
  public  void setCurAddRecFeeNull(){
     this.set(S_CurAddRecFee,null);
  }

  public double getCurAddRecFee(){
        return DataType.getAsDouble(this.get(S_CurAddRecFee));
  
  }
  public double getCurAddRecFeeInitialValue(){
        return DataType.getAsDouble(this.getOldObj(S_CurAddRecFee));
      }

  public void initRecDate(String value){
     this.initProperty(S_RecDate,value);
  }
  public  void setRecDate(String value){
     this.set(S_RecDate,value);
  }
  public  void setRecDateNull(){
     this.set(S_RecDate,null);
  }

  public String getRecDate(){
       return DataType.getAsString(this.get(S_RecDate));
  
  }
  public String getRecDateInitialValue(){
        return DataType.getAsString(this.getOldObj(S_RecDate));
      }

  public void initGroupContactTel(String value){
     this.initProperty(S_GroupContactTel,value);
  }
  public  void setGroupContactTel(String value){
     this.set(S_GroupContactTel,value);
  }
  public  void setGroupContactTelNull(){
     this.set(S_GroupContactTel,null);
  }

  public String getGroupContactTel(){
       return DataType.getAsString(this.get(S_GroupContactTel));
  
  }
  public String getGroupContactTelInitialValue(){
        return DataType.getAsString(this.getOldObj(S_GroupContactTel));
      }

  public void initStatus(int value){
     this.initProperty(S_Status,new Integer(value));
  }
  public  void setStatus(int value){
     this.set(S_Status,new Integer(value));
  }
  public  void setStatusNull(){
     this.set(S_Status,null);
  }

  public int getStatus(){
        return DataType.getAsInt(this.get(S_Status));
  
  }
  public int getStatusInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_Status));
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

  public void initReceivingUnits(String value){
     this.initProperty(S_ReceivingUnits,value);
  }
  public  void setReceivingUnits(String value){
     this.set(S_ReceivingUnits,value);
  }
  public  void setReceivingUnitsNull(){
     this.set(S_ReceivingUnits,null);
  }

  public String getReceivingUnits(){
       return DataType.getAsString(this.get(S_ReceivingUnits));
  
  }
  public String getReceivingUnitsInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ReceivingUnits));
      }

  public void initContractEndDate(String value){
     this.initProperty(S_ContractEndDate,value);
  }
  public  void setContractEndDate(String value){
     this.set(S_ContractEndDate,value);
  }
  public  void setContractEndDateNull(){
     this.set(S_ContractEndDate,null);
  }

  public String getContractEndDate(){
       return DataType.getAsString(this.get(S_ContractEndDate));
  
  }
  public String getContractEndDateInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContractEndDate));
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

  public void initPayCycType(int value){
     this.initProperty(S_PayCycType,new Integer(value));
  }
  public  void setPayCycType(int value){
     this.set(S_PayCycType,new Integer(value));
  }
  public  void setPayCycTypeNull(){
     this.set(S_PayCycType,null);
  }

  public int getPayCycType(){
        return DataType.getAsInt(this.get(S_PayCycType));
  
  }
  public int getPayCycTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_PayCycType));
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

  public void initGroupContactName(String value){
     this.initProperty(S_GroupContactName,value);
  }
  public  void setGroupContactName(String value){
     this.set(S_GroupContactName,value);
  }
  public  void setGroupContactNameNull(){
     this.set(S_GroupContactName,null);
  }

  public String getGroupContactName(){
       return DataType.getAsString(this.get(S_GroupContactName));
  
  }
  public String getGroupContactNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_GroupContactName));
      }

  public void initGroupContactAdr(String value){
     this.initProperty(S_GroupContactAdr,value);
  }
  public  void setGroupContactAdr(String value){
     this.set(S_GroupContactAdr,value);
  }
  public  void setGroupContactAdrNull(){
     this.set(S_GroupContactAdr,null);
  }

  public String getGroupContactAdr(){
       return DataType.getAsString(this.get(S_GroupContactAdr));
  
  }
  public String getGroupContactAdrInitialValue(){
        return DataType.getAsString(this.getOldObj(S_GroupContactAdr));
      }

  public void initTotalRecFee(double value){
     this.initProperty(S_TotalRecFee,new Double(value));
  }
  public  void setTotalRecFee(double value){
     this.set(S_TotalRecFee,new Double(value));
  }
  public  void setTotalRecFeeNull(){
     this.set(S_TotalRecFee,null);
  }

  public double getTotalRecFee(){
        return DataType.getAsDouble(this.get(S_TotalRecFee));
  
  }
  public double getTotalRecFeeInitialValue(){
        return DataType.getAsDouble(this.getOldObj(S_TotalRecFee));
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


 
 }

