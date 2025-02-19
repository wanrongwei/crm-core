package com.asiainfo.crm.cm.customer.group.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.customer.group.ivalues.*;

public class BOCmGroupKeyMemBillBean extends DataContainer implements DataContainerInterface,IBOCmGroupKeyMemBillValue{

  private static String  m_boName = "com.asiainfo.crm.cm.customer.group.bo.BOCmGroupKeyMemBill";



  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_KernelLevel = "KERNEL_LEVEL";
  public final static  String S_State = "STATE";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_MemUserId = "MEM_USER_ID";
  public final static  String S_GroupCustId = "GROUP_CUST_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_KernelId = "KERNEL_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_KernelType = "KERNEL_TYPE";
  public final static  String S_VipLevel = "VIP_LEVEL";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_MemberType = "MEMBER_TYPE";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_UserStatus = "USER_STATUS";
  public final static  String S_Notes = "NOTES";
  public final static  String S_MemberLevel = "MEMBER_LEVEL";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmGroupKeyMemBillBean() throws AIException{
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

  public void initKernelLevel(int value){
     this.initProperty(S_KernelLevel,new Integer(value));
  }
  public  void setKernelLevel(int value){
     this.set(S_KernelLevel,new Integer(value));
  }
  public  void setKernelLevelNull(){
     this.set(S_KernelLevel,null);
  }

  public int getKernelLevel(){
        return DataType.getAsInt(this.get(S_KernelLevel));
  
  }
  public int getKernelLevelInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_KernelLevel));
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

  public void initUserId(long value){
     this.initProperty(S_UserId,new Long(value));
  }
  public  void setUserId(long value){
     this.set(S_UserId,new Long(value));
  }
  public  void setUserIdNull(){
     this.set(S_UserId,null);
  }

  public long getUserId(){
        return DataType.getAsLong(this.get(S_UserId));
  
  }
  public long getUserIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_UserId));
      }

  public void initMemUserId(long value){
     this.initProperty(S_MemUserId,new Long(value));
  }
  public  void setMemUserId(long value){
     this.set(S_MemUserId,new Long(value));
  }
  public  void setMemUserIdNull(){
     this.set(S_MemUserId,null);
  }

  public long getMemUserId(){
        return DataType.getAsLong(this.get(S_MemUserId));
  
  }
  public long getMemUserIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_MemUserId));
      }

  public void initGroupCustId(long value){
     this.initProperty(S_GroupCustId,new Long(value));
  }
  public  void setGroupCustId(long value){
     this.set(S_GroupCustId,new Long(value));
  }
  public  void setGroupCustIdNull(){
     this.set(S_GroupCustId,null);
  }

  public long getGroupCustId(){
        return DataType.getAsLong(this.get(S_GroupCustId));
  
  }
  public long getGroupCustIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_GroupCustId));
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

  public void initKernelId(long value){
     this.initProperty(S_KernelId,new Long(value));
  }
  public  void setKernelId(long value){
     this.set(S_KernelId,new Long(value));
  }
  public  void setKernelIdNull(){
     this.set(S_KernelId,null);
  }

  public long getKernelId(){
        return DataType.getAsLong(this.get(S_KernelId));
  
  }
  public long getKernelIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_KernelId));
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

  public void initKernelType(int value){
     this.initProperty(S_KernelType,new Integer(value));
  }
  public  void setKernelType(int value){
     this.set(S_KernelType,new Integer(value));
  }
  public  void setKernelTypeNull(){
     this.set(S_KernelType,null);
  }

  public int getKernelType(){
        return DataType.getAsInt(this.get(S_KernelType));
  
  }
  public int getKernelTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_KernelType));
      }

  public void initVipLevel(int value){
     this.initProperty(S_VipLevel,new Integer(value));
  }
  public  void setVipLevel(int value){
     this.set(S_VipLevel,new Integer(value));
  }
  public  void setVipLevelNull(){
     this.set(S_VipLevel,null);
  }

  public int getVipLevel(){
        return DataType.getAsInt(this.get(S_VipLevel));
  
  }
  public int getVipLevelInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_VipLevel));
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

  public void initBillId(String value){
     this.initProperty(S_BillId,value);
  }
  public  void setBillId(String value){
     this.set(S_BillId,value);
  }
  public  void setBillIdNull(){
     this.set(S_BillId,null);
  }

  public String getBillId(){
       return DataType.getAsString(this.get(S_BillId));
  
  }
  public String getBillIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BillId));
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

  public void initUserStatus(String value){
     this.initProperty(S_UserStatus,value);
  }
  public  void setUserStatus(String value){
     this.set(S_UserStatus,value);
  }
  public  void setUserStatusNull(){
     this.set(S_UserStatus,null);
  }

  public String getUserStatus(){
       return DataType.getAsString(this.get(S_UserStatus));
  
  }
  public String getUserStatusInitialValue(){
        return DataType.getAsString(this.getOldObj(S_UserStatus));
      }

  public void initNotes(String value){
     this.initProperty(S_Notes,value);
  }
  public  void setNotes(String value){
     this.set(S_Notes,value);
  }
  public  void setNotesNull(){
     this.set(S_Notes,null);
  }

  public String getNotes(){
       return DataType.getAsString(this.get(S_Notes));
  
  }
  public String getNotesInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Notes));
      }

  public void initMemberLevel(int value){
     this.initProperty(S_MemberLevel,new Integer(value));
  }
  public  void setMemberLevel(int value){
     this.set(S_MemberLevel,new Integer(value));
  }
  public  void setMemberLevelNull(){
     this.set(S_MemberLevel,null);
  }

  public int getMemberLevel(){
        return DataType.getAsInt(this.get(S_MemberLevel));
  
  }
  public int getMemberLevelInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_MemberLevel));
      }


 
 }

