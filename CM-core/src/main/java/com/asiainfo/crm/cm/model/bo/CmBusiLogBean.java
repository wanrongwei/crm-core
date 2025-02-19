package com.asiainfo.crm.cm.model.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.model.ivalues.*;

public class CmBusiLogBean extends DataContainer implements DataContainerInterface,ICmBusiLogValue{

  private static String  m_boName = "com.asiainfo.crm.cm.model.bo.CmBusiLog";



  public final static  String S_State = "STATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_BusiDetail = "BUSI_DETAIL";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_ParentLogId = "PARENT_LOG_ID";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_BusiType = "BUSI_TYPE";
  public final static  String S_BatchDataId = "BATCH_DATA_ID";
  public final static  String S_ChannelType = "CHANNEL_TYPE";
  public final static  String S_BusiLogId = "BUSI_LOG_ID";
  public final static  String S_AreaId = "AREA_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_PartyId = "PARTY_ID";
  public final static  String S_BusinessId = "BUSINESS_ID";
  public final static  String S_OperType = "OPER_TYPE";
  public final static  String S_CountyId = "COUNTY_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_PeerDoneCode = "PEER_DONE_CODE";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_CustId = "CUST_ID";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public CmBusiLogBean() throws AIException{
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

  public void initBusiDetail(String value){
     this.initProperty(S_BusiDetail,value);
  }
  public  void setBusiDetail(String value){
     this.set(S_BusiDetail,value);
  }
  public  void setBusiDetailNull(){
     this.set(S_BusiDetail,null);
  }

  public String getBusiDetail(){
       return DataType.getAsString(this.get(S_BusiDetail));
  
  }
  public String getBusiDetailInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BusiDetail));
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

  public void initAcctId(long value){
     this.initProperty(S_AcctId,new Long(value));
  }
  public  void setAcctId(long value){
     this.set(S_AcctId,new Long(value));
  }
  public  void setAcctIdNull(){
     this.set(S_AcctId,null);
  }

  public long getAcctId(){
        return DataType.getAsLong(this.get(S_AcctId));
  
  }
  public long getAcctIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_AcctId));
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

  public void initParentLogId(long value){
     this.initProperty(S_ParentLogId,new Long(value));
  }
  public  void setParentLogId(long value){
     this.set(S_ParentLogId,new Long(value));
  }
  public  void setParentLogIdNull(){
     this.set(S_ParentLogId,null);
  }

  public long getParentLogId(){
        return DataType.getAsLong(this.get(S_ParentLogId));
  
  }
  public long getParentLogIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ParentLogId));
      }

  public void initUserId(long value){
     this.initProperty(S_UserId,new Long(value));
  }
  public  void setUserId(long value){
     this.set(S_UserId,new Long(value));
  }
  public  void setUserIdNull(){
     this.set(S_UserId,null);
  }

  public long getUserId(){
        return DataType.getAsLong(this.get(S_UserId));
  
  }
  public long getUserIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_UserId));
      }

  public void initBusiType(int value){
     this.initProperty(S_BusiType,new Integer(value));
  }
  public  void setBusiType(int value){
     this.set(S_BusiType,new Integer(value));
  }
  public  void setBusiTypeNull(){
     this.set(S_BusiType,null);
  }

  public int getBusiType(){
        return DataType.getAsInt(this.get(S_BusiType));
  
  }
  public int getBusiTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_BusiType));
      }

  public void initBatchDataId(long value){
     this.initProperty(S_BatchDataId,new Long(value));
  }
  public  void setBatchDataId(long value){
     this.set(S_BatchDataId,new Long(value));
  }
  public  void setBatchDataIdNull(){
     this.set(S_BatchDataId,null);
  }

  public long getBatchDataId(){
        return DataType.getAsLong(this.get(S_BatchDataId));
  
  }
  public long getBatchDataIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_BatchDataId));
      }

  public void initChannelType(int value){
     this.initProperty(S_ChannelType,new Integer(value));
  }
  public  void setChannelType(int value){
     this.set(S_ChannelType,new Integer(value));
  }
  public  void setChannelTypeNull(){
     this.set(S_ChannelType,null);
  }

  public int getChannelType(){
        return DataType.getAsInt(this.get(S_ChannelType));
  
  }
  public int getChannelTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ChannelType));
      }

  public void initBusiLogId(long value){
     this.initProperty(S_BusiLogId,new Long(value));
  }
  public  void setBusiLogId(long value){
     this.set(S_BusiLogId,new Long(value));
  }
  public  void setBusiLogIdNull(){
     this.set(S_BusiLogId,null);
  }

  public long getBusiLogId(){
        return DataType.getAsLong(this.get(S_BusiLogId));
  
  }
  public long getBusiLogIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_BusiLogId));
      }

  public void initAreaId(String value){
     this.initProperty(S_AreaId,value);
  }
  public  void setAreaId(String value){
     this.set(S_AreaId,value);
  }
  public  void setAreaIdNull(){
     this.set(S_AreaId,null);
  }

  public String getAreaId(){
       return DataType.getAsString(this.get(S_AreaId));
  
  }
  public String getAreaIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AreaId));
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

  public void initPartyId(long value){
     this.initProperty(S_PartyId,new Long(value));
  }
  public  void setPartyId(long value){
     this.set(S_PartyId,new Long(value));
  }
  public  void setPartyIdNull(){
     this.set(S_PartyId,null);
  }

  public long getPartyId(){
        return DataType.getAsLong(this.get(S_PartyId));
  
  }
  public long getPartyIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_PartyId));
      }

  public void initBusinessId(long value){
     this.initProperty(S_BusinessId,new Long(value));
  }
  public  void setBusinessId(long value){
     this.set(S_BusinessId,new Long(value));
  }
  public  void setBusinessIdNull(){
     this.set(S_BusinessId,null);
  }

  public long getBusinessId(){
        return DataType.getAsLong(this.get(S_BusinessId));
  
  }
  public long getBusinessIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_BusinessId));
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

  public void initCountyId(String value){
     this.initProperty(S_CountyId,value);
  }
  public  void setCountyId(String value){
     this.set(S_CountyId,value);
  }
  public  void setCountyIdNull(){
     this.set(S_CountyId,null);
  }

  public String getCountyId(){
       return DataType.getAsString(this.get(S_CountyId));
  
  }
  public String getCountyIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CountyId));
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

  public void initPeerDoneCode(String value){
     this.initProperty(S_PeerDoneCode,value);
  }
  public  void setPeerDoneCode(String value){
     this.set(S_PeerDoneCode,value);
  }
  public  void setPeerDoneCodeNull(){
     this.set(S_PeerDoneCode,null);
  }

  public String getPeerDoneCode(){
       return DataType.getAsString(this.get(S_PeerDoneCode));
  
  }
  public String getPeerDoneCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PeerDoneCode));
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

  public void initBillId(String value){
     this.initProperty(S_BillId,value);
  }
  public  void setBillId(String value){
     this.set(S_BillId,value);
  }
  public  void setBillIdNull(){
     this.set(S_BillId,null);
  }

  public String getBillId(){
       return DataType.getAsString(this.get(S_BillId));
  
  }
  public String getBillIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BillId));
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


 
 }

