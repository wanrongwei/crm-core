package com.asiainfo.crm.cm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IQBOCmPartyRoleOkValue extends DataStructInterface{

  public final static  String S_RoleType = "ROLE_TYPE";
  public final static  String S_PartyName = "PARTY_NAME";
  public final static  String S_RoleStatus = "ROLE_STATUS";
  public final static  String S_PartyId = "PARTY_ID";
  public final static  String S_DoneDate = "DONE_DATE";


public long getRoleType();

public String getPartyName();

public long getRoleStatus();

public long getPartyId();

public Timestamp getDoneDate();


public  void setRoleType(long value);

public  void setPartyName(String value);

public  void setRoleStatus(long value);

public  void setPartyId(long value);

public  void setDoneDate(Timestamp value);
}
