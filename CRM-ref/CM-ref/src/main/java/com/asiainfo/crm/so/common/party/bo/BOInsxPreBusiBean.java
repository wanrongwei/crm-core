package com.asiainfo.crm.so.common.party.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.so.common.party.ivalues.*;

public class BOInsxPreBusiBean extends DataContainer implements DataContainerInterface,IBOInsxPreBusiValue{

  private static String  m_boName = "com.asiainfo.crm.so.common.party.bo.BOInsxPreBusi";



  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_BusinessId = "BUSINESS_ID";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_CountyCode = "COUNTY_CODE";
  public final static  String S_ReserveRegionId = "RESERVE_REGION_ID";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_ReserveId = "RESERVE_ID";
  public final static  String S_ReserveType = "RESERVE_TYPE";
  public final static  String S_Remark = "REMARK";
  public final static  String S_ReserveCountyCode = "RESERVE_COUNTY_CODE";
  public final static  String S_ReserveOrgId = "RESERVE_ORG_ID";
  public final static  String S_LinkPhone = "LINK_PHONE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_BookTime = "BOOK_TIME";
  public final static  String S_ValidDate = "VALID_DATE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_ReserveSts = "RESERVE_STS";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOInsxPreBusiBean() throws AIException{
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

  public void initBusinessId(long value){
     this.initProperty(S_BusinessId,new Long(value));
  }
  public  void setBusinessId(long value){
     this.set(S_BusinessId,new Long(value));
  }
  public  void setBusinessIdNull(){
     this.set(S_BusinessId,null);
  }

  public long getBusinessId(){
        return DataType.getAsLong(this.get(S_BusinessId));
  
  }
  public long getBusinessIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_BusinessId));
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

  public void initCountyCode(String value){
     this.initProperty(S_CountyCode,value);
  }
  public  void setCountyCode(String value){
     this.set(S_CountyCode,value);
  }
  public  void setCountyCodeNull(){
     this.set(S_CountyCode,null);
  }

  public String getCountyCode(){
       return DataType.getAsString(this.get(S_CountyCode));
  
  }
  public String getCountyCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CountyCode));
      }

  public void initReserveRegionId(String value){
     this.initProperty(S_ReserveRegionId,value);
  }
  public  void setReserveRegionId(String value){
     this.set(S_ReserveRegionId,value);
  }
  public  void setReserveRegionIdNull(){
     this.set(S_ReserveRegionId,null);
  }

  public String getReserveRegionId(){
       return DataType.getAsString(this.get(S_ReserveRegionId));
  
  }
  public String getReserveRegionIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ReserveRegionId));
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

  public void initReserveId(long value){
     this.initProperty(S_ReserveId,new Long(value));
  }
  public  void setReserveId(long value){
     this.set(S_ReserveId,new Long(value));
  }
  public  void setReserveIdNull(){
     this.set(S_ReserveId,null);
  }

  public long getReserveId(){
        return DataType.getAsLong(this.get(S_ReserveId));
  
  }
  public long getReserveIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ReserveId));
      }

  public void initReserveType(int value){
     this.initProperty(S_ReserveType,new Integer(value));
  }
  public  void setReserveType(int value){
     this.set(S_ReserveType,new Integer(value));
  }
  public  void setReserveTypeNull(){
     this.set(S_ReserveType,null);
  }

  public int getReserveType(){
        return DataType.getAsInt(this.get(S_ReserveType));
  
  }
  public int getReserveTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ReserveType));
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

  public void initReserveCountyCode(String value){
     this.initProperty(S_ReserveCountyCode,value);
  }
  public  void setReserveCountyCode(String value){
     this.set(S_ReserveCountyCode,value);
  }
  public  void setReserveCountyCodeNull(){
     this.set(S_ReserveCountyCode,null);
  }

  public String getReserveCountyCode(){
       return DataType.getAsString(this.get(S_ReserveCountyCode));
  
  }
  public String getReserveCountyCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ReserveCountyCode));
      }

  public void initReserveOrgId(long value){
     this.initProperty(S_ReserveOrgId,new Long(value));
  }
  public  void setReserveOrgId(long value){
     this.set(S_ReserveOrgId,new Long(value));
  }
  public  void setReserveOrgIdNull(){
     this.set(S_ReserveOrgId,null);
  }

  public long getReserveOrgId(){
        return DataType.getAsLong(this.get(S_ReserveOrgId));
  
  }
  public long getReserveOrgIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ReserveOrgId));
      }

  public void initLinkPhone(String value){
     this.initProperty(S_LinkPhone,value);
  }
  public  void setLinkPhone(String value){
     this.set(S_LinkPhone,value);
  }
  public  void setLinkPhoneNull(){
     this.set(S_LinkPhone,null);
  }

  public String getLinkPhone(){
       return DataType.getAsString(this.get(S_LinkPhone));
  
  }
  public String getLinkPhoneInitialValue(){
        return DataType.getAsString(this.getOldObj(S_LinkPhone));
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

  public void initBookTime(Timestamp value){
     this.initProperty(S_BookTime,value);
  }
  public  void setBookTime(Timestamp value){
     this.set(S_BookTime,value);
  }
  public  void setBookTimeNull(){
     this.set(S_BookTime,null);
  }

  public Timestamp getBookTime(){
        return DataType.getAsDateTime(this.get(S_BookTime));
  
  }
  public Timestamp getBookTimeInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_BookTime));
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

  public void initReserveSts(int value){
     this.initProperty(S_ReserveSts,new Integer(value));
  }
  public  void setReserveSts(int value){
     this.set(S_ReserveSts,new Integer(value));
  }
  public  void setReserveStsNull(){
     this.set(S_ReserveSts,null);
  }

  public int getReserveSts(){
        return DataType.getAsInt(this.get(S_ReserveSts));
  
  }
  public int getReserveStsInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ReserveSts));
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


 
 }

