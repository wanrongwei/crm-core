package com.asiainfo.crm.inter.exe.webservice.client.phobook.bo;

import java.sql.Timestamp;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.ServiceManager;
import com.asiainfo.crm.inter.exe.webservice.client.phobook.ivalues.IBOIntPhoSubValue;

public class BOIntPhoSubBean extends DataContainer implements DataContainerInterface,IBOIntPhoSubValue{

  private static String  m_boName = "com.asiainfo.crm.inter.ws.bo.BOIntPhoSub";



  public final static  String S_TelephoSpecUsageCode = "TELEPHO_SPEC_USAGE_CODE";
  public final static  String S_AddressId = "ADDRESS_ID";
  public final static  String S_TelephoSubProtectCode = "TELEPHO_SUB_PROTECT_CODE";
  public final static  String S_TelephoSerTypeCode = "TELEPHO_SER_TYPE_CODE";
  public final static  String S_SurnameName = "SURNAME_NAME";
  public final static  String S_AnonymousPrepInd = "ANONYMOUS_PREP_IND";
  public final static  String S_EmployPositionName = "EMPLOY_POSITION_NAME";
  public final static  String S_Status = "STATUS";
  public final static  String S_OrgnizationName = "ORGNIZATION_NAME";
  public final static  String S_GivenName = "GIVEN_NAME";
  public final static  String S_TelephoSub = "TELEPHO_SUB";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_MiddleName = "MIDDLE_NAME";
  public final static  String S_DanishTelephoNumId = "DANISH_TELEPHO_NUM_ID";
  public final static  String S_Ext5 = "EXT5";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_Ext1 = "EXT1";
  public final static  String S_OtherAddressId = "OTHER_ADDRESS_ID";
  public final static  String S_Ext2 = "EXT2";
  public final static  String S_Ext3 = "EXT3";
  public final static  String S_SubId = "SUB_ID";
  public final static  String S_Ext4 = "EXT4";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOIntPhoSubBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initTelephoSpecUsageCode(String value){
     this.initProperty(S_TelephoSpecUsageCode,value);
  }
  public  void setTelephoSpecUsageCode(String value){
     this.set(S_TelephoSpecUsageCode,value);
  }
  public  void setTelephoSpecUsageCodeNull(){
     this.set(S_TelephoSpecUsageCode,null);
  }

