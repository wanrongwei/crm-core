package com.asiainfo.crm.cm.inner.customer.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmBaseCustomerValue extends DataStructInterface{

  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_CustStatus = "CUST_STATUS";
  public final static  String S_State = "STATE";
  public final static  String S_PartyId = "PARTY_ID";
  public final static  String S_CustLevel = "CUST_LEVEL";
  public final static  String S_CustType = "CUST_TYPE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_CustName = "CUST_NAME";
  public final static  String S_BaseCustId = "BASE_CUST_ID";
  public final static  String S_CustCertType = "CUST_CERT_TYPE";
  public final static  String S_CountyId = "COUNTY_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_CustCertCode = "CUST_CERT_CODE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_CustCertExpire = "CUST_CERT_EXPIRE";
  public final static  String S_Notes = "NOTES";
  public final static  String S_CustCertAddress = "CUST_CERT_ADDRESS";


public Timestamp getExpireDate();

public long getOpId();

public Timestamp getEffectiveDate();

public int getCustStatus();

public String getState();

public long getPartyId();

public int getCustLevel();

public int getCustType();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public String getCustName();

public long getBaseCustId();

public int getCustCertType();

public String getCountyId();

public long getCreateOpId();

public Timestamp getDoneDate();

public String getCustCertCode();

public long getDoneCode();

public Timestamp getCreateDate();

public Timestamp getCustCertExpire();

public String getNotes();

public String getCustCertAddress();


public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setCustStatus(int value);

public  void setState(String value);

public  void setPartyId(long value);

public  void setCustLevel(int value);

public  void setCustType(int value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setCustName(String value);

public  void setBaseCustId(long value);

public  void setCustCertType(int value);

public  void setCountyId(String value);

public  void setCreateOpId(long value);

public  void setDoneDate(Timestamp value);

public  void setCustCertCode(String value);

public  void setDoneCode(long value);

public  void setCreateDate(Timestamp value);

public  void setCustCertExpire(Timestamp value);

public  void setNotes(String value);

public  void setCustCertAddress(String value);
}
