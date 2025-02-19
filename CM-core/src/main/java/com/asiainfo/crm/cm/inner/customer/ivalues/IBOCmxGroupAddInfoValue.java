package com.asiainfo.crm.cm.inner.customer.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmxGroupAddInfoValue extends DataStructInterface{

  public final static  String S_PostAddress = "POST_ADDRESS";
  public final static  String S_Profit = "PROFIT";
  public final static  String S_KernelLevel = "KERNEL_LEVEL";
  public final static  String S_PostProvince = "POST_PROVINCE";
  public final static  String S_SingleBusinessScope = "SINGLE_BUSINESS_SCOPE";
  public final static  String S_Arpu = "ARPU";
  public final static  String S_PostCity = "POST_CITY";
  public final static  String S_OrganType = "ORGAN_TYPE";
  public final static  String S_SpecailImportantLevel = "SPECAIL_IMPORTANT_LEVEL";
  public final static  String S_ClusterCustomerType = "CLUSTER_CUSTOMER_TYPE";
  public final static  String S_OthUseDtl = "OTH_USE_DTL";
  public final static  String S_TaxId = "TAX_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_ClusterType = "CLUSTER_TYPE";
  public final static  String S_SaleScope = "SALE_SCOPE";
  public final static  String S_UnionNum = "UNION_NUM";
  public final static  String S_Brief = "BRIEF";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_WirelessNum = "WIRELESS_NUM";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_RegionSpecial = "REGION_SPECIAL";
  public final static  String S_IsStandard = "IS_STANDARD";
  public final static  String S_CreditDegree = "CREDIT_DEGREE";
  public final static  String S_PostPostcode = "POST_POSTCODE";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_ExpenseType = "EXPENSE_TYPE";
  public final static  String S_Email = "EMAIL";
  public final static  String S_ProdDesc = "PROD_DESC";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_EspVocation = "ESP_VOCATION";
  public final static  String S_VpmnNum = "VPMN_NUM";
  public final static  String S_MobileNum = "MOBILE_NUM";
  public final static  String S_CommunicationExpense = "COMMUNICATION_EXPENSE";
  public final static  String S_ServiceChannel = "SERVICE_CHANNEL";
  public final static  String S_Turnover = "TURNOVER";
  public final static  String S_AAttitude = "A_ATTITUDE";
  public final static  String S_Brname = "BRNAME";
  public final static  String S_Contact = "CONTACT";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_PayType = "PAY_TYPE";
  public final static  String S_CompelereInfo = "COMPELERE_INFO";
  public final static  String S_Msisdn = "MSISDN";


public String getPostAddress();

public long getProfit();

public int getKernelLevel();

public String getPostProvince();

public int getSingleBusinessScope();

public long getArpu();

public String getPostCity();

public int getOrganType();

public int getSpecailImportantLevel();

public int getClusterCustomerType();

public String getOthUseDtl();

public String getTaxId();

public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public long getOpId();

public int getClusterType();

public String getSaleScope();

public int getUnionNum();

public String getBrief();

public Timestamp getDoneDate();

public Timestamp getCreateDate();

public int getWirelessNum();

public String getState();

public String getRemarks();

public int getRegionSpecial();

public int getIsStandard();

public int getCreditDegree();

public String getPostPostcode();

public long getCustId();

public long getCreateOpId();

public int getExpenseType();

public String getEmail();

public String getProdDesc();

public long getDoneCode();

public int getEspVocation();

public long getVpmnNum();

public int getMobileNum();

public long getCommunicationExpense();

public int getServiceChannel();

public long getTurnover();

public int getAAttitude();

public String getBrname();

public String getContact();

public long getOrgId();

public long getCreateOrgId();

public String getRegionId();

public int getPayType();

public String getCompelereInfo();

public String getMsisdn();


public  void setPostAddress(String value);

public  void setProfit(long value);

public  void setKernelLevel(int value);

public  void setPostProvince(String value);

public  void setSingleBusinessScope(int value);

public  void setArpu(long value);

public  void setPostCity(String value);

public  void setOrganType(int value);

public  void setSpecailImportantLevel(int value);

public  void setClusterCustomerType(int value);

public  void setOthUseDtl(String value);

public  void setTaxId(String value);

public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setClusterType(int value);

public  void setSaleScope(String value);

public  void setUnionNum(int value);

public  void setBrief(String value);

public  void setDoneDate(Timestamp value);

public  void setCreateDate(Timestamp value);

public  void setWirelessNum(int value);

public  void setState(String value);

public  void setRemarks(String value);

public  void setRegionSpecial(int value);

public  void setIsStandard(int value);

public  void setCreditDegree(int value);

public  void setPostPostcode(String value);

public  void setCustId(long value);

public  void setCreateOpId(long value);

public  void setExpenseType(int value);

public  void setEmail(String value);

public  void setProdDesc(String value);

public  void setDoneCode(long value);

public  void setEspVocation(int value);

public  void setVpmnNum(long value);

public  void setMobileNum(int value);

public  void setCommunicationExpense(long value);

public  void setServiceChannel(int value);

public  void setTurnover(long value);

public  void setAAttitude(int value);

public  void setBrname(String value);

public  void setContact(String value);

public  void setOrgId(long value);

public  void setCreateOrgId(long value);

public  void setRegionId(String value);

public  void setPayType(int value);

public  void setCompelereInfo(String value);

public  void setMsisdn(String value);
}
