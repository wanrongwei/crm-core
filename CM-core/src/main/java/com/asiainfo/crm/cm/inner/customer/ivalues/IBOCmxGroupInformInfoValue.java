package com.asiainfo.crm.cm.inner.customer.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmxGroupInformInfoValue extends DataStructInterface{

  public final static  String S_MaintainerNum = "MAINTAINER_NUM";
  public final static  String S_State = "STATE";
  public final static  String S_Supplier = "SUPPLIER";
  public final static  String S_Operator = "OPERATOR";
  public final static  String S_PropertyType = "PROPERTY_TYPE";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DeviceNum = "DEVICE_NUM";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_Notes = "NOTES";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_Costs = "COSTS";
  public final static  String S_IsUsered = "IS_USERED";
  public final static  String S_AdminType = "ADMIN_TYPE";
  public final static  String S_ConnMode = "CONN_MODE";
  public final static  String S_InternetMode = "INTERNET_MODE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_LinkScope = "LINK_SCOPE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_HostLocalType = "HOST_LOCAL_TYPE";
  public final static  String S_InformTypeId = "INFORM_TYPE_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_Bandwidth = "BANDWIDTH";
  public final static  String S_EmailSysType = "EMAIL_SYS_TYPE";


public int getMaintainerNum();

public String getState();

public String getSupplier();

public String getOperator();

public int getPropertyType();

public long getCustId();

public long getCreateOpId();

public int getDeviceNum();

public long getDoneCode();

public String getNotes();

public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public long getOpId();

public double getCosts();

public int getIsUsered();

public int getAdminType();

public String getConnMode();

public int getInternetMode();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public int getLinkScope();

public Timestamp getDoneDate();

public int getHostLocalType();

public int getInformTypeId();

public Timestamp getCreateDate();

public long getBandwidth();

public int getEmailSysType();


public  void setMaintainerNum(int value);

public  void setState(String value);

public  void setSupplier(String value);

public  void setOperator(String value);

public  void setPropertyType(int value);

public  void setCustId(long value);

public  void setCreateOpId(long value);

public  void setDeviceNum(int value);

public  void setDoneCode(long value);

public  void setNotes(String value);

public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setCosts(double value);

public  void setIsUsered(int value);

public  void setAdminType(int value);

public  void setConnMode(String value);

public  void setInternetMode(int value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setLinkScope(int value);

public  void setDoneDate(Timestamp value);

public  void setHostLocalType(int value);

public  void setInformTypeId(int value);

public  void setCreateDate(Timestamp value);

public  void setBandwidth(long value);

public  void setEmailSysType(int value);
}
