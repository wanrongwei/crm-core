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
import com.ai.common.util.ExceptionUtil;
import com.ai.common.util.TimeUtil;
import com.asiainfo.appframe.ext.exeframe.ws.client.WsUtil;
import com.asiainfo.crm.cm.dk.common.CmDkConstants;
import com.asiainfo.crm.cm.dk.ws.imsservice.DoModifyAccountBasicInfoResponse;
import com.asiainfo.crm.cm.dk.ws.imsservice.IImsServiceRemoteLocator;
import com.asiainfo.crm.cm.dk.ws.imsservice.IImsServiceWs;
import com.asiainfo.crm.cm.dk.ws.imsservice.RequestHead;
import com.asiainfo.crm.cm.dk.ws.imsservice.SAccount;
import com.asiainfo.crm.cm.dk.ws.imsservice.SContactOper;
import com.asiainfo.crm.so.exe.ws.crmcallams.CrmCallAmsWsConstants;

public class ImsServiceClient {

	/**
	 * cfg_ws_client表中配置	
	 */
	private static final String CFG_WS_CLIENT_CODE = "IMS_SERVICE";

	private static ImsServiceClient client = null;

	private static transient Log log = LogFactory.getLog(ImsServiceClient.class);

	public static ImsServiceClient getInstance() throws Exception {
		synchronized (ImsServiceClient.class) {
			if (null == client)
				client = new ImsServiceClient();
		}
		return client;
	}

	private IImsServiceRemoteLocator service = null;

	private ImsServiceClient() {
		super();
		service = new IImsServiceRemoteLocator();
	}

	public IImsServiceRemoteLocator getService() {
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
		requestHead.setNotifyFlag("1");
		requestHead.setAcceptOpId(String.valueOf(ServiceManager.getUser().getID()));
		requestHead.setAcceptStaffId(String.valueOf(ServiceManager.getUser().getID()));
		return requestHead;
	}

	// 获取服务
	public IImsServiceWs getImsService() throws ServiceException, Exception {
		URL portAddress = WsUtil.getUrlAddress(CFG_WS_CLIENT_CODE);
		if (log.isInfoEnabled()) {
			log.error(new StringBuffer().append(portAddress.getHost()).append(":").append(portAddress.getPort()));
		}
		IImsServiceWs imsService = getService().getIImsService(portAddress);
		return imsService;
	}

	public void DoModifyAccountBasicInfo(SAccount account, SContactOper[] contactOpers) throws ServiceException, Exception {
		RequestHead requestHead = buildRequestHead(CmDkConstants.BillingBusiCode.UPDATE_ACCT_INFO);
		DoModifyAccountBasicInfoResponse response = getImsService().doModifyAccountBasicInfo(requestHead, account, contactOpers);
		if (response != null) {
			int rspCode = Integer.parseInt(response.getResponseHead().getRspCode());
			if (rspCode != 0) {
				String rspDesc = response.getResponseHead().getRspDesc();
				ExceptionUtil.throwBusinessException(rspDesc);
			}
		}
	}

}
