package com.asiainfo.crm.cm.inner.party.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmxIndivPartyHobbyValue extends DataStructInterface{

  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_HobbyType = "HOBBY_TYPE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_PartyId = "PARTY_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_HobbyId = "HOBBY_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";


public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public int getHobbyType();

public long getOpId();

public String getState();

public String getRemarks();

public long getPartyId();

public long getOrgId();

public long getCreateOrgId();

public String getRegionId();

public int getHobbyId();

public long getCreateOpId();

public Timestamp getDoneDate();

public Timestamp getCreateDate();

public long getDoneCode();


public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setHobbyType(int value);

public  void setOpId(long value);

public  void setState(String value);

public  void setRemarks(String value);

public  void setPartyId(long value);

public  void setOrgId(long value);

public  void setCreateOrgId(long value);

public  void setRegionId(String value);

public  void setHobbyId(int value);

public  void setCreateOpId(long value);

public  void setDoneDate(Timestamp value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);
}
