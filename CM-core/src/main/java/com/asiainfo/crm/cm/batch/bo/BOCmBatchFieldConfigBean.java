package com.asiainfo.crm.cm.batch.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.batch.ivalues.*;

public class BOCmBatchFieldConfigBean extends DataContainer implements DataContainerInterface,IBOCmBatchFieldConfigValue{

  private static String  m_boName = "com.asiainfo.crm.cm.batch.bo.BOCmBatchFieldConfig";



  public final static  String S_DbCol = "DB_COL";
  public final static  String S_State = "STATE";
  public final static  String S_IsNull = "IS_NULL";
  public final static  String S_DsParam = "DS_PARAM";
  public final static  String S_DsService = "DS_SERVICE";
  public final static  String S_FieldCfgId = "FIELD_CFG_ID";
  public final static  String S_ConfigId = "CONFIG_ID";
  public final static  String S_DsMethod = "DS_METHOD";
  public final static  String S_DescText = "DESC_TEXT";
  public final static  String S_DsValue = "DS_VALUE";
  public final static  String S_FieldTitle = "FIELD_TITLE";
  public final static  String S_Sort = "SORT";
  public final static  String S_DsDisplay = "DS_DISPLAY";
  public final static  String S_DescType = "DESC_TYPE";
  public final static  String S_FieldRel = "FIELD_REL";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmBatchFieldConfigBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initDbCol(String value){
     this.initProperty(S_DbCol,value);
  }
  public  void setDbCol(String value){
     this.set(S_DbCol,value);
  }
  public  void setDbColNull(){
     this.set(S_DbCol,null);
  }

  public String getDbCol(){
       return DataType.getAsString(this.get(S_DbCol));
  
  }
  public String getDbColInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DbCol));
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

  public void initIsNull(int value){
     this.initProperty(S_IsNull,new Integer(value));
  }
  public  void setIsNull(int value){
     this.set(S_IsNull,new Integer(value));
  }
  public  void setIsNullNull(){
     this.set(S_IsNull,null);
  }

  public int getIsNull(){
        return DataType.getAsInt(this.get(S_IsNull));
  
  }
  public int getIsNullInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IsNull));
      }

  public void initDsParam(String value){
     this.initProperty(S_DsParam,value);
  }
  public  void setDsParam(String value){
     this.set(S_DsParam,value);
  }
  public  void setDsParamNull(){
     this.set(S_DsParam,null);
  }

  public String getDsParam(){
       return DataType.getAsString(this.get(S_DsParam));
  
  }
  public String getDsParamInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DsParam));
      }

  public void initDsService(String value){
     this.initProperty(S_DsService,value);
  }
  public  void setDsService(String value){
     this.set(S_DsService,value);
  }
  public  void setDsServiceNull(){
     this.set(S_DsService,null);
  }

  public String getDsService(){
       return DataType.getAsString(this.get(S_DsService));
  
  }
  public String getDsServiceInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DsService));
      }

  public void initFieldCfgId(long value){
     this.initProperty(S_FieldCfgId,new Long(value));
  }
  public  void setFieldCfgId(long value){
     this.set(S_FieldCfgId,new Long(value));
  }
  public  void setFieldCfgIdNull(){
     this.set(S_FieldCfgId,null);
  }

  public long getFieldCfgId(){
        return DataType.getAsLong(this.get(S_FieldCfgId));
  
  }
  public long getFieldCfgIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_FieldCfgId));
      }

  public void initConfigId(long value){
     this.initProperty(S_ConfigId,new Long(value));
  }
  public  void setConfigId(long value){
     this.set(S_ConfigId,new Long(value));
  }
  public  void setConfigIdNull(){
     this.set(S_ConfigId,null);
  }

  public long getConfigId(){
        return DataType.getAsLong(this.get(S_ConfigId));
  
  }
  public long getConfigIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ConfigId));
      }

  public void initDsMethod(String value){
     this.initProperty(S_DsMethod,value);
  }
  public  void setDsMethod(String value){
     this.set(S_DsMethod,value);
  }
  public  void setDsMethodNull(){
     this.set(S_DsMethod,null);
  }

  public String getDsMethod(){
       return DataType.getAsString(this.get(S_DsMethod));
  
  }
  public String getDsMethodInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DsMethod));
      }

  public void initDescText(String value){
     this.initProperty(S_DescText,value);
  }
  public  void setDescText(String value){
     this.set(S_DescText,value);
  }
  public  void setDescTextNull(){
     this.set(S_DescText,null);
  }

  public String getDescText(){
       return DataType.getAsString(this.get(S_DescText));
  
  }
  public String getDescTextInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DescText));
      }

  public void initDsValue(String value){
     this.initProperty(S_DsValue,value);
  }
  public  void setDsValue(String value){
     this.set(S_DsValue,value);
  }
  public  void setDsValueNull(){
     this.set(S_DsValue,null);
  }

  public String getDsValue(){
       return DataType.getAsString(this.get(S_DsValue));
  
  }
  public String getDsValueInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DsValue));
      }

  public void initFieldTitle(String value){
     this.initProperty(S_FieldTitle,value);
  }
  public  void setFieldTitle(String value){
     this.set(S_FieldTitle,value);
  }
  public  void setFieldTitleNull(){
     this.set(S_FieldTitle,null);
  }

  public String getFieldTitle(){
       return DataType.getAsString(this.get(S_FieldTitle));
  
  }
  public String getFieldTitleInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FieldTitle));
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

  public void initDsDisplay(String value){
     this.initProperty(S_DsDisplay,value);
  }
  public  void setDsDisplay(String value){
     this.set(S_DsDisplay,value);
  }
  public  void setDsDisplayNull(){
     this.set(S_DsDisplay,null);
  }

  public String getDsDisplay(){
       return DataType.getAsString(this.get(S_DsDisplay));
  
  }
  public String getDsDisplayInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DsDisplay));
      }

  public void initDescType(int value){
     this.initProperty(S_DescType,new Integer(value));
  }
  public  void setDescType(int value){
     this.set(S_DescType,new Integer(value));
  }
  public  void setDescTypeNull(){
     this.set(S_DescType,null);
  }

  public int getDescType(){
        return DataType.getAsInt(this.get(S_DescType));
  
  }
  public int getDescTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_DescType));
      }

  public void initFieldRel(long value){
     this.initProperty(S_FieldRel,new Long(value));
  }
  public  void setFieldRel(long value){
     this.set(S_FieldRel,new Long(value));
  }
  public  void setFieldRelNull(){
     this.set(S_FieldRel,null);
  }

  public long getFieldRel(){
        return DataType.getAsLong(this.get(S_FieldRel));
  
  }
  public long getFieldRelInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_FieldRel));
      }


 
 }

