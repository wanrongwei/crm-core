package com.asiainfo.crm.cm.inner.customer.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.inner.customer.ivalues.*;

public class BOCmxCustLanguageBean extends DataContainer implements DataContainerInterface,IBOCmxCustLanguageValue{

  private static String  m_boName = "com.asiainfo.crm.cm.inner.customer.bo.BOCmxCustLanguage";



  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_LastLang3 = "LAST_LANG3";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_DefaultLang = "DEFAULT_LANG";
  public final static  String S_LastLang1 = "LAST_LANG1";
  public final static  String S_LastLang2 = "LAST_LANG2";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_RelObjectId = "REL_OBJECT_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_RelObjectType = "REL_OBJECT_TYPE";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmxCustLanguageBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initExpireDate(Timestamp value){
     this.initProperty(S_ExpireDate,value);
  }
  public  void setExpireDate(Timestamp value){
     this.set(S_ExpireDate,value);
  }
  public  void setExpireDateNull(){
     this.set(S_ExpireDate,null);
  }

  public Timestamp getExpireDate(){
        return DataType.getAsDateTime(this.get(S_ExpireDate));
  
  }
  public Timestamp getExpireDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_ExpireDate));
      }

  public void initLastLang3(int value){
     this.initProperty(S_LastLang3,new Integer(value));
  }
  public  void setLastLang3(int value){
     this.set(S_LastLang3,new Integer(value));
  }
  public  void setLastLang3Null(){
     this.set(S_LastLang3,null);
  }

  public int getLastLang3(){
        return DataType.getAsInt(this.get(S_LastLang3));
  
  }
  public int getLastLang3InitialValue(){
        return DataType.getAsInt(this.getOldObj(S_LastLang3));
      }

  public void initEffectiveDate(Timestamp value){
     this.initProperty(S_EffectiveDate,value);
  }
  public  void setEffectiveDate(Timestamp value){
     this.set(S_EffectiveDate,value);
  }
  public  void setEffectiveDateNull(){
     this.set(S_EffectiveDate,null);
  }

  public Timestamp getEffectiveDate(){
        return DataType.getAsDateTime(this.get(S_EffectiveDate));
  
  }
  public Timestamp getEffectiveDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_EffectiveDate));
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

  public void initDefaultLang(int value){
     this.initProperty(S_DefaultLang,new Integer(value));
  }
  public  void setDefaultLang(int value){
     this.set(S_DefaultLang,new Integer(value));
  }
  public  void setDefaultLangNull(){
     this.set(S_DefaultLang,null);
  }

  public int getDefaultLang(){
        return DataType.getAsInt(this.get(S_DefaultLang));
  
  }
  public int getDefaultLangInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_DefaultLang));
      }

  public void initLastLang1(int value){
     this.initProperty(S_LastLang1,new Integer(value));
  }
  public  void setLastLang1(int value){
     this.set(S_LastLang1,new Integer(value));
  }
  public  void setLastLang1Null(){
     this.set(S_LastLang1,null);
  }

  public int getLastLang1(){
        return DataType.getAsInt(this.get(S_LastLang1));
  
  }
  public int getLastLang1InitialValue(){
        return DataType.getAsInt(this.getOldObj(S_LastLang1));
      }

  public void initLastLang2(int value){
     this.initProperty(S_LastLang2,new Integer(value));
  }
  public  void setLastLang2(int value){
     this.set(S_LastLang2,new Integer(value));
  }
  public  void setLastLang2Null(){
     this.set(S_LastLang2,null);
  }

  public int getLastLang2(){
        return DataType.getAsInt(this.get(S_LastLang2));
  
  }
  public int getLastLang2InitialValue(){
        return DataType.getAsInt(this.getOldObj(S_LastLang2));
      }

  public void initOrgId(long value){
     this.initProperty(S_OrgId,new Long(value));
  }
  public  void setOrgId(long value){
     this.set(S_OrgId,new Long(value));
  }
  public  void setOrgIdNull(){
     this.set(S_OrgId,null);
  }

  public long getOrgId(){
        return DataType.getAsLong(this.get(S_OrgId));
  
  }
  public long getOrgIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_OrgId));
      }

  public void initCreateOrgId(long value){
     this.initProperty(S_CreateOrgId,new Long(value));
  }
  public  void setCreateOrgId(long value){
     this.set(S_CreateOrgId,new Long(value));
  }
  public  void setCreateOrgIdNull(){
     this.set(S_CreateOrgId,null);
  }

  public long getCreateOrgId(){
        return DataType.getAsLong(this.get(S_CreateOrgId));
  
  }
  public long getCreateOrgIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CreateOrgId));
      }

  public void initCreateOpId(long value){
     this.initProperty(S_CreateOpId,new Long(value));
  }
  public  void setCreateOpId(long value){
     this.set(S_CreateOpId,new Long(value));
  }
  public  void setCreateOpIdNull(){
     this.set(S_CreateOpId,null);
  }

  public long getCreateOpId(){
        return DataType.getAsLong(this.get(S_CreateOpId));
  
  }
  public long getCreateOpIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CreateOpId));
      }

  public void initDoneDate(Timestamp value){
     this.initProperty(S_DoneDate,value);
  }
  public  void setDoneDate(Timestamp value){
     this.set(S_DoneDate,value);
  }
  public  void setDoneDateNull(){
     this.set(S_DoneDate,null);
  }

  public Timestamp getDoneDate(){
        return DataType.getAsDateTime(this.get(S_DoneDate));
  
  }
  public Timestamp getDoneDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_DoneDate));
      }

  public void initRelObjectId(long value){
     this.initProperty(S_RelObjectId,new Long(value));
  }
  public  void setRelObjectId(long value){
     this.set(S_RelObjectId,new Long(value));
  }
  public  void setRelObjectIdNull(){
     this.set(S_RelObjectId,null);
  }

  public long getRelObjectId(){
        return DataType.getAsLong(this.get(S_RelObjectId));
  
  }
  public long getRelObjectIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_RelObjectId));
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

  public void initDoneCode(long value){
     this.initProperty(S_DoneCode,new Long(value));
  }
  public  void setDoneCode(long value){
     this.set(S_DoneCode,new Long(value));
  }
  public  void setDoneCodeNull(){
     this.set(S_DoneCode,null);
  }

  public long getDoneCode(){
        return DataType.getAsLong(this.get(S_DoneCode));
  
  }
  public long getDoneCodeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_DoneCode));
      }

  public void initRelObjectType(int value){
     this.initProperty(S_RelObjectType,new Integer(value));
  }
  public  void setRelObjectType(int value){
     this.set(S_RelObjectType,new Integer(value));
  }
  public  void setRelObjectTypeNull(){
     this.set(S_RelObjectType,null);
  }

  public int getRelObjectType(){
        return DataType.getAsInt(this.get(S_RelObjectType));
  
  }
  public int getRelObjectTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_RelObjectType));
      }


 
 }

