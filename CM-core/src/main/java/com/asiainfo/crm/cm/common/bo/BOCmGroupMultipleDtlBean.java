package com.asiainfo.crm.cm.common.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.common.ivalues.*;

public class BOCmGroupMultipleDtlBean extends DataContainer implements DataContainerInterface,IBOCmGroupMultipleDtlValue{

  private static String  m_boName = "com.asiainfo.crm.cm.common.bo.BOCmGroupMultipleDtl";



  public final static  String S_ProvVnum = "PROV_VNUM";
  public final static  String S_CmccNum = "CMCC_NUM";
  public final static  String S_ChargerPhone = "CHARGER_PHONE";
  public final static  String S_SoNbr = "SO_NBR";
  public final static  String S_SoDate = "SO_DATE";
  public final static  String S_ManagerId = "MANAGER_ID";
  public final static  String S_RegionCode = "REGION_CODE";
  public final static  String S_CtNum = "CT_NUM";
  public final static  String S_Notes = "NOTES";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_DeptCharger = "DEPT_CHARGER";
  public final static  String S_IsGmanage = "IS_GMANAGE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_RegionVnum = "REGION_VNUM";
  public final static  String S_OtherCharger = "OTHER_CHARGER";
  public final static  String S_OtherPhone = "OTHER_PHONE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_CuNum = "CU_NUM";
  public final static  String S_LinkPhone = "LINK_PHONE";
  public final static  String S_GroupMtpId = "GROUP_MTP_ID";
  public final static  String S_LinkName = "LINK_NAME";
  public final static  String S_Charger = "CHARGER";
  public final static  String S_ChargeDept = "CHARGE_DEPT";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmGroupMultipleDtlBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initProvVnum(long value){
     this.initProperty(S_ProvVnum,new Long(value));
  }
  public  void setProvVnum(long value){
     this.set(S_ProvVnum,new Long(value));
  }
  public  void setProvVnumNull(){
     this.set(S_ProvVnum,null);
  }

