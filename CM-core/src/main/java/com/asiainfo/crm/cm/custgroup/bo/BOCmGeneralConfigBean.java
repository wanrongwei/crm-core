package com.asiainfo.crm.cm.custgroup.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.custgroup.ivalues.*;

public class BOCmGeneralConfigBean extends DataContainer implements DataContainerInterface,IBOCmGeneralConfigValue{

  private static String  m_boName = "com.asiainfo.crm.cm.custgroup.bo.BOCmGeneralConfig";



  public final static  String S_OpId = "OP_ID";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_SrcType = "SRC_TYPE";
  public final static  String S_ConfigDesc = "CONFIG_DESC";
  public final static  String S_Value5 = "VALUE5";
  public final static  String S_Value4 = "VALUE4";
  public final static  String S_LastUpdateDate = "LAST_UPDATE_DATE";
  public final static  String S_Value3 = "VALUE3";
  public final static  String S_TenantId = "TENANT_ID";
  public final static  String S_Value2 = "VALUE2";
  public final static  String S_Value1 = "VALUE1";
  public final static  String S_ConfigType = "CONFIG_TYPE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_ConfigCode = "CONFIG_CODE";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmGeneralConfigBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initOpId(long value){
     this.initProperty(S_OpId,new Long(value));
  }
  public  void setOpId(long value){
     this.set(S_OpId,new Long(value));
  }
  public  void setOpIdNull(){
     this.set(S_OpId,null);
  }

  public long getOpId(){
        return DataType.getAsLong(this.get(S_OpId));
  
  }
  public long getOpIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_OpId));
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

  public void initSrcType(String value){
     this.initProperty(S_SrcType,value);
  }
  public  void setSrcType(String value){
     this.set(S_SrcType,value);
  }
  public  void setSrcTypeNull(){
     this.set(S_SrcType,null);
  }

  public String getSrcType(){
       return DataType.getAsString(this.get(S_SrcType));
  
  }
  public String getSrcTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SrcType));
      }

  public void initConfigDesc(String value){
     this.initProperty(S_ConfigDesc,value);
  }
  public  void setConfigDesc(String value){
     this.set(S_ConfigDesc,value);
  }
  public  void setConfigDescNull(){
     this.set(S_ConfigDesc,null);
  }

  public String getConfigDesc(){
       return DataType.getAsString(this.get(S_ConfigDesc));
  
  }
  public String getConfigDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ConfigDesc));
      }

  public void initValue5(String value){
     this.initProperty(S_Value5,value);
  }
  public  void setValue5(String value){
     this.set(S_Value5,value);
  }
  public  void setValue5Null(){
     this.set(S_Value5,null);
  }

  public String getValue5(){
       return DataType.getAsString(this.get(S_Value5));
  
  }
  public String getValue5InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Value5));
      }

  public void initValue4(String value){
     this.initProperty(S_Value4,value);
  }
  public  void setValue4(String value){
     this.set(S_Value4,value);
  }
  public  void setValue4Null(){
     this.set(S_Value4,null);
  }

  public String getValue4(){
       return DataType.getAsString(this.get(S_Value4));
  
  }
  public String getValue4InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Value4));
      }

  public void initLastUpdateDate(Timestamp value){
     this.initProperty(S_LastUpdateDate,value);
  }
  public  void setLastUpdateDate(Timestamp value){
     this.set(S_LastUpdateDate,value);
  }
  public  void setLastUpdateDateNull(){
     this.set(S_LastUpdateDate,null);
  }

  public Timestamp getLastUpdateDate(){
        return DataType.getAsDateTime(this.get(S_LastUpdateDate));
  
  }
  public Timestamp getLastUpdateDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_LastUpdateDate));
      }

  public void initValue3(String value){
     this.initProperty(S_Value3,value);
  }
  public  void setValue3(String value){
     this.set(S_Value3,value);
  }
  public  void setValue3Null(){
     this.set(S_Value3,null);
  }

  public String getValue3(){
       return DataType.getAsString(this.get(S_Value3));
  
  }
  public String getValue3InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Value3));
      }

  public void initTenantId(String value){
     this.initProperty(S_TenantId,value);
  }
  public  void setTenantId(String value){
     this.set(S_TenantId,value);
  }
  public  void setTenantIdNull(){
     this.set(S_TenantId,null);
  }

  public String getTenantId(){
       return DataType.getAsString(this.get(S_TenantId));
  
  }
  public String getTenantIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_TenantId));
      }

  public void initValue2(String value){
     this.initProperty(S_Value2,value);
  }
  public  void setValue2(String value){
     this.set(S_Value2,value);
  }
  public  void setValue2Null(){
     this.set(S_Value2,null);
  }

  public String getValue2(){
       return DataType.getAsString(this.get(S_Value2));
  
  }
  public String getValue2InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Value2));
      }

  public void initValue1(String value){
     this.initProperty(S_Value1,value);
  }
  public  void setValue1(String value){
     this.set(S_Value1,value);
  }
  public  void setValue1Null(){
     this.set(S_Value1,null);
  }

  public String getValue1(){
       return DataType.getAsString(this.get(S_Value1));
  
  }
  public String getValue1InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Value1));
      }

  public void initConfigType(String value){
     this.initProperty(S_ConfigType,value);
  }
  public  void setConfigType(String value){
     this.set(S_ConfigType,value);
  }
  public  void setConfigTypeNull(){
     this.set(S_ConfigType,null);
  }

  public String getConfigType(){
       return DataType.getAsString(this.get(S_ConfigType));
  
  }
  public String getConfigTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ConfigType));
      }

  public void initCreateDate(Timestamp value){
     this.initProperty(S_CreateDate,value);
  }
  public  void setCreateDate(Timestamp value){
     this.set(S_CreateDate,value);
  }
  public  void setCreateDateNull(){
     this.set(S_CreateDate,null);
  }

  public Timestamp getCreateDate(){
        return DataType.getAsDateTime(this.get(S_CreateDate));
  
  }
  public Timestamp getCreateDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_CreateDate));
      }

  public void initConfigCode(String value){
     this.initProperty(S_ConfigCode,value);
  }
  public  void setConfigCode(String value){
     this.set(S_ConfigCode,value);
  }
  public  void setConfigCodeNull(){
     this.set(S_ConfigCode,null);
  }

  public String getConfigCode(){
       return DataType.getAsString(this.get(S_ConfigCode));
  
  }
  public String getConfigCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ConfigCode));
      }


 
 }

