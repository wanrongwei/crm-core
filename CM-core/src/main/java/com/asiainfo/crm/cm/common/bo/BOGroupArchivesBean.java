package com.asiainfo.crm.cm.common.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.common.ivalues.*;

public class BOGroupArchivesBean extends DataContainer implements DataContainerInterface,IBOGroupArchivesValue{

  private static String  m_boName = "com.asiainfo.crm.cm.common.bo.BOGroupArchives";



  public final static  String S_ControlType = "CONTROL_TYPE";
  public final static  String S_CustLevel = "CUST_LEVEL";
  public final static  String S_GroupStatusExt = "GROUP_STATUS_EXT";
  public final static  String S_UnitNum = "UNIT_NUM";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_YearTurnover = "YEAR_TURNOVER";
  public final static  String S_CityName = "CITY_NAME";
  public final static  String S_ParentGroupSeq = "PARENT_GROUP_SEQ";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_GroupRel = "GROUP_REL";
  public final static  String S_CountyCode = "COUNTY_CODE";
  public final static  String S_AreaNum = "AREA_NUM";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_GroupName = "GROUP_NAME";
  public final static  String S_DevelopStatus = "DEVELOP_STATUS";
  public final static  String S_OrgType = "ORG_TYPE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_GroupSeq = "GROUP_SEQ";
  public final static  String S_DealOpId = "DEAL_OP_ID";
  public final static  String S_RegionCode = "REGION_CODE";
  public final static  String S_Practice1 = "PRACTICE1";
  public final static  String S_Asset = "ASSET";
  public final static  String S_UpGroupId = "UP_GROUP_ID";
  public final static  String S_WorkType = "WORK_TYPE";
  public final static  String S_DoorplateCode = "DOORPLATE_CODE";
  public final static  String S_OperType = "OPER_TYPE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_GeographyLevel = "GEOGRAPHY_LEVEL";
  public final static  String S_GroupProvince = "GROUP_PROVINCE";
  public final static  String S_DoorplateName = "DOORPLATE_NAME";
  public final static  String S_GroupStatus = "GROUP_STATUS";
  public final static  String S_Practice2 = "PRACTICE2";
  public final static  String S_UpEmployeeNum = "UP_EMPLOYEE_NUM";
  public final static  String S_RegionName = "REGION_NAME";
  public final static  String S_MiddleTradeType = "MIDDLE_TRADE_TYPE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_SourceType = "SOURCE_TYPE";
  public final static  String S_UpGroupStatus = "UP_GROUP_STATUS";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_OtherLinkPhone = "OTHER_LINK_PHONE";
  public final static  String S_TradeType = "TRADE_TYPE";
  public final static  String S_BigTradeType = "BIG_TRADE_TYPE";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_StatisticsEmployeeNum = "STATISTICS_EMPLOYEE_NUM";
  public final static  String S_LinkPhone = "LINK_PHONE";
  public final static  String S_PostCode = "POST_CODE";
  public final static  String S_EconomyType = "ECONOMY_TYPE";
  public final static  String S_GroupId = "GROUP_ID";
  public final static  String S_GroupType = "GROUP_TYPE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_EmployeeNum = "EMPLOYEE_NUM";
  public final static  String S_WorkStatus = "WORK_STATUS";
  public final static  String S_GroupAddress = "GROUP_ADDRESS";
  public final static  String S_CompareStatus = "COMPARE_STATUS";
  public final static  String S_RegionDetail = "REGION_DETAIL";
  public final static  String S_BuildStatus = "BUILD_STATUS";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_AddressCode = "ADDRESS_CODE";
  public final static  String S_DataSource = "DATA_SOURCE";
  public final static  String S_RegionDetailName = "REGION_DETAIL_NAME";
  public final static  String S_SmallTradeType = "SMALL_TRADE_TYPE";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOGroupArchivesBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initControlType(int value){
     this.initProperty(S_ControlType,new Integer(value));
  }
  public  void setControlType(int value){
     this.set(S_ControlType,new Integer(value));
  }
  public  void setControlTypeNull(){
     this.set(S_ControlType,null);
  }

