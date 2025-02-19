package com.asiainfo.crm.cm.common.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.common.ivalues.*;

public class BOCmKernelClassCfgBean extends DataContainer implements DataContainerInterface,IBOCmKernelClassCfgValue{

  private static String  m_boName = "com.asiainfo.crm.cm.common.bo.BOCmKernelClassCfg";



  public final static  String S_IsGlobal = "IS_GLOBAL";
  public final static  String S_FinalClass = "FINAL_CLASS";
  public final static  String S_CurClass = "CUR_CLASS";
  public final static  String S_Id = "ID";
  public final static  String S_Notes = "NOTES";
  public final static  String S_KernelClass = "KERNEL_CLASS";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmKernelClassCfgBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initIsGlobal(int value){
     this.initProperty(S_IsGlobal,new Integer(value));
  }
  public  void setIsGlobal(int value){
     this.set(S_IsGlobal,new Integer(value));
  }
  public  void setIsGlobalNull(){
     this.set(S_IsGlobal,null);
  }

  public int getIsGlobal(){
        return DataType.getAsInt(this.get(S_IsGlobal));
  
  }
  public int getIsGlobalInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IsGlobal));
      }

  public void initFinalClass(int value){
     this.initProperty(S_FinalClass,new Integer(value));
  }
  public  void setFinalClass(int value){
     this.set(S_FinalClass,new Integer(value));
  }
  public  void setFinalClassNull(){
     this.set(S_FinalClass,null);
  }

  public int getFinalClass(){
        return DataType.getAsInt(this.get(S_FinalClass));
  
  }
  public int getFinalClassInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_FinalClass));
      }

  public void initCurClass(int value){
     this.initProperty(S_CurClass,new Integer(value));
  }
  public  void setCurClass(int value){
     this.set(S_CurClass,new Integer(value));
  }
  public  void setCurClassNull(){
     this.set(S_CurClass,null);
  }

  public int getCurClass(){
        return DataType.getAsInt(this.get(S_CurClass));
  
  }
  public int getCurClassInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CurClass));
      }

  public void initId(long value){
     this.initProperty(S_Id,new Long(value));
  }
  public  void setId(long value){
     this.set(S_Id,new Long(value));
  }
  public  void setIdNull(){
     this.set(S_Id,null);
  }

  public long getId(){
        return DataType.getAsLong(this.get(S_Id));
  
  }
  public long getIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Id));
      }

  public void initNotes(String value){
     this.initProperty(S_Notes,value);
  }
  public  void setNotes(String value){
     this.set(S_Notes,value);
  }
  public  void setNotesNull(){
     this.set(S_Notes,null);
  }

  public String getNotes(){
       return DataType.getAsString(this.get(S_Notes));
  
  }
  public String getNotesInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Notes));
      }

  public void initKernelClass(int value){
     this.initProperty(S_KernelClass,new Integer(value));
  }
  public  void setKernelClass(int value){
     this.set(S_KernelClass,new Integer(value));
  }
  public  void setKernelClassNull(){
     this.set(S_KernelClass,null);
  }

  public int getKernelClass(){
        return DataType.getAsInt(this.get(S_KernelClass));
  
  }
  public int getKernelClassInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_KernelClass));
      }


 
 }

