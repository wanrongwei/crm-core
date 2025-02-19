package com.asiainfo.crm.cm.model.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.model.ivalues.*;

public class CustomerBean extends DataContainer implements DataContainerInterface,ICustomerValue{

  private static String  m_boName = "com.asiainfo.crm.cm.model.bo.Customer";



  public final static  String S_GroupType = "GROUP_TYPE";
  public final static  String S_IncomeLevelDesc = "INCOME_LEVEL_DESC";
  public final static  String S_AccountCycle = "ACCOUNT_CYCLE";
  public final static  String S_CustCertType = "CUST_CERT_TYPE";
  public final static  String S_Ext20 = "EXT20";
  public final static  String S_Ext15 = "EXT15";
  public final static  String S_MotherName = "MOTHER_NAME";
  public final static  String S_CoName = "CO_NAME";
  public final static  String S_Ext14 = "EXT14";
  public final static  String S_Ext17 = "EXT17";
  public final static  String S_Ext16 = "EXT16";
  public final static  String S_Ext11 = "EXT11";
  public final static  String S_OrgIdDesc = "ORG_ID_DESC";
  public final static  String S_Ext10 = "EXT10";
  public final static  String S_Pnr = "PNR";
  public final static  String S_Ext13 = "EXT13";
  public final static  String S_Ext12 = "EXT12";
  public final static  String S_CustStatusDesc = "CUST_STATUS_DESC";
  public final static  String S_Ext19 = "EXT19";
  public final static  String S_CustPassword = "CUST_PASSWORD";
  public final static  String S_Ext18 = "EXT18";
  public final static  String S_Birthday = "BIRTHDAY";
  public final static  String S_ContAddress = "CONT_ADDRESS";
  public final static  String S_VillegeIdDesc = "VILLEGE_ID_DESC";
  public final static  String S_LegalCustId = "LEGAL_CUST_ID";
  public final static  String S_IndivCustSegment = "INDIV_CUST_SEGMENT";
  public final static  String S_FamilyInfo = "FAMILY_INFO";
  public final static  String S_IsVip = "IS_VIP";
  public final static  String S_RegistrationNumber = "REGISTRATION_NUMBER";
  public final static  String S_Budget = "BUDGET";
  public final static  String S_ServEndTime = "SERV_END_TIME";
  public final static  String S_CreditLevelDesc = "CREDIT_LEVEL_DESC";
  public final static  String S_ManualCommercialProtection = "MANUAL_COMMERCIAL_PROTECTION";
  public final static  String S_ContactProtection = "CONTACT_PROTECTION";
  public final static  String S_Established = "ESTABLISHED";
  public final static  String S_SubVocation = "SUB_VOCATION";
  public final static  String S_ContName = "CONT_NAME";
  public final static  String S_CustCertTypeDesc = "CUST_CERT_TYPE_DESC";
  public final static  String S_Nationality = "NATIONALITY";
  public final static  String S_NationalTypeDesc = "NATIONAL_TYPE_DESC";
  public final static  String S_DevelopType = "DEVELOP_TYPE";
  public final static  String S_GuardianName = "GUARDIAN_NAME";
  public final static  String S_ContDesc = "CONT_DESC";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_GroupTypeDesc = "GROUP_TYPE_DESC";
  public final static  String S_SubRegionType = "SUB_REGION_TYPE";
  public final static  String S_EnglishName = "ENGLISH_NAME";
  public final static  String S_AksRegistrationDate = "AKS_REGISTRATION_DATE";
  public final static  String S_OccupationDesc = "OCCUPATION_DESC";
  public final static  String S_IsProtected = "IS_PROTECTED";
  public final static  String S_CustCertAddress = "CUST_CERT_ADDRESS";
  public final static  String S_MarryStatusDesc = "MARRY_STATUS_DESC";
  public final static  String S_BirthPlace = "BIRTH_PLACE";
  public final static  String S_LegalCustName = "LEGAL_CUST_NAME";
  public final static  String S_GroupCustSegment = "GROUP_CUST_SEGMENT";
  public final static  String S_PreferStore = "PREFER_STORE";
  public final static  String S_StockExchangeFlag = "STOCK_EXCHANGE_FLAG";
  public final static  String S_PoBox = "PO_BOX";
  public final static  String S_VocationDesc = "VOCATION_DESC";
  public final static  String S_MarryStatus = "MARRY_STATUS";
  public final static  String S_ExportTurnoverRatio = "EXPORT_TURNOVER_RATIO";
  public final static  String S_Ext1 = "EXT1";
  public final static  String S_Ext2 = "EXT2";
  public final static  String S_Ext3 = "EXT3";
  public final static  String S_Ext4 = "EXT4";
  public final static  String S_HeadOffice = "HEAD_OFFICE";
  public final static  String S_PersonStatus = "PERSON_STATUS";
  public final static  String S_Ext5 = "EXT5";
  public final static  String S_Ext6 = "EXT6";
  public final static  String S_Ext7 = "EXT7";
  public final static  String S_Ext8 = "EXT8";
  public final static  String S_GenderDesc = "GENDER_DESC";
  public final static  String S_Ext9 = "EXT9";
  public final static  String S_PostAddress = "POST_ADDRESS";
  public final static  String S_Occupation = "OCCUPATION";
  public final static  String S_TaxFlag = "TAX_FLAG";
  public final static  String S_Lunar = "LUNAR";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_ProtectEffDate = "PROTECT_EFF_DATE";
  public final static  String S_LunarDesc = "LUNAR_DESC";
  public final static  String S_WorkplaceNumber = "WORKPLACE_NUMBER";
  public final static  String S_MultiProvince = "MULTI_PROVINCE";
  public final static  String S_CountyId = "COUNTY_ID";
  public final static  String S_SendPersonName = "SEND_PERSON_NAME";
  public final static  String S_ShortName = "SHORT_NAME";
  public final static  String S_ContFax = "CONT_FAX";
  public final static  String S_ProtectExpireDate = "PROTECT_EXPIRE_DATE";
  public final static  String S_VirtualCustTypeDesc = "VIRTUAL_CUST_TYPE_DESC";
  public final static  String S_GroupWeb = "GROUP_WEB";
  public final static  String S_GroupDate = "GROUP_DATE";
  public final static  String S_StatusEffDate = "STATUS_EFF_DATE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_IsVipDesc = "IS_VIP_DESC";
  public final static  String S_CurResidenceStrDate = "CUR_RESIDENCE_STR_DATE";
  public final static  String S_CustServiceId = "CUST_SERVICE_ID";
  public final static  String S_TownId = "TOWN_ID";
  public final static  String S_ContEmail = "CONT_EMAIL";
  public final static  String S_FormerName = "FORMER_NAME";
  public final static  String S_Vocation = "VOCATION";
  public final static  String S_RegAmount = "REG_AMOUNT";
  public final static  String S_CustType = "CUST_TYPE";
  public final static  String S_RegionTypeDesc = "REGION_TYPE_DESC";
  public final static  String S_BiCompanyName = "BI_COMPANY_NAME";
  public final static  String S_ManagerId = "MANAGER_ID";
  public final static  String S_MiddleNameQry = "MIDDLE_NAME_QRY";
  public final static  String S_IndivCustId = "INDIV_CUST_ID";
  public final static  String S_PartyId = "PARTY_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_UpdateFlag = "UPDATE_FLAG";
  public final static  String S_ContMobile = "CONT_MOBILE";
  public final static  String S_CustZipcode = "CUST_ZIPCODE";
  public final static  String S_State = "STATE";
  public final static  String S_PerferLanguage = "PERFER_LANGUAGE";
  public final static  String S_ContId = "CONT_ID";
  public final static  String S_CurrencyCode = "CURRENCY_CODE";
  public final static  String S_TownIdDesc = "TOWN_ID_DESC";
  public final static  String S_CustCertEffdate = "CUST_CERT_EFFDATE";
  public final static  String S_DevelopTypeDesc = "DEVELOP_TYPE_DESC";
  public final static  String S_GroupSubType = "GROUP_SUB_TYPE";
  public final static  String S_CustCertExpire = "CUST_CERT_EXPIRE";
  public final static  String S_EducationLevelDesc = "EDUCATION_LEVEL_DESC";
  public final static  String S_AnonymousFlag = "ANONYMOUS_FLAG";
  public final static  String S_ProvinceId = "PROVINCE_ID";
  public final static  String S_GroupFax = "GROUP_FAX";
  public final static  String S_QqNo = "QQ_NO";
  public final static  String S_SubRegionTypeDesc = "SUB_REGION_TYPE_DESC";
  public final static  String S_SegmentId = "SEGMENT_ID";
  public final static  String S_NationalType = "NATIONAL_TYPE";
  public final static  String S_RealNameFlagDesc = "REAL_NAME_FLAG_DESC";
  public final static  String S_IndivCustType = "INDIV_CUST_TYPE";
  public final static  String S_ManualProtectExpireDate = "MANUAL_PROTECT_EXPIRE_DATE";
  public final static  String S_NationalityDesc = "NATIONALITY_DESC";
  public final static  String S_ServBeginTime = "SERV_BEGIN_TIME";
  public final static  String S_SeNumber = "SE_NUMBER";
  public final static  String S_JobPosition = "JOB_POSITION";
  public final static  String S_ManagerName = "MANAGER_NAME";
  public final static  String S_ManagerPhone = "MANAGER_PHONE";
  public final static  String S_BlogNo = "BLOG_NO";
  public final static  String S_PoliticsFace = "POLITICS_FACE";
  public final static  String S_CustServiceLevelDesc = "CUST_SERVICE_LEVEL_DESC";
  public final static  String S_CreditValue = "CREDIT_VALUE";
  public final static  String S_VillegeId = "VILLEGE_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_AksStatus = "AKS_STATUS";
  public final static  String S_CharacterDesc = "CHARACTER_DESC";
  public final static  String S_RegistrationCode = "REGISTRATION_CODE";
  public final static  String S_IndivCustTypeDesc = "INDIV_CUST_TYPE_DESC";
  public final static  String S_PostCode = "POST_CODE";
  public final static  String S_OfficeTel = "OFFICE_TEL";
  public final static  String S_PhysiologicalState = "PHYSIOLOGICAL_STATE";
  public final static  String S_EducationLevel = "EDUCATION_LEVEL";
  public final static  String S_HomeTel = "HOME_TEL";
  public final static  String S_CustServiceLevel = "CUST_SERVICE_LEVEL";
  public final static  String S_Religion = "RELIGION";
  public final static  String S_StaffAmountType = "STAFF_AMOUNT_TYPE";
  public final static  String S_LastNameQry = "LAST_NAME_QRY";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_CustCertCode = "CUST_CERT_CODE";
  public final static  String S_CustNameQry = "CUST_NAME_QRY";
  public final static  String S_CustAddress = "CUST_ADDRESS";
  public final static  String S_LastName = "LAST_NAME";
  public final static  String S_MemberNum = "MEMBER_NUM";
  public final static  String S_EcCode = "EC_CODE";
  public final static  String S_TaxId = "TAX_ID";
  public final static  String S_CprStatus = "CPR_STATUS";
  public final static  String S_RegionType = "REGION_TYPE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_Attorneys = "ATTORNEYS";
  public final static  String S_OpIdDesc = "OP_ID_DESC";
  public final static  String S_ParentCustId = "PARENT_CUST_ID";
  public final static  String S_CreditLevel = "CREDIT_LEVEL";
  public final static  String S_FamilyPhone = "FAMILY_PHONE";
  public final static  String S_IsVpmn = "IS_VPMN";
  public final static  String S_CustStatus = "CUST_STATUS";
  public final static  String S_ManualProtectEffectiveDate = "MANUAL_PROTECT_EFFECTIVE_DATE";
  public final static  String S_PrioryLevel = "PRIORY_LEVEL";
  public final static  String S_ServProtocolPath = "SERV_PROTOCOL_PATH";
  public final static  String S_CompanyFormCode = "COMPANY_FORM_CODE";
  public final static  String S_Alias = "ALIAS";
  public final static  String S_FirstNameQry = "FIRST_NAME_QRY";
  public final static  String S_SegmentName = "SEGMENT_NAME";
  public final static  String S_GroupSegmentId = "GROUP_SEGMENT_ID";
  public final static  String S_CustLevel = "CUST_LEVEL";
  public final static  String S_CustSegment = "CUST_SEGMENT";
  public final static  String S_WorkplaceCode = "WORKPLACE_CODE";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_LegalForm = "LEGAL_FORM";
  public final static  String S_CertificateFilePath = "CERTIFICATE_FILE_PATH";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_BadPayerFlag = "BAD_PAYER_FLAG";
  public final static  String S_ExpenseType = "EXPENSE_TYPE";
  public final static  String S_CustLanguage = "CUST_LANGUAGE";
  public final static  String S_EntTotalEmployees = "ENT_TOTAL_EMPLOYEES";
  public final static  String S_Hobby = "HOBBY";
  public final static  String S_GuardianDate = "GUARDIAN_DATE";
  public final static  String S_IncomeLevel = "INCOME_LEVEL";
  public final static  String S_CprStatusDate = "CPR_STATUS_DATE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_CustTypeDesc = "CUST_TYPE_DESC";
  public final static  String S_IsRevisable = "IS_REVISABLE";
  public final static  String S_CorporateIdentificationNumbe = "CORPORATE_IDENTIFICATION_NUMBE";
  public final static  String S_AddressId = "ADDRESS_ID";
  public final static  String S_BadPayer = "BAD_PAYER";
  public final static  String S_ExportCountryCode = "EXPORT_COUNTRY_CODE";
  public final static  String S_RealNameFlag = "REAL_NAME_FLAG";
  public final static  String S_DirectMarketingProtection = "DIRECT_MARKETING_PROTECTION";
  public final static  String S_FirstName = "FIRST_NAME";
  public final static  String S_VirtualCustType = "VIRTUAL_CUST_TYPE";
  public final static  String S_JobCompany = "JOB_COMPANY";
  public final static  String S_Gender = "GENDER";
  public final static  String S_MiddleName = "MIDDLE_NAME";
  public final static  String S_PostProvince = "POST_PROVINCE";
  public final static  String S_RegistrationDate = "REGISTRATION_DATE";
  public final static  String S_CountyIdDesc = "COUNTY_ID_DESC";
  public final static  String S_SubVocationDesc = "SUB_VOCATION_DESC";
  public final static  String S_HqNumber = "HQ_NUMBER";
  public final static  String S_Ext30 = "EXT30";
  public final static  String S_PostalCity = "POSTAL_CITY";
  public final static  String S_CompanyStatus = "COMPANY_STATUS";
  public final static  String S_Ext26 = "EXT26";
  public final static  String S_Ext25 = "EXT25";
  public final static  String S_MultiProvinceDesc = "MULTI_PROVINCE_DESC";
  public final static  String S_Ext28 = "EXT28";
  public final static  String S_CityId = "CITY_ID";
  public final static  String S_Ext27 = "EXT27";
  public final static  String S_PoliticsFaceDesc = "POLITICS_FACE_DESC";
  public final static  String S_Ext22 = "EXT22";
  public final static  String S_Ext21 = "EXT21";
  public final static  String S_Ext24 = "EXT24";
  public final static  String S_Ext23 = "EXT23";
  public final static  String S_StaffAmount = "STAFF_AMOUNT";
  public final static  String S_CustControlType = "CUST_CONTROL_TYPE";
  public final static  String S_Ext29 = "EXT29";
  public final static  String S_CustName = "CUST_NAME";
  public final static  String S_PartyName = "PARTY_NAME";
  public final static  String S_GuardianContAddress = "GUARDIAN_CONT_ADDRESS";
  public final static  String S_GuardianContEmail = "GUARDIAN_CONT_EMAIL";
  public final static  String S_GuardianContMobile = "GUARDIAN_CONT_MOBILE";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public CustomerBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
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

