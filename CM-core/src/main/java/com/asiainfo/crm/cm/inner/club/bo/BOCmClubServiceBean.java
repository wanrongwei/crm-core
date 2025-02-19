package com.asiainfo.crm.cm.inner.club.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.inner.club.ivalues.*;

public class BOCmClubServiceBean extends DataContainer implements DataContainerInterface,IBOCmClubServiceValue{

  private static String  m_boName = "com.asiainfo.crm.cm.inner.club.bo.BOCmClubService";



  public final static  String S_State = "STATE";
  public final static  String S_ServiceType = "SERVICE_TYPE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_TimesStrategy = "TIMES_STRATEGY";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_ValueType = "VALUE_TYPE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_IsCycleLimited = "IS_CYCLE_LIMITED";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_ValueAmount = "VALUE_AMOUNT";
  public final static  String S_ServiceName = "SERVICE_NAME";
  public final static  String S_ServiceId = "SERVICE_ID";
  public final static  String S_ClubId = "CLUB_ID";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmClubServiceBean() throws AIException{
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

  public void initServiceType(int value){
     this.initProperty(S_ServiceType,new Integer(value));
  }
  public  void setServiceType(int value){
     this.set(S_ServiceType,new Integer(value));
  }
  public  void setServiceTypeNull(){
     this.set(S_ServiceType,null);
  }

  public int getServiceType(){
        return DataType.getAsInt(this.get(S_ServiceType));
  
  }
  public int getServiceTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ServiceType));
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

  public void initTimesStrategy(int value){
     this.initProperty(S_TimesStrategy,new Integer(value));
  }
  public  void setTimesStrategy(int value){
     this.set(S_TimesStrategy,new Integer(value));
  }
  public  void setTimesStrategyNull(){
     this.set(S_TimesStrategy,null);
  }

  public int getTimesStrategy(){
        return DataType.getAsInt(this.get(S_TimesStrategy));
  
  }
  public int getTimesStrategyInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_TimesStrategy));
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

  public void initValueType(int value){
     this.initProperty(S_ValueType,new Integer(value));
  }
  public  void setValueType(int value){
     this.set(S_ValueType,new Integer(value));
  }
  public  void setValueTypeNull(){
     this.set(S_ValueType,null);
  }

  public int getValueType(){
        return DataType.getAsInt(this.get(S_ValueType));
  
  }
  public int getValueTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ValueType));
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

  public void initIsCycleLimited(int value){
     this.initProperty(S_IsCycleLimited,new Integer(value));
  }
  public  void setIsCycleLimited(int value){
     this.set(S_IsCycleLimited,new Integer(value));
  }
  public  void setIsCycleLimitedNull(){
     this.set(S_IsCycleLimited,null);
  }

  public int getIsCycleLimited(){
        return DataType.getAsInt(this.get(S_IsCycleLimited));
  
  }
  public int getIsCycleLimitedInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IsCycleLimited));
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

  public void initValueAmount(long value){
     this.initProperty(S_ValueAmount,new Long(value));
  }
  public  void setValueAmount(long value){
     this.set(S_ValueAmount,new Long(value));
  }
  public  void setValueAmountNull(){
     this.set(S_ValueAmount,null);
  }

  public long getValueAmount(){
        return DataType.getAsLong(this.get(S_ValueAmount));
  
  }
  public long getValueAmountInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ValueAmount));
      }

  public void initServiceName(String value){
     this.initProperty(S_ServiceName,value);
  }
  public  void setServiceName(String value){
     this.set(S_ServiceName,value);
  }
  public  void setServiceNameNull(){
     this.set(S_ServiceName,null);
  }

  public String getServiceName(){
       return DataType.getAsString(this.get(S_ServiceName));
  
  }
  public String getServiceNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ServiceName));
      }

  public void initServiceId(long value){
     this.initProperty(S_ServiceId,new Long(value));
  }
  public  void setServiceId(long value){
     this.set(S_ServiceId,new Long(value));
  }
  public  void setServiceIdNull(){
     this.set(S_ServiceId,null);
  }

  public long getServiceId(){
        return DataType.getAsLong(this.get(S_ServiceId));
  
  }
  public long getServiceIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ServiceId));
      }

  public void initClubId(long value){
     this.initProperty(S_ClubId,new Long(value));
  }
  public  void setClubId(long value){
     this.set(S_ClubId,new Long(value));
  }
  public  void setClubIdNull(){
     this.set(S_ClubId,null);
  }

  public long getClubId(){
        return DataType.getAsLong(this.get(S_ClubId));
  
  }
  public long getClubIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ClubId));
      }


 
 }

