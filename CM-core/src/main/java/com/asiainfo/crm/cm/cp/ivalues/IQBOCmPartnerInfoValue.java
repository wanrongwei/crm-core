package com.asiainfo.crm.cm.cp.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IQBOCmPartnerInfoValue extends DataStructInterface{

  public final static  String S_PartnerType = "PARTNER_TYPE";
  public final static  String S_TypeDesc = "TYPE_DESC";
  public final static  String S_Name = "NAME";
  public final static  String S_PartnerTypeDtl = "PARTNER_TYPE_DTL";
  public final static  String S_StatusType = "STATUS_TYPE";
  public final static  String S_Id = "ID";


public long getPartnerType();

public String getTypeDesc();

public String getName();

public long getPartnerTypeDtl();

public long getStatusType();

public String getId();


public  void setPartnerType(long value);

public  void setTypeDesc(String value);

public  void setName(String value);

public  void setPartnerTypeDtl(long value);

public  void setStatusType(long value);

public  void setId(String value);
}
