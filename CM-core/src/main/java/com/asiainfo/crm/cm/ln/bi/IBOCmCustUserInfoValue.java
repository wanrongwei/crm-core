package com.asiainfo.crm.cm.ln.bi;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmCustUserInfoValue extends DataStructInterface{

  public final static  String S_IsToplevelUser = "IS_TOPLEVEL_USER";
  public final static  String S_State = "STATE";
  public final static  String S_InprovDistanceTime = "INPROV_DISTANCE_TIME";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_Arpu = "ARPU";
  public final static  String S_UserRegionId = "USER_REGION_ID";
  public final static  String S_OutprovRoamTime = "OUTPROV_ROAM_TIME";
  public final static  String S_IsGroupUser = "IS_GROUP_USER";
  public final static  String S_EveningCallTime = "EVENING_CALL_TIME";
  public final static  String S_IsFamilyUser = "IS_FAMILY_USER";
  public final static  String S_DataId = "DATA_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_InNetTime = "IN_NET_TIME";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_AfternoonCallTime = "AFTERNOON_CALL_TIME";
  public final static  String S_InternationalTime = "INTERNATIONAL_TIME";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_IsKeyUser = "IS_KEY_USER";
  public final static  String S_InternationalRoamTime = "INTERNATIONAL_ROAM_TIME";
  public final static  String S_NightCallTime = "NIGHT_CALL_TIME";
  public final static  String S_IsReinUser = "IS_REIN_USER";
  public final static  String S_LeaveWaring = "LEAVE_WARING";
  public final static  String S_MorningCallTime = "MORNING_CALL_TIME";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_InprovRoamTime = "INPROV_ROAM_TIME";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_IsOpenGprs = "IS_OPEN_GPRS";


public int getIsToplevelUser();

public String getState();

public String getInprovDistanceTime();

public String getRemarks();

public String getArpu();

public String getUserRegionId();

public String getOutprovRoamTime();

public int getIsGroupUser();

public String getEveningCallTime();

public int getIsFamilyUser();

public long getDataId();

public long getCreateOpId();

public String getInNetTime();

public long getDoneCode();

public Timestamp getExpireDate();

public long getOpId();

public Timestamp getEffectiveDate();

public String getAfternoonCallTime();

public String getInternationalTime();

public long getUserId();

public int getIsKeyUser();

public String getInternationalRoamTime();

public String getNightCallTime();

public int getIsReinUser();

public String getLeaveWaring();

public String getMorningCallTime();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public String getInprovRoamTime();

public Timestamp getDoneDate();

public Timestamp getCreateDate();

public int getIsOpenGprs();


public  void setIsToplevelUser(int value);

public  void setState(String value);

public  void setInprovDistanceTime(String value);

public  void setRemarks(String value);

public  void setArpu(String value);

public  void setUserRegionId(String value);

public  void setOutprovRoamTime(String value);

public  void setIsGroupUser(int value);

public  void setEveningCallTime(String value);

public  void setIsFamilyUser(int value);

public  void setDataId(long value);

public  void setCreateOpId(long value);

public  void setInNetTime(String value);

public  void setDoneCode(long value);

public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setAfternoonCallTime(String value);

public  void setInternationalTime(String value);

public  void setUserId(long value);

public  void setIsKeyUser(int value);

public  void setInternationalRoamTime(String value);

public  void setNightCallTime(String value);

public  void setIsReinUser(int value);

public  void setLeaveWaring(String value);

public  void setMorningCallTime(String value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setInprovRoamTime(String value);

public  void setDoneDate(Timestamp value);

public  void setCreateDate(Timestamp value);

public  void setIsOpenGprs(int value);
}
