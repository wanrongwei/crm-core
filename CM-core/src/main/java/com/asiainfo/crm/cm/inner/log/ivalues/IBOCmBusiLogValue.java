package com.asiainfo.crm.cm.inner.log.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmBusiLogValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_PartyId = "PARTY_ID";
  public final static  String S_BusiDetail = "BUSI_DETAIL";
  public final static  String S_AreaId = "AREA_ID";
  public final static  String S_ChannelType = "CHANNEL_TYPE";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_OperType = "OPER_TYPE";
  public final static  String S_BusiLogId = "BUSI_LOG_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_BusinessId = "BUSINESS_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_ParentLogId = "PARENT_LOG_ID";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_BusiType = "BUSI_TYPE";
  public final static  String S_PeerDoneCode = "PEER_DONE_CODE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CountyId = "COUNTY_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_CreateDate = "CREATE_DATE";


public String getState();

public String getRemarks();

public long getPartyId();

public String getBusiDetail();

public String getAreaId();

public int getChannelType();

public long getAcctId();

public long getCustId();

public long getCreateOpId();

public long getDoneCode();

public int getOperType();

public long getBusiLogId();

public Timestamp getExpireDate();

public long getBusinessId();

public Timestamp getEffectiveDate();

public long getOpId();

public long getParentLogId();

public long getUserId();

public int getBusiType();

public String getPeerDoneCode();

public long getOrgId();

public long getCreateOrgId();

public String getRegionId();

public String getCountyId();

public Timestamp getDoneDate();

public String getBillId();

public Timestamp getCreateDate();


public  void setState(String value);

public  void setRemarks(String value);

public  void setPartyId(long value);

public  void setBusiDetail(String value);

public  void setAreaId(String value);

public  void setChannelType(int value);

public  void setAcctId(long value);

public  void setCustId(long value);

public  void setCreateOpId(long value);

public  void setDoneCode(long value);

public  void setOperType(int value);

public  void setBusiLogId(long value);

public  void setExpireDate(Timestamp value);

public  void setBusinessId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setParentLogId(long value);

public  void setUserId(long value);

public  void setBusiType(int value);

public  void setPeerDoneCode(String value);

public  void setOrgId(long value);

public  void setCreateOrgId(long value);

public  void setRegionId(String value);

public  void setCountyId(String value);

public  void setDoneDate(Timestamp value);

public  void setBillId(String value);

public  void setCreateDate(Timestamp value);
}
