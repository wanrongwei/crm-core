package com.asiainfo.crm.cm.inner.customer.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.inner.customer.ivalues.*;

public class BOCmGroupCustomerBean extends DataContainer implements DataContainerInterface,IBOCmGroupCustomerValue{

  private static String  m_boName = "com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupCustomer";



  public final static  String S_VillegeId = "VILLEGE_ID";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_GroupType = "GROUP_TYPE";
  public final static  String S_AccountCycle = "ACCOUNT_CYCLE";
  public final static  String S_CustCertType = "CUST_CERT_TYPE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_CountyId = "COUNTY_ID";
  public final static  String S_ShortName = "SHORT_NAME";
  public final static  String S_GroupWeb = "GROUP_WEB";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_CustPassword = "CUST_PASSWORD";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_CustServiceId = "CUST_SERVICE_ID";
  public final static  String S_TownId = "TOWN_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_LegalCustId = "LEGAL_CUST_ID";
  public final static  String S_CustLanguage = "CUST_LANGUAGE";
  public final static  String S_Vocation = "VOCATION";
  public final static  String S_RegAmount = "REG_AMOUNT";
  public final static  String S_CustServiceLevel = "CUST_SERVICE_LEVEL";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_Established = "ESTABLISHED";
  public final static  String S_StaffAmountType = "STAFF_AMOUNT_TYPE";
  public final static  String S_IsRevisable = "IS_REVISABLE";
  public final static  String S_SubVocation = "SUB_VOCATION";
  public final static  String S_PartyId = "PARTY_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_Nationality = "NATIONALITY";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DevelopType = "DEVELOP_TYPE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_CustCertCode = "CUST_CERT_CODE";
  public final static  String S_CustZipcode = "CUST_ZIPCODE";
  public final static  String S_State = "STATE";
  public final static  String S_CustAddress = "CUST_ADDRESS";
  public final static  String S_CustCertEffdate = "CUST_CERT_EFFDATE";
  public final static  String S_EcCode = "EC_CODE";
  public final static  String S_GroupSubType = "GROUP_SUB_TYPE";
  public final static  String S_CustCertExpire = "CUST_CERT_EXPIRE";
  public final static  String S_CustCertAddress = "CUST_CERT_ADDRESS";
  public final static  String S_ProvinceId = "PROVINCE_ID";
  public final static  String S_LegalCustName = "LEGAL_CUST_NAME";
  public final static  String S_GroupFax = "GROUP_FAX";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_HqNumber = "HQ_NUMBER";
  public final static  String S_CityId = "CITY_ID";
  public final static  String S_ParentCustId = "PARENT_CUST_ID";
  public final static  String S_StaffAmount = "STAFF_AMOUNT";
  public final static  String S_CreditLevel = "CREDIT_LEVEL";
  public final static  String S_CreditValue = "CREDIT_VALUE";
  public final static  String S_CustStatus = "CUST_STATUS";
  public final static  String S_CustName = "CUST_NAME";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmGroupCustomerBean() throws AIException{
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

  public void initAccountCycle(long value){
     this.initProperty(S_AccountCycle,new Long(value));
  }
  public  void setAccountCycle(long value){
     this.set(S_AccountCycle,new Long(value));
  }
  public  void setAccountCycleNull(){
     this.set(S_AccountCycle,null);
  }

  public long getAccountCycle(){
        return DataType.getAsLong(this.get(S_AccountCycle));
  
  }
  public long getAccountCycleInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_AccountCycle));
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

  public void initEstablished(long value){
     this.initProperty(S_Established,new Long(value));
  }
  public  void setEstablished(long value){
     this.set(S_Established,new Long(value));
  }
  public  void setEstablishedNull(){
     this.set(S_Established,null);
  }

  public long getEstablished(){
        return DataType.getAsLong(this.get(S_Established));
  
  }
  public long getEstablishedInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Established));
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

  public void initIsRevisable(long value){
     this.initProperty(S_IsRevisable,new Long(value));
  }
  public  void setIsRevisable(long value){
     this.set(S_IsRevisable,new Long(value));
  }
  public  void setIsRevisableNull(){
     this.set(S_IsRevisable,null);
  }

  public long getIsRevisable(){
        return DataType.getAsLong(this.get(S_IsRevisable));
  
  }
  public long getIsRevisableInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_IsRevisable));
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

  public void initDevelopType(long value){
     this.initProperty(S_DevelopType,new Long(value));
  }
  public  void setDevelopType(long value){
     this.set(S_DevelopType,new Long(value));
  }
  public  void setDevelopTypeNull(){
     this.set(S_DevelopType,null);
  }

  public long getDevelopType(){
        return DataType.getAsLong(this.get(S_DevelopType));
  
  }
  public long getDevelopTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_DevelopType));
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

  public void initGroupSubType(long value){
     this.initProperty(S_GroupSubType,new Long(value));
  }
  public  void setGroupSubType(long value){
     this.set(S_GroupSubType,new Long(value));
  }
  public  void setGroupSubTypeNull(){
     this.set(S_GroupSubType,null);
  }

  public long getGroupSubType(){
        return DataType.getAsLong(this.get(S_GroupSubType));
  
  }
  public long getGroupSubTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_GroupSubType));
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

