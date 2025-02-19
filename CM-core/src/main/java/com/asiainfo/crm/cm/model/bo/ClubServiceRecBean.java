package com.asiainfo.crm.cm.model.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.model.ivalues.*;

public class ClubServiceRecBean extends DataContainer implements DataContainerInterface,IClubServiceRecValue{

  private static String  m_boName = "com.asiainfo.crm.cm.model.bo.ClubServiceRec";



  public final static  String S_State = "STATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_ServiceDate = "SERVICE_DATE";
  public final static  String S_MemberId = "MEMBER_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_SuiteAmount = "SUITE_AMOUNT";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_ServicePlace = "SERVICE_PLACE";
  public final static  String S_RecordId = "RECORD_ID";
  public final static  String S_RoamFlag = "ROAM_FLAG";
  public final static  String S_ServiceType = "SERVICE_TYPE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_ValueType = "VALUE_TYPE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_ServiceSource = "SERVICE_SOURCE";
  public final static  String S_OptSeq = "OPT_SEQ";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_ValueAmount = "VALUE_AMOUNT";
  public final static  String S_ProvinceCode = "PROVINCE_CODE";
  public final static  String S_PaymentId = "PAYMENT_ID";
  public final static  String S_ServiceId = "SERVICE_ID";
  public final static  String S_ServiceContent = "SERVICE_CONTENT";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public ClubServiceRecBean() throws AIException{
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

  public void initServiceDate(Timestamp value){
     this.initProperty(S_ServiceDate,value);
  }
  public  void setServiceDate(Timestamp value){
     this.set(S_ServiceDate,value);
  }
  public  void setServiceDateNull(){
     this.set(S_ServiceDate,null);
  }

  public Timestamp getServiceDate(){
        return DataType.getAsDateTime(this.get(S_ServiceDate));
  
  }
  public Timestamp getServiceDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_ServiceDate));
      }

  public void initMemberId(long value){
     this.initProperty(S_MemberId,new Long(value));
  }
  public  void setMemberId(long value){
     this.set(S_MemberId,new Long(value));
  }
  public  void setMemberIdNull(){
     this.set(S_MemberId,null);
  }

  public long getMemberId(){
        return DataType.getAsLong(this.get(S_MemberId));
  
  }
  public long getMemberIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_MemberId));
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

  public void initSuiteAmount(long value){
     this.initProperty(S_SuiteAmount,new Long(value));
  }
  public  void setSuiteAmount(long value){
     this.set(S_SuiteAmount,new Long(value));
  }
  public  void setSuiteAmountNull(){
     this.set(S_SuiteAmount,null);
  }

  public long getSuiteAmount(){
        return DataType.getAsLong(this.get(S_SuiteAmount));
  
  }
  public long getSuiteAmountInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_SuiteAmount));
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

  public void initServicePlace(String value){
     this.initProperty(S_ServicePlace,value);
  }
  public  void setServicePlace(String value){
     this.set(S_ServicePlace,value);
  }
  public  void setServicePlaceNull(){
     this.set(S_ServicePlace,null);
  }

  public String getServicePlace(){
       return DataType.getAsString(this.get(S_ServicePlace));
  
  }
  public String getServicePlaceInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ServicePlace));
      }

  public void initRecordId(long value){
     this.initProperty(S_RecordId,new Long(value));
  }
  public  void setRecordId(long value){
     this.set(S_RecordId,new Long(value));
  }
  public  void setRecordIdNull(){
     this.set(S_RecordId,null);
  }

  public long getRecordId(){
        return DataType.getAsLong(this.get(S_RecordId));
  
  }
  public long getRecordIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_RecordId));
      }

  public void initRoamFlag(int value){
     this.initProperty(S_RoamFlag,new Integer(value));
  }
  public  void setRoamFlag(int value){
     this.set(S_RoamFlag,new Integer(value));
  }
  public  void setRoamFlagNull(){
     this.set(S_RoamFlag,null);
  }

  public int getRoamFlag(){
        return DataType.getAsInt(this.get(S_RoamFlag));
  
  }
  public int getRoamFlagInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_RoamFlag));
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

  public void initServiceSource(int value){
     this.initProperty(S_ServiceSource,new Integer(value));
  }
  public  void setServiceSource(int value){
     this.set(S_ServiceSource,new Integer(value));
  }
  public  void setServiceSourceNull(){
     this.set(S_ServiceSource,null);
  }

  public int getServiceSource(){
        return DataType.getAsInt(this.get(S_ServiceSource));
  
  }
  public int getServiceSourceInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ServiceSource));
      }

  public void initOptSeq(long value){
     this.initProperty(S_OptSeq,new Long(value));
  }
  public  void setOptSeq(long value){
     this.set(S_OptSeq,new Long(value));
  }
  public  void setOptSeqNull(){
     this.set(S_OptSeq,null);
  }

  public long getOptSeq(){
        return DataType.getAsLong(this.get(S_OptSeq));
  
  }
  public long getOptSeqInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_OptSeq));
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

  public void initProvinceCode(String value){
     this.initProperty(S_ProvinceCode,value);
  }
  public  void setProvinceCode(String value){
     this.set(S_ProvinceCode,value);
  }
  public  void setProvinceCodeNull(){
     this.set(S_ProvinceCode,null);
  }

  public String getProvinceCode(){
       return DataType.getAsString(this.get(S_ProvinceCode));
  
  }
  public String getProvinceCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ProvinceCode));
      }

  public void initPaymentId(String value){
     this.initProperty(S_PaymentId,value);
  }
  public  void setPaymentId(String value){
     this.set(S_PaymentId,value);
  }
  public  void setPaymentIdNull(){
     this.set(S_PaymentId,null);
  }

  public String getPaymentId(){
       return DataType.getAsString(this.get(S_PaymentId));
  
  }
  public String getPaymentIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PaymentId));
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

  public void initServiceContent(String value){
     this.initProperty(S_ServiceContent,value);
  }
  public  void setServiceContent(String value){
     this.set(S_ServiceContent,value);
  }
  public  void setServiceContentNull(){
     this.set(S_ServiceContent,null);
  }

  public String getServiceContent(){
       return DataType.getAsString(this.get(S_ServiceContent));
  
  }
  public String getServiceContentInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ServiceContent));
      }


 
 }

