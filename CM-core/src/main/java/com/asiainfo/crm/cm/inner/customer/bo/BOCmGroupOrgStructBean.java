package com.asiainfo.crm.cm.inner.customer.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.inner.customer.ivalues.*;

public class BOCmGroupOrgStructBean extends DataContainer implements DataContainerInterface,IBOCmGroupOrgStructValue{

  private static String  m_boName = "com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupOrgStruct";



  public final static  String S_DeptId = "DEPT_ID";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_DeptType = "DEPT_TYPE";
  public final static  String S_DeptName = "DEPT_NAME";
  public final static  String S_HasLeaf = "HAS_LEAF";
  public final static  String S_ModifiedDate = "MODIFIED_DATE";
  public final static  String S_IsContactPoint = "IS_CONTACT_POINT";
  public final static  String S_IsRevisable = "IS_REVISABLE";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_ParentDeptId = "PARENT_DEPT_ID";
  public final static  String S_IsCpeProvisioningNeeded = "IS_CPE_PROVISIONING_NEEDED";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_ModifiedBy = "MODIFIED_BY";
  public final static  String S_WifiName = "WIFI_NAME";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_RelCustId = "REL_CUST_ID";
  public final static  String S_DeptLevel = "DEPT_LEVEL";
  public final static  String S_IsHaveContactPoint = "IS_HAVE_CONTACT_POINT";
  public final static  String S_Principal = "PRINCIPAL";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_WifiPassword = "WIFI_PASSWORD";
  public final static  String S_DeptFunc = "DEPT_FUNC";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_PrincipalTel = "PRINCIPAL_TEL";
  public final static  String S_CreateDate = "CREATE_DATE";

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

  public void initDeptType(long value){
     this.initProperty(S_DeptType,new Long(value));
  }
  public  void setDeptType(long value){
     this.set(S_DeptType,new Long(value));
  }
  public  void setDeptTypeNull(){
     this.set(S_DeptType,null);
  }

  public long getDeptType(){
        return DataType.getAsLong(this.get(S_DeptType));
  
  }
  public long getDeptTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_DeptType));
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

  public void initModifiedDate(Timestamp value){
     this.initProperty(S_ModifiedDate,value);
  }
  public  void setModifiedDate(Timestamp value){
     this.set(S_ModifiedDate,value);
  }
  public  void setModifiedDateNull(){
     this.set(S_ModifiedDate,null);
  }

  public Timestamp getModifiedDate(){
        return DataType.getAsDateTime(this.get(S_ModifiedDate));
  
  }
  public Timestamp getModifiedDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_ModifiedDate));
      }

  public void initIsContactPoint(long value){
     this.initProperty(S_IsContactPoint,new Long(value));
  }
  public  void setIsContactPoint(long value){
     this.set(S_IsContactPoint,new Long(value));
  }
  public  void setIsContactPointNull(){
     this.set(S_IsContactPoint,null);
  }

  public long getIsContactPoint(){
        return DataType.getAsLong(this.get(S_IsContactPoint));
  
  }
  public long getIsContactPointInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_IsContactPoint));
      }

  public void initIsRevisable(long value){
     this.initProperty(S_IsRevisable,new Long(value));
  }
  public  void setIsRevisable(long value){
     this.set(S_IsRevisable,new Long(value));
  }
  public  void setIsRevisableNull(){
     this.set(S_IsRevisable,null);
  }

  public long getIsRevisable(){
        return DataType.getAsLong(this.get(S_IsRevisable));
  
  }
  public long getIsRevisableInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_IsRevisable));
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

  public void initIsCpeProvisioningNeeded(String value){
     this.initProperty(S_IsCpeProvisioningNeeded,value);
  }
  public  void setIsCpeProvisioningNeeded(String value){
     this.set(S_IsCpeProvisioningNeeded,value);
  }
  public  void setIsCpeProvisioningNeededNull(){
     this.set(S_IsCpeProvisioningNeeded,null);
  }

  public String getIsCpeProvisioningNeeded(){
       return DataType.getAsString(this.get(S_IsCpeProvisioningNeeded));
  
  }
  public String getIsCpeProvisioningNeededInitialValue(){
        return DataType.getAsString(this.getOldObj(S_IsCpeProvisioningNeeded));
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

  public void initModifiedBy(long value){
     this.initProperty(S_ModifiedBy,new Long(value));
  }
  public  void setModifiedBy(long value){
     this.set(S_ModifiedBy,new Long(value));
  }
  public  void setModifiedByNull(){
     this.set(S_ModifiedBy,null);
  }

  public long getModifiedBy(){
        return DataType.getAsLong(this.get(S_ModifiedBy));
  
  }
  public long getModifiedByInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ModifiedBy));
      }

  public void initWifiName(String value){
     this.initProperty(S_WifiName,value);
  }
  public  void setWifiName(String value){
     this.set(S_WifiName,value);
  }
  public  void setWifiNameNull(){
     this.set(S_WifiName,null);
  }

  public String getWifiName(){
       return DataType.getAsString(this.get(S_WifiName));
  
  }
  public String getWifiNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_WifiName));
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

  public void initDeptLevel(long value){
     this.initProperty(S_DeptLevel,new Long(value));
  }
  public  void setDeptLevel(long value){
     this.set(S_DeptLevel,new Long(value));
  }
  public  void setDeptLevelNull(){
     this.set(S_DeptLevel,null);
  }

  public long getDeptLevel(){
        return DataType.getAsLong(this.get(S_DeptLevel));
  
  }
  public long getDeptLevelInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_DeptLevel));
      }

  public void initIsHaveContactPoint(long value){
     this.initProperty(S_IsHaveContactPoint,new Long(value));
  }
  public  void setIsHaveContactPoint(long value){
     this.set(S_IsHaveContactPoint,new Long(value));
  }
  public  void setIsHaveContactPointNull(){
     this.set(S_IsHaveContactPoint,null);
  }

  public long getIsHaveContactPoint(){
        return DataType.getAsLong(this.get(S_IsHaveContactPoint));
  
  }
  public long getIsHaveContactPointInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_IsHaveContactPoint));
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

  public void initWifiPassword(String value){
     this.initProperty(S_WifiPassword,value);
  }
  public  void setWifiPassword(String value){
     this.set(S_WifiPassword,value);
  }
  public  void setWifiPasswordNull(){
     this.set(S_WifiPassword,null);
  }

  public String getWifiPassword(){
       return DataType.getAsString(this.get(S_WifiPassword));
  
  }
  public String getWifiPasswordInitialValue(){
        return DataType.getAsString(this.getOldObj(S_WifiPassword));
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


 
 }

