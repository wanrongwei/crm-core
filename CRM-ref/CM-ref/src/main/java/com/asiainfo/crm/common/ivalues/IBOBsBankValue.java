package com.asiainfo.crm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOBsBankValue extends DataStructInterface{

  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_BankCodeStd = "BANK_CODE_STD";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_BankTelephone = "BANK_TELEPHONE";
  public final static  String S_State = "STATE";
  public final static  String S_CityCode = "CITY_CODE";
  public final static  String S_CountyCode = "COUNTY_CODE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_ExtBankCode = "EXT_BANK_CODE";
  public final static  String S_DeductBankCode = "DEDUCT_BANK_CODE";
  public final static  String S_BankCodeRule = "BANK_CODE_RULE";
  public final static  String S_BankPostcode = "BANK_POSTCODE";
  public final static  String S_BankName = "BANK_NAME";
  public final static  String S_ParentBankCode = "PARENT_BANK_CODE";
  public final static  String S_BankAddress = "BANK_ADDRESS";
  public final static  String S_IsOnline = "IS_ONLINE";
  public final static  String S_BankCodeType = "BANK_CODE_TYPE";
  public final static  String S_BankCode = "BANK_CODE";
  public final static  String S_BankType = "BANK_TYPE";
  public final static  String S_EntrustBankCode = "ENTRUST_BANK_CODE";
  public final static  String S_BankAccountType = "BANK_ACCOUNT_TYPE";


public Timestamp getExpireDate();

public String getBankCodeStd();

public Timestamp getEffectiveDate();

public String getBankTelephone();

public String getState();

public String getCityCode();

public String getCountyCode();

public String getRemarks();

public String getExtBankCode();

public String getDeductBankCode();

public String getBankCodeRule();

public String getBankPostcode();

public String getBankName();

public String getParentBankCode();

public String getBankAddress();

public String getIsOnline();

public String getBankCodeType();

public String getBankCode();

public String getBankType();

public String getEntrustBankCode();

public int getBankAccountType();


public  void setExpireDate(Timestamp value);

public  void setBankCodeStd(String value);

public  void setEffectiveDate(Timestamp value);

public  void setBankTelephone(String value);

public  void setState(String value);

public  void setCityCode(String value);

public  void setCountyCode(String value);

public  void setRemarks(String value);

public  void setExtBankCode(String value);

public  void setDeductBankCode(String value);

public  void setBankCodeRule(String value);

public  void setBankPostcode(String value);

public  void setBankName(String value);

public  void setParentBankCode(String value);

public  void setBankAddress(String value);

public  void setIsOnline(String value);

public  void setBankCodeType(String value);

public  void setBankCode(String value);

public  void setBankType(String value);

public  void setEntrustBankCode(String value);

public  void setBankAccountType(int value);
}
