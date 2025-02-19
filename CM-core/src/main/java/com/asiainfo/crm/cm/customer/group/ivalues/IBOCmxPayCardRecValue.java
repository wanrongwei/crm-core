package com.asiainfo.crm.cm.customer.group.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmxPayCardRecValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_OldProcessNo = "OLD_PROCESS_NO";
  public final static  String S_GroupCountyId = "GROUP_COUNTY_ID";
  public final static  String S_RecId = "REC_ID";
  public final static  String S_TradeTime = "TRADE_TIME";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_ValidCount = "VALID_COUNT";
  public final static  String S_NumExt1 = "NUM_EXT1";
  public final static  String S_NumExt3 = "NUM_EXT3";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_NumExt2 = "NUM_EXT2";
  public final static  String S_Notes = "NOTES";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_DiscountMoney = "DISCOUNT_MONEY";
  public final static  String S_SaleId = "SALE_ID";
  public final static  String S_CardMoney = "CARD_MONEY";
  public final static  String S_BusiCode = "BUSI_CODE";
  public final static  String S_EndCardno = "END_CARDNO";
  public final static  String S_GroupCustId = "GROUP_CUST_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_ProcessNo = "PROCESS_NO";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_CustName = "CUST_NAME";
  public final static  String S_BackProcessNo = "BACK_PROCESS_NO";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_SaleMoney = "SALE_MONEY";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_GroupRegionId = "GROUP_REGION_ID";
  public final static  String S_BeginCardno = "BEGIN_CARDNO";


public String getState();

public long getOldProcessNo();

public String getGroupCountyId();

public String getRecId();

public Timestamp getTradeTime();

public long getAcctId();

public long getCreateOpId();

public long getValidCount();

public long getNumExt1();

public long getNumExt3();

public long getDoneCode();

public long getNumExt2();

public String getNotes();

public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public long getOpId();

public long getDiscountMoney();

public long getSaleId();

public long getCardMoney();

public long getBusiCode();

public String getEndCardno();

public long getGroupCustId();

public long getOrgId();

public String getRegionId();

public String getProcessNo();

public long getCreateOrgId();

public String getCustName();

public String getBackProcessNo();

public Timestamp getDoneDate();

public long getSaleMoney();

public Timestamp getCreateDate();

public String getGroupRegionId();

public String getBeginCardno();


public  void setState(String value);

public  void setOldProcessNo(long value);

public  void setGroupCountyId(String value);

public  void setRecId(String value);

public  void setTradeTime(Timestamp value);

public  void setAcctId(long value);

public  void setCreateOpId(long value);

public  void setValidCount(long value);

public  void setNumExt1(long value);

public  void setNumExt3(long value);

public  void setDoneCode(long value);

public  void setNumExt2(long value);

public  void setNotes(String value);

public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setDiscountMoney(long value);

public  void setSaleId(long value);

public  void setCardMoney(long value);

public  void setBusiCode(long value);

public  void setEndCardno(String value);

public  void setGroupCustId(long value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setProcessNo(String value);

public  void setCreateOrgId(long value);

public  void setCustName(String value);

public  void setBackProcessNo(String value);

public  void setDoneDate(Timestamp value);

public  void setSaleMoney(long value);

public  void setCreateDate(Timestamp value);

public  void setGroupRegionId(String value);

public  void setBeginCardno(String value);
}
