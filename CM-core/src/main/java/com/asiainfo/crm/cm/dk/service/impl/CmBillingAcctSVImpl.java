/**
 * 
 */
package com.asiainfo.crm.cm.dk.service.impl;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.rpc.ServiceException;

import com.asiainfo.crm.cm.dk.common.CmDkConstants;
import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.bo.BOBsStaticDataBean;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.ai.common.util.TimeUtil;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.dk.bo.BOCmAcctBillFormatBean;
import com.asiainfo.crm.cm.dk.bo.BOCmAcctContactBean;
import com.asiainfo.crm.cm.dk.bo.BOCmBillFormatDtlBean;
import com.asiainfo.crm.cm.dk.bo.BOCmPayChannelBean;
import com.asiainfo.crm.cm.dk.ivalues.IBOCmAcctBillFormatValue;
import com.asiainfo.crm.cm.dk.ivalues.IBOCmAcctContactValue;
import com.asiainfo.crm.cm.dk.ivalues.IBOCmBillFormatDtlValue;
import com.asiainfo.crm.cm.dk.ivalues.IBOCmPayChannelValue;
import com.asiainfo.crm.cm.dk.service.interfaces.ICmBillingAcctSV;
import com.asiainfo.crm.cm.dk.ws.ImsQueryServiceClient;
import com.asiainfo.crm.cm.dk.ws.ImsServiceClient;
import com.asiainfo.crm.cm.dk.ws.ImsWrapQueryServiceClient;
import com.asiainfo.crm.cm.dk.ws.imsqueryservice.CodeValue;
import com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryDDFeeResponse;
import com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryProductBillAttrResponse;
import com.asiainfo.crm.cm.dk.ws.imsqueryservice.QueryBillDetailResponse;
import com.asiainfo.crm.cm.dk.ws.imsqueryservice.SProductRecurringFee;
import com.asiainfo.crm.cm.dk.ws.imsservice.SChangeCustomInvReq;
import com.asiainfo.crm.cm.dk.ws.imsservice.SContactOper;
import com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.BankDebitInfo;
import com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryPayChannelResponse;
import com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryResponse;
import com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SAccount;
import com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SContact;
import com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SCustomInv;
import com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SCustomInvDtl;
import com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SCustomer;
import com.asiainfo.crm.cm.inner.account.ivalues.IBOCmCustAcctRelValue;
import com.asiainfo.crm.cm.model.bo.CmBusiLogBean;
import com.asiainfo.crm.cm.model.ivalues.ICmBusiLogValue;
import com.asiainfo.crm.cm.service.interfaces.ICmAccountSV;
import com.asiainfo.crm.inter.exe.webservice.client.payment.NetaxeptComponentServiceClient;
import com.asiainfo.crm.inter.exe.webservice.client.paymentNets.CheckBankAccountRequest;
import com.asiainfo.crm.inter.exe.webservice.client.paymentNets.CheckBankAccountRequestBody;
import com.asiainfo.crm.inter.exe.webservice.client.paymentNets.CheckBankAccountResponse;
import com.asiainfo.crm.inter.exe.webservice.client.paymentNets.NetsService_ServiceLocator;

/**   
 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author Administrator
 * @date 2014-11-26 上午10:11:35
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2014-11-26     shitian           v1.0.0               修改原因<br>
 */
public class CmBillingAcctSVImpl implements ICmBillingAcctSV {

	private ImsWrapQueryServiceClient getWrapQueryServiceClient() throws Exception {
		return ImsWrapQueryServiceClient.getInstance();
	}

	private ImsQueryServiceClient getQueryServiceClient() throws Exception {
		return ImsQueryServiceClient.getInstance();
	}

	public IBOCmAcctBillFormatValue queryAcctBillFormat(long acctId, int type) throws Exception {
		DoQueryResponse response = getWrapQueryServiceClient().getAcctInfo(acctId);
		if (response != null) {
			SAccount account = response.getAccount();
			if (account != null) {
				SCustomInv[] billFormats = account.getCustInvList();
				if (billFormats != null && billFormats.length > 0) {
					IBOCmAcctBillFormatValue billFormatValue = null;
					for (int i = 0; i < billFormats.length; i++) {
						billFormatValue = new BOCmAcctBillFormatBean();
						if (billFormats[i].getBillingType() == type) {
							billFormatValue.setBillFormat(billFormats[i].getBillFormatId() != null ? String.valueOf(billFormats[i].getBillFormatId()) : "");
							billFormatValue.setDeliveryMethod(billFormats[i].getMailCode() != null ? billFormats[i].getMailCode().intValue() : 1);
							if (billFormats[i].getPrintBill() != null) {
								billFormatValue.setPrintBill(billFormats[i].getPrintBill());
							}
							if (billFormats[i].getSendAccessory() != null) {//CR6新增 是否发附件
								billFormatValue.setSendPdf(billFormats[i].getSendAccessory());
							}
							if (billFormats[i].getLanguageId() != null) {
								billFormatValue.setLanguage(billFormats[i].getLanguageId());
							}
							billFormatValue.setSidePrinting(billFormats[i].getPrintSide() != null ? String.valueOf(billFormats[i].getPrintSide()) : "");
							billFormatValue.setDueDays(billFormats[i].getDueDay() != null ? String.valueOf(billFormats[i].getDueDay()) : "");
							billFormatValue.setEan(billFormats[i].getEan());
							billFormatValue.setEanQualificator(billFormats[i].getEanQualificator() != null ? String.valueOf(billFormats[i].getEanQualificator()) : "");
							billFormatValue.setOioCotactName(billFormats[i].getOioContactName());
							billFormatValue.setOioOrderCode(billFormats[i].getOioOrderCode());
							if (billFormats[i].getValidType() != null) {
								billFormatValue.setEffectiveMethod(billFormats[i].getValidType().toString());
							}
							billFormatValue.setOioAccountCode(billFormats[i].getOioAccountCode());
							billFormatValue.setOioUblProfile(billFormats[i].getOioUblProfile());
							billFormatValue.setOioUtsProfile(billFormats[i].getOioUtsProfile());
							if (billFormats[i].getBillingType() != null) {
								billFormatValue.setBillingType(billFormats[i].getBillingType());
							}
							if (billFormats[i].getIsCharge() != null) {
								billFormatValue.setIsCharge(billFormats[i].getIsCharge());
							}
							break;
						}
					}
					return billFormatValue;
				}
			}
		}
		return null;
	}

