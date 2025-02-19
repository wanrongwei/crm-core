package com.asiainfo.crm.cm.common.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.common.ivalues.*;

public class BOCmCfgSpecListTypeBean extends DataContainer implements DataContainerInterface,IBOCmCfgSpecListTypeValue{

  private static String  m_boName = "com.asiainfo.crm.cm.common.bo.BOCmCfgSpecListType";



  public final static  String S_TypeName = "TYPE_NAME";
  public final static  String S_State = "STATE";
  public final static  String S_TypeDesc = "TYPE_DESC";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_TypeLevel = "TYPE_LEVEL";
  public final static  String S_TypeId = "TYPE_ID";
  public final static  String S_ParentTypeId = "PARENT_TYPE_ID";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmCfgSpecListTypeBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initTypeName(String value){
     this.initProperty(S_TypeName,value);
  }
  public  void setTypeName(String value){
     this.set(S_TypeName,value);
  }
  public  void setTypeNameNull(){
     this.set(S_TypeName,null);
  }

  public String getTypeName(){
       return DataType.getAsString(this.get(S_TypeName));
  
  }
  public String getTypeNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_TypeName));
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

  public void initTypeDesc(String value){
     this.initProperty(S_TypeDesc,value);
  }
  public  void setTypeDesc(String value){
     this.set(S_TypeDesc,value);
  }
  public  void setTypeDescNull(){
     this.set(S_TypeDesc,null);
  }

  public String getTypeDesc(){
       return DataType.getAsString(this.get(S_TypeDesc));
  
  }
  public String getTypeDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_TypeDesc));
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

  public void initTypeLevel(int value){
     this.initProperty(S_TypeLevel,new Integer(value));
  }
  public  void setTypeLevel(int value){
     this.set(S_TypeLevel,new Integer(value));
  }
  public  void setTypeLevelNull(){
     this.set(S_TypeLevel,null);
  }

  public int getTypeLevel(){
        return DataType.getAsInt(this.get(S_TypeLevel));
  
  }
  public int getTypeLevelInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_TypeLevel));
      }

  public void initTypeId(int value){
     this.initProperty(S_TypeId,new Integer(value));
  }
  public  void setTypeId(int value){
     this.set(S_TypeId,new Integer(value));
  }
  public  void setTypeIdNull(){
     this.set(S_TypeId,null);
  }

  public int getTypeId(){
        return DataType.getAsInt(this.get(S_TypeId));
  
  }
  public int getTypeIdInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_TypeId));
      }

  public void initParentTypeId(int value){
     this.initProperty(S_ParentTypeId,new Integer(value));
  }
  public  void setParentTypeId(int value){
     this.set(S_ParentTypeId,new Integer(value));
  }
  public  void setParentTypeIdNull(){
     this.set(S_ParentTypeId,null);
  }

  public int getParentTypeId(){
        return DataType.getAsInt(this.get(S_ParentTypeId));
  
  }
  public int getParentTypeIdInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ParentTypeId));
      }


 
 }

