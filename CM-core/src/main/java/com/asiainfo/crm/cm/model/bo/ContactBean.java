package com.asiainfo.crm.cm.model.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.model.ivalues.*;

public class ContactBean extends DataContainer implements DataContainerInterface,IContactValue{

  private static String  m_boName = "com.asiainfo.crm.cm.model.bo.Contact";



  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_IncomeLevelDesc = "INCOME_LEVEL_DESC";
  public final static  String S_ContSocialInterests = "CONT_SOCIAL_INTERESTS";
  public final static  String S_ContTypeDesc = "CONT_TYPE_DESC";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_CharacterDesc = "CHARACTER_DESC";
  public final static  String S_ContClassDesc = "CONT_CLASS_DESC";
  public final static  String S_MotherName = "MOTHER_NAME";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_PrimartyIdNumber = "PRIMARTY_ID_NUMBER";
  public final static  String S_PostCode = "POST_CODE";
  public final static  String S_IsInheritable = "IS_INHERITABLE";
  public final static  String S_PartyNameQry = "PARTY_NAME_QRY";
  public final static  String S_Birthday = "BIRTHDAY";
  public final static  String S_ContAddress = "CONT_ADDRESS";
  public final static  String S_OfficeTel = "OFFICE_TEL";
  public final static  String S_Suffix = "SUFFIX";
  public final static  String S_CertCode = "CERT_CODE";
  public final static  String S_PlaceOfBirth = "PLACE_OF_BIRTH";
  public final static  String S_CarNo = "CAR_NO";
  public final static  String S_EducationLevel = "EDUCATION_LEVEL";
  public final static  String S_HomeTel = "HOME_TEL";
  public final static  String S_FamilyInfo = "FAMILY_INFO";
  public final static  String S_MemberType = "MEMBER_TYPE";
  public final static  String S_ProtoExpireDate = "PROTO_EXPIRE_DATE";
  public final static  String S_EmergencyNumber = "EMERGENCY_NUMBER";
  public final static  String S_ContBusiInterests = "CONT_BUSI_INTERESTS";
  public final static  String S_Religion = "RELIGION";
  public final static  String S_MainContNumber = "MAIN_CONT_NUMBER";
  public final static  String S_ContName = "CONT_NAME";
  public final static  String S_ProtoFileName = "PROTO_FILE_NAME";
  public final static  String S_LastNameQry = "LAST_NAME_QRY";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_Nationality = "NATIONALITY";
  public final static  String S_NationalTypeDesc = "NATIONAL_TYPE_DESC";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_IdFileName = "ID_FILE_NAME";
  public final static  String S_ContDesc = "CONT_DESC";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_SubRegionType = "SUB_REGION_TYPE";
  public final static  String S_ContLevelDesc = "CONT_LEVEL_DESC";
  public final static  String S_SecondContNumber = "SECOND_CONT_NUMBER";
  public final static  String S_CertTypeDesc = "CERT_TYPE_DESC";
  public final static  String S_EnglishName = "ENGLISH_NAME";
  public final static  String S_LastName = "LAST_NAME";
  public final static  String S_CityIdDesc = "CITY_ID_DESC";
  public final static  String S_PartyType = "PARTY_TYPE";
  public final static  String S_ParentPartyId = "PARENT_PARTY_ID";
  public final static  String S_MarryStatusDesc = "MARRY_STATUS_DESC";
  public final static  String S_PartyName = "PARTY_NAME";
  public final static  String S_MmsNumber = "MMS_NUMBER";
  public final static  String S_RegionType = "REGION_TYPE";
  public final static  String S_ContType = "CONT_TYPE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_ContClass = "CONT_CLASS";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_CertType = "CERT_TYPE";
  public final static  String S_MarryStatus = "MARRY_STATUS";
  public final static  String S_ContactPermissions = "CONTACT_PERMISSIONS";
  public final static  String S_HomeAddress = "HOME_ADDRESS";
  public final static  String S_MemberJob = "MEMBER_JOB";
  public final static  String S_GenderDesc = "GENDER_DESC";
  public final static  String S_PostAddress = "POST_ADDRESS";
  public final static  String S_PrioryLevel = "PRIORY_LEVEL";
  public final static  String S_Lunar = "LUNAR";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_LunarDesc = "LUNAR_DESC";
  public final static  String S_FirstNameQry = "FIRST_NAME_QRY";
  public final static  String S_CountyId = "COUNTY_ID";
  public final static  String S_IdValidDate = "ID_VALID_DATE";
  public final static  String S_ShortName = "SHORT_NAME";
  public final static  String S_ContFax = "CONT_FAX";
  public final static  String S_SecondaryIdType = "SECONDARY_ID_TYPE";
  public final static  String S_PartyTypeDesc = "PARTY_TYPE_DESC";
  public final static  String S_SecondEmail = "SECOND_EMAIL";
  public final static  String S_CustContId = "CUST_CONT_ID";
  public final static  String S_MemberDesc = "MEMBER_DESC";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_ContEmail = "CONT_EMAIL";
  public final static  String S_SecondaryIdNumber = "SECONDARY_ID_NUMBER";
  public final static  String S_AcctContId = "ACCT_CONT_ID";
  public final static  String S_ContNameQry = "CONT_NAME_QRY";
  //345&346
  public final static  String S_ContExpireDate = "CONT_EXPIRE_DATE";
  public final static  String S_ContDoneDate = "CONT_DONE_DATE";
  public final static  String S_Hobby = "HOBBY";
  public final static  String S_MainEmail = "MAIN_EMAIL";
  public final static  String S_CertExpireDate = "CERT_EXPIRE_DATE";
  public final static  String S_RegionTypeDesc = "REGION_TYPE_DESC";
  public final static  String S_Brand = "BRAND";
  public final static  String S_IncomeLevel = "INCOME_LEVEL";
  public final static  String S_MiddleNameQry = "MIDDLE_NAME_QRY";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_ContactDepartment = "CONTACT_DEPARTMENT";
  public final static  String S_CertAddress = "CERT_ADDRESS";
  public final static  String S_AlarmBillId = "ALARM_BILL_ID";
  public final static  String S_ProvideId = "PROVIDE_ID";
  public final static  String S_PartyId = "PARTY_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_ContMobile = "CONT_MOBILE";
  public final static  String S_SecurityId = "SECURITY_ID";
  public final static  String S_ProvinceIdDesc = "PROVINCE_ID_DESC";
  public final static  String S_State = "STATE";
  public final static  String S_ContId = "CONT_ID";
  public final static  String S_SmsNumber = "SMS_NUMBER";
  public final static  String S_FirstName = "FIRST_NAME";
  public final static  String S_CustCertEffdate = "CUST_CERT_EFFDATE";
  public final static  String S_EducationLevelDesc = "EDUCATION_LEVEL_DESC";
  public final static  String S_JobCompany = "JOB_COMPANY";
  public final static  String S_Gender = "GENDER";
  public final static  String S_ProvinceId = "PROVINCE_ID";
  public final static  String S_MiddleName = "MIDDLE_NAME";
  public final static  String S_SubRegionTypeDesc = "SUB_REGION_TYPE_DESC";
  public final static  String S_CountyIdDesc = "COUNTY_ID_DESC";
  public final static  String S_NationalType = "NATIONAL_TYPE";
  public final static  String S_ProtoValidDate = "PROTO_VALID_DATE";
  public final static  String S_IdExpireDate = "ID_EXPIRE_DATE";
  public final static  String S_NationalityDesc = "NATIONALITY_DESC";
  public final static  String S_PrimaryIdType = "PRIMARY_ID_TYPE";
  public final static  String S_JobDesc = "JOB_DESC";
  public final static  String S_JobPosition = "JOB_POSITION";
  public final static  String S_CityId = "CITY_ID";
  public final static  String S_PoliticsFaceDesc = "POLITICS_FACE_DESC";
  public final static  String S_PoliticsFace = "POLITICS_FACE";
  public final static  String S_Title = "TITLE";
  public final static  String S_ContLevel = "CONT_LEVEL";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public ContactBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
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

