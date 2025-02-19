package com.asiainfo.crm.cm.customer.group.ivalues;
import com.ai.appframe2.common.DataStructInterface;
public interface IQBOSignCoverCountValue extends DataStructInterface{

  public final static  String S_SignalCover = "SIGNAL_COVER";
  public final static  String S_SignalCoverCount = "SIGNAL_COVER_COUNT";


public String getSignalCover();

public long getSignalCoverCount();


public  void setSignalCover(String value);

public  void setSignalCoverCount(long value);
}
