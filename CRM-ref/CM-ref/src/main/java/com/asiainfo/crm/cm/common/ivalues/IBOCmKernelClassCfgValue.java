package com.asiainfo.crm.cm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmKernelClassCfgValue extends DataStructInterface{

  public final static  String S_IsGlobal = "IS_GLOBAL";
  public final static  String S_FinalClass = "FINAL_CLASS";
  public final static  String S_CurClass = "CUR_CLASS";
  public final static  String S_Id = "ID";
  public final static  String S_Notes = "NOTES";
  public final static  String S_KernelClass = "KERNEL_CLASS";


public int getIsGlobal();

public int getFinalClass();

public int getCurClass();

public long getId();

public String getNotes();

public int getKernelClass();


public  void setIsGlobal(int value);

public  void setFinalClass(int value);

public  void setCurClass(int value);

public  void setId(long value);

public  void setNotes(String value);

public  void setKernelClass(int value);
}
