package com.asiainfo.crm.cm.inner.customer.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmGroupContactValue extends DataStructInterface{

  public final static  String S_IdFileName = "ID_FILE_NAME";
  public final static  String S_State = "STATE";
  public final static  String S_ContBusiInterests = "CONT_BUSI_INTERESTS";
  public final static  String S_ProtoExpireDate = "PROTO_EXPIRE_DATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_PartyId = "PARTY_ID";
  public final static  String S_ContId = "CONT_ID";
  public final static  String S_ProtoValidDate = "PROTO_VALID_DATE";
  public final static  String S_IdExpireDate = "ID_EXPIRE_DATE";
  public final static  String S_ContactPermissions = "CONTACT_PERMISSIONS";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_ContactDepartment = "CONTACT_DEPARTMENT";
  public final static  String S_MemberType = "MEMBER_TYPE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_ContLevel = "CONT_LEVEL";
  public final static  String S_PrioryLevel = "PRIORY_LEVEL";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_ContClass = "CONT_CLASS";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_ProtoFileName = "PROTO_FILE_NAME";
  public final static  String S_ContType = "CONT_TYPE";
  public final static  String S_IdValidDate = "ID_VALID_DATE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_ContSocialInterests = "CONT_SOCIAL_INTERESTS";
  public final static  String S_ProvideId = "PROVIDE_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_MemberDesc = "MEMBER_DESC";
  public final static  String S_MemberJob = "MEMBER_JOB";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_Brand = "BRAND";
  public final static  String S_CustContId = "CUST_CONT_ID";
  public final static  String S_IsInheritable = "IS_INHERITABLE";


public String getIdFileName();

public String getState();

public long getContBusiInterests();

public Timestamp getProtoExpireDate();

public String getRemarks();

public long getPartyId();

public long getContId();

public Timestamp getProtoValidDate();

public Timestamp getIdExpireDate();

public long getContactPermissions();

public long getCustId();

public long getCreateOpId();

public String getContactDepartment();

public long getMemberType();

public long getDoneCode();

public long getContLevel();

public long getPrioryLevel();

public Timestamp getExpireDate();

public long getOpId();

public long getContClass();

public Timestamp getEffectiveDate();

public long getUserId();

public String getProtoFileName();

public long getContType();

public Timestamp getIdValidDate();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public long getContSocialInterests();

public long getProvideId();

public Timestamp getDoneDate();

public String getMemberDesc();

public String getMemberJob();

public String getBillId();

public Timestamp getCreateDate();

public String getBrand();

public long getCustContId();

public long getIsInheritable();


public  void setIdFileName(String value);

public  void setState(String value);

public  void setContBusiInterests(long value);

public  void setProtoExpireDate(Timestamp value);

public  void setRemarks(String value);

public  void setPartyId(long value);

public  void setContId(long value);

public  void setProtoValidDate(Timestamp value);

public  void setIdExpireDate(Timestamp value);

public  void setContactPermissions(long value);

public  void setCustId(long value);

public  void setCreateOpId(long value);

public  void setContactDepartment(String value);

public  void setMemberType(long value);

public  void setDoneCode(long value);

public  void setContLevel(long value);

public  void setPrioryLevel(long value);

public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setContClass(long value);

public  void setEffectiveDate(Timestamp value);

public  void setUserId(long value);

public  void setProtoFileName(String value);

public  void setContType(long value);

public  void setIdValidDate(Timestamp value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setContSocialInterests(long value);

public  void setProvideId(long value);

public  void setDoneDate(Timestamp value);

public  void setMemberDesc(String value);

public  void setMemberJob(String value);

public  void setBillId(String value);

public  void setCreateDate(Timestamp value);

public  void setBrand(String value);

public  void setCustContId(long value);

public  void setIsInheritable(long value);
}
