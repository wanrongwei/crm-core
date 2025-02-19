package com.asiainfo.crm.cm.model.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.model.ivalues.*;

public class SoAccrelBean extends DataContainer implements DataContainerInterface,ISoAccrelValue{

  private static String  m_boName = "com.asiainfo.crm.cm.model.bo.SoAccrel";



  public final static  String S_PayUserId = "PAY_USER_ID";
  public final static  String S_State = "STATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_UserRegionId = "USER_REGION_ID";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_AcctRegionId = "ACCT_REGION_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_TogetherFlag = "TOGETHER_FLAG";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_OfferInstId = "OFFER_INST_ID";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_OldAcctId = "OLD_ACCT_ID";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_EffectiveDateType = "EFFECTIVE_DATE_TYPE";
  public final static  String S_PayMode = "PAY_MODE";
  public final static  String S_ItemId = "ITEM_ID";
  public final static  String S_PayValue = "PAY_VALUE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_PayType = "PAY_TYPE";
  public final static  String S_OutAcctPri = "OUT_ACCT_PRI";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_AcctRelaId = "ACCT_RELA_ID";
  public final static  String S_ItemType = "ITEM_TYPE";
  public final static  String S_ExpireDateType = "EXPIRE_DATE_TYPE";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public SoAccrelBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initPayUserId(long value){
     this.initProperty(S_PayUserId,new Long(value));
  }
  public  void setPayUserId(long value){
     this.set(S_PayUserId,new Long(value));
  }
  public  void setPayUserIdNull(){
     this.set(S_PayUserId,null);
  }

