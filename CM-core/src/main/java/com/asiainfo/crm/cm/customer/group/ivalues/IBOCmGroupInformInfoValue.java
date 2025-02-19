package com.asiainfo.crm.cm.customer.group.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmGroupInformInfoValue extends DataStructInterface{

  public final static  String S_MaintainerNum = "MAINTAINER_NUM";
  public final static  String S_State = "STATE";
  public final static  String S_Supplier = "SUPPLIER";
  public final static  String S_CostType = "COST_TYPE";
  public final static  String S_CabPropertyOwner = "CAB_PROPERTY_OWNER";
  public final static  String S_CostYear = "COST_YEAR";
  public final static  String S_CostAvgMonthList = "COST_AVG_MONTH_LIST";
  public final static  String S_Operator = "OPERATOR";
  public final static  String S_SecondOperatorList = "SECOND_OPERATOR_LIST";
  public final static  String S_PreferentialPolicy = "PREFERENTIAL_POLICY";
  public final static  String S_ImplTypeList = "IMPL_TYPE_LIST";
  public final static  String S_PropertyType = "PROPERTY_TYPE";
  public final static  String S_SecondOperatorText = "SECOND_OPERATOR_TEXT";
  public final static  String S_MajorOperatorText = "MAJOR_OPERATOR_TEXT";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_MajorOwnerDesc = "MAJOR_OWNER_DESC";
  public final static  String S_DeviceNum = "DEVICE_NUM";
  public final static  String S_ImplTypeText = "IMPL_TYPE_TEXT";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_Notes = "NOTES";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OtherGroupInformation = "OTHER_GROUP_INFORMATION";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_CostAvgMonthText = "COST_AVG_MONTH_TEXT";
  public final static  String S_MajorOperatorList = "MAJOR_OPERATOR_LIST";
  public final static  String S_Costs = "COSTS";
  public final static  String S_IsUsered = "IS_USERED";
  public final static  String S_AdminType = "ADMIN_TYPE";
  public final static  String S_GroupCustId = "GROUP_CUST_ID";
  public final static  String S_InternetMode = "INTERNET_MODE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_LinkScope = "LINK_SCOPE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_HostLocalType = "HOST_LOCAL_TYPE";
  public final static  String S_InformTypeId = "INFORM_TYPE_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_ContractExpireDate = "CONTRACT_EXPIRE_DATE";
  public final static  String S_Bandwidth = "BANDWIDTH";
  public final static  String S_EmailSysType = "EMAIL_SYS_TYPE";


public int getMaintainerNum();

public String getState();

public String getSupplier();

public int getCostType();

public int getCabPropertyOwner();

public String getCostYear();

public int getCostAvgMonthList();

public String getOperator();

public int getSecondOperatorList();

public String getPreferentialPolicy();

public int getImplTypeList();

public int getPropertyType();

public String getSecondOperatorText();

public String getMajorOperatorText();

public long getCreateOpId();

public String getMajorOwnerDesc();

public int getDeviceNum();

public String getImplTypeText();

public long getDoneCode();

public String getNotes();

public Timestamp getExpireDate();

public String getOtherGroupInformation();

public long getOpId();

public Timestamp getEffectiveDate();

public String getCostAvgMonthText();

public int getMajorOperatorList();

public long getCosts();

public int getIsUsered();

public int getAdminType();

public long getGroupCustId();

public int getInternetMode();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public int getLinkScope();

public Timestamp getDoneDate();

public int getHostLocalType();

public int getInformTypeId();

public Timestamp getCreateDate();

public Timestamp getContractExpireDate();

public int getBandwidth();

public int getEmailSysType();


public  void setMaintainerNum(int value);

public  void setState(String value);

public  void setSupplier(String value);

public  void setCostType(int value);

public  void setCabPropertyOwner(int value);

public  void setCostYear(String value);

public  void setCostAvgMonthList(int value);

public  void setOperator(String value);

public  void setSecondOperatorList(int value);

public  void setPreferentialPolicy(String value);

public  void setImplTypeList(int value);

public  void setPropertyType(int value);

public  void setSecondOperatorText(String value);

public  void setMajorOperatorText(String value);

public  void setCreateOpId(long value);

public  void setMajorOwnerDesc(String value);

public  void setDeviceNum(int value);

public  void setImplTypeText(String value);

public  void setDoneCode(long value);

public  void setNotes(String value);

public  void setExpireDate(Timestamp value);

public  void setOtherGroupInformation(String value);

public  void setOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setCostAvgMonthText(String value);

public  void setMajorOperatorList(int value);

public  void setCosts(long value);

public  void setIsUsered(int value);

public  void setAdminType(int value);

public  void setGroupCustId(long value);

public  void setInternetMode(int value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setLinkScope(int value);

public  void setDoneDate(Timestamp value);

public  void setHostLocalType(int value);

public  void setInformTypeId(int value);

public  void setCreateDate(Timestamp value);

public  void setContractExpireDate(Timestamp value);

public  void setBandwidth(int value);

public  void setEmailSysType(int value);
}
