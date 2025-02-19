package com.asiainfo.crm.cm.inner.customer.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.inner.customer.ivalues.*;

public class QBOCmIndivCustomerBean extends DataContainer implements DataContainerInterface,IQBOCmIndivCustomerValue{

  private static String  m_boName = "com.asiainfo.crm.cm.inner.customer.bo.QBOCmIndivCustomer";



  public final static  String S_PostAddress = "POST_ADDRESS";
  public final static  String S_CityId = "CITY_ID";
  public final static  String S_CharacterDesc = "CHARACTER_DESC";
  public final static  String S_Pnr = "PNR";
  public final static  String S_ContDesc = "CONT_DESC";
  public final static  String S_IncomeLevel = "INCOME_LEVEL";
  public final static  String S_ManualCommercialProtection = "MANUAL_COMMERCIAL_PROTECTION";
  public final static  String S_IsRevisable = "IS_REVISABLE";
  public final static  String S_FirstName = "FIRST_NAME";
  public final static  String S_CustPassword = "CUST_PASSWORD";
  public final static  String S_CustLanguage = "CUST_LANGUAGE";
  public final static  String S_CustCertExpire = "CUST_CERT_EXPIRE";
  public final static  String S_CustZipcode = "CUST_ZIPCODE";
  public final static  String S_EnglishName = "ENGLISH_NAME";
  public final static  String S_Lunar = "LUNAR";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_CoName = "CO_NAME";
  public final static  String S_PersonStatus = "PERSON_STATUS";
  public final static  String S_CurResidenceStrDate = "CUR_RESIDENCE_STR_DATE";
  public final static  String S_StatusEffDate = "STATUS_EFF_DATE";
  public final static  String S_OfficeTel = "OFFICE_TEL";
  public final static  String S_CustNameQry = "CUST_NAME_QRY";
  public final static  String S_Ext9 = "EXT9";
  public final static  String S_PostCode = "POST_CODE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_Ext5 = "EXT5";
  public final static  String S_Ext6 = "EXT6";
  public final static  String S_Ext7 = "EXT7";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_Ext8 = "EXT8";
  public final static  String S_Ext1 = "EXT1";
  public final static  String S_Ext2 = "EXT2";
  public final static  String S_Ext3 = "EXT3";
  public final static  String S_IsVip = "IS_VIP";
  public final static  String S_Ext4 = "EXT4";
  public final static  String S_NationalType = "NATIONAL_TYPE";
  public final static  String S_Ext20 = "EXT20";
  public final static  String S_Ext30 = "EXT30";
  public final static  String S_PartyId = "PARTY_ID";
  public final static  String S_ManualProtectEffectiveDate = "MANUAL_PROTECT_EFFECTIVE_DATE";
  public final static  String S_Nationality = "NATIONALITY";
  public final static  String S_CustAddress = "CUST_ADDRESS";
  public final static  String S_Attorneys = "ATTORNEYS";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_MarryStatus = "MARRY_STATUS";
  public final static  String S_Ext19 = "EXT19";
  public final static  String S_Ext29 = "EXT29";
  public final static  String S_Ext18 = "EXT18";
  public final static  String S_Ext17 = "EXT17";
  public final static  String S_Ext27 = "EXT27";
  public final static  String S_Ext16 = "EXT16";
  public final static  String S_Ext28 = "EXT28";
  public final static  String S_CustServiceLevel = "CUST_SERVICE_LEVEL";
  public final static  String S_Ext15 = "EXT15";
  public final static  String S_Ext25 = "EXT25";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_Ext14 = "EXT14";
  public final static  String S_Ext26 = "EXT26";
  public final static  String S_Ext13 = "EXT13";
  public final static  String S_Ext23 = "EXT23";
  public final static  String S_Ext12 = "EXT12";
  public final static  String S_Ext24 = "EXT24";
  public final static  String S_Ext11 = "EXT11";
  public final static  String S_Ext21 = "EXT21";
  public final static  String S_RealNameFlag = "REAL_NAME_FLAG";
  public final static  String S_Ext10 = "EXT10";
  public final static  String S_CreditLevel = "CREDIT_LEVEL";
  public final static  String S_Ext22 = "EXT22";
  public final static  String S_ProtectEffDate = "PROTECT_EFF_DATE";
  public final static  String S_CustStatus = "CUST_STATUS";
  public final static  String S_MotherName = "MOTHER_NAME";
  public final static  String S_JobCompany = "JOB_COMPANY";
  public final static  String S_ProvinceId = "PROVINCE_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_JobPosition = "JOB_POSITION";
  public final static  String S_MiddleName = "MIDDLE_NAME";
  public final static  String S_IndivCustType = "INDIV_CUST_TYPE";
  public final static  String S_Hobby = "HOBBY";
  public final static  String S_EducationLevel = "EDUCATION_LEVEL";
  public final static  String S_ContId = "CONT_ID";
  public final static  String S_ProtectExpireDate = "PROTECT_EXPIRE_DATE";
  public final static  String S_CustCertType = "CUST_CERT_TYPE";
  public final static  String S_CustCertCode = "CUST_CERT_CODE";
  public final static  String S_PrioryLevel = "PRIORY_LEVEL";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_ContactProtection = "CONTACT_PROTECTION";
  public final static  String S_Occupation = "OCCUPATION";
  public final static  String S_ContEmail = "CONT_EMAIL";
  public final static  String S_PhysiologicalState = "PHYSIOLOGICAL_STATE";
  public final static  String S_LastName = "LAST_NAME";
  public final static  String S_CustName = "CUST_NAME";
  public final static  String S_CustCertEffdate = "CUST_CERT_EFFDATE";
  public final static  String S_DirectMarketingProtection = "DIRECT_MARKETING_PROTECTION";
  public final static  String S_BadPayerFlag = "BAD_PAYER_FLAG";
  public final static  String S_ManualProtectExpireDate = "MANUAL_PROTECT_EXPIRE_DATE";
  public final static  String S_PoliticsFace = "POLITICS_FACE";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_ContName = "CONT_NAME";
  public final static  String S_CreditValue = "CREDIT_VALUE";
  public final static  String S_ShortName = "SHORT_NAME";
  public final static  String S_HomeTel = "HOME_TEL";
  public final static  String S_ContMobile = "CONT_MOBILE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_ContNameQry = "CONT_NAME_QRY";
  public final static  String S_AnonymousFlag = "ANONYMOUS_FLAG";
  public final static  String S_Birthday = "BIRTHDAY";
  public final static  String S_ContAddress = "CONT_ADDRESS";
  public final static  String S_CustServiceId = "CUST_SERVICE_ID";
  public final static  String S_LastNameQry = "LAST_NAME_QRY";
  public final static  String S_FamilyInfo = "FAMILY_INFO";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_FormerName = "FORMER_NAME";
  public final static  String S_CountyId = "COUNTY_ID";
  public final static  String S_Gender = "GENDER";
  public final static  String S_Religion = "RELIGION";
  public final static  String S_FirstNameQry = "FIRST_NAME_QRY";
  public final static  String S_MiddleNameQry = "MIDDLE_NAME_QRY";
  public final static  String S_BirthPlace = "BIRTH_PLACE";
  public final static  String S_CustCertAddress = "CUST_CERT_ADDRESS";
  public final static  String S_ContFax = "CONT_FAX";
  public final static  String S_GuardianName = "GUARDIAN_NAME";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public QBOCmIndivCustomerBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initPostAddress(String value){
     this.initProperty(S_PostAddress,value);
  }
  public  void setPostAddress(String value){
     this.set(S_PostAddress,value);
  }
  public  void setPostAddressNull(){
     this.set(S_PostAddress,null);
  }

