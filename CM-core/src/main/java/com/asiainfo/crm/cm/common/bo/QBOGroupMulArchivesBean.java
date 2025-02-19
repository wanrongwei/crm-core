package com.asiainfo.crm.cm.common.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.common.ivalues.*;

public class QBOGroupMulArchivesBean extends DataContainer implements DataContainerInterface,IQBOGroupMulArchivesValue{

  private static String  m_boName = "com.asiainfo.crm.cm.common.bo.QBOGroupMulArchives";



  public final static  String S_ControlType = "CONTROL_TYPE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_UnitNum = "UNIT_NUM";
  public final static  String S_YearTurnover = "YEAR_TURNOVER";
  public final static  String S_CityName = "CITY_NAME";
  public final static  String S_ParentGroupSeq = "PARENT_GROUP_SEQ";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_RegionType = "REGION_TYPE";
  public final static  String S_GroupRel = "GROUP_REL";
  public final static  String S_AreaNum = "AREA_NUM";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_GroupName = "GROUP_NAME";
  public final static  String S_DevelopStatus = "DEVELOP_STATUS";
  public final static  String S_OrgType = "ORG_TYPE";
  public final static  String S_GroupSeq = "GROUP_SEQ";
  public final static  String S_Practice1 = "PRACTICE1";
  public final static  String S_Asset = "ASSET";
  public final static  String S_UpGroupId = "UP_GROUP_ID";
  public final static  String S_WorkType = "WORK_TYPE";
  public final static  String S_GeographyLevel = "GEOGRAPHY_LEVEL";
  public final static  String S_GroupProvince = "GROUP_PROVINCE";
  public final static  String S_GroupMtpId = "GROUP_MTP_ID";
  public final static  String S_GroupStatus = "GROUP_STATUS";
  public final static  String S_Practice2 = "PRACTICE2";
  public final static  String S_CreatDate = "CREAT_DATE";
  public final static  String S_UpEmployeeNum = "UP_EMPLOYEE_NUM";
  public final static  String S_MiddleTradeType = "MIDDLE_TRADE_TYPE";
  public final static  String S_RegionName = "REGION_NAME";
  public final static  String S_SourceType = "SOURCE_TYPE";
  public final static  String S_UpGroupStatus = "UP_GROUP_STATUS";
  public final static  String S_Notes = "NOTES";
  public final static  String S_OtherLinkPhone = "OTHER_LINK_PHONE";
  public final static  String S_TradeType = "TRADE_TYPE";
  public final static  String S_BigTradeType = "BIG_TRADE_TYPE";
  public final static  String S_GroupCity = "GROUP_CITY";
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
  public final static  String S_ExamGroupFlag = "EXAM_GROUP_FLAG";
  public final static  String S_AddressCode = "ADDRESS_CODE";
  public final static  String S_DataSource = "DATA_SOURCE";
  public final static  String S_IsRegionOrg = "IS_REGION_ORG";
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
  public QBOGroupMulArchivesBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initControlType(long value){
     this.initProperty(S_ControlType,new Long(value));
  }
  public  void setControlType(long value){
     this.set(S_ControlType,new Long(value));
  }
  public  void setControlTypeNull(){
     this.set(S_ControlType,null);
  }

