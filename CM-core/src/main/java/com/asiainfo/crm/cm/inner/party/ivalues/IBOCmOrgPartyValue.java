package com.asiainfo.crm.cm.inner.party.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmOrgPartyValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_MemberNum = "MEMBER_NUM";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_PartyId = "PARTY_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_OrgAddress = "ORG_ADDRESS";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_ManagerName = "MANAGER_NAME";


public String getState();

public long getCreateOpId();

public Timestamp getEffectiveDate();

public Timestamp getDoneDate();

public String getRemarks();

public int getMemberNum();

public long getOrgId();

public long getPartyId();

public Timestamp getCreateDate();

public long getDoneCode();

public String getRegionId();

public Timestamp getExpireDate();

public long getOpId();

public String getOrgAddress();

public long getCreateOrgId();

public String getManagerName();


public  void setState(String value);

public  void setCreateOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setDoneDate(Timestamp value);

public  void setRemarks(String value);

public  void setMemberNum(int value);

public  void setOrgId(long value);

public  void setPartyId(long value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setRegionId(String value);

public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setOrgAddress(String value);

public  void setCreateOrgId(long value);

public  void setManagerName(String value);
}
