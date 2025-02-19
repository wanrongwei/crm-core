package com.asiainfo.crm.cm.customer.group.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.customer.group.ivalues.*;

public class QBOCmVitalGroupBean extends DataContainer implements DataContainerInterface,IQBOCmVitalGroupValue{

  private static String  m_boName = "com.asiainfo.crm.cm.customer.group.bo.QBOCmVitalGroup";



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
  public final static  String S_VgroupIdRel = "VGROUP_ID_REL";
  public final static  String S_MainGroupCustId = "MAIN_GROUP_CUST_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_AreaCode = "AREA_CODE";
  public final static  String S_StaffAmount = "STAFF_AMOUNT";
  public final static  String S_VgroupId = "VGROUP_ID";
  public final static  String S_BusiIncomeType = "BUSI_INCOME_TYPE";
  public final static  String S_OperateForm = "OPERATE_FORM";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_GroupCustId = "GROUP_CUST_ID";
  public final static  String S_IndUnitNum = "IND_UNIT_NUM";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_IsImportant = "IS_IMPORTANT";
  public final static  String S_DoneCodeRel = "DONE_CODE_REL";
  public final static  String S_Vocation = "VOCATION";
  public final static  String S_GroupStatus = "GROUP_STATUS";
  public final static  String S_HouseNumber = "HOUSE_NUMBER";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public QBOCmVitalGroupBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initState(String value){
     this.initProperty(S_State,value);
  }
  public  void setState(String value){
     this.set(S_State,value);
  }
  public  void setStateNull(){
     this.set(S_State,null);
  }

  public String getState(){
       return DataType.getAsString(this.get(S_State));
  
  }
  public String getStateInitialValue(){
        return DataType.getAsString(this.getOldObj(S_State));
      }

  public void initEffectiveDate(Timestamp value){
     this.initProperty(S_EffectiveDate,value);
  }
  public  void setEffectiveDate(Timestamp value){
     this.set(S_EffectiveDate,value);
  }
  public  void setEffectiveDateNull(){
     this.set(S_EffectiveDate,null);
  }

