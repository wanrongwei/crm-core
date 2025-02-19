package com.asiainfo.crm.cm.bi2oneframe.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmSceneMarketingValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_ThreeMonVoiceFee = "THREE_MON_VOICE_FEE";
  public final static  String S_LastMonSmFee = "LAST_MON_SM_FEE";
  public final static  String S_LastMonWlanFee = "LAST_MON_WLAN_FEE";
  public final static  String S_LastMonGprsFee = "LAST_MON_GPRS_FEE";
  public final static  String S_LastMonGprsFlux = "LAST_MON_GPRS_FLUX";
  public final static  String S_DataId = "DATA_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_ThreeMonCallTime = "THREE_MON_CALL_TIME";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_ThreeMonGprsFlux = "THREE_MON_GPRS_FLUX";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_LastMonCallTime = "LAST_MON_CALL_TIME";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_LastMonMou = "LAST_MON_MOU";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_LastMonCallFee = "LAST_MON_CALL_FEE";
  public final static  String S_LastMonRoamingFee = "LAST_MON_ROAMING_FEE";
  public final static  String S_LastMonWlanFlux = "LAST_MON_WLAN_FLUX";
  public final static  String S_LastMonArpu = "LAST_MON_ARPU";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_ThreeMonSmFee = "THREE_MON_SM_FEE";
  public final static  String S_LastMonSmFeeNum = "LAST_MON_SM_FEE_NUM";
  public final static  String S_LastMonFeeFlux = "LAST_MON_FEE_FLUX";
  public final static  String S_CreateVestDepartement = "CREATE_VEST_DEPARTEMENT";
  public final static  String S_LastMonSmNum = "LAST_MON_SM_NUM";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_ThreeMonSmNum = "THREE_MON_SM_NUM";


public String getState();

public String getRemarks();

public long getThreeMonVoiceFee();

public long getLastMonSmFee();

public long getLastMonWlanFee();

public long getLastMonGprsFee();

public long getLastMonGprsFlux();

public long getDataId();

public long getCreateOpId();

public long getThreeMonCallTime();

public long getDoneCode();

public long getThreeMonGprsFlux();

public Timestamp getExpireDate();

public long getLastMonCallTime();

public Timestamp getEffectiveDate();

public long getLastMonMou();

public long getOpId();

public long getLastMonCallFee();

public long getLastMonRoamingFee();

public long getLastMonWlanFlux();

public String getLastMonArpu();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public long getThreeMonSmFee();

public long getLastMonSmFeeNum();

public long getLastMonFeeFlux();

public String getCreateVestDepartement();

public long getLastMonSmNum();

public Timestamp getDoneDate();

public String getBillId();

public Timestamp getCreateDate();

public long getThreeMonSmNum();


public  void setState(String value);

public  void setRemarks(String value);

public  void setThreeMonVoiceFee(long value);

public  void setLastMonSmFee(long value);

public  void setLastMonWlanFee(long value);

public  void setLastMonGprsFee(long value);

public  void setLastMonGprsFlux(long value);

public  void setDataId(long value);

public  void setCreateOpId(long value);

public  void setThreeMonCallTime(long value);

public  void setDoneCode(long value);

public  void setThreeMonGprsFlux(long value);

public  void setExpireDate(Timestamp value);

public  void setLastMonCallTime(long value);

public  void setEffectiveDate(Timestamp value);

public  void setLastMonMou(long value);

public  void setOpId(long value);

public  void setLastMonCallFee(long value);

public  void setLastMonRoamingFee(long value);

public  void setLastMonWlanFlux(long value);

public  void setLastMonArpu(String value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setThreeMonSmFee(long value);

public  void setLastMonSmFeeNum(long value);

public  void setLastMonFeeFlux(long value);

public  void setCreateVestDepartement(String value);

public  void setLastMonSmNum(long value);

public  void setDoneDate(Timestamp value);

public  void setBillId(String value);

public  void setCreateDate(Timestamp value);

public  void setThreeMonSmNum(long value);
}
