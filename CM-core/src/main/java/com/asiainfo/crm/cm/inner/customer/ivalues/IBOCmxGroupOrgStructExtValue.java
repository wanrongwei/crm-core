package com.asiainfo.crm.cm.inner.customer.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmxGroupOrgStructExtValue extends DataStructInterface{

  public final static  String S_DeptId = "DEPT_ID";
  public final static  String S_PostAddress = "POST_ADDRESS";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_PostProvince = "POST_PROVINCE";
  public final static  String S_ContName = "CONT_NAME";
  public final static  String S_ShortName = "SHORT_NAME";
  public final static  String S_Street = "STREET";
  public final static  String S_County = "COUNTY";
  public final static  String S_ContMobile = "CONT_MOBILE";
  public final static  String S_PostCity = "POST_CITY";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_Email = "EMAIL";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_FaxId = "FAX_ID";
  public final static  String S_ContCertType = "CONT_CERT_TYPE";
  public final static  String S_EnglishName = "ENGLISH_NAME";
  public final static  String S_Room = "ROOM";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_PostPostcod = "POST_POSTCOD";
  public final static  String S_Build = "BUILD";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_Province = "PROVINCE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_City = "CITY";
  public final static  String S_MemberNum = "MEMBER_NUM";
  public final static  String S_ContCertCode = "CONT_CERT_CODE";


public long getDeptId();

public String getPostAddress();

public String getState();

public String getRemarks();

public String getPostProvince();

public String getContName();

public String getShortName();

public String getStreet();

public String getCounty();

public String getContMobile();

public String getPostCity();

public long getCreateOpId();

public String getEmail();

public long getDoneCode();

public String getFaxId();

public int getContCertType();

public String getEnglishName();

public String getRoom();

public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public long getOpId();

public String getPostPostcod();

public String getBuild();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public String getProvince();

public Timestamp getDoneDate();

public Timestamp getCreateDate();

public String getCity();

public long getMemberNum();

public String getContCertCode();


public  void setDeptId(long value);

public  void setPostAddress(String value);

public  void setState(String value);

public  void setRemarks(String value);

public  void setPostProvince(String value);

public  void setContName(String value);

public  void setShortName(String value);

public  void setStreet(String value);

public  void setCounty(String value);

public  void setContMobile(String value);

public  void setPostCity(String value);

public  void setCreateOpId(long value);

public  void setEmail(String value);

public  void setDoneCode(long value);

public  void setFaxId(String value);

public  void setContCertType(int value);

public  void setEnglishName(String value);

public  void setRoom(String value);

public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setPostPostcod(String value);

public  void setBuild(String value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setProvince(String value);

public  void setDoneDate(Timestamp value);

public  void setCreateDate(Timestamp value);

public  void setCity(String value);

public  void setMemberNum(long value);

public  void setContCertCode(String value);
}
