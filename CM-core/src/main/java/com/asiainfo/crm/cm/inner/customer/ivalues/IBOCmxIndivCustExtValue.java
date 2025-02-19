package com.asiainfo.crm.cm.inner.customer.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmxIndivCustExtValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_EnterType = "ENTER_TYPE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_IssuingAuthority = "ISSUING_AUTHORITY";
  public final static  String S_IsOutnetCust = "IS_OUTNET_CUST";
  public final static  String S_ActivateChannelType = "ACTIVATE_CHANNEL_TYPE";
  public final static  String S_OtherAddress = "OTHER_ADDRESS";
  public final static  String S_GlobalRoamingSecondCrede = "GLOBAL_ROAMING_SECOND_CREDE";
  public final static  String S_CarNo = "CAR_NO";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_MobilePhoneType = "MOBILE_PHONE_TYPE";
  public final static  String S_OtherContAddress = "OTHER_CONT_ADDRESS";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_Department = "DEPARTMENT";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_OtherBillId = "OTHER_BILL_ID";
  public final static  String S_AuthId = "AUTH_ID";
  public final static  String S_EnterTestNumber = "ENTER_TEST_NUMBER";
  public final static  String S_HotsellSource = "HOTSELL_SOURCE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_OriginalOutnetBillId = "ORIGINAL_OUTNET_BILL_ID";
  public final static  String S_OtherContName = "OTHER_CONT_NAME";
  public final static  String S_CreateDate = "CREATE_DATE";


public String getState();

public int getEnterType();

public String getRemarks();

public String getIssuingAuthority();

public int getIsOutnetCust();

public int getActivateChannelType();

public String getOtherAddress();

public String getGlobalRoamingSecondCrede();

public String getCarNo();

public long getCustId();

public long getCreateOpId();

public String getMobilePhoneType();

public String getOtherContAddress();

public long getDoneCode();

public String getDepartment();

public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public long getOpId();

public String getOtherBillId();

public String getAuthId();

public String getEnterTestNumber();

public int getHotsellSource();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public Timestamp getDoneDate();

public String getOriginalOutnetBillId();

public String getOtherContName();

public Timestamp getCreateDate();


public  void setState(String value);

public  void setEnterType(int value);

public  void setRemarks(String value);

public  void setIssuingAuthority(String value);

public  void setIsOutnetCust(int value);

public  void setActivateChannelType(int value);

public  void setOtherAddress(String value);

public  void setGlobalRoamingSecondCrede(String value);

public  void setCarNo(String value);

public  void setCustId(long value);

public  void setCreateOpId(long value);

public  void setMobilePhoneType(String value);

public  void setOtherContAddress(String value);

public  void setDoneCode(long value);

public  void setDepartment(String value);

public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setOtherBillId(String value);

public  void setAuthId(String value);

public  void setEnterTestNumber(String value);

public  void setHotsellSource(int value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setDoneDate(Timestamp value);

public  void setOriginalOutnetBillId(String value);

public  void setOtherContName(String value);

public  void setCreateDate(Timestamp value);
}
