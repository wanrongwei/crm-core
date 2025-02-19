package com.asiainfo.crm.cm.customer.custmgr.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmCustAdditionalInfoValue extends DataStructInterface{

  public final static  String S_Ext1 = "ext1";
  public final static  String S_NoteAutoPopup = "NOTE_AUTO_POPUP";
  public final static  String S_Ext2 = "ext2";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_Ext3 = "ext3";
  public final static  String S_Note = "NOTE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateDate = "CREATE_DATE";


public String getExt1();

public String getNoteAutoPopup();

public String getExt2();

public long getCustId();

public String getExt3();

public String getNote();
public long getOpId();
public long getOrgId();
public Timestamp getCreateDate();


public  void setExt1(String value);

public  void setNoteAutoPopup(String value);

public  void setExt2(String value);

public  void setCustId(long value);

public  void setExt3(String value);

public  void setNote(String value);
public  void setOpId(long value);

public  void setOrgId(long value);
public  void setCreateDate(Timestamp value);

}
