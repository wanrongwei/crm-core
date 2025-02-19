package com.asiainfo.crm.cm.inner.contact.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.inner.contact.ivalues.*;

public class QBOCmGroupCustContactBean extends DataContainer implements DataContainerInterface,IQBOCmGroupCustContactValue{

  private static String  m_boName = "com.asiainfo.crm.cm.inner.contact.bo.QBOCmGroupCustContact";



  public final static  String S_CertCode = "CERT_CODE";
  public final static  String S_IdFileName = "ID_FILE_NAME";
  public final static  String S_PostAddress = "POST_ADDRESS";
  public final static  String S_CityId = "CITY_ID";
  public final static  String S_CharacterDesc = "CHARACTER_DESC";
  public final static  String S_CertAddress = "CERT_ADDRESS";
  public final static  String S_ContDesc = "CONT_DESC";
  public final static  String S_IncomeLevel = "INCOME_LEVEL";
  public final static  String S_AlarmBillId = "ALARM_BILL_ID";
  public final static  String S_FirstName = "FIRST_NAME";
  public final static  String S_EnglishName = "ENGLISH_NAME";
  public final static  String S_Lunar = "LUNAR";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_CertExpireDate = "CERT_EXPIRE_DATE";
  public final static  String S_IdValidDate = "ID_VALID_DATE";
  public final static  String S_OfficeTel = "OFFICE_TEL";
  public final static  String S_PostCode = "POST_CODE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_HomeAddress = "HOME_ADDRESS";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_NationalType = "NATIONAL_TYPE";
  public final static  String S_ContBusiInterests = "CONT_BUSI_INTERESTS";
  public final static  String S_PartyId = "PARTY_ID";
  public final static  String S_SecurityId = "SECURITY_ID";
  public final static  String S_ContactPermissions = "CONTACT_PERMISSIONS";
  public final static  String S_Nationality = "NATIONALITY";
  public final static  String S_CarNo = "CAR_NO";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_MarryStatus = "MARRY_STATUS";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_ProtoFileName = "PROTO_FILE_NAME";
  public final static  String S_JobCompany = "JOB_COMPANY";
  public final static  String S_ProvinceId = "PROVINCE_ID";
  public final static  String S_JobPosition = "JOB_POSITION";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CertType = "CERT_TYPE";
  public final static  String S_MiddleName = "MIDDLE_NAME";
  public final static  String S_PartyName = "PARTY_NAME";
  public final static  String S_PartyNameQry = "PARTY_NAME_QRY";
  public final static  String S_Hobby = "HOBBY";
  public final static  String S_EducationLevel = "EDUCATION_LEVEL";
  public final static  String S_ContId = "CONT_ID";
  public final static  String S_IdExpireDate = "ID_EXPIRE_DATE";
  public final static  String S_ProtoValidDate = "PROTO_VALID_DATE";
  public final static  String S_SubRegionType = "SUB_REGION_TYPE";
  public final static  String S_ContLevel = "CONT_LEVEL";
  public final static  String S_PrioryLevel = "PRIORY_LEVEL";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_ContClass = "CONT_CLASS";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_ContLastName = "CONT_LAST_NAME";
  public final static  String S_ContType = "CONT_TYPE";
  public final static  String S_ContEmail = "CONT_EMAIL";
  public final static  String S_RegionType = "REGION_TYPE";
  public final static  String S_LastName = "LAST_NAME";
  public final static  String S_CustCertEffdate = "CUST_CERT_EFFDATE";
  public final static  String S_CustContId = "CUST_CONT_ID";
  public final static  String S_PoliticsFace = "POLITICS_FACE";
  public final static  String S_State = "STATE";
  public final static  String S_ProtoExpireDate = "PROTO_EXPIRE_DATE";
  public final static  String S_ContFirstName = "CONT_FIRST_NAME";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_ContName = "CONT_NAME";
  public final static  String S_ContLastNameQry = "CONT_LAST_NAME_QRY";
  public final static  String S_ShortName = "SHORT_NAME";
  public final static  String S_HomeTel = "HOME_TEL";
  public final static  String S_ContMobile = "CONT_MOBILE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_ContactDepartment = "CONTACT_DEPARTMENT";
  public final static  String S_ContFirstNameQry = "CONT_FIRST_NAME_QRY";
  public final static  String S_ContNameQry = "CONT_NAME_QRY";
  public final static  String S_ContMiddleNameQry = "CONT_MIDDLE_NAME_QRY";
  public final static  String S_MemberType = "MEMBER_TYPE";
  public final static  String S_Birthday = "BIRTHDAY";
  public final static  String S_ContAddress = "CONT_ADDRESS";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_LastNameQry = "LAST_NAME_QRY";
  public final static  String S_ContMiddleName = "CONT_MIDDLE_NAME";
  public final static  String S_FamilyInfo = "FAMILY_INFO";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_ContSocialInterests = "CONT_SOCIAL_INTERESTS";
  public final static  String S_ParentPartyId = "PARENT_PARTY_ID";
  public final static  String S_Gender = "GENDER";
  public final static  String S_CountyId = "COUNTY_ID";
  public final static  String S_JobDesc = "JOB_DESC";
  public final static  String S_ProvideId = "PROVIDE_ID";
  public final static  String S_MemberDesc = "MEMBER_DESC";
  public final static  String S_Religion = "RELIGION";
  public final static  String S_FirstNameQry = "FIRST_NAME_QRY";
  public final static  String S_MemberJob = "MEMBER_JOB";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_Brand = "BRAND";
  public final static  String S_MiddleNameQry = "MIDDLE_NAME_QRY";
  public final static  String S_IsInheritable = "IS_INHERITABLE";
  public final static  String S_PartyType = "PARTY_TYPE";
  public final static  String S_ContFax = "CONT_FAX";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public QBOCmGroupCustContactBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initCertCode(String value){
     this.initProperty(S_CertCode,value);
  }
  public  void setCertCode(String value){
     this.set(S_CertCode,value);
  }
  public  void setCertCodeNull(){
     this.set(S_CertCode,null);
  }

