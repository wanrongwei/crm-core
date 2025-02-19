package com.asiainfo.crm.cm.inner.customer.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmIndivContactValue extends DataStructInterface{

  public final static  String S_ContId = "CONT_ID";
  public final static  String S_State = "STATE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_ContType = "CONT_TYPE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_PartyId = "PARTY_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_CustContId = "CUST_CONT_ID";
  public final static  String S_PrioryLevel = "PRIORY_LEVEL";
  public final static  String S_CustId = "CUST_ID";


public long getContId();

public String getState();

public long getCreateOpId();

public Timestamp getEffectiveDate();

public int getContType();

public Timestamp getDoneDate();

public String getRemarks();

public long getPartyId();

public long getOrgId();

public Timestamp getCreateDate();

public long getDoneCode();

public String getRegionId();

public Timestamp getExpireDate();

public long getOpId();

public long getCreateOrgId();

public long getCustContId();

public int getPrioryLevel();

public long getCustId();


public  void setContId(long value);

public  void setState(String value);

public  void setCreateOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setContType(int value);

public  void setDoneDate(Timestamp value);

public  void setRemarks(String value);

public  void setPartyId(long value);

public  void setOrgId(long value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setRegionId(String value);

public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setCreateOrgId(long value);

public  void setCustContId(long value);

public  void setPrioryLevel(int value);

public  void setCustId(long value);
}
