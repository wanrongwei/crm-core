package com.asiainfo.crm.cm.common.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.common.ivalues.*;

public class BOCmAttachBean extends DataContainer implements DataContainerInterface,IBOCmAttachValue{

  private static String  m_boName = "com.asiainfo.crm.cm.common.bo.BOCmAttach";



  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_BusiSheetId = "BUSI_SHEET_ID";
  public final static  String S_FileName = "FILE_NAME";
  public final static  String S_AttachId = "ATTACH_ID";
  public final static  String S_BusiTypeCode = "BUSI_TYPE_CODE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_FileSize = "FILE_SIZE";
  public final static  String S_AttachName = "ATTACH_NAME";
  public final static  String S_FileExt = "FILE_EXT";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmAttachBean() throws AIException{
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

  public void initBusiSheetId(String value){
     this.initProperty(S_BusiSheetId,value);
  }
  public  void setBusiSheetId(String value){
     this.set(S_BusiSheetId,value);
  }
  public  void setBusiSheetIdNull(){
     this.set(S_BusiSheetId,null);
  }

  public String getBusiSheetId(){
       return DataType.getAsString(this.get(S_BusiSheetId));
  
  }
  public String getBusiSheetIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BusiSheetId));
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

  public void initAttachId(long value){
     this.initProperty(S_AttachId,new Long(value));
  }
  public  void setAttachId(long value){
     this.set(S_AttachId,new Long(value));
  }
  public  void setAttachIdNull(){
     this.set(S_AttachId,null);
  }

  public long getAttachId(){
        return DataType.getAsLong(this.get(S_AttachId));
  
  }
  public long getAttachIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_AttachId));
      }

  public void initBusiTypeCode(String value){
     this.initProperty(S_BusiTypeCode,value);
  }
  public  void setBusiTypeCode(String value){
     this.set(S_BusiTypeCode,value);
  }
  public  void setBusiTypeCodeNull(){
     this.set(S_BusiTypeCode,null);
  }

  public String getBusiTypeCode(){
       return DataType.getAsString(this.get(S_BusiTypeCode));
  
  }
  public String getBusiTypeCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BusiTypeCode));
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

  public void initFileSize(long value){
     this.initProperty(S_FileSize,new Long(value));
  }
  public  void setFileSize(long value){
     this.set(S_FileSize,new Long(value));
  }
  public  void setFileSizeNull(){
     this.set(S_FileSize,null);
  }

  public long getFileSize(){
        return DataType.getAsLong(this.get(S_FileSize));
  
  }
  public long getFileSizeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_FileSize));
      }

  public void initAttachName(String value){
     this.initProperty(S_AttachName,value);
  }
  public  void setAttachName(String value){
     this.set(S_AttachName,value);
  }
  public  void setAttachNameNull(){
     this.set(S_AttachName,null);
  }

  public String getAttachName(){
       return DataType.getAsString(this.get(S_AttachName));
  
  }
  public String getAttachNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AttachName));
      }

  public void initFileExt(String value){
     this.initProperty(S_FileExt,value);
  }
  public  void setFileExt(String value){
     this.set(S_FileExt,value);
  }
  public  void setFileExtNull(){
     this.set(S_FileExt,null);
  }

  public String getFileExt(){
       return DataType.getAsString(this.get(S_FileExt));
  
  }
  public String getFileExtInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FileExt));
      }


 
 }

