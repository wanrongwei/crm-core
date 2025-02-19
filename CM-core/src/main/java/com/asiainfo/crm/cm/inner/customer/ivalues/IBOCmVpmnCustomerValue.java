package com.asiainfo.crm.cm.inner.customer.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmVpmnCustomerValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_CountyCode = "COUNTY_CODE";
  public final static  String S_GroupCategory = "GROUP_CATEGORY";
  public final static  String S_MaxMtrunk = "MAX_MTRUNK";
  public final static  String S_CurrentUser = "CURRENT_USER";
  public final static  String S_ProvCode = "PROV_CODE";
  public final static  String S_GroupType = "GROUP_TYPE";
  public final static  String S_CustAddress = "CUST_ADDRESS";
  public final static  String S_Phone = "PHONE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_StartNumber = "START_NUMBER";
  public final static  String S_CustZipcode = "CUST_ZIPCODE";
  public final static  String S_Notes = "NOTES";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_CustStatus = "CUST_STATUS";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_RgroupId = "RGROUP_ID";
  public final static  String S_GroupId = "GROUP_ID";
  public final static  String S_MaxUser = "MAX_USER";
  public final static  String S_Contact = "CONTACT";
  public final static  String S_EndNumber = "END_NUMBER";
  public final static  String S_CsManager = "CS_MANAGER";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_CustName = "CUST_NAME";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_VpmnCustId = "VPMN_CUST_ID";
  public final static  String S_RegionCode = "REGION_CODE";
  public final static  String S_CreateDate = "CREATE_DATE";


public String getState();

public String getCountyCode();

public int getGroupCategory();

public long getMaxMtrunk();

public int getCurrentUser();

public String getProvCode();

public int getGroupType();

public String getCustAddress();

public String getPhone();

public long getCreateOpId();

public long getDoneCode();

public long getStartNumber();

public String getCustZipcode();

public String getNotes();

public Timestamp getExpireDate();

public int getCustStatus();

public Timestamp getEffectiveDate();

public long getOpId();

public long getRgroupId();

public long getGroupId();

public int getMaxUser();

public String getContact();

public long getEndNumber();

public String getCsManager();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public String getCustName();

public Timestamp getDoneDate();

public long getVpmnCustId();

public String getRegionCode();

public Timestamp getCreateDate();


public  void setState(String value);

public  void setCountyCode(String value);

public  void setGroupCategory(int value);

public  void setMaxMtrunk(long value);

public  void setCurrentUser(int value);

public  void setProvCode(String value);

public  void setGroupType(int value);

public  void setCustAddress(String value);

public  void setPhone(String value);

public  void setCreateOpId(long value);

public  void setDoneCode(long value);

public  void setStartNumber(long value);

public  void setCustZipcode(String value);

public  void setNotes(String value);

public  void setExpireDate(Timestamp value);

public  void setCustStatus(int value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setRgroupId(long value);

public  void setGroupId(long value);

public  void setMaxUser(int value);

public  void setContact(String value);

public  void setEndNumber(long value);

public  void setCsManager(String value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setCustName(String value);

public  void setDoneDate(Timestamp value);

public  void setVpmnCustId(long value);

public  void setRegionCode(String value);

public  void setCreateDate(Timestamp value);
}
