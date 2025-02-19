package com.asiainfo.crm.cm.model.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface ICustManagerValue extends DataStructInterface{

  public final static  String S_CertCode = "CERT_CODE";
  public final static  String S_ParentOrganizeId = "PARENT_ORGANIZE_ID";
  public final static  String S_ManagerTypeDesc = "MANAGER_TYPE_DESC";
  public final static  String S_OperTypeDesc = "OPER_TYPE_DESC";
  public final static  String S_CertTypeDesc = "CERT_TYPE_DESC";
  public final static  String S_CityId = "CITY_ID";
  public final static  String S_OrganizeType = "ORGANIZE_TYPE";
  public final static  String S_CertAddress = "CERT_ADDRESS";
  public final static  String S_CountyIdDesc = "COUNTY_ID_DESC";
  public final static  String S_SubRegionType = "SUB_REGION_TYPE";
  public final static  String S_CityIdDesc = "CITY_ID_DESC";
  public final static  String S_SubRegionTypeDesc = "SUB_REGION_TYPE_DESC";
  public final static  String S_CertEffdate = "CERT_EFFDATE";
  public final static  String S_OrganizeTypeDesc = "ORGANIZE_TYPE_DESC";
  public final static  String S_EnglishName = "ENGLISH_NAME";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_OrganizeName = "ORGANIZE_NAME";
  public final static  String S_RelType = "REL_TYPE";
  public final static  String S_ContEmail = "CONT_EMAIL";
  public final static  String S_StaffLevel = "STAFF_LEVEL";
  public final static  String S_RegionType = "REGION_TYPE";
  public final static  String S_CertExpireDate = "CERT_EXPIRE_DATE";
  public final static  String S_OfficeTel = "OFFICE_TEL";
  public final static  String S_ManagerId = "MANAGER_ID";
  public final static  String S_RelTypeDesc = "REL_TYPE_DESC";
  public final static  String S_WirelessCall = "WIRELESS_CALL";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_OrganizeId = "ORGANIZE_ID";
  public final static  String S_StaffType = "STAFF_TYPE";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_MarryStatusDesc = "MARRY_STATUS_DESC";
  public final static  String S_Postcode = "POSTCODE";
  public final static  String S_ShortName = "SHORT_NAME";
  public final static  String S_Nationality = "NATIONALITY";
  public final static  String S_ProvinceIdDesc = "PROVINCE_ID_DESC";
  public final static  String S_ParentStaffId = "PARENT_STAFF_ID";
  public final static  String S_BcMgr = "BC_MGR";
  public final static  String S_HomeTel = "HOME_TEL";
  public final static  String S_StaffTypeDesc = "STAFF_TYPE_DESC";
  public final static  String S_StaffLevelDesc = "STAFF_LEVEL_DESC";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_MarryStatus = "MARRY_STATUS";
  public final static  String S_StaffName = "STAFF_NAME";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_OperType = "OPER_TYPE";
  public final static  String S_Birthday = "BIRTHDAY";
  public final static  String S_RegionTypeDesc = "REGION_TYPE_DESC";
  public final static  String S_ContAddress = "CONT_ADDRESS";
  public final static  String S_NationalityDesc = "NATIONALITY_DESC";
  public final static  String S_ProvinceId = "PROVINCE_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RelId = "REL_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CertType = "CERT_TYPE";
  public final static  String S_StaffId = "STAFF_ID";
  public final static  String S_CountyId = "COUNTY_ID";
  public final static  String S_Gender = "GENDER";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_ContFax = "CONT_FAX";
  public final static  String S_ManagerType = "MANAGER_TYPE";


public String getCertCode();

public long getParentOrganizeId();

public String getManagerTypeDesc();

public String getOperTypeDesc();

public String getCertTypeDesc();

public String getCityId();

public int getOrganizeType();

public String getCertAddress();

public String getCountyIdDesc();

public String getSubRegionType();

public String getCityIdDesc();

public String getSubRegionTypeDesc();

public Timestamp getCertEffdate();

public String getOrganizeTypeDesc();

public String getEnglishName();

public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public long getOpId();

public String getOrganizeName();

public long getRelType();

public String getContEmail();

public int getStaffLevel();

public String getRegionType();

public Timestamp getCertExpireDate();

public String getOfficeTel();

public long getManagerId();

public String getRelTypeDesc();

public String getWirelessCall();

public Timestamp getDoneDate();

public Timestamp getCreateDate();

public long getOrganizeId();

public int getStaffType();

public String getState();

public String getRemarks();

public String getMarryStatusDesc();

public String getPostcode();

public String getShortName();

public String getNationality();

public String getProvinceIdDesc();

public long getParentStaffId();

public String getBcMgr();

public String getHomeTel();

public String getStaffTypeDesc();

public String getStaffLevelDesc();

public long getCustId();

public long getCreateOpId();

public int getMarryStatus();

public String getStaffName();

public long getDoneCode();

public long getOperType();

public Timestamp getBirthday();

public String getRegionTypeDesc();

public String getContAddress();

public String getNationalityDesc();

public String getProvinceId();

public long getOrgId();

public long getRelId();

public long getCreateOrgId();

public String getRegionId();

public int getCertType();

public long getStaffId();

public String getCountyId();

public int getGender();

public String getBillId();

public String getContFax();

public int getManagerType();


public  void setCertCode(String value);

public  void setParentOrganizeId(long value);

public  void setManagerTypeDesc(String value);

public  void setOperTypeDesc(String value);

public  void setCertTypeDesc(String value);

public  void setCityId(String value);

public  void setOrganizeType(int value);

public  void setCertAddress(String value);

public  void setCountyIdDesc(String value);

public  void setSubRegionType(String value);

public  void setCityIdDesc(String value);

public  void setSubRegionTypeDesc(String value);

public  void setCertEffdate(Timestamp value);

public  void setOrganizeTypeDesc(String value);

public  void setEnglishName(String value);

public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setOrganizeName(String value);

public  void setRelType(long value);

public  void setContEmail(String value);

public  void setStaffLevel(int value);

public  void setRegionType(String value);

public  void setCertExpireDate(Timestamp value);

public  void setOfficeTel(String value);

public  void setManagerId(long value);

public  void setRelTypeDesc(String value);

public  void setWirelessCall(String value);

public  void setDoneDate(Timestamp value);

public  void setCreateDate(Timestamp value);

public  void setOrganizeId(long value);

public  void setStaffType(int value);

public  void setState(String value);

public  void setRemarks(String value);

public  void setMarryStatusDesc(String value);

public  void setPostcode(String value);

public  void setShortName(String value);

public  void setNationality(String value);

public  void setProvinceIdDesc(String value);

public  void setParentStaffId(long value);

public  void setBcMgr(String value);

public  void setHomeTel(String value);

public  void setStaffTypeDesc(String value);

public  void setStaffLevelDesc(String value);

public  void setCustId(long value);

public  void setCreateOpId(long value);

public  void setMarryStatus(int value);

public  void setStaffName(String value);

public  void setDoneCode(long value);

public  void setOperType(long value);

public  void setBirthday(Timestamp value);

public  void setRegionTypeDesc(String value);

public  void setContAddress(String value);

public  void setNationalityDesc(String value);

public  void setProvinceId(String value);

public  void setOrgId(long value);

public  void setRelId(long value);

public  void setCreateOrgId(long value);

public  void setRegionId(String value);

public  void setCertType(int value);

public  void setStaffId(long value);

public  void setCountyId(String value);

public  void setGender(int value);

public  void setBillId(String value);

public  void setContFax(String value);

public  void setManagerType(int value);
}
