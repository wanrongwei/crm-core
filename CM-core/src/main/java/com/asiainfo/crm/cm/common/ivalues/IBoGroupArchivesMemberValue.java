package com.asiainfo.crm.cm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBoGroupArchivesMemberValue extends DataStructInterface{

  public final static  String S_UserSts = "USER_STS";
  public final static  String S_MemberPhoneId = "MEMBER_PHONE_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_GroupSeq = "GROUP_SEQ";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_MemberSts = "MEMBER_STS";
  public final static  String S_MemberType = "MEMBER_TYPE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_MemberName = "MEMBER_NAME";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_OperType = "OPER_TYPE";
  public final static  String S_WorkDept = "WORK_DEPT";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_GroupMem = "GROUP_MEM";
  public final static  String S_PhoneType = "PHONE_TYPE";
  public final static  String S_NetType = "NET_TYPE";


public int getUserSts();

public String getMemberPhoneId();

public long getCreateOpId();

public Timestamp getEffectiveDate();

public String getGroupSeq();

public Timestamp getDoneDate();

public int getMemberSts();

public int getMemberType();

public String getRemarks();

public long getOrgId();

public Timestamp getCreateDate();

public String getMemberName();

public long getDoneCode();

public int getOperType();

public String getWorkDept();

public String getRegionId();

public long getOpId();

public Timestamp getExpireDate();

public long getCreateOrgId();

public int getGroupMem();

public int getPhoneType();

public int getNetType();


public  void setUserSts(int value);

public  void setMemberPhoneId(String value);

public  void setCreateOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setGroupSeq(String value);

public  void setDoneDate(Timestamp value);

public  void setMemberSts(int value);

public  void setMemberType(int value);

public  void setRemarks(String value);

public  void setOrgId(long value);

public  void setCreateDate(Timestamp value);

public  void setMemberName(String value);

public  void setDoneCode(long value);

public  void setOperType(int value);

public  void setWorkDept(String value);

public  void setRegionId(String value);

public  void setOpId(long value);

public  void setExpireDate(Timestamp value);

public  void setCreateOrgId(long value);

public  void setGroupMem(int value);

public  void setPhoneType(int value);

public  void setNetType(int value);
}
