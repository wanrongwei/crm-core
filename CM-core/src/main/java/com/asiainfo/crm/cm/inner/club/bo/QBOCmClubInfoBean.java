package com.asiainfo.crm.cm.inner.club.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.inner.club.ivalues.*;

public class QBOCmClubInfoBean extends DataContainer implements DataContainerInterface,IQBOCmClubInfoValue{

  private static String  m_boName = "com.asiainfo.crm.cm.inner.club.bo.QBOCmClubInfo";



  public final static  String S_CertType = "CERT_TYPE";
  public final static  String S_CertCode = "CERT_CODE";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_MemberId = "MEMBER_ID";
  public final static  String S_ClubName = "CLUB_NAME";
  public final static  String S_MemberName = "MEMBER_NAME";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_ClubId = "CLUB_ID";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public QBOCmClubInfoBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initCertType(long value){
     this.initProperty(S_CertType,new Long(value));
  }
  public  void setCertType(long value){
     this.set(S_CertType,new Long(value));
  }
  public  void setCertTypeNull(){
     this.set(S_CertType,null);
  }

  public long getCertType(){
        return DataType.getAsLong(this.get(S_CertType));
  
  }
  public long getCertTypeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CertType));
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

  public void initClubName(String value){
     this.initProperty(S_ClubName,value);
  }
  public  void setClubName(String value){
     this.set(S_ClubName,value);
  }
  public  void setClubNameNull(){
     this.set(S_ClubName,null);
  }

  public String getClubName(){
       return DataType.getAsString(this.get(S_ClubName));
  
  }
  public String getClubNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ClubName));
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

  public void initClubId(long value){
     this.initProperty(S_ClubId,new Long(value));
  }
  public  void setClubId(long value){
     this.set(S_ClubId,new Long(value));
  }
  public  void setClubIdNull(){
     this.set(S_ClubId,null);
  }

  public long getClubId(){
        return DataType.getAsLong(this.get(S_ClubId));
  
  }
  public long getClubIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_ClubId));
      }


 
 }

