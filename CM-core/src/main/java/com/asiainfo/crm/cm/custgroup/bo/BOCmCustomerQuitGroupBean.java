package com.asiainfo.crm.cm.custgroup.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.custgroup.ivalues.*;

public class BOCmCustomerQuitGroupBean extends DataContainer implements DataContainerInterface,IBOCmCustomerQuitGroupValue{

  private static String  m_boName = "com.asiainfo.crm.cm.custgroup.bo.BOCmCustomerQuitGroup";



  public final static  String S_Ext1 = "EXT_1";
  public final static  String S_Ext4 = "EXT_4";
  public final static  String S_Ext3 = "EXT_3";
  public final static  String S_QuitMode = "QUIT_MODE";
  public final static  String S_Ext2 = "EXT_2";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_Id = "ID";
  public final static  String S_CustomerId = "CUSTOMER_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_Status = "STATUS";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmCustomerQuitGroupBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initExt1(String value){
     this.initProperty(S_Ext1,value);
  }
  public  void setExt1(String value){
     this.set(S_Ext1,value);
  }
  public  void setExt1Null(){
     this.set(S_Ext1,null);
  }

  public String getExt1(){
       return DataType.getAsString(this.get(S_Ext1));
  
  }
  public String getExt1InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext1));
      }

  public void initExt4(String value){
     this.initProperty(S_Ext4,value);
  }
  public  void setExt4(String value){
     this.set(S_Ext4,value);
  }
  public  void setExt4Null(){
     this.set(S_Ext4,null);
  }

  public String getExt4(){
       return DataType.getAsString(this.get(S_Ext4));
  
  }
  public String getExt4InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext4));
      }

  public void initExt3(String value){
     this.initProperty(S_Ext3,value);
  }
  public  void setExt3(String value){
     this.set(S_Ext3,value);
  }
  public  void setExt3Null(){
     this.set(S_Ext3,null);
  }

  public String getExt3(){
       return DataType.getAsString(this.get(S_Ext3));
  
  }
  public String getExt3InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext3));
      }

  public void initQuitMode(long value){
     this.initProperty(S_QuitMode,new Long(value));
  }
  public  void setQuitMode(long value){
     this.set(S_QuitMode,new Long(value));
  }
  public  void setQuitModeNull(){
     this.set(S_QuitMode,null);
  }

  public long getQuitMode(){
        return DataType.getAsLong(this.get(S_QuitMode));
  
  }
  public long getQuitModeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_QuitMode));
      }

  public void initExt2(String value){
     this.initProperty(S_Ext2,value);
  }
  public  void setExt2(String value){
     this.set(S_Ext2,value);
  }
  public  void setExt2Null(){
     this.set(S_Ext2,null);
  }

  public String getExt2(){
       return DataType.getAsString(this.get(S_Ext2));
  
  }
  public String getExt2InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext2));
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

  public void initId(long value){
     this.initProperty(S_Id,new Long(value));
  }
  public  void setId(long value){
     this.set(S_Id,new Long(value));
  }
  public  void setIdNull(){
     this.set(S_Id,null);
  }

  public long getId(){
        return DataType.getAsLong(this.get(S_Id));
  
  }
  public long getIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Id));
      }

  public void initCustomerId(long value){
     this.initProperty(S_CustomerId,new Long(value));
  }
  public  void setCustomerId(long value){
     this.set(S_CustomerId,new Long(value));
  }
  public  void setCustomerIdNull(){
     this.set(S_CustomerId,null);
  }

  public long getCustomerId(){
        return DataType.getAsLong(this.get(S_CustomerId));
  
  }
  public long getCustomerIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CustomerId));
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

  public void initStatus(long value){
     this.initProperty(S_Status,new Long(value));
  }
  public  void setStatus(long value){
     this.set(S_Status,new Long(value));
  }
  public  void setStatusNull(){
     this.set(S_Status,null);
  }

  public long getStatus(){
        return DataType.getAsLong(this.get(S_Status));
  
  }
  public long getStatusInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Status));
      }


 
 }

