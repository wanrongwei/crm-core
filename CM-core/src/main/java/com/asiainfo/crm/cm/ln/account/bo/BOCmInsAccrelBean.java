package com.asiainfo.crm.cm.ln.account.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.ln.account.ivalues.*;

public class BOCmInsAccrelBean extends DataContainer implements DataContainerInterface,IBOCmInsAccrelValue{

  private static String  m_boName = "com.asiainfo.crm.cm.ln.account.bo.BOCmInsAccrel";



  public final static  String S_MaxPay = "max_pay";
  public final static  String S_ExpireDate = "expire_date";
  public final static  String S_DoneDate = "done_date";
  public final static  String S_OutAcctPri = "out_acct_pri";
  public final static  String S_PayUserId = "pay_user_id";
  public final static  String S_State = "state";
  public final static  String S_RegionId = "region_id";
  public final static  String S_EffectiveDateType = "effective_date_type";
  public final static  String S_OfferInstId = "offer_inst_id";
  public final static  String S_Remarks = "remarks";
  public final static  String S_OpId = "op_id";
  public final static  String S_CreateDate = "create_date";
  public final static  String S_PayType = "pay_type";
  public final static  String S_PayValue = "pay_value";
  public final static  String S_UserId = "user_id";
  public final static  String S_ItemType = "item_type";
  public final static  String S_AcctRegionId = "acct_region_id";
  public final static  String S_OldAcctId = "old_acct_id";
  public final static  String S_DoneCode = "done_code";
  public final static  String S_TogetherFlag = "together_flag";
  public final static  String S_OrgId = "org_id";
  public final static  String S_ExpireDateType = "expire_date_type";
  public final static  String S_UserRegionId = "user_region_id";
  public final static  String S_ItemId = "item_id";
  public final static  String S_GrpSplitId = "grp_split_id";
  public final static  String S_PayMode = "pay_mode";
  public final static  String S_EffectiveDate = "effective_date";
  public final static  String S_AcctId = "acct_id";
  public final static  String S_AcctRelaId = "acct_rela_id";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmInsAccrelBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //姝ょ??版?瀹瑰?涓????疆涓??瀵硅薄绫诲?
   throw new AIException("Cannot reset ObjectType");
 }


  public void initMaxPay(long value){
     this.initProperty(S_MaxPay,new Long(value));
  }
  public  void setMaxPay(long value){
     this.set(S_MaxPay,new Long(value));
  }
  public  void setMaxPayNull(){
     this.set(S_MaxPay,null);
  }

  public long getMaxPay(){
        return DataType.getAsLong(this.get(S_MaxPay));
  
  }
  public long getMaxPayInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_MaxPay));
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

  public void initOutAcctPri(long value){
     this.initProperty(S_OutAcctPri,new Long(value));
  }
  public  void setOutAcctPri(long value){
     this.set(S_OutAcctPri,new Long(value));
  }
  public  void setOutAcctPriNull(){
     this.set(S_OutAcctPri,null);
  }

  public long getOutAcctPri(){
        return DataType.getAsLong(this.get(S_OutAcctPri));
  
  }
  public long getOutAcctPriInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_OutAcctPri));
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

  public void initState(long value){
     this.initProperty(S_State,new Long(value));
  }
  public  void setState(long value){
     this.set(S_State,new Long(value));
  }
  public  void setStateNull(){
     this.set(S_State,null);
  }

  public long getState(){
        return DataType.getAsLong(this.get(S_State));
  
  }
  public long getStateInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_State));
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

  public void initEffectiveDateType(long value){
     this.initProperty(S_EffectiveDateType,new Long(value));
  }
  public  void setEffectiveDateType(long value){
     this.set(S_EffectiveDateType,new Long(value));
  }
  public  void setEffectiveDateTypeNull(){
     this.set(S_EffectiveDateType,null);
  }

  public long getEffectiveDateType(){
        return DataType.getAsLong(this.get(S_EffectiveDateType));
  
  }
  public long getEffectiveDateTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_EffectiveDateType));
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

  public void initPayType(long value){
     this.initProperty(S_PayType,new Long(value));
  }
  public  void setPayType(long value){
     this.set(S_PayType,new Long(value));
  }
  public  void setPayTypeNull(){
     this.set(S_PayType,null);
  }

  public long getPayType(){
        return DataType.getAsLong(this.get(S_PayType));
  
  }
  public long getPayTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_PayType));
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

  public void initItemType(long value){
     this.initProperty(S_ItemType,new Long(value));
  }
  public  void setItemType(long value){
     this.set(S_ItemType,new Long(value));
  }
  public  void setItemTypeNull(){
     this.set(S_ItemType,null);
  }

  public long getItemType(){
        return DataType.getAsLong(this.get(S_ItemType));
  
  }
  public long getItemTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ItemType));
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

  public void initTogetherFlag(long value){
     this.initProperty(S_TogetherFlag,new Long(value));
  }
  public  void setTogetherFlag(long value){
     this.set(S_TogetherFlag,new Long(value));
  }
  public  void setTogetherFlagNull(){
     this.set(S_TogetherFlag,null);
  }

  public long getTogetherFlag(){
        return DataType.getAsLong(this.get(S_TogetherFlag));
  
  }
  public long getTogetherFlagInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_TogetherFlag));
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

  public void initExpireDateType(long value){
     this.initProperty(S_ExpireDateType,new Long(value));
  }
  public  void setExpireDateType(long value){
     this.set(S_ExpireDateType,new Long(value));
  }
  public  void setExpireDateTypeNull(){
     this.set(S_ExpireDateType,null);
  }

  public long getExpireDateType(){
        return DataType.getAsLong(this.get(S_ExpireDateType));
  
  }
  public long getExpireDateTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ExpireDateType));
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

  public void initGrpSplitId(long value){
     this.initProperty(S_GrpSplitId,new Long(value));
  }
  public  void setGrpSplitId(long value){
     this.set(S_GrpSplitId,new Long(value));
  }
  public  void setGrpSplitIdNull(){
     this.set(S_GrpSplitId,null);
  }

  public long getGrpSplitId(){
        return DataType.getAsLong(this.get(S_GrpSplitId));
  
  }
  public long getGrpSplitIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_GrpSplitId));
      }

  public void initPayMode(long value){
     this.initProperty(S_PayMode,new Long(value));
  }
  public  void setPayMode(long value){
     this.set(S_PayMode,new Long(value));
  }
  public  void setPayModeNull(){
     this.set(S_PayMode,null);
  }

  public long getPayMode(){
        return DataType.getAsLong(this.get(S_PayMode));
  
  }
  public long getPayModeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_PayMode));
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


 
 }

