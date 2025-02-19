package com.asiainfo.crm.cm.customer.group.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IQBOCmRegionGroupInfoValue extends DataStructInterface{

  public final static  String S_PostAddress = "POST_ADDRESS";
  public final static  String S_PostProvince = "POST_PROVINCE";
  public final static  String S_CustLevel = "CUST_LEVEL";
  public final static  String S_GroupCountyId = "GROUP_COUNTY_ID";
  public final static  String S_GroupProvinceId = "GROUP_PROVINCE_ID";
  public final static  String S_ChnlRegionType = "CHNL_REGION_TYPE";
  public final static  String S_BaseCustId = "BASE_CUST_ID";
  public final static  String S_SaOperId = "SA_OPER_ID";
  public final static  String S_CustCertType = "CUST_CERT_TYPE";
  public final static  String S_PostCity = "POST_CITY";
  public final static  String S_CustCertCode = "CUST_CERT_CODE";
  public final static  String S_GroupTownId = "GROUP_TOWN_ID";
  public final static  String S_CustPassword = "CUST_PASSWORD";
  public final static  String S_CustCertExpire = "CUST_CERT_EXPIRE";
  public final static  String S_ChnlRegionDetail = "CHNL_REGION_DETAIL";
  public final static  String S_GroupCityId = "GROUP_CITY_ID";
  public final static  String S_CustZipcode = "CUST_ZIPCODE";
  public final static  String S_TaxId = "TAX_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_ChnlCityId = "CHNL_CITY_ID";
  public final static  String S_GroupId = "GROUP_ID";
  public final static  String S_SignalCover = "SIGNAL_COVER";
  public final static  String S_ContEmail = "CONT_EMAIL";
  public final static  String S_ChnlProvinceId = "CHNL_PROVINCE_ID";
  public final static  String S_CustName = "CUST_NAME";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_DName = "D_NAME";
  public final static  String S_DevelopType = "DEVELOP_TYPE";
  public final static  String S_GroupStatus = "GROUP_STATUS";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_State = "STATE";
  public final static  String S_LegalCustId = "LEGAL_CUST_ID";
  public final static  String S_ContName = "CONT_NAME";
  public final static  String S_ShortName = "SHORT_NAME";
  public final static  String S_Nationality = "NATIONALITY";
  public final static  String S_GroupType = "GROUP_TYPE";
  public final static  String S_CustAddress = "CUST_ADDRESS";
  public final static  String S_PostPostcode = "POST_POSTCODE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_ContPhone2 = "CONT_PHONE2";
  public final static  String S_ContPhone1 = "CONT_PHONE1";
  public final static  String S_Notes = "NOTES";
  public final static  String S_CustStatus = "CUST_STATUS";
  public final static  String S_LegalCustName = "LEGAL_CUST_NAME";
  public final static  String S_PartnerId = "PARTNER_ID";
  public final static  String S_GroupCustId = "GROUP_CUST_ID";
  public final static  String S_ParentCustId = "PARENT_CUST_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_CoreMemNum = "CORE_MEM_NUM";
  public final static  String S_GroupVillegeId = "GROUP_VILLEGE_ID";
  public final static  String S_CustCertAddress = "CUST_CERT_ADDRESS";
  public final static  String S_CompetitorInfo = "COMPETITOR_INFO";
  public final static  String S_ContFax = "CONT_FAX";
  public final static  String S_GroupWeb = "GROUP_WEB";


public String getPostAddress();

public long getPostProvince();

public long getCustLevel();

public long getGroupCountyId();

public long getGroupProvinceId();

public String getChnlRegionType();

public long getBaseCustId();

public long getSaOperId();

public long getCustCertType();

public long getPostCity();

public String getCustCertCode();

public long getGroupTownId();

public String getCustPassword();

public Timestamp getCustCertExpire();

public long getChnlRegionDetail();

public long getGroupCityId();

public String getCustZipcode();

public String getTaxId();

public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public long getOpId();

public String getChnlCityId();

public long getGroupId();

public String getSignalCover();

public String getContEmail();

public long getChnlProvinceId();

public String getCustName();

public Timestamp getDoneDate();

public String getDName();

public long getDevelopType();

public long getGroupStatus();

public Timestamp getCreateDate();

public String getState();

public long getLegalCustId();

public String getContName();

public String getShortName();

public long getNationality();

public long getGroupType();

public String getCustAddress();

public long getPostPostcode();

public long getCreateOpId();

public long getDoneCode();

public String getContPhone2();

public String getContPhone1();

public String getNotes();

public long getCustStatus();

public String getLegalCustName();

public long getPartnerId();

public long getGroupCustId();

public long getParentCustId();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public long getCoreMemNum();

public long getGroupVillegeId();

public String getCustCertAddress();

public String getCompetitorInfo();

public String getContFax();

public String getGroupWeb();


public  void setPostAddress(String value);

public  void setPostProvince(long value);

public  void setCustLevel(long value);

public  void setGroupCountyId(long value);

public  void setGroupProvinceId(long value);

public  void setChnlRegionType(String value);

public  void setBaseCustId(long value);

public  void setSaOperId(long value);

public  void setCustCertType(long value);

public  void setPostCity(long value);

public  void setCustCertCode(String value);

public  void setGroupTownId(long value);

public  void setCustPassword(String value);

public  void setCustCertExpire(Timestamp value);

public  void setChnlRegionDetail(long value);

public  void setGroupCityId(long value);

public  void setCustZipcode(String value);

public  void setTaxId(String value);

public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setChnlCityId(String value);

public  void setGroupId(long value);

public  void setSignalCover(String value);

public  void setContEmail(String value);

public  void setChnlProvinceId(long value);

public  void setCustName(String value);

public  void setDoneDate(Timestamp value);

public  void setDName(String value);

public  void setDevelopType(long value);

public  void setGroupStatus(long value);

public  void setCreateDate(Timestamp value);

public  void setState(String value);

public  void setLegalCustId(long value);

public  void setContName(String value);

public  void setShortName(String value);

public  void setNationality(long value);

public  void setGroupType(long value);

public  void setCustAddress(String value);

public  void setPostPostcode(long value);

public  void setCreateOpId(long value);

public  void setDoneCode(long value);

public  void setContPhone2(String value);

public  void setContPhone1(String value);

public  void setNotes(String value);

public  void setCustStatus(long value);

public  void setLegalCustName(String value);

public  void setPartnerId(long value);

public  void setGroupCustId(long value);

public  void setParentCustId(long value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setCoreMemNum(long value);

public  void setGroupVillegeId(long value);

public  void setCustCertAddress(String value);

public  void setCompetitorInfo(String value);

public  void setContFax(String value);

public  void setGroupWeb(String value);
}
