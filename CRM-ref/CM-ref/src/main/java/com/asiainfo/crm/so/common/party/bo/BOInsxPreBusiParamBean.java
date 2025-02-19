package com.asiainfo.crm.so.common.party.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.so.common.party.ivalues.*;

public class BOInsxPreBusiParamBean extends DataContainer implements DataContainerInterface,IBOInsxPreBusiParamValue{

  private static String  m_boName = "com.asiainfo.crm.so.common.party.bo.BOInsxPreBusiParam";



  public final static  String S_AttrValue = "ATTR_VALUE";
  public final static  String S_ReserveId = "RESERVE_ID";
  public final static  String S_SequenceId = "SEQUENCE_ID";
  public final static  String S_AttrLabel = "ATTR_LABEL";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOInsxPreBusiParamBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initAttrValue(String value){
     this.initProperty(S_AttrValue,value);
  }
  public  void setAttrValue(String value){
     this.set(S_AttrValue,value);
  }
  public  void setAttrValueNull(){
     this.set(S_AttrValue,null);
  }

  public String getAttrValue(){
       return DataType.getAsString(this.get(S_AttrValue));
  
  }
  public String getAttrValueInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AttrValue));
      }

  public void initReserveId(long value){
     this.initProperty(S_ReserveId,new Long(value));
  }
  public  void setReserveId(long value){
     this.set(S_ReserveId,new Long(value));
  }
  public  void setReserveIdNull(){
     this.set(S_ReserveId,null);
  }

  public long getReserveId(){
        return DataType.getAsLong(this.get(S_ReserveId));
  
  }
  public long getReserveIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ReserveId));
      }

  public void initSequenceId(int value){
     this.initProperty(S_SequenceId,new Integer(value));
  }
  public  void setSequenceId(int value){
     this.set(S_SequenceId,new Integer(value));
  }
  public  void setSequenceIdNull(){
     this.set(S_SequenceId,null);
  }

  public int getSequenceId(){
        return DataType.getAsInt(this.get(S_SequenceId));
  
  }
  public int getSequenceIdInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_SequenceId));
      }

  public void initAttrLabel(String value){
     this.initProperty(S_AttrLabel,value);
  }
  public  void setAttrLabel(String value){
     this.set(S_AttrLabel,value);
  }
  public  void setAttrLabelNull(){
     this.set(S_AttrLabel,null);
  }

  public String getAttrLabel(){
       return DataType.getAsString(this.get(S_AttrLabel));
  
  }
  public String getAttrLabelInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AttrLabel));
      }


 
 }