  public void initAccountCycle(int value){
     this.initProperty(S_AccountCycle,new Integer(value));
  }
  public  void setAccountCycle(int value){
     this.set(S_AccountCycle,new Integer(value));
  }
  public  void setAccountCycleNull(){
     this.set(S_AccountCycle,null);
  }

  public int getAccountCycle(){
        return DataType.getAsInt(this.get(S_AccountCycle));
  
  }
  public int getAccountCycleInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_AccountCycle));
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

  public void initOrgIdDesc(String value){
     this.initProperty(S_OrgIdDesc,value);
  }
  public  void setOrgIdDesc(String value){
     this.set(S_OrgIdDesc,value);
  }
  public  void setOrgIdDescNull(){
     this.set(S_OrgIdDesc,null);
  }

  public String getOrgIdDesc(){
       return DataType.getAsString(this.get(S_OrgIdDesc));
  
  }
  public String getOrgIdDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OrgIdDesc));
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

  public void initCustStatusDesc(String value){
     this.initProperty(S_CustStatusDesc,value);
  }
  public  void setCustStatusDesc(String value){
     this.set(S_CustStatusDesc,value);
  }
  public  void setCustStatusDescNull(){
     this.set(S_CustStatusDesc,null);
  }

  public String getCustStatusDesc(){
       return DataType.getAsString(this.get(S_CustStatusDesc));
  
  }
  public String getCustStatusDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CustStatusDesc));
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

  public void initVillegeIdDesc(String value){
     this.initProperty(S_VillegeIdDesc,value);
  }
  public  void setVillegeIdDesc(String value){
     this.set(S_VillegeIdDesc,value);
  }
  public  void setVillegeIdDescNull(){
     this.set(S_VillegeIdDesc,null);
  }

  public String getVillegeIdDesc(){
       return DataType.getAsString(this.get(S_VillegeIdDesc));
  
  }
  public String getVillegeIdDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_VillegeIdDesc));
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

  public void initIndivCustSegment(String value){
     this.initProperty(S_IndivCustSegment,value);
  }
  public  void setIndivCustSegment(String value){
     this.set(S_IndivCustSegment,value);
  }
  public  void setIndivCustSegmentNull(){
     this.set(S_IndivCustSegment,null);
  }

  public String getIndivCustSegment(){
       return DataType.getAsString(this.get(S_IndivCustSegment));
  
  }
  public String getIndivCustSegmentInitialValue(){
        return DataType.getAsString(this.getOldObj(S_IndivCustSegment));
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

  public void initRegistrationNumber(int value){
     this.initProperty(S_RegistrationNumber,new Integer(value));
  }
  public  void setRegistrationNumber(int value){
     this.set(S_RegistrationNumber,new Integer(value));
  }
  public  void setRegistrationNumberNull(){
     this.set(S_RegistrationNumber,null);
  }

  public int getRegistrationNumber(){
        return DataType.getAsInt(this.get(S_RegistrationNumber));
  
  }
  public int getRegistrationNumberInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_RegistrationNumber));
      }

  public void initBudget(long value){
     this.initProperty(S_Budget,new Long(value));
  }
  public  void setBudget(long value){
     this.set(S_Budget,new Long(value));
  }
  public  void setBudgetNull(){
     this.set(S_Budget,null);
  }

  public long getBudget(){
        return DataType.getAsLong(this.get(S_Budget));
  
  }
  public long getBudgetInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Budget));
      }

  public void initServEndTime(Timestamp value){
     this.initProperty(S_ServEndTime,value);
  }
  public  void setServEndTime(Timestamp value){
     this.set(S_ServEndTime,value);
  }
  public  void setServEndTimeNull(){
     this.set(S_ServEndTime,null);
  }

  public Timestamp getServEndTime(){
        return DataType.getAsDateTime(this.get(S_ServEndTime));
  
  }
  public Timestamp getServEndTimeInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_ServEndTime));
      }

  public void initCreditLevelDesc(String value){
     this.initProperty(S_CreditLevelDesc,value);
  }
  public  void setCreditLevelDesc(String value){
     this.set(S_CreditLevelDesc,value);
  }
  public  void setCreditLevelDescNull(){
     this.set(S_CreditLevelDesc,null);
  }

  public String getCreditLevelDesc(){
       return DataType.getAsString(this.get(S_CreditLevelDesc));
  
  }
  public String getCreditLevelDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CreditLevelDesc));
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

  public void initEstablished(int value){
     this.initProperty(S_Established,new Integer(value));
  }
  public  void setEstablished(int value){
     this.set(S_Established,new Integer(value));
  }
  public  void setEstablishedNull(){
     this.set(S_Established,null);
  }

  public int getEstablished(){
        return DataType.getAsInt(this.get(S_Established));
  
  }
  public int getEstablishedInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_Established));
      }

  public void initSubVocation(int value){
     this.initProperty(S_SubVocation,new Integer(value));
  }
  public  void setSubVocation(int value){
     this.set(S_SubVocation,new Integer(value));
  }
  public  void setSubVocationNull(){
     this.set(S_SubVocation,null);
  }

  public int getSubVocation(){
        return DataType.getAsInt(this.get(S_SubVocation));
  
  }
  public int getSubVocationInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_SubVocation));
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

  public void initCustCertTypeDesc(String value){
     this.initProperty(S_CustCertTypeDesc,value);
  }
  public  void setCustCertTypeDesc(String value){
     this.set(S_CustCertTypeDesc,value);
  }
  public  void setCustCertTypeDescNull(){
     this.set(S_CustCertTypeDesc,null);
  }

  public String getCustCertTypeDesc(){
       return DataType.getAsString(this.get(S_CustCertTypeDesc));
  
  }
  public String getCustCertTypeDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CustCertTypeDesc));
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

  public void initDevelopType(int value){
     this.initProperty(S_DevelopType,new Integer(value));
  }
  public  void setDevelopType(int value){
     this.set(S_DevelopType,new Integer(value));
  }
  public  void setDevelopTypeNull(){
     this.set(S_DevelopType,null);
  }

  public int getDevelopType(){
        return DataType.getAsInt(this.get(S_DevelopType));
  
  }
  public int getDevelopTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_DevelopType));
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

  public void initGroupTypeDesc(String value){
     this.initProperty(S_GroupTypeDesc,value);
  }
  public  void setGroupTypeDesc(String value){
     this.set(S_GroupTypeDesc,value);
  }
  public  void setGroupTypeDescNull(){
     this.set(S_GroupTypeDesc,null);
  }

  public String getGroupTypeDesc(){
       return DataType.getAsString(this.get(S_GroupTypeDesc));
  
  }
  public String getGroupTypeDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_GroupTypeDesc));
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

  public void initAksRegistrationDate(Timestamp value){
     this.initProperty(S_AksRegistrationDate,value);
  }
  public  void setAksRegistrationDate(Timestamp value){
     this.set(S_AksRegistrationDate,value);
  }
  public  void setAksRegistrationDateNull(){
     this.set(S_AksRegistrationDate,null);
  }

  public Timestamp getAksRegistrationDate(){
        return DataType.getAsDateTime(this.get(S_AksRegistrationDate));
  
  }
  public Timestamp getAksRegistrationDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_AksRegistrationDate));
      }

  public void initOccupationDesc(String value){
     this.initProperty(S_OccupationDesc,value);
  }
  public  void setOccupationDesc(String value){
     this.set(S_OccupationDesc,value);
  }
  public  void setOccupationDescNull(){
     this.set(S_OccupationDesc,null);
  }

  public String getOccupationDesc(){
       return DataType.getAsString(this.get(S_OccupationDesc));
  
  }
  public String getOccupationDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OccupationDesc));
      }

  public void initIsProtected(int value){
     this.initProperty(S_IsProtected,new Integer(value));
  }
  public  void setIsProtected(int value){
     this.set(S_IsProtected,new Integer(value));
  }
  public  void setIsProtectedNull(){
     this.set(S_IsProtected,null);
  }

  public int getIsProtected(){
        return DataType.getAsInt(this.get(S_IsProtected));
  
  }
  public int getIsProtectedInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IsProtected));
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

  public void initGroupCustSegment(String value){
     this.initProperty(S_GroupCustSegment,value);
  }
  public  void setGroupCustSegment(String value){
     this.set(S_GroupCustSegment,value);
  }
  public  void setGroupCustSegmentNull(){
     this.set(S_GroupCustSegment,null);
  }

  public String getGroupCustSegment(){
       return DataType.getAsString(this.get(S_GroupCustSegment));
  
  }
  public String getGroupCustSegmentInitialValue(){
        return DataType.getAsString(this.getOldObj(S_GroupCustSegment));
      }

  public void initPreferStore(String value){
     this.initProperty(S_PreferStore,value);
  }
  public  void setPreferStore(String value){
     this.set(S_PreferStore,value);
  }
  public  void setPreferStoreNull(){
     this.set(S_PreferStore,null);
  }

  public String getPreferStore(){
       return DataType.getAsString(this.get(S_PreferStore));
  
  }
  public String getPreferStoreInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PreferStore));
      }

  public void initStockExchangeFlag(String value){
     this.initProperty(S_StockExchangeFlag,value);
  }
  public  void setStockExchangeFlag(String value){
     this.set(S_StockExchangeFlag,value);
  }
  public  void setStockExchangeFlagNull(){
     this.set(S_StockExchangeFlag,null);
  }

  public String getStockExchangeFlag(){
       return DataType.getAsString(this.get(S_StockExchangeFlag));
  
  }
  public String getStockExchangeFlagInitialValue(){
        return DataType.getAsString(this.getOldObj(S_StockExchangeFlag));
      }

  public void initPoBox(String value){
     this.initProperty(S_PoBox,value);
  }
  public  void setPoBox(String value){
     this.set(S_PoBox,value);
  }
  public  void setPoBoxNull(){
     this.set(S_PoBox,null);
  }

  public String getPoBox(){
       return DataType.getAsString(this.get(S_PoBox));
  
  }
  public String getPoBoxInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PoBox));
      }

  public void initVocationDesc(String value){
     this.initProperty(S_VocationDesc,value);
  }
  public  void setVocationDesc(String value){
     this.set(S_VocationDesc,value);
  }
  public  void setVocationDescNull(){
     this.set(S_VocationDesc,null);
  }

  public String getVocationDesc(){
       return DataType.getAsString(this.get(S_VocationDesc));
  
  }
  public String getVocationDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_VocationDesc));
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

  public void initExportTurnoverRatio(int value){
     this.initProperty(S_ExportTurnoverRatio,new Integer(value));
  }
  public  void setExportTurnoverRatio(int value){
     this.set(S_ExportTurnoverRatio,new Integer(value));
  }
  public  void setExportTurnoverRatioNull(){
     this.set(S_ExportTurnoverRatio,null);
  }

  public int getExportTurnoverRatio(){
        return DataType.getAsInt(this.get(S_ExportTurnoverRatio));
  
  }
  public int getExportTurnoverRatioInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ExportTurnoverRatio));
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

  public void initHeadOffice(String value){
     this.initProperty(S_HeadOffice,value);
  }
  public  void setHeadOffice(String value){
     this.set(S_HeadOffice,value);
  }
  public  void setHeadOfficeNull(){
     this.set(S_HeadOffice,null);
  }

  public String getHeadOffice(){
       return DataType.getAsString(this.get(S_HeadOffice));
  
  }
  public String getHeadOfficeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_HeadOffice));
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

  public void initTaxFlag(int value){
     this.initProperty(S_TaxFlag,new Integer(value));
  }
  public  void setTaxFlag(int value){
     this.set(S_TaxFlag,new Integer(value));
  }
  public  void setTaxFlagNull(){
     this.set(S_TaxFlag,null);
  }

  public int getTaxFlag(){
        return DataType.getAsInt(this.get(S_TaxFlag));
  
  }
  public int getTaxFlagInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_TaxFlag));
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

  public void initWorkplaceNumber(int value){
     this.initProperty(S_WorkplaceNumber,new Integer(value));
  }
  public  void setWorkplaceNumber(int value){
     this.set(S_WorkplaceNumber,new Integer(value));
  }
  public  void setWorkplaceNumberNull(){
     this.set(S_WorkplaceNumber,null);
  }

  public int getWorkplaceNumber(){
        return DataType.getAsInt(this.get(S_WorkplaceNumber));
  
  }
  public int getWorkplaceNumberInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_WorkplaceNumber));
      }

  public void initMultiProvince(int value){
     this.initProperty(S_MultiProvince,new Integer(value));
  }
  public  void setMultiProvince(int value){
     this.set(S_MultiProvince,new Integer(value));
  }
  public  void setMultiProvinceNull(){
     this.set(S_MultiProvince,null);
  }

  public int getMultiProvince(){
        return DataType.getAsInt(this.get(S_MultiProvince));
  
  }
  public int getMultiProvinceInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_MultiProvince));
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

  public void initSendPersonName(String value){
     this.initProperty(S_SendPersonName,value);
  }
  public  void setSendPersonName(String value){
     this.set(S_SendPersonName,value);
  }
  public  void setSendPersonNameNull(){
     this.set(S_SendPersonName,null);
  }

  public String getSendPersonName(){
       return DataType.getAsString(this.get(S_SendPersonName));
  
  }
  public String getSendPersonNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SendPersonName));
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

  public void initVirtualCustTypeDesc(String value){
     this.initProperty(S_VirtualCustTypeDesc,value);
  }
  public  void setVirtualCustTypeDesc(String value){
     this.set(S_VirtualCustTypeDesc,value);
  }
  public  void setVirtualCustTypeDescNull(){
     this.set(S_VirtualCustTypeDesc,null);
  }

  public String getVirtualCustTypeDesc(){
       return DataType.getAsString(this.get(S_VirtualCustTypeDesc));
  
  }
  public String getVirtualCustTypeDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_VirtualCustTypeDesc));
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

  public void initGroupDate(Timestamp value){
     this.initProperty(S_GroupDate,value);
  }
  public  void setGroupDate(Timestamp value){
     this.set(S_GroupDate,value);
  }
  public  void setGroupDateNull(){
     this.set(S_GroupDate,null);
  }

  public Timestamp getGroupDate(){
        return DataType.getAsDateTime(this.get(S_GroupDate));
  
  }
  public Timestamp getGroupDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_GroupDate));
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

  public void initIsVipDesc(String value){
     this.initProperty(S_IsVipDesc,value);
  }
  public  void setIsVipDesc(String value){
     this.set(S_IsVipDesc,value);
  }
  public  void setIsVipDescNull(){
     this.set(S_IsVipDesc,null);
  }

  public String getIsVipDesc(){
       return DataType.getAsString(this.get(S_IsVipDesc));
  
  }
  public String getIsVipDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_IsVipDesc));
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

  public void initVocation(int value){
     this.initProperty(S_Vocation,new Integer(value));
  }
  public  void setVocation(int value){
     this.set(S_Vocation,new Integer(value));
  }
  public  void setVocationNull(){
     this.set(S_Vocation,null);
  }

  public int getVocation(){
        return DataType.getAsInt(this.get(S_Vocation));
  
  }
  public int getVocationInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_Vocation));
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

  public void initBiCompanyName(String value){
     this.initProperty(S_BiCompanyName,value);
  }
  public  void setBiCompanyName(String value){
     this.set(S_BiCompanyName,value);
  }
  public  void setBiCompanyNameNull(){
     this.set(S_BiCompanyName,null);
  }

  public String getBiCompanyName(){
       return DataType.getAsString(this.get(S_BiCompanyName));
  
  }
  public String getBiCompanyNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BiCompanyName));
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

  public void initIndivCustId(long value){
     this.initProperty(S_IndivCustId,new Long(value));
  }
  public  void setIndivCustId(long value){
     this.set(S_IndivCustId,new Long(value));
  }
  public  void setIndivCustIdNull(){
     this.set(S_IndivCustId,null);
  }

  public long getIndivCustId(){
        return DataType.getAsLong(this.get(S_IndivCustId));
  
  }
  public long getIndivCustIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_IndivCustId));
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

  public void initUpdateFlag(int value){
     this.initProperty(S_UpdateFlag,new Integer(value));
  }
  public  void setUpdateFlag(int value){
     this.set(S_UpdateFlag,new Integer(value));
  }
  public  void setUpdateFlagNull(){
     this.set(S_UpdateFlag,null);
  }

  public int getUpdateFlag(){
        return DataType.getAsInt(this.get(S_UpdateFlag));
  
  }
  public int getUpdateFlagInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_UpdateFlag));
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

  public void initPerferLanguage(String value){
     this.initProperty(S_PerferLanguage,value);
  }
  public  void setPerferLanguage(String value){
     this.set(S_PerferLanguage,value);
  }
  public  void setPerferLanguageNull(){
     this.set(S_PerferLanguage,null);
  }

  public String getPerferLanguage(){
       return DataType.getAsString(this.get(S_PerferLanguage));
  
  }
  public String getPerferLanguageInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PerferLanguage));
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

  public void initCurrencyCode(String value){
     this.initProperty(S_CurrencyCode,value);
  }
  public  void setCurrencyCode(String value){
     this.set(S_CurrencyCode,value);
  }
  public  void setCurrencyCodeNull(){
     this.set(S_CurrencyCode,null);
  }

  public String getCurrencyCode(){
       return DataType.getAsString(this.get(S_CurrencyCode));
  
  }
  public String getCurrencyCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CurrencyCode));
      }

  public void initTownIdDesc(String value){
     this.initProperty(S_TownIdDesc,value);
  }
  public  void setTownIdDesc(String value){
     this.set(S_TownIdDesc,value);
  }
  public  void setTownIdDescNull(){
     this.set(S_TownIdDesc,null);
  }

  public String getTownIdDesc(){
       return DataType.getAsString(this.get(S_TownIdDesc));
  
  }
  public String getTownIdDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_TownIdDesc));
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

  public void initDevelopTypeDesc(String value){
     this.initProperty(S_DevelopTypeDesc,value);
  }
  public  void setDevelopTypeDesc(String value){
     this.set(S_DevelopTypeDesc,value);
  }
  public  void setDevelopTypeDescNull(){
     this.set(S_DevelopTypeDesc,null);
  }

  public String getDevelopTypeDesc(){
       return DataType.getAsString(this.get(S_DevelopTypeDesc));
  
  }
  public String getDevelopTypeDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DevelopTypeDesc));
      }

  public void initGroupSubType(int value){
     this.initProperty(S_GroupSubType,new Integer(value));
  }
  public  void setGroupSubType(int value){
     this.set(S_GroupSubType,new Integer(value));
  }
  public  void setGroupSubTypeNull(){
     this.set(S_GroupSubType,null);
  }

  public int getGroupSubType(){
        return DataType.getAsInt(this.get(S_GroupSubType));
  
  }
  public int getGroupSubTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_GroupSubType));
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

  public void initQqNo(String value){
     this.initProperty(S_QqNo,value);
  }
  public  void setQqNo(String value){
     this.set(S_QqNo,value);
  }
  public  void setQqNoNull(){
     this.set(S_QqNo,null);
  }

  public String getQqNo(){
       return DataType.getAsString(this.get(S_QqNo));
  
  }
  public String getQqNoInitialValue(){
        return DataType.getAsString(this.getOldObj(S_QqNo));
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

  public void initSegmentId(String value){
     this.initProperty(S_SegmentId,value);
  }
  public  void setSegmentId(String value){
     this.set(S_SegmentId,value);
  }
  public  void setSegmentIdNull(){
     this.set(S_SegmentId,null);
  }

  public String getSegmentId(){
       return DataType.getAsString(this.get(S_SegmentId));
  
  }
  public String getSegmentIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SegmentId));
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

  public void initRealNameFlagDesc(String value){
     this.initProperty(S_RealNameFlagDesc,value);
  }
  public  void setRealNameFlagDesc(String value){
     this.set(S_RealNameFlagDesc,value);
  }
  public  void setRealNameFlagDescNull(){
     this.set(S_RealNameFlagDesc,null);
  }

  public String getRealNameFlagDesc(){
       return DataType.getAsString(this.get(S_RealNameFlagDesc));
  
  }
  public String getRealNameFlagDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_RealNameFlagDesc));
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

  public void initServBeginTime(Timestamp value){
     this.initProperty(S_ServBeginTime,value);
  }
  public  void setServBeginTime(Timestamp value){
     this.set(S_ServBeginTime,value);
  }
  public  void setServBeginTimeNull(){
     this.set(S_ServBeginTime,null);
  }

  public Timestamp getServBeginTime(){
        return DataType.getAsDateTime(this.get(S_ServBeginTime));
  
  }
  public Timestamp getServBeginTimeInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_ServBeginTime));
      }

  public void initSeNumber(int value){
     this.initProperty(S_SeNumber,new Integer(value));
  }
  public  void setSeNumber(int value){
     this.set(S_SeNumber,new Integer(value));
  }
  public  void setSeNumberNull(){
     this.set(S_SeNumber,null);
  }

  public int getSeNumber(){
        return DataType.getAsInt(this.get(S_SeNumber));
  
  }
  public int getSeNumberInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_SeNumber));
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

  public void initManagerPhone(String value){
     this.initProperty(S_ManagerPhone,value);
  }
  public  void setManagerPhone(String value){
     this.set(S_ManagerPhone,value);
  }
  public  void setManagerPhoneNull(){
     this.set(S_ManagerPhone,null);
  }

  public String getManagerPhone(){
       return DataType.getAsString(this.get(S_ManagerPhone));
  
  }
  public String getManagerPhoneInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ManagerPhone));
      }

  public void initBlogNo(String value){
     this.initProperty(S_BlogNo,value);
  }
  public  void setBlogNo(String value){
     this.set(S_BlogNo,value);
  }
  public  void setBlogNoNull(){
     this.set(S_BlogNo,null);
  }

  public String getBlogNo(){
       return DataType.getAsString(this.get(S_BlogNo));
  
  }
  public String getBlogNoInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BlogNo));
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

  public void initCustServiceLevelDesc(String value){
     this.initProperty(S_CustServiceLevelDesc,value);
  }
  public  void setCustServiceLevelDesc(String value){
     this.set(S_CustServiceLevelDesc,value);
  }
  public  void setCustServiceLevelDescNull(){
     this.set(S_CustServiceLevelDesc,null);
  }

  public String getCustServiceLevelDesc(){
       return DataType.getAsString(this.get(S_CustServiceLevelDesc));
  
  }
  public String getCustServiceLevelDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CustServiceLevelDesc));
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

  public void initAksStatus(String value){
     this.initProperty(S_AksStatus,value);
  }
  public  void setAksStatus(String value){
     this.set(S_AksStatus,value);
  }
  public  void setAksStatusNull(){
     this.set(S_AksStatus,null);
  }

  public String getAksStatus(){
       return DataType.getAsString(this.get(S_AksStatus));
  
  }
  public String getAksStatusInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AksStatus));
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

  public void initRegistrationCode(String value){
     this.initProperty(S_RegistrationCode,value);
  }
  public  void setRegistrationCode(String value){
     this.set(S_RegistrationCode,value);
  }
  public  void setRegistrationCodeNull(){
     this.set(S_RegistrationCode,null);
  }

  public String getRegistrationCode(){
       return DataType.getAsString(this.get(S_RegistrationCode));
  
  }
  public String getRegistrationCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_RegistrationCode));
      }

  public void initIndivCustTypeDesc(String value){
     this.initProperty(S_IndivCustTypeDesc,value);
  }
  public  void setIndivCustTypeDesc(String value){
     this.set(S_IndivCustTypeDesc,value);
  }
  public  void setIndivCustTypeDescNull(){
     this.set(S_IndivCustTypeDesc,null);
  }

  public String getIndivCustTypeDesc(){
       return DataType.getAsString(this.get(S_IndivCustTypeDesc));
  
  }
  public String getIndivCustTypeDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_IndivCustTypeDesc));
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

  public void initStaffAmountType(String value){
     this.initProperty(S_StaffAmountType,value);
  }
  public  void setStaffAmountType(String value){
     this.set(S_StaffAmountType,value);
  }
  public  void setStaffAmountTypeNull(){
     this.set(S_StaffAmountType,null);
  }

  public String getStaffAmountType(){
       return DataType.getAsString(this.get(S_StaffAmountType));
  
  }
  public String getStaffAmountTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_StaffAmountType));
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

  public void initEcCode(String value){
     this.initProperty(S_EcCode,value);
  }
  public  void setEcCode(String value){
     this.set(S_EcCode,value);
  }
  public  void setEcCodeNull(){
     this.set(S_EcCode,null);
  }

  public String getEcCode(){
       return DataType.getAsString(this.get(S_EcCode));
  
  }
  public String getEcCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_EcCode));
      }

  public void initTaxId(String value){
     this.initProperty(S_TaxId,value);
  }
  public  void setTaxId(String value){
     this.set(S_TaxId,value);
  }
  public  void setTaxIdNull(){
     this.set(S_TaxId,null);
  }

  public String getTaxId(){
       return DataType.getAsString(this.get(S_TaxId));
  
  }
  public String getTaxIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_TaxId));
      }

  public void initCprStatus(String value){
     this.initProperty(S_CprStatus,value);
  }
  public  void setCprStatus(String value){
     this.set(S_CprStatus,value);
  }
  public  void setCprStatusNull(){
     this.set(S_CprStatus,null);
  }

  public String getCprStatus(){
       return DataType.getAsString(this.get(S_CprStatus));
  
  }
  public String getCprStatusInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CprStatus));
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

  public void initOpIdDesc(String value){
     this.initProperty(S_OpIdDesc,value);
  }
  public  void setOpIdDesc(String value){
     this.set(S_OpIdDesc,value);
  }
  public  void setOpIdDescNull(){
     this.set(S_OpIdDesc,null);
  }

  public String getOpIdDesc(){
       return DataType.getAsString(this.get(S_OpIdDesc));
  
  }
  public String getOpIdDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OpIdDesc));
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

  public void initFamilyPhone(String value){
     this.initProperty(S_FamilyPhone,value);
  }
  public  void setFamilyPhone(String value){
     this.set(S_FamilyPhone,value);
  }
  public  void setFamilyPhoneNull(){
     this.set(S_FamilyPhone,null);
  }

  public String getFamilyPhone(){
       return DataType.getAsString(this.get(S_FamilyPhone));
  
  }
  public String getFamilyPhoneInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FamilyPhone));
      }

  public void initIsVpmn(int value){
     this.initProperty(S_IsVpmn,new Integer(value));
  }
  public  void setIsVpmn(int value){
     this.set(S_IsVpmn,new Integer(value));
  }
  public  void setIsVpmnNull(){
     this.set(S_IsVpmn,null);
  }

  public int getIsVpmn(){
        return DataType.getAsInt(this.get(S_IsVpmn));
  
  }
  public int getIsVpmnInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IsVpmn));
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

  public void initServProtocolPath(String value){
     this.initProperty(S_ServProtocolPath,value);
  }
  public  void setServProtocolPath(String value){
     this.set(S_ServProtocolPath,value);
  }
  public  void setServProtocolPathNull(){
     this.set(S_ServProtocolPath,null);
  }

  public String getServProtocolPath(){
       return DataType.getAsString(this.get(S_ServProtocolPath));
  
  }
  public String getServProtocolPathInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ServProtocolPath));
      }

  public void initCompanyFormCode(String value){
     this.initProperty(S_CompanyFormCode,value);
  }
  public  void setCompanyFormCode(String value){
     this.set(S_CompanyFormCode,value);
  }
  public  void setCompanyFormCodeNull(){
     this.set(S_CompanyFormCode,null);
  }

  public String getCompanyFormCode(){
       return DataType.getAsString(this.get(S_CompanyFormCode));
  
  }
  public String getCompanyFormCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CompanyFormCode));
      }

  public void initAlias(String value){
     this.initProperty(S_Alias,value);
  }
  public  void setAlias(String value){
     this.set(S_Alias,value);
  }
  public  void setAliasNull(){
     this.set(S_Alias,null);
  }

  public String getAlias(){
       return DataType.getAsString(this.get(S_Alias));
  
  }
  public String getAliasInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Alias));
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

  public void initSegmentName(String value){
     this.initProperty(S_SegmentName,value);
  }
  public  void setSegmentName(String value){
     this.set(S_SegmentName,value);
  }
  public  void setSegmentNameNull(){
     this.set(S_SegmentName,null);
  }

  public String getSegmentName(){
       return DataType.getAsString(this.get(S_SegmentName));
  
  }
  public String getSegmentNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SegmentName));
      }

  public void initGroupSegmentId(String value){
     this.initProperty(S_GroupSegmentId,value);
  }
  public  void setGroupSegmentId(String value){
     this.set(S_GroupSegmentId,value);
  }
  public  void setGroupSegmentIdNull(){
     this.set(S_GroupSegmentId,null);
  }

  public String getGroupSegmentId(){
       return DataType.getAsString(this.get(S_GroupSegmentId));
  
  }
  public String getGroupSegmentIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_GroupSegmentId));
      }

  public void initCustLevel(int value){
     this.initProperty(S_CustLevel,new Integer(value));
  }
  public  void setCustLevel(int value){
     this.set(S_CustLevel,new Integer(value));
  }
  public  void setCustLevelNull(){
     this.set(S_CustLevel,null);
  }

  public int getCustLevel(){
        return DataType.getAsInt(this.get(S_CustLevel));
  
  }
  public int getCustLevelInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CustLevel));
      }

  public void initCustSegment(long value){
     this.initProperty(S_CustSegment,new Long(value));
  }
  public  void setCustSegment(long value){
     this.set(S_CustSegment,new Long(value));
  }
  public  void setCustSegmentNull(){
     this.set(S_CustSegment,null);
  }

  public long getCustSegment(){
        return DataType.getAsLong(this.get(S_CustSegment));
  
  }
  public long getCustSegmentInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CustSegment));
      }

  public void initWorkplaceCode(int value){
     this.initProperty(S_WorkplaceCode,new Integer(value));
  }
  public  void setWorkplaceCode(int value){
     this.set(S_WorkplaceCode,new Integer(value));
  }
  public  void setWorkplaceCodeNull(){
     this.set(S_WorkplaceCode,null);
  }

  public int getWorkplaceCode(){
        return DataType.getAsInt(this.get(S_WorkplaceCode));
  
  }
  public int getWorkplaceCodeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_WorkplaceCode));
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

  public void initLegalForm(String value){
     this.initProperty(S_LegalForm,value);
  }
  public  void setLegalForm(String value){
     this.set(S_LegalForm,value);
  }
  public  void setLegalFormNull(){
     this.set(S_LegalForm,null);
  }

  public String getLegalForm(){
       return DataType.getAsString(this.get(S_LegalForm));
  
  }
  public String getLegalFormInitialValue(){
        return DataType.getAsString(this.getOldObj(S_LegalForm));
      }

  public void initCertificateFilePath(String value){
     this.initProperty(S_CertificateFilePath,value);
  }
  public  void setCertificateFilePath(String value){
     this.set(S_CertificateFilePath,value);
  }
  public  void setCertificateFilePathNull(){
     this.set(S_CertificateFilePath,null);
  }

  public String getCertificateFilePath(){
       return DataType.getAsString(this.get(S_CertificateFilePath));
  
  }
  public String getCertificateFilePathInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CertificateFilePath));
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

  public void initExpenseType(int value){
     this.initProperty(S_ExpenseType,new Integer(value));
  }
  public  void setExpenseType(int value){
     this.set(S_ExpenseType,new Integer(value));
  }
  public  void setExpenseTypeNull(){
     this.set(S_ExpenseType,null);
  }

  public int getExpenseType(){
        return DataType.getAsInt(this.get(S_ExpenseType));
  
  }
  public int getExpenseTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ExpenseType));
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

  public void initEntTotalEmployees(int value){
     this.initProperty(S_EntTotalEmployees,new Integer(value));
  }
  public  void setEntTotalEmployees(int value){
     this.set(S_EntTotalEmployees,new Integer(value));
  }
  public  void setEntTotalEmployeesNull(){
     this.set(S_EntTotalEmployees,null);
  }

  public int getEntTotalEmployees(){
        return DataType.getAsInt(this.get(S_EntTotalEmployees));
  
  }
  public int getEntTotalEmployeesInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_EntTotalEmployees));
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

  public void initGuardianDate(Timestamp value){
     this.initProperty(S_GuardianDate,value);
  }
  public  void setGuardianDate(Timestamp value){
     this.set(S_GuardianDate,value);
  }
  public  void setGuardianDateNull(){
     this.set(S_GuardianDate,null);
  }

  public Timestamp getGuardianDate(){
        return DataType.getAsDateTime(this.get(S_GuardianDate));
  
  }
  public Timestamp getGuardianDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_GuardianDate));
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

  public void initCprStatusDate(Timestamp value){
     this.initProperty(S_CprStatusDate,value);
  }
  public  void setCprStatusDate(Timestamp value){
     this.set(S_CprStatusDate,value);
  }
  public  void setCprStatusDateNull(){
     this.set(S_CprStatusDate,null);
  }

  public Timestamp getCprStatusDate(){
        return DataType.getAsDateTime(this.get(S_CprStatusDate));
  
  }
  public Timestamp getCprStatusDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_CprStatusDate));
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

  public void initCustTypeDesc(String value){
     this.initProperty(S_CustTypeDesc,value);
  }
  public  void setCustTypeDesc(String value){
     this.set(S_CustTypeDesc,value);
  }
  public  void setCustTypeDescNull(){
     this.set(S_CustTypeDesc,null);
  }

  public String getCustTypeDesc(){
       return DataType.getAsString(this.get(S_CustTypeDesc));
  
  }
  public String getCustTypeDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CustTypeDesc));
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

  public void initCorporateIdentificationNumbe(String value){
     this.initProperty(S_CorporateIdentificationNumbe,value);
  }
  public  void setCorporateIdentificationNumbe(String value){
     this.set(S_CorporateIdentificationNumbe,value);
  }
  public  void setCorporateIdentificationNumbeNull(){
     this.set(S_CorporateIdentificationNumbe,null);
  }

  public String getCorporateIdentificationNumbe(){
       return DataType.getAsString(this.get(S_CorporateIdentificationNumbe));
  
  }
  public String getCorporateIdentificationNumbeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CorporateIdentificationNumbe));
      }

  public void initAddressId(long value){
     this.initProperty(S_AddressId,new Long(value));
  }
  public  void setAddressId(long value){
     this.set(S_AddressId,new Long(value));
  }
  public  void setAddressIdNull(){
     this.set(S_AddressId,null);
  }

  public long getAddressId(){
        return DataType.getAsLong(this.get(S_AddressId));
  
  }
  public long getAddressIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_AddressId));
      }

  public void initBadPayer(String value){
     this.initProperty(S_BadPayer,value);
  }
  public  void setBadPayer(String value){
     this.set(S_BadPayer,value);
  }
  public  void setBadPayerNull(){
     this.set(S_BadPayer,null);
  }

  public String getBadPayer(){
       return DataType.getAsString(this.get(S_BadPayer));
  
  }
  public String getBadPayerInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BadPayer));
      }

  public void initExportCountryCode(String value){
     this.initProperty(S_ExportCountryCode,value);
  }
  public  void setExportCountryCode(String value){
     this.set(S_ExportCountryCode,value);
  }
  public  void setExportCountryCodeNull(){
     this.set(S_ExportCountryCode,null);
  }

  public String getExportCountryCode(){
       return DataType.getAsString(this.get(S_ExportCountryCode));
  
  }
  public String getExportCountryCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ExportCountryCode));
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

  public void initVirtualCustType(int value){
     this.initProperty(S_VirtualCustType,new Integer(value));
  }
  public  void setVirtualCustType(int value){
     this.set(S_VirtualCustType,new Integer(value));
  }
  public  void setVirtualCustTypeNull(){
     this.set(S_VirtualCustType,null);
  }

  public int getVirtualCustType(){
        return DataType.getAsInt(this.get(S_VirtualCustType));
  
  }
  public int getVirtualCustTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_VirtualCustType));
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

  public void initRegistrationDate(Timestamp value){
     this.initProperty(S_RegistrationDate,value);
  }
  public  void setRegistrationDate(Timestamp value){
     this.set(S_RegistrationDate,value);
  }
  public  void setRegistrationDateNull(){
     this.set(S_RegistrationDate,null);
  }

  public Timestamp getRegistrationDate(){
        return DataType.getAsDateTime(this.get(S_RegistrationDate));
  
  }
  public Timestamp getRegistrationDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_RegistrationDate));
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

  public void initSubVocationDesc(String value){
     this.initProperty(S_SubVocationDesc,value);
  }
  public  void setSubVocationDesc(String value){
     this.set(S_SubVocationDesc,value);
  }
  public  void setSubVocationDescNull(){
     this.set(S_SubVocationDesc,null);
  }

  public String getSubVocationDesc(){
       return DataType.getAsString(this.get(S_SubVocationDesc));
  
  }
  public String getSubVocationDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SubVocationDesc));
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

  public void initPostalCity(String value){
     this.initProperty(S_PostalCity,value);
  }
  public  void setPostalCity(String value){
     this.set(S_PostalCity,value);
  }
  public  void setPostalCityNull(){
     this.set(S_PostalCity,null);
  }

  public String getPostalCity(){
       return DataType.getAsString(this.get(S_PostalCity));
  
  }
  public String getPostalCityInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PostalCity));
      }

  public void initCompanyStatus(int value){
     this.initProperty(S_CompanyStatus,new Integer(value));
  }
  public  void setCompanyStatus(int value){
     this.set(S_CompanyStatus,new Integer(value));
  }
  public  void setCompanyStatusNull(){
     this.set(S_CompanyStatus,null);
  }

  public int getCompanyStatus(){
        return DataType.getAsInt(this.get(S_CompanyStatus));
  
  }
  public int getCompanyStatusInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CompanyStatus));
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

  public void initMultiProvinceDesc(String value){
     this.initProperty(S_MultiProvinceDesc,value);
  }
  public  void setMultiProvinceDesc(String value){
     this.set(S_MultiProvinceDesc,value);
  }
  public  void setMultiProvinceDescNull(){
     this.set(S_MultiProvinceDesc,null);
  }

  public String getMultiProvinceDesc(){
       return DataType.getAsString(this.get(S_MultiProvinceDesc));
  
  }
  public String getMultiProvinceDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_MultiProvinceDesc));
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

  public void initExt22(String value){
     this.initProperty(S_Ext22,value);
  }
  public  void setExt22(String value){
     this.set(S_Ext22,value);
  }
  public  void setExt22Null(){
     this.set(S_Ext22,null);
  }

  public String getExt22(){
       return DataType.getAsString(this.get(S_Ext22));
  
  }
  public String getExt22InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext22));
      }

  public void initExt21(String value){
     this.initProperty(S_Ext21,value);
  }
  public  void setExt21(String value){
     this.set(S_Ext21,value);
  }
  public  void setExt21Null(){
     this.set(S_Ext21,null);
  }

  public String getExt21(){
       return DataType.getAsString(this.get(S_Ext21));
  
  }
  public String getExt21InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext21));
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

  public void initCustControlType(String value){
     this.initProperty(S_CustControlType,value);
  }
  public  void setCustControlType(String value){
     this.set(S_CustControlType,value);
  }
  public  void setCustControlTypeNull(){
     this.set(S_CustControlType,null);
  }

  public String getCustControlType(){
       return DataType.getAsString(this.get(S_CustControlType));
  
  }
  public String getCustControlTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CustControlType));
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

  public void initGuardianContAddress(String value){
     this.initProperty(S_GuardianContAddress,value);
  }
  public  void setGuardianContAddress(String value){
     this.set(S_GuardianContAddress,value);
  }
  public  void setGuardianContAddressNull(){
     this.set(S_GuardianContAddress,null);
  }

  public String getGuardianContAddress(){
       return DataType.getAsString(this.get(S_GuardianContAddress));
  
  }
  public String getGuardianContAddressInitialValue(){
    return DataType.getAsString(this.getOldObj(S_GuardianContAddress));
  }
  
  public void initGuardianContEmail(String value){
     this.initProperty(S_GuardianContEmail,value);
  }
  public  void setGuardianContEmail(String value){
     this.set(S_GuardianContEmail,value);
  }
  public  void setGuardianContEmailNull(){
     this.set(S_GuardianContEmail,null);
  }

  public String getGuardianContEmail(){
       return DataType.getAsString(this.get(S_GuardianContEmail));
  
  }
  public String getGuardianContEmailInitialValue(){
    return DataType.getAsString(this.getOldObj(S_GuardianContEmail));
  }
  
  public void initGuardianContMobile(String value){
     this.initProperty(S_GuardianContMobile,value);
  }
  public  void setGuardianContMobile(String value){
     this.set(S_GuardianContMobile,value);
  }
  public  void setGuardianContMobileNull(){
     this.set(S_GuardianContMobile,null);
  }

  public String getGuardianContMobile(){
       return DataType.getAsString(this.get(S_GuardianContMobile));
  
  }
  public String getGuardianContMobileInitialValue(){
    return DataType.getAsString(this.getOldObj(S_GuardianContMobile));
  }
  
}