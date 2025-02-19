package com.asiainfo.crm.cm.inner.manager.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.inner.manager.ivalues.*;

public class QBOCmManagerBean extends DataContainer implements DataContainerInterface,IQBOCmManagerValue{

  private static String  m_boName = "com.asiainfo.crm.cm.inner.manager.bo.QBOCmManager";



  public final static  String S_PostAddress = "POST_ADDRESS";
  public final static  String S_ParentOrganizeId = "PARENT_ORGANIZE_ID";
  public final static  String S_ContactCertCode = "CONTACT_CERT_CODE";
  public final static  String S_CertCode = "CERT_CODE";
  public final static  String S_OrgCoopType = "ORG_COOP_TYPE";
  public final static  String S_OrgAddress = "ORG_ADDRESS";
  public final static  String S_ContactBillId = "CONTACT_BILL_ID";
  public final static  String S_CityId = "CITY_ID";
  public final static  String S_PostProvince = "POST_PROVINCE";
  public final static  String S_OrganizeType = "ORGANIZE_TYPE";
  public final static  String S_Hobby = "HOBBY";
  public final static  String S_EducationLevel = "EDUCATION_LEVEL";
  public final static  String S_CharacterDesc = "CHARACTER_DESC";
  public final static  String S_CertAddress = "CERT_ADDRESS";
  public final static  String S_SubRegionType = "SUB_REGION_TYPE";
  public final static  String S_IncomeLevel = "INCOME_LEVEL";
  public final static  String S_AlarmBillId = "ALARM_BILL_ID";
  public final static  String S_PostCity = "POST_CITY";
  public final static  String S_BrandNo = "BRAND_NO";
  public final static  String S_CertEffdate = "CERT_EFFDATE";
  public final static  String S_Code = "CODE";
  public final static  String S_EnglishName = "ENGLISH_NAME";
  public final static  String S_Lunar = "LUNAR";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OrganizeName = "ORGANIZE_NAME";
  public final static  String S_Name = "NAME";
  public final static  String S_PostPostcod = "POST_POSTCOD";
  public final static  String S_OrgAreaType = "ORG_AREA_TYPE";
  public final static  String S_ManagerName = "MANAGER_NAME";
  public final static  String S_ContEmail = "CONT_EMAIL";
  public final static  String S_IsBaseOrg = "IS_BASE_ORG";
  public final static  String S_ContactCertType = "CONTACT_CERT_TYPE";
  public final static  String S_StaffLevel = "STAFF_LEVEL";
  public final static  String S_RegionType = "REGION_TYPE";
  public final static  String S_OfficeTel = "OFFICE_TEL";
  public final static  String S_CertExpireDate = "CERT_EXPIRE_DATE";
  public final static  String S_IsAdminStaff = "IS_ADMIN_STAFF";
  public final static  String S_OrgShortName = "ORG_SHORT_NAME";
  public final static  String S_OnDutyTime = "ON_DUTY_TIME";
  public final static  String S_WirelessCall = "WIRELESS_CALL";
  public final static  String S_ComputerNum = "COMPUTER_NUM";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_HomeAddress = "HOME_ADDRESS";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_MemberNum = "MEMBER_NUM";
  public final static  String S_OrganizeId = "ORGANIZE_ID";
  public final static  String S_StaffType = "STAFF_TYPE";
  public final static  String S_PoliticsFace = "POLITICS_FACE";
  public final static  String S_NationalType = "NATIONAL_TYPE";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_PartyId = "PARTY_ID";
  public final static  String S_ContactName = "CONTACT_NAME";
  public final static  String S_Postcode = "POSTCODE";
  public final static  String S_SecurityId = "SECURITY_ID";
  public final static  String S_OrgLevel = "ORG_LEVEL";
  public final static  String S_ShortName = "SHORT_NAME";
  public final static  String S_Nationality = "NATIONALITY";
  public final static  String S_ParentStaffId = "PARENT_STAFF_ID";
  public final static  String S_BcMgr = "BC_MGR";
  public final static  String S_HomeTel = "HOME_TEL";
  public final static  String S_CarNo = "CAR_NO";
  public final static  String S_PhoneId = "PHONE_ID";
  public final static  String S_OrgEnglishName = "ORG_ENGLISH_NAME";
  public final static  String S_BusiLicence = "BUSI_LICENCE";
  public final static  String S_MarryStatus = "MARRY_STATUS";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_StaffName = "STAFF_NAME";
  public final static  String S_Email = "EMAIL";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_FaxId = "FAX_ID";
  public final static  String S_Birthday = "BIRTHDAY";
  public final static  String S_ContAddress = "CONT_ADDRESS";
  public final static  String S_Area = "AREA";
  public final static  String S_JobCompany = "JOB_COMPANY";
  public final static  String S_ProvinceId = "PROVINCE_ID";
  public final static  String S_FamilyInfo = "FAMILY_INFO";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_JobPosition = "JOB_POSITION";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_CertType = "CERT_TYPE";
  public final static  String S_StaffId = "STAFF_ID";
  public final static  String S_OrgPostcode = "ORG_POSTCODE";
  public final static  String S_DistrictId = "DISTRICT_ID";
  public final static  String S_CountyId = "COUNTY_ID";
  public final static  String S_Gender = "GENDER";
  public final static  String S_JobDesc = "JOB_DESC";
  public final static  String S_Religion = "RELIGION";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_OffDutyTime = "OFF_DUTY_TIME";
  public final static  String S_ManagerType = "MANAGER_TYPE";
  public final static  String S_ContFax = "CONT_FAX";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public QBOCmManagerBean() throws AIException{
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

  public void initParentOrganizeId(long value){
     this.initProperty(S_ParentOrganizeId,new Long(value));
  }
  public  void setParentOrganizeId(long value){
     this.set(S_ParentOrganizeId,new Long(value));
  }
  public  void setParentOrganizeIdNull(){
     this.set(S_ParentOrganizeId,null);
  }

  public long getParentOrganizeId(){
        return DataType.getAsLong(this.get(S_ParentOrganizeId));
  
  }
  public long getParentOrganizeIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ParentOrganizeId));
      }

  public void initContactCertCode(String value){
     this.initProperty(S_ContactCertCode,value);
  }
  public  void setContactCertCode(String value){
     this.set(S_ContactCertCode,value);
  }
  public  void setContactCertCodeNull(){
     this.set(S_ContactCertCode,null);
  }

  public String getContactCertCode(){
       return DataType.getAsString(this.get(S_ContactCertCode));
  
  }
  public String getContactCertCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContactCertCode));
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

  public void initOrgCoopType(int value){
     this.initProperty(S_OrgCoopType,new Integer(value));
  }
  public  void setOrgCoopType(int value){
     this.set(S_OrgCoopType,new Integer(value));
  }
  public  void setOrgCoopTypeNull(){
     this.set(S_OrgCoopType,null);
  }

  public int getOrgCoopType(){
        return DataType.getAsInt(this.get(S_OrgCoopType));
  
  }
  public int getOrgCoopTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_OrgCoopType));
      }

  public void initOrgAddress(String value){
     this.initProperty(S_OrgAddress,value);
  }
  public  void setOrgAddress(String value){
     this.set(S_OrgAddress,value);
  }
  public  void setOrgAddressNull(){
     this.set(S_OrgAddress,null);
  }

  public String getOrgAddress(){
       return DataType.getAsString(this.get(S_OrgAddress));
  
  }
  public String getOrgAddressInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OrgAddress));
      }

  public void initContactBillId(String value){
     this.initProperty(S_ContactBillId,value);
  }
  public  void setContactBillId(String value){
     this.set(S_ContactBillId,value);
  }
  public  void setContactBillIdNull(){
     this.set(S_ContactBillId,null);
  }

  public String getContactBillId(){
       return DataType.getAsString(this.get(S_ContactBillId));
  
  }
  public String getContactBillIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContactBillId));
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

  public void initPostProvince(String value){
     this.initProperty(S_PostProvince,value);
  }
  public  void setPostProvince(String value){
     this.set(S_PostProvince,value);
  }
  public  void setPostProvinceNull(){
     this.set(S_PostProvince,null);
  }

  public String getPostProvince(){
       return DataType.getAsString(this.get(S_PostProvince));
  
  }
  public String getPostProvinceInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PostProvince));
      }

  public void initOrganizeType(int value){
     this.initProperty(S_OrganizeType,new Integer(value));
  }
  public  void setOrganizeType(int value){
     this.set(S_OrganizeType,new Integer(value));
  }
  public  void setOrganizeTypeNull(){
     this.set(S_OrganizeType,null);
  }

  public int getOrganizeType(){
        return DataType.getAsInt(this.get(S_OrganizeType));
  
  }
  public int getOrganizeTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_OrganizeType));
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

  public void initPostCity(String value){
     this.initProperty(S_PostCity,value);
  }
  public  void setPostCity(String value){
     this.set(S_PostCity,value);
  }
  public  void setPostCityNull(){
     this.set(S_PostCity,null);
  }

  public String getPostCity(){
       return DataType.getAsString(this.get(S_PostCity));
  
  }
  public String getPostCityInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PostCity));
      }

  public void initBrandNo(String value){
     this.initProperty(S_BrandNo,value);
  }
  public  void setBrandNo(String value){
     this.set(S_BrandNo,value);
  }
  public  void setBrandNoNull(){
     this.set(S_BrandNo,null);
  }

  public String getBrandNo(){
       return DataType.getAsString(this.get(S_BrandNo));
  
  }
  public String getBrandNoInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BrandNo));
      }

  public void initCertEffdate(Timestamp value){
     this.initProperty(S_CertEffdate,value);
  }
  public  void setCertEffdate(Timestamp value){
     this.set(S_CertEffdate,value);
  }
  public  void setCertEffdateNull(){
     this.set(S_CertEffdate,null);
  }

  public Timestamp getCertEffdate(){
        return DataType.getAsDateTime(this.get(S_CertEffdate));
  
  }
  public Timestamp getCertEffdateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_CertEffdate));
      }

  public void initCode(String value){
     this.initProperty(S_Code,value);
  }
  public  void setCode(String value){
     this.set(S_Code,value);
  }
  public  void setCodeNull(){
     this.set(S_Code,null);
  }

  public String getCode(){
       return DataType.getAsString(this.get(S_Code));
  
  }
  public String getCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Code));
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

  public void initOrganizeName(String value){
     this.initProperty(S_OrganizeName,value);
  }
  public  void setOrganizeName(String value){
     this.set(S_OrganizeName,value);
  }
  public  void setOrganizeNameNull(){
     this.set(S_OrganizeName,null);
  }

  public String getOrganizeName(){
       return DataType.getAsString(this.get(S_OrganizeName));
  
  }
  public String getOrganizeNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OrganizeName));
      }

  public void initName(String value){
     this.initProperty(S_Name,value);
  }
  public  void setName(String value){
     this.set(S_Name,value);
  }
  public  void setNameNull(){
     this.set(S_Name,null);
  }

  public String getName(){
       return DataType.getAsString(this.get(S_Name));
  
  }
  public String getNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Name));
      }

  public void initPostPostcod(String value){
     this.initProperty(S_PostPostcod,value);
  }
  public  void setPostPostcod(String value){
     this.set(S_PostPostcod,value);
  }
  public  void setPostPostcodNull(){
     this.set(S_PostPostcod,null);
  }

  public String getPostPostcod(){
       return DataType.getAsString(this.get(S_PostPostcod));
  
  }
  public String getPostPostcodInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PostPostcod));
      }

  public void initOrgAreaType(int value){
     this.initProperty(S_OrgAreaType,new Integer(value));
  }
  public  void setOrgAreaType(int value){
     this.set(S_OrgAreaType,new Integer(value));
  }
  public  void setOrgAreaTypeNull(){
     this.set(S_OrgAreaType,null);
  }

  public int getOrgAreaType(){
        return DataType.getAsInt(this.get(S_OrgAreaType));
  
  }
  public int getOrgAreaTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_OrgAreaType));
      }

  public void initManagerName(String value){
     this.initProperty(S_ManagerName,value);
  }
  public  void setManagerName(String value){
     this.set(S_ManagerName,value);
  }
  public  void setManagerNameNull(){
     this.set(S_ManagerName,null);
  }

  public String getManagerName(){
       return DataType.getAsString(this.get(S_ManagerName));
  
  }
  public String getManagerNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ManagerName));
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

  public void initIsBaseOrg(int value){
     this.initProperty(S_IsBaseOrg,new Integer(value));
  }
  public  void setIsBaseOrg(int value){
     this.set(S_IsBaseOrg,new Integer(value));
  }
  public  void setIsBaseOrgNull(){
     this.set(S_IsBaseOrg,null);
  }

  public int getIsBaseOrg(){
        return DataType.getAsInt(this.get(S_IsBaseOrg));
  
  }
  public int getIsBaseOrgInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IsBaseOrg));
      }

  public void initContactCertType(int value){
     this.initProperty(S_ContactCertType,new Integer(value));
  }
  public  void setContactCertType(int value){
     this.set(S_ContactCertType,new Integer(value));
  }
  public  void setContactCertTypeNull(){
     this.set(S_ContactCertType,null);
  }

  public int getContactCertType(){
        return DataType.getAsInt(this.get(S_ContactCertType));
  
  }
  public int getContactCertTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ContactCertType));
      }

  public void initStaffLevel(int value){
     this.initProperty(S_StaffLevel,new Integer(value));
  }
  public  void setStaffLevel(int value){
     this.set(S_StaffLevel,new Integer(value));
  }
  public  void setStaffLevelNull(){
     this.set(S_StaffLevel,null);
  }

  public int getStaffLevel(){
        return DataType.getAsInt(this.get(S_StaffLevel));
  
  }
  public int getStaffLevelInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_StaffLevel));
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

  public void initIsAdminStaff(int value){
     this.initProperty(S_IsAdminStaff,new Integer(value));
  }
  public  void setIsAdminStaff(int value){
     this.set(S_IsAdminStaff,new Integer(value));
  }
  public  void setIsAdminStaffNull(){
     this.set(S_IsAdminStaff,null);
  }

  public int getIsAdminStaff(){
        return DataType.getAsInt(this.get(S_IsAdminStaff));
  
  }
  public int getIsAdminStaffInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IsAdminStaff));
      }

  public void initOrgShortName(String value){
     this.initProperty(S_OrgShortName,value);
  }
  public  void setOrgShortName(String value){
     this.set(S_OrgShortName,value);
  }
  public  void setOrgShortNameNull(){
     this.set(S_OrgShortName,null);
  }

  public String getOrgShortName(){
       return DataType.getAsString(this.get(S_OrgShortName));
  
  }
  public String getOrgShortNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OrgShortName));
      }

  public void initOnDutyTime(String value){
     this.initProperty(S_OnDutyTime,value);
  }
  public  void setOnDutyTime(String value){
     this.set(S_OnDutyTime,value);
  }
  public  void setOnDutyTimeNull(){
     this.set(S_OnDutyTime,null);
  }

  public String getOnDutyTime(){
       return DataType.getAsString(this.get(S_OnDutyTime));
  
  }
  public String getOnDutyTimeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OnDutyTime));
      }

  public void initWirelessCall(String value){
     this.initProperty(S_WirelessCall,value);
  }
  public  void setWirelessCall(String value){
     this.set(S_WirelessCall,value);
  }
  public  void setWirelessCallNull(){
     this.set(S_WirelessCall,null);
  }

  public String getWirelessCall(){
       return DataType.getAsString(this.get(S_WirelessCall));
  
  }
  public String getWirelessCallInitialValue(){
        return DataType.getAsString(this.getOldObj(S_WirelessCall));
      }

  public void initComputerNum(long value){
     this.initProperty(S_ComputerNum,new Long(value));
  }
  public  void setComputerNum(long value){
     this.set(S_ComputerNum,new Long(value));
  }
  public  void setComputerNumNull(){
     this.set(S_ComputerNum,null);
  }

  public long getComputerNum(){
        return DataType.getAsLong(this.get(S_ComputerNum));
  
  }
  public long getComputerNumInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ComputerNum));
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

  public void initMemberNum(long value){
     this.initProperty(S_MemberNum,new Long(value));
  }
  public  void setMemberNum(long value){
     this.set(S_MemberNum,new Long(value));
  }
  public  void setMemberNumNull(){
     this.set(S_MemberNum,null);
  }

  public long getMemberNum(){
        return DataType.getAsLong(this.get(S_MemberNum));
  
  }
  public long getMemberNumInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_MemberNum));
      }

  public void initOrganizeId(long value){
     this.initProperty(S_OrganizeId,new Long(value));
  }
  public  void setOrganizeId(long value){
     this.set(S_OrganizeId,new Long(value));
  }
  public  void setOrganizeIdNull(){
     this.set(S_OrganizeId,null);
  }

  public long getOrganizeId(){
        return DataType.getAsLong(this.get(S_OrganizeId));
  
  }
  public long getOrganizeIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_OrganizeId));
      }

  public void initStaffType(int value){
     this.initProperty(S_StaffType,new Integer(value));
  }
  public  void setStaffType(int value){
     this.set(S_StaffType,new Integer(value));
  }
  public  void setStaffTypeNull(){
     this.set(S_StaffType,null);
  }

  public int getStaffType(){
        return DataType.getAsInt(this.get(S_StaffType));
  
  }
  public int getStaffTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_StaffType));
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

  public void initContactName(String value){
     this.initProperty(S_ContactName,value);
  }
  public  void setContactName(String value){
     this.set(S_ContactName,value);
  }
  public  void setContactNameNull(){
     this.set(S_ContactName,null);
  }

  public String getContactName(){
       return DataType.getAsString(this.get(S_ContactName));
  
  }
  public String getContactNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContactName));
      }

  public void initPostcode(String value){
     this.initProperty(S_Postcode,value);
  }
  public  void setPostcode(String value){
     this.set(S_Postcode,value);
  }
  public  void setPostcodeNull(){
     this.set(S_Postcode,null);
  }

  public String getPostcode(){
       return DataType.getAsString(this.get(S_Postcode));
  
  }
  public String getPostcodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Postcode));
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

  public void initOrgLevel(int value){
     this.initProperty(S_OrgLevel,new Integer(value));
  }
  public  void setOrgLevel(int value){
     this.set(S_OrgLevel,new Integer(value));
  }
  public  void setOrgLevelNull(){
     this.set(S_OrgLevel,null);
  }

  public int getOrgLevel(){
        return DataType.getAsInt(this.get(S_OrgLevel));
  
  }
  public int getOrgLevelInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_OrgLevel));
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

  public void initParentStaffId(long value){
     this.initProperty(S_ParentStaffId,new Long(value));
  }
  public  void setParentStaffId(long value){
     this.set(S_ParentStaffId,new Long(value));
  }
  public  void setParentStaffIdNull(){
     this.set(S_ParentStaffId,null);
  }

  public long getParentStaffId(){
        return DataType.getAsLong(this.get(S_ParentStaffId));
  
  }
  public long getParentStaffIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ParentStaffId));
      }

  public void initBcMgr(String value){
     this.initProperty(S_BcMgr,value);
  }
  public  void setBcMgr(String value){
     this.set(S_BcMgr,value);
  }
  public  void setBcMgrNull(){
     this.set(S_BcMgr,null);
  }

  public String getBcMgr(){
       return DataType.getAsString(this.get(S_BcMgr));
  
  }
  public String getBcMgrInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BcMgr));
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

  public void initPhoneId(String value){
     this.initProperty(S_PhoneId,value);
  }
  public  void setPhoneId(String value){
     this.set(S_PhoneId,value);
  }
  public  void setPhoneIdNull(){
     this.set(S_PhoneId,null);
  }

  public String getPhoneId(){
       return DataType.getAsString(this.get(S_PhoneId));
  
  }
  public String getPhoneIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PhoneId));
      }

  public void initOrgEnglishName(String value){
     this.initProperty(S_OrgEnglishName,value);
  }
  public  void setOrgEnglishName(String value){
     this.set(S_OrgEnglishName,value);
  }
  public  void setOrgEnglishNameNull(){
     this.set(S_OrgEnglishName,null);
  }

  public String getOrgEnglishName(){
       return DataType.getAsString(this.get(S_OrgEnglishName));
  
  }
  public String getOrgEnglishNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OrgEnglishName));
      }

  public void initBusiLicence(String value){
     this.initProperty(S_BusiLicence,value);
  }
  public  void setBusiLicence(String value){
     this.set(S_BusiLicence,value);
  }
  public  void setBusiLicenceNull(){
     this.set(S_BusiLicence,null);
  }

  public String getBusiLicence(){
       return DataType.getAsString(this.get(S_BusiLicence));
  
  }
  public String getBusiLicenceInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BusiLicence));
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

  public void initStaffName(String value){
     this.initProperty(S_StaffName,value);
  }
  public  void setStaffName(String value){
     this.set(S_StaffName,value);
  }
  public  void setStaffNameNull(){
     this.set(S_StaffName,null);
  }

  public String getStaffName(){
       return DataType.getAsString(this.get(S_StaffName));
  
  }
  public String getStaffNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_StaffName));
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

  public void initFaxId(String value){
     this.initProperty(S_FaxId,value);
  }
  public  void setFaxId(String value){
     this.set(S_FaxId,value);
  }
  public  void setFaxIdNull(){
     this.set(S_FaxId,null);
  }

  public String getFaxId(){
       return DataType.getAsString(this.get(S_FaxId));
  
  }
  public String getFaxIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FaxId));
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

  public void initArea(int value){
     this.initProperty(S_Area,new Integer(value));
  }
  public  void setArea(int value){
     this.set(S_Area,new Integer(value));
  }
  public  void setAreaNull(){
     this.set(S_Area,null);
  }

  public int getArea(){
        return DataType.getAsInt(this.get(S_Area));
  
  }
  public int getAreaInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_Area));
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

  public void initStaffId(long value){
     this.initProperty(S_StaffId,new Long(value));
  }
  public  void setStaffId(long value){
     this.set(S_StaffId,new Long(value));
  }
  public  void setStaffIdNull(){
     this.set(S_StaffId,null);
  }

  public long getStaffId(){
        return DataType.getAsLong(this.get(S_StaffId));
  
  }
  public long getStaffIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_StaffId));
      }

  public void initOrgPostcode(String value){
     this.initProperty(S_OrgPostcode,value);
  }
  public  void setOrgPostcode(String value){
     this.set(S_OrgPostcode,value);
  }
  public  void setOrgPostcodeNull(){
     this.set(S_OrgPostcode,null);
  }

  public String getOrgPostcode(){
       return DataType.getAsString(this.get(S_OrgPostcode));
  
  }
  public String getOrgPostcodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OrgPostcode));
      }

  public void initDistrictId(String value){
     this.initProperty(S_DistrictId,value);
  }
  public  void setDistrictId(String value){
     this.set(S_DistrictId,value);
  }
  public  void setDistrictIdNull(){
     this.set(S_DistrictId,null);
  }

  public String getDistrictId(){
       return DataType.getAsString(this.get(S_DistrictId));
  
  }
  public String getDistrictIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DistrictId));
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

  public void initOffDutyTime(String value){
     this.initProperty(S_OffDutyTime,value);
  }
  public  void setOffDutyTime(String value){
     this.set(S_OffDutyTime,value);
  }
  public  void setOffDutyTimeNull(){
     this.set(S_OffDutyTime,null);
  }

  public String getOffDutyTime(){
       return DataType.getAsString(this.get(S_OffDutyTime));
  
  }
  public String getOffDutyTimeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OffDutyTime));
      }

  public void initManagerType(int value){
     this.initProperty(S_ManagerType,new Integer(value));
  }
  public  void setManagerType(int value){
     this.set(S_ManagerType,new Integer(value));
  }
  public  void setManagerTypeNull(){
     this.set(S_ManagerType,null);
  }

  public int getManagerType(){
        return DataType.getAsInt(this.get(S_ManagerType));
  
  }
  public int getManagerTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ManagerType));
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

