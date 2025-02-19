package com.asiainfo.crm.cm.common.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.common.ivalues.*;

public class BOCustomerBean extends DataContainer implements DataContainerInterface,IBOCustomerValue{

  private static String  m_boName = "com.asiainfo.crm.cm.common.bo.BOCustomer";



  public final static  String S_CityId = "CITY_ID";
  public final static  String S_DevelopChannel = "DEVELOP_CHANNEL";
  public final static  String S_CustLevel = "CUST_LEVEL";
  public final static  String S_CustSubType = "CUST_SUB_TYPE";
  public final static  String S_OpState = "OP_STATE";
  public final static  String S_CharacterDesc = "CHARACTER_DESC";
  public final static  String S_CustStartDate = "CUST_START_DATE";
  public final static  String S_IncomeLevel = "INCOME_LEVEL";
  public final static  String S_IsVipDisplay = "IS_VIP_DISPLAY";
  public final static  String S_StateFlag = "STATE_FLAG";
  public final static  String S_AgentType = "AGENT_TYPE";
  public final static  String S_ImpGrade = "IMP_GRADE";
  public final static  String S_FirstName = "FIRST_NAME";
  public final static  String S_CustPassword = "CUST_PASSWORD";
  public final static  String S_ChannelsType = "CHANNELS_TYPE";
  public final static  String S_CustLanguage = "CUST_LANGUAGE";
  public final static  String S_CustCertExpire = "CUST_CERT_EXPIRE";
  public final static  String S_CustZipcode = "CUST_ZIPCODE";
  public final static  String S_ContAsign = "CONT_ASIGN";
  public final static  String S_Lunar = "LUNAR";
  public final static  String S_BusiContType = "BUSI_CONT_TYPE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_GenderDisplay = "GENDER_DISPLAY";
  public final static  String S_ReturnAsign = "RETURN_ASIGN";
  public final static  String S_BusiType = "BUSI_TYPE";
  public final static  String S_ServAttributeDesc = "SERV_ATTRIBUTE_DESC";
  public final static  String S_GroupFax = "GROUP_FAX";
  public final static  String S_StartDate = "START_DATE";
  public final static  String S_CustCertTypeDisplay = "CUST_CERT_TYPE_DISPLAY";
  public final static  String S_CustNameQry = "CUST_NAME_QRY";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_CustEmail = "CUST_EMAIL";
  public final static  String S_IsPzCust = "IS_PZ_CUST";
  public final static  String S_IsVip = "IS_VIP";
  public final static  String S_SignDate = "SIGN_DATE";
  public final static  String S_NationalType = "NATIONAL_TYPE";
  public final static  String S_FrameworkCode = "FRAMEWORK_CODE";
  public final static  String S_CustSign = "CUST_SIGN";
  public final static  String S_PartyId = "PARTY_ID";
  public final static  String S_ScoreScreen = "SCORE_SCREEN";
  public final static  String S_Project = "PROJECT";
  public final static  String S_CustBond = "CUST_BOND";
  public final static  String S_LegalCustId = "LEGAL_CUST_ID";
  public final static  String S_Nationality = "NATIONALITY";
  public final static  String S_VillegeId = "VILLEGE_ID";
  public final static  String S_CustAddress = "CUST_ADDRESS";
  public final static  String S_IndivCustTypeDisplay = "INDIV_CUST_TYPE_DISPLAY";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_MarryStatus = "MARRY_STATUS";
  public final static  String S_BusiContState = "BUSI_CONT_STATE";
  public final static  String S_AgentLevel = "AGENT_LEVEL";
  public final static  String S_CustServiceLevel = "CUST_SERVICE_LEVEL";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_RealNameFlag = "REAL_NAME_FLAG";
  public final static  String S_CreditLevel = "CREDIT_LEVEL";
  public final static  String S_CustStatus = "CUST_STATUS";
  public final static  String S_JobCompany = "JOB_COMPANY";
  public final static  String S_MainPhone = "MAIN_PHONE";
  public final static  String S_RealNameFlagDisplay = "REAL_NAME_FLAG_DISPLAY";
  public final static  String S_ParentCustId = "PARENT_CUST_ID";
  public final static  String S_ProvinceId = "PROVINCE_ID";
  public final static  String S_CustAttributeId = "CUST_ATTRIBUTE_ID";
  public final static  String S_HqVestCode = "HQ_VEST_CODE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_JobPosition = "JOB_POSITION";
  public final static  String S_LunarDisplay = "LUNAR_DISPLAY";
  public final static  String S_MsgSettleWay = "MSG_SETTLE_WAY";
  public final static  String S_SubVocation = "SUB_VOCATION";
  public final static  String S_MiddleName = "MIDDLE_NAME";
  public final static  String S_ValueLevel = "VALUE_LEVEL";
  public final static  String S_IndivCustType = "INDIV_CUST_TYPE";
  public final static  String S_Hobby = "HOBBY";
  public final static  String S_EducationLevel = "EDUCATION_LEVEL";
  public final static  String S_ServiceNum = "SERVICE_NUM";
  public final static  String S_LocalVocation = "LOCAL_VOCATION";
  public final static  String S_SubRegionType = "SUB_REGION_TYPE";
  public final static  String S_OneBusiContScale = "ONE_BUSI_CONT_SCALE";
  public final static  String S_CustCertType = "CUST_CERT_TYPE";
  public final static  String S_Vocation = "VOCATION";
  public final static  String S_CustCertCode = "CUST_CERT_CODE";
  public final static  String S_TownId = "TOWN_ID";
  public final static  String S_LogoutDate = "LOGOUT_DATE";
  public final static  String S_EcBusiContCode = "EC_BUSI_CONT_CODE";
  public final static  String S_SignNum = "SIGN_NUM";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_Occupation = "OCCUPATION";
  public final static  String S_HqNumber = "HQ_NUMBER";
  public final static  String S_RegionType = "REGION_TYPE";
  public final static  String S_OperationType = "OPERATION_TYPE";
  public final static  String S_CustType = "CUST_TYPE";
  public final static  String S_LastName = "LAST_NAME";
  public final static  String S_CustName = "CUST_NAME";
  public final static  String S_ManagerId = "MANAGER_ID";
  public final static  String S_StaffAmount = "STAFF_AMOUNT";
  public final static  String S_CustCertEffdate = "CUST_CERT_EFFDATE";
  public final static  String S_CustServiceLevelDisplay = "CUST_SERVICE_LEVEL_DISPLAY";
  public final static  String S_TwoBusiCode = "TWO_BUSI_CODE";
  public final static  String S_ValueScore = "VALUE_SCORE";
  public final static  String S_InPhaseShow = "IN_PHASE_SHOW";
  public final static  String S_PoliticsFace = "POLITICS_FACE";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_RegAmount = "REG_AMOUNT";
  public final static  String S_CreditValue = "CREDIT_VALUE";
  public final static  String S_ShortName = "SHORT_NAME";
  public final static  String S_GroupType = "GROUP_TYPE";
  public final static  String S_CustStatusDisplay = "CUST_STATUS_DISPLAY";
  public final static  String S_EconomyTypeNext = "ECONOMY_TYPE_NEXT";
  public final static  String S_CreditLevelDisplay = "CREDIT_LEVEL_DISPLAY";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_CustTypeDtl = "CUST_TYPE_DTL";
  public final static  String S_LegalPerson = "LEGAL_PERSON";
  public final static  String S_Birthday = "BIRTHDAY";
  public final static  String S_LegalCustName = "LEGAL_CUST_NAME";
  public final static  String S_CustServiceId = "CUST_SERVICE_ID";
  public final static  String S_LastNameQry = "LAST_NAME_QRY";
  public final static  String S_OneBusiCode = "ONE_BUSI_CODE";
  public final static  String S_FamilyInfo = "FAMILY_INFO";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_EconomyType = "ECONOMY_TYPE";
  public final static  String S_CountyId = "COUNTY_ID";
  public final static  String S_Gender = "GENDER";
  public final static  String S_Religion = "RELIGION";
  public final static  String S_FirstNameQry = "FIRST_NAME_QRY";
  public final static  String S_MiddleNameQry = "MIDDLE_NAME_QRY";
  public final static  String S_CustCertAddress = "CUST_CERT_ADDRESS";
  public final static  String S_GroupWeb = "GROUP_WEB";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCustomerBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initCityId(String value){
     this.initProperty(S_CityId,value);
  }
  public  void setCityId(String value){
     this.set(S_CityId,value);
  }
  public  void setCityIdNull(){
     this.set(S_CityId,null);
  }

