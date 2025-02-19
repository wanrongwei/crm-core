package com.asiainfo.crm.cm.customer.group.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.customer.group.ivalues.*;

public class QBOCmGroupKeyMemberUserBean extends DataContainer implements DataContainerInterface,IQBOCmGroupKeyMemberUserValue{

  private static String  m_boName = "com.asiainfo.crm.cm.customer.group.bo.QBOCmGroupKeyMemberUser";



  public final static  String S_DeptId = "DEPT_ID";
  public final static  String S_KernelLevel = "KERNEL_LEVEL";
  public final static  String S_IsMain = "IS_MAIN";
  public final static  String S_CustRegionId = "CUST_REGION_ID";
  public final static  String S_CustLevel = "CUST_LEVEL";
  public final static  String S_MemUserId = "MEM_USER_ID";
  public final static  String S_ChnlRegionType = "CHNL_REGION_TYPE";
  public final static  String S_AlarmBillId = "ALARM_BILL_ID";
  public final static  String S_CustCertType = "CUST_CERT_TYPE";
  public final static  String S_ContZipcode = "CONT_ZIPCODE";
  public final static  String S_CustCertCode = "CUST_CERT_CODE";
  public final static  String S_MemberName = "MEMBER_NAME";
  public final static  String S_CustCertExpire = "CUST_CERT_EXPIRE";
  public final static  String S_ChnlRegionDetail = "CHNL_REGION_DETAIL";
  public final static  String S_HomePhone = "HOME_PHONE";
  public final static  String S_Lunar = "LUNAR";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_ChnlCityId = "CHNL_CITY_ID";
  public final static  String S_GroupId = "GROUP_ID";
  public final static  String S_MemberState = "MEMBER_STATE";
  public final static  String S_ContEmail = "CONT_EMAIL";
  public final static  String S_OfficePhone = "OFFICE_PHONE";
  public final static  String S_MemberPosition = "MEMBER_POSITION";
  public final static  String S_CustName = "CUST_NAME";
  public final static  String S_VipLevel = "VIP_LEVEL";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_GroupStatus = "GROUP_STATUS";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_UserStatus = "USER_STATUS";
  public final static  String S_IndivCustId = "INDIV_CUST_ID";
  public final static  String S_OtherHobby = "OTHER_HOBBY";
  public final static  String S_UserState = "USER_STATE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_GroupState = "GROUP_STATE";
  public final static  String S_MemberType = "MEMBER_TYPE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_Notes = "NOTES";
  public final static  String S_Birthday = "BIRTHDAY";
  public final static  String S_ContAddress = "CONT_ADDRESS";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_GroupCustId = "GROUP_CUST_ID";
  public final static  String S_FamilyInfo = "FAMILY_INFO";
  public final static  String S_KernelId = "KERNEL_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_KernelType = "KERNEL_TYPE";
  public final static  String S_Gender = "GENDER";
  public final static  String S_WorkDept = "WORK_DEPT";
  public final static  String S_MemberDesc = "MEMBER_DESC";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_CustCertAddress = "CUST_CERT_ADDRESS";
  public final static  String S_ContFax = "CONT_FAX";
  public final static  String S_MemberLevel = "MEMBER_LEVEL";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public QBOCmGroupKeyMemberUserBean() throws AIException{
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

  public void initKernelLevel(int value){
     this.initProperty(S_KernelLevel,new Integer(value));
  }
  public  void setKernelLevel(int value){
     this.set(S_KernelLevel,new Integer(value));
  }
  public  void setKernelLevelNull(){
     this.set(S_KernelLevel,null);
  }

  public int getKernelLevel(){
        return DataType.getAsInt(this.get(S_KernelLevel));
  
  }
  public int getKernelLevelInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_KernelLevel));
      }

  public void initIsMain(int value){
     this.initProperty(S_IsMain,new Integer(value));
  }
  public  void setIsMain(int value){
     this.set(S_IsMain,new Integer(value));
  }
  public  void setIsMainNull(){
     this.set(S_IsMain,null);
  }

  public int getIsMain(){
        return DataType.getAsInt(this.get(S_IsMain));
  
  }
  public int getIsMainInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IsMain));
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

  public void initCustLevel(int value){
     this.initProperty(S_CustLevel,new Integer(value));
  }
  public  void setCustLevel(int value){
     this.set(S_CustLevel,new Integer(value));
  }
  public  void setCustLevelNull(){
     this.set(S_CustLevel,null);
  }

  public int getCustLevel(){
        return DataType.getAsInt(this.get(S_CustLevel));
  
  }
  public int getCustLevelInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CustLevel));
      }

  public void initMemUserId(long value){
     this.initProperty(S_MemUserId,new Long(value));
  }
  public  void setMemUserId(long value){
     this.set(S_MemUserId,new Long(value));
  }
  public  void setMemUserIdNull(){
     this.set(S_MemUserId,null);
  }

  public long getMemUserId(){
        return DataType.getAsLong(this.get(S_MemUserId));
  
  }
  public long getMemUserIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_MemUserId));
      }

  public void initChnlRegionType(String value){
     this.initProperty(S_ChnlRegionType,value);
  }
  public  void setChnlRegionType(String value){
     this.set(S_ChnlRegionType,value);
  }
  public  void setChnlRegionTypeNull(){
     this.set(S_ChnlRegionType,null);
  }

  public String getChnlRegionType(){
       return DataType.getAsString(this.get(S_ChnlRegionType));
  
  }
  public String getChnlRegionTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ChnlRegionType));
      }

  public void initAlarmBillId(String value){
     this.initProperty(S_AlarmBillId,value);
  }
  public  void setAlarmBillId(String value){
     this.set(S_AlarmBillId,value);
  }
  public  void setAlarmBillIdNull(){
     this.set(S_AlarmBillId,null);
  }

  public String getAlarmBillId(){
       return DataType.getAsString(this.get(S_AlarmBillId));
  
  }
  public String getAlarmBillIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AlarmBillId));
      }

  public void initCustCertType(int value){
     this.initProperty(S_CustCertType,new Integer(value));
  }
  public  void setCustCertType(int value){
     this.set(S_CustCertType,new Integer(value));
  }
  public  void setCustCertTypeNull(){
     this.set(S_CustCertType,null);
  }

  public int getCustCertType(){
        return DataType.getAsInt(this.get(S_CustCertType));
  
  }
  public int getCustCertTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_CustCertType));
      }

  public void initContZipcode(String value){
     this.initProperty(S_ContZipcode,value);
  }
  public  void setContZipcode(String value){
     this.set(S_ContZipcode,value);
  }
  public  void setContZipcodeNull(){
     this.set(S_ContZipcode,null);
  }

  public String getContZipcode(){
       return DataType.getAsString(this.get(S_ContZipcode));
  
  }
  public String getContZipcodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ContZipcode));
      }

  public void initCustCertCode(String value){
     this.initProperty(S_CustCertCode,value);
  }
  public  void setCustCertCode(String value){
     this.set(S_CustCertCode,value);
  }
  public  void setCustCertCodeNull(){
     this.set(S_CustCertCode,null);
  }

  public String getCustCertCode(){
       return DataType.getAsString(this.get(S_CustCertCode));
  
  }
  public String getCustCertCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CustCertCode));
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

  public void initCustCertExpire(Timestamp value){
     this.initProperty(S_CustCertExpire,value);
  }
  public  void setCustCertExpire(Timestamp value){
     this.set(S_CustCertExpire,value);
  }
  public  void setCustCertExpireNull(){
     this.set(S_CustCertExpire,null);
  }

  public Timestamp getCustCertExpire(){
        return DataType.getAsDateTime(this.get(S_CustCertExpire));
  
  }
  public Timestamp getCustCertExpireInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_CustCertExpire));
      }

  public void initChnlRegionDetail(long value){
     this.initProperty(S_ChnlRegionDetail,new Long(value));
  }
  public  void setChnlRegionDetail(long value){
     this.set(S_ChnlRegionDetail,new Long(value));
  }
  public  void setChnlRegionDetailNull(){
     this.set(S_ChnlRegionDetail,null);
  }

  public long getChnlRegionDetail(){
        return DataType.getAsLong(this.get(S_ChnlRegionDetail));
  
  }
  public long getChnlRegionDetailInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ChnlRegionDetail));
      }

  public void initHomePhone(String value){
     this.initProperty(S_HomePhone,value);
  }
  public  void setHomePhone(String value){
     this.set(S_HomePhone,value);
  }
  public  void setHomePhoneNull(){
     this.set(S_HomePhone,null);
  }

  public String getHomePhone(){
       return DataType.getAsString(this.get(S_HomePhone));
  
  }
  public String getHomePhoneInitialValue(){
        return DataType.getAsString(this.getOldObj(S_HomePhone));
      }

  public void initLunar(int value){
     this.initProperty(S_Lunar,new Integer(value));
  }
  public  void setLunar(int value){
     this.set(S_Lunar,new Integer(value));
  }
  public  void setLunarNull(){
     this.set(S_Lunar,null);
  }

  public int getLunar(){
        return DataType.getAsInt(this.get(S_Lunar));
  
  }
  public int getLunarInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_Lunar));
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

  public void initChnlCityId(String value){
     this.initProperty(S_ChnlCityId,value);
  }
  public  void setChnlCityId(String value){
     this.set(S_ChnlCityId,value);
  }
  public  void setChnlCityIdNull(){
     this.set(S_ChnlCityId,null);
  }

  public String getChnlCityId(){
       return DataType.getAsString(this.get(S_ChnlCityId));
  
  }
  public String getChnlCityIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ChnlCityId));
      }

  public void initGroupId(long value){
     this.initProperty(S_GroupId,new Long(value));
  }
  public  void setGroupId(long value){
     this.set(S_GroupId,new Long(value));
  }
  public  void setGroupIdNull(){
     this.set(S_GroupId,null);
  }

  public long getGroupId(){
        return DataType.getAsLong(this.get(S_GroupId));
  
  }
  public long getGroupIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_GroupId));
      }

  public void initMemberState(String value){
     this.initProperty(S_MemberState,value);
  }
  public  void setMemberState(String value){
     this.set(S_MemberState,value);
  }
  public  void setMemberStateNull(){
     this.set(S_MemberState,null);
  }

  public String getMemberState(){
       return DataType.getAsString(this.get(S_MemberState));
  
  }
  public String getMemberStateInitialValue(){
        return DataType.getAsString(this.getOldObj(S_MemberState));
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

  public void initOfficePhone(String value){
     this.initProperty(S_OfficePhone,value);
  }
  public  void setOfficePhone(String value){
     this.set(S_OfficePhone,value);
  }
  public  void setOfficePhoneNull(){
     this.set(S_OfficePhone,null);
  }

  public String getOfficePhone(){
       return DataType.getAsString(this.get(S_OfficePhone));
  
  }
  public String getOfficePhoneInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OfficePhone));
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

  public void initCustName(String value){
     this.initProperty(S_CustName,value);
  }
  public  void setCustName(String value){
     this.set(S_CustName,value);
  }
  public  void setCustNameNull(){
     this.set(S_CustName,null);
  }

  public String getCustName(){
       return DataType.getAsString(this.get(S_CustName));
  
  }
  public String getCustNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CustName));
      }

  public void initVipLevel(int value){
     this.initProperty(S_VipLevel,new Integer(value));
  }
  public  void setVipLevel(int value){
     this.set(S_VipLevel,new Integer(value));
  }
  public  void setVipLevelNull(){
     this.set(S_VipLevel,null);
  }

  public int getVipLevel(){
        return DataType.getAsInt(this.get(S_VipLevel));
  
  }
  public int getVipLevelInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_VipLevel));
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

  public void initGroupStatus(int value){
     this.initProperty(S_GroupStatus,new Integer(value));
  }
  public  void setGroupStatus(int value){
     this.set(S_GroupStatus,new Integer(value));
  }
  public  void setGroupStatusNull(){
     this.set(S_GroupStatus,null);
  }

  public int getGroupStatus(){
        return DataType.getAsInt(this.get(S_GroupStatus));
  
  }
  public int getGroupStatusInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_GroupStatus));
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

  public void initUserStatus(String value){
     this.initProperty(S_UserStatus,value);
  }
  public  void setUserStatus(String value){
     this.set(S_UserStatus,value);
  }
  public  void setUserStatusNull(){
     this.set(S_UserStatus,null);
  }

  public String getUserStatus(){
       return DataType.getAsString(this.get(S_UserStatus));
  
  }
  public String getUserStatusInitialValue(){
        return DataType.getAsString(this.getOldObj(S_UserStatus));
      }

  public void initIndivCustId(long value){
     this.initProperty(S_IndivCustId,new Long(value));
  }
  public  void setIndivCustId(long value){
     this.set(S_IndivCustId,new Long(value));
  }
  public  void setIndivCustIdNull(){
     this.set(S_IndivCustId,null);
  }

  public long getIndivCustId(){
        return DataType.getAsLong(this.get(S_IndivCustId));
  
  }
  public long getIndivCustIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_IndivCustId));
      }

  public void initOtherHobby(String value){
     this.initProperty(S_OtherHobby,value);
  }
  public  void setOtherHobby(String value){
     this.set(S_OtherHobby,value);
  }
  public  void setOtherHobbyNull(){
     this.set(S_OtherHobby,null);
  }

  public String getOtherHobby(){
       return DataType.getAsString(this.get(S_OtherHobby));
  
  }
  public String getOtherHobbyInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OtherHobby));
      }

  public void initUserState(String value){
     this.initProperty(S_UserState,value);
  }
  public  void setUserState(String value){
     this.set(S_UserState,value);
  }
  public  void setUserStateNull(){
     this.set(S_UserState,null);
  }

  public String getUserState(){
       return DataType.getAsString(this.get(S_UserState));
  
  }
  public String getUserStateInitialValue(){
        return DataType.getAsString(this.getOldObj(S_UserState));
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

  public void initGroupState(String value){
     this.initProperty(S_GroupState,value);
  }
  public  void setGroupState(String value){
     this.set(S_GroupState,value);
  }
  public  void setGroupStateNull(){
     this.set(S_GroupState,null);
  }

  public String getGroupState(){
       return DataType.getAsString(this.get(S_GroupState));
  
  }
  public String getGroupStateInitialValue(){
        return DataType.getAsString(this.getOldObj(S_GroupState));
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

  public void initFamilyInfo(String value){
     this.initProperty(S_FamilyInfo,value);
  }
  public  void setFamilyInfo(String value){
     this.set(S_FamilyInfo,value);
  }
  public  void setFamilyInfoNull(){
     this.set(S_FamilyInfo,null);
  }

  public String getFamilyInfo(){
       return DataType.getAsString(this.get(S_FamilyInfo));
  
  }
  public String getFamilyInfoInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FamilyInfo));
      }

  public void initKernelId(long value){
     this.initProperty(S_KernelId,new Long(value));
  }
  public  void setKernelId(long value){
     this.set(S_KernelId,new Long(value));
  }
  public  void setKernelIdNull(){
     this.set(S_KernelId,null);
  }

  public long getKernelId(){
        return DataType.getAsLong(this.get(S_KernelId));
  
  }
  public long getKernelIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_KernelId));
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

  public void initKernelType(int value){
     this.initProperty(S_KernelType,new Integer(value));
  }
  public  void setKernelType(int value){
     this.set(S_KernelType,new Integer(value));
  }
  public  void setKernelTypeNull(){
     this.set(S_KernelType,null);
  }

  public int getKernelType(){
        return DataType.getAsInt(this.get(S_KernelType));
  
  }
  public int getKernelTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_KernelType));
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

  public void initWorkDept(String value){
     this.initProperty(S_WorkDept,value);
  }
  public  void setWorkDept(String value){
     this.set(S_WorkDept,value);
  }
  public  void setWorkDeptNull(){
     this.set(S_WorkDept,null);
  }

  public String getWorkDept(){
       return DataType.getAsString(this.get(S_WorkDept));
  
  }
  public String getWorkDeptInitialValue(){
        return DataType.getAsString(this.getOldObj(S_WorkDept));
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

  public void initCustCertAddress(String value){
     this.initProperty(S_CustCertAddress,value);
  }
  public  void setCustCertAddress(String value){
     this.set(S_CustCertAddress,value);
  }
  public  void setCustCertAddressNull(){
     this.set(S_CustCertAddress,null);
  }

  public String getCustCertAddress(){
       return DataType.getAsString(this.get(S_CustCertAddress));
  
  }
  public String getCustCertAddressInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CustCertAddress));
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

  public void initMemberLevel(int value){
     this.initProperty(S_MemberLevel,new Integer(value));
  }
  public  void setMemberLevel(int value){
     this.set(S_MemberLevel,new Integer(value));
  }
  public  void setMemberLevelNull(){
     this.set(S_MemberLevel,null);
  }

  public int getMemberLevel(){
        return DataType.getAsInt(this.get(S_MemberLevel));
  
  }
  public int getMemberLevelInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_MemberLevel));
      }


 
 }

