package com.asiainfo.crm.cm.zg.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IIRaccOperValue extends DataStructInterface{

  public final static  String S_ServId = "SERV_ID";
  public final static  String S_CountyCode = "COUNTY_CODE";
  public final static  String S_GroupId = "GROUP_ID";
  public final static  String S_UpDate = "UP_DATE";
  public final static  String S_BusiCode = "BUSI_CODE";
  public final static  String S_CommitDate = "COMMIT_DATE";
  public final static  String S_Remark = "REMARK";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_Sid = "SID";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_UpField = "UP_FIELD";
  public final static  String S_RegionCode = "REGION_CODE";
  public final static  String S_SoNbr = "SO_NBR";


public long getServId();

public int getCountyCode();

public long getGroupId();

public Timestamp getUpDate();

public int getBusiCode();

public Timestamp getCommitDate();

public String getRemark();

public long getOrgId();

public long getSid();

public long getAcctId();

public long getCustId();

public String getUpField();

public int getRegionCode();

public long getSoNbr();


public  void setServId(long value);

public  void setCountyCode(int value);

public  void setGroupId(long value);

public  void setUpDate(Timestamp value);

public  void setBusiCode(int value);

public  void setCommitDate(Timestamp value);

public  void setRemark(String value);

public  void setOrgId(long value);

public  void setSid(long value);

public  void setAcctId(long value);

public  void setCustId(long value);

public  void setUpField(String value);

public  void setRegionCode(int value);

public  void setSoNbr(long value);
}
