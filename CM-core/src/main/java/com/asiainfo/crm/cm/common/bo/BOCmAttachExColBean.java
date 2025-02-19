package com.asiainfo.crm.cm.common.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.common.ivalues.*;

public class BOCmAttachExColBean extends DataContainer implements DataContainerInterface,IBOCmAttachExColValue{

  private static String  m_boName = "com.asiainfo.crm.cm.common.bo.BOCmAttachExCol";



  public final static  String S_FieldCode = "FIELD_CODE";
  public final static  String S_FieldName = "FIELD_NAME";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_ColCode = "COL_CODE";
  public final static  String S_AttachColId = "ATTACH_COL_ID";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmAttachExColBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initFieldCode(String value){
     this.initProperty(S_FieldCode,value);
  }
  public  void setFieldCode(String value){
     this.set(S_FieldCode,value);
  }
  public  void setFieldCodeNull(){
     this.set(S_FieldCode,null);
  }

  public String getFieldCode(){
       return DataType.getAsString(this.get(S_FieldCode));
  
  }
  public String getFieldCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FieldCode));
      }

  public void initFieldName(String value){
     this.initProperty(S_FieldName,value);
  }
  public  void setFieldName(String value){
     this.set(S_FieldName,value);
  }
  public  void setFieldNameNull(){
     this.set(S_FieldName,null);
  }

  public String getFieldName(){
       return DataType.getAsString(this.get(S_FieldName));
  
  }
  public String getFieldNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FieldName));
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

  public void initColCode(String value){
     this.initProperty(S_ColCode,value);
  }
  public  void setColCode(String value){
     this.set(S_ColCode,value);
  }
  public  void setColCodeNull(){
     this.set(S_ColCode,null);
  }

  public String getColCode(){
       return DataType.getAsString(this.get(S_ColCode));
  
  }
  public String getColCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ColCode));
      }

  public void initAttachColId(long value){
     this.initProperty(S_AttachColId,new Long(value));
  }
  public  void setAttachColId(long value){
     this.set(S_AttachColId,new Long(value));
  }
  public  void setAttachColIdNull(){
     this.set(S_AttachColId,null);
  }

  public long getAttachColId(){
        return DataType.getAsLong(this.get(S_AttachColId));
  
  }
  public long getAttachColIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_AttachColId));
      }


 
 }

