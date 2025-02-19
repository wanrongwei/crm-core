package com.asiainfo.crm.cm.custgroup.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmGeneralConfigValue extends DataStructInterface{

  public final static  String S_OpId = "OP_ID";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_SrcType = "SRC_TYPE";
  public final static  String S_ConfigDesc = "CONFIG_DESC";
  public final static  String S_Value5 = "VALUE5";
  public final static  String S_Value4 = "VALUE4";
  public final static  String S_LastUpdateDate = "LAST_UPDATE_DATE";
  public final static  String S_Value3 = "VALUE3";
  public final static  String S_TenantId = "TENANT_ID";
  public final static  String S_Value2 = "VALUE2";
  public final static  String S_Value1 = "VALUE1";
  public final static  String S_ConfigType = "CONFIG_TYPE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_ConfigCode = "CONFIG_CODE";


public long getOpId();

public String getState();

public String getRemarks();

public String getSrcType();

public String getConfigDesc();

public String getValue5();

public String getValue4();

public Timestamp getLastUpdateDate();

public String getValue3();

public String getTenantId();

public String getValue2();

public String getValue1();

public String getConfigType();

public Timestamp getCreateDate();

public String getConfigCode();


public  void setOpId(long value);

public  void setState(String value);

public  void setRemarks(String value);

public  void setSrcType(String value);

public  void setConfigDesc(String value);

public  void setValue5(String value);

public  void setValue4(String value);

public  void setLastUpdateDate(Timestamp value);

public  void setValue3(String value);

public  void setTenantId(String value);

public  void setValue2(String value);

public  void setValue1(String value);

public  void setConfigType(String value);

public  void setCreateDate(Timestamp value);

public  void setConfigCode(String value);
}
