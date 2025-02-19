package com.asiainfo.crm.cm.bi2oneframe.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.bi2oneframe.ivalues.*;

public class BOCmUserBean extends DataContainer implements DataContainerInterface,IBOCmUserValue{

  private static String  m_boName = "com.asiainfo.crm.cm.bi2oneframe.bo.BOCmUser";



  public final static  String S_State = "STATE";
  public final static  String S_ScreenSize = "SCREEN_SIZE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_IsMobilePay = "IS_MOBILE_PAY";
  public final static  String S_Fetion = "FETION";
  public final static  String S_DownloadWap = "DOWNLOAD_WAP";
  public final static  String S_MobileEmail = "MOBILE_EMAIL";
  public final static  String S_MarketTime = "MARKET_TIME";
  public final static  String S_Version = "VERSION";
  public final static  String S_DataId = "DATA_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_Kjava = "KJAVA";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_IsMobileTvWap = "IS_MOBILE_TV_WAP";
  public final static  String S_IsMobileTvClient = "IS_MOBILE_TV_CLIENT";
  public final static  String S_Mms = "MMS";
  public final static  String S_MobileSecurity = "MOBILE_SECURITY";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_DownloadMethod = "DOWNLOAD_METHOD";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_Wap = "WAP";
  public final static  String S_System = "SYSTEM";
  public final static  String S_Gprs = "GPRS";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_CreateVestDepartement = "CREATE_VEST_DEPARTEMENT";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_Brand = "BRAND";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmUserBean() throws AIException{
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

  public void initScreenSize(String value){
     this.initProperty(S_ScreenSize,value);
  }
  public  void setScreenSize(String value){
     this.set(S_ScreenSize,value);
  }
  public  void setScreenSizeNull(){
     this.set(S_ScreenSize,null);
  }

  public String getScreenSize(){
       return DataType.getAsString(this.get(S_ScreenSize));
  
  }
  public String getScreenSizeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ScreenSize));
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

  public void initIsMobilePay(String value){
     this.initProperty(S_IsMobilePay,value);
  }
  public  void setIsMobilePay(String value){
     this.set(S_IsMobilePay,value);
  }
  public  void setIsMobilePayNull(){
     this.set(S_IsMobilePay,null);
  }

  public String getIsMobilePay(){
       return DataType.getAsString(this.get(S_IsMobilePay));
  
  }
  public String getIsMobilePayInitialValue(){
        return DataType.getAsString(this.getOldObj(S_IsMobilePay));
      }

  public void initFetion(String value){
     this.initProperty(S_Fetion,value);
  }
  public  void setFetion(String value){
     this.set(S_Fetion,value);
  }
  public  void setFetionNull(){
     this.set(S_Fetion,null);
  }

  public String getFetion(){
       return DataType.getAsString(this.get(S_Fetion));
  
  }
  public String getFetionInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Fetion));
      }

  public void initDownloadWap(String value){
     this.initProperty(S_DownloadWap,value);
  }
  public  void setDownloadWap(String value){
     this.set(S_DownloadWap,value);
  }
  public  void setDownloadWapNull(){
     this.set(S_DownloadWap,null);
  }

  public String getDownloadWap(){
       return DataType.getAsString(this.get(S_DownloadWap));
  
  }
  public String getDownloadWapInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DownloadWap));
      }

  public void initMobileEmail(String value){
     this.initProperty(S_MobileEmail,value);
  }
  public  void setMobileEmail(String value){
     this.set(S_MobileEmail,value);
  }
  public  void setMobileEmailNull(){
     this.set(S_MobileEmail,null);
  }

  public String getMobileEmail(){
       return DataType.getAsString(this.get(S_MobileEmail));
  
  }
  public String getMobileEmailInitialValue(){
        return DataType.getAsString(this.getOldObj(S_MobileEmail));
      }

  public void initMarketTime(Timestamp value){
     this.initProperty(S_MarketTime,value);
  }
  public  void setMarketTime(Timestamp value){
     this.set(S_MarketTime,value);
  }
  public  void setMarketTimeNull(){
     this.set(S_MarketTime,null);
  }

  public Timestamp getMarketTime(){
        return DataType.getAsDateTime(this.get(S_MarketTime));
  
  }
  public Timestamp getMarketTimeInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_MarketTime));
      }

  public void initVersion(String value){
     this.initProperty(S_Version,value);
  }
  public  void setVersion(String value){
     this.set(S_Version,value);
  }
  public  void setVersionNull(){
     this.set(S_Version,null);
  }

  public String getVersion(){
       return DataType.getAsString(this.get(S_Version));
  
  }
  public String getVersionInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Version));
      }

  public void initDataId(long value){
     this.initProperty(S_DataId,new Long(value));
  }
  public  void setDataId(long value){
     this.set(S_DataId,new Long(value));
  }
  public  void setDataIdNull(){
     this.set(S_DataId,null);
  }

  public long getDataId(){
        return DataType.getAsLong(this.get(S_DataId));
  
  }
  public long getDataIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_DataId));
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

  public void initKjava(String value){
     this.initProperty(S_Kjava,value);
  }
  public  void setKjava(String value){
     this.set(S_Kjava,value);
  }
  public  void setKjavaNull(){
     this.set(S_Kjava,null);
  }

  public String getKjava(){
       return DataType.getAsString(this.get(S_Kjava));
  
  }
  public String getKjavaInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Kjava));
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

  public void initIsMobileTvWap(String value){
     this.initProperty(S_IsMobileTvWap,value);
  }
  public  void setIsMobileTvWap(String value){
     this.set(S_IsMobileTvWap,value);
  }
  public  void setIsMobileTvWapNull(){
     this.set(S_IsMobileTvWap,null);
  }

  public String getIsMobileTvWap(){
       return DataType.getAsString(this.get(S_IsMobileTvWap));
  
  }
  public String getIsMobileTvWapInitialValue(){
        return DataType.getAsString(this.getOldObj(S_IsMobileTvWap));
      }

  public void initIsMobileTvClient(String value){
     this.initProperty(S_IsMobileTvClient,value);
  }
  public  void setIsMobileTvClient(String value){
     this.set(S_IsMobileTvClient,value);
  }
  public  void setIsMobileTvClientNull(){
     this.set(S_IsMobileTvClient,null);
  }

  public String getIsMobileTvClient(){
       return DataType.getAsString(this.get(S_IsMobileTvClient));
  
  }
  public String getIsMobileTvClientInitialValue(){
        return DataType.getAsString(this.getOldObj(S_IsMobileTvClient));
      }

  public void initMms(String value){
     this.initProperty(S_Mms,value);
  }
  public  void setMms(String value){
     this.set(S_Mms,value);
  }
  public  void setMmsNull(){
     this.set(S_Mms,null);
  }

  public String getMms(){
       return DataType.getAsString(this.get(S_Mms));
  
  }
  public String getMmsInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Mms));
      }

  public void initMobileSecurity(String value){
     this.initProperty(S_MobileSecurity,value);
  }
  public  void setMobileSecurity(String value){
     this.set(S_MobileSecurity,value);
  }
  public  void setMobileSecurityNull(){
     this.set(S_MobileSecurity,null);
  }

  public String getMobileSecurity(){
       return DataType.getAsString(this.get(S_MobileSecurity));
  
  }
  public String getMobileSecurityInitialValue(){
        return DataType.getAsString(this.getOldObj(S_MobileSecurity));
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

  public void initDownloadMethod(String value){
     this.initProperty(S_DownloadMethod,value);
  }
  public  void setDownloadMethod(String value){
     this.set(S_DownloadMethod,value);
  }
  public  void setDownloadMethodNull(){
     this.set(S_DownloadMethod,null);
  }

  public String getDownloadMethod(){
       return DataType.getAsString(this.get(S_DownloadMethod));
  
  }
  public String getDownloadMethodInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DownloadMethod));
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

  public void initWap(String value){
     this.initProperty(S_Wap,value);
  }
  public  void setWap(String value){
     this.set(S_Wap,value);
  }
  public  void setWapNull(){
     this.set(S_Wap,null);
  }

  public String getWap(){
       return DataType.getAsString(this.get(S_Wap));
  
  }
  public String getWapInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Wap));
      }

  public void initSystem(String value){
     this.initProperty(S_System,value);
  }
  public  void setSystem(String value){
     this.set(S_System,value);
  }
  public  void setSystemNull(){
     this.set(S_System,null);
  }

  public String getSystem(){
       return DataType.getAsString(this.get(S_System));
  
  }
  public String getSystemInitialValue(){
        return DataType.getAsString(this.getOldObj(S_System));
      }

  public void initGprs(String value){
     this.initProperty(S_Gprs,value);
  }
  public  void setGprs(String value){
     this.set(S_Gprs,value);
  }
  public  void setGprsNull(){
     this.set(S_Gprs,null);
  }

  public String getGprs(){
       return DataType.getAsString(this.get(S_Gprs));
  
  }
  public String getGprsInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Gprs));
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

  public void initCreateVestDepartement(String value){
     this.initProperty(S_CreateVestDepartement,value);
  }
  public  void setCreateVestDepartement(String value){
     this.set(S_CreateVestDepartement,value);
  }
  public  void setCreateVestDepartementNull(){
     this.set(S_CreateVestDepartement,null);
  }

  public String getCreateVestDepartement(){
       return DataType.getAsString(this.get(S_CreateVestDepartement));
  
  }
  public String getCreateVestDepartementInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CreateVestDepartement));
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

  public void initBrand(String value){
     this.initProperty(S_Brand,value);
  }
  public  void setBrand(String value){
     this.set(S_Brand,value);
  }
  public  void setBrandNull(){
     this.set(S_Brand,null);
  }

  public String getBrand(){
       return DataType.getAsString(this.get(S_Brand));
  
  }
  public String getBrandInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Brand));
      }


 
 }