	public IBOCmAcctContactValue[] queryAcctContacts(long acctId, int start, int end) throws Exception {
		IBOCmAcctContactValue contactValue = null;
		DoQueryResponse response = getWrapQueryServiceClient().getAcctInfo(acctId);
		SContact[] contactList = response.getSContactList();
		List result = new ArrayList();
		if (contactList != null && contactList.length > 0) {
			for (int i = 0; i < contactList.length; i++) {
				if (contactList[i].getContactType() == 6) {// copy bill
					contactValue = new BOCmAcctContactBean();
					contactValue.setContactName(contactList[i].getContactName());
					contactValue.setContactType(contactList[i].getContactType());
					contactValue.setAddressDetail(contactList[i].getAddrDesc());
					contactValue.setEmail(contactList[i].getEmail());
					contactValue.setMobilePhone(contactList[i].getMobilePhone());
					if (StringUtils.isNotBlank(contactList[i].getEffectiveDate())) {
						contactValue.setEffectiveDate(TimeUtil.getTimstampByString(contactList[i].getEffectiveDate(), TimeUtil.YYYY_MM_DD_HH_MM_SS));
					}
					contactValue.setEffectiveWay(contactList[i].getEffectiveWay() != null ? contactList[i].getEffectiveWay().toString() : "");
					if (contactList[i].getContactId() != null) {
						contactValue.setContactId(contactList[i].getContactId());
						String editor = "<a href='javascript:void(0)' class='cellpath' onclick='modifyAcctContact(" + String.valueOf(contactList[i].getContactId())
								+ ")' style='color:blue;margin-left:5px;text-decoration:underline'>" + CrmLocaleFactory.getResource("CMS0013081") + "</a>";
						String delete = "<a href='javascript:void(0)' class='cellpath' onclick='deleteAcctContact(\"" + String.valueOf(contactList[i].getContactId()) + "\",\""
								+ String.valueOf(contactList[i].getContactType()) + "\")' style='color:blue;margin-left:5px;text-decoration:underline'>"
								+ CrmLocaleFactory.getResource("CMS0000079") + "</a>";
						contactValue.setOperation(editor + delete);
					}

					result.add(contactValue);
				}
			}
		}
		if (!result.isEmpty()) {
			return (IBOCmAcctContactValue[]) result.toArray(new IBOCmAcctContactValue[0]);
		}
		return new IBOCmAcctContactValue[0];
	}

	public int queryAcctContactsCount(long acctId) throws Exception {
		DoQueryResponse response = getWrapQueryServiceClient().getAcctInfo(acctId);
		SContact[] contactList = response.getSContactList();
		if (contactList != null) {
			return contactList.length;
		}
		return 0;
	}

	public IBOCmPayChannelValue queryAcctPayChannel(long acctId) throws Exception {
		// ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		Map paraMap = new HashMap();
		paraMap.put("ACCT_ID", acctId);
		// commonSV.saveCommonQryBusiLog(CmConstants.BusiLogId.BILLING_ACCT_QRY, null, paraMap,
		// CmConstants.BusiLogType.ACCOUNT_LOG);
		IBOCmPayChannelValue payChannelValue = new BOCmPayChannelBean();
		DoQueryResponse response = getWrapQueryServiceClient().getAcctInfo(acctId);
		SAccount account = response.getAccount();
		if (account != null) {
			DoQueryPayChannelResponse channelResponse = account.getPayChannels();
			BankDebitInfo bankInfo = channelResponse.getBankInfo();
			// 封装对象
			if (channelResponse != null) {
				int paymentType = channelResponse.getPaymentType();
				payChannelValue.setPaymentType(paymentType);
				if (paymentType == 11) {
					// pbs
					if (channelResponse.getSts() != null) {
						payChannelValue.setPbsSts(channelResponse.getSts());
					}
					if (channelResponse.getEffectiveDate() != null) {
						SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
						String date = sdformat.format(channelResponse.getEffectiveDate().getTime());
						payChannelValue.setPbsEffDate(Timestamp.valueOf(date));
					}
				}
				if (channelResponse.getExpireDate() != null) {
					payChannelValue.setExpiryDate(TimeUtil.getTruncDate(channelResponse.getExpireDate().getTime()));
				}
			}
			if (bankInfo != null) {
				if (bankInfo.getBankId() != null) {
					payChannelValue.setBankId(bankInfo.getBankId());
				}
				if (bankInfo.getCardType() != null) {
					payChannelValue.setCardType(bankInfo.getCardType());
				}
				payChannelValue.setCardId(bankInfo.getCardId());
				if (null != bankInfo.getNumberType()) {
					if (bankInfo.getNumberType() == CmConstants.billingNumberType.BILL_CPR) {
						payChannelValue.setCpr(bankInfo.getCvr());
					} else if (bankInfo.getNumberType() == CmConstants.billingNumberType.BILL_CVR) {
						payChannelValue.setCvr(bankInfo.getCvr());
					}
				}
				payChannelValue.setChId(bankInfo.getAuthId());
				payChannelValue.setCardTypeName(bankInfo.getCardTypeName());
				payChannelValue.setCardExpiryDate(bankInfo.getExpireDate());
			}
		}
		return payChannelValue;
	}

	public IBOCmAcctContactValue queryAcctContacts(long acctId, long contactId) throws Exception {
		IBOCmAcctContactValue contactValue = new BOCmAcctContactBean();
		DoQueryResponse response = getWrapQueryServiceClient().getAcctInfo(acctId);
		SContact[] contactList = response.getSContactList();
		if (contactList != null && contactList.length > 0) {
			for (int i = 0; i < contactList.length; i++) {
				if (contactList[i].getContactId() == contactId) {
					contactValue.setContactName(contactList[i].getContactName());
					contactValue.setContactType(contactList[i].getContactType());
					contactValue.setAddressDetail(contactList[i].getAddrDesc());
					contactValue.setEmail(contactList[i].getEmail());
					contactValue.setMobilePhone(contactList[i].getMobilePhone());
					contactValue.setEffectiveWay(contactList[i].getEffectiveWay() != null ? contactList[i].getEffectiveWay().toString() : "");
					contactValue.setContactId(contactId);
				}
			}
		}
		return contactValue;
	}

