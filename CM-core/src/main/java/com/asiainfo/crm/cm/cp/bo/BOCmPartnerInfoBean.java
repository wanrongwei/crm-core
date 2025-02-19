package com.asiainfo.crm.cm.cp.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.cp.ivalues.*;

public class BOCmPartnerInfoBean extends DataContainer implements DataContainerInterface,IBOCmPartnerInfoValue{

  private static String  m_boName = "com.asiainfo.crm.cm.cp.bo.BOCmPartnerInfo";



  public final static  String S_PartnerType = "PARTNER_TYPE";
  public final static  String S_CityId = "CITY_ID";
  public final static  String S_CoopCompany = "COOP_COMPANY";
  public final static  String S_OrganiseFlag = "ORGANISE_FLAG";
  public final static  String S_Auditor = "AUDITOR";
  public final static  String S_EnterLevel = "ENTER_LEVEL";
  public final static  String S_WebSite = "WEB_SITE";
  public final static  String S_BaseAccessNoProp = "BASE_ACCESS_NO_PROP";
  public final static  String S_EnterDesc = "ENTER_DESC";
  public final static  String S_ParentPartnerId = "PARENT_PARTNER_ID";
  public final static  String S_RejectType = "REJECT_TYPE";
  public final static  String S_PauseDesc = "PAUSE_DESC";
  public final static  String S_PartnerMode = "PARTNER_MODE";
  public final static  String S_StateName = "STATE_NAME";
  public final static  String S_ZoneId = "ZONE_ID";
  public final static  String S_EnName = "EN_NAME";
  public final static  String S_PartId = "PART_ID";
  public final static  String S_PublicPhone = "PUBLIC_PHONE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_AliasName = "ALIAS_NAME";
  public final static  String S_LeaveDate = "LEAVE_DATE";
  public final static  String S_LeaveDesc = "LEAVE_DESC";
  public final static  String S_LeaveType = "LEAVE_TYPE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_SiIntroNum = "SI_INTRO_NUM";
  public final static  String S_EnterDate = "ENTER_DATE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_State = "STATE";
  public final static  String S_PartnerNo = "PARTNER_NO";
  public final static  String S_PartnerTypeDtl = "PARTNER_TYPE_DTL";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_BusiTestDate = "BUSI_TEST_DATE";
  public final static  String S_MistakeStatus = "MISTAKE_STATUS";
  public final static  String S_PassTime = "PASS_TIME";
  public final static  String S_ApplyDate = "APPLY_DATE";
  public final static  String S_ShortName = "SHORT_NAME";
  public final static  String S_ExtField10 = "EXT_FIELD10";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_OrganiseId = "ORGANISE_ID";
  public final static  String S_RejectDate = "REJECT_DATE";
  public final static  String S_Email = "EMAIL";
  public final static  String S_ProvId = "PROV_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_BatchFlag = "BATCH_FLAG";
  public final static  String S_CreditLevel = "CREDIT_LEVEL";
  public final static  String S_PartnerProperty = "PARTNER_PROPERTY";
  public final static  String S_CooperateType = "COOPERATE_TYPE";
  public final static  String S_PartnerId = "PARTNER_ID";
  public final static  String S_OtherName = "OTHER_NAME";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_PauseDate = "PAUSE_DATE";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_ExtField2 = "EXT_FIELD2";
  public final static  String S_ExtField3 = "EXT_FIELD3";
  public final static  String S_ExtField1 = "EXT_FIELD1";
  public final static  String S_StatusType = "STATUS_TYPE";
  public final static  String S_ExtField6 = "EXT_FIELD6";
  public final static  String S_ExtField7 = "EXT_FIELD7";
  public final static  String S_ExtField4 = "EXT_FIELD4";
  public final static  String S_ExtField5 = "EXT_FIELD5";
  public final static  String S_RejectDesc = "REJECT_DESC";
  public final static  String S_ExtField8 = "EXT_FIELD8";
  public final static  String S_ExtField9 = "EXT_FIELD9";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmPartnerInfoBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initPartnerType(int value){
     this.initProperty(S_PartnerType,new Integer(value));
  }
  public  void setPartnerType(int value){
     this.set(S_PartnerType,new Integer(value));
  }
  public  void setPartnerTypeNull(){
     this.set(S_PartnerType,null);
  }

