package com.asiainfo.crm.cm.common.ivalues;

import com.ai.appframe2.common.DataStructInterface;

import java.sql.Timestamp;
public interface IBOCmCfgBusiModelValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_BusiModelImpl = "BUSI_MODEL_IMPL";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_BusiModelInterface = "BUSI_MODEL_INTERFACE";
  public final static  String S_BusiModelId = "BUSI_MODEL_ID";


public String getState();

public String getRegionId();

public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public String getBusiModelImpl();

public String getRemarks();

public String getBusiModelInterface();

public long getBusiModelId();


public  void setState(String value);

public  void setRegionId(String value);

public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setBusiModelImpl(String value);

public  void setRemarks(String value);

public  void setBusiModelInterface(String value);

public  void setBusiModelId(long value);
}
