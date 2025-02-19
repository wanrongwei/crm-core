package com.asiainfo.crm.cm.customer.group.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.customer.group.ivalues.*;

public class BOCmGroupAuditInfoBean extends DataContainer implements DataContainerInterface,IBOCmGroupAuditInfoValue{

  private static String  m_boName = "com.asiainfo.crm.cm.customer.group.bo.BOCmGroupAuditInfo";



  public final static  String S_ApplyOpId = "APPLY_OP_ID";
  public final static  String S_State = "STATE";
  public final static  String S_CityId = "CITY_ID";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_ApplyDate = "APPLY_DATE";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_ApplyDesc = "APPLY_DESC";
  public final static  String S_AuditId = "AUDIT_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_AuditType = "AUDIT_TYPE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_AuditDesc = "AUDIT_DESC";
  public final static  String S_AuditOpId = "AUDIT_OP_ID";
  public final static  String S_OldValue = "OLD_VALUE";
  public final static  String S_NewValue = "NEW_VALUE";
  public final static  String S_ReqCoin = "REQ_COIN";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_OldAuditId = "OLD_AUDIT_ID";
  public final static  String S_AuditSts = "AUDIT_STS";
  public final static  String S_CountyId = "COUNTY_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_CustContId = "CUST_CONT_ID";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmGroupAuditInfoBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initApplyOpId(long value){
     this.initProperty(S_ApplyOpId,new Long(value));
  }
  public  void setApplyOpId(long value){
     this.set(S_ApplyOpId,new Long(value));
  }
  public  void setApplyOpIdNull(){
     this.set(S_ApplyOpId,null);
  }

  public long getApplyOpId(){
        return DataType.getAsLong(this.get(S_ApplyOpId));
  
  }
  public long getApplyOpIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ApplyOpId));
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

  public void initCityId(String value){
     this.initProperty(S_CityId,value);
  }
  public  void setCityId(String value){
     this.set(S_CityId,value);
  }
  public  void setCityIdNull(){
     this.set(S_CityId,null);
  }

  public String getCityId(){
       return DataType.getAsString(this.get(S_CityId));
  
  }
  public String getCityIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CityId));
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

  public void initApplyDate(Timestamp value){
     this.initProperty(S_ApplyDate,value);
  }
  public  void setApplyDate(Timestamp value){
     this.set(S_ApplyDate,value);
  }
  public  void setApplyDateNull(){
     this.set(S_ApplyDate,null);
  }

  public Timestamp getApplyDate(){
        return DataType.getAsDateTime(this.get(S_ApplyDate));
  
  }
  public Timestamp getApplyDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_ApplyDate));
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

  public void initApplyDesc(String value){
     this.initProperty(S_ApplyDesc,value);
  }
  public  void setApplyDesc(String value){
     this.set(S_ApplyDesc,value);
  }
  public  void setApplyDescNull(){
     this.set(S_ApplyDesc,null);
  }

  public String getApplyDesc(){
       return DataType.getAsString(this.get(S_ApplyDesc));
  
  }
  public String getApplyDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ApplyDesc));
      }

  public void initAuditId(long value){
     this.initProperty(S_AuditId,new Long(value));
  }
  public  void setAuditId(long value){
     this.set(S_AuditId,new Long(value));
  }
  public  void setAuditIdNull(){
     this.set(S_AuditId,null);
  }

  public long getAuditId(){
        return DataType.getAsLong(this.get(S_AuditId));
  
  }
  public long getAuditIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_AuditId));
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

  public void initAuditType(int value){
     this.initProperty(S_AuditType,new Integer(value));
  }
  public  void setAuditType(int value){
     this.set(S_AuditType,new Integer(value));
  }
  public  void setAuditTypeNull(){
     this.set(S_AuditType,null);
  }

  public int getAuditType(){
        return DataType.getAsInt(this.get(S_AuditType));
  
  }
  public int getAuditTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_AuditType));
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

  public void initAuditDesc(String value){
     this.initProperty(S_AuditDesc,value);
  }
  public  void setAuditDesc(String value){
     this.set(S_AuditDesc,value);
  }
  public  void setAuditDescNull(){
     this.set(S_AuditDesc,null);
  }

  public String getAuditDesc(){
       return DataType.getAsString(this.get(S_AuditDesc));
  
  }
  public String getAuditDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AuditDesc));
      }

  public void initAuditOpId(long value){
     this.initProperty(S_AuditOpId,new Long(value));
  }
  public  void setAuditOpId(long value){
     this.set(S_AuditOpId,new Long(value));
  }
  public  void setAuditOpIdNull(){
     this.set(S_AuditOpId,null);
  }

  public long getAuditOpId(){
        return DataType.getAsLong(this.get(S_AuditOpId));
  
  }
  public long getAuditOpIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_AuditOpId));
      }

  public void initOldValue(String value){
     this.initProperty(S_OldValue,value);
  }
  public  void setOldValue(String value){
     this.set(S_OldValue,value);
  }
  public  void setOldValueNull(){
     this.set(S_OldValue,null);
  }

  public String getOldValue(){
       return DataType.getAsString(this.get(S_OldValue));
  
  }
  public String getOldValueInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OldValue));
      }

  public void initNewValue(String value){
     this.initProperty(S_NewValue,value);
  }
  public  void setNewValue(String value){
     this.set(S_NewValue,value);
  }
  public  void setNewValueNull(){
     this.set(S_NewValue,null);
  }

  public String getNewValue(){
       return DataType.getAsString(this.get(S_NewValue));
  
  }
  public String getNewValueInitialValue(){
        return DataType.getAsString(this.getOldObj(S_NewValue));
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

  public void initOldAuditId(long value){
     this.initProperty(S_OldAuditId,new Long(value));
  }
  public  void setOldAuditId(long value){
     this.set(S_OldAuditId,new Long(value));
  }
  public  void setOldAuditIdNull(){
     this.set(S_OldAuditId,null);
  }

  public long getOldAuditId(){
        return DataType.getAsLong(this.get(S_OldAuditId));
  
  }
  public long getOldAuditIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_OldAuditId));
      }

  public void initAuditSts(int value){
     this.initProperty(S_AuditSts,new Integer(value));
  }
  public  void setAuditSts(int value){
     this.set(S_AuditSts,new Integer(value));
  }
  public  void setAuditStsNull(){
     this.set(S_AuditSts,null);
  }

  public int getAuditSts(){
        return DataType.getAsInt(this.get(S_AuditSts));
  
  }
  public int getAuditStsInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_AuditSts));
      }

  public void initCountyId(String value){
     this.initProperty(S_CountyId,value);
  }
  public  void setCountyId(String value){
     this.set(S_CountyId,value);
  }
  public  void setCountyIdNull(){
     this.set(S_CountyId,null);
  }

  public String getCountyId(){
       return DataType.getAsString(this.get(S_CountyId));
  
  }
  public String getCountyIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CountyId));
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

  public void initCustContId(long value){
     this.initProperty(S_CustContId,new Long(value));
  }
  public  void setCustContId(long value){
     this.set(S_CustContId,new Long(value));
  }
  public  void setCustContIdNull(){
     this.set(S_CustContId,null);
  }

  public long getCustContId(){
        return DataType.getAsLong(this.get(S_CustContId));
  
  }
  public long getCustContIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CustContId));
      }


 
 }

