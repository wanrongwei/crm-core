package com.asiainfo.crm.cm.inner.contact.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmGroupContactHValue extends DataStructInterface{

  public final static  String S_IdFileName = "ID_FILE_NAME";
  public final static  String S_State = "STATE";
  public final static  String S_ProtoExpireDate = "PROTO_EXPIRE_DATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_PartyId = "PARTY_ID";
  public final static  String S_ContId = "CONT_ID";
  public final static  String S_ProtoValidDate = "PROTO_VALID_DATE";
  public final static  String S_IdExpireDate = "ID_EXPIRE_DATE";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_MemberType = "MEMBER_TYPE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_ContLevel = "CONT_LEVEL";
  public final static  String S_PrioryLevel = "PRIORY_LEVEL";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_ContClass = "CONT_CLASS";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_HId = "H_ID";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_ProtoFileName = "PROTO_FILE_NAME";
  public final static  String S_ContType = "CONT_TYPE";
  public final static  String S_IdValidDate = "ID_VALID_DATE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_ProvideId = "PROVIDE_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_MemberDesc = "MEMBER_DESC";
  public final static  String S_MemberJob = "MEMBER_JOB";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_Brand = "BRAND";
  public final static  String S_CustContId = "CUST_CONT_ID";


public String getIdFileName();

public String getState();

public Timestamp getProtoExpireDate();

public String getRemarks();

public long getPartyId();

public long getContId();

public Timestamp getProtoValidDate();

public Timestamp getIdExpireDate();

public long getCustId();

public long getCreateOpId();

public int getMemberType();

public long getDoneCode();

public int getContLevel();

public int getPrioryLevel();

public Timestamp getExpireDate();

public int getContClass();

public Timestamp getEffectiveDate();

public long getOpId();

public long getHId();

public long getUserId();

public String getProtoFileName();

public int getContType();

public Timestamp getIdValidDate();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public int getProvideId();

public Timestamp getDoneDate();

public String getMemberDesc();

public String getMemberJob();

public String getBillId();

public Timestamp getCreateDate();

public String getBrand();

public long getCustContId();


public  void setIdFileName(String value);

public  void setState(String value);

public  void setProtoExpireDate(Timestamp value);

public  void setRemarks(String value);

public  void setPartyId(long value);

public  void setContId(long value);

public  void setProtoValidDate(Timestamp value);

public  void setIdExpireDate(Timestamp value);

public  void setCustId(long value);

public  void setCreateOpId(long value);

public  void setMemberType(int value);

public  void setDoneCode(long value);

public  void setContLevel(int value);

public  void setPrioryLevel(int value);

public  void setExpireDate(Timestamp value);

public  void setContClass(int value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setHId(long value);

public  void setUserId(long value);

public  void setProtoFileName(String value);

public  void setContType(int value);

public  void setIdValidDate(Timestamp value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setProvideId(int value);

public  void setDoneDate(Timestamp value);

public  void setMemberDesc(String value);

public  void setMemberJob(String value);

public  void setBillId(String value);

public  void setCreateDate(Timestamp value);

public  void setBrand(String value);

public  void setCustContId(long value);
}
