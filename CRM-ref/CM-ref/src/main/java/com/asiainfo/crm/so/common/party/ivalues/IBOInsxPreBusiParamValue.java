package com.asiainfo.crm.so.common.party.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOInsxPreBusiParamValue extends DataStructInterface{

  public final static  String S_AttrValue = "ATTR_VALUE";
  public final static  String S_ReserveId = "RESERVE_ID";
  public final static  String S_SequenceId = "SEQUENCE_ID";
  public final static  String S_AttrLabel = "ATTR_LABEL";


public String getAttrValue();

public long getReserveId();

public int getSequenceId();

public String getAttrLabel();


public  void setAttrValue(String value);

public  void setReserveId(long value);

public  void setSequenceId(int value);

public  void setAttrLabel(String value);
}
