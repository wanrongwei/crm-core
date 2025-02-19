package com.asiainfo.crm.cm.customer.group.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.customer.group.ivalues.*;

public class QBOCmGroupCustomerOperBean extends DataContainer implements DataContainerInterface,IQBOCmGroupCustomerOperValue{

  private static String  m_boName = "com.asiainfo.crm.cm.customer.group.bo.QBOCmGroupCustomerOper";



  public final static  String S_MemberDesc = "member_desc";
  public final static  String S_ExpireDate = "expire_date";
  public final static  String S_MemberType = "member_type";
  public final static  String S_MemberRole = "member_role";
  public final static  String S_BOpId = "B_op_id";
  public final static  String S_CustRelId = "cust_rel_id";
  public final static  String S_DoneDate = "done_date";
  public final static  String S_OperatorId = "operator_id";
  public final static  String S_RelaId = "rela_id";
  public final static  String S_State = "state";
  public final static  String S_RegionId = "region_id";
  public final static  String S_BCreateDate = "B_create_date";
  public final static  String S_Remarks = "remarks";
  public final static  String S_BState = "B_state";
  public final static  String S_MemberStatus = "member_status";
  public final static  String S_LastNameQry = "last_name_qry";
  public final static  String S_BRemarks = "B_remarks";
  public final static  String S_FirstName = "first_name";
  public final static  String S_DeptId = "dept_id";
  public final static  String S_OpId = "op_id";
  public final static  String S_BDoneCode = "B_done_code";
  public final static  String S_CreateDate = "create_date";
  public final static  String S_FirstNameQry = "first_name_qry";
  public final static  String S_BExpireDate = "B_expire_date";
  public final static  String S_UserId = "user_id";
  public final static  String S_BOrgId = "B_org_id";
  public final static  String S_MemberPosition = "member_position";
  public final static  String S_CreateOpId = "create_op_id";
  public final static  String S_BRegionId = "B_region_id";
  public final static  String S_BCreateOrgId = "B_create_org_id";
  public final static  String S_MiddleName = "middle_name";
  public final static  String S_DoneCode = "done_code";
  public final static  String S_BCreateOpId = "B_create_op_id";
  public final static  String S_CustId = "cust_id";
  public final static  String S_CustRegionId = "cust_region_id";
  public final static  String S_OrgId = "org_id";
  public final static  String S_MemberCustId = "member_cust_id";
  public final static  String S_BEffectiveDate = "B_effective_date";
  public final static  String S_BDoneDate = "B_done_date";
  public final static  String S_MemberNameQry = "member_name_qry";
  public final static  String S_LastName = "last_name";
  public final static  String S_Brand = "brand";
  public final static  String S_EffectiveDate = "effective_date";
  public final static  String S_ProvideId = "provide_id";
  public final static  String S_MiddleNameQry = "middle_name_qry";
  public final static  String S_MemberName = "member_name";
  public final static  String S_BillId = "bill_id";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public QBOCmGroupCustomerOperBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
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

  public void initBOpId(long value){
     this.initProperty(S_BOpId,new Long(value));
  }
  public  void setBOpId(long value){
     this.set(S_BOpId,new Long(value));
  }
  public  void setBOpIdNull(){
     this.set(S_BOpId,null);
  }

