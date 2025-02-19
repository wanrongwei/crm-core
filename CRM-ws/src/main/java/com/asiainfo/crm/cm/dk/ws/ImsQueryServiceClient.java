/**
 * Copyright (C) 2013 Asiainfo-Linkage
 * 
 * 
 * @className:com.asiainfo.crm.so.exe.ws.crmcallams.ImsWrapServiceClient
 * @description:账管业务办理
 * 
 * @version:v1.0.0
 * @author:cxy22xueyi
 * 
 *                    Modification History:
 *                    Date Author Version Description
 *                    -----------------------------------------------------------------
 *                    2013-10-28 cxy22xueyi v1.0.0 账管业务办理
 * 
 * 
 */
package com.asiainfo.crm.cm.dk.ws;

import java.net.URL;
import java.rmi.RemoteException;
import java.util.Date;

import javax.xml.rpc.ServiceException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.common.ServiceManager;
import com.ai.common.util.TimeUtil;
import com.asiainfo.appframe.ext.exeframe.ws.client.WsUtil;
import com.asiainfo.crm.cm.dk.common.CmDkConstants;
import com.asiainfo.crm.cm.dk.ivalues.IBOCmPayChannelValue;
import com.asiainfo.crm.cm.dk.ws.imsqueryservice.BankDebitInfo;
import com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryBillDetailReq;
import com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryDDFeeResponse;
import com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryProductBillAttrResponse;
import com.asiainfo.crm.cm.dk.ws.imsqueryservice.IImsQueryServiceWs;
import com.asiainfo.crm.cm.dk.ws.imsqueryservice.IImsQueryService_ServiceLocator;
import com.asiainfo.crm.cm.dk.ws.imsqueryservice.QueryBillDetailResponse;
import com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead;
import com.asiainfo.crm.cm.dk.ws.imsqueryservice.SQueryDDFeeReq;
import com.asiainfo.crm.cm.dk.ws.imsqueryservice.SQueryProductBillAttrReq;
import com.asiainfo.crm.so.exe.ws.crmcallams.CrmCallAmsWsConstants;

public class ImsQueryServiceClient {

	/**
	 * cfg_ws_client表中配置	
	 */
	private static final String CFG_WS_CLIENT_CODE = "IMS_QUERY_SERVICE";

	private static ImsQueryServiceClient client = null;

	private static transient Log log = LogFactory.getLog(ImsQueryServiceClient.class);

	public static ImsQueryServiceClient getInstance() throws Exception {
		synchronized (ImsQueryServiceClient.class) {
			if (null == client)
				client = new ImsQueryServiceClient();
		}
		return client;
	}

	private IImsQueryService_ServiceLocator service = null;

	private ImsQueryServiceClient() {
		super();
		service = new IImsQueryService_ServiceLocator();
	}

	public IImsQueryService_ServiceLocator getService() {
		return service;
	}

	private RequestHead buildRequestHead(String busiCode) throws RemoteException, Exception {
		RequestHead requestHead = new RequestHead();
		requestHead.setAppKey("CM101");
		requestHead.setBusiCode(busiCode);
		String transactionID = CrmCallAmsWsConstants.SYSTEM_ID + TimeUtil.getYYYYMMDD(new Date()) + ServiceManager.getIdGenerator().getNewId("CM_BILLING_INTERFACE").toString();
		requestHead.setTransactionID(transactionID);
		String reqTime = TimeUtil.getYYYYMMDDHHMMSS(new Date());
		requestHead.setReqTime(reqTime);
		requestHead.setTenantId(CrmCallAmsWsConstants.getTenantId());
		requestHead.setAcceptChannelCode("01");
		requestHead.setChargeFlag("0");
		requestHead.setNotifyFlag("0");
		requestHead.setAcceptOpId(String.valueOf(ServiceManager.getUser().getID()));
		requestHead.setAcceptStaffId(String.valueOf(ServiceManager.getUser().getID()));
		return requestHead;
	}

	// 获取服务
	public IImsQueryServiceWs getImsQueryService() throws ServiceException, Exception {
		URL portAddress = WsUtil.getUrlAddress(CFG_WS_CLIENT_CODE);
		if (log.isInfoEnabled()) {
			log.info(new StringBuffer().append(portAddress.getHost()).append(":").append(portAddress.getPort()));
		}
		IImsQueryServiceWs imsQueryService = getService().getIImsQueryService(portAddress);
		return imsQueryService;
	}

	public DoQueryDDFeeResponse doQueryDDFee(IBOCmPayChannelValue payChannelValue) throws RemoteException, Exception {
		RequestHead requestHead = buildRequestHead(CmDkConstants.BillingBusiCode.QUERY_ACCT_FEE);
		SQueryDDFeeReq queryDDFeeReq = new SQueryDDFeeReq();
		if (payChannelValue != null) {
			queryDDFeeReq.setPaymentType(payChannelValue.getPaymentType());
			BankDebitInfo bankDebitInfo = new BankDebitInfo();
			bankDebitInfo.setBankId(payChannelValue.getBankId());
			bankDebitInfo.setCardType(payChannelValue.getCardType());
			bankDebitInfo.setCardTypeName(payChannelValue.getCardTypeName());
			bankDebitInfo.setCardId(payChannelValue.getCardId());
			bankDebitInfo.setCvr(payChannelValue.getCvr());
			bankDebitInfo.setAuthId(payChannelValue.getChId());
			bankDebitInfo.setExpireDate(payChannelValue.getExpiryDate().toString());
			queryDDFeeReq.setSBankDebitInfo(bankDebitInfo);
		}
		DoQueryDDFeeResponse response = getImsQueryService().doQueryDDFee(requestHead, queryDDFeeReq);
		return response;
	}

	public QueryBillDetailResponse DoQueryBillDetail(int custType, int billingType, int paymentMethod, int mailCode, int isPrimary, long acctId) throws Exception, RemoteException {
		RequestHead requestHead = buildRequestHead(CmDkConstants.BillingBusiCode.ACCT_FORMAT_ENUM);
		DoQueryBillDetailReq billDetailReq = new DoQueryBillDetailReq();
		billDetailReq.setCustClass(custType);
		billDetailReq.setBillingType((short) billingType);
		billDetailReq.setIsDefault((short) -1);
		billDetailReq.setPaymentMethod((short) paymentMethod);
		billDetailReq.setMailCode((short) mailCode);
		billDetailReq.setIsPrimary((short) isPrimary);
		billDetailReq.setAcctId(acctId);
		QueryBillDetailResponse response = getImsQueryService().doQueryBillDetail(requestHead, billDetailReq);
		return response;
	}

	public DoQueryProductBillAttrResponse DoQueryProductBillAttr(long billFormat, long deliveryMethod, int copyBillCount) throws Exception, RemoteException {
		RequestHead requestHead = buildRequestHead(CmDkConstants.BillingBusiCode.QUERY_BILL_FORMAT_FEE);
		SQueryProductBillAttrReq req = new SQueryProductBillAttrReq();
		req.setBillFormatId((int) billFormat);
		req.setCopyBillAddressCount(copyBillCount);
		req.setMailCode(deliveryMethod);
		DoQueryProductBillAttrResponse response = getImsQueryService().doQueryProductBillAttr(requestHead, req);
		return response;
	}
}
