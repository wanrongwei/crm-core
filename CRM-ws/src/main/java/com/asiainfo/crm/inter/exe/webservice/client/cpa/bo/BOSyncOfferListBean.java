package com.asiainfo.crm.inter.exe.webservice.client.cpa.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;



public class BOSyncOfferListBean extends DataContainer implements DataContainerInterface,IBOSyncOfferListValue{

  private static String  m_boName = "fp.BOSyncOfferList";



  public final static  String S_Offername = "offerName";
  public final static  String S_Offerid = "offerId";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOSyncOfferListBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //�������������������ҵ���������
   throw new AIException("Cannot reset ObjectType");
 }


  public void initOffername(String value){
     this.initProperty(S_Offername,value);
  }
  public  void setOffername(String value){
     this.set(S_Offername,value);
  }
  public  void setOffernameNull(){
     this.set(S_Offername,null);
  }

  public String getOffername(){
       return DataType.getAsString(this.get(S_Offername));
  
  }
  public String getOffernameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Offername));
      }

  public void initOfferid(String value){
     this.initProperty(S_Offerid,value);
  }
  public  void setOfferid(String value){
     this.set(S_Offerid,value);
  }
  public  void setOfferidNull(){
     this.set(S_Offerid,null);
  }

  public String getOfferid(){
       return DataType.getAsString(this.get(S_Offerid));
  
  }
  public String getOfferidInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Offerid));
      }


 
 }

