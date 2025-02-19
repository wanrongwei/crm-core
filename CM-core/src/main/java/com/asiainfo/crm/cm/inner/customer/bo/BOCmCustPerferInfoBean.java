package com.asiainfo.crm.cm.inner.customer.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.inner.customer.ivalues.*;

public class BOCmCustPerferInfoBean extends DataContainer implements DataContainerInterface,IBOCmCustPerferInfoValue{

  private static String  m_boName = "com.asiainfo.crm.cm.inner.customer.bo.BOCmCustPerferInfo";



  public final static  String S_ChannelDoneCode = "CHANNEL_DONE_CODE";
  public final static  String S_TimeBeginUnit = "TIME_BEGIN_UNIT";
  public final static  String S_State = "STATE";
  public final static  String S_TimeBeginAttr = "TIME_BEGIN_ATTR";
  public final static  String S_ChannelCreateOrgId = "CHANNEL_CREATE_ORG_ID";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_PreferChannelId = "PREFER_CHANNEL_ID";
  public final static  String S_ChannelCreateOpId = "CHANNEL_CREATE_OP_ID";
  public final static  String S_PreferPeriodId = "PREFER_PERIOD_ID";
  public final static  String S_ChannelRegionId = "CHANNEL_REGION_ID";
  public final static  String S_PreferChannelName = "PREFER_CHANNEL_NAME";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_ChannelDoneDate = "CHANNEL_DONE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_Action = "ACTION";
  public final static  String S_TimeType = "TIME_TYPE";
  public final static  String S_ChannelEffectiveDate = "CHANNEL_EFFECTIVE_DATE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_TimeEndAttr = "TIME_END_ATTR";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_UpPreferPeriodId = "UP_PREFER_PERIOD_ID";
  public final static  String S_ChannelRemarks = "CHANNEL_REMARKS";
  public final static  String S_ChannelExpireDate = "CHANNEL_EXPIRE_DATE";
  public final static  String S_ChannelCreateDate = "CHANNEL_CREATE_DATE";
  public final static  String S_ChannelOrgId = "CHANNEL_ORG_ID";
  public final static  String S_ChannelState = "CHANNEL_STATE";
  public final static  String S_CustContRelaId = "CUST_CONT_RELA_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_PerferType = "PERFER_TYPE";
  public final static  String S_ChannelOpId = "CHANNEL_OP_ID";
  public final static  String S_TimeEndUnit = "TIME_END_UNIT";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_Prior = "PRIOR";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmCustPerferInfoBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initChannelDoneCode(long value){
     this.initProperty(S_ChannelDoneCode,new Long(value));
  }
  public  void setChannelDoneCode(long value){
     this.set(S_ChannelDoneCode,new Long(value));
  }
  public  void setChannelDoneCodeNull(){
     this.set(S_ChannelDoneCode,null);
  }

