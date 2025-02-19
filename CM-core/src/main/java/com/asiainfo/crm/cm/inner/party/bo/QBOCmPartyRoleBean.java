package com.asiainfo.crm.cm.inner.party.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.inner.party.ivalues.*;

public class QBOCmPartyRoleBean extends DataContainer implements DataContainerInterface,IQBOCmPartyRoleValue{

  private static String  m_boName = "com.asiainfo.crm.cm.inner.party.bo.QBOCmPartyRole";



  public final static  String S_CertCode = "CERT_CODE";
  public final static  String S_State = "STATE";
  public final static  String S_PartyName = "PARTY_NAME";
  public final static  String S_CityId = "CITY_ID";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_PartyNameQry = "PARTY_NAME_QRY";
  public final static  String S_PartyId = "PARTY_ID";
  public final static  String S_CertAddress = "CERT_ADDRESS";
  public final static  String S_ShortName = "SHORT_NAME";
  public final static  String S_Nationality = "NATIONALITY";
  public final static  String S_SubRegionType = "SUB_REGION_TYPE";
  public final static  String S_RoleType = "ROLE_TYPE";
  public final static  String S_FirstName = "FIRST_NAME";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_EnglishName = "ENGLISH_NAME";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_LastNameQry = "LAST_NAME_QRY";
  public final static  String S_RegionType = "REGION_TYPE";
  public final static  String S_ProvinceId = "PROVINCE_ID";
  public final static  String S_CertExpireDate = "CERT_EXPIRE_DATE";
  public final static  String S_LastName = "LAST_NAME";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_PartyRoleId = "PARTY_ROLE_ID";
  public final static  String S_CertType = "CERT_TYPE";
  public final static  String S_CustCertEffdate = "CUST_CERT_EFFDATE";
  public final static  String S_ParentPartyId = "PARENT_PARTY_ID";
  public final static  String S_RoleRegionId = "ROLE_REGION_ID";
  public final static  String S_CountyId = "COUNTY_ID";
  public final static  String S_MiddleName = "MIDDLE_NAME";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_FirstNameQry = "FIRST_NAME_QRY";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_MiddleNameQry = "MIDDLE_NAME_QRY";
  public final static  String S_PartyType = "PARTY_TYPE";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public QBOCmPartyRoleBean() throws AIException{
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

  public void initRoleType(long value){
     this.initProperty(S_RoleType,new Long(value));
  }
  public  void setRoleType(long value){
     this.set(S_RoleType,new Long(value));
  }
  public  void setRoleTypeNull(){
     this.set(S_RoleType,null);
  }

  public long getRoleType(){
        return DataType.getAsLong(this.get(S_RoleType));
  
  }
  public long getRoleTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_RoleType));
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

  public void initPartyRoleId(long value){
     this.initProperty(S_PartyRoleId,new Long(value));
  }
  public  void setPartyRoleId(long value){
     this.set(S_PartyRoleId,new Long(value));
  }
  public  void setPartyRoleIdNull(){
     this.set(S_PartyRoleId,null);
  }

  public long getPartyRoleId(){
        return DataType.getAsLong(this.get(S_PartyRoleId));
  
  }
  public long getPartyRoleIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_PartyRoleId));
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

  public void initRoleRegionId(String value){
     this.initProperty(S_RoleRegionId,value);
  }
  public  void setRoleRegionId(String value){
     this.set(S_RoleRegionId,value);
  }
  public  void setRoleRegionIdNull(){
     this.set(S_RoleRegionId,null);
  }

  public String getRoleRegionId(){
       return DataType.getAsString(this.get(S_RoleRegionId));
  
  }
  public String getRoleRegionIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_RoleRegionId));
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

  public void initPartyType(long value){
     this.initProperty(S_PartyType,new Long(value));
  }
  public  void setPartyType(long value){
     this.set(S_PartyType,new Long(value));
  }
  public  void setPartyTypeNull(){
     this.set(S_PartyType,null);
  }

  public long getPartyType(){
        return DataType.getAsLong(this.get(S_PartyType));
  
  }
  public long getPartyTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_PartyType));
      }


 
 }

