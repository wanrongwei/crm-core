package com.asiainfo.crm.cm.common.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.common.ivalues.*;

public class BOAccBankBean extends DataContainer implements DataContainerInterface,IBOAccBankValue{

  private static String  m_boName = "com.asiainfo.crm.cm.common.bo.BOAccBank";



  public final static  String S_StsDate = "STS_DATE";
  public final static  String S_Sts = "STS";
  public final static  String S_CountyCode = "COUNTY_CODE";
  public final static  String S_PhoneId = "PHONE_ID";
  public final static  String S_BankAcct = "BANK_ACCT";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_BankId = "BANK_ID";
  public final static  String S_Remark = "REMARK";
  public final static  String S_RegionCode = "REGION_CODE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_SoNbr = "SO_NBR";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOAccBankBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initStsDate(Timestamp value){
     this.initProperty(S_StsDate,value);
  }
  public  void setStsDate(Timestamp value){
     this.set(S_StsDate,value);
  }
  public  void setStsDateNull(){
     this.set(S_StsDate,null);
  }

  public Timestamp getStsDate(){
        return DataType.getAsDateTime(this.get(S_StsDate));
  
  }
  public Timestamp getStsDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_StsDate));
      }

  public void initSts(int value){
     this.initProperty(S_Sts,new Integer(value));
  }
  public  void setSts(int value){
     this.set(S_Sts,new Integer(value));
  }
  public  void setStsNull(){
     this.set(S_Sts,null);
  }

  public int getSts(){
        return DataType.getAsInt(this.get(S_Sts));
  
  }
  public int getStsInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_Sts));
      }

  public void initCountyCode(int value){
     this.initProperty(S_CountyCode,new Integer(value));
  }
  public  void setCountyCode(int value){
     this.set(S_CountyCode,new Integer(value));
  }
  public  void setCountyCodeNull(){
     this.set(S_CountyCode,null);
  }

  public int getCountyCode(){
        return DataType.getAsInt(this.get(S_CountyCode));
  
  }
  public int getCountyCodeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CountyCode));
      }

  public void initPhoneId(String value){
     this.initProperty(S_PhoneId,value);
  }
  public  void setPhoneId(String value){
     this.set(S_PhoneId,value);
  }
  public  void setPhoneIdNull(){
     this.set(S_PhoneId,null);
  }

  public String getPhoneId(){
       return DataType.getAsString(this.get(S_PhoneId));
  
  }
  public String getPhoneIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PhoneId));
      }

  public void initBankAcct(String value){
     this.initProperty(S_BankAcct,value);
  }
  public  void setBankAcct(String value){
     this.set(S_BankAcct,value);
  }
  public  void setBankAcctNull(){
     this.set(S_BankAcct,null);
  }

  public String getBankAcct(){
       return DataType.getAsString(this.get(S_BankAcct));
  
  }
  public String getBankAcctInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BankAcct));
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

  public void initBankId(long value){
     this.initProperty(S_BankId,new Long(value));
  }
  public  void setBankId(long value){
     this.set(S_BankId,new Long(value));
  }
  public  void setBankIdNull(){
     this.set(S_BankId,null);
  }

  public long getBankId(){
        return DataType.getAsLong(this.get(S_BankId));
  
  }
  public long getBankIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_BankId));
      }

  public void initRemark(String value){
     this.initProperty(S_Remark,value);
  }
  public  void setRemark(String value){
     this.set(S_Remark,value);
  }
  public  void setRemarkNull(){
     this.set(S_Remark,null);
  }

  public String getRemark(){
       return DataType.getAsString(this.get(S_Remark));
  
  }
  public String getRemarkInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Remark));
      }

  public void initRegionCode(int value){
     this.initProperty(S_RegionCode,new Integer(value));
  }
  public  void setRegionCode(int value){
     this.set(S_RegionCode,new Integer(value));
  }
  public  void setRegionCodeNull(){
     this.set(S_RegionCode,null);
  }

  public int getRegionCode(){
        return DataType.getAsInt(this.get(S_RegionCode));
  
  }
  public int getRegionCodeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_RegionCode));
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

  public void initSoNbr(long value){
     this.initProperty(S_SoNbr,new Long(value));
  }
  public  void setSoNbr(long value){
     this.set(S_SoNbr,new Long(value));
  }
  public  void setSoNbrNull(){
     this.set(S_SoNbr,null);
  }

  public long getSoNbr(){
        return DataType.getAsLong(this.get(S_SoNbr));
  
  }
  public long getSoNbrInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_SoNbr));
      }


 
 }