  public long getControlType(){
        return DataType.getAsLong(this.get(S_ControlType));
  
  }
  public long getControlTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ControlType));
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

  public void initRegionType(long value){
     this.initProperty(S_RegionType,new Long(value));
  }
  public  void setRegionType(long value){
     this.set(S_RegionType,new Long(value));
  }
  public  void setRegionTypeNull(){
     this.set(S_RegionType,null);
  }

  public long getRegionType(){
        return DataType.getAsLong(this.get(S_RegionType));
  
  }
  public long getRegionTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_RegionType));
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

  public void initDevelopStatus(long value){
     this.initProperty(S_DevelopStatus,new Long(value));
  }
  public  void setDevelopStatus(long value){
     this.set(S_DevelopStatus,new Long(value));
  }
  public  void setDevelopStatusNull(){
     this.set(S_DevelopStatus,null);
  }

  public long getDevelopStatus(){
        return DataType.getAsLong(this.get(S_DevelopStatus));
  
  }
  public long getDevelopStatusInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_DevelopStatus));
      }

  public void initOrgType(long value){
     this.initProperty(S_OrgType,new Long(value));
  }
  public  void setOrgType(long value){
     this.set(S_OrgType,new Long(value));
  }
  public  void setOrgTypeNull(){
     this.set(S_OrgType,null);
  }

  public long getOrgType(){
        return DataType.getAsLong(this.get(S_OrgType));
  
  }
  public long getOrgTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_OrgType));
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

  public void initWorkType(long value){
     this.initProperty(S_WorkType,new Long(value));
  }
  public  void setWorkType(long value){
     this.set(S_WorkType,new Long(value));
  }
  public  void setWorkTypeNull(){
     this.set(S_WorkType,null);
  }

  public long getWorkType(){
        return DataType.getAsLong(this.get(S_WorkType));
  
  }
  public long getWorkTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_WorkType));
      }

  public void initGeographyLevel(long value){
     this.initProperty(S_GeographyLevel,new Long(value));
  }
  public  void setGeographyLevel(long value){
     this.set(S_GeographyLevel,new Long(value));
  }
  public  void setGeographyLevelNull(){
     this.set(S_GeographyLevel,null);
  }

  public long getGeographyLevel(){
        return DataType.getAsLong(this.get(S_GeographyLevel));
  
  }
  public long getGeographyLevelInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_GeographyLevel));
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

  public void initGroupMtpId(String value){
     this.initProperty(S_GroupMtpId,value);
  }
  public  void setGroupMtpId(String value){
     this.set(S_GroupMtpId,value);
  }
  public  void setGroupMtpIdNull(){
     this.set(S_GroupMtpId,null);
  }

  public String getGroupMtpId(){
       return DataType.getAsString(this.get(S_GroupMtpId));
  
  }
  public String getGroupMtpIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_GroupMtpId));
      }

  public void initGroupStatus(long value){
     this.initProperty(S_GroupStatus,new Long(value));
  }
  public  void setGroupStatus(long value){
     this.set(S_GroupStatus,new Long(value));
  }
  public  void setGroupStatusNull(){
     this.set(S_GroupStatus,null);
  }

  public long getGroupStatus(){
        return DataType.getAsLong(this.get(S_GroupStatus));
  
  }
  public long getGroupStatusInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_GroupStatus));
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

  public void initCreatDate(Timestamp value){
     this.initProperty(S_CreatDate,value);
  }
  public  void setCreatDate(Timestamp value){
     this.set(S_CreatDate,value);
  }
  public  void setCreatDateNull(){
     this.set(S_CreatDate,null);
  }

  public Timestamp getCreatDate(){
        return DataType.getAsDateTime(this.get(S_CreatDate));
  
  }
  public Timestamp getCreatDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_CreatDate));
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

  public void initSourceType(long value){
     this.initProperty(S_SourceType,new Long(value));
  }
  public  void setSourceType(long value){
     this.set(S_SourceType,new Long(value));
  }
  public  void setSourceTypeNull(){
     this.set(S_SourceType,null);
  }

  public long getSourceType(){
        return DataType.getAsLong(this.get(S_SourceType));
  
  }
  public long getSourceTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_SourceType));
      }

  public void initUpGroupStatus(long value){
     this.initProperty(S_UpGroupStatus,new Long(value));
  }
  public  void setUpGroupStatus(long value){
     this.set(S_UpGroupStatus,new Long(value));
  }
  public  void setUpGroupStatusNull(){
     this.set(S_UpGroupStatus,null);
  }

  public long getUpGroupStatus(){
        return DataType.getAsLong(this.get(S_UpGroupStatus));
  
  }
  public long getUpGroupStatusInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_UpGroupStatus));
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

  public void initGroupCity(long value){
     this.initProperty(S_GroupCity,new Long(value));
  }
  public  void setGroupCity(long value){
     this.set(S_GroupCity,new Long(value));
  }
  public  void setGroupCityNull(){
     this.set(S_GroupCity,null);
  }

  public long getGroupCity(){
        return DataType.getAsLong(this.get(S_GroupCity));
  
  }
  public long getGroupCityInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_GroupCity));
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

  public void initEconomyType(long value){
     this.initProperty(S_EconomyType,new Long(value));
  }
  public  void setEconomyType(long value){
     this.set(S_EconomyType,new Long(value));
  }
  public  void setEconomyTypeNull(){
     this.set(S_EconomyType,null);
  }

  public long getEconomyType(){
        return DataType.getAsLong(this.get(S_EconomyType));
  
  }
  public long getEconomyTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_EconomyType));
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

  public void initGroupType(long value){
     this.initProperty(S_GroupType,new Long(value));
  }
  public  void setGroupType(long value){
     this.set(S_GroupType,new Long(value));
  }
  public  void setGroupTypeNull(){
     this.set(S_GroupType,null);
  }

  public long getGroupType(){
        return DataType.getAsLong(this.get(S_GroupType));
  
  }
  public long getGroupTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_GroupType));
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

  public void initWorkStatus(long value){
     this.initProperty(S_WorkStatus,new Long(value));
  }
  public  void setWorkStatus(long value){
     this.set(S_WorkStatus,new Long(value));
  }
  public  void setWorkStatusNull(){
     this.set(S_WorkStatus,null);
  }

  public long getWorkStatus(){
        return DataType.getAsLong(this.get(S_WorkStatus));
  
  }
  public long getWorkStatusInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_WorkStatus));
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

  public void initCompareStatus(long value){
     this.initProperty(S_CompareStatus,new Long(value));
  }
  public  void setCompareStatus(long value){
     this.set(S_CompareStatus,new Long(value));
  }
  public  void setCompareStatusNull(){
     this.set(S_CompareStatus,null);
  }

  public long getCompareStatus(){
        return DataType.getAsLong(this.get(S_CompareStatus));
  
  }
  public long getCompareStatusInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CompareStatus));
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

  public void initBuildStatus(long value){
     this.initProperty(S_BuildStatus,new Long(value));
  }
  public  void setBuildStatus(long value){
     this.set(S_BuildStatus,new Long(value));
  }
  public  void setBuildStatusNull(){
     this.set(S_BuildStatus,null);
  }

  public long getBuildStatus(){
        return DataType.getAsLong(this.get(S_BuildStatus));
  
  }
  public long getBuildStatusInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_BuildStatus));
      }

  public void initExamGroupFlag(long value){
     this.initProperty(S_ExamGroupFlag,new Long(value));
  }
  public  void setExamGroupFlag(long value){
     this.set(S_ExamGroupFlag,new Long(value));
  }
  public  void setExamGroupFlagNull(){
     this.set(S_ExamGroupFlag,null);
  }

  public long getExamGroupFlag(){
        return DataType.getAsLong(this.get(S_ExamGroupFlag));
  
  }
  public long getExamGroupFlagInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ExamGroupFlag));
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

  public void initDataSource(long value){
     this.initProperty(S_DataSource,new Long(value));
  }
  public  void setDataSource(long value){
     this.set(S_DataSource,new Long(value));
  }
  public  void setDataSourceNull(){
     this.set(S_DataSource,null);
  }

  public long getDataSource(){
        return DataType.getAsLong(this.get(S_DataSource));
  
  }
  public long getDataSourceInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_DataSource));
      }

  public void initIsRegionOrg(long value){
     this.initProperty(S_IsRegionOrg,new Long(value));
  }
  public  void setIsRegionOrg(long value){
     this.set(S_IsRegionOrg,new Long(value));
  }
  public  void setIsRegionOrgNull(){
     this.set(S_IsRegionOrg,null);
  }

  public long getIsRegionOrg(){
        return DataType.getAsLong(this.get(S_IsRegionOrg));
  
  }
  public long getIsRegionOrgInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_IsRegionOrg));
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

