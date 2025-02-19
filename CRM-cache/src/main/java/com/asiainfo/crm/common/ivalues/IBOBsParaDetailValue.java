package com.asiainfo.crm.common.ivalues;

import com.ai.appframe2.common.DataStructInterface;

import java.sql.Timestamp;
public interface IBOBsParaDetailValue extends DataStructInterface{

  public final static  String S_OpId = "OP_ID";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_ParaType = "PARA_TYPE";
  public final static  String S_Para5 = "PARA5";
  public final static  String S_StateDate = "STATE_DATE";
  public final static  String S_Para4 = "PARA4";
  public final static  String S_ParaCode = "PARA_CODE";
  public final static  String S_Para1 = "PARA1";
  public final static  String S_ParaName = "PARA_NAME";
  public final static  String S_ParaDesc = "PARA_DESC";
  public final static  String S_Para3 = "PARA3";
  public final static  String S_Para2 = "PARA2";
  public final static  String S_RegionId = "REGION_ID";


public long getOpId();

public String getState();

public String getRemarks();

public String getParaType();

public String getPara5();

public Timestamp getStateDate();

public String getPara4();

public String getParaCode();

public String getPara1();

public String getParaName();

public String getParaDesc();

public String getPara3();

public String getPara2();

public String getRegionId();


public  void setOpId(long value);

public  void setState(String value);

public  void setRemarks(String value);

public  void setParaType(String value);

public  void setPara5(String value);

public  void setStateDate(Timestamp value);

public  void setPara4(String value);

public  void setParaCode(String value);

public  void setPara1(String value);

public  void setParaName(String value);

public  void setParaDesc(String value);

public  void setPara3(String value);

public  void setPara2(String value);

public  void setRegionId(String value);
}
