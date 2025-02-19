package com.asiainfo.crm.cm.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOGroupInfoAuditValue extends DataStructInterface{

  public final static  String S_ApplyType = "APPLY_TYPE";
  public final static  String S_GroupId = "GROUP_ID";
  public final static  String S_OperaType = "OPERA_TYPE";
  public final static  String S_GroupName = "GROUP_NAME";
  public final static  String S_Remark = "REMARK";
  public final static  String S_ApplyDate = "APPLY_DATE";
  public final static  String S_ApplyState = "APPLY_STATE";
  public final static  String S_ApplyId = "APPLY_ID";


public int getApplyType();

public long getGroupId();

public int getOperaType();

public String getGroupName();

public String getRemark();

public Timestamp getApplyDate();

public int getApplyState();

public long getApplyId();


public  void setApplyType(int value);

public  void setGroupId(long value);

public  void setOperaType(int value);

public  void setGroupName(String value);

public  void setRemark(String value);

public  void setApplyDate(Timestamp value);

public  void setApplyState(int value);

public  void setApplyId(long value);
}
