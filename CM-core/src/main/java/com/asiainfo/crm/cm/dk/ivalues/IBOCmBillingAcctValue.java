package com.asiainfo.crm.cm.dk.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmBillingAcctValue extends DataStructInterface{

  public final static  String S_DoneCode = "done_code";
  public final static  String S_PbsNumber = "pbs_number";
  public final static  String S_DoneDate = "done_date";
  public final static  String S_CreateOrgId = "create_org_id";
  public final static  String S_Ext10 = "ext10";
  public final static  String S_CreateOpId = "create_op_id";
  public final static  String S_AcctId = "acct_id";
  public final static  String S_Ean = "ean";
  public final static  String S_Ext9 = "ext9";
  public final static  String S_EffectiveDate = "effective_date";
  public final static  String S_Ext8 = "ext8";
  public final static  String S_Ext7 = "ext7";
  public final static  String S_Ext6 = "ext6";
  public final static  String S_Ext5 = "ext5";
  public final static  String S_State = "state";
  public final static  String S_CreateDate = "create_date";
  public final static  String S_Ext4 = "ext4";
  public final static  String S_Ext3 = "ext3";
  public final static  String S_Ext2 = "ext2";
  public final static  String S_Ext1 = "ext1";
  public final static  String S_RegionId = "region_id";
  public final static  String S_OpId = "op_id";
  public final static  String S_ExpireDate = "expire_date";
  public final static  String S_OrgId = "org_id";
  public final static  String S_SeqId = "seq_id";
  public final static  String S_Remarks = "remarks";


public long getDoneCode();

public String getPbsNumber();

public Timestamp getDoneDate();

public long getCreateOrgId();

public Timestamp getExt10();

public long getCreateOpId();

public long getAcctId();

public String getEan();

public Timestamp getExt9();

public Timestamp getEffectiveDate();

public String getExt8();

public String getExt7();

public String getExt6();

public String getExt5();

public String getState();

public Timestamp getCreateDate();

public String getExt4();

public String getExt3();

public String getExt2();

public String getExt1();

public String getRegionId();

public long getOpId();

public Timestamp getExpireDate();

public long getOrgId();

public long getSeqId();

public String getRemarks();


public  void setDoneCode(long value);

public  void setPbsNumber(String value);

public  void setDoneDate(Timestamp value);

public  void setCreateOrgId(long value);

public  void setExt10(Timestamp value);

public  void setCreateOpId(long value);

public  void setAcctId(long value);

public  void setEan(String value);

public  void setExt9(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setExt8(String value);

public  void setExt7(String value);

public  void setExt6(String value);

public  void setExt5(String value);

public  void setState(String value);

public  void setCreateDate(Timestamp value);

public  void setExt4(String value);

public  void setExt3(String value);

public  void setExt2(String value);

public  void setExt1(String value);

public  void setRegionId(String value);

public  void setOpId(long value);

public  void setExpireDate(Timestamp value);

public  void setOrgId(long value);

public  void setSeqId(long value);

public  void setRemarks(String value);
}
