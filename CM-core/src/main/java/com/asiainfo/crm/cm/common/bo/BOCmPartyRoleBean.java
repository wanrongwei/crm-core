package com.asiainfo.crm.cm.common.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.common.ivalues.*;

public class BOCmPartyRoleBean extends DataContainer implements DataContainerInterface,IBOCmPartyRoleValue{

  private static String  m_boName = "com.asiainfo.crm.cm.common.bo.BOCmPartyRole";



  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_State = "STATE";
  public final static  String S_PartyName = "PARTY_NAME";
  public final static  String S_RoleStatus = "ROLE_STATUS";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_PartyId = "PARTY_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_EntityId = "ENTITY_ID";
  public final static  String S_RoleType = "ROLE_TYPE";
  public final static  String S_PartyRoleId = "PARTY_ROLE_ID";
  public final static  String S_RoleRegionId = "ROLE_REGION_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmPartyRoleBean() throws AIException{
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

  public void initPartyName(String value){
     this.initProperty(S_PartyName,value);
  }
  public  void setPartyName(String value){
     this.set(S_PartyName,value);
  }
  public  void setPartyNameNull(){
     this.set(S_PartyName,null);
  }

  public String getPartyName(){
       return DataType.getAsString(this.get(S_PartyName));
  
  }
  public String getPartyNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PartyName));
      }

  public void initRoleStatus(long value){
     this.initProperty(S_RoleStatus,new Long(value));
  }
  public  void setRoleStatus(long value){
     this.set(S_RoleStatus,new Long(value));
  }
  public  void setRoleStatusNull(){
     this.set(S_RoleStatus,null);
  }

  public long getRoleStatus(){
        return DataType.getAsLong(this.get(S_RoleStatus));
  
  }
  public long getRoleStatusInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_RoleStatus));
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

  public void initEntityId(long value){
     this.initProperty(S_EntityId,new Long(value));
  }
  public  void setEntityId(long value){
     this.set(S_EntityId,new Long(value));
  }
  public  void setEntityIdNull(){
     this.set(S_EntityId,null);
  }

  public long getEntityId(){
        return DataType.getAsLong(this.get(S_EntityId));
  
  }
  public long getEntityIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_EntityId));
      }

  public void initRoleType(long value){
     this.initProperty(S_RoleType,new Long(value));
  }
  public  void setRoleType(long value){
     this.set(S_RoleType,new Long(value));
  }
  public  void setRoleTypeNull(){
     this.set(S_RoleType,null);
  }

  public long getRoleType(){
        return DataType.getAsLong(this.get(S_RoleType));
  
  }
  public long getRoleTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_RoleType));
      }

  public void initPartyRoleId(long value){
     this.initProperty(S_PartyRoleId,new Long(value));
  }
  public  void setPartyRoleId(long value){
     this.set(S_PartyRoleId,new Long(value));
  }
  public  void setPartyRoleIdNull(){
     this.set(S_PartyRoleId,null);
  }

  public long getPartyRoleId(){
        return DataType.getAsLong(this.get(S_PartyRoleId));
  
  }
  public long getPartyRoleIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_PartyRoleId));
      }

  public void initRoleRegionId(String value){
     this.initProperty(S_RoleRegionId,value);
  }
  public  void setRoleRegionId(String value){
     this.set(S_RoleRegionId,value);
  }
  public  void setRoleRegionIdNull(){
     this.set(S_RoleRegionId,null);
  }

  public String getRoleRegionId(){
       return DataType.getAsString(this.get(S_RoleRegionId));
  
  }
  public String getRoleRegionIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_RoleRegionId));
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


 
 }

