package com.asiainfo.crm.cm.customer.group.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmGroupExtraInfoValue extends DataStructInterface{

  public final static  String S_DeptLeaderPhone = "DEPT_LEADER_PHONE";
  public final static  String S_GroupInformTrade = "GROUP_INFORM_TRADE";
  public final static  String S_GroupPayType = "GROUP_PAY_TYPE";
  public final static  String S_GroupRegionType = "GROUP_REGION_TYPE";
  public final static  String S_BusiArea = "BUSI_AREA";
  public final static  String S_JobSpec = "JOB_SPEC";
  public final static  String S_Latitude = "LATITUDE";
  public final static  String S_GroupDate = "GROUP_DATE";
  public final static  String S_GroupOfficeNetwork = "GROUP_OFFICE_NETWORK";
  public final static  String S_GroupSubRegionType = "GROUP_SUB_REGION_TYPE";
  public final static  String S_OrganType = "ORGAN_TYPE";
  public final static  String S_OrganBillboard = "ORGAN_BILLBOARD";
  public final static  String S_InfoFilePath = "INFO_FILE_PATH";
  public final static  String S_OthUseDtl = "OTH_USE_DTL";
  public final static  String S_EcCode = "EC_CODE";
  public final static  String S_MultiProvince = "MULTI_PROVINCE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_ServChnl = "SERV_CHNL";
  public final static  String S_VillageSvrPoint = "VILLAGE_SVR_POINT";
  public final static  String S_ProvGroupType = "PROV_GROUP_TYPE";
  public final static  String S_ProdDevChnl = "PROD_DEV_CHNL";
  public final static  String S_DeptLeaderJob = "DEPT_LEADER_JOB";
  public final static  String S_GroupGlory = "GROUP_GLORY";
  public final static  String S_TradeGroupClustId = "TRADE_GROUP_CLUST_ID";
  public final static  String S_IsSetupAlone = "IS_SETUP_ALONE";
  public final static  String S_TradeGroupClustLevel = "TRADE_GROUP_CLUST_LEVEL";
  public final static  String S_SaleAgency = "SALE_AGENCY";
  public final static  String S_StaffAmount = "STAFF_AMOUNT";
  public final static  String S_InformDeptName = "INFORM_DEPT_NAME";
  public final static  String S_TownBusinessHall = "TOWN_BUSINESS_HALL";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_VpmnCustId = "VPMN_CUST_ID";
  public final static  String S_ServiceGarrison = "SERVICE_GARRISON";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_IsTop100 = "IS_TOP100";
  public final static  String S_ServiceBrand = "SERVICE_BRAND";
  public final static  String S_GroupIntro = "GROUP_INTRO";
  public final static  String S_GroupSignType = "GROUP_SIGN_TYPE";
  public final static  String S_NeedCallGroupData = "NEED_CALL_GROUP_DATA";
  public final static  String S_State = "STATE";
  public final static  String S_ConsultWithCont = "CONSULT_WITH_CONT";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_LocalParentOrgan = "LOCAL_PARENT_ORGAN";
  public final static  String S_GroupCulture = "GROUP_CULTURE";
  public final static  String S_AssetClass = "ASSET_CLASS";
  public final static  String S_UnicomUserNum = "UNICOM_USER_NUM";
  public final static  String S_InforFlag = "INFOR_FLAG";
  public final static  String S_DeptLeader = "DEPT_LEADER";
  public final static  String S_ComBudget = "COM_BUDGET";
  public final static  String S_IsProvGrpManaged = "IS_PROV_GRP_MANAGED";
  public final static  String S_RelGroupCustId = "REL_GROUP_CUST_ID";
  public final static  String S_FieldService = "FIELD_SERVICE";
  public final static  String S_OutdoorStaffRate = "OUTDOOR_STAFF_RATE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_QuestionType = "QUESTION_TYPE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_CreditPayLevel = "CREDIT_PAY_LEVEL";
  public final static  String S_Notes = "NOTES";
  public final static  String S_CreditLevel = "CREDIT_LEVEL";
  public final static  String S_GarrisonPeriod = "GARRISON_PERIOD";
  public final static  String S_TelecomUserNum = "TELECOM_USER_NUM";
  public final static  String S_LocalParentOrganId = "LOCAL_PARENT_ORGAN_ID";
  public final static  String S_CmccUserNum = "CMCC_USER_NUM";
  public final static  String S_EmphasisBrand = "EMPHASIS_BRAND";
  public final static  String S_GroupCustId = "GROUP_CUST_ID";
  public final static  String S_GroupInfo = "GROUP_INFO";
  public final static  String S_InfoFileName = "INFO_FILE_NAME";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_HqName = "HQ_NAME";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_OutdoorStaffNum = "OUTDOOR_STAFF_NUM";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_Agent = "AGENT";
  public final static  String S_Vocation3 = "VOCATION3";
  public final static  String S_ProdStatus = "PROD_STATUS";
  public final static  String S_DefectType = "DEFECT_TYPE";
  public final static  String S_DevChnl = "DEV_CHNL";
  public final static  String S_Vocation1 = "VOCATION1";
  public final static  String S_Vocation2 = "VOCATION2";
  public final static  String S_Longitude = "LONGITUDE";
  public final static  String S_IncomeClass = "INCOME_CLASS";


public String getDeptLeaderPhone();

public String getGroupInformTrade();

public int getGroupPayType();

public int getGroupRegionType();

public String getBusiArea();

public String getJobSpec();

public String getLatitude();

public Timestamp getGroupDate();

public String getGroupOfficeNetwork();

public String getGroupSubRegionType();

public String getOrganType();

public String getOrganBillboard();

public String getInfoFilePath();

public String getOthUseDtl();

public String getEcCode();

public int getMultiProvince();

public Timestamp getExpireDate();

public long getOpId();

public Timestamp getEffectiveDate();

public int getServChnl();

public String getVillageSvrPoint();

public int getProvGroupType();

public int getProdDevChnl();

public String getDeptLeaderJob();

public String getGroupGlory();

public long getTradeGroupClustId();

public int getIsSetupAlone();

public int getTradeGroupClustLevel();

public String getSaleAgency();

public long getStaffAmount();

public String getInformDeptName();

public String getTownBusinessHall();

public Timestamp getDoneDate();

public long getVpmnCustId();

public int getServiceGarrison();

public Timestamp getCreateDate();

public int getIsTop100();

public int getServiceBrand();

public String getGroupIntro();

public int getGroupSignType();

public int getNeedCallGroupData();

public String getState();

public String getConsultWithCont();

public String getRemarks();

public String getLocalParentOrgan();

public String getGroupCulture();

public int getAssetClass();

public int getUnicomUserNum();

public int getInforFlag();

public String getDeptLeader();

public long getComBudget();

public int getIsProvGrpManaged();

public long getRelGroupCustId();

public String getFieldService();

public String getOutdoorStaffRate();

public long getCreateOpId();

public int getQuestionType();

public long getDoneCode();

public int getCreditPayLevel();

public String getNotes();

public int getCreditLevel();

public String getGarrisonPeriod();

public int getTelecomUserNum();

public long getLocalParentOrganId();

public int getCmccUserNum();

public int getEmphasisBrand();

public long getGroupCustId();

public String getGroupInfo();

public String getInfoFileName();

public long getOrgId();

public String getHqName();

public String getRegionId();

public int getOutdoorStaffNum();

public long getCreateOrgId();

public String getAgent();

public int getVocation3();

public int getProdStatus();

public int getDefectType();

public int getDevChnl();

public int getVocation1();

public int getVocation2();

public String getLongitude();

public int getIncomeClass();


public  void setDeptLeaderPhone(String value);

public  void setGroupInformTrade(String value);

public  void setGroupPayType(int value);

public  void setGroupRegionType(int value);

public  void setBusiArea(String value);

public  void setJobSpec(String value);

public  void setLatitude(String value);

public  void setGroupDate(Timestamp value);

public  void setGroupOfficeNetwork(String value);

public  void setGroupSubRegionType(String value);

public  void setOrganType(String value);

public  void setOrganBillboard(String value);

public  void setInfoFilePath(String value);

public  void setOthUseDtl(String value);

public  void setEcCode(String value);

public  void setMultiProvince(int value);

public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setServChnl(int value);

public  void setVillageSvrPoint(String value);

public  void setProvGroupType(int value);

public  void setProdDevChnl(int value);

public  void setDeptLeaderJob(String value);

public  void setGroupGlory(String value);

public  void setTradeGroupClustId(long value);

public  void setIsSetupAlone(int value);

public  void setTradeGroupClustLevel(int value);

public  void setSaleAgency(String value);

public  void setStaffAmount(long value);

public  void setInformDeptName(String value);

public  void setTownBusinessHall(String value);

public  void setDoneDate(Timestamp value);

public  void setVpmnCustId(long value);

public  void setServiceGarrison(int value);

public  void setCreateDate(Timestamp value);

public  void setIsTop100(int value);

public  void setServiceBrand(int value);

public  void setGroupIntro(String value);

public  void setGroupSignType(int value);

public  void setNeedCallGroupData(int value);

public  void setState(String value);

public  void setConsultWithCont(String value);

public  void setRemarks(String value);

public  void setLocalParentOrgan(String value);

public  void setGroupCulture(String value);

public  void setAssetClass(int value);

public  void setUnicomUserNum(int value);

public  void setInforFlag(int value);

public  void setDeptLeader(String value);

public  void setComBudget(long value);

public  void setIsProvGrpManaged(int value);

public  void setRelGroupCustId(long value);

public  void setFieldService(String value);

public  void setOutdoorStaffRate(String value);

public  void setCreateOpId(long value);

public  void setQuestionType(int value);

public  void setDoneCode(long value);

public  void setCreditPayLevel(int value);

public  void setNotes(String value);

public  void setCreditLevel(int value);

public  void setGarrisonPeriod(String value);

public  void setTelecomUserNum(int value);

public  void setLocalParentOrganId(long value);

public  void setCmccUserNum(int value);

public  void setEmphasisBrand(int value);

public  void setGroupCustId(long value);

public  void setGroupInfo(String value);

public  void setInfoFileName(String value);

public  void setOrgId(long value);

public  void setHqName(String value);

public  void setRegionId(String value);

public  void setOutdoorStaffNum(int value);

public  void setCreateOrgId(long value);

public  void setAgent(String value);

public  void setVocation3(int value);

public  void setProdStatus(int value);

public  void setDefectType(int value);

public  void setDevChnl(int value);

public  void setVocation1(int value);

public  void setVocation2(int value);

public  void setLongitude(String value);

public  void setIncomeClass(int value);
}
