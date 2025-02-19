package com.asiainfo.crm.cm.inner.customer.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.inner.customer.ivalues.*;

public class QBOCmxGroupOrgStructBean extends DataContainer implements DataContainerInterface,IQBOCmxGroupOrgStructValue{

  private static String  m_boName = "com.asiainfo.crm.cm.inner.customer.bo.QBOCmxGroupOrgStruct";



  public final static  String S_PostAddress = "POST_ADDRESS";
  public final static  String S_DeptId = "DEPT_ID";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_PostProvince = "POST_PROVINCE";
  public final static  String S_DeptType = "DEPT_TYPE";
  public final static  String S_ContName = "CONT_NAME";
  public final static  String S_DeptName = "DEPT_NAME";
  public final static  String S_ShortName = "SHORT_NAME";
  public final static  String S_Street = "STREET";
  public final static  String S_County = "COUNTY";
  public final static  String S_PostCity = "POST_CITY";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_ContMobile = "CONT_MOBILE";
  public final static  String S_ParentDeptId = "PARENT_DEPT_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_Email = "EMAIL";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_FaxId = "FAX_ID";
  public final static  String S_ContCertType = "CONT_CERT_TYPE";
  public final static  String S_EnglishName = "ENGLISH_NAME";
  public final static  String S_Room = "ROOM";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_PostPostcod = "POST_POSTCOD";
  public final static  String S_Build = "BUILD";
  public final static  String S_DeptLevel = "DEPT_LEVEL";
  public final static  String S_Principal = "PRINCIPAL";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_DeptFunc = "DEPT_FUNC";
  public final static  String S_Province = "PROVINCE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_PrincipalTel = "PRINCIPAL_TEL";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_City = "CITY";
  public final static  String S_MemberNum = "MEMBER_NUM";
  public final static  String S_ContCertCode = "CONT_CERT_CODE";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public QBOCmxGroupOrgStructBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initPostAddress(String value){
     this.initProperty(S_PostAddress,value);
  }
  public  void setPostAddress(String value){
     this.set(S_PostAddress,value);
  }
  public  void setPostAddressNull(){
     this.set(S_PostAddress,null);
  }

