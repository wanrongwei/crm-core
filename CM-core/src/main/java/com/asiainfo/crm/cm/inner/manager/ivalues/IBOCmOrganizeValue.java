package com.asiainfo.crm.cm.inner.manager.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmOrganizeValue extends DataStructInterface{

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


public String getPostAddress();

public long getParentOrganizeId();

public String getContactCertCode();

public int getOrgCoopType();

public String getState();

public String getOrgAddress();

public String getContactBillId();

public String getRemarks();

public String getPostProvince();

public long getPartyId();

public String getContactName();

public int getOrganizeType();

public String getPostcode();

public int getOrgLevel();

public String getShortName();

public String getPhoneId();

public String getPostCity();

public String getBusiLicence();

public long getCreateOpId();

public String getBrandNo();

public String getEmail();

public long getDoneCode();

public String getFaxId();

public String getEnglishName();

public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public long getOpId();

public String getOrganizeName();

public String getPostPostcod();

public int getArea();

public int getOrgAreaType();

public String getManagerName();

public int getContactCertType();

public long getOrgId();

public long getCreateOrgId();

public String getOnDutyTime();

public String getDistrictId();

public int getComputerNum();

public Timestamp getDoneDate();

public Timestamp getCreateDate();

public int getMemberNum();

public String getOffDutyTime();

public long getOrganizeId();


public  void setPostAddress(String value);

public  void setParentOrganizeId(long value);

public  void setContactCertCode(String value);

public  void setOrgCoopType(int value);

public  void setState(String value);

public  void setOrgAddress(String value);

public  void setContactBillId(String value);

public  void setRemarks(String value);

public  void setPostProvince(String value);

public  void setPartyId(long value);

public  void setContactName(String value);

public  void setOrganizeType(int value);

public  void setPostcode(String value);

public  void setOrgLevel(int value);

public  void setShortName(String value);

public  void setPhoneId(String value);

public  void setPostCity(String value);

public  void setBusiLicence(String value);

public  void setCreateOpId(long value);

public  void setBrandNo(String value);

public  void setEmail(String value);

public  void setDoneCode(long value);

public  void setFaxId(String value);

public  void setEnglishName(String value);

public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setOrganizeName(String value);

public  void setPostPostcod(String value);

public  void setArea(int value);

public  void setOrgAreaType(int value);

public  void setManagerName(String value);

public  void setContactCertType(int value);

public  void setOrgId(long value);

public  void setCreateOrgId(long value);

public  void setOnDutyTime(String value);

public  void setDistrictId(String value);

public  void setComputerNum(int value);

public  void setDoneDate(Timestamp value);

public  void setCreateDate(Timestamp value);

public  void setMemberNum(int value);

public  void setOffDutyTime(String value);

public  void setOrganizeId(long value);
}
