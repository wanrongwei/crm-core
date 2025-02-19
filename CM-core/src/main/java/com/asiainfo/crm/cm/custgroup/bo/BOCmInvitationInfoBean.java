package com.asiainfo.crm.cm.custgroup.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.custgroup.ivalues.*;

public class BOCmInvitationInfoBean extends DataContainer implements DataContainerInterface,IBOCmInvitationInfoValue{

  private static String  m_boName = "com.asiainfo.crm.cm.custgroup.bo.BOCmInvitationInfo";



  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_InviteMode = "INVITE_MODE";
  public final static  String S_GroupId = "GROUP_ID";
  public final static  String S_Ext1 = "EXT1";
  public final static  String S_Ext2 = "EXT2";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_Ext3 = "EXT3";
  public final static  String S_Status = "STATUS";
  public final static  String S_InviteeIdentity = "invitee_identity";
  public final static  String S_Inviter = "INVITER";
  public final static  String S_IsSeen = "IS_SEEN";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_InviteeRefId = "INVITEE_REF_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_InvitationId = "INVITATION_ID";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmInvitationInfoBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
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

  public void initInviteMode(long value){
     this.initProperty(S_InviteMode,new Long(value));
  }
  public  void setInviteMode(long value){
     this.set(S_InviteMode,new Long(value));
  }
  public  void setInviteModeNull(){
     this.set(S_InviteMode,null);
  }

  public long getInviteMode(){
        return DataType.getAsLong(this.get(S_InviteMode));
  
  }
  public long getInviteModeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_InviteMode));
      }

  public void initGroupId(long value){
     this.initProperty(S_GroupId,new Long(value));
  }
  public  void setGroupId(long value){
     this.set(S_GroupId,new Long(value));
  }
  public  void setGroupIdNull(){
     this.set(S_GroupId,null);
  }

  public long getGroupId(){
        return DataType.getAsLong(this.get(S_GroupId));
  
  }
  public long getGroupIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_GroupId));
      }

  public void initExt1(String value){
     this.initProperty(S_Ext1,value);
  }
  public  void setExt1(String value){
     this.set(S_Ext1,value);
  }
  public  void setExt1Null(){
     this.set(S_Ext1,null);
  }

  public String getExt1(){
       return DataType.getAsString(this.get(S_Ext1));
  
  }
  public String getExt1InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext1));
      }

  public void initExt2(String value){
     this.initProperty(S_Ext2,value);
  }
  public  void setExt2(String value){
     this.set(S_Ext2,value);
  }
  public  void setExt2Null(){
     this.set(S_Ext2,null);
  }

  public String getExt2(){
       return DataType.getAsString(this.get(S_Ext2));
  
  }
  public String getExt2InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext2));
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

  public void initExt3(String value){
     this.initProperty(S_Ext3,value);
  }
  public  void setExt3(String value){
     this.set(S_Ext3,value);
  }
  public  void setExt3Null(){
     this.set(S_Ext3,null);
  }

  public String getExt3(){
       return DataType.getAsString(this.get(S_Ext3));
  
  }
  public String getExt3InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext3));
      }

  public void initStatus(long value){
     this.initProperty(S_Status,new Long(value));
  }
  public  void setStatus(long value){
     this.set(S_Status,new Long(value));
  }
  public  void setStatusNull(){
     this.set(S_Status,null);
  }

  public long getStatus(){
        return DataType.getAsLong(this.get(S_Status));
  
  }
  public long getStatusInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Status));
      }

  public void initInviteeIdentity(String value){
     this.initProperty(S_InviteeIdentity,value);
  }
  public  void setInviteeIdentity(String value){
     this.set(S_InviteeIdentity,value);
  }
  public  void setInviteeIdentityNull(){
     this.set(S_InviteeIdentity,null);
  }

  public String getInviteeIdentity(){
       return DataType.getAsString(this.get(S_InviteeIdentity));
  
  }
  public String getInviteeIdentityInitialValue(){
        return DataType.getAsString(this.getOldObj(S_InviteeIdentity));
      }

  public void initInviter(long value){
     this.initProperty(S_Inviter,new Long(value));
  }
  public  void setInviter(long value){
     this.set(S_Inviter,new Long(value));
  }
  public  void setInviterNull(){
     this.set(S_Inviter,null);
  }

  public long getInviter(){
        return DataType.getAsLong(this.get(S_Inviter));
  
  }
  public long getInviterInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Inviter));
      }

  public void initIsSeen(String value){
     this.initProperty(S_IsSeen,value);
  }
  public  void setIsSeen(String value){
     this.set(S_IsSeen,value);
  }
  public  void setIsSeenNull(){
     this.set(S_IsSeen,null);
  }

  public String getIsSeen(){
       return DataType.getAsString(this.get(S_IsSeen));
  
  }
  public String getIsSeenInitialValue(){
        return DataType.getAsString(this.getOldObj(S_IsSeen));
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

  public void initInviteeRefId(long value){
     this.initProperty(S_InviteeRefId,new Long(value));
  }
  public  void setInviteeRefId(long value){
     this.set(S_InviteeRefId,new Long(value));
  }
  public  void setInviteeRefIdNull(){
     this.set(S_InviteeRefId,null);
  }

  public long getInviteeRefId(){
        return DataType.getAsLong(this.get(S_InviteeRefId));
  
  }
  public long getInviteeRefIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_InviteeRefId));
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

  public void initInvitationId(long value){
     this.initProperty(S_InvitationId,new Long(value));
  }
  public  void setInvitationId(long value){
     this.set(S_InvitationId,new Long(value));
  }
  public  void setInvitationIdNull(){
     this.set(S_InvitationId,null);
  }

  public long getInvitationId(){
        return DataType.getAsLong(this.get(S_InvitationId));
  
  }
  public long getInvitationIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_InvitationId));
      }


 
 }

