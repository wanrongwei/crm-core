package com.asiainfo.crm.cm.zg.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IIAccBusiCreditValue extends DataStructInterface{

  public final static  String S_Sid = "SID";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_Remark = "REMARK";
  public final static  String S_BusiCredit = "BUSI_CREDIT";
  public final static  String S_RegionCode = "REGION_CODE";
  public final static  String S_ServiceId = "SERVICE_ID";
  public final static  String S_SoNbr = "SO_NBR";
  public final static  String S_CreditLevel = "CREDIT_LEVEL";


public long getSid();

public long getAcctId();

public String getRemark();

public long getBusiCredit();

public int getRegionCode();

public long getServiceId();

public long getSoNbr();

public long getCreditLevel();


public  void setSid(long value);

public  void setAcctId(long value);

public  void setRemark(String value);

public  void setBusiCredit(long value);

public  void setRegionCode(int value);

public  void setServiceId(long value);

public  void setSoNbr(long value);

public  void setCreditLevel(long value);
}
