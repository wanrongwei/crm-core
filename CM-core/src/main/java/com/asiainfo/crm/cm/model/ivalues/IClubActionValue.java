package com.asiainfo.crm.cm.model.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IClubActionValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_ActionCode = "ACTION_CODE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_EndDate = "END_DATE";
  public final static  String S_ContactPhone = "CONTACT_PHONE";
  public final static  String S_ValueType = "VALUE_TYPE";
  public final static  String S_FirstName = "FIRST_NAME";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_ContNameQry = "CONT_NAME_QRY";
  public final static  String S_ContactPerson = "CONTACT_PERSON";
  public final static  String S_ActionName = "ACTION_NAME";
  public final static  String S_ActionDesc = "ACTION_DESC";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_LimitNum = "LIMIT_NUM";
  public final static  String S_ActionContent = "ACTION_CONTENT";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_ActionType = "ACTION_TYPE";
  public final static  String S_ActionPlace = "ACTION_PLACE";
  public final static  String S_LastNameQry = "LAST_NAME_QRY";
  public final static  String S_BeginDate = "BEGIN_DATE";
  public final static  String S_ValueAmount = "VALUE_AMOUNT";
  public final static  String S_ClubId = "CLUB_ID";
  public final static  String S_LastName = "LAST_NAME";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_MiddleName = "MIDDLE_NAME";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_FirstNameQry = "FIRST_NAME_QRY";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_MiddleNameQry = "MIDDLE_NAME_QRY";
  public final static  String S_ParentActionId = "PARENT_ACTION_ID";
  public final static  String S_ActionId = "ACTION_ID";


public String getState();

public String getActionCode();

public String getRemarks();

public Timestamp getEndDate();

public String getContactPhone();

public int getValueType();

public String getFirstName();

public long getCreateOpId();

public String getContNameQry();

public String getContactPerson();

public String getActionName();

public String getActionDesc();

public long getDoneCode();

public long getLimitNum();

public String getActionContent();

public Timestamp getExpireDate();

public long getOpId();

public Timestamp getEffectiveDate();

public int getActionType();

public String getActionPlace();

public String getLastNameQry();

public Timestamp getBeginDate();

public long getValueAmount();

public long getClubId();

public String getLastName();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public String getMiddleName();

public Timestamp getDoneDate();

public String getFirstNameQry();

public Timestamp getCreateDate();

public String getMiddleNameQry();

public long getParentActionId();

public long getActionId();


public  void setState(String value);

public  void setActionCode(String value);

public  void setRemarks(String value);

public  void setEndDate(Timestamp value);

public  void setContactPhone(String value);

public  void setValueType(int value);

public  void setFirstName(String value);

public  void setCreateOpId(long value);

public  void setContNameQry(String value);

public  void setContactPerson(String value);

public  void setActionName(String value);

public  void setActionDesc(String value);

public  void setDoneCode(long value);

public  void setLimitNum(long value);

public  void setActionContent(String value);

public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setActionType(int value);

public  void setActionPlace(String value);

public  void setLastNameQry(String value);

public  void setBeginDate(Timestamp value);

public  void setValueAmount(long value);

public  void setClubId(long value);

public  void setLastName(String value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setMiddleName(String value);

public  void setDoneDate(Timestamp value);

public  void setFirstNameQry(String value);

public  void setCreateDate(Timestamp value);

public  void setMiddleNameQry(String value);

public  void setParentActionId(long value);

public  void setActionId(long value);
}
