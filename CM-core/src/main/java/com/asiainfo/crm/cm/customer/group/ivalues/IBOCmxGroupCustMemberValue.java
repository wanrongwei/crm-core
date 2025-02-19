package com.asiainfo.crm.cm.customer.group.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmxGroupCustMemberValue extends DataStructInterface{

  public final static  String S_Budget = "BUDGET";
  public final static  String S_Profit = "PROFIT";
  public final static  String S_IsWebsite = "IS_WEBSITE";
  public final static  String S_HasPhoto = "HAS_PHOTO";
  public final static  String S_PostProvince = "POST_PROVINCE";
  public final static  String S_SalesContext = "SALES_CONTEXT";
  public final static  String S_GroupCreditLevel = "GROUP_CREDIT_LEVEL";
  public final static  String S_EntFund = "ENT_FUND";
  public final static  String S_ImpVocationInfo = "IMP_VOCATION_INFO";
  public final static  String S_EntScale = "ENT_SCALE";
  public final static  String S_ServChannel = "SERV_CHANNEL";
  public final static  String S_PostCity = "POST_CITY";
  public final static  String S_EffectType = "EFFECT_TYPE";
  public final static  String S_ServBeginTime = "SERV_BEGIN_TIME";
  public final static  String S_CertificateFilePath = "CERTIFICATE_FILE_PATH";
  public final static  String S_CompeterInfo = "COMPETER_INFO";
  public final static  String S_EmpAvgFee = "EMP_AVG_FEE";
  public final static  String S_OthUseDtl = "OTH_USE_DTL";
  public final static  String S_TaxId = "TAX_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_IsNetwork = "IS_NETWORK";
  public final static  String S_SpecWayType = "SPEC_WAY_TYPE";
  public final static  String S_IsVpmn = "IS_VPMN";
  public final static  String S_RankingType = "RANKING_TYPE";
  public final static  String S_UnionNum = "UNION_NUM";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_IsOa = "IS_OA";
  public final static  String S_HeadOffice = "HEAD_OFFICE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_WirelessNum = "WIRELESS_NUM";
  public final static  String S_ServiceLevel = "SERVICE_LEVEL";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_SecVocation = "SEC_VOCATION";
  public final static  String S_HopeDiscount = "HOPE_DISCOUNT";
  public final static  String S_WriteOffNum = "WRITE_OFF_NUM";
  public final static  String S_TaxFlag = "TAX_FLAG";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_ServProtocolPath = "SERV_PROTOCOL_PATH";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_WriteOffAmount = "WRITE_OFF_AMOUNT";
  public final static  String S_Rememeberday = "REMEMEBERDAY";
  public final static  String S_SingOverlay = "SING_OVERLAY";
  public final static  String S_ExpenseType = "EXPENSE_TYPE";
  public final static  String S_IsSwitch = "IS_SWITCH";
  public final static  String S_ProdDesc = "PROD_DESC";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_MobileNum = "MOBILE_NUM";
  public final static  String S_GrpOrgType = "GRP_ORG_TYPE";
  public final static  String S_Turnover = "TURNOVER";
  public final static  String S_IsEmail = "IS_EMAIL";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_FavorBusi = "FAVOR_BUSI";
  public final static  String S_IsErp = "IS_ERP";
  public final static  String S_ServEndTime = "SERV_END_TIME";
  public final static  String S_GrpOrgCode = "GRP_ORG_CODE";
  public final static  String S_UserNum = "USER_NUM";


public long getBudget();

public long getProfit();

public long getIsWebsite();

public long getHasPhoto();

public String getPostProvince();

public String getSalesContext();

public long getGroupCreditLevel();

public long getEntFund();

public long getImpVocationInfo();

public long getEntScale();

public String getServChannel();

public String getPostCity();

public long getEffectType();

public Timestamp getServBeginTime();

public String getCertificateFilePath();

public String getCompeterInfo();

public long getEmpAvgFee();

public String getOthUseDtl();

public String getTaxId();

public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public long getOpId();

public long getIsNetwork();

public String getSpecWayType();

public long getIsVpmn();

public long getRankingType();

public long getUnionNum();

public Timestamp getDoneDate();

public long getIsOa();

public String getHeadOffice();

public Timestamp getCreateDate();

public long getWirelessNum();

public long getServiceLevel();

public String getState();

public String getRemarks();

public long getSecVocation();

public String getHopeDiscount();

public long getWriteOffNum();

public long getTaxFlag();

public long getCustId();

public String getServProtocolPath();

public long getCreateOpId();

public long getWriteOffAmount();

public Timestamp getRememeberday();

public String getSingOverlay();

public long getExpenseType();

public long getIsSwitch();

public String getProdDesc();

public long getDoneCode();

public long getMobileNum();

public String getGrpOrgType();

public long getTurnover();

public long getIsEmail();

public long getOrgId();

public long getCreateOrgId();

public String getRegionId();

public String getFavorBusi();

public long getIsErp();

public Timestamp getServEndTime();

public String getGrpOrgCode();

public long getUserNum();


public  void setBudget(long value);

public  void setProfit(long value);

public  void setIsWebsite(long value);

public  void setHasPhoto(long value);

public  void setPostProvince(String value);

public  void setSalesContext(String value);

public  void setGroupCreditLevel(long value);

public  void setEntFund(long value);

public  void setImpVocationInfo(long value);

public  void setEntScale(long value);

public  void setServChannel(String value);

public  void setPostCity(String value);

public  void setEffectType(long value);

public  void setServBeginTime(Timestamp value);

public  void setCertificateFilePath(String value);

public  void setCompeterInfo(String value);

public  void setEmpAvgFee(long value);

public  void setOthUseDtl(String value);

public  void setTaxId(String value);

public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setOpId(long value);

public  void setIsNetwork(long value);

public  void setSpecWayType(String value);

public  void setIsVpmn(long value);

public  void setRankingType(long value);

public  void setUnionNum(long value);

public  void setDoneDate(Timestamp value);

public  void setIsOa(long value);

public  void setHeadOffice(String value);

public  void setCreateDate(Timestamp value);

public  void setWirelessNum(long value);

public  void setServiceLevel(long value);

public  void setState(String value);

public  void setRemarks(String value);

public  void setSecVocation(long value);

public  void setHopeDiscount(String value);

public  void setWriteOffNum(long value);

public  void setTaxFlag(long value);

public  void setCustId(long value);

public  void setServProtocolPath(String value);

public  void setCreateOpId(long value);

public  void setWriteOffAmount(long value);

public  void setRememeberday(Timestamp value);

public  void setSingOverlay(String value);

public  void setExpenseType(long value);

public  void setIsSwitch(long value);

public  void setProdDesc(String value);

public  void setDoneCode(long value);

public  void setMobileNum(long value);

public  void setGrpOrgType(String value);

public  void setTurnover(long value);

public  void setIsEmail(long value);

public  void setOrgId(long value);

public  void setCreateOrgId(long value);

public  void setRegionId(String value);

public  void setFavorBusi(String value);

public  void setIsErp(long value);

public  void setServEndTime(Timestamp value);

public  void setGrpOrgCode(String value);

public  void setUserNum(long value);
}
