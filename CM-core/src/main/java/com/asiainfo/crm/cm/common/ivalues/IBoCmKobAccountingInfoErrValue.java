package com.asiainfo.crm.cm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBoCmKobAccountingInfoErrValue extends DataStructInterface{

  public final static  String S_ErrMsg = "err_msg";
  public final static  String S_DetalInfo = "detal_info";
  public final static  String S_CreateDate = "create_date";
  public final static  String S_ErrDate = "err_date";
  public final static  String S_FileName = "file_name";
  public final static  String S_KobNmmber = "kob_nmmber";
  public final static  String S_RecordId = "record_id";


public String getErrMsg();

public String getDetalInfo();

public Timestamp getCreateDate();

public Timestamp getErrDate();

public String getFileName();

public String getKobNmmber();

public long getRecordId();


public  void setErrMsg(String value);

public  void setDetalInfo(String value);

public  void setCreateDate(Timestamp value);

public  void setErrDate(Timestamp value);

public  void setFileName(String value);

public  void setKobNmmber(String value);

public  void setRecordId(long value);
}
