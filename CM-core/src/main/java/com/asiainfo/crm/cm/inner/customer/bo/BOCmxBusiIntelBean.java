package com.asiainfo.crm.cm.inner.customer.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.inner.customer.ivalues.*;

public class BOCmxBusiIntelBean extends DataContainer implements DataContainerInterface,IBOCmxBusiIntelValue{

  private static String  m_boName = "com.asiainfo.crm.cm.inner.customer.bo.BOCmxBusiIntel";



  public final static  String S_TollFee = "TOLL_FEE";
  public final static  String S_Birthday = "BIRTHDAY";
  public final static  String S_IndivCustType = "INDIV_CUST_TYPE";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_OfferName = "OFFER_NAME";
  public final static  String S_Occupation = "OCCUPATION";
  public final static  String S_EndDate = "END_DATE";
  public final static  String S_BrandName = "BRAND_NAME";
  public final static  String S_NewbusiName = "NEWBUSI_NAME";
  public final static  String S_RoamFee = "ROAM_FEE";
  public final static  String S_ScoreSumReduce = "SCORE_SUM_REDUCE";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_NewbusiInfo = "NEWBUSI_INFO";
  public final static  String S_StartDate = "START_DATE";
  public final static  String S_CustName = "CUST_NAME";
  public final static  String S_OpTime = "OP_TIME";
  public final static  String S_TotalFee = "TOTAL_FEE";
  public final static  String S_Imei = "IMEI";
  public final static  String S_ResType = "RES_TYPE";
  public final static  String S_BasecallFee = "BASECALL_FEE";
  public final static  String S_NewbusiFee = "NEWBUSI_FEE";
  public final static  String S_FactoryId = "FACTORY_ID";
  public final static  String S_ElseFee = "ELSE_FEE";
  public final static  String S_CreditLevel = "CREDIT_LEVEL";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmxBusiIntelBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initTollFee(String value){
     this.initProperty(S_TollFee,value);
  }
  public  void setTollFee(String value){
     this.set(S_TollFee,value);
  }
  public  void setTollFeeNull(){
     this.set(S_TollFee,null);
  }

