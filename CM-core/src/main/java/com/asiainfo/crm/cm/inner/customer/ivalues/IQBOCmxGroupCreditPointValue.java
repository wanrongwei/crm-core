package com.asiainfo.crm.cm.inner.customer.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IQBOCmxGroupCreditPointValue extends DataStructInterface{

  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_State = "STATE";
  public final static  String S_CityId = "CITY_ID";
  public final static  String S_Area = "AREA";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_CustServiceId = "CUST_SERVICE_ID";
  public final static  String S_Points = "POINTS";
  public final static  String S_ManagerSel = "MANAGER_SEL";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_RecId = "REC_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_County = "COUNTY";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_PointType = "POINT_TYPE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_Ext1 = "EXT1";
  public final static  String S_Ext2 = "EXT2";


public Timestamp getExpireDate();

public long getOpId();

public Timestamp getEffectiveDate();

public String getState();

public String getCityId();

public String getArea();

public String getRemarks();

public String getCustServiceId();

public long getPoints();

public long getManagerSel();

public long getOrgId();

public String getRegionId();

public long getRecId();

public long getCreateOrgId();

public String getCounty();

public long getCustId();

public long getCreateOpId();

public Timestamp getDoneDate();

public long getPointType();

public Timestamp getCreateDate();

public long getDoneCode();

public long getExt1();

public String getExt2();


public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setState(String value);

public  void setCityId(String value);

public  void setArea(String value);

public  void setRemarks(String value);

public  void setCustServiceId(String value);

public  void setPoints(long value);

public  void setManagerSel(long value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setRecId(long value);

public  void setCreateOrgId(long value);

public  void setCounty(String value);

public  void setCustId(long value);

public  void setCreateOpId(long value);

public  void setDoneDate(Timestamp value);

public  void setPointType(long value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setExt1(long value);

public  void setExt2(String value);
}
