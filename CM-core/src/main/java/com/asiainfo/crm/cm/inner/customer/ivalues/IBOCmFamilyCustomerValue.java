package com.asiainfo.crm.cm.inner.customer.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmFamilyCustomerValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_ProvinceId = "PROVINCE_ID";
  public final static  String S_CreditLevel = "CREDIT_LEVEL";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_CustCertExpire = "CUST_CERT_EXPIRE";
  public final static  String S_MemberNum = "MEMBER_NUM";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_CustCertCode = "CUST_CERT_CODE";
  public final static  String S_Nationality = "NATIONALITY";
  public final static  String S_CustName = "CUST_NAME";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_CityId = "CITY_ID";
  public final static  String S_CustCertAddress = "CUST_CERT_ADDRESS";
  public final static  String S_CustServiceId = "CUST_SERVICE_ID";
  public final static  String S_CustStatus = "CUST_STATUS";
  public final static  String S_CreditValue = "CREDIT_VALUE";
  public final static  String S_FamilyPhone = "FAMILY_PHONE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_CustServiceLevel = "CUST_SERVICE_LEVEL";
  public final static  String S_PartyId = "PARTY_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CustZipcode = "CUST_ZIPCODE";
  public final static  String S_CustCertType = "CUST_CERT_TYPE";
  public final static  String S_CustAddress = "CUST_ADDRESS";
  public final static  String S_CountyId = "COUNTY_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_IndivCustId = "INDIV_CUST_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_CustId = "CUST_ID";


public String getState();

public Timestamp getEffectiveDate();

public Timestamp getDoneDate();

public String getProvinceId();

public int getCreditLevel();

public String getRemarks();

public Timestamp getCustCertExpire();

public int getMemberNum();

public Timestamp getCreateDate();

public long getDoneCode();

public String getCustCertCode();

public String getNationality();

public String getCustName();

public String getRegionId();

public long getOpId();

public String getCityId();

public String getCustCertAddress();

public String getCustServiceId();

public int getCustStatus();

public long getCreditValue();

public String getFamilyPhone();

public long getCreateOpId();

public int getCustServiceLevel();

public long getPartyId();

public long getOrgId();

public String getCustZipcode();

public int getCustCertType();

public String getCustAddress();

public String getCountyId();

public Timestamp getExpireDate();

public long getIndivCustId();

public long getCreateOrgId();

public long getCustId();


public  void setState(String value);

public  void setEffectiveDate(Timestamp value);

public  void setDoneDate(Timestamp value);

public  void setProvinceId(String value);

public  void setCreditLevel(int value);

public  void setRemarks(String value);

public  void setCustCertExpire(Timestamp value);

public  void setMemberNum(int value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setCustCertCode(String value);

public  void setNationality(String value);

public  void setCustName(String value);

public  void setRegionId(String value);

public  void setOpId(long value);

public  void setCityId(String value);

public  void setCustCertAddress(String value);

public  void setCustServiceId(String value);

public  void setCustStatus(int value);

public  void setCreditValue(long value);

public  void setFamilyPhone(String value);

public  void setCreateOpId(long value);

public  void setCustServiceLevel(int value);

public  void setPartyId(long value);

public  void setOrgId(long value);

public  void setCustZipcode(String value);

public  void setCustCertType(int value);

public  void setCustAddress(String value);

public  void setCountyId(String value);

public  void setExpireDate(Timestamp value);

public  void setIndivCustId(long value);

public  void setCreateOrgId(long value);

public  void setCustId(long value);
}
