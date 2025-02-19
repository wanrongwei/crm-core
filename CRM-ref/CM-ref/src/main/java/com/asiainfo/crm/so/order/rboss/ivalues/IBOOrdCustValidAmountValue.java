package com.asiainfo.crm.so.order.rboss.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOOrdCustValidAmountValue extends DataStructInterface{

  public final static  String S_CustId = "CUST_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_Feature03 = "FEATURE_03";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_Feature04 = "FEATURE_04";
  public final static  String S_Feature01 = "FEATURE_01";
  public final static  String S_Feature02 = "FEATURE_02";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_ValidAmount = "VALID_AMOUNT";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_ValidId = "VALID_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_CustGroupType = "CUST_GROUP_TYPE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";


public long getCustId();

public Timestamp getDoneDate();

public String getFeature03();

public long getOrgId();

public long getDoneCode();

public String getFeature04();

public String getFeature01();

public String getFeature02();

public long getOpId();

public long getValidAmount();

public String getRemarks();

public long getValidId();

public Timestamp getCreateDate();

public long getCustGroupType();

public Timestamp getExpireDate();


public  void setCustId(long value);

public  void setDoneDate(Timestamp value);

public  void setFeature03(String value);

public  void setOrgId(long value);

public  void setDoneCode(long value);

public  void setFeature04(String value);

public  void setFeature01(String value);

public  void setFeature02(String value);

public  void setOpId(long value);

public  void setValidAmount(long value);

public  void setRemarks(String value);

public  void setValidId(long value);

public  void setCreateDate(Timestamp value);

public  void setCustGroupType(long value);

public  void setExpireDate(Timestamp value);
}