  public String getCertCode(){
       return DataType.getAsString(this.get(S_CertCode));
  
  }
  public String getCertCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CertCode));
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

  public void initCertAddress(String value){
     this.initProperty(S_CertAddress,value);
  }
  public  void setCertAddress(String value){
     this.set(S_CertAddress,value);
  }
  public  void setCertAddressNull(){
     this.set(S_CertAddress,null);
  }

  public String getCertAddress(){
       return DataType.getAsString(this.get(S_CertAddress));
  
  }
  public String getCertAddressInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CertAddress));
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

  public void initAlarmBillId(String value){
     this.initProperty(S_AlarmBillId,value);
  }
  public  void setAlarmBillId(String value){
     this.set(S_AlarmBillId,value);
  }
  public  void setAlarmBillIdNull(){
     this.set(S_AlarmBillId,null);
  }

  public String getAlarmBillId(){
       return DataType.getAsString(this.get(S_AlarmBillId));
  
  }
  public String getAlarmBillIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AlarmBillId));
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

  public void initCertExpireDate(Timestamp value){
     this.initProperty(S_CertExpireDate,value);
  }
  public  void setCertExpireDate(Timestamp value){
     this.set(S_CertExpireDate,value);
  }
  public  void setCertExpireDateNull(){
     this.set(S_CertExpireDate,null);
  }

  public Timestamp getCertExpireDate(){
        return DataType.getAsDateTime(this.get(S_CertExpireDate));
  
  }
  public Timestamp getCertExpireDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_CertExpireDate));
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

  public void initHomeAddress(String value){
     this.initProperty(S_HomeAddress,value);
  }
  public  void setHomeAddress(String value){
     this.set(S_HomeAddress,value);
  }
  public  void setHomeAddressNull(){
     this.set(S_HomeAddress,null);
  }

  public String getHomeAddress(){
       return DataType.getAsString(this.get(S_HomeAddress));
  
  }
  public String getHomeAddressInitialValue(){
        return DataType.getAsString(this.getOldObj(S_HomeAddress));
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

  public void initContBusiInterests(int value){
     this.initProperty(S_ContBusiInterests,new Integer(value));
  }
  public  void setContBusiInterests(int value){
     this.set(S_ContBusiInterests,new Integer(value));
  }
  public  void setContBusiInterestsNull(){
     this.set(S_ContBusiInterests,null);
  }

  public int getContBusiInterests(){
        return DataType.getAsInt(this.get(S_ContBusiInterests));
  
  }
  public int getContBusiInterestsInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ContBusiInterests));
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

  public void initSecurityId(String value){
     this.initProperty(S_SecurityId,value);
  }
  public  void setSecurityId(String value){
     this.set(S_SecurityId,value);
  }
  public  void setSecurityIdNull(){
     this.set(S_SecurityId,null);
  }

  public String getSecurityId(){
       return DataType.getAsString(this.get(S_SecurityId));
  
  }
  public String getSecurityIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SecurityId));
      }

  public void initContactPermissions(int value){
     this.initProperty(S_ContactPermissions,new Integer(value));
  }
  public  void setContactPermissions(int value){
     this.set(S_ContactPermissions,new Integer(value));
  }
  public  void setContactPermissionsNull(){
     this.set(S_ContactPermissions,null);
  }

  public int getContactPermissions(){
        return DataType.getAsInt(this.get(S_ContactPermissions));
  
  }
  public int getContactPermissionsInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ContactPermissions));
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

  public void initCarNo(String value){
     this.initProperty(S_CarNo,value);
  }
  public  void setCarNo(String value){
     this.set(S_CarNo,value);
  }
  public  void setCarNoNull(){
     this.set(S_CarNo,null);
  }

  public String getCarNo(){
       return DataType.getAsString(this.get(S_CarNo));
  
  }
  public String getCarNoInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CarNo));
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

  public void initCertType(int value){
     this.initProperty(S_CertType,new Integer(value));
  }
  public  void setCertType(int value){
     this.set(S_CertType,new Integer(value));
  }
  public  void setCertTypeNull(){
     this.set(S_CertType,null);
  }

  public int getCertType(){
        return DataType.getAsInt(this.get(S_CertType));
  
  }
  public int getCertTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CertType));
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

  public void initPartyName(String value){
     this.initProperty(S_PartyName,value);
  }
  public  void setPartyName(String value){
     this.set(S_PartyName,value);
  }
  public  void setPartyNameNull(){
     this.set(S_PartyName,null);
  }

  public String getPartyName(){
       return DataType.getAsString(this.get(S_PartyName));
  
  }
  public String getPartyNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PartyName));
      }

  public void initPartyNameQry(String value){
     this.initProperty(S_PartyNameQry,value);
  }
  public  void setPartyNameQry(String value){
     this.set(S_PartyNameQry,value);
  }
  public  void setPartyNameQryNull(){
     this.set(S_PartyNameQry,null);
  }

  public String getPartyNameQry(){
       return DataType.getAsString(this.get(S_PartyNameQry));
  
  }
  public String getPartyNameQryInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PartyNameQry));
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

  public void initContLevel(int value){
     this.initProperty(S_ContLevel,new Integer(value));
  }
  public  void setContLevel(int value){
     this.set(S_ContLevel,new Integer(value));
  }
  public  void setContLevelNull(){
     this.set(S_ContLevel,null);
  }

  public int getContLevel(){
        return DataType.getAsInt(this.get(S_ContLevel));
  
  }
  public int getContLevelInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ContLevel));
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

  public void initContClass(int value){
     this.initProperty(S_ContClass,new Integer(value));
  }
  public  void setContClass(int value){
     this.set(S_ContClass,new Integer(value));
  }
  public  void setContClassNull(){
     this.set(S_ContClass,null);
  }

  public int getContClass(){
        return DataType.getAsInt(this.get(S_ContClass));
  
  }
  public int getContClassInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ContClass));
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

  public void initContLastName(String value){
     this.initProperty(S_ContLastName,value);
  }
  public  void setContLastName(String value){
     this.set(S_ContLastName,value);
  }
  public  void setContLastNameNull(){
     this.set(S_ContLastName,null);
  }

  public String getContLastName(){
       return DataType.getAsString(this.get(S_ContLastName));
  
  }
  public String getContLastNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContLastName));
      }

  public void initContType(int value){
     this.initProperty(S_ContType,new Integer(value));
  }
  public  void setContType(int value){
     this.set(S_ContType,new Integer(value));
  }
  public  void setContTypeNull(){
     this.set(S_ContType,null);
  }

  public int getContType(){
        return DataType.getAsInt(this.get(S_ContType));
  
  }
  public int getContTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ContType));
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

  public void initRegionType(String value){
     this.initProperty(S_RegionType,value);
  }
  public  void setRegionType(String value){
     this.set(S_RegionType,value);
  }
  public  void setRegionTypeNull(){
     this.set(S_RegionType,null);
  }

  public String getRegionType(){
       return DataType.getAsString(this.get(S_RegionType));
  
  }
  public String getRegionTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_RegionType));
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

  public void initContFirstName(String value){
     this.initProperty(S_ContFirstName,value);
  }
  public  void setContFirstName(String value){
     this.set(S_ContFirstName,value);
  }
  public  void setContFirstNameNull(){
     this.set(S_ContFirstName,null);
  }

  public String getContFirstName(){
       return DataType.getAsString(this.get(S_ContFirstName));
  
  }
  public String getContFirstNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContFirstName));
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

  public void initContLastNameQry(String value){
     this.initProperty(S_ContLastNameQry,value);
  }
  public  void setContLastNameQry(String value){
     this.set(S_ContLastNameQry,value);
  }
  public  void setContLastNameQryNull(){
     this.set(S_ContLastNameQry,null);
  }

  public String getContLastNameQry(){
       return DataType.getAsString(this.get(S_ContLastNameQry));
  
  }
  public String getContLastNameQryInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContLastNameQry));
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

  public void initContFirstNameQry(String value){
     this.initProperty(S_ContFirstNameQry,value);
  }
  public  void setContFirstNameQry(String value){
     this.set(S_ContFirstNameQry,value);
  }
  public  void setContFirstNameQryNull(){
     this.set(S_ContFirstNameQry,null);
  }

  public String getContFirstNameQry(){
       return DataType.getAsString(this.get(S_ContFirstNameQry));
  
  }
  public String getContFirstNameQryInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContFirstNameQry));
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

  public void initContMiddleNameQry(String value){
     this.initProperty(S_ContMiddleNameQry,value);
  }
  public  void setContMiddleNameQry(String value){
     this.set(S_ContMiddleNameQry,value);
  }
  public  void setContMiddleNameQryNull(){
     this.set(S_ContMiddleNameQry,null);
  }

  public String getContMiddleNameQry(){
       return DataType.getAsString(this.get(S_ContMiddleNameQry));
  
  }
  public String getContMiddleNameQryInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContMiddleNameQry));
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

  public void initContMiddleName(String value){
     this.initProperty(S_ContMiddleName,value);
  }
  public  void setContMiddleName(String value){
     this.set(S_ContMiddleName,value);
  }
  public  void setContMiddleNameNull(){
     this.set(S_ContMiddleName,null);
  }

  public String getContMiddleName(){
       return DataType.getAsString(this.get(S_ContMiddleName));
  
  }
  public String getContMiddleNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContMiddleName));
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

  public void initContSocialInterests(int value){
     this.initProperty(S_ContSocialInterests,new Integer(value));
  }
  public  void setContSocialInterests(int value){
     this.set(S_ContSocialInterests,new Integer(value));
  }
  public  void setContSocialInterestsNull(){
     this.set(S_ContSocialInterests,null);
  }

  public int getContSocialInterests(){
        return DataType.getAsInt(this.get(S_ContSocialInterests));
  
  }
  public int getContSocialInterestsInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ContSocialInterests));
      }

  public void initParentPartyId(long value){
     this.initProperty(S_ParentPartyId,new Long(value));
  }
  public  void setParentPartyId(long value){
     this.set(S_ParentPartyId,new Long(value));
  }
  public  void setParentPartyIdNull(){
     this.set(S_ParentPartyId,null);
  }

  public long getParentPartyId(){
        return DataType.getAsLong(this.get(S_ParentPartyId));
  
  }
  public long getParentPartyIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ParentPartyId));
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

  public void initJobDesc(String value){
     this.initProperty(S_JobDesc,value);
  }
  public  void setJobDesc(String value){
     this.set(S_JobDesc,value);
  }
  public  void setJobDescNull(){
     this.set(S_JobDesc,null);
  }

  public String getJobDesc(){
       return DataType.getAsString(this.get(S_JobDesc));
  
  }
  public String getJobDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_JobDesc));
      }

  public void initProvideId(int value){
     this.initProperty(S_ProvideId,new Integer(value));
  }
  public  void setProvideId(int value){
     this.set(S_ProvideId,new Integer(value));
  }
  public  void setProvideIdNull(){
     this.set(S_ProvideId,null);
  }

  public int getProvideId(){
        return DataType.getAsInt(this.get(S_ProvideId));
  
  }
  public int getProvideIdInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ProvideId));
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

  public void initIsInheritable(int value){
     this.initProperty(S_IsInheritable,new Integer(value));
  }
  public  void setIsInheritable(int value){
     this.set(S_IsInheritable,new Integer(value));
  }
  public  void setIsInheritableNull(){
     this.set(S_IsInheritable,null);
  }

  public int getIsInheritable(){
        return DataType.getAsInt(this.get(S_IsInheritable));
  
  }
  public int getIsInheritableInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IsInheritable));
      }

  public void initPartyType(int value){
     this.initProperty(S_PartyType,new Integer(value));
  }
  public  void setPartyType(int value){
     this.set(S_PartyType,new Integer(value));
  }
  public  void setPartyTypeNull(){
     this.set(S_PartyType,null);
  }

  public int getPartyType(){
        return DataType.getAsInt(this.get(S_PartyType));
  
  }
  public int getPartyTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_PartyType));
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


 
 }

