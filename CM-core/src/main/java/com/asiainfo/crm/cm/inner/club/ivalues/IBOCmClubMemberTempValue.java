package com.asiainfo.crm.cm.inner.club.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmClubMemberTempValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_FailRemarks = "FAIL_REMARKS";


public String getState();

public long getUserId();

public String getBillId();

public String getFailRemarks();


public  void setState(String value);

public  void setUserId(long value);

public  void setBillId(String value);

public  void setFailRemarks(String value);
}
