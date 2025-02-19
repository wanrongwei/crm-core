package com.asiainfo.crm.cm.inner.account.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.inner.account.ivalues.*;

public class QBOCmCustAcctRelBean extends DataContainer implements DataContainerInterface,IQBOCmCustAcctRelValue{

  private static String  m_boName = "com.asiainfo.crm.cm.inner.account.bo.QBOCmCustAcctRel";



  public final static  String S_State = "STATE";
  public final static  String S_BillCycleFlag = "BILL_CYCLE_FLAG";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_CreditValue = "CREDIT_VALUE";
  public final static  String S_AcctBehalfPhone = "ACCT_BEHALF_PHONE";
  public final static  String S_AcctAliasName = "ACCT_ALIAS_NAME";
  public final static  String S_AcctName = "ACCT_NAME";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_AcctStatus = "ACCT_STATUS";
  public final static  String S_CreditLevel = "CREDIT_LEVEL";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_RelCustId = "REL_CUST_ID";
  public final static  String S_RelType = "REL_TYPE";
  public final static  String S_AcctType = "ACCT_TYPE";
  public final static  String S_CustType = "CUST_TYPE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_UrgeStopFlag = "URGE_STOP_FLAG";
  public final static  String S_AcctPassword = "ACCT_PASSWORD";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_CreateDate = "CREATE_DATE";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public QBOCmCustAcctRelBean() throws AIException{
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

  public void initBillCycleFlag(long value){
     this.initProperty(S_BillCycleFlag,new Long(value));
  }
  public  void setBillCycleFlag(long value){
     this.set(S_BillCycleFlag,new Long(value));
  }
  public  void setBillCycleFlagNull(){
     this.set(S_BillCycleFlag,null);
  }

  public long getBillCycleFlag(){
        return DataType.getAsLong(this.get(S_BillCycleFlag));
  
  }
  public long getBillCycleFlagInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_BillCycleFlag));
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

  public void initCreditValue(long value){
     this.initProperty(S_CreditValue,new Long(value));
  }
  public  void setCreditValue(long value){
     this.set(S_CreditValue,new Long(value));
  }
  public  void setCreditValueNull(){
     this.set(S_CreditValue,null);
  }

  public long getCreditValue(){
        return DataType.getAsLong(this.get(S_CreditValue));
  
  }
  public long getCreditValueInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CreditValue));
      }

  public void initAcctBehalfPhone(String value){
     this.initProperty(S_AcctBehalfPhone,value);
  }
  public  void setAcctBehalfPhone(String value){
     this.set(S_AcctBehalfPhone,value);
  }
  public  void setAcctBehalfPhoneNull(){
     this.set(S_AcctBehalfPhone,null);
  }

  public String getAcctBehalfPhone(){
       return DataType.getAsString(this.get(S_AcctBehalfPhone));
  
  }
  public String getAcctBehalfPhoneInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AcctBehalfPhone));
      }

  public void initAcctAliasName(String value){
     this.initProperty(S_AcctAliasName,value);
  }
  public  void setAcctAliasName(String value){
     this.set(S_AcctAliasName,value);
  }
  public  void setAcctAliasNameNull(){
     this.set(S_AcctAliasName,null);
  }

  public String getAcctAliasName(){
       return DataType.getAsString(this.get(S_AcctAliasName));
  
  }
  public String getAcctAliasNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AcctAliasName));
      }

  public void initAcctName(String value){
     this.initProperty(S_AcctName,value);
  }
  public  void setAcctName(String value){
     this.set(S_AcctName,value);
  }
  public  void setAcctNameNull(){
     this.set(S_AcctName,null);
  }

  public String getAcctName(){
       return DataType.getAsString(this.get(S_AcctName));
  
  }
  public String getAcctNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AcctName));
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

  public void initCustId(long value){
     this.initProperty(S_CustId,new Long(value));
  }
  public  void setCustId(long value){
     this.set(S_CustId,new Long(value));
  }
  public  void setCustIdNull(){
     this.set(S_CustId,null);
  }

  public long getCustId(){
        return DataType.getAsLong(this.get(S_CustId));
  
  }
  public long getCustIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CustId));
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

  public void initAcctStatus(long value){
     this.initProperty(S_AcctStatus,new Long(value));
  }
  public  void setAcctStatus(long value){
     this.set(S_AcctStatus,new Long(value));
  }
  public  void setAcctStatusNull(){
     this.set(S_AcctStatus,null);
  }

  public long getAcctStatus(){
        return DataType.getAsLong(this.get(S_AcctStatus));
  
  }
  public long getAcctStatusInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_AcctStatus));
      }

  public void initCreditLevel(long value){
     this.initProperty(S_CreditLevel,new Long(value));
  }
  public  void setCreditLevel(long value){
     this.set(S_CreditLevel,new Long(value));
  }
  public  void setCreditLevelNull(){
     this.set(S_CreditLevel,null);
  }

  public long getCreditLevel(){
        return DataType.getAsLong(this.get(S_CreditLevel));
  
  }
  public long getCreditLevelInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CreditLevel));
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

  public void initRelCustId(long value){
     this.initProperty(S_RelCustId,new Long(value));
  }
  public  void setRelCustId(long value){
     this.set(S_RelCustId,new Long(value));
  }
  public  void setRelCustIdNull(){
     this.set(S_RelCustId,null);
  }

  public long getRelCustId(){
        return DataType.getAsLong(this.get(S_RelCustId));
  
  }
  public long getRelCustIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_RelCustId));
      }

  public void initRelType(long value){
     this.initProperty(S_RelType,new Long(value));
  }
  public  void setRelType(long value){
     this.set(S_RelType,new Long(value));
  }
  public  void setRelTypeNull(){
     this.set(S_RelType,null);
  }

  public long getRelType(){
        return DataType.getAsLong(this.get(S_RelType));
  
  }
  public long getRelTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_RelType));
      }

  public void initAcctType(long value){
     this.initProperty(S_AcctType,new Long(value));
  }
  public  void setAcctType(long value){
     this.set(S_AcctType,new Long(value));
  }
  public  void setAcctTypeNull(){
     this.set(S_AcctType,null);
  }

  public long getAcctType(){
        return DataType.getAsLong(this.get(S_AcctType));
  
  }
  public long getAcctTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_AcctType));
      }

  public void initCustType(long value){
     this.initProperty(S_CustType,new Long(value));
  }
  public  void setCustType(long value){
     this.set(S_CustType,new Long(value));
  }
  public  void setCustTypeNull(){
     this.set(S_CustType,null);
  }

  public long getCustType(){
        return DataType.getAsLong(this.get(S_CustType));
  
  }
  public long getCustTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CustType));
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

  public void initUrgeStopFlag(String value){
     this.initProperty(S_UrgeStopFlag,value);
  }
  public  void setUrgeStopFlag(String value){
     this.set(S_UrgeStopFlag,value);
  }
  public  void setUrgeStopFlagNull(){
     this.set(S_UrgeStopFlag,null);
  }

  public String getUrgeStopFlag(){
       return DataType.getAsString(this.get(S_UrgeStopFlag));
  
  }
  public String getUrgeStopFlagInitialValue(){
        return DataType.getAsString(this.getOldObj(S_UrgeStopFlag));
      }

  public void initAcctPassword(String value){
     this.initProperty(S_AcctPassword,value);
  }
  public  void setAcctPassword(String value){
     this.set(S_AcctPassword,value);
  }
  public  void setAcctPasswordNull(){
     this.set(S_AcctPassword,null);
  }

  public String getAcctPassword(){
       return DataType.getAsString(this.get(S_AcctPassword));
  
  }
  public String getAcctPasswordInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AcctPassword));
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


 
 }

