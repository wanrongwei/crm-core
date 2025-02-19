package com.asiainfo.crm.cm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOAccBankValue extends DataStructInterface{

  public final static  String S_StsDate = "STS_DATE";
  public final static  String S_Sts = "STS";
  public final static  String S_CountyCode = "COUNTY_CODE";
  public final static  String S_PhoneId = "PHONE_ID";
  public final static  String S_BankAcct = "BANK_ACCT";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_BankId = "BANK_ID";
  public final static  String S_Remark = "REMARK";
  public final static  String S_RegionCode = "REGION_CODE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_SoNbr = "SO_NBR";


public Timestamp getStsDate();

public int getSts();

public int getCountyCode();

public String getPhoneId();

public String getBankAcct();

public long getAcctId();

public long getBankId();

public String getRemark();

public int getRegionCode();

public Timestamp getCreateDate();

public long getSoNbr();


public  void setStsDate(Timestamp value);

public  void setSts(int value);

public  void setCountyCode(int value);

public  void setPhoneId(String value);

public  void setBankAcct(String value);

public  void setAcctId(long value);

public  void setBankId(long value);

public  void setRemark(String value);

public  void setRegionCode(int value);

public  void setCreateDate(Timestamp value);

public  void setSoNbr(long value);
}
