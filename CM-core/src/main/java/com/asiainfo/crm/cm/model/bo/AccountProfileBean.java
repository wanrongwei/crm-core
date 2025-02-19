package com.asiainfo.crm.cm.model.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.model.ivalues.*;

public class AccountProfileBean extends DataContainer implements DataContainerInterface,IAccountProfileValue{

  private static String  m_boName = "com.asiainfo.crm.cm.model.bo.AccountProfile";



  public final static  String S_RelStateDesc = "REL_STATE_DESC";
  public final static  String S_BankContract = "BANK_CONTRACT";
  public final static  String S_CycleDoneCode = "CYCLE_DONE_CODE";
  public final static  String S_Recipients = "RECIPIENTS";
  public final static  String S_BillCycleFlagDesc = "BILL_CYCLE_FLAG_DESC";
  public final static  String S_AcctStatusDesc = "ACCT_STATUS_DESC";
  public final static  String S_RelState = "REL_STATE";
  public final static  String S_CycleReason = "CYCLE_REASON";
  public final static  String S_AcctBehalfPhone = "ACCT_BEHALF_PHONE";
  public final static  String S_BillOpId = "BILL_OP_ID";
  public final static  String S_PayEffectiveDate = "PAY_EFFECTIVE_DATE";
  public final static  String S_PaymentBankName = "PAYMENT_BANK_NAME";
  public final static  String S_CustCredCode = "CUST_CRED_CODE";
  public final static  String S_FirstName = "FIRST_NAME";
  public final static  String S_PayDoneDate = "PAY_DONE_DATE";
  public final static  String S_ContZipcode = "CONT_ZIPCODE";
  public final static  String S_PaymentId = "PAYMENT_ID";
  public final static  String S_BankBehalfPhone = "BANK_BEHALF_PHONE";
  public final static  String S_RelDoneCode = "REL_DONE_CODE";
  public final static  String S_RelCustId = "REL_CUST_ID";
  public final static  String S_BillEffectiveDate = "BILL_EFFECTIVE_DATE";
  public final static  String S_BillState = "BILL_STATE";
  public final static  String S_AcctDoneDate = "ACCT_DONE_DATE";
  public final static  String S_RelTypeDesc = "REL_TYPE_DESC";
  public final static  String S_PayStateDesc = "PAY_STATE_DESC";
  public final static  String S_AcctEffectiveDate = "ACCT_EFFECTIVE_DATE";
  public final static  String S_InstallmentFlag = "INSTALLMENT_FLAG";
  public final static  String S_PaymentAccount = "PAYMENT_ACCOUNT";
  public final static  String S_PaymentAccountName = "PAYMENT_ACCOUNT_NAME";
  public final static  String S_AcctStateDesc = "ACCT_STATE_DESC";
  public final static  String S_RelOrgId = "REL_ORG_ID";
  public final static  String S_RelCreateDate = "REL_CREATE_DATE";
  public final static  String S_AcctCreateDate = "ACCT_CREATE_DATE";
  public final static  String S_UrgeStopFlagDesc = "URGE_STOP_FLAG_DESC";
  public final static  String S_AcctOrgId = "ACCT_ORG_ID";
  public final static  String S_BillCreateOpId = "BILL_CREATE_OP_ID";
  public final static  String S_BillRemarks = "BILL_REMARKS";
  public final static  String S_CycleEffectiveDate = "CYCLE_EFFECTIVE_DATE";
  public final static  String S_PartyId = "PARTY_ID";
  public final static  String S_AcctAliasName = "ACCT_ALIAS_NAME";
  public final static  String S_BillCreateDate = "BILL_CREATE_DATE";
  public final static  String S_PayOrgId = "PAY_ORG_ID";
  public final static  String S_MailProjects = "MAIL_PROJECTS";
  public final static  String S_PayExpireDate = "PAY_EXPIRE_DATE";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_CycleOpId = "CYCLE_OP_ID";
  public final static  String S_RelExpireDate = "REL_EXPIRE_DATE";
  public final static  String S_AcctStatus = "ACCT_STATUS";
  public final static  String S_CreditLevel = "CREDIT_LEVEL";
  public final static  String S_BillExpireDate = "BILL_EXPIRE_DATE";
  public final static  String S_CustomizeId = "CUSTOMIZE_ID";
  public final static  String S_CycleCreateOrgId = "CYCLE_CREATE_ORG_ID";
  public final static  String S_CycleUnit = "CYCLE_UNIT";
  public final static  String S_PaymentAccountType = "PAYMENT_ACCOUNT_TYPE";
  public final static  String S_Priority = "PRIORITY";
  public final static  String S_RelCreateOpId = "REL_CREATE_OP_ID";
  public final static  String S_CycleState = "CYCLE_STATE";
  public final static  String S_CycleType = "CYCLE_TYPE";
  public final static  String S_BillPattern = "BILL_PATTERN";
  public final static  String S_PayDoneCode = "PAY_DONE_CODE";
  public final static  String S_BillDoneCode = "BILL_DONE_CODE";
  public final static  String S_BillCycleFlag = "BILL_CYCLE_FLAG";
  public final static  String S_CycleExpireDate = "CYCLE_EXPIRE_DATE";
  public final static  String S_AcctName = "ACCT_NAME";
  public final static  String S_AcctCreateOpId = "ACCT_CREATE_OP_ID";
  public final static  String S_BillDueDate = "BILL_DUE_DATE";
  public final static  String S_CustTypeDesc = "CUST_TYPE_DESC";
  public final static  String S_CycleCreateOpId = "CYCLE_CREATE_OP_ID";
  public final static  String S_PayOpId = "PAY_OP_ID";
  public final static  String S_TaxId = "TAX_ID";
  public final static  String S_BillType = "BILL_TYPE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_AcctTypeDesc = "ACCT_TYPE_DESC";
  public final static  String S_AcctCreateOrgId = "ACCT_CREATE_ORG_ID";
  public final static  String S_RelType = "REL_TYPE";
  public final static  String S_ContEmail = "CONT_EMAIL";
  public final static  String S_CycleOrgId = "CYCLE_ORG_ID";
  public final static  String S_RelCreateOrgId = "REL_CREATE_ORG_ID";
  public final static  String S_AcctType = "ACCT_TYPE";
  public final static  String S_CustType = "CUST_TYPE";
  public final static  String S_LastName = "LAST_NAME";
  public final static  String S_CustName = "CUST_NAME";
  public final static  String S_PaymentBankCode = "PAYMENT_BANK_CODE";
  public final static  String S_PayCreateDate = "PAY_CREATE_DATE";
  public final static  String S_RelOpId = "REL_OP_ID";
  public final static  String S_BillTypeDesc = "BILL_TYPE_DESC";
  public final static  String S_PayCreateOrgId = "PAY_CREATE_ORG_ID";
  public final static  String S_BillDay = "BILL_DAY";
  public final static  String S_AcctDoneCode = "ACCT_DONE_CODE";
  public final static  String S_BillCreateOrgId = "BILL_CREATE_ORG_ID";
  public final static  String S_MailType = "MAIL_TYPE";
  public final static  String S_CycleCreateDate = "CYCLE_CREATE_DATE";
  public final static  String S_MailTypeDesc = "MAIL_TYPE_DESC";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_CreditValue = "CREDIT_VALUE";
  public final static  String S_AcctOpId = "ACCT_OP_ID";
  public final static  String S_PayState = "PAY_STATE";
  public final static  String S_PaymentAccountTypeDesc = "PAYMENT_ACCOUNT_TYPE_DESC";
  public final static  String S_ContMobile = "CONT_MOBILE";
  public final static  String S_RelEffectiveDate = "REL_EFFECTIVE_DATE";
  public final static  String S_AcctState = "ACCT_STATE";
  public final static  String S_RelDoneDate = "REL_DONE_DATE";
  public final static  String S_BillDoneDate = "BILL_DONE_DATE";
  public final static  String S_BillDayDesc = "BILL_DAY_DESC";
  public final static  String S_PayMethodDesc = "PAY_METHOD_DESC";
  public final static  String S_ContAddress = "CONT_ADDRESS";
  public final static  String S_CycleDoneDate = "CYCLE_DONE_DATE";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_PayCreateOpId = "PAY_CREATE_OP_ID";
  public final static  String S_CycleId = "CYCLE_ID";
  public final static  String S_MailDate = "MAIL_DATE";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_BillStateDesc = "BILL_STATE_DESC";
  public final static  String S_CreditLevelDesc = "CREDIT_LEVEL_DESC";
  public final static  String S_BillOrgId = "BILL_ORG_ID";
  public final static  String S_UrgeStopFlag = "URGE_STOP_FLAG";
  public final static  String S_AcctPassword = "ACCT_PASSWORD";
  public final static  String S_CycleTypeDesc = "CYCLE_TYPE_DESC";
  public final static  String S_AcctExpireDate = "ACCT_EXPIRE_DATE";
  public final static  String S_CycleStateDesc = "CYCLE_STATE_DESC";
  public final static  String S_PayMethod = "PAY_METHOD";
  public final static  String S_ContFax = "CONT_FAX";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public AccountProfileBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initRelStateDesc(String value){
     this.initProperty(S_RelStateDesc,value);
  }
  public  void setRelStateDesc(String value){
     this.set(S_RelStateDesc,value);
  }
  public  void setRelStateDescNull(){
     this.set(S_RelStateDesc,null);
  }

