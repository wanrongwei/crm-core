package com.asiainfo.crm.cm.inner.customer.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.inner.customer.ivalues.*;

public class BOCmGroupContactBean extends DataContainer implements DataContainerInterface,IBOCmGroupContactValue{

  private static String  m_boName = "com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupContact";



  public final static  String S_IdFileName = "ID_FILE_NAME";
  public final static  String S_State = "STATE";
  public final static  String S_ContBusiInterests = "CONT_BUSI_INTERESTS";
  public final static  String S_ProtoExpireDate = "PROTO_EXPIRE_DATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_PartyId = "PARTY_ID";
  public final static  String S_ContId = "CONT_ID";
  public final static  String S_ProtoValidDate = "PROTO_VALID_DATE";
  public final static  String S_IdExpireDate = "ID_EXPIRE_DATE";
  public final static  String S_ContactPermissions = "CONTACT_PERMISSIONS";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_ContactDepartment = "CONTACT_DEPARTMENT";
  public final static  String S_MemberType = "MEMBER_TYPE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_ContLevel = "CONT_LEVEL";
  public final static  String S_PrioryLevel = "PRIORY_LEVEL";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_ContClass = "CONT_CLASS";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_ProtoFileName = "PROTO_FILE_NAME";
  public final static  String S_ContType = "CONT_TYPE";
  public final static  String S_IdValidDate = "ID_VALID_DATE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_ContSocialInterests = "CONT_SOCIAL_INTERESTS";
  public final static  String S_ProvideId = "PROVIDE_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_MemberDesc = "MEMBER_DESC";
  public final static  String S_MemberJob = "MEMBER_JOB";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_Brand = "BRAND";
  public final static  String S_CustContId = "CUST_CONT_ID";
  public final static  String S_IsInheritable = "IS_INHERITABLE";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmGroupContactBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initIdFileName(String value){
     this.initProperty(S_IdFileName,value);
  }
  public  void setIdFileName(String value){
     this.set(S_IdFileName,value);
  }
  public  void setIdFileNameNull(){
     this.set(S_IdFileName,null);
  }

