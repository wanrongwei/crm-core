package com.asiainfo.crm.cm.ln.common.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.ln.common.ivalues.*;

public class BOCmGroupCustomerAuditBean extends DataContainer implements DataContainerInterface,IBOCmGroupCustomerAuditValue{

  private static String  m_boName = "com.asiainfo.crm.cm.ln.common.bo.BOCmGroupCustomerAudit";



  public final static  String S_MemberCustId = "MEMBER_CUST_ID";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_Job = "JOB";
  public final static  String S_BrandName = "BRAND_NAME";
  public final static  String S_GroupType = "GROUP_TYPE";
  public final static  String S_Deptment = "DEPTMENT";
  public final static  String S_CustAddress = "CUST_ADDRESS";
  public final static  String S_ShortNum = "SHORT_NUM";
  public final static  String S_PlanName = "PLAN_NAME";
  public final static  String S_ContMobile = "CONT_MOBILE";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_MemberName = "MEMBER_NAME";
  public final static  String S_AuditId = "AUDIT_ID";
  public final static  String S_MemberType = "MEMBER_TYPE";
  public final static  String S_RegionId2 = "REGION_ID2";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_OperType = "OPER_TYPE";
  public final static  String S_AuditStatus = "AUDIT_STATUS";
  public final static  String S_CustZipcode = "CUST_ZIPCODE";
  public final static  String S_AuditType = "AUDIT_TYPE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_AuditDesc = "AUDIT_DESC";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_MemberState = "MEMBER_STATE";
  public final static  String S_PlanId = "PLAN_ID";
  public final static  String S_BrandId = "BRAND_ID";
  public final static  String S_MemberCreateDate = "MEMBER_CREATE_DATE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_ManagerId = "MANAGER_ID";
  public final static  String S_CountyId = "COUNTY_ID";
  public final static  String S_AuditDate = "AUDIT_DATE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_ClassId = "CLASS_ID";
  public final static  String S_AuditManagerId = "AUDIT_MANAGER_ID";
  public final static  String S_IsVip = "IS_VIP";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmGroupCustomerAuditBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initMemberCustId(long value){
     this.initProperty(S_MemberCustId,new Long(value));
  }
  public  void setMemberCustId(long value){
     this.set(S_MemberCustId,new Long(value));
  }
  public  void setMemberCustIdNull(){
     this.set(S_MemberCustId,null);
  }

