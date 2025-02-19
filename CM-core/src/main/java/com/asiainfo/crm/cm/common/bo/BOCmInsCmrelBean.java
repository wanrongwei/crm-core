package com.asiainfo.crm.cm.common.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.common.ivalues.*;

public class BOCmInsCmrelBean extends DataContainer implements DataContainerInterface,IBOCmInsCmrelValue{

  private static String  m_boName = "com.asiainfo.crm.cm.common.bo.BOCmInsCmrel";



  public final static  String S_State = "STATE";
  public final static  String S_RelaType = "RELA_TYPE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_EffectiveDateType = "EFFECTIVE_DATE_TYPE";
  public final static  String S_UserRegionCode = "USER_REGION_CODE";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_ProdCatalogId = "PROD_CATALOG_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_Action = "ACTION";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_IsAssigned = "IS_ASSIGNED";
  public final static  String S_UserType = "USER_TYPE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_User = "USER";
  public final static  String S_CmrelId = "CMREL_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_OfferId = "OFFER_ID";
  public final static  String S_ExpireDateType = "EXPIRE_DATE_TYPE";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_Ext1 = "EXT1";
  public final static  String S_Ext2 = "EXT2";
  public final static  String S_Ext3 = "EXT3";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmInsCmrelBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
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

  public void initRelaType(long value){
     this.initProperty(S_RelaType,new Long(value));
  }
  public  void setRelaType(long value){
     this.set(S_RelaType,new Long(value));
  }
  public  void setRelaTypeNull(){
     this.set(S_RelaType,null);
  }

  public long getRelaType(){
        return DataType.getAsLong(this.get(S_RelaType));
  
  }
  public long getRelaTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_RelaType));
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

  public void initUserRegionCode(String value){
     this.initProperty(S_UserRegionCode,value);
  }
  public  void setUserRegionCode(String value){
     this.set(S_UserRegionCode,value);
  }
  public  void setUserRegionCodeNull(){
     this.set(S_UserRegionCode,null);
  }

  public String getUserRegionCode(){
       return DataType.getAsString(this.get(S_UserRegionCode));
  
  }
  public String getUserRegionCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_UserRegionCode));
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

  public void initProdCatalogId(long value){
     this.initProperty(S_ProdCatalogId,new Long(value));
  }
  public  void setProdCatalogId(long value){
     this.set(S_ProdCatalogId,new Long(value));
  }
  public  void setProdCatalogIdNull(){
     this.set(S_ProdCatalogId,null);
  }

  public long getProdCatalogId(){
        return DataType.getAsLong(this.get(S_ProdCatalogId));
  
  }
  public long getProdCatalogIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ProdCatalogId));
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

  public void initIsAssigned(int value){
     this.initProperty(S_IsAssigned,new Integer(value));
  }
  public  void setIsAssigned(int value){
     this.set(S_IsAssigned,new Integer(value));
  }
  public  void setIsAssignedNull(){
     this.set(S_IsAssigned,null);
  }

  public int getIsAssigned(){
        return DataType.getAsInt(this.get(S_IsAssigned));
  
  }
  public int getIsAssignedInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IsAssigned));
      }

  public void initUserType(long value){
     this.initProperty(S_UserType,new Long(value));
  }
  public  void setUserType(long value){
     this.set(S_UserType,new Long(value));
  }
  public  void setUserTypeNull(){
     this.set(S_UserType,null);
  }

  public long getUserType(){
        return DataType.getAsLong(this.get(S_UserType));
  
  }
  public long getUserTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_UserType));
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

  public void initUser(String value){
     this.initProperty(S_User,value);
  }
  public  void setUser(String value){
     this.set(S_User,value);
  }
  public  void setUserNull(){
     this.set(S_User,null);
  }

  public String getUser(){
       return DataType.getAsString(this.get(S_User));
  
  }
  public String getUserInitialValue(){
        return DataType.getAsString(this.getOldObj(S_User));
      }

  public void initCmrelId(long value){
     this.initProperty(S_CmrelId,new Long(value));
  }
  public  void setCmrelId(long value){
     this.set(S_CmrelId,new Long(value));
  }
  public  void setCmrelIdNull(){
     this.set(S_CmrelId,null);
  }

  public long getCmrelId(){
        return DataType.getAsLong(this.get(S_CmrelId));
  
  }
  public long getCmrelIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CmrelId));
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

  public void initOfferId(long value){
     this.initProperty(S_OfferId,new Long(value));
  }
  public  void setOfferId(long value){
     this.set(S_OfferId,new Long(value));
  }
  public  void setOfferIdNull(){
     this.set(S_OfferId,null);
  }

  public long getOfferId(){
        return DataType.getAsLong(this.get(S_OfferId));
  
  }
  public long getOfferIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_OfferId));
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

  public void initExt1(String value){
     this.initProperty(S_Ext1,value);
  }
  public  void setExt1(String value){
     this.set(S_Ext1,value);
  }
  public  void setExt1Null(){
     this.set(S_Ext1,null);
  }

  public String getExt1(){
       return DataType.getAsString(this.get(S_Ext1));
  
  }
  public String getExt1InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext1));
      }

  public void initExt2(String value){
     this.initProperty(S_Ext2,value);
  }
  public  void setExt2(String value){
     this.set(S_Ext2,value);
  }
  public  void setExt2Null(){
     this.set(S_Ext2,null);
  }

  public String getExt2(){
       return DataType.getAsString(this.get(S_Ext2));
  
  }
  public String getExt2InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext2));
      }

  public void initExt3(String value){
     this.initProperty(S_Ext3,value);
  }
  public  void setExt3(String value){
     this.set(S_Ext3,value);
  }
  public  void setExt3Null(){
     this.set(S_Ext3,null);
  }

  public String getExt3(){
       return DataType.getAsString(this.get(S_Ext3));
  
  }
  public String getExt3InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext3));
      }


 
 }

