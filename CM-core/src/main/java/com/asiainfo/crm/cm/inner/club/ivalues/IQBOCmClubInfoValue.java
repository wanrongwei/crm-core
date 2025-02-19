package com.asiainfo.crm.cm.inner.club.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IQBOCmClubInfoValue extends DataStructInterface{

  public final static  String S_CertType = "CERT_TYPE";
  public final static  String S_CertCode = "CERT_CODE";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_MemberId = "MEMBER_ID";
  public final static  String S_ClubName = "CLUB_NAME";
  public final static  String S_MemberName = "MEMBER_NAME";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_ClubId = "CLUB_ID";


public long getCertType();

public String getCertCode();

public long getUserId();

public long getMemberId();

public String getClubName();

public String getMemberName();

public long getCustId();

public long getClubId();


public  void setCertType(long value);

public  void setCertCode(String value);

public  void setUserId(long value);

public  void setMemberId(long value);

public  void setClubName(String value);

public  void setMemberName(String value);

public  void setCustId(long value);

public  void setClubId(long value);
}
