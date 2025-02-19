package com.asiainfo.crm.cm.common.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.common.ivalues.*;

public class BOCmCfgSpecListTypeRelBean extends DataContainer implements DataContainerInterface,IBOCmCfgSpecListTypeRelValue{

  private static String  m_boName = "com.asiainfo.crm.cm.common.bo.BOCmCfgSpecListTypeRel";



  public final static  String S_RelId = "REL_ID";
  public final static  String S_State = "STATE";
  public final static  String S_RelTypeId = "REL_TYPE_ID";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_RelDesc = "REL_DESC";
  public final static  String S_RelType = "REL_TYPE";
  public final static  String S_TypeId = "TYPE_ID";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmCfgSpecListTypeRelBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initRelId(int value){
     this.initProperty(S_RelId,new Integer(value));
  }
  public  void setRelId(int value){
     this.set(S_RelId,new Integer(value));
  }
  public  void setRelIdNull(){
     this.set(S_RelId,null);
  }

  public int getRelId(){
        return DataType.getAsInt(this.get(S_RelId));
  
  }
  public int getRelIdInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_RelId));
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

  public void initRelTypeId(int value){
     this.initProperty(S_RelTypeId,new Integer(value));
  }
  public  void setRelTypeId(int value){
     this.set(S_RelTypeId,new Integer(value));
  }
  public  void setRelTypeIdNull(){
     this.set(S_RelTypeId,null);
  }

  public int getRelTypeId(){
        return DataType.getAsInt(this.get(S_RelTypeId));
  
  }
  public int getRelTypeIdInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_RelTypeId));
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

  public void initRelDesc(String value){
     this.initProperty(S_RelDesc,value);
  }
  public  void setRelDesc(String value){
     this.set(S_RelDesc,value);
  }
  public  void setRelDescNull(){
     this.set(S_RelDesc,null);
  }

  public String getRelDesc(){
       return DataType.getAsString(this.get(S_RelDesc));
  
  }
  public String getRelDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_RelDesc));
      }

  public void initRelType(int value){
     this.initProperty(S_RelType,new Integer(value));
  }
  public  void setRelType(int value){
     this.set(S_RelType,new Integer(value));
  }
  public  void setRelTypeNull(){
     this.set(S_RelType,null);
  }

  public int getRelType(){
        return DataType.getAsInt(this.get(S_RelType));
  
  }
  public int getRelTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_RelType));
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


 
 }

