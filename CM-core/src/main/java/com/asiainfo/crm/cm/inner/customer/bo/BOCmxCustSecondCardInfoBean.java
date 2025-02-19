package com.asiainfo.crm.cm.inner.customer.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.inner.customer.ivalues.*;

public class BOCmxCustSecondCardInfoBean extends DataContainer implements DataContainerInterface,IBOCmxCustSecondCardInfoValue{

  private static String  m_boName = "com.asiainfo.crm.cm.inner.customer.bo.BOCmxCustSecondCardInfo";



  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_CustStatus = "CUST_STATUS";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_State = "STATE";
  public final static  String S_FirstCertCode = "FIRST_CERT_CODE";
  public final static  String S_SecondCertAddress = "SECOND_CERT_ADDRESS";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_SecondCertEffdate = "SECOND_CERT_EFFDATE";
  public final static  String S_FirstCertType = "FIRST_CERT_TYPE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_SecondCertCode = "SECOND_CERT_CODE";
  public final static  String S_FirstCertExpire = "FIRST_CERT_EXPIRE";
  public final static  String S_FirstCertEffdate = "FIRST_CERT_EFFDATE";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_FirstCertAddress = "FIRST_CERT_ADDRESS";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_SecondCertType = "SECOND_CERT_TYPE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_SecondCertExpire = "SECOND_CERT_EXPIRE";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmxCustSecondCardInfoBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
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

  public void initCustStatus(int value){
     this.initProperty(S_CustStatus,new Integer(value));
  }
  public  void setCustStatus(int value){
     this.set(S_CustStatus,new Integer(value));
  }
  public  void setCustStatusNull(){
     this.set(S_CustStatus,null);
  }

  public int getCustStatus(){
        return DataType.getAsInt(this.get(S_CustStatus));
  
  }
  public int getCustStatusInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CustStatus));
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

  public void initFirstCertCode(String value){
     this.initProperty(S_FirstCertCode,value);
  }
  public  void setFirstCertCode(String value){
     this.set(S_FirstCertCode,value);
  }
  public  void setFirstCertCodeNull(){
     this.set(S_FirstCertCode,null);
  }

  public String getFirstCertCode(){
       return DataType.getAsString(this.get(S_FirstCertCode));
  
  }
  public String getFirstCertCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FirstCertCode));
      }

  public void initSecondCertAddress(String value){
     this.initProperty(S_SecondCertAddress,value);
  }
  public  void setSecondCertAddress(String value){
     this.set(S_SecondCertAddress,value);
  }
  public  void setSecondCertAddressNull(){
     this.set(S_SecondCertAddress,null);
  }

  public String getSecondCertAddress(){
       return DataType.getAsString(this.get(S_SecondCertAddress));
  
  }
  public String getSecondCertAddressInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SecondCertAddress));
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

  public void initSecondCertEffdate(Timestamp value){
     this.initProperty(S_SecondCertEffdate,value);
  }
  public  void setSecondCertEffdate(Timestamp value){
     this.set(S_SecondCertEffdate,value);
  }
  public  void setSecondCertEffdateNull(){
     this.set(S_SecondCertEffdate,null);
  }

  public Timestamp getSecondCertEffdate(){
        return DataType.getAsDateTime(this.get(S_SecondCertEffdate));
  
  }
  public Timestamp getSecondCertEffdateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_SecondCertEffdate));
      }

  public void initFirstCertType(int value){
     this.initProperty(S_FirstCertType,new Integer(value));
  }
  public  void setFirstCertType(int value){
     this.set(S_FirstCertType,new Integer(value));
  }
  public  void setFirstCertTypeNull(){
     this.set(S_FirstCertType,null);
  }

  public int getFirstCertType(){
        return DataType.getAsInt(this.get(S_FirstCertType));
  
  }
  public int getFirstCertTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_FirstCertType));
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

  public void initSecondCertCode(String value){
     this.initProperty(S_SecondCertCode,value);
  }
  public  void setSecondCertCode(String value){
     this.set(S_SecondCertCode,value);
  }
  public  void setSecondCertCodeNull(){
     this.set(S_SecondCertCode,null);
  }

  public String getSecondCertCode(){
       return DataType.getAsString(this.get(S_SecondCertCode));
  
  }
  public String getSecondCertCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SecondCertCode));
      }

  public void initFirstCertExpire(Timestamp value){
     this.initProperty(S_FirstCertExpire,value);
  }
  public  void setFirstCertExpire(Timestamp value){
     this.set(S_FirstCertExpire,value);
  }
  public  void setFirstCertExpireNull(){
     this.set(S_FirstCertExpire,null);
  }

  public Timestamp getFirstCertExpire(){
        return DataType.getAsDateTime(this.get(S_FirstCertExpire));
  
  }
  public Timestamp getFirstCertExpireInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_FirstCertExpire));
      }

  public void initFirstCertEffdate(Timestamp value){
     this.initProperty(S_FirstCertEffdate,value);
  }
  public  void setFirstCertEffdate(Timestamp value){
     this.set(S_FirstCertEffdate,value);
  }
  public  void setFirstCertEffdateNull(){
     this.set(S_FirstCertEffdate,null);
  }

  public Timestamp getFirstCertEffdate(){
        return DataType.getAsDateTime(this.get(S_FirstCertEffdate));
  
  }
  public Timestamp getFirstCertEffdateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_FirstCertEffdate));
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

  public void initFirstCertAddress(String value){
     this.initProperty(S_FirstCertAddress,value);
  }
  public  void setFirstCertAddress(String value){
     this.set(S_FirstCertAddress,value);
  }
  public  void setFirstCertAddressNull(){
     this.set(S_FirstCertAddress,null);
  }

  public String getFirstCertAddress(){
       return DataType.getAsString(this.get(S_FirstCertAddress));
  
  }
  public String getFirstCertAddressInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FirstCertAddress));
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

  public void initSecondCertType(int value){
     this.initProperty(S_SecondCertType,new Integer(value));
  }
  public  void setSecondCertType(int value){
     this.set(S_SecondCertType,new Integer(value));
  }
  public  void setSecondCertTypeNull(){
     this.set(S_SecondCertType,null);
  }

  public int getSecondCertType(){
        return DataType.getAsInt(this.get(S_SecondCertType));
  
  }
  public int getSecondCertTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_SecondCertType));
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

  public void initSecondCertExpire(Timestamp value){
     this.initProperty(S_SecondCertExpire,value);
  }
  public  void setSecondCertExpire(Timestamp value){
     this.set(S_SecondCertExpire,value);
  }
  public  void setSecondCertExpireNull(){
     this.set(S_SecondCertExpire,null);
  }

  public Timestamp getSecondCertExpire(){
        return DataType.getAsDateTime(this.get(S_SecondCertExpire));
  
  }
  public Timestamp getSecondCertExpireInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_SecondCertExpire));
      }


 
 }

