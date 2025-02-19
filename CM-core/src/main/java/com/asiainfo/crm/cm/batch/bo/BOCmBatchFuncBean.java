package com.asiainfo.crm.cm.batch.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.batch.ivalues.*;

public class BOCmBatchFuncBean extends DataContainer implements DataContainerInterface,IBOCmBatchFuncValue{

  private static String  m_boName = "com.asiainfo.crm.cm.batch.bo.BOCmBatchFunc";



  public final static  String S_State = "STATE";
  public final static  String S_DealService = "DEAL_SERVICE";
  public final static  String S_DealFunc = "DEAL_FUNC";
  public final static  String S_ConfigId = "CONFIG_ID";
  public final static  String S_Notes = "NOTES";
  public final static  String S_BatchName = "BATCH_NAME";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmBatchFuncBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
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

  public void initDealService(String value){
     this.initProperty(S_DealService,value);
  }
  public  void setDealService(String value){
     this.set(S_DealService,value);
  }
  public  void setDealServiceNull(){
     this.set(S_DealService,null);
  }

  public String getDealService(){
       return DataType.getAsString(this.get(S_DealService));
  
  }
  public String getDealServiceInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DealService));
      }

  public void initDealFunc(String value){
     this.initProperty(S_DealFunc,value);
  }
  public  void setDealFunc(String value){
     this.set(S_DealFunc,value);
  }
  public  void setDealFuncNull(){
     this.set(S_DealFunc,null);
  }

  public String getDealFunc(){
       return DataType.getAsString(this.get(S_DealFunc));
  
  }
  public String getDealFuncInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DealFunc));
      }

  public void initConfigId(long value){
     this.initProperty(S_ConfigId,new Long(value));
  }
  public  void setConfigId(long value){
     this.set(S_ConfigId,new Long(value));
  }
  public  void setConfigIdNull(){
     this.set(S_ConfigId,null);
  }

  public long getConfigId(){
        return DataType.getAsLong(this.get(S_ConfigId));
  
  }
  public long getConfigIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ConfigId));
      }

  public void initNotes(String value){
     this.initProperty(S_Notes,value);
  }
  public  void setNotes(String value){
     this.set(S_Notes,value);
  }
  public  void setNotesNull(){
     this.set(S_Notes,null);
  }

  public String getNotes(){
       return DataType.getAsString(this.get(S_Notes));
  
  }
  public String getNotesInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Notes));
      }

  public void initBatchName(String value){
     this.initProperty(S_BatchName,value);
  }
  public  void setBatchName(String value){
     this.set(S_BatchName,value);
  }
  public  void setBatchNameNull(){
     this.set(S_BatchName,null);
  }

  public String getBatchName(){
       return DataType.getAsString(this.get(S_BatchName));
  
  }
  public String getBatchNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BatchName));
      }


 
 }

