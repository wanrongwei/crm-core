package com.asiainfo.crm.so.query.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IQAcctRelInfoValue extends DataStructInterface{

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
  public final static  String S_PayModeDesc = "PAY_MODE_DESC";
  public final static  String S_MaxPay = "MAX_PAY";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OutAcctPri = "OUT_ACCT_PRI";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_OldAcctId = "OLD_ACCT_ID";
  public final static  String S_ValidType = "VALID_TYPE";
  public final static  String S_ValidTypeDesc = "VALID_TYPE_DESC";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_PayMode = "PAY_MODE";
  public final static  String S_PayType = "PAY_TYPE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_ExpireDateType = "EXPIRE_DATE_TYPE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_PayValue = "PAY_VALUE";
  public final static  String S_OfferInstId = "OFFER_INST_ID";
  public final static  String S_PayTypeDesc = "PAY_TYPE_DESC";


public long getAcctRelaId();

public long getTogetherFlag();

public long getState();

public String getRemarks();

public long getItemType();

public long getGrpSplitId();

public String getUserRegionId();

public long getItemId();

public long getPayUserId();

public String getAcctRegionId();

public long getEffectiveDateType();

public String getPayModeDesc();

public long getMaxPay();

public long getAcctId();

public long getDoneCode();

public Timestamp getExpireDate();

public long getOutAcctPri();

public Timestamp getEffectiveDate();

public long getOpId();

public long getUserId();

public long getOldAcctId();

public String getValidType();

public String getValidTypeDesc();

public long getOrgId();

public String getRegionId();

public long getPayMode();

public long getPayType();

public Timestamp getDoneDate();

public long getExpireDateType();

public Timestamp getCreateDate();

public long getPayValue();

public long getOfferInstId();

public String getPayTypeDesc();


public  void setAcctRelaId(long value);

public  void setTogetherFlag(long value);

public  void setState(long value);

public  void setRemarks(String value);

public  void setItemType(long value);

public  void setGrpSplitId(long value);

public  void setUserRegionId(String value);

public  void setItemId(long value);

public  void setPayUserId(long value);

public  void setAcctRegionId(String value);

public  void setEffectiveDateType(long value);

public  void setPayModeDesc(String value);

public  void setMaxPay(long value);

public  void setAcctId(long value);

public  void setDoneCode(long value);

public  void setExpireDate(Timestamp value);

public  void setOutAcctPri(long value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setUserId(long value);

public  void setOldAcctId(long value);

public  void setValidType(String value);

public  void setValidTypeDesc(String value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setPayMode(long value);

public  void setPayType(long value);

public  void setDoneDate(Timestamp value);

public  void setExpireDateType(long value);

public  void setCreateDate(Timestamp value);

public  void setPayValue(long value);

public  void setOfferInstId(long value);

public  void setPayTypeDesc(String value);
}
