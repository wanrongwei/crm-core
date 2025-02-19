package com.asiainfo.crm.cm.common.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.common.ivalues.*;

public class BOCmCustMerchantBean extends DataContainer implements DataContainerInterface,IBOCmCustMerchantValue{

  private static String  m_boName = "com.asiainfo.crm.cm.common.bo.BOCmCustMerchant";



  public final static  String S_State = "STATE";
  public final static  String S_AuditSerialNumber = "AUDIT_SERIAL_NUMBER";
  public final static  String S_MerchantRegionType = "MERCHANT_REGION_TYPE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_UpdateDepartId = "UPDATE_DEPART_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_MerchantMemo = "MERCHANT_MEMO";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_AgentId = "AGENT_ID";
  public final static  String S_BusiLicenceNo = "BUSI_LICENCE_NO";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_BusiLicenceType = "BUSI_LICENCE_TYPE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_Email = "EMAIL";
  public final static  String S_ContactPhone = "CONTACT_PHONE";
  public final static  String S_Age = "AGE";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_AuditDepartId = "AUDIT_DEPART_ID";
  public final static  String S_PostCode = "POST_CODE";
  public final static  String S_AuditStaffId = "AUDIT_STAFF_ID";
  public final static  String S_AuditTime = "AUDIT_TIME";
  public final static  String S_JuristicName = "JURISTIC_NAME";
  public final static  String S_FaxNbr = "FAX_NBR";
  public final static  String S_MerchantStatus = "MERCHANT_STATUS";
  public final static  String S_AuditResult = "AUDIT_RESULT";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_CityCode = "CITY_CODE";
  public final static  String S_CallingTypeCode2 = "CALLING_TYPE_CODE2";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_Contact = "CONTACT";
  public final static  String S_BankAccount = "BANK_ACCOUNT";
  public final static  String S_RegAmount = "REG_AMOUNT";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_ProvinceCode = "PROVINCE_CODE";
  public final static  String S_BranchName = "BRANCH_NAME";
  public final static  String S_SynLock12580 = "SYN_LOCK12580";
  public final static  String S_Gender = "GENDER";
  public final static  String S_EparchyCode = "EPARCHY_CODE";
  public final static  String S_SynStatus12580 = "SYN_STATUS12580";
  public final static  String S_MerchantName = "MERCHANT_NAME";
  public final static  String S_MerchantId = "MERCHANT_ID";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_CallingTypeCode = "CALLING_TYPE_CODE";
  public final static  String S_CallingTypeCode3 = "CALLING_TYPE_CODE3";
  public final static  String S_Address = "ADDRESS";
  public final static  String S_CustId = "CUST_ID";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmCustMerchantBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
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

  public void initAuditSerialNumber(String value){
     this.initProperty(S_AuditSerialNumber,value);
  }
  public  void setAuditSerialNumber(String value){
     this.set(S_AuditSerialNumber,value);
  }
  public  void setAuditSerialNumberNull(){
     this.set(S_AuditSerialNumber,null);
  }

