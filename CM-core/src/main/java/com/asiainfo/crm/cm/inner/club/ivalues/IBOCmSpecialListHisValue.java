package com.asiainfo.crm.cm.inner.club.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmSpecialListHisValue extends DataStructInterface{

  public final static  String S_CertCode = "CERT_CODE";
  public final static  String S_State = "STATE";
  public final static  String S_PartyName = "PARTY_NAME";
  public final static  String S_MonRank = "MON_RANK";
  public final static  String S_PartyId = "PARTY_ID";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_DelReason = "DEL_REASON";
  public final static  String S_SpecListId = "SPEC_LIST_ID";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_MonType = "MON_TYPE";
  public final static  String S_SubMonType = "SUB_MON_TYPE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_HId = "H_ID";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CertType = "CERT_TYPE";
  public final static  String S_MonRegionDetail = "MON_REGION_DETAIL";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_ListSource = "LIST_SOURCE";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_AddReason = "ADD_REASON";
  public final static  String S_MonRegionLevel = "MON_REGION_LEVEL";


public String getCertCode();

public String getState();

public String getPartyName();

public int getMonRank();

public long getPartyId();

public String getRemarks();

public String getDelReason();

public long getSpecListId();

public long getCustId();

public long getCreateOpId();

public int getMonType();

public int getSubMonType();

public long getDoneCode();

public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public long getOpId();

public long getHId();

public long getUserId();

public long getOrgId();

public long getCreateOrgId();

public String getRegionId();

public int getCertType();

public String getMonRegionDetail();

public Timestamp getDoneDate();

public int getListSource();

public String getBillId();

public Timestamp getCreateDate();

public String getAddReason();

public int getMonRegionLevel();


public  void setCertCode(String value);

public  void setState(String value);

public  void setPartyName(String value);

public  void setMonRank(int value);

public  void setPartyId(long value);

public  void setRemarks(String value);

public  void setDelReason(String value);

public  void setSpecListId(long value);

public  void setCustId(long value);

public  void setCreateOpId(long value);

public  void setMonType(int value);

public  void setSubMonType(int value);

public  void setDoneCode(long value);

public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setHId(long value);

public  void setUserId(long value);

public  void setOrgId(long value);

public  void setCreateOrgId(long value);

public  void setRegionId(String value);

public  void setCertType(int value);

public  void setMonRegionDetail(String value);

public  void setDoneDate(Timestamp value);

public  void setListSource(int value);

public  void setBillId(String value);

public  void setCreateDate(Timestamp value);

public  void setAddReason(String value);

public  void setMonRegionLevel(int value);
}
