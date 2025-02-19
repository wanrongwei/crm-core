package com.asiainfo.crm.cm.customer.custmgr.bo;

import java.sql.Timestamp;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.ServiceManager;
import com.asiainfo.crm.cm.customer.custmgr.ivalues.IBOCmCustAdditionalInfoValue;



public class BOCmCustAdditionalInfoBean extends DataContainer implements DataContainerInterface,IBOCmCustAdditionalInfoValue{

  private static String  m_boName = "com.asiainfo.crm.cm.customer.group.bo.BOCmCustAdditionalInfo";



  public final static  String S_Ext1 = "ext1";
  public final static  String S_NoteAutoPopup = "NOTE_AUTO_POPUP";
  public final static  String S_Ext2 = "ext2";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_Ext3 = "ext3";
  public final static  String S_Note = "NOTE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmCustAdditionalInfoBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此�??��?容�?�????���??对象类�?
   throw new AIException("Cannot reset ObjectType");
 }


  public void initExt1(String value){
     this.initProperty(S_Ext1,value);
  }
  public  void setExt1(String value){
     this.set(S_Ext1,value);
  }
  public  void setExt1Null(){
     this.set(S_Ext1,null);
  }

  public String getExt1(){
       return DataType.getAsString(this.get(S_Ext1));
  
  }
  public void initOpId(long value){
	     this.initProperty(S_OpId,value);
	  }
  public  void setOpId(long value){
	     this.set(S_OpId,value);
	  }
  public  void setOpIdNull(){
	     this.set(S_OpId,null);
	  }
  public long getOpId(){ 
	       return DataType.getAsLong(this.get(S_OpId));
	  }
  
  public void initOrgId(String value){
	     this.initProperty(S_OrgId,value);
	  }
public  void setOrgId(long value){
	     this.set(S_OrgId,value);
	  }
public  void setOrgIdNull(){
	     this.set(S_OrgId,null);
	  }
public long getOrgId(){
	       return DataType.getAsLong(this.get(S_OrgId));
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
  
  public String getExt1InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext1));
      }

  public void initNoteAutoPopup(String value){
     this.initProperty(S_NoteAutoPopup,value);
  }
  public  void setNoteAutoPopup(String value){
     this.set(S_NoteAutoPopup,value);
  }
  public  void setNoteAutoPopupNull(){
     this.set(S_NoteAutoPopup,null);
  }

  public String getNoteAutoPopup(){
       return DataType.getAsString(this.get(S_NoteAutoPopup));
  
  }
  public String getNoteAutoPopupInitialValue(){
        return DataType.getAsString(this.getOldObj(S_NoteAutoPopup));
      }

  public void initExt2(String value){
     this.initProperty(S_Ext2,value);
  }
  public  void setExt2(String value){
     this.set(S_Ext2,value);
  }
  public  void setExt2Null(){
     this.set(S_Ext2,null);
  }

  public String getExt2(){
       return DataType.getAsString(this.get(S_Ext2));
  
  }
  public String getExt2InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext2));
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

  public void initExt3(String value){
     this.initProperty(S_Ext3,value);
  }
  public  void setExt3(String value){
     this.set(S_Ext3,value);
  }
  public  void setExt3Null(){
     this.set(S_Ext3,null);
  }

  public String getExt3(){
       return DataType.getAsString(this.get(S_Ext3));
  
  }
  public String getExt3InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext3));
      }

  public void initNote(String value){
     this.initProperty(S_Note,value);
  }
  public  void setNote(String value){
     this.set(S_Note,value);
  }
  public  void setNoteNull(){
     this.set(S_Note,null);
  }

  public String getNote(){
       return DataType.getAsString(this.get(S_Note));
  
  }
  public String getNoteInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Note));
      }
 }

