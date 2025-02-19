package com.asiainfo.crm.so.common.party.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOInsxUserInsuranceValue extends DataStructInterface{

  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_PushcFlag = "PUSHC_FLAG";
  public final static  String S_State = "STATE";
  public final static  String S_InsuranceOfferId = "INSURANCE_OFFER_ID";
  public final static  String S_HandsetOfferId = "HANDSET_OFFER_ID";
  public final static  String S_HandsetName = "HANDSET_NAME";
  public final static  String S_OrigineImei = "ORIGINE_IMEI";
  public final static  String S_VirtualBillId = "VIRTUAL_BILL_ID";
  public final static  String S_UserInsuranceId = "USER_INSURANCE_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_LastImei = "LAST_IMEI";
  public final static  String S_PolicyNum = "POLICY_NUM";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_CreateDate = "CREATE_DATE";


public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public long getOpId();

public long getPushcFlag();

public long getState();

public long getInsuranceOfferId();

public long getHandsetOfferId();

public String getHandsetName();

public String getOrigineImei();

public String getVirtualBillId();

public long getUserInsuranceId();

public long getOrgId();

public String getRegionId();

public String getLastImei();

public String getPolicyNum();

public long getCustId();

public String getBillId();

public Timestamp getCreateDate();


public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setPushcFlag(long value);

public  void setState(long value);

public  void setInsuranceOfferId(long value);

public  void setHandsetOfferId(long value);

public  void setHandsetName(String value);

public  void setOrigineImei(String value);

public  void setVirtualBillId(String value);

public  void setUserInsuranceId(long value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setLastImei(String value);

public  void setPolicyNum(String value);

public  void setCustId(long value);

public  void setBillId(String value);

public  void setCreateDate(Timestamp value);
}
