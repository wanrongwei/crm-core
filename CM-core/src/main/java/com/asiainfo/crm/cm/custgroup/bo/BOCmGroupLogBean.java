package com.asiainfo.crm.cm.custgroup.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.custgroup.ivalues.*;

public class BOCmGroupLogBean extends DataContainer implements DataContainerInterface,IBOCmGroupLogValue{

  private static String  m_boName = "com.asiainfo.crm.cm.custgroup.bo.BOCmGroupLog";



  public final static  String S_LogInfo6 = "LOG_INFO6";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_LogInfo5 = "LOG_INFO5";
  public final static  String S_EventCreateDate = "EVENT_CREATE_DATE";
  public final static  String S_LogCreator = "LOG_CREATOR";
  public final static  String S_LogInfo2 = "LOG_INFO2";
  public final static  String S_OperatorObjectId = "OPERATOR_OBJECT_ID";
  public final static  String S_LogInfo1 = "LOG_INFO1";
  public final static  String S_LogInfoIndex = "LOG_INFO_INDEX";
  public final static  String S_LogInfo4 = "LOG_INFO4";
  public final static  String S_LogInfo3 = "LOG_INFO3";
  public final static  String S_GroupId = "GROUP_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_LogEventType = "LOG_EVENT_TYPE";
  public final static  String S_LogType = "LOG_TYPE";
  public final static  String S_BatchDealId = "BATCH_DEAL_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_LogId = "LOG_ID";
  public final static  String S_LogLevel = "LOG_LEVEL";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmGroupLogBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initLogInfo6(String value){
     this.initProperty(S_LogInfo6,value);
  }
  public  void setLogInfo6(String value){
     this.set(S_LogInfo6,value);
  }
  public  void setLogInfo6Null(){
     this.set(S_LogInfo6,null);
  }

