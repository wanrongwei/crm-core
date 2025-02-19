package com.asiainfo.crm.cm.bi2oneframe.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmUserChnnHobbyValue extends DataStructInterface{

  public final static  String S_CallTimes = "CALL_TIMES";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_WebOnlineTimes = "WEB_ONLINE_TIMES";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_ChangelCallTimes = "CHANGEL_CALL_TIMES";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_SmChannelTimes = "SM_CHANNEL_TIMES";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_IvrChannelTimes = "IVR_CHANNEL_TIMES";
  public final static  String S_CreateVestDepartement = "CREATE_VEST_DEPARTEMENT";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DataId = "DATA_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";


public long getCallTimes();

public Timestamp getExpireDate();

public long getWebOnlineTimes();

public long getOpId();

public Timestamp getEffectiveDate();

public String getState();

public String getRemarks();

public long getChangelCallTimes();

public long getOrgId();

public long getSmChannelTimes();

public String getRegionId();

public long getCreateOrgId();

public long getIvrChannelTimes();

public String getCreateVestDepartement();

public long getCreateOpId();

public long getDataId();

public Timestamp getDoneDate();

public String getBillId();

public Timestamp getCreateDate();

public long getDoneCode();


public  void setCallTimes(long value);

public  void setExpireDate(Timestamp value);

public  void setWebOnlineTimes(long value);

public  void setOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setState(String value);

public  void setRemarks(String value);

public  void setChangelCallTimes(long value);

public  void setOrgId(long value);

public  void setSmChannelTimes(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setIvrChannelTimes(long value);

public  void setCreateVestDepartement(String value);

public  void setCreateOpId(long value);

public  void setDataId(long value);

public  void setDoneDate(Timestamp value);

public  void setBillId(String value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);
}