	public String getAcctFee(IBOCmPayChannelValue payChannelValue) throws Exception {
		DoQueryDDFeeResponse response = getQueryServiceClient().doQueryDDFee(payChannelValue);
		String fee = "";
		if (response != null) {
			// fee = String.valueOf(response.getValue());
		}
		return fee;
	}

	public void saveAcctPayment(long acctId, long custId, IBOCmPayChannelValue payChannelValue, IBOCmAcctBillFormatValue[] bllAcctBillFormatValues,
			IBOCmAcctContactValue acctContactValue) throws Exception {
		com.asiainfo.crm.cm.dk.ws.imsservice.SAccount account = new com.asiainfo.crm.cm.dk.ws.imsservice.SAccount();
		account.setOuterAcctId(String.valueOf(acctId));
		account.setOuterCustId(String.valueOf(custId));

		// 封装支付渠道对象
		com.asiainfo.crm.cm.dk.ws.imsservice.DoQueryPayChannelResponse payChannel = new com.asiainfo.crm.cm.dk.ws.imsservice.DoQueryPayChannelResponse();
		com.asiainfo.crm.cm.dk.ws.imsservice.BankDebitInfo bankInfo = new com.asiainfo.crm.cm.dk.ws.imsservice.BankDebitInfo();
		int paymentType = payChannelValue.getPaymentType();
		payChannel.setPaymentType(paymentType);
		if (payChannelValue.getExpiryDate() != null) {
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(new Date(payChannelValue.getExpiryDate().getTime()));
			payChannel.setExpireDate(calendar);
		}
		if (paymentType != 2) {// 2为现金，如果为现金则不需要银行相关信息
			//修改时bankcode/banknumber为*，只有新增时才校验
			if(payChannelValue.getPbsSts()<0){
				boolean checkBank = checkBankCodeAndNumber(payChannelValue.getCardId(),payChannelValue.getBankId());
				if(!checkBank){
					throw new Exception("Bank code or number check is not passed.");
				}
			}		
			payChannel.setBankInfo(bankInfo);
			bankInfo.setAuthId(payChannelValue.getChId());
			if (StringUtils.isNotBlank(payChannelValue.getBankId())) {
				bankInfo.setBankId(payChannelValue.getBankId());
			}
			bankInfo.setCardType(payChannelValue.getCardType());
			bankInfo.setCardTypeName(payChannelValue.getCardTypeName());
			bankInfo.setCardId(payChannelValue.getCardId());
			if (StringUtils.isNotBlank(payChannelValue.getCpr())) {
				bankInfo.setCvr(payChannelValue.getCpr());
				bankInfo.setNumberType(CmConstants.billingNumberType.BILL_CPR);
			} else if (StringUtils.isNotBlank(payChannelValue.getCvr())) {
				bankInfo.setCvr(payChannelValue.getCvr());
				bankInfo.setNumberType(CmConstants.billingNumberType.BILL_CVR);
			}
			// if (payChannelValue.getCardExpiryDate() != null) {
			// bankInfo.setExpireDate(payChannelValue.getCardExpiryDate().toString());
			// }
		}
		account.setPayChannels(payChannel);

		// 封装账单模板
		long deliveryMethod = -1;
		if (bllAcctBillFormatValues != null && bllAcctBillFormatValues.length > 0) {
			List billFormat = new ArrayList();
			SChangeCustomInvReq changeCustomInvReq = null;
			for (int i = 0; i < bllAcctBillFormatValues.length; i++) {
				changeCustomInvReq = new SChangeCustomInvReq();
				changeCustomInvReq.setAcctId(acctId);
				changeCustomInvReq.setIsCharge(bllAcctBillFormatValues[i].getIsCharge());
				if (StringUtils.isNotBlank(bllAcctBillFormatValues[i].getBillFormat())) {
					changeCustomInvReq.setBillFormatId(Integer.parseInt(bllAcctBillFormatValues[i].getBillFormat()));
				}
				if (StringUtils.isNotBlank(bllAcctBillFormatValues[i].getEffectiveMethod())) {
					changeCustomInvReq.setValidType(Integer.parseInt(bllAcctBillFormatValues[i].getEffectiveMethod()));
				}
				changeCustomInvReq.setBillingType(bllAcctBillFormatValues[i].getBillingType());
				long mailCode = bllAcctBillFormatValues[i].getDeliveryMethod();
				if (mailCode > 0){
					changeCustomInvReq.setMailCode(mailCode);
					deliveryMethod = mailCode;
				}
				changeCustomInvReq.setPrintBill(bllAcctBillFormatValues[i].getPrintBill());
				//终端账户不设值  判断客户类型 B2B客户 SendAccessory字段才设值  B2C不处理
				ICmAccountSV accountSV = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
				IBOCmCustAcctRelValue[] accountRelValue = accountSV.queryCustAcctRel(-1, acctId, null, -1, -1, -1, null, -1, -1, null);
				if (accountRelValue[0].getInstallmentFlag() != 3 && accountRelValue[0].getCustType() == 3 && paymentType != 12  && mailCode == 2){//寄送方式为Email
					changeCustomInvReq.setSendAccessory(bllAcctBillFormatValues[i].getSendPdf());//CR6新增 是否发附件
				}
				changeCustomInvReq.setLanguageId(bllAcctBillFormatValues[i].getLanguage());
				if (StringUtils.isNotBlank(bllAcctBillFormatValues[i].getSidePrinting())) {
					changeCustomInvReq.setPrintSide(Integer.parseInt(bllAcctBillFormatValues[i].getSidePrinting()));
				}
				changeCustomInvReq.setEan(bllAcctBillFormatValues[i].getEan());
				if (StringUtils.isNotBlank(bllAcctBillFormatValues[i].getEanQualificator())) {
					changeCustomInvReq.setEanQualificator(Integer.parseInt(bllAcctBillFormatValues[i].getEanQualificator()));
				}
				changeCustomInvReq.setOioContactName(bllAcctBillFormatValues[i].getOioCotactName());
				changeCustomInvReq.setOioAccountCode(bllAcctBillFormatValues[i].getOioAccountCode());
				changeCustomInvReq.setOioUblProfile(bllAcctBillFormatValues[i].getOioUblProfile());
				changeCustomInvReq.setOioUtsProfile(bllAcctBillFormatValues[i].getOioUtsProfile());
				changeCustomInvReq.setOioOrderCode(bllAcctBillFormatValues[i].getOioOrderCode());
				billFormat.add(changeCustomInvReq);
			}
			account.setChangeInvList((SChangeCustomInvReq[]) billFormat.toArray(new SChangeCustomInvReq[0]));
		}

		// 封装账单联系人
		SContactOper contactOper = new SContactOper();
		if (acctContactValue != null) {
			com.asiainfo.crm.cm.dk.ws.imsservice.SContact contact = new com.asiainfo.crm.cm.dk.ws.imsservice.SContact();
			contact.setContactType((short) 5);// 账单联系人
			contact.setOuterAcctId(String.valueOf(acctId));
			contact.setOuterCustId(String.valueOf(custId));
			contact.setContactName(acctContactValue.getContactName());
			contact.setEmail(acctContactValue.getEmail());
			contact.setMobilePhone(acctContactValue.getMobilePhone());
			contact.setAddress(acctContactValue.getAddressDetail());
			long contId = acctContactValue.getContactId();
			contact.setContactId(contId);
			if (StringUtils.isNotBlank(acctContactValue.getAddressId())) {
				long addressId = Long.parseLong(acctContactValue.getAddressId().trim());
				contact.setAddressId(addressId);
			}
			if (StringUtils.isNotBlank(acctContactValue.getEffectiveWay())) {
				int effectiveWay = Integer.parseInt(acctContactValue.getEffectiveWay());
				if (effectiveWay > 1) {
					contact.setEffectiveWay(false);
				} else {
					contact.setEffectiveWay(true);
				}
			}
			contactOper.setContactList(new com.asiainfo.crm.cm.dk.ws.imsservice.SContact[] { contact });
			//直接送修改
			contactOper.setOperType((short) 2);// 修改
		}
		ImsServiceClient.getInstance().DoModifyAccountBasicInfo(account, new SContactOper[] { contactOper });

		// 记录日志
		ICmBusiLogValue busiLogValue = new CmBusiLogBean();
		busiLogValue.setBusinessId(CmConstants.BusiLogId.BILLING_ACCT_OPER);
		busiLogValue.setParentLogId(-1);
		busiLogValue.setCustId(custId);
		busiLogValue.setAcctId(acctId);
		busiLogValue.setBusiType(CmConstants.BusiLogType.ACCOUNT_LOG);
		busiLogValue.setOperType(CmConstants.BusiLogOperType.QUERY);
		busiLogValue.setRegionId(CmCommonUtil.getDefaultRegionId());
		busiLogValue.setRemarks("DoModifyAccountBasicInfo");
		String busiDetail = "DoModifyAccountBasicInfo:custId=" + custId + ",acctId=" + acctId + ",paymentType=" + paymentType + ",deliveryMethod=" + deliveryMethod;
		if (acctContactValue != null) {
			busiDetail = busiDetail + ",email=" + acctContactValue.getEmail() + ",phone=" + acctContactValue.getMobilePhone() + ",addressDetail=" + acctContactValue.getAddressDetail();
		}
		busiLogValue.setBusiDetail(busiDetail);
		CmServiceFactory.getBusiLogSV().saveBusiLog(busiLogValue);
	}

