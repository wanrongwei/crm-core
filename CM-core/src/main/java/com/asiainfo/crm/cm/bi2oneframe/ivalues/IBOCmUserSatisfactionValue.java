package com.asiainfo.crm.cm.bi2oneframe.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmUserSatisfactionValue extends DataStructInterface{

  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_State = "STATE";
  public final static  String S_SmNoSatiNum = "SM_NO_SATI_NUM";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_CallNoSatiNum = "CALL_NO_SATI_NUM";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_SurveyNoSatiNum = "SURVEY_NO_SATI_NUM";
  public final static  String S_CreateVestDepartement = "CREATE_VEST_DEPARTEMENT";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DataId = "DATA_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";


public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public long getOpId();

public String getState();

public int getSmNoSatiNum();

public String getRemarks();

public int getCallNoSatiNum();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public int getSurveyNoSatiNum();

public String getCreateVestDepartement();

public long getCreateOpId();

public long getDataId();

public Timestamp getDoneDate();

public String getBillId();

public Timestamp getCreateDate();

public long getDoneCode();


public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setState(String value);

public  void setSmNoSatiNum(int value);

public  void setRemarks(String value);

public  void setCallNoSatiNum(int value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setSurveyNoSatiNum(int value);

public  void setCreateVestDepartement(String value);

public  void setCreateOpId(long value);

public  void setDataId(long value);

public  void setDoneDate(Timestamp value);

public  void setBillId(String value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);
}
