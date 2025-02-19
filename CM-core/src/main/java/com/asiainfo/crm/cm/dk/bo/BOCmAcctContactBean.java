package com.asiainfo.crm.cm.dk.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.dk.ivalues.*;

public class BOCmAcctContactBean extends DataContainer implements DataContainerInterface,IBOCmAcctContactValue{

  private static String  m_boName = "com.asiainfo.crm.cm.dk.bo.BOCmAcctContact";



  public final static  String S_AddressId = "ADDRESS_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_ContactName = "CONTACT_NAME";
  public final static  String S_AddressDetail = "ADDRESS_DETAIL";
  public final static  String S_MobilePhone = "MOBILE_PHONE";
  public final static  String S_Operation = "OPERATION";
  public final static  String S_Email = "EMAIL";
  public final static  String S_EffectiveWay = "EFFECTIVE_WAY";
  public final static  String S_ContactId = "CONTACT_ID";
  public final static  String S_ContactType = "CONTACT_TYPE";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmAcctContactBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initAddressId(String value){
     this.initProperty(S_AddressId,value);
  }
  public  void setAddressId(String value){
     this.set(S_AddressId,value);
  }
  public  void setAddressIdNull(){
     this.set(S_AddressId,null);
  }

  public String getAddressId(){
       return DataType.getAsString(this.get(S_AddressId));
  
  }
  public String getAddressIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AddressId));
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

  public void initContactName(String value){
     this.initProperty(S_ContactName,value);
  }
  public  void setContactName(String value){
     this.set(S_ContactName,value);
  }
  public  void setContactNameNull(){
     this.set(S_ContactName,null);
  }

  public String getContactName(){
       return DataType.getAsString(this.get(S_ContactName));
  
  }
  public String getContactNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContactName));
      }

  public void initAddressDetail(String value){
     this.initProperty(S_AddressDetail,value);
  }
  public  void setAddressDetail(String value){
     this.set(S_AddressDetail,value);
  }
  public  void setAddressDetailNull(){
     this.set(S_AddressDetail,null);
  }

  public String getAddressDetail(){
       return DataType.getAsString(this.get(S_AddressDetail));
  
  }
  public String getAddressDetailInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AddressDetail));
      }

  public void initMobilePhone(String value){
     this.initProperty(S_MobilePhone,value);
  }
  public  void setMobilePhone(String value){
     this.set(S_MobilePhone,value);
  }
  public  void setMobilePhoneNull(){
     this.set(S_MobilePhone,null);
  }

  public String getMobilePhone(){
       return DataType.getAsString(this.get(S_MobilePhone));
  
  }
  public String getMobilePhoneInitialValue(){
        return DataType.getAsString(this.getOldObj(S_MobilePhone));
      }

  public void initOperation(String value){
     this.initProperty(S_Operation,value);
  }
  public  void setOperation(String value){
     this.set(S_Operation,value);
  }
  public  void setOperationNull(){
     this.set(S_Operation,null);
  }

  public String getOperation(){
       return DataType.getAsString(this.get(S_Operation));
  
  }
  public String getOperationInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Operation));
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

  public void initEffectiveWay(String value){
     this.initProperty(S_EffectiveWay,value);
  }
  public  void setEffectiveWay(String value){
     this.set(S_EffectiveWay,value);
  }
  public  void setEffectiveWayNull(){
     this.set(S_EffectiveWay,null);
  }

  public String getEffectiveWay(){
       return DataType.getAsString(this.get(S_EffectiveWay));
  
  }
  public String getEffectiveWayInitialValue(){
        return DataType.getAsString(this.getOldObj(S_EffectiveWay));
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

  public void initContactType(int value){
     this.initProperty(S_ContactType,new Integer(value));
  }
  public  void setContactType(int value){
     this.set(S_ContactType,new Integer(value));
  }
  public  void setContactTypeNull(){
     this.set(S_ContactType,null);
  }

  public int getContactType(){
        return DataType.getAsInt(this.get(S_ContactType));
  
  }
  public int getContactTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ContactType));
      }


 
 }

