package com.asiainfo.crm.cm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IQBOGroupInfoRelationValue extends DataStructInterface{

  public final static  String S_SoNbr = "SO_NBR";
  public final static  String S_SoDate = "SO_DATE";
  public final static  String S_GroupSeq = "GROUP_SEQ";
  public final static  String S_GroupId = "GROUP_ID";
  public final static  String S_Notes = "NOTES";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_CustName = "CUST_NAME";
  public final static  String S_OperType = "OPER_TYPE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_AuditStatus = "AUDIT_STATUS";
  public final static  String S_GroupName = "GROUP_NAME";
  public final static  String S_LinkPhone = "LINK_PHONE";
  public final static  String S_DelAuditId = "DEL_AUDIT_ID";
  public final static  String S_GroupStatus = "GROUP_STATUS";
  public final static  String S_DelAuditDate = "DEL_AUDIT_DATE";


public long getSoNbr();

public Timestamp getSoDate();

public String getGroupSeq();

public long getGroupId();

public String getNotes();

public long getOrgId();

public Timestamp getCreateDate();

public String getCustName();

public long getOperType();

public long getOpId();

public long getAuditStatus();

public String getGroupName();

public String getLinkPhone();

public long getDelAuditId();

public long getGroupStatus();

public Timestamp getDelAuditDate();


public  void setSoNbr(long value);

public  void setSoDate(Timestamp value);

public  void setGroupSeq(String value);

public  void setGroupId(long value);

public  void setNotes(String value);

public  void setOrgId(long value);

public  void setCreateDate(Timestamp value);

public  void setCustName(String value);

public  void setOperType(long value);

public  void setOpId(long value);

public  void setAuditStatus(long value);

public  void setGroupName(String value);

public  void setLinkPhone(String value);

public  void setDelAuditId(long value);

public  void setGroupStatus(long value);

public  void setDelAuditDate(Timestamp value);
}
