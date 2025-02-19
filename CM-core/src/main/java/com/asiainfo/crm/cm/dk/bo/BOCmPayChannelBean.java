package com.asiainfo.crm.cm.dk.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.dk.ivalues.*;

public class BOCmPayChannelBean extends DataContainer implements DataContainerInterface,IBOCmPayChannelValue{

  private static String  m_boName = "com.asiainfo.crm.cm.dk.bo.BOCmPayChannel";



  public final static  String S_Cvr = "CVR";
  public final static  String S_CardType = "CARD_TYPE";
  public final static  String S_Cpr = "CPR";
  public final static  String S_CardExpiryDate = "CARD_EXPIRY_DATE";
  public final static  String S_ChId = "CH_ID";
  public final static  String S_PbsEffDate = "PBS_EFF_DATE";
  public final static  String S_ExpiryDate = "EXPIRY_DATE";
  public final static  String S_PbsSts = "PBS_STS";
  public final static  String S_CardId = "CARD_ID";
  public final static  String S_CardTypeName = "CARD_TYPE_NAME";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_PaymentType = "PAYMENT_TYPE";
  public final static  String S_BankId = "BANK_ID";
  public final static  String S_FastPayment = "FAST_PAYMENT";
  public final static  String S_Fee = "FEE";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmPayChannelBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initCvr(String value){
     this.initProperty(S_Cvr,value);
  }
  public  void setCvr(String value){
     this.set(S_Cvr,value);
  }
  public  void setCvrNull(){
     this.set(S_Cvr,null);
  }

  public String getCvr(){
       return DataType.getAsString(this.get(S_Cvr));
  
  }
  public String getCvrInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Cvr));
      }

  public void initCardType(int value){
     this.initProperty(S_CardType,new Integer(value));
  }
  public  void setCardType(int value){
     this.set(S_CardType,new Integer(value));
  }
  public  void setCardTypeNull(){
     this.set(S_CardType,null);
  }

  public int getCardType(){
        return DataType.getAsInt(this.get(S_CardType));
  
  }
  public int getCardTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CardType));
      }

  public void initCpr(String value){
     this.initProperty(S_Cpr,value);
  }
  public  void setCpr(String value){
     this.set(S_Cpr,value);
  }
  public  void setCprNull(){
     this.set(S_Cpr,null);
  }

  public String getCpr(){
       return DataType.getAsString(this.get(S_Cpr));
  
  }
  public String getCprInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Cpr));
      }

  public void initCardExpiryDate(String value){
     this.initProperty(S_CardExpiryDate,value);
  }
  public  void setCardExpiryDate(String value){
     this.set(S_CardExpiryDate,value);
  }
  public  void setCardExpiryDateNull(){
     this.set(S_CardExpiryDate,null);
  }

  public String getCardExpiryDate(){
       return DataType.getAsString(this.get(S_CardExpiryDate));
  
  }
  public String getCardExpiryDateInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CardExpiryDate));
      }

  public void initChId(String value){
     this.initProperty(S_ChId,value);
  }
  public  void setChId(String value){
     this.set(S_ChId,value);
  }
  public  void setChIdNull(){
     this.set(S_ChId,null);
  }

  public String getChId(){
       return DataType.getAsString(this.get(S_ChId));
  
  }
  public String getChIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ChId));
      }

  public void initPbsEffDate(Timestamp value){
     this.initProperty(S_PbsEffDate,value);
  }
  public  void setPbsEffDate(Timestamp value){
     this.set(S_PbsEffDate,value);
  }
  public  void setPbsEffDateNull(){
     this.set(S_PbsEffDate,null);
  }

  public Timestamp getPbsEffDate(){
        return DataType.getAsDateTime(this.get(S_PbsEffDate));
  
  }
  public Timestamp getPbsEffDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_PbsEffDate));
      }

  public void initExpiryDate(Timestamp value){
     this.initProperty(S_ExpiryDate,value);
  }
  public  void setExpiryDate(Timestamp value){
     this.set(S_ExpiryDate,value);
  }
  public  void setExpiryDateNull(){
     this.set(S_ExpiryDate,null);
  }

  public Timestamp getExpiryDate(){
        return DataType.getAsDateTime(this.get(S_ExpiryDate));
  
  }
  public Timestamp getExpiryDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_ExpiryDate));
      }

  public void initPbsSts(int value){
     this.initProperty(S_PbsSts,new Integer(value));
  }
  public  void setPbsSts(int value){
     this.set(S_PbsSts,new Integer(value));
  }
  public  void setPbsStsNull(){
     this.set(S_PbsSts,null);
  }

  public int getPbsSts(){
        return DataType.getAsInt(this.get(S_PbsSts));
  
  }
  public int getPbsStsInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_PbsSts));
      }

  public void initCardId(String value){
     this.initProperty(S_CardId,value);
  }
  public  void setCardId(String value){
     this.set(S_CardId,value);
  }
  public  void setCardIdNull(){
     this.set(S_CardId,null);
  }

  public String getCardId(){
       return DataType.getAsString(this.get(S_CardId));
  
  }
  public String getCardIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CardId));
      }

  public void initCardTypeName(String value){
     this.initProperty(S_CardTypeName,value);
  }
  public  void setCardTypeName(String value){
     this.set(S_CardTypeName,value);
  }
  public  void setCardTypeNameNull(){
     this.set(S_CardTypeName,null);
  }

  public String getCardTypeName(){
       return DataType.getAsString(this.get(S_CardTypeName));
  
  }
  public String getCardTypeNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CardTypeName));
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

  public void initPaymentType(int value){
     this.initProperty(S_PaymentType,new Integer(value));
  }
  public  void setPaymentType(int value){
     this.set(S_PaymentType,new Integer(value));
  }
  public  void setPaymentTypeNull(){
     this.set(S_PaymentType,null);
  }

  public int getPaymentType(){
        return DataType.getAsInt(this.get(S_PaymentType));
  
  }
  public int getPaymentTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_PaymentType));
      }

  public void initBankId(String value){
     this.initProperty(S_BankId,value);
  }
  public  void setBankId(String value){
     this.set(S_BankId,value);
  }
  public  void setBankIdNull(){
     this.set(S_BankId,null);
  }

  public String getBankId(){
       return DataType.getAsString(this.get(S_BankId));
  
  }
  public String getBankIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BankId));
      }

  public void initFastPayment(int value){
     this.initProperty(S_FastPayment,new Integer(value));
  }
  public  void setFastPayment(int value){
     this.set(S_FastPayment,new Integer(value));
  }
  public  void setFastPaymentNull(){
     this.set(S_FastPayment,null);
  }

  public int getFastPayment(){
        return DataType.getAsInt(this.get(S_FastPayment));
  
  }
  public int getFastPaymentInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_FastPayment));
      }

  public void initFee(String value){
     this.initProperty(S_Fee,value);
  }
  public  void setFee(String value){
     this.set(S_Fee,value);
  }
  public  void setFeeNull(){
     this.set(S_Fee,null);
  }

  public String getFee(){
       return DataType.getAsString(this.get(S_Fee));
  
  }
  public String getFeeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Fee));
      }


 
 }

