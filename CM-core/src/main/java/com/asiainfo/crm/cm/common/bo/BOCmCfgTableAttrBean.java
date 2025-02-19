package com.asiainfo.crm.cm.common.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.common.ivalues.*;

public class BOCmCfgTableAttrBean extends DataContainer implements DataContainerInterface,IBOCmCfgTableAttrValue{

  private static String  m_boName = "com.asiainfo.crm.cm.common.bo.BOCmCfgTableAttr";



  public final static  String S_TableName = "TABLE_NAME";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_AttrDesc = "ATTR_DESC";
  public final static  String S_EditType = "EDIT_TYPE";
  public final static  String S_DecimalNum = "DECIMAL_NUM";
  public final static  String S_IsMust = "IS_MUST";
  public final static  String S_ColSpan = "COL_SPAN";
  public final static  String S_Idx = "IDX";
  public final static  String S_AttrCode = "ATTR_CODE";
  public final static  String S_DefaultValue = "DEFAULT_VALUE";
  public final static  String S_Url = "URL";
  public final static  String S_Length = "LENGTH";
  public final static  String S_DataType = "DATA_TYPE";
  public final static  String S_Title = "TITLE";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmCfgTableAttrBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initTableName(String value){
     this.initProperty(S_TableName,value);
  }
  public  void setTableName(String value){
     this.set(S_TableName,value);
  }
  public  void setTableNameNull(){
     this.set(S_TableName,null);
  }

  public String getTableName(){
       return DataType.getAsString(this.get(S_TableName));
  
  }
  public String getTableNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_TableName));
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

  public void initAttrDesc(String value){
     this.initProperty(S_AttrDesc,value);
  }
  public  void setAttrDesc(String value){
     this.set(S_AttrDesc,value);
  }
  public  void setAttrDescNull(){
     this.set(S_AttrDesc,null);
  }

  public String getAttrDesc(){
       return DataType.getAsString(this.get(S_AttrDesc));
  
  }
  public String getAttrDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AttrDesc));
      }

  public void initEditType(String value){
     this.initProperty(S_EditType,value);
  }
  public  void setEditType(String value){
     this.set(S_EditType,value);
  }
  public  void setEditTypeNull(){
     this.set(S_EditType,null);
  }

  public String getEditType(){
       return DataType.getAsString(this.get(S_EditType));
  
  }
  public String getEditTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_EditType));
      }

  public void initDecimalNum(long value){
     this.initProperty(S_DecimalNum,new Long(value));
  }
  public  void setDecimalNum(long value){
     this.set(S_DecimalNum,new Long(value));
  }
  public  void setDecimalNumNull(){
     this.set(S_DecimalNum,null);
  }

  public long getDecimalNum(){
        return DataType.getAsLong(this.get(S_DecimalNum));
  
  }
  public long getDecimalNumInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_DecimalNum));
      }

  public void initIsMust(String value){
     this.initProperty(S_IsMust,value);
  }
  public  void setIsMust(String value){
     this.set(S_IsMust,value);
  }
  public  void setIsMustNull(){
     this.set(S_IsMust,null);
  }

  public String getIsMust(){
       return DataType.getAsString(this.get(S_IsMust));
  
  }
  public String getIsMustInitialValue(){
        return DataType.getAsString(this.getOldObj(S_IsMust));
      }

  public void initColSpan(int value){
     this.initProperty(S_ColSpan,new Integer(value));
  }
  public  void setColSpan(int value){
     this.set(S_ColSpan,new Integer(value));
  }
  public  void setColSpanNull(){
     this.set(S_ColSpan,null);
  }

  public int getColSpan(){
        return DataType.getAsInt(this.get(S_ColSpan));
  
  }
  public int getColSpanInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ColSpan));
      }

  public void initIdx(long value){
     this.initProperty(S_Idx,new Long(value));
  }
  public  void setIdx(long value){
     this.set(S_Idx,new Long(value));
  }
  public  void setIdxNull(){
     this.set(S_Idx,null);
  }

  public long getIdx(){
        return DataType.getAsLong(this.get(S_Idx));
  
  }
  public long getIdxInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Idx));
      }

  public void initAttrCode(String value){
     this.initProperty(S_AttrCode,value);
  }
  public  void setAttrCode(String value){
     this.set(S_AttrCode,value);
  }
  public  void setAttrCodeNull(){
     this.set(S_AttrCode,null);
  }

  public String getAttrCode(){
       return DataType.getAsString(this.get(S_AttrCode));
  
  }
  public String getAttrCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AttrCode));
      }

  public void initDefaultValue(String value){
     this.initProperty(S_DefaultValue,value);
  }
  public  void setDefaultValue(String value){
     this.set(S_DefaultValue,value);
  }
  public  void setDefaultValueNull(){
     this.set(S_DefaultValue,null);
  }

  public String getDefaultValue(){
       return DataType.getAsString(this.get(S_DefaultValue));
  
  }
  public String getDefaultValueInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DefaultValue));
      }

  public void initUrl(String value){
     this.initProperty(S_Url,value);
  }
  public  void setUrl(String value){
     this.set(S_Url,value);
  }
  public  void setUrlNull(){
     this.set(S_Url,null);
  }

  public String getUrl(){
       return DataType.getAsString(this.get(S_Url));
  
  }
  public String getUrlInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Url));
      }

  public void initLength(long value){
     this.initProperty(S_Length,new Long(value));
  }
  public  void setLength(long value){
     this.set(S_Length,new Long(value));
  }
  public  void setLengthNull(){
     this.set(S_Length,null);
  }

  public long getLength(){
        return DataType.getAsLong(this.get(S_Length));
  
  }
  public long getLengthInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Length));
      }

  public void initDataType(String value){
     this.initProperty(S_DataType,value);
  }
  public  void setDataType(String value){
     this.set(S_DataType,value);
  }
  public  void setDataTypeNull(){
     this.set(S_DataType,null);
  }

  public String getDataType(){
       return DataType.getAsString(this.get(S_DataType));
  
  }
  public String getDataTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DataType));
      }

  public void initTitle(String value){
     this.initProperty(S_Title,value);
  }
  public  void setTitle(String value){
     this.set(S_Title,value);
  }
  public  void setTitleNull(){
     this.set(S_Title,null);
  }

  public String getTitle(){
       return DataType.getAsString(this.get(S_Title));
  
  }
  public String getTitleInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Title));
      }


 
 }

