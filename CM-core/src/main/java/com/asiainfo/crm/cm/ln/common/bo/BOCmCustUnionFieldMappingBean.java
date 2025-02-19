package com.asiainfo.crm.cm.ln.common.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.ln.common.ivalues.*;

public class BOCmCustUnionFieldMappingBean extends DataContainer implements DataContainerInterface,IBOCmCustUnionFieldMappingValue{

  private static String  m_boName = "com.asiainfo.crm.cm.ln.common.bo.BOCmCustUnionFieldMapping";



  public final static  String S_FieldType = "FIELD_TYPE";
  public final static  String S_FieldCode = "FIELD_CODE";
  public final static  String S_FieldValue = "FIELD_VALUE";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmCustUnionFieldMappingBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initFieldType(int value){
     this.initProperty(S_FieldType,new Integer(value));
  }
  public  void setFieldType(int value){
     this.set(S_FieldType,new Integer(value));
  }
  public  void setFieldTypeNull(){
     this.set(S_FieldType,null);
  }

  public int getFieldType(){
        return DataType.getAsInt(this.get(S_FieldType));
  
  }
  public int getFieldTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_FieldType));
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

  public void initFieldValue(String value){
     this.initProperty(S_FieldValue,value);
  }
  public  void setFieldValue(String value){
     this.set(S_FieldValue,value);
  }
  public  void setFieldValueNull(){
     this.set(S_FieldValue,null);
  }

  public String getFieldValue(){
       return DataType.getAsString(this.get(S_FieldValue));
  
  }
  public String getFieldValueInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FieldValue));
      }


 
 }

