package com.asiainfo.crm.cm.customer.group.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmxVitalGroupCustomerValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_Zipcode = "ZIPCODE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_TownCode = "TOWN_CODE";
  public final static  String S_Notes = "NOTES";
  public final static  String S_AssetType = "ASSET_TYPE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_SetupMonth = "SETUP_MONTH";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_CountyCode = "COUNTY_CODE";
  public final static  String S_CustName = "CUST_NAME";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_ContPhone1 = "CONT_PHONE1";
  public final static  String S_GroupSource = "GROUP_SOURCE";
  public final static  String S_HoldingType = "HOLDING_TYPE";
  public final static  String S_ContPhone2 = "CONT_PHONE2";
  public final static  String S_VocationCode = "VOCATION_CODE";
  public final static  String S_SetupYear = "SETUP_YEAR";
  public final static  String S_OrganType = "ORGAN_TYPE";
  public final static  String S_EconomicType = "ECONOMIC_TYPE";
  public final static  String S_AddresCode = "ADDRES_CODE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_CityCode = "CITY_CODE";
  public final static  String S_GroupType = "GROUP_TYPE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_AreaCode = "AREA_CODE";
  public final static  String S_StaffAmount = "STAFF_AMOUNT";
  public final static  String S_VgroupId = "VGROUP_ID";
  public final static  String S_BusiIncomeType = "BUSI_INCOME_TYPE";
  public final static  String S_OperateForm = "OPERATE_FORM";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_IndUnitNum = "IND_UNIT_NUM";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_IsImportant = "IS_IMPORTANT";
  public final static  String S_Vocation = "VOCATION";
  public final static  String S_GroupStatus = "GROUP_STATUS";
  public final static  String S_HouseNumber = "HOUSE_NUMBER";


public String getState();

public Timestamp getEffectiveDate();

public String getZipcode();

public Timestamp getDoneDate();

public String getTownCode();

public String getNotes();

public String getAssetType();

public Timestamp getCreateDate();

public String getSetupMonth();

public long getDoneCode();

public String getCountyCode();

public String getCustName();

public String getRegionId();

public long getOpId();

public String getContPhone1();

public int getGroupSource();

public String getHoldingType();

public String getContPhone2();

public String getVocationCode();

public String getSetupYear();

public String getOrganType();

public String getEconomicType();

public String getAddresCode();

public long getCreateOpId();

public String getCityCode();

public String getGroupType();

public long getOrgId();

public String getAreaCode();

public long getStaffAmount();

public String getVgroupId();

public String getBusiIncomeType();

public String getOperateForm();

public Timestamp getExpireDate();

public long getIndUnitNum();

public long getCreateOrgId();

public int getIsImportant();

public String getVocation();

public String getGroupStatus();

public String getHouseNumber();


public  void setState(String value);

public  void setEffectiveDate(Timestamp value);

public  void setZipcode(String value);

public  void setDoneDate(Timestamp value);

public  void setTownCode(String value);

public  void setNotes(String value);

public  void setAssetType(String value);

public  void setCreateDate(Timestamp value);

public  void setSetupMonth(String value);

public  void setDoneCode(long value);

public  void setCountyCode(String value);

public  void setCustName(String value);

public  void setRegionId(String value);

public  void setOpId(long value);

public  void setContPhone1(String value);

public  void setGroupSource(int value);

public  void setHoldingType(String value);

public  void setContPhone2(String value);

public  void setVocationCode(String value);

public  void setSetupYear(String value);

public  void setOrganType(String value);

public  void setEconomicType(String value);

public  void setAddresCode(String value);

public  void setCreateOpId(long value);

public  void setCityCode(String value);

public  void setGroupType(String value);

public  void setOrgId(long value);

public  void setAreaCode(String value);

public  void setStaffAmount(long value);

public  void setVgroupId(String value);

public  void setBusiIncomeType(String value);

public  void setOperateForm(String value);

public  void setExpireDate(Timestamp value);

public  void setIndUnitNum(long value);

public  void setCreateOrgId(long value);

public  void setIsImportant(int value);

public  void setVocation(String value);

public  void setGroupStatus(String value);

public  void setHouseNumber(String value);
}
