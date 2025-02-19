package com.asiainfo.crm.cm.custgroup.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmCustomerGroupValue extends DataStructInterface{

  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_GroupType = "GROUP_TYPE";
  public final static  String S_GroupStatus = "GROUP_STATUS";
  public final static  String S_ValidType = "VALID_TYPE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_GroupId = "GROUP_ID";
  public final static  String S_Ext1 = "EXT1";
  public final static  String S_GroupLevel = "GROUP_LEVEL";
  public final static  String S_GroupName = "GROUP_NAME";
  public final static  String S_Ext2 = "EXT2";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_Ext3 = "EXT3";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_Remark = "REMARK";


public Timestamp getEffectiveDate();

public String getRegionId();

public long getCreateOpId();

public Timestamp getDoneDate();

public long getOrgId();

public long getDoneCode();

public long getGroupType();

public long getGroupStatus();

public long getValidType();

public long getOpId();

public long getGroupId();

public String getExt1();

public long getGroupLevel();

public String getGroupName();

public String getExt2();

public Timestamp getCreateDate();

public String getExt3();

public long getCreateOrgId();

public Timestamp getExpireDate();

public String getRemark();


public  void setEffectiveDate(Timestamp value);

public  void setRegionId(String value);

public  void setCreateOpId(long value);

public  void setDoneDate(Timestamp value);

public  void setOrgId(long value);

public  void setDoneCode(long value);

public  void setGroupType(long value);

public  void setGroupStatus(long value);

public  void setValidType(long value);

public  void setOpId(long value);

public  void setGroupId(long value);

public  void setExt1(String value);

public  void setGroupLevel(long value);

public  void setGroupName(String value);

public  void setExt2(String value);

public  void setCreateDate(Timestamp value);

public  void setExt3(String value);

public  void setCreateOrgId(long value);

public  void setExpireDate(Timestamp value);

public  void setRemark(String value);
}
