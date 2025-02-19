package com.asiainfo.crm.inter.common.ivalues;

import com.ai.appframe2.common.DataStructInterface;

import java.sql.Timestamp;

public interface IBOBsServiceCfgValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_SrvConfigId = "SRV_CONFIG_ID";
  public final static  String S_ImplClass = "IMPL_CLASS";
  public final static  String S_ImplMode = "IMPL_MODE";
  public final static  String S_StateDate = "STATE_DATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_IsMultiCenter = "IS_MULTI_CENTER";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_ImplMethod = "IMPL_METHOD";


public String getState();

public long getSrvConfigId();

public String getImplClass();

public String getImplMode();

public Timestamp getStateDate();

public String getRemarks();

public String getIsMultiCenter();

public Timestamp getCreateDate();

public String getImplMethod();


public  void setState(String value);

public  void setSrvConfigId(long value);

public  void setImplClass(String value);

public  void setImplMode(String value);

public  void setStateDate(Timestamp value);

public  void setRemarks(String value);

public  void setIsMultiCenter(String value);

public  void setCreateDate(Timestamp value);

public  void setImplMethod(String value);
}
