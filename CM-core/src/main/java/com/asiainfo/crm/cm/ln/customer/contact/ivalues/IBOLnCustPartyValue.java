package com.asiainfo.crm.cm.ln.customer.contact.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOLnCustPartyValue extends DataStructInterface{

  public final static  String S_PostAddress = "POST_ADDRESS";
  public final static  String S_CertCode = "CERT_CODE";
  public final static  String S_ContAddress = "CONT_ADDRESS";
  public final static  String S_PartyId = "PARTY_ID";
  public final static  String S_ContEmail = "CONT_EMAIL";
  public final static  String S_ContId = "CONT_ID";
  public final static  String S_ContGender = "CONT_GENDER";
  public final static  String S_ContName = "CONT_NAME";
  public final static  String S_ContDesc = "CONT_DESC";
  public final static  String S_OfficeTel = "OFFICE_TEL";
  public final static  String S_HomeTel = "HOME_TEL";
  public final static  String S_CertType = "CERT_TYPE";
  public final static  String S_ContMobile = "CONT_MOBILE";
  public final static  String S_PostCode = "POST_CODE";
  public final static  String S_ContFax = "CONT_FAX";


public String getPostAddress();

public String getCertCode();

public String getContAddress();

public long getPartyId();

public String getContEmail();

public long getContId();

public long getContGender();

public String getContName();

public String getContDesc();

public String getOfficeTel();

public String getHomeTel();

public long getCertType();

public String getContMobile();

public String getPostCode();

public String getContFax();


public  void setPostAddress(String value);

public  void setCertCode(String value);

public  void setContAddress(String value);

public  void setPartyId(long value);

public  void setContEmail(String value);

public  void setContId(long value);

public  void setContGender(long value);

public  void setContName(String value);

public  void setContDesc(String value);

public  void setOfficeTel(String value);

public  void setHomeTel(String value);

public  void setCertType(long value);

public  void setContMobile(String value);

public  void setPostCode(String value);

public  void setContFax(String value);
}