  public String getIdFileName(){
       return DataType.getAsString(this.get(S_IdFileName));
  
  }
  public String getIdFileNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_IdFileName));
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

  public void initContBusiInterests(long value){
     this.initProperty(S_ContBusiInterests,new Long(value));
  }
  public  void setContBusiInterests(long value){
     this.set(S_ContBusiInterests,new Long(value));
  }
  public  void setContBusiInterestsNull(){
     this.set(S_ContBusiInterests,null);
  }

  public long getContBusiInterests(){
        return DataType.getAsLong(this.get(S_ContBusiInterests));
  
  }
  public long getContBusiInterestsInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ContBusiInterests));
      }

  public void initProtoExpireDate(Timestamp value){
     this.initProperty(S_ProtoExpireDate,value);
  }
  public  void setProtoExpireDate(Timestamp value){
     this.set(S_ProtoExpireDate,value);
  }
  public  void setProtoExpireDateNull(){
     this.set(S_ProtoExpireDate,null);
  }

  public Timestamp getProtoExpireDate(){
        return DataType.getAsDateTime(this.get(S_ProtoExpireDate));
  
  }
  public Timestamp getProtoExpireDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_ProtoExpireDate));
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

  public void initContId(long value){
     this.initProperty(S_ContId,new Long(value));
  }
  public  void setContId(long value){
     this.set(S_ContId,new Long(value));
  }
  public  void setContIdNull(){
     this.set(S_ContId,null);
  }

  public long getContId(){
        return DataType.getAsLong(this.get(S_ContId));
  
  }
  public long getContIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ContId));
      }

  public void initProtoValidDate(Timestamp value){
     this.initProperty(S_ProtoValidDate,value);
  }
  public  void setProtoValidDate(Timestamp value){
     this.set(S_ProtoValidDate,value);
  }
  public  void setProtoValidDateNull(){
     this.set(S_ProtoValidDate,null);
  }

  public Timestamp getProtoValidDate(){
        return DataType.getAsDateTime(this.get(S_ProtoValidDate));
  
  }
  public Timestamp getProtoValidDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_ProtoValidDate));
      }

  public void initIdExpireDate(Timestamp value){
     this.initProperty(S_IdExpireDate,value);
  }
  public  void setIdExpireDate(Timestamp value){
     this.set(S_IdExpireDate,value);
  }
  public  void setIdExpireDateNull(){
     this.set(S_IdExpireDate,null);
  }

  public Timestamp getIdExpireDate(){
        return DataType.getAsDateTime(this.get(S_IdExpireDate));
  
  }
  public Timestamp getIdExpireDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_IdExpireDate));
      }

  public void initContactPermissions(long value){
     this.initProperty(S_ContactPermissions,new Long(value));
  }
  public  void setContactPermissions(long value){
     this.set(S_ContactPermissions,new Long(value));
  }
  public  void setContactPermissionsNull(){
     this.set(S_ContactPermissions,null);
  }

  public long getContactPermissions(){
        return DataType.getAsLong(this.get(S_ContactPermissions));
  
  }
  public long getContactPermissionsInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ContactPermissions));
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

  public void initContactDepartment(String value){
     this.initProperty(S_ContactDepartment,value);
  }
  public  void setContactDepartment(String value){
     this.set(S_ContactDepartment,value);
  }
  public  void setContactDepartmentNull(){
     this.set(S_ContactDepartment,null);
  }

  public String getContactDepartment(){
       return DataType.getAsString(this.get(S_ContactDepartment));
  
  }
  public String getContactDepartmentInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContactDepartment));
      }

  public void initMemberType(long value){
     this.initProperty(S_MemberType,new Long(value));
  }
  public  void setMemberType(long value){
     this.set(S_MemberType,new Long(value));
  }
  public  void setMemberTypeNull(){
     this.set(S_MemberType,null);
  }

  public long getMemberType(){
        return DataType.getAsLong(this.get(S_MemberType));
  
  }
  public long getMemberTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_MemberType));
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

  public void initContLevel(long value){
     this.initProperty(S_ContLevel,new Long(value));
  }
  public  void setContLevel(long value){
     this.set(S_ContLevel,new Long(value));
  }
  public  void setContLevelNull(){
     this.set(S_ContLevel,null);
  }

  public long getContLevel(){
        return DataType.getAsLong(this.get(S_ContLevel));
  
  }
  public long getContLevelInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ContLevel));
      }

  public void initPrioryLevel(long value){
     this.initProperty(S_PrioryLevel,new Long(value));
  }
  public  void setPrioryLevel(long value){
     this.set(S_PrioryLevel,new Long(value));
  }
  public  void setPrioryLevelNull(){
     this.set(S_PrioryLevel,null);
  }

  public long getPrioryLevel(){
        return DataType.getAsLong(this.get(S_PrioryLevel));
  
  }
  public long getPrioryLevelInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_PrioryLevel));
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

  public void initContClass(long value){
     this.initProperty(S_ContClass,new Long(value));
  }
  public  void setContClass(long value){
     this.set(S_ContClass,new Long(value));
  }
  public  void setContClassNull(){
     this.set(S_ContClass,null);
  }

  public long getContClass(){
        return DataType.getAsLong(this.get(S_ContClass));
  
  }
  public long getContClassInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ContClass));
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

  public void initProtoFileName(String value){
     this.initProperty(S_ProtoFileName,value);
  }
  public  void setProtoFileName(String value){
     this.set(S_ProtoFileName,value);
  }
  public  void setProtoFileNameNull(){
     this.set(S_ProtoFileName,null);
  }

  public String getProtoFileName(){
       return DataType.getAsString(this.get(S_ProtoFileName));
  
  }
  public String getProtoFileNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ProtoFileName));
      }

  public void initContType(long value){
     this.initProperty(S_ContType,new Long(value));
  }
  public  void setContType(long value){
     this.set(S_ContType,new Long(value));
  }
  public  void setContTypeNull(){
     this.set(S_ContType,null);
  }

  public long getContType(){
        return DataType.getAsLong(this.get(S_ContType));
  
  }
  public long getContTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ContType));
      }

  public void initIdValidDate(Timestamp value){
     this.initProperty(S_IdValidDate,value);
  }
  public  void setIdValidDate(Timestamp value){
     this.set(S_IdValidDate,value);
  }
  public  void setIdValidDateNull(){
     this.set(S_IdValidDate,null);
  }

  public Timestamp getIdValidDate(){
        return DataType.getAsDateTime(this.get(S_IdValidDate));
  
  }
  public Timestamp getIdValidDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_IdValidDate));
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

  public void initContSocialInterests(long value){
     this.initProperty(S_ContSocialInterests,new Long(value));
  }
  public  void setContSocialInterests(long value){
     this.set(S_ContSocialInterests,new Long(value));
  }
  public  void setContSocialInterestsNull(){
     this.set(S_ContSocialInterests,null);
  }

  public long getContSocialInterests(){
        return DataType.getAsLong(this.get(S_ContSocialInterests));
  
  }
  public long getContSocialInterestsInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ContSocialInterests));
      }

  public void initProvideId(long value){
     this.initProperty(S_ProvideId,new Long(value));
  }
  public  void setProvideId(long value){
     this.set(S_ProvideId,new Long(value));
  }
  public  void setProvideIdNull(){
     this.set(S_ProvideId,null);
  }

  public long getProvideId(){
        return DataType.getAsLong(this.get(S_ProvideId));
  
  }
  public long getProvideIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ProvideId));
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

  public void initMemberDesc(String value){
     this.initProperty(S_MemberDesc,value);
  }
  public  void setMemberDesc(String value){
     this.set(S_MemberDesc,value);
  }
  public  void setMemberDescNull(){
     this.set(S_MemberDesc,null);
  }

  public String getMemberDesc(){
       return DataType.getAsString(this.get(S_MemberDesc));
  
  }
  public String getMemberDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_MemberDesc));
      }

  public void initMemberJob(String value){
     this.initProperty(S_MemberJob,value);
  }
  public  void setMemberJob(String value){
     this.set(S_MemberJob,value);
  }
  public  void setMemberJobNull(){
     this.set(S_MemberJob,null);
  }

  public String getMemberJob(){
       return DataType.getAsString(this.get(S_MemberJob));
  
  }
  public String getMemberJobInitialValue(){
        return DataType.getAsString(this.getOldObj(S_MemberJob));
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

  public void initBrand(String value){
     this.initProperty(S_Brand,value);
  }
  public  void setBrand(String value){
     this.set(S_Brand,value);
  }
  public  void setBrandNull(){
     this.set(S_Brand,null);
  }

  public String getBrand(){
       return DataType.getAsString(this.get(S_Brand));
  
  }
  public String getBrandInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Brand));
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

  public void initIsInheritable(long value){
     this.initProperty(S_IsInheritable,new Long(value));
  }
  public  void setIsInheritable(long value){
     this.set(S_IsInheritable,new Long(value));
  }
  public  void setIsInheritableNull(){
     this.set(S_IsInheritable,null);
  }

  public long getIsInheritable(){
        return DataType.getAsLong(this.get(S_IsInheritable));
  
  }
  public long getIsInheritableInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_IsInheritable));
      }


 
 }