  public long getPayUserId(){
        return DataType.getAsLong(this.get(S_PayUserId));
  
  }
  public long getPayUserIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_PayUserId));
      }

  public void initState(int value){
     this.initProperty(S_State,new Integer(value));
  }
  public  void setState(int value){
     this.set(S_State,new Integer(value));
  }
  public  void setStateNull(){
     this.set(S_State,null);
  }

  public int getState(){
        return DataType.getAsInt(this.get(S_State));
  
  }
  public int getStateInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_State));
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

  public void initUserRegionId(String value){
     this.initProperty(S_UserRegionId,value);
  }
  public  void setUserRegionId(String value){
     this.set(S_UserRegionId,value);
  }
  public  void setUserRegionIdNull(){
     this.set(S_UserRegionId,null);
  }

  public String getUserRegionId(){
       return DataType.getAsString(this.get(S_UserRegionId));
  
  }
  public String getUserRegionIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_UserRegionId));
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

  public void initTogetherFlag(int value){
     this.initProperty(S_TogetherFlag,new Integer(value));
  }
  public  void setTogetherFlag(int value){
     this.set(S_TogetherFlag,new Integer(value));
  }
  public  void setTogetherFlagNull(){
     this.set(S_TogetherFlag,null);
  }

  public int getTogetherFlag(){
        return DataType.getAsInt(this.get(S_TogetherFlag));
  
  }
  public int getTogetherFlagInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_TogetherFlag));
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

  public void initOfferInstId(long value){
     this.initProperty(S_OfferInstId,new Long(value));
  }
  public  void setOfferInstId(long value){
     this.set(S_OfferInstId,new Long(value));
  }
  public  void setOfferInstIdNull(){
     this.set(S_OfferInstId,null);
  }

  public long getOfferInstId(){
        return DataType.getAsLong(this.get(S_OfferInstId));
  
  }
  public long getOfferInstIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_OfferInstId));
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

  public void initOldAcctId(long value){
     this.initProperty(S_OldAcctId,new Long(value));
  }
  public  void setOldAcctId(long value){
     this.set(S_OldAcctId,new Long(value));
  }
  public  void setOldAcctIdNull(){
     this.set(S_OldAcctId,null);
  }

  public long getOldAcctId(){
        return DataType.getAsLong(this.get(S_OldAcctId));
  
  }
  public long getOldAcctIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_OldAcctId));
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

  public void initEffectiveDateType(int value){
     this.initProperty(S_EffectiveDateType,new Integer(value));
  }
  public  void setEffectiveDateType(int value){
     this.set(S_EffectiveDateType,new Integer(value));
  }
  public  void setEffectiveDateTypeNull(){
     this.set(S_EffectiveDateType,null);
  }

  public int getEffectiveDateType(){
        return DataType.getAsInt(this.get(S_EffectiveDateType));
  
  }
  public int getEffectiveDateTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_EffectiveDateType));
      }

  public void initPayMode(int value){
     this.initProperty(S_PayMode,new Integer(value));
  }
  public  void setPayMode(int value){
     this.set(S_PayMode,new Integer(value));
  }
  public  void setPayModeNull(){
     this.set(S_PayMode,null);
  }

  public int getPayMode(){
        return DataType.getAsInt(this.get(S_PayMode));
  
  }
  public int getPayModeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_PayMode));
      }

  public void initItemId(long value){
     this.initProperty(S_ItemId,new Long(value));
  }
  public  void setItemId(long value){
     this.set(S_ItemId,new Long(value));
  }
  public  void setItemIdNull(){
     this.set(S_ItemId,null);
  }

  public long getItemId(){
        return DataType.getAsLong(this.get(S_ItemId));
  
  }
  public long getItemIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ItemId));
      }

  public void initPayValue(long value){
     this.initProperty(S_PayValue,new Long(value));
  }
  public  void setPayValue(long value){
     this.set(S_PayValue,new Long(value));
  }
  public  void setPayValueNull(){
     this.set(S_PayValue,null);
  }

  public long getPayValue(){
        return DataType.getAsLong(this.get(S_PayValue));
  
  }
  public long getPayValueInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_PayValue));
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

  public void initPayType(int value){
     this.initProperty(S_PayType,new Integer(value));
  }
  public  void setPayType(int value){
     this.set(S_PayType,new Integer(value));
  }
  public  void setPayTypeNull(){
     this.set(S_PayType,null);
  }

  public int getPayType(){
        return DataType.getAsInt(this.get(S_PayType));
  
  }
  public int getPayTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_PayType));
      }

  public void initOutAcctPri(int value){
     this.initProperty(S_OutAcctPri,new Integer(value));
  }
  public  void setOutAcctPri(int value){
     this.set(S_OutAcctPri,new Integer(value));
  }
  public  void setOutAcctPriNull(){
     this.set(S_OutAcctPri,null);
  }

  public int getOutAcctPri(){
        return DataType.getAsInt(this.get(S_OutAcctPri));
  
  }
  public int getOutAcctPriInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_OutAcctPri));
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

  public void initAcctRelaId(long value){
     this.initProperty(S_AcctRelaId,new Long(value));
  }
  public  void setAcctRelaId(long value){
     this.set(S_AcctRelaId,new Long(value));
  }
  public  void setAcctRelaIdNull(){
     this.set(S_AcctRelaId,null);
  }

  public long getAcctRelaId(){
        return DataType.getAsLong(this.get(S_AcctRelaId));
  
  }
  public long getAcctRelaIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_AcctRelaId));
      }

  public void initItemType(int value){
     this.initProperty(S_ItemType,new Integer(value));
  }
  public  void setItemType(int value){
     this.set(S_ItemType,new Integer(value));
  }
  public  void setItemTypeNull(){
     this.set(S_ItemType,null);
  }

  public int getItemType(){
        return DataType.getAsInt(this.get(S_ItemType));
  
  }
  public int getItemTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ItemType));
      }

  public void initExpireDateType(int value){
     this.initProperty(S_ExpireDateType,new Integer(value));
  }
  public  void setExpireDateType(int value){
     this.set(S_ExpireDateType,new Integer(value));
  }
  public  void setExpireDateTypeNull(){
     this.set(S_ExpireDateType,null);
  }

  public int getExpireDateType(){
        return DataType.getAsInt(this.get(S_ExpireDateType));
  
  }
  public int getExpireDateTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ExpireDateType));
      }


 
 }

