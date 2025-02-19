package com.asiainfo.crm.cm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmCustMerchantValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_AuditSerialNumber = "AUDIT_SERIAL_NUMBER";
  public final static  String S_MerchantRegionType = "MERCHANT_REGION_TYPE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_UpdateDepartId = "UPDATE_DEPART_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_MerchantMemo = "MERCHANT_MEMO";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_AgentId = "AGENT_ID";
  public final static  String S_BusiLicenceNo = "BUSI_LICENCE_NO";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_BusiLicenceType = "BUSI_LICENCE_TYPE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_Email = "EMAIL";
  public final static  String S_ContactPhone = "CONTACT_PHONE";
  public final static  String S_Age = "AGE";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_AuditDepartId = "AUDIT_DEPART_ID";
  public final static  String S_PostCode = "POST_CODE";
  public final static  String S_AuditStaffId = "AUDIT_STAFF_ID";
  public final static  String S_AuditTime = "AUDIT_TIME";
  public final static  String S_JuristicName = "JURISTIC_NAME";
  public final static  String S_FaxNbr = "FAX_NBR";
  public final static  String S_MerchantStatus = "MERCHANT_STATUS";
  public final static  String S_AuditResult = "AUDIT_RESULT";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_CityCode = "CITY_CODE";
  public final static  String S_CallingTypeCode2 = "CALLING_TYPE_CODE2";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_Contact = "CONTACT";
  public final static  String S_BankAccount = "BANK_ACCOUNT";
  public final static  String S_RegAmount = "REG_AMOUNT";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_ProvinceCode = "PROVINCE_CODE";
  public final static  String S_BranchName = "BRANCH_NAME";
  public final static  String S_SynLock12580 = "SYN_LOCK12580";
  public final static  String S_Gender = "GENDER";
  public final static  String S_EparchyCode = "EPARCHY_CODE";
  public final static  String S_SynStatus12580 = "SYN_STATUS12580";
  public final static  String S_MerchantName = "MERCHANT_NAME";
  public final static  String S_MerchantId = "MERCHANT_ID";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_CallingTypeCode = "CALLING_TYPE_CODE";
  public final static  String S_CallingTypeCode3 = "CALLING_TYPE_CODE3";
  public final static  String S_Address = "ADDRESS";
  public final static  String S_CustId = "CUST_ID";


public String getState();

public String getAuditSerialNumber();

public long getMerchantRegionType();

public Timestamp getEffectiveDate();

public long getUpdateDepartId();

public Timestamp getDoneDate();

public String getMerchantMemo();

public String getRemarks();

public String getAgentId();

public String getBusiLicenceNo();

public Timestamp getCreateDate();

public String getBusiLicenceType();

public long getDoneCode();

public String getEmail();

public String getContactPhone();

public int getAge();

public String getRegionId();

public long getOpId();

public String getAuditDepartId();

public String getPostCode();

public long getAuditStaffId();

public String getAuditTime();

public String getJuristicName();

public String getFaxNbr();

public long getMerchantStatus();

public String getAuditResult();

public long getCreateOpId();

public String getCityCode();

public int getCallingTypeCode2();

public long getOrgId();

public String getContact();

public String getBankAccount();

public String getRegAmount();

public Timestamp getExpireDate();

public long getCreateOrgId();

public String getProvinceCode();

public String getBranchName();

public String getSynLock12580();

public int getGender();

public String getEparchyCode();

public String getSynStatus12580();

public String getMerchantName();

public String getMerchantId();

public String getBillId();

public int getCallingTypeCode();

public int getCallingTypeCode3();

public String getAddress();

public long getCustId();


public  void setState(String value);

public  void setAuditSerialNumber(String value);

public  void setMerchantRegionType(long value);

public  void setEffectiveDate(Timestamp value);

public  void setUpdateDepartId(long value);

public  void setDoneDate(Timestamp value);

public  void setMerchantMemo(String value);

public  void setRemarks(String value);

public  void setAgentId(String value);

public  void setBusiLicenceNo(String value);

public  void setCreateDate(Timestamp value);

public  void setBusiLicenceType(String value);

public  void setDoneCode(long value);

public  void setEmail(String value);

public  void setContactPhone(String value);

public  void setAge(int value);

public  void setRegionId(String value);

public  void setOpId(long value);

public  void setAuditDepartId(String value);

public  void setPostCode(String value);

public  void setAuditStaffId(long value);

public  void setAuditTime(String value);

public  void setJuristicName(String value);

public  void setFaxNbr(String value);

public  void setMerchantStatus(long value);

public  void setAuditResult(String value);

public  void setCreateOpId(long value);

public  void setCityCode(String value);

public  void setCallingTypeCode2(int value);

public  void setOrgId(long value);

public  void setContact(String value);

public  void setBankAccount(String value);

public  void setRegAmount(String value);

public  void setExpireDate(Timestamp value);

public  void setCreateOrgId(long value);

public  void setProvinceCode(String value);

public  void setBranchName(String value);

public  void setSynLock12580(String value);

public  void setGender(int value);

public  void setEparchyCode(String value);

public  void setSynStatus12580(String value);

public  void setMerchantName(String value);

public  void setMerchantId(String value);

public  void setBillId(String value);

public  void setCallingTypeCode(int value);

public  void setCallingTypeCode3(int value);

public  void setAddress(String value);

public  void setCustId(long value);
}
