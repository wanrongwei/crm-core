package com.asiainfo.crm.so.common.bboss.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOInsCustVpnRelValue extends DataStructInterface{

  public final static  String S_RelId = "REL_ID";
  public final static  String S_OwnerCustId = "OWNER_CUST_ID";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_DealState = "DEAL_STATE";
  public final static  String S_State = "STATE";
  public final static  String S_Ext1 = "ext1";
  public final static  String S_Ext2 = "ext2";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_BenefiCustId = "BENEFI_CUST_ID";
  public final static  String S_OrgId = "ORG_ID";


public long getRelId();

public long getOwnerCustId();

public long getOpId();

public String getDealState();

public long getState();

public String getExt1();

public String getExt2();

public Timestamp getCreateDate();

public long getBenefiCustId();

public long getOrgId();


public  void setRelId(long value);

public  void setOwnerCustId(long value);

public  void setOpId(long value);

public  void setDealState(String value);

public  void setState(long value);

public  void setExt1(String value);

public  void setExt2(String value);

public  void setCreateDate(Timestamp value);

public  void setBenefiCustId(long value);

public  void setOrgId(long value);
}
