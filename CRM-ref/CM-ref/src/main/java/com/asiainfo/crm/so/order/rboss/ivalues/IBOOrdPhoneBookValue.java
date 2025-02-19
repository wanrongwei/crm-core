package com.asiainfo.crm.so.order.rboss.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOOrdPhoneBookValue extends DataStructInterface{

  public final static  String S_BatchOrderId = "BATCH_ORDER_ID";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_PhonebookOrderId = "PHONEBOOK_ORDER_ID";
  public final static  String S_DealResult = "DEAL_RESULT";
  public final static  String S_Ext5 = "EXT5";
  public final static  String S_Ext6 = "EXT6";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_Ext1 = "EXT1";
  public final static  String S_Ext2 = "EXT2";
  public final static  String S_Ext3 = "EXT3";
  public final static  String S_Ext4 = "EXT4";


public String getBatchOrderId();

public String getRemarks();

public long getPhonebookOrderId();

public String getDealResult();

public String getExt5();

public String getExt6();

public long getBillId();

public Timestamp getCreateDate();

public long getDoneCode();

public String getExt1();

public String getExt2();

public String getExt3();

public String getExt4();


public  void setBatchOrderId(String value);

public  void setRemarks(String value);

public  void setPhonebookOrderId(long value);

public  void setDealResult(String value);

public  void setExt5(String value);

public  void setExt6(String value);

public  void setBillId(long value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setExt1(String value);

public  void setExt2(String value);

public  void setExt3(String value);

public  void setExt4(String value);
}