  public long getChannelDoneCode(){
        return DataType.getAsLong(this.get(S_ChannelDoneCode));
  
  }
  public long getChannelDoneCodeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ChannelDoneCode));
      }

  public void initTimeBeginUnit(int value){
     this.initProperty(S_TimeBeginUnit,new Integer(value));
  }
  public  void setTimeBeginUnit(int value){
     this.set(S_TimeBeginUnit,new Integer(value));
  }
  public  void setTimeBeginUnitNull(){
     this.set(S_TimeBeginUnit,null);
  }

  public int getTimeBeginUnit(){
        return DataType.getAsInt(this.get(S_TimeBeginUnit));
  
  }
  public int getTimeBeginUnitInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_TimeBeginUnit));
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

  public void initTimeBeginAttr(String value){
     this.initProperty(S_TimeBeginAttr,value);
  }
  public  void setTimeBeginAttr(String value){
     this.set(S_TimeBeginAttr,value);
  }
  public  void setTimeBeginAttrNull(){
     this.set(S_TimeBeginAttr,null);
  }

  public String getTimeBeginAttr(){
       return DataType.getAsString(this.get(S_TimeBeginAttr));
  
  }
  public String getTimeBeginAttrInitialValue(){
        return DataType.getAsString(this.getOldObj(S_TimeBeginAttr));
      }

  public void initChannelCreateOrgId(long value){
     this.initProperty(S_ChannelCreateOrgId,new Long(value));
  }
  public  void setChannelCreateOrgId(long value){
     this.set(S_ChannelCreateOrgId,new Long(value));
  }
  public  void setChannelCreateOrgIdNull(){
     this.set(S_ChannelCreateOrgId,null);
  }

  public long getChannelCreateOrgId(){
        return DataType.getAsLong(this.get(S_ChannelCreateOrgId));
  
  }
  public long getChannelCreateOrgIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ChannelCreateOrgId));
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

  public void initPreferChannelId(long value){
     this.initProperty(S_PreferChannelId,new Long(value));
  }
  public  void setPreferChannelId(long value){
     this.set(S_PreferChannelId,new Long(value));
  }
  public  void setPreferChannelIdNull(){
     this.set(S_PreferChannelId,null);
  }

  public long getPreferChannelId(){
        return DataType.getAsLong(this.get(S_PreferChannelId));
  
  }
  public long getPreferChannelIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_PreferChannelId));
      }

  public void initChannelCreateOpId(long value){
     this.initProperty(S_ChannelCreateOpId,new Long(value));
  }
  public  void setChannelCreateOpId(long value){
     this.set(S_ChannelCreateOpId,new Long(value));
  }
  public  void setChannelCreateOpIdNull(){
     this.set(S_ChannelCreateOpId,null);
  }

  public long getChannelCreateOpId(){
        return DataType.getAsLong(this.get(S_ChannelCreateOpId));
  
  }
  public long getChannelCreateOpIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ChannelCreateOpId));
      }

  public void initPreferPeriodId(long value){
     this.initProperty(S_PreferPeriodId,new Long(value));
  }
  public  void setPreferPeriodId(long value){
     this.set(S_PreferPeriodId,new Long(value));
  }
  public  void setPreferPeriodIdNull(){
     this.set(S_PreferPeriodId,null);
  }

  public long getPreferPeriodId(){
        return DataType.getAsLong(this.get(S_PreferPeriodId));
  
  }
  public long getPreferPeriodIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_PreferPeriodId));
      }

  public void initChannelRegionId(String value){
     this.initProperty(S_ChannelRegionId,value);
  }
  public  void setChannelRegionId(String value){
     this.set(S_ChannelRegionId,value);
  }
  public  void setChannelRegionIdNull(){
     this.set(S_ChannelRegionId,null);
  }

  public String getChannelRegionId(){
       return DataType.getAsString(this.get(S_ChannelRegionId));
  
  }
  public String getChannelRegionIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ChannelRegionId));
      }

  public void initPreferChannelName(String value){
     this.initProperty(S_PreferChannelName,value);
  }
  public  void setPreferChannelName(String value){
     this.set(S_PreferChannelName,value);
  }
  public  void setPreferChannelNameNull(){
     this.set(S_PreferChannelName,null);
  }

  public String getPreferChannelName(){
       return DataType.getAsString(this.get(S_PreferChannelName));
  
  }
  public String getPreferChannelNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PreferChannelName));
      }

  public void initCustId(long value){
     this.initProperty(S_CustId,new Long(value));
  }
  public  void setCustId(long value){
     this.set(S_CustId,new Long(value));
  }
  public  void setCustIdNull(){
     this.set(S_CustId,null);
  }

  public long getCustId(){
        return DataType.getAsLong(this.get(S_CustId));
  
  }
  public long getCustIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CustId));
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

  public void initChannelDoneDate(Timestamp value){
     this.initProperty(S_ChannelDoneDate,value);
  }
  public  void setChannelDoneDate(Timestamp value){
     this.set(S_ChannelDoneDate,value);
  }
  public  void setChannelDoneDateNull(){
     this.set(S_ChannelDoneDate,null);
  }

  public Timestamp getChannelDoneDate(){
        return DataType.getAsDateTime(this.get(S_ChannelDoneDate));
  
  }
  public Timestamp getChannelDoneDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_ChannelDoneDate));
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

  public void initAction(String value){
     this.initProperty(S_Action,value);
  }
  public  void setAction(String value){
     this.set(S_Action,value);
  }
  public  void setActionNull(){
     this.set(S_Action,null);
  }

  public String getAction(){
       return DataType.getAsString(this.get(S_Action));
  
  }
  public String getActionInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Action));
      }

  public void initTimeType(long value){
     this.initProperty(S_TimeType,new Long(value));
  }
  public  void setTimeType(long value){
     this.set(S_TimeType,new Long(value));
  }
  public  void setTimeTypeNull(){
     this.set(S_TimeType,null);
  }

  public long getTimeType(){
        return DataType.getAsLong(this.get(S_TimeType));
  
  }
  public long getTimeTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_TimeType));
      }

  public void initChannelEffectiveDate(Timestamp value){
     this.initProperty(S_ChannelEffectiveDate,value);
  }
  public  void setChannelEffectiveDate(Timestamp value){
     this.set(S_ChannelEffectiveDate,value);
  }
  public  void setChannelEffectiveDateNull(){
     this.set(S_ChannelEffectiveDate,null);
  }

  public Timestamp getChannelEffectiveDate(){
        return DataType.getAsDateTime(this.get(S_ChannelEffectiveDate));
  
  }
  public Timestamp getChannelEffectiveDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_ChannelEffectiveDate));
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

  public void initTimeEndAttr(String value){
     this.initProperty(S_TimeEndAttr,value);
  }
  public  void setTimeEndAttr(String value){
     this.set(S_TimeEndAttr,value);
  }
  public  void setTimeEndAttrNull(){
     this.set(S_TimeEndAttr,null);
  }

  public String getTimeEndAttr(){
       return DataType.getAsString(this.get(S_TimeEndAttr));
  
  }
  public String getTimeEndAttrInitialValue(){
        return DataType.getAsString(this.getOldObj(S_TimeEndAttr));
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

  public void initUpPreferPeriodId(long value){
     this.initProperty(S_UpPreferPeriodId,new Long(value));
  }
  public  void setUpPreferPeriodId(long value){
     this.set(S_UpPreferPeriodId,new Long(value));
  }
  public  void setUpPreferPeriodIdNull(){
     this.set(S_UpPreferPeriodId,null);
  }

  public long getUpPreferPeriodId(){
        return DataType.getAsLong(this.get(S_UpPreferPeriodId));
  
  }
  public long getUpPreferPeriodIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_UpPreferPeriodId));
      }

  public void initChannelRemarks(String value){
     this.initProperty(S_ChannelRemarks,value);
  }
  public  void setChannelRemarks(String value){
     this.set(S_ChannelRemarks,value);
  }
  public  void setChannelRemarksNull(){
     this.set(S_ChannelRemarks,null);
  }

  public String getChannelRemarks(){
       return DataType.getAsString(this.get(S_ChannelRemarks));
  
  }
  public String getChannelRemarksInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ChannelRemarks));
      }

  public void initChannelExpireDate(Timestamp value){
     this.initProperty(S_ChannelExpireDate,value);
  }
  public  void setChannelExpireDate(Timestamp value){
     this.set(S_ChannelExpireDate,value);
  }
  public  void setChannelExpireDateNull(){
     this.set(S_ChannelExpireDate,null);
  }

  public Timestamp getChannelExpireDate(){
        return DataType.getAsDateTime(this.get(S_ChannelExpireDate));
  
  }
  public Timestamp getChannelExpireDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_ChannelExpireDate));
      }

  public void initChannelCreateDate(Timestamp value){
     this.initProperty(S_ChannelCreateDate,value);
  }
  public  void setChannelCreateDate(Timestamp value){
     this.set(S_ChannelCreateDate,value);
  }
  public  void setChannelCreateDateNull(){
     this.set(S_ChannelCreateDate,null);
  }

  public Timestamp getChannelCreateDate(){
        return DataType.getAsDateTime(this.get(S_ChannelCreateDate));
  
  }
  public Timestamp getChannelCreateDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_ChannelCreateDate));
      }

  public void initChannelOrgId(long value){
     this.initProperty(S_ChannelOrgId,new Long(value));
  }
  public  void setChannelOrgId(long value){
     this.set(S_ChannelOrgId,new Long(value));
  }
  public  void setChannelOrgIdNull(){
     this.set(S_ChannelOrgId,null);
  }

  public long getChannelOrgId(){
        return DataType.getAsLong(this.get(S_ChannelOrgId));
  
  }
  public long getChannelOrgIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ChannelOrgId));
      }

  public void initChannelState(String value){
     this.initProperty(S_ChannelState,value);
  }
  public  void setChannelState(String value){
     this.set(S_ChannelState,value);
  }
  public  void setChannelStateNull(){
     this.set(S_ChannelState,null);
  }

  public String getChannelState(){
       return DataType.getAsString(this.get(S_ChannelState));
  
  }
  public String getChannelStateInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ChannelState));
      }

  public void initCustContRelaId(long value){
     this.initProperty(S_CustContRelaId,new Long(value));
  }
  public  void setCustContRelaId(long value){
     this.set(S_CustContRelaId,new Long(value));
  }
  public  void setCustContRelaIdNull(){
     this.set(S_CustContRelaId,null);
  }

  public long getCustContRelaId(){
        return DataType.getAsLong(this.get(S_CustContRelaId));
  
  }
  public long getCustContRelaIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CustContRelaId));
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

  public void initPerferType(int value){
     this.initProperty(S_PerferType,new Integer(value));
  }
  public  void setPerferType(int value){
     this.set(S_PerferType,new Integer(value));
  }
  public  void setPerferTypeNull(){
     this.set(S_PerferType,null);
  }

  public int getPerferType(){
        return DataType.getAsInt(this.get(S_PerferType));
  
  }
  public int getPerferTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_PerferType));
      }

  public void initChannelOpId(long value){
     this.initProperty(S_ChannelOpId,new Long(value));
  }
  public  void setChannelOpId(long value){
     this.set(S_ChannelOpId,new Long(value));
  }
  public  void setChannelOpIdNull(){
     this.set(S_ChannelOpId,null);
  }

  public long getChannelOpId(){
        return DataType.getAsLong(this.get(S_ChannelOpId));
  
  }
  public long getChannelOpIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ChannelOpId));
      }

  public void initTimeEndUnit(int value){
     this.initProperty(S_TimeEndUnit,new Integer(value));
  }
  public  void setTimeEndUnit(int value){
     this.set(S_TimeEndUnit,new Integer(value));
  }
  public  void setTimeEndUnitNull(){
     this.set(S_TimeEndUnit,null);
  }

  public int getTimeEndUnit(){
        return DataType.getAsInt(this.get(S_TimeEndUnit));
  
  }
  public int getTimeEndUnitInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_TimeEndUnit));
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

  public void initPrior(int value){
     this.initProperty(S_Prior,new Integer(value));
  }
  public  void setPrior(int value){
     this.set(S_Prior,new Integer(value));
  }
  public  void setPriorNull(){
     this.set(S_Prior,null);
  }

  public int getPrior(){
        return DataType.getAsInt(this.get(S_Prior));
  
  }
  public int getPriorInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_Prior));
      }


 
 }