  public String getPostAddress(){
       return DataType.getAsString(this.get(S_PostAddress));
  
  }
  public String getPostAddressInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PostAddress));
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

  public void initPostProvince(String value){
     this.initProperty(S_PostProvince,value);
  }
  public  void setPostProvince(String value){
     this.set(S_PostProvince,value);
  }
  public  void setPostProvinceNull(){
     this.set(S_PostProvince,null);
  }

  public String getPostProvince(){
       return DataType.getAsString(this.get(S_PostProvince));
  
  }
  public String getPostProvinceInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PostProvince));
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

  public void initContName(String value){
     this.initProperty(S_ContName,value);
  }
  public  void setContName(String value){
     this.set(S_ContName,value);
  }
  public  void setContNameNull(){
     this.set(S_ContName,null);
  }

  public String getContName(){
       return DataType.getAsString(this.get(S_ContName));
  
  }
  public String getContNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContName));
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

  public void initShortName(String value){
     this.initProperty(S_ShortName,value);
  }
  public  void setShortName(String value){
     this.set(S_ShortName,value);
  }
  public  void setShortNameNull(){
     this.set(S_ShortName,null);
  }

  public String getShortName(){
       return DataType.getAsString(this.get(S_ShortName));
  
  }
  public String getShortNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ShortName));
      }

  public void initStreet(String value){
     this.initProperty(S_Street,value);
  }
  public  void setStreet(String value){
     this.set(S_Street,value);
  }
  public  void setStreetNull(){
     this.set(S_Street,null);
  }

  public String getStreet(){
       return DataType.getAsString(this.get(S_Street));
  
  }
  public String getStreetInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Street));
      }

  public void initCounty(String value){
     this.initProperty(S_County,value);
  }
  public  void setCounty(String value){
     this.set(S_County,value);
  }
  public  void setCountyNull(){
     this.set(S_County,null);
  }

  public String getCounty(){
       return DataType.getAsString(this.get(S_County));
  
  }
  public String getCountyInitialValue(){
        return DataType.getAsString(this.getOldObj(S_County));
      }

  public void initPostCity(String value){
     this.initProperty(S_PostCity,value);
  }
  public  void setPostCity(String value){
     this.set(S_PostCity,value);
  }
  public  void setPostCityNull(){
     this.set(S_PostCity,null);
  }

  public String getPostCity(){
       return DataType.getAsString(this.get(S_PostCity));
  
  }
  public String getPostCityInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PostCity));
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

  public void initContMobile(String value){
     this.initProperty(S_ContMobile,value);
  }
  public  void setContMobile(String value){
     this.set(S_ContMobile,value);
  }
  public  void setContMobileNull(){
     this.set(S_ContMobile,null);
  }

  public String getContMobile(){
       return DataType.getAsString(this.get(S_ContMobile));
  
  }
  public String getContMobileInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContMobile));
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

  public void initEmail(String value){
     this.initProperty(S_Email,value);
  }
  public  void setEmail(String value){
     this.set(S_Email,value);
  }
  public  void setEmailNull(){
     this.set(S_Email,null);
  }

  public String getEmail(){
       return DataType.getAsString(this.get(S_Email));
  
  }
  public String getEmailInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Email));
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

  public void initFaxId(String value){
     this.initProperty(S_FaxId,value);
  }
  public  void setFaxId(String value){
     this.set(S_FaxId,value);
  }
  public  void setFaxIdNull(){
     this.set(S_FaxId,null);
  }

  public String getFaxId(){
       return DataType.getAsString(this.get(S_FaxId));
  
  }
  public String getFaxIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FaxId));
      }

  public void initContCertType(int value){
     this.initProperty(S_ContCertType,new Integer(value));
  }
  public  void setContCertType(int value){
     this.set(S_ContCertType,new Integer(value));
  }
  public  void setContCertTypeNull(){
     this.set(S_ContCertType,null);
  }

  public int getContCertType(){
        return DataType.getAsInt(this.get(S_ContCertType));
  
  }
  public int getContCertTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ContCertType));
      }

  public void initEnglishName(String value){
     this.initProperty(S_EnglishName,value);
  }
  public  void setEnglishName(String value){
     this.set(S_EnglishName,value);
  }
  public  void setEnglishNameNull(){
     this.set(S_EnglishName,null);
  }

  public String getEnglishName(){
       return DataType.getAsString(this.get(S_EnglishName));
  
  }
  public String getEnglishNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_EnglishName));
      }

  public void initRoom(String value){
     this.initProperty(S_Room,value);
  }
  public  void setRoom(String value){
     this.set(S_Room,value);
  }
  public  void setRoomNull(){
     this.set(S_Room,null);
  }

  public String getRoom(){
       return DataType.getAsString(this.get(S_Room));
  
  }
  public String getRoomInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Room));
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

  public void initPostPostcod(String value){
     this.initProperty(S_PostPostcod,value);
  }
  public  void setPostPostcod(String value){
     this.set(S_PostPostcod,value);
  }
  public  void setPostPostcodNull(){
     this.set(S_PostPostcod,null);
  }

  public String getPostPostcod(){
       return DataType.getAsString(this.get(S_PostPostcod));
  
  }
  public String getPostPostcodInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PostPostcod));
      }

  public void initBuild(String value){
     this.initProperty(S_Build,value);
  }
  public  void setBuild(String value){
     this.set(S_Build,value);
  }
  public  void setBuildNull(){
     this.set(S_Build,null);
  }

  public String getBuild(){
       return DataType.getAsString(this.get(S_Build));
  
  }
  public String getBuildInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Build));
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

  public void initProvince(String value){
     this.initProperty(S_Province,value);
  }
  public  void setProvince(String value){
     this.set(S_Province,value);
  }
  public  void setProvinceNull(){
     this.set(S_Province,null);
  }

  public String getProvince(){
       return DataType.getAsString(this.get(S_Province));
  
  }
  public String getProvinceInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Province));
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

  public void initCity(String value){
     this.initProperty(S_City,value);
  }
  public  void setCity(String value){
     this.set(S_City,value);
  }
  public  void setCityNull(){
     this.set(S_City,null);
  }

  public String getCity(){
       return DataType.getAsString(this.get(S_City));
  
  }
  public String getCityInitialValue(){
        return DataType.getAsString(this.getOldObj(S_City));
      }

  public void initMemberNum(long value){
     this.initProperty(S_MemberNum,new Long(value));
  }
  public  void setMemberNum(long value){
     this.set(S_MemberNum,new Long(value));
  }
  public  void setMemberNumNull(){
     this.set(S_MemberNum,null);
  }

  public long getMemberNum(){
        return DataType.getAsLong(this.get(S_MemberNum));
  
  }
  public long getMemberNumInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_MemberNum));
      }

  public void initContCertCode(String value){
     this.initProperty(S_ContCertCode,value);
  }
  public  void setContCertCode(String value){
     this.set(S_ContCertCode,value);
  }
  public  void setContCertCodeNull(){
     this.set(S_ContCertCode,null);
  }

  public String getContCertCode(){
       return DataType.getAsString(this.get(S_ContCertCode));
  
  }
  public String getContCertCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContCertCode));
      }


 
 }

