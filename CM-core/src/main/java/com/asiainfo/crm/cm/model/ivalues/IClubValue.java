package com.asiainfo.crm.cm.model.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IClubValue extends DataStructInterface{

  public final static  String S_ClubCode = "CLUB_CODE";
  public final static  String S_State = "STATE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_ClubDesc = "CLUB_DESC";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_ClubName = "CLUB_NAME";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_ClubType = "CLUB_TYPE";
  public final static  String S_ClubId = "CLUB_ID";


public String getClubCode();

public String getState();

public long getCreateOpId();

public Timestamp getEffectiveDate();

public Timestamp getDoneDate();

public String getClubDesc();

public String getRemarks();

public long getOrgId();

public String getClubName();

public Timestamp getCreateDate();

public long getDoneCode();

public String getRegionId();

public Timestamp getExpireDate();

public long getOpId();

public long getCreateOrgId();

public String getClubType();

public long getClubId();


public  void setClubCode(String value);

public  void setState(String value);

public  void setCreateOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setDoneDate(Timestamp value);

public  void setClubDesc(String value);

public  void setRemarks(String value);

public  void setOrgId(long value);

public  void setClubName(String value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setRegionId(String value);

public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setCreateOrgId(long value);

public  void setClubType(String value);

public  void setClubId(long value);
}
