package com.asiainfo.crm.so.order.rboss.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOOrdOTTCustValue extends DataStructInterface{

  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_State = "STATE";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_NoticeDate = "NOTICE_DATE";
  public final static  String S_Voucher = "VOUCHER";
  public final static  String S_ActiveExpireDate = "ACTIVE_EXPIRE_DATE";
  public final static  String S_CustType = "CUST_TYPE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_ActiveEffectiveDate = "ACTIVE_EFFECTIVE_DATE";
  public final static  String S_DealState = "DEAL_STATE";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_OttCustRelaId = "OTT_CUST_RELA_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_OttBusiType = "OTT_BUSI_TYPE";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_Ext1 = "EXT1";
  public final static  String S_Ext2 = "EXT2";
  public final static  String S_SecondNoticeDate = "SECOND_NOTICE_DATE";


public Timestamp getExpireDate();

public long getOpId();

public Timestamp getEffectiveDate();

public String getState();

public long getUserId();

public String getRemarks();

public Timestamp getNoticeDate();

public String getVoucher();

public Timestamp getActiveExpireDate();

public String getCustType();

public long getOrgId();

public String getRegionId();

public Timestamp getActiveEffectiveDate();

public long getDealState();

public long getCustId();

public long getOttCustRelaId();

public Timestamp getDoneDate();

public String getOttBusiType();

public String getBillId();

public Timestamp getCreateDate();

public long getDoneCode();

public String getExt1();

public String getExt2();

public Timestamp getSecondNoticeDate();


public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setState(String value);

public  void setUserId(long value);

public  void setRemarks(String value);

public  void setNoticeDate(Timestamp value);

public  void setVoucher(String value);

public  void setActiveExpireDate(Timestamp value);

public  void setCustType(String value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setActiveEffectiveDate(Timestamp value);

public  void setDealState(long value);

public  void setCustId(long value);

public  void setOttCustRelaId(long value);

public  void setDoneDate(Timestamp value);

public  void setOttBusiType(String value);

public  void setBillId(String value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setExt1(String value);

public  void setExt2(String value);

public  void setSecondNoticeDate(Timestamp value);
}
