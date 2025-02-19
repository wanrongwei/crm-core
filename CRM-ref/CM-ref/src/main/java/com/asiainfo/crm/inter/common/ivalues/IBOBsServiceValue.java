package com.asiainfo.crm.inter.common.ivalues;

import com.ai.appframe2.common.DataStructInterface;

import java.sql.Timestamp;

public interface IBOBsServiceValue extends DataStructInterface{

  public final static  String S_SrvDesc = "SRV_DESC";
  public final static  String S_State = "STATE";
  public final static  String S_SrvName = "SRV_NAME";
  public final static  String S_SrvType = "SRV_TYPE";
  public final static  String S_SrvLevel = "SRV_LEVEL";
  public final static  String S_StateDate = "STATE_DATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_SrvParentId = "SRV_PARENT_ID";
  public final static  String S_SrvNodeType = "SRV_NODE_TYPE";
  public final static  String S_SrvId = "SRV_ID";


public String getSrvDesc();

public String getState();

public String getSrvName();

public String getSrvType();

public String getSrvLevel();

public Timestamp getStateDate();

public String getRemarks();

public Timestamp getCreateDate();

public long getSrvParentId();

public String getSrvNodeType();

public long getSrvId();


public  void setSrvDesc(String value);

public  void setState(String value);

public  void setSrvName(String value);

public  void setSrvType(String value);

public  void setSrvLevel(String value);

public  void setStateDate(Timestamp value);

public  void setRemarks(String value);

public  void setCreateDate(Timestamp value);

public  void setSrvParentId(long value);

public  void setSrvNodeType(String value);

public  void setSrvId(long value);
}
