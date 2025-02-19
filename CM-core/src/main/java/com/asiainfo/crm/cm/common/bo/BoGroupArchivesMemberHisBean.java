package com.asiainfo.crm.cm.common.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.common.ivalues.*;

public class BoGroupArchivesMemberHisBean extends DataContainer implements DataContainerInterface,IBoGroupArchivesMemberHisValue{

  private static String  m_boName = "com.asiainfo.crm.cm.common.bo.BoGroupArchivesMemberHis";



  public final static  String S_UserSts = "USER_STS";
  public final static  String S_MemberPhoneId = "MEMBER_PHONE_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_GroupSeq = "GROUP_SEQ";
  public final static  String S_MemberType = "MEMBER_TYPE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_MemberSts = "MEMBER_STS";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_MemberName = "MEMBER_NAME";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_OperType = "OPER_TYPE";
  public final static  String S_WorkDept = "WORK_DEPT";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_GroupMem = "GROUP_MEM";
  public final static  String S_PhoneType = "PHONE_TYPE";
  public final static  String S_HId = "H_ID";
  public final static  String S_NetType = "NET_TYPE";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BoGroupArchivesMemberHisBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initUserSts(int value){
     this.initProperty(S_UserSts,new Integer(value));
  }
  public  void setUserSts(int value){
     this.set(S_UserSts,new Integer(value));
  }
  public  void setUserStsNull(){
     this.set(S_UserSts,null);
  }

  public int getUserSts(){
        return DataType.getAsInt(this.get(S_UserSts));
  
  }
  public int getUserStsInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_UserSts));
      }

  public void initMemberPhoneId(String value){
     this.initProperty(S_MemberPhoneId,value);
  }
  public  void setMemberPhoneId(String value){
     this.set(S_MemberPhoneId,value);
  }
  public  void setMemberPhoneIdNull(){
     this.set(S_MemberPhoneId,null);
  }

  public String getMemberPhoneId(){
       return DataType.getAsString(this.get(S_MemberPhoneId));
  
  }
  public String getMemberPhoneIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_MemberPhoneId));
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

  public void initGroupSeq(String value){
     this.initProperty(S_GroupSeq,value);
  }
  public  void setGroupSeq(String value){
     this.set(S_GroupSeq,value);
  }
  public  void setGroupSeqNull(){
     this.set(S_GroupSeq,null);
  }

  public String getGroupSeq(){
       return DataType.getAsString(this.get(S_GroupSeq));
  
  }
  public String getGroupSeqInitialValue(){
        return DataType.getAsString(this.getOldObj(S_GroupSeq));
      }

  public void initMemberType(int value){
     this.initProperty(S_MemberType,new Integer(value));
  }
  public  void setMemberType(int value){
     this.set(S_MemberType,new Integer(value));
  }
  public  void setMemberTypeNull(){
     this.set(S_MemberType,null);
  }

  public int getMemberType(){
        return DataType.getAsInt(this.get(S_MemberType));
  
  }
  public int getMemberTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_MemberType));
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

  public void initMemberSts(int value){
     this.initProperty(S_MemberSts,new Integer(value));
  }
  public  void setMemberSts(int value){
     this.set(S_MemberSts,new Integer(value));
  }
  public  void setMemberStsNull(){
     this.set(S_MemberSts,null);
  }

  public int getMemberSts(){
        return DataType.getAsInt(this.get(S_MemberSts));
  
  }
  public int getMemberStsInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_MemberSts));
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

  public void initOperType(int value){
     this.initProperty(S_OperType,new Integer(value));
  }
  public  void setOperType(int value){
     this.set(S_OperType,new Integer(value));
  }
  public  void setOperTypeNull(){
     this.set(S_OperType,null);
  }

  public int getOperType(){
        return DataType.getAsInt(this.get(S_OperType));
  
  }
  public int getOperTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_OperType));
      }

  public void initWorkDept(String value){
     this.initProperty(S_WorkDept,value);
  }
  public  void setWorkDept(String value){
     this.set(S_WorkDept,value);
  }
  public  void setWorkDeptNull(){
     this.set(S_WorkDept,null);
  }

  public String getWorkDept(){
       return DataType.getAsString(this.get(S_WorkDept));
  
  }
  public String getWorkDeptInitialValue(){
        return DataType.getAsString(this.getOldObj(S_WorkDept));
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

  public void initGroupMem(int value){
     this.initProperty(S_GroupMem,new Integer(value));
  }
  public  void setGroupMem(int value){
     this.set(S_GroupMem,new Integer(value));
  }
  public  void setGroupMemNull(){
     this.set(S_GroupMem,null);
  }

  public int getGroupMem(){
        return DataType.getAsInt(this.get(S_GroupMem));
  
  }
  public int getGroupMemInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_GroupMem));
      }

  public void initPhoneType(int value){
     this.initProperty(S_PhoneType,new Integer(value));
  }
  public  void setPhoneType(int value){
     this.set(S_PhoneType,new Integer(value));
  }
  public  void setPhoneTypeNull(){
     this.set(S_PhoneType,null);
  }

  public int getPhoneType(){
        return DataType.getAsInt(this.get(S_PhoneType));
  
  }
  public int getPhoneTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_PhoneType));
      }

  public void initHId(long value){
     this.initProperty(S_HId,new Long(value));
  }
  public  void setHId(long value){
     this.set(S_HId,new Long(value));
  }
  public  void setHIdNull(){
     this.set(S_HId,null);
  }

  public long getHId(){
        return DataType.getAsLong(this.get(S_HId));
  
  }
  public long getHIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_HId));
      }

  public void initNetType(int value){
     this.initProperty(S_NetType,new Integer(value));
  }
  public  void setNetType(int value){
     this.set(S_NetType,new Integer(value));
  }
  public  void setNetTypeNull(){
     this.set(S_NetType,null);
  }

  public int getNetType(){
        return DataType.getAsInt(this.get(S_NetType));
  
  }
  public int getNetTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_NetType));
      }


 
 }

