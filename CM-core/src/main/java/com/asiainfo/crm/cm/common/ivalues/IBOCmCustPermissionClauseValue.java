package com.asiainfo.crm.cm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmCustPermissionClauseValue extends DataStructInterface{

  public final static  String S_ExpireDate = "expire_date";
  public final static  String S_DoneDate = "done_date";
  public final static  String S_State = "state";
  public final static  String S_RegionId = "region_id";
  public final static  String S_DoneCode = "done_code";
  public final static  String S_Remarks = "remarks";
  public final static  String S_CreateOrgId = "create_org_id";
  public final static  String S_OrgId = "org_id";
  public final static  String S_Ext5 = "ext5";
  public final static  String S_OpId = "op_id";
  public final static  String S_Level = "level";
  public final static  String S_SeqNo = "seq_no";
  public final static  String S_CreateDate = "create_date";
  public final static  String S_Ext1 = "ext1";
  public final static  String S_ParentClauseId = "parent_clause_id";
  public final static  String S_ClauseContent = "clause_content";
  public final static  String S_Ext2 = "ext2";
  public final static  String S_Ext3 = "ext3";
  public final static  String S_Ext4 = "ext4";
  public final static  String S_EffectiveDate = "effective_date";
  public final static  String S_Action = "ACTION";
  public final static  String S_ClauseId = "clause_id";
  public final static  String S_CreateOpId = "create_op_id";


public Timestamp getExpireDate();

public Timestamp getDoneDate();

public String getState();

public String getRegionId();

public long getDoneCode();

public String getRemarks();

public long getCreateOrgId();

public long getOrgId();

public String getExt5();

public long getOpId();

public long getLevel();

public long getSeqNo();

public Timestamp getCreateDate();

public String getExt1();

public long getParentClauseId();

public String getClauseContent();

public String getExt2();

public String getExt3();

public String getExt4();

public Timestamp getEffectiveDate();

public String getAction();

public long getClauseId();

public long getCreateOpId();


public  void setExpireDate(Timestamp value);

public  void setDoneDate(Timestamp value);

public  void setState(String value);

public  void setRegionId(String value);

public  void setDoneCode(long value);

public  void setRemarks(String value);

public  void setCreateOrgId(long value);

public  void setOrgId(long value);

public  void setExt5(String value);

public  void setOpId(long value);

public  void setLevel(long value);

public  void setSeqNo(long value);

public  void setCreateDate(Timestamp value);

public  void setExt1(String value);

public  void setParentClauseId(long value);

public  void setClauseContent(String value);

public  void setExt2(String value);

public  void setExt3(String value);

public  void setExt4(String value);

public  void setEffectiveDate(Timestamp value);

public  void setAction(String value);

public  void setClauseId(long value);

public  void setCreateOpId(long value);
}