	public void saveAcctContact(long acctId, long custId, IBOCmAcctContactValue[] acctContactValues) throws Exception {
		com.asiainfo.crm.cm.dk.ws.imsservice.SContact contact = null;
		if (acctContactValues != null && acctContactValues.length > 0) {
			List contactList = new ArrayList();
			short operType = -1;
			for (int i = 0; i < acctContactValues.length; i++) {
				contact = new com.asiainfo.crm.cm.dk.ws.imsservice.SContact();
				contact.setContactType((short) acctContactValues[i].getContactType());
				contact.setOuterAcctId(String.valueOf(acctId));
				contact.setOuterCustId(String.valueOf(custId));
				contact.setContactName(acctContactValues[i].getContactName());
				contact.setEmail(acctContactValues[i].getEmail());
				contact.setMobilePhone(acctContactValues[i].getMobilePhone());
				contact.setAddress(acctContactValues[i].getAddressDetail());
				contact.setContactId(acctContactValues[i].getContactId());
				if (StringUtils.isNotBlank(acctContactValues[i].getAddressId())) {
					long addressId = Long.parseLong(acctContactValues[i].getAddressId().trim());
					contact.setAddressId(addressId);
				}
				if (StringUtils.isNotBlank(acctContactValues[i].getEffectiveWay())) {
					contact.setEffectiveWay(Boolean.parseBoolean(acctContactValues[i].getEffectiveWay()));
				}
				contactList.add(contact);
			}
			SContactOper contactOper = new SContactOper();
			contactOper.setContactList((com.asiainfo.crm.cm.dk.ws.imsservice.SContact[]) contactList.toArray(new com.asiainfo.crm.cm.dk.ws.imsservice.SContact[0]));
			if (acctContactValues[0].isNew()) {
				operType = 0;
			} else if (acctContactValues[0].isModified()) {
				operType = 2;
			} else if (acctContactValues[0].isDeleted()) {
				operType = 1;
			}
			contactOper.setOperType(operType);
			// ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
			// commonSV.saveCommonBusiLog(CmConstants.BusiLogId.BILLING_ACCT_OPER, acctContactValues,
			// CmConstants.BusiLogType.ACCOUNT_LOG, acctId);
			ImsServiceClient.getInstance().DoModifyAccountBasicInfo(null, new SContactOper[] { contactOper });
		}

	}

