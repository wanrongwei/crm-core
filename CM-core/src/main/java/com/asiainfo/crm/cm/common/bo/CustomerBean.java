package com.asiainfo.crm.cm.common.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.common.ivalues.*;

public class CustomerBean extends DataContainer implements DataContainerInterface,ICustomerValue{

  private static String  m_boName = "com.asiainfo.crm.cm.common.bo.Customer";



  public final static  String S_VillegeId = "VILLEGE_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_GroupType = "GROUP_TYPE";
  public final static  String S_CustSubType = "CUST_SUB_TYPE";
  public final static  String S_IsVipDisplay = "IS_VIP_DISPLAY";
  public final static  String S_CustCertType = "CUST_CERT_TYPE";
  public final static  String S_Ext20 = "EXT20";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_CharacterDesc = "CHARACTER_DESC";
  public final static  String S_Ext15 = "EXT15";
  public final static  String S_Ext14 = "EXT14";
  public final static  String S_Ext17 = "EXT17";
  public final static  String S_Ext16 = "EXT16";
  public final static  String S_Ext11 = "EXT11";
  public final static  String S_Ext10 = "EXT10";
  public final static  String S_LocalVocation = "LOCAL_VOCATION";
  public final static  String S_Ext13 = "EXT13";
  public final static  String S_Ext12 = "EXT12";
  public final static  String S_LunarDisplay = "LUNAR_DISPLAY";
  public final static  String S_Ext19 = "EXT19";
  public final static  String S_CustPassword = "CUST_PASSWORD";
  public final static  String S_Ext18 = "EXT18";
  public final static  String S_Birthday = "BIRTHDAY";
  public final static  String S_CustCertTypeDisplay = "CUST_CERT_TYPE_DISPLAY";
  public final static  String S_IndivCustTypeDisplay = "INDIV_CUST_TYPE_DISPLAY";
  public final static  String S_LegalCustId = "LEGAL_CUST_ID";
  public final static  String S_EducationLevel = "EDUCATION_LEVEL";
  public final static  String S_FamilyInfo = "FAMILY_INFO";
  public final static  String S_IsVip = "IS_VIP";
  public final static  String S_CustServiceLevel = "CUST_SERVICE_LEVEL";
  public final static  String S_EducationLevelDisplay = "EDUCATION_LEVEL_DISPLAY";
  public final static  String S_Religion = "RELIGION";
  public final static  String S_SubVocation = "SUB_VOCATION";
  public final static  String S_LastNameQry = "LAST_NAME_QRY";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_Nationality = "NATIONALITY";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_CustCertCode = "CUST_CERT_CODE";
  public final static  String S_SubRegionType = "SUB_REGION_TYPE";
  public final static  String S_CustNameQry = "CUST_NAME_QRY";
  public final static  String S_CustAddress = "CUST_ADDRESS";
  public final static  String S_LastName = "LAST_NAME";
  public final static  String S_MemberNum = "MEMBER_NUM";
  public final static  String S_GenderDisplay = "GENDER_DISPLAY";
  public final static  String S_CustServiceLevelDisplay = "CUST_SERVICE_LEVEL_DISPLAY";
  public final static  String S_CustCertAddress = "CUST_CERT_ADDRESS";
  public final static  String S_LegalCustName = "LEGAL_CUST_NAME";
  public final static  String S_PoliticsFaceDisplay = "POLITICS_FACE_DISPLAY";
  public final static  String S_RegionType = "REGION_TYPE";
  public final static  String S_ContType = "CONT_TYPE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_MarryStatus = "MARRY_STATUS";
  public final static  String S_Ext1 = "EXT1";
  public final static  String S_Ext2 = "EXT2";
  public final static  String S_Ext3 = "EXT3";
  public final static  String S_Ext4 = "EXT4";
  public final static  String S_Ext5 = "EXT5";
  public final static  String S_Ext6 = "EXT6";
  public final static  String S_Ext7 = "EXT7";
  public final static  String S_Ext8 = "EXT8";
  public final static  String S_Ext9 = "EXT9";
  public final static  String S_ParentCustId = "PARENT_CUST_ID";
  public final static  String S_Occupation = "OCCUPATION";
  public final static  String S_NationalTypeDisplay = "NATIONAL_TYPE_DISPLAY";
  public final static  String S_CreditLevel = "CREDIT_LEVEL";
  public final static  String S_FamilyPhone = "FAMILY_PHONE";
  public final static  String S_CustStatus = "CUST_STATUS";
  public final static  String S_Lunar = "LUNAR";
  public final static  String S_ServAttributeDesc = "SERV_ATTRIBUTE_DESC";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_FirstNameQry = "FIRST_NAME_QRY";
  public final static  String S_CountyId = "COUNTY_ID";
  public final static  String S_RealNameFlagDisplay = "REAL_NAME_FLAG_DISPLAY";
  public final static  String S_ShortName = "SHORT_NAME";
  public final static  String S_CustLevel = "CUST_LEVEL";
  public final static  String S_GroupWeb = "GROUP_WEB";
  public final static  String S_EcBusiContCode = "EC_BUSI_CONT_CODE";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_CustServiceId = "CUST_SERVICE_ID";
  public final static  String S_TownId = "TOWN_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_CustLanguage = "CUST_LANGUAGE";
  public final static  String S_Hobby = "HOBBY";
  public final static  String S_Vocation = "VOCATION";
  public final static  String S_RegAmount = "REG_AMOUNT";
  public final static  String S_CustType = "CUST_TYPE";
  public final static  String S_IncomeLevel = "INCOME_LEVEL";
  public final static  String S_MiddleNameQry = "MIDDLE_NAME_QRY";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_OccupationDisplay = "OCCUPATION_DISPLAY";
  public final static  String S_IndivCustId = "INDIV_CUST_ID";
  public final static  String S_PartyId = "PARTY_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CustStatusDisplay = "CUST_STATUS_DISPLAY";
  public final static  String S_RealNameFlag = "REAL_NAME_FLAG";
  public final static  String S_CustZipcode = "CUST_ZIPCODE";
  public final static  String S_State = "STATE";
  public final static  String S_FirstName = "FIRST_NAME";
  public final static  String S_CustCertEffdate = "CUST_CERT_EFFDATE";
  public final static  String S_GroupSubType = "GROUP_SUB_TYPE";
  public final static  String S_CustCertExpire = "CUST_CERT_EXPIRE";
  public final static  String S_JobCompany = "JOB_COMPANY";
  public final static  String S_Gender = "GENDER";
  public final static  String S_ProvinceId = "PROVINCE_ID";
  public final static  String S_MiddleName = "MIDDLE_NAME";
  public final static  String S_GroupFax = "GROUP_FAX";
  public final static  String S_QqNo = "QQ_NO";
  public final static  String S_NationalType = "NATIONAL_TYPE";
  public final static  String S_HqNumber = "HQ_NUMBER";
  public final static  String S_IndivCustType = "INDIV_CUST_TYPE";
  public final static  String S_Ext30 = "EXT30";
  public final static  String S_Ext26 = "EXT26";
  public final static  String S_Ext25 = "EXT25";
  public final static  String S_Ext28 = "EXT28";
  public final static  String S_JobPosition = "JOB_POSITION";
  public final static  String S_CityId = "CITY_ID";
  public final static  String S_Ext27 = "EXT27";
  public final static  String S_ManagerName = "MANAGER_NAME";
  public final static  String S_Ext22 = "EXT22";
  public final static  String S_Ext21 = "EXT21";
  public final static  String S_Ext24 = "EXT24";
  public final static  String S_Ext23 = "EXT23";
  public final static  String S_BlogNo = "BLOG_NO";
  public final static  String S_PoliticsFace = "POLITICS_FACE";
  public final static  String S_StaffAmount = "STAFF_AMOUNT";
  public final static  String S_CustControlType = "CUST_CONTROL_TYPE";
  public final static  String S_CreditValue = "CREDIT_VALUE";
  public final static  String S_CreditLevelDisplay = "CREDIT_LEVEL_DISPLAY";
  public final static  String S_Ext29 = "EXT29";
  public final static  String S_CustName = "CUST_NAME";

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

