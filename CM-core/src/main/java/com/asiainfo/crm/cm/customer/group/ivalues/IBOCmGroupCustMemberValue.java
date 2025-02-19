package com.asiainfo.crm.cm.customer.group.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmGroupCustMemberValue extends DataStructInterface{

  public final static  String S_DeptId = "DEPT_ID";
  public final static  String S_State = "STATE";
  public final static  String S_IndivCustId = "INDIV_CUST_ID";
  public final static  String S_CustRegionId = "CUST_REGION_ID";
  public final static  String S_OtherHobby = "OTHER_HOBBY";
  public final static  String S_AlarmBillId = "ALARM_BILL_ID";
  public final static  String S_CustCertType = "CUST_CERT_TYPE";
  public final static  String S_FirstName = "FIRST_NAME";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_ContZipcode = "CONT_ZIPCODE";
  public final static  String S_MemberName = "MEMBER_NAME";
  public final static  String S_CustCertCode = "CUST_CERT_CODE";
  public final static  String S_CustCertExpire = "CUST_CERT_EXPIRE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_CustRelId = "CUST_REL_ID";
  public final static  String S_Notes = "NOTES";
  public final static  String S_Lunar = "LUNAR";
  public final static  String S_HomePhone = "HOME_PHONE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_Birthday = "BIRTHDAY";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_ContAddress = "CONT_ADDRESS";
  public final static  String S_LastNameQry = "LAST_NAME_QRY";
  public final static  String S_ContEmail = "CONT_EMAIL";
  public final static  String S_GroupCustId = "GROUP_CUST_ID";
  public final static  String S_OfficePhone = "OFFICE_PHONE";
  public final static  String S_LastName = "LAST_NAME";
  public final static  String S_FamilyInfo = "FAMILY_INFO";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_MemberPosition = "MEMBER_POSITION";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_MiddleName = "MIDDLE_NAME";
  public final static  String S_Gender = "GENDER";
  public final static  String S_WorkDept = "WORK_DEPT";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_MemberDesc = "MEMBER_DESC";
  public final static  String S_FirstNameQry = "FIRST_NAME_QRY";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_MiddleNameQry = "MIDDLE_NAME_QRY";
  public final static  String S_MemberLevel = "MEMBER_LEVEL";
  public final static  String S_CustCertAddress = "CUST_CERT_ADDRESS";
  public final static  String S_ContFax = "CONT_FAX";


public long getDeptId();

public String getState();

public long getIndivCustId();

public String getCustRegionId();

public String getOtherHobby();

public String getAlarmBillId();

public int getCustCertType();

public String getFirstName();

public long getCreateOpId();

public String getContZipcode();

public String getMemberName();

public String getCustCertCode();

public Timestamp getCustCertExpire();

public long getDoneCode();

public long getCustRelId();

public String getNotes();

public int getLunar();

public String getHomePhone();

public Timestamp getExpireDate();

public long getOpId();

public Timestamp getBirthday();

public Timestamp getEffectiveDate();

public String getContAddress();

public String getLastNameQry();

public String getContEmail();

public long getGroupCustId();

public String getOfficePhone();

public String getLastName();

public String getFamilyInfo();

public long getOrgId();

public String getRegionId();

public String getMemberPosition();

public long getCreateOrgId();

public String getMiddleName();

public int getGender();

public String getWorkDept();

public Timestamp getDoneDate();

public String getMemberDesc();

public String getFirstNameQry();

public Timestamp getCreateDate();

public String getMiddleNameQry();

public int getMemberLevel();

public String getCustCertAddress();

public String getContFax();


public  void setDeptId(long value);

public  void setState(String value);

public  void setIndivCustId(long value);

public  void setCustRegionId(String value);

public  void setOtherHobby(String value);

public  void setAlarmBillId(String value);

public  void setCustCertType(int value);

public  void setFirstName(String value);

public  void setCreateOpId(long value);

public  void setContZipcode(String value);

public  void setMemberName(String value);

public  void setCustCertCode(String value);

public  void setCustCertExpire(Timestamp value);

public  void setDoneCode(long value);

public  void setCustRelId(long value);

public  void setNotes(String value);

public  void setLunar(int value);

public  void setHomePhone(String value);

public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setBirthday(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setContAddress(String value);

public  void setLastNameQry(String value);

public  void setContEmail(String value);

public  void setGroupCustId(long value);

public  void setOfficePhone(String value);

public  void setLastName(String value);

public  void setFamilyInfo(String value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setMemberPosition(String value);

public  void setCreateOrgId(long value);

public  void setMiddleName(String value);

public  void setGender(int value);

public  void setWorkDept(String value);

public  void setDoneDate(Timestamp value);

public  void setMemberDesc(String value);

public  void setFirstNameQry(String value);

public  void setCreateDate(Timestamp value);

public  void setMiddleNameQry(String value);

public  void setMemberLevel(int value);

public  void setCustCertAddress(String value);

public  void setContFax(String value);
}
