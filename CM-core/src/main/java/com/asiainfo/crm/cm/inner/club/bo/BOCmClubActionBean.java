package com.asiainfo.crm.cm.inner.club.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.inner.club.ivalues.*;

public class BOCmClubActionBean extends DataContainer implements DataContainerInterface,IBOCmClubActionValue{

  private static String  m_boName = "com.asiainfo.crm.cm.inner.club.bo.BOCmClubAction";



  public final static  String S_State = "STATE";
  public final static  String S_ActionCode = "ACTION_CODE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_EndDate = "END_DATE";
  public final static  String S_ContactPhone = "CONTACT_PHONE";
  public final static  String S_ValueType = "VALUE_TYPE";
  public final static  String S_FirstName = "FIRST_NAME";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_ContNameQry = "CONT_NAME_QRY";
  public final static  String S_ContactPerson = "CONTACT_PERSON";
  public final static  String S_ActionName = "ACTION_NAME";
  public final static  String S_ActionDesc = "ACTION_DESC";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_LimitNum = "LIMIT_NUM";
  public final static  String S_ActionContent = "ACTION_CONTENT";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_ActionType = "ACTION_TYPE";
  public final static  String S_ActionPlace = "ACTION_PLACE";
  public final static  String S_LastNameQry = "LAST_NAME_QRY";
  public final static  String S_BeginDate = "BEGIN_DATE";
  public final static  String S_ValueAmount = "VALUE_AMOUNT";
  public final static  String S_ClubId = "CLUB_ID";
  public final static  String S_LastName = "LAST_NAME";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_MiddleName = "MIDDLE_NAME";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_FirstNameQry = "FIRST_NAME_QRY";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_MiddleNameQry = "MIDDLE_NAME_QRY";
  public final static  String S_ParentActionId = "PARENT_ACTION_ID";
  public final static  String S_ActionId = "ACTION_ID";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmClubActionBean() throws AIException{
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

  public void initActionCode(String value){
     this.initProperty(S_ActionCode,value);
  }
  public  void setActionCode(String value){
     this.set(S_ActionCode,value);
  }
  public  void setActionCodeNull(){
     this.set(S_ActionCode,null);
  }

  public String getActionCode(){
       return DataType.getAsString(this.get(S_ActionCode));
  
  }
  public String getActionCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ActionCode));
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

  public void initEndDate(Timestamp value){
     this.initProperty(S_EndDate,value);
  }
  public  void setEndDate(Timestamp value){
     this.set(S_EndDate,value);
  }
  public  void setEndDateNull(){
     this.set(S_EndDate,null);
  }

  public Timestamp getEndDate(){
        return DataType.getAsDateTime(this.get(S_EndDate));
  
  }
  public Timestamp getEndDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_EndDate));
      }

  public void initContactPhone(String value){
     this.initProperty(S_ContactPhone,value);
  }
  public  void setContactPhone(String value){
     this.set(S_ContactPhone,value);
  }
  public  void setContactPhoneNull(){
     this.set(S_ContactPhone,null);
  }

  public String getContactPhone(){
       return DataType.getAsString(this.get(S_ContactPhone));
  
  }
  public String getContactPhoneInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContactPhone));
      }

  public void initValueType(int value){
     this.initProperty(S_ValueType,new Integer(value));
  }
  public  void setValueType(int value){
     this.set(S_ValueType,new Integer(value));
  }
  public  void setValueTypeNull(){
     this.set(S_ValueType,null);
  }

  public int getValueType(){
        return DataType.getAsInt(this.get(S_ValueType));
  
  }
  public int getValueTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ValueType));
      }

  public void initFirstName(String value){
     this.initProperty(S_FirstName,value);
  }
  public  void setFirstName(String value){
     this.set(S_FirstName,value);
  }
  public  void setFirstNameNull(){
     this.set(S_FirstName,null);
  }

  public String getFirstName(){
       return DataType.getAsString(this.get(S_FirstName));
  
  }
  public String getFirstNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FirstName));
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

  public void initContNameQry(String value){
     this.initProperty(S_ContNameQry,value);
  }
  public  void setContNameQry(String value){
     this.set(S_ContNameQry,value);
  }
  public  void setContNameQryNull(){
     this.set(S_ContNameQry,null);
  }

  public String getContNameQry(){
       return DataType.getAsString(this.get(S_ContNameQry));
  
  }
  public String getContNameQryInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContNameQry));
      }

  public void initContactPerson(String value){
     this.initProperty(S_ContactPerson,value);
  }
  public  void setContactPerson(String value){
     this.set(S_ContactPerson,value);
  }
  public  void setContactPersonNull(){
     this.set(S_ContactPerson,null);
  }

  public String getContactPerson(){
       return DataType.getAsString(this.get(S_ContactPerson));
  
  }
  public String getContactPersonInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContactPerson));
      }

  public void initActionName(String value){
     this.initProperty(S_ActionName,value);
  }
  public  void setActionName(String value){
     this.set(S_ActionName,value);
  }
  public  void setActionNameNull(){
     this.set(S_ActionName,null);
  }

  public String getActionName(){
       return DataType.getAsString(this.get(S_ActionName));
  
  }
  public String getActionNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ActionName));
      }

  public void initActionDesc(String value){
     this.initProperty(S_ActionDesc,value);
  }
  public  void setActionDesc(String value){
     this.set(S_ActionDesc,value);
  }
  public  void setActionDescNull(){
     this.set(S_ActionDesc,null);
  }

  public String getActionDesc(){
       return DataType.getAsString(this.get(S_ActionDesc));
  
  }
  public String getActionDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ActionDesc));
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

  public void initLimitNum(long value){
     this.initProperty(S_LimitNum,new Long(value));
  }
  public  void setLimitNum(long value){
     this.set(S_LimitNum,new Long(value));
  }
  public  void setLimitNumNull(){
     this.set(S_LimitNum,null);
  }

  public long getLimitNum(){
        return DataType.getAsLong(this.get(S_LimitNum));
  
  }
  public long getLimitNumInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_LimitNum));
      }

  public void initActionContent(String value){
     this.initProperty(S_ActionContent,value);
  }
  public  void setActionContent(String value){
     this.set(S_ActionContent,value);
  }
  public  void setActionContentNull(){
     this.set(S_ActionContent,null);
  }

  public String getActionContent(){
       return DataType.getAsString(this.get(S_ActionContent));
  
  }
  public String getActionContentInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ActionContent));
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

  public void initActionType(int value){
     this.initProperty(S_ActionType,new Integer(value));
  }
  public  void setActionType(int value){
     this.set(S_ActionType,new Integer(value));
  }
  public  void setActionTypeNull(){
     this.set(S_ActionType,null);
  }

  public int getActionType(){
        return DataType.getAsInt(this.get(S_ActionType));
  
  }
  public int getActionTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ActionType));
      }

  public void initActionPlace(String value){
     this.initProperty(S_ActionPlace,value);
  }
  public  void setActionPlace(String value){
     this.set(S_ActionPlace,value);
  }
  public  void setActionPlaceNull(){
     this.set(S_ActionPlace,null);
  }

  public String getActionPlace(){
       return DataType.getAsString(this.get(S_ActionPlace));
  
  }
  public String getActionPlaceInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ActionPlace));
      }

  public void initLastNameQry(String value){
     this.initProperty(S_LastNameQry,value);
  }
  public  void setLastNameQry(String value){
     this.set(S_LastNameQry,value);
  }
  public  void setLastNameQryNull(){
     this.set(S_LastNameQry,null);
  }

  public String getLastNameQry(){
       return DataType.getAsString(this.get(S_LastNameQry));
  
  }
  public String getLastNameQryInitialValue(){
        return DataType.getAsString(this.getOldObj(S_LastNameQry));
      }

  public void initBeginDate(Timestamp value){
     this.initProperty(S_BeginDate,value);
  }
  public  void setBeginDate(Timestamp value){
     this.set(S_BeginDate,value);
  }
  public  void setBeginDateNull(){
     this.set(S_BeginDate,null);
  }

  public Timestamp getBeginDate(){
        return DataType.getAsDateTime(this.get(S_BeginDate));
  
  }
  public Timestamp getBeginDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_BeginDate));
      }

  public void initValueAmount(long value){
     this.initProperty(S_ValueAmount,new Long(value));
  }
  public  void setValueAmount(long value){
     this.set(S_ValueAmount,new Long(value));
  }
  public  void setValueAmountNull(){
     this.set(S_ValueAmount,null);
  }

  public long getValueAmount(){
        return DataType.getAsLong(this.get(S_ValueAmount));
  
  }
  public long getValueAmountInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ValueAmount));
      }

  public void initClubId(long value){
     this.initProperty(S_ClubId,new Long(value));
  }
  public  void setClubId(long value){
     this.set(S_ClubId,new Long(value));
  }
  public  void setClubIdNull(){
     this.set(S_ClubId,null);
  }

  public long getClubId(){
        return DataType.getAsLong(this.get(S_ClubId));
  
  }
  public long getClubIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ClubId));
      }

  public void initLastName(String value){
     this.initProperty(S_LastName,value);
  }
  public  void setLastName(String value){
     this.set(S_LastName,value);
  }
  public  void setLastNameNull(){
     this.set(S_LastName,null);
  }

  public String getLastName(){
       return DataType.getAsString(this.get(S_LastName));
  
  }
  public String getLastNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_LastName));
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

  public void initMiddleName(String value){
     this.initProperty(S_MiddleName,value);
  }
  public  void setMiddleName(String value){
     this.set(S_MiddleName,value);
  }
  public  void setMiddleNameNull(){
     this.set(S_MiddleName,null);
  }

  public String getMiddleName(){
       return DataType.getAsString(this.get(S_MiddleName));
  
  }
  public String getMiddleNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_MiddleName));
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

  public void initFirstNameQry(String value){
     this.initProperty(S_FirstNameQry,value);
  }
  public  void setFirstNameQry(String value){
     this.set(S_FirstNameQry,value);
  }
  public  void setFirstNameQryNull(){
     this.set(S_FirstNameQry,null);
  }

  public String getFirstNameQry(){
       return DataType.getAsString(this.get(S_FirstNameQry));
  
  }
  public String getFirstNameQryInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FirstNameQry));
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

  public void initMiddleNameQry(String value){
     this.initProperty(S_MiddleNameQry,value);
  }
  public  void setMiddleNameQry(String value){
     this.set(S_MiddleNameQry,value);
  }
  public  void setMiddleNameQryNull(){
     this.set(S_MiddleNameQry,null);
  }

  public String getMiddleNameQry(){
       return DataType.getAsString(this.get(S_MiddleNameQry));
  
  }
  public String getMiddleNameQryInitialValue(){
        return DataType.getAsString(this.getOldObj(S_MiddleNameQry));
      }

  public void initParentActionId(long value){
     this.initProperty(S_ParentActionId,new Long(value));
  }
  public  void setParentActionId(long value){
     this.set(S_ParentActionId,new Long(value));
  }
  public  void setParentActionIdNull(){
     this.set(S_ParentActionId,null);
  }

  public long getParentActionId(){
        return DataType.getAsLong(this.get(S_ParentActionId));
  
  }
  public long getParentActionIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ParentActionId));
      }

  public void initActionId(long value){
     this.initProperty(S_ActionId,new Long(value));
  }
  public  void setActionId(long value){
     this.set(S_ActionId,new Long(value));
  }
  public  void setActionIdNull(){
     this.set(S_ActionId,null);
  }

  public long getActionId(){
        return DataType.getAsLong(this.get(S_ActionId));
  
  }
  public long getActionIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ActionId));
      }


 
 }

