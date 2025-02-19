package com.asiainfo.crm.cm.common.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.common.ivalues.*;

public class BOCmInterfaceLogBean extends DataContainer implements DataContainerInterface,IBOCmInterfaceLogValue{

  private static String  m_boName = "com.asiainfo.crm.cm.common.bo.BOCmInterfaceLog";



  public final static  String S_OpId = "OP_ID";
  public final static  String S_LogId = "LOG_ID";
  public final static  String S_ExeParam = "EXE_PARAM";
  public final static  String S_ExeCnt = "EXE_CNT";
  public final static  String S_ExeTime = "EXE_TIME";
  public final static  String S_StartTime = "START_TIME";
  public final static  String S_BusiId = "BUSI_ID";
  public final static  String S_MethodName = "METHOD_NAME";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_ExeResult = "EXE_RESULT";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmInterfaceLogBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
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

  public void initExeParam(String value){
     this.initProperty(S_ExeParam,value);
  }
  public  void setExeParam(String value){
     this.set(S_ExeParam,value);
  }
  public  void setExeParamNull(){
     this.set(S_ExeParam,null);
  }

  public String getExeParam(){
       return DataType.getAsString(this.get(S_ExeParam));
  
  }
  public String getExeParamInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ExeParam));
      }

  public void initExeCnt(long value){
     this.initProperty(S_ExeCnt,new Long(value));
  }
  public  void setExeCnt(long value){
     this.set(S_ExeCnt,new Long(value));
  }
  public  void setExeCntNull(){
     this.set(S_ExeCnt,null);
  }

  public long getExeCnt(){
        return DataType.getAsLong(this.get(S_ExeCnt));
  
  }
  public long getExeCntInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ExeCnt));
      }

  public void initExeTime(double value){
     this.initProperty(S_ExeTime,new Double(value));
  }
  public  void setExeTime(double value){
     this.set(S_ExeTime,new Double(value));
  }
  public  void setExeTimeNull(){
     this.set(S_ExeTime,null);
  }

  public double getExeTime(){
        return DataType.getAsDouble(this.get(S_ExeTime));
  
  }
  public double getExeTimeInitialValue(){
        return DataType.getAsDouble(this.getOldObj(S_ExeTime));
      }

  public void initStartTime(Timestamp value){
     this.initProperty(S_StartTime,value);
  }
  public  void setStartTime(Timestamp value){
     this.set(S_StartTime,value);
  }
  public  void setStartTimeNull(){
     this.set(S_StartTime,null);
  }

  public Timestamp getStartTime(){
        return DataType.getAsDateTime(this.get(S_StartTime));
  
  }
  public Timestamp getStartTimeInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_StartTime));
      }

  public void initBusiId(String value){
     this.initProperty(S_BusiId,value);
  }
  public  void setBusiId(String value){
     this.set(S_BusiId,value);
  }
  public  void setBusiIdNull(){
     this.set(S_BusiId,null);
  }

  public String getBusiId(){
       return DataType.getAsString(this.get(S_BusiId));
  
  }
  public String getBusiIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BusiId));
      }

  public void initMethodName(String value){
     this.initProperty(S_MethodName,value);
  }
  public  void setMethodName(String value){
     this.set(S_MethodName,value);
  }
  public  void setMethodNameNull(){
     this.set(S_MethodName,null);
  }

  public String getMethodName(){
       return DataType.getAsString(this.get(S_MethodName));
  
  }
  public String getMethodNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_MethodName));
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

  public void initExeResult(String value){
     this.initProperty(S_ExeResult,value);
  }
  public  void setExeResult(String value){
     this.set(S_ExeResult,value);
  }
  public  void setExeResultNull(){
     this.set(S_ExeResult,null);
  }

  public String getExeResult(){
       return DataType.getAsString(this.get(S_ExeResult));
  
  }
  public String getExeResultInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ExeResult));
      }


 
 }