  public String getPostAddress(){
       return DataType.getAsString(this.get(S_PostAddress));
  
  }
  public String getPostAddressInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PostAddress));
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

  public void initPnr(long value){
     this.initProperty(S_Pnr,new Long(value));
  }
  public  void setPnr(long value){
     this.set(S_Pnr,new Long(value));
  }
  public  void setPnrNull(){
     this.set(S_Pnr,null);
  }

  public long getPnr(){
        return DataType.getAsLong(this.get(S_Pnr));
  
  }
  public long getPnrInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Pnr));
      }

  public void initContDesc(String value){
     this.initProperty(S_ContDesc,value);
  }
  public  void setContDesc(String value){
     this.set(S_ContDesc,value);
  }
  public  void setContDescNull(){
     this.set(S_ContDesc,null);
  }

  public String getContDesc(){
       return DataType.getAsString(this.get(S_ContDesc));
  
  }
  public String getContDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContDesc));
      }

  public void initIncomeLevel(int value){
     this.initProperty(S_IncomeLevel,new Integer(value));
  }
  public  void setIncomeLevel(int value){
     this.set(S_IncomeLevel,new Integer(value));
  }
  public  void setIncomeLevelNull(){
     this.set(S_IncomeLevel,null);
  }

  public int getIncomeLevel(){
        return DataType.getAsInt(this.get(S_IncomeLevel));
  
  }
  public int getIncomeLevelInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IncomeLevel));
      }

  public void initManualCommercialProtection(int value){
     this.initProperty(S_ManualCommercialProtection,new Integer(value));
  }
  public  void setManualCommercialProtection(int value){
     this.set(S_ManualCommercialProtection,new Integer(value));
  }
  public  void setManualCommercialProtectionNull(){
     this.set(S_ManualCommercialProtection,null);
  }

  public int getManualCommercialProtection(){
        return DataType.getAsInt(this.get(S_ManualCommercialProtection));
  
  }
  public int getManualCommercialProtectionInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ManualCommercialProtection));
      }

  public void initIsRevisable(int value){
     this.initProperty(S_IsRevisable,new Integer(value));
  }
  public  void setIsRevisable(int value){
     this.set(S_IsRevisable,new Integer(value));
  }
  public  void setIsRevisableNull(){
     this.set(S_IsRevisable,null);
  }

  public int getIsRevisable(){
        return DataType.getAsInt(this.get(S_IsRevisable));
  
  }
  public int getIsRevisableInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IsRevisable));
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

  public void initEnglishName(String value){
     this.initProperty(S_EnglishName,value);
  }
  public  void setEnglishName(String value){
     this.set(S_EnglishName,value);
  }
  public  void setEnglishNameNull(){
     this.set(S_EnglishName,null);
  }

  public String getEnglishName(){
       return DataType.getAsString(this.get(S_EnglishName));
  
  }
  public String getEnglishNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_EnglishName));
      }

  public void initLunar(int value){
     this.initProperty(S_Lunar,new Integer(value));
  }
  public  void setLunar(int value){
     this.set(S_Lunar,new Integer(value));
  }
  public  void setLunarNull(){
     this.set(S_Lunar,null);
  }

  public int getLunar(){
        return DataType.getAsInt(this.get(S_Lunar));
  
  }
  public int getLunarInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_Lunar));
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

  public void initCoName(String value){
     this.initProperty(S_CoName,value);
  }
  public  void setCoName(String value){
     this.set(S_CoName,value);
  }
  public  void setCoNameNull(){
     this.set(S_CoName,null);
  }

  public String getCoName(){
       return DataType.getAsString(this.get(S_CoName));
  
  }
  public String getCoNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CoName));
      }

  public void initPersonStatus(String value){
     this.initProperty(S_PersonStatus,value);
  }
  public  void setPersonStatus(String value){
     this.set(S_PersonStatus,value);
  }
  public  void setPersonStatusNull(){
     this.set(S_PersonStatus,null);
  }

  public String getPersonStatus(){
       return DataType.getAsString(this.get(S_PersonStatus));
  
  }
  public String getPersonStatusInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PersonStatus));
      }

  public void initCurResidenceStrDate(Timestamp value){
     this.initProperty(S_CurResidenceStrDate,value);
  }
  public  void setCurResidenceStrDate(Timestamp value){
     this.set(S_CurResidenceStrDate,value);
  }
  public  void setCurResidenceStrDateNull(){
     this.set(S_CurResidenceStrDate,null);
  }

  public Timestamp getCurResidenceStrDate(){
        return DataType.getAsDateTime(this.get(S_CurResidenceStrDate));
  
  }
  public Timestamp getCurResidenceStrDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_CurResidenceStrDate));
      }

  public void initStatusEffDate(Timestamp value){
     this.initProperty(S_StatusEffDate,value);
  }
  public  void setStatusEffDate(Timestamp value){
     this.set(S_StatusEffDate,value);
  }
  public  void setStatusEffDateNull(){
     this.set(S_StatusEffDate,null);
  }

  public Timestamp getStatusEffDate(){
        return DataType.getAsDateTime(this.get(S_StatusEffDate));
  
  }
  public Timestamp getStatusEffDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_StatusEffDate));
      }

  public void initOfficeTel(String value){
     this.initProperty(S_OfficeTel,value);
  }
  public  void setOfficeTel(String value){
     this.set(S_OfficeTel,value);
  }
  public  void setOfficeTelNull(){
     this.set(S_OfficeTel,null);
  }

  public String getOfficeTel(){
       return DataType.getAsString(this.get(S_OfficeTel));
  
  }
  public String getOfficeTelInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OfficeTel));
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

  public void initExt9(String value){
     this.initProperty(S_Ext9,value);
  }
  public  void setExt9(String value){
     this.set(S_Ext9,value);
  }
  public  void setExt9Null(){
     this.set(S_Ext9,null);
  }

  public String getExt9(){
       return DataType.getAsString(this.get(S_Ext9));
  
  }
  public String getExt9InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext9));
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

  public void initExt5(String value){
     this.initProperty(S_Ext5,value);
  }
  public  void setExt5(String value){
     this.set(S_Ext5,value);
  }
  public  void setExt5Null(){
     this.set(S_Ext5,null);
  }

  public String getExt5(){
       return DataType.getAsString(this.get(S_Ext5));
  
  }
  public String getExt5InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext5));
      }

  public void initExt6(String value){
     this.initProperty(S_Ext6,value);
  }
  public  void setExt6(String value){
     this.set(S_Ext6,value);
  }
  public  void setExt6Null(){
     this.set(S_Ext6,null);
  }

  public String getExt6(){
       return DataType.getAsString(this.get(S_Ext6));
  
  }
  public String getExt6InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext6));
      }

  public void initExt7(String value){
     this.initProperty(S_Ext7,value);
  }
  public  void setExt7(String value){
     this.set(S_Ext7,value);
  }
  public  void setExt7Null(){
     this.set(S_Ext7,null);
  }

  public String getExt7(){
       return DataType.getAsString(this.get(S_Ext7));
  
  }
  public String getExt7InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext7));
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

  public void initExt8(String value){
     this.initProperty(S_Ext8,value);
  }
  public  void setExt8(String value){
     this.set(S_Ext8,value);
  }
  public  void setExt8Null(){
     this.set(S_Ext8,null);
  }

  public String getExt8(){
       return DataType.getAsString(this.get(S_Ext8));
  
  }
  public String getExt8InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext8));
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

  public void initExt4(String value){
     this.initProperty(S_Ext4,value);
  }
  public  void setExt4(String value){
     this.set(S_Ext4,value);
  }
  public  void setExt4Null(){
     this.set(S_Ext4,null);
  }

  public String getExt4(){
       return DataType.getAsString(this.get(S_Ext4));
  
  }
  public String getExt4InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext4));
      }

  public void initNationalType(int value){
     this.initProperty(S_NationalType,new Integer(value));
  }
  public  void setNationalType(int value){
     this.set(S_NationalType,new Integer(value));
  }
  public  void setNationalTypeNull(){
     this.set(S_NationalType,null);
  }

  public int getNationalType(){
        return DataType.getAsInt(this.get(S_NationalType));
  
  }
  public int getNationalTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_NationalType));
      }

  public void initExt20(long value){
     this.initProperty(S_Ext20,new Long(value));
  }
  public  void setExt20(long value){
     this.set(S_Ext20,new Long(value));
  }
  public  void setExt20Null(){
     this.set(S_Ext20,null);
  }

  public long getExt20(){
        return DataType.getAsLong(this.get(S_Ext20));
  
  }
  public long getExt20InitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Ext20));
      }

  public void initExt30(Timestamp value){
     this.initProperty(S_Ext30,value);
  }
  public  void setExt30(Timestamp value){
     this.set(S_Ext30,value);
  }
  public  void setExt30Null(){
     this.set(S_Ext30,null);
  }

  public Timestamp getExt30(){
        return DataType.getAsDateTime(this.get(S_Ext30));
  
  }
  public Timestamp getExt30InitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_Ext30));
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

  public void initManualProtectEffectiveDate(Timestamp value){
     this.initProperty(S_ManualProtectEffectiveDate,value);
  }
  public  void setManualProtectEffectiveDate(Timestamp value){
     this.set(S_ManualProtectEffectiveDate,value);
  }
  public  void setManualProtectEffectiveDateNull(){
     this.set(S_ManualProtectEffectiveDate,null);
  }

  public Timestamp getManualProtectEffectiveDate(){
        return DataType.getAsDateTime(this.get(S_ManualProtectEffectiveDate));
  
  }
  public Timestamp getManualProtectEffectiveDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_ManualProtectEffectiveDate));
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

  public void initAttorneys(String value){
     this.initProperty(S_Attorneys,value);
  }
  public  void setAttorneys(String value){
     this.set(S_Attorneys,value);
  }
  public  void setAttorneysNull(){
     this.set(S_Attorneys,null);
  }

  public String getAttorneys(){
       return DataType.getAsString(this.get(S_Attorneys));
  
  }
  public String getAttorneysInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Attorneys));
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

  public void initMarryStatus(int value){
     this.initProperty(S_MarryStatus,new Integer(value));
  }
  public  void setMarryStatus(int value){
     this.set(S_MarryStatus,new Integer(value));
  }
  public  void setMarryStatusNull(){
     this.set(S_MarryStatus,null);
  }

  public int getMarryStatus(){
        return DataType.getAsInt(this.get(S_MarryStatus));
  
  }
  public int getMarryStatusInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_MarryStatus));
      }

  public void initExt19(long value){
     this.initProperty(S_Ext19,new Long(value));
  }
  public  void setExt19(long value){
     this.set(S_Ext19,new Long(value));
  }
  public  void setExt19Null(){
     this.set(S_Ext19,null);
  }

  public long getExt19(){
        return DataType.getAsLong(this.get(S_Ext19));
  
  }
  public long getExt19InitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Ext19));
      }

  public void initExt29(Timestamp value){
     this.initProperty(S_Ext29,value);
  }
  public  void setExt29(Timestamp value){
     this.set(S_Ext29,value);
  }
  public  void setExt29Null(){
     this.set(S_Ext29,null);
  }

  public Timestamp getExt29(){
        return DataType.getAsDateTime(this.get(S_Ext29));
  
  }
  public Timestamp getExt29InitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_Ext29));
      }

  public void initExt18(String value){
     this.initProperty(S_Ext18,value);
  }
  public  void setExt18(String value){
     this.set(S_Ext18,value);
  }
  public  void setExt18Null(){
     this.set(S_Ext18,null);
  }

  public String getExt18(){
       return DataType.getAsString(this.get(S_Ext18));
  
  }
  public String getExt18InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext18));
      }

  public void initExt17(String value){
     this.initProperty(S_Ext17,value);
  }
  public  void setExt17(String value){
     this.set(S_Ext17,value);
  }
  public  void setExt17Null(){
     this.set(S_Ext17,null);
  }

  public String getExt17(){
       return DataType.getAsString(this.get(S_Ext17));
  
  }
  public String getExt17InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext17));
      }

  public void initExt27(Timestamp value){
     this.initProperty(S_Ext27,value);
  }
  public  void setExt27(Timestamp value){
     this.set(S_Ext27,value);
  }
  public  void setExt27Null(){
     this.set(S_Ext27,null);
  }

  public Timestamp getExt27(){
        return DataType.getAsDateTime(this.get(S_Ext27));
  
  }
  public Timestamp getExt27InitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_Ext27));
      }

  public void initExt16(String value){
     this.initProperty(S_Ext16,value);
  }
  public  void setExt16(String value){
     this.set(S_Ext16,value);
  }
  public  void setExt16Null(){
     this.set(S_Ext16,null);
  }

  public String getExt16(){
       return DataType.getAsString(this.get(S_Ext16));
  
  }
  public String getExt16InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext16));
      }

  public void initExt28(Timestamp value){
     this.initProperty(S_Ext28,value);
  }
  public  void setExt28(Timestamp value){
     this.set(S_Ext28,value);
  }
  public  void setExt28Null(){
     this.set(S_Ext28,null);
  }

  public Timestamp getExt28(){
        return DataType.getAsDateTime(this.get(S_Ext28));
  
  }
  public Timestamp getExt28InitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_Ext28));
      }

  public void initCustServiceLevel(int value){
     this.initProperty(S_CustServiceLevel,new Integer(value));
  }
  public  void setCustServiceLevel(int value){
     this.set(S_CustServiceLevel,new Integer(value));
  }
  public  void setCustServiceLevelNull(){
     this.set(S_CustServiceLevel,null);
  }

  public int getCustServiceLevel(){
        return DataType.getAsInt(this.get(S_CustServiceLevel));
  
  }
  public int getCustServiceLevelInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CustServiceLevel));
      }

  public void initExt15(String value){
     this.initProperty(S_Ext15,value);
  }
  public  void setExt15(String value){
     this.set(S_Ext15,value);
  }
  public  void setExt15Null(){
     this.set(S_Ext15,null);
  }

  public String getExt15(){
       return DataType.getAsString(this.get(S_Ext15));
  
  }
  public String getExt15InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext15));
      }

  public void initExt25(long value){
     this.initProperty(S_Ext25,new Long(value));
  }
  public  void setExt25(long value){
     this.set(S_Ext25,new Long(value));
  }
  public  void setExt25Null(){
     this.set(S_Ext25,null);
  }

  public long getExt25(){
        return DataType.getAsLong(this.get(S_Ext25));
  
  }
  public long getExt25InitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Ext25));
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

  public void initExt14(String value){
     this.initProperty(S_Ext14,value);
  }
  public  void setExt14(String value){
     this.set(S_Ext14,value);
  }
  public  void setExt14Null(){
     this.set(S_Ext14,null);
  }

  public String getExt14(){
       return DataType.getAsString(this.get(S_Ext14));
  
  }
  public String getExt14InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext14));
      }

  public void initExt26(long value){
     this.initProperty(S_Ext26,new Long(value));
  }
  public  void setExt26(long value){
     this.set(S_Ext26,new Long(value));
  }
  public  void setExt26Null(){
     this.set(S_Ext26,null);
  }

  public long getExt26(){
        return DataType.getAsLong(this.get(S_Ext26));
  
  }
  public long getExt26InitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Ext26));
      }

  public void initExt13(String value){
     this.initProperty(S_Ext13,value);
  }
  public  void setExt13(String value){
     this.set(S_Ext13,value);
  }
  public  void setExt13Null(){
     this.set(S_Ext13,null);
  }

  public String getExt13(){
       return DataType.getAsString(this.get(S_Ext13));
  
  }
  public String getExt13InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext13));
      }

  public void initExt23(long value){
     this.initProperty(S_Ext23,new Long(value));
  }
  public  void setExt23(long value){
     this.set(S_Ext23,new Long(value));
  }
  public  void setExt23Null(){
     this.set(S_Ext23,null);
  }

  public long getExt23(){
        return DataType.getAsLong(this.get(S_Ext23));
  
  }
  public long getExt23InitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Ext23));
      }

  public void initExt12(String value){
     this.initProperty(S_Ext12,value);
  }
  public  void setExt12(String value){
     this.set(S_Ext12,value);
  }
  public  void setExt12Null(){
     this.set(S_Ext12,null);
  }

  public String getExt12(){
       return DataType.getAsString(this.get(S_Ext12));
  
  }
  public String getExt12InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext12));
      }

  public void initExt24(long value){
     this.initProperty(S_Ext24,new Long(value));
  }
  public  void setExt24(long value){
     this.set(S_Ext24,new Long(value));
  }
  public  void setExt24Null(){
     this.set(S_Ext24,null);
  }

  public long getExt24(){
        return DataType.getAsLong(this.get(S_Ext24));
  
  }
  public long getExt24InitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Ext24));
      }

  public void initExt11(String value){
     this.initProperty(S_Ext11,value);
  }
  public  void setExt11(String value){
     this.set(S_Ext11,value);
  }
  public  void setExt11Null(){
     this.set(S_Ext11,null);
  }

  public String getExt11(){
       return DataType.getAsString(this.get(S_Ext11));
  
  }
  public String getExt11InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext11));
      }

  public void initExt21(long value){
     this.initProperty(S_Ext21,new Long(value));
  }
  public  void setExt21(long value){
     this.set(S_Ext21,new Long(value));
  }
  public  void setExt21Null(){
     this.set(S_Ext21,null);
  }

  public long getExt21(){
        return DataType.getAsLong(this.get(S_Ext21));
  
  }
  public long getExt21InitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Ext21));
      }

  public void initRealNameFlag(int value){
     this.initProperty(S_RealNameFlag,new Integer(value));
  }
  public  void setRealNameFlag(int value){
     this.set(S_RealNameFlag,new Integer(value));
  }
  public  void setRealNameFlagNull(){
     this.set(S_RealNameFlag,null);
  }

  public int getRealNameFlag(){
        return DataType.getAsInt(this.get(S_RealNameFlag));
  
  }
  public int getRealNameFlagInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_RealNameFlag));
      }

  public void initExt10(String value){
     this.initProperty(S_Ext10,value);
  }
  public  void setExt10(String value){
     this.set(S_Ext10,value);
  }
  public  void setExt10Null(){
     this.set(S_Ext10,null);
  }

  public String getExt10(){
       return DataType.getAsString(this.get(S_Ext10));
  
  }
  public String getExt10InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext10));
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

  public void initExt22(long value){
     this.initProperty(S_Ext22,new Long(value));
  }
  public  void setExt22(long value){
     this.set(S_Ext22,new Long(value));
  }
  public  void setExt22Null(){
     this.set(S_Ext22,null);
  }

  public long getExt22(){
        return DataType.getAsLong(this.get(S_Ext22));
  
  }
  public long getExt22InitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Ext22));
      }

  public void initProtectEffDate(Timestamp value){
     this.initProperty(S_ProtectEffDate,value);
  }
  public  void setProtectEffDate(Timestamp value){
     this.set(S_ProtectEffDate,value);
  }
  public  void setProtectEffDateNull(){
     this.set(S_ProtectEffDate,null);
  }

  public Timestamp getProtectEffDate(){
        return DataType.getAsDateTime(this.get(S_ProtectEffDate));
  
  }
  public Timestamp getProtectEffDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_ProtectEffDate));
      }

  public void initCustStatus(int value){
     this.initProperty(S_CustStatus,new Integer(value));
  }
  public  void setCustStatus(int value){
     this.set(S_CustStatus,new Integer(value));
  }
  public  void setCustStatusNull(){
     this.set(S_CustStatus,null);
  }

  public int getCustStatus(){
        return DataType.getAsInt(this.get(S_CustStatus));
  
  }
  public int getCustStatusInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CustStatus));
      }

  public void initMotherName(String value){
     this.initProperty(S_MotherName,value);
  }
  public  void setMotherName(String value){
     this.set(S_MotherName,value);
  }
  public  void setMotherNameNull(){
     this.set(S_MotherName,null);
  }

  public String getMotherName(){
       return DataType.getAsString(this.get(S_MotherName));
  
  }
  public String getMotherNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_MotherName));
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

  public void initEducationLevel(int value){
     this.initProperty(S_EducationLevel,new Integer(value));
  }
  public  void setEducationLevel(int value){
     this.set(S_EducationLevel,new Integer(value));
  }
  public  void setEducationLevelNull(){
     this.set(S_EducationLevel,null);
  }

  public int getEducationLevel(){
        return DataType.getAsInt(this.get(S_EducationLevel));
  
  }
  public int getEducationLevelInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_EducationLevel));
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

  public void initProtectExpireDate(Timestamp value){
     this.initProperty(S_ProtectExpireDate,value);
  }
  public  void setProtectExpireDate(Timestamp value){
     this.set(S_ProtectExpireDate,value);
  }
  public  void setProtectExpireDateNull(){
     this.set(S_ProtectExpireDate,null);
  }

  public Timestamp getProtectExpireDate(){
        return DataType.getAsDateTime(this.get(S_ProtectExpireDate));
  
  }
  public Timestamp getProtectExpireDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_ProtectExpireDate));
      }

  public void initCustCertType(int value){
     this.initProperty(S_CustCertType,new Integer(value));
  }
  public  void setCustCertType(int value){
     this.set(S_CustCertType,new Integer(value));
  }
  public  void setCustCertTypeNull(){
     this.set(S_CustCertType,null);
  }

  public int getCustCertType(){
        return DataType.getAsInt(this.get(S_CustCertType));
  
  }
  public int getCustCertTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CustCertType));
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

  public void initPrioryLevel(int value){
     this.initProperty(S_PrioryLevel,new Integer(value));
  }
  public  void setPrioryLevel(int value){
     this.set(S_PrioryLevel,new Integer(value));
  }
  public  void setPrioryLevelNull(){
     this.set(S_PrioryLevel,null);
  }

  public int getPrioryLevel(){
        return DataType.getAsInt(this.get(S_PrioryLevel));
  
  }
  public int getPrioryLevelInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_PrioryLevel));
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

  public void initContactProtection(int value){
     this.initProperty(S_ContactProtection,new Integer(value));
  }
  public  void setContactProtection(int value){
     this.set(S_ContactProtection,new Integer(value));
  }
  public  void setContactProtectionNull(){
     this.set(S_ContactProtection,null);
  }

  public int getContactProtection(){
        return DataType.getAsInt(this.get(S_ContactProtection));
  
  }
  public int getContactProtectionInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ContactProtection));
      }

  public void initOccupation(int value){
     this.initProperty(S_Occupation,new Integer(value));
  }
  public  void setOccupation(int value){
     this.set(S_Occupation,new Integer(value));
  }
  public  void setOccupationNull(){
     this.set(S_Occupation,null);
  }

  public int getOccupation(){
        return DataType.getAsInt(this.get(S_Occupation));
  
  }
  public int getOccupationInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_Occupation));
      }

  public void initContEmail(String value){
     this.initProperty(S_ContEmail,value);
  }
  public  void setContEmail(String value){
     this.set(S_ContEmail,value);
  }
  public  void setContEmailNull(){
     this.set(S_ContEmail,null);
  }

  public String getContEmail(){
       return DataType.getAsString(this.get(S_ContEmail));
  
  }
  public String getContEmailInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContEmail));
      }

  public void initPhysiologicalState(int value){
     this.initProperty(S_PhysiologicalState,new Integer(value));
  }
  public  void setPhysiologicalState(int value){
     this.set(S_PhysiologicalState,new Integer(value));
  }
  public  void setPhysiologicalStateNull(){
     this.set(S_PhysiologicalState,null);
  }

  public int getPhysiologicalState(){
        return DataType.getAsInt(this.get(S_PhysiologicalState));
  
  }
  public int getPhysiologicalStateInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_PhysiologicalState));
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

  public void initDirectMarketingProtection(int value){
     this.initProperty(S_DirectMarketingProtection,new Integer(value));
  }
  public  void setDirectMarketingProtection(int value){
     this.set(S_DirectMarketingProtection,new Integer(value));
  }
  public  void setDirectMarketingProtectionNull(){
     this.set(S_DirectMarketingProtection,null);
  }

  public int getDirectMarketingProtection(){
        return DataType.getAsInt(this.get(S_DirectMarketingProtection));
  
  }
  public int getDirectMarketingProtectionInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_DirectMarketingProtection));
      }

  public void initBadPayerFlag(int value){
     this.initProperty(S_BadPayerFlag,new Integer(value));
  }
  public  void setBadPayerFlag(int value){
     this.set(S_BadPayerFlag,new Integer(value));
  }
  public  void setBadPayerFlagNull(){
     this.set(S_BadPayerFlag,null);
  }

  public int getBadPayerFlag(){
        return DataType.getAsInt(this.get(S_BadPayerFlag));
  
  }
  public int getBadPayerFlagInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_BadPayerFlag));
      }

  public void initManualProtectExpireDate(Timestamp value){
     this.initProperty(S_ManualProtectExpireDate,value);
  }
  public  void setManualProtectExpireDate(Timestamp value){
     this.set(S_ManualProtectExpireDate,value);
  }
  public  void setManualProtectExpireDateNull(){
     this.set(S_ManualProtectExpireDate,null);
  }

  public Timestamp getManualProtectExpireDate(){
        return DataType.getAsDateTime(this.get(S_ManualProtectExpireDate));
  
  }
  public Timestamp getManualProtectExpireDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_ManualProtectExpireDate));
      }

  public void initPoliticsFace(int value){
     this.initProperty(S_PoliticsFace,new Integer(value));
  }
  public  void setPoliticsFace(int value){
     this.set(S_PoliticsFace,new Integer(value));
  }
  public  void setPoliticsFaceNull(){
     this.set(S_PoliticsFace,null);
  }

  public int getPoliticsFace(){
        return DataType.getAsInt(this.get(S_PoliticsFace));
  
  }
  public int getPoliticsFaceInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_PoliticsFace));
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

  public void initContName(String value){
     this.initProperty(S_ContName,value);
  }
  public  void setContName(String value){
     this.set(S_ContName,value);
  }
  public  void setContNameNull(){
     this.set(S_ContName,null);
  }

  public String getContName(){
       return DataType.getAsString(this.get(S_ContName));
  
  }
  public String getContNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContName));
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

  public void initHomeTel(String value){
     this.initProperty(S_HomeTel,value);
  }
  public  void setHomeTel(String value){
     this.set(S_HomeTel,value);
  }
  public  void setHomeTelNull(){
     this.set(S_HomeTel,null);
  }

  public String getHomeTel(){
       return DataType.getAsString(this.get(S_HomeTel));
  
  }
  public String getHomeTelInitialValue(){
        return DataType.getAsString(this.getOldObj(S_HomeTel));
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

  public void initContNameQry(String value){
     this.initProperty(S_ContNameQry,value);
  }
  public  void setContNameQry(String value){
     this.set(S_ContNameQry,value);
  }
  public  void setContNameQryNull(){
     this.set(S_ContNameQry,null);
  }

  public String getContNameQry(){
       return DataType.getAsString(this.get(S_ContNameQry));
  
  }
  public String getContNameQryInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContNameQry));
      }

  public void initAnonymousFlag(int value){
     this.initProperty(S_AnonymousFlag,new Integer(value));
  }
  public  void setAnonymousFlag(int value){
     this.set(S_AnonymousFlag,new Integer(value));
  }
  public  void setAnonymousFlagNull(){
     this.set(S_AnonymousFlag,null);
  }

  public int getAnonymousFlag(){
        return DataType.getAsInt(this.get(S_AnonymousFlag));
  
  }
  public int getAnonymousFlagInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_AnonymousFlag));
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

  public void initContAddress(String value){
     this.initProperty(S_ContAddress,value);
  }
  public  void setContAddress(String value){
     this.set(S_ContAddress,value);
  }
  public  void setContAddressNull(){
     this.set(S_ContAddress,null);
  }

  public String getContAddress(){
       return DataType.getAsString(this.get(S_ContAddress));
  
  }
  public String getContAddressInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContAddress));
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

  public void initFormerName(String value){
     this.initProperty(S_FormerName,value);
  }
  public  void setFormerName(String value){
     this.set(S_FormerName,value);
  }
  public  void setFormerNameNull(){
     this.set(S_FormerName,null);
  }

  public String getFormerName(){
       return DataType.getAsString(this.get(S_FormerName));
  
  }
  public String getFormerNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FormerName));
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

  public void initBirthPlace(String value){
     this.initProperty(S_BirthPlace,value);
  }
  public  void setBirthPlace(String value){
     this.set(S_BirthPlace,value);
  }
  public  void setBirthPlaceNull(){
     this.set(S_BirthPlace,null);
  }

  public String getBirthPlace(){
       return DataType.getAsString(this.get(S_BirthPlace));
  
  }
  public String getBirthPlaceInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BirthPlace));
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

  public void initContFax(String value){
     this.initProperty(S_ContFax,value);
  }
  public  void setContFax(String value){
     this.set(S_ContFax,value);
  }
  public  void setContFaxNull(){
     this.set(S_ContFax,null);
  }

  public String getContFax(){
       return DataType.getAsString(this.get(S_ContFax));
  
  }
  public String getContFaxInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContFax));
      }

  public void initGuardianName(String value){
     this.initProperty(S_GuardianName,value);
  }
  public  void setGuardianName(String value){
     this.set(S_GuardianName,value);
  }
  public  void setGuardianNameNull(){
     this.set(S_GuardianName,null);
  }

  public String getGuardianName(){
       return DataType.getAsString(this.get(S_GuardianName));
  
  }
  public String getGuardianNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_GuardianName));
      }


 
 }

