package com.asiainfo.crm.cm.common.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.common.ivalues.*;

public class BOBsOperatorsBean extends DataContainer implements DataContainerInterface,IBOBsOperatorsValue{

  private static String  m_boName = "com.asiainfo.crm.cm.common.bo.BOBsOperators";



  public final static  String S_Note = "NOTE";
  public final static  String S_OperatorsName = "OPERATORS_NAME";
  public final static  String S_OperatorsGroup = "OPERATORS_GROUP";
  public final static  String S_OperatorsId = "OPERATORS_ID";
  public final static  String S_State = "STATE";
  public final static  String S_OperatorsType = "OPERATORS_TYPE";
  public final static  String S_OperatorsCode = "operators_code";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOBsOperatorsBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initNote(String value){
     this.initProperty(S_Note,value);
  }
  public  void setNote(String value){
     this.set(S_Note,value);
  }
  public  void setNoteNull(){
     this.set(S_Note,null);
  }

  public String getNote(){
       return DataType.getAsString(this.get(S_Note));
  
  }
  public String getNoteInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Note));
      }

  public void initOperatorsName(String value){
     this.initProperty(S_OperatorsName,value);
  }
  public  void setOperatorsName(String value){
     this.set(S_OperatorsName,value);
  }
  public  void setOperatorsNameNull(){
     this.set(S_OperatorsName,null);
  }

  public String getOperatorsName(){
       return DataType.getAsString(this.get(S_OperatorsName));
  
  }
  public String getOperatorsNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OperatorsName));
      }

  public void initOperatorsGroup(String value){
     this.initProperty(S_OperatorsGroup,value);
  }
  public  void setOperatorsGroup(String value){
     this.set(S_OperatorsGroup,value);
  }
  public  void setOperatorsGroupNull(){
     this.set(S_OperatorsGroup,null);
  }

  public String getOperatorsGroup(){
       return DataType.getAsString(this.get(S_OperatorsGroup));
  
  }
  public String getOperatorsGroupInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OperatorsGroup));
      }

  public void initOperatorsId(long value){
     this.initProperty(S_OperatorsId,new Long(value));
  }
  public  void setOperatorsId(long value){
     this.set(S_OperatorsId,new Long(value));
  }
  public  void setOperatorsIdNull(){
     this.set(S_OperatorsId,null);
  }

  public long getOperatorsId(){
        return DataType.getAsLong(this.get(S_OperatorsId));
  
  }
  public long getOperatorsIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_OperatorsId));
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

  public void initOperatorsType(String value){
     this.initProperty(S_OperatorsType,value);
  }
  public  void setOperatorsType(String value){
     this.set(S_OperatorsType,value);
  }
  public  void setOperatorsTypeNull(){
     this.set(S_OperatorsType,null);
  }

  public String getOperatorsType(){
       return DataType.getAsString(this.get(S_OperatorsType));
  
  }
  public String getOperatorsTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OperatorsType));
      }

  public void initOperatorsCode(String value){
     this.initProperty(S_OperatorsCode,value);
  }
  public  void setOperatorsCode(String value){
     this.set(S_OperatorsCode,value);
  }
  public  void setOperatorsCodeNull(){
     this.set(S_OperatorsCode,null);
  }

  public String getOperatorsCode(){
       return DataType.getAsString(this.get(S_OperatorsCode));
  
  }
  public String getOperatorsCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OperatorsCode));
      }


 
 }

