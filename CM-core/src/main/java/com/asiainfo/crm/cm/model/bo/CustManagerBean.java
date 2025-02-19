package com.asiainfo.crm.cm.model.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.model.ivalues.*;

public class CustManagerBean extends DataContainer implements DataContainerInterface,ICustManagerValue{

  private static String  m_boName = "com.asiainfo.crm.cm.model.bo.CustManager";



  public final static  String S_CertCode = "CERT_CODE";
  public final static  String S_ParentOrganizeId = "PARENT_ORGANIZE_ID";
  public final static  String S_ManagerTypeDesc = "MANAGER_TYPE_DESC";
  public final static  String S_OperTypeDesc = "OPER_TYPE_DESC";
  public final static  String S_CertTypeDesc = "CERT_TYPE_DESC";
  public final static  String S_CityId = "CITY_ID";
  public final static  String S_OrganizeType = "ORGANIZE_TYPE";
  public final static  String S_CertAddress = "CERT_ADDRESS";
  public final static  String S_CountyIdDesc = "COUNTY_ID_DESC";
  public final static  String S_SubRegionType = "SUB_REGION_TYPE";
  public final static  String S_CityIdDesc = "CITY_ID_DESC";
  public final static  String S_SubRegionTypeDesc = "SUB_REGION_TYPE_DESC";
  public final static  String S_CertEffdate = "CERT_EFFDATE";
  public final static  String S_OrganizeTypeDesc = "ORGANIZE_TYPE_DESC";
  public final static  String S_EnglishName = "ENGLISH_NAME";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_OrganizeName = "ORGANIZE_NAME";
  public final static  String S_RelType = "REL_TYPE";
  public final static  String S_ContEmail = "CONT_EMAIL";
  public final static  String S_StaffLevel = "STAFF_LEVEL";
  public final static  String S_RegionType = "REGION_TYPE";
  public final static  String S_CertExpireDate = "CERT_EXPIRE_DATE";
  public final static  String S_OfficeTel = "OFFICE_TEL";
  public final static  String S_ManagerId = "MANAGER_ID";
  public final static  String S_RelTypeDesc = "REL_TYPE_DESC";
  public final static  String S_WirelessCall = "WIRELESS_CALL";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_OrganizeId = "ORGANIZE_ID";
  public final static  String S_StaffType = "STAFF_TYPE";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_MarryStatusDesc = "MARRY_STATUS_DESC";
  public final static  String S_Postcode = "POSTCODE";
  public final static  String S_ShortName = "SHORT_NAME";
  public final static  String S_Nationality = "NATIONALITY";
  public final static  String S_ProvinceIdDesc = "PROVINCE_ID_DESC";
  public final static  String S_ParentStaffId = "PARENT_STAFF_ID";
  public final static  String S_BcMgr = "BC_MGR";
  public final static  String S_HomeTel = "HOME_TEL";
  public final static  String S_StaffTypeDesc = "STAFF_TYPE_DESC";
  public final static  String S_StaffLevelDesc = "STAFF_LEVEL_DESC";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_MarryStatus = "MARRY_STATUS";
  public final static  String S_StaffName = "STAFF_NAME";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_OperType = "OPER_TYPE";
  public final static  String S_Birthday = "BIRTHDAY";
  public final static  String S_RegionTypeDesc = "REGION_TYPE_DESC";
  public final static  String S_ContAddress = "CONT_ADDRESS";
  public final static  String S_NationalityDesc = "NATIONALITY_DESC";
  public final static  String S_ProvinceId = "PROVINCE_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RelId = "REL_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CertType = "CERT_TYPE";
  public final static  String S_StaffId = "STAFF_ID";
  public final static  String S_CountyId = "COUNTY_ID";
  public final static  String S_Gender = "GENDER";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_ContFax = "CONT_FAX";
  public final static  String S_ManagerType = "MANAGER_TYPE";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public CustManagerBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initCertCode(String value){
     this.initProperty(S_CertCode,value);
  }
  public  void setCertCode(String value){
     this.set(S_CertCode,value);
  }
  public  void setCertCodeNull(){
     this.set(S_CertCode,null);
  }

