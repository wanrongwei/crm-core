package com.asiainfo.crm.cm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmKobAccountingInfoValue extends DataStructInterface{

  public final static  String S_DetalInfo = "detal_info";
  public final static  String S_ExpireDate = "expire_date";
  public final static  String S_DoneDate = "done_date";
  public final static  String S_State = "state";
  public final static  String S_RegionId = "region_id";
  public final static  String S_DoneCode = "done_code";
  public final static  String S_CreateOrgId = "create_org_id";
  public final static  String S_FileName = "file_name";
  public final static  String S_RecordId = "record_id";
  public final static  String S_OrgId = "org_id";
  public final static  String S_OpId = "op_id";
  public final static  String S_CreateDate = "create_date";
  public final static  String S_EffectiveDate = "effective_date";
  public final static  String S_KobNmmber = "kob_nmmber";
  public final static  String S_CreateOpId = "create_op_id";


public String getDetalInfo();

public Timestamp getExpireDate();

public Timestamp getDoneDate();

public String getState();

public String getRegionId();

public long getDoneCode();

public long getCreateOrgId();

public String getFileName();

public long getRecordId();

public long getOrgId();

public long getOpId();

public Timestamp getCreateDate();

public Timestamp getEffectiveDate();

public String getKobNmmber();

public long getCreateOpId();


public  void setDetalInfo(String value);

public  void setExpireDate(Timestamp value);

public  void setDoneDate(Timestamp value);

public  void setState(String value);

public  void setRegionId(String value);

public  void setDoneCode(long value);

public  void setCreateOrgId(long value);

public  void setFileName(String value);

public  void setRecordId(long value);

public  void setOrgId(long value);

public  void setOpId(long value);

public  void setCreateDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setKobNmmber(String value);

public  void setCreateOpId(long value);
}