	public String queryAcctFormatType(long acctId) throws Exception {
		// ICmLnAccountSV acctAccountSV = (ICmLnAccountSV) ServiceFactory.getService(ICmLnAccountSV.class);
		// ICrmFSV crmFSV = (ICrmFSV) ServiceFactory.getService(ICrmFSV.class);
		// ICrmProductSV prodSV = (ICrmProductSV) ServiceFactory.getService(ICrmProductSV.class);
		// IBOCmInsAccrelValue[] accrelValues = acctAccountSV.getInsAccrelsByAcct(acctId, -1, -1, -1);
		// if (accrelValues != null && accrelValues.length > 0) {
		// long userId = -1;
		// Map result = new HashMap();
		// for (int i = 0; i < accrelValues.length; i++) {
		// userId = accrelValues[i].getUserId();
		// CenterFactory.setCenterInfoByTypeAndValue(CenterConst.USER_ID, String.valueOf(userId));
		// IInsOfferValue[] offerValues = crmFSV.getInsOfferByUserId(userId,
		// SoServiceFactory.getOmConstSV().getOfferTypeOfferPlan(), OrderConst.VALID_TYPE_NOW);
		// if (offerValues != null && offerValues.length > 0) {
		// // 主套餐只有一个
		// IOfferValue offValue = prodSV.getOfferByOfferId(offerValues[0].getOfferId());
		// if (offValue != null) {
		// int userType = Integer.parseInt(offValue.getPayType());
		// if (userType == 2) {
		// return CmDkConstants.UserPayType.MIXED;
		// } else if (userType == 0) {
		// result.put(CmDkConstants.UserPayType.POSTPAY, CmDkConstants.UserPayType.POSTPAY);
		// } else if (userType == 1) {
		// result.put(CmDkConstants.UserPayType.PREPAY, CmDkConstants.UserPayType.PREPAY);
		// }
		// }
		// }
		// }
		// if (result.size() == 2) {
		// return CmDkConstants.UserPayType.MIXED;
		// } else if (result.containsKey(CmDkConstants.UserPayType.POSTPAY)) {
		// return result.get(CmDkConstants.UserPayType.POSTPAY).toString();
		// } else if (result.containsKey(CmDkConstants.UserPayType.PREPAY)) {
		// return result.get(CmDkConstants.UserPayType.PREPAY).toString();
		// }
		// }
		// 默认设置为后付费账单格式
		return CmDkConstants.UserPayType.POSTPAY;
	}

	public IBOBsStaticDataValue[] queryBillFormatEnum(int custType, int billingType, int paymentMethod, int mailCode, int isPrimary, long acctId) throws Exception {
		QueryBillDetailResponse response = ImsQueryServiceClient.getInstance().DoQueryBillDetail(custType, billingType, paymentMethod, mailCode, isPrimary, acctId);
		if (response != null) {
			CodeValue[] billFormats = response.getBillformat();
			CodeValue[] paymentMethods = response.getPaymentMethod();
			CodeValue[] mailCodes = response.getMailCode();
			List result = new ArrayList();
			IBOBsStaticDataValue staticDataValue = null;
			if (isPrimary > 0) {
				// 主要账单
				if (paymentMethod < 0 && mailCode < 0) {
					for (int i = 0; i < paymentMethods.length; i++) {
						staticDataValue = new BOBsStaticDataBean();
						staticDataValue.setCodeValue(String.valueOf(paymentMethods[i].getValue()));
						staticDataValue.setCodeName(paymentMethods[i].getName());
						result.add(staticDataValue);
					}
				} else if (paymentMethod > 0 && mailCode < 0) {
					for (int i = 0; i < mailCodes.length; i++) {
						int mailCodeValue = mailCodes[i].getValue();
						// B2C客户PaymentType为Cash且有权限，展示Email Delivery Method
						if (mailCodeValue == 2) {
							if (custType == 1 && paymentMethod == 2) {
								if (CmCommonUtil.judgeShowEmailSec()) {
									staticDataValue = new BOBsStaticDataBean();
									staticDataValue.setCodeValue(String.valueOf(mailCodeValue));
									staticDataValue.setCodeName(mailCodes[i].getName());
									result.add(staticDataValue);
								}
							} else {
								staticDataValue = new BOBsStaticDataBean();
								staticDataValue.setCodeValue(String.valueOf(mailCodeValue));
								staticDataValue.setCodeName(mailCodes[i].getName());
								result.add(staticDataValue);
							}
						} else {
							staticDataValue = new BOBsStaticDataBean();
							staticDataValue.setCodeValue(String.valueOf(mailCodeValue));
							staticDataValue.setCodeName(mailCodes[i].getName());
							result.add(staticDataValue);
						}
					}
				} else if (paymentMethod > 0 && mailCode > 0) {
					for (int i = 0; i < billFormats.length; i++) {
						staticDataValue = new BOBsStaticDataBean();
						staticDataValue.setCodeValue(String.valueOf(billFormats[i].getValue()));
						staticDataValue.setCodeName(billFormats[i].getName());
						result.add(staticDataValue);
					}
				}
			} else {
				// 次要不关联支付方式刷新
				if (mailCode < 0) {
					for (int i = 0; i < mailCodes.length; i++) {
						staticDataValue = new BOBsStaticDataBean();
						staticDataValue.setCodeValue(String.valueOf(mailCodes[i].getValue()));
						staticDataValue.setCodeName(mailCodes[i].getName());
						result.add(staticDataValue);
					}
				} else {
					for (int i = 0; i < billFormats.length; i++) {
						staticDataValue = new BOBsStaticDataBean();
						staticDataValue.setCodeValue(String.valueOf(billFormats[i].getValue()));
						staticDataValue.setCodeName(billFormats[i].getName());
						result.add(staticDataValue);
					}
				}
			}
			if (!result.isEmpty()) {
				return (IBOBsStaticDataValue[]) result.toArray(new IBOBsStaticDataValue[0]);
			}
		}
		return new IBOBsStaticDataValue[0];
	}

