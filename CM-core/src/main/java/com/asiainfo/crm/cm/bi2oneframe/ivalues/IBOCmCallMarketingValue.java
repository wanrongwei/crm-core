package com.asiainfo.crm.cm.bi2oneframe.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmCallMarketingValue extends DataStructInterface{

  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_State = "STATE";
  public final static  String S_UserHobby = "USER_HOBBY";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_AccessDate = "ACCESS_DATE";
  public final static  String S_SendMmsNum = "SEND_MMS_NUM";
  public final static  String S_SendSmNum = "SEND_SM_NUM";
  public final static  String S_NewBusiFee = "NEW_BUSI_FEE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_CreateVestDepartement = "CREATE_VEST_DEPARTEMENT";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DataId = "DATA_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_CurrentMonFee = "CURRENT_MON_FEE";
  public final static  String S_IsMobilePayAcct = "IS_MOBILE_PAY_ACCT";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_GprsFlux = "GPRS_FLUX";
  public final static  String S_LastMonFee = "LAST_MON_FEE";


public Timestamp getExpireDate();

public long getOpId();

public Timestamp getEffectiveDate();

public String getState();

public String getUserHobby();

public String getRemarks();

public Timestamp getAccessDate();

public long getSendMmsNum();

public long getSendSmNum();

public long getNewBusiFee();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public String getCreateVestDepartement();

public long getCreateOpId();

public long getDataId();

public Timestamp getDoneDate();

public long getCurrentMonFee();

public String getIsMobilePayAcct();

public String getBillId();

public Timestamp getCreateDate();

public long getDoneCode();

public long getGprsFlux();

public long getLastMonFee();


public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setState(String value);

public  void setUserHobby(String value);

public  void setRemarks(String value);

public  void setAccessDate(Timestamp value);

public  void setSendMmsNum(long value);

public  void setSendSmNum(long value);

public  void setNewBusiFee(long value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setCreateVestDepartement(String value);

public  void setCreateOpId(long value);

public  void setDataId(long value);

public  void setDoneDate(Timestamp value);

public  void setCurrentMonFee(long value);

public  void setIsMobilePayAcct(String value);

public  void setBillId(String value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setGprsFlux(long value);

public  void setLastMonFee(long value);
}
