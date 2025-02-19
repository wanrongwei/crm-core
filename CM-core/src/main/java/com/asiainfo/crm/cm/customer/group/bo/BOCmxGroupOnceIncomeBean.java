package com.asiainfo.crm.cm.customer.group.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.customer.group.ivalues.*;

public class BOCmxGroupOnceIncomeBean extends DataContainer implements DataContainerInterface,IBOCmxGroupOnceIncomeValue{

  private static String  m_boName = "com.asiainfo.crm.cm.customer.group.bo.BOCmxGroupOnceIncome";



  public final static  String S_State = "STATE";
  public final static  String S_EndMonth = "END_MONTH";
  public final static  String S_PlanType = "PLAN_TYPE";
  public final static  String S_FeeType = "FEE_TYPE";
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

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmxGroupOnceIncomeBean() throws AIException{
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

  public void initIncomeStatus(int value){
     this.initProperty(S_IncomeStatus,new Integer(value));
  }
  public  void setIncomeStatus(int value){
     this.set(S_IncomeStatus,new Integer(value));
  }
  public  void setIncomeStatusNull(){
     this.set(S_IncomeStatus,null);
  }

  public int getIncomeStatus(){
        return DataType.getAsInt(this.get(S_IncomeStatus));
  
  }
  public int getIncomeStatusInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IncomeStatus));
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

  public void initOperDesc(String value){
     this.initProperty(S_OperDesc,value);
  }
  public  void setOperDesc(String value){
     this.set(S_OperDesc,value);
  }
  public  void setOperDescNull(){
     this.set(S_OperDesc,null);
  }

  public String getOperDesc(){
       return DataType.getAsString(this.get(S_OperDesc));
  
  }
  public String getOperDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OperDesc));
      }

  public void initAcctId(long value){
     this.initProperty(S_AcctId,new Long(value));
  }
  public  void setAcctId(long value){
     this.set(S_AcctId,new Long(value));
  }
  public  void setAcctIdNull(){
     this.set(S_AcctId,null);
  }

  public long getAcctId(){
        return DataType.getAsLong(this.get(S_AcctId));
  
  }
  public long getAcctIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_AcctId));
      }

  public void initTerminalReason(String value){
     this.initProperty(S_TerminalReason,value);
  }
  public  void setTerminalReason(String value){
     this.set(S_TerminalReason,value);
  }
  public  void setTerminalReasonNull(){
     this.set(S_TerminalReason,null);
  }

  public String getTerminalReason(){
       return DataType.getAsString(this.get(S_TerminalReason));
  
  }
  public String getTerminalReasonInitialValue(){
        return DataType.getAsString(this.getOldObj(S_TerminalReason));
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

  public void initReceivingUnitsType(int value){
     this.initProperty(S_ReceivingUnitsType,new Integer(value));
  }
  public  void setReceivingUnitsType(int value){
     this.set(S_ReceivingUnitsType,new Integer(value));
  }
  public  void setReceivingUnitsTypeNull(){
     this.set(S_ReceivingUnitsType,null);
  }

  public int getReceivingUnitsType(){
        return DataType.getAsInt(this.get(S_ReceivingUnitsType));
  
  }
  public int getReceivingUnitsTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ReceivingUnitsType));
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


 
 }

