package com.asiainfo.crm.cm.inner.customer.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmxUserBingingInfoValue extends DataStructInterface{

  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_PromValue = "PROM_VALUE";
  public final static  String S_BillId = "BILL_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_PromName = "PROM_NAME";
  public final static  String S_PromStyle = "PROM_STYLE";
  public final static  String S_Notes = "NOTES";


public Timestamp getExpireDate();

public Timestamp getEffectiveDate();

public long getUserId();

public String getPromValue();

public long getBillId();

public long getDoneCode();

public String getPromName();

public String getPromStyle();

public String getNotes();


public  void setExpireDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setUserId(long value);

public  void setPromValue(String value);

public  void setBillId(long value);

public  void setDoneCode(long value);

public  void setPromName(String value);

public  void setPromStyle(String value);

public  void setNotes(String value);
}
