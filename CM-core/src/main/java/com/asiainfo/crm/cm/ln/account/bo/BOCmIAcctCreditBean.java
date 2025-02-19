package com.asiainfo.crm.cm.ln.account.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.ln.account.ivalues.*;

public class BOCmIAcctCreditBean extends DataContainer implements DataContainerInterface,IBOCmIAcctCreditValue{

  private static String  m_boName = "com.asiainfo.crm.cm.ln.account.bo.BOCmIAcctCredit";



  public final static  String S_ServId = "SERV_ID";
  public final static  String S_UpDate = "UP_DATE";
  public final static  String S_CountyCode = "COUNTY_CODE";
  public final static  String S_GroupId = "GROUP_ID";
  public final static  String S_BusiCode = "BUSI_CODE";
  public final static  String S_CommitDate = "COMMIT_DATE";
  public final static  String S_Remark = "REMARK";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_Sid = "SID";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_UpField = "UP_FIELD";
  public final static  String S_BusiCredit = "BUSI_CREDIT";
  public final static  String S_RegionCode = "REGION_CODE";
  public final static  String S_SoNbr = "SO_NBR";
  public final static  String S_CreditLevel = "CREDIT_LEVEL";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmIAcctCreditBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initServId(long value){
     this.initProperty(S_ServId,new Long(value));
  }
  public  void setServId(long value){
     this.set(S_ServId,new Long(value));
  }
  public  void setServIdNull(){
     this.set(S_ServId,null);
  }

  public long getServId(){
        return DataType.getAsLong(this.get(S_ServId));
  
  }
  public long getServIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ServId));
      }

  public void initUpDate(Timestamp value){
     this.initProperty(S_UpDate,value);
  }
  public  void setUpDate(Timestamp value){
     this.set(S_UpDate,value);
  }
  public  void setUpDateNull(){
     this.set(S_UpDate,null);
  }

  public Timestamp getUpDate(){
        return DataType.getAsDateTime(this.get(S_UpDate));
  
  }
  public Timestamp getUpDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_UpDate));
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

  public void initGroupId(long value){
     this.initProperty(S_GroupId,new Long(value));
  }
  public  void setGroupId(long value){
     this.set(S_GroupId,new Long(value));
  }
  public  void setGroupIdNull(){
     this.set(S_GroupId,null);
  }

  public long getGroupId(){
        return DataType.getAsLong(this.get(S_GroupId));
  
  }
  public long getGroupIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_GroupId));
      }

  public void initBusiCode(int value){
     this.initProperty(S_BusiCode,new Integer(value));
  }
  public  void setBusiCode(int value){
     this.set(S_BusiCode,new Integer(value));
  }
  public  void setBusiCodeNull(){
     this.set(S_BusiCode,null);
  }

  public int getBusiCode(){
        return DataType.getAsInt(this.get(S_BusiCode));
  
  }
  public int getBusiCodeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_BusiCode));
      }

  public void initCommitDate(Timestamp value){
     this.initProperty(S_CommitDate,value);
  }
  public  void setCommitDate(Timestamp value){
     this.set(S_CommitDate,value);
  }
  public  void setCommitDateNull(){
     this.set(S_CommitDate,null);
  }

  public Timestamp getCommitDate(){
        return DataType.getAsDateTime(this.get(S_CommitDate));
  
  }
  public Timestamp getCommitDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_CommitDate));
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

  public void initSid(long value){
     this.initProperty(S_Sid,new Long(value));
  }
  public  void setSid(long value){
     this.set(S_Sid,new Long(value));
  }
  public  void setSidNull(){
     this.set(S_Sid,null);
  }

  public long getSid(){
        return DataType.getAsLong(this.get(S_Sid));
  
  }
  public long getSidInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Sid));
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

  public void initUpField(String value){
     this.initProperty(S_UpField,value);
  }
  public  void setUpField(String value){
     this.set(S_UpField,value);
  }
  public  void setUpFieldNull(){
     this.set(S_UpField,null);
  }

  public String getUpField(){
       return DataType.getAsString(this.get(S_UpField));
  
  }
  public String getUpFieldInitialValue(){
        return DataType.getAsString(this.getOldObj(S_UpField));
      }

  public void initBusiCredit(long value){
     this.initProperty(S_BusiCredit,new Long(value));
  }
  public  void setBusiCredit(long value){
     this.set(S_BusiCredit,new Long(value));
  }
  public  void setBusiCreditNull(){
     this.set(S_BusiCredit,null);
  }

  public long getBusiCredit(){
        return DataType.getAsLong(this.get(S_BusiCredit));
  
  }
  public long getBusiCreditInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_BusiCredit));
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

  public void initCreditLevel(long value){
     this.initProperty(S_CreditLevel,new Long(value));
  }
  public  void setCreditLevel(long value){
     this.set(S_CreditLevel,new Long(value));
  }
  public  void setCreditLevelNull(){
     this.set(S_CreditLevel,null);
  }

  public long getCreditLevel(){
        return DataType.getAsLong(this.get(S_CreditLevel));
  
  }
  public long getCreditLevelInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CreditLevel));
      }


 
 }

