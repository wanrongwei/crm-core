package com.asiainfo.crm.cm.customer.account.ivalues;
import com.ai.appframe2.common.DataStructInterface;
public interface IQBOCmGroupValue extends DataStructInterface{

  public final static  String S_ChnlRegionType = "CHNL_REGION_TYPE";
  public final static  String S_CustName = "CUST_NAME";
  public final static  String S_GroupId = "GROUP_ID";
  public final static  String S_ChnlCityId = "CHNL_CITY_ID";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_AcctType = "ACCT_TYPE";


public String getChnlRegionType();

public String getCustName();

public long getGroupId();

public String getChnlCityId();

public long getAcctId();

public long getAcctType();


public  void setChnlRegionType(String value);

public  void setCustName(String value);

public  void setGroupId(long value);

public  void setChnlCityId(String value);

public  void setAcctId(long value);

public  void setAcctType(long value);
}
