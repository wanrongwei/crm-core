package com.asiainfo.crm.cm.custview.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.custview.ivalues.*;

public class BOCmOperTabRelBean extends DataContainer implements DataContainerInterface,IBOCmOperTabRelValue{

  private static String  m_boName = "com.asiainfo.crm.cm.custview.bo.BOCmOperTabRel";



  public final static  String S_State = "STATE";
  public final static  String S_ViewRelId = "VIEW_REL_ID";
  public final static  String S_OperId = "OPER_ID";
  public final static  String S_ViewId = "VIEW_ID";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_Sort = "SORT";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmOperTabRelBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
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

  public void initViewRelId(long value){
     this.initProperty(S_ViewRelId,new Long(value));
  }
  public  void setViewRelId(long value){
     this.set(S_ViewRelId,new Long(value));
  }
  public  void setViewRelIdNull(){
     this.set(S_ViewRelId,null);
  }

  public long getViewRelId(){
        return DataType.getAsLong(this.get(S_ViewRelId));
  
  }
  public long getViewRelIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ViewRelId));
      }

  public void initOperId(long value){
     this.initProperty(S_OperId,new Long(value));
  }
  public  void setOperId(long value){
     this.set(S_OperId,new Long(value));
  }
  public  void setOperIdNull(){
     this.set(S_OperId,null);
  }

  public long getOperId(){
        return DataType.getAsLong(this.get(S_OperId));
  
  }
  public long getOperIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_OperId));
      }

  public void initViewId(long value){
     this.initProperty(S_ViewId,new Long(value));
  }
  public  void setViewId(long value){
     this.set(S_ViewId,new Long(value));
  }
  public  void setViewIdNull(){
     this.set(S_ViewId,null);
  }

  public long getViewId(){
        return DataType.getAsLong(this.get(S_ViewId));
  
  }
  public long getViewIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ViewId));
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

  public void initSort(int value){
     this.initProperty(S_Sort,new Integer(value));
  }
  public  void setSort(int value){
     this.set(S_Sort,new Integer(value));
  }
  public  void setSortNull(){
     this.set(S_Sort,null);
  }

  public int getSort(){
        return DataType.getAsInt(this.get(S_Sort));
  
  }
  public int getSortInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_Sort));
      }


 
 }

