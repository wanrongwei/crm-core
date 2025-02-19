package com.asiainfo.crm.cm.model.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.model.ivalues.*;

public class AccountBean extends DataContainer implements DataContainerInterface,IAccountValue{

  private static String  m_boName = "com.asiainfo.crm.cm.model.bo.Account";



  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_BillCycleFlag = "BILL_CYCLE_FLAG";
  public final static  String S_BillCycleFlagDesc = "BILL_CYCLE_FLAG_DESC";
  public final static  String S_AcctStatusDesc = "ACCT_STATUS_DESC";
  public final static  String S_AcctPayMethodText = "ACCT_PAY_METHOD_TEXT";
  public final static  String S_CreditValue = "CREDIT_VALUE";
  public final static  String S_AcctBehalfPhone = "ACCT_BEHALF_PHONE";
  public final static  String S_AcctAliasName = "ACCT_ALIAS_NAME";
  public final static  String S_AcctName = "ACCT_NAME";
  public final static  String S_FirstName = "FIRST_NAME";
  public final static  String S_CustTypeDesc = "CUST_TYPE_DESC";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_CustCertCode = "CUST_CERT_CODE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_AcctStatus = "ACCT_STATUS";
  public final static  String S_CreditLevel = "CREDIT_LEVEL";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_AcctTypeDesc = "ACCT_TYPE_DESC";
  public final static  String S_RelType = "REL_TYPE";
  public final static  String S_RelCustId = "REL_CUST_ID";
  public final static  String S_AcctType = "ACCT_TYPE";
  public final static  String S_CustType = "CUST_TYPE";
  public final static  String S_LastName = "LAST_NAME";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_CustName = "CUST_NAME";
  public final static  String S_RelTypeDesc = "REL_TYPE_DESC";
  public final static  String S_InstallmentFlag = "INSTALLMENT_FLAG";
  public final static  String S_CreditLevelDesc = "CREDIT_LEVEL_DESC";
  public final static  String S_UrgeStopFlag = "URGE_STOP_FLAG";
  public final static  String S_AcctPassword = "ACCT_PASSWORD";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_UrgeStopFlagDesc = "URGE_STOP_FLAG_DESC";
  public final static  String S_CreateDate = "CREATE_DATE";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public AccountBean() throws AIException{
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

  public void initBillCycleFlag(int value){
     this.initProperty(S_BillCycleFlag,new Integer(value));
  }
  public  void setBillCycleFlag(int value){
     this.set(S_BillCycleFlag,new Integer(value));
  }
  public  void setBillCycleFlagNull(){
     this.set(S_BillCycleFlag,null);
  }

  public int getBillCycleFlag(){
        return DataType.getAsInt(this.get(S_BillCycleFlag));
  
  }
  public int getBillCycleFlagInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_BillCycleFlag));
      }

  public void initBillCycleFlagDesc(String value){
     this.initProperty(S_BillCycleFlagDesc,value);
  }
  public  void setBillCycleFlagDesc(String value){
     this.set(S_BillCycleFlagDesc,value);
  }
  public  void setBillCycleFlagDescNull(){
     this.set(S_BillCycleFlagDesc,null);
  }

  public String getBillCycleFlagDesc(){
       return DataType.getAsString(this.get(S_BillCycleFlagDesc));
  
  }
  public String getBillCycleFlagDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BillCycleFlagDesc));
      }

  public void initAcctStatusDesc(String value){
     this.initProperty(S_AcctStatusDesc,value);
  }
  public  void setAcctStatusDesc(String value){
     this.set(S_AcctStatusDesc,value);
  }
  public  void setAcctStatusDescNull(){
     this.set(S_AcctStatusDesc,null);
  }

  public String getAcctStatusDesc(){
       return DataType.getAsString(this.get(S_AcctStatusDesc));
  
  }
  public String getAcctStatusDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AcctStatusDesc));
      }

  public void initAcctPayMethodText(String value){
     this.initProperty(S_AcctPayMethodText,value);
  }
  public  void setAcctPayMethodText(String value){
     this.set(S_AcctPayMethodText,value);
  }
  public  void setAcctPayMethodTextNull(){
     this.set(S_AcctPayMethodText,null);
  }

  public String getAcctPayMethodText(){
       return DataType.getAsString(this.get(S_AcctPayMethodText));
  
  }
  public String getAcctPayMethodTextInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AcctPayMethodText));
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

  public void initFirstName(String value){
     this.initProperty(S_FirstName,value);
  }
  public  void setFirstName(String value){
     this.set(S_FirstName,value);
  }
  public  void setFirstNameNull(){
     this.set(S_FirstName,null);
  }

  public String getFirstName(){
       return DataType.getAsString(this.get(S_FirstName));
  
  }
  public String getFirstNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FirstName));
      }

  public void initCustTypeDesc(String value){
     this.initProperty(S_CustTypeDesc,value);
  }
  public  void setCustTypeDesc(String value){
     this.set(S_CustTypeDesc,value);
  }
  public  void setCustTypeDescNull(){
     this.set(S_CustTypeDesc,null);
  }

  public String getCustTypeDesc(){
       return DataType.getAsString(this.get(S_CustTypeDesc));
  
  }
  public String getCustTypeDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CustTypeDesc));
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

  public void initCustCertCode(String value){
     this.initProperty(S_CustCertCode,value);
  }
  public  void setCustCertCode(String value){
     this.set(S_CustCertCode,value);
  }
  public  void setCustCertCodeNull(){
     this.set(S_CustCertCode,null);
  }

  public String getCustCertCode(){
       return DataType.getAsString(this.get(S_CustCertCode));
  
  }
  public String getCustCertCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CustCertCode));
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

  public void initAcctStatus(int value){
     this.initProperty(S_AcctStatus,new Integer(value));
  }
  public  void setAcctStatus(int value){
     this.set(S_AcctStatus,new Integer(value));
  }
  public  void setAcctStatusNull(){
     this.set(S_AcctStatus,null);
  }

  public int getAcctStatus(){
        return DataType.getAsInt(this.get(S_AcctStatus));
  
  }
  public int getAcctStatusInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_AcctStatus));
      }

  public void initCreditLevel(int value){
     this.initProperty(S_CreditLevel,new Integer(value));
  }
  public  void setCreditLevel(int value){
     this.set(S_CreditLevel,new Integer(value));
  }
  public  void setCreditLevelNull(){
     this.set(S_CreditLevel,null);
  }

  public int getCreditLevel(){
        return DataType.getAsInt(this.get(S_CreditLevel));
  
  }
  public int getCreditLevelInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CreditLevel));
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

  public void initAcctTypeDesc(String value){
     this.initProperty(S_AcctTypeDesc,value);
  }
  public  void setAcctTypeDesc(String value){
     this.set(S_AcctTypeDesc,value);
  }
  public  void setAcctTypeDescNull(){
     this.set(S_AcctTypeDesc,null);
  }

  public String getAcctTypeDesc(){
       return DataType.getAsString(this.get(S_AcctTypeDesc));
  
  }
  public String getAcctTypeDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AcctTypeDesc));
      }

  public void initRelType(int value){
     this.initProperty(S_RelType,new Integer(value));
  }
  public  void setRelType(int value){
     this.set(S_RelType,new Integer(value));
  }
  public  void setRelTypeNull(){
     this.set(S_RelType,null);
  }

  public int getRelType(){
        return DataType.getAsInt(this.get(S_RelType));
  
  }
  public int getRelTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_RelType));
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

  public void initAcctType(int value){
     this.initProperty(S_AcctType,new Integer(value));
  }
  public  void setAcctType(int value){
     this.set(S_AcctType,new Integer(value));
  }
  public  void setAcctTypeNull(){
     this.set(S_AcctType,null);
  }

  public int getAcctType(){
        return DataType.getAsInt(this.get(S_AcctType));
  
  }
  public int getAcctTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_AcctType));
      }

  public void initCustType(int value){
     this.initProperty(S_CustType,new Integer(value));
  }
  public  void setCustType(int value){
     this.set(S_CustType,new Integer(value));
  }
  public  void setCustTypeNull(){
     this.set(S_CustType,null);
  }

  public int getCustType(){
        return DataType.getAsInt(this.get(S_CustType));
  
  }
  public int getCustTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CustType));
      }

  public void initLastName(String value){
     this.initProperty(S_LastName,value);
  }
  public  void setLastName(String value){
     this.set(S_LastName,value);
  }
  public  void setLastNameNull(){
     this.set(S_LastName,null);
  }

  public String getLastName(){
       return DataType.getAsString(this.get(S_LastName));
  
  }
  public String getLastNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_LastName));
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

  public void initCustName(String value){
     this.initProperty(S_CustName,value);
  }
  public  void setCustName(String value){
     this.set(S_CustName,value);
  }
  public  void setCustNameNull(){
     this.set(S_CustName,null);
  }

  public String getCustName(){
       return DataType.getAsString(this.get(S_CustName));
  
  }
  public String getCustNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CustName));
      }

  public void initRelTypeDesc(String value){
     this.initProperty(S_RelTypeDesc,value);
  }
  public  void setRelTypeDesc(String value){
     this.set(S_RelTypeDesc,value);
  }
  public  void setRelTypeDescNull(){
     this.set(S_RelTypeDesc,null);
  }

  public String getRelTypeDesc(){
       return DataType.getAsString(this.get(S_RelTypeDesc));
  
  }
  public String getRelTypeDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_RelTypeDesc));
      }

  public void initInstallmentFlag(int value){
     this.initProperty(S_InstallmentFlag,new Integer(value));
  }
  public  void setInstallmentFlag(int value){
     this.set(S_InstallmentFlag,new Integer(value));
  }
  public  void setInstallmentFlagNull(){
     this.set(S_InstallmentFlag,null);
  }

  public int getInstallmentFlag(){
        return DataType.getAsInt(this.get(S_InstallmentFlag));
  
  }
  public int getInstallmentFlagInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_InstallmentFlag));
      }

  public void initCreditLevelDesc(String value){
     this.initProperty(S_CreditLevelDesc,value);
  }
  public  void setCreditLevelDesc(String value){
     this.set(S_CreditLevelDesc,value);
  }
  public  void setCreditLevelDescNull(){
     this.set(S_CreditLevelDesc,null);
  }

  public String getCreditLevelDesc(){
       return DataType.getAsString(this.get(S_CreditLevelDesc));
  
  }
  public String getCreditLevelDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CreditLevelDesc));
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

  public void initUrgeStopFlagDesc(String value){
     this.initProperty(S_UrgeStopFlagDesc,value);
  }
  public  void setUrgeStopFlagDesc(String value){
     this.set(S_UrgeStopFlagDesc,value);
  }
  public  void setUrgeStopFlagDescNull(){
     this.set(S_UrgeStopFlagDesc,null);
  }

  public String getUrgeStopFlagDesc(){
       return DataType.getAsString(this.get(S_UrgeStopFlagDesc));
  
  }
  public String getUrgeStopFlagDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_UrgeStopFlagDesc));
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

