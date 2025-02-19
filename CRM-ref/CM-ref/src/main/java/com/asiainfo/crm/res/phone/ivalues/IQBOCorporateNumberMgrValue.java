package com.asiainfo.crm.res.phone.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IQBOCorporateNumberMgrValue extends DataStructInterface{

  public final static  String S_DeptId = "DEPT_ID";
  public final static  String S_RelaType = "RELA_TYPE";
  public final static  String S_ManageStatus = "MANAGE_STATUS";
  public final static  String S_LeadingNum = "LEADING_NUM";
  public final static  String S_CustCardNo = "CUST_CARD_NO";
  public final static  String S_ResSpecId = "RES_SPEC_ID";
  public final static  String S_CustCardType = "CUST_CARD_TYPE";
  public final static  String S_Amount = "AMOUNT";
  public final static  String S_EndId = "END_ID";
  public final static  String S_BegId = "BEG_ID";


public String getDeptId();

public int getRelaType();

public String getManageStatus();

public String getLeadingNum();

public String getCustCardNo();

public long getResSpecId();

public String getCustCardType();

public long getAmount();

public String getEndId();

public String getBegId();


public  void setDeptId(String value);

public  void setRelaType(int value);

public  void setManageStatus(String value);

public  void setLeadingNum(String value);

public  void setCustCardNo(String value);

public  void setResSpecId(long value);

public  void setCustCardType(String value);

public  void setAmount(long value);

public  void setEndId(String value);

public  void setBegId(String value);
}
