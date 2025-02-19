package com.asiainfo.crm.cm.inner.customer.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmxGroupMemberValue extends DataStructInterface{

  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_IsFromunion = "IS_FROMUNION";
  public final static  String S_State = "STATE";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_AcctName = "ACCT_NAME";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_VipCardNo = "VIP_CARD_NO";
  public final static  String S_IsHighvalue = "IS_HIGHVALUE";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_VipLevel = "VIP_LEVEL";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_Gender = "GENDER";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_CustRelId = "CUST_REL_ID";
  public final static  String S_MemberLevel = "MEMBER_LEVEL";


public Timestamp getExpireDate();

public long getOpId();

public Timestamp getEffectiveDate();

public int getIsFromunion();

public String getState();

public long getUserId();

public String getRemarks();

public long getOrgId();

public String getRegionId();

public String getAcctName();

public long getCreateOrgId();

public String getVipCardNo();

public int getIsHighvalue();

public long getAcctId();

public int getVipLevel();

public long getCreateOpId();

public int getGender();

public Timestamp getDoneDate();

public String getBillId();

public Timestamp getCreateDate();

public long getDoneCode();

public long getCustRelId();

public int getMemberLevel();


public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setIsFromunion(int value);

public  void setState(String value);

public  void setUserId(long value);

public  void setRemarks(String value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setAcctName(String value);

public  void setCreateOrgId(long value);

public  void setVipCardNo(String value);

public  void setIsHighvalue(int value);

public  void setAcctId(long value);

public  void setVipLevel(int value);

public  void setCreateOpId(long value);

public  void setGender(int value);

public  void setDoneDate(Timestamp value);

public  void setBillId(String value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setCustRelId(long value);

public  void setMemberLevel(int value);
}