	public IBOCmAcctBillFormatValue[] queryAcctBillFormats(long acctId) throws Exception {
		DoQueryResponse response = getWrapQueryServiceClient().getAcctInfo(acctId);
		if (response != null) {
			SAccount account = response.getAccount();
			if (account != null) {
				SCustomInv[] billFormats = account.getCustInvList();
				if (billFormats != null && billFormats.length > 0) {
					List result = new ArrayList();
					IBOCmAcctBillFormatValue billFormatValue = null;
					for (int i = 0; i < billFormats.length; i++) {
						billFormatValue = new BOCmAcctBillFormatBean();
						billFormatValue.setBillFormat(billFormats[i].getBillFormatId() != null ? String.valueOf(billFormats[i].getBillFormatId()) : "");
						billFormatValue.setDeliveryMethod(billFormats[i].getMailCode() != null ? billFormats[i].getMailCode().intValue() : 0);
						if (billFormats[i].getPrintBill() != null) {
							billFormatValue.setPrintBill(billFormats[i].getPrintBill());
						}
						if (billFormats[i].getLanguageId() != null) {
							billFormatValue.setLanguage(billFormats[i].getLanguageId());
						}
						billFormatValue.setSidePrinting(billFormats[i].getPrintSide() != null ? String.valueOf(billFormats[i].getPrintSide()) : "");
						billFormatValue.setDueDays(billFormats[i].getDueDay() != null ? String.valueOf(billFormats[i].getDueDay()) : "");
						billFormatValue.setEan(billFormats[i].getEan());
						billFormatValue.setEanQualificator(billFormats[i].getEanQualificator() != null ? String.valueOf(billFormats[i].getEanQualificator()) : "");
						billFormatValue.setOioCotactName(billFormats[i].getOioContactName());
						billFormatValue.setOioOrderCode(billFormats[i].getOioOrderCode());
						billFormatValue.setOioAccountCode(billFormats[i].getOioAccountCode());
						billFormatValue.setOioUblProfile(billFormats[i].getOioUblProfile());
						billFormatValue.setOioUtsProfile(billFormats[i].getOioUtsProfile());
						if (billFormats[i].getBillingType() != null) {
							billFormatValue.setBillingType(billFormats[i].getBillingType());
						}
						result.add(billFormatValue);
					}
					if (!result.isEmpty()) {
						return (IBOCmAcctBillFormatValue[]) result.toArray(new IBOCmAcctBillFormatValue[0]);
					}
				}
			}
		}
		return new IBOCmAcctBillFormatValue[0];
	}

	public IBOCmPayChannelValue[] queryBankCard(long acctId, int start, int end) throws Exception {
		DoQueryResponse response = getWrapQueryServiceClient().getAcctInfo(acctId);
		if (response != null) {
			SAccount account = response.getAccount();
			if (account != null) {
				BankDebitInfo[] bankDebitInfos = account.getPanHashList();
				if (bankDebitInfos != null && bankDebitInfos.length > 0) {
					List result = new ArrayList();
					IBOCmPayChannelValue payChannelValue = null;
					for (int i = 0; i < bankDebitInfos.length; i++) {
						payChannelValue = new BOCmPayChannelBean();
						if (bankDebitInfos[i].getBankId() != null) {
							payChannelValue.setBankId(bankDebitInfos[i].getBankId());
						}
						if (bankDebitInfos[i].getCardType() != null) {
							payChannelValue.setCardType(bankDebitInfos[i].getCardType());
						}
						payChannelValue.setCardId(bankDebitInfos[i].getCardId());
						if (null != bankDebitInfos[i].getNumberType()) {
							if (bankDebitInfos[i].getNumberType() == CmConstants.billingNumberType.BILL_CVR) {
								payChannelValue.setCvr(bankDebitInfos[i].getCvr());
							} else if (bankDebitInfos[i].getNumberType() == CmConstants.billingNumberType.BILL_CPR) {
								payChannelValue.setCpr(bankDebitInfos[i].getCvr());
							}
						}
						payChannelValue.setChId(bankDebitInfos[i].getAuthId());
						payChannelValue.setCardTypeName(bankDebitInfos[i].getCardTypeName());
						payChannelValue.setCardExpiryDate(bankDebitInfos[i].getExpireDate());
						result.add(payChannelValue);
					}
					if (!result.isEmpty()) {
						return (IBOCmPayChannelValue[]) result.toArray(new IBOCmPayChannelValue[0]);
					}

				}
			}
		}
		return new IBOCmPayChannelValue[0];
	}

	public int queryBankCardCount(long acctId) throws Exception {
		return queryBankCard(acctId, -1, -1).length;
	}

	public String getBillFormatFee(long billFormat, long deliveryMethod, int copyBillCount) throws Exception {
		DoQueryProductBillAttrResponse response = getQueryServiceClient().DoQueryProductBillAttr(billFormat, deliveryMethod, copyBillCount);
		String fee = "";
		if (response != null) {
			SProductRecurringFee[] fees = response.getFeeList();
			if (fees != null && fees.length > 0) {
				fee = fees[0].getBaseVal() + fees[0].getMeasureName();
			}
		}
		return fee;
	}

	public String getTransactionId(String url) throws Exception {
		NetaxeptComponentServiceClient client = new NetaxeptComponentServiceClient();
		String id = client.registerNetaxept(url);
		return id;
	}

	public Map queryNetsCard(String transactionId) throws Exception {
		NetaxeptComponentServiceClient client = new NetaxeptComponentServiceClient();
		return client.queryNetaxept(transactionId);
	}

	public IBOCmBillFormatDtlValue queryBillFormatDtl(long acctId, long dtlNo) throws Exception {
		DoQueryResponse response = getWrapQueryServiceClient().getBillFormatDtl(acctId, dtlNo);
		if (response != null) {
			SAccount account = response.getAccount();
			if (account != null) {
				SCustomInv[] billFormats = account.getCustInvList();
				if (billFormats != null && billFormats.length > 0) {
					// 查询单条账单模板详细信息，只会返回一条记录
					SCustomInvDtl billFormatDtl = billFormats[0].getCacustomInvDtl(0);
					if (billFormatDtl != null) {
						IBOCmBillFormatDtlValue billFormatDtlValue = new BOCmBillFormatDtlBean();
						billFormatDtlValue.setAcctId(acctId);
						billFormatDtlValue.setDtlNo(dtlNo);
						if (billFormatDtl.getIsCharge() != null) {
							billFormatDtlValue.setIsCharge(billFormatDtl.getIsCharge());
						}
						if (billFormatDtl.getIsPrimary() != null) {
							billFormatDtlValue.setIsPrimary(billFormatDtl.getIsPrimary());
						}
						if (billFormatDtl.getBillingType() != null) {
							billFormatDtlValue.setBillingType(billFormatDtl.getBillingType());
						}
						if (billFormatDtl.getMailCode() != null) {
							billFormatDtlValue.setMailCode(billFormatDtl.getMailCode());
						}
						if (billFormatDtl.getBillFormatId() != null) {
							billFormatDtlValue.setBillFormatId(billFormatDtl.getBillFormatId());
						}
						if (billFormatDtl.getAddressId() != null) {
							billFormatDtlValue.setAddressId(billFormatDtl.getAddressId());
						}
						if (StringUtils.isNotBlank(billFormatDtl.getAddressDesc())) {
							billFormatDtlValue.setAddressDesc(billFormatDtl.getAddressDesc());
						}
						if (StringUtils.isNotBlank(billFormatDtl.getEmailAddress())) {
							billFormatDtlValue.setEmail(billFormatDtl.getEmailAddress());
						}
						if (StringUtils.isNotBlank(billFormatDtl.getAttInvoice())) {
							billFormatDtlValue.setAttInvoice(billFormatDtl.getAttInvoice());
						}
						if (billFormatDtl.getSendAccessory()!= null) {
							billFormatDtlValue.setSendPdf(billFormatDtl.getSendAccessory());
						}
						return billFormatDtlValue;
					}
				}
			}
		}
		return null;
	}

