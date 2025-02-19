package com.asiainfo.crm.cm.inner.customer.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmxGroupCreditPointValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_CityId = "CITY_ID";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_Points = "POINTS";
  public final static  String S_ManagerSel = "MANAGER_SEL";
  public final static  String S_RecId = "REC_ID";
  public final static  String S_County = "COUNTY";
  public final static  String S_Manager = "MANAGER";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_ManagerQry = "MANAGER_QRY";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_Area = "AREA";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CustName = "CUST_NAME";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_PointType = "POINT_TYPE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_Ext1 = "EXT1";
  public final static  String S_Ext2 = "EXT2";


public String getState();

public String getCityId();

public String getRemarks();

public double getPoints();

public String getManagerSel();

public long getRecId();

public String getCounty();

public String getManager();

public long getCustId();

public long getCreateOpId();

public String getManagerQry();

public long getDoneCode();

public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public long getOpId();

public String getArea();

public long getOrgId();

public long getCreateOrgId();

public String getRegionId();

public String getCustName();

public Timestamp getDoneDate();

public int getPointType();

public Timestamp getCreateDate();

public double getExt1();

public String getExt2();


public  void setState(String value);

public  void setCityId(String value);

public  void setRemarks(String value);

public  void setPoints(double value);

public  void setManagerSel(String value);

public  void setRecId(long value);

public  void setCounty(String value);

public  void setManager(String value);

public  void setCustId(long value);

public  void setCreateOpId(long value);

public  void setManagerQry(String value);

public  void setDoneCode(long value);

public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setArea(String value);

public  void setOrgId(long value);

public  void setCreateOrgId(long value);

public  void setRegionId(String value);

public  void setCustName(String value);

public  void setDoneDate(Timestamp value);

public  void setPointType(int value);

public  void setCreateDate(Timestamp value);

public  void setExt1(double value);

public  void setExt2(String value);
}
