package com.asiainfo.crm.cm.common.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.common.ivalues.*;

public class BOIdentificationBean extends DataContainer implements DataContainerInterface,IBOIdentificationValue{

  private static String  m_boName = "com.asiainfo.crm.cm.common.bo.BOIdentification";



  public final static  String S_IssuerAuthority = "issuer_authority";
  public final static  String S_ExpireDate = "expire_date";
  public final static  String S_DoneDate = "done_date";
  public final static  String S_IdenEffDate = "iden_eff_date";
  public final static  String S_Status = "status";
  public final static  String S_IdenAddress = "iden_address";
  public final static  String S_State = "state";
  public final static  String S_RegionId = "region_id";
  public final static  String S_DoneCode = "done_code";
  public final static  String S_Remarks = "remarks";
  public final static  String S_PartyId = "party_id";
  public final static  String S_IdenExpDate = "iden_exp_date";
  public final static  String S_IdenId = "iden_id";
  public final static  String S_CreateOrgId = "create_org_id";
  public final static  String S_IdenNr = "iden_nr";
  public final static  String S_OrgId = "org_id";
  public final static  String S_IdenType = "iden_type";
  public final static  String S_OpId = "op_id";
  public final static  String S_CreateDate = "create_date";
  public final static  String S_EffectiveDate = "effective_date";
  public final static  String S_StatusDate = "status_date";
  public final static  String S_IdenSubType = "iden_sub_type";
  public final static  String S_Action = "ACTION";
  public final static  String S_CreateOpId = "create_op_id";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOIdentificationBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initIssuerAuthority(String value){
     this.initProperty(S_IssuerAuthority,value);
  }
  public  void setIssuerAuthority(String value){
     this.set(S_IssuerAuthority,value);
  }
  public  void setIssuerAuthorityNull(){
     this.set(S_IssuerAuthority,null);
  }

  public String getIssuerAuthority(){
       return DataType.getAsString(this.get(S_IssuerAuthority));
  
  }
  public String getIssuerAuthorityInitialValue(){
        return DataType.getAsString(this.getOldObj(S_IssuerAuthority));
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

  public void initIdenEffDate(Timestamp value){
     this.initProperty(S_IdenEffDate,value);
  }
  public  void setIdenEffDate(Timestamp value){
     this.set(S_IdenEffDate,value);
  }
  public  void setIdenEffDateNull(){
     this.set(S_IdenEffDate,null);
  }

  public Timestamp getIdenEffDate(){
        return DataType.getAsDateTime(this.get(S_IdenEffDate));
  
  }
  public Timestamp getIdenEffDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_IdenEffDate));
      }

  public void initStatus(String value){
     this.initProperty(S_Status,value);
  }
  public  void setStatus(String value){
     this.set(S_Status,value);
  }
  public  void setStatusNull(){
     this.set(S_Status,null);
  }

  public String getStatus(){
       return DataType.getAsString(this.get(S_Status));
  
  }
  public String getStatusInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Status));
      }

  public void initIdenAddress(String value){
     this.initProperty(S_IdenAddress,value);
  }
  public  void setIdenAddress(String value){
     this.set(S_IdenAddress,value);
  }
  public  void setIdenAddressNull(){
     this.set(S_IdenAddress,null);
  }

  public String getIdenAddress(){
       return DataType.getAsString(this.get(S_IdenAddress));
  
  }
  public String getIdenAddressInitialValue(){
        return DataType.getAsString(this.getOldObj(S_IdenAddress));
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

  public void initPartyId(long value){
     this.initProperty(S_PartyId,new Long(value));
  }
  public  void setPartyId(long value){
     this.set(S_PartyId,new Long(value));
  }
  public  void setPartyIdNull(){
     this.set(S_PartyId,null);
  }

  public long getPartyId(){
        return DataType.getAsLong(this.get(S_PartyId));
  
  }
  public long getPartyIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_PartyId));
      }

  public void initIdenExpDate(Timestamp value){
     this.initProperty(S_IdenExpDate,value);
  }
  public  void setIdenExpDate(Timestamp value){
     this.set(S_IdenExpDate,value);
  }
  public  void setIdenExpDateNull(){
     this.set(S_IdenExpDate,null);
  }

  public Timestamp getIdenExpDate(){
        return DataType.getAsDateTime(this.get(S_IdenExpDate));
  
  }
  public Timestamp getIdenExpDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_IdenExpDate));
      }

  public void initIdenId(long value){
     this.initProperty(S_IdenId,new Long(value));
  }
  public  void setIdenId(long value){
     this.set(S_IdenId,new Long(value));
  }
  public  void setIdenIdNull(){
     this.set(S_IdenId,null);
  }

  public long getIdenId(){
        return DataType.getAsLong(this.get(S_IdenId));
  
  }
  public long getIdenIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_IdenId));
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

  public void initIdenNr(String value){
     this.initProperty(S_IdenNr,value);
  }
  public  void setIdenNr(String value){
     this.set(S_IdenNr,value);
  }
  public  void setIdenNrNull(){
     this.set(S_IdenNr,null);
  }

  public String getIdenNr(){
       return DataType.getAsString(this.get(S_IdenNr));
  
  }
  public String getIdenNrInitialValue(){
        return DataType.getAsString(this.getOldObj(S_IdenNr));
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

  public void initIdenType(long value){
     this.initProperty(S_IdenType,new Long(value));
  }
  public  void setIdenType(long value){
     this.set(S_IdenType,new Long(value));
  }
  public  void setIdenTypeNull(){
     this.set(S_IdenType,null);
  }

  public long getIdenType(){
        return DataType.getAsLong(this.get(S_IdenType));
  
  }
  public long getIdenTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_IdenType));
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

  public void initStatusDate(Timestamp value){
     this.initProperty(S_StatusDate,value);
  }
  public  void setStatusDate(Timestamp value){
     this.set(S_StatusDate,value);
  }
  public  void setStatusDateNull(){
     this.set(S_StatusDate,null);
  }

  public Timestamp getStatusDate(){
        return DataType.getAsDateTime(this.get(S_StatusDate));
  
  }
  public Timestamp getStatusDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_StatusDate));
      }

  public void initIdenSubType(long value){
     this.initProperty(S_IdenSubType,new Long(value));
  }
  public  void setIdenSubType(long value){
     this.set(S_IdenSubType,new Long(value));
  }
  public  void setIdenSubTypeNull(){
     this.set(S_IdenSubType,null);
  }

  public long getIdenSubType(){
        return DataType.getAsLong(this.get(S_IdenSubType));
  
  }
  public long getIdenSubTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_IdenSubType));
      }

  public void initAction(String value){
     this.initProperty(S_Action,value);
  }
  public  void setAction(String value){
     this.set(S_Action,value);
  }
  public  void setActionNull(){
     this.set(S_Action,null);
  }

  public String getAction(){
       return DataType.getAsString(this.get(S_Action));
  
  }
  public String getActionInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Action));
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


 
 }