	public IBOCmBillFormatDtlValue[] queryBillformats(long acctId, int billingType, int start, int end) throws Exception {
		DoQueryResponse response = getWrapQueryServiceClient().getAcctInfo(acctId);
		if (response != null) {
			// 获取客户id
			SCustomer customer = response.getCustomer();
			long custId = -1;
			int custType = -1;
			if (customer != null) {
				custId = StringUtils.isBlank(customer.getOuterCustId()) ? -1 : Long.parseLong(customer.getOuterCustId());
			}
			if (custId > 0) {
				custType = CmCommonUtil.getCustType(custId);
				if (custType == CmConstants.CustomerType.GROUP) {
					custType = custType - 1;
				}
			}

			SAccount account = response.getAccount();
			if (account != null) {
				SCustomInv[] billFormats = account.getCustInvList();
				if (billFormats != null && billFormats.length > 0) {
					SCustomInvDtl[] billFormatList = null;
					for (int i = 0; i < billFormats.length; i++) {
						if (billingType == billFormats[i].getBillingType()) {
							billFormatList = billFormats[i].getCacustomInvDtl();
						}
						break;
					}
					if (billFormatList != null && billFormatList.length > 0) {
						IBOCmBillFormatDtlValue billFormatDtlValue = null;
						List result = new ArrayList();
						for (int i = 0; i < billFormatList.length; i++) {
							billFormatDtlValue = new BOCmBillFormatDtlBean();
							// 封装账单模板列表
							billFormatDtlValue.setAcctId(acctId);
							billFormatDtlValue.setCustType(custType);
							if (billFormatList[i].getDtlNo() != null) {
								billFormatDtlValue.setDtlNo(billFormatList[i].getDtlNo());
							}
							if (billFormatList[i].getIsCharge() != null) {
								billFormatDtlValue.setIsCharge(billFormatList[i].getIsCharge());
							}
							if (billFormatList[i].getIsPrimary() != null) {
								billFormatDtlValue.setIsPrimary(billFormatList[i].getIsPrimary());
							}
							if (billFormatList[i].getBillingType() != null) {
								billFormatDtlValue.setBillingType(billFormatList[i].getBillingType());
							}
							//展示具体的值
							IBOBsStaticDataValue[] bsStaticDataValues = queryBillFormatEnum(custType,billFormatList[i].getBillingType(),-1,-1,-1,acctId);
							if (billFormatList[i].getMailCode() != null) {
								billFormatDtlValue.setMailCode(billFormatList[i].getMailCode());
								billFormatDtlValue.setMailName(queryNameInArray(bsStaticDataValues,billFormatList[i].getMailCode()));
							}
							IBOBsStaticDataValue[] billFormatDtlValues = queryBillFormatEnum(custType,billFormatList[i].getBillingType(),-1, billFormatList[i].getMailCode().intValue(),-1,acctId);
							if (billFormatList[i].getBillFormatId() != null) {
								billFormatDtlValue.setBillFormatId(billFormatList[i].getBillFormatId());
								billFormatDtlValue.setBillFormatName(queryNameInArray(billFormatDtlValues,billFormatList[i].getBillFormatId()));
							}
							if (billFormatList[i].getAddressId() != null) {
								billFormatDtlValue.setAddressId(billFormatList[i].getAddressId());
							}
							if (StringUtils.isNotBlank(billFormatList[i].getAddressDesc())) {
								billFormatDtlValue.setAddressDesc(billFormatList[i].getAddressDesc());
							}
							if (StringUtils.isNotBlank(billFormatList[i].getEmailAddress())) {
								billFormatDtlValue.setEmail(billFormatList[i].getEmailAddress());
							}
							if (StringUtils.isNotBlank(billFormatList[i].getAttInvoice())) {
								billFormatDtlValue.setAttInvoice(billFormatList[i].getAttInvoice());
							}
							if (billFormatList[i].getSendAccessory() != null) {
								billFormatDtlValue.setSendPdf(billFormatList[i].getSendAccessory());
							}
							String editor = "<a href='javascript:void(0)' class='cellpath' onclick='modifyBillFormatDtl(" + String.valueOf(billFormatList[i].getDtlNo()) + ","
									+ billingType + ")' style='color:blue;margin-left:5px;text-decoration:underline'>" + CrmLocaleFactory.getResource("CMS0013081") + "</a>";
							String delete = "<a href='javascript:void(0)' class='cellpath' onclick='deleteBillFormatDtl(" + String.valueOf(billFormatList[i].getDtlNo()) + ","
									+ billingType + ")' style='color:blue;margin-left:5px;text-decoration:underline'>" + CrmLocaleFactory.getResource("CMS0000079") + "</a>";
							billFormatDtlValue.setAction(editor + delete);
							result.add(billFormatDtlValue);
						}
						if (!result.isEmpty()) {
							return (IBOCmBillFormatDtlValue[]) result.toArray(new IBOCmBillFormatDtlValue[0]);
						}
					}
				}
			}
		}
		return new IBOCmBillFormatDtlValue[0];
	}
	
