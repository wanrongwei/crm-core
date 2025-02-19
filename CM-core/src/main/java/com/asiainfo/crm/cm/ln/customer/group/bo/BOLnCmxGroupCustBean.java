package com.asiainfo.crm.cm.ln.customer.group.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.ln.customer.group.ivalues.*;

public class BOLnCmxGroupCustBean extends DataContainer implements DataContainerInterface,IBOLnCmxGroupCustValue{

  private static String  m_boName = "com.asiainfo.crm.cm.ln.customer.group.bo.BOLnCmxGroupCust";

  public final static  String S_CustId = "CUST_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_ProtectEffDate = "PROTECT_EFF_DATE";
  public final static  String S_ServProtocolPath = "SERV_PROTOCOL_PATH";
  public final static  String S_CompanyFormCode = "COMPANY_FORM_CODE";
  public final static  String S_Alias = "ALIAS";
  public final static  String S_WorkplaceNumber = "WORKPLACE_NUMBER";
  public final static  String S_Ext20 = "EXT20";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_AksStatus = "AKS_STATUS";
  public final static  String S_SendPersonName = "SEND_PERSON_NAME";
  public final static  String S_Ext15 = "EXT15";
  public final static  String S_ProtectExpireDate = "PROTECT_EXPIRE_DATE";
  public final static  String S_Ext14 = "EXT14";
  public final static  String S_Ext17 = "EXT17";
  public final static  String S_Ext16 = "EXT16";
  public final static  String S_Ext11 = "EXT11";
  public final static  String S_Ext10 = "EXT10";
  public final static  String S_Ext13 = "EXT13";
  public final static  String S_WorkplaceCode = "WORKPLACE_CODE";
  public final static  String S_Ext12 = "EXT12";
  public final static  String S_RegistrationCode = "REGISTRATION_CODE";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_Ext19 = "EXT19";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_Ext18 = "EXT18";
  public final static  String S_LegalForm = "LEGAL_FORM";
  public final static  String S_CertificateFilePath = "CERTIFICATE_FILE_PATH";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_ExpenseType = "EXPENSE_TYPE";
  public final static  String S_RegistrationNumber = "REGISTRATION_NUMBER";
  public final static  String S_EntTotalEmployees = "ENT_TOTAL_EMPLOYEES";
  public final static  String S_FormerName = "FORMER_NAME";
  public final static  String S_ServEndTime = "SERV_END_TIME";
  public final static  String S_BiCompanyName = "BI_COMPANY_NAME";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_CorporateIdentificationNumbe = "CORPORATE_IDENTIFICATION_NUMBE";
  public final static  String S_BadPayer = "BAD_PAYER";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_ExportCountryCode = "EXPORT_COUNTRY_CODE";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_UpdateFlag = "UPDATE_FLAG";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DirectMarketingProtection = "DIRECT_MARKETING_PROTECTION";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_State = "STATE";
  public final static  String S_CurrencyCode = "CURRENCY_CODE";
  public final static  String S_AksRegistrationDate = "AKS_REGISTRATION_DATE";
  public final static  String S_TaxId = "TAX_ID";
  public final static  String S_PostProvince = "POST_PROVINCE";
  public final static  String S_RegistrationDate = "REGISTRATION_DATE";
  public final static  String S_StockExchangeFlag = "STOCK_EXCHANGE_FLAG";
  public final static  String S_PoBox = "PO_BOX";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_ServBeginTime = "SERV_BEGIN_TIME";
  public final static  String S_SeNumber = "SE_NUMBER";
  public final static  String S_Ext30 = "EXT30";
  public final static  String S_PostalCity = "POSTAL_CITY";
  public final static  String S_ExportTurnoverRatio = "EXPORT_TURNOVER_RATIO";
  public final static  String S_CompanyStatus = "COMPANY_STATUS";
  public final static  String S_Ext1 = "EXT1";
  public final static  String S_Ext26 = "EXT26";
  public final static  String S_Ext2 = "EXT2";
  public final static  String S_Ext25 = "EXT25";
  public final static  String S_Ext28 = "EXT28";
  public final static  String S_Ext3 = "EXT3";
  public final static  String S_Ext27 = "EXT27";
  public final static  String S_Ext4 = "EXT4";
  public final static  String S_HeadOffice = "HEAD_OFFICE";
  public final static  String S_Ext22 = "EXT22";
  public final static  String S_Ext5 = "EXT5";
  public final static  String S_Ext21 = "EXT21";
  public final static  String S_Ext6 = "EXT6";
  public final static  String S_Ext24 = "EXT24";
  public final static  String S_Ext7 = "EXT7";
  public final static  String S_Ext23 = "EXT23";
  public final static  String S_Ext8 = "EXT8";
  public final static  String S_Ext9 = "EXT9";
  public final static  String S_IsVpmn = "IS_VPMN";
  public final static  String S_Ext29 = "EXT29";
  public final static  String S_TaxFlag = "TAX_FLAG";
  public final static  String S_PreferredPlatform = "PREFERRED_PLATFORM";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOLnCmxGroupCustBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
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

