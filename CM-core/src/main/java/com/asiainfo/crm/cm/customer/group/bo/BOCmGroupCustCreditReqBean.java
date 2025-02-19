package com.asiainfo.crm.cm.customer.group.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.customer.group.ivalues.*;

public class BOCmGroupCustCreditReqBean extends DataContainer implements DataContainerInterface,IBOCmGroupCustCreditReqValue{

  private static String  m_boName = "com.asiainfo.crm.cm.customer.group.bo.BOCmGroupCustCreditReq";



  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_ReqCoinReason = "REQ_COIN_REASON";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_PaymentPeriod = "PAYMENT_PERIOD";
  public final static  String S_Sts = "STS";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_RequestId = "REQUEST_ID";
  public final static  String S_ReqCoin = "REQ_COIN";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_StsDate = "STS_DATE";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_RequestType = "REQUEST_TYPE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_OrgCreditClas = "ORG_CREDIT_CLAS";
  public final static  String S_ReqCreditClass = "REQ_CREDIT_CLASS";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmGroupCustCreditReqBean() throws AIException{
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

  public void initReqCoinReason(String value){
     this.initProperty(S_ReqCoinReason,value);
  }
  public  void setReqCoinReason(String value){
     this.set(S_ReqCoinReason,value);
  }
  public  void setReqCoinReasonNull(){
     this.set(S_ReqCoinReason,null);
  }

  public String getReqCoinReason(){
       return DataType.getAsString(this.get(S_ReqCoinReason));
  
  }
  public String getReqCoinReasonInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ReqCoinReason));
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

  public void initPaymentPeriod(int value){
     this.initProperty(S_PaymentPeriod,new Integer(value));
  }
  public  void setPaymentPeriod(int value){
     this.set(S_PaymentPeriod,new Integer(value));
  }
  public  void setPaymentPeriodNull(){
     this.set(S_PaymentPeriod,null);
  }

  public int getPaymentPeriod(){
        return DataType.getAsInt(this.get(S_PaymentPeriod));
  
  }
  public int getPaymentPeriodInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_PaymentPeriod));
      }

  public void initSts(int value){
     this.initProperty(S_Sts,new Integer(value));
  }
  public  void setSts(int value){
     this.set(S_Sts,new Integer(value));
  }
  public  void setStsNull(){
     this.set(S_Sts,null);
  }

  public int getSts(){
        return DataType.getAsInt(this.get(S_Sts));
  
  }
  public int getStsInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_Sts));
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

  public void initRequestId(long value){
     this.initProperty(S_RequestId,new Long(value));
  }
  public  void setRequestId(long value){
     this.set(S_RequestId,new Long(value));
  }
  public  void setRequestIdNull(){
     this.set(S_RequestId,null);
  }

  public long getRequestId(){
        return DataType.getAsLong(this.get(S_RequestId));
  
  }
  public long getRequestIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_RequestId));
      }

  public void initReqCoin(long value){
     this.initProperty(S_ReqCoin,new Long(value));
  }
  public  void setReqCoin(long value){
     this.set(S_ReqCoin,new Long(value));
  }
  public  void setReqCoinNull(){
     this.set(S_ReqCoin,null);
  }

  public long getReqCoin(){
        return DataType.getAsLong(this.get(S_ReqCoin));
  
  }
  public long getReqCoinInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ReqCoin));
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

  public void initStsDate(Timestamp value){
     this.initProperty(S_StsDate,value);
  }
  public  void setStsDate(Timestamp value){
     this.set(S_StsDate,value);
  }
  public  void setStsDateNull(){
     this.set(S_StsDate,null);
  }

  public Timestamp getStsDate(){
        return DataType.getAsDateTime(this.get(S_StsDate));
  
  }
  public Timestamp getStsDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_StsDate));
      }

  public void initCustId(long value){
     this.initProperty(S_CustId,new Long(value));
  }
  public  void setCustId(long value){
     this.set(S_CustId,new Long(value));
  }
  public  void setCustIdNull(){
     this.set(S_CustId,null);
  }

  public long getCustId(){
        return DataType.getAsLong(this.get(S_CustId));
  
  }
  public long getCustIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CustId));
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

  public void initRequestType(int value){
     this.initProperty(S_RequestType,new Integer(value));
  }
  public  void setRequestType(int value){
     this.set(S_RequestType,new Integer(value));
  }
  public  void setRequestTypeNull(){
     this.set(S_RequestType,null);
  }

  public int getRequestType(){
        return DataType.getAsInt(this.get(S_RequestType));
  
  }
  public int getRequestTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_RequestType));
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

  public void initOrgCreditClas(int value){
     this.initProperty(S_OrgCreditClas,new Integer(value));
  }
  public  void setOrgCreditClas(int value){
     this.set(S_OrgCreditClas,new Integer(value));
  }
  public  void setOrgCreditClasNull(){
     this.set(S_OrgCreditClas,null);
  }

  public int getOrgCreditClas(){
        return DataType.getAsInt(this.get(S_OrgCreditClas));
  
  }
  public int getOrgCreditClasInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_OrgCreditClas));
      }

  public void initReqCreditClass(int value){
     this.initProperty(S_ReqCreditClass,new Integer(value));
  }
  public  void setReqCreditClass(int value){
     this.set(S_ReqCreditClass,new Integer(value));
  }
  public  void setReqCreditClassNull(){
     this.set(S_ReqCreditClass,null);
  }

  public int getReqCreditClass(){
        return DataType.getAsInt(this.get(S_ReqCreditClass));
  
  }
  public int getReqCreditClassInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ReqCreditClass));
      }


 
 }