	public String queryNameInArray(IBOBsStaticDataValue[] bsStaticDataValues ,long valuekey) {
		String codeName = null;
		for (int i = 0; i < bsStaticDataValues.length; i++) {
			IBOBsStaticDataValue boStaticDataValue = bsStaticDataValues[i];
			if(boStaticDataValue.getCodeValue().equals(String.valueOf(valuekey))) {
				codeName = boStaticDataValue.getCodeName();
				break;
			}
		}
		return codeName;
	}

	public int queryBillformatsCount(long acctId, int billingType) throws Exception {
		return queryBillformats(acctId, billingType, -1, -1).length;
	}

	public void saveBillFormatDtl(IBOCmBillFormatDtlValue billFormatDtlValue) throws Exception {
		com.asiainfo.crm.cm.dk.ws.imsservice.SAccount account = new com.asiainfo.crm.cm.dk.ws.imsservice.SAccount();
		account.setOuterAcctId(String.valueOf(billFormatDtlValue.getAcctId()));
		// 封装账单模板详细对象
		SChangeCustomInvReq changeCustomInvReq = new SChangeCustomInvReq();
		changeCustomInvReq.setAcctId(billFormatDtlValue.getAcctId());
		changeCustomInvReq.setBillingType(billFormatDtlValue.getBillingType());
		com.asiainfo.crm.cm.dk.ws.imsservice.SCustomInvDtl sCustomInvDtl = new com.asiainfo.crm.cm.dk.ws.imsservice.SCustomInvDtl();
		long dtlNo = billFormatDtlValue.getDtlNo();
		sCustomInvDtl.setAcctId(billFormatDtlValue.getAcctId());
		sCustomInvDtl.setIsCharge(billFormatDtlValue.getIsCharge());
		sCustomInvDtl.setIsPrimary(billFormatDtlValue.getIsPrimary());// 次要
		sCustomInvDtl.setBillingType(billFormatDtlValue.getBillingType());
		sCustomInvDtl.setMailCode(billFormatDtlValue.getMailCode());
		sCustomInvDtl.setBillFormatId(billFormatDtlValue.getBillFormatId());
		sCustomInvDtl.setValidType(billFormatDtlValue.getValidType());
		sCustomInvDtl.setEmailAddress(billFormatDtlValue.getEmail());
		sCustomInvDtl.setAttInvoice(billFormatDtlValue.getAttInvoice());
		//B2C客户不设值
		ICmAccountSV acctSV = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
		IBOCmCustAcctRelValue[] accountRelValue = acctSV.queryCustAcctRel(-1, billFormatDtlValue.getAcctId(), null, -1, -1, -1, null, -1, -1, null);
		IBOCmPayChannelValue payChannel =  this.queryAcctPayChannel(billFormatDtlValue.getAcctId());
		// CR6 寄送方式为Email时才设值，  B2C不设值，   creidt card不设值， 终端账户不设值
		if(accountRelValue[0].getInstallmentFlag() != 3 && accountRelValue[0].getCustType() == 3 
				&& payChannel.getPaymentType() != 12 && billFormatDtlValue.getMailCode() == 2){
			sCustomInvDtl.setSendAccessory(billFormatDtlValue.getSendPdf());
		} 
		
		if (billFormatDtlValue.getAddressId() > 0) {
			sCustomInvDtl.setAddressId(billFormatDtlValue.getAddressId());
		}
		sCustomInvDtl.setAddressDesc(billFormatDtlValue.getAddressDesc());
		if (dtlNo > 0) {
			sCustomInvDtl.setDtlNo(dtlNo);
		}
		int operType = -1;
		if (billFormatDtlValue.isNew()) {
			operType = 0;
		} else if (billFormatDtlValue.isModified()) {
			operType = 2;
		} else if (billFormatDtlValue.isDeleted()) {
			operType = 1;
		}
		sCustomInvDtl.setOperType(operType);
		// 设置账单模板详细对象
		changeCustomInvReq.setCacustomInvDtl(new com.asiainfo.crm.cm.dk.ws.imsservice.SCustomInvDtl[] { sCustomInvDtl });
		// 设置账户账单模板对象
		account.setChangeInvList(new SChangeCustomInvReq[] { changeCustomInvReq });
		ImsServiceClient.getInstance().DoModifyAccountBasicInfo(account, null);
	}

	public IBOCmAcctContactValue queryBillAddress(long acctId) throws Exception {
		IBOCmAcctContactValue contactValue = null;
		DoQueryResponse response = getWrapQueryServiceClient().getAcctInfo(acctId);
		SContact[] contactList = response.getSContactList();
		if (contactList != null && contactList.length > 0) {
			for (int i = 0; i < contactList.length; i++) {
				if (contactList[i].getContactType() == 5) {// 账单地址
					contactValue = new BOCmAcctContactBean();
					contactValue.setContactId(contactList[i].getContactId());
					contactValue.setContactName(contactList[i].getContactName());
					contactValue.setContactType(contactList[i].getContactType());
					contactValue.setAddressDetail(contactList[i].getAddrDesc());
					contactValue.setEmail(contactList[i].getEmail());
					contactValue.setMobilePhone(contactList[i].getMobilePhone());
					if (StringUtils.isNotBlank(contactList[i].getEffectiveDate())) {
						contactValue.setEffectiveDate(TimeUtil.getTimstampByString(contactList[i].getEffectiveDate(), TimeUtil.YYYY_MM_DD_HH_MM_SS));
					}
					contactValue.setEffectiveWay(contactList[i].getEffectiveWay() != null ? contactList[i].getEffectiveWay().toString() : "");
					break;
				}

			}
		}
		return contactValue;
	}

	private boolean checkBankCodeAndNumber(String bankAcctNumber,String bankNumber) throws ServiceException, Exception{
		NetsService_ServiceLocator locator = new NetsService_ServiceLocator();
        CheckBankAccountRequest request = new CheckBankAccountRequest();
        CheckBankAccountRequestBody body = new CheckBankAccountRequestBody();
        body.setBankAcctNumber(bankAcctNumber);
        body.setBankNumber(bankNumber);
        request.setRequestBody(body);
        Map map = locator.getNetsService().checkBankAccount(request);
        CheckBankAccountResponse response = (CheckBankAccountResponse) map.get("Response");
        return response.getResponseBody().isResult();
	}
}
