package com.asiainfo.crm.cm.model.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface ICmBusiLogValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_BusiDetail = "BUSI_DETAIL";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_ParentLogId = "PARENT_LOG_ID";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_BusiType = "BUSI_TYPE";
  public final static  String S_BatchDataId = "BATCH_DATA_ID";
  public final static  String S_ChannelType = "CHANNEL_TYPE";
  public final static  String S_BusiLogId = "BUSI_LOG_ID";
  public final static  String S_AreaId = "AREA_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_PartyId = "PARTY_ID";
  public final static  String S_BusinessId = "BUSINESS_ID";
  public final static  String S_OperType = "OPER_TYPE";
  public final static  String S_CountyId = "COUNTY_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_PeerDoneCode = "PEER_DONE_CODE";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_CustId = "CUST_ID";


public String getState();

public Timestamp getEffectiveDate();

public String getBusiDetail();

public Timestamp getDoneDate();

public long getAcctId();

public String getRemarks();

public Timestamp getCreateDate();

public long getDoneCode();

public long getOpId();

public String getRegionId();

public long getParentLogId();

public long getUserId();

public int getBusiType();

public long getBatchDataId();

public int getChannelType();

public long getBusiLogId();

public String getAreaId();

public long getCreateOpId();

public long getOrgId();

public long getPartyId();

public long getBusinessId();

public int getOperType();

public String getCountyId();

public Timestamp getExpireDate();

public String getPeerDoneCode();

public long getCreateOrgId();

public String getBillId();

public long getCustId();


public  void setState(String value);

public  void setEffectiveDate(Timestamp value);

public  void setBusiDetail(String value);

public  void setDoneDate(Timestamp value);

public  void setAcctId(long value);

public  void setRemarks(String value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setOpId(long value);

public  void setRegionId(String value);

public  void setParentLogId(long value);

public  void setUserId(long value);

public  void setBusiType(int value);

public  void setBatchDataId(long value);

public  void setChannelType(int value);

public  void setBusiLogId(long value);

public  void setAreaId(String value);

public  void setCreateOpId(long value);

public  void setOrgId(long value);

public  void setPartyId(long value);

public  void setBusinessId(long value);

public  void setOperType(int value);

public  void setCountyId(String value);

public  void setExpireDate(Timestamp value);

public  void setPeerDoneCode(String value);

public  void setCreateOrgId(long value);

public  void setBillId(String value);

public  void setCustId(long value);
}