  public long getMemberCustId(){
        return DataType.getAsLong(this.get(S_MemberCustId));
  
  }
  public long getMemberCustIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_MemberCustId));
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

  public void initJob(String value){
     this.initProperty(S_Job,value);
  }
  public  void setJob(String value){
     this.set(S_Job,value);
  }
  public  void setJobNull(){
     this.set(S_Job,null);
  }

  public String getJob(){
       return DataType.getAsString(this.get(S_Job));
  
  }
  public String getJobInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Job));
      }

  public void initBrandName(String value){
     this.initProperty(S_BrandName,value);
  }
  public  void setBrandName(String value){
     this.set(S_BrandName,value);
  }
  public  void setBrandNameNull(){
     this.set(S_BrandName,null);
  }

  public String getBrandName(){
       return DataType.getAsString(this.get(S_BrandName));
  
  }
  public String getBrandNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BrandName));
      }

  public void initGroupType(int value){
     this.initProperty(S_GroupType,new Integer(value));
  }
  public  void setGroupType(int value){
     this.set(S_GroupType,new Integer(value));
  }
  public  void setGroupTypeNull(){
     this.set(S_GroupType,null);
  }

  public int getGroupType(){
        return DataType.getAsInt(this.get(S_GroupType));
  
  }
  public int getGroupTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_GroupType));
      }

  public void initDeptment(String value){
     this.initProperty(S_Deptment,value);
  }
  public  void setDeptment(String value){
     this.set(S_Deptment,value);
  }
  public  void setDeptmentNull(){
     this.set(S_Deptment,null);
  }

  public String getDeptment(){
       return DataType.getAsString(this.get(S_Deptment));
  
  }
  public String getDeptmentInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Deptment));
      }

  public void initCustAddress(String value){
     this.initProperty(S_CustAddress,value);
  }
  public  void setCustAddress(String value){
     this.set(S_CustAddress,value);
  }
  public  void setCustAddressNull(){
     this.set(S_CustAddress,null);
  }

  public String getCustAddress(){
       return DataType.getAsString(this.get(S_CustAddress));
  
  }
  public String getCustAddressInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CustAddress));
      }

  public void initShortNum(String value){
     this.initProperty(S_ShortNum,value);
  }
  public  void setShortNum(String value){
     this.set(S_ShortNum,value);
  }
  public  void setShortNumNull(){
     this.set(S_ShortNum,null);
  }

  public String getShortNum(){
       return DataType.getAsString(this.get(S_ShortNum));
  
  }
  public String getShortNumInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ShortNum));
      }

  public void initPlanName(String value){
     this.initProperty(S_PlanName,value);
  }
  public  void setPlanName(String value){
     this.set(S_PlanName,value);
  }
  public  void setPlanNameNull(){
     this.set(S_PlanName,null);
  }

  public String getPlanName(){
       return DataType.getAsString(this.get(S_PlanName));
  
  }
  public String getPlanNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PlanName));
      }

  public void initContMobile(String value){
     this.initProperty(S_ContMobile,value);
  }
  public  void setContMobile(String value){
     this.set(S_ContMobile,value);
  }
  public  void setContMobileNull(){
     this.set(S_ContMobile,null);
  }

  public String getContMobile(){
       return DataType.getAsString(this.get(S_ContMobile));
  
  }
  public String getContMobileInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContMobile));
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

  public void initRegionId2(String value){
     this.initProperty(S_RegionId2,value);
  }
  public  void setRegionId2(String value){
     this.set(S_RegionId2,value);
  }
  public  void setRegionId2Null(){
     this.set(S_RegionId2,null);
  }

  public String getRegionId2(){
       return DataType.getAsString(this.get(S_RegionId2));
  
  }
  public String getRegionId2InitialValue(){
        return DataType.getAsString(this.getOldObj(S_RegionId2));
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

  public void initAuditStatus(int value){
     this.initProperty(S_AuditStatus,new Integer(value));
  }
  public  void setAuditStatus(int value){
     this.set(S_AuditStatus,new Integer(value));
  }
  public  void setAuditStatusNull(){
     this.set(S_AuditStatus,null);
  }

  public int getAuditStatus(){
        return DataType.getAsInt(this.get(S_AuditStatus));
  
  }
  public int getAuditStatusInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_AuditStatus));
      }

  public void initCustZipcode(String value){
     this.initProperty(S_CustZipcode,value);
  }
  public  void setCustZipcode(String value){
     this.set(S_CustZipcode,value);
  }
  public  void setCustZipcodeNull(){
     this.set(S_CustZipcode,null);
  }

  public String getCustZipcode(){
       return DataType.getAsString(this.get(S_CustZipcode));
  
  }
  public String getCustZipcodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CustZipcode));
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

  public void initMemberState(int value){
     this.initProperty(S_MemberState,new Integer(value));
  }
  public  void setMemberState(int value){
     this.set(S_MemberState,new Integer(value));
  }
  public  void setMemberStateNull(){
     this.set(S_MemberState,null);
  }

  public int getMemberState(){
        return DataType.getAsInt(this.get(S_MemberState));
  
  }
  public int getMemberStateInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_MemberState));
      }

  public void initPlanId(long value){
     this.initProperty(S_PlanId,new Long(value));
  }
  public  void setPlanId(long value){
     this.set(S_PlanId,new Long(value));
  }
  public  void setPlanIdNull(){
     this.set(S_PlanId,null);
  }

  public long getPlanId(){
        return DataType.getAsLong(this.get(S_PlanId));
  
  }
  public long getPlanIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_PlanId));
      }

  public void initBrandId(long value){
     this.initProperty(S_BrandId,new Long(value));
  }
  public  void setBrandId(long value){
     this.set(S_BrandId,new Long(value));
  }
  public  void setBrandIdNull(){
     this.set(S_BrandId,null);
  }

  public long getBrandId(){
        return DataType.getAsLong(this.get(S_BrandId));
  
  }
  public long getBrandIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_BrandId));
      }

  public void initMemberCreateDate(Timestamp value){
     this.initProperty(S_MemberCreateDate,value);
  }
  public  void setMemberCreateDate(Timestamp value){
     this.set(S_MemberCreateDate,value);
  }
  public  void setMemberCreateDateNull(){
     this.set(S_MemberCreateDate,null);
  }

  public Timestamp getMemberCreateDate(){
        return DataType.getAsDateTime(this.get(S_MemberCreateDate));
  
  }
  public Timestamp getMemberCreateDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_MemberCreateDate));
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

  public void initManagerId(long value){
     this.initProperty(S_ManagerId,new Long(value));
  }
  public  void setManagerId(long value){
     this.set(S_ManagerId,new Long(value));
  }
  public  void setManagerIdNull(){
     this.set(S_ManagerId,null);
  }

  public long getManagerId(){
        return DataType.getAsLong(this.get(S_ManagerId));
  
  }
  public long getManagerIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ManagerId));
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

  public void initAuditDate(Timestamp value){
     this.initProperty(S_AuditDate,value);
  }
  public  void setAuditDate(Timestamp value){
     this.set(S_AuditDate,value);
  }
  public  void setAuditDateNull(){
     this.set(S_AuditDate,null);
  }

  public Timestamp getAuditDate(){
        return DataType.getAsDateTime(this.get(S_AuditDate));
  
  }
  public Timestamp getAuditDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_AuditDate));
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

  public void initClassId(int value){
     this.initProperty(S_ClassId,new Integer(value));
  }
  public  void setClassId(int value){
     this.set(S_ClassId,new Integer(value));
  }
  public  void setClassIdNull(){
     this.set(S_ClassId,null);
  }

  public int getClassId(){
        return DataType.getAsInt(this.get(S_ClassId));
  
  }
  public int getClassIdInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ClassId));
      }

  public void initAuditManagerId(long value){
     this.initProperty(S_AuditManagerId,new Long(value));
  }
  public  void setAuditManagerId(long value){
     this.set(S_AuditManagerId,new Long(value));
  }
  public  void setAuditManagerIdNull(){
     this.set(S_AuditManagerId,null);
  }

  public long getAuditManagerId(){
        return DataType.getAsLong(this.get(S_AuditManagerId));
  
  }
  public long getAuditManagerIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_AuditManagerId));
      }

  public void initIsVip(int value){
     this.initProperty(S_IsVip,new Integer(value));
  }
  public  void setIsVip(int value){
     this.set(S_IsVip,new Integer(value));
  }
  public  void setIsVipNull(){
     this.set(S_IsVip,null);
  }

  public int getIsVip(){
        return DataType.getAsInt(this.get(S_IsVip));
  
  }
  public int getIsVipInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IsVip));
      }


 
 }

