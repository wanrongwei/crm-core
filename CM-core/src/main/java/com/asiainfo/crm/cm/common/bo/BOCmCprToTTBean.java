package com.asiainfo.crm.cm.common.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.common.ivalues.*;

public class BOCmCprToTTBean extends DataContainer implements DataContainerInterface,IBOCmCprToTTValue{

  private static String  m_boName = "com.asiainfo.crm.cm.common.bo.BOCmCprToTT";



  public final static  String S_ErrorMsg = "error_msg";
  public final static  String S_DoneCode = "done_code";
  public final static  String S_DoneDate = "done_date";
  public final static  String S_CreateOrgId = "create_org_id";
  public final static  String S_RegionId = "region_id";
  public final static  String S_OpId = "op_id";
  public final static  String S_CreateOpId = "create_op_id";
  public final static  String S_TaskId = "task_id";
  public final static  String S_ExpireDate = "expire_date";
  public final static  String S_OrgId = "org_id";
  public final static  String S_EffectiveDate = "effective_date";
  public final static  String S_CprId = "cpr_id";
  public final static  String S_ErrorCode = "error_code";
  public final static  String S_State = "state";
  public final static  String S_CreateDate = "create_date";
  public final static  String S_Remarks = "remarks";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmCprToTTBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //姝ょ??版??瀹瑰?ㄤ??介??缃?涓??″?硅薄绫诲??
   throw new AIException("Cannot reset ObjectType");
 }


  public void initErrorMsg(String value){
     this.initProperty(S_ErrorMsg,value);
  }
  public  void setErrorMsg(String value){
     this.set(S_ErrorMsg,value);
  }
  public  void setErrorMsgNull(){
     this.set(S_ErrorMsg,null);
  }

  public String getErrorMsg(){
       return DataType.getAsString(this.get(S_ErrorMsg));
  
  }
  public String getErrorMsgInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ErrorMsg));
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

  public void initRegionId(String value){
     this.initProperty(S_RegionId,value);
  }
  public  void setRegionId(String value){
     this.set(S_RegionId,value);
  }
  public  void setRegionIdNull(){
     this.set(S_RegionId,null);
  }

  public String getRegionId(){
       return DataType.getAsString(this.get(S_RegionId));
  
  }
  public String getRegionIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_RegionId));
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

  public void initTaskId(long value){
     this.initProperty(S_TaskId,new Long(value));
  }
  public  void setTaskId(long value){
     this.set(S_TaskId,new Long(value));
  }
  public  void setTaskIdNull(){
     this.set(S_TaskId,null);
  }

  public long getTaskId(){
        return DataType.getAsLong(this.get(S_TaskId));
  
  }
  public long getTaskIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_TaskId));
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

  public void initCprId(long value){
     this.initProperty(S_CprId,new Long(value));
  }
  public  void setCprId(long value){
     this.set(S_CprId,new Long(value));
  }
  public  void setCprIdNull(){
     this.set(S_CprId,null);
  }

  public long getCprId(){
        return DataType.getAsLong(this.get(S_CprId));
  
  }
  public long getCprIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CprId));
      }

  public void initErrorCode(String value){
     this.initProperty(S_ErrorCode,value);
  }
  public  void setErrorCode(String value){
     this.set(S_ErrorCode,value);
  }
  public  void setErrorCodeNull(){
     this.set(S_ErrorCode,null);
  }

  public String getErrorCode(){
       return DataType.getAsString(this.get(S_ErrorCode));
  
  }
  public String getErrorCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ErrorCode));
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


 
 }

