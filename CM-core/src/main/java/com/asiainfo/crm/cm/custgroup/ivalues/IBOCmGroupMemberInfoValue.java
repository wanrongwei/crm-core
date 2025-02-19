package com.asiainfo.crm.cm.custgroup.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmGroupMemberInfoValue extends DataStructInterface{

  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_JoinCode = "JOIN_CODE";
  public final static  String S_MemberName = "MEMBER_NAME";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_GroupRole = "GROUP_ROLE";
  public final static  String S_MemberRefId = "MEMBER_REF_ID";
  public final static  String S_GroupId = "GROUP_ID";
  public final static  String S_Ext1 = "EXT1";
  public final static  String S_Ext2 = "EXT2";
  public final static  String S_MemberStatus = "MEMBER_STATUS";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_Ext3 = "EXT3";
  public final static  String S_QuitMode = "QUIT_MODE";
  public final static  String S_MemberId = "MEMBER_ID";
  public final static  String S_JoinMode = "JOIN_MODE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";


public Timestamp getEffectiveDate();

public Timestamp getDoneDate();

public String getJoinCode();

public String getMemberName();

public long getOrgId();

public long getDoneCode();

public long getOpId();

public long getGroupRole();

public long getMemberRefId();

public long getGroupId();

public String getExt1();

public String getExt2();

public long getMemberStatus();

public Timestamp getCreateDate();

public String getExt3();

public long getQuitMode();

public long getMemberId();

public long getJoinMode();

public Timestamp getExpireDate();


public  void setEffectiveDate(Timestamp value);

public  void setDoneDate(Timestamp value);

public  void setJoinCode(String value);

public  void setMemberName(String value);

public  void setOrgId(long value);

public  void setDoneCode(long value);

public  void setOpId(long value);

public  void setGroupRole(long value);

public  void setMemberRefId(long value);

public  void setGroupId(long value);

public  void setExt1(String value);

public  void setExt2(String value);

public  void setMemberStatus(long value);

public  void setCreateDate(Timestamp value);

public  void setExt3(String value);

public  void setQuitMode(long value);

public  void setMemberId(long value);

public  void setJoinMode(long value);

public  void setExpireDate(Timestamp value);
}
