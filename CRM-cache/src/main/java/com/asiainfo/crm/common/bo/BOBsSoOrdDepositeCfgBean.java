package com.asiainfo.crm.common.bo;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.*;
import com.asiainfo.crm.common.ivalues.IBOBsSoOrdDepositeCfgValue;

public class BOBsSoOrdDepositeCfgBean extends DataContainer implements DataContainerInterface, IBOBsSoOrdDepositeCfgValue {

  private static String  m_boName = "com.asiainfo.crm.common.bo.BOBsSoOrdDepositeCfg";



  public final static  String S_State = "STATE";
  public final static  String S_DealService = "DEAL_SERVICE";
  public final static  String S_ConfigId = "CONFIG_ID";
  public final static  String S_OfferId = "OFFER_ID";
  public final static  String S_CheckService = "CHECK_SERVICE";
  public final static  String S_AttrId = "ATTR_ID";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_ServiceId = "SERVICE_ID";
  public final static  String S_BusinessId = "BUSINESS_ID";
  public final static  String S_ProductType = "PRODUCT_TYPE";
  public final static  String S_ProductId = "PRODUCT_ID";
  public final static  String S_OfferType = "OFFER_TYPE";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOBsSoOrdDepositeCfgBean() throws AIException{
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

  public void initDealService(String value){
     this.initProperty(S_DealService,value);
  }
  public  void setDealService(String value){
     this.set(S_DealService,value);
  }
  public  void setDealServiceNull(){
     this.set(S_DealService,null);
  }

  public String getDealService(){
       return DataType.getAsString(this.get(S_DealService));
  
  }
  public String getDealServiceInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DealService));
      }

  public void initConfigId(int value){
     this.initProperty(S_ConfigId,new Integer(value));
  }
  public  void setConfigId(int value){
     this.set(S_ConfigId,new Integer(value));
  }
  public  void setConfigIdNull(){
     this.set(S_ConfigId,null);
  }

  public int getConfigId(){
        return DataType.getAsInt(this.get(S_ConfigId));
  
  }
  public int getConfigIdInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ConfigId));
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

  public void initCheckService(String value){
     this.initProperty(S_CheckService,value);
  }
  public  void setCheckService(String value){
     this.set(S_CheckService,value);
  }
  public  void setCheckServiceNull(){
     this.set(S_CheckService,null);
  }

  public String getCheckService(){
       return DataType.getAsString(this.get(S_CheckService));
  
  }
  public String getCheckServiceInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CheckService));
      }

  public void initAttrId(long value){
     this.initProperty(S_AttrId,new Long(value));
  }
  public  void setAttrId(long value){
     this.set(S_AttrId,new Long(value));
  }
  public  void setAttrIdNull(){
     this.set(S_AttrId,null);
  }

  public long getAttrId(){
        return DataType.getAsLong(this.get(S_AttrId));
  
  }
  public long getAttrIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_AttrId));
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

  public void initServiceId(long value){
     this.initProperty(S_ServiceId,new Long(value));
  }
  public  void setServiceId(long value){
     this.set(S_ServiceId,new Long(value));
  }
  public  void setServiceIdNull(){
     this.set(S_ServiceId,null);
  }

  public long getServiceId(){
        return DataType.getAsLong(this.get(S_ServiceId));
  
  }
  public long getServiceIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ServiceId));
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

  public void initProductType(String value){
     this.initProperty(S_ProductType,value);
  }
  public  void setProductType(String value){
     this.set(S_ProductType,value);
  }
  public  void setProductTypeNull(){
     this.set(S_ProductType,null);
  }

  public String getProductType(){
       return DataType.getAsString(this.get(S_ProductType));
  
  }
  public String getProductTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ProductType));
      }

  public void initProductId(long value){
     this.initProperty(S_ProductId,new Long(value));
  }
  public  void setProductId(long value){
     this.set(S_ProductId,new Long(value));
  }
  public  void setProductIdNull(){
     this.set(S_ProductId,null);
  }

  public long getProductId(){
        return DataType.getAsLong(this.get(S_ProductId));
  
  }
  public long getProductIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ProductId));
      }

  public void initOfferType(String value){
     this.initProperty(S_OfferType,value);
  }
  public  void setOfferType(String value){
     this.set(S_OfferType,value);
  }
  public  void setOfferTypeNull(){
     this.set(S_OfferType,null);
  }

  public String getOfferType(){
       return DataType.getAsString(this.get(S_OfferType));
  
  }
  public String getOfferTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OfferType));
      }


 
 }

