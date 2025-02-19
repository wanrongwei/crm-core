package com.asiainfo.crm.cm.inner.club.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IQBOCmClubMemberCardValue extends DataStructInterface{

  public final static  String S_CertCode = "CERT_CODE";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_PartyId = "PARTY_ID";
  public final static  String S_CardLevel = "CARD_LEVEL";
  public final static  String S_CardCode = "CARD_CODE";
  public final static  String S_MemberId = "MEMBER_ID";
  public final static  String S_MemberCode = "MEMBER_CODE";
  public final static  String S_MemberPswd = "MEMBER_PSWD";
  public final static  String S_FirstName = "FIRST_NAME";
  public final static  String S_RecordId = "RECORD_ID";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_MemberName = "MEMBER_NAME";
  public final static  String S_DeliverDate = "DELIVER_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_DeliverRegion = "DELIVER_REGION";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_CardType = "CARD_TYPE";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_LastNameQry = "LAST_NAME_QRY";
  public final static  String S_ClubId = "CLUB_ID";
  public final static  String S_LastName = "LAST_NAME";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_CardSource = "CARD_SOURCE";
  public final static  String S_CertType = "CERT_TYPE";
  public final static  String S_MiddleName = "MIDDLE_NAME";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_FirstNameQry = "FIRST_NAME_QRY";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_CardYear = "CARD_YEAR";
  public final static  String S_MiddleNameQry = "MIDDLE_NAME_QRY";
  public final static  String S_MemberSource = "MEMBER_SOURCE";
  public final static  String S_MemberLevel = "MEMBER_LEVEL";


public String getCertCode();

public String getState();

public String getRemarks();

public long getPartyId();

public long getCardLevel();

public String getCardCode();

public long getMemberId();

public String getMemberCode();

public String getMemberPswd();

public String getFirstName();

public long getRecordId();

public long getCustId();

public long getCreateOpId();

public String getMemberName();

public Timestamp getDeliverDate();

public long getDoneCode();

public String getDeliverRegion();

public Timestamp getExpireDate();

public long getOpId();

public Timestamp getEffectiveDate();

public long getCardType();

public long getUserId();

public String getLastNameQry();

public long getClubId();

public String getLastName();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public long getCardSource();

public long getCertType();

public String getMiddleName();

public Timestamp getDoneDate();

public String getFirstNameQry();

public String getBillId();

public Timestamp getCreateDate();

public long getCardYear();

public String getMiddleNameQry();

public long getMemberSource();

public long getMemberLevel();


public  void setCertCode(String value);

public  void setState(String value);

public  void setRemarks(String value);

public  void setPartyId(long value);

public  void setCardLevel(long value);

public  void setCardCode(String value);

public  void setMemberId(long value);

public  void setMemberCode(String value);

public  void setMemberPswd(String value);

public  void setFirstName(String value);

public  void setRecordId(long value);

public  void setCustId(long value);

public  void setCreateOpId(long value);

public  void setMemberName(String value);

public  void setDeliverDate(Timestamp value);

public  void setDoneCode(long value);

public  void setDeliverRegion(String value);

public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setCardType(long value);

public  void setUserId(long value);

public  void setLastNameQry(String value);

public  void setClubId(long value);

public  void setLastName(String value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setCardSource(long value);

public  void setCertType(long value);

public  void setMiddleName(String value);

public  void setDoneDate(Timestamp value);

public  void setFirstNameQry(String value);

public  void setBillId(String value);

public  void setCreateDate(Timestamp value);

public  void setCardYear(long value);

public  void setMiddleNameQry(String value);

public  void setMemberSource(long value);

public  void setMemberLevel(long value);
}
