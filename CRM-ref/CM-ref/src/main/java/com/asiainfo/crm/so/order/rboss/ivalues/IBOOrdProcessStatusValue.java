package com.asiainfo.crm.so.order.rboss.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOOrdProcessStatusValue extends DataStructInterface{

  public final static  String S_ProcessDate = "process_date";
  public final static  String S_CreateDate = "create_date";
  public final static  String S_ProcessType = "process_type";
  public final static  String S_ProcessCode = "process_code";
  public final static  String S_ProcessStatus = "process_status";
  public final static  String S_BusinessId = "business_id";
  public final static  String S_CustomerOrderId = "customer_order_id";
  public final static  String S_OrdProcessStatusId = "ord_process_status_id";
  public final static  String S_SortId = "sort_id";


public Timestamp getProcessDate();

public Timestamp getCreateDate();

public String getProcessType();

public String getProcessCode();

public String getProcessStatus();

public long getBusinessId();

public long getCustomerOrderId();

public long getOrdProcessStatusId();

public long getSortId();


public  void setProcessDate(Timestamp value);

public  void setCreateDate(Timestamp value);

public  void setProcessType(String value);

public  void setProcessCode(String value);

public  void setProcessStatus(String value);

public  void setBusinessId(long value);

public  void setCustomerOrderId(long value);

public  void setOrdProcessStatusId(long value);

public  void setSortId(long value);
}