  public void initIncomeLevelDesc(String value){
     this.initProperty(S_IncomeLevelDesc,value);
  }
  public  void setIncomeLevelDesc(String value){
     this.set(S_IncomeLevelDesc,value);
  }
  public  void setIncomeLevelDescNull(){
     this.set(S_IncomeLevelDesc,null);
  }

  public String getIncomeLevelDesc(){
       return DataType.getAsString(this.get(S_IncomeLevelDesc));
  
  }
  public String getIncomeLevelDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_IncomeLevelDesc));
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

  public void initContTypeDesc(String value){
     this.initProperty(S_ContTypeDesc,value);
  }
  public  void setContTypeDesc(String value){
     this.set(S_ContTypeDesc,value);
  }
  public  void setContTypeDescNull(){
     this.set(S_ContTypeDesc,null);
  }

  public String getContTypeDesc(){
       return DataType.getAsString(this.get(S_ContTypeDesc));
  
  }
  public String getContTypeDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContTypeDesc));
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

  public void initContClassDesc(String value){
     this.initProperty(S_ContClassDesc,value);
  }
  public  void setContClassDesc(String value){
     this.set(S_ContClassDesc,value);
  }
  public  void setContClassDescNull(){
     this.set(S_ContClassDesc,null);
  }

  public String getContClassDesc(){
       return DataType.getAsString(this.get(S_ContClassDesc));
  
  }
  public String getContClassDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContClassDesc));
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

  public void initPrimartyIdNumber(String value){
     this.initProperty(S_PrimartyIdNumber,value);
  }
  public  void setPrimartyIdNumber(String value){
     this.set(S_PrimartyIdNumber,value);
  }
  public  void setPrimartyIdNumberNull(){
     this.set(S_PrimartyIdNumber,null);
  }

  public String getPrimartyIdNumber(){
       return DataType.getAsString(this.get(S_PrimartyIdNumber));
  
  }
  public String getPrimartyIdNumberInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PrimartyIdNumber));
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

  public void initSuffix(int value){
     this.initProperty(S_Suffix,new Integer(value));
  }
  public  void setSuffix(int value){
     this.set(S_Suffix,new Integer(value));
  }
  public  void setSuffixNull(){
     this.set(S_Suffix,null);
  }

  public int getSuffix(){
        return DataType.getAsInt(this.get(S_Suffix));
  
  }
  public int getSuffixInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_Suffix));
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

  public void initPlaceOfBirth(String value){
     this.initProperty(S_PlaceOfBirth,value);
  }
  public  void setPlaceOfBirth(String value){
     this.set(S_PlaceOfBirth,value);
  }
  public  void setPlaceOfBirthNull(){
     this.set(S_PlaceOfBirth,null);
  }

  public String getPlaceOfBirth(){
       return DataType.getAsString(this.get(S_PlaceOfBirth));
  
  }
  public String getPlaceOfBirthInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PlaceOfBirth));
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

  public void initEmergencyNumber(String value){
     this.initProperty(S_EmergencyNumber,value);
  }
  public  void setEmergencyNumber(String value){
     this.set(S_EmergencyNumber,value);
  }
  public  void setEmergencyNumberNull(){
     this.set(S_EmergencyNumber,null);
  }

  public String getEmergencyNumber(){
       return DataType.getAsString(this.get(S_EmergencyNumber));
  
  }
  public String getEmergencyNumberInitialValue(){
        return DataType.getAsString(this.getOldObj(S_EmergencyNumber));
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

  public void initMainContNumber(String value){
     this.initProperty(S_MainContNumber,value);
  }
  public  void setMainContNumber(String value){
     this.set(S_MainContNumber,value);
  }
  public  void setMainContNumberNull(){
     this.set(S_MainContNumber,null);
  }

  public String getMainContNumber(){
       return DataType.getAsString(this.get(S_MainContNumber));
  
  }
  public String getMainContNumberInitialValue(){
        return DataType.getAsString(this.getOldObj(S_MainContNumber));
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

  public void initNationalTypeDesc(String value){
     this.initProperty(S_NationalTypeDesc,value);
  }
  public  void setNationalTypeDesc(String value){
     this.set(S_NationalTypeDesc,value);
  }
  public  void setNationalTypeDescNull(){
     this.set(S_NationalTypeDesc,null);
  }

  public String getNationalTypeDesc(){
       return DataType.getAsString(this.get(S_NationalTypeDesc));
  
  }
  public String getNationalTypeDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_NationalTypeDesc));
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

  public void initContLevelDesc(String value){
     this.initProperty(S_ContLevelDesc,value);
  }
  public  void setContLevelDesc(String value){
     this.set(S_ContLevelDesc,value);
  }
  public  void setContLevelDescNull(){
     this.set(S_ContLevelDesc,null);
  }

  public String getContLevelDesc(){
       return DataType.getAsString(this.get(S_ContLevelDesc));
  
  }
  public String getContLevelDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContLevelDesc));
      }

  public void initSecondContNumber(String value){
     this.initProperty(S_SecondContNumber,value);
  }
  public  void setSecondContNumber(String value){
     this.set(S_SecondContNumber,value);
  }
  public  void setSecondContNumberNull(){
     this.set(S_SecondContNumber,null);
  }

  public String getSecondContNumber(){
       return DataType.getAsString(this.get(S_SecondContNumber));
  
  }
  public String getSecondContNumberInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SecondContNumber));
      }

  public void initCertTypeDesc(String value){
     this.initProperty(S_CertTypeDesc,value);
  }
  public  void setCertTypeDesc(String value){
     this.set(S_CertTypeDesc,value);
  }
  public  void setCertTypeDescNull(){
     this.set(S_CertTypeDesc,null);
  }

  public String getCertTypeDesc(){
       return DataType.getAsString(this.get(S_CertTypeDesc));
  
  }
  public String getCertTypeDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CertTypeDesc));
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

  public void initCityIdDesc(String value){
     this.initProperty(S_CityIdDesc,value);
  }
  public  void setCityIdDesc(String value){
     this.set(S_CityIdDesc,value);
  }
  public  void setCityIdDescNull(){
     this.set(S_CityIdDesc,null);
  }

  public String getCityIdDesc(){
       return DataType.getAsString(this.get(S_CityIdDesc));
  
  }
  public String getCityIdDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CityIdDesc));
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

  public void initMarryStatusDesc(String value){
     this.initProperty(S_MarryStatusDesc,value);
  }
  public  void setMarryStatusDesc(String value){
     this.set(S_MarryStatusDesc,value);
  }
  public  void setMarryStatusDescNull(){
     this.set(S_MarryStatusDesc,null);
  }

  public String getMarryStatusDesc(){
       return DataType.getAsString(this.get(S_MarryStatusDesc));
  
  }
  public String getMarryStatusDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_MarryStatusDesc));
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

  public void initMmsNumber(String value){
     this.initProperty(S_MmsNumber,value);
  }
  public  void setMmsNumber(String value){
     this.set(S_MmsNumber,value);
  }
  public  void setMmsNumberNull(){
     this.set(S_MmsNumber,null);
  }

  public String getMmsNumber(){
       return DataType.getAsString(this.get(S_MmsNumber));
  
  }
  public String getMmsNumberInitialValue(){
        return DataType.getAsString(this.getOldObj(S_MmsNumber));
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

  public void initAcctId(long value){
     this.initProperty(S_AcctId,new Long(value));
  }
  public  void setAcctId(long value){
     this.set(S_AcctId,new Long(value));
  }
  public  void setAcctIdNull(){
     this.set(S_AcctId,null);
  }

  public long getAcctId(){
        return DataType.getAsLong(this.get(S_AcctId));
  
  }
  public long getAcctIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_AcctId));
      }

  public void initCertType(long value){
     this.initProperty(S_CertType,new Long(value));
  }
  public  void setCertType(long value){
     this.set(S_CertType,new Long(value));
  }
  public  void setCertTypeNull(){
     this.set(S_CertType,null);
  }

  public long getCertType(){
        return DataType.getAsLong(this.get(S_CertType));
  
  }
  public long getCertTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CertType));
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

  public void initGenderDesc(String value){
     this.initProperty(S_GenderDesc,value);
  }
  public  void setGenderDesc(String value){
     this.set(S_GenderDesc,value);
  }
  public  void setGenderDescNull(){
     this.set(S_GenderDesc,null);
  }

  public String getGenderDesc(){
       return DataType.getAsString(this.get(S_GenderDesc));
  
  }
  public String getGenderDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_GenderDesc));
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

  public void initLunarDesc(String value){
     this.initProperty(S_LunarDesc,value);
  }
  public  void setLunarDesc(String value){
     this.set(S_LunarDesc,value);
  }
  public  void setLunarDescNull(){
     this.set(S_LunarDesc,null);
  }

  public String getLunarDesc(){
       return DataType.getAsString(this.get(S_LunarDesc));
  
  }
  public String getLunarDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_LunarDesc));
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

  public void initSecondaryIdType(int value){
     this.initProperty(S_SecondaryIdType,new Integer(value));
  }
  public  void setSecondaryIdType(int value){
     this.set(S_SecondaryIdType,new Integer(value));
  }
  public  void setSecondaryIdTypeNull(){
     this.set(S_SecondaryIdType,null);
  }

  public int getSecondaryIdType(){
        return DataType.getAsInt(this.get(S_SecondaryIdType));
  
  }
  public int getSecondaryIdTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_SecondaryIdType));
      }

  public void initPartyTypeDesc(String value){
     this.initProperty(S_PartyTypeDesc,value);
  }
  public  void setPartyTypeDesc(String value){
     this.set(S_PartyTypeDesc,value);
  }
  public  void setPartyTypeDescNull(){
     this.set(S_PartyTypeDesc,null);
  }

  public String getPartyTypeDesc(){
       return DataType.getAsString(this.get(S_PartyTypeDesc));
  
  }
  public String getPartyTypeDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PartyTypeDesc));
      }

  public void initSecondEmail(String value){
     this.initProperty(S_SecondEmail,value);
  }
  public  void setSecondEmail(String value){
     this.set(S_SecondEmail,value);
  }
  public  void setSecondEmailNull(){
     this.set(S_SecondEmail,null);
  }

  public String getSecondEmail(){
       return DataType.getAsString(this.get(S_SecondEmail));
  
  }
  public String getSecondEmailInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SecondEmail));
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

  public void initSecondaryIdNumber(String value){
     this.initProperty(S_SecondaryIdNumber,value);
  }
  public  void setSecondaryIdNumber(String value){
     this.set(S_SecondaryIdNumber,value);
  }
  public  void setSecondaryIdNumberNull(){
     this.set(S_SecondaryIdNumber,null);
  }

  public String getSecondaryIdNumber(){
       return DataType.getAsString(this.get(S_SecondaryIdNumber));
  
  }
  public String getSecondaryIdNumberInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SecondaryIdNumber));
      }

  public void initAcctContId(long value){
     this.initProperty(S_AcctContId,new Long(value));
  }
  public  void setAcctContId(long value){
     this.set(S_AcctContId,new Long(value));
  }
  public  void setAcctContIdNull(){
     this.set(S_AcctContId,null);
  }

  public long getAcctContId(){
        return DataType.getAsLong(this.get(S_AcctContId));
  
  }
  public long getAcctContIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_AcctContId));
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
  
  public void initContExpireDate(Timestamp value){
	     this.initProperty(S_ContExpireDate,value);
	  }
  public  void setContExpireDate(Timestamp value){
     this.set(S_ContExpireDate,value);
  }
  public  void setContExpireDateNull(){
     this.set(S_ContExpireDate,null);
  }

  public Timestamp getContExpireDate(){
      return DataType.getAsDateTime(this.get(S_ContExpireDate));

  }
  public Timestamp getContExpireDateValue(){
      return DataType.getAsDateTime(this.getOldObj(S_ContExpireDate));
    }
  
  public void initContDoneDate(Timestamp value){
	  this.initProperty(S_ContDoneDate,value);
  }
  public  void setContDoneDate(Timestamp value){
	  this.set(S_ContDoneDate,value);
  }
  public  void setContDoneDateNull(){
	  this.set(S_ContDoneDate,null);
  }
  
  public Timestamp getContDoneDate(){
	  return DataType.getAsDateTime(this.get(S_ContDoneDate));
	  
  }
  public Timestamp getContDoneDateValue(){
	  return DataType.getAsDateTime(this.getOldObj(S_ContDoneDate));
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

  public void initMainEmail(String value){
     this.initProperty(S_MainEmail,value);
  }
  public  void setMainEmail(String value){
     this.set(S_MainEmail,value);
  }
  public  void setMainEmailNull(){
     this.set(S_MainEmail,null);
  }

  public String getMainEmail(){
       return DataType.getAsString(this.get(S_MainEmail));
  
  }
  public String getMainEmailInitialValue(){
        return DataType.getAsString(this.getOldObj(S_MainEmail));
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

  public void initRegionTypeDesc(String value){
     this.initProperty(S_RegionTypeDesc,value);
  }
  public  void setRegionTypeDesc(String value){
     this.set(S_RegionTypeDesc,value);
  }
  public  void setRegionTypeDescNull(){
     this.set(S_RegionTypeDesc,null);
  }

  public String getRegionTypeDesc(){
       return DataType.getAsString(this.get(S_RegionTypeDesc));
  
  }
  public String getRegionTypeDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_RegionTypeDesc));
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

  public void initProvinceIdDesc(String value){
     this.initProperty(S_ProvinceIdDesc,value);
  }
  public  void setProvinceIdDesc(String value){
     this.set(S_ProvinceIdDesc,value);
  }
  public  void setProvinceIdDescNull(){
     this.set(S_ProvinceIdDesc,null);
  }

  public String getProvinceIdDesc(){
       return DataType.getAsString(this.get(S_ProvinceIdDesc));
  
  }
  public String getProvinceIdDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ProvinceIdDesc));
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

  public void initSmsNumber(String value){
     this.initProperty(S_SmsNumber,value);
  }
  public  void setSmsNumber(String value){
     this.set(S_SmsNumber,value);
  }
  public  void setSmsNumberNull(){
     this.set(S_SmsNumber,null);
  }

  public String getSmsNumber(){
       return DataType.getAsString(this.get(S_SmsNumber));
  
  }
  public String getSmsNumberInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SmsNumber));
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

  public void initEducationLevelDesc(String value){
     this.initProperty(S_EducationLevelDesc,value);
  }
  public  void setEducationLevelDesc(String value){
     this.set(S_EducationLevelDesc,value);
  }
  public  void setEducationLevelDescNull(){
     this.set(S_EducationLevelDesc,null);
  }

  public String getEducationLevelDesc(){
       return DataType.getAsString(this.get(S_EducationLevelDesc));
  
  }
  public String getEducationLevelDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_EducationLevelDesc));
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

  public void initSubRegionTypeDesc(String value){
     this.initProperty(S_SubRegionTypeDesc,value);
  }
  public  void setSubRegionTypeDesc(String value){
     this.set(S_SubRegionTypeDesc,value);
  }
  public  void setSubRegionTypeDescNull(){
     this.set(S_SubRegionTypeDesc,null);
  }

  public String getSubRegionTypeDesc(){
       return DataType.getAsString(this.get(S_SubRegionTypeDesc));
  
  }
  public String getSubRegionTypeDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SubRegionTypeDesc));
      }

  public void initCountyIdDesc(String value){
     this.initProperty(S_CountyIdDesc,value);
  }
  public  void setCountyIdDesc(String value){
     this.set(S_CountyIdDesc,value);
  }
  public  void setCountyIdDescNull(){
     this.set(S_CountyIdDesc,null);
  }

  public String getCountyIdDesc(){
       return DataType.getAsString(this.get(S_CountyIdDesc));
  
  }
  public String getCountyIdDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CountyIdDesc));
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

  public void initNationalityDesc(String value){
     this.initProperty(S_NationalityDesc,value);
  }
  public  void setNationalityDesc(String value){
     this.set(S_NationalityDesc,value);
  }
  public  void setNationalityDescNull(){
     this.set(S_NationalityDesc,null);
  }

  public String getNationalityDesc(){
       return DataType.getAsString(this.get(S_NationalityDesc));
  
  }
  public String getNationalityDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_NationalityDesc));
      }

  public void initPrimaryIdType(int value){
     this.initProperty(S_PrimaryIdType,new Integer(value));
  }
  public  void setPrimaryIdType(int value){
     this.set(S_PrimaryIdType,new Integer(value));
  }
  public  void setPrimaryIdTypeNull(){
     this.set(S_PrimaryIdType,null);
  }

  public int getPrimaryIdType(){
        return DataType.getAsInt(this.get(S_PrimaryIdType));
  
  }
  public int getPrimaryIdTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_PrimaryIdType));
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

  public void initPoliticsFaceDesc(String value){
     this.initProperty(S_PoliticsFaceDesc,value);
  }
  public  void setPoliticsFaceDesc(String value){
     this.set(S_PoliticsFaceDesc,value);
  }
  public  void setPoliticsFaceDescNull(){
     this.set(S_PoliticsFaceDesc,null);
  }

  public String getPoliticsFaceDesc(){
       return DataType.getAsString(this.get(S_PoliticsFaceDesc));
  
  }
  public String getPoliticsFaceDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PoliticsFaceDesc));
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

  public void initTitle(int value){
     this.initProperty(S_Title,new Integer(value));
  }
  public  void setTitle(int value){
     this.set(S_Title,new Integer(value));
  }
  public  void setTitleNull(){
     this.set(S_Title,null);
  }

  public int getTitle(){
        return DataType.getAsInt(this.get(S_Title));
  
  }
  public int getTitleInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_Title));
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
 
 }

