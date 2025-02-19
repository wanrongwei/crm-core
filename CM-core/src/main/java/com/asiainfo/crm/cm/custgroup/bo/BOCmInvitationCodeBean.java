package com.asiainfo.crm.cm.custgroup.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.custgroup.ivalues.*;

public class BOCmInvitationCodeBean extends DataContainer implements DataContainerInterface,IBOCmInvitationCodeValue{

  private static String  m_boName = "com.asiainfo.crm.cm.custgroup.bo.BOCmInvitationCode";



  public final static  String S_ManageStatus = "MANAGE_STATUS";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_InvitationCodeId = "INVITATION_CODE_ID";
  public final static  String S_InvitationCode = "INVITATION_CODE";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmInvitationCodeBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initManageStatus(String value){
     this.initProperty(S_ManageStatus,value);
  }
  public  void setManageStatus(String value){
     this.set(S_ManageStatus,value);
  }
  public  void setManageStatusNull(){
     this.set(S_ManageStatus,null);
  }

  public String getManageStatus(){
       return DataType.getAsString(this.get(S_ManageStatus));
  
  }
  public String getManageStatusInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ManageStatus));
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

  public void initInvitationCodeId(long value){
     this.initProperty(S_InvitationCodeId,new Long(value));
  }
  public  void setInvitationCodeId(long value){
     this.set(S_InvitationCodeId,new Long(value));
  }
  public  void setInvitationCodeIdNull(){
     this.set(S_InvitationCodeId,null);
  }

  public long getInvitationCodeId(){
        return DataType.getAsLong(this.get(S_InvitationCodeId));
  
  }
  public long getInvitationCodeIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_InvitationCodeId));
      }

  public void initInvitationCode(String value){
     this.initProperty(S_InvitationCode,value);
  }
  public  void setInvitationCode(String value){
     this.set(S_InvitationCode,value);
  }
  public  void setInvitationCodeNull(){
     this.set(S_InvitationCode,null);
  }

  public String getInvitationCode(){
       return DataType.getAsString(this.get(S_InvitationCode));
  
  }
  public String getInvitationCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_InvitationCode));
      }


 
 }

