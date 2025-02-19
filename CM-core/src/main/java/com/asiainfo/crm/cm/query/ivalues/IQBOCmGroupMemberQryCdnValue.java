package com.asiainfo.crm.cm.query.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IQBOCmGroupMemberQryCdnValue extends DataStructInterface{

  public final static  String S_GroupLevel = "GROUP_LEVEL";
  public final static  String S_IndivCustId = "INDIV_CUST_ID";
  public final static  String S_IsHighValue = "IS_HIGH_VALUE";
  public final static  String S_CityId = "CITY_ID";
  public final static  String S_EndDate = "END_DATE";
  public final static  String S_EndDate1 = "END_DATE1";
  public final static  String S_MemUserId = "MEM_USER_ID";
  public final static  String S_AreaId = "AREA_ID";
  public final static  String S_ServiceId = "SERVICE_ID";
  public final static  String S_MemberId = "MEMBER_ID";
  public final static  String S_IsKernelMember = "IS_KERNEL_MEMBER";
  public final static  String S_MemberName = "MEMBER_NAME";
  public final static  String S_GroupName = "GROUP_NAME";
  public final static  String S_MemberType = "MEMBER_TYPE";
  public final static  String S_CustRelId = "CUST_REL_ID";
  public final static  String S_GroupId = "GROUP_ID";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_ContEmail = "CONT_EMAIL";
  public final static  String S_GroupCustId = "GROUP_CUST_ID";
  public final static  String S_MemberAppType = "MEMBER_APP_TYPE";
  public final static  String S_StartDate = "START_DATE";
  public final static  String S_StartDate1 = "START_DATE1";
  public final static  String S_ManagerId = "MANAGER_ID";
  public final static  String S_KernelType = "KERNEL_TYPE";
  public final static  String S_CountyId = "COUNTY_ID";
  public final static  String S_WorkDept = "WORK_DEPT";
  public final static  String S_GroupStatus = "GROUP_STATUS";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_IsKeyMember = "IS_KEY_MEMBER";
  public final static  String S_QueryType = "QUERY_TYPE";
  public final static  String S_UserStatus = "USER_STATUS";
  public final static  String S_IsVip = "IS_VIP";
  public final static  String S_SubId = "SUB_ID";
  public final static  String S_ContFax = "CONT_FAX";
  public final static  String S_IsContact = "IS_CONTACT";
  public final static  String S_MatchType = "MATCH_TYPE";
  public final static  String S_MemberLevel = "MEMBER_LEVEL";


public int getGroupLevel();

public long getIndivCustId();

public int getIsHighValue();

public String getCityId();

public Timestamp getEndDate();

public Timestamp getEndDate1();

public long getMemUserId();

public String getAreaId();

public long getServiceId();

public long getMemberId();

public int getIsKernelMember();

public String getMemberName();

public String getGroupName();

public int getMemberType();

public long getCustRelId();

public long getGroupId();

public long getUserId();

public String getContEmail();

public long getGroupCustId();

public int getMemberAppType();

public Timestamp getStartDate();

public Timestamp getStartDate1();

public long getManagerId();

public int getKernelType();

public String getCountyId();

public String getWorkDept();

public int getGroupStatus();

public String getBillId();

public int getIsKeyMember();

public String getQueryType();

public int getUserStatus();

public int getIsVip();

public long getSubId();

public String getContFax();

public int getIsContact();

public int getMatchType();

public int getMemberLevel();


public  void setGroupLevel(int value);

public  void setIndivCustId(long value);

public  void setIsHighValue(int value);

public  void setCityId(String value);

public  void setEndDate(Timestamp value);

public  void setEndDate1(Timestamp value);

public  void setMemUserId(long value);

public  void setAreaId(String value);

public  void setServiceId(long value);

public  void setMemberId(long value);

public  void setIsKernelMember(int value);

public  void setMemberName(String value);

public  void setGroupName(String value);

public  void setMemberType(int value);

public  void setCustRelId(long value);

public  void setGroupId(long value);

public  void setUserId(long value);

public  void setContEmail(String value);

public  void setGroupCustId(long value);

public  void setMemberAppType(int value);

public  void setStartDate(Timestamp value);

public  void setStartDate1(Timestamp value);

public  void setManagerId(long value);

public  void setKernelType(int value);

public  void setCountyId(String value);

public  void setWorkDept(String value);

public  void setGroupStatus(int value);

public  void setBillId(String value);

public  void setIsKeyMember(int value);

public  void setQueryType(String value);

public  void setUserStatus(int value);

public  void setIsVip(int value);

public  void setSubId(long value);

public  void setContFax(String value);

public  void setIsContact(int value);

public  void setMatchType(int value);

public  void setMemberLevel(int value);
}