  public String getCertCode(){
       return DataType.getAsString(this.get(S_CertCode));
  
  }
  public String getCertCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CertCode));
      }

  public void initParentOrganizeId(long value){
     this.initProperty(S_ParentOrganizeId,new Long(value));
  }
  public  void setParentOrganizeId(long value){
     this.set(S_ParentOrganizeId,new Long(value));
  }
  public  void setParentOrganizeIdNull(){
     this.set(S_ParentOrganizeId,null);
  }

  public long getParentOrganizeId(){
        return DataType.getAsLong(this.get(S_ParentOrganizeId));
  
  }
  public long getParentOrganizeIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ParentOrganizeId));
      }

  public void initManagerTypeDesc(String value){
     this.initProperty(S_ManagerTypeDesc,value);
  }
  public  void setManagerTypeDesc(String value){
     this.set(S_ManagerTypeDesc,value);
  }
  public  void setManagerTypeDescNull(){
     this.set(S_ManagerTypeDesc,null);
  }

  public String getManagerTypeDesc(){
       return DataType.getAsString(this.get(S_ManagerTypeDesc));
  
  }
  public String getManagerTypeDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ManagerTypeDesc));
      }

  public void initOperTypeDesc(String value){
     this.initProperty(S_OperTypeDesc,value);
  }
  public  void setOperTypeDesc(String value){
     this.set(S_OperTypeDesc,value);
  }
  public  void setOperTypeDescNull(){
     this.set(S_OperTypeDesc,null);
  }

  public String getOperTypeDesc(){
       return DataType.getAsString(this.get(S_OperTypeDesc));
  
  }
  public String getOperTypeDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OperTypeDesc));
      }

  public void initCertTypeDesc(String value){
     this.initProperty(S_CertTypeDesc,value);
  }
  public  void setCertTypeDesc(String value){
     this.set(S_CertTypeDesc,value);
  }
  public  void setCertTypeDescNull(){
     this.set(S_CertTypeDesc,null);
  }

  public String getCertTypeDesc(){
       return DataType.getAsString(this.get(S_CertTypeDesc));
  
  }
  public String getCertTypeDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CertTypeDesc));
      }

  public void initCityId(String value){
     this.initProperty(S_CityId,value);
  }
  public  void setCityId(String value){
     this.set(S_CityId,value);
  }
  public  void setCityIdNull(){
     this.set(S_CityId,null);
  }

  public String getCityId(){
       return DataType.getAsString(this.get(S_CityId));
  
  }
  public String getCityIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CityId));
      }

  public void initOrganizeType(int value){
     this.initProperty(S_OrganizeType,new Integer(value));
  }
  public  void setOrganizeType(int value){
     this.set(S_OrganizeType,new Integer(value));
  }
  public  void setOrganizeTypeNull(){
     this.set(S_OrganizeType,null);
  }

  public int getOrganizeType(){
        return DataType.getAsInt(this.get(S_OrganizeType));
  
  }
  public int getOrganizeTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_OrganizeType));
      }

  public void initCertAddress(String value){
     this.initProperty(S_CertAddress,value);
  }
  public  void setCertAddress(String value){
     this.set(S_CertAddress,value);
  }
  public  void setCertAddressNull(){
     this.set(S_CertAddress,null);
  }

  public String getCertAddress(){
       return DataType.getAsString(this.get(S_CertAddress));
  
  }
  public String getCertAddressInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CertAddress));
      }

  public void initCountyIdDesc(String value){
     this.initProperty(S_CountyIdDesc,value);
  }
  public  void setCountyIdDesc(String value){
     this.set(S_CountyIdDesc,value);
  }
  public  void setCountyIdDescNull(){
     this.set(S_CountyIdDesc,null);
  }

  public String getCountyIdDesc(){
       return DataType.getAsString(this.get(S_CountyIdDesc));
  
  }
  public String getCountyIdDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CountyIdDesc));
      }

  public void initSubRegionType(String value){
     this.initProperty(S_SubRegionType,value);
  }
  public  void setSubRegionType(String value){
     this.set(S_SubRegionType,value);
  }
  public  void setSubRegionTypeNull(){
     this.set(S_SubRegionType,null);
  }

  public String getSubRegionType(){
       return DataType.getAsString(this.get(S_SubRegionType));
  
  }
  public String getSubRegionTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SubRegionType));
      }

  public void initCityIdDesc(String value){
     this.initProperty(S_CityIdDesc,value);
  }
  public  void setCityIdDesc(String value){
     this.set(S_CityIdDesc,value);
  }
  public  void setCityIdDescNull(){
     this.set(S_CityIdDesc,null);
  }

  public String getCityIdDesc(){
       return DataType.getAsString(this.get(S_CityIdDesc));
  
  }
  public String getCityIdDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CityIdDesc));
      }

  public void initSubRegionTypeDesc(String value){
     this.initProperty(S_SubRegionTypeDesc,value);
  }
  public  void setSubRegionTypeDesc(String value){
     this.set(S_SubRegionTypeDesc,value);
  }
  public  void setSubRegionTypeDescNull(){
     this.set(S_SubRegionTypeDesc,null);
  }

  public String getSubRegionTypeDesc(){
       return DataType.getAsString(this.get(S_SubRegionTypeDesc));
  
  }
  public String getSubRegionTypeDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SubRegionTypeDesc));
      }

  public void initCertEffdate(Timestamp value){
     this.initProperty(S_CertEffdate,value);
  }
  public  void setCertEffdate(Timestamp value){
     this.set(S_CertEffdate,value);
  }
  public  void setCertEffdateNull(){
     this.set(S_CertEffdate,null);
  }

  public Timestamp getCertEffdate(){
        return DataType.getAsDateTime(this.get(S_CertEffdate));
  
  }
  public Timestamp getCertEffdateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_CertEffdate));
      }

  public void initOrganizeTypeDesc(String value){
     this.initProperty(S_OrganizeTypeDesc,value);
  }
  public  void setOrganizeTypeDesc(String value){
     this.set(S_OrganizeTypeDesc,value);
  }
  public  void setOrganizeTypeDescNull(){
     this.set(S_OrganizeTypeDesc,null);
  }

  public String getOrganizeTypeDesc(){
       return DataType.getAsString(this.get(S_OrganizeTypeDesc));
  
  }
  public String getOrganizeTypeDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OrganizeTypeDesc));
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

  public void initOrganizeName(String value){
     this.initProperty(S_OrganizeName,value);
  }
  public  void setOrganizeName(String value){
     this.set(S_OrganizeName,value);
  }
  public  void setOrganizeNameNull(){
     this.set(S_OrganizeName,null);
  }

  public String getOrganizeName(){
       return DataType.getAsString(this.get(S_OrganizeName));
  
  }
  public String getOrganizeNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OrganizeName));
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

  public void initContEmail(String value){
     this.initProperty(S_ContEmail,value);
  }
  public  void setContEmail(String value){
     this.set(S_ContEmail,value);
  }
  public  void setContEmailNull(){
     this.set(S_ContEmail,null);
  }

  public String getContEmail(){
       return DataType.getAsString(this.get(S_ContEmail));
  
  }
  public String getContEmailInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContEmail));
      }

  public void initStaffLevel(int value){
     this.initProperty(S_StaffLevel,new Integer(value));
  }
  public  void setStaffLevel(int value){
     this.set(S_StaffLevel,new Integer(value));
  }
  public  void setStaffLevelNull(){
     this.set(S_StaffLevel,null);
  }

  public int getStaffLevel(){
        return DataType.getAsInt(this.get(S_StaffLevel));
  
  }
  public int getStaffLevelInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_StaffLevel));
      }

  public void initRegionType(String value){
     this.initProperty(S_RegionType,value);
  }
  public  void setRegionType(String value){
     this.set(S_RegionType,value);
  }
  public  void setRegionTypeNull(){
     this.set(S_RegionType,null);
  }

  public String getRegionType(){
       return DataType.getAsString(this.get(S_RegionType));
  
  }
  public String getRegionTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_RegionType));
      }

  public void initCertExpireDate(Timestamp value){
     this.initProperty(S_CertExpireDate,value);
  }
  public  void setCertExpireDate(Timestamp value){
     this.set(S_CertExpireDate,value);
  }
  public  void setCertExpireDateNull(){
     this.set(S_CertExpireDate,null);
  }

  public Timestamp getCertExpireDate(){
        return DataType.getAsDateTime(this.get(S_CertExpireDate));
  
  }
  public Timestamp getCertExpireDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_CertExpireDate));
      }

  public void initOfficeTel(String value){
     this.initProperty(S_OfficeTel,value);
  }
  public  void setOfficeTel(String value){
     this.set(S_OfficeTel,value);
  }
  public  void setOfficeTelNull(){
     this.set(S_OfficeTel,null);
  }

  public String getOfficeTel(){
       return DataType.getAsString(this.get(S_OfficeTel));
  
  }
  public String getOfficeTelInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OfficeTel));
      }

  public void initManagerId(long value){
     this.initProperty(S_ManagerId,new Long(value));
  }
  public  void setManagerId(long value){
     this.set(S_ManagerId,new Long(value));
  }
  public  void setManagerIdNull(){
     this.set(S_ManagerId,null);
  }

  public long getManagerId(){
        return DataType.getAsLong(this.get(S_ManagerId));
  
  }
  public long getManagerIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ManagerId));
      }

  public void initRelTypeDesc(String value){
     this.initProperty(S_RelTypeDesc,value);
  }
  public  void setRelTypeDesc(String value){
     this.set(S_RelTypeDesc,value);
  }
  public  void setRelTypeDescNull(){
     this.set(S_RelTypeDesc,null);
  }

  public String getRelTypeDesc(){
       return DataType.getAsString(this.get(S_RelTypeDesc));
  
  }
  public String getRelTypeDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_RelTypeDesc));
      }

  public void initWirelessCall(String value){
     this.initProperty(S_WirelessCall,value);
  }
  public  void setWirelessCall(String value){
     this.set(S_WirelessCall,value);
  }
  public  void setWirelessCallNull(){
     this.set(S_WirelessCall,null);
  }

  public String getWirelessCall(){
       return DataType.getAsString(this.get(S_WirelessCall));
  
  }
  public String getWirelessCallInitialValue(){
        return DataType.getAsString(this.getOldObj(S_WirelessCall));
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

  public void initOrganizeId(long value){
     this.initProperty(S_OrganizeId,new Long(value));
  }
  public  void setOrganizeId(long value){
     this.set(S_OrganizeId,new Long(value));
  }
  public  void setOrganizeIdNull(){
     this.set(S_OrganizeId,null);
  }

  public long getOrganizeId(){
        return DataType.getAsLong(this.get(S_OrganizeId));
  
  }
  public long getOrganizeIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_OrganizeId));
      }

  public void initStaffType(int value){
     this.initProperty(S_StaffType,new Integer(value));
  }
  public  void setStaffType(int value){
     this.set(S_StaffType,new Integer(value));
  }
  public  void setStaffTypeNull(){
     this.set(S_StaffType,null);
  }

  public int getStaffType(){
        return DataType.getAsInt(this.get(S_StaffType));
  
  }
  public int getStaffTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_StaffType));
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

  public void initMarryStatusDesc(String value){
     this.initProperty(S_MarryStatusDesc,value);
  }
  public  void setMarryStatusDesc(String value){
     this.set(S_MarryStatusDesc,value);
  }
  public  void setMarryStatusDescNull(){
     this.set(S_MarryStatusDesc,null);
  }

  public String getMarryStatusDesc(){
       return DataType.getAsString(this.get(S_MarryStatusDesc));
  
  }
  public String getMarryStatusDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_MarryStatusDesc));
      }

  public void initPostcode(String value){
     this.initProperty(S_Postcode,value);
  }
  public  void setPostcode(String value){
     this.set(S_Postcode,value);
  }
  public  void setPostcodeNull(){
     this.set(S_Postcode,null);
  }

  public String getPostcode(){
       return DataType.getAsString(this.get(S_Postcode));
  
  }
  public String getPostcodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Postcode));
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

  public void initNationality(String value){
     this.initProperty(S_Nationality,value);
  }
  public  void setNationality(String value){
     this.set(S_Nationality,value);
  }
  public  void setNationalityNull(){
     this.set(S_Nationality,null);
  }

  public String getNationality(){
       return DataType.getAsString(this.get(S_Nationality));
  
  }
  public String getNationalityInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Nationality));
      }

  public void initProvinceIdDesc(String value){
     this.initProperty(S_ProvinceIdDesc,value);
  }
  public  void setProvinceIdDesc(String value){
     this.set(S_ProvinceIdDesc,value);
  }
  public  void setProvinceIdDescNull(){
     this.set(S_ProvinceIdDesc,null);
  }

  public String getProvinceIdDesc(){
       return DataType.getAsString(this.get(S_ProvinceIdDesc));
  
  }
  public String getProvinceIdDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ProvinceIdDesc));
      }

  public void initParentStaffId(long value){
     this.initProperty(S_ParentStaffId,new Long(value));
  }
  public  void setParentStaffId(long value){
     this.set(S_ParentStaffId,new Long(value));
  }
  public  void setParentStaffIdNull(){
     this.set(S_ParentStaffId,null);
  }

  public long getParentStaffId(){
        return DataType.getAsLong(this.get(S_ParentStaffId));
  
  }
  public long getParentStaffIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ParentStaffId));
      }

  public void initBcMgr(String value){
     this.initProperty(S_BcMgr,value);
  }
  public  void setBcMgr(String value){
     this.set(S_BcMgr,value);
  }
  public  void setBcMgrNull(){
     this.set(S_BcMgr,null);
  }

  public String getBcMgr(){
       return DataType.getAsString(this.get(S_BcMgr));
  
  }
  public String getBcMgrInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BcMgr));
      }

  public void initHomeTel(String value){
     this.initProperty(S_HomeTel,value);
  }
  public  void setHomeTel(String value){
     this.set(S_HomeTel,value);
  }
  public  void setHomeTelNull(){
     this.set(S_HomeTel,null);
  }

  public String getHomeTel(){
       return DataType.getAsString(this.get(S_HomeTel));
  
  }
  public String getHomeTelInitialValue(){
        return DataType.getAsString(this.getOldObj(S_HomeTel));
      }

  public void initStaffTypeDesc(String value){
     this.initProperty(S_StaffTypeDesc,value);
  }
  public  void setStaffTypeDesc(String value){
     this.set(S_StaffTypeDesc,value);
  }
  public  void setStaffTypeDescNull(){
     this.set(S_StaffTypeDesc,null);
  }

  public String getStaffTypeDesc(){
       return DataType.getAsString(this.get(S_StaffTypeDesc));
  
  }
  public String getStaffTypeDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_StaffTypeDesc));
      }

  public void initStaffLevelDesc(String value){
     this.initProperty(S_StaffLevelDesc,value);
  }
  public  void setStaffLevelDesc(String value){
     this.set(S_StaffLevelDesc,value);
  }
  public  void setStaffLevelDescNull(){
     this.set(S_StaffLevelDesc,null);
  }

  public String getStaffLevelDesc(){
       return DataType.getAsString(this.get(S_StaffLevelDesc));
  
  }
  public String getStaffLevelDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_StaffLevelDesc));
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

  public void initMarryStatus(int value){
     this.initProperty(S_MarryStatus,new Integer(value));
  }
  public  void setMarryStatus(int value){
     this.set(S_MarryStatus,new Integer(value));
  }
  public  void setMarryStatusNull(){
     this.set(S_MarryStatus,null);
  }

  public int getMarryStatus(){
        return DataType.getAsInt(this.get(S_MarryStatus));
  
  }
  public int getMarryStatusInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_MarryStatus));
      }

  public void initStaffName(String value){
     this.initProperty(S_StaffName,value);
  }
  public  void setStaffName(String value){
     this.set(S_StaffName,value);
  }
  public  void setStaffNameNull(){
     this.set(S_StaffName,null);
  }

  public String getStaffName(){
       return DataType.getAsString(this.get(S_StaffName));
  
  }
  public String getStaffNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_StaffName));
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

  public void initOperType(long value){
     this.initProperty(S_OperType,new Long(value));
  }
  public  void setOperType(long value){
     this.set(S_OperType,new Long(value));
  }
  public  void setOperTypeNull(){
     this.set(S_OperType,null);
  }

  public long getOperType(){
        return DataType.getAsLong(this.get(S_OperType));
  
  }
  public long getOperTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_OperType));
      }

  public void initBirthday(Timestamp value){
     this.initProperty(S_Birthday,value);
  }
  public  void setBirthday(Timestamp value){
     this.set(S_Birthday,value);
  }
  public  void setBirthdayNull(){
     this.set(S_Birthday,null);
  }

  public Timestamp getBirthday(){
        return DataType.getAsDateTime(this.get(S_Birthday));
  
  }
  public Timestamp getBirthdayInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_Birthday));
      }

  public void initRegionTypeDesc(String value){
     this.initProperty(S_RegionTypeDesc,value);
  }
  public  void setRegionTypeDesc(String value){
     this.set(S_RegionTypeDesc,value);
  }
  public  void setRegionTypeDescNull(){
     this.set(S_RegionTypeDesc,null);
  }

  public String getRegionTypeDesc(){
       return DataType.getAsString(this.get(S_RegionTypeDesc));
  
  }
  public String getRegionTypeDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_RegionTypeDesc));
      }

  public void initContAddress(String value){
     this.initProperty(S_ContAddress,value);
  }
  public  void setContAddress(String value){
     this.set(S_ContAddress,value);
  }
  public  void setContAddressNull(){
     this.set(S_ContAddress,null);
  }

  public String getContAddress(){
       return DataType.getAsString(this.get(S_ContAddress));
  
  }
  public String getContAddressInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContAddress));
      }

  public void initNationalityDesc(String value){
     this.initProperty(S_NationalityDesc,value);
  }
  public  void setNationalityDesc(String value){
     this.set(S_NationalityDesc,value);
  }
  public  void setNationalityDescNull(){
     this.set(S_NationalityDesc,null);
  }

  public String getNationalityDesc(){
       return DataType.getAsString(this.get(S_NationalityDesc));
  
  }
  public String getNationalityDescInitialValue(){
        return DataType.getAsString(this.getOldObj(S_NationalityDesc));
      }

  public void initProvinceId(String value){
     this.initProperty(S_ProvinceId,value);
  }
  public  void setProvinceId(String value){
     this.set(S_ProvinceId,value);
  }
  public  void setProvinceIdNull(){
     this.set(S_ProvinceId,null);
  }

  public String getProvinceId(){
       return DataType.getAsString(this.get(S_ProvinceId));
  
  }
  public String getProvinceIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ProvinceId));
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

  public void initRelId(long value){
     this.initProperty(S_RelId,new Long(value));
  }
  public  void setRelId(long value){
     this.set(S_RelId,new Long(value));
  }
  public  void setRelIdNull(){
     this.set(S_RelId,null);
  }

  public long getRelId(){
        return DataType.getAsLong(this.get(S_RelId));
  
  }
  public long getRelIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_RelId));
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

  public void initCertType(int value){
     this.initProperty(S_CertType,new Integer(value));
  }
  public  void setCertType(int value){
     this.set(S_CertType,new Integer(value));
  }
  public  void setCertTypeNull(){
     this.set(S_CertType,null);
  }

  public int getCertType(){
        return DataType.getAsInt(this.get(S_CertType));
  
  }
  public int getCertTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CertType));
      }

  public void initStaffId(long value){
     this.initProperty(S_StaffId,new Long(value));
  }
  public  void setStaffId(long value){
     this.set(S_StaffId,new Long(value));
  }
  public  void setStaffIdNull(){
     this.set(S_StaffId,null);
  }

  public long getStaffId(){
        return DataType.getAsLong(this.get(S_StaffId));
  
  }
  public long getStaffIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_StaffId));
      }

  public void initCountyId(String value){
     this.initProperty(S_CountyId,value);
  }
  public  void setCountyId(String value){
     this.set(S_CountyId,value);
  }
  public  void setCountyIdNull(){
     this.set(S_CountyId,null);
  }

  public String getCountyId(){
       return DataType.getAsString(this.get(S_CountyId));
  
  }
  public String getCountyIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CountyId));
      }

  public void initGender(int value){
     this.initProperty(S_Gender,new Integer(value));
  }
  public  void setGender(int value){
     this.set(S_Gender,new Integer(value));
  }
  public  void setGenderNull(){
     this.set(S_Gender,null);
  }

  public int getGender(){
        return DataType.getAsInt(this.get(S_Gender));
  
  }
  public int getGenderInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_Gender));
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

  public void initContFax(String value){
     this.initProperty(S_ContFax,value);
  }
  public  void setContFax(String value){
     this.set(S_ContFax,value);
  }
  public  void setContFaxNull(){
     this.set(S_ContFax,null);
  }

  public String getContFax(){
       return DataType.getAsString(this.get(S_ContFax));
  
  }
  public String getContFaxInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContFax));
      }

  public void initManagerType(int value){
     this.initProperty(S_ManagerType,new Integer(value));
  }
  public  void setManagerType(int value){
     this.set(S_ManagerType,new Integer(value));
  }
  public  void setManagerTypeNull(){
     this.set(S_ManagerType,null);
  }

  public int getManagerType(){
        return DataType.getAsInt(this.get(S_ManagerType));
  
  }
  public int getManagerTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_ManagerType));
      }


 
 }

