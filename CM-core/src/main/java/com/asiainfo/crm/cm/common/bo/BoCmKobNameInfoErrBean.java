package com.asiainfo.crm.cm.common.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.common.ivalues.*;

public class BoCmKobNameInfoErrBean extends DataContainer implements DataContainerInterface,IBoCmKobNameInfoErrValue{

  private static String  m_boName = "com.asiainfo.crm.cm.common.bo.BoCmKobNameInfoErr";



  public final static  String S_RecordId = "record_id";
  public final static  String S_DetalInfo = "detal_info";
  public final static  String S_ErrMsg = "err_msg";
  public final static  String S_FileName = "file_name";
  public final static  String S_ErrDate = "err_date";
  public final static  String S_KobNmmber = "kob_nmmber";
  public final static  String S_CreateDate = "create_date";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BoCmKobNameInfoErrBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initRecordId(long value){
     this.initProperty(S_RecordId,new Long(value));
  }
  public  void setRecordId(long value){
     this.set(S_RecordId,new Long(value));
  }
  public  void setRecordIdNull(){
     this.set(S_RecordId,null);
  }

  public long getRecordId(){
        return DataType.getAsLong(this.get(S_RecordId));
  
  }
  public long getRecordIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_RecordId));
      }

  public void initDetalInfo(String value){
     this.initProperty(S_DetalInfo,value);
  }
  public  void setDetalInfo(String value){
     this.set(S_DetalInfo,value);
  }
  public  void setDetalInfoNull(){
     this.set(S_DetalInfo,null);
  }

  public String getDetalInfo(){
       return DataType.getAsString(this.get(S_DetalInfo));
  
  }
  public String getDetalInfoInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DetalInfo));
      }

  public void initErrMsg(String value){
     this.initProperty(S_ErrMsg,value);
  }
  public  void setErrMsg(String value){
     this.set(S_ErrMsg,value);
  }
  public  void setErrMsgNull(){
     this.set(S_ErrMsg,null);
  }

  public String getErrMsg(){
       return DataType.getAsString(this.get(S_ErrMsg));
  
  }
  public String getErrMsgInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ErrMsg));
      }

  public void initFileName(String value){
     this.initProperty(S_FileName,value);
  }
  public  void setFileName(String value){
     this.set(S_FileName,value);
  }
  public  void setFileNameNull(){
     this.set(S_FileName,null);
  }

  public String getFileName(){
       return DataType.getAsString(this.get(S_FileName));
  
  }
  public String getFileNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FileName));
      }

  public void initErrDate(Timestamp value){
     this.initProperty(S_ErrDate,value);
  }
  public  void setErrDate(Timestamp value){
     this.set(S_ErrDate,value);
  }
  public  void setErrDateNull(){
     this.set(S_ErrDate,null);
  }

  public Timestamp getErrDate(){
        return DataType.getAsDateTime(this.get(S_ErrDate));
  
  }
  public Timestamp getErrDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_ErrDate));
      }

  public void initKobNmmber(String value){
     this.initProperty(S_KobNmmber,value);
  }
  public  void setKobNmmber(String value){
     this.set(S_KobNmmber,value);
  }
  public  void setKobNmmberNull(){
     this.set(S_KobNmmber,null);
  }

  public String getKobNmmber(){
       return DataType.getAsString(this.get(S_KobNmmber));
  
  }
  public String getKobNmmberInitialValue(){
        return DataType.getAsString(this.getOldObj(S_KobNmmber));
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


 
 }

