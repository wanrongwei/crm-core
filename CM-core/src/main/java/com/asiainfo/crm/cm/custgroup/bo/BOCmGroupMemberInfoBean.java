package com.asiainfo.crm.cm.custgroup.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.custgroup.ivalues.*;

public class BOCmGroupMemberInfoBean extends DataContainer implements DataContainerInterface,IBOCmGroupMemberInfoValue{

  private static String  m_boName = "com.asiainfo.crm.cm.custgroup.bo.BOCmGroupMemberInfo";



  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_JoinCode = "JOIN_CODE";
  public final static  String S_MemberName = "MEMBER_NAME";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_GroupRole = "GROUP_ROLE";
  public final static  String S_MemberRefId = "MEMBER_REF_ID";
  public final static  String S_GroupId = "GROUP_ID";
  public final static  String S_Ext1 = "EXT1";
  public final static  String S_Ext2 = "EXT2";
  public final static  String S_MemberStatus = "MEMBER_STATUS";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_Ext3 = "EXT3";
  public final static  String S_QuitMode = "QUIT_MODE";
  public final static  String S_MemberId = "MEMBER_ID";
  public final static  String S_JoinMode = "JOIN_MODE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmGroupMemberInfoBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
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

  public void initJoinCode(String value){
     this.initProperty(S_JoinCode,value);
  }
  public  void setJoinCode(String value){
     this.set(S_JoinCode,value);
  }
  public  void setJoinCodeNull(){
     this.set(S_JoinCode,null);
  }

  public String getJoinCode(){
       return DataType.getAsString(this.get(S_JoinCode));
  
  }
  public String getJoinCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_JoinCode));
      }

  public void initMemberName(String value){
     this.initProperty(S_MemberName,value);
  }
  public  void setMemberName(String value){
     this.set(S_MemberName,value);
  }
  public  void setMemberNameNull(){
     this.set(S_MemberName,null);
  }

  public String getMemberName(){
       return DataType.getAsString(this.get(S_MemberName));
  
  }
  public String getMemberNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_MemberName));
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

  public void initGroupRole(long value){
     this.initProperty(S_GroupRole,new Long(value));
  }
  public  void setGroupRole(long value){
     this.set(S_GroupRole,new Long(value));
  }
  public  void setGroupRoleNull(){
     this.set(S_GroupRole,null);
  }

  public long getGroupRole(){
        return DataType.getAsLong(this.get(S_GroupRole));
  
  }
  public long getGroupRoleInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_GroupRole));
      }

  public void initMemberRefId(long value){
     this.initProperty(S_MemberRefId,new Long(value));
  }
  public  void setMemberRefId(long value){
     this.set(S_MemberRefId,new Long(value));
  }
  public  void setMemberRefIdNull(){
     this.set(S_MemberRefId,null);
  }

  public long getMemberRefId(){
        return DataType.getAsLong(this.get(S_MemberRefId));
  
  }
  public long getMemberRefIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_MemberRefId));
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

  public void initMemberStatus(long value){
     this.initProperty(S_MemberStatus,new Long(value));
  }
  public  void setMemberStatus(long value){
     this.set(S_MemberStatus,new Long(value));
  }
  public  void setMemberStatusNull(){
     this.set(S_MemberStatus,null);
  }

  public long getMemberStatus(){
        return DataType.getAsLong(this.get(S_MemberStatus));
  
  }
  public long getMemberStatusInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_MemberStatus));
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

  public void initQuitMode(long value){
     this.initProperty(S_QuitMode,new Long(value));
  }
  public  void setQuitMode(long value){
     this.set(S_QuitMode,new Long(value));
  }
  public  void setQuitModeNull(){
     this.set(S_QuitMode,null);
  }

  public long getQuitMode(){
        return DataType.getAsLong(this.get(S_QuitMode));
  
  }
  public long getQuitModeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_QuitMode));
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

  public void initJoinMode(long value){
     this.initProperty(S_JoinMode,new Long(value));
  }
  public  void setJoinMode(long value){
     this.set(S_JoinMode,new Long(value));
  }
  public  void setJoinModeNull(){
     this.set(S_JoinMode,null);
  }

  public long getJoinMode(){
        return DataType.getAsLong(this.get(S_JoinMode));
  
  }
  public long getJoinModeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_JoinMode));
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


 
 }

