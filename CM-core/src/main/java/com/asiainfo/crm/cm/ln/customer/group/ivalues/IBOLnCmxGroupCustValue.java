package com.asiainfo.crm.cm.ln.customer.group.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOLnCmxGroupCustValue extends DataStructInterface{

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

public long getCustId();

public long getOrgId();

public Timestamp getProtectEffDate();

public String getServProtocolPath();

public String getCompanyFormCode();

public String getAlias();

public long getWorkplaceNumber();

public long getExt20();

public String getRemarks();

public String getAksStatus();

public String getSendPersonName();

public String getExt15();

public Timestamp getProtectExpireDate();

public String getExt14();

public String getExt17();

public String getExt16();

public String getExt11();

public String getExt10();

public String getExt13();

public long getWorkplaceCode();

public String getExt12();

public String getRegistrationCode();

public long getCreateOrgId();

public long getExt19();

public Timestamp getExpireDate();

public String getExt18();

public String getLegalForm();

public String getCertificateFilePath();

public Timestamp getDoneDate();

public long getExpenseType();

public long getRegistrationNumber();

public long getEntTotalEmployees();

public String getFormerName();

public Timestamp getServEndTime();

public String getBiCompanyName();

public Timestamp getCreateDate();

public String getCorporateIdentificationNumbe();

public String getBadPayer();

public Timestamp getEffectiveDate();

public String getExportCountryCode();

public String getRegionId();

public long getUpdateFlag();

public long getCreateOpId();

public long getDirectMarketingProtection();

public long getOpId();

public String getState();

public String getCurrencyCode();

public Timestamp getAksRegistrationDate();

public String getTaxId();

public String getPostProvince();

public Timestamp getRegistrationDate();

public String getStockExchangeFlag();

public String getPoBox();

public long getDoneCode();

public Timestamp getServBeginTime();

public long getSeNumber();

public Timestamp getExt30();

public String getPostalCity();

public long getExportTurnoverRatio();

public long getCompanyStatus();

public String getExt1();

public long getExt26();

public String getExt2();

public long getExt25();

public Timestamp getExt28();

public String getExt3();

public Timestamp getExt27();

public String getExt4();

public String getHeadOffice();

public long getExt22();

public String getExt5();

public long getExt21();

public String getExt6();

public long getExt24();

public String getExt7();

public long getExt23();

public String getExt8();

public String getExt9();

public long getIsVpmn();

public Timestamp getExt29();

public long getTaxFlag();

public String getPreferredPlatform();


public  void setCustId(long value);

public  void setOrgId(long value);

public  void setProtectEffDate(Timestamp value);

public  void setServProtocolPath(String value);

public  void setCompanyFormCode(String value);

public  void setAlias(String value);

public  void setWorkplaceNumber(long value);

public  void setExt20(long value);

public  void setRemarks(String value);

public  void setAksStatus(String value);

public  void setSendPersonName(String value);

public  void setExt15(String value);

public  void setProtectExpireDate(Timestamp value);

public  void setExt14(String value);

public  void setExt17(String value);

public  void setExt16(String value);

public  void setExt11(String value);

public  void setExt10(String value);

public  void setExt13(String value);

public  void setWorkplaceCode(long value);

public  void setExt12(String value);

public  void setRegistrationCode(String value);

public  void setCreateOrgId(long value);

public  void setExt19(long value);

public  void setExpireDate(Timestamp value);

public  void setExt18(String value);

public  void setLegalForm(String value);

public  void setCertificateFilePath(String value);

public  void setDoneDate(Timestamp value);

public  void setExpenseType(long value);

public  void setRegistrationNumber(long value);

public  void setEntTotalEmployees(long value);

public  void setFormerName(String value);

public  void setServEndTime(Timestamp value);

public  void setBiCompanyName(String value);

public  void setCreateDate(Timestamp value);

public  void setCorporateIdentificationNumbe(String value);

public  void setBadPayer(String value);

public  void setEffectiveDate(Timestamp value);

public  void setExportCountryCode(String value);

public  void setRegionId(String value);

public  void setUpdateFlag(long value);

public  void setCreateOpId(long value);

public  void setDirectMarketingProtection(long value);

public  void setOpId(long value);

public  void setState(String value);

public  void setCurrencyCode(String value);

public  void setAksRegistrationDate(Timestamp value);

public  void setTaxId(String value);

public  void setPostProvince(String value);

public  void setRegistrationDate(Timestamp value);

public  void setStockExchangeFlag(String value);

public  void setPoBox(String value);

public  void setDoneCode(long value);

public  void setServBeginTime(Timestamp value);

public  void setSeNumber(long value);

public  void setExt30(Timestamp value);

public  void setPostalCity(String value);

public  void setExportTurnoverRatio(long value);

public  void setCompanyStatus(long value);

public  void setExt1(String value);

public  void setExt26(long value);

public  void setExt2(String value);

public  void setExt25(long value);

public  void setExt28(Timestamp value);

public  void setExt3(String value);

public  void setExt27(Timestamp value);

public  void setExt4(String value);

public  void setHeadOffice(String value);

public  void setExt22(long value);

public  void setExt5(String value);

public  void setExt21(long value);

public  void setExt6(String value);

public  void setExt24(long value);

public  void setExt7(String value);

public  void setExt23(long value);

public  void setExt8(String value);

public  void setExt9(String value);

public  void setIsVpmn(long value);

public  void setExt29(Timestamp value);

public  void setTaxFlag(long value);

public  void setPreferredPlatform(String value);

}
