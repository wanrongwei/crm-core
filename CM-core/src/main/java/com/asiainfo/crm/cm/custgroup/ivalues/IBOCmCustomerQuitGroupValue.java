package com.asiainfo.crm.cm.custgroup.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmCustomerQuitGroupValue extends DataStructInterface{

  public final static  String S_Ext1 = "EXT_1";
  public final static  String S_Ext4 = "EXT_4";
  public final static  String S_Ext3 = "EXT_3";
  public final static  String S_QuitMode = "QUIT_MODE";
  public final static  String S_Ext2 = "EXT_2";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_Id = "ID";
  public final static  String S_CustomerId = "CUSTOMER_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_Status = "STATUS";


public String getExt1();

public String getExt4();

public String getExt3();

public long getQuitMode();

public String getExt2();

public Timestamp getDoneDate();

public long getId();

public long getCustomerId();

public long getDoneCode();

public Timestamp getCreateDate();

public long getStatus();


public  void setExt1(String value);

public  void setExt4(String value);

public  void setExt3(String value);

public  void setQuitMode(long value);

public  void setExt2(String value);

public  void setDoneDate(Timestamp value);

public  void setId(long value);

public  void setCustomerId(long value);

public  void setDoneCode(long value);

public  void setCreateDate(Timestamp value);

public  void setStatus(long value);
}
