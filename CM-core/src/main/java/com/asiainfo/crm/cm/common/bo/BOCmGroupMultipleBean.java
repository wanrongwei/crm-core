package com.asiainfo.crm.cm.common.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.common.ivalues.*;

public class BOCmGroupMultipleBean extends DataContainer implements DataContainerInterface,IBOCmGroupMultipleValue{

  private static String  m_boName = "com.asiainfo.crm.cm.common.bo.BOCmGroupMultiple";



  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_Location = "LOCATION";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_LocationDetail = "LOCATION_DETAIL";
  public final static  String S_TradeType = "TRADE_TYPE";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_LinkPhone = "LINK_PHONE";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_GroupMtpId = "GROUP_MTP_ID";
  public final static  String S_LinkName = "LINK_NAME";
  public final static  String S_PostCode = "POST_CODE";
  public final static  String S_GroupMtpName = "GROUP_MTP_NAME";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmGroupMultipleBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
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

  public void initLocation(long value){
     this.initProperty(S_Location,new Long(value));
  }
  public  void setLocation(long value){
     this.set(S_Location,new Long(value));
  }
  public  void setLocationNull(){
     this.set(S_Location,null);
  }

  public long getLocation(){
        return DataType.getAsLong(this.get(S_Location));
  
  }
  public long getLocationInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Location));
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

  public void initLocationDetail(String value){
     this.initProperty(S_LocationDetail,value);
  }
  public  void setLocationDetail(String value){
     this.set(S_LocationDetail,value);
  }
  public  void setLocationDetailNull(){
     this.set(S_LocationDetail,null);
  }

  public String getLocationDetail(){
       return DataType.getAsString(this.get(S_LocationDetail));
  
  }
  public String getLocationDetailInitialValue(){
        return DataType.getAsString(this.getOldObj(S_LocationDetail));
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

  public void initLinkName(String value){
     this.initProperty(S_LinkName,value);
  }
  public  void setLinkName(String value){
     this.set(S_LinkName,value);
  }
  public  void setLinkNameNull(){
     this.set(S_LinkName,null);
  }

  public String getLinkName(){
       return DataType.getAsString(this.get(S_LinkName));
  
  }
  public String getLinkNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_LinkName));
      }

  public void initPostCode(long value){
     this.initProperty(S_PostCode,new Long(value));
  }
  public  void setPostCode(long value){
     this.set(S_PostCode,new Long(value));
  }
  public  void setPostCodeNull(){
     this.set(S_PostCode,null);
  }

  public long getPostCode(){
        return DataType.getAsLong(this.get(S_PostCode));
  
  }
  public long getPostCodeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_PostCode));
      }

  public void initGroupMtpName(String value){
     this.initProperty(S_GroupMtpName,value);
  }
  public  void setGroupMtpName(String value){
     this.set(S_GroupMtpName,value);
  }
  public  void setGroupMtpNameNull(){
     this.set(S_GroupMtpName,null);
  }

  public String getGroupMtpName(){
       return DataType.getAsString(this.get(S_GroupMtpName));
  
  }
  public String getGroupMtpNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_GroupMtpName));
      }


 
 }

