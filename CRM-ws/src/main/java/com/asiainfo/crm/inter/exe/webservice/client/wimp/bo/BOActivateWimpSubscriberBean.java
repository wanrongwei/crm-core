package com.asiainfo.crm.inter.exe.webservice.client.wimp.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

public class BOActivateWimpSubscriberBean extends DataContainer implements DataContainerInterface,IBOActivateWimpSubscriberValue{

  private static String  m_boName = "com.asiainfo.crm.inter.exe.webservice.client.wimp.bo.BOActivateWimpSubscriber";
  



  public final static  String S_ExtractDate = "extract_date";
  public final static  String S_Username = "username";
  public final static  String S_ActivationDate = "activation_date";
  public final static  String S_Customerid = "customerid";
  public final static  String S_InsertTime = "insert_time";
  public final static  String S_Subscriberid = "subscriberId";
  public final static  String S_LastStreamDate = "last_stream_date";
  public final static  String S_Filedate = "filedate";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOActivateWimpSubscriberBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //�������������������ҵ���������
   throw new AIException("Cannot reset ObjectType");
 }


  public void initExtractDate(Date value){
     this.initProperty(S_ExtractDate,value);
  }
  public  void setExtractDate(Date value){
     this.set(S_ExtractDate,value);
  }
  public  void setExtractDateNull(){
     this.set(S_ExtractDate,null);
  }

  public Date getExtractDate(){
        return DataType.getAsDate(this.get(S_ExtractDate));
  
  }
  public Date getExtractDateInitialValue(){
        return DataType.getAsDate(this.getOldObj(S_ExtractDate));
      }

  public void initUsername(String value){
     this.initProperty(S_Username,value);
  }
  public  void setUsername(String value){
     this.set(S_Username,value);
  }
  public  void setUsernameNull(){
     this.set(S_Username,null);
  }

  public String getUsername(){
       return DataType.getAsString(this.get(S_Username));
  
  }
  public String getUsernameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Username));
      }

  public void initActivationDate(Date value){
     this.initProperty(S_ActivationDate,value);
  }
  public  void setActivationDate(Date value){
     this.set(S_ActivationDate,value);
  }
  public  void setActivationDateNull(){
     this.set(S_ActivationDate,null);
  }

  public Date getActivationDate(){
        return DataType.getAsDate(this.get(S_ActivationDate));
  
  }
  public Date getActivationDateInitialValue(){
        return DataType.getAsDate(this.getOldObj(S_ActivationDate));
      }

  public void initCustomerid(String value){
     this.initProperty(S_Customerid,value);
  }
  public  void setCustomerid(String value){
     this.set(S_Customerid,value);
  }
  public  void setCustomeridNull(){
     this.set(S_Customerid,null);
  }

  public String getCustomerid(){
       return DataType.getAsString(this.get(S_Customerid));
  
  }
  public String getCustomeridInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Customerid));
      }

  public void initInsertTime(Timestamp value){
     this.initProperty(S_InsertTime,value);
  }
  public  void setInsertTime(Timestamp value){
     this.set(S_InsertTime,value);
  }
  public  void setInsertTimeNull(){
     this.set(S_InsertTime,null);
  }

  public Timestamp getInsertTime(){
        return DataType.getAsDateTime(this.get(S_InsertTime));
  
  }
  public Timestamp getInsertTimeInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_InsertTime));
      }

  public void initSubscriberid(long value){
     this.initProperty(S_Subscriberid,new Long(value));
  }
  public  void setSubscriberid(long value){
     this.set(S_Subscriberid,new Long(value));
  }
  public  void setSubscriberidNull(){
     this.set(S_Subscriberid,null);
  }

  public long getSubscriberid(){
        return DataType.getAsLong(this.get(S_Subscriberid));
  
  }
  public long getSubscriberidInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Subscriberid));
      }

  public void initLastStreamDate(Date value){
     this.initProperty(S_LastStreamDate,value);
  }
  public  void setLastStreamDate(Date value){
     this.set(S_LastStreamDate,value);
  }
  public  void setLastStreamDateNull(){
     this.set(S_LastStreamDate,null);
  }

  public Date getLastStreamDate(){
        return DataType.getAsDate(this.get(S_LastStreamDate));
  
  }
  public Timestamp getLastStreamDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_LastStreamDate));
      }

  public void initFiledate(String value){
     this.initProperty(S_Filedate,value);
  }
  public  void setFiledate(String value){
     this.set(S_Filedate,value);
  }
  public  void setFiledateNull(){
     this.set(S_Filedate,null);
  }

  public String getFiledate(){
       return DataType.getAsString(this.get(S_Filedate));
  
  }
  public String getFiledateInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Filedate));
      }


 
 }

