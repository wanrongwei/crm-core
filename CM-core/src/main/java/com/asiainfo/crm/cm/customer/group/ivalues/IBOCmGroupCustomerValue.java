package com.asiainfo.crm.cm.customer.group.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmGroupCustomerValue extends DataStructInterface{

  public final static  String S_CityId = "CITY_ID";
  public final static  String S_CustCertType = "CUST_CERT_TYPE";
  public final static  String S_Vocation = "VOCATION";
  public final static  String S_CustCertCode = "CUST_CERT_CODE";
  public final static  String S_TownId = "TOWN_ID";
  public final static  String S_CustPassword = "CUST_PASSWORD";
  public final static  String S_CustLanguage = "CUST_LANGUAGE";
  public final static  String S_CustCertExpire = "CUST_CERT_EXPIRE";
  public final static  String S_CustZipcode = "CUST_ZIPCODE";
  public final static  String S_EcCode = "EC_CODE";
  public final static  String S_Established = "ESTABLISHED";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_HqNumber = "HQ_NUMBER";
  public final static  String S_GroupFax = "GROUP_FAX";
  public final static  String S_CustName = "CUST_NAME";
  public final static  String S_CustCertEffdate = "CUST_CERT_EFFDATE";
  public final static  String S_StaffAmount = "STAFF_AMOUNT";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_DevelopType = "DEVELOP_TYPE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_State = "STATE";
  public final static  String S_PartyId = "PARTY_ID";
  public final static  String S_RegAmount = "REG_AMOUNT";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_StaffAmountType = "STAFF_AMOUNT_TYPE";
  public final static  String S_LegalCustId = "LEGAL_CUST_ID";
  public final static  String S_CreditValue = "CREDIT_VALUE";
  public final static  String S_ShortName = "SHORT_NAME";
  public final static  String S_Nationality = "NATIONALITY";
  public final static  String S_GroupType = "GROUP_TYPE";
  public final static  String S_VillegeId = "VILLEGE_ID";
  public final static  String S_CustAddress = "CUST_ADDRESS";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_GroupSubType = "GROUP_SUB_TYPE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_CustServiceLevel = "CUST_SERVICE_LEVEL";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_CreditLevel = "CREDIT_LEVEL";
  public final static  String S_CustStatus = "CUST_STATUS";
  public final static  String S_AccountCycle = "ACCOUNT_CYCLE";
  public final static  String S_LegalCustName = "LEGAL_CUST_NAME";
  public final static  String S_CustServiceId = "CUST_SERVICE_ID";
  public final static  String S_ParentCustId = "PARENT_CUST_ID";
  public final static  String S_ProvinceId = "PROVINCE_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_SubVocation = "SUB_VOCATION";
  public final static  String S_CountyId = "COUNTY_ID";
  public final static  String S_CustCertAddress = "CUST_CERT_ADDRESS";
  public final static  String S_GroupWeb = "GROUP_WEB";


public String getCityId();

public long getCustCertType();

public long getVocation();

public String getCustCertCode();

public long getTownId();

public String getCustPassword();

public String getCustLanguage();

public Timestamp getCustCertExpire();

public String getCustZipcode();

public String getEcCode();

public long getEstablished();

public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public long getOpId();

public String getHqNumber();

public String getGroupFax();

public String getCustName();

public Timestamp getCustCertEffdate();

public long getStaffAmount();

public Timestamp getDoneDate();

public long getDevelopType();

public Timestamp getCreateDate();

public String getState();

public long getPartyId();

public long getRegAmount();

public String getRemarks();

public String getStaffAmountType();

public long getLegalCustId();

public long getCreditValue();

public String getShortName();

public String getNationality();

public long getGroupType();

public long getVillegeId();

public String getCustAddress();

public long getCustId();

public long getGroupSubType();

public long getCreateOpId();

public long getCustServiceLevel();

public long getDoneCode();

public String getCreditLevel();

public long getCustStatus();

public long getAccountCycle();

public String getLegalCustName();

public String getCustServiceId();

public long getParentCustId();

public String getProvinceId();

public long getOrgId();

public long getCreateOrgId();

public String getRegionId();

public long getSubVocation();

public String getCountyId();

public String getCustCertAddress();

public String getGroupWeb();


public  void setCityId(String value);

public  void setCustCertType(long value);

public  void setVocation(long value);

public  void setCustCertCode(String value);

public  void setTownId(long value);

public  void setCustPassword(String value);

public  void setCustLanguage(String value);

public  void setCustCertExpire(Timestamp value);

public  void setCustZipcode(String value);

public  void setEcCode(String value);

public  void setEstablished(long value);

public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setHqNumber(String value);

public  void setGroupFax(String value);

public  void setCustName(String value);

public  void setCustCertEffdate(Timestamp value);

public  void setStaffAmount(long value);

public  void setDoneDate(Timestamp value);

public  void setDevelopType(long value);

public  void setCreateDate(Timestamp value);

public  void setState(String value);

public  void setPartyId(long value);

public  void setRegAmount(long value);

public  void setRemarks(String value);

public  void setStaffAmountType(String value);

public  void setLegalCustId(long value);

public  void setCreditValue(long value);

public  void setShortName(String value);

public  void setNationality(String value);

public  void setGroupType(long value);

public  void setVillegeId(long value);

public  void setCustAddress(String value);

public  void setCustId(long value);

public  void setGroupSubType(long value);

public  void setCreateOpId(long value);

public  void setCustServiceLevel(long value);

public  void setDoneCode(long value);

public  void setCreditLevel(String value);

public  void setCustStatus(long value);

public  void setAccountCycle(long value);

public  void setLegalCustName(String value);

public  void setCustServiceId(String value);

public  void setParentCustId(long value);

public  void setProvinceId(String value);

public  void setOrgId(long value);

public  void setCreateOrgId(long value);

public  void setRegionId(String value);

public  void setSubVocation(long value);

public  void setCountyId(String value);

public  void setCustCertAddress(String value);

public  void setGroupWeb(String value);
}
