package com.asiainfo.crm.cm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBoCmKobNameInfoErrValue extends DataStructInterface{

  public final static  String S_RecordId = "record_id";
  public final static  String S_DetalInfo = "detal_info";
  public final static  String S_ErrMsg = "err_msg";
  public final static  String S_FileName = "file_name";
  public final static  String S_ErrDate = "err_date";
  public final static  String S_KobNmmber = "kob_nmmber";
  public final static  String S_CreateDate = "create_date";


public long getRecordId();

public String getDetalInfo();

public String getErrMsg();

public String getFileName();

public Timestamp getErrDate();

public String getKobNmmber();

public Timestamp getCreateDate();


public  void setRecordId(long value);

public  void setDetalInfo(String value);

public  void setErrMsg(String value);

public  void setFileName(String value);

public  void setErrDate(Timestamp value);

public  void setKobNmmber(String value);

public  void setCreateDate(Timestamp value);
}