  public int getControlType(){
        return DataType.getAsInt(this.get(S_ControlType));
  
  }
  public int getControlTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ControlType));
      }

  public void initCustLevel(int value){
     this.initProperty(S_CustLevel,new Integer(value));
  }
  public  void setCustLevel(int value){
     this.set(S_CustLevel,new Integer(value));
  }
  public  void setCustLevelNull(){
     this.set(S_CustLevel,null);
  }

  public int getCustLevel(){
        return DataType.getAsInt(this.get(S_CustLevel));
  
  }
  public int getCustLevelInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CustLevel));
      }

  public void initGroupStatusExt(int value){
     this.initProperty(S_GroupStatusExt,new Integer(value));
  }
  public  void setGroupStatusExt(int value){
     this.set(S_GroupStatusExt,new Integer(value));
  }
  public  void setGroupStatusExtNull(){
     this.set(S_GroupStatusExt,null);
  }

  public int getGroupStatusExt(){
        return DataType.getAsInt(this.get(S_GroupStatusExt));
  
  }
  public int getGroupStatusExtInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_GroupStatusExt));
      }

  public void initUnitNum(long value){
     this.initProperty(S_UnitNum,new Long(value));
  }
  public  void setUnitNum(long value){
     this.set(S_UnitNum,new Long(value));
  }
  public  void setUnitNumNull(){
     this.set(S_UnitNum,null);
  }

  public long getUnitNum(){
        return DataType.getAsLong(this.get(S_UnitNum));
  
  }
  public long getUnitNumInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_UnitNum));
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

  public void initYearTurnover(String value){
     this.initProperty(S_YearTurnover,value);
  }
  public  void setYearTurnover(String value){
     this.set(S_YearTurnover,value);
  }
  public  void setYearTurnoverNull(){
     this.set(S_YearTurnover,null);
  }

  public String getYearTurnover(){
       return DataType.getAsString(this.get(S_YearTurnover));
  
  }
  public String getYearTurnoverInitialValue(){
        return DataType.getAsString(this.getOldObj(S_YearTurnover));
      }

  public void initCityName(String value){
     this.initProperty(S_CityName,value);
  }
  public  void setCityName(String value){
     this.set(S_CityName,value);
  }
  public  void setCityNameNull(){
     this.set(S_CityName,null);
  }

  public String getCityName(){
       return DataType.getAsString(this.get(S_CityName));
  
  }
  public String getCityNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CityName));
      }

  public void initParentGroupSeq(String value){
     this.initProperty(S_ParentGroupSeq,value);
  }
  public  void setParentGroupSeq(String value){
     this.set(S_ParentGroupSeq,value);
  }
  public  void setParentGroupSeqNull(){
     this.set(S_ParentGroupSeq,null);
  }

  public String getParentGroupSeq(){
       return DataType.getAsString(this.get(S_ParentGroupSeq));
  
  }
  public String getParentGroupSeqInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ParentGroupSeq));
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

  public void initGroupRel(String value){
     this.initProperty(S_GroupRel,value);
  }
  public  void setGroupRel(String value){
     this.set(S_GroupRel,value);
  }
  public  void setGroupRelNull(){
     this.set(S_GroupRel,null);
  }

  public String getGroupRel(){
       return DataType.getAsString(this.get(S_GroupRel));
  
  }
  public String getGroupRelInitialValue(){
        return DataType.getAsString(this.getOldObj(S_GroupRel));
      }

  public void initCountyCode(long value){
     this.initProperty(S_CountyCode,new Long(value));
  }
  public  void setCountyCode(long value){
     this.set(S_CountyCode,new Long(value));
  }
  public  void setCountyCodeNull(){
     this.set(S_CountyCode,null);
  }

  public long getCountyCode(){
        return DataType.getAsLong(this.get(S_CountyCode));
  
  }
  public long getCountyCodeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CountyCode));
      }

  public void initAreaNum(String value){
     this.initProperty(S_AreaNum,value);
  }
  public  void setAreaNum(String value){
     this.set(S_AreaNum,value);
  }
  public  void setAreaNumNull(){
     this.set(S_AreaNum,null);
  }

  public String getAreaNum(){
       return DataType.getAsString(this.get(S_AreaNum));
  
  }
  public String getAreaNumInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AreaNum));
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

  public void initGroupName(String value){
     this.initProperty(S_GroupName,value);
  }
  public  void setGroupName(String value){
     this.set(S_GroupName,value);
  }
  public  void setGroupNameNull(){
     this.set(S_GroupName,null);
  }

  public String getGroupName(){
       return DataType.getAsString(this.get(S_GroupName));
  
  }
  public String getGroupNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_GroupName));
      }

  public void initDevelopStatus(int value){
     this.initProperty(S_DevelopStatus,new Integer(value));
  }
  public  void setDevelopStatus(int value){
     this.set(S_DevelopStatus,new Integer(value));
  }
  public  void setDevelopStatusNull(){
     this.set(S_DevelopStatus,null);
  }

  public int getDevelopStatus(){
        return DataType.getAsInt(this.get(S_DevelopStatus));
  
  }
  public int getDevelopStatusInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_DevelopStatus));
      }

  public void initOrgType(int value){
     this.initProperty(S_OrgType,new Integer(value));
  }
  public  void setOrgType(int value){
     this.set(S_OrgType,new Integer(value));
  }
  public  void setOrgTypeNull(){
     this.set(S_OrgType,null);
  }

  public int getOrgType(){
        return DataType.getAsInt(this.get(S_OrgType));
  
  }
  public int getOrgTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_OrgType));
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

  public void initGroupSeq(String value){
     this.initProperty(S_GroupSeq,value);
  }
  public  void setGroupSeq(String value){
     this.set(S_GroupSeq,value);
  }
  public  void setGroupSeqNull(){
     this.set(S_GroupSeq,null);
  }

  public String getGroupSeq(){
       return DataType.getAsString(this.get(S_GroupSeq));
  
  }
  public String getGroupSeqInitialValue(){
        return DataType.getAsString(this.getOldObj(S_GroupSeq));
      }

  public void initDealOpId(long value){
     this.initProperty(S_DealOpId,new Long(value));
  }
  public  void setDealOpId(long value){
     this.set(S_DealOpId,new Long(value));
  }
  public  void setDealOpIdNull(){
     this.set(S_DealOpId,null);
  }

  public long getDealOpId(){
        return DataType.getAsLong(this.get(S_DealOpId));
  
  }
  public long getDealOpIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_DealOpId));
      }

  public void initRegionCode(long value){
     this.initProperty(S_RegionCode,new Long(value));
  }
  public  void setRegionCode(long value){
     this.set(S_RegionCode,new Long(value));
  }
  public  void setRegionCodeNull(){
     this.set(S_RegionCode,null);
  }

  public long getRegionCode(){
        return DataType.getAsLong(this.get(S_RegionCode));
  
  }
  public long getRegionCodeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_RegionCode));
      }

  public void initPractice1(String value){
     this.initProperty(S_Practice1,value);
  }
  public  void setPractice1(String value){
     this.set(S_Practice1,value);
  }
  public  void setPractice1Null(){
     this.set(S_Practice1,null);
  }

  public String getPractice1(){
       return DataType.getAsString(this.get(S_Practice1));
  
  }
  public String getPractice1InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Practice1));
      }

  public void initAsset(String value){
     this.initProperty(S_Asset,value);
  }
  public  void setAsset(String value){
     this.set(S_Asset,value);
  }
  public  void setAssetNull(){
     this.set(S_Asset,null);
  }

  public String getAsset(){
       return DataType.getAsString(this.get(S_Asset));
  
  }
  public String getAssetInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Asset));
      }

  public void initUpGroupId(long value){
     this.initProperty(S_UpGroupId,new Long(value));
  }
  public  void setUpGroupId(long value){
     this.set(S_UpGroupId,new Long(value));
  }
  public  void setUpGroupIdNull(){
     this.set(S_UpGroupId,null);
  }

  public long getUpGroupId(){
        return DataType.getAsLong(this.get(S_UpGroupId));
  
  }
  public long getUpGroupIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_UpGroupId));
      }

  public void initWorkType(int value){
     this.initProperty(S_WorkType,new Integer(value));
  }
  public  void setWorkType(int value){
     this.set(S_WorkType,new Integer(value));
  }
  public  void setWorkTypeNull(){
     this.set(S_WorkType,null);
  }

  public int getWorkType(){
        return DataType.getAsInt(this.get(S_WorkType));
  
  }
  public int getWorkTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_WorkType));
      }

  public void initDoorplateCode(String value){
     this.initProperty(S_DoorplateCode,value);
  }
  public  void setDoorplateCode(String value){
     this.set(S_DoorplateCode,value);
  }
  public  void setDoorplateCodeNull(){
     this.set(S_DoorplateCode,null);
  }

  public String getDoorplateCode(){
       return DataType.getAsString(this.get(S_DoorplateCode));
  
  }
  public String getDoorplateCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DoorplateCode));
      }

  public void initOperType(int value){
     this.initProperty(S_OperType,new Integer(value));
  }
  public  void setOperType(int value){
     this.set(S_OperType,new Integer(value));
  }
  public  void setOperTypeNull(){
     this.set(S_OperType,null);
  }

  public int getOperType(){
        return DataType.getAsInt(this.get(S_OperType));
  
  }
  public int getOperTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_OperType));
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

  public void initGeographyLevel(int value){
     this.initProperty(S_GeographyLevel,new Integer(value));
  }
  public  void setGeographyLevel(int value){
     this.set(S_GeographyLevel,new Integer(value));
  }
  public  void setGeographyLevelNull(){
     this.set(S_GeographyLevel,null);
  }

  public int getGeographyLevel(){
        return DataType.getAsInt(this.get(S_GeographyLevel));
  
  }
  public int getGeographyLevelInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_GeographyLevel));
      }

  public void initGroupProvince(long value){
     this.initProperty(S_GroupProvince,new Long(value));
  }
  public  void setGroupProvince(long value){
     this.set(S_GroupProvince,new Long(value));
  }
  public  void setGroupProvinceNull(){
     this.set(S_GroupProvince,null);
  }

  public long getGroupProvince(){
        return DataType.getAsLong(this.get(S_GroupProvince));
  
  }
  public long getGroupProvinceInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_GroupProvince));
      }

  public void initDoorplateName(String value){
     this.initProperty(S_DoorplateName,value);
  }
  public  void setDoorplateName(String value){
     this.set(S_DoorplateName,value);
  }
  public  void setDoorplateNameNull(){
     this.set(S_DoorplateName,null);
  }

  public String getDoorplateName(){
       return DataType.getAsString(this.get(S_DoorplateName));
  
  }
  public String getDoorplateNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DoorplateName));
      }

  public void initGroupStatus(int value){
     this.initProperty(S_GroupStatus,new Integer(value));
  }
  public  void setGroupStatus(int value){
     this.set(S_GroupStatus,new Integer(value));
  }
  public  void setGroupStatusNull(){
     this.set(S_GroupStatus,null);
  }

  public int getGroupStatus(){
        return DataType.getAsInt(this.get(S_GroupStatus));
  
  }
  public int getGroupStatusInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_GroupStatus));
      }

  public void initPractice2(String value){
     this.initProperty(S_Practice2,value);
  }
  public  void setPractice2(String value){
     this.set(S_Practice2,value);
  }
  public  void setPractice2Null(){
     this.set(S_Practice2,null);
  }

  public String getPractice2(){
       return DataType.getAsString(this.get(S_Practice2));
  
  }
  public String getPractice2InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Practice2));
      }

  public void initUpEmployeeNum(long value){
     this.initProperty(S_UpEmployeeNum,new Long(value));
  }
  public  void setUpEmployeeNum(long value){
     this.set(S_UpEmployeeNum,new Long(value));
  }
  public  void setUpEmployeeNumNull(){
     this.set(S_UpEmployeeNum,null);
  }

  public long getUpEmployeeNum(){
        return DataType.getAsLong(this.get(S_UpEmployeeNum));
  
  }
  public long getUpEmployeeNumInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_UpEmployeeNum));
      }

  public void initRegionName(String value){
     this.initProperty(S_RegionName,value);
  }
  public  void setRegionName(String value){
     this.set(S_RegionName,value);
  }
  public  void setRegionNameNull(){
     this.set(S_RegionName,null);
  }

  public String getRegionName(){
       return DataType.getAsString(this.get(S_RegionName));
  
  }
  public String getRegionNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_RegionName));
      }

  public void initMiddleTradeType(String value){
     this.initProperty(S_MiddleTradeType,value);
  }
  public  void setMiddleTradeType(String value){
     this.set(S_MiddleTradeType,value);
  }
  public  void setMiddleTradeTypeNull(){
     this.set(S_MiddleTradeType,null);
  }

  public String getMiddleTradeType(){
       return DataType.getAsString(this.get(S_MiddleTradeType));
  
  }
  public String getMiddleTradeTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_MiddleTradeType));
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

  public void initSourceType(int value){
     this.initProperty(S_SourceType,new Integer(value));
  }
  public  void setSourceType(int value){
     this.set(S_SourceType,new Integer(value));
  }
  public  void setSourceTypeNull(){
     this.set(S_SourceType,null);
  }

  public int getSourceType(){
        return DataType.getAsInt(this.get(S_SourceType));
  
  }
  public int getSourceTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_SourceType));
      }

  public void initUpGroupStatus(int value){
     this.initProperty(S_UpGroupStatus,new Integer(value));
  }
  public  void setUpGroupStatus(int value){
     this.set(S_UpGroupStatus,new Integer(value));
  }
  public  void setUpGroupStatusNull(){
     this.set(S_UpGroupStatus,null);
  }

  public int getUpGroupStatus(){
        return DataType.getAsInt(this.get(S_UpGroupStatus));
  
  }
  public int getUpGroupStatusInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_UpGroupStatus));
      }

  public void initRemarks(String value){
     this.initProperty(S_Remarks,value);
  }
  public  void setRemarks(String value){
     this.set(S_Remarks,value);
  }
  public  void setRemarksNull(){
     this.set(S_Remarks,null);
  }

  public String getRemarks(){
       return DataType.getAsString(this.get(S_Remarks));
  
  }
  public String getRemarksInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Remarks));
      }

  public void initOtherLinkPhone(String value){
     this.initProperty(S_OtherLinkPhone,value);
  }
  public  void setOtherLinkPhone(String value){
     this.set(S_OtherLinkPhone,value);
  }
  public  void setOtherLinkPhoneNull(){
     this.set(S_OtherLinkPhone,null);
  }

  public String getOtherLinkPhone(){
       return DataType.getAsString(this.get(S_OtherLinkPhone));
  
  }
  public String getOtherLinkPhoneInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OtherLinkPhone));
      }

  public void initTradeType(String value){
     this.initProperty(S_TradeType,value);
  }
  public  void setTradeType(String value){
     this.set(S_TradeType,value);
  }
  public  void setTradeTypeNull(){
     this.set(S_TradeType,null);
  }

  public String getTradeType(){
       return DataType.getAsString(this.get(S_TradeType));
  
  }
  public String getTradeTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_TradeType));
      }

  public void initBigTradeType(String value){
     this.initProperty(S_BigTradeType,value);
  }
  public  void setBigTradeType(String value){
     this.set(S_BigTradeType,value);
  }
  public  void setBigTradeTypeNull(){
     this.set(S_BigTradeType,null);
  }

  public String getBigTradeType(){
       return DataType.getAsString(this.get(S_BigTradeType));
  
  }
  public String getBigTradeTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BigTradeType));
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

  public void initStatisticsEmployeeNum(long value){
     this.initProperty(S_StatisticsEmployeeNum,new Long(value));
  }
  public  void setStatisticsEmployeeNum(long value){
     this.set(S_StatisticsEmployeeNum,new Long(value));
  }
  public  void setStatisticsEmployeeNumNull(){
     this.set(S_StatisticsEmployeeNum,null);
  }

  public long getStatisticsEmployeeNum(){
        return DataType.getAsLong(this.get(S_StatisticsEmployeeNum));
  
  }
  public long getStatisticsEmployeeNumInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_StatisticsEmployeeNum));
      }

  public void initLinkPhone(String value){
     this.initProperty(S_LinkPhone,value);
  }
  public  void setLinkPhone(String value){
     this.set(S_LinkPhone,value);
  }
  public  void setLinkPhoneNull(){
     this.set(S_LinkPhone,null);
  }

  public String getLinkPhone(){
       return DataType.getAsString(this.get(S_LinkPhone));
  
  }
  public String getLinkPhoneInitialValue(){
        return DataType.getAsString(this.getOldObj(S_LinkPhone));
      }

  public void initPostCode(String value){
     this.initProperty(S_PostCode,value);
  }
  public  void setPostCode(String value){
     this.set(S_PostCode,value);
  }
  public  void setPostCodeNull(){
     this.set(S_PostCode,null);
  }

  public String getPostCode(){
       return DataType.getAsString(this.get(S_PostCode));
  
  }
  public String getPostCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PostCode));
      }

  public void initEconomyType(int value){
     this.initProperty(S_EconomyType,new Integer(value));
  }
  public  void setEconomyType(int value){
     this.set(S_EconomyType,new Integer(value));
  }
  public  void setEconomyTypeNull(){
     this.set(S_EconomyType,null);
  }

  public int getEconomyType(){
        return DataType.getAsInt(this.get(S_EconomyType));
  
  }
  public int getEconomyTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_EconomyType));
      }

  public void initGroupId(long value){
     this.initProperty(S_GroupId,new Long(value));
  }
  public  void setGroupId(long value){
     this.set(S_GroupId,new Long(value));
  }
  public  void setGroupIdNull(){
     this.set(S_GroupId,null);
  }

  public long getGroupId(){
        return DataType.getAsLong(this.get(S_GroupId));
  
  }
  public long getGroupIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_GroupId));
      }

  public void initGroupType(int value){
     this.initProperty(S_GroupType,new Integer(value));
  }
  public  void setGroupType(int value){
     this.set(S_GroupType,new Integer(value));
  }
  public  void setGroupTypeNull(){
     this.set(S_GroupType,null);
  }

  public int getGroupType(){
        return DataType.getAsInt(this.get(S_GroupType));
  
  }
  public int getGroupTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_GroupType));
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

  public void initEmployeeNum(long value){
     this.initProperty(S_EmployeeNum,new Long(value));
  }
  public  void setEmployeeNum(long value){
     this.set(S_EmployeeNum,new Long(value));
  }
  public  void setEmployeeNumNull(){
     this.set(S_EmployeeNum,null);
  }

  public long getEmployeeNum(){
        return DataType.getAsLong(this.get(S_EmployeeNum));
  
  }
  public long getEmployeeNumInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_EmployeeNum));
      }

  public void initWorkStatus(int value){
     this.initProperty(S_WorkStatus,new Integer(value));
  }
  public  void setWorkStatus(int value){
     this.set(S_WorkStatus,new Integer(value));
  }
  public  void setWorkStatusNull(){
     this.set(S_WorkStatus,null);
  }

  public int getWorkStatus(){
        return DataType.getAsInt(this.get(S_WorkStatus));
  
  }
  public int getWorkStatusInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_WorkStatus));
      }

  public void initGroupAddress(String value){
     this.initProperty(S_GroupAddress,value);
  }
  public  void setGroupAddress(String value){
     this.set(S_GroupAddress,value);
  }
  public  void setGroupAddressNull(){
     this.set(S_GroupAddress,null);
  }

  public String getGroupAddress(){
       return DataType.getAsString(this.get(S_GroupAddress));
  
  }
  public String getGroupAddressInitialValue(){
        return DataType.getAsString(this.getOldObj(S_GroupAddress));
      }

  public void initCompareStatus(int value){
     this.initProperty(S_CompareStatus,new Integer(value));
  }
  public  void setCompareStatus(int value){
     this.set(S_CompareStatus,new Integer(value));
  }
  public  void setCompareStatusNull(){
     this.set(S_CompareStatus,null);
  }

  public int getCompareStatus(){
        return DataType.getAsInt(this.get(S_CompareStatus));
  
  }
  public int getCompareStatusInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CompareStatus));
      }

  public void initRegionDetail(long value){
     this.initProperty(S_RegionDetail,new Long(value));
  }
  public  void setRegionDetail(long value){
     this.set(S_RegionDetail,new Long(value));
  }
  public  void setRegionDetailNull(){
     this.set(S_RegionDetail,null);
  }

  public long getRegionDetail(){
        return DataType.getAsLong(this.get(S_RegionDetail));
  
  }
  public long getRegionDetailInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_RegionDetail));
      }

  public void initBuildStatus(int value){
     this.initProperty(S_BuildStatus,new Integer(value));
  }
  public  void setBuildStatus(int value){
     this.set(S_BuildStatus,new Integer(value));
  }
  public  void setBuildStatusNull(){
     this.set(S_BuildStatus,null);
  }

  public int getBuildStatus(){
        return DataType.getAsInt(this.get(S_BuildStatus));
  
  }
  public int getBuildStatusInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_BuildStatus));
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

  public void initAddressCode(long value){
     this.initProperty(S_AddressCode,new Long(value));
  }
  public  void setAddressCode(long value){
     this.set(S_AddressCode,new Long(value));
  }
  public  void setAddressCodeNull(){
     this.set(S_AddressCode,null);
  }

  public long getAddressCode(){
        return DataType.getAsLong(this.get(S_AddressCode));
  
  }
  public long getAddressCodeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_AddressCode));
      }

  public void initDataSource(int value){
     this.initProperty(S_DataSource,new Integer(value));
  }
  public  void setDataSource(int value){
     this.set(S_DataSource,new Integer(value));
  }
  public  void setDataSourceNull(){
     this.set(S_DataSource,null);
  }

  public int getDataSource(){
        return DataType.getAsInt(this.get(S_DataSource));
  
  }
  public int getDataSourceInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_DataSource));
      }

  public void initRegionDetailName(String value){
     this.initProperty(S_RegionDetailName,value);
  }
  public  void setRegionDetailName(String value){
     this.set(S_RegionDetailName,value);
  }
  public  void setRegionDetailNameNull(){
     this.set(S_RegionDetailName,null);
  }

  public String getRegionDetailName(){
       return DataType.getAsString(this.get(S_RegionDetailName));
  
  }
  public String getRegionDetailNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_RegionDetailName));
      }

  public void initSmallTradeType(String value){
     this.initProperty(S_SmallTradeType,value);
  }
  public  void setSmallTradeType(String value){
     this.set(S_SmallTradeType,value);
  }
  public  void setSmallTradeTypeNull(){
     this.set(S_SmallTradeType,null);
  }

  public String getSmallTradeType(){
       return DataType.getAsString(this.get(S_SmallTradeType));
  
  }
  public String getSmallTradeTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SmallTradeType));
      }


 
 }

