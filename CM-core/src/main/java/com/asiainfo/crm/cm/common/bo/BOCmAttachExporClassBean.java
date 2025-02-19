package com.asiainfo.crm.cm.common.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.common.ivalues.*;

public class BOCmAttachExporClassBean extends DataContainer implements DataContainerInterface,IBOCmAttachExporClassValue{

  private static String  m_boName = "com.asiainfo.crm.cm.common.bo.BOCmAttachExporClass";



  public final static  String S_FileMode = "FILE_MODE";
  public final static  String S_State = "STATE";
  public final static  String S_FunctionCode = "FUNCTION_CODE";
  public final static  String S_AttachClassId = "ATTACH_CLASS_ID";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_MethCode = "METH_CODE";
  public final static  String S_FtpCode = "FTP_CODE";
  public final static  String S_ClassName = "CLASS_NAME";
  public final static  String S_FunctionName = "FUNCTION_NAME";
  public final static  String S_MethName = "METH_NAME";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmAttachExporClassBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initFileMode(String value){
     this.initProperty(S_FileMode,value);
  }
  public  void setFileMode(String value){
     this.set(S_FileMode,value);
  }
  public  void setFileModeNull(){
     this.set(S_FileMode,null);
  }

  public String getFileMode(){
       return DataType.getAsString(this.get(S_FileMode));
  
  }
  public String getFileModeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FileMode));
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

  public void initFunctionCode(String value){
     this.initProperty(S_FunctionCode,value);
  }
  public  void setFunctionCode(String value){
     this.set(S_FunctionCode,value);
  }
  public  void setFunctionCodeNull(){
     this.set(S_FunctionCode,null);
  }

  public String getFunctionCode(){
       return DataType.getAsString(this.get(S_FunctionCode));
  
  }
  public String getFunctionCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FunctionCode));
      }

  public void initAttachClassId(long value){
     this.initProperty(S_AttachClassId,new Long(value));
  }
  public  void setAttachClassId(long value){
     this.set(S_AttachClassId,new Long(value));
  }
  public  void setAttachClassIdNull(){
     this.set(S_AttachClassId,null);
  }

  public long getAttachClassId(){
        return DataType.getAsLong(this.get(S_AttachClassId));
  
  }
  public long getAttachClassIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_AttachClassId));
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

  public void initMethCode(String value){
     this.initProperty(S_MethCode,value);
  }
  public  void setMethCode(String value){
     this.set(S_MethCode,value);
  }
  public  void setMethCodeNull(){
     this.set(S_MethCode,null);
  }

  public String getMethCode(){
       return DataType.getAsString(this.get(S_MethCode));
  
  }
  public String getMethCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_MethCode));
      }

  public void initFtpCode(String value){
     this.initProperty(S_FtpCode,value);
  }
  public  void setFtpCode(String value){
     this.set(S_FtpCode,value);
  }
  public  void setFtpCodeNull(){
     this.set(S_FtpCode,null);
  }

  public String getFtpCode(){
       return DataType.getAsString(this.get(S_FtpCode));
  
  }
  public String getFtpCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FtpCode));
      }

  public void initClassName(String value){
     this.initProperty(S_ClassName,value);
  }
  public  void setClassName(String value){
     this.set(S_ClassName,value);
  }
  public  void setClassNameNull(){
     this.set(S_ClassName,null);
  }

  public String getClassName(){
       return DataType.getAsString(this.get(S_ClassName));
  
  }
  public String getClassNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ClassName));
      }

  public void initFunctionName(String value){
     this.initProperty(S_FunctionName,value);
  }
  public  void setFunctionName(String value){
     this.set(S_FunctionName,value);
  }
  public  void setFunctionNameNull(){
     this.set(S_FunctionName,null);
  }

  public String getFunctionName(){
       return DataType.getAsString(this.get(S_FunctionName));
  
  }
  public String getFunctionNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FunctionName));
      }

  public void initMethName(String value){
     this.initProperty(S_MethName,value);
  }
  public  void setMethName(String value){
     this.set(S_MethName,value);
  }
  public  void setMethNameNull(){
     this.set(S_MethName,null);
  }

  public String getMethName(){
       return DataType.getAsString(this.get(S_MethName));
  
  }
  public String getMethNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_MethName));
      }


 
 }

