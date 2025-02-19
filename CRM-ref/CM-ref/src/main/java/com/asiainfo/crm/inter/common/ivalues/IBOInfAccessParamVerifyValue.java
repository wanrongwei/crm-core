package com.asiainfo.crm.inter.common.ivalues;

import com.ai.appframe2.common.DataStructInterface;

import java.sql.Timestamp;

public interface IBOInfAccessParamVerifyValue extends DataStructInterface{

  public final static  String S_VerifyValue = "VERIFY_VALUE";
  public final static  String S_State = "STATE";
  public final static  String S_Sort = "SORT";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_AccessParamId = "ACCESS_PARAM_ID";
  public final static  String S_ParamVerifyId = "PARAM_VERIFY_ID";
  public final static  String S_StateDate = "STATE_DATE";
  public final static  String S_VerifyType = "VERIFY_TYPE";
  public final static  String S_CreateDate = "CREATE_DATE";


public String getVerifyValue();

public String getState();

public int getSort();

public String getRemarks();

public long getAccessParamId();

public long getParamVerifyId();

public Timestamp getStateDate();

public String getVerifyType();

public Timestamp getCreateDate();


public  void setVerifyValue(String value);

public  void setState(String value);

public  void setSort(int value);

public  void setRemarks(String value);

public  void setAccessParamId(long value);

public  void setParamVerifyId(long value);

public  void setStateDate(Timestamp value);

public  void setVerifyType(String value);

public  void setCreateDate(Timestamp value);
}