  public void initWorkplaceCode(long value){
     this.initProperty(S_WorkplaceCode,new Long(value));
  }
  public  void setWorkplaceCode(long value){
     this.set(S_WorkplaceCode,new Long(value));
  }
  public  void setWorkplaceCodeNull(){
     this.set(S_WorkplaceCode,null);
  }

  public long getWorkplaceCode(){
        return DataType.getAsLong(this.get(S_WorkplaceCode));
  
  }
  public long getWorkplaceCodeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_WorkplaceCode));
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

  public void initExpenseType(long value){
     this.initProperty(S_ExpenseType,new Long(value));
  }
  public  void setExpenseType(long value){
     this.set(S_ExpenseType,new Long(value));
  }
  public  void setExpenseTypeNull(){
     this.set(S_ExpenseType,null);
  }

  public long getExpenseType(){
        return DataType.getAsLong(this.get(S_ExpenseType));
  
  }
  public long getExpenseTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ExpenseType));
      }

  public void initRegistrationNumber(long value){
     this.initProperty(S_RegistrationNumber,new Long(value));
  }
  public  void setRegistrationNumber(long value){
     this.set(S_RegistrationNumber,new Long(value));
  }
  public  void setRegistrationNumberNull(){
     this.set(S_RegistrationNumber,null);
  }

  public long getRegistrationNumber(){
        return DataType.getAsLong(this.get(S_RegistrationNumber));
  
  }
  public long getRegistrationNumberInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_RegistrationNumber));
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

  public void initUpdateFlag(long value){
     this.initProperty(S_UpdateFlag,new Long(value));
  }
  public  void setUpdateFlag(long value){
     this.set(S_UpdateFlag,new Long(value));
  }
  public  void setUpdateFlagNull(){
     this.set(S_UpdateFlag,null);
  }

  public long getUpdateFlag(){
        return DataType.getAsLong(this.get(S_UpdateFlag));
  
  }
  public long getUpdateFlagInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_UpdateFlag));
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

  public void initDirectMarketingProtection(long value){
     this.initProperty(S_DirectMarketingProtection,new Long(value));
  }
  public  void setDirectMarketingProtection(long value){
     this.set(S_DirectMarketingProtection,new Long(value));
  }
  public  void setDirectMarketingProtectionNull(){
     this.set(S_DirectMarketingProtection,null);
  }

  public long getDirectMarketingProtection(){
        return DataType.getAsLong(this.get(S_DirectMarketingProtection));
  
  }
  public long getDirectMarketingProtectionInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_DirectMarketingProtection));
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

  public void initExportTurnoverRatio(long value){
     this.initProperty(S_ExportTurnoverRatio,new Long(value));
  }
  public  void setExportTurnoverRatio(long value){
     this.set(S_ExportTurnoverRatio,new Long(value));
  }
  public  void setExportTurnoverRatioNull(){
     this.set(S_ExportTurnoverRatio,null);
  }

  public long getExportTurnoverRatio(){
        return DataType.getAsLong(this.get(S_ExportTurnoverRatio));
  
  }
  public long getExportTurnoverRatioInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ExportTurnoverRatio));
      }

  public void initCompanyStatus(long value){
     this.initProperty(S_CompanyStatus,new Long(value));
  }
  public  void setCompanyStatus(long value){
     this.set(S_CompanyStatus,new Long(value));
  }
  public  void setCompanyStatusNull(){
     this.set(S_CompanyStatus,null);
  }

  public long getCompanyStatus(){
        return DataType.getAsLong(this.get(S_CompanyStatus));
  
  }
  public long getCompanyStatusInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CompanyStatus));
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

  public void initIsVpmn(long value){
     this.initProperty(S_IsVpmn,new Long(value));
  }
  public  void setIsVpmn(long value){
     this.set(S_IsVpmn,new Long(value));
  }
  public  void setIsVpmnNull(){
     this.set(S_IsVpmn,null);
  }

  public long getIsVpmn(){
        return DataType.getAsLong(this.get(S_IsVpmn));
  
  }
  public long getIsVpmnInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_IsVpmn));
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

  public void initTaxFlag(long value){
     this.initProperty(S_TaxFlag,new Long(value));
  }
  public  void setTaxFlag(long value){
     this.set(S_TaxFlag,new Long(value));
  }
  public  void setTaxFlagNull(){
     this.set(S_TaxFlag,null);
  }

  public long getTaxFlag(){
        return DataType.getAsLong(this.get(S_TaxFlag));
  
  }
  public long getTaxFlagInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_TaxFlag));
      }

    public void initPreferredPlatform(String value) {
        this.initProperty(S_PreferredPlatform, value);
    }

    public void setPreferredPlatform(String value) {
        this.set(S_PreferredPlatform, value);
    }

    public void setPreferredPlatformNull() {
        this.set(S_PreferredPlatform, null);
    }

    public String getPreferredPlatform() {
        return DataType.getAsString(this.get(S_PreferredPlatform));
    }

    public String getPreferredPlatformInitialValue() {
        return DataType.getAsString(this.getOldObj(S_PreferredPlatform));
    }


 
 }

