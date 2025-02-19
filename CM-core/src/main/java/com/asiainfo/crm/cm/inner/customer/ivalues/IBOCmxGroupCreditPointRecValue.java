package com.asiainfo.crm.cm.inner.customer.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmxGroupCreditPointRecValue extends DataStructInterface{

  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_BeforeAdjustPoints = "BEFORE_ADJUST_POINTS";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_PointsType = "POINTS_TYPE";
  public final static  String S_Exti = "EXTI";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_RecId = "REC_ID";
  public final static  String S_AdjustReason = "ADJUST_REASON";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_CustName = "CUST_NAME";
  public final static  String S_AdjustDirection = "ADJUST_DIRECTION";
  public final static  String S_AfterAdjustPoints = "AFTER_ADJUST_POINTS";
  public final static  String S_OpName = "OP_NAME";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_AdjustPoints = "ADJUST_POINTS";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_Ext2 = "EXT2";


public Timestamp getExpireDate();

public long getOpId();

public double getBeforeAdjustPoints();

public Timestamp getEffectiveDate();

public String getState();

public String getRemarks();

public int getPointsType();

public long getExti();

public long getOrgId();

public String getRegionId();

public long getRecId();

public String getAdjustReason();

public long getCreateOrgId();

public String getCustName();

public int getAdjustDirection();

public double getAfterAdjustPoints();

public String getOpName();

public long getCustId();

public long getCreateOpId();

public Timestamp getDoneDate();

public double getAdjustPoints();

public Timestamp getCreateDate();

public long getDoneCode();

public String getExt2();


public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setBeforeAdjustPoints(double value);

public  void setEffectiveDate(Timestamp value);

public  void setState(String value);

public  void setRemarks(String value);

public  void setPointsType(int value);

public  void setExti(long value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setRecId(long value);

public  void setAdjustReason(String value);

public  void setCreateOrgId(long value);

public  void setCustName(String value);

public  void setAdjustDirection(int value);

public  void setAfterAdjustPoints(double value);

public  void setOpName(String value);

public  void setCustId(long value);

public  void setCreateOpId(long value);

public  void setDoneDate(Timestamp value);

public  void setAdjustPoints(double value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setExt2(String value);
}
