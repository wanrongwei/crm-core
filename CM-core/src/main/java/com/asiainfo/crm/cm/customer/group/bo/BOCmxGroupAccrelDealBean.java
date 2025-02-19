package com.asiainfo.crm.cm.customer.group.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.customer.group.ivalues.*;

public class BOCmxGroupAccrelDealBean extends DataContainer implements DataContainerInterface,IBOCmxGroupAccrelDealValue{

  private static String  m_boName = "com.asiainfo.crm.cm.customer.group.bo.BOCmxGroupAccrelDeal";



  public final static  String S_State = "STATE";
  public final static  String S_DealType = "DEAL_TYPE";
  public final static  String S_DoneNotes = "DONE_NOTES";
  public final static  String S_AcctCountyId = "ACCT_COUNTY_ID";
  public final static  String S_AcctRegionId = "ACCT_REGION_ID";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_GroupName = "GROUP_NAME";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_Notes = "NOTES";
  public final static  String S_DealNotes = "DEAL_NOTES";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_SendDate = "SEND_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_DealId = "DEAL_ID";
  public final static  String S_ManagerName = "MANAGER_NAME";
  public final static  String S_FirstDate = "FIRST_DATE";
  public final static  String S_DealStatus = "DEAL_STATUS";
  public final static  String S_GroupCustId = "GROUP_CUST_ID";
  public final static  String S_OfficePhone = "OFFICE_PHONE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_ManagerId = "MANAGER_ID";
  public final static  String S_CountyId = "COUNTY_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_CreateDate = "CREATE_DATE";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmxGroupAccrelDealBean() throws AIException{
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

  public void initDealType(int value){
     this.initProperty(S_DealType,new Integer(value));
  }
  public  void setDealType(int value){
     this.set(S_DealType,new Integer(value));
  }
  public  void setDealTypeNull(){
     this.set(S_DealType,null);
  }

  public int getDealType(){
        return DataType.getAsInt(this.get(S_DealType));
  
  }
  public int getDealTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_DealType));
      }

  public void initDoneNotes(String value){
     this.initProperty(S_DoneNotes,value);
  }
  public  void setDoneNotes(String value){
     this.set(S_DoneNotes,value);
  }
  public  void setDoneNotesNull(){
     this.set(S_DoneNotes,null);
  }

  public String getDoneNotes(){
       return DataType.getAsString(this.get(S_DoneNotes));
  
  }
  public String getDoneNotesInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DoneNotes));
      }

  public void initAcctCountyId(String value){
     this.initProperty(S_AcctCountyId,value);
  }
  public  void setAcctCountyId(String value){
     this.set(S_AcctCountyId,value);
  }
  public  void setAcctCountyIdNull(){
     this.set(S_AcctCountyId,null);
  }

  public String getAcctCountyId(){
       return DataType.getAsString(this.get(S_AcctCountyId));
  
  }
  public String getAcctCountyIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AcctCountyId));
      }

  public void initAcctRegionId(String value){
     this.initProperty(S_AcctRegionId,value);
  }
  public  void setAcctRegionId(String value){
     this.set(S_AcctRegionId,value);
  }
  public  void setAcctRegionIdNull(){
     this.set(S_AcctRegionId,null);
  }

  public String getAcctRegionId(){
       return DataType.getAsString(this.get(S_AcctRegionId));
  
  }
  public String getAcctRegionIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AcctRegionId));
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

  public void initDealNotes(String value){
     this.initProperty(S_DealNotes,value);
  }
  public  void setDealNotes(String value){
     this.set(S_DealNotes,value);
  }
  public  void setDealNotesNull(){
     this.set(S_DealNotes,null);
  }

  public String getDealNotes(){
       return DataType.getAsString(this.get(S_DealNotes));
  
  }
  public String getDealNotesInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DealNotes));
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

  public void initSendDate(Timestamp value){
     this.initProperty(S_SendDate,value);
  }
  public  void setSendDate(Timestamp value){
     this.set(S_SendDate,value);
  }
  public  void setSendDateNull(){
     this.set(S_SendDate,null);
  }

  public Timestamp getSendDate(){
        return DataType.getAsDateTime(this.get(S_SendDate));
  
  }
  public Timestamp getSendDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_SendDate));
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

  public void initDealId(long value){
     this.initProperty(S_DealId,new Long(value));
  }
  public  void setDealId(long value){
     this.set(S_DealId,new Long(value));
  }
  public  void setDealIdNull(){
     this.set(S_DealId,null);
  }

  public long getDealId(){
        return DataType.getAsLong(this.get(S_DealId));
  
  }
  public long getDealIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_DealId));
      }

  public void initManagerName(String value){
     this.initProperty(S_ManagerName,value);
  }
  public  void setManagerName(String value){
     this.set(S_ManagerName,value);
  }
  public  void setManagerNameNull(){
     this.set(S_ManagerName,null);
  }

  public String getManagerName(){
       return DataType.getAsString(this.get(S_ManagerName));
  
  }
  public String getManagerNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ManagerName));
      }

  public void initFirstDate(Timestamp value){
     this.initProperty(S_FirstDate,value);
  }
  public  void setFirstDate(Timestamp value){
     this.set(S_FirstDate,value);
  }
  public  void setFirstDateNull(){
     this.set(S_FirstDate,null);
  }

  public Timestamp getFirstDate(){
        return DataType.getAsDateTime(this.get(S_FirstDate));
  
  }
  public Timestamp getFirstDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_FirstDate));
      }

  public void initDealStatus(int value){
     this.initProperty(S_DealStatus,new Integer(value));
  }
  public  void setDealStatus(int value){
     this.set(S_DealStatus,new Integer(value));
  }
  public  void setDealStatusNull(){
     this.set(S_DealStatus,null);
  }

  public int getDealStatus(){
        return DataType.getAsInt(this.get(S_DealStatus));
  
  }
  public int getDealStatusInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_DealStatus));
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

  public void initOfficePhone(String value){
     this.initProperty(S_OfficePhone,value);
  }
  public  void setOfficePhone(String value){
     this.set(S_OfficePhone,value);
  }
  public  void setOfficePhoneNull(){
     this.set(S_OfficePhone,null);
  }

  public String getOfficePhone(){
       return DataType.getAsString(this.get(S_OfficePhone));
  
  }
  public String getOfficePhoneInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OfficePhone));
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

  public void initManagerId(long value){
     this.initProperty(S_ManagerId,new Long(value));
  }
  public  void setManagerId(long value){
     this.set(S_ManagerId,new Long(value));
  }
  public  void setManagerIdNull(){
     this.set(S_ManagerId,null);
  }

  public long getManagerId(){
        return DataType.getAsLong(this.get(S_ManagerId));
  
  }
  public long getManagerIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ManagerId));
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


 
 }

