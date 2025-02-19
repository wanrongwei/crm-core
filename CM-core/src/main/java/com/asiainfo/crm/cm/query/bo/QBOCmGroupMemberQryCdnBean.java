package com.asiainfo.crm.cm.query.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.query.ivalues.*;

public class QBOCmGroupMemberQryCdnBean extends DataContainer implements DataContainerInterface,IQBOCmGroupMemberQryCdnValue{

  private static String  m_boName = "com.asiainfo.crm.customer.query.bo.QBOCmGroupMemberQryCdn";



  public final static  String S_GroupLevel = "GROUP_LEVEL";
  public final static  String S_IndivCustId = "INDIV_CUST_ID";
  public final static  String S_IsHighValue = "IS_HIGH_VALUE";
  public final static  String S_CityId = "CITY_ID";
  public final static  String S_EndDate = "END_DATE";
  public final static  String S_EndDate1 = "END_DATE1";
  public final static  String S_MemUserId = "MEM_USER_ID";
  public final static  String S_AreaId = "AREA_ID";
  public final static  String S_ServiceId = "SERVICE_ID";
  public final static  String S_MemberId = "MEMBER_ID";
  public final static  String S_IsKernelMember = "IS_KERNEL_MEMBER";
  public final static  String S_MemberName = "MEMBER_NAME";
  public final static  String S_GroupName = "GROUP_NAME";
  public final static  String S_MemberType = "MEMBER_TYPE";
  public final static  String S_CustRelId = "CUST_REL_ID";
  public final static  String S_GroupId = "GROUP_ID";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_ContEmail = "CONT_EMAIL";
  public final static  String S_GroupCustId = "GROUP_CUST_ID";
  public final static  String S_MemberAppType = "MEMBER_APP_TYPE";
  public final static  String S_StartDate = "START_DATE";
  public final static  String S_StartDate1 = "START_DATE1";
  public final static  String S_ManagerId = "MANAGER_ID";
  public final static  String S_KernelType = "KERNEL_TYPE";
  public final static  String S_CountyId = "COUNTY_ID";
  public final static  String S_WorkDept = "WORK_DEPT";
  public final static  String S_GroupStatus = "GROUP_STATUS";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_IsKeyMember = "IS_KEY_MEMBER";
  public final static  String S_QueryType = "QUERY_TYPE";
  public final static  String S_UserStatus = "USER_STATUS";
  public final static  String S_IsVip = "IS_VIP";
  public final static  String S_SubId = "SUB_ID";
  public final static  String S_ContFax = "CONT_FAX";
  public final static  String S_IsContact = "IS_CONTACT";
  public final static  String S_MatchType = "MATCH_TYPE";
  public final static  String S_MemberLevel = "MEMBER_LEVEL";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public QBOCmGroupMemberQryCdnBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initGroupLevel(int value){
     this.initProperty(S_GroupLevel,new Integer(value));
  }
  public  void setGroupLevel(int value){
     this.set(S_GroupLevel,new Integer(value));
  }
  public  void setGroupLevelNull(){
     this.set(S_GroupLevel,null);
  }

