package com.asiainfo.crm.cm.inner.contact.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmContactValue extends DataStructInterface{

  public final static  String S_RelCustId = "REL_CUST_ID";
  public final static  String S_State = "STATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_Notes = "NOTES";
  public final static  String S_RelCustType = "REL_CUST_TYPE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_ContEmail = "CONT_EMAIL";
  public final static  String S_ContId = "CONT_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_ContAddress = "CONT_ADDRESS";
  public final static  String S_ContType = "CONT_TYPE";
  public final static  String S_OtherContMedium = "OTHER_CONT_MEDIUM";
  public final static  String S_ContZipcode = "CONT_ZIPCODE";
  public final static  String S_ContMobile = "CONT_MOBILE";
  public final static  String S_ContGender = "CONT_GENDER";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_ContFax = "CONT_FAX";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_ContPhone = "CONT_PHONE";
  public final static  String S_PriorContMetohd = "PRIOR_CONT_METOHD";
  public final static  String S_ContName = "CONT_NAME";


public long getRelCustId();

public String getState();

public Timestamp getEffectiveDate();

public Timestamp getDoneDate();

public String getNotes();

public int getRelCustType();

public Timestamp getCreateDate();

public long getDoneCode();

public long getOpId();

public String getRegionId();

public String getContEmail();

public long getContId();

public long getCreateOpId();

public String getContAddress();

public int getContType();

public String getOtherContMedium();

public String getContZipcode();

public String getContMobile();

public int getContGender();

public long getOrgId();

public String getContFax();

public Timestamp getExpireDate();

public long getCreateOrgId();

public String getContPhone();

public int getPriorContMetohd();

public String getContName();


public  void setRelCustId(long value);

public  void setState(String value);

public  void setEffectiveDate(Timestamp value);

public  void setDoneDate(Timestamp value);

public  void setNotes(String value);

public  void setRelCustType(int value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setOpId(long value);

public  void setRegionId(String value);

public  void setContEmail(String value);

public  void setContId(long value);

public  void setCreateOpId(long value);

public  void setContAddress(String value);

public  void setContType(int value);

public  void setOtherContMedium(String value);

public  void setContZipcode(String value);

public  void setContMobile(String value);

public  void setContGender(int value);

public  void setOrgId(long value);

public  void setContFax(String value);

public  void setExpireDate(Timestamp value);

public  void setCreateOrgId(long value);

public  void setContPhone(String value);

public  void setPriorContMetohd(int value);

public  void setContName(String value);
}
