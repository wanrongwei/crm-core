package com.asiainfo.crm.cm.inner.contact.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IQBOCmxGroupContactHValue extends DataStructInterface{

  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_ContClass = "CONT_CLASS";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_State = "STATE";
  public final static  String S_PartyName = "PARTY_NAME";
  public final static  String S_HId = "H_ID";
  public final static  String S_PartyNameQry = "PARTY_NAME_QRY";
  public final static  String S_PartyId = "PARTY_ID";
  public final static  String S_ContType = "CONT_TYPE";
  public final static  String S_LastNameQry = "LAST_NAME_QRY";
  public final static  String S_LastName = "LAST_NAME";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_FirstName = "FIRST_NAME";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_MiddleName = "MIDDLE_NAME";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_FirstNameQry = "FIRST_NAME_QRY";
  public final static  String S_MiddleNameQry = "MIDDLE_NAME_QRY";
  public final static  String S_ContLevel = "CONT_LEVEL";
  public final static  String S_CustContId = "CUST_CONT_ID";
  public final static  String S_PrioryLevel = "PRIORY_LEVEL";


public Timestamp getExpireDate();

public long getOpId();

public long getContClass();

public Timestamp getEffectiveDate();

public String getState();

public String getPartyName();

public long getHId();

public String getPartyNameQry();

public long getPartyId();

public long getContType();

public String getLastNameQry();

public String getLastName();

public String getRegionId();

public String getFirstName();

public long getCustId();

public String getMiddleName();

public Timestamp getDoneDate();

public String getFirstNameQry();

public String getMiddleNameQry();

public long getContLevel();

public long getCustContId();

public long getPrioryLevel();


public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setContClass(long value);

public  void setEffectiveDate(Timestamp value);

public  void setState(String value);

public  void setPartyName(String value);

public  void setHId(long value);

public  void setPartyNameQry(String value);

public  void setPartyId(long value);

public  void setContType(long value);

public  void setLastNameQry(String value);

public  void setLastName(String value);

public  void setRegionId(String value);

public  void setFirstName(String value);

public  void setCustId(long value);

public  void setMiddleName(String value);

public  void setDoneDate(Timestamp value);

public  void setFirstNameQry(String value);

public  void setMiddleNameQry(String value);

public  void setContLevel(long value);

public  void setCustContId(long value);

public  void setPrioryLevel(long value);
}
