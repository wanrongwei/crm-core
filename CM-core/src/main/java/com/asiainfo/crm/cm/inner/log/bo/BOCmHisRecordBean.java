package com.asiainfo.crm.cm.inner.log.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.inner.log.ivalues.*;

public class BOCmHisRecordBean extends DataContainer implements DataContainerInterface,IBOCmHisRecordValue{

  private static String  m_boName = "com.asiainfo.crm.cm.inner.log.bo.BOCmHisRecord";



  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_State = "STATE";
  public final static  String S_HId = "H_ID";
  public final static  String S_ObjId = "OBJ_ID";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_ObjName = "OBJ_NAME";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_ObjType = "OBJ_TYPE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_DetailRecord4 = "DETAIL_RECORD_4";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_DetailRecord1 = "DETAIL_RECORD_1";
  public final static  String S_DetailRecord3 = "DETAIL_RECORD_3";
  public final static  String S_SimpleRecord = "SIMPLE_RECORD";
  public final static  String S_DetailRecord2 = "DETAIL_RECORD_2";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmHisRecordBean() throws AIException{
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

  public void initHId(long value){
     this.initProperty(S_HId,new Long(value));
  }
  public  void setHId(long value){
     this.set(S_HId,new Long(value));
  }
  public  void setHIdNull(){
     this.set(S_HId,null);
  }

  public long getHId(){
        return DataType.getAsLong(this.get(S_HId));
  
  }
  public long getHIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_HId));
      }

  public void initObjId(long value){
     this.initProperty(S_ObjId,new Long(value));
  }
  public  void setObjId(long value){
     this.set(S_ObjId,new Long(value));
  }
  public  void setObjIdNull(){
     this.set(S_ObjId,null);
  }

  public long getObjId(){
        return DataType.getAsLong(this.get(S_ObjId));
  
  }
  public long getObjIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ObjId));
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

  public void initObjName(String value){
     this.initProperty(S_ObjName,value);
  }
  public  void setObjName(String value){
     this.set(S_ObjName,value);
  }
  public  void setObjNameNull(){
     this.set(S_ObjName,null);
  }

  public String getObjName(){
       return DataType.getAsString(this.get(S_ObjName));
  
  }
  public String getObjNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ObjName));
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

  public void initRegionId(String value){
     this.initProperty(S_RegionId,value);
  }
  public  void setRegionId(String value){
     this.set(S_RegionId,value);
  }
  public  void setRegionIdNull(){
     this.set(S_RegionId,null);
  }

  public String getRegionId(){
       return DataType.getAsString(this.get(S_RegionId));
  
  }
  public String getRegionIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_RegionId));
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

  public void initObjType(int value){
     this.initProperty(S_ObjType,new Integer(value));
  }
  public  void setObjType(int value){
     this.set(S_ObjType,new Integer(value));
  }
  public  void setObjTypeNull(){
     this.set(S_ObjType,null);
  }

  public int getObjType(){
        return DataType.getAsInt(this.get(S_ObjType));
  
  }
  public int getObjTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ObjType));
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

  public void initDetailRecord4(String value){
     this.initProperty(S_DetailRecord4,value);
  }
  public  void setDetailRecord4(String value){
     this.set(S_DetailRecord4,value);
  }
  public  void setDetailRecord4Null(){
     this.set(S_DetailRecord4,null);
  }

  public String getDetailRecord4(){
       return DataType.getAsString(this.get(S_DetailRecord4));
  
  }
  public String getDetailRecord4InitialValue(){
        return DataType.getAsString(this.getOldObj(S_DetailRecord4));
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

  public void initDetailRecord1(String value){
     this.initProperty(S_DetailRecord1,value);
  }
  public  void setDetailRecord1(String value){
     this.set(S_DetailRecord1,value);
  }
  public  void setDetailRecord1Null(){
     this.set(S_DetailRecord1,null);
  }

  public String getDetailRecord1(){
       return DataType.getAsString(this.get(S_DetailRecord1));
  
  }
  public String getDetailRecord1InitialValue(){
        return DataType.getAsString(this.getOldObj(S_DetailRecord1));
      }

  public void initDetailRecord3(String value){
     this.initProperty(S_DetailRecord3,value);
  }
  public  void setDetailRecord3(String value){
     this.set(S_DetailRecord3,value);
  }
  public  void setDetailRecord3Null(){
     this.set(S_DetailRecord3,null);
  }

  public String getDetailRecord3(){
       return DataType.getAsString(this.get(S_DetailRecord3));
  
  }
  public String getDetailRecord3InitialValue(){
        return DataType.getAsString(this.getOldObj(S_DetailRecord3));
      }

  public void initSimpleRecord(String value){
     this.initProperty(S_SimpleRecord,value);
  }
  public  void setSimpleRecord(String value){
     this.set(S_SimpleRecord,value);
  }
  public  void setSimpleRecordNull(){
     this.set(S_SimpleRecord,null);
  }

  public String getSimpleRecord(){
       return DataType.getAsString(this.get(S_SimpleRecord));
  
  }
  public String getSimpleRecordInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SimpleRecord));
      }

  public void initDetailRecord2(String value){
     this.initProperty(S_DetailRecord2,value);
  }
  public  void setDetailRecord2(String value){
     this.set(S_DetailRecord2,value);
  }
  public  void setDetailRecord2Null(){
     this.set(S_DetailRecord2,null);
  }

  public String getDetailRecord2(){
       return DataType.getAsString(this.get(S_DetailRecord2));
  
  }
  public String getDetailRecord2InitialValue(){
        return DataType.getAsString(this.getOldObj(S_DetailRecord2));
      }


 
 }

