package com.asiainfo.crm.cm.dk.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmBillFormatDtlValue extends DataStructInterface{

  public final static  String S_ValidType = "VALID_TYPE";
  public final static  String S_AcctId = "ACCT_ID";
  public final static  String S_MailCode = "MAIL_CODE";
  public final static  String S_MailName = "MAIL_NAME";
  public final static  String S_BillFormatName = "BILL_FORMAT_NAME";
  public final static  String S_AddressDesc = "ADDRESS_DESC";
  public final static  String S_DtlNo = "DTL_NO";
  public final static  String S_BillFormatId = "BILL_FORMAT_ID";
  public final static  String S_Email = "EMAIL";
  public final static  String S_CustType = "CUST_TYPE";
  public final static  String S_OperType = "OPER_TYPE";
  public final static  String S_Action = "ACTION";
  public final static  String S_IsPrimary = "IS_PRIMARY";
  public final static  String S_BillingType = "BILLING_TYPE";
  public final static  String S_IsCharge = "IS_CHARGE";
  public final static  String S_ContactId = "CONTACT_ID";
  public final static  String S_AddressId = "ADDRESS_ID";
  public final static  String S_AttInvoice = "ATT_INVOICE";
  public final static  String S_SendPdf = "SEND_PDF";

public int getValidType();

public long getAcctId();

public long getMailCode();

public String getMailName();

public String getBillFormatName();

public String getAddressDesc();

public long getDtlNo();

public int getBillFormatId();

public String getEmail();

public int getCustType();

public int getOperType();

public String getAction();

public int getIsPrimary();

public int getBillingType();

public int getIsCharge();

public long getContactId();

public long getAddressId();

public String getAttInvoice();

public int getSendPdf();

public  void setValidType(int value);

public  void setAcctId(long value);

public  void setMailCode(long value);

public  void setMailName(String value);

public  void setBillFormatName(String value);

public  void setAddressDesc(String value);

public  void setDtlNo(long value);

public  void setBillFormatId(int value);

public  void setEmail(String value);

public  void setCustType(int value);

public  void setOperType(int value);

public  void setAction(String value);

public  void setIsPrimary(int value);

public  void setBillingType(int value);

public  void setIsCharge(int value);

public  void setContactId(long value);

public  void setAddressId(long value);

public  void setAttInvoice(String value);

public  void setSendPdf(int value);

}
