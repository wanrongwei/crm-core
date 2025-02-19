package com.asiainfo.crm.cm.ln.account.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.ln.account.ivalues.*;

public class BOCmAccountPaymentBean extends DataContainer implements DataContainerInterface,IBOCmAccountPaymentValue{

  private static String  m_boName = "com.asiainfo.crm.cm.ln.account.bo.BOCmAccountPayment";



  public final static  String S_BankContract = "BANK_CONTRACT";
  public final static  String S_CycleDoneCode = "CYCLE_DONE_CODE";
  public final static  String S_BillCycleFlag = "BILL_CYCLE_FLAG";
  public final static  String S_CycleReason = "CYCLE_REASON";
  public final static  String S_CycleExpireDate = "CYCLE_EXPIRE_DATE";
  public final static  String S_AcctBehalfPhone = "ACCT_BEHALF_PHONE";
  public final static  String S_AcctCreateOpId = "ACCT_CREATE_OP_ID";
  public final static  String S_AcctName = "ACCT_NAME";
  public final static  String S_PayEffectiveDate = "PAY_EFFECTIVE_DATE";
  public final static  String S_CycleCreateOpId = "CYCLE_CREATE_OP_ID";
  public final static  String S_PayDoneDate = "PAY_DONE_DATE";
  public final static  String S_PaymentId = "PAYMENT_ID";
  public final static  String S_PayOpId = "PAY_OP_ID";
  public final static  String S_AcctCreateOrgId = "ACCT_CREATE_ORG_ID";
  public final static  String S_CycleOrgId = "CYCLE_ORG_ID";
  public final static  String S_AcctDoneDate = "ACCT_DONE_DATE";
  public final static  String S_AcctType = "ACCT_TYPE";
  public final static  String S_PaymentBankCode = "PAYMENT_BANK_CODE";
  public final static  String S_PayCreateDate = "PAY_CREATE_DATE";
  public final static  String S_AcctEffectiveDate = "ACCT_EFFECTIVE_DATE";
  public final static  String S_InstallmentFlag = "INSTALLMENT_FLAG";
  public final static  String S_PaymentAccount = "PAYMENT_ACCOUNT";
  public final static  String S_PaymentAccountName = "PAYMENT_ACCOUNT_NAME";
  public final static  String S_AcctCreateDate = "ACCT_CREATE_DATE";
  public final static  String S_PayCreateOrgId = "PAY_CREATE_ORG_ID";
  public final static  String S_AcctOrgId = "ACCT_ORG_ID";
  public final static  String S_BillDay = "BILL_DAY";
  public final static  String S_AcctDoneCode = "ACCT_DONE_CODE";
  public final static  String S_CycleCreateDate = "CYCLE_CREATE_DATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_CycleEffectiveDate = "CYCLE_EFFECTIVE_DATE";
  public final static  String S_CreditValue = "CREDIT_VALUE";
  public final static  String S_AcctOpId = "ACCT_OP_ID";
  public final static  String S_PayState = "PAY_STATE";
  public final static  String S_PayOrgId = "PAY_ORG_ID";
  public final static  String S_PayExpireDate = "PAY_EXPIRE_DATE";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_CycleOpId = "CYCLE_OP_ID";
  public final static  String S_AcctState = "ACCT_STATE";
  public final static  String S_AcctStatus = "ACCT_STATUS";
  public final static  String S_CreditLevel = "CREDIT_LEVEL";
  public final static  String S_CycleCreateOrgId = "CYCLE_CREATE_ORG_ID";
  public final static  String S_CycleDoneDate = "CYCLE_DONE_DATE";
  public final static  String S_CycleUnit = "CYCLE_UNIT";
  public final static  String S_PaymentAccountType = "PAYMENT_ACCOUNT_TYPE";
  public final static  String S_Priority = "PRIORITY";
  public final static  String S_PayCreateOpId = "PAY_CREATE_OP_ID";
  public final static  String S_CycleId = "CYCLE_ID";
  public final static  String S_CycleState = "CYCLE_STATE";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CycleType = "CYCLE_TYPE";
  public final static  String S_UrgeStopFlag = "URGE_STOP_FLAG";
  public final static  String S_AcctPassword = "ACCT_PASSWORD";
  public final static  String S_PayDoneCode = "PAY_DONE_CODE";
  public final static  String S_AcctExpireDate = "ACCT_EXPIRE_DATE";
  public final static  String S_PayMethod = "PAY_METHOD";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmAccountPaymentBean() throws AIException{
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

  public void initCycleDoneCode(long value){
     this.initProperty(S_CycleDoneCode,new Long(value));
  }
  public  void setCycleDoneCode(long value){
     this.set(S_CycleDoneCode,new Long(value));
  }
  public  void setCycleDoneCodeNull(){
     this.set(S_CycleDoneCode,null);
  }

  public long getCycleDoneCode(){
        return DataType.getAsLong(this.get(S_CycleDoneCode));
  
  }
  public long getCycleDoneCodeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CycleDoneCode));
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

  public void initCycleExpireDate(Timestamp value){
     this.initProperty(S_CycleExpireDate,value);
  }
  public  void setCycleExpireDate(Timestamp value){
     this.set(S_CycleExpireDate,value);
  }
  public  void setCycleExpireDateNull(){
     this.set(S_CycleExpireDate,null);
  }

  public Timestamp getCycleExpireDate(){
        return DataType.getAsDateTime(this.get(S_CycleExpireDate));
  
  }
  public Timestamp getCycleExpireDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_CycleExpireDate));
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

  public void initAcctCreateOpId(long value){
     this.initProperty(S_AcctCreateOpId,new Long(value));
  }
  public  void setAcctCreateOpId(long value){
     this.set(S_AcctCreateOpId,new Long(value));
  }
  public  void setAcctCreateOpIdNull(){
     this.set(S_AcctCreateOpId,null);
  }

  public long getAcctCreateOpId(){
        return DataType.getAsLong(this.get(S_AcctCreateOpId));
  
  }
  public long getAcctCreateOpIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_AcctCreateOpId));
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

  public void initPayEffectiveDate(Timestamp value){
     this.initProperty(S_PayEffectiveDate,value);
  }
  public  void setPayEffectiveDate(Timestamp value){
     this.set(S_PayEffectiveDate,value);
  }
  public  void setPayEffectiveDateNull(){
     this.set(S_PayEffectiveDate,null);
  }

  public Timestamp getPayEffectiveDate(){
        return DataType.getAsDateTime(this.get(S_PayEffectiveDate));
  
  }
  public Timestamp getPayEffectiveDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_PayEffectiveDate));
      }

  public void initCycleCreateOpId(long value){
     this.initProperty(S_CycleCreateOpId,new Long(value));
  }
  public  void setCycleCreateOpId(long value){
     this.set(S_CycleCreateOpId,new Long(value));
  }
  public  void setCycleCreateOpIdNull(){
     this.set(S_CycleCreateOpId,null);
  }

  public long getCycleCreateOpId(){
        return DataType.getAsLong(this.get(S_CycleCreateOpId));
  
  }
  public long getCycleCreateOpIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CycleCreateOpId));
      }

  public void initPayDoneDate(Timestamp value){
     this.initProperty(S_PayDoneDate,value);
  }
  public  void setPayDoneDate(Timestamp value){
     this.set(S_PayDoneDate,value);
  }
  public  void setPayDoneDateNull(){
     this.set(S_PayDoneDate,null);
  }

  public Timestamp getPayDoneDate(){
        return DataType.getAsDateTime(this.get(S_PayDoneDate));
  
  }
  public Timestamp getPayDoneDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_PayDoneDate));
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

  public void initPayOpId(long value){
     this.initProperty(S_PayOpId,new Long(value));
  }
  public  void setPayOpId(long value){
     this.set(S_PayOpId,new Long(value));
  }
  public  void setPayOpIdNull(){
     this.set(S_PayOpId,null);
  }

  public long getPayOpId(){
        return DataType.getAsLong(this.get(S_PayOpId));
  
  }
  public long getPayOpIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_PayOpId));
      }

  public void initAcctCreateOrgId(long value){
     this.initProperty(S_AcctCreateOrgId,new Long(value));
  }
  public  void setAcctCreateOrgId(long value){
     this.set(S_AcctCreateOrgId,new Long(value));
  }
  public  void setAcctCreateOrgIdNull(){
     this.set(S_AcctCreateOrgId,null);
  }

  public long getAcctCreateOrgId(){
        return DataType.getAsLong(this.get(S_AcctCreateOrgId));
  
  }
  public long getAcctCreateOrgIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_AcctCreateOrgId));
      }

  public void initCycleOrgId(long value){
     this.initProperty(S_CycleOrgId,new Long(value));
  }
  public  void setCycleOrgId(long value){
     this.set(S_CycleOrgId,new Long(value));
  }
  public  void setCycleOrgIdNull(){
     this.set(S_CycleOrgId,null);
  }

  public long getCycleOrgId(){
        return DataType.getAsLong(this.get(S_CycleOrgId));
  
  }
  public long getCycleOrgIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CycleOrgId));
      }

  public void initAcctDoneDate(Timestamp value){
     this.initProperty(S_AcctDoneDate,value);
  }
  public  void setAcctDoneDate(Timestamp value){
     this.set(S_AcctDoneDate,value);
  }
  public  void setAcctDoneDateNull(){
     this.set(S_AcctDoneDate,null);
  }

  public Timestamp getAcctDoneDate(){
        return DataType.getAsDateTime(this.get(S_AcctDoneDate));
  
  }
  public Timestamp getAcctDoneDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_AcctDoneDate));
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

  public void initPayCreateDate(Timestamp value){
     this.initProperty(S_PayCreateDate,value);
  }
  public  void setPayCreateDate(Timestamp value){
     this.set(S_PayCreateDate,value);
  }
  public  void setPayCreateDateNull(){
     this.set(S_PayCreateDate,null);
  }

  public Timestamp getPayCreateDate(){
        return DataType.getAsDateTime(this.get(S_PayCreateDate));
  
  }
  public Timestamp getPayCreateDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_PayCreateDate));
      }

  public void initAcctEffectiveDate(Timestamp value){
     this.initProperty(S_AcctEffectiveDate,value);
  }
  public  void setAcctEffectiveDate(Timestamp value){
     this.set(S_AcctEffectiveDate,value);
  }
  public  void setAcctEffectiveDateNull(){
     this.set(S_AcctEffectiveDate,null);
  }

  public Timestamp getAcctEffectiveDate(){
        return DataType.getAsDateTime(this.get(S_AcctEffectiveDate));
  
  }
  public Timestamp getAcctEffectiveDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_AcctEffectiveDate));
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

  public void initAcctCreateDate(Timestamp value){
     this.initProperty(S_AcctCreateDate,value);
  }
  public  void setAcctCreateDate(Timestamp value){
     this.set(S_AcctCreateDate,value);
  }
  public  void setAcctCreateDateNull(){
     this.set(S_AcctCreateDate,null);
  }

  public Timestamp getAcctCreateDate(){
        return DataType.getAsDateTime(this.get(S_AcctCreateDate));
  
  }
  public Timestamp getAcctCreateDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_AcctCreateDate));
      }

  public void initPayCreateOrgId(long value){
     this.initProperty(S_PayCreateOrgId,new Long(value));
  }
  public  void setPayCreateOrgId(long value){
     this.set(S_PayCreateOrgId,new Long(value));
  }
  public  void setPayCreateOrgIdNull(){
     this.set(S_PayCreateOrgId,null);
  }

  public long getPayCreateOrgId(){
        return DataType.getAsLong(this.get(S_PayCreateOrgId));
  
  }
  public long getPayCreateOrgIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_PayCreateOrgId));
      }

  public void initAcctOrgId(long value){
     this.initProperty(S_AcctOrgId,new Long(value));
  }
  public  void setAcctOrgId(long value){
     this.set(S_AcctOrgId,new Long(value));
  }
  public  void setAcctOrgIdNull(){
     this.set(S_AcctOrgId,null);
  }

  public long getAcctOrgId(){
        return DataType.getAsLong(this.get(S_AcctOrgId));
  
  }
  public long getAcctOrgIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_AcctOrgId));
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

  public void initAcctDoneCode(long value){
     this.initProperty(S_AcctDoneCode,new Long(value));
  }
  public  void setAcctDoneCode(long value){
     this.set(S_AcctDoneCode,new Long(value));
  }
  public  void setAcctDoneCodeNull(){
     this.set(S_AcctDoneCode,null);
  }

  public long getAcctDoneCode(){
        return DataType.getAsLong(this.get(S_AcctDoneCode));
  
  }
  public long getAcctDoneCodeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_AcctDoneCode));
      }

  public void initCycleCreateDate(Timestamp value){
     this.initProperty(S_CycleCreateDate,value);
  }
  public  void setCycleCreateDate(Timestamp value){
     this.set(S_CycleCreateDate,value);
  }
  public  void setCycleCreateDateNull(){
     this.set(S_CycleCreateDate,null);
  }

  public Timestamp getCycleCreateDate(){
        return DataType.getAsDateTime(this.get(S_CycleCreateDate));
  
  }
  public Timestamp getCycleCreateDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_CycleCreateDate));
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

  public void initCycleEffectiveDate(Timestamp value){
     this.initProperty(S_CycleEffectiveDate,value);
  }
  public  void setCycleEffectiveDate(Timestamp value){
     this.set(S_CycleEffectiveDate,value);
  }
  public  void setCycleEffectiveDateNull(){
     this.set(S_CycleEffectiveDate,null);
  }

  public Timestamp getCycleEffectiveDate(){
        return DataType.getAsDateTime(this.get(S_CycleEffectiveDate));
  
  }
  public Timestamp getCycleEffectiveDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_CycleEffectiveDate));
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

  public void initAcctOpId(long value){
     this.initProperty(S_AcctOpId,new Long(value));
  }
  public  void setAcctOpId(long value){
     this.set(S_AcctOpId,new Long(value));
  }
  public  void setAcctOpIdNull(){
     this.set(S_AcctOpId,null);
  }

  public long getAcctOpId(){
        return DataType.getAsLong(this.get(S_AcctOpId));
  
  }
  public long getAcctOpIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_AcctOpId));
      }

  public void initPayState(String value){
     this.initProperty(S_PayState,value);
  }
  public  void setPayState(String value){
     this.set(S_PayState,value);
  }
  public  void setPayStateNull(){
     this.set(S_PayState,null);
  }

  public String getPayState(){
       return DataType.getAsString(this.get(S_PayState));
  
  }
  public String getPayStateInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PayState));
      }

  public void initPayOrgId(long value){
     this.initProperty(S_PayOrgId,new Long(value));
  }
  public  void setPayOrgId(long value){
     this.set(S_PayOrgId,new Long(value));
  }
  public  void setPayOrgIdNull(){
     this.set(S_PayOrgId,null);
  }

  public long getPayOrgId(){
        return DataType.getAsLong(this.get(S_PayOrgId));
  
  }
  public long getPayOrgIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_PayOrgId));
      }

  public void initPayExpireDate(Timestamp value){
     this.initProperty(S_PayExpireDate,value);
  }
  public  void setPayExpireDate(Timestamp value){
     this.set(S_PayExpireDate,value);
  }
  public  void setPayExpireDateNull(){
     this.set(S_PayExpireDate,null);
  }

  public Timestamp getPayExpireDate(){
        return DataType.getAsDateTime(this.get(S_PayExpireDate));
  
  }
  public Timestamp getPayExpireDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_PayExpireDate));
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

  public void initCycleOpId(long value){
     this.initProperty(S_CycleOpId,new Long(value));
  }
  public  void setCycleOpId(long value){
     this.set(S_CycleOpId,new Long(value));
  }
  public  void setCycleOpIdNull(){
     this.set(S_CycleOpId,null);
  }

  public long getCycleOpId(){
        return DataType.getAsLong(this.get(S_CycleOpId));
  
  }
  public long getCycleOpIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CycleOpId));
      }

  public void initAcctState(String value){
     this.initProperty(S_AcctState,value);
  }
  public  void setAcctState(String value){
     this.set(S_AcctState,value);
  }
  public  void setAcctStateNull(){
     this.set(S_AcctState,null);
  }

  public String getAcctState(){
       return DataType.getAsString(this.get(S_AcctState));
  
  }
  public String getAcctStateInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AcctState));
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

  public void initCycleCreateOrgId(long value){
     this.initProperty(S_CycleCreateOrgId,new Long(value));
  }
  public  void setCycleCreateOrgId(long value){
     this.set(S_CycleCreateOrgId,new Long(value));
  }
  public  void setCycleCreateOrgIdNull(){
     this.set(S_CycleCreateOrgId,null);
  }

  public long getCycleCreateOrgId(){
        return DataType.getAsLong(this.get(S_CycleCreateOrgId));
  
  }
  public long getCycleCreateOrgIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CycleCreateOrgId));
      }

  public void initCycleDoneDate(Timestamp value){
     this.initProperty(S_CycleDoneDate,value);
  }
  public  void setCycleDoneDate(Timestamp value){
     this.set(S_CycleDoneDate,value);
  }
  public  void setCycleDoneDateNull(){
     this.set(S_CycleDoneDate,null);
  }

  public Timestamp getCycleDoneDate(){
        return DataType.getAsDateTime(this.get(S_CycleDoneDate));
  
  }
  public Timestamp getCycleDoneDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_CycleDoneDate));
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

  public void initPayCreateOpId(long value){
     this.initProperty(S_PayCreateOpId,new Long(value));
  }
  public  void setPayCreateOpId(long value){
     this.set(S_PayCreateOpId,new Long(value));
  }
  public  void setPayCreateOpIdNull(){
     this.set(S_PayCreateOpId,null);
  }

  public long getPayCreateOpId(){
        return DataType.getAsLong(this.get(S_PayCreateOpId));
  
  }
  public long getPayCreateOpIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_PayCreateOpId));
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

  public void initCycleState(String value){
     this.initProperty(S_CycleState,value);
  }
  public  void setCycleState(String value){
     this.set(S_CycleState,value);
  }
  public  void setCycleStateNull(){
     this.set(S_CycleState,null);
  }

  public String getCycleState(){
       return DataType.getAsString(this.get(S_CycleState));
  
  }
  public String getCycleStateInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CycleState));
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

  public void initPayDoneCode(long value){
     this.initProperty(S_PayDoneCode,new Long(value));
  }
  public  void setPayDoneCode(long value){
     this.set(S_PayDoneCode,new Long(value));
  }
  public  void setPayDoneCodeNull(){
     this.set(S_PayDoneCode,null);
  }

  public long getPayDoneCode(){
        return DataType.getAsLong(this.get(S_PayDoneCode));
  
  }
  public long getPayDoneCodeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_PayDoneCode));
      }

  public void initAcctExpireDate(Timestamp value){
     this.initProperty(S_AcctExpireDate,value);
  }
  public  void setAcctExpireDate(Timestamp value){
     this.set(S_AcctExpireDate,value);
  }
  public  void setAcctExpireDateNull(){
     this.set(S_AcctExpireDate,null);
  }

  public Timestamp getAcctExpireDate(){
        return DataType.getAsDateTime(this.get(S_AcctExpireDate));
  
  }
  public Timestamp getAcctExpireDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_AcctExpireDate));
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

