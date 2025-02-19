package com.asiainfo.crm.cm.ln.account.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmInsAccrelValue extends DataStructInterface{

  public final static  String S_MaxPay = "max_pay";
  public final static  String S_ExpireDate = "expire_date";
  public final static  String S_DoneDate = "done_date";
  public final static  String S_OutAcctPri = "out_acct_pri";
  public final static  String S_PayUserId = "pay_user_id";
  public final static  String S_State = "state";
  public final static  String S_RegionId = "region_id";
  public final static  String S_EffectiveDateType = "effective_date_type";
  public final static  String S_OfferInstId = "offer_inst_id";
  public final static  String S_Remarks = "remarks";
  public final static  String S_OpId = "op_id";
  public final static  String S_CreateDate = "create_date";
  public final static  String S_PayType = "pay_type";
  public final static  String S_PayValue = "pay_value";
  public final static  String S_UserId = "user_id";
  public final static  String S_ItemType = "item_type";
  public final static  String S_AcctRegionId = "acct_region_id";
  public final static  String S_OldAcctId = "old_acct_id";
  public final static  String S_DoneCode = "done_code";
  public final static  String S_TogetherFlag = "together_flag";
  public final static  String S_OrgId = "org_id";
  public final static  String S_ExpireDateType = "expire_date_type";
  public final static  String S_UserRegionId = "user_region_id";
  public final static  String S_ItemId = "item_id";
  public final static  String S_GrpSplitId = "grp_split_id";
  public final static  String S_PayMode = "pay_mode";
  public final static  String S_EffectiveDate = "effective_date";
  public final static  String S_AcctId = "acct_id";
  public final static  String S_AcctRelaId = "acct_rela_id";


public long getMaxPay();

public Timestamp getExpireDate();

public Timestamp getDoneDate();

public long getOutAcctPri();

public long getPayUserId();

public long getState();

public String getRegionId();

public long getEffectiveDateType();

public long getOfferInstId();

public String getRemarks();

public long getOpId();

public Timestamp getCreateDate();

public long getPayType();

public long getPayValue();

public long getUserId();

public long getItemType();

public String getAcctRegionId();

public long getOldAcctId();

public long getDoneCode();

public long getTogetherFlag();

public long getOrgId();

public long getExpireDateType();

public String getUserRegionId();

public long getItemId();

public long getGrpSplitId();

public long getPayMode();

public Timestamp getEffectiveDate();

public long getAcctId();

public long getAcctRelaId();


public  void setMaxPay(long value);

public  void setExpireDate(Timestamp value);

public  void setDoneDate(Timestamp value);

public  void setOutAcctPri(long value);

public  void setPayUserId(long value);

public  void setState(long value);

public  void setRegionId(String value);

public  void setEffectiveDateType(long value);

public  void setOfferInstId(long value);

public  void setRemarks(String value);

public  void setOpId(long value);

public  void setCreateDate(Timestamp value);

public  void setPayType(long value);

public  void setPayValue(long value);

public  void setUserId(long value);

public  void setItemType(long value);

public  void setAcctRegionId(String value);

public  void setOldAcctId(long value);

public  void setDoneCode(long value);

public  void setTogetherFlag(long value);

public  void setOrgId(long value);

public  void setExpireDateType(long value);

public  void setUserRegionId(String value);

public  void setItemId(long value);

public  void setGrpSplitId(long value);

public  void setPayMode(long value);

public  void setEffectiveDate(Timestamp value);

public  void setAcctId(long value);

public  void setAcctRelaId(long value);
}
