package com.asiainfo.crm.so.common.party.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOBsWholesaleRouterCfgValue extends DataStructInterface{

  public final static  String S_OpId = "OP_ID";
  public final static  String S_State = "STATE";
  public final static  String S_TenantId = "TENANT_ID";
  public final static  String S_WsAccountId = "WS_ACCOUNT_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_OperatorCode = "OPERATOR_CODE";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CsfFileName = "CSF_FILE_NAME";
  public final static  String S_WsName = "WS_NAME";
  public final static  String S_ServiceOperatorCode = "SERVICE_OPERATOR_CODE";
  public final static  String S_WsId = "WS_ID";
  public final static  String S_CenterId = "CENTER_ID";
  public final static  String S_Stp = "STP";
  public final static  String S_WsCustId = "WS_CUST_ID";


public long getOpId();

public String getState();

public String getTenantId();

public long getWsAccountId();

public long getOrgId();

public String getOperatorCode();

public String getRegionId();

public String getCsfFileName();

public String getWsName();

public String getServiceOperatorCode();

public long getWsId();

public String getCenterId();

public String getStp();

public long getWsCustId();


public  void setOpId(long value);

public  void setState(String value);

public  void setTenantId(String value);

public  void setWsAccountId(long value);

public  void setOrgId(long value);

public  void setOperatorCode(String value);

public  void setRegionId(String value);

public  void setCsfFileName(String value);

public  void setWsName(String value);

public  void setServiceOperatorCode(String value);

public  void setWsId(long value);

public  void setCenterId(String value);

public  void setStp(String value);

public  void setWsCustId(long value);
}
