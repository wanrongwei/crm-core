package com.asiainfo.crm.cm.inner.manager.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.inner.manager.ivalues.*;

public class BOCmOrganizeBean extends DataContainer implements DataContainerInterface,IBOCmOrganizeValue{

  private static String  m_boName = "com.asiainfo.crm.cm.inner.manager.bo.BOCmOrganize";



  public final static  String S_PostAddress = "POST_ADDRESS";
  public final static  String S_ParentOrganizeId = "PARENT_ORGANIZE_ID";
  public final static  String S_ContactCertCode = "CONTACT_CERT_CODE";
  public final static  String S_OrgCoopType = "ORG_COOP_TYPE";
  public final static  String S_State = "STATE";
  public final static  String S_OrgAddress = "ORG_ADDRESS";
  public final static  String S_ContactBillId = "CONTACT_BILL_ID";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_PostProvince = "POST_PROVINCE";
  public final static  String S_PartyId = "PARTY_ID";
  public final static  String S_ContactName = "CONTACT_NAME";
  public final static  String S_OrganizeType = "ORGANIZE_TYPE";
  public final static  String S_Postcode = "POSTCODE";
  public final static  String S_OrgLevel = "ORG_LEVEL";
  public final static  String S_ShortName = "SHORT_NAME";
  public final static  String S_PhoneId = "PHONE_ID";
  public final static  String S_PostCity = "POST_CITY";
  public final static  String S_BusiLicence = "BUSI_LICENCE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_BrandNo = "BRAND_NO";
  public final static  String S_Email = "EMAIL";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_FaxId = "FAX_ID";
  public final static  String S_EnglishName = "ENGLISH_NAME";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_OrganizeName = "ORGANIZE_NAME";
  public final static  String S_PostPostcod = "POST_POSTCOD";
  public final static  String S_Area = "AREA";
  public final static  String S_OrgAreaType = "ORG_AREA_TYPE";
  public final static  String S_ManagerName = "MANAGER_NAME";
  public final static  String S_ContactCertType = "CONTACT_CERT_TYPE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_OnDutyTime = "ON_DUTY_TIME";
  public final static  String S_DistrictId = "DISTRICT_ID";
  public final static  String S_ComputerNum = "COMPUTER_NUM";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_MemberNum = "MEMBER_NUM";
  public final static  String S_OffDutyTime = "OFF_DUTY_TIME";
  public final static  String S_OrganizeId = "ORGANIZE_ID";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmOrganizeBean() throws AIException{
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

  public void initComputerNum(int value){
     this.initProperty(S_ComputerNum,new Integer(value));
  }
  public  void setComputerNum(int value){
     this.set(S_ComputerNum,new Integer(value));
  }
  public  void setComputerNumNull(){
     this.set(S_ComputerNum,null);
  }

  public int getComputerNum(){
        return DataType.getAsInt(this.get(S_ComputerNum));
  
  }
  public int getComputerNumInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ComputerNum));
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

  public void initMemberNum(int value){
     this.initProperty(S_MemberNum,new Integer(value));
  }
  public  void setMemberNum(int value){
     this.set(S_MemberNum,new Integer(value));
  }
  public  void setMemberNumNull(){
     this.set(S_MemberNum,null);
  }

  public int getMemberNum(){
        return DataType.getAsInt(this.get(S_MemberNum));
  
  }
  public int getMemberNumInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_MemberNum));
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


 
 }

