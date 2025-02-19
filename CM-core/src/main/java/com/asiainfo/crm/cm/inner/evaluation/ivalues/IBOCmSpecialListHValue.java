package com.asiainfo.crm.cm.inner.evaluation.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmSpecialListHValue extends DataStructInterface{

  public final static  String S_CertCode = "CERT_CODE";
  public final static  String S_State = "STATE";
  public final static  String S_PartyName = "PARTY_NAME";
  public final static  String S_MonRank = "MON_RANK";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_PartyNameQry = "PARTY_NAME_QRY";
  public final static  String S_PartyId = "PARTY_ID";
  public final static  String S_DelReason = "DEL_REASON";
  public final static  String S_SpecListId = "SPEC_LIST_ID";
  public final static  String S_FirstName = "FIRST_NAME";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_MonType = "MON_TYPE";
  public final static  String S_SubMonType = "SUB_MON_TYPE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_HId = "H_ID";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_LastNameQry = "LAST_NAME_QRY";
  public final static  String S_LastName = "LAST_NAME";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_CertType = "CERT_TYPE";
  public final static  String S_MonRegionDetail = "MON_REGION_DETAIL";
  public final static  String S_MiddleName = "MIDDLE_NAME";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_FirstNameQry = "FIRST_NAME_QRY";
  public final static  String S_ListSource = "LIST_SOURCE";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_AddReason = "ADD_REASON";
  public final static  String S_MiddleNameQry = "MIDDLE_NAME_QRY";
  public final static  String S_MonRegionLevel = "MON_REGION_LEVEL";


public String getCertCode();

public String getState();

public String getPartyName();

public int getMonRank();

public String getRemarks();

public String getPartyNameQry();

public long getPartyId();

public String getDelReason();

public long getSpecListId();

public String getFirstName();

public long getCustId();

public long getCreateOpId();

public int getMonType();

public int getSubMonType();

public long getDoneCode();

public Timestamp getExpireDate();

public long getOpId();

public Timestamp getEffectiveDate();

public long getHId();

public long getUserId();

public String getLastNameQry();

public String getLastName();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public int getCertType();

public String getMonRegionDetail();

public String getMiddleName();

public Timestamp getDoneDate();

public String getFirstNameQry();

public int getListSource();

public String getBillId();

public Timestamp getCreateDate();

public String getAddReason();

public String getMiddleNameQry();

public int getMonRegionLevel();


public  void setCertCode(String value);

public  void setState(String value);

public  void setPartyName(String value);

public  void setMonRank(int value);

public  void setRemarks(String value);

public  void setPartyNameQry(String value);

public  void setPartyId(long value);

public  void setDelReason(String value);

public  void setSpecListId(long value);

public  void setFirstName(String value);

public  void setCustId(long value);

public  void setCreateOpId(long value);

public  void setMonType(int value);

public  void setSubMonType(int value);

public  void setDoneCode(long value);

public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setHId(long value);

public  void setUserId(long value);

public  void setLastNameQry(String value);

public  void setLastName(String value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setCertType(int value);

public  void setMonRegionDetail(String value);

public  void setMiddleName(String value);

public  void setDoneDate(Timestamp value);

public  void setFirstNameQry(String value);

public  void setListSource(int value);

public  void setBillId(String value);

public  void setCreateDate(Timestamp value);

public  void setAddReason(String value);

public  void setMiddleNameQry(String value);

public  void setMonRegionLevel(int value);
}
