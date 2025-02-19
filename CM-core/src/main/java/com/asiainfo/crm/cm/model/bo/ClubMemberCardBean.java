package com.asiainfo.crm.cm.model.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.model.ivalues.*;

public class ClubMemberCardBean extends DataContainer implements DataContainerInterface,IClubMemberCardValue{

  private static String  m_boName = "com.asiainfo.crm.cm.model.bo.ClubMemberCard";



  public final static  String S_State = "STATE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_CardSource = "CARD_SOURCE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CardCode = "CARD_CODE";
  public final static  String S_MemberId = "MEMBER_ID";
  public final static  String S_CardFlag = "CARD_FLAG";
  public final static  String S_DeliverRegion = "DELIVER_REGION";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_CardYear = "CARD_YEAR";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_DeliverDate = "DELIVER_DATE";
  public final static  String S_CardType = "CARD_TYPE";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_RecordId = "RECORD_ID";
  public final static  String S_CardLevel = "CARD_LEVEL";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public ClubMemberCardBean() throws AIException{
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

  public void initCardSource(int value){
     this.initProperty(S_CardSource,new Integer(value));
  }
  public  void setCardSource(int value){
     this.set(S_CardSource,new Integer(value));
  }
  public  void setCardSourceNull(){
     this.set(S_CardSource,null);
  }

  public int getCardSource(){
        return DataType.getAsInt(this.get(S_CardSource));
  
  }
  public int getCardSourceInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CardSource));
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

  public void initCardCode(String value){
     this.initProperty(S_CardCode,value);
  }
  public  void setCardCode(String value){
     this.set(S_CardCode,value);
  }
  public  void setCardCodeNull(){
     this.set(S_CardCode,null);
  }

  public String getCardCode(){
       return DataType.getAsString(this.get(S_CardCode));
  
  }
  public String getCardCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CardCode));
      }

  public void initMemberId(long value){
     this.initProperty(S_MemberId,new Long(value));
  }
  public  void setMemberId(long value){
     this.set(S_MemberId,new Long(value));
  }
  public  void setMemberIdNull(){
     this.set(S_MemberId,null);
  }

  public long getMemberId(){
        return DataType.getAsLong(this.get(S_MemberId));
  
  }
  public long getMemberIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_MemberId));
      }

  public void initCardFlag(int value){
     this.initProperty(S_CardFlag,new Integer(value));
  }
  public  void setCardFlag(int value){
     this.set(S_CardFlag,new Integer(value));
  }
  public  void setCardFlagNull(){
     this.set(S_CardFlag,null);
  }

  public int getCardFlag(){
        return DataType.getAsInt(this.get(S_CardFlag));
  
  }
  public int getCardFlagInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CardFlag));
      }

  public void initDeliverRegion(String value){
     this.initProperty(S_DeliverRegion,value);
  }
  public  void setDeliverRegion(String value){
     this.set(S_DeliverRegion,value);
  }
  public  void setDeliverRegionNull(){
     this.set(S_DeliverRegion,null);
  }

  public String getDeliverRegion(){
       return DataType.getAsString(this.get(S_DeliverRegion));
  
  }
  public String getDeliverRegionInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DeliverRegion));
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

  public void initCardYear(int value){
     this.initProperty(S_CardYear,new Integer(value));
  }
  public  void setCardYear(int value){
     this.set(S_CardYear,new Integer(value));
  }
  public  void setCardYearNull(){
     this.set(S_CardYear,null);
  }

  public int getCardYear(){
        return DataType.getAsInt(this.get(S_CardYear));
  
  }
  public int getCardYearInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CardYear));
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

  public void initDeliverDate(Timestamp value){
     this.initProperty(S_DeliverDate,value);
  }
  public  void setDeliverDate(Timestamp value){
     this.set(S_DeliverDate,value);
  }
  public  void setDeliverDateNull(){
     this.set(S_DeliverDate,null);
  }

  public Timestamp getDeliverDate(){
        return DataType.getAsDateTime(this.get(S_DeliverDate));
  
  }
  public Timestamp getDeliverDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_DeliverDate));
      }

  public void initCardType(int value){
     this.initProperty(S_CardType,new Integer(value));
  }
  public  void setCardType(int value){
     this.set(S_CardType,new Integer(value));
  }
  public  void setCardTypeNull(){
     this.set(S_CardType,null);
  }

  public int getCardType(){
        return DataType.getAsInt(this.get(S_CardType));
  
  }
  public int getCardTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CardType));
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

  public void initRecordId(long value){
     this.initProperty(S_RecordId,new Long(value));
  }
  public  void setRecordId(long value){
     this.set(S_RecordId,new Long(value));
  }
  public  void setRecordIdNull(){
     this.set(S_RecordId,null);
  }

  public long getRecordId(){
        return DataType.getAsLong(this.get(S_RecordId));
  
  }
  public long getRecordIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_RecordId));
      }

  public void initCardLevel(int value){
     this.initProperty(S_CardLevel,new Integer(value));
  }
  public  void setCardLevel(int value){
     this.set(S_CardLevel,new Integer(value));
  }
  public  void setCardLevelNull(){
     this.set(S_CardLevel,null);
  }

  public int getCardLevel(){
        return DataType.getAsInt(this.get(S_CardLevel));
  
  }
  public int getCardLevelInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CardLevel));
      }


 
 }

