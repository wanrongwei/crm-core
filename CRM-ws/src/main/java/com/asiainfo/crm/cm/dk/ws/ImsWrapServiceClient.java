package com.asiainfo.crm.cm.dk.ws;

import java.net.URL;
import java.rmi.RemoteException;
import java.util.Date;

import javax.xml.rpc.ServiceException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.util.TimeUtil;
import com.asiainfo.appframe.ext.exeframe.ws.client.WsUtil;
import com.asiainfo.crm.cm.common.service.interfaces.ICmCommonSV;
import com.asiainfo.crm.cm.dk.common.CmDkConstants;
import com.asiainfo.crm.cm.dk.ws.imswrapservice.IImsWrapServiceRemoteLocator;
import com.asiainfo.crm.cm.dk.ws.imswrapservice.IImsWrapServiceWs;
import com.asiainfo.crm.cm.dk.ws.imswrapservice.RequestHead;
import com.asiainfo.crm.cm.dk.ws.imswrapservice.SCreditLimitInReq;
import com.asiainfo.crm.so.exe.ws.crmcallams.CrmCallAmsWsConstants;

public class ImsWrapServiceClient {
	/**
	 * cfg_ws_client表中配置	
	 */
	private static final String CFG_WS_CLIENT_CODE = "IMS_WRAP_SERVICE";

	private static ImsWrapServiceClient client = null;

	private static transient Log log = LogFactory.getLog(ImsWrapServiceClient.class);

	public static ImsWrapServiceClient getInstance() throws Exception {
		synchronized (ImsWrapServiceClient.class) {
			if (null == client)
				client = new ImsWrapServiceClient();
		}
		return client;
	}
	private IImsWrapServiceRemoteLocator service = null;

	private ImsWrapServiceClient() {
		super();
		service = new IImsWrapServiceRemoteLocator();
	}

	public IImsWrapServiceRemoteLocator getService() {
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
	public IImsWrapServiceWs getImsWrapService() throws ServiceException, Exception {
		URL portAddress = WsUtil.getUrlAddress(CFG_WS_CLIENT_CODE);
		if (log.isInfoEnabled()) {
			log.info(new StringBuffer().append(portAddress.getHost()).append(":").append(portAddress.getPort()));
		}
		IImsWrapServiceWs imsWrapService = getService().getIImsWrapService(portAddress);
		return imsWrapService;
	}
	
	//重置账户信用度
	public void resetCreditLimit(long acctId)throws Exception{
		if(acctId>0){
			RequestHead requestHead=buildRequestHead(CmDkConstants.BillingBusiCode.RESET_CREDIT_LIMIT);
			SCreditLimitInReq limit=new SCreditLimitInReq();
			limit.setAcctId(acctId);
			//约定的信用值
			limit.setCredit(2000L);
			//约定的medureId
			limit.setMesureId(11403);
			getImsWrapService().doCreditLimit(requestHead, limit);
		}
	}
}
