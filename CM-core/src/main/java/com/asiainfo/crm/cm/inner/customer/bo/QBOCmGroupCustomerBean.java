package com.asiainfo.crm.cm.inner.customer.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.inner.customer.ivalues.*;

public class QBOCmGroupCustomerBean extends DataContainer implements DataContainerInterface,IQBOCmGroupCustomerValue{

  private static String  m_boName = "com.asiainfo.crm.cm.inner.customer.bo.QBOCmGroupCustomer";



  public final static  String S_PostAddress = "POST_ADDRESS";
  public final static  String S_BadPayer = "BAD_PAYER";
  public final static  String S_CityId = "CITY_ID";
  public final static  String S_ContDesc = "CONT_DESC";
  public final static  String S_IsRevisable = "IS_REVISABLE";
  public final static  String S_FirstName = "FIRST_NAME";
  public final static  String S_ServBeginTime = "SERV_BEGIN_TIME";
  public final static  String S_CustPassword = "CUST_PASSWORD";
  public final static  String S_CertificateFilePath = "CERTIFICATE_FILE_PATH";
  public final static  String S_CustLanguage = "CUST_LANGUAGE";
  public final static  String S_CustCertExpire = "CUST_CERT_EXPIRE";
  public final static  String S_CustZipcode = "CUST_ZIPCODE";
  public final static  String S_LegalForm = "LEGAL_FORM";
  public final static  String S_Established = "ESTABLISHED";
  public final static  String S_EcCode = "EC_CODE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EntTotalEmployees = "ENT_TOTAL_EMPLOYEES";
  public final static  String S_ExportCountryCode = "EXPORT_COUNTRY_CODE";
  public final static  String S_OfficeTel = "OFFICE_TEL";
  public final static  String S_GroupFax = "GROUP_FAX";
  public final static  String S_Ext9 = "EXT9";
  public final static  String S_PostCode = "POST_CODE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_Ext5 = "EXT5";
  public final static  String S_Ext6 = "EXT6";
  public final static  String S_Ext7 = "EXT7";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_Ext8 = "EXT8";
  public final static  String S_HeadOffice = "HEAD_OFFICE";
  public final static  String S_Ext1 = "EXT1";
  public final static  String S_Ext2 = "EXT2";
  public final static  String S_Ext3 = "EXT3";
  public final static  String S_Ext4 = "EXT4";
  public final static  String S_Ext20 = "EXT20";
  public final static  String S_Ext30 = "EXT30";
  public final static  String S_CorporateIdentificationNumbe = "CORPORATE_IDENTIFICATION_NUMBE";
  public final static  String S_PartyId = "PARTY_ID";
  public final static  String S_LegalCustId = "LEGAL_CUST_ID";
  public final static  String S_Nationality = "NATIONALITY";
  public final static  String S_VillegeId = "VILLEGE_ID";
  public final static  String S_CustAddress = "CUST_ADDRESS";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_ServProtocolPath = "SERV_PROTOCOL_PATH";
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
  public final static  String S_CreditLevel = "CREDIT_LEVEL";
  public final static  String S_ExportTurnoverRatio = "EXPORT_TURNOVER_RATIO";
  public final static  String S_Ext10 = "EXT10";
  public final static  String S_Ext22 = "EXT22";
  public final static  String S_ProtectEffDate = "PROTECT_EFF_DATE";
  public final static  String S_CustStatus = "CUST_STATUS";
  public final static  String S_PostalCity = "POSTAL_CITY";
  public final static  String S_ParentCustId = "PARENT_CUST_ID";
  public final static  String S_PoBox = "PO_BOX";
  public final static  String S_ProvinceId = "PROVINCE_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CompanyFormCode = "COMPANY_FORM_CODE";
  public final static  String S_Alias = "ALIAS";
  public final static  String S_SubVocation = "SUB_VOCATION";
  public final static  String S_MiddleName = "MIDDLE_NAME";
  public final static  String S_PostProvince = "POST_PROVINCE";
  public final static  String S_ContId = "CONT_ID";
  public final static  String S_ProtectExpireDate = "PROTECT_EXPIRE_DATE";
  public final static  String S_CustCertType = "CUST_CERT_TYPE";
  public final static  String S_Vocation = "VOCATION";
  public final static  String S_CustCertCode = "CUST_CERT_CODE";
  public final static  String S_TownId = "TOWN_ID";
  public final static  String S_RegistrationDate = "REGISTRATION_DATE";
  public final static  String S_TaxId = "TAX_ID";
  public final static  String S_PrioryLevel = "PRIORY_LEVEL";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_ContEmail = "CONT_EMAIL";
  public final static  String S_HqNumber = "HQ_NUMBER";
  public final static  String S_IsVpmn = "IS_VPMN";
  public final static  String S_LastName = "LAST_NAME";
  public final static  String S_BiCompanyName = "BI_COMPANY_NAME";
  public final static  String S_CustName = "CUST_NAME";
  public final static  String S_StaffAmount = "STAFF_AMOUNT";
  public final static  String S_SeNumber = "SE_NUMBER";
  public final static  String S_CustCertEffdate = "CUST_CERT_EFFDATE";
  public final static  String S_DirectMarketingProtection = "DIRECT_MARKETING_PROTECTION";
  public final static  String S_StockExchangeFlag = "STOCK_EXCHANGE_FLAG";
  public final static  String S_DevelopType = "DEVELOP_TYPE";
  public final static  String S_SendPersonName = "SEND_PERSON_NAME";
  public final static  String S_RegistrationNumber = "REGISTRATION_NUMBER";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_RegAmount = "REG_AMOUNT";
  public final static  String S_StaffAmountType = "STAFF_AMOUNT_TYPE";
  public final static  String S_WorkplaceNumber = "WORKPLACE_NUMBER";
  public final static  String S_ContName = "CONT_NAME";
  public final static  String S_CreditValue = "CREDIT_VALUE";
  public final static  String S_WorkplaceCode = "WORKPLACE_CODE";
  public final static  String S_ShortName = "SHORT_NAME";
  public final static  String S_GroupType = "GROUP_TYPE";
  public final static  String S_HomeTel = "HOME_TEL";
  public final static  String S_TaxFlag = "TAX_FLAG";
  public final static  String S_ContMobile = "CONT_MOBILE";
  public final static  String S_GroupSubType = "GROUP_SUB_TYPE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_ContNameQry = "CONT_NAME_QRY";
  public final static  String S_ExpenseType = "EXPENSE_TYPE";
  public final static  String S_AccountCycle = "ACCOUNT_CYCLE";
  public final static  String S_LegalCustName = "LEGAL_CUST_NAME";
  public final static  String S_ContAddress = "CONT_ADDRESS";
  public final static  String S_CustServiceId = "CUST_SERVICE_ID";
  public final static  String S_LastNameQry = "LAST_NAME_QRY";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_FormerName = "FORMER_NAME";
  public final static  String S_RegistrationCode = "REGISTRATION_CODE";
  public final static  String S_CompanyStatus = "COMPANY_STATUS";
  public final static  String S_CountyId = "COUNTY_ID";
  public final static  String S_FirstNameQry = "FIRST_NAME_QRY";
  public final static  String S_MiddleNameQry = "MIDDLE_NAME_QRY";
  public final static  String S_CurrencyCode = "CURRENCY_CODE";
  public final static  String S_CustCertAddress = "CUST_CERT_ADDRESS";
  public final static  String S_ContFax = "CONT_FAX";
  public final static  String S_GroupWeb = "GROUP_WEB";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public QBOCmGroupCustomerBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
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

