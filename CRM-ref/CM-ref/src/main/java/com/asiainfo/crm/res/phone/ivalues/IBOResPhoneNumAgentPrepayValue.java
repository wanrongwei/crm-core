package com.asiainfo.crm.res.phone.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOResPhoneNumAgentPrepayValue extends DataStructInterface{

  public final static  String S_OpId = "OP_ID";
  public final static  String S_Sts = "STS";
  public final static  String S_HoldCol = "HOLD_COL";
  public final static  String S_HoldDate1 = "HOLD_DATE1";
  public final static  String S_Imsi = "IMSI";
  public final static  String S_Remark = "REMARK";
  public final static  String S_CondId = "COND_ID";
  public final static  String S_FeeItem = "FEE_ITEM";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_StsDate = "STS_DATE";
  public final static  String S_ProdId = "PROD_ID";
  public final static  String S_CountyId = "COUNTY_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_ResId = "RES_ID";
  public final static  String S_HoldCol2 = "HOLD_COL2";
  public final static  String S_SimId = "SIM_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_AgentId = "AGENT_ID";
  public final static  String S_Fee = "FEE";


public long getOpId();

public int getSts();

public String getHoldCol();

public Timestamp getHoldDate1();

public String getImsi();

public String getRemark();

public long getCondId();

public long getFeeItem();

public long getOrgId();

public String getRegionId();

public Timestamp getStsDate();

public long getProdId();

public String getCountyId();

public Timestamp getDoneDate();

public String getResId();

public String getHoldCol2();

public String getSimId();

public long getDoneCode();

public long getAgentId();

public long getFee();


public  void setOpId(long value);

public  void setSts(int value);

public  void setHoldCol(String value);

public  void setHoldDate1(Timestamp value);

public  void setImsi(String value);

public  void setRemark(String value);

public  void setCondId(long value);

public  void setFeeItem(long value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setStsDate(Timestamp value);

public  void setProdId(long value);

public  void setCountyId(String value);

public  void setDoneDate(Timestamp value);

public  void setResId(String value);

public  void setHoldCol2(String value);

public  void setSimId(String value);

public  void setDoneCode(long value);

public  void setAgentId(long value);

public  void setFee(long value);
}
