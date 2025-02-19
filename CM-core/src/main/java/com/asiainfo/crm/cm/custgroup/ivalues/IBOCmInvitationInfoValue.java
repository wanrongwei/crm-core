package com.asiainfo.crm.cm.custgroup.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmInvitationInfoValue extends DataStructInterface{

  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_InviteMode = "INVITE_MODE";
  public final static  String S_GroupId = "GROUP_ID";
  public final static  String S_Ext1 = "EXT1";
  public final static  String S_Ext2 = "EXT2";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_Ext3 = "EXT3";
  public final static  String S_Status = "STATUS";
  public final static  String S_InviteeIdentity = "invitee_identity";
  public final static  String S_Inviter = "INVITER";
  public final static  String S_IsSeen = "IS_SEEN";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_InviteeRefId = "INVITEE_REF_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_InvitationId = "INVITATION_ID";


public long getCreateOpId();

public Timestamp getDoneDate();

public long getOrgId();

public long getDoneCode();

public long getOpId();

public long getInviteMode();

public long getGroupId();

public String getExt1();

public String getExt2();

public Timestamp getCreateDate();

public String getExt3();

public long getStatus();

public String getInviteeIdentity();

public long getInviter();

public String getIsSeen();

public long getCreateOrgId();

public long getInviteeRefId();

public Timestamp getExpireDate();

public long getInvitationId();


public  void setCreateOpId(long value);

public  void setDoneDate(Timestamp value);

public  void setOrgId(long value);

public  void setDoneCode(long value);

public  void setOpId(long value);

public  void setInviteMode(long value);

public  void setGroupId(long value);

public  void setExt1(String value);

public  void setExt2(String value);

public  void setCreateDate(Timestamp value);

public  void setExt3(String value);

public  void setStatus(long value);

public  void setInviteeIdentity(String value);

public  void setInviter(long value);

public  void setIsSeen(String value);

public  void setCreateOrgId(long value);

public  void setInviteeRefId(long value);

public  void setExpireDate(Timestamp value);

public  void setInvitationId(long value);
}
