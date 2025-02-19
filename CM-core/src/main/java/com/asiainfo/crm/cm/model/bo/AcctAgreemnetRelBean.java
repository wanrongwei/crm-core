package com.asiainfo.crm.cm.model.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.model.ivalues.*;

public class AcctAgreemnetRelBean extends DataContainer implements DataContainerInterface,IAcctAgreemnetRelValue{

  private static String  m_boName = "com.asiainfo.crm.cm.model.bo.AcctAgreemnetRel";


  public final static  String ADD="1";
  public final static  String MODIFY="1";
  public final static  String DELETE="3";
  public final static  String S_ValidDate = "VALID_DATE";
  public final static  String S_AgreementId = "AGREEMENT_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_OperType = "OPER_TYPE";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_TenantId = "TENANT_ID";
  public final static  String S_CommitDate = "COMMIT_DATE";
  public final static  String S_SoNbr = "SO_NBR";
  public final static  String S_OperatorDate = "OPERATOR_DATE";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public AcctAgreemnetRelBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initValidDate(Timestamp value){
     this.initProperty(S_ValidDate,value);
  }
  public  void setValidDate(Timestamp value){
     this.set(S_ValidDate,value);
  }
  public  void setValidDateNull(){
     this.set(S_ValidDate,null);
  }

  public Timestamp getValidDate(){
        return DataType.getAsDateTime(this.get(S_ValidDate));
  
  }
  public Timestamp getValidDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_ValidDate));
      }

  public void initAgreementId(long value){
     this.initProperty(S_AgreementId,new Long(value));
  }
  public  void setAgreementId(long value){
     this.set(S_AgreementId,new Long(value));
  }
  public  void setAgreementIdNull(){
     this.set(S_AgreementId,null);
  }

  public long getAgreementId(){
        return DataType.getAsLong(this.get(S_AgreementId));
  
  }
  public long getAgreementIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_AgreementId));
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

  public void initOperType(String value){
     this.initProperty(S_OperType,value);
  }
  public  void setOperType(String value){
     this.set(S_OperType,value);
  }
  public  void setOperTypeNull(){
     this.set(S_OperType,null);
  }

  public String getOperType(){
       return DataType.getAsString(this.get(S_OperType));
  
  }
  public String getOperTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OperType));
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

  public void initTenantId(String value){
     this.initProperty(S_TenantId,value);
  }
  public  void setTenantId(String value){
     this.set(S_TenantId,value);
  }
  public  void setTenantIdNull(){
     this.set(S_TenantId,null);
  }

  public String getTenantId(){
       return DataType.getAsString(this.get(S_TenantId));
  
  }
  public String getTenantIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_TenantId));
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

  public void initSoNbr(String value){
     this.initProperty(S_SoNbr,value);
  }
  public  void setSoNbr(String value){
     this.set(S_SoNbr,value);
  }
  public  void setSoNbrNull(){
     this.set(S_SoNbr,null);
  }

  public String getSoNbr(){
       return DataType.getAsString(this.get(S_SoNbr));
  
  }
  public String getSoNbrInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SoNbr));
      }

  public void initOperatorDate(Timestamp value){
     this.initProperty(S_OperatorDate,value);
  }
  public  void setOperatorDate(Timestamp value){
     this.set(S_OperatorDate,value);
  }
  public  void setOperatorDateNull(){
     this.set(S_OperatorDate,null);
  }

  public Timestamp getOperatorDate(){
        return DataType.getAsDateTime(this.get(S_OperatorDate));
  
  }
  public Timestamp getOperatorDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_OperatorDate));
      }


 
 }

