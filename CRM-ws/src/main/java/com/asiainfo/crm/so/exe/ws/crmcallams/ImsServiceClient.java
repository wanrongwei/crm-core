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
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2013-10-28    cxy22xueyi     v1.0.0   账管业务办理
 *
 *
 */
package com.asiainfo.crm.so.exe.ws.crmcallams;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.rpc.ServiceException;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.asiainfo.appframe.ext.exeframe.ws.client.WsUtil;
import com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoLifeCycleMgntResponse;
import com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoSetExemptCreditLimitResponse;
import com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.IImsServiceWs;
import com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.IImsService_ServiceLocator;
import com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.OneTimeFee;
import com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead;
import com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SSetEmptLimitReq;
import com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SUserStatus;

public class ImsServiceClient {
	/**
	 * cfg_ws_client表中配置	
	 */
	private static final String CFG_WS_CLIENT_CODE = "IMS_SERVICE";
	
	private static ImsServiceClient client = null;
	
	private static transient Log log = LogFactory.getLog(ImsServiceClient.class);
		
	public static ImsServiceClient getInstance() throws Exception {
		if (null == client) {
			client = new ImsServiceClient();
		}
		return client;
	}
	
	private IImsService_ServiceLocator service = null;
	
	private ImsServiceClient() {
		super();
		service = new IImsService_ServiceLocator();
	}
	
	public IImsService_ServiceLocator getService() {
		return service;
	}
	
	//获取服务
	public IImsServiceWs getImsService() throws ServiceException, Exception {
		URL portAddress = WsUtil.getUrlAddress(CFG_WS_CLIENT_CODE);
		if(log.isInfoEnabled()){
			log.error(new StringBuffer().append(portAddress.getHost()).append(":").append(portAddress.getPort()));
		}
		IImsServiceWs imsService = getService().getIImsService(portAddress);
		return imsService;
	}
	
	/**
	 * 
	 * @param transactionID
	 * @param sUserStatus
	 * @param oneTimeFee
	 * @return
	 * @throws java.rmi.RemoteException
	 * @throws Exception
	 */
	public DoLifeCycleMgntResponse do_lifeCycleMgnt(String transactionID,SUserStatus sUserStatus,OneTimeFee oneTimeFee) throws java.rmi.RemoteException, Exception{
		RequestHead requestHead = buildRequestHead(transactionID, CrmCallAmsWsConstants.DEFAULT_TENANT_ID,CrmCallAmsWsConstants.LIFE_CYCLE_MGNT_BUSI_CODE);
		requestHead.setChargeFlag("0");
		DoLifeCycleMgntResponse response = getImsService().doLifeCycleMgnt(requestHead, sUserStatus,oneTimeFee);
		return response;
	}
	
	/**
	 * 
	 * 
	 * @Function: com.asiainfo.crm.so.exe.ws.crmcallams.ImsWrapQueryServiceClient.buildRequestHead
	 * @Description:构建RequestHead
	 *
	 * @param transactionID  custOrderId
	 * @param tenantId regionId
	 * @param busiCode
	 * @return
	 * @throws java.rmi.RemoteException
	 * @throws Exception
	 *
	 * @version:v1.0.0
	 * @author:cxy22xueyi
	 * @date:2013-11-1下午4:50:09
	 *
	 * Modification History:
	 * Date         Author      Version     Description
	 * -----------------------------------------------------------------
	 * 2013-11-1    cxy22xueyi     v1.0.0   构建RequestHead
	 */
	public RequestHead buildRequestHead(String transactionID,String tenantId,String busiCode)throws java.rmi.RemoteException, Exception{
		//业务流水号
		if(StringUtils.isNotBlank(transactionID)){
			if(!transactionID.contains(CrmCallAmsWsConstants.SYSTEM_ID)){
				transactionID = CrmCallAmsWsConstants.SYSTEM_ID + transactionID;
			}
		}else{
			SimpleDateFormat df = new SimpleDateFormat(CrmCallAmsWsConstants.TIME_FORMATE_STR);//设置日期格式
			String dateTimeStr = df.format(new Date());
			transactionID = CrmCallAmsWsConstants.SYSTEM_ID+dateTimeStr+busiCode;
		}
		if(log.isInfoEnabled()){
			log.debug(transactionID);
		}
		//多租户标识
		if(StringUtils.isBlank(tenantId)){
			tenantId = CrmCallAmsWsConstants.DEFAULT_TENANT_ID;
		}
		//新建RequestHead对象
		RequestHead requestHead = new RequestHead();
		//业务编码
		requestHead.setBusiCode(busiCode);
		requestHead.setTransactionID(transactionID);
		requestHead.setTenantId(CrmCallAmsWsConstants.getTenantId());
		requestHead.setAcceptChannelType(CrmCallAmsWsConstants.ACCEPT_CHANNEL_TYPE);
		requestHead.setAcceptChannelCode(CrmCallAmsWsConstants.ACCEP_CHANNEL_CODE);
		requestHead.setAppKey("SO101");
		return requestHead;
	}
	
	
	/**
	 * 
	 * 
	 * @Function: do_setExemptCreditLimit
	 * @Description:免催免停
	 *
	 * @param transactionID  custOrderId
	 * @param custId acctId 对应账户级别   billId对应用户级别
	 * @param operType 0添加1删除2修改
	 * @param exemptionType 0 – Non-exemption of dunning or suspending 101 – Dunning exemption 102 – Exemption of credit limit suspending 103 – Exemption of credit limit dunning and suspending
	 * @return
	 * @throws java.rmi.RemoteException
	 * @throws Exception
	 *
	 * @version:v1.0.0
	 * @author:cxy22xueyi
	 * @date:2013-11-1下午4:50:09
	 *
	 * Modification History:
	 * Date         Author      Version     Description
	 * -----------------------------------------------------------------
	 * 2013-11-1    cxy22xueyi     v1.0.0   构建RequestHead
	 */
	public DoSetExemptCreditLimitResponse do_setExemptCreditLimit(String transactionID,String tenantId,String busiCode,long custId,long acctId,String billId,short operType,int exemptionType,String validDate,String expireDate)throws java.rmi.RemoteException, Exception{
		DoSetExemptCreditLimitResponse response = null;
		RequestHead requestHead = this.buildRequestHead(transactionID, tenantId, CrmCallAmsWsConstants.DO_SET_EXEMPT_CREDIT_LIMIT_BUSI_CODE);
		SSetEmptLimitReq req = new SSetEmptLimitReq();
		req.setOperType(operType);
		req.setExemptionType(exemptionType);
		req.setExpireDate(expireDate);
		req.setValidDate(validDate);
		response = getImsService().doSetExemptCreditLimit(requestHead, req);
		return response;
	}
}
