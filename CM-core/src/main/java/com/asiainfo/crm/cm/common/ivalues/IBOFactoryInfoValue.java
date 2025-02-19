package com.asiainfo.crm.cm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOFactoryInfoValue extends DataStructInterface{

  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_State = "STATE";
  public final static  String S_Linker = "LINKER";
  public final static  String S_Name = "NAME";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_Description = "DESCRIPTION";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_Phone = "PHONE";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_FactoryType = "FACTORY_TYPE";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_FactoryId = "FACTORY_ID";
  public final static  String S_Email = "EMAIL";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_Fax = "FAX";


public Timestamp getExpireDate();

public long getOpId();

public Timestamp getEffectiveDate();

public String getState();

public String getLinker();

public String getName();

public String getRemarks();

public String getDescription();

public long getOrgId();

public String getRegionId();

public String getPhone();

public long getCreateOrgId();

public int getFactoryType();

public long getCreateOpId();

public Timestamp getDoneDate();

public long getFactoryId();

public String getEmail();

public Timestamp getCreateDate();

public long getDoneCode();

public String getFax();


public  void setExpireDate(Timestamp value);

public  void setOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setState(String value);

public  void setLinker(String value);

public  void setName(String value);

public  void setRemarks(String value);

public  void setDescription(String value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setPhone(String value);

public  void setCreateOrgId(long value);

public  void setFactoryType(int value);

public  void setCreateOpId(long value);

public  void setDoneDate(Timestamp value);

public  void setFactoryId(long value);

public  void setEmail(String value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setFax(String value);
}
