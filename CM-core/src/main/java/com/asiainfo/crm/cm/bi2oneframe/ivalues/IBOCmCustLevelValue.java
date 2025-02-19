package com.asiainfo.crm.cm.bi2oneframe.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmCustLevelValue extends DataStructInterface{

  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_CustValueLevel = "CUST_VALUE_LEVEL";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_CustSensitiveLevel = "CUST_SENSITIVE_LEVEL";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_CustIntegrityLevel = "CUST_INTEGRITY_LEVEL";
  public final static  String S_CreateVestDepartement = "CREATE_VEST_DEPARTEMENT";
  public final static  String S_CustLostLevel = "CUST_LOST_LEVEL";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DataId = "DATA_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";


public Timestamp getExpireDate();

public long getOpId();

public int getCustValueLevel();

public Timestamp getEffectiveDate();

public String getState();

public String getRemarks();

public int getCustSensitiveLevel();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public int getCustIntegrityLevel();

public String getCreateVestDepartement();

public int getCustLostLevel();

public long getCreateOpId();

public long getDataId();

public Timestamp getDoneDate();

public String getBillId();

public Timestamp getCreateDate();

public long getDoneCode();


public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setCustValueLevel(int value);

public  void setEffectiveDate(Timestamp value);

public  void setState(String value);

public  void setRemarks(String value);

public  void setCustSensitiveLevel(int value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setCustIntegrityLevel(int value);

public  void setCreateVestDepartement(String value);

public  void setCustLostLevel(int value);

public  void setCreateOpId(long value);

public  void setDataId(long value);

public  void setDoneDate(Timestamp value);

public  void setBillId(String value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);
}
