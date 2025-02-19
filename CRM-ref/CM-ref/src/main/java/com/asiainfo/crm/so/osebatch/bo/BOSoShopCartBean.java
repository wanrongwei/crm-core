package com.asiainfo.crm.so.osebatch.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.so.osebatch.ivalues.*;

public class BOSoShopCartBean extends DataContainer implements DataContainerInterface,IBOSoShopCartValue{

  private static String  m_boName = "com.asiainfo.crm.so.osebatch.bo.BOSoShopCart";



  public final static  String S_DefaultBillId = "default_bill_id";
  public final static  String S_ExpireDate = "expire_date";
  public final static  String S_DoneDate = "done_date";
  public final static  String S_DoneCode = "done_code";
  public final static  String S_State = "state";
  public final static  String S_TenantId = "tenant_id";
  public final static  String S_Remarks = "remarks";
  public final static  String S_CustId = "cust_id";
  public final static  String S_Id = "id";
  public final static  String S_OrgId = "org_id";
  public final static  String S_OpId = "op_id";
  public final static  String S_CreateDate = "create_date";
  public final static  String S_EffectiveDate = "effective_date";
  public final static  String S_DefaultUserId = "default_user_id";
  public final static  String S_PayType = "pay_type";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOSoShopCartBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此�??��?容�?�????���??对象类�?
   throw new AIException("Cannot reset ObjectType");
 }


  public void initDefaultBillId(String value){
     this.initProperty(S_DefaultBillId,value);
  }
  public  void setDefaultBillId(String value){
     this.set(S_DefaultBillId,value);
  }
  public  void setDefaultBillIdNull(){
     this.set(S_DefaultBillId,null);
  }

  public String getDefaultBillId(){
       return DataType.getAsString(this.get(S_DefaultBillId));
  
  }
  public String getDefaultBillIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DefaultBillId));
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

  public void initId(long value){
     this.initProperty(S_Id,new Long(value));
  }
  public  void setId(long value){
     this.set(S_Id,new Long(value));
  }
  public  void setIdNull(){
     this.set(S_Id,null);
  }

  public long getId(){
        return DataType.getAsLong(this.get(S_Id));
  
  }
  public long getIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Id));
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

  public void initDefaultUserId(long value){
     this.initProperty(S_DefaultUserId,new Long(value));
  }
  public  void setDefaultUserId(long value){
     this.set(S_DefaultUserId,new Long(value));
  }
  public  void setDefaultUserIdNull(){
     this.set(S_DefaultUserId,null);
  }

  public long getDefaultUserId(){
        return DataType.getAsLong(this.get(S_DefaultUserId));
  
  }
  public long getDefaultUserIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_DefaultUserId));
      }

  public void initPayType(String value){
	     this.initProperty(S_PayType,value);
	  }
	  public  void setPayType(String value){
	     this.set(S_PayType,value);
	  }
	  public  void setPayTypeNull(){
	     this.set(S_PayType,null);
	  }

	  public String getPayType(){
	       return DataType.getAsString(this.get(S_PayType));
	  
	  }
	  public String getPayTypeInitialValue(){
	        return DataType.getAsString(this.getOldObj(S_PayType));
	      }
 }

