package com.asiainfo.crm.cm.dk.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.dk.ivalues.*;

public class BOCmAcctBillFormatBean extends DataContainer implements DataContainerInterface,IBOCmAcctBillFormatValue{

  private static String  m_boName = "com.asiainfo.crm.cm.dk.bo.BOCmAcctBillFormat";



  public final static  String S_OioOrderCode = "OIO_ORDER_CODE";
  public final static  String S_BillFormat = "BILL_FORMAT";
  public final static  String S_OioUblProfile = "OIO_UBL_PROFILE";
  public final static  String S_SidePrinting = "SIDE_PRINTING";
  public final static  String S_Language = "LANGUAGE";
  public final static  String S_Ean = "EAN";
  public final static  String S_IsCharge = "IS_CHARGE";
  public final static  String S_PrintBill = "PRINT_BILL";
  public final static  String S_EanQualificator = "EAN_QUALIFICATOR";
  public final static  String S_OioUtsProfile = "OIO_UTS_PROFILE";
  public final static  String S_OioCotactName = "OIO_COTACT_NAME";
  public final static  String S_DeliveryMethod = "DELIVERY_METHOD";
  public final static  String S_DueDays = "DUE_DAYS";
  public final static  String S_EffectiveMethod = "EFFECTIVE_METHOD";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_OioAccountCode = "OIO_ACCOUNT_CODE";
  public final static  String S_BillingType = "BILLING_TYPE";
  public final static  String S_Fee = "FEE";
  public final static  String S_SendPdf = "SEND_PDF";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmAcctBillFormatBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initOioOrderCode(String value){
     this.initProperty(S_OioOrderCode,value);
  }
  public  void setOioOrderCode(String value){
     this.set(S_OioOrderCode,value);
  }
  public  void setOioOrderCodeNull(){
     this.set(S_OioOrderCode,null);
  }

