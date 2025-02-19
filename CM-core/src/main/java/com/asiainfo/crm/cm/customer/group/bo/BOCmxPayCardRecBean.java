package com.asiainfo.crm.cm.customer.group.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.customer.group.ivalues.*;

public class BOCmxPayCardRecBean extends DataContainer implements DataContainerInterface,IBOCmxPayCardRecValue{

  private static String  m_boName = "com.asiainfo.crm.cm.customer.group.bo.BOCmxPayCardRec";



  public final static  String S_State = "STATE";
  public final static  String S_OldProcessNo = "OLD_PROCESS_NO";
  public final static  String S_GroupCountyId = "GROUP_COUNTY_ID";
  public final static  String S_RecId = "REC_ID";
  public final static  String S_TradeTime = "TRADE_TIME";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_ValidCount = "VALID_COUNT";
  public final static  String S_NumExt1 = "NUM_EXT1";
  public final static  String S_NumExt3 = "NUM_EXT3";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_NumExt2 = "NUM_EXT2";
  public final static  String S_Notes = "NOTES";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_DiscountMoney = "DISCOUNT_MONEY";
  public final static  String S_SaleId = "SALE_ID";
  public final static  String S_CardMoney = "CARD_MONEY";
  public final static  String S_BusiCode = "BUSI_CODE";
  public final static  String S_EndCardno = "END_CARDNO";
  public final static  String S_GroupCustId = "GROUP_CUST_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_ProcessNo = "PROCESS_NO";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_CustName = "CUST_NAME";
  public final static  String S_BackProcessNo = "BACK_PROCESS_NO";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_SaleMoney = "SALE_MONEY";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_GroupRegionId = "GROUP_REGION_ID";
  public final static  String S_BeginCardno = "BEGIN_CARDNO";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmxPayCardRecBean() throws AIException{
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

  public void initOldProcessNo(long value){
     this.initProperty(S_OldProcessNo,new Long(value));
  }
  public  void setOldProcessNo(long value){
     this.set(S_OldProcessNo,new Long(value));
  }
  public  void setOldProcessNoNull(){
     this.set(S_OldProcessNo,null);
  }

  public long getOldProcessNo(){
        return DataType.getAsLong(this.get(S_OldProcessNo));
  
  }
  public long getOldProcessNoInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_OldProcessNo));
      }

  public void initGroupCountyId(String value){
     this.initProperty(S_GroupCountyId,value);
  }
  public  void setGroupCountyId(String value){
     this.set(S_GroupCountyId,value);
  }
  public  void setGroupCountyIdNull(){
     this.set(S_GroupCountyId,null);
  }

  public String getGroupCountyId(){
       return DataType.getAsString(this.get(S_GroupCountyId));
  
  }
  public String getGroupCountyIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_GroupCountyId));
      }

  public void initRecId(String value){
     this.initProperty(S_RecId,value);
  }
  public  void setRecId(String value){
     this.set(S_RecId,value);
  }
  public  void setRecIdNull(){
     this.set(S_RecId,null);
  }

  public String getRecId(){
       return DataType.getAsString(this.get(S_RecId));
  
  }
  public String getRecIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_RecId));
      }

  public void initTradeTime(Timestamp value){
     this.initProperty(S_TradeTime,value);
  }
  public  void setTradeTime(Timestamp value){
     this.set(S_TradeTime,value);
  }
  public  void setTradeTimeNull(){
     this.set(S_TradeTime,null);
  }

  public Timestamp getTradeTime(){
        return DataType.getAsDateTime(this.get(S_TradeTime));
  
  }
  public Timestamp getTradeTimeInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_TradeTime));
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

  public void initValidCount(long value){
     this.initProperty(S_ValidCount,new Long(value));
  }
  public  void setValidCount(long value){
     this.set(S_ValidCount,new Long(value));
  }
  public  void setValidCountNull(){
     this.set(S_ValidCount,null);
  }

  public long getValidCount(){
        return DataType.getAsLong(this.get(S_ValidCount));
  
  }
  public long getValidCountInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ValidCount));
      }

  public void initNumExt1(long value){
     this.initProperty(S_NumExt1,new Long(value));
  }
  public  void setNumExt1(long value){
     this.set(S_NumExt1,new Long(value));
  }
  public  void setNumExt1Null(){
     this.set(S_NumExt1,null);
  }

  public long getNumExt1(){
        return DataType.getAsLong(this.get(S_NumExt1));
  
  }
  public long getNumExt1InitialValue(){
        return DataType.getAsLong(this.getOldObj(S_NumExt1));
      }

  public void initNumExt3(long value){
     this.initProperty(S_NumExt3,new Long(value));
  }
  public  void setNumExt3(long value){
     this.set(S_NumExt3,new Long(value));
  }
  public  void setNumExt3Null(){
     this.set(S_NumExt3,null);
  }

  public long getNumExt3(){
        return DataType.getAsLong(this.get(S_NumExt3));
  
  }
  public long getNumExt3InitialValue(){
        return DataType.getAsLong(this.getOldObj(S_NumExt3));
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

  public void initNumExt2(long value){
     this.initProperty(S_NumExt2,new Long(value));
  }
  public  void setNumExt2(long value){
     this.set(S_NumExt2,new Long(value));
  }
  public  void setNumExt2Null(){
     this.set(S_NumExt2,null);
  }

  public long getNumExt2(){
        return DataType.getAsLong(this.get(S_NumExt2));
  
  }
  public long getNumExt2InitialValue(){
        return DataType.getAsLong(this.getOldObj(S_NumExt2));
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

  public void initDiscountMoney(long value){
     this.initProperty(S_DiscountMoney,new Long(value));
  }
  public  void setDiscountMoney(long value){
     this.set(S_DiscountMoney,new Long(value));
  }
  public  void setDiscountMoneyNull(){
     this.set(S_DiscountMoney,null);
  }

  public long getDiscountMoney(){
        return DataType.getAsLong(this.get(S_DiscountMoney));
  
  }
  public long getDiscountMoneyInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_DiscountMoney));
      }

  public void initSaleId(long value){
     this.initProperty(S_SaleId,new Long(value));
  }
  public  void setSaleId(long value){
     this.set(S_SaleId,new Long(value));
  }
  public  void setSaleIdNull(){
     this.set(S_SaleId,null);
  }

  public long getSaleId(){
        return DataType.getAsLong(this.get(S_SaleId));
  
  }
  public long getSaleIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_SaleId));
      }

  public void initCardMoney(long value){
     this.initProperty(S_CardMoney,new Long(value));
  }
  public  void setCardMoney(long value){
     this.set(S_CardMoney,new Long(value));
  }
  public  void setCardMoneyNull(){
     this.set(S_CardMoney,null);
  }

  public long getCardMoney(){
        return DataType.getAsLong(this.get(S_CardMoney));
  
  }
  public long getCardMoneyInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CardMoney));
      }

  public void initBusiCode(long value){
     this.initProperty(S_BusiCode,new Long(value));
  }
  public  void setBusiCode(long value){
     this.set(S_BusiCode,new Long(value));
  }
  public  void setBusiCodeNull(){
     this.set(S_BusiCode,null);
  }

  public long getBusiCode(){
        return DataType.getAsLong(this.get(S_BusiCode));
  
  }
  public long getBusiCodeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_BusiCode));
      }

  public void initEndCardno(String value){
     this.initProperty(S_EndCardno,value);
  }
  public  void setEndCardno(String value){
     this.set(S_EndCardno,value);
  }
  public  void setEndCardnoNull(){
     this.set(S_EndCardno,null);
  }

  public String getEndCardno(){
       return DataType.getAsString(this.get(S_EndCardno));
  
  }
  public String getEndCardnoInitialValue(){
        return DataType.getAsString(this.getOldObj(S_EndCardno));
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

  public void initProcessNo(String value){
     this.initProperty(S_ProcessNo,value);
  }
  public  void setProcessNo(String value){
     this.set(S_ProcessNo,value);
  }
  public  void setProcessNoNull(){
     this.set(S_ProcessNo,null);
  }

  public String getProcessNo(){
       return DataType.getAsString(this.get(S_ProcessNo));
  
  }
  public String getProcessNoInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ProcessNo));
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

  public void initCustName(String value){
     this.initProperty(S_CustName,value);
  }
  public  void setCustName(String value){
     this.set(S_CustName,value);
  }
  public  void setCustNameNull(){
     this.set(S_CustName,null);
  }

  public String getCustName(){
       return DataType.getAsString(this.get(S_CustName));
  
  }
  public String getCustNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CustName));
      }

  public void initBackProcessNo(String value){
     this.initProperty(S_BackProcessNo,value);
  }
  public  void setBackProcessNo(String value){
     this.set(S_BackProcessNo,value);
  }
  public  void setBackProcessNoNull(){
     this.set(S_BackProcessNo,null);
  }

  public String getBackProcessNo(){
       return DataType.getAsString(this.get(S_BackProcessNo));
  
  }
  public String getBackProcessNoInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BackProcessNo));
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

  public void initSaleMoney(long value){
     this.initProperty(S_SaleMoney,new Long(value));
  }
  public  void setSaleMoney(long value){
     this.set(S_SaleMoney,new Long(value));
  }
  public  void setSaleMoneyNull(){
     this.set(S_SaleMoney,null);
  }

  public long getSaleMoney(){
        return DataType.getAsLong(this.get(S_SaleMoney));
  
  }
  public long getSaleMoneyInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_SaleMoney));
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

  public void initGroupRegionId(String value){
     this.initProperty(S_GroupRegionId,value);
  }
  public  void setGroupRegionId(String value){
     this.set(S_GroupRegionId,value);
  }
  public  void setGroupRegionIdNull(){
     this.set(S_GroupRegionId,null);
  }

  public String getGroupRegionId(){
       return DataType.getAsString(this.get(S_GroupRegionId));
  
  }
  public String getGroupRegionIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_GroupRegionId));
      }

  public void initBeginCardno(String value){
     this.initProperty(S_BeginCardno,value);
  }
  public  void setBeginCardno(String value){
     this.set(S_BeginCardno,value);
  }
  public  void setBeginCardnoNull(){
     this.set(S_BeginCardno,null);
  }

  public String getBeginCardno(){
       return DataType.getAsString(this.get(S_BeginCardno));
  
  }
  public String getBeginCardnoInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BeginCardno));
      }


 
 }