  public String getRelStateDesc(){
       return DataType.getAsString(this.get(S_RelStateDesc));
  
  }
  public String getRelStateDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_RelStateDesc));
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

  public void initRecipients(String value){
     this.initProperty(S_Recipients,value);
  }
  public  void setRecipients(String value){
     this.set(S_Recipients,value);
  }
  public  void setRecipientsNull(){
     this.set(S_Recipients,null);
  }

  public String getRecipients(){
       return DataType.getAsString(this.get(S_Recipients));
  
  }
  public String getRecipientsInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Recipients));
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

  public void initRelState(String value){
     this.initProperty(S_RelState,value);
  }
  public  void setRelState(String value){
     this.set(S_RelState,value);
  }
  public  void setRelStateNull(){
     this.set(S_RelState,null);
  }

  public String getRelState(){
       return DataType.getAsString(this.get(S_RelState));
  
  }
  public String getRelStateInitialValue(){
        return DataType.getAsString(this.getOldObj(S_RelState));
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

  public void initBillOpId(long value){
     this.initProperty(S_BillOpId,new Long(value));
  }
  public  void setBillOpId(long value){
     this.set(S_BillOpId,new Long(value));
  }
  public  void setBillOpIdNull(){
     this.set(S_BillOpId,null);
  }

  public long getBillOpId(){
        return DataType.getAsLong(this.get(S_BillOpId));
  
  }
  public long getBillOpIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_BillOpId));
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

  public void initPaymentBankName(String value){
     this.initProperty(S_PaymentBankName,value);
  }
  public  void setPaymentBankName(String value){
     this.set(S_PaymentBankName,value);
  }
  public  void setPaymentBankNameNull(){
     this.set(S_PaymentBankName,null);
  }

  public String getPaymentBankName(){
       return DataType.getAsString(this.get(S_PaymentBankName));
  
  }
  public String getPaymentBankNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PaymentBankName));
      }

  public void initCustCredCode(String value){
     this.initProperty(S_CustCredCode,value);
  }
  public  void setCustCredCode(String value){
     this.set(S_CustCredCode,value);
  }
  public  void setCustCredCodeNull(){
     this.set(S_CustCredCode,null);
  }

  public String getCustCredCode(){
       return DataType.getAsString(this.get(S_CustCredCode));
  
  }
  public String getCustCredCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CustCredCode));
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

  public void initContZipcode(String value){
     this.initProperty(S_ContZipcode,value);
  }
  public  void setContZipcode(String value){
     this.set(S_ContZipcode,value);
  }
  public  void setContZipcodeNull(){
     this.set(S_ContZipcode,null);
  }

  public String getContZipcode(){
       return DataType.getAsString(this.get(S_ContZipcode));
  
  }
  public String getContZipcodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContZipcode));
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

  public void initBankBehalfPhone(String value){
     this.initProperty(S_BankBehalfPhone,value);
  }
  public  void setBankBehalfPhone(String value){
     this.set(S_BankBehalfPhone,value);
  }
  public  void setBankBehalfPhoneNull(){
     this.set(S_BankBehalfPhone,null);
  }

  public String getBankBehalfPhone(){
       return DataType.getAsString(this.get(S_BankBehalfPhone));
  
  }
  public String getBankBehalfPhoneInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BankBehalfPhone));
      }

  public void initRelDoneCode(long value){
     this.initProperty(S_RelDoneCode,new Long(value));
  }
  public  void setRelDoneCode(long value){
     this.set(S_RelDoneCode,new Long(value));
  }
  public  void setRelDoneCodeNull(){
     this.set(S_RelDoneCode,null);
  }

  public long getRelDoneCode(){
        return DataType.getAsLong(this.get(S_RelDoneCode));
  
  }
  public long getRelDoneCodeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_RelDoneCode));
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

  public void initBillEffectiveDate(Timestamp value){
     this.initProperty(S_BillEffectiveDate,value);
  }
  public  void setBillEffectiveDate(Timestamp value){
     this.set(S_BillEffectiveDate,value);
  }
  public  void setBillEffectiveDateNull(){
     this.set(S_BillEffectiveDate,null);
  }

  public Timestamp getBillEffectiveDate(){
        return DataType.getAsDateTime(this.get(S_BillEffectiveDate));
  
  }
  public Timestamp getBillEffectiveDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_BillEffectiveDate));
      }

  public void initBillState(String value){
     this.initProperty(S_BillState,value);
  }
  public  void setBillState(String value){
     this.set(S_BillState,value);
  }
  public  void setBillStateNull(){
     this.set(S_BillState,null);
  }

  public String getBillState(){
       return DataType.getAsString(this.get(S_BillState));
  
  }
  public String getBillStateInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BillState));
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

  public void initPayStateDesc(String value){
     this.initProperty(S_PayStateDesc,value);
  }
  public  void setPayStateDesc(String value){
     this.set(S_PayStateDesc,value);
  }
  public  void setPayStateDescNull(){
     this.set(S_PayStateDesc,null);
  }

  public String getPayStateDesc(){
       return DataType.getAsString(this.get(S_PayStateDesc));
  
  }
  public String getPayStateDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PayStateDesc));
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

  public void initAcctStateDesc(String value){
     this.initProperty(S_AcctStateDesc,value);
  }
  public  void setAcctStateDesc(String value){
     this.set(S_AcctStateDesc,value);
  }
  public  void setAcctStateDescNull(){
     this.set(S_AcctStateDesc,null);
  }

  public String getAcctStateDesc(){
       return DataType.getAsString(this.get(S_AcctStateDesc));
  
  }
  public String getAcctStateDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AcctStateDesc));
      }

  public void initRelOrgId(long value){
     this.initProperty(S_RelOrgId,new Long(value));
  }
  public  void setRelOrgId(long value){
     this.set(S_RelOrgId,new Long(value));
  }
  public  void setRelOrgIdNull(){
     this.set(S_RelOrgId,null);
  }

  public long getRelOrgId(){
        return DataType.getAsLong(this.get(S_RelOrgId));
  
  }
  public long getRelOrgIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_RelOrgId));
      }

  public void initRelCreateDate(Timestamp value){
     this.initProperty(S_RelCreateDate,value);
  }
  public  void setRelCreateDate(Timestamp value){
     this.set(S_RelCreateDate,value);
  }
  public  void setRelCreateDateNull(){
     this.set(S_RelCreateDate,null);
  }

  public Timestamp getRelCreateDate(){
        return DataType.getAsDateTime(this.get(S_RelCreateDate));
  
  }
  public Timestamp getRelCreateDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_RelCreateDate));
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

  public void initBillCreateOpId(long value){
     this.initProperty(S_BillCreateOpId,new Long(value));
  }
  public  void setBillCreateOpId(long value){
     this.set(S_BillCreateOpId,new Long(value));
  }
  public  void setBillCreateOpIdNull(){
     this.set(S_BillCreateOpId,null);
  }

  public long getBillCreateOpId(){
        return DataType.getAsLong(this.get(S_BillCreateOpId));
  
  }
  public long getBillCreateOpIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_BillCreateOpId));
      }

  public void initBillRemarks(String value){
     this.initProperty(S_BillRemarks,value);
  }
  public  void setBillRemarks(String value){
     this.set(S_BillRemarks,value);
  }
  public  void setBillRemarksNull(){
     this.set(S_BillRemarks,null);
  }

  public String getBillRemarks(){
       return DataType.getAsString(this.get(S_BillRemarks));
  
  }
  public String getBillRemarksInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BillRemarks));
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

  public void initPartyId(long value){
     this.initProperty(S_PartyId,new Long(value));
  }
  public  void setPartyId(long value){
     this.set(S_PartyId,new Long(value));
  }
  public  void setPartyIdNull(){
     this.set(S_PartyId,null);
  }

  public long getPartyId(){
        return DataType.getAsLong(this.get(S_PartyId));
  
  }
  public long getPartyIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_PartyId));
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

  public void initBillCreateDate(Timestamp value){
     this.initProperty(S_BillCreateDate,value);
  }
  public  void setBillCreateDate(Timestamp value){
     this.set(S_BillCreateDate,value);
  }
  public  void setBillCreateDateNull(){
     this.set(S_BillCreateDate,null);
  }

  public Timestamp getBillCreateDate(){
        return DataType.getAsDateTime(this.get(S_BillCreateDate));
  
  }
  public Timestamp getBillCreateDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_BillCreateDate));
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

  public void initMailProjects(String value){
     this.initProperty(S_MailProjects,value);
  }
  public  void setMailProjects(String value){
     this.set(S_MailProjects,value);
  }
  public  void setMailProjectsNull(){
     this.set(S_MailProjects,null);
  }

  public String getMailProjects(){
       return DataType.getAsString(this.get(S_MailProjects));
  
  }
  public String getMailProjectsInitialValue(){
        return DataType.getAsString(this.getOldObj(S_MailProjects));
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

  public void initRelExpireDate(Timestamp value){
     this.initProperty(S_RelExpireDate,value);
  }
  public  void setRelExpireDate(Timestamp value){
     this.set(S_RelExpireDate,value);
  }
  public  void setRelExpireDateNull(){
     this.set(S_RelExpireDate,null);
  }

  public Timestamp getRelExpireDate(){
        return DataType.getAsDateTime(this.get(S_RelExpireDate));
  
  }
  public Timestamp getRelExpireDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_RelExpireDate));
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

  public void initBillExpireDate(Timestamp value){
     this.initProperty(S_BillExpireDate,value);
  }
  public  void setBillExpireDate(Timestamp value){
     this.set(S_BillExpireDate,value);
  }
  public  void setBillExpireDateNull(){
     this.set(S_BillExpireDate,null);
  }

  public Timestamp getBillExpireDate(){
        return DataType.getAsDateTime(this.get(S_BillExpireDate));
  
  }
  public Timestamp getBillExpireDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_BillExpireDate));
      }

  public void initCustomizeId(long value){
     this.initProperty(S_CustomizeId,new Long(value));
  }
  public  void setCustomizeId(long value){
     this.set(S_CustomizeId,new Long(value));
  }
  public  void setCustomizeIdNull(){
     this.set(S_CustomizeId,null);
  }

  public long getCustomizeId(){
        return DataType.getAsLong(this.get(S_CustomizeId));
  
  }
  public long getCustomizeIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CustomizeId));
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

  public void initRelCreateOpId(long value){
     this.initProperty(S_RelCreateOpId,new Long(value));
  }
  public  void setRelCreateOpId(long value){
     this.set(S_RelCreateOpId,new Long(value));
  }
  public  void setRelCreateOpIdNull(){
     this.set(S_RelCreateOpId,null);
  }

  public long getRelCreateOpId(){
        return DataType.getAsLong(this.get(S_RelCreateOpId));
  
  }
  public long getRelCreateOpIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_RelCreateOpId));
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

  public void initBillPattern(int value){
     this.initProperty(S_BillPattern,new Integer(value));
  }
  public  void setBillPattern(int value){
     this.set(S_BillPattern,new Integer(value));
  }
  public  void setBillPatternNull(){
     this.set(S_BillPattern,null);
  }

  public int getBillPattern(){
        return DataType.getAsInt(this.get(S_BillPattern));
  
  }
  public int getBillPatternInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_BillPattern));
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

  public void initBillDoneCode(long value){
     this.initProperty(S_BillDoneCode,new Long(value));
  }
  public  void setBillDoneCode(long value){
     this.set(S_BillDoneCode,new Long(value));
  }
  public  void setBillDoneCodeNull(){
     this.set(S_BillDoneCode,null);
  }

  public long getBillDoneCode(){
        return DataType.getAsLong(this.get(S_BillDoneCode));
  
  }
  public long getBillDoneCodeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_BillDoneCode));
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

  public void initBillDueDate(int value){
     this.initProperty(S_BillDueDate,new Integer(value));
  }
  public  void setBillDueDate(int value){
     this.set(S_BillDueDate,new Integer(value));
  }
  public  void setBillDueDateNull(){
     this.set(S_BillDueDate,null);
  }

  public int getBillDueDate(){
        return DataType.getAsInt(this.get(S_BillDueDate));
  
  }
  public int getBillDueDateInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_BillDueDate));
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

  public void initTaxId(String value){
     this.initProperty(S_TaxId,value);
  }
  public  void setTaxId(String value){
     this.set(S_TaxId,value);
  }
  public  void setTaxIdNull(){
     this.set(S_TaxId,null);
  }

  public String getTaxId(){
       return DataType.getAsString(this.get(S_TaxId));
  
  }
  public String getTaxIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_TaxId));
      }

  public void initBillType(int value){
     this.initProperty(S_BillType,new Integer(value));
  }
  public  void setBillType(int value){
     this.set(S_BillType,new Integer(value));
  }
  public  void setBillTypeNull(){
     this.set(S_BillType,null);
  }

  public int getBillType(){
        return DataType.getAsInt(this.get(S_BillType));
  
  }
  public int getBillTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_BillType));
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

  public void initContEmail(String value){
     this.initProperty(S_ContEmail,value);
  }
  public  void setContEmail(String value){
     this.set(S_ContEmail,value);
  }
  public  void setContEmailNull(){
     this.set(S_ContEmail,null);
  }

  public String getContEmail(){
       return DataType.getAsString(this.get(S_ContEmail));
  
  }
  public String getContEmailInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContEmail));
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

  public void initRelCreateOrgId(long value){
     this.initProperty(S_RelCreateOrgId,new Long(value));
  }
  public  void setRelCreateOrgId(long value){
     this.set(S_RelCreateOrgId,new Long(value));
  }
  public  void setRelCreateOrgIdNull(){
     this.set(S_RelCreateOrgId,null);
  }

  public long getRelCreateOrgId(){
        return DataType.getAsLong(this.get(S_RelCreateOrgId));
  
  }
  public long getRelCreateOrgIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_RelCreateOrgId));
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

  public void initRelOpId(long value){
     this.initProperty(S_RelOpId,new Long(value));
  }
  public  void setRelOpId(long value){
     this.set(S_RelOpId,new Long(value));
  }
  public  void setRelOpIdNull(){
     this.set(S_RelOpId,null);
  }

  public long getRelOpId(){
        return DataType.getAsLong(this.get(S_RelOpId));
  
  }
  public long getRelOpIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_RelOpId));
      }

  public void initBillTypeDesc(String value){
     this.initProperty(S_BillTypeDesc,value);
  }
  public  void setBillTypeDesc(String value){
     this.set(S_BillTypeDesc,value);
  }
  public  void setBillTypeDescNull(){
     this.set(S_BillTypeDesc,null);
  }

  public String getBillTypeDesc(){
       return DataType.getAsString(this.get(S_BillTypeDesc));
  
  }
  public String getBillTypeDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BillTypeDesc));
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

  public void initBillCreateOrgId(long value){
     this.initProperty(S_BillCreateOrgId,new Long(value));
  }
  public  void setBillCreateOrgId(long value){
     this.set(S_BillCreateOrgId,new Long(value));
  }
  public  void setBillCreateOrgIdNull(){
     this.set(S_BillCreateOrgId,null);
  }

  public long getBillCreateOrgId(){
        return DataType.getAsLong(this.get(S_BillCreateOrgId));
  
  }
  public long getBillCreateOrgIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_BillCreateOrgId));
      }

  public void initMailType(String value){
     this.initProperty(S_MailType,value);
  }
  public  void setMailType(String value){
     this.set(S_MailType,value);
  }
  public  void setMailTypeNull(){
     this.set(S_MailType,null);
  }

  public String getMailType(){
       return DataType.getAsString(this.get(S_MailType));
  
  }
  public String getMailTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_MailType));
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

  public void initMailTypeDesc(String value){
     this.initProperty(S_MailTypeDesc,value);
  }
  public  void setMailTypeDesc(String value){
     this.set(S_MailTypeDesc,value);
  }
  public  void setMailTypeDescNull(){
     this.set(S_MailTypeDesc,null);
  }

  public String getMailTypeDesc(){
       return DataType.getAsString(this.get(S_MailTypeDesc));
  
  }
  public String getMailTypeDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_MailTypeDesc));
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

  public void initPaymentAccountTypeDesc(String value){
     this.initProperty(S_PaymentAccountTypeDesc,value);
  }
  public  void setPaymentAccountTypeDesc(String value){
     this.set(S_PaymentAccountTypeDesc,value);
  }
  public  void setPaymentAccountTypeDescNull(){
     this.set(S_PaymentAccountTypeDesc,null);
  }

  public String getPaymentAccountTypeDesc(){
       return DataType.getAsString(this.get(S_PaymentAccountTypeDesc));
  
  }
  public String getPaymentAccountTypeDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PaymentAccountTypeDesc));
      }

  public void initContMobile(String value){
     this.initProperty(S_ContMobile,value);
  }
  public  void setContMobile(String value){
     this.set(S_ContMobile,value);
  }
  public  void setContMobileNull(){
     this.set(S_ContMobile,null);
  }

  public String getContMobile(){
       return DataType.getAsString(this.get(S_ContMobile));
  
  }
  public String getContMobileInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContMobile));
      }

  public void initRelEffectiveDate(Timestamp value){
     this.initProperty(S_RelEffectiveDate,value);
  }
  public  void setRelEffectiveDate(Timestamp value){
     this.set(S_RelEffectiveDate,value);
  }
  public  void setRelEffectiveDateNull(){
     this.set(S_RelEffectiveDate,null);
  }

  public Timestamp getRelEffectiveDate(){
        return DataType.getAsDateTime(this.get(S_RelEffectiveDate));
  
  }
  public Timestamp getRelEffectiveDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_RelEffectiveDate));
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

  public void initRelDoneDate(Timestamp value){
     this.initProperty(S_RelDoneDate,value);
  }
  public  void setRelDoneDate(Timestamp value){
     this.set(S_RelDoneDate,value);
  }
  public  void setRelDoneDateNull(){
     this.set(S_RelDoneDate,null);
  }

  public Timestamp getRelDoneDate(){
        return DataType.getAsDateTime(this.get(S_RelDoneDate));
  
  }
  public Timestamp getRelDoneDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_RelDoneDate));
      }

  public void initBillDoneDate(Timestamp value){
     this.initProperty(S_BillDoneDate,value);
  }
  public  void setBillDoneDate(Timestamp value){
     this.set(S_BillDoneDate,value);
  }
  public  void setBillDoneDateNull(){
     this.set(S_BillDoneDate,null);
  }

  public Timestamp getBillDoneDate(){
        return DataType.getAsDateTime(this.get(S_BillDoneDate));
  
  }
  public Timestamp getBillDoneDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_BillDoneDate));
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

  public void initPayMethodDesc(String value){
     this.initProperty(S_PayMethodDesc,value);
  }
  public  void setPayMethodDesc(String value){
     this.set(S_PayMethodDesc,value);
  }
  public  void setPayMethodDescNull(){
     this.set(S_PayMethodDesc,null);
  }

  public String getPayMethodDesc(){
       return DataType.getAsString(this.get(S_PayMethodDesc));
  
  }
  public String getPayMethodDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PayMethodDesc));
      }

  public void initContAddress(String value){
     this.initProperty(S_ContAddress,value);
  }
  public  void setContAddress(String value){
     this.set(S_ContAddress,value);
  }
  public  void setContAddressNull(){
     this.set(S_ContAddress,null);
  }

  public String getContAddress(){
       return DataType.getAsString(this.get(S_ContAddress));
  
  }
  public String getContAddressInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContAddress));
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

  public void initUserId(long value){
     this.initProperty(S_UserId,new Long(value));
  }
  public  void setUserId(long value){
     this.set(S_UserId,new Long(value));
  }
  public  void setUserIdNull(){
     this.set(S_UserId,null);
  }

  public long getUserId(){
        return DataType.getAsLong(this.get(S_UserId));
  
  }
  public long getUserIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_UserId));
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

  public void initMailDate(int value){
     this.initProperty(S_MailDate,new Integer(value));
  }
  public  void setMailDate(int value){
     this.set(S_MailDate,new Integer(value));
  }
  public  void setMailDateNull(){
     this.set(S_MailDate,null);
  }

  public int getMailDate(){
        return DataType.getAsInt(this.get(S_MailDate));
  
  }
  public int getMailDateInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_MailDate));
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

  public void initBillStateDesc(String value){
     this.initProperty(S_BillStateDesc,value);
  }
  public  void setBillStateDesc(String value){
     this.set(S_BillStateDesc,value);
  }
  public  void setBillStateDescNull(){
     this.set(S_BillStateDesc,null);
  }

  public String getBillStateDesc(){
       return DataType.getAsString(this.get(S_BillStateDesc));
  
  }
  public String getBillStateDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BillStateDesc));
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

  public void initBillOrgId(long value){
     this.initProperty(S_BillOrgId,new Long(value));
  }
  public  void setBillOrgId(long value){
     this.set(S_BillOrgId,new Long(value));
  }
  public  void setBillOrgIdNull(){
     this.set(S_BillOrgId,null);
  }

  public long getBillOrgId(){
        return DataType.getAsLong(this.get(S_BillOrgId));
  
  }
  public long getBillOrgIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_BillOrgId));
      }

  public void initUrgeStopFlag(int value){
     this.initProperty(S_UrgeStopFlag,new Integer(value));
  }
  public  void setUrgeStopFlag(int value){
     this.set(S_UrgeStopFlag,new Integer(value));
  }
  public  void setUrgeStopFlagNull(){
     this.set(S_UrgeStopFlag,null);
  }

  public int getUrgeStopFlag(){
        return DataType.getAsInt(this.get(S_UrgeStopFlag));
  
  }
  public int getUrgeStopFlagInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_UrgeStopFlag));
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

  public void initCycleStateDesc(String value){
     this.initProperty(S_CycleStateDesc,value);
  }
  public  void setCycleStateDesc(String value){
     this.set(S_CycleStateDesc,value);
  }
  public  void setCycleStateDescNull(){
     this.set(S_CycleStateDesc,null);
  }

  public String getCycleStateDesc(){
       return DataType.getAsString(this.get(S_CycleStateDesc));
  
  }
  public String getCycleStateDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CycleStateDesc));
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

  public void initContFax(String value){
     this.initProperty(S_ContFax,value);
  }
  public  void setContFax(String value){
     this.set(S_ContFax,value);
  }
  public  void setContFaxNull(){
     this.set(S_ContFax,null);
  }

  public String getContFax(){
       return DataType.getAsString(this.get(S_ContFax));
  
  }
  public String getContFaxInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContFax));
      }


 
 }