  public Timestamp getEffectiveDate(){
        return DataType.getAsDateTime(this.get(S_EffectiveDate));
  
  }
  public Timestamp getEffectiveDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_EffectiveDate));
      }

  public void initZipcode(String value){
     this.initProperty(S_Zipcode,value);
  }
  public  void setZipcode(String value){
     this.set(S_Zipcode,value);
  }
  public  void setZipcodeNull(){
     this.set(S_Zipcode,null);
  }

  public String getZipcode(){
       return DataType.getAsString(this.get(S_Zipcode));
  
  }
  public String getZipcodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Zipcode));
      }

  public void initDoneDate(Timestamp value){
     this.initProperty(S_DoneDate,value);
  }
  public  void setDoneDate(Timestamp value){
     this.set(S_DoneDate,value);
  }
  public  void setDoneDateNull(){
     this.set(S_DoneDate,null);
  }

  public Timestamp getDoneDate(){
        return DataType.getAsDateTime(this.get(S_DoneDate));
  
  }
  public Timestamp getDoneDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_DoneDate));
      }

  public void initTownCode(String value){
     this.initProperty(S_TownCode,value);
  }
  public  void setTownCode(String value){
     this.set(S_TownCode,value);
  }
  public  void setTownCodeNull(){
     this.set(S_TownCode,null);
  }

  public String getTownCode(){
       return DataType.getAsString(this.get(S_TownCode));
  
  }
  public String getTownCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_TownCode));
      }

  public void initNotes(String value){
     this.initProperty(S_Notes,value);
  }
  public  void setNotes(String value){
     this.set(S_Notes,value);
  }
  public  void setNotesNull(){
     this.set(S_Notes,null);
  }

  public String getNotes(){
       return DataType.getAsString(this.get(S_Notes));
  
  }
  public String getNotesInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Notes));
      }

  public void initAssetType(String value){
     this.initProperty(S_AssetType,value);
  }
  public  void setAssetType(String value){
     this.set(S_AssetType,value);
  }
  public  void setAssetTypeNull(){
     this.set(S_AssetType,null);
  }

  public String getAssetType(){
       return DataType.getAsString(this.get(S_AssetType));
  
  }
  public String getAssetTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AssetType));
      }

  public void initCreateDate(Timestamp value){
     this.initProperty(S_CreateDate,value);
  }
  public  void setCreateDate(Timestamp value){
     this.set(S_CreateDate,value);
  }
  public  void setCreateDateNull(){
     this.set(S_CreateDate,null);
  }

  public Timestamp getCreateDate(){
        return DataType.getAsDateTime(this.get(S_CreateDate));
  
  }
  public Timestamp getCreateDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_CreateDate));
      }

  public void initSetupMonth(String value){
     this.initProperty(S_SetupMonth,value);
  }
  public  void setSetupMonth(String value){
     this.set(S_SetupMonth,value);
  }
  public  void setSetupMonthNull(){
     this.set(S_SetupMonth,null);
  }

  public String getSetupMonth(){
       return DataType.getAsString(this.get(S_SetupMonth));
  
  }
  public String getSetupMonthInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SetupMonth));
      }

  public void initDoneCode(long value){
     this.initProperty(S_DoneCode,new Long(value));
  }
  public  void setDoneCode(long value){
     this.set(S_DoneCode,new Long(value));
  }
  public  void setDoneCodeNull(){
     this.set(S_DoneCode,null);
  }

  public long getDoneCode(){
        return DataType.getAsLong(this.get(S_DoneCode));
  
  }
  public long getDoneCodeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_DoneCode));
      }

  public void initCountyCode(String value){
     this.initProperty(S_CountyCode,value);
  }
  public  void setCountyCode(String value){
     this.set(S_CountyCode,value);
  }
  public  void setCountyCodeNull(){
     this.set(S_CountyCode,null);
  }

  public String getCountyCode(){
       return DataType.getAsString(this.get(S_CountyCode));
  
  }
  public String getCountyCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CountyCode));
      }

  public void initCustName(String value){
     this.initProperty(S_CustName,value);
  }
  public  void setCustName(String value){
     this.set(S_CustName,value);
  }
  public  void setCustNameNull(){
     this.set(S_CustName,null);
  }

  public String getCustName(){
       return DataType.getAsString(this.get(S_CustName));
  
  }
  public String getCustNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CustName));
      }

  public void initRegionId(String value){
     this.initProperty(S_RegionId,value);
  }
  public  void setRegionId(String value){
     this.set(S_RegionId,value);
  }
  public  void setRegionIdNull(){
     this.set(S_RegionId,null);
  }

  public String getRegionId(){
       return DataType.getAsString(this.get(S_RegionId));
  
  }
  public String getRegionIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_RegionId));
      }

  public void initOpId(long value){
     this.initProperty(S_OpId,new Long(value));
  }
  public  void setOpId(long value){
     this.set(S_OpId,new Long(value));
  }
  public  void setOpIdNull(){
     this.set(S_OpId,null);
  }

  public long getOpId(){
        return DataType.getAsLong(this.get(S_OpId));
  
  }
  public long getOpIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_OpId));
      }

  public void initContPhone1(String value){
     this.initProperty(S_ContPhone1,value);
  }
  public  void setContPhone1(String value){
     this.set(S_ContPhone1,value);
  }
  public  void setContPhone1Null(){
     this.set(S_ContPhone1,null);
  }

  public String getContPhone1(){
       return DataType.getAsString(this.get(S_ContPhone1));
  
  }
  public String getContPhone1InitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContPhone1));
      }

  public void initGroupSource(long value){
     this.initProperty(S_GroupSource,new Long(value));
  }
  public  void setGroupSource(long value){
     this.set(S_GroupSource,new Long(value));
  }
  public  void setGroupSourceNull(){
     this.set(S_GroupSource,null);
  }

  public long getGroupSource(){
        return DataType.getAsLong(this.get(S_GroupSource));
  
  }
  public long getGroupSourceInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_GroupSource));
      }

  public void initHoldingType(String value){
     this.initProperty(S_HoldingType,value);
  }
  public  void setHoldingType(String value){
     this.set(S_HoldingType,value);
  }
  public  void setHoldingTypeNull(){
     this.set(S_HoldingType,null);
  }

  public String getHoldingType(){
       return DataType.getAsString(this.get(S_HoldingType));
  
  }
  public String getHoldingTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_HoldingType));
      }

  public void initContPhone2(String value){
     this.initProperty(S_ContPhone2,value);
  }
  public  void setContPhone2(String value){
     this.set(S_ContPhone2,value);
  }
  public  void setContPhone2Null(){
     this.set(S_ContPhone2,null);
  }

  public String getContPhone2(){
       return DataType.getAsString(this.get(S_ContPhone2));
  
  }
  public String getContPhone2InitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContPhone2));
      }

  public void initVocationCode(String value){
     this.initProperty(S_VocationCode,value);
  }
  public  void setVocationCode(String value){
     this.set(S_VocationCode,value);
  }
  public  void setVocationCodeNull(){
     this.set(S_VocationCode,null);
  }

  public String getVocationCode(){
       return DataType.getAsString(this.get(S_VocationCode));
  
  }
  public String getVocationCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_VocationCode));
      }

  public void initSetupYear(String value){
     this.initProperty(S_SetupYear,value);
  }
  public  void setSetupYear(String value){
     this.set(S_SetupYear,value);
  }
  public  void setSetupYearNull(){
     this.set(S_SetupYear,null);
  }

  public String getSetupYear(){
       return DataType.getAsString(this.get(S_SetupYear));
  
  }
  public String getSetupYearInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SetupYear));
      }

  public void initOrganType(String value){
     this.initProperty(S_OrganType,value);
  }
  public  void setOrganType(String value){
     this.set(S_OrganType,value);
  }
  public  void setOrganTypeNull(){
     this.set(S_OrganType,null);
  }

  public String getOrganType(){
       return DataType.getAsString(this.get(S_OrganType));
  
  }
  public String getOrganTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OrganType));
      }

  public void initEconomicType(String value){
     this.initProperty(S_EconomicType,value);
  }
  public  void setEconomicType(String value){
     this.set(S_EconomicType,value);
  }
  public  void setEconomicTypeNull(){
     this.set(S_EconomicType,null);
  }

  public String getEconomicType(){
       return DataType.getAsString(this.get(S_EconomicType));
  
  }
  public String getEconomicTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_EconomicType));
      }

  public void initAddresCode(String value){
     this.initProperty(S_AddresCode,value);
  }
  public  void setAddresCode(String value){
     this.set(S_AddresCode,value);
  }
  public  void setAddresCodeNull(){
     this.set(S_AddresCode,null);
  }

  public String getAddresCode(){
       return DataType.getAsString(this.get(S_AddresCode));
  
  }
  public String getAddresCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AddresCode));
      }

  public void initCreateOpId(long value){
     this.initProperty(S_CreateOpId,new Long(value));
  }
  public  void setCreateOpId(long value){
     this.set(S_CreateOpId,new Long(value));
  }
  public  void setCreateOpIdNull(){
     this.set(S_CreateOpId,null);
  }

  public long getCreateOpId(){
        return DataType.getAsLong(this.get(S_CreateOpId));
  
  }
  public long getCreateOpIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CreateOpId));
      }

  public void initCityCode(String value){
     this.initProperty(S_CityCode,value);
  }
  public  void setCityCode(String value){
     this.set(S_CityCode,value);
  }
  public  void setCityCodeNull(){
     this.set(S_CityCode,null);
  }

  public String getCityCode(){
       return DataType.getAsString(this.get(S_CityCode));
  
  }
  public String getCityCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CityCode));
      }

  public void initGroupType(String value){
     this.initProperty(S_GroupType,value);
  }
  public  void setGroupType(String value){
     this.set(S_GroupType,value);
  }
  public  void setGroupTypeNull(){
     this.set(S_GroupType,null);
  }

  public String getGroupType(){
       return DataType.getAsString(this.get(S_GroupType));
  
  }
  public String getGroupTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_GroupType));
      }

  public void initVgroupIdRel(String value){
     this.initProperty(S_VgroupIdRel,value);
  }
  public  void setVgroupIdRel(String value){
     this.set(S_VgroupIdRel,value);
  }
  public  void setVgroupIdRelNull(){
     this.set(S_VgroupIdRel,null);
  }

  public String getVgroupIdRel(){
       return DataType.getAsString(this.get(S_VgroupIdRel));
  
  }
  public String getVgroupIdRelInitialValue(){
        return DataType.getAsString(this.getOldObj(S_VgroupIdRel));
      }

  public void initMainGroupCustId(long value){
     this.initProperty(S_MainGroupCustId,new Long(value));
  }
  public  void setMainGroupCustId(long value){
     this.set(S_MainGroupCustId,new Long(value));
  }
  public  void setMainGroupCustIdNull(){
     this.set(S_MainGroupCustId,null);
  }

  public long getMainGroupCustId(){
        return DataType.getAsLong(this.get(S_MainGroupCustId));
  
  }
  public long getMainGroupCustIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_MainGroupCustId));
      }

  public void initOrgId(long value){
     this.initProperty(S_OrgId,new Long(value));
  }
  public  void setOrgId(long value){
     this.set(S_OrgId,new Long(value));
  }
  public  void setOrgIdNull(){
     this.set(S_OrgId,null);
  }

  public long getOrgId(){
        return DataType.getAsLong(this.get(S_OrgId));
  
  }
  public long getOrgIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_OrgId));
      }

  public void initAreaCode(String value){
     this.initProperty(S_AreaCode,value);
  }
  public  void setAreaCode(String value){
     this.set(S_AreaCode,value);
  }
  public  void setAreaCodeNull(){
     this.set(S_AreaCode,null);
  }

  public String getAreaCode(){
       return DataType.getAsString(this.get(S_AreaCode));
  
  }
  public String getAreaCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AreaCode));
      }

  public void initStaffAmount(long value){
     this.initProperty(S_StaffAmount,new Long(value));
  }
  public  void setStaffAmount(long value){
     this.set(S_StaffAmount,new Long(value));
  }
  public  void setStaffAmountNull(){
     this.set(S_StaffAmount,null);
  }

  public long getStaffAmount(){
        return DataType.getAsLong(this.get(S_StaffAmount));
  
  }
  public long getStaffAmountInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_StaffAmount));
      }

  public void initVgroupId(String value){
     this.initProperty(S_VgroupId,value);
  }
  public  void setVgroupId(String value){
     this.set(S_VgroupId,value);
  }
  public  void setVgroupIdNull(){
     this.set(S_VgroupId,null);
  }

  public String getVgroupId(){
       return DataType.getAsString(this.get(S_VgroupId));
  
  }
  public String getVgroupIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_VgroupId));
      }

  public void initBusiIncomeType(String value){
     this.initProperty(S_BusiIncomeType,value);
  }
  public  void setBusiIncomeType(String value){
     this.set(S_BusiIncomeType,value);
  }
  public  void setBusiIncomeTypeNull(){
     this.set(S_BusiIncomeType,null);
  }

  public String getBusiIncomeType(){
       return DataType.getAsString(this.get(S_BusiIncomeType));
  
  }
  public String getBusiIncomeTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BusiIncomeType));
      }

  public void initOperateForm(String value){
     this.initProperty(S_OperateForm,value);
  }
  public  void setOperateForm(String value){
     this.set(S_OperateForm,value);
  }
  public  void setOperateFormNull(){
     this.set(S_OperateForm,null);
  }

  public String getOperateForm(){
       return DataType.getAsString(this.get(S_OperateForm));
  
  }
  public String getOperateFormInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OperateForm));
      }

  public void initExpireDate(Timestamp value){
     this.initProperty(S_ExpireDate,value);
  }
  public  void setExpireDate(Timestamp value){
     this.set(S_ExpireDate,value);
  }
  public  void setExpireDateNull(){
     this.set(S_ExpireDate,null);
  }

  public Timestamp getExpireDate(){
        return DataType.getAsDateTime(this.get(S_ExpireDate));
  
  }
  public Timestamp getExpireDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_ExpireDate));
      }

  public void initGroupCustId(long value){
     this.initProperty(S_GroupCustId,new Long(value));
  }
  public  void setGroupCustId(long value){
     this.set(S_GroupCustId,new Long(value));
  }
  public  void setGroupCustIdNull(){
     this.set(S_GroupCustId,null);
  }

  public long getGroupCustId(){
        return DataType.getAsLong(this.get(S_GroupCustId));
  
  }
  public long getGroupCustIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_GroupCustId));
      }

  public void initIndUnitNum(long value){
     this.initProperty(S_IndUnitNum,new Long(value));
  }
  public  void setIndUnitNum(long value){
     this.set(S_IndUnitNum,new Long(value));
  }
  public  void setIndUnitNumNull(){
     this.set(S_IndUnitNum,null);
  }

  public long getIndUnitNum(){
        return DataType.getAsLong(this.get(S_IndUnitNum));
  
  }
  public long getIndUnitNumInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_IndUnitNum));
      }

  public void initCreateOrgId(long value){
     this.initProperty(S_CreateOrgId,new Long(value));
  }
  public  void setCreateOrgId(long value){
     this.set(S_CreateOrgId,new Long(value));
  }
  public  void setCreateOrgIdNull(){
     this.set(S_CreateOrgId,null);
  }

  public long getCreateOrgId(){
        return DataType.getAsLong(this.get(S_CreateOrgId));
  
  }
  public long getCreateOrgIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CreateOrgId));
      }

  public void initIsImportant(long value){
     this.initProperty(S_IsImportant,new Long(value));
  }
  public  void setIsImportant(long value){
     this.set(S_IsImportant,new Long(value));
  }
  public  void setIsImportantNull(){
     this.set(S_IsImportant,null);
  }

  public long getIsImportant(){
        return DataType.getAsLong(this.get(S_IsImportant));
  
  }
  public long getIsImportantInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_IsImportant));
      }

  public void initDoneCodeRel(long value){
     this.initProperty(S_DoneCodeRel,new Long(value));
  }
  public  void setDoneCodeRel(long value){
     this.set(S_DoneCodeRel,new Long(value));
  }
  public  void setDoneCodeRelNull(){
     this.set(S_DoneCodeRel,null);
  }

  public long getDoneCodeRel(){
        return DataType.getAsLong(this.get(S_DoneCodeRel));
  
  }
  public long getDoneCodeRelInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_DoneCodeRel));
      }

  public void initVocation(String value){
     this.initProperty(S_Vocation,value);
  }
  public  void setVocation(String value){
     this.set(S_Vocation,value);
  }
  public  void setVocationNull(){
     this.set(S_Vocation,null);
  }

  public String getVocation(){
       return DataType.getAsString(this.get(S_Vocation));
  
  }
  public String getVocationInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Vocation));
      }

  public void initGroupStatus(String value){
     this.initProperty(S_GroupStatus,value);
  }
  public  void setGroupStatus(String value){
     this.set(S_GroupStatus,value);
  }
  public  void setGroupStatusNull(){
     this.set(S_GroupStatus,null);
  }

  public String getGroupStatus(){
       return DataType.getAsString(this.get(S_GroupStatus));
  
  }
  public String getGroupStatusInitialValue(){
        return DataType.getAsString(this.getOldObj(S_GroupStatus));
      }

  public void initHouseNumber(String value){
     this.initProperty(S_HouseNumber,value);
  }
  public  void setHouseNumber(String value){
     this.set(S_HouseNumber,value);
  }
  public  void setHouseNumberNull(){
     this.set(S_HouseNumber,null);
  }

  public String getHouseNumber(){
       return DataType.getAsString(this.get(S_HouseNumber));
  
  }
  public String getHouseNumberInitialValue(){
        return DataType.getAsString(this.getOldObj(S_HouseNumber));
      }


 
 }

