package com.asiainfo.crm.so.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOInsAccrelValue extends DataStructInterface{

  public final static  String S_AcctRelaId = "ACCT_RELA_ID";
  public final static  String S_TogetherFlag = "TOGETHER_FLAG";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_ItemType = "ITEM_TYPE";
  public final static  String S_GrpSplitId = "GRP_SPLIT_ID";
  public final static  String S_UserRegionId = "USER_REGION_ID";
  public final static  String S_ItemId = "ITEM_ID";
  public final static  String S_PayUserId = "PAY_USER_ID";
  public final static  String S_AcctRegionId = "ACCT_REGION_ID";
  public final static  String S_EffectiveDateType = "EFFECTIVE_DATE_TYPE";
  public final static  String S_MaxPay = "MAX_PAY";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OutAcctPri = "OUT_ACCT_PRI";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_OldAcctId = "OLD_ACCT_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_PayMode = "PAY_MODE";
  public final static  String S_PayType = "PAY_TYPE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_ExpireDateType = "EXPIRE_DATE_TYPE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_PayValue = "PAY_VALUE";
  public final static  String S_OfferInstId = "OFFER_INST_ID";


public long getAcctRelaId();

public int getTogetherFlag();

public int getState();

public String getRemarks();

public int getItemType();

public long getGrpSplitId();

public String getUserRegionId();

public long getItemId();

public long getPayUserId();

public String getAcctRegionId();

public int getEffectiveDateType();

public long getMaxPay();

public long getAcctId();

public long getDoneCode();

public Timestamp getExpireDate();

public int getOutAcctPri();

public Timestamp getEffectiveDate();

public long getOpId();

public long getUserId();

public long getOldAcctId();

public long getOrgId();

public String getRegionId();

public int getPayMode();

public int getPayType();

public Timestamp getDoneDate();

public int getExpireDateType();

public Timestamp getCreateDate();

public long getPayValue();

public long getOfferInstId();


public  void setAcctRelaId(long value);

public  void setTogetherFlag(int value);

public  void setState(int value);

public  void setRemarks(String value);

public  void setItemType(int value);

public  void setGrpSplitId(long value);

public  void setUserRegionId(String value);

public  void setItemId(long value);

public  void setPayUserId(long value);

public  void setAcctRegionId(String value);

public  void setEffectiveDateType(int value);

public  void setMaxPay(long value);

public  void setAcctId(long value);

public  void setDoneCode(long value);

public  void setExpireDate(Timestamp value);

public  void setOutAcctPri(int value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setUserId(long value);

public  void setOldAcctId(long value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setPayMode(int value);

public  void setPayType(int value);

public  void setDoneDate(Timestamp value);

public  void setExpireDateType(int value);

public  void setCreateDate(Timestamp value);

public  void setPayValue(long value);

public  void setOfferInstId(long value);
}
