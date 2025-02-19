package com.asiainfo.crm.cm.inner.customer.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmxCustSecondCardInfoValue extends DataStructInterface{

  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_CustStatus = "CUST_STATUS";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_State = "STATE";
  public final static  String S_FirstCertCode = "FIRST_CERT_CODE";
  public final static  String S_SecondCertAddress = "SECOND_CERT_ADDRESS";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_SecondCertEffdate = "SECOND_CERT_EFFDATE";
  public final static  String S_FirstCertType = "FIRST_CERT_TYPE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_SecondCertCode = "SECOND_CERT_CODE";
  public final static  String S_FirstCertExpire = "FIRST_CERT_EXPIRE";
  public final static  String S_FirstCertEffdate = "FIRST_CERT_EFFDATE";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_FirstCertAddress = "FIRST_CERT_ADDRESS";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_SecondCertType = "SECOND_CERT_TYPE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_SecondCertExpire = "SECOND_CERT_EXPIRE";


public Timestamp getExpireDate();

public long getOpId();

public int getCustStatus();

public Timestamp getEffectiveDate();

public String getState();

public String getFirstCertCode();

public String getSecondCertAddress();

public String getRemarks();

public Timestamp getSecondCertEffdate();

public int getFirstCertType();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public String getSecondCertCode();

public Timestamp getFirstCertExpire();

public Timestamp getFirstCertEffdate();

public long getCustId();

public long getCreateOpId();

public String getFirstCertAddress();

public Timestamp getDoneDate();

public int getSecondCertType();

public Timestamp getCreateDate();

public long getDoneCode();

public Timestamp getSecondCertExpire();


public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setCustStatus(int value);

public  void setEffectiveDate(Timestamp value);

public  void setState(String value);

public  void setFirstCertCode(String value);

public  void setSecondCertAddress(String value);

public  void setRemarks(String value);

public  void setSecondCertEffdate(Timestamp value);

public  void setFirstCertType(int value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setSecondCertCode(String value);

public  void setFirstCertExpire(Timestamp value);

public  void setFirstCertEffdate(Timestamp value);

public  void setCustId(long value);

public  void setCreateOpId(long value);

public  void setFirstCertAddress(String value);

public  void setDoneDate(Timestamp value);

public  void setSecondCertType(int value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setSecondCertExpire(Timestamp value);
}
