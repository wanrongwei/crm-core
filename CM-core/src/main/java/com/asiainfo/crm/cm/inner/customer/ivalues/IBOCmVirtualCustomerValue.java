package com.asiainfo.crm.cm.inner.customer.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmVirtualCustomerValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_CityId = "CITY_ID";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_PartyId = "PARTY_ID";
  public final static  String S_LegalCustId = "LEGAL_CUST_ID";
  public final static  String S_CreditValue = "CREDIT_VALUE";
  public final static  String S_ShortName = "SHORT_NAME";
  public final static  String S_Nationality = "NATIONALITY";
  public final static  String S_SubRegionType = "SUB_REGION_TYPE";
  public final static  String S_CustAddress = "CUST_ADDRESS";
  public final static  String S_CustCertType = "CUST_CERT_TYPE";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_CustCertCode = "CUST_CERT_CODE";
  public final static  String S_CustPassword = "CUST_PASSWORD";
  public final static  String S_CustServiceLevel = "CUST_SERVICE_LEVEL";
  public final static  String S_CustCertExpire = "CUST_CERT_EXPIRE";
  public final static  String S_CustLanguage = "CUST_LANGUAGE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_CustZipcode = "CUST_ZIPCODE";
  public final static  String S_CreditLevel = "CREDIT_LEVEL";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_CustStatus = "CUST_STATUS";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_LegalCustName = "LEGAL_CUST_NAME";
  public final static  String S_CustServiceId = "CUST_SERVICE_ID";
  public final static  String S_RegionType = "REGION_TYPE";
  public final static  String S_ParentCustId = "PARENT_CUST_ID";
  public final static  String S_ProvinceId = "PROVINCE_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_VirtualCustType = "VIRTUAL_CUST_TYPE";
  public final static  String S_CustName = "CUST_NAME";
  public final static  String S_CustCertEffdate = "CUST_CERT_EFFDATE";
  public final static  String S_CountyId = "COUNTY_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_DevelopType = "DEVELOP_TYPE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_CustCertAddress = "CUST_CERT_ADDRESS";


public String getState();

public String getCityId();

public String getRemarks();

public long getPartyId();

public long getLegalCustId();

public long getCreditValue();

public String getShortName();

public String getNationality();

public String getSubRegionType();

public String getCustAddress();

public int getCustCertType();

public long getCustId();

public long getCreateOpId();

public String getCustCertCode();

public String getCustPassword();

public int getCustServiceLevel();

public Timestamp getCustCertExpire();

public String getCustLanguage();

public long getDoneCode();

public String getCustZipcode();

public int getCreditLevel();

public Timestamp getExpireDate();

public long getOpId();

public int getCustStatus();

public Timestamp getEffectiveDate();

public String getLegalCustName();

public String getCustServiceId();

public String getRegionType();

public long getParentCustId();

public String getProvinceId();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public int getVirtualCustType();

public String getCustName();

public Timestamp getCustCertEffdate();

public String getCountyId();

public Timestamp getDoneDate();

public int getDevelopType();

public Timestamp getCreateDate();

public String getCustCertAddress();


public  void setState(String value);

public  void setCityId(String value);

public  void setRemarks(String value);

public  void setPartyId(long value);

public  void setLegalCustId(long value);

public  void setCreditValue(long value);

public  void setShortName(String value);

public  void setNationality(String value);

public  void setSubRegionType(String value);

public  void setCustAddress(String value);

public  void setCustCertType(int value);

public  void setCustId(long value);

public  void setCreateOpId(long value);

public  void setCustCertCode(String value);

public  void setCustPassword(String value);

public  void setCustServiceLevel(int value);

public  void setCustCertExpire(Timestamp value);

public  void setCustLanguage(String value);

public  void setDoneCode(long value);

public  void setCustZipcode(String value);

public  void setCreditLevel(int value);

public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setCustStatus(int value);

public  void setEffectiveDate(Timestamp value);

public  void setLegalCustName(String value);

public  void setCustServiceId(String value);

public  void setRegionType(String value);

public  void setParentCustId(long value);

public  void setProvinceId(String value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setVirtualCustType(int value);

public  void setCustName(String value);

public  void setCustCertEffdate(Timestamp value);

public  void setCountyId(String value);

public  void setDoneDate(Timestamp value);

public  void setDevelopType(int value);

public  void setCreateDate(Timestamp value);

public  void setCustCertAddress(String value);
}
