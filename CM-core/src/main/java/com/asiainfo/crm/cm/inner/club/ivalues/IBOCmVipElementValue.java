package com.asiainfo.crm.cm.inner.club.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmVipElementValue extends DataStructInterface{

  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_State = "STATE";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_ElementType = "ELEMENT_TYPE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RelId = "REL_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_MemberLevel = "MEMBER_LEVEL";


public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public long getOpId();

public String getState();

public long getUserId();

public String getRemarks();

public int getElementType();

public long getOrgId();

public long getRelId();

public long getCreateOrgId();

public String getRegionId();

public long getCreateOpId();

public Timestamp getDoneDate();

public long getBillId();

public Timestamp getCreateDate();

public long getDoneCode();

public int getMemberLevel();


public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setState(String value);

public  void setUserId(long value);

public  void setRemarks(String value);

public  void setElementType(int value);

public  void setOrgId(long value);

public  void setRelId(long value);

public  void setCreateOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOpId(long value);

public  void setDoneDate(Timestamp value);

public  void setBillId(long value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setMemberLevel(int value);
}