  public String getLogInfo6(){
       return DataType.getAsString(this.get(S_LogInfo6));
  
  }
  public String getLogInfo6InitialValue(){
        return DataType.getAsString(this.getOldObj(S_LogInfo6));
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

  public void initLogInfo5(String value){
     this.initProperty(S_LogInfo5,value);
  }
  public  void setLogInfo5(String value){
     this.set(S_LogInfo5,value);
  }
  public  void setLogInfo5Null(){
     this.set(S_LogInfo5,null);
  }

  public String getLogInfo5(){
       return DataType.getAsString(this.get(S_LogInfo5));
  
  }
  public String getLogInfo5InitialValue(){
        return DataType.getAsString(this.getOldObj(S_LogInfo5));
      }

  public void initEventCreateDate(Timestamp value){
     this.initProperty(S_EventCreateDate,value);
  }
  public  void setEventCreateDate(Timestamp value){
     this.set(S_EventCreateDate,value);
  }
  public  void setEventCreateDateNull(){
     this.set(S_EventCreateDate,null);
  }

  public Timestamp getEventCreateDate(){
        return DataType.getAsDateTime(this.get(S_EventCreateDate));
  
  }
  public Timestamp getEventCreateDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_EventCreateDate));
      }

  public void initLogCreator(long value){
     this.initProperty(S_LogCreator,new Long(value));
  }
  public  void setLogCreator(long value){
     this.set(S_LogCreator,new Long(value));
  }
  public  void setLogCreatorNull(){
     this.set(S_LogCreator,null);
  }

  public long getLogCreator(){
        return DataType.getAsLong(this.get(S_LogCreator));
  
  }
  public long getLogCreatorInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_LogCreator));
      }

  public void initLogInfo2(String value){
     this.initProperty(S_LogInfo2,value);
  }
  public  void setLogInfo2(String value){
     this.set(S_LogInfo2,value);
  }
  public  void setLogInfo2Null(){
     this.set(S_LogInfo2,null);
  }

  public String getLogInfo2(){
       return DataType.getAsString(this.get(S_LogInfo2));
  
  }
  public String getLogInfo2InitialValue(){
        return DataType.getAsString(this.getOldObj(S_LogInfo2));
      }

  public void initOperatorObjectId(long value){
     this.initProperty(S_OperatorObjectId,new Long(value));
  }
  public  void setOperatorObjectId(long value){
     this.set(S_OperatorObjectId,new Long(value));
  }
  public  void setOperatorObjectIdNull(){
     this.set(S_OperatorObjectId,null);
  }

  public long getOperatorObjectId(){
        return DataType.getAsLong(this.get(S_OperatorObjectId));
  
  }
  public long getOperatorObjectIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_OperatorObjectId));
      }

  public void initLogInfo1(String value){
     this.initProperty(S_LogInfo1,value);
  }
  public  void setLogInfo1(String value){
     this.set(S_LogInfo1,value);
  }
  public  void setLogInfo1Null(){
     this.set(S_LogInfo1,null);
  }

  public String getLogInfo1(){
       return DataType.getAsString(this.get(S_LogInfo1));
  
  }
  public String getLogInfo1InitialValue(){
        return DataType.getAsString(this.getOldObj(S_LogInfo1));
      }

  public void initLogInfoIndex(long value){
     this.initProperty(S_LogInfoIndex,new Long(value));
  }
  public  void setLogInfoIndex(long value){
     this.set(S_LogInfoIndex,new Long(value));
  }
  public  void setLogInfoIndexNull(){
     this.set(S_LogInfoIndex,null);
  }

  public long getLogInfoIndex(){
        return DataType.getAsLong(this.get(S_LogInfoIndex));
  
  }
  public long getLogInfoIndexInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_LogInfoIndex));
      }

  public void initLogInfo4(String value){
     this.initProperty(S_LogInfo4,value);
  }
  public  void setLogInfo4(String value){
     this.set(S_LogInfo4,value);
  }
  public  void setLogInfo4Null(){
     this.set(S_LogInfo4,null);
  }

  public String getLogInfo4(){
       return DataType.getAsString(this.get(S_LogInfo4));
  
  }
  public String getLogInfo4InitialValue(){
        return DataType.getAsString(this.getOldObj(S_LogInfo4));
      }

  public void initLogInfo3(String value){
     this.initProperty(S_LogInfo3,value);
  }
  public  void setLogInfo3(String value){
     this.set(S_LogInfo3,value);
  }
  public  void setLogInfo3Null(){
     this.set(S_LogInfo3,null);
  }

  public String getLogInfo3(){
       return DataType.getAsString(this.get(S_LogInfo3));
  
  }
  public String getLogInfo3InitialValue(){
        return DataType.getAsString(this.getOldObj(S_LogInfo3));
      }

  public void initGroupId(long value){
     this.initProperty(S_GroupId,new Long(value));
  }
  public  void setGroupId(long value){
     this.set(S_GroupId,new Long(value));
  }
  public  void setGroupIdNull(){
     this.set(S_GroupId,null);
  }

  public long getGroupId(){
        return DataType.getAsLong(this.get(S_GroupId));
  
  }
  public long getGroupIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_GroupId));
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

  public void initLogEventType(String value){
     this.initProperty(S_LogEventType,value);
  }
  public  void setLogEventType(String value){
     this.set(S_LogEventType,value);
  }
  public  void setLogEventTypeNull(){
     this.set(S_LogEventType,null);
  }

  public String getLogEventType(){
       return DataType.getAsString(this.get(S_LogEventType));
  
  }
  public String getLogEventTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_LogEventType));
      }

  public void initLogType(long value){
     this.initProperty(S_LogType,new Long(value));
  }
  public  void setLogType(long value){
     this.set(S_LogType,new Long(value));
  }
  public  void setLogTypeNull(){
     this.set(S_LogType,null);
  }

  public long getLogType(){
        return DataType.getAsLong(this.get(S_LogType));
  
  }
  public long getLogTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_LogType));
      }

  public void initBatchDealId(String value){
     this.initProperty(S_BatchDealId,value);
  }
  public  void setBatchDealId(String value){
     this.set(S_BatchDealId,value);
  }
  public  void setBatchDealIdNull(){
     this.set(S_BatchDealId,null);
  }

  public String getBatchDealId(){
       return DataType.getAsString(this.get(S_BatchDealId));
  
  }
  public String getBatchDealIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BatchDealId));
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

  public void initLogId(long value){
     this.initProperty(S_LogId,new Long(value));
  }
  public  void setLogId(long value){
     this.set(S_LogId,new Long(value));
  }
  public  void setLogIdNull(){
     this.set(S_LogId,null);
  }

  public long getLogId(){
        return DataType.getAsLong(this.get(S_LogId));
  
  }
  public long getLogIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_LogId));
      }

  public void initLogLevel(long value){
     this.initProperty(S_LogLevel,new Long(value));
  }
  public  void setLogLevel(long value){
     this.set(S_LogLevel,new Long(value));
  }
  public  void setLogLevelNull(){
     this.set(S_LogLevel,null);
  }

  public long getLogLevel(){
        return DataType.getAsLong(this.get(S_LogLevel));
  
  }
  public long getLogLevelInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_LogLevel));
      }


 
 }

