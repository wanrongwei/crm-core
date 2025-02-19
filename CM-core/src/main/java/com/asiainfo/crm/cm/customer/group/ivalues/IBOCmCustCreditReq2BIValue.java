package com.asiainfo.crm.cm.customer.group.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmCustCreditReq2BIValue extends DataStructInterface{

  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_ReqCoinReason = "REQ_COIN_REASON";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_RequestId = "REQUEST_ID";
  public final static  String S_DealNum = "DEAL_NUM";
  public final static  String S_ReqCoin = "REQ_COIN";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_DealState = "DEAL_STATE";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_RequestReasion = "REQUEST_REASION";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DealResult = "DEAL_RESULT";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_RequestType = "REQUEST_TYPE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_ValidMode = "VALID_MODE";
  public final static  String S_OrgCreditClas = "ORG_CREDIT_CLAS";
  public final static  String S_ReqCreditClass = "REQ_CREDIT_CLASS";


public Timestamp getExpireDate();

public String getReqCoinReason();

public Timestamp getEffectiveDate();

public long getOpId();

public String getState();

public String getRemarks();

public long getRequestId();

public int getDealNum();

public long getReqCoin();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public int getDealState();

public long getCustId();

public String getRequestReasion();

public long getCreateOpId();

public String getDealResult();

public Timestamp getDoneDate();

public int getRequestType();

public Timestamp getCreateDate();

public long getDoneCode();

public int getValidMode();

public int getOrgCreditClas();

public int getReqCreditClass();


public  void setExpireDate(Timestamp value);

public  void setReqCoinReason(String value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setState(String value);

public  void setRemarks(String value);

public  void setRequestId(long value);

public  void setDealNum(int value);

public  void setReqCoin(long value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setDealState(int value);

public  void setCustId(long value);

public  void setRequestReasion(String value);

public  void setCreateOpId(long value);

public  void setDealResult(String value);

public  void setDoneDate(Timestamp value);

public  void setRequestType(int value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setValidMode(int value);

public  void setOrgCreditClas(int value);

public  void setReqCreditClass(int value);
}
