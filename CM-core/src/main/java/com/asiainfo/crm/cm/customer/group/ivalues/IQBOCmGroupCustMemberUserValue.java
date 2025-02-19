package com.asiainfo.crm.cm.customer.group.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IQBOCmGroupCustMemberUserValue extends DataStructInterface{

  public final static  String S_DeptId = "DEPT_ID";
  public final static  String S_IsFromunion = "IS_FROMUNION";
  public final static  String S_CustRegionId = "CUST_REGION_ID";
  public final static  String S_CustLevel = "CUST_LEVEL";
  public final static  String S_UserRegionId = "USER_REGION_ID";
  public final static  String S_MemUserId = "MEM_USER_ID";
  public final static  String S_ServiceId = "SERVICE_ID";
  public final static  String S_ChnlRegionType = "CHNL_REGION_TYPE";
  public final static  String S_AlarmBillId = "ALARM_BILL_ID";
  public final static  String S_CustCertType = "CUST_CERT_TYPE";
  public final static  String S_ContZipcode = "CONT_ZIPCODE";
  public final static  String S_CustCertCode = "CUST_CERT_CODE";
  public final static  String S_MemberName = "MEMBER_NAME";
  public final static  String S_CustCertExpire = "CUST_CERT_EXPIRE";
  public final static  String S_ChnlRegionDetail = "CHNL_REGION_DETAIL";
  public final static  String S_HomePhone = "HOME_PHONE";
  public final static  String S_Lunar = "LUNAR";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_ChnlCityId = "CHNL_CITY_ID";
  public final static  String S_GroupId = "GROUP_ID";
  public final static  String S_MemberState = "MEMBER_STATE";
  public final static  String S_ContEmail = "CONT_EMAIL";
  public final static  String S_OfficePhone = "OFFICE_PHONE";
  public final static  String S_MemberAppType = "MEMBER_APP_TYPE";
  public final static  String S_MemberPosition = "MEMBER_POSITION";
  public final static  String S_CustName = "CUST_NAME";
  public final static  String S_IsHighvalue = "IS_HIGHVALUE";
  public final static  String S_VipLevel = "VIP_LEVEL";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_OldBillId = "OLD_BILL_ID";
  public final static  String S_GroupStatus = "GROUP_STATUS";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_UserStatus = "USER_STATUS";
  public final static  String S_IndivCustId = "INDIV_CUST_ID";
  public final static  String S_OtherHobby = "OTHER_HOBBY";
  public final static  String S_UserState = "USER_STATE";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_GroupState = "GROUP_STATE";
  public final static  String S_MemberType = "MEMBER_TYPE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_CustRelId = "CUST_REL_ID";
  public final static  String S_Notes = "NOTES";
  public final static  String S_Birthday = "BIRTHDAY";
  public final static  String S_ContAddress = "CONT_ADDRESS";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_GroupCustId = "GROUP_CUST_ID";
  public final static  String S_FamilyInfo = "FAMILY_INFO";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_Gender = "GENDER";
  public final static  String S_WorkDept = "WORK_DEPT";
  public final static  String S_MemberDesc = "MEMBER_DESC";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_CustCertAddress = "CUST_CERT_ADDRESS";
  public final static  String S_ContFax = "CONT_FAX";
  public final static  String S_MemberLevel = "MEMBER_LEVEL";


public long getDeptId();

public int getIsFromunion();

public String getCustRegionId();

public int getCustLevel();

public String getUserRegionId();

public long getMemUserId();

public String getServiceId();

public String getChnlRegionType();

public String getAlarmBillId();

public int getCustCertType();

public String getContZipcode();

public String getCustCertCode();

public String getMemberName();

public Timestamp getCustCertExpire();

public long getChnlRegionDetail();

public String getHomePhone();

public int getLunar();

public Timestamp getExpireDate();

public long getOpId();

public Timestamp getEffectiveDate();

public String getChnlCityId();

public long getGroupId();

public String getMemberState();

public String getContEmail();

public String getOfficePhone();

public int getMemberAppType();

public String getMemberPosition();

public String getCustName();

public int getIsHighvalue();

public int getVipLevel();

public Timestamp getDoneDate();

public String getOldBillId();

public int getGroupStatus();

public Timestamp getCreateDate();

public int getUserStatus();

public long getIndivCustId();

public String getOtherHobby();

public String getUserState();

public long getAcctId();

public long getCreateOpId();

public String getGroupState();

public int getMemberType();

public long getDoneCode();

public long getCustRelId();

public String getNotes();

public Timestamp getBirthday();

public String getContAddress();

public long getUserId();

public long getGroupCustId();

public String getFamilyInfo();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public int getGender();

public String getWorkDept();

public String getMemberDesc();

public String getBillId();

public String getCustCertAddress();

public String getContFax();

public int getMemberLevel();


public  void setDeptId(long value);

public  void setIsFromunion(int value);

public  void setCustRegionId(String value);

public  void setCustLevel(int value);

public  void setUserRegionId(String value);

public  void setMemUserId(long value);

public  void setServiceId(String value);

public  void setChnlRegionType(String value);

public  void setAlarmBillId(String value);

public  void setCustCertType(int value);

public  void setContZipcode(String value);

public  void setCustCertCode(String value);

public  void setMemberName(String value);

public  void setCustCertExpire(Timestamp value);

public  void setChnlRegionDetail(long value);

public  void setHomePhone(String value);

public  void setLunar(int value);

public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setChnlCityId(String value);

public  void setGroupId(long value);

public  void setMemberState(String value);

public  void setContEmail(String value);

public  void setOfficePhone(String value);

public  void setMemberAppType(int value);

public  void setMemberPosition(String value);

public  void setCustName(String value);

public  void setIsHighvalue(int value);

public  void setVipLevel(int value);

public  void setDoneDate(Timestamp value);

public  void setOldBillId(String value);

public  void setGroupStatus(int value);

public  void setCreateDate(Timestamp value);

public  void setUserStatus(int value);

public  void setIndivCustId(long value);

public  void setOtherHobby(String value);

public  void setUserState(String value);

public  void setAcctId(long value);

public  void setCreateOpId(long value);

public  void setGroupState(String value);

public  void setMemberType(int value);

public  void setDoneCode(long value);

public  void setCustRelId(long value);

public  void setNotes(String value);

public  void setBirthday(Timestamp value);

public  void setContAddress(String value);

public  void setUserId(long value);

public  void setGroupCustId(long value);

public  void setFamilyInfo(String value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setGender(int value);

public  void setWorkDept(String value);

public  void setMemberDesc(String value);

public  void setBillId(String value);

public  void setCustCertAddress(String value);

public  void setContFax(String value);

public  void setMemberLevel(int value);
}
