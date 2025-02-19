package com.asiainfo.crm.cm.ln.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOLnCmCustUnionInfoValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_OutlineAlarm = "OUTLINE_ALARM";
  public final static  String S_CurrentTerminal = "CURRENT_TERMINAL";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_Field9 = "FIELD_9";
  public final static  String S_FluxUse = "FLUX_USE";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_Field7 = "FIELD_7";
  public final static  String S_Field8 = "FIELD_8";
  public final static  String S_Field5 = "FIELD_5";
  public final static  String S_Field6 = "FIELD_6";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_Field10 = "FIELD_10";
  public final static  String S_AvgArpu = "AVG_ARPU";
  public final static  String S_Field4 = "FIELD_4";
  public final static  String S_Field3 = "FIELD_3";
  public final static  String S_AvgCallTimesDay = "AVG_CALL_TIMES_DAY";
  public final static  String S_Field2 = "FIELD_2";
  public final static  String S_Field1 = "FIELD_1";
  public final static  String S_CreateDate = "CREATE_DATE";


public String getState();

public String getRemarks();

public String getOutlineAlarm();

public String getCurrentTerminal();

public long getCustId();

public long getAcctId();

public long getCreateOpId();

public long getDoneCode();

public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public long getOpId();

public String getField9();

public String getFluxUse();

public long getUserId();

public String getField7();

public String getField8();

public String getField5();

public String getField6();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public Timestamp getDoneDate();

public String getField10();

public String getAvgArpu();

public String getField4();

public String getField3();

public String getAvgCallTimesDay();

public String getField2();

public String getField1();

public Timestamp getCreateDate();


public  void setState(String value);

public  void setRemarks(String value);

public  void setOutlineAlarm(String value);

public  void setCurrentTerminal(String value);

public  void setCustId(long value);

public  void setAcctId(long value);

public  void setCreateOpId(long value);

public  void setDoneCode(long value);

public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setField9(String value);

public  void setFluxUse(String value);

public  void setUserId(long value);

public  void setField7(String value);

public  void setField8(String value);

public  void setField5(String value);

public  void setField6(String value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setDoneDate(Timestamp value);

public  void setField10(String value);

public  void setAvgArpu(String value);

public  void setField4(String value);

public  void setField3(String value);

public  void setAvgCallTimesDay(String value);

public  void setField2(String value);

public  void setField1(String value);

public  void setCreateDate(Timestamp value);
}
