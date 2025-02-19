package com.asiainfo.crm.cm.common.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.common.ivalues.*;

public class BOCmExportListBean extends DataContainer implements DataContainerInterface,IBOCmExportListValue{

  private static String  m_boName = "com.asiainfo.crm.cm.common.bo.BOCmExportList";



  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_ExportId = "EXPORT_ID";
  public final static  String S_TableInfo = "TABLE_INFO";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_ColumnTitles = "COLUMN_TITLES";
  public final static  String S_FileName = "FILE_NAME";
  public final static  String S_FtpFileName = "FTP_FILE_NAME";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_ConditionStr = "CONDITION_STR";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmExportListBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
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

  public void initExportId(long value){
     this.initProperty(S_ExportId,new Long(value));
  }
  public  void setExportId(long value){
     this.set(S_ExportId,new Long(value));
  }
  public  void setExportIdNull(){
     this.set(S_ExportId,null);
  }

  public long getExportId(){
        return DataType.getAsLong(this.get(S_ExportId));
  
  }
  public long getExportIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ExportId));
      }

  public void initTableInfo(String value){
     this.initProperty(S_TableInfo,value);
  }
  public  void setTableInfo(String value){
     this.set(S_TableInfo,value);
  }
  public  void setTableInfoNull(){
     this.set(S_TableInfo,null);
  }

  public String getTableInfo(){
       return DataType.getAsString(this.get(S_TableInfo));
  
  }
  public String getTableInfoInitialValue(){
        return DataType.getAsString(this.getOldObj(S_TableInfo));
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

  public void initColumnTitles(String value){
     this.initProperty(S_ColumnTitles,value);
  }
  public  void setColumnTitles(String value){
     this.set(S_ColumnTitles,value);
  }
  public  void setColumnTitlesNull(){
     this.set(S_ColumnTitles,null);
  }

  public String getColumnTitles(){
       return DataType.getAsString(this.get(S_ColumnTitles));
  
  }
  public String getColumnTitlesInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ColumnTitles));
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

  public void initFtpFileName(String value){
     this.initProperty(S_FtpFileName,value);
  }
  public  void setFtpFileName(String value){
     this.set(S_FtpFileName,value);
  }
  public  void setFtpFileNameNull(){
     this.set(S_FtpFileName,null);
  }

  public String getFtpFileName(){
       return DataType.getAsString(this.get(S_FtpFileName));
  
  }
  public String getFtpFileNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FtpFileName));
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

  public void initConditionStr(String value){
     this.initProperty(S_ConditionStr,value);
  }
  public  void setConditionStr(String value){
     this.set(S_ConditionStr,value);
  }
  public  void setConditionStrNull(){
     this.set(S_ConditionStr,null);
  }

  public String getConditionStr(){
       return DataType.getAsString(this.get(S_ConditionStr));
  
  }
  public String getConditionStrInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ConditionStr));
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


 
 }

