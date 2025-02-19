package com.asiainfo.crm.cm.inner.contact.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IQBOCmxGroupContactValue extends DataStructInterface{

  public final static  String S_PostAddress = "POST_ADDRESS";
  public final static  String S_State = "STATE";
  public final static  String S_PartyName = "PARTY_NAME";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_PartyNameQry = "PARTY_NAME_QRY";
  public final static  String S_PartyId = "PARTY_ID";
  public final static  String S_ContId = "CONT_ID";
  public final static  String S_HomeTel = "HOME_TEL";
  public final static  String S_FirstName = "FIRST_NAME";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_ContMobile = "CONT_MOBILE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_ContLevel = "CONT_LEVEL";
  public final static  String S_PrioryLevel = "PRIORY_LEVEL";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_ContClass = "CONT_CLASS";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_ContAddress = "CONT_ADDRESS";
  public final static  String S_ContType = "CONT_TYPE";
  public final static  String S_ContEmail = "CONT_EMAIL";
  public final static  String S_CustServiceId = "CUST_SERVICE_ID";
  public final static  String S_LastNameQry = "LAST_NAME_QRY";
  public final static  String S_OfficeTel = "OFFICE_TEL";
  public final static  String S_CertExpireDate = "CERT_EXPIRE_DATE";
  public final static  String S_LastName = "LAST_NAME";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_CustName = "CUST_NAME";
  public final static  String S_PostCode = "POST_CODE";
  public final static  String S_MiddleName = "MIDDLE_NAME";
  public final static  String S_Gender = "GENDER";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_FirstNameQry = "FIRST_NAME_QRY";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_MiddleNameQry = "MIDDLE_NAME_QRY";
  public final static  String S_CustContId = "CUST_CONT_ID";


public String getPostAddress();

public String getState();

public String getPartyName();

public String getRemarks();

public String getPartyNameQry();

public long getPartyId();

public long getContId();

public String getHomeTel();

public String getFirstName();

public long getCustId();

public String getContMobile();

public long getCreateOpId();

public long getDoneCode();

public long getContLevel();

public long getPrioryLevel();

public Timestamp getExpireDate();

public long getOpId();

public long getContClass();

public Timestamp getEffectiveDate();

public String getContAddress();

public long getContType();

public String getContEmail();

public String getCustServiceId();

public String getLastNameQry();

public String getOfficeTel();

public Timestamp getCertExpireDate();

public String getLastName();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public String getCustName();

public String getPostCode();

public String getMiddleName();

public long getGender();

public Timestamp getDoneDate();

public String getFirstNameQry();

public Timestamp getCreateDate();

public String getMiddleNameQry();

public long getCustContId();


public  void setPostAddress(String value);

public  void setState(String value);

public  void setPartyName(String value);

public  void setRemarks(String value);

public  void setPartyNameQry(String value);

public  void setPartyId(long value);

public  void setContId(long value);

public  void setHomeTel(String value);

public  void setFirstName(String value);

public  void setCustId(long value);

public  void setContMobile(String value);

public  void setCreateOpId(long value);

public  void setDoneCode(long value);

public  void setContLevel(long value);

public  void setPrioryLevel(long value);

public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setContClass(long value);

public  void setEffectiveDate(Timestamp value);

public  void setContAddress(String value);

public  void setContType(long value);

public  void setContEmail(String value);

public  void setCustServiceId(String value);

public  void setLastNameQry(String value);

public  void setOfficeTel(String value);

public  void setCertExpireDate(Timestamp value);

public  void setLastName(String value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setCustName(String value);

public  void setPostCode(String value);

public  void setMiddleName(String value);

public  void setGender(long value);

public  void setDoneDate(Timestamp value);

public  void setFirstNameQry(String value);

public  void setCreateDate(Timestamp value);

public  void setMiddleNameQry(String value);

public  void setCustContId(long value);
}