  public String getCityId(){
       return DataType.getAsString(this.get(S_CityId));
  
  }
  public String getCityIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CityId));
      }

  public void initDevelopChannel(String value){
     this.initProperty(S_DevelopChannel,value);
  }
  public  void setDevelopChannel(String value){
     this.set(S_DevelopChannel,value);
  }
  public  void setDevelopChannelNull(){
     this.set(S_DevelopChannel,null);
  }

  public String getDevelopChannel(){
       return DataType.getAsString(this.get(S_DevelopChannel));
  
  }
  public String getDevelopChannelInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DevelopChannel));
      }

  public void initCustLevel(String value){
     this.initProperty(S_CustLevel,value);
  }
  public  void setCustLevel(String value){
     this.set(S_CustLevel,value);
  }
  public  void setCustLevelNull(){
     this.set(S_CustLevel,null);
  }

  public String getCustLevel(){
       return DataType.getAsString(this.get(S_CustLevel));
  
  }
  public String getCustLevelInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CustLevel));
      }

  public void initCustSubType(String value){
     this.initProperty(S_CustSubType,value);
  }
  public  void setCustSubType(String value){
     this.set(S_CustSubType,value);
  }
  public  void setCustSubTypeNull(){
     this.set(S_CustSubType,null);
  }

  public String getCustSubType(){
       return DataType.getAsString(this.get(S_CustSubType));
  
  }
  public String getCustSubTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CustSubType));
      }

  public void initOpState(String value){
     this.initProperty(S_OpState,value);
  }
  public  void setOpState(String value){
     this.set(S_OpState,value);
  }
  public  void setOpStateNull(){
     this.set(S_OpState,null);
  }

  public String getOpState(){
       return DataType.getAsString(this.get(S_OpState));
  
  }
  public String getOpStateInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OpState));
      }

  public void initCharacterDesc(String value){
     this.initProperty(S_CharacterDesc,value);
  }
  public  void setCharacterDesc(String value){
     this.set(S_CharacterDesc,value);
  }
  public  void setCharacterDescNull(){
     this.set(S_CharacterDesc,null);
  }

  public String getCharacterDesc(){
       return DataType.getAsString(this.get(S_CharacterDesc));
  
  }
  public String getCharacterDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CharacterDesc));
      }

  public void initCustStartDate(Timestamp value){
     this.initProperty(S_CustStartDate,value);
  }
  public  void setCustStartDate(Timestamp value){
     this.set(S_CustStartDate,value);
  }
  public  void setCustStartDateNull(){
     this.set(S_CustStartDate,null);
  }

  public Timestamp getCustStartDate(){
        return DataType.getAsDateTime(this.get(S_CustStartDate));
  
  }
  public Timestamp getCustStartDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_CustStartDate));
      }

  public void initIncomeLevel(long value){
     this.initProperty(S_IncomeLevel,new Long(value));
  }
  public  void setIncomeLevel(long value){
     this.set(S_IncomeLevel,new Long(value));
  }
  public  void setIncomeLevelNull(){
     this.set(S_IncomeLevel,null);
  }

  public long getIncomeLevel(){
        return DataType.getAsLong(this.get(S_IncomeLevel));
  
  }
  public long getIncomeLevelInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_IncomeLevel));
      }

  public void initIsVipDisplay(String value){
     this.initProperty(S_IsVipDisplay,value);
  }
  public  void setIsVipDisplay(String value){
     this.set(S_IsVipDisplay,value);
  }
  public  void setIsVipDisplayNull(){
     this.set(S_IsVipDisplay,null);
  }

  public String getIsVipDisplay(){
       return DataType.getAsString(this.get(S_IsVipDisplay));
  
  }
  public String getIsVipDisplayInitialValue(){
        return DataType.getAsString(this.getOldObj(S_IsVipDisplay));
      }

  public void initStateFlag(int value){
     this.initProperty(S_StateFlag,new Integer(value));
  }
  public  void setStateFlag(int value){
     this.set(S_StateFlag,new Integer(value));
  }
  public  void setStateFlagNull(){
     this.set(S_StateFlag,null);
  }

  public int getStateFlag(){
        return DataType.getAsInt(this.get(S_StateFlag));
  
  }
  public int getStateFlagInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_StateFlag));
      }

  public void initAgentType(String value){
     this.initProperty(S_AgentType,value);
  }
  public  void setAgentType(String value){
     this.set(S_AgentType,value);
  }
  public  void setAgentTypeNull(){
     this.set(S_AgentType,null);
  }

  public String getAgentType(){
       return DataType.getAsString(this.get(S_AgentType));
  
  }
  public String getAgentTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AgentType));
      }

  public void initImpGrade(String value){
     this.initProperty(S_ImpGrade,value);
  }
  public  void setImpGrade(String value){
     this.set(S_ImpGrade,value);
  }
  public  void setImpGradeNull(){
     this.set(S_ImpGrade,null);
  }

  public String getImpGrade(){
       return DataType.getAsString(this.get(S_ImpGrade));
  
  }
  public String getImpGradeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ImpGrade));
      }

  public void initFirstName(String value){
     this.initProperty(S_FirstName,value);
  }
  public  void setFirstName(String value){
     this.set(S_FirstName,value);
  }
  public  void setFirstNameNull(){
     this.set(S_FirstName,null);
  }

  public String getFirstName(){
       return DataType.getAsString(this.get(S_FirstName));
  
  }
  public String getFirstNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FirstName));
      }

  public void initCustPassword(String value){
     this.initProperty(S_CustPassword,value);
  }
  public  void setCustPassword(String value){
     this.set(S_CustPassword,value);
  }
  public  void setCustPasswordNull(){
     this.set(S_CustPassword,null);
  }

  public String getCustPassword(){
       return DataType.getAsString(this.get(S_CustPassword));
  
  }
  public String getCustPasswordInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CustPassword));
      }

  public void initChannelsType(String value){
     this.initProperty(S_ChannelsType,value);
  }
  public  void setChannelsType(String value){
     this.set(S_ChannelsType,value);
  }
  public  void setChannelsTypeNull(){
     this.set(S_ChannelsType,null);
  }

  public String getChannelsType(){
       return DataType.getAsString(this.get(S_ChannelsType));
  
  }
  public String getChannelsTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ChannelsType));
      }

  public void initCustLanguage(String value){
     this.initProperty(S_CustLanguage,value);
  }
  public  void setCustLanguage(String value){
     this.set(S_CustLanguage,value);
  }
  public  void setCustLanguageNull(){
     this.set(S_CustLanguage,null);
  }

  public String getCustLanguage(){
       return DataType.getAsString(this.get(S_CustLanguage));
  
  }
  public String getCustLanguageInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CustLanguage));
      }

  public void initCustCertExpire(Timestamp value){
     this.initProperty(S_CustCertExpire,value);
  }
  public  void setCustCertExpire(Timestamp value){
     this.set(S_CustCertExpire,value);
  }
  public  void setCustCertExpireNull(){
     this.set(S_CustCertExpire,null);
  }

  public Timestamp getCustCertExpire(){
        return DataType.getAsDateTime(this.get(S_CustCertExpire));
  
  }
  public Timestamp getCustCertExpireInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_CustCertExpire));
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

  public void initContAsign(String value){
     this.initProperty(S_ContAsign,value);
  }
  public  void setContAsign(String value){
     this.set(S_ContAsign,value);
  }
  public  void setContAsignNull(){
     this.set(S_ContAsign,null);
  }

  public String getContAsign(){
       return DataType.getAsString(this.get(S_ContAsign));
  
  }
  public String getContAsignInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContAsign));
      }

  public void initLunar(long value){
     this.initProperty(S_Lunar,new Long(value));
  }
  public  void setLunar(long value){
     this.set(S_Lunar,new Long(value));
  }
  public  void setLunarNull(){
     this.set(S_Lunar,null);
  }

  public long getLunar(){
        return DataType.getAsLong(this.get(S_Lunar));
  
  }
  public long getLunarInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Lunar));
      }

  public void initBusiContType(String value){
     this.initProperty(S_BusiContType,value);
  }
  public  void setBusiContType(String value){
     this.set(S_BusiContType,value);
  }
  public  void setBusiContTypeNull(){
     this.set(S_BusiContType,null);
  }

  public String getBusiContType(){
       return DataType.getAsString(this.get(S_BusiContType));
  
  }
  public String getBusiContTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BusiContType));
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

  public void initGenderDisplay(String value){
     this.initProperty(S_GenderDisplay,value);
  }
  public  void setGenderDisplay(String value){
     this.set(S_GenderDisplay,value);
  }
  public  void setGenderDisplayNull(){
     this.set(S_GenderDisplay,null);
  }

  public String getGenderDisplay(){
       return DataType.getAsString(this.get(S_GenderDisplay));
  
  }
  public String getGenderDisplayInitialValue(){
        return DataType.getAsString(this.getOldObj(S_GenderDisplay));
      }

  public void initReturnAsign(String value){
     this.initProperty(S_ReturnAsign,value);
  }
  public  void setReturnAsign(String value){
     this.set(S_ReturnAsign,value);
  }
  public  void setReturnAsignNull(){
     this.set(S_ReturnAsign,null);
  }

  public String getReturnAsign(){
       return DataType.getAsString(this.get(S_ReturnAsign));
  
  }
  public String getReturnAsignInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ReturnAsign));
      }

  public void initBusiType(String value){
     this.initProperty(S_BusiType,value);
  }
  public  void setBusiType(String value){
     this.set(S_BusiType,value);
  }
  public  void setBusiTypeNull(){
     this.set(S_BusiType,null);
  }

  public String getBusiType(){
       return DataType.getAsString(this.get(S_BusiType));
  
  }
  public String getBusiTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BusiType));
      }

  public void initServAttributeDesc(String value){
     this.initProperty(S_ServAttributeDesc,value);
  }
  public  void setServAttributeDesc(String value){
     this.set(S_ServAttributeDesc,value);
  }
  public  void setServAttributeDescNull(){
     this.set(S_ServAttributeDesc,null);
  }

  public String getServAttributeDesc(){
       return DataType.getAsString(this.get(S_ServAttributeDesc));
  
  }
  public String getServAttributeDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ServAttributeDesc));
      }

  public void initGroupFax(String value){
     this.initProperty(S_GroupFax,value);
  }
  public  void setGroupFax(String value){
     this.set(S_GroupFax,value);
  }
  public  void setGroupFaxNull(){
     this.set(S_GroupFax,null);
  }

  public String getGroupFax(){
       return DataType.getAsString(this.get(S_GroupFax));
  
  }
  public String getGroupFaxInitialValue(){
        return DataType.getAsString(this.getOldObj(S_GroupFax));
      }

  public void initStartDate(String value){
     this.initProperty(S_StartDate,value);
  }
  public  void setStartDate(String value){
     this.set(S_StartDate,value);
  }
  public  void setStartDateNull(){
     this.set(S_StartDate,null);
  }

  public String getStartDate(){
       return DataType.getAsString(this.get(S_StartDate));
  
  }
  public String getStartDateInitialValue(){
        return DataType.getAsString(this.getOldObj(S_StartDate));
      }

  public void initCustCertTypeDisplay(String value){
     this.initProperty(S_CustCertTypeDisplay,value);
  }
  public  void setCustCertTypeDisplay(String value){
     this.set(S_CustCertTypeDisplay,value);
  }
  public  void setCustCertTypeDisplayNull(){
     this.set(S_CustCertTypeDisplay,null);
  }

  public String getCustCertTypeDisplay(){
       return DataType.getAsString(this.get(S_CustCertTypeDisplay));
  
  }
  public String getCustCertTypeDisplayInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CustCertTypeDisplay));
      }

  public void initCustNameQry(String value){
     this.initProperty(S_CustNameQry,value);
  }
  public  void setCustNameQry(String value){
     this.set(S_CustNameQry,value);
  }
  public  void setCustNameQryNull(){
     this.set(S_CustNameQry,null);
  }

  public String getCustNameQry(){
       return DataType.getAsString(this.get(S_CustNameQry));
  
  }
  public String getCustNameQryInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CustNameQry));
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

  public void initCustEmail(String value){
     this.initProperty(S_CustEmail,value);
  }
  public  void setCustEmail(String value){
     this.set(S_CustEmail,value);
  }
  public  void setCustEmailNull(){
     this.set(S_CustEmail,null);
  }

  public String getCustEmail(){
       return DataType.getAsString(this.get(S_CustEmail));
  
  }
  public String getCustEmailInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CustEmail));
      }

  public void initIsPzCust(String value){
     this.initProperty(S_IsPzCust,value);
  }
  public  void setIsPzCust(String value){
     this.set(S_IsPzCust,value);
  }
  public  void setIsPzCustNull(){
     this.set(S_IsPzCust,null);
  }

  public String getIsPzCust(){
       return DataType.getAsString(this.get(S_IsPzCust));
  
  }
  public String getIsPzCustInitialValue(){
        return DataType.getAsString(this.getOldObj(S_IsPzCust));
      }

  public void initIsVip(long value){
     this.initProperty(S_IsVip,new Long(value));
  }
  public  void setIsVip(long value){
     this.set(S_IsVip,new Long(value));
  }
  public  void setIsVipNull(){
     this.set(S_IsVip,null);
  }

  public long getIsVip(){
        return DataType.getAsLong(this.get(S_IsVip));
  
  }
  public long getIsVipInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_IsVip));
      }

  public void initSignDate(Timestamp value){
     this.initProperty(S_SignDate,value);
  }
  public  void setSignDate(Timestamp value){
     this.set(S_SignDate,value);
  }
  public  void setSignDateNull(){
     this.set(S_SignDate,null);
  }

  public Timestamp getSignDate(){
        return DataType.getAsDateTime(this.get(S_SignDate));
  
  }
  public Timestamp getSignDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_SignDate));
      }

  public void initNationalType(long value){
     this.initProperty(S_NationalType,new Long(value));
  }
  public  void setNationalType(long value){
     this.set(S_NationalType,new Long(value));
  }
  public  void setNationalTypeNull(){
     this.set(S_NationalType,null);
  }

  public long getNationalType(){
        return DataType.getAsLong(this.get(S_NationalType));
  
  }
  public long getNationalTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_NationalType));
      }

  public void initFrameworkCode(String value){
     this.initProperty(S_FrameworkCode,value);
  }
  public  void setFrameworkCode(String value){
     this.set(S_FrameworkCode,value);
  }
  public  void setFrameworkCodeNull(){
     this.set(S_FrameworkCode,null);
  }

  public String getFrameworkCode(){
       return DataType.getAsString(this.get(S_FrameworkCode));
  
  }
  public String getFrameworkCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FrameworkCode));
      }

  public void initCustSign(String value){
     this.initProperty(S_CustSign,value);
  }
  public  void setCustSign(String value){
     this.set(S_CustSign,value);
  }
  public  void setCustSignNull(){
     this.set(S_CustSign,null);
  }

  public String getCustSign(){
       return DataType.getAsString(this.get(S_CustSign));
  
  }
  public String getCustSignInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CustSign));
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

  public void initScoreScreen(String value){
     this.initProperty(S_ScoreScreen,value);
  }
  public  void setScoreScreen(String value){
     this.set(S_ScoreScreen,value);
  }
  public  void setScoreScreenNull(){
     this.set(S_ScoreScreen,null);
  }

  public String getScoreScreen(){
       return DataType.getAsString(this.get(S_ScoreScreen));
  
  }
  public String getScoreScreenInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ScoreScreen));
      }

  public void initProject(String value){
     this.initProperty(S_Project,value);
  }
  public  void setProject(String value){
     this.set(S_Project,value);
  }
  public  void setProjectNull(){
     this.set(S_Project,null);
  }

  public String getProject(){
       return DataType.getAsString(this.get(S_Project));
  
  }
  public String getProjectInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Project));
      }

  public void initCustBond(long value){
     this.initProperty(S_CustBond,new Long(value));
  }
  public  void setCustBond(long value){
     this.set(S_CustBond,new Long(value));
  }
  public  void setCustBondNull(){
     this.set(S_CustBond,null);
  }

  public long getCustBond(){
        return DataType.getAsLong(this.get(S_CustBond));
  
  }
  public long getCustBondInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CustBond));
      }

  public void initLegalCustId(long value){
     this.initProperty(S_LegalCustId,new Long(value));
  }
  public  void setLegalCustId(long value){
     this.set(S_LegalCustId,new Long(value));
  }
  public  void setLegalCustIdNull(){
     this.set(S_LegalCustId,null);
  }

  public long getLegalCustId(){
        return DataType.getAsLong(this.get(S_LegalCustId));
  
  }
  public long getLegalCustIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_LegalCustId));
      }

  public void initNationality(String value){
     this.initProperty(S_Nationality,value);
  }
  public  void setNationality(String value){
     this.set(S_Nationality,value);
  }
  public  void setNationalityNull(){
     this.set(S_Nationality,null);
  }

  public String getNationality(){
       return DataType.getAsString(this.get(S_Nationality));
  
  }
  public String getNationalityInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Nationality));
      }

  public void initVillegeId(long value){
     this.initProperty(S_VillegeId,new Long(value));
  }
  public  void setVillegeId(long value){
     this.set(S_VillegeId,new Long(value));
  }
  public  void setVillegeIdNull(){
     this.set(S_VillegeId,null);
  }

  public long getVillegeId(){
        return DataType.getAsLong(this.get(S_VillegeId));
  
  }
  public long getVillegeIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_VillegeId));
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

  public void initIndivCustTypeDisplay(String value){
     this.initProperty(S_IndivCustTypeDisplay,value);
  }
  public  void setIndivCustTypeDisplay(String value){
     this.set(S_IndivCustTypeDisplay,value);
  }
  public  void setIndivCustTypeDisplayNull(){
     this.set(S_IndivCustTypeDisplay,null);
  }

  public String getIndivCustTypeDisplay(){
       return DataType.getAsString(this.get(S_IndivCustTypeDisplay));
  
  }
  public String getIndivCustTypeDisplayInitialValue(){
        return DataType.getAsString(this.getOldObj(S_IndivCustTypeDisplay));
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

  public void initMarryStatus(long value){
     this.initProperty(S_MarryStatus,new Long(value));
  }
  public  void setMarryStatus(long value){
     this.set(S_MarryStatus,new Long(value));
  }
  public  void setMarryStatusNull(){
     this.set(S_MarryStatus,null);
  }

  public long getMarryStatus(){
        return DataType.getAsLong(this.get(S_MarryStatus));
  
  }
  public long getMarryStatusInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_MarryStatus));
      }

  public void initBusiContState(String value){
     this.initProperty(S_BusiContState,value);
  }
  public  void setBusiContState(String value){
     this.set(S_BusiContState,value);
  }
  public  void setBusiContStateNull(){
     this.set(S_BusiContState,null);
  }

  public String getBusiContState(){
       return DataType.getAsString(this.get(S_BusiContState));
  
  }
  public String getBusiContStateInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BusiContState));
      }

  public void initAgentLevel(String value){
     this.initProperty(S_AgentLevel,value);
  }
  public  void setAgentLevel(String value){
     this.set(S_AgentLevel,value);
  }
  public  void setAgentLevelNull(){
     this.set(S_AgentLevel,null);
  }

  public String getAgentLevel(){
       return DataType.getAsString(this.get(S_AgentLevel));
  
  }
  public String getAgentLevelInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AgentLevel));
      }

  public void initCustServiceLevel(long value){
     this.initProperty(S_CustServiceLevel,new Long(value));
  }
  public  void setCustServiceLevel(long value){
     this.set(S_CustServiceLevel,new Long(value));
  }
  public  void setCustServiceLevelNull(){
     this.set(S_CustServiceLevel,null);
  }

  public long getCustServiceLevel(){
        return DataType.getAsLong(this.get(S_CustServiceLevel));
  
  }
  public long getCustServiceLevelInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CustServiceLevel));
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

  public void initRealNameFlag(long value){
     this.initProperty(S_RealNameFlag,new Long(value));
  }
  public  void setRealNameFlag(long value){
     this.set(S_RealNameFlag,new Long(value));
  }
  public  void setRealNameFlagNull(){
     this.set(S_RealNameFlag,null);
  }

  public long getRealNameFlag(){
        return DataType.getAsLong(this.get(S_RealNameFlag));
  
  }
  public long getRealNameFlagInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_RealNameFlag));
      }

  public void initCreditLevel(String value){
     this.initProperty(S_CreditLevel,value);
  }
  public  void setCreditLevel(String value){
     this.set(S_CreditLevel,value);
  }
  public  void setCreditLevelNull(){
     this.set(S_CreditLevel,null);
  }

  public String getCreditLevel(){
        return DataType.getAsString(this.get(S_CreditLevel));
  
  }
  public String getCreditLevelInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CreditLevel));
      }

  public void initCustStatus(long value){
     this.initProperty(S_CustStatus,new Long(value));
  }
  public  void setCustStatus(long value){
     this.set(S_CustStatus,new Long(value));
  }
  public  void setCustStatusNull(){
     this.set(S_CustStatus,null);
  }

  public long getCustStatus(){
        return DataType.getAsLong(this.get(S_CustStatus));
  
  }
  public long getCustStatusInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CustStatus));
      }

  public void initJobCompany(String value){
     this.initProperty(S_JobCompany,value);
  }
  public  void setJobCompany(String value){
     this.set(S_JobCompany,value);
  }
  public  void setJobCompanyNull(){
     this.set(S_JobCompany,null);
  }

  public String getJobCompany(){
       return DataType.getAsString(this.get(S_JobCompany));
  
  }
  public String getJobCompanyInitialValue(){
        return DataType.getAsString(this.getOldObj(S_JobCompany));
      }

  public void initMainPhone(String value){
     this.initProperty(S_MainPhone,value);
  }
  public  void setMainPhone(String value){
     this.set(S_MainPhone,value);
  }
  public  void setMainPhoneNull(){
     this.set(S_MainPhone,null);
  }

  public String getMainPhone(){
       return DataType.getAsString(this.get(S_MainPhone));
  
  }
  public String getMainPhoneInitialValue(){
        return DataType.getAsString(this.getOldObj(S_MainPhone));
      }

  public void initRealNameFlagDisplay(String value){
     this.initProperty(S_RealNameFlagDisplay,value);
  }
  public  void setRealNameFlagDisplay(String value){
     this.set(S_RealNameFlagDisplay,value);
  }
  public  void setRealNameFlagDisplayNull(){
     this.set(S_RealNameFlagDisplay,null);
  }

  public String getRealNameFlagDisplay(){
       return DataType.getAsString(this.get(S_RealNameFlagDisplay));
  
  }
  public String getRealNameFlagDisplayInitialValue(){
        return DataType.getAsString(this.getOldObj(S_RealNameFlagDisplay));
      }

  public void initParentCustId(long value){
     this.initProperty(S_ParentCustId,new Long(value));
  }
  public  void setParentCustId(long value){
     this.set(S_ParentCustId,new Long(value));
  }
  public  void setParentCustIdNull(){
     this.set(S_ParentCustId,null);
  }

  public long getParentCustId(){
        return DataType.getAsLong(this.get(S_ParentCustId));
  
  }
  public long getParentCustIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ParentCustId));
      }

  public void initProvinceId(String value){
     this.initProperty(S_ProvinceId,value);
  }
  public  void setProvinceId(String value){
     this.set(S_ProvinceId,value);
  }
  public  void setProvinceIdNull(){
     this.set(S_ProvinceId,null);
  }

  public String getProvinceId(){
       return DataType.getAsString(this.get(S_ProvinceId));
  
  }
  public String getProvinceIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ProvinceId));
      }

  public void initCustAttributeId(String value){
     this.initProperty(S_CustAttributeId,value);
  }
  public  void setCustAttributeId(String value){
     this.set(S_CustAttributeId,value);
  }
  public  void setCustAttributeIdNull(){
     this.set(S_CustAttributeId,null);
  }

  public String getCustAttributeId(){
       return DataType.getAsString(this.get(S_CustAttributeId));
  
  }
  public String getCustAttributeIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CustAttributeId));
      }

  public void initHqVestCode(String value){
     this.initProperty(S_HqVestCode,value);
  }
  public  void setHqVestCode(String value){
     this.set(S_HqVestCode,value);
  }
  public  void setHqVestCodeNull(){
     this.set(S_HqVestCode,null);
  }

  public String getHqVestCode(){
       return DataType.getAsString(this.get(S_HqVestCode));
  
  }
  public String getHqVestCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_HqVestCode));
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

  public void initJobPosition(String value){
     this.initProperty(S_JobPosition,value);
  }
  public  void setJobPosition(String value){
     this.set(S_JobPosition,value);
  }
  public  void setJobPositionNull(){
     this.set(S_JobPosition,null);
  }

  public String getJobPosition(){
       return DataType.getAsString(this.get(S_JobPosition));
  
  }
  public String getJobPositionInitialValue(){
        return DataType.getAsString(this.getOldObj(S_JobPosition));
      }

  public void initLunarDisplay(String value){
     this.initProperty(S_LunarDisplay,value);
  }
  public  void setLunarDisplay(String value){
     this.set(S_LunarDisplay,value);
  }
  public  void setLunarDisplayNull(){
     this.set(S_LunarDisplay,null);
  }

  public String getLunarDisplay(){
       return DataType.getAsString(this.get(S_LunarDisplay));
  
  }
  public String getLunarDisplayInitialValue(){
        return DataType.getAsString(this.getOldObj(S_LunarDisplay));
      }

  public void initMsgSettleWay(String value){
     this.initProperty(S_MsgSettleWay,value);
  }
  public  void setMsgSettleWay(String value){
     this.set(S_MsgSettleWay,value);
  }
  public  void setMsgSettleWayNull(){
     this.set(S_MsgSettleWay,null);
  }

  public String getMsgSettleWay(){
       return DataType.getAsString(this.get(S_MsgSettleWay));
  
  }
  public String getMsgSettleWayInitialValue(){
        return DataType.getAsString(this.getOldObj(S_MsgSettleWay));
      }

  public void initSubVocation(long value){
     this.initProperty(S_SubVocation,new Long(value));
  }
  public  void setSubVocation(long value){
     this.set(S_SubVocation,new Long(value));
  }
  public  void setSubVocationNull(){
     this.set(S_SubVocation,null);
  }

  public long getSubVocation(){
        return DataType.getAsLong(this.get(S_SubVocation));
  
  }
  public long getSubVocationInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_SubVocation));
      }

  public void initMiddleName(String value){
     this.initProperty(S_MiddleName,value);
  }
  public  void setMiddleName(String value){
     this.set(S_MiddleName,value);
  }
  public  void setMiddleNameNull(){
     this.set(S_MiddleName,null);
  }

  public String getMiddleName(){
       return DataType.getAsString(this.get(S_MiddleName));
  
  }
  public String getMiddleNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_MiddleName));
      }

  public void initValueLevel(String value){
     this.initProperty(S_ValueLevel,value);
  }
  public  void setValueLevel(String value){
     this.set(S_ValueLevel,value);
  }
  public  void setValueLevelNull(){
     this.set(S_ValueLevel,null);
  }

  public String getValueLevel(){
       return DataType.getAsString(this.get(S_ValueLevel));
  
  }
  public String getValueLevelInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ValueLevel));
      }

  public void initIndivCustType(String value){
     this.initProperty(S_IndivCustType,value);
  }
  public  void setIndivCustType(String value){
     this.set(S_IndivCustType,value);
  }
  public  void setIndivCustTypeNull(){
     this.set(S_IndivCustType,null);
  }

  public String getIndivCustType(){
       return DataType.getAsString(this.get(S_IndivCustType));
  
  }
  public String getIndivCustTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_IndivCustType));
      }

  public void initHobby(String value){
     this.initProperty(S_Hobby,value);
  }
  public  void setHobby(String value){
     this.set(S_Hobby,value);
  }
  public  void setHobbyNull(){
     this.set(S_Hobby,null);
  }

  public String getHobby(){
       return DataType.getAsString(this.get(S_Hobby));
  
  }
  public String getHobbyInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Hobby));
      }

  public void initEducationLevel(long value){
     this.initProperty(S_EducationLevel,new Long(value));
  }
  public  void setEducationLevel(long value){
     this.set(S_EducationLevel,new Long(value));
  }
  public  void setEducationLevelNull(){
     this.set(S_EducationLevel,null);
  }

  public long getEducationLevel(){
        return DataType.getAsLong(this.get(S_EducationLevel));
  
  }
  public long getEducationLevelInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_EducationLevel));
      }

  public void initServiceNum(String value){
     this.initProperty(S_ServiceNum,value);
  }
  public  void setServiceNum(String value){
     this.set(S_ServiceNum,value);
  }
  public  void setServiceNumNull(){
     this.set(S_ServiceNum,null);
  }

  public String getServiceNum(){
       return DataType.getAsString(this.get(S_ServiceNum));
  
  }
  public String getServiceNumInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ServiceNum));
      }

  public void initLocalVocation(String value){
     this.initProperty(S_LocalVocation,value);
  }
  public  void setLocalVocation(String value){
     this.set(S_LocalVocation,value);
  }
  public  void setLocalVocationNull(){
     this.set(S_LocalVocation,null);
  }

  public String getLocalVocation(){
       return DataType.getAsString(this.get(S_LocalVocation));
  
  }
  public String getLocalVocationInitialValue(){
        return DataType.getAsString(this.getOldObj(S_LocalVocation));
      }

  public void initSubRegionType(String value){
     this.initProperty(S_SubRegionType,value);
  }
  public  void setSubRegionType(String value){
     this.set(S_SubRegionType,value);
  }
  public  void setSubRegionTypeNull(){
     this.set(S_SubRegionType,null);
  }

  public String getSubRegionType(){
       return DataType.getAsString(this.get(S_SubRegionType));
  
  }
  public String getSubRegionTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SubRegionType));
      }

  public void initOneBusiContScale(String value){
     this.initProperty(S_OneBusiContScale,value);
  }
  public  void setOneBusiContScale(String value){
     this.set(S_OneBusiContScale,value);
  }
  public  void setOneBusiContScaleNull(){
     this.set(S_OneBusiContScale,null);
  }

  public String getOneBusiContScale(){
       return DataType.getAsString(this.get(S_OneBusiContScale));
  
  }
  public String getOneBusiContScaleInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OneBusiContScale));
      }

  public void initCustCertType(long value){
     this.initProperty(S_CustCertType,new Long(value));
  }
  public  void setCustCertType(long value){
     this.set(S_CustCertType,new Long(value));
  }
  public  void setCustCertTypeNull(){
     this.set(S_CustCertType,null);
  }

  public long getCustCertType(){
        return DataType.getAsLong(this.get(S_CustCertType));
  
  }
  public long getCustCertTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CustCertType));
      }

  public void initVocation(long value){
     this.initProperty(S_Vocation,new Long(value));
  }
  public  void setVocation(long value){
     this.set(S_Vocation,new Long(value));
  }
  public  void setVocationNull(){
     this.set(S_Vocation,null);
  }

  public long getVocation(){
        return DataType.getAsLong(this.get(S_Vocation));
  
  }
  public long getVocationInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Vocation));
      }

  public void initCustCertCode(String value){
     this.initProperty(S_CustCertCode,value);
  }
  public  void setCustCertCode(String value){
     this.set(S_CustCertCode,value);
  }
  public  void setCustCertCodeNull(){
     this.set(S_CustCertCode,null);
  }

  public String getCustCertCode(){
       return DataType.getAsString(this.get(S_CustCertCode));
  
  }
  public String getCustCertCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CustCertCode));
      }

  public void initTownId(long value){
     this.initProperty(S_TownId,new Long(value));
  }
  public  void setTownId(long value){
     this.set(S_TownId,new Long(value));
  }
  public  void setTownIdNull(){
     this.set(S_TownId,null);
  }

  public long getTownId(){
        return DataType.getAsLong(this.get(S_TownId));
  
  }
  public long getTownIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_TownId));
      }

  public void initLogoutDate(Timestamp value){
     this.initProperty(S_LogoutDate,value);
  }
  public  void setLogoutDate(Timestamp value){
     this.set(S_LogoutDate,value);
  }
  public  void setLogoutDateNull(){
     this.set(S_LogoutDate,null);
  }

  public Timestamp getLogoutDate(){
        return DataType.getAsDateTime(this.get(S_LogoutDate));
  
  }
  public Timestamp getLogoutDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_LogoutDate));
      }

  public void initEcBusiContCode(String value){
     this.initProperty(S_EcBusiContCode,value);
  }
  public  void setEcBusiContCode(String value){
     this.set(S_EcBusiContCode,value);
  }
  public  void setEcBusiContCodeNull(){
     this.set(S_EcBusiContCode,null);
  }

  public String getEcBusiContCode(){
       return DataType.getAsString(this.get(S_EcBusiContCode));
  
  }
  public String getEcBusiContCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_EcBusiContCode));
      }

  public void initSignNum(long value){
     this.initProperty(S_SignNum,new Long(value));
  }
  public  void setSignNum(long value){
     this.set(S_SignNum,new Long(value));
  }
  public  void setSignNumNull(){
     this.set(S_SignNum,null);
  }

  public long getSignNum(){
        return DataType.getAsLong(this.get(S_SignNum));
  
  }
  public long getSignNumInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_SignNum));
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

  public void initOccupation(long value){
     this.initProperty(S_Occupation,new Long(value));
  }
  public  void setOccupation(long value){
     this.set(S_Occupation,new Long(value));
  }
  public  void setOccupationNull(){
     this.set(S_Occupation,null);
  }

  public long getOccupation(){
        return DataType.getAsLong(this.get(S_Occupation));
  
  }
  public long getOccupationInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Occupation));
      }

  public void initHqNumber(String value){
     this.initProperty(S_HqNumber,value);
  }
  public  void setHqNumber(String value){
     this.set(S_HqNumber,value);
  }
  public  void setHqNumberNull(){
     this.set(S_HqNumber,null);
  }

  public String getHqNumber(){
       return DataType.getAsString(this.get(S_HqNumber));
  
  }
  public String getHqNumberInitialValue(){
        return DataType.getAsString(this.getOldObj(S_HqNumber));
      }

  public void initRegionType(long value){
     this.initProperty(S_RegionType,new Long(value));
  }
  public  void setRegionType(long value){
     this.set(S_RegionType,new Long(value));
  }
  public  void setRegionTypeNull(){
     this.set(S_RegionType,null);
  }

  public long getRegionType(){
        return DataType.getAsLong(this.get(S_RegionType));
  
  }
  public long getRegionTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_RegionType));
      }

  public void initOperationType(String value){
     this.initProperty(S_OperationType,value);
  }
  public  void setOperationType(String value){
     this.set(S_OperationType,value);
  }
  public  void setOperationTypeNull(){
     this.set(S_OperationType,null);
  }

  public String getOperationType(){
       return DataType.getAsString(this.get(S_OperationType));
  
  }
  public String getOperationTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OperationType));
      }

  public void initCustType(int value){
     this.initProperty(S_CustType,new Integer(value));
  }
  public  void setCustType(int value){
     this.set(S_CustType,new Integer(value));
  }
  public  void setCustTypeNull(){
     this.set(S_CustType,null);
  }

  public int getCustType(){
        return DataType.getAsInt(this.get(S_CustType));
  
  }
  public int getCustTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CustType));
      }

  public void initLastName(String value){
     this.initProperty(S_LastName,value);
  }
  public  void setLastName(String value){
     this.set(S_LastName,value);
  }
  public  void setLastNameNull(){
     this.set(S_LastName,null);
  }

  public String getLastName(){
       return DataType.getAsString(this.get(S_LastName));
  
  }
  public String getLastNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_LastName));
      }

  public void initCustName(String value){
     this.initProperty(S_CustName,value);
  }
  public  void setCustName(String value){
     this.set(S_CustName,value);
  }
  public  void setCustNameNull(){
     this.set(S_CustName,null);
  }

  public String getCustName(){
       return DataType.getAsString(this.get(S_CustName));
  
  }
  public String getCustNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CustName));
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

  public void initStaffAmount(long value){
     this.initProperty(S_StaffAmount,new Long(value));
  }
  public  void setStaffAmount(long value){
     this.set(S_StaffAmount,new Long(value));
  }
  public  void setStaffAmountNull(){
     this.set(S_StaffAmount,null);
  }

  public long getStaffAmount(){
        return DataType.getAsLong(this.get(S_StaffAmount));
  
  }
  public long getStaffAmountInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_StaffAmount));
      }

  public void initCustCertEffdate(Timestamp value){
     this.initProperty(S_CustCertEffdate,value);
  }
  public  void setCustCertEffdate(Timestamp value){
     this.set(S_CustCertEffdate,value);
  }
  public  void setCustCertEffdateNull(){
     this.set(S_CustCertEffdate,null);
  }

  public Timestamp getCustCertEffdate(){
        return DataType.getAsDateTime(this.get(S_CustCertEffdate));
  
  }
  public Timestamp getCustCertEffdateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_CustCertEffdate));
      }

  public void initCustServiceLevelDisplay(String value){
     this.initProperty(S_CustServiceLevelDisplay,value);
  }
  public  void setCustServiceLevelDisplay(String value){
     this.set(S_CustServiceLevelDisplay,value);
  }
  public  void setCustServiceLevelDisplayNull(){
     this.set(S_CustServiceLevelDisplay,null);
  }

  public String getCustServiceLevelDisplay(){
       return DataType.getAsString(this.get(S_CustServiceLevelDisplay));
  
  }
  public String getCustServiceLevelDisplayInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CustServiceLevelDisplay));
      }

  public void initTwoBusiCode(String value){
     this.initProperty(S_TwoBusiCode,value);
  }
  public  void setTwoBusiCode(String value){
     this.set(S_TwoBusiCode,value);
  }
  public  void setTwoBusiCodeNull(){
     this.set(S_TwoBusiCode,null);
  }

  public String getTwoBusiCode(){
       return DataType.getAsString(this.get(S_TwoBusiCode));
  
  }
  public String getTwoBusiCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_TwoBusiCode));
      }

  public void initValueScore(String value){
     this.initProperty(S_ValueScore,value);
  }
  public  void setValueScore(String value){
     this.set(S_ValueScore,value);
  }
  public  void setValueScoreNull(){
     this.set(S_ValueScore,null);
  }

  public String getValueScore(){
       return DataType.getAsString(this.get(S_ValueScore));
  
  }
  public String getValueScoreInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ValueScore));
      }

  public void initInPhaseShow(String value){
     this.initProperty(S_InPhaseShow,value);
  }
  public  void setInPhaseShow(String value){
     this.set(S_InPhaseShow,value);
  }
  public  void setInPhaseShowNull(){
     this.set(S_InPhaseShow,null);
  }

  public String getInPhaseShow(){
       return DataType.getAsString(this.get(S_InPhaseShow));
  
  }
  public String getInPhaseShowInitialValue(){
        return DataType.getAsString(this.getOldObj(S_InPhaseShow));
      }

  public void initPoliticsFace(long value){
     this.initProperty(S_PoliticsFace,new Long(value));
  }
  public  void setPoliticsFace(long value){
     this.set(S_PoliticsFace,new Long(value));
  }
  public  void setPoliticsFaceNull(){
     this.set(S_PoliticsFace,null);
  }

  public long getPoliticsFace(){
        return DataType.getAsLong(this.get(S_PoliticsFace));
  
  }
  public long getPoliticsFaceInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_PoliticsFace));
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

  public void initRegAmount(long value){
     this.initProperty(S_RegAmount,new Long(value));
  }
  public  void setRegAmount(long value){
     this.set(S_RegAmount,new Long(value));
  }
  public  void setRegAmountNull(){
     this.set(S_RegAmount,null);
  }

  public long getRegAmount(){
        return DataType.getAsLong(this.get(S_RegAmount));
  
  }
  public long getRegAmountInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_RegAmount));
      }

  public void initCreditValue(long value){
     this.initProperty(S_CreditValue,new Long(value));
  }
  public  void setCreditValue(long value){
     this.set(S_CreditValue,new Long(value));
  }
  public  void setCreditValueNull(){
     this.set(S_CreditValue,null);
  }

  public long getCreditValue(){
        return DataType.getAsLong(this.get(S_CreditValue));
  
  }
  public long getCreditValueInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CreditValue));
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

  public void initGroupType(long value){
     this.initProperty(S_GroupType,new Long(value));
  }
  public  void setGroupType(long value){
     this.set(S_GroupType,new Long(value));
  }
  public  void setGroupTypeNull(){
     this.set(S_GroupType,null);
  }

  public long getGroupType(){
        return DataType.getAsLong(this.get(S_GroupType));
  
  }
  public long getGroupTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_GroupType));
      }

  public void initCustStatusDisplay(String value){
     this.initProperty(S_CustStatusDisplay,value);
  }
  public  void setCustStatusDisplay(String value){
     this.set(S_CustStatusDisplay,value);
  }
  public  void setCustStatusDisplayNull(){
     this.set(S_CustStatusDisplay,null);
  }

  public String getCustStatusDisplay(){
       return DataType.getAsString(this.get(S_CustStatusDisplay));
  
  }
  public String getCustStatusDisplayInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CustStatusDisplay));
      }

  public void initEconomyTypeNext(String value){
     this.initProperty(S_EconomyTypeNext,value);
  }
  public  void setEconomyTypeNext(String value){
     this.set(S_EconomyTypeNext,value);
  }
  public  void setEconomyTypeNextNull(){
     this.set(S_EconomyTypeNext,null);
  }

  public String getEconomyTypeNext(){
       return DataType.getAsString(this.get(S_EconomyTypeNext));
  
  }
  public String getEconomyTypeNextInitialValue(){
        return DataType.getAsString(this.getOldObj(S_EconomyTypeNext));
      }

  public void initCreditLevelDisplay(String value){
     this.initProperty(S_CreditLevelDisplay,value);
  }
  public  void setCreditLevelDisplay(String value){
     this.set(S_CreditLevelDisplay,value);
  }
  public  void setCreditLevelDisplayNull(){
     this.set(S_CreditLevelDisplay,null);
  }

  public String getCreditLevelDisplay(){
       return DataType.getAsString(this.get(S_CreditLevelDisplay));
  
  }
  public String getCreditLevelDisplayInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CreditLevelDisplay));
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

  public void initCustTypeDtl(int value){
     this.initProperty(S_CustTypeDtl,new Integer(value));
  }
  public  void setCustTypeDtl(int value){
     this.set(S_CustTypeDtl,new Integer(value));
  }
  public  void setCustTypeDtlNull(){
     this.set(S_CustTypeDtl,null);
  }

  public int getCustTypeDtl(){
        return DataType.getAsInt(this.get(S_CustTypeDtl));
  
  }
  public int getCustTypeDtlInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CustTypeDtl));
      }

  public void initLegalPerson(String value){
     this.initProperty(S_LegalPerson,value);
  }
  public  void setLegalPerson(String value){
     this.set(S_LegalPerson,value);
  }
  public  void setLegalPersonNull(){
     this.set(S_LegalPerson,null);
  }

  public String getLegalPerson(){
       return DataType.getAsString(this.get(S_LegalPerson));
  
  }
  public String getLegalPersonInitialValue(){
        return DataType.getAsString(this.getOldObj(S_LegalPerson));
      }

  public void initBirthday(Timestamp value){
     this.initProperty(S_Birthday,value);
  }
  public  void setBirthday(Timestamp value){
     this.set(S_Birthday,value);
  }
  public  void setBirthdayNull(){
     this.set(S_Birthday,null);
  }

  public Timestamp getBirthday(){
        return DataType.getAsDateTime(this.get(S_Birthday));
  
  }
  public Timestamp getBirthdayInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_Birthday));
      }

  public void initLegalCustName(String value){
     this.initProperty(S_LegalCustName,value);
  }
  public  void setLegalCustName(String value){
     this.set(S_LegalCustName,value);
  }
  public  void setLegalCustNameNull(){
     this.set(S_LegalCustName,null);
  }

  public String getLegalCustName(){
       return DataType.getAsString(this.get(S_LegalCustName));
  
  }
  public String getLegalCustNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_LegalCustName));
      }

  public void initCustServiceId(String value){
     this.initProperty(S_CustServiceId,value);
  }
  public  void setCustServiceId(String value){
     this.set(S_CustServiceId,value);
  }
  public  void setCustServiceIdNull(){
     this.set(S_CustServiceId,null);
  }

  public String getCustServiceId(){
       return DataType.getAsString(this.get(S_CustServiceId));
  
  }
  public String getCustServiceIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CustServiceId));
      }

  public void initLastNameQry(String value){
     this.initProperty(S_LastNameQry,value);
  }
  public  void setLastNameQry(String value){
     this.set(S_LastNameQry,value);
  }
  public  void setLastNameQryNull(){
     this.set(S_LastNameQry,null);
  }

  public String getLastNameQry(){
       return DataType.getAsString(this.get(S_LastNameQry));
  
  }
  public String getLastNameQryInitialValue(){
        return DataType.getAsString(this.getOldObj(S_LastNameQry));
      }

  public void initOneBusiCode(String value){
     this.initProperty(S_OneBusiCode,value);
  }
  public  void setOneBusiCode(String value){
     this.set(S_OneBusiCode,value);
  }
  public  void setOneBusiCodeNull(){
     this.set(S_OneBusiCode,null);
  }

  public String getOneBusiCode(){
       return DataType.getAsString(this.get(S_OneBusiCode));
  
  }
  public String getOneBusiCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OneBusiCode));
      }

  public void initFamilyInfo(String value){
     this.initProperty(S_FamilyInfo,value);
  }
  public  void setFamilyInfo(String value){
     this.set(S_FamilyInfo,value);
  }
  public  void setFamilyInfoNull(){
     this.set(S_FamilyInfo,null);
  }

  public String getFamilyInfo(){
       return DataType.getAsString(this.get(S_FamilyInfo));
  
  }
  public String getFamilyInfoInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FamilyInfo));
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

  public void initEconomyType(String value){
     this.initProperty(S_EconomyType,value);
  }
  public  void setEconomyType(String value){
     this.set(S_EconomyType,value);
  }
  public  void setEconomyTypeNull(){
     this.set(S_EconomyType,null);
  }

  public String getEconomyType(){
       return DataType.getAsString(this.get(S_EconomyType));
  
  }
  public String getEconomyTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_EconomyType));
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

  public void initGender(long value){
     this.initProperty(S_Gender,new Long(value));
  }
  public  void setGender(long value){
     this.set(S_Gender,new Long(value));
  }
  public  void setGenderNull(){
     this.set(S_Gender,null);
  }

  public long getGender(){
        return DataType.getAsLong(this.get(S_Gender));
  
  }
  public long getGenderInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Gender));
      }

  public void initReligion(String value){
     this.initProperty(S_Religion,value);
  }
  public  void setReligion(String value){
     this.set(S_Religion,value);
  }
  public  void setReligionNull(){
     this.set(S_Religion,null);
  }

  public String getReligion(){
       return DataType.getAsString(this.get(S_Religion));
  
  }
  public String getReligionInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Religion));
      }

  public void initFirstNameQry(String value){
     this.initProperty(S_FirstNameQry,value);
  }
  public  void setFirstNameQry(String value){
     this.set(S_FirstNameQry,value);
  }
  public  void setFirstNameQryNull(){
     this.set(S_FirstNameQry,null);
  }

  public String getFirstNameQry(){
       return DataType.getAsString(this.get(S_FirstNameQry));
  
  }
  public String getFirstNameQryInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FirstNameQry));
      }

  public void initMiddleNameQry(String value){
     this.initProperty(S_MiddleNameQry,value);
  }
  public  void setMiddleNameQry(String value){
     this.set(S_MiddleNameQry,value);
  }
  public  void setMiddleNameQryNull(){
     this.set(S_MiddleNameQry,null);
  }

  public String getMiddleNameQry(){
       return DataType.getAsString(this.get(S_MiddleNameQry));
  
  }
  public String getMiddleNameQryInitialValue(){
        return DataType.getAsString(this.getOldObj(S_MiddleNameQry));
      }

  public void initCustCertAddress(String value){
     this.initProperty(S_CustCertAddress,value);
  }
  public  void setCustCertAddress(String value){
     this.set(S_CustCertAddress,value);
  }
  public  void setCustCertAddressNull(){
     this.set(S_CustCertAddress,null);
  }

  public String getCustCertAddress(){
       return DataType.getAsString(this.get(S_CustCertAddress));
  
  }
  public String getCustCertAddressInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CustCertAddress));
      }

  public void initGroupWeb(String value){
     this.initProperty(S_GroupWeb,value);
  }
  public  void setGroupWeb(String value){
     this.set(S_GroupWeb,value);
  }
  public  void setGroupWebNull(){
     this.set(S_GroupWeb,null);
  }

  public String getGroupWeb(){
       return DataType.getAsString(this.get(S_GroupWeb));
  
  }
  public String getGroupWebInitialValue(){
        return DataType.getAsString(this.getOldObj(S_GroupWeb));
      }


 
 }

