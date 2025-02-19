package com.asiainfo.crm.cm.customer.group.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IQBOCmGroupSegmentValue extends DataStructInterface{

  public final static  String S_SegmentAttrType = "SEGMENT_ATTR_TYPE";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_TableName = "TABLE_NAME";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_State = "STATE";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_Seq = "SEQ";
  public final static  String S_AttrituteName = "ATTRITUTE_NAME";
  public final static  String S_CustType = "CUST_TYPE";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_RelaId = "RELA_ID";
  public final static  String S_AllowInheritable = "ALLOW_INHERITABLE";
  public final static  String S_SegmentAttrId = "SEGMENT_ATTR_ID";
  public final static  String S_ColumnName = "COLUMN_NAME";
  public final static  String S_CustId = "CUST_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_IsInheritable = "IS_INHERITABLE";
  public final static  String S_IsApprovable = "IS_APPROVABLE";


public int getSegmentAttrType();

public Timestamp getExpireDate();

public String getTableName();

public long getOpId();

public Timestamp getEffectiveDate();

public String getState();

public String getRemarks();

public int getSeq();

public String getAttrituteName();

public int getCustType();

public long getOrgId();

public String getRegionId();

public long getCreateOrgId();

public long getRelaId();

public int getAllowInheritable();

public long getSegmentAttrId();

public String getColumnName();

public long getCustId();

public long getCreateOpId();

public Timestamp getDoneDate();

public Timestamp getCreateDate();

public long getDoneCode();

public int getIsInheritable();

public int getIsApprovable();


public  void setSegmentAttrType(int value);

public  void setExpireDate(Timestamp value);

public  void setTableName(String value);

public  void setOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setState(String value);

public  void setRemarks(String value);

public  void setSeq(int value);

public  void setAttrituteName(String value);

public  void setCustType(int value);

public  void setOrgId(long value);

public  void setRegionId(String value);

public  void setCreateOrgId(long value);

public  void setRelaId(long value);

public  void setAllowInheritable(int value);

public  void setSegmentAttrId(long value);

public  void setColumnName(String value);

public  void setCustId(long value);

public  void setCreateOpId(long value);

public  void setDoneDate(Timestamp value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setIsInheritable(int value);

public  void setIsApprovable(int value);
}