  public String getTelephoSpecUsageCode(){
       return DataType.getAsString(this.get(S_TelephoSpecUsageCode));
  
  }
  public String getTelephoSpecUsageCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_TelephoSpecUsageCode));
      }

  public void initAddressId(long value){
     this.initProperty(S_AddressId,new Long(value));
  }
  public  void setAddressId(long value){
     this.set(S_AddressId,new Long(value));
  }
  public  void setAddressIdNull(){
     this.set(S_AddressId,null);
  }

  public long getAddressId(){
        return DataType.getAsLong(this.get(S_AddressId));
  
  }
  public long getAddressIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_AddressId));
      }

  public void initTelephoSubProtectCode(String value){
     this.initProperty(S_TelephoSubProtectCode,value);
  }
  public  void setTelephoSubProtectCode(String value){
     this.set(S_TelephoSubProtectCode,value);
  }
  public  void setTelephoSubProtectCodeNull(){
     this.set(S_TelephoSubProtectCode,null);
  }

  public String getTelephoSubProtectCode(){
       return DataType.getAsString(this.get(S_TelephoSubProtectCode));
  
  }
  public String getTelephoSubProtectCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_TelephoSubProtectCode));
      }

  public void initTelephoSerTypeCode(String value){
     this.initProperty(S_TelephoSerTypeCode,value);
  }
  public  void setTelephoSerTypeCode(String value){
     this.set(S_TelephoSerTypeCode,value);
  }
  public  void setTelephoSerTypeCodeNull(){
     this.set(S_TelephoSerTypeCode,null);
  }

  public String getTelephoSerTypeCode(){
       return DataType.getAsString(this.get(S_TelephoSerTypeCode));
  
  }
  public String getTelephoSerTypeCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_TelephoSerTypeCode));
      }

  public void initSurnameName(String value){
     this.initProperty(S_SurnameName,value);
  }
  public  void setSurnameName(String value){
     this.set(S_SurnameName,value);
  }
  public  void setSurnameNameNull(){
     this.set(S_SurnameName,null);
  }

  public String getSurnameName(){
       return DataType.getAsString(this.get(S_SurnameName));
  
  }
  public String getSurnameNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SurnameName));
      }

  public void initAnonymousPrepInd(String value){
     this.initProperty(S_AnonymousPrepInd,value);
  }
  public  void setAnonymousPrepInd(String value){
     this.set(S_AnonymousPrepInd,value);
  }
  public  void setAnonymousPrepIndNull(){
     this.set(S_AnonymousPrepInd,null);
  }

  public String getAnonymousPrepInd(){
       return DataType.getAsString(this.get(S_AnonymousPrepInd));
  
  }
  public String getAnonymousPrepIndInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AnonymousPrepInd));
      }

  public void initEmployPositionName(String value){
     this.initProperty(S_EmployPositionName,value);
  }
  public  void setEmployPositionName(String value){
     this.set(S_EmployPositionName,value);
  }
  public  void setEmployPositionNameNull(){
     this.set(S_EmployPositionName,null);
  }

  public String getEmployPositionName(){
       return DataType.getAsString(this.get(S_EmployPositionName));
  
  }
  public String getEmployPositionNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_EmployPositionName));
      }

  public void initStatus(String value){
     this.initProperty(S_Status,value);
  }
  public  void setStatus(String value){
     this.set(S_Status,value);
  }
  public  void setStatusNull(){
     this.set(S_Status,null);
  }

  public String getStatus(){
       return DataType.getAsString(this.get(S_Status));
  
  }
  public String getStatusInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Status));
      }

  public void initOrgnizationName(String value){
     this.initProperty(S_OrgnizationName,value);
  }
  public  void setOrgnizationName(String value){
     this.set(S_OrgnizationName,value);
  }
  public  void setOrgnizationNameNull(){
     this.set(S_OrgnizationName,null);
  }

  public String getOrgnizationName(){
       return DataType.getAsString(this.get(S_OrgnizationName));
  
  }
  public String getOrgnizationNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OrgnizationName));
      }

  public void initGivenName(String value){
     this.initProperty(S_GivenName,value);
  }
  public  void setGivenName(String value){
     this.set(S_GivenName,value);
  }
  public  void setGivenNameNull(){
     this.set(S_GivenName,null);
  }

  public String getGivenName(){
       return DataType.getAsString(this.get(S_GivenName));
  
  }
  public String getGivenNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_GivenName));
      }

  public void initTelephoSub(String value){
     this.initProperty(S_TelephoSub,value);
  }
  public  void setTelephoSub(String value){
     this.set(S_TelephoSub,value);
  }
  public  void setTelephoSubNull(){
     this.set(S_TelephoSub,null);
  }

  public String getTelephoSub(){
       return DataType.getAsString(this.get(S_TelephoSub));
  
  }
  public String getTelephoSubInitialValue(){
        return DataType.getAsString(this.getOldObj(S_TelephoSub));
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

  public void initDanishTelephoNumId(String value){
     this.initProperty(S_DanishTelephoNumId,value);
  }
  public  void setDanishTelephoNumId(String value){
     this.set(S_DanishTelephoNumId,value);
  }
  public  void setDanishTelephoNumIdNull(){
     this.set(S_DanishTelephoNumId,null);
  }

  public String getDanishTelephoNumId(){
       return DataType.getAsString(this.get(S_DanishTelephoNumId));
  
  }
  public String getDanishTelephoNumIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DanishTelephoNumId));
      }

  public void initExt5(String value){
     this.initProperty(S_Ext5,value);
  }
  public  void setExt5(String value){
     this.set(S_Ext5,value);
  }
  public  void setExt5Null(){
     this.set(S_Ext5,null);
  }

  public String getExt5(){
       return DataType.getAsString(this.get(S_Ext5));
  
  }
  public String getExt5InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext5));
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

  public void initOtherAddressId(long value){
     this.initProperty(S_OtherAddressId,new Long(value));
  }
  public  void setOtherAddressId(long value){
     this.set(S_OtherAddressId,new Long(value));
  }
  public  void setOtherAddressIdNull(){
     this.set(S_OtherAddressId,null);
  }

  public long getOtherAddressId(){
        return DataType.getAsLong(this.get(S_OtherAddressId));
  
  }
  public long getOtherAddressIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_OtherAddressId));
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

  public void initSubId(long value){
     this.initProperty(S_SubId,new Long(value));
  }
  public  void setSubId(long value){
     this.set(S_SubId,new Long(value));
  }
  public  void setSubIdNull(){
     this.set(S_SubId,null);
  }

  public long getSubId(){
        return DataType.getAsLong(this.get(S_SubId));
  
  }
  public long getSubIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_SubId));
      }

  public void initExt4(String value){
     this.initProperty(S_Ext4,value);
  }
  public  void setExt4(String value){
     this.set(S_Ext4,value);
  }
  public  void setExt4Null(){
     this.set(S_Ext4,null);
  }

  public String getExt4(){
       return DataType.getAsString(this.get(S_Ext4));
  
  }
  public String getExt4InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext4));
      }


 
 }