  public String getTollFee(){
       return DataType.getAsString(this.get(S_TollFee));
  
  }
  public String getTollFeeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_TollFee));
      }

  public void initBirthday(Timestamp value){
     this.initProperty(S_Birthday,value);
  }
  public  void setBirthday(Timestamp value){
     this.set(S_Birthday,value);
  }
  public  void setBirthdayNull(){
     this.set(S_Birthday,null);
  }

  public Timestamp getBirthday(){
        return DataType.getAsDateTime(this.get(S_Birthday));
  
  }
  public Timestamp getBirthdayInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_Birthday));
      }

  public void initIndivCustType(String value){
     this.initProperty(S_IndivCustType,value);
  }
  public  void setIndivCustType(String value){
     this.set(S_IndivCustType,value);
  }
  public  void setIndivCustTypeNull(){
     this.set(S_IndivCustType,null);
  }

  public String getIndivCustType(){
       return DataType.getAsString(this.get(S_IndivCustType));
  
  }
  public String getIndivCustTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_IndivCustType));
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

  public void initOfferName(String value){
     this.initProperty(S_OfferName,value);
  }
  public  void setOfferName(String value){
     this.set(S_OfferName,value);
  }
  public  void setOfferNameNull(){
     this.set(S_OfferName,null);
  }

  public String getOfferName(){
       return DataType.getAsString(this.get(S_OfferName));
  
  }
  public String getOfferNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OfferName));
      }

  public void initOccupation(int value){
     this.initProperty(S_Occupation,new Integer(value));
  }
  public  void setOccupation(int value){
     this.set(S_Occupation,new Integer(value));
  }
  public  void setOccupationNull(){
     this.set(S_Occupation,null);
  }

  public int getOccupation(){
        return DataType.getAsInt(this.get(S_Occupation));
  
  }
  public int getOccupationInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_Occupation));
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

  public void initBrandName(String value){
     this.initProperty(S_BrandName,value);
  }
  public  void setBrandName(String value){
     this.set(S_BrandName,value);
  }
  public  void setBrandNameNull(){
     this.set(S_BrandName,null);
  }

  public String getBrandName(){
       return DataType.getAsString(this.get(S_BrandName));
  
  }
  public String getBrandNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BrandName));
      }

  public void initNewbusiName(String value){
     this.initProperty(S_NewbusiName,value);
  }
  public  void setNewbusiName(String value){
     this.set(S_NewbusiName,value);
  }
  public  void setNewbusiNameNull(){
     this.set(S_NewbusiName,null);
  }

  public String getNewbusiName(){
       return DataType.getAsString(this.get(S_NewbusiName));
  
  }
  public String getNewbusiNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_NewbusiName));
      }

  public void initRoamFee(String value){
     this.initProperty(S_RoamFee,value);
  }
  public  void setRoamFee(String value){
     this.set(S_RoamFee,value);
  }
  public  void setRoamFeeNull(){
     this.set(S_RoamFee,null);
  }

  public String getRoamFee(){
       return DataType.getAsString(this.get(S_RoamFee));
  
  }
  public String getRoamFeeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_RoamFee));
      }

  public void initScoreSumReduce(long value){
     this.initProperty(S_ScoreSumReduce,new Long(value));
  }
  public  void setScoreSumReduce(long value){
     this.set(S_ScoreSumReduce,new Long(value));
  }
  public  void setScoreSumReduceNull(){
     this.set(S_ScoreSumReduce,null);
  }

  public long getScoreSumReduce(){
        return DataType.getAsLong(this.get(S_ScoreSumReduce));
  
  }
  public long getScoreSumReduceInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ScoreSumReduce));
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

  public void initNewbusiInfo(String value){
     this.initProperty(S_NewbusiInfo,value);
  }
  public  void setNewbusiInfo(String value){
     this.set(S_NewbusiInfo,value);
  }
  public  void setNewbusiInfoNull(){
     this.set(S_NewbusiInfo,null);
  }

  public String getNewbusiInfo(){
       return DataType.getAsString(this.get(S_NewbusiInfo));
  
  }
  public String getNewbusiInfoInitialValue(){
        return DataType.getAsString(this.getOldObj(S_NewbusiInfo));
      }

  public void initStartDate(Timestamp value){
     this.initProperty(S_StartDate,value);
  }
  public  void setStartDate(Timestamp value){
     this.set(S_StartDate,value);
  }
  public  void setStartDateNull(){
     this.set(S_StartDate,null);
  }

  public Timestamp getStartDate(){
        return DataType.getAsDateTime(this.get(S_StartDate));
  
  }
  public Timestamp getStartDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_StartDate));
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

  public void initOpTime(String value){
     this.initProperty(S_OpTime,value);
  }
  public  void setOpTime(String value){
     this.set(S_OpTime,value);
  }
  public  void setOpTimeNull(){
     this.set(S_OpTime,null);
  }

  public String getOpTime(){
       return DataType.getAsString(this.get(S_OpTime));
  
  }
  public String getOpTimeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OpTime));
      }

  public void initTotalFee(String value){
     this.initProperty(S_TotalFee,value);
  }
  public  void setTotalFee(String value){
     this.set(S_TotalFee,value);
  }
  public  void setTotalFeeNull(){
     this.set(S_TotalFee,null);
  }

  public String getTotalFee(){
       return DataType.getAsString(this.get(S_TotalFee));
  
  }
  public String getTotalFeeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_TotalFee));
      }

  public void initImei(String value){
     this.initProperty(S_Imei,value);
  }
  public  void setImei(String value){
     this.set(S_Imei,value);
  }
  public  void setImeiNull(){
     this.set(S_Imei,null);
  }

  public String getImei(){
       return DataType.getAsString(this.get(S_Imei));
  
  }
  public String getImeiInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Imei));
      }

  public void initResType(String value){
     this.initProperty(S_ResType,value);
  }
  public  void setResType(String value){
     this.set(S_ResType,value);
  }
  public  void setResTypeNull(){
     this.set(S_ResType,null);
  }

  public String getResType(){
       return DataType.getAsString(this.get(S_ResType));
  
  }
  public String getResTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ResType));
      }

  public void initBasecallFee(String value){
     this.initProperty(S_BasecallFee,value);
  }
  public  void setBasecallFee(String value){
     this.set(S_BasecallFee,value);
  }
  public  void setBasecallFeeNull(){
     this.set(S_BasecallFee,null);
  }

  public String getBasecallFee(){
       return DataType.getAsString(this.get(S_BasecallFee));
  
  }
  public String getBasecallFeeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BasecallFee));
      }

  public void initNewbusiFee(String value){
     this.initProperty(S_NewbusiFee,value);
  }
  public  void setNewbusiFee(String value){
     this.set(S_NewbusiFee,value);
  }
  public  void setNewbusiFeeNull(){
     this.set(S_NewbusiFee,null);
  }

  public String getNewbusiFee(){
       return DataType.getAsString(this.get(S_NewbusiFee));
  
  }
  public String getNewbusiFeeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_NewbusiFee));
      }

  public void initFactoryId(String value){
     this.initProperty(S_FactoryId,value);
  }
  public  void setFactoryId(String value){
     this.set(S_FactoryId,value);
  }
  public  void setFactoryIdNull(){
     this.set(S_FactoryId,null);
  }

  public String getFactoryId(){
       return DataType.getAsString(this.get(S_FactoryId));
  
  }
  public String getFactoryIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FactoryId));
      }

  public void initElseFee(String value){
     this.initProperty(S_ElseFee,value);
  }
  public  void setElseFee(String value){
     this.set(S_ElseFee,value);
  }
  public  void setElseFeeNull(){
     this.set(S_ElseFee,null);
  }

  public String getElseFee(){
       return DataType.getAsString(this.get(S_ElseFee));
  
  }
  public String getElseFeeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ElseFee));
      }

  public void initCreditLevel(int value){
     this.initProperty(S_CreditLevel,new Integer(value));
  }
  public  void setCreditLevel(int value){
     this.set(S_CreditLevel,new Integer(value));
  }
  public  void setCreditLevelNull(){
     this.set(S_CreditLevel,null);
  }

  public int getCreditLevel(){
        return DataType.getAsInt(this.get(S_CreditLevel));
  
  }
  public int getCreditLevelInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CreditLevel));
      }


 
 }

