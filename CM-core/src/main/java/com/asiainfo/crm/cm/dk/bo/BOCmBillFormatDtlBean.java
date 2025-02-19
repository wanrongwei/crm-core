package com.asiainfo.crm.cm.dk.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.dk.ivalues.*;

public class BOCmBillFormatDtlBean extends DataContainer implements DataContainerInterface,IBOCmBillFormatDtlValue{

  private static String  m_boName = "com.asiainfo.crm.cm.dk.bo.BOCmBillFormatDtl";



  public final static  String S_ValidType = "VALID_TYPE";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_MailCode = "MAIL_CODE";
  public final static  String S_MailName = "MAIL_NAME";
  public final static  String S_BillFormatName = "BILL_FORMAT_NAME";
  public final static  String S_AddressDesc = "ADDRESS_DESC";
  public final static  String S_DtlNo = "DTL_NO";
  public final static  String S_BillFormatId = "BILL_FORMAT_ID";
  public final static  String S_Email = "EMAIL";
  public final static  String S_CustType = "CUST_TYPE";
  public final static  String S_OperType = "OPER_TYPE";
  public final static  String S_Action = "ACTION";
  public final static  String S_IsPrimary = "IS_PRIMARY";
  public final static  String S_BillingType = "BILLING_TYPE";
  public final static  String S_IsCharge = "IS_CHARGE";
  public final static  String S_ContactId = "CONTACT_ID";
  public final static  String S_AddressId = "ADDRESS_ID";
  public final static  String S_AttInvoice = "ATT_INVOICE";
  public final static  String S_SendPdf = "SEND_PDF";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmBillFormatDtlBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initValidType(int value){
     this.initProperty(S_ValidType,new Integer(value));
  }
  public  void setValidType(int value){
     this.set(S_ValidType,new Integer(value));
  }
  public  void setValidTypeNull(){
     this.set(S_ValidType,null);
  }

