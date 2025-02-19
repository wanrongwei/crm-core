package com.asiainfo.crm.cm.ln.account.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.ln.account.ivalues.*;

public class BOCmxAcctBankRelBean extends DataContainer implements DataContainerInterface,IBOCmxAcctBankRelValue{

  private static String  m_boName = "com.asiainfo.crm.cm.ln.account.bo.BOCmxAcctBankRel";



  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_State = "STATE";
  public final static  String S_Actiondate = "ACTIONDATE";
  public final static  String S_BankAccount = "BANK_ACCOUNT";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_BusiCode = "BUSI_CODE";
  public final static  String S_AccountExpireDate = "ACCOUNT_EXPIRE_DATE";
  public final static  String S_PfSeq = "PF_SEQ";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RelId = "REL_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_Credit = "CREDIT";
  public final static  String S_IdCard = "ID_CARD";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_BankCode = "BANK_CODE";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_PayMethod = "PAY_METHOD";
  public final static  String S_BankAccountType = "BANK_ACCOUNT_TYPE";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmxAcctBankRelBean() throws AIException{
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

  public void initActiondate(String value){
     this.initProperty(S_Actiondate,value);
  }
  public  void setActiondate(String value){
     this.set(S_Actiondate,value);
  }
  public  void setActiondateNull(){
     this.set(S_Actiondate,null);
  }

  public String getActiondate(){
       return DataType.getAsString(this.get(S_Actiondate));
  
  }
  public String getActiondateInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Actiondate));
      }

  public void initBankAccount(String value){
     this.initProperty(S_BankAccount,value);
  }
  public  void setBankAccount(String value){
     this.set(S_BankAccount,value);
  }
  public  void setBankAccountNull(){
     this.set(S_BankAccount,null);
  }

  public String getBankAccount(){
       return DataType.getAsString(this.get(S_BankAccount));
  
  }
  public String getBankAccountInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BankAccount));
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

  public void initBusiCode(long value){
     this.initProperty(S_BusiCode,new Long(value));
  }
  public  void setBusiCode(long value){
     this.set(S_BusiCode,new Long(value));
  }
  public  void setBusiCodeNull(){
     this.set(S_BusiCode,null);
  }

  public long getBusiCode(){
        return DataType.getAsLong(this.get(S_BusiCode));
  
  }
  public long getBusiCodeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_BusiCode));
      }

  public void initAccountExpireDate(String value){
     this.initProperty(S_AccountExpireDate,value);
  }
  public  void setAccountExpireDate(String value){
     this.set(S_AccountExpireDate,value);
  }
  public  void setAccountExpireDateNull(){
     this.set(S_AccountExpireDate,null);
  }

  public String getAccountExpireDate(){
       return DataType.getAsString(this.get(S_AccountExpireDate));
  
  }
  public String getAccountExpireDateInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AccountExpireDate));
      }

  public void initPfSeq(String value){
     this.initProperty(S_PfSeq,value);
  }
  public  void setPfSeq(String value){
     this.set(S_PfSeq,value);
  }
  public  void setPfSeqNull(){
     this.set(S_PfSeq,null);
  }

  public String getPfSeq(){
       return DataType.getAsString(this.get(S_PfSeq));
  
  }
  public String getPfSeqInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PfSeq));
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

  public void initRelId(long value){
     this.initProperty(S_RelId,new Long(value));
  }
  public  void setRelId(long value){
     this.set(S_RelId,new Long(value));
  }
  public  void setRelIdNull(){
     this.set(S_RelId,null);
  }

  public long getRelId(){
        return DataType.getAsLong(this.get(S_RelId));
  
  }
  public long getRelIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_RelId));
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

  public void initCredit(String value){
     this.initProperty(S_Credit,value);
  }
  public  void setCredit(String value){
     this.set(S_Credit,value);
  }
  public  void setCreditNull(){
     this.set(S_Credit,null);
  }

  public String getCredit(){
       return DataType.getAsString(this.get(S_Credit));
  
  }
  public String getCreditInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Credit));
      }

  public void initIdCard(String value){
     this.initProperty(S_IdCard,value);
  }
  public  void setIdCard(String value){
     this.set(S_IdCard,value);
  }
  public  void setIdCardNull(){
     this.set(S_IdCard,null);
  }

  public String getIdCard(){
       return DataType.getAsString(this.get(S_IdCard));
  
  }
  public String getIdCardInitialValue(){
        return DataType.getAsString(this.getOldObj(S_IdCard));
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

  public void initBankCode(String value){
     this.initProperty(S_BankCode,value);
  }
  public  void setBankCode(String value){
     this.set(S_BankCode,value);
  }
  public  void setBankCodeNull(){
     this.set(S_BankCode,null);
  }

  public String getBankCode(){
       return DataType.getAsString(this.get(S_BankCode));
  
  }
  public String getBankCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BankCode));
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

  public void initBankAccountType(int value){
     this.initProperty(S_BankAccountType,new Integer(value));
  }
  public  void setBankAccountType(int value){
     this.set(S_BankAccountType,new Integer(value));
  }
  public  void setBankAccountTypeNull(){
     this.set(S_BankAccountType,null);
  }

  public int getBankAccountType(){
        return DataType.getAsInt(this.get(S_BankAccountType));
  
  }
  public int getBankAccountTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_BankAccountType));
      }


 
 }

