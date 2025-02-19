package com.asiainfo.crm.inter.common.ivalues;

import com.ai.appframe2.common.DataStructInterface;

import java.sql.Timestamp;

public interface IBOBsServiceParamValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_SrvParamName = "SRV_PARAM_NAME";
  public final static  String S_SrvConfigId = "SRV_CONFIG_ID";
  public final static  String S_SrvParamType = "SRV_PARAM_TYPE";
  public final static  String S_SrvParamId = "SRV_PARAM_ID";
  public final static  String S_IsNull = "IS_NULL";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_Sort = "SORT";
  public final static  String S_SrvParamCode = "SRV_PARAM_CODE";


public String getState();

public String getSrvParamName();

public long getSrvConfigId();

public int getSrvParamType();

public long getSrvParamId();

public String getIsNull();

public Timestamp getCreateDate();

public int getSort();

public String getSrvParamCode();


public  void setState(String value);

public  void setSrvParamName(String value);

public  void setSrvConfigId(long value);

public  void setSrvParamType(int value);

public  void setSrvParamId(long value);

public  void setIsNull(String value);

public  void setCreateDate(Timestamp value);

public  void setSort(int value);

public  void setSrvParamCode(String value);
}
