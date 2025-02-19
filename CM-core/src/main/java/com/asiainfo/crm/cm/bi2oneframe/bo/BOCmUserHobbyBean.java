package com.asiainfo.crm.cm.bi2oneframe.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.bi2oneframe.ivalues.*;

public class BOCmUserHobbyBean extends DataContainer implements DataContainerInterface,IBOCmUserHobbyValue{

  private static String  m_boName = "com.asiainfo.crm.cm.bi2oneframe.bo.BOCmUserHobby";



  public final static  String S_State = "STATE";
  public final static  String S_Shopping = "SHOPPING";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_RankSales = "RANK_SALES";
  public final static  String S_Cater = "CATER";
  public final static  String S_MobileGoodNews = "MOBILE_GOOD_NEWS";
  public final static  String S_Fetion = "FETION";
  public final static  String S_Gift = "GIFT";
  public final static  String S_ShopCard = "SHOP_CARD";
  public final static  String S_MobileEmail = "MOBILE_EMAIL";
  public final static  String S_QuanQu = "QUAN_QU";
  public final static  String S_Crbt = "CRBT";
  public final static  String S_DataId = "DATA_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_Consulting = "CONSULTING";
  public final static  String S_HotPoint = "HOT_POINT";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_Mms = "MMS";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_LotterySales = "LOTTERY_SALES";
  public final static  String S_Wap = "WAP";
  public final static  String S_Sport = "SPORT";
  public final static  String S_Movie = "MOVIE";
  public final static  String S_FirstGet = "FIRST_GET";
  public final static  String S_JoinSalesNum = "JOIN_SALES_NUM";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_DailyMarketing = "DAILY_MARKETING";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_GeneralSales = "GENERAL_SALES";
  public final static  String S_CreateVestDepartement = "CREATE_VEST_DEPARTEMENT";
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
  public BOCmUserHobbyBean() throws AIException{
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

  public void initShopping(double value){
     this.initProperty(S_Shopping,new Double(value));
  }
  public  void setShopping(double value){
     this.set(S_Shopping,new Double(value));
  }
  public  void setShoppingNull(){
     this.set(S_Shopping,null);
  }

  public double getShopping(){
        return DataType.getAsDouble(this.get(S_Shopping));
  
  }
  public double getShoppingInitialValue(){
        return DataType.getAsDouble(this.getOldObj(S_Shopping));
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

  public void initRankSales(double value){
     this.initProperty(S_RankSales,new Double(value));
  }
  public  void setRankSales(double value){
     this.set(S_RankSales,new Double(value));
  }
  public  void setRankSalesNull(){
     this.set(S_RankSales,null);
  }

  public double getRankSales(){
        return DataType.getAsDouble(this.get(S_RankSales));
  
  }
  public double getRankSalesInitialValue(){
        return DataType.getAsDouble(this.getOldObj(S_RankSales));
      }

  public void initCater(double value){
     this.initProperty(S_Cater,new Double(value));
  }
  public  void setCater(double value){
     this.set(S_Cater,new Double(value));
  }
  public  void setCaterNull(){
     this.set(S_Cater,null);
  }

  public double getCater(){
        return DataType.getAsDouble(this.get(S_Cater));
  
  }
  public double getCaterInitialValue(){
        return DataType.getAsDouble(this.getOldObj(S_Cater));
      }

  public void initMobileGoodNews(double value){
     this.initProperty(S_MobileGoodNews,new Double(value));
  }
  public  void setMobileGoodNews(double value){
     this.set(S_MobileGoodNews,new Double(value));
  }
  public  void setMobileGoodNewsNull(){
     this.set(S_MobileGoodNews,null);
  }

  public double getMobileGoodNews(){
        return DataType.getAsDouble(this.get(S_MobileGoodNews));
  
  }
  public double getMobileGoodNewsInitialValue(){
        return DataType.getAsDouble(this.getOldObj(S_MobileGoodNews));
      }

  public void initFetion(double value){
     this.initProperty(S_Fetion,new Double(value));
  }
  public  void setFetion(double value){
     this.set(S_Fetion,new Double(value));
  }
  public  void setFetionNull(){
     this.set(S_Fetion,null);
  }

  public double getFetion(){
        return DataType.getAsDouble(this.get(S_Fetion));
  
  }
  public double getFetionInitialValue(){
        return DataType.getAsDouble(this.getOldObj(S_Fetion));
      }

  public void initGift(double value){
     this.initProperty(S_Gift,new Double(value));
  }
  public  void setGift(double value){
     this.set(S_Gift,new Double(value));
  }
  public  void setGiftNull(){
     this.set(S_Gift,null);
  }

  public double getGift(){
        return DataType.getAsDouble(this.get(S_Gift));
  
  }
  public double getGiftInitialValue(){
        return DataType.getAsDouble(this.getOldObj(S_Gift));
      }

  public void initShopCard(double value){
     this.initProperty(S_ShopCard,new Double(value));
  }
  public  void setShopCard(double value){
     this.set(S_ShopCard,new Double(value));
  }
  public  void setShopCardNull(){
     this.set(S_ShopCard,null);
  }

  public double getShopCard(){
        return DataType.getAsDouble(this.get(S_ShopCard));
  
  }
  public double getShopCardInitialValue(){
        return DataType.getAsDouble(this.getOldObj(S_ShopCard));
      }

  public void initMobileEmail(double value){
     this.initProperty(S_MobileEmail,new Double(value));
  }
  public  void setMobileEmail(double value){
     this.set(S_MobileEmail,new Double(value));
  }
  public  void setMobileEmailNull(){
     this.set(S_MobileEmail,null);
  }

  public double getMobileEmail(){
        return DataType.getAsDouble(this.get(S_MobileEmail));
  
  }
  public double getMobileEmailInitialValue(){
        return DataType.getAsDouble(this.getOldObj(S_MobileEmail));
      }

  public void initQuanQu(double value){
     this.initProperty(S_QuanQu,new Double(value));
  }
  public  void setQuanQu(double value){
     this.set(S_QuanQu,new Double(value));
  }
  public  void setQuanQuNull(){
     this.set(S_QuanQu,null);
  }

  public double getQuanQu(){
        return DataType.getAsDouble(this.get(S_QuanQu));
  
  }
  public double getQuanQuInitialValue(){
        return DataType.getAsDouble(this.getOldObj(S_QuanQu));
      }

  public void initCrbt(double value){
     this.initProperty(S_Crbt,new Double(value));
  }
  public  void setCrbt(double value){
     this.set(S_Crbt,new Double(value));
  }
  public  void setCrbtNull(){
     this.set(S_Crbt,null);
  }

  public double getCrbt(){
        return DataType.getAsDouble(this.get(S_Crbt));
  
  }
  public double getCrbtInitialValue(){
        return DataType.getAsDouble(this.getOldObj(S_Crbt));
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

  public void initConsulting(double value){
     this.initProperty(S_Consulting,new Double(value));
  }
  public  void setConsulting(double value){
     this.set(S_Consulting,new Double(value));
  }
  public  void setConsultingNull(){
     this.set(S_Consulting,null);
  }

  public double getConsulting(){
        return DataType.getAsDouble(this.get(S_Consulting));
  
  }
  public double getConsultingInitialValue(){
        return DataType.getAsDouble(this.getOldObj(S_Consulting));
      }

  public void initHotPoint(double value){
     this.initProperty(S_HotPoint,new Double(value));
  }
  public  void setHotPoint(double value){
     this.set(S_HotPoint,new Double(value));
  }
  public  void setHotPointNull(){
     this.set(S_HotPoint,null);
  }

  public double getHotPoint(){
        return DataType.getAsDouble(this.get(S_HotPoint));
  
  }
  public double getHotPointInitialValue(){
        return DataType.getAsDouble(this.getOldObj(S_HotPoint));
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

  public void initMms(double value){
     this.initProperty(S_Mms,new Double(value));
  }
  public  void setMms(double value){
     this.set(S_Mms,new Double(value));
  }
  public  void setMmsNull(){
     this.set(S_Mms,null);
  }

  public double getMms(){
        return DataType.getAsDouble(this.get(S_Mms));
  
  }
  public double getMmsInitialValue(){
        return DataType.getAsDouble(this.getOldObj(S_Mms));
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

  public void initLotterySales(double value){
     this.initProperty(S_LotterySales,new Double(value));
  }
  public  void setLotterySales(double value){
     this.set(S_LotterySales,new Double(value));
  }
  public  void setLotterySalesNull(){
     this.set(S_LotterySales,null);
  }

  public double getLotterySales(){
        return DataType.getAsDouble(this.get(S_LotterySales));
  
  }
  public double getLotterySalesInitialValue(){
        return DataType.getAsDouble(this.getOldObj(S_LotterySales));
      }

  public void initWap(double value){
     this.initProperty(S_Wap,new Double(value));
  }
  public  void setWap(double value){
     this.set(S_Wap,new Double(value));
  }
  public  void setWapNull(){
     this.set(S_Wap,null);
  }

  public double getWap(){
        return DataType.getAsDouble(this.get(S_Wap));
  
  }
  public double getWapInitialValue(){
        return DataType.getAsDouble(this.getOldObj(S_Wap));
      }

  public void initSport(double value){
     this.initProperty(S_Sport,new Double(value));
  }
  public  void setSport(double value){
     this.set(S_Sport,new Double(value));
  }
  public  void setSportNull(){
     this.set(S_Sport,null);
  }

  public double getSport(){
        return DataType.getAsDouble(this.get(S_Sport));
  
  }
  public double getSportInitialValue(){
        return DataType.getAsDouble(this.getOldObj(S_Sport));
      }

  public void initMovie(double value){
     this.initProperty(S_Movie,new Double(value));
  }
  public  void setMovie(double value){
     this.set(S_Movie,new Double(value));
  }
  public  void setMovieNull(){
     this.set(S_Movie,null);
  }

  public double getMovie(){
        return DataType.getAsDouble(this.get(S_Movie));
  
  }
  public double getMovieInitialValue(){
        return DataType.getAsDouble(this.getOldObj(S_Movie));
      }

  public void initFirstGet(double value){
     this.initProperty(S_FirstGet,new Double(value));
  }
  public  void setFirstGet(double value){
     this.set(S_FirstGet,new Double(value));
  }
  public  void setFirstGetNull(){
     this.set(S_FirstGet,null);
  }

  public double getFirstGet(){
        return DataType.getAsDouble(this.get(S_FirstGet));
  
  }
  public double getFirstGetInitialValue(){
        return DataType.getAsDouble(this.getOldObj(S_FirstGet));
      }

  public void initJoinSalesNum(double value){
     this.initProperty(S_JoinSalesNum,new Double(value));
  }
  public  void setJoinSalesNum(double value){
     this.set(S_JoinSalesNum,new Double(value));
  }
  public  void setJoinSalesNumNull(){
     this.set(S_JoinSalesNum,null);
  }

  public double getJoinSalesNum(){
        return DataType.getAsDouble(this.get(S_JoinSalesNum));
  
  }
  public double getJoinSalesNumInitialValue(){
        return DataType.getAsDouble(this.getOldObj(S_JoinSalesNum));
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

  public void initDailyMarketing(double value){
     this.initProperty(S_DailyMarketing,new Double(value));
  }
  public  void setDailyMarketing(double value){
     this.set(S_DailyMarketing,new Double(value));
  }
  public  void setDailyMarketingNull(){
     this.set(S_DailyMarketing,null);
  }

  public double getDailyMarketing(){
        return DataType.getAsDouble(this.get(S_DailyMarketing));
  
  }
  public double getDailyMarketingInitialValue(){
        return DataType.getAsDouble(this.getOldObj(S_DailyMarketing));
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

  public void initGeneralSales(double value){
     this.initProperty(S_GeneralSales,new Double(value));
  }
  public  void setGeneralSales(double value){
     this.set(S_GeneralSales,new Double(value));
  }
  public  void setGeneralSalesNull(){
     this.set(S_GeneralSales,null);
  }

  public double getGeneralSales(){
        return DataType.getAsDouble(this.get(S_GeneralSales));
  
  }
  public double getGeneralSalesInitialValue(){
        return DataType.getAsDouble(this.getOldObj(S_GeneralSales));
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


 
 }