  public String getAuditSerialNumber(){
       return DataType.getAsString(this.get(S_AuditSerialNumber));
  
  }
  public String getAuditSerialNumberInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AuditSerialNumber));
      }

  public void initMerchantRegionType(long value){
     this.initProperty(S_MerchantRegionType,new Long(value));
  }
  public  void setMerchantRegionType(long value){
     this.set(S_MerchantRegionType,new Long(value));
  }
  public  void setMerchantRegionTypeNull(){
     this.set(S_MerchantRegionType,null);
  }

  public long getMerchantRegionType(){
        return DataType.getAsLong(this.get(S_MerchantRegionType));
  
  }
  public long getMerchantRegionTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_MerchantRegionType));
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

  public void initUpdateDepartId(long value){
     this.initProperty(S_UpdateDepartId,new Long(value));
  }
  public  void setUpdateDepartId(long value){
     this.set(S_UpdateDepartId,new Long(value));
  }
  public  void setUpdateDepartIdNull(){
     this.set(S_UpdateDepartId,null);
  }

  public long getUpdateDepartId(){
        return DataType.getAsLong(this.get(S_UpdateDepartId));
  
  }
  public long getUpdateDepartIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_UpdateDepartId));
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

  public void initMerchantMemo(String value){
     this.initProperty(S_MerchantMemo,value);
  }
  public  void setMerchantMemo(String value){
     this.set(S_MerchantMemo,value);
  }
  public  void setMerchantMemoNull(){
     this.set(S_MerchantMemo,null);
  }

  public String getMerchantMemo(){
       return DataType.getAsString(this.get(S_MerchantMemo));
  
  }
  public String getMerchantMemoInitialValue(){
        return DataType.getAsString(this.getOldObj(S_MerchantMemo));
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

  public void initAgentId(String value){
     this.initProperty(S_AgentId,value);
  }
  public  void setAgentId(String value){
     this.set(S_AgentId,value);
  }
  public  void setAgentIdNull(){
     this.set(S_AgentId,null);
  }

  public String getAgentId(){
       return DataType.getAsString(this.get(S_AgentId));
  
  }
  public String getAgentIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AgentId));
      }

  public void initBusiLicenceNo(String value){
     this.initProperty(S_BusiLicenceNo,value);
  }
  public  void setBusiLicenceNo(String value){
     this.set(S_BusiLicenceNo,value);
  }
  public  void setBusiLicenceNoNull(){
     this.set(S_BusiLicenceNo,null);
  }

  public String getBusiLicenceNo(){
       return DataType.getAsString(this.get(S_BusiLicenceNo));
  
  }
  public String getBusiLicenceNoInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BusiLicenceNo));
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

  public void initBusiLicenceType(String value){
     this.initProperty(S_BusiLicenceType,value);
  }
  public  void setBusiLicenceType(String value){
     this.set(S_BusiLicenceType,value);
  }
  public  void setBusiLicenceTypeNull(){
     this.set(S_BusiLicenceType,null);
  }

  public String getBusiLicenceType(){
       return DataType.getAsString(this.get(S_BusiLicenceType));
  
  }
  public String getBusiLicenceTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BusiLicenceType));
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

  public void initEmail(String value){
     this.initProperty(S_Email,value);
  }
  public  void setEmail(String value){
     this.set(S_Email,value);
  }
  public  void setEmailNull(){
     this.set(S_Email,null);
  }

  public String getEmail(){
       return DataType.getAsString(this.get(S_Email));
  
  }
  public String getEmailInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Email));
      }

  public void initContactPhone(String value){
     this.initProperty(S_ContactPhone,value);
  }
  public  void setContactPhone(String value){
     this.set(S_ContactPhone,value);
  }
  public  void setContactPhoneNull(){
     this.set(S_ContactPhone,null);
  }

  public String getContactPhone(){
       return DataType.getAsString(this.get(S_ContactPhone));
  
  }
  public String getContactPhoneInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContactPhone));
      }

  public void initAge(int value){
     this.initProperty(S_Age,new Integer(value));
  }
  public  void setAge(int value){
     this.set(S_Age,new Integer(value));
  }
  public  void setAgeNull(){
     this.set(S_Age,null);
  }

  public int getAge(){
        return DataType.getAsInt(this.get(S_Age));
  
  }
  public int getAgeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_Age));
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

  public void initAuditDepartId(String value){
     this.initProperty(S_AuditDepartId,value);
  }
  public  void setAuditDepartId(String value){
     this.set(S_AuditDepartId,value);
  }
  public  void setAuditDepartIdNull(){
     this.set(S_AuditDepartId,null);
  }

  public String getAuditDepartId(){
       return DataType.getAsString(this.get(S_AuditDepartId));
  
  }
  public String getAuditDepartIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AuditDepartId));
      }

  public void initPostCode(String value){
     this.initProperty(S_PostCode,value);
  }
  public  void setPostCode(String value){
     this.set(S_PostCode,value);
  }
  public  void setPostCodeNull(){
     this.set(S_PostCode,null);
  }

  public String getPostCode(){
       return DataType.getAsString(this.get(S_PostCode));
  
  }
  public String getPostCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PostCode));
      }

  public void initAuditStaffId(long value){
     this.initProperty(S_AuditStaffId,new Long(value));
  }
  public  void setAuditStaffId(long value){
     this.set(S_AuditStaffId,new Long(value));
  }
  public  void setAuditStaffIdNull(){
     this.set(S_AuditStaffId,null);
  }

  public long getAuditStaffId(){
        return DataType.getAsLong(this.get(S_AuditStaffId));
  
  }
  public long getAuditStaffIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_AuditStaffId));
      }

  public void initAuditTime(String value){
     this.initProperty(S_AuditTime,value);
  }
  public  void setAuditTime(String value){
     this.set(S_AuditTime,value);
  }
  public  void setAuditTimeNull(){
     this.set(S_AuditTime,null);
  }

  public String getAuditTime(){
       return DataType.getAsString(this.get(S_AuditTime));
  
  }
  public String getAuditTimeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AuditTime));
      }

  public void initJuristicName(String value){
     this.initProperty(S_JuristicName,value);
  }
  public  void setJuristicName(String value){
     this.set(S_JuristicName,value);
  }
  public  void setJuristicNameNull(){
     this.set(S_JuristicName,null);
  }

  public String getJuristicName(){
       return DataType.getAsString(this.get(S_JuristicName));
  
  }
  public String getJuristicNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_JuristicName));
      }

  public void initFaxNbr(String value){
     this.initProperty(S_FaxNbr,value);
  }
  public  void setFaxNbr(String value){
     this.set(S_FaxNbr,value);
  }
  public  void setFaxNbrNull(){
     this.set(S_FaxNbr,null);
  }

  public String getFaxNbr(){
       return DataType.getAsString(this.get(S_FaxNbr));
  
  }
  public String getFaxNbrInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FaxNbr));
      }

  public void initMerchantStatus(long value){
     this.initProperty(S_MerchantStatus,new Long(value));
  }
  public  void setMerchantStatus(long value){
     this.set(S_MerchantStatus,new Long(value));
  }
  public  void setMerchantStatusNull(){
     this.set(S_MerchantStatus,null);
  }

  public long getMerchantStatus(){
        return DataType.getAsLong(this.get(S_MerchantStatus));
  
  }
  public long getMerchantStatusInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_MerchantStatus));
      }

  public void initAuditResult(String value){
     this.initProperty(S_AuditResult,value);
  }
  public  void setAuditResult(String value){
     this.set(S_AuditResult,value);
  }
  public  void setAuditResultNull(){
     this.set(S_AuditResult,null);
  }

  public String getAuditResult(){
       return DataType.getAsString(this.get(S_AuditResult));
  
  }
  public String getAuditResultInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AuditResult));
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

  public void initCityCode(String value){
     this.initProperty(S_CityCode,value);
  }
  public  void setCityCode(String value){
     this.set(S_CityCode,value);
  }
  public  void setCityCodeNull(){
     this.set(S_CityCode,null);
  }

  public String getCityCode(){
       return DataType.getAsString(this.get(S_CityCode));
  
  }
  public String getCityCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CityCode));
      }

  public void initCallingTypeCode2(int value){
     this.initProperty(S_CallingTypeCode2,new Integer(value));
  }
  public  void setCallingTypeCode2(int value){
     this.set(S_CallingTypeCode2,new Integer(value));
  }
  public  void setCallingTypeCode2Null(){
     this.set(S_CallingTypeCode2,null);
  }

  public int getCallingTypeCode2(){
        return DataType.getAsInt(this.get(S_CallingTypeCode2));
  
  }
  public int getCallingTypeCode2InitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CallingTypeCode2));
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

  public void initContact(String value){
     this.initProperty(S_Contact,value);
  }
  public  void setContact(String value){
     this.set(S_Contact,value);
  }
  public  void setContactNull(){
     this.set(S_Contact,null);
  }

  public String getContact(){
       return DataType.getAsString(this.get(S_Contact));
  
  }
  public String getContactInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Contact));
      }

  public void initBankAccount(String value){
     this.initProperty(S_BankAccount,value);
  }
  public  void setBankAccount(String value){
     this.set(S_BankAccount,value);
  }
  public  void setBankAccountNull(){
     this.set(S_BankAccount,null);
  }

  public String getBankAccount(){
       return DataType.getAsString(this.get(S_BankAccount));
  
  }
  public String getBankAccountInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BankAccount));
      }

  public void initRegAmount(String value){
     this.initProperty(S_RegAmount,value);
  }
  public  void setRegAmount(String value){
     this.set(S_RegAmount,value);
  }
  public  void setRegAmountNull(){
     this.set(S_RegAmount,null);
  }

  public String getRegAmount(){
       return DataType.getAsString(this.get(S_RegAmount));
  
  }
  public String getRegAmountInitialValue(){
        return DataType.getAsString(this.getOldObj(S_RegAmount));
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

  public void initProvinceCode(String value){
     this.initProperty(S_ProvinceCode,value);
  }
  public  void setProvinceCode(String value){
     this.set(S_ProvinceCode,value);
  }
  public  void setProvinceCodeNull(){
     this.set(S_ProvinceCode,null);
  }

  public String getProvinceCode(){
       return DataType.getAsString(this.get(S_ProvinceCode));
  
  }
  public String getProvinceCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ProvinceCode));
      }

  public void initBranchName(String value){
     this.initProperty(S_BranchName,value);
  }
  public  void setBranchName(String value){
     this.set(S_BranchName,value);
  }
  public  void setBranchNameNull(){
     this.set(S_BranchName,null);
  }

  public String getBranchName(){
       return DataType.getAsString(this.get(S_BranchName));
  
  }
  public String getBranchNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BranchName));
      }

  public void initSynLock12580(String value){
     this.initProperty(S_SynLock12580,value);
  }
  public  void setSynLock12580(String value){
     this.set(S_SynLock12580,value);
  }
  public  void setSynLock12580Null(){
     this.set(S_SynLock12580,null);
  }

  public String getSynLock12580(){
       return DataType.getAsString(this.get(S_SynLock12580));
  
  }
  public String getSynLock12580InitialValue(){
        return DataType.getAsString(this.getOldObj(S_SynLock12580));
      }

  public void initGender(int value){
     this.initProperty(S_Gender,new Integer(value));
  }
  public  void setGender(int value){
     this.set(S_Gender,new Integer(value));
  }
  public  void setGenderNull(){
     this.set(S_Gender,null);
  }

  public int getGender(){
        return DataType.getAsInt(this.get(S_Gender));
  
  }
  public int getGenderInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_Gender));
      }

  public void initEparchyCode(String value){
     this.initProperty(S_EparchyCode,value);
  }
  public  void setEparchyCode(String value){
     this.set(S_EparchyCode,value);
  }
  public  void setEparchyCodeNull(){
     this.set(S_EparchyCode,null);
  }

  public String getEparchyCode(){
       return DataType.getAsString(this.get(S_EparchyCode));
  
  }
  public String getEparchyCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_EparchyCode));
      }

  public void initSynStatus12580(String value){
     this.initProperty(S_SynStatus12580,value);
  }
  public  void setSynStatus12580(String value){
     this.set(S_SynStatus12580,value);
  }
  public  void setSynStatus12580Null(){
     this.set(S_SynStatus12580,null);
  }

  public String getSynStatus12580(){
       return DataType.getAsString(this.get(S_SynStatus12580));
  
  }
  public String getSynStatus12580InitialValue(){
        return DataType.getAsString(this.getOldObj(S_SynStatus12580));
      }

  public void initMerchantName(String value){
     this.initProperty(S_MerchantName,value);
  }
  public  void setMerchantName(String value){
     this.set(S_MerchantName,value);
  }
  public  void setMerchantNameNull(){
     this.set(S_MerchantName,null);
  }

  public String getMerchantName(){
       return DataType.getAsString(this.get(S_MerchantName));
  
  }
  public String getMerchantNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_MerchantName));
      }

  public void initMerchantId(String value){
     this.initProperty(S_MerchantId,value);
  }
  public  void setMerchantId(String value){
     this.set(S_MerchantId,value);
  }
  public  void setMerchantIdNull(){
     this.set(S_MerchantId,null);
  }

  public String getMerchantId(){
       return DataType.getAsString(this.get(S_MerchantId));
  
  }
  public String getMerchantIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_MerchantId));
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

  public void initCallingTypeCode(int value){
     this.initProperty(S_CallingTypeCode,new Integer(value));
  }
  public  void setCallingTypeCode(int value){
     this.set(S_CallingTypeCode,new Integer(value));
  }
  public  void setCallingTypeCodeNull(){
     this.set(S_CallingTypeCode,null);
  }

  public int getCallingTypeCode(){
        return DataType.getAsInt(this.get(S_CallingTypeCode));
  
  }
  public int getCallingTypeCodeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CallingTypeCode));
      }

  public void initCallingTypeCode3(int value){
     this.initProperty(S_CallingTypeCode3,new Integer(value));
  }
  public  void setCallingTypeCode3(int value){
     this.set(S_CallingTypeCode3,new Integer(value));
  }
  public  void setCallingTypeCode3Null(){
     this.set(S_CallingTypeCode3,null);
  }

  public int getCallingTypeCode3(){
        return DataType.getAsInt(this.get(S_CallingTypeCode3));
  
  }
  public int getCallingTypeCode3InitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CallingTypeCode3));
      }

  public void initAddress(String value){
     this.initProperty(S_Address,value);
  }
  public  void setAddress(String value){
     this.set(S_Address,value);
  }
  public  void setAddressNull(){
     this.set(S_Address,null);
  }

  public String getAddress(){
       return DataType.getAsString(this.get(S_Address));
  
  }
  public String getAddressInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Address));
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


 
 }

