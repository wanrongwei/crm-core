package com.asiainfo.crm.cm.inner.customer.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmContactContMediumPojoValue extends DataStructInterface{

  public final static  String S_ContId = "cont_id";
  public final static  String S_AddressCode = "address_code";
  public final static  String S_ExpireDate = "expire_date";
  public final static  String S_DoneDate = "done_date";
  public final static  String S_ProtectEffDate = "protect_eff_date";
  public final static  String S_State = "state";
  public final static  String S_RegionId = "region_id";
  public final static  String S_Remarks = "remarks";
  public final static  String S_CreateOrgId = "create_org_id";
  public final static  String S_OpId = "op_id";
  public final static  String S_CreateDate = "create_date";
  public final static  String S_AddressId = "address_id";
  public final static  String S_Priority = "priority";
  public final static  String S_CreateOpId = "create_op_id";
  public final static  String S_AddressDetail = "address_detail";
  public final static  String S_ContRelaId = "cont_rela_id";
  public final static  String S_FaxNumber = "fax_number";
  public final static  String S_IsNoDisturbing = "is_no_disturbing";
  public final static  String S_DoneCode = "done_code";
  public final static  String S_ProtectExpDate = "protect_exp_date";
  public final static  String S_OrgId = "org_id";
  public final static  String S_ContNumber = "cont_number";
  public final static  String S_PostalCode = "postal_code";
  public final static  String S_ContMedTypeId = "cont_med_type_id";
  public final static  String S_EffectiveDate = "effective_date";
  public final static  String S_EmailAddress = "email_address";


public long getContId();

public String getAddressCode();

public Timestamp getExpireDate();

public Timestamp getDoneDate();

public Timestamp getProtectEffDate();

public String getState();

public String getRegionId();

public String getRemarks();

public long getCreateOrgId();

public long getOpId();

public Timestamp getCreateDate();

public long getAddressId();

public long getPriority();

public long getCreateOpId();

public String getAddressDetail();

public long getContRelaId();

public String getFaxNumber();

public long getIsNoDisturbing();

public long getDoneCode();

public Timestamp getProtectExpDate();

public long getOrgId();

public String getContNumber();

public String getPostalCode();

public long getContMedTypeId();

public Timestamp getEffectiveDate();

public String getEmailAddress();


public  void setContId(long value);

public  void setAddressCode(String value);

public  void setExpireDate(Timestamp value);

public  void setDoneDate(Timestamp value);

public  void setProtectEffDate(Timestamp value);

public  void setState(String value);

public  void setRegionId(String value);

public  void setRemarks(String value);

public  void setCreateOrgId(long value);

public  void setOpId(long value);

public  void setCreateDate(Timestamp value);

public  void setAddressId(long value);

public  void setPriority(long value);

public  void setCreateOpId(long value);

public  void setAddressDetail(String value);

public  void setContRelaId(long value);

public  void setFaxNumber(String value);

public  void setIsNoDisturbing(long value);

public  void setDoneCode(long value);

public  void setProtectExpDate(Timestamp value);

public  void setOrgId(long value);

public  void setContNumber(String value);

public  void setPostalCode(String value);

public  void setContMedTypeId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setEmailAddress(String value);
}