  public void initCustSubType(int value){
     this.initProperty(S_CustSubType,new Integer(value));
  }
  public  void setCustSubType(int value){
     this.set(S_CustSubType,new Integer(value));
  }
  public  void setCustSubTypeNull(){
     this.set(S_CustSubType,null);
  }

  public int getCustSubType(){
        return DataType.getAsInt(this.get(S_CustSubType));
  
  }
  public int getCustSubTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CustSubType));
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

  public void initEducationLevelDisplay(String value){
     this.initProperty(S_EducationLevelDisplay,value);
  }
  public  void setEducationLevelDisplay(String value){
     this.set(S_EducationLevelDisplay,value);
  }
  public  void setEducationLevelDisplayNull(){
     this.set(S_EducationLevelDisplay,null);
  }

  public String getEducationLevelDisplay(){
       return DataType.getAsString(this.get(S_EducationLevelDisplay));
  
  }
  public String getEducationLevelDisplayInitialValue(){
        return DataType.getAsString(this.getOldObj(S_EducationLevelDisplay));
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

  public void initPoliticsFaceDisplay(String value){
     this.initProperty(S_PoliticsFaceDisplay,value);
  }
  public  void setPoliticsFaceDisplay(String value){
     this.set(S_PoliticsFaceDisplay,value);
  }
  public  void setPoliticsFaceDisplayNull(){
     this.set(S_PoliticsFaceDisplay,null);
  }

  public String getPoliticsFaceDisplay(){
       return DataType.getAsString(this.get(S_PoliticsFaceDisplay));
  
  }
  public String getPoliticsFaceDisplayInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PoliticsFaceDisplay));
      }

  public void initRegionType(int value){
     this.initProperty(S_RegionType,new Integer(value));
  }
  public  void setRegionType(int value){
     this.set(S_RegionType,new Integer(value));
  }
  public  void setRegionTypeNull(){
     this.set(S_RegionType,null);
  }

  public int getRegionType(){
        return DataType.getAsInt(this.get(S_RegionType));
  
  }
  public int getRegionTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_RegionType));
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

  public void initNationalTypeDisplay(String value){
     this.initProperty(S_NationalTypeDisplay,value);
  }
  public  void setNationalTypeDisplay(String value){
     this.set(S_NationalTypeDisplay,value);
  }
  public  void setNationalTypeDisplayNull(){
     this.set(S_NationalTypeDisplay,null);
  }

  public String getNationalTypeDisplay(){
       return DataType.getAsString(this.get(S_NationalTypeDisplay));
  
  }
  public String getNationalTypeDisplayInitialValue(){
        return DataType.getAsString(this.getOldObj(S_NationalTypeDisplay));
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

  public void initOccupationDisplay(String value){
     this.initProperty(S_OccupationDisplay,value);
  }
  public  void setOccupationDisplay(String value){
     this.set(S_OccupationDisplay,value);
  }
  public  void setOccupationDisplayNull(){
     this.set(S_OccupationDisplay,null);
  }

  public String getOccupationDisplay(){
       return DataType.getAsString(this.get(S_OccupationDisplay));
  
  }
  public String getOccupationDisplayInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OccupationDisplay));
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


 
 }

