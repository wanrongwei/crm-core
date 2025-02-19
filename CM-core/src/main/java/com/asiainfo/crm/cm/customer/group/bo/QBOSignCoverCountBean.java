package com.asiainfo.crm.cm.customer.group.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.customer.group.ivalues.*;

public class QBOSignCoverCountBean extends DataContainer implements DataContainerInterface,IQBOSignCoverCountValue{

  private static String  m_boName = "com.asiainfo.crm.cm.customer.group.bo.QBOSignCoverCount";



  public final static  String S_SignalCover = "SIGNAL_COVER";
  public final static  String S_SignalCoverCount = "SIGNAL_COVER_COUNT";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public QBOSignCoverCountBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
   throw new AIException("Cannot reset ObjectType");
 }


  public void initSignalCover(String value){
     this.initProperty(S_SignalCover,value);
  }
  public  void setSignalCover(String value){
     this.set(S_SignalCover,value);
  }
  public  void setSignalCoverNull(){
     this.set(S_SignalCover,null);
  }

  public String getSignalCover(){
       return DataType.getAsString(this.get(S_SignalCover));
  
  }
  public String getSignalCoverInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SignalCover));
      }

  public void initSignalCoverCount(long value){
     this.initProperty(S_SignalCoverCount,new Long(value));
  }
  public  void setSignalCoverCount(long value){
     this.set(S_SignalCoverCount,new Long(value));
  }
  public  void setSignalCoverCountNull(){
     this.set(S_SignalCoverCount,null);
  }

  public long getSignalCoverCount(){
        return DataType.getAsLong(this.get(S_SignalCoverCount));
  
  }
  public long getSignalCoverCountInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_SignalCoverCount));
      }


 
 }

