package com.asiainfo.crm.so.instance.rboss.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOInsxTemporaryOpenValue extends DataStructInterface{

  public final static  String S_WarrantUserId = "WARRANT_USER_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_OperType = "OPER_TYPE";
  public final static  String S_CountyId = "COUNTY_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_OwefeeMax = "OWEFEE_MAX";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_ValidDate = "VALID_DATE";


public long getWarrantUserId();

public Timestamp getDoneDate();

public long getAcctId();

public long getOrgId();

public String getRemarks();

public Timestamp getCreateDate();

public long getDoneCode();

public int getOperType();

public long getCountyId();

public Timestamp getExpireDate();

public long getOpId();

public String getRegionId();

public long getOwefeeMax();

public long getUserId();

public Timestamp getValidDate();


public  void setWarrantUserId(long value);

public  void setDoneDate(Timestamp value);

public  void setAcctId(long value);

public  void setOrgId(long value);

public  void setRemarks(String value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setOperType(int value);

public  void setCountyId(long value);

public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setRegionId(String value);

public  void setOwefeeMax(long value);

public  void setUserId(long value);

public  void setValidDate(Timestamp value);
}
