/**
 * Copyright (C) 2013 Asiainfo-Linkage
 * 
 * 
 * @className:com.asiainfo.crm.so.exe.ws.crmcallams.ImsWrapQueryServiceClient
 * @description:账管查询接口
 * 
 * @version:v1.0.0
 * @author:cxy22xueyi
 * 
 *                    Modification History:
 *                    Date Author Version Description
 *                    -----------------------------------------------------------------
 *                    2013-10-28 cxy22xueyi v1.0.0 账管查询接口
 * 
 * 
 */
package com.asiainfo.crm.cm.dk.ws;

import java.net.URL;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.rpc.ServiceException;

import com.asiainfo.crm.util.CollectionUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.ai.common.util.StaticDataUtil;
import com.ai.common.util.TimeUtil;
import com.asiainfo.appframe.ext.exeframe.ws.client.WsUtil;
import com.asiainfo.crm.cm.common.service.interfaces.ICmCommonSV;
import com.asiainfo.crm.cm.dk.common.CmDkConstants;
import com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryResponse;
import com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryWorkLogResponse;
import com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.IImsWrapQueryServiceRemoteLocator;
import com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.IImsWrapQueryServiceWs;
import com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryType;
import com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryWorkLogReq;
import com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead;
import com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryParam;
import com.asiainfo.crm.so.exe.ws.crmcallams.CrmCallAmsWsConstants;

public class ImsWrapQueryServiceClient {

	/**
	 * cfg_ws_client表中配置	
	 */
	private static final String CFG_WS_CLIENT_CODE = "IMS_WRAP_QUERY";

	private static ImsWrapQueryServiceClient client = null;

	private static transient Log log = LogFactory.getLog(ImsWrapQueryServiceClient.class);

	public static ImsWrapQueryServiceClient getInstance() throws Exception {
		synchronized (ImsWrapQueryServiceClient.class) {
			if (null == client)
				client = new ImsWrapQueryServiceClient();
		}
		return client;
	}

	private IImsWrapQueryServiceRemoteLocator service = null;

	private ImsWrapQueryServiceClient() {
		super();
		service = new IImsWrapQueryServiceRemoteLocator();
	}

	public IImsWrapQueryServiceRemoteLocator getService() {
		return service;
	}

	private RequestHead buildRequestHead(String busiCode) throws RemoteException, Exception {
		RequestHead requestHead = new RequestHead();
		requestHead.setAppKey("CM101");
		requestHead.setBusiCode(busiCode);
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		String transactionID = CrmCallAmsWsConstants.SYSTEM_ID + TimeUtil.getYYYYMMDD(new Date()) + String.valueOf(commonSV.getCommonNewSequence("CM_BILLING_INTERFACE"));
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
	public IImsWrapQueryServiceWs getImsWrapQueryService() throws ServiceException, Exception {
		URL portAddress = WsUtil.getUrlAddress(CFG_WS_CLIENT_CODE);
		if (log.isInfoEnabled()) {
			log.info(new StringBuffer().append(portAddress.getHost()).append(":").append(portAddress.getPort()));
		}
		IImsWrapQueryServiceWs imsWrapQueryService = getService().getIImsWrapQueryService(portAddress);
		return imsWrapQueryService;
	}

	public DoQueryResponse getAcctInfo(long acctId) throws RemoteException, Exception {
		RequestHead requestHead = buildRequestHead(CmDkConstants.BillingBusiCode.QUERY_ACCT);
		QueryType queryType = new QueryType();
		queryType.setQueryType((short) 27);
		QueryType[] queryTypes = new QueryType[] { queryType };
		SQueryParam queryParam = new SQueryParam();
		queryParam.setOuterAcctId(String.valueOf(acctId));
		DoQueryResponse response = getImsWrapQueryService().doQuery(requestHead, queryTypes, queryParam);
		return response;
	}

	public DoQueryWorkLogResponse getAccountInfo(long acctId, short queryType) throws Exception {
		RequestHead requestHead = buildRequestHead(CmDkConstants.BillingBusiCode.QUERY_PAY_AND_ADJUST);
		QueryWorkLogReq qwlr = new QueryWorkLogReq();
		qwlr.setRechargeChannel((short) 1);
		// CRM侧账户ID
		qwlr.setOuterAcctId(String.valueOf(acctId));
		// 查询类型 QueryType=4查缴费记录，QueryType=1查充值记录,
		qwlr.setQueryType(queryType);
		IBOBsStaticDataValue[] values = StaticDataUtil.getStaticData("CM_VALIDATE_DATE");
		if (CollectionUtils.isNotEmptyObject(values)) {
			// 获取定义好的时间参数
			long value = Long.parseLong(values[0].getCodeValue());
			long nowTime = new Date().getTime();
			long timeBetween = value * 24 * 60 * 60 * 1000l;
			long time = nowTime - timeBetween;
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			qwlr.setStartDate(sdf.format(new Date(time)));
		}
		DoQueryWorkLogResponse response = getImsWrapQueryService().doQueryWorkLog(requestHead, qwlr);
		return response;
	}

	public DoQueryResponse getBillFormatDtl(long acctId, long dtlNo) throws RemoteException, Exception {
		RequestHead requestHead = buildRequestHead(CmDkConstants.BillingBusiCode.QUERY_ACCT);
		QueryType queryType = new QueryType();
		queryType.setQueryType((short) 27);
		QueryType[] queryTypes = new QueryType[] { queryType };
		SQueryParam queryParam = new SQueryParam();
		queryParam.setOuterAcctId(String.valueOf(acctId));
		queryParam.setDtlNo(dtlNo);
		DoQueryResponse response = getImsWrapQueryService().doQuery(requestHead, queryTypes, queryParam);
		return response;
	}

}
