package com.asiainfo.crm.cm.custgroup.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmInvitationCodeValue extends DataStructInterface{

  public final static  String S_ManageStatus = "MANAGE_STATUS";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_InvitationCodeId = "INVITATION_CODE_ID";
  public final static  String S_InvitationCode = "INVITATION_CODE";


public String getManageStatus();

public String getState();

public String getRemarks();

public long getInvitationCodeId();

public String getInvitationCode();


public  void setManageStatus(String value);

public  void setState(String value);

public  void setRemarks(String value);

public  void setInvitationCodeId(long value);

public  void setInvitationCode(String value);
}