  public int getGroupLevel(){
        return DataType.getAsInt(this.get(S_GroupLevel));
  
  }
  public int getGroupLevelInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_GroupLevel));
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

  public void initIsHighValue(int value){
     this.initProperty(S_IsHighValue,new Integer(value));
  }
  public  void setIsHighValue(int value){
     this.set(S_IsHighValue,new Integer(value));
  }
  public  void setIsHighValueNull(){
     this.set(S_IsHighValue,null);
  }

  public int getIsHighValue(){
        return DataType.getAsInt(this.get(S_IsHighValue));
  
  }
  public int getIsHighValueInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IsHighValue));
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

  public void initEndDate(Timestamp value){
     this.initProperty(S_EndDate,value);
  }
  public void initEndDate1(Timestamp value){
	     this.initProperty(S_EndDate1,value);
  }
  public  void setEndDate(Timestamp value){
     this.set(S_EndDate,value);
  }
  public  void setEndDate1(Timestamp value){
	     this.set(S_EndDate1,value);
  }
  public  void setEndDateNull(){
     this.set(S_EndDate,null);
  }
  public  void setEndDate1Null(){
	     this.set(S_EndDate1,null);
  }

  public Timestamp getEndDate(){
        return DataType.getAsDateTime(this.get(S_EndDate));
  
  }
  public Timestamp getEndDate1(){
      return DataType.getAsDateTime(this.get(S_EndDate1));

  }
  public Timestamp getEndDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_EndDate));
  }
  public Timestamp getEndDate1InitialValue(){
      return DataType.getAsDateTime(this.getOldObj(S_EndDate1));
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

  public void initAreaId(String value){
     this.initProperty(S_AreaId,value);
  }
  public  void setAreaId(String value){
     this.set(S_AreaId,value);
  }
  public  void setAreaIdNull(){
     this.set(S_AreaId,null);
  }

  public String getAreaId(){
       return DataType.getAsString(this.get(S_AreaId));
  
  }
  public String getAreaIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AreaId));
      }

  public void initServiceId(long value){
     this.initProperty(S_ServiceId,new Long(value));
  }
  public  void setServiceId(long value){
     this.set(S_ServiceId,new Long(value));
  }
  public  void setServiceIdNull(){
     this.set(S_ServiceId,null);
  }

  public long getServiceId(){
        return DataType.getAsLong(this.get(S_ServiceId));
  
  }
  public long getServiceIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ServiceId));
      }

  public void initMemberId(long value){
     this.initProperty(S_MemberId,new Long(value));
  }
  public  void setMemberId(long value){
     this.set(S_MemberId,new Long(value));
  }
  public  void setMemberIdNull(){
     this.set(S_MemberId,null);
  }

  public long getMemberId(){
        return DataType.getAsLong(this.get(S_MemberId));
  
  }
  public long getMemberIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_MemberId));
      }

  public void initIsKernelMember(int value){
     this.initProperty(S_IsKernelMember,new Integer(value));
  }
  public  void setIsKernelMember(int value){
     this.set(S_IsKernelMember,new Integer(value));
  }
  public  void setIsKernelMemberNull(){
     this.set(S_IsKernelMember,null);
  }

  public int getIsKernelMember(){
        return DataType.getAsInt(this.get(S_IsKernelMember));
  
  }
  public int getIsKernelMemberInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IsKernelMember));
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

  public void initGroupName(String value){
     this.initProperty(S_GroupName,value);
  }
  public  void setGroupName(String value){
     this.set(S_GroupName,value);
  }
  public  void setGroupNameNull(){
     this.set(S_GroupName,null);
  }

  public String getGroupName(){
       return DataType.getAsString(this.get(S_GroupName));
  
  }
  public String getGroupNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_GroupName));
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

  public void initMemberAppType(int value){
     this.initProperty(S_MemberAppType,new Integer(value));
  }
  public  void setMemberAppType(int value){
     this.set(S_MemberAppType,new Integer(value));
  }
  public  void setMemberAppTypeNull(){
     this.set(S_MemberAppType,null);
  }

  public int getMemberAppType(){
        return DataType.getAsInt(this.get(S_MemberAppType));
  
  }
  public int getMemberAppTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_MemberAppType));
      }

  public void initStartDate(Timestamp value){
     this.initProperty(S_StartDate,value);
  }
  public void initStartDate1(Timestamp value){
	     this.initProperty(S_StartDate1,value);
	  }
  public  void setStartDate(Timestamp value){
     this.set(S_StartDate,value);
  }
  public  void setStartDate1(Timestamp value){
	     this.set(S_StartDate1,value);
  }
  public  void setStartDateNull(){
     this.set(S_StartDate,null);
  }
  public  void setStartDate1Null(){
	     this.set(S_StartDate1,null);
  }

  public Timestamp getStartDate(){
        return DataType.getAsDateTime(this.get(S_StartDate));
  
  }
  public Timestamp getStartDate1(){
      return DataType.getAsDateTime(this.get(S_StartDate1));

  }
  public Timestamp getStartDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_StartDate));
  }
  public Timestamp getStartDate1InitialValue(){
      return DataType.getAsDateTime(this.getOldObj(S_StartDate1));
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

  public void initIsKeyMember(int value){
     this.initProperty(S_IsKeyMember,new Integer(value));
  }
  public  void setIsKeyMember(int value){
     this.set(S_IsKeyMember,new Integer(value));
  }
  public  void setIsKeyMemberNull(){
     this.set(S_IsKeyMember,null);
  }

  public int getIsKeyMember(){
        return DataType.getAsInt(this.get(S_IsKeyMember));
  
  }
  public int getIsKeyMemberInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IsKeyMember));
      }

  public void initQueryType(String value){
     this.initProperty(S_QueryType,value);
  }
  public  void setQueryType(String value){
     this.set(S_QueryType,value);
  }
  public  void setQueryTypeNull(){
     this.set(S_QueryType,null);
  }

  public String getQueryType(){
       return DataType.getAsString(this.get(S_QueryType));
  
  }
  public String getQueryTypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_QueryType));
      }

  public void initUserStatus(int value){
     this.initProperty(S_UserStatus,new Integer(value));
  }
  public  void setUserStatus(int value){
     this.set(S_UserStatus,new Integer(value));
  }
  public  void setUserStatusNull(){
     this.set(S_UserStatus,null);
  }

  public int getUserStatus(){
        return DataType.getAsInt(this.get(S_UserStatus));
  
  }
  public int getUserStatusInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_UserStatus));
      }

  public void initIsVip(int value){
     this.initProperty(S_IsVip,new Integer(value));
  }
  public  void setIsVip(int value){
     this.set(S_IsVip,new Integer(value));
  }
  public  void setIsVipNull(){
     this.set(S_IsVip,null);
  }

  public int getIsVip(){
        return DataType.getAsInt(this.get(S_IsVip));
  
  }
  public int getIsVipInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IsVip));
      }

  public void initSubId(long value){
     this.initProperty(S_SubId,new Long(value));
  }
  public  void setSubId(long value){
     this.set(S_SubId,new Long(value));
  }
  public  void setSubIdNull(){
     this.set(S_SubId,null);
  }

  public long getSubId(){
        return DataType.getAsLong(this.get(S_SubId));
  
  }
  public long getSubIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_SubId));
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

  public void initIsContact(int value){
     this.initProperty(S_IsContact,new Integer(value));
  }
  public  void setIsContact(int value){
     this.set(S_IsContact,new Integer(value));
  }
  public  void setIsContactNull(){
     this.set(S_IsContact,null);
  }

  public int getIsContact(){
        return DataType.getAsInt(this.get(S_IsContact));
  
  }
  public int getIsContactInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_IsContact));
      }

  public void initMatchType(int value){
     this.initProperty(S_MatchType,new Integer(value));
  }
  public  void setMatchType(int value){
     this.set(S_MatchType,new Integer(value));
  }
  public  void setMatchTypeNull(){
     this.set(S_MatchType,null);
  }

  public int getMatchType(){
        return DataType.getAsInt(this.get(S_MatchType));
  
  }
  public int getMatchTypeInitialValue(){
        return DataType.getAsInt(this.getOldObj(S_MatchType));
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

