package com.asiainfo.crm.cm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmGroupManagerHValue extends DataStructInterface{

  public final static  String S_RelId = "REL_ID";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_ManagerId = "MANAGER_ID";
  public final static  String S_HId = "H_ID";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_RelType = "REL_TYPE";
  public final static  String S_DoneDate = "DONE_DATE";


public long getRelId();

public long getOpId();

public long getManagerId();

public long getHId();

public long getCustId();

public int getRelType();

public Timestamp getDoneDate();


public  void setRelId(long value);

public  void setOpId(long value);

public  void setManagerId(long value);

public  void setHId(long value);

public  void setCustId(long value);

public  void setRelType(int value);

public  void setDoneDate(Timestamp value);
}
