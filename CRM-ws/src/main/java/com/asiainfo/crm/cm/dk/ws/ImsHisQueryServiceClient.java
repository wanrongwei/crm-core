package com.asiainfo.crm.cm.dk.ws;

import java.net.URL;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.rpc.ServiceException;

import com.asiainfo.crm.util.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.ai.common.util.StaticDataUtil;
import com.ai.common.util.TimeUtil;
import com.asiainfo.appframe.ext.exeframe.ws.client.WsUtil;
import com.asiainfo.crm.cm.common.service.interfaces.ICmCommonSV;
import com.asiainfo.crm.cm.dk.common.CmDkConstants;
import com.asiainfo.crm.cm.dk.ws.imshisqueryservice.DoQueryUnPayFeeResponse;
import com.asiainfo.crm.cm.dk.ws.imshisqueryservice.IImsHisQueryServiceWs;
import com.asiainfo.crm.cm.dk.ws.imshisqueryservice.IImsHisQueryService_ServiceLocator;
import com.asiainfo.crm.cm.dk.ws.imshisqueryservice.QueryUnPayFeeReq;
import com.asiainfo.crm.cm.dk.ws.imshisqueryservice.RequestHead;
import com.asiainfo.crm.so.exe.ws.crmcallams.CrmCallAmsWsConstants;

public class ImsHisQueryServiceClient {

	/**
	 * cfg_ws_client表中配置
	 */
	private static final String CFG_WS_CLIENT_CODE = "IMS_HIS_QUERY";

	private static ImsHisQueryServiceClient client = null;

	private static transient Log log = LogFactory.getLog(ImsHisQueryServiceClient.class);

	public static ImsHisQueryServiceClient getInstance() throws Exception {
		synchronized (ImsHisQueryServiceClient.class) {
			if (null == client)
				client = new ImsHisQueryServiceClient();
		}
		return client;
	}

	private IImsHisQueryService_ServiceLocator service = null;

	private ImsHisQueryServiceClient() {
		super();
		service = new IImsHisQueryService_ServiceLocator();
	}

	public IImsHisQueryService_ServiceLocator getService() {
		return service;
	}

	// 获取服务
	public IImsHisQueryServiceWs getImsHisQueryService() throws ServiceException, Exception {
		URL portAddress = WsUtil.getUrlAddress(CFG_WS_CLIENT_CODE);
		if (log.isInfoEnabled()) {
			log.info(new StringBuffer().append(portAddress.getHost()).append(":").append(portAddress.getPort()));
		}
		IImsHisQueryServiceWs imshisQueryService = getService().getIImsHisQueryService(portAddress);
		return imshisQueryService;
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

	public DoQueryUnPayFeeResponse queryUnPayFee(long acctId) throws Exception {
		RequestHead requestHead = buildRequestHead(CmDkConstants.BillingBusiCode.QUERY_UNPAY_ACCT);
		QueryUnPayFeeReq unPayFee = new QueryUnPayFeeReq();
		unPayFee.setOuterAcctId(String.valueOf(acctId));
		DoQueryUnPayFeeResponse response = getImsHisQueryService().doQueryUnPayFee(requestHead, unPayFee);
		return response;
	}

	public DoQueryUnPayFeeResponse queryAllUnPayFee(long acctId) throws Exception {
		RequestHead requestHead = buildRequestHead(CmDkConstants.BillingBusiCode.QUERY_UNPAY_ACCT);
		QueryUnPayFeeReq unPayFee = new QueryUnPayFeeReq();
		unPayFee.setOuterAcctId(String.valueOf(acctId));
		IBOBsStaticDataValue[] values = StaticDataUtil.getStaticData("CM_VALIDATE_DATE");
		if (CollectionUtils.isNotEmptyObject(values)) {
			// 获取定义好的时间参数
			long value = Long.parseLong(values[0].getCodeValue());
			long nowTime = new Date().getTime();
			long timeBetween = value * 24 * 60 * 60 * 1000l;
			long time = nowTime - timeBetween;
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			unPayFee.setStartMonth(sdf.format(new Date(time)));
			unPayFee.setEndMonth(sdf.format(new Date()));
		}
		DoQueryUnPayFeeResponse response = getImsHisQueryService().doQueryUnPayFee(requestHead, unPayFee);
		return response;
	}

	public DoQueryUnPayFeeResponse queryUnPayFee(long acctId,long userId, String startMon, String endMon) throws Exception {
		RequestHead requestHead = buildRequestHead(CmDkConstants.BillingBusiCode.QUERY_UNPAY_ACCT);
		QueryUnPayFeeReq unPayFee = new QueryUnPayFeeReq();
		unPayFee.setOuterAcctId(String.valueOf(acctId));
		if (0 != userId) {
			unPayFee.setResourceId(userId);
		}
		if (StringUtils.isNotBlank(startMon)) {
			unPayFee.setStartMonth(startMon);
		}
		if (StringUtils.isNotBlank(endMon)) {
			unPayFee.setEndMonth(endMon);
		}
		DoQueryUnPayFeeResponse response = getImsHisQueryService().doQueryUnPayFee(requestHead, unPayFee);
		return response;
	}
}
