package com.asiainfo.crm.cm.customer.group.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IQBOCmGroupAccountValue extends DataStructInterface{

  public final static  String S_ChnlCityId = "CHNL_CITY_ID";
  public final static  String S_GroupId = "GROUP_ID";
  public final static  String S_ContName = "CONT_NAME";
  public final static  String S_AccAliasName = "ACC_ALIAS_NAME";
  public final static  String S_GroupCustId = "GROUP_CUST_ID";
  public final static  String S_ChnlRegionType = "CHNL_REGION_TYPE";
  public final static  String S_CustName = "CUST_NAME";
  public final static  String S_BaseCustId = "BASE_CUST_ID";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_ContMobile = "CONT_MOBILE";
  public final static  String S_ChnlRegionDetail = "CHNL_REGION_DETAIL";
  public final static  String S_ContCertCode = "CONT_CERT_CODE";
  public final static  String S_ContCertType = "CONT_CERT_TYPE";


public String getChnlCityId();

public long getGroupId();

public String getContName();

public String getAccAliasName();

public long getGroupCustId();

public String getChnlRegionType();

public String getCustName();

public long getBaseCustId();

public long getAcctId();

public String getContMobile();

public long getChnlRegionDetail();

public String getContCertCode();

public long getContCertType();


public  void setChnlCityId(String value);

public  void setGroupId(long value);

public  void setContName(String value);

public  void setAccAliasName(String value);

public  void setGroupCustId(long value);

public  void setChnlRegionType(String value);

public  void setCustName(String value);

public  void setBaseCustId(long value);

public  void setAcctId(long value);

public  void setContMobile(String value);

public  void setChnlRegionDetail(long value);

public  void setContCertCode(String value);

public  void setContCertType(long value);
}