  public int getValidType(){
        return DataType.getAsInt(this.get(S_ValidType));
  
  }
  public int getValidTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ValidType));
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

  public void initMailCode(long value){
     this.initProperty(S_MailCode,new Long(value));
  }
  public  void setMailCode(long value){
     this.set(S_MailCode,new Long(value));
  }
  public  void setMailCodeNull(){
     this.set(S_MailCode,null);
  }

  public long getMailCode(){
        return DataType.getAsLong(this.get(S_MailCode));
  
  }
  public long getMailCodeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_MailCode));
      }
  
  
  public void initMailName(String value){
	     this.initProperty(S_MailName,value);
	  }
	  public  void setMailName(String value){
	     this.set(S_MailName,value);
	  }
	  public  void setMailNameNull(){
	     this.set(S_MailName,null);
	  }

	  public String getMailName(){
	        return DataType.getAsString(this.get(S_MailName));
	  
	  }
	  public String getMailNameInitialValue(){
	        return DataType.getAsString(this.getOldObj(S_MailName));
	      }
	  
	  public void initBillFormatName(String value){
		  this.initProperty(S_BillFormatName,value);
	  }
	  public  void setBillFormatName(String value){
		  this.set(S_BillFormatName,value);
	  }
	  public  void setBillFormatNameNull(){
		  this.set(S_BillFormatName,null);
	  }
	  
	  public String getBillFormatName(){
		  return DataType.getAsString(this.get(S_BillFormatName));
		  
	  }
	  public String getBillFormatNameInitialValue(){
		  return DataType.getAsString(this.getOldObj(S_BillFormatName));
	  }

  public void initAddressDesc(String value){
     this.initProperty(S_AddressDesc,value);
  }
  public  void setAddressDesc(String value){
     this.set(S_AddressDesc,value);
  }
  public  void setAddressDescNull(){
     this.set(S_AddressDesc,null);
  }

  public String getAddressDesc(){
       return DataType.getAsString(this.get(S_AddressDesc));
  
  }
  public String getAddressDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AddressDesc));
      }

  public void initDtlNo(long value){
     this.initProperty(S_DtlNo,new Long(value));
  }
  public  void setDtlNo(long value){
     this.set(S_DtlNo,new Long(value));
  }
  public  void setDtlNoNull(){
     this.set(S_DtlNo,null);
  }

  public long getDtlNo(){
        return DataType.getAsLong(this.get(S_DtlNo));
  
  }
  public long getDtlNoInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_DtlNo));
      }

  public void initBillFormatId(int value){
     this.initProperty(S_BillFormatId,new Integer(value));
  }
  public  void setBillFormatId(int value){
     this.set(S_BillFormatId,new Integer(value));
  }
  public  void setBillFormatIdNull(){
     this.set(S_BillFormatId,null);
  }

  public int getBillFormatId(){
        return DataType.getAsInt(this.get(S_BillFormatId));
  
  }
  public int getBillFormatIdInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_BillFormatId));
      }

  public void initEmail(String value){
     this.initProperty(S_Email,value);
  }
  public  void setEmail(String value){
     this.set(S_Email,value);
  }
  public  void setEmailNull(){
     this.set(S_Email,null);
  }

  public String getEmail(){
       return DataType.getAsString(this.get(S_Email));
  
  }
  public String getEmailInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Email));
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

  public void initOperType(int value){
     this.initProperty(S_OperType,new Integer(value));
  }
  public  void setOperType(int value){
     this.set(S_OperType,new Integer(value));
  }
  public  void setOperTypeNull(){
     this.set(S_OperType,null);
  }

  public int getOperType(){
        return DataType.getAsInt(this.get(S_OperType));
  
  }
  public int getOperTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_OperType));
      }

  public void initAction(String value){
     this.initProperty(S_Action,value);
  }
  public  void setAction(String value){
     this.set(S_Action,value);
  }
  public  void setActionNull(){
     this.set(S_Action,null);
  }

  public String getAction(){
       return DataType.getAsString(this.get(S_Action));
  
  }
  public String getActionInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Action));
      }

  public void initIsPrimary(int value){
     this.initProperty(S_IsPrimary,new Integer(value));
  }
  public  void setIsPrimary(int value){
     this.set(S_IsPrimary,new Integer(value));
  }
  public  void setIsPrimaryNull(){
     this.set(S_IsPrimary,null);
  }

  public int getIsPrimary(){
        return DataType.getAsInt(this.get(S_IsPrimary));
  
  }
  public int getIsPrimaryInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IsPrimary));
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

  public void initContactId(long value){
     this.initProperty(S_ContactId,new Long(value));
  }
  public  void setContactId(long value){
     this.set(S_ContactId,new Long(value));
  }
  public  void setContactIdNull(){
     this.set(S_ContactId,null);
  }

  public long getContactId(){
        return DataType.getAsLong(this.get(S_ContactId));
  
  }
  public long getContactIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ContactId));
      }

  public void initAddressId(long value){
     this.initProperty(S_AddressId,new Long(value));
  }
  public  void setAddressId(long value){
     this.set(S_AddressId,new Long(value));
  }
  public  void setAddressIdNull(){
     this.set(S_AddressId,null);
  }

  public long getAddressId(){
        return DataType.getAsLong(this.get(S_AddressId));
  
  }
  public long getAddressIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_AddressId));
      }


  public void initAttInvoice(String value){
	     this.initProperty(S_AttInvoice,value);
	  }
	  public  void setAttInvoice(String value){
	     this.set(S_AttInvoice,value);
	  }
	  public  void setAttInvoiceNull(){
	     this.set(S_AttInvoice,null);
	  }

	  public String getAttInvoice(){
	       return DataType.getAsString(this.get(S_AttInvoice));
	  
	  }
	  public String getAttInvoiceInitialValue(){
	        return DataType.getAsString(this.getOldObj(S_AttInvoice));
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
 }