  public int getPartnerType(){
        return DataType.getAsInt(this.get(S_PartnerType));
  
  }
  public int getPartnerTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_PartnerType));
      }

  public void initCityId(long value){
     this.initProperty(S_CityId,new Long(value));
  }
  public  void setCityId(long value){
     this.set(S_CityId,new Long(value));
  }
  public  void setCityIdNull(){
     this.set(S_CityId,null);
  }

  public long getCityId(){
        return DataType.getAsLong(this.get(S_CityId));
  
  }
  public long getCityIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CityId));
      }

  public void initCoopCompany(int value){
     this.initProperty(S_CoopCompany,new Integer(value));
  }
  public  void setCoopCompany(int value){
     this.set(S_CoopCompany,new Integer(value));
  }
  public  void setCoopCompanyNull(){
     this.set(S_CoopCompany,null);
  }

  public int getCoopCompany(){
        return DataType.getAsInt(this.get(S_CoopCompany));
  
  }
  public int getCoopCompanyInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CoopCompany));
      }

  public void initOrganiseFlag(int value){
     this.initProperty(S_OrganiseFlag,new Integer(value));
  }
  public  void setOrganiseFlag(int value){
     this.set(S_OrganiseFlag,new Integer(value));
  }
  public  void setOrganiseFlagNull(){
     this.set(S_OrganiseFlag,null);
  }

  public int getOrganiseFlag(){
        return DataType.getAsInt(this.get(S_OrganiseFlag));
  
  }
  public int getOrganiseFlagInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_OrganiseFlag));
      }

  public void initAuditor(int value){
     this.initProperty(S_Auditor,new Integer(value));
  }
  public  void setAuditor(int value){
     this.set(S_Auditor,new Integer(value));
  }
  public  void setAuditorNull(){
     this.set(S_Auditor,null);
  }

  public int getAuditor(){
        return DataType.getAsInt(this.get(S_Auditor));
  
  }
  public int getAuditorInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_Auditor));
      }

  public void initEnterLevel(int value){
     this.initProperty(S_EnterLevel,new Integer(value));
  }
  public  void setEnterLevel(int value){
     this.set(S_EnterLevel,new Integer(value));
  }
  public  void setEnterLevelNull(){
     this.set(S_EnterLevel,null);
  }

  public int getEnterLevel(){
        return DataType.getAsInt(this.get(S_EnterLevel));
  
  }
  public int getEnterLevelInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_EnterLevel));
      }

  public void initWebSite(String value){
     this.initProperty(S_WebSite,value);
  }
  public  void setWebSite(String value){
     this.set(S_WebSite,value);
  }
  public  void setWebSiteNull(){
     this.set(S_WebSite,null);
  }

  public String getWebSite(){
       return DataType.getAsString(this.get(S_WebSite));
  
  }
  public String getWebSiteInitialValue(){
        return DataType.getAsString(this.getOldObj(S_WebSite));
      }

  public void initBaseAccessNoProp(int value){
     this.initProperty(S_BaseAccessNoProp,new Integer(value));
  }
  public  void setBaseAccessNoProp(int value){
     this.set(S_BaseAccessNoProp,new Integer(value));
  }
  public  void setBaseAccessNoPropNull(){
     this.set(S_BaseAccessNoProp,null);
  }

  public int getBaseAccessNoProp(){
        return DataType.getAsInt(this.get(S_BaseAccessNoProp));
  
  }
  public int getBaseAccessNoPropInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_BaseAccessNoProp));
      }

  public void initEnterDesc(String value){
     this.initProperty(S_EnterDesc,value);
  }
  public  void setEnterDesc(String value){
     this.set(S_EnterDesc,value);
  }
  public  void setEnterDescNull(){
     this.set(S_EnterDesc,null);
  }

  public String getEnterDesc(){
       return DataType.getAsString(this.get(S_EnterDesc));
  
  }
  public String getEnterDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_EnterDesc));
      }

  public void initParentPartnerId(long value){
     this.initProperty(S_ParentPartnerId,new Long(value));
  }
  public  void setParentPartnerId(long value){
     this.set(S_ParentPartnerId,new Long(value));
  }
  public  void setParentPartnerIdNull(){
     this.set(S_ParentPartnerId,null);
  }

  public long getParentPartnerId(){
        return DataType.getAsLong(this.get(S_ParentPartnerId));
  
  }
  public long getParentPartnerIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ParentPartnerId));
      }

  public void initRejectType(int value){
     this.initProperty(S_RejectType,new Integer(value));
  }
  public  void setRejectType(int value){
     this.set(S_RejectType,new Integer(value));
  }
  public  void setRejectTypeNull(){
     this.set(S_RejectType,null);
  }

  public int getRejectType(){
        return DataType.getAsInt(this.get(S_RejectType));
  
  }
  public int getRejectTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_RejectType));
      }

  public void initPauseDesc(String value){
     this.initProperty(S_PauseDesc,value);
  }
  public  void setPauseDesc(String value){
     this.set(S_PauseDesc,value);
  }
  public  void setPauseDescNull(){
     this.set(S_PauseDesc,null);
  }

  public String getPauseDesc(){
       return DataType.getAsString(this.get(S_PauseDesc));
  
  }
  public String getPauseDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PauseDesc));
      }

  public void initPartnerMode(int value){
     this.initProperty(S_PartnerMode,new Integer(value));
  }
  public  void setPartnerMode(int value){
     this.set(S_PartnerMode,new Integer(value));
  }
  public  void setPartnerModeNull(){
     this.set(S_PartnerMode,null);
  }

  public int getPartnerMode(){
        return DataType.getAsInt(this.get(S_PartnerMode));
  
  }
  public int getPartnerModeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_PartnerMode));
      }

  public void initStateName(String value){
     this.initProperty(S_StateName,value);
  }
  public  void setStateName(String value){
     this.set(S_StateName,value);
  }
  public  void setStateNameNull(){
     this.set(S_StateName,null);
  }

  public String getStateName(){
       return DataType.getAsString(this.get(S_StateName));
  
  }
  public String getStateNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_StateName));
      }

  public void initZoneId(long value){
     this.initProperty(S_ZoneId,new Long(value));
  }
  public  void setZoneId(long value){
     this.set(S_ZoneId,new Long(value));
  }
  public  void setZoneIdNull(){
     this.set(S_ZoneId,null);
  }

  public long getZoneId(){
        return DataType.getAsLong(this.get(S_ZoneId));
  
  }
  public long getZoneIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ZoneId));
      }

  public void initEnName(String value){
     this.initProperty(S_EnName,value);
  }
  public  void setEnName(String value){
     this.set(S_EnName,value);
  }
  public  void setEnNameNull(){
     this.set(S_EnName,null);
  }

  public String getEnName(){
       return DataType.getAsString(this.get(S_EnName));
  
  }
  public String getEnNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_EnName));
      }

  public void initPartId(long value){
     this.initProperty(S_PartId,new Long(value));
  }
  public  void setPartId(long value){
     this.set(S_PartId,new Long(value));
  }
  public  void setPartIdNull(){
     this.set(S_PartId,null);
  }

  public long getPartId(){
        return DataType.getAsLong(this.get(S_PartId));
  
  }
  public long getPartIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_PartId));
      }

  public void initPublicPhone(String value){
     this.initProperty(S_PublicPhone,value);
  }
  public  void setPublicPhone(String value){
     this.set(S_PublicPhone,value);
  }
  public  void setPublicPhoneNull(){
     this.set(S_PublicPhone,null);
  }

  public String getPublicPhone(){
       return DataType.getAsString(this.get(S_PublicPhone));
  
  }
  public String getPublicPhoneInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PublicPhone));
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

  public void initAliasName(String value){
     this.initProperty(S_AliasName,value);
  }
  public  void setAliasName(String value){
     this.set(S_AliasName,value);
  }
  public  void setAliasNameNull(){
     this.set(S_AliasName,null);
  }

  public String getAliasName(){
       return DataType.getAsString(this.get(S_AliasName));
  
  }
  public String getAliasNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AliasName));
      }

  public void initLeaveDate(Timestamp value){
     this.initProperty(S_LeaveDate,value);
  }
  public  void setLeaveDate(Timestamp value){
     this.set(S_LeaveDate,value);
  }
  public  void setLeaveDateNull(){
     this.set(S_LeaveDate,null);
  }

  public Timestamp getLeaveDate(){
        return DataType.getAsDateTime(this.get(S_LeaveDate));
  
  }
  public Timestamp getLeaveDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_LeaveDate));
      }

  public void initLeaveDesc(String value){
     this.initProperty(S_LeaveDesc,value);
  }
  public  void setLeaveDesc(String value){
     this.set(S_LeaveDesc,value);
  }
  public  void setLeaveDescNull(){
     this.set(S_LeaveDesc,null);
  }

  public String getLeaveDesc(){
       return DataType.getAsString(this.get(S_LeaveDesc));
  
  }
  public String getLeaveDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_LeaveDesc));
      }

  public void initLeaveType(long value){
     this.initProperty(S_LeaveType,new Long(value));
  }
  public  void setLeaveType(long value){
     this.set(S_LeaveType,new Long(value));
  }
  public  void setLeaveTypeNull(){
     this.set(S_LeaveType,null);
  }

  public long getLeaveType(){
        return DataType.getAsLong(this.get(S_LeaveType));
  
  }
  public long getLeaveTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_LeaveType));
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

  public void initSiIntroNum(String value){
     this.initProperty(S_SiIntroNum,value);
  }
  public  void setSiIntroNum(String value){
     this.set(S_SiIntroNum,value);
  }
  public  void setSiIntroNumNull(){
     this.set(S_SiIntroNum,null);
  }

  public String getSiIntroNum(){
       return DataType.getAsString(this.get(S_SiIntroNum));
  
  }
  public String getSiIntroNumInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SiIntroNum));
      }

  public void initEnterDate(Timestamp value){
     this.initProperty(S_EnterDate,value);
  }
  public  void setEnterDate(Timestamp value){
     this.set(S_EnterDate,value);
  }
  public  void setEnterDateNull(){
     this.set(S_EnterDate,null);
  }

  public Timestamp getEnterDate(){
        return DataType.getAsDateTime(this.get(S_EnterDate));
  
  }
  public Timestamp getEnterDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_EnterDate));
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

  public void initPartnerNo(long value){
     this.initProperty(S_PartnerNo,new Long(value));
  }
  public  void setPartnerNo(long value){
     this.set(S_PartnerNo,new Long(value));
  }
  public  void setPartnerNoNull(){
     this.set(S_PartnerNo,null);
  }

  public long getPartnerNo(){
        return DataType.getAsLong(this.get(S_PartnerNo));
  
  }
  public long getPartnerNoInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_PartnerNo));
      }

  public void initPartnerTypeDtl(int value){
     this.initProperty(S_PartnerTypeDtl,new Integer(value));
  }
  public  void setPartnerTypeDtl(int value){
     this.set(S_PartnerTypeDtl,new Integer(value));
  }
  public  void setPartnerTypeDtlNull(){
     this.set(S_PartnerTypeDtl,null);
  }

  public int getPartnerTypeDtl(){
        return DataType.getAsInt(this.get(S_PartnerTypeDtl));
  
  }
  public int getPartnerTypeDtlInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_PartnerTypeDtl));
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

  public void initBusiTestDate(Timestamp value){
     this.initProperty(S_BusiTestDate,value);
  }
  public  void setBusiTestDate(Timestamp value){
     this.set(S_BusiTestDate,value);
  }
  public  void setBusiTestDateNull(){
     this.set(S_BusiTestDate,null);
  }

  public Timestamp getBusiTestDate(){
        return DataType.getAsDateTime(this.get(S_BusiTestDate));
  
  }
  public Timestamp getBusiTestDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_BusiTestDate));
      }

  public void initMistakeStatus(int value){
     this.initProperty(S_MistakeStatus,new Integer(value));
  }
  public  void setMistakeStatus(int value){
     this.set(S_MistakeStatus,new Integer(value));
  }
  public  void setMistakeStatusNull(){
     this.set(S_MistakeStatus,null);
  }

  public int getMistakeStatus(){
        return DataType.getAsInt(this.get(S_MistakeStatus));
  
  }
  public int getMistakeStatusInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_MistakeStatus));
      }

  public void initPassTime(Timestamp value){
     this.initProperty(S_PassTime,value);
  }
  public  void setPassTime(Timestamp value){
     this.set(S_PassTime,value);
  }
  public  void setPassTimeNull(){
     this.set(S_PassTime,null);
  }

  public Timestamp getPassTime(){
        return DataType.getAsDateTime(this.get(S_PassTime));
  
  }
  public Timestamp getPassTimeInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_PassTime));
      }

  public void initApplyDate(Timestamp value){
     this.initProperty(S_ApplyDate,value);
  }
  public  void setApplyDate(Timestamp value){
     this.set(S_ApplyDate,value);
  }
  public  void setApplyDateNull(){
     this.set(S_ApplyDate,null);
  }

  public Timestamp getApplyDate(){
        return DataType.getAsDateTime(this.get(S_ApplyDate));
  
  }
  public Timestamp getApplyDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_ApplyDate));
      }

  public void initShortName(String value){
     this.initProperty(S_ShortName,value);
  }
  public  void setShortName(String value){
     this.set(S_ShortName,value);
  }
  public  void setShortNameNull(){
     this.set(S_ShortName,null);
  }

  public String getShortName(){
       return DataType.getAsString(this.get(S_ShortName));
  
  }
  public String getShortNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ShortName));
      }

  public void initExtField10(String value){
     this.initProperty(S_ExtField10,value);
  }
  public  void setExtField10(String value){
     this.set(S_ExtField10,value);
  }
  public  void setExtField10Null(){
     this.set(S_ExtField10,null);
  }

  public String getExtField10(){
       return DataType.getAsString(this.get(S_ExtField10));
  
  }
  public String getExtField10InitialValue(){
        return DataType.getAsString(this.getOldObj(S_ExtField10));
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

  public void initOrganiseId(long value){
     this.initProperty(S_OrganiseId,new Long(value));
  }
  public  void setOrganiseId(long value){
     this.set(S_OrganiseId,new Long(value));
  }
  public  void setOrganiseIdNull(){
     this.set(S_OrganiseId,null);
  }

  public long getOrganiseId(){
        return DataType.getAsLong(this.get(S_OrganiseId));
  
  }
  public long getOrganiseIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_OrganiseId));
      }

  public void initRejectDate(Timestamp value){
     this.initProperty(S_RejectDate,value);
  }
  public  void setRejectDate(Timestamp value){
     this.set(S_RejectDate,value);
  }
  public  void setRejectDateNull(){
     this.set(S_RejectDate,null);
  }

  public Timestamp getRejectDate(){
        return DataType.getAsDateTime(this.get(S_RejectDate));
  
  }
  public Timestamp getRejectDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_RejectDate));
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

  public void initProvId(long value){
     this.initProperty(S_ProvId,new Long(value));
  }
  public  void setProvId(long value){
     this.set(S_ProvId,new Long(value));
  }
  public  void setProvIdNull(){
     this.set(S_ProvId,null);
  }

  public long getProvId(){
        return DataType.getAsLong(this.get(S_ProvId));
  
  }
  public long getProvIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ProvId));
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

  public void initBatchFlag(String value){
     this.initProperty(S_BatchFlag,value);
  }
  public  void setBatchFlag(String value){
     this.set(S_BatchFlag,value);
  }
  public  void setBatchFlagNull(){
     this.set(S_BatchFlag,null);
  }

  public String getBatchFlag(){
       return DataType.getAsString(this.get(S_BatchFlag));
  
  }
  public String getBatchFlagInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BatchFlag));
      }

  public void initCreditLevel(int value){
     this.initProperty(S_CreditLevel,new Integer(value));
  }
  public  void setCreditLevel(int value){
     this.set(S_CreditLevel,new Integer(value));
  }
  public  void setCreditLevelNull(){
     this.set(S_CreditLevel,null);
  }

  public int getCreditLevel(){
        return DataType.getAsInt(this.get(S_CreditLevel));
  
  }
  public int getCreditLevelInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CreditLevel));
      }

  public void initPartnerProperty(int value){
     this.initProperty(S_PartnerProperty,new Integer(value));
  }
  public  void setPartnerProperty(int value){
     this.set(S_PartnerProperty,new Integer(value));
  }
  public  void setPartnerPropertyNull(){
     this.set(S_PartnerProperty,null);
  }

  public int getPartnerProperty(){
        return DataType.getAsInt(this.get(S_PartnerProperty));
  
  }
  public int getPartnerPropertyInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_PartnerProperty));
      }

  public void initCooperateType(int value){
     this.initProperty(S_CooperateType,new Integer(value));
  }
  public  void setCooperateType(int value){
     this.set(S_CooperateType,new Integer(value));
  }
  public  void setCooperateTypeNull(){
     this.set(S_CooperateType,null);
  }

  public int getCooperateType(){
        return DataType.getAsInt(this.get(S_CooperateType));
  
  }
  public int getCooperateTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CooperateType));
      }

  public void initPartnerId(long value){
     this.initProperty(S_PartnerId,new Long(value));
  }
  public  void setPartnerId(long value){
     this.set(S_PartnerId,new Long(value));
  }
  public  void setPartnerIdNull(){
     this.set(S_PartnerId,null);
  }

  public long getPartnerId(){
        return DataType.getAsLong(this.get(S_PartnerId));
  
  }
  public long getPartnerIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_PartnerId));
      }

  public void initOtherName(String value){
     this.initProperty(S_OtherName,value);
  }
  public  void setOtherName(String value){
     this.set(S_OtherName,value);
  }
  public  void setOtherNameNull(){
     this.set(S_OtherName,null);
  }

  public String getOtherName(){
       return DataType.getAsString(this.get(S_OtherName));
  
  }
  public String getOtherNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OtherName));
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

  public void initPauseDate(Timestamp value){
     this.initProperty(S_PauseDate,value);
  }
  public  void setPauseDate(Timestamp value){
     this.set(S_PauseDate,value);
  }
  public  void setPauseDateNull(){
     this.set(S_PauseDate,null);
  }

  public Timestamp getPauseDate(){
        return DataType.getAsDateTime(this.get(S_PauseDate));
  
  }
  public Timestamp getPauseDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_PauseDate));
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

  public void initExtField2(String value){
     this.initProperty(S_ExtField2,value);
  }
  public  void setExtField2(String value){
     this.set(S_ExtField2,value);
  }
  public  void setExtField2Null(){
     this.set(S_ExtField2,null);
  }

  public String getExtField2(){
       return DataType.getAsString(this.get(S_ExtField2));
  
  }
  public String getExtField2InitialValue(){
        return DataType.getAsString(this.getOldObj(S_ExtField2));
      }

  public void initExtField3(String value){
     this.initProperty(S_ExtField3,value);
  }
  public  void setExtField3(String value){
     this.set(S_ExtField3,value);
  }
  public  void setExtField3Null(){
     this.set(S_ExtField3,null);
  }

  public String getExtField3(){
       return DataType.getAsString(this.get(S_ExtField3));
  
  }
  public String getExtField3InitialValue(){
        return DataType.getAsString(this.getOldObj(S_ExtField3));
      }

  public void initExtField1(String value){
     this.initProperty(S_ExtField1,value);
  }
  public  void setExtField1(String value){
     this.set(S_ExtField1,value);
  }
  public  void setExtField1Null(){
     this.set(S_ExtField1,null);
  }

  public String getExtField1(){
       return DataType.getAsString(this.get(S_ExtField1));
  
  }
  public String getExtField1InitialValue(){
        return DataType.getAsString(this.getOldObj(S_ExtField1));
      }

  public void initStatusType(int value){
     this.initProperty(S_StatusType,new Integer(value));
  }
  public  void setStatusType(int value){
     this.set(S_StatusType,new Integer(value));
  }
  public  void setStatusTypeNull(){
     this.set(S_StatusType,null);
  }

  public int getStatusType(){
        return DataType.getAsInt(this.get(S_StatusType));
  
  }
  public int getStatusTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_StatusType));
      }

  public void initExtField6(String value){
     this.initProperty(S_ExtField6,value);
  }
  public  void setExtField6(String value){
     this.set(S_ExtField6,value);
  }
  public  void setExtField6Null(){
     this.set(S_ExtField6,null);
  }

  public String getExtField6(){
       return DataType.getAsString(this.get(S_ExtField6));
  
  }
  public String getExtField6InitialValue(){
        return DataType.getAsString(this.getOldObj(S_ExtField6));
      }

  public void initExtField7(String value){
     this.initProperty(S_ExtField7,value);
  }
  public  void setExtField7(String value){
     this.set(S_ExtField7,value);
  }
  public  void setExtField7Null(){
     this.set(S_ExtField7,null);
  }

  public String getExtField7(){
       return DataType.getAsString(this.get(S_ExtField7));
  
  }
  public String getExtField7InitialValue(){
        return DataType.getAsString(this.getOldObj(S_ExtField7));
      }

  public void initExtField4(String value){
     this.initProperty(S_ExtField4,value);
  }
  public  void setExtField4(String value){
     this.set(S_ExtField4,value);
  }
  public  void setExtField4Null(){
     this.set(S_ExtField4,null);
  }

  public String getExtField4(){
       return DataType.getAsString(this.get(S_ExtField4));
  
  }
  public String getExtField4InitialValue(){
        return DataType.getAsString(this.getOldObj(S_ExtField4));
      }

  public void initExtField5(String value){
     this.initProperty(S_ExtField5,value);
  }
  public  void setExtField5(String value){
     this.set(S_ExtField5,value);
  }
  public  void setExtField5Null(){
     this.set(S_ExtField5,null);
  }

  public String getExtField5(){
       return DataType.getAsString(this.get(S_ExtField5));
  
  }
  public String getExtField5InitialValue(){
        return DataType.getAsString(this.getOldObj(S_ExtField5));
      }

  public void initRejectDesc(String value){
     this.initProperty(S_RejectDesc,value);
  }
  public  void setRejectDesc(String value){
     this.set(S_RejectDesc,value);
  }
  public  void setRejectDescNull(){
     this.set(S_RejectDesc,null);
  }

  public String getRejectDesc(){
       return DataType.getAsString(this.get(S_RejectDesc));
  
  }
  public String getRejectDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_RejectDesc));
      }

  public void initExtField8(String value){
     this.initProperty(S_ExtField8,value);
  }
  public  void setExtField8(String value){
     this.set(S_ExtField8,value);
  }
  public  void setExtField8Null(){
     this.set(S_ExtField8,null);
  }

  public String getExtField8(){
       return DataType.getAsString(this.get(S_ExtField8));
  
  }
  public String getExtField8InitialValue(){
        return DataType.getAsString(this.getOldObj(S_ExtField8));
      }

  public void initExtField9(String value){
     this.initProperty(S_ExtField9,value);
  }
  public  void setExtField9(String value){
     this.set(S_ExtField9,value);
  }
  public  void setExtField9Null(){
     this.set(S_ExtField9,null);
  }

  public String getExtField9(){
       return DataType.getAsString(this.get(S_ExtField9));
  
  }
  public String getExtField9InitialValue(){
        return DataType.getAsString(this.getOldObj(S_ExtField9));
      }


 
 }

