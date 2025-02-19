package com.asiainfo.crm.cm.inner.account.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.inner.account.ivalues.*;

public class QBOCmAcctPayMentBean extends DataContainer implements DataContainerInterface,IQBOCmAcctPayMentValue{

  private static String  m_boName = "com.asiainfo.crm.cm.inner.account.bo.QBOCmAcctPayMent";



  public final static  String S_BankContract = "BANK_CONTRACT";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_BillCycleFlag = "BILL_CYCLE_FLAG";
  public final static  String S_CreditValue = "CREDIT_VALUE";
  public final static  String S_AcctBehalfPhone = "ACCT_BEHALF_PHONE";
  public final static  String S_AcctName = "ACCT_NAME";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_PaymentId = "PAYMENT_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_AcctStatus = "ACCT_STATUS";
  public final static  String S_CreditLevel = "CREDIT_LEVEL";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_PaymentAccountType = "PAYMENT_ACCOUNT_TYPE";
  public final static  String S_Priority = "PRIORITY";
  public final static  String S_AcctType = "ACCT_TYPE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_PaymentBankCode = "PAYMENT_BANK_CODE";
  public final static  String S_InstallmentFlag = "INSTALLMENT_FLAG";
  public final static  String S_PaymentAccount = "PAYMENT_ACCOUNT";
  public final static  String S_PaymentAccountName = "PAYMENT_ACCOUNT_NAME";
  public final static  String S_UrgeStopFlag = "URGE_STOP_FLAG";
  public final static  String S_AcctPassword = "ACCT_PASSWORD";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_PayMethod = "PAY_METHOD";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public QBOCmAcctPayMentBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initBankContract(String value){
     this.initProperty(S_BankContract,value);
  }
  public  void setBankContract(String value){
     this.set(S_BankContract,value);
  }
  public  void setBankContractNull(){
     this.set(S_BankContract,null);
  }

  public String getBankContract(){
       return DataType.getAsString(this.get(S_BankContract));
  
  }
  public String getBankContractInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BankContract));
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

  public void initPaymentId(long value){
     this.initProperty(S_PaymentId,new Long(value));
  }
  public  void setPaymentId(long value){
     this.set(S_PaymentId,new Long(value));
  }
  public  void setPaymentIdNull(){
     this.set(S_PaymentId,null);
  }

  public long getPaymentId(){
        return DataType.getAsLong(this.get(S_PaymentId));
  
  }
  public long getPaymentIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_PaymentId));
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

  public void initPaymentAccountType(int value){
     this.initProperty(S_PaymentAccountType,new Integer(value));
  }
  public  void setPaymentAccountType(int value){
     this.set(S_PaymentAccountType,new Integer(value));
  }
  public  void setPaymentAccountTypeNull(){
     this.set(S_PaymentAccountType,null);
  }

  public int getPaymentAccountType(){
        return DataType.getAsInt(this.get(S_PaymentAccountType));
  
  }
  public int getPaymentAccountTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_PaymentAccountType));
      }

  public void initPriority(int value){
     this.initProperty(S_Priority,new Integer(value));
  }
  public  void setPriority(int value){
     this.set(S_Priority,new Integer(value));
  }
  public  void setPriorityNull(){
     this.set(S_Priority,null);
  }

  public int getPriority(){
        return DataType.getAsInt(this.get(S_Priority));
  
  }
  public int getPriorityInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_Priority));
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

  public void initPaymentBankCode(String value){
     this.initProperty(S_PaymentBankCode,value);
  }
  public  void setPaymentBankCode(String value){
     this.set(S_PaymentBankCode,value);
  }
  public  void setPaymentBankCodeNull(){
     this.set(S_PaymentBankCode,null);
  }

  public String getPaymentBankCode(){
       return DataType.getAsString(this.get(S_PaymentBankCode));
  
  }
  public String getPaymentBankCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PaymentBankCode));
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

  public void initPaymentAccount(String value){
     this.initProperty(S_PaymentAccount,value);
  }
  public  void setPaymentAccount(String value){
     this.set(S_PaymentAccount,value);
  }
  public  void setPaymentAccountNull(){
     this.set(S_PaymentAccount,null);
  }

  public String getPaymentAccount(){
       return DataType.getAsString(this.get(S_PaymentAccount));
  
  }
  public String getPaymentAccountInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PaymentAccount));
      }

  public void initPaymentAccountName(String value){
     this.initProperty(S_PaymentAccountName,value);
  }
  public  void setPaymentAccountName(String value){
     this.set(S_PaymentAccountName,value);
  }
  public  void setPaymentAccountNameNull(){
     this.set(S_PaymentAccountName,null);
  }

  public String getPaymentAccountName(){
       return DataType.getAsString(this.get(S_PaymentAccountName));
  
  }
  public String getPaymentAccountNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PaymentAccountName));
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

  public void initPayMethod(int value){
     this.initProperty(S_PayMethod,new Integer(value));
  }
  public  void setPayMethod(int value){
     this.set(S_PayMethod,new Integer(value));
  }
  public  void setPayMethodNull(){
     this.set(S_PayMethod,null);
  }

  public int getPayMethod(){
        return DataType.getAsInt(this.get(S_PayMethod));
  
  }
  public int getPayMethodInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_PayMethod));
      }


 
 }