  public long getBOpId(){
        return DataType.getAsLong(this.get(S_BOpId));
  
  }
  public long getBOpIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_BOpId));
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

  public void initOperatorId(long value){
     this.initProperty(S_OperatorId,new Long(value));
  }
  public  void setOperatorId(long value){
     this.set(S_OperatorId,new Long(value));
  }
  public  void setOperatorIdNull(){
     this.set(S_OperatorId,null);
  }

  public long getOperatorId(){
        return DataType.getAsLong(this.get(S_OperatorId));
  
  }
  public long getOperatorIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_OperatorId));
      }

  public void initRelaId(long value){
     this.initProperty(S_RelaId,new Long(value));
  }
  public  void setRelaId(long value){
     this.set(S_RelaId,new Long(value));
  }
  public  void setRelaIdNull(){
     this.set(S_RelaId,null);
  }

  public long getRelaId(){
        return DataType.getAsLong(this.get(S_RelaId));
  
  }
  public long getRelaIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_RelaId));
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

  public void initBCreateDate(Timestamp value){
     this.initProperty(S_BCreateDate,value);
  }
  public  void setBCreateDate(Timestamp value){
     this.set(S_BCreateDate,value);
  }
  public  void setBCreateDateNull(){
     this.set(S_BCreateDate,null);
  }

  public Timestamp getBCreateDate(){
        return DataType.getAsDateTime(this.get(S_BCreateDate));
  
  }
  public Timestamp getBCreateDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_BCreateDate));
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

  public void initBState(String value){
     this.initProperty(S_BState,value);
  }
  public  void setBState(String value){
     this.set(S_BState,value);
  }
  public  void setBStateNull(){
     this.set(S_BState,null);
  }

  public String getBState(){
       return DataType.getAsString(this.get(S_BState));
  
  }
  public String getBStateInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BState));
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

  public void initLastNameQry(String value){
     this.initProperty(S_LastNameQry,value);
  }
  public  void setLastNameQry(String value){
     this.set(S_LastNameQry,value);
  }
  public  void setLastNameQryNull(){
     this.set(S_LastNameQry,null);
  }

  public String getLastNameQry(){
       return DataType.getAsString(this.get(S_LastNameQry));
  
  }
  public String getLastNameQryInitialValue(){
        return DataType.getAsString(this.getOldObj(S_LastNameQry));
      }

  public void initBRemarks(String value){
     this.initProperty(S_BRemarks,value);
  }
  public  void setBRemarks(String value){
     this.set(S_BRemarks,value);
  }
  public  void setBRemarksNull(){
     this.set(S_BRemarks,null);
  }

  public String getBRemarks(){
       return DataType.getAsString(this.get(S_BRemarks));
  
  }
  public String getBRemarksInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BRemarks));
      }

  public void initFirstName(String value){
     this.initProperty(S_FirstName,value);
  }
  public  void setFirstName(String value){
     this.set(S_FirstName,value);
  }
  public  void setFirstNameNull(){
     this.set(S_FirstName,null);
  }

  public String getFirstName(){
       return DataType.getAsString(this.get(S_FirstName));
  
  }
  public String getFirstNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FirstName));
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

  public void initBDoneCode(long value){
     this.initProperty(S_BDoneCode,new Long(value));
  }
  public  void setBDoneCode(long value){
     this.set(S_BDoneCode,new Long(value));
  }
  public  void setBDoneCodeNull(){
     this.set(S_BDoneCode,null);
  }

  public long getBDoneCode(){
        return DataType.getAsLong(this.get(S_BDoneCode));
  
  }
  public long getBDoneCodeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_BDoneCode));
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

  public void initFirstNameQry(String value){
     this.initProperty(S_FirstNameQry,value);
  }
  public  void setFirstNameQry(String value){
     this.set(S_FirstNameQry,value);
  }
  public  void setFirstNameQryNull(){
     this.set(S_FirstNameQry,null);
  }

  public String getFirstNameQry(){
       return DataType.getAsString(this.get(S_FirstNameQry));
  
  }
  public String getFirstNameQryInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FirstNameQry));
      }

  public void initBExpireDate(Timestamp value){
     this.initProperty(S_BExpireDate,value);
  }
  public  void setBExpireDate(Timestamp value){
     this.set(S_BExpireDate,value);
  }
  public  void setBExpireDateNull(){
     this.set(S_BExpireDate,null);
  }

  public Timestamp getBExpireDate(){
        return DataType.getAsDateTime(this.get(S_BExpireDate));
  
  }
  public Timestamp getBExpireDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_BExpireDate));
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

  public void initBOrgId(long value){
     this.initProperty(S_BOrgId,new Long(value));
  }
  public  void setBOrgId(long value){
     this.set(S_BOrgId,new Long(value));
  }
  public  void setBOrgIdNull(){
     this.set(S_BOrgId,null);
  }

  public long getBOrgId(){
        return DataType.getAsLong(this.get(S_BOrgId));
  
  }
  public long getBOrgIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_BOrgId));
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

  public void initBRegionId(String value){
     this.initProperty(S_BRegionId,value);
  }
  public  void setBRegionId(String value){
     this.set(S_BRegionId,value);
  }
  public  void setBRegionIdNull(){
     this.set(S_BRegionId,null);
  }

  public String getBRegionId(){
       return DataType.getAsString(this.get(S_BRegionId));
  
  }
  public String getBRegionIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BRegionId));
      }

  public void initBCreateOrgId(long value){
     this.initProperty(S_BCreateOrgId,new Long(value));
  }
  public  void setBCreateOrgId(long value){
     this.set(S_BCreateOrgId,new Long(value));
  }
  public  void setBCreateOrgIdNull(){
     this.set(S_BCreateOrgId,null);
  }

  public long getBCreateOrgId(){
        return DataType.getAsLong(this.get(S_BCreateOrgId));
  
  }
  public long getBCreateOrgIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_BCreateOrgId));
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

  public void initBCreateOpId(long value){
     this.initProperty(S_BCreateOpId,new Long(value));
  }
  public  void setBCreateOpId(long value){
     this.set(S_BCreateOpId,new Long(value));
  }
  public  void setBCreateOpIdNull(){
     this.set(S_BCreateOpId,null);
  }

  public long getBCreateOpId(){
        return DataType.getAsLong(this.get(S_BCreateOpId));
  
  }
  public long getBCreateOpIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_BCreateOpId));
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

  public void initBEffectiveDate(Timestamp value){
     this.initProperty(S_BEffectiveDate,value);
  }
  public  void setBEffectiveDate(Timestamp value){
     this.set(S_BEffectiveDate,value);
  }
  public  void setBEffectiveDateNull(){
     this.set(S_BEffectiveDate,null);
  }

  public Timestamp getBEffectiveDate(){
        return DataType.getAsDateTime(this.get(S_BEffectiveDate));
  
  }
  public Timestamp getBEffectiveDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_BEffectiveDate));
      }

  public void initBDoneDate(Timestamp value){
     this.initProperty(S_BDoneDate,value);
  }
  public  void setBDoneDate(Timestamp value){
     this.set(S_BDoneDate,value);
  }
  public  void setBDoneDateNull(){
     this.set(S_BDoneDate,null);
  }

  public Timestamp getBDoneDate(){
        return DataType.getAsDateTime(this.get(S_BDoneDate));
  
  }
  public Timestamp getBDoneDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_BDoneDate));
      }

  public void initMemberNameQry(String value){
     this.initProperty(S_MemberNameQry,value);
  }
  public  void setMemberNameQry(String value){
     this.set(S_MemberNameQry,value);
  }
  public  void setMemberNameQryNull(){
     this.set(S_MemberNameQry,null);
  }

  public String getMemberNameQry(){
       return DataType.getAsString(this.get(S_MemberNameQry));
  
  }
  public String getMemberNameQryInitialValue(){
        return DataType.getAsString(this.getOldObj(S_MemberNameQry));
      }

  public void initLastName(String value){
     this.initProperty(S_LastName,value);
  }
  public  void setLastName(String value){
     this.set(S_LastName,value);
  }
  public  void setLastNameNull(){
     this.set(S_LastName,null);
  }

  public String getLastName(){
       return DataType.getAsString(this.get(S_LastName));
  
  }
  public String getLastNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_LastName));
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

  public void initMiddleNameQry(String value){
     this.initProperty(S_MiddleNameQry,value);
  }
  public  void setMiddleNameQry(String value){
     this.set(S_MiddleNameQry,value);
  }
  public  void setMiddleNameQryNull(){
     this.set(S_MiddleNameQry,null);
  }

  public String getMiddleNameQry(){
       return DataType.getAsString(this.get(S_MiddleNameQry));
  
  }
  public String getMiddleNameQryInitialValue(){
        return DataType.getAsString(this.getOldObj(S_MiddleNameQry));
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


 
 }

