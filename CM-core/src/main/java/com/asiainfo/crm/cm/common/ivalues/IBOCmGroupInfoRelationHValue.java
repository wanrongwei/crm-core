package com.asiainfo.crm.cm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmGroupInfoRelationHValue extends DataStructInterface{

  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_GroupSeq = "GROUP_SEQ";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_GroupId = "GROUP_ID";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_OperType = "OPER_TYPE";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_AuditStatus = "AUDIT_STATUS";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_DelAuditId = "DEL_AUDIT_ID";
  public final static  String S_DelAuditDate = "DEL_AUDIT_DATE";
  public final static  String S_HId = "H_ID";


public long getCreateOpId();

public Timestamp getEffectiveDate();

public String getGroupSeq();

public Timestamp getDoneDate();

public long getGroupId();

public String getRemarks();

public long getOrgId();

public Timestamp getCreateDate();

public long getDoneCode();

public int getOperType();

public String getRegionId();

public long getOpId();

public Timestamp getExpireDate();

public int getAuditStatus();

public long getCreateOrgId();

public long getDelAuditId();

public Timestamp getDelAuditDate();

public long getHId();


public  void setCreateOpId(long value);

public  void setEffectiveDate(Timestamp value);

public  void setGroupSeq(String value);

public  void setDoneDate(Timestamp value);

public  void setGroupId(long value);

public  void setRemarks(String value);

public  void setOrgId(long value);

public  void setCreateDate(Timestamp value);

public  void setDoneCode(long value);

public  void setOperType(int value);

public  void setRegionId(String value);

public  void setOpId(long value);

public  void setExpireDate(Timestamp value);

public  void setAuditStatus(int value);

public  void setCreateOrgId(long value);

public  void setDelAuditId(long value);

public  void setDelAuditDate(Timestamp value);

public  void setHId(long value);
}
