package com.asiainfo.crm.so.common.party.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.so.common.party.ivalues.*;

public class BORcmdServiceBean extends DataContainer implements DataContainerInterface,IBORcmdServiceValue{

  private static String  m_boName = "com.asiainfo.crm.so.common.party.bo.BORcmdService";



  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_OfferName = "OFFER_NAME";
  public final static  String S_Quarter = "QUARTER";
  public final static  String S_Year = "YEAR";
  public final static  String S_Status = "STATUS";
  public final static  String S_ServiceId = "SERVICE_ID";
  public final static  String S_FeeType = "FEE_TYPE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_Result = "RESULT";
  public final static  String S_BatchId = "BATCH_ID";
  public final static  String S_BaseFee = "BASE_FEE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_OfferId = "OFFER_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_OfferDesc = "OFFER_DESC";
  public final static  String S_ServiceType = "SERVICE_TYPE";
  public final static  String S_Month = "MONTH";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BORcmdServiceBean() throws AIException{
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

  public void initOfferName(String value){
     this.initProperty(S_OfferName,value);
  }
  public  void setOfferName(String value){
     this.set(S_OfferName,value);
  }
  public  void setOfferNameNull(){
     this.set(S_OfferName,null);
  }

  public String getOfferName(){
       return DataType.getAsString(this.get(S_OfferName));
  
  }
  public String getOfferNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OfferName));
      }

  public void initQuarter(String value){
     this.initProperty(S_Quarter,value);
  }
  public  void setQuarter(String value){
     this.set(S_Quarter,value);
  }
  public  void setQuarterNull(){
     this.set(S_Quarter,null);
  }

  public String getQuarter(){
       return DataType.getAsString(this.get(S_Quarter));
  
  }
  public String getQuarterInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Quarter));
      }

  public void initYear(String value){
     this.initProperty(S_Year,value);
  }
  public  void setYear(String value){
     this.set(S_Year,value);
  }
  public  void setYearNull(){
     this.set(S_Year,null);
  }

  public String getYear(){
       return DataType.getAsString(this.get(S_Year));
  
  }
  public String getYearInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Year));
      }

  public void initStatus(int value){
     this.initProperty(S_Status,new Integer(value));
  }
  public  void setStatus(int value){
     this.set(S_Status,new Integer(value));
  }
  public  void setStatusNull(){
     this.set(S_Status,null);
  }

  public int getStatus(){
        return DataType.getAsInt(this.get(S_Status));
  
  }
  public int getStatusInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_Status));
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

  public void initFeeType(int value){
     this.initProperty(S_FeeType,new Integer(value));
  }
  public  void setFeeType(int value){
     this.set(S_FeeType,new Integer(value));
  }
  public  void setFeeTypeNull(){
     this.set(S_FeeType,null);
  }

  public int getFeeType(){
        return DataType.getAsInt(this.get(S_FeeType));
  
  }
  public int getFeeTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_FeeType));
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

  public void initResult(String value){
     this.initProperty(S_Result,value);
  }
  public  void setResult(String value){
     this.set(S_Result,value);
  }
  public  void setResultNull(){
     this.set(S_Result,null);
  }

  public String getResult(){
       return DataType.getAsString(this.get(S_Result));
  
  }
  public String getResultInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Result));
      }

  public void initBatchId(String value){
     this.initProperty(S_BatchId,value);
  }
  public  void setBatchId(String value){
     this.set(S_BatchId,value);
  }
  public  void setBatchIdNull(){
     this.set(S_BatchId,null);
  }

  public String getBatchId(){
       return DataType.getAsString(this.get(S_BatchId));
  
  }
  public String getBatchIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BatchId));
      }

  public void initBaseFee(String value){
     this.initProperty(S_BaseFee,value);
  }
  public  void setBaseFee(String value){
     this.set(S_BaseFee,value);
  }
  public  void setBaseFeeNull(){
     this.set(S_BaseFee,null);
  }

  public String getBaseFee(){
       return DataType.getAsString(this.get(S_BaseFee));
  
  }
  public String getBaseFeeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BaseFee));
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

  public void initOfferId(long value){
     this.initProperty(S_OfferId,new Long(value));
  }
  public  void setOfferId(long value){
     this.set(S_OfferId,new Long(value));
  }
  public  void setOfferIdNull(){
     this.set(S_OfferId,null);
  }

  public long getOfferId(){
        return DataType.getAsLong(this.get(S_OfferId));
  
  }
  public long getOfferIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_OfferId));
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

  public void initOfferDesc(String value){
     this.initProperty(S_OfferDesc,value);
  }
  public  void setOfferDesc(String value){
     this.set(S_OfferDesc,value);
  }
  public  void setOfferDescNull(){
     this.set(S_OfferDesc,null);
  }

  public String getOfferDesc(){
       return DataType.getAsString(this.get(S_OfferDesc));
  
  }
  public String getOfferDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OfferDesc));
      }

  public void initServiceType(long value){
     this.initProperty(S_ServiceType,new Long(value));
  }
  public  void setServiceType(long value){
     this.set(S_ServiceType,new Long(value));
  }
  public  void setServiceTypeNull(){
     this.set(S_ServiceType,null);
  }

  public long getServiceType(){
        return DataType.getAsLong(this.get(S_ServiceType));
  
  }
  public long getServiceTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ServiceType));
      }

  public void initMonth(String value){
     this.initProperty(S_Month,value);
  }
  public  void setMonth(String value){
     this.set(S_Month,value);
  }
  public  void setMonthNull(){
     this.set(S_Month,null);
  }

  public String getMonth(){
       return DataType.getAsString(this.get(S_Month));
  
  }
  public String getMonthInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Month));
      }


 
 }

