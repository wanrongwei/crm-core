package com.asiainfo.crm.cm.model.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IClubMemberCardValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_CardSource = "CARD_SOURCE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CardCode = "CARD_CODE";
  public final static  String S_MemberId = "MEMBER_ID";
  public final static  String S_CardFlag = "CARD_FLAG";
  public final static  String S_DeliverRegion = "DELIVER_REGION";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_CardYear = "CARD_YEAR";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_DeliverDate = "DELIVER_DATE";
  public final static  String S_CardType = "CARD_TYPE";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_RecordId = "RECORD_ID";
  public final static  String S_CardLevel = "CARD_LEVEL";


public String getState();

public long getCreateOpId();

public Timestamp getEffectiveDate();

public Timestamp getDoneDate();

public int getCardSource();

public String getRemarks();

public long getOrgId();

public String getCardCode();

public long getMemberId();

public int getCardFlag();

public String getDeliverRegion();

public Timestamp getCreateDate();

public int getCardYear();

public long getDoneCode();

public String getRegionId();

public long getOpId();

public Timestamp getExpireDate();

public Timestamp getDeliverDate();

public int getCardType();

public long getCreateOrgId();

public long getRecordId();

public int getCardLevel();


public  void setState(String value);

public  void setCreateOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setDoneDate(Timestamp value);

public  void setCardSource(int value);

public  void setRemarks(String value);

public  void setOrgId(long value);

public  void setCardCode(String value);

public  void setMemberId(long value);

public  void setCardFlag(int value);

public  void setDeliverRegion(String value);

public  void setCreateDate(Timestamp value);

public  void setCardYear(int value);

public  void setDoneCode(long value);

public  void setRegionId(String value);

public  void setOpId(long value);

public  void setExpireDate(Timestamp value);

public  void setDeliverDate(Timestamp value);

public  void setCardType(int value);

public  void setCreateOrgId(long value);

public  void setRecordId(long value);

public  void setCardLevel(int value);
}
