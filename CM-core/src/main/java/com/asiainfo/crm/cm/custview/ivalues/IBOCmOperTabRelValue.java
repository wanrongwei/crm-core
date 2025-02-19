package com.asiainfo.crm.cm.custview.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmOperTabRelValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_ViewRelId = "VIEW_REL_ID";
  public final static  String S_OperId = "OPER_ID";
  public final static  String S_ViewId = "VIEW_ID";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_Sort = "SORT";


public String getState();

public long getViewRelId();

public long getOperId();

public long getViewId();

public String getRemarks();

public int getSort();


public  void setState(String value);

public  void setViewRelId(long value);

public  void setOperId(long value);

public  void setViewId(long value);

public  void setRemarks(String value);

public  void setSort(int value);
}
