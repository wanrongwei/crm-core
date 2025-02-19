package com.asiainfo.crm.cm.customer.group.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.customer.group.ivalues.*;

public class BOCmGroupOrgStructBean extends DataContainer implements DataContainerInterface,IBOCmGroupOrgStructValue{

  private static String  m_boName = "com.asiainfo.crm.cm.customer.group.bo.BOCmGroupOrgStruct";



  public final static  String S_DeptId = "DEPT_ID";
  public final static  String S_CountyCode = "COUNTY_CODE";
  public final static  String S_State = "STATE";
  public final static  String S_DeptType = "DEPT_TYPE";
  public final static  String S_DeptName = "DEPT_NAME";
  public final static  String S_HasLeaf = "HAS_LEAF";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_ParentDeptId = "PARENT_DEPT_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_Notes = "NOTES";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_DeptLevel = "DEPT_LEVEL";
  public final static  String S_GroupCustId = "GROUP_CUST_ID";
  public final static  String S_Principal = "PRINCIPAL";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_DeptFunc = "DEPT_FUNC";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_RelObjectId = "REL_OBJECT_ID";
  public final static  String S_PrincipalTel = "PRINCIPAL_TEL";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_RegionCode = "REGION_CODE";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmGroupOrgStructBean() throws AIException{
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

  public void initDeptType(int value){
     this.initProperty(S_DeptType,new Integer(value));
  }
  public  void setDeptType(int value){
     this.set(S_DeptType,new Integer(value));
  }
  public  void setDeptTypeNull(){
     this.set(S_DeptType,null);
  }

  public int getDeptType(){
        return DataType.getAsInt(this.get(S_DeptType));
  
  }
  public int getDeptTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_DeptType));
      }

  public void initDeptName(String value){
     this.initProperty(S_DeptName,value);
  }
  public  void setDeptName(String value){
     this.set(S_DeptName,value);
  }
  public  void setDeptNameNull(){
     this.set(S_DeptName,null);
  }

  public String getDeptName(){
       return DataType.getAsString(this.get(S_DeptName));
  
  }
  public String getDeptNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DeptName));
      }

  public void initHasLeaf(long value){
     this.initProperty(S_HasLeaf,new Long(value));
  }
  public  void setHasLeaf(long value){
     this.set(S_HasLeaf,new Long(value));
  }
  public  void setHasLeafNull(){
     this.set(S_HasLeaf,null);
  }

  public long getHasLeaf(){
        return DataType.getAsLong(this.get(S_HasLeaf));
  
  }
  public long getHasLeafInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_HasLeaf));
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

  public void initParentDeptId(long value){
     this.initProperty(S_ParentDeptId,new Long(value));
  }
  public  void setParentDeptId(long value){
     this.set(S_ParentDeptId,new Long(value));
  }
  public  void setParentDeptIdNull(){
     this.set(S_ParentDeptId,null);
  }

  public long getParentDeptId(){
        return DataType.getAsLong(this.get(S_ParentDeptId));
  
  }
  public long getParentDeptIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ParentDeptId));
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

  public void initNotes(String value){
     this.initProperty(S_Notes,value);
  }
  public  void setNotes(String value){
     this.set(S_Notes,value);
  }
  public  void setNotesNull(){
     this.set(S_Notes,null);
  }

  public String getNotes(){
       return DataType.getAsString(this.get(S_Notes));
  
  }
  public String getNotesInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Notes));
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

  public void initDeptLevel(int value){
     this.initProperty(S_DeptLevel,new Integer(value));
  }
  public  void setDeptLevel(int value){
     this.set(S_DeptLevel,new Integer(value));
  }
  public  void setDeptLevelNull(){
     this.set(S_DeptLevel,null);
  }

  public int getDeptLevel(){
        return DataType.getAsInt(this.get(S_DeptLevel));
  
  }
  public int getDeptLevelInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_DeptLevel));
      }

  public void initGroupCustId(long value){
     this.initProperty(S_GroupCustId,new Long(value));
  }
  public  void setGroupCustId(long value){
     this.set(S_GroupCustId,new Long(value));
  }
  public  void setGroupCustIdNull(){
     this.set(S_GroupCustId,null);
  }

  public long getGroupCustId(){
        return DataType.getAsLong(this.get(S_GroupCustId));
  
  }
  public long getGroupCustIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_GroupCustId));
      }

  public void initPrincipal(String value){
     this.initProperty(S_Principal,value);
  }
  public  void setPrincipal(String value){
     this.set(S_Principal,value);
  }
  public  void setPrincipalNull(){
     this.set(S_Principal,null);
  }

  public String getPrincipal(){
       return DataType.getAsString(this.get(S_Principal));
  
  }
  public String getPrincipalInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Principal));
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

  public void initDeptFunc(String value){
     this.initProperty(S_DeptFunc,value);
  }
  public  void setDeptFunc(String value){
     this.set(S_DeptFunc,value);
  }
  public  void setDeptFuncNull(){
     this.set(S_DeptFunc,null);
  }

  public String getDeptFunc(){
       return DataType.getAsString(this.get(S_DeptFunc));
  
  }
  public String getDeptFuncInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DeptFunc));
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

  public void initRelObjectId(long value){
     this.initProperty(S_RelObjectId,new Long(value));
  }
  public  void setRelObjectId(long value){
     this.set(S_RelObjectId,new Long(value));
  }
  public  void setRelObjectIdNull(){
     this.set(S_RelObjectId,null);
  }

  public long getRelObjectId(){
        return DataType.getAsLong(this.get(S_RelObjectId));
  
  }
  public long getRelObjectIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_RelObjectId));
      }

  public void initPrincipalTel(String value){
     this.initProperty(S_PrincipalTel,value);
  }
  public  void setPrincipalTel(String value){
     this.set(S_PrincipalTel,value);
  }
  public  void setPrincipalTelNull(){
     this.set(S_PrincipalTel,null);
  }

  public String getPrincipalTel(){
       return DataType.getAsString(this.get(S_PrincipalTel));
  
  }
  public String getPrincipalTelInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PrincipalTel));
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

  public void initRegionCode(String value){
     this.initProperty(S_RegionCode,value);
  }
  public  void setRegionCode(String value){
     this.set(S_RegionCode,value);
  }
  public  void setRegionCodeNull(){
     this.set(S_RegionCode,null);
  }

  public String getRegionCode(){
       return DataType.getAsString(this.get(S_RegionCode));
  
  }
  public String getRegionCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_RegionCode));
      }


 
 }

