package com.asiainfo.crm.cm.inner.account.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.inner.account.ivalues.*;

public class BOCmCustAcctRelBean extends DataContainer implements DataContainerInterface,IBOCmCustAcctRelValue{

  private static String  m_boName = "com.asiainfo.crm.cm.inner.account.bo.BOCmCustAcctRel";



  public final static  String S_State = "STATE";
  public final static  String S_BillDueDate = "bill_due_date";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_AcctAliasName = "ACCT_ALIAS_NAME";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_InstallmentFlag = "installment_flag";
  public final static  String S_BillDay = "bill_day";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_Action = "ACTION";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_RelType = "REL_TYPE";
  public final static  String S_RelCustId = "REL_CUST_ID";
  public final static  String S_AcctName = "acct_name";
  public final static  String S_CycleType = "cycle_type";
  public final static  String S_CustType = "CUST_TYPE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_Ext5 = "ext5";
  public final static  String S_PayMethod = "pay_method";
  public final static  String S_Ext1 = "ext1";
  public final static  String S_Ext2 = "ext2";
  public final static  String S_Ext3 = "ext3";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_Ext4 = "ext4";
  public final static  String S_CreateDate = "CREATE_DATE";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmCustAcctRelBean() throws AIException{
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

  public void initBillDueDate(long value){
     this.initProperty(S_BillDueDate,new Long(value));
  }
  public  void setBillDueDate(long value){
     this.set(S_BillDueDate,new Long(value));
  }
  public  void setBillDueDateNull(){
     this.set(S_BillDueDate,null);
  }

  public long getBillDueDate(){
        return DataType.getAsLong(this.get(S_BillDueDate));
  
  }
  public long getBillDueDateInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_BillDueDate));
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

  public void initAcctAliasName(String value){
     this.initProperty(S_AcctAliasName,value);
  }
  public  void setAcctAliasName(String value){
     this.set(S_AcctAliasName,value);
  }
  public  void setAcctAliasNameNull(){
     this.set(S_AcctAliasName,null);
  }

  public String getAcctAliasName(){
       return DataType.getAsString(this.get(S_AcctAliasName));
  
  }
  public String getAcctAliasNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AcctAliasName));
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

  public void initInstallmentFlag(long value){
     this.initProperty(S_InstallmentFlag,new Long(value));
  }
  public  void setInstallmentFlag(long value){
     this.set(S_InstallmentFlag,new Long(value));
  }
  public  void setInstallmentFlagNull(){
     this.set(S_InstallmentFlag,null);
  }

  public long getInstallmentFlag(){
        return DataType.getAsLong(this.get(S_InstallmentFlag));
  
  }
  public long getInstallmentFlagInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_InstallmentFlag));
      }

  public void initBillDay(long value){
     this.initProperty(S_BillDay,new Long(value));
  }
  public  void setBillDay(long value){
     this.set(S_BillDay,new Long(value));
  }
  public  void setBillDayNull(){
     this.set(S_BillDay,null);
  }

  public long getBillDay(){
        return DataType.getAsLong(this.get(S_BillDay));
  
  }
  public long getBillDayInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_BillDay));
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

  public void initRelType(long value){
     this.initProperty(S_RelType,new Long(value));
  }
  public  void setRelType(long value){
     this.set(S_RelType,new Long(value));
  }
  public  void setRelTypeNull(){
     this.set(S_RelType,null);
  }

  public long getRelType(){
        return DataType.getAsLong(this.get(S_RelType));
  
  }
  public long getRelTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_RelType));
      }

  public void initRelCustId(long value){
     this.initProperty(S_RelCustId,new Long(value));
  }
  public  void setRelCustId(long value){
     this.set(S_RelCustId,new Long(value));
  }
  public  void setRelCustIdNull(){
     this.set(S_RelCustId,null);
  }

  public long getRelCustId(){
        return DataType.getAsLong(this.get(S_RelCustId));
  
  }
  public long getRelCustIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_RelCustId));
      }

  public void initAcctName(String value){
     this.initProperty(S_AcctName,value);
  }
  public  void setAcctName(String value){
     this.set(S_AcctName,value);
  }
  public  void setAcctNameNull(){
     this.set(S_AcctName,null);
  }

  public String getAcctName(){
       return DataType.getAsString(this.get(S_AcctName));
  
  }
  public String getAcctNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AcctName));
      }

  public void initCycleType(long value){
     this.initProperty(S_CycleType,new Long(value));
  }
  public  void setCycleType(long value){
     this.set(S_CycleType,new Long(value));
  }
  public  void setCycleTypeNull(){
     this.set(S_CycleType,null);
  }

  public long getCycleType(){
        return DataType.getAsLong(this.get(S_CycleType));
  
  }
  public long getCycleTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CycleType));
      }

  public void initCustType(long value){
     this.initProperty(S_CustType,new Long(value));
  }
  public  void setCustType(long value){
     this.set(S_CustType,new Long(value));
  }
  public  void setCustTypeNull(){
     this.set(S_CustType,null);
  }

  public long getCustType(){
        return DataType.getAsLong(this.get(S_CustType));
  
  }
  public long getCustTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CustType));
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

  public void initPayMethod(long value){
     this.initProperty(S_PayMethod,new Long(value));
  }
  public  void setPayMethod(long value){
     this.set(S_PayMethod,new Long(value));
  }
  public  void setPayMethodNull(){
     this.set(S_PayMethod,null);
  }

  public long getPayMethod(){
        return DataType.getAsLong(this.get(S_PayMethod));
  
  }
  public long getPayMethodInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_PayMethod));
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

