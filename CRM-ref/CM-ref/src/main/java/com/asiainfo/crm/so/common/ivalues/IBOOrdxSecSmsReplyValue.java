package com.asiainfo.crm.so.common.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOOrdxSecSmsReplyValue extends DataStructInterface{

  public final static  String S_State = "STATE";
  public final static  String S_ThirdNumb = "THIRD_NUMB";
  public final static  String S_Ext2 = "EXT_2";
  public final static  String S_ExpireTime = "EXPIRE_TIME";
  public final static  String S_MsgSendCode = "MSG_SEND_CODE";
  public final static  String S_OprCode = "OPR_CODE";
  public final static  String S_CreateTime = "CREATE_TIME";
  public final static  String S_BillFlag = "BILL_FLAG";
  public final static  String S_SubBusiType = "SUB_BUSI_TYPE";
  public final static  String S_ReplyId = "REPLY_ID";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_IdValue = "ID_VALUE";
  public final static  String S_OrderExpireTime = "ORDER_EXPIRE_TIME";
  public final static  String S_Source = "SOURCE";
  public final static  String S_UserId = "USER_ID";
  public final static  String S_BusiType = "BUSI_TYPE";
  public final static  String S_ReplayTime = "REPLAY_TIME";
  public final static  String S_OprNumb = "OPR_NUMB";
  public final static  String S_IdType = "ID_TYPE";
  public final static  String S_OfferCode = "OFFER_CODE";
  public final static  String S_CrmBusiType = "CRM_BUSI_TYPE";
  public final static  String S_ConfirmCode = "CONFIRM_CODE";
  public final static  String S_SpCode = "SP_CODE";
  public final static  String S_Ext1 = "EXT_1";
  public final static  String S_OrderEffectiveTime = "ORDER_EFFECTIVE_TIME";
  public final static  String S_ServiceCode = "SERVICE_CODE";
  public final static  String S_Module = "MODULE";
  public final static  String S_ConfirmType = "CONFIRM_TYPE";
  public final static  String S_ReplyMessage = "REPLY_MESSAGE";
  public final static  String S_TaskId = "TASK_ID";
  public final static  String S_Ext3 = "EXT_3";
  public final static  String S_BillId = "BILL_ID";


public String getState();

public String getThirdNumb();

public String getExt2();

public Timestamp getExpireTime();

public String getMsgSendCode();

public String getOprCode();

public Timestamp getCreateTime();

public long getBillFlag();

public String getSubBusiType();

public long getReplyId();

public String getOpId();

public String getRegionId();

public String getIdValue();

public Timestamp getOrderExpireTime();

public String getSource();

public long getUserId();

public String getBusiType();

public Timestamp getReplayTime();

public String getOprNumb();

public String getIdType();

public String getOfferCode();

public String getCrmBusiType();

public String getConfirmCode();

public String getSpCode();

public String getExt1();

public Timestamp getOrderEffectiveTime();

public String getServiceCode();

public String getModule();

public String getConfirmType();

public String getReplyMessage();

public String getTaskId();

public String getExt3();

public String getBillId();


public  void setState(String value);

public  void setThirdNumb(String value);

public  void setExt2(String value);

public  void setExpireTime(Timestamp value);

public  void setMsgSendCode(String value);

public  void setOprCode(String value);

public  void setCreateTime(Timestamp value);

public  void setBillFlag(long value);

public  void setSubBusiType(String value);

public  void setReplyId(long value);

public  void setOpId(String value);

public  void setRegionId(String value);

public  void setIdValue(String value);

public  void setOrderExpireTime(Timestamp value);

public  void setSource(String value);

public  void setUserId(long value);

public  void setBusiType(String value);

public  void setReplayTime(Timestamp value);

public  void setOprNumb(String value);

public  void setIdType(String value);

public  void setOfferCode(String value);

public  void setCrmBusiType(String value);

public  void setConfirmCode(String value);

public  void setSpCode(String value);

public  void setExt1(String value);

public  void setOrderEffectiveTime(Timestamp value);

public  void setServiceCode(String value);

public  void setModule(String value);

public  void setConfirmType(String value);

public  void setReplyMessage(String value);

public  void setTaskId(String value);

public  void setExt3(String value);

public  void setBillId(String value);
}