  public long getProvVnum(){
        return DataType.getAsLong(this.get(S_ProvVnum));
  
  }
  public long getProvVnumInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ProvVnum));
      }

  public void initCmccNum(long value){
     this.initProperty(S_CmccNum,new Long(value));
  }
  public  void setCmccNum(long value){
     this.set(S_CmccNum,new Long(value));
  }
  public  void setCmccNumNull(){
     this.set(S_CmccNum,null);
  }

  public long getCmccNum(){
        return DataType.getAsLong(this.get(S_CmccNum));
  
  }
  public long getCmccNumInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CmccNum));
      }

  public void initChargerPhone(String value){
     this.initProperty(S_ChargerPhone,value);
  }
  public  void setChargerPhone(String value){
     this.set(S_ChargerPhone,value);
  }
  public  void setChargerPhoneNull(){
     this.set(S_ChargerPhone,null);
  }

  public String getChargerPhone(){
       return DataType.getAsString(this.get(S_ChargerPhone));
  
  }
  public String getChargerPhoneInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ChargerPhone));
      }

  public void initSoNbr(long value){
     this.initProperty(S_SoNbr,new Long(value));
  }
  public  void setSoNbr(long value){
     this.set(S_SoNbr,new Long(value));
  }
  public  void setSoNbrNull(){
     this.set(S_SoNbr,null);
  }

  public long getSoNbr(){
        return DataType.getAsLong(this.get(S_SoNbr));
  
  }
  public long getSoNbrInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_SoNbr));
      }

  public void initSoDate(Timestamp value){
     this.initProperty(S_SoDate,value);
  }
  public  void setSoDate(Timestamp value){
     this.set(S_SoDate,value);
  }
  public  void setSoDateNull(){
     this.set(S_SoDate,null);
  }

  public Timestamp getSoDate(){
        return DataType.getAsDateTime(this.get(S_SoDate));
  
  }
  public Timestamp getSoDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_SoDate));
      }

  public void initManagerId(String value){
     this.initProperty(S_ManagerId,value);
  }
  public  void setManagerId(String value){
     this.set(S_ManagerId,value);
  }
  public  void setManagerIdNull(){
     this.set(S_ManagerId,null);
  }

  public String getManagerId(){
       return DataType.getAsString(this.get(S_ManagerId));
  
  }
  public String getManagerIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ManagerId));
      }

  public void initRegionCode(long value){
     this.initProperty(S_RegionCode,new Long(value));
  }
  public  void setRegionCode(long value){
     this.set(S_RegionCode,new Long(value));
  }
  public  void setRegionCodeNull(){
     this.set(S_RegionCode,null);
  }

  public long getRegionCode(){
        return DataType.getAsLong(this.get(S_RegionCode));
  
  }
  public long getRegionCodeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_RegionCode));
      }

  public void initCtNum(long value){
     this.initProperty(S_CtNum,new Long(value));
  }
  public  void setCtNum(long value){
     this.set(S_CtNum,new Long(value));
  }
  public  void setCtNumNull(){
     this.set(S_CtNum,null);
  }

  public long getCtNum(){
        return DataType.getAsLong(this.get(S_CtNum));
  
  }
  public long getCtNumInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CtNum));
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

  public void initDeptCharger(String value){
     this.initProperty(S_DeptCharger,value);
  }
  public  void setDeptCharger(String value){
     this.set(S_DeptCharger,value);
  }
  public  void setDeptChargerNull(){
     this.set(S_DeptCharger,null);
  }

  public String getDeptCharger(){
       return DataType.getAsString(this.get(S_DeptCharger));
  
  }
  public String getDeptChargerInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DeptCharger));
      }

  public void initIsGmanage(int value){
     this.initProperty(S_IsGmanage,new Integer(value));
  }
  public  void setIsGmanage(int value){
     this.set(S_IsGmanage,new Integer(value));
  }
  public  void setIsGmanageNull(){
     this.set(S_IsGmanage,null);
  }

  public int getIsGmanage(){
        return DataType.getAsInt(this.get(S_IsGmanage));
  
  }
  public int getIsGmanageInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IsGmanage));
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

  public void initRegionVnum(long value){
     this.initProperty(S_RegionVnum,new Long(value));
  }
  public  void setRegionVnum(long value){
     this.set(S_RegionVnum,new Long(value));
  }
  public  void setRegionVnumNull(){
     this.set(S_RegionVnum,null);
  }

  public long getRegionVnum(){
        return DataType.getAsLong(this.get(S_RegionVnum));
  
  }
  public long getRegionVnumInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_RegionVnum));
      }

  public void initOtherCharger(String value){
     this.initProperty(S_OtherCharger,value);
  }
  public  void setOtherCharger(String value){
     this.set(S_OtherCharger,value);
  }
  public  void setOtherChargerNull(){
     this.set(S_OtherCharger,null);
  }

  public String getOtherCharger(){
       return DataType.getAsString(this.get(S_OtherCharger));
  
  }
  public String getOtherChargerInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OtherCharger));
      }

  public void initOtherPhone(String value){
     this.initProperty(S_OtherPhone,value);
  }
  public  void setOtherPhone(String value){
     this.set(S_OtherPhone,value);
  }
  public  void setOtherPhoneNull(){
     this.set(S_OtherPhone,null);
  }

  public String getOtherPhone(){
       return DataType.getAsString(this.get(S_OtherPhone));
  
  }
  public String getOtherPhoneInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OtherPhone));
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

  public void initCuNum(long value){
     this.initProperty(S_CuNum,new Long(value));
  }
  public  void setCuNum(long value){
     this.set(S_CuNum,new Long(value));
  }
  public  void setCuNumNull(){
     this.set(S_CuNum,null);
  }

  public long getCuNum(){
        return DataType.getAsLong(this.get(S_CuNum));
  
  }
  public long getCuNumInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CuNum));
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

  public void initGroupMtpId(String value){
     this.initProperty(S_GroupMtpId,value);
  }
  public  void setGroupMtpId(String value){
     this.set(S_GroupMtpId,value);
  }
  public  void setGroupMtpIdNull(){
     this.set(S_GroupMtpId,null);
  }

  public String getGroupMtpId(){
       return DataType.getAsString(this.get(S_GroupMtpId));
  
  }
  public String getGroupMtpIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_GroupMtpId));
      }

  public void initLinkName(String value){
     this.initProperty(S_LinkName,value);
  }
  public  void setLinkName(String value){
     this.set(S_LinkName,value);
  }
  public  void setLinkNameNull(){
     this.set(S_LinkName,null);
  }

  public String getLinkName(){
       return DataType.getAsString(this.get(S_LinkName));
  
  }
  public String getLinkNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_LinkName));
      }

  public void initCharger(String value){
     this.initProperty(S_Charger,value);
  }
  public  void setCharger(String value){
     this.set(S_Charger,value);
  }
  public  void setChargerNull(){
     this.set(S_Charger,null);
  }

  public String getCharger(){
       return DataType.getAsString(this.get(S_Charger));
  
  }
  public String getChargerInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Charger));
      }

  public void initChargeDept(String value){
     this.initProperty(S_ChargeDept,value);
  }
  public  void setChargeDept(String value){
     this.set(S_ChargeDept,value);
  }
  public  void setChargeDeptNull(){
     this.set(S_ChargeDept,null);
  }

  public String getChargeDept(){
       return DataType.getAsString(this.get(S_ChargeDept));
  
  }
  public String getChargeDeptInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ChargeDept));
      }


 
 }

