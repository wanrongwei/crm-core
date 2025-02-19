package com.asiainfo.crm.cm.custview.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.custview.ivalues.*;

public class BOCmOperFieldRelBean extends DataContainer implements DataContainerInterface,IBOCmOperFieldRelValue{

  private static String  m_boName = "com.asiainfo.crm.cm.custview.bo.BOCmOperFieldRel";



  public final static  String S_FieldName = "FIELD_NAME";
  public final static  String S_State = "STATE";
  public final static  String S_OperId = "OPER_ID";
  public final static  String S_BceFrameId = "BCE_FRAME_ID";
  public final static  String S_ViewId = "VIEW_ID";
  public final static  String S_FieldRelId = "FIELD_REL_ID";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_BceFormId = "BCE_FORM_ID";
  public final static  String S_Sort = "SORT";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmOperFieldRelBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
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

  public void initBceFrameId(long value){
     this.initProperty(S_BceFrameId,new Long(value));
  }
  public  void setBceFrameId(long value){
     this.set(S_BceFrameId,new Long(value));
  }
  public  void setBceFrameIdNull(){
     this.set(S_BceFrameId,null);
  }

  public long getBceFrameId(){
        return DataType.getAsLong(this.get(S_BceFrameId));
  
  }
  public long getBceFrameIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_BceFrameId));
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

  public void initFieldRelId(long value){
     this.initProperty(S_FieldRelId,new Long(value));
  }
  public  void setFieldRelId(long value){
     this.set(S_FieldRelId,new Long(value));
  }
  public  void setFieldRelIdNull(){
     this.set(S_FieldRelId,null);
  }

  public long getFieldRelId(){
        return DataType.getAsLong(this.get(S_FieldRelId));
  
  }
  public long getFieldRelIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_FieldRelId));
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

  public void initBceFormId(String value){
     this.initProperty(S_BceFormId,value);
  }
  public  void setBceFormId(String value){
     this.set(S_BceFormId,value);
  }
  public  void setBceFormIdNull(){
     this.set(S_BceFormId,null);
  }

  public String getBceFormId(){
       return DataType.getAsString(this.get(S_BceFormId));
  
  }
  public String getBceFormIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BceFormId));
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