  public String getOioOrderCode(){
       return DataType.getAsString(this.get(S_OioOrderCode));
  
  }
  public String getOioOrderCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OioOrderCode));
      }

  public void initBillFormat(String value){
     this.initProperty(S_BillFormat,value);
  }
  public  void setBillFormat(String value){
     this.set(S_BillFormat,value);
  }
  public  void setBillFormatNull(){
     this.set(S_BillFormat,null);
  }

  public String getBillFormat(){
       return DataType.getAsString(this.get(S_BillFormat));
  
  }
  public String getBillFormatInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BillFormat));
      }

  public void initOioUblProfile(String value){
     this.initProperty(S_OioUblProfile,value);
  }
  public  void setOioUblProfile(String value){
     this.set(S_OioUblProfile,value);
  }
  public  void setOioUblProfileNull(){
     this.set(S_OioUblProfile,null);
  }

  public String getOioUblProfile(){
       return DataType.getAsString(this.get(S_OioUblProfile));
  
  }
  public String getOioUblProfileInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OioUblProfile));
      }

  public void initSidePrinting(String value){
     this.initProperty(S_SidePrinting,value);
  }
  public  void setSidePrinting(String value){
     this.set(S_SidePrinting,value);
  }
  public  void setSidePrintingNull(){
     this.set(S_SidePrinting,null);
  }

  public String getSidePrinting(){
       return DataType.getAsString(this.get(S_SidePrinting));
  
  }
  public String getSidePrintingInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SidePrinting));
      }

  public void initLanguage(int value){
     this.initProperty(S_Language,new Integer(value));
  }
  public  void setLanguage(int value){
     this.set(S_Language,new Integer(value));
  }
  public  void setLanguageNull(){
     this.set(S_Language,null);
  }

  public int getLanguage(){
        return DataType.getAsInt(this.get(S_Language));
  
  }
  public int getLanguageInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_Language));
      }

  public void initEan(String value){
     this.initProperty(S_Ean,value);
  }
  public  void setEan(String value){
     this.set(S_Ean,value);
  }
  public  void setEanNull(){
     this.set(S_Ean,null);
  }

  public String getEan(){
       return DataType.getAsString(this.get(S_Ean));
  
  }
  public String getEanInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ean));
      }

  public void initIsCharge(int value){
     this.initProperty(S_IsCharge,new Integer(value));
  }
  public  void setIsCharge(int value){
     this.set(S_IsCharge,new Integer(value));
  }
  public  void setIsChargeNull(){
     this.set(S_IsCharge,null);
  }

  public int getIsCharge(){
        return DataType.getAsInt(this.get(S_IsCharge));
  
  }
  public int getIsChargeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IsCharge));
      }

  public void initPrintBill(int value){
     this.initProperty(S_PrintBill,new Integer(value));
  }
  public  void setPrintBill(int value){
     this.set(S_PrintBill,new Integer(value));
  }
  public  void setPrintBillNull(){
     this.set(S_PrintBill,null);
  }

  public int getPrintBill(){
        return DataType.getAsInt(this.get(S_PrintBill));
  
  }
  public int getPrintBillInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_PrintBill));
      }
      public void initSendPdf(int value){
	     this.initProperty(S_SendPdf,new Integer(value));
	  }
	  public  void setSendPdf(int value){
	     this.set(S_SendPdf,new Integer(value));
	  }
	  public  void setSendPdfNull(){
	     this.set(S_SendPdf,null);
	  }

	  public int getSendPdf(){
	        return DataType.getAsInt(this.get(S_SendPdf));
	  
	  }
	  public int getSendPdfInitialValue(){
	        return DataType.getAsInt(this.getOldObj(S_SendPdf));
	      }

  public void initEanQualificator(String value){
     this.initProperty(S_EanQualificator,value);
  }
  public  void setEanQualificator(String value){
     this.set(S_EanQualificator,value);
  }
  public  void setEanQualificatorNull(){
     this.set(S_EanQualificator,null);
  }

  public String getEanQualificator(){
       return DataType.getAsString(this.get(S_EanQualificator));
  
  }
  public String getEanQualificatorInitialValue(){
        return DataType.getAsString(this.getOldObj(S_EanQualificator));
      }

  public void initOioUtsProfile(String value){
     this.initProperty(S_OioUtsProfile,value);
  }
  public  void setOioUtsProfile(String value){
     this.set(S_OioUtsProfile,value);
  }
  public  void setOioUtsProfileNull(){
     this.set(S_OioUtsProfile,null);
  }

  public String getOioUtsProfile(){
       return DataType.getAsString(this.get(S_OioUtsProfile));
  
  }
  public String getOioUtsProfileInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OioUtsProfile));
      }

  public void initOioCotactName(String value){
     this.initProperty(S_OioCotactName,value);
  }
  public  void setOioCotactName(String value){
     this.set(S_OioCotactName,value);
  }
  public  void setOioCotactNameNull(){
     this.set(S_OioCotactName,null);
  }

  public String getOioCotactName(){
       return DataType.getAsString(this.get(S_OioCotactName));
  
  }
  public String getOioCotactNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OioCotactName));
      }

  public void initDeliveryMethod(int value){
     this.initProperty(S_DeliveryMethod,new Integer(value));
  }
  public  void setDeliveryMethod(int value){
     this.set(S_DeliveryMethod,new Integer(value));
  }
  public  void setDeliveryMethodNull(){
     this.set(S_DeliveryMethod,null);
  }

  public int getDeliveryMethod(){
        return DataType.getAsInt(this.get(S_DeliveryMethod));
  
  }
  public int getDeliveryMethodInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_DeliveryMethod));
      }

  public void initDueDays(String value){
     this.initProperty(S_DueDays,value);
  }
  public  void setDueDays(String value){
     this.set(S_DueDays,value);
  }
  public  void setDueDaysNull(){
     this.set(S_DueDays,null);
  }

  public String getDueDays(){
       return DataType.getAsString(this.get(S_DueDays));
  
  }
  public String getDueDaysInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DueDays));
      }

  public void initEffectiveMethod(String value){
     this.initProperty(S_EffectiveMethod,value);
  }
  public  void setEffectiveMethod(String value){
     this.set(S_EffectiveMethod,value);
  }
  public  void setEffectiveMethodNull(){
     this.set(S_EffectiveMethod,null);
  }

  public String getEffectiveMethod(){
       return DataType.getAsString(this.get(S_EffectiveMethod));
  
  }
  public String getEffectiveMethodInitialValue(){
        return DataType.getAsString(this.getOldObj(S_EffectiveMethod));
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

  public void initOioAccountCode(String value){
     this.initProperty(S_OioAccountCode,value);
  }
  public  void setOioAccountCode(String value){
     this.set(S_OioAccountCode,value);
  }
  public  void setOioAccountCodeNull(){
     this.set(S_OioAccountCode,null);
  }

  public String getOioAccountCode(){
       return DataType.getAsString(this.get(S_OioAccountCode));
  
  }
  public String getOioAccountCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OioAccountCode));
      }

  public void initBillingType(int value){
     this.initProperty(S_BillingType,new Integer(value));
  }
  public  void setBillingType(int value){
     this.set(S_BillingType,new Integer(value));
  }
  public  void setBillingTypeNull(){
     this.set(S_BillingType,null);
  }

  public int getBillingType(){
        return DataType.getAsInt(this.get(S_BillingType));
  
  }
  public int getBillingTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_BillingType));
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

