package com.asiainfo.crm.cm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
public interface IBOCmCfgTabDefineValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_TabTitle = "TAB_TITLE";
  public final static  String S_TabUrl = "TAB_URL";
  public final static  String S_TabType = "TAB_TYPE";
  public final static  String S_TabId = "TAB_ID";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_BusinessId = "BUSINESS_ID";
  public final static  String S_CustType = "CUST_TYPE";
  public final static  String S_TabCode = "TAB_CODE";


public String getState();

public String getTabTitle();

public String getTabUrl();

public String getTabType();

public long getTabId();

public String getRemarks();

public long getBusinessId();

public int getCustType();

public String getTabCode();


public  void setState(String value);

public  void setTabTitle(String value);

public  void setTabUrl(String value);

public  void setTabType(String value);

public  void setTabId(long value);

public  void setRemarks(String value);

public  void setBusinessId(long value);

public  void setCustType(int value);

public  void setTabCode(String value);
}
