package com.asiainfo.crm.cm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmAttachExporClassValue extends DataStructInterface{

  public final static  String S_FileMode = "FILE_MODE";
  public final static  String S_State = "STATE";
  public final static  String S_FunctionCode = "FUNCTION_CODE";
  public final static  String S_AttachClassId = "ATTACH_CLASS_ID";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_MethCode = "METH_CODE";
  public final static  String S_FtpCode = "FTP_CODE";
  public final static  String S_ClassName = "CLASS_NAME";
  public final static  String S_FunctionName = "FUNCTION_NAME";
  public final static  String S_MethName = "METH_NAME";


public String getFileMode();

public String getState();

public String getFunctionCode();

public long getAttachClassId();

public String getRemarks();

public String getMethCode();

public String getFtpCode();

public String getClassName();

public String getFunctionName();

public String getMethName();


public  void setFileMode(String value);

public  void setState(String value);

public  void setFunctionCode(String value);

public  void setAttachClassId(long value);

public  void setRemarks(String value);

public  void setMethCode(String value);

public  void setFtpCode(String value);

public  void setClassName(String value);

public  void setFunctionName(String value);

public  void setMethName(String value);
}
