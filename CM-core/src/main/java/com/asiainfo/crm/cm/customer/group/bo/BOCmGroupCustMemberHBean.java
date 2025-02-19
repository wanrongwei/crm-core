package com.asiainfo.crm.cm.customer.group.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.customer.group.ivalues.*;

public class BOCmGroupCustMemberHBean extends DataContainer implements DataContainerInterface,IBOCmGroupCustMemberHValue{

  private static String  m_boName = "com.asiainfo.crm.cm.customer.group.bo.BOCmGroupCustMemberH";



  public final static  String S_DeptId = "DEPT_ID";
  public final static  String S_MemberCustId = "MEMBER_CUST_ID";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_CustRegionId = "CUST_REGION_ID";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_MemberName = "MEMBER_NAME";
  public final static  String S_MemberType = "MEMBER_TYPE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_MemberRole = "MEMBER_ROLE";
  public final static  String S_CustRelId = "CUST_REL_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_HId = "H_ID";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_MemberStatus = "MEMBER_STATUS";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_MemberPosition = "MEMBER_POSITION";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_ProvideId = "PROVIDE_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_MemberDesc = "MEMBER_DESC";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_Brand = "BRAND";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmGroupCustMemberHBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initDeptId(long value){
     this.initProperty(S_DeptId,new Long(value));
  }
  public  void setDeptId(long value){
     this.set(S_DeptId,new Long(value));
  }
  public  void setDeptIdNull(){
     this.set(S_DeptId,null);
  }

  public long getDeptId(){
        return DataType.getAsLong(this.get(S_DeptId));
  
  }
  public long getDeptIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_DeptId));
      }

  public void initMemberCustId(long value){
     this.initProperty(S_MemberCustId,new Long(value));
  }
  public  void setMemberCustId(long value){
     this.set(S_MemberCustId,new Long(value));
  }
  public  void setMemberCustIdNull(){
     this.set(S_MemberCustId,null);
  }

  public long getMemberCustId(){
        return DataType.getAsLong(this.get(S_MemberCustId));
  
  }
  public long getMemberCustIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_MemberCustId));
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

  public void initCustRegionId(String value){
     this.initProperty(S_CustRegionId,value);
  }
  public  void setCustRegionId(String value){
     this.set(S_CustRegionId,value);
  }
  public  void setCustRegionIdNull(){
     this.set(S_CustRegionId,null);
  }

  public String getCustRegionId(){
       return DataType.getAsString(this.get(S_CustRegionId));
  
  }
  public String getCustRegionIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CustRegionId));
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

  public void initMemberName(String value){
     this.initProperty(S_MemberName,value);
  }
  public  void setMemberName(String value){
     this.set(S_MemberName,value);
  }
  public  void setMemberNameNull(){
     this.set(S_MemberName,null);
  }

  public String getMemberName(){
       return DataType.getAsString(this.get(S_MemberName));
  
  }
  public String getMemberNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_MemberName));
      }

  public void initMemberType(int value){
     this.initProperty(S_MemberType,new Integer(value));
  }
  public  void setMemberType(int value){
     this.set(S_MemberType,new Integer(value));
  }
  public  void setMemberTypeNull(){
     this.set(S_MemberType,null);
  }

  public int getMemberType(){
        return DataType.getAsInt(this.get(S_MemberType));
  
  }
  public int getMemberTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_MemberType));
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

  public void initMemberRole(int value){
     this.initProperty(S_MemberRole,new Integer(value));
  }
  public  void setMemberRole(int value){
     this.set(S_MemberRole,new Integer(value));
  }
  public  void setMemberRoleNull(){
     this.set(S_MemberRole,null);
  }

  public int getMemberRole(){
        return DataType.getAsInt(this.get(S_MemberRole));
  
  }
  public int getMemberRoleInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_MemberRole));
      }

  public void initCustRelId(long value){
     this.initProperty(S_CustRelId,new Long(value));
  }
  public  void setCustRelId(long value){
     this.set(S_CustRelId,new Long(value));
  }
  public  void setCustRelIdNull(){
     this.set(S_CustRelId,null);
  }

  public long getCustRelId(){
        return DataType.getAsLong(this.get(S_CustRelId));
  
  }
  public long getCustRelIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CustRelId));
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

  public void initHId(long value){
     this.initProperty(S_HId,new Long(value));
  }
  public  void setHId(long value){
     this.set(S_HId,new Long(value));
  }
  public  void setHIdNull(){
     this.set(S_HId,null);
  }

  public long getHId(){
        return DataType.getAsLong(this.get(S_HId));
  
  }
  public long getHIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_HId));
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

  public void initMemberStatus(int value){
     this.initProperty(S_MemberStatus,new Integer(value));
  }
  public  void setMemberStatus(int value){
     this.set(S_MemberStatus,new Integer(value));
  }
  public  void setMemberStatusNull(){
     this.set(S_MemberStatus,null);
  }

  public int getMemberStatus(){
        return DataType.getAsInt(this.get(S_MemberStatus));
  
  }
  public int getMemberStatusInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_MemberStatus));
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

  public void initMemberPosition(String value){
     this.initProperty(S_MemberPosition,value);
  }
  public  void setMemberPosition(String value){
     this.set(S_MemberPosition,value);
  }
  public  void setMemberPositionNull(){
     this.set(S_MemberPosition,null);
  }

  public String getMemberPosition(){
       return DataType.getAsString(this.get(S_MemberPosition));
  
  }
  public String getMemberPositionInitialValue(){
        return DataType.getAsString(this.getOldObj(S_MemberPosition));
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

  public void initProvideId(int value){
     this.initProperty(S_ProvideId,new Integer(value));
  }
  public  void setProvideId(int value){
     this.set(S_ProvideId,new Integer(value));
  }
  public  void setProvideIdNull(){
     this.set(S_ProvideId,null);
  }

  public int getProvideId(){
        return DataType.getAsInt(this.get(S_ProvideId));
  
  }
  public int getProvideIdInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ProvideId));
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

  public void initMemberDesc(String value){
     this.initProperty(S_MemberDesc,value);
  }
  public  void setMemberDesc(String value){
     this.set(S_MemberDesc,value);
  }
  public  void setMemberDescNull(){
     this.set(S_MemberDesc,null);
  }

  public String getMemberDesc(){
       return DataType.getAsString(this.get(S_MemberDesc));
  
  }
  public String getMemberDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_MemberDesc));
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

  public void initBrand(String value){
     this.initProperty(S_Brand,value);
  }
  public  void setBrand(String value){
     this.set(S_Brand,value);
  }
  public  void setBrandNull(){
     this.set(S_Brand,null);
  }

  public String getBrand(){
       return DataType.getAsString(this.get(S_Brand));
  
  }
  public String getBrandInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Brand));
      }


 
 }

