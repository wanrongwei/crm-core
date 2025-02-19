package com.asiainfo.crm.cm.common.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.common.ivalues.*;

public class QBOCmPartyRoleOkBean extends DataContainer implements DataContainerInterface,IQBOCmPartyRoleOkValue{

  private static String  m_boName = "com.asiainfo.crm.cm.common.bo.QBOCmPartyRoleOk";



  public final static  String S_RoleType = "ROLE_TYPE";
  public final static  String S_PartyName = "PARTY_NAME";
  public final static  String S_RoleStatus = "ROLE_STATUS";
  public final static  String S_PartyId = "PARTY_ID";
  public final static  String S_DoneDate = "DONE_DATE";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public QBOCmPartyRoleOkBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
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


 
 }

