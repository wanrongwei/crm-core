package com.asiainfo.crm.cm.model.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.model.ivalues.*;

public class AcctBillCycleBean extends DataContainer implements DataContainerInterface,IAcctBillCycleValue{

  private static String  m_boName = "com.asiainfo.crm.cm.model.bo.AcctBillCycle";



  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_State = "STATE";
  public final static  String S_CycleUnit = "CYCLE_UNIT";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_CycleId = "CYCLE_ID";
  public final static  String S_CycleReason = "CYCLE_REASON";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_CycleType = "CYCLE_TYPE";
  public final static  String S_BillDueDate = "BILL_DUE_DATE";
  public final static  String S_Modflag = "MODFLAG";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_CycleTypeDesc = "CYCLE_TYPE_DESC";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_BillDay = "BILL_DAY";
  public final static  String S_Reason = "Reason";
  public final static  String S_BillDayDesc = "BILL_DAY_DESC";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public AcctBillCycleBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
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

  public void initCycleUnit(int value){
     this.initProperty(S_CycleUnit,new Integer(value));
  }
  public  void setCycleUnit(int value){
     this.set(S_CycleUnit,new Integer(value));
  }
  public  void setCycleUnitNull(){
     this.set(S_CycleUnit,null);
  }

  public int getCycleUnit(){
        return DataType.getAsInt(this.get(S_CycleUnit));
  
  }
  public int getCycleUnitInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CycleUnit));
      }

  public void initRemarks(String value){
     this.initProperty(S_Remarks,value);
  }
  public  void setRemarks(String value){
     this.set(S_Remarks,value);
  }
  public  void setRemarksNull(){
     this.set(S_Remarks,null);
  }

  public String getRemarks(){
       return DataType.getAsString(this.get(S_Remarks));
  
  }
  public String getRemarksInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Remarks));
      }

  public void initCycleId(long value){
     this.initProperty(S_CycleId,new Long(value));
  }
  public  void setCycleId(long value){
     this.set(S_CycleId,new Long(value));
  }
  public  void setCycleIdNull(){
     this.set(S_CycleId,null);
  }

  public long getCycleId(){
        return DataType.getAsLong(this.get(S_CycleId));
  
  }
  public long getCycleIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CycleId));
      }

  public void initCycleReason(String value){
     this.initProperty(S_CycleReason,value);
  }
  public  void setCycleReason(String value){
     this.set(S_CycleReason,value);
  }
  public  void setCycleReasonNull(){
     this.set(S_CycleReason,null);
  }

  public String getCycleReason(){
       return DataType.getAsString(this.get(S_CycleReason));
  
  }
  public String getCycleReasonInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CycleReason));
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

  public void initCycleType(int value){
     this.initProperty(S_CycleType,new Integer(value));
  }
  public  void setCycleType(int value){
     this.set(S_CycleType,new Integer(value));
  }
  public  void setCycleTypeNull(){
     this.set(S_CycleType,null);
  }

  public int getCycleType(){
        return DataType.getAsInt(this.get(S_CycleType));
  
  }
  public int getCycleTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CycleType));
      }

  public void initBillDueDate(long value){
     this.initProperty(S_BillDueDate,new Long(value));
  }
  public  void setBillDueDate(long value){
     this.set(S_BillDueDate,new Long(value));
  }
  public  void setBillDueDateNull(){
     this.set(S_BillDueDate,null);
  }

  public long getBillDueDate(){
        return DataType.getAsLong(this.get(S_BillDueDate));
  
  }
  public long getBillDueDateInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_BillDueDate));
      }

  public void initModflag(int value){
     this.initProperty(S_Modflag,new Integer(value));
  }
  public  void setModflag(int value){
     this.set(S_Modflag,new Integer(value));
  }
  public  void setModflagNull(){
     this.set(S_Modflag,null);
  }

  public int getModflag(){
        return DataType.getAsInt(this.get(S_Modflag));
  
  }
  public int getModflagInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_Modflag));
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

  public void initCycleTypeDesc(String value){
     this.initProperty(S_CycleTypeDesc,value);
  }
  public  void setCycleTypeDesc(String value){
     this.set(S_CycleTypeDesc,value);
  }
  public  void setCycleTypeDescNull(){
     this.set(S_CycleTypeDesc,null);
  }

  public String getCycleTypeDesc(){
       return DataType.getAsString(this.get(S_CycleTypeDesc));
  
  }
  public String getCycleTypeDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CycleTypeDesc));
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

  public void initBillDay(int value){
     this.initProperty(S_BillDay,new Integer(value));
  }
  public  void setBillDay(int value){
     this.set(S_BillDay,new Integer(value));
  }
  public  void setBillDayNull(){
     this.set(S_BillDay,null);
  }

  public int getBillDay(){
        return DataType.getAsInt(this.get(S_BillDay));
  
  }
  public int getBillDayInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_BillDay));
      }

  public void initReason(int value){
     this.initProperty(S_Reason,new Integer(value));
  }
  public  void setReason(int value){
     this.set(S_Reason,new Integer(value));
  }
  public  void setReasonNull(){
     this.set(S_Reason,null);
  }

  public int getReason(){
        return DataType.getAsInt(this.get(S_Reason));
  
  }
  public int getReasonInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_Reason));
      }

  public void initBillDayDesc(String value){
     this.initProperty(S_BillDayDesc,value);
  }
  public  void setBillDayDesc(String value){
     this.set(S_BillDayDesc,value);
  }
  public  void setBillDayDescNull(){
     this.set(S_BillDayDesc,null);
  }

  public String getBillDayDesc(){
       return DataType.getAsString(this.get(S_BillDayDesc));
  
  }
  public String getBillDayDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BillDayDesc));
      }


 
 }