  public void initIsRevisable(String value){
     this.initProperty(S_IsRevisable,value);
  }
  public  void setIsRevisable(String value){
     this.set(S_IsRevisable,value);
  }
  public  void setIsRevisableNull(){
     this.set(S_IsRevisable,null);
  }

  public String getIsRevisable(){
       return DataType.getAsString(this.get(S_IsRevisable));
  
  }
  public String getIsRevisableInitialValue(){
        return DataType.getAsString(this.getOldObj(S_IsRevisable));
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

  public void initEntTotalEmployees(long value){
     this.initProperty(S_EntTotalEmployees,new Long(value));
  }
  public  void setEntTotalEmployees(long value){
     this.set(S_EntTotalEmployees,new Long(value));
  }
  public  void setEntTotalEmployeesNull(){
     this.set(S_EntTotalEmployees,null);
  }

  public long getEntTotalEmployees(){
        return DataType.getAsLong(this.get(S_EntTotalEmployees));
  
  }
  public long getEntTotalEmployeesInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_EntTotalEmployees));
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

  public void initSeNumber(long value){
     this.initProperty(S_SeNumber,new Long(value));
  }
  public  void setSeNumber(long value){
     this.set(S_SeNumber,new Long(value));
  }
  public  void setSeNumberNull(){
     this.set(S_SeNumber,null);
  }

  public long getSeNumber(){
        return DataType.getAsLong(this.get(S_SeNumber));
  
  }
  public long getSeNumberInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_SeNumber));
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

  public void initWorkplaceNumber(long value){
     this.initProperty(S_WorkplaceNumber,new Long(value));
  }
  public  void setWorkplaceNumber(long value){
     this.set(S_WorkplaceNumber,new Long(value));
  }
  public  void setWorkplaceNumberNull(){
     this.set(S_WorkplaceNumber,null);
  }

  public long getWorkplaceNumber(){
        return DataType.getAsLong(this.get(S_WorkplaceNumber));
  
  }
  public long getWorkplaceNumberInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_WorkplaceNumber));
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

