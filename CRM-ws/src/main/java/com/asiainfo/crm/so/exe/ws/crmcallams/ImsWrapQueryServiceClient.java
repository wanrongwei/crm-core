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
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2013-10-28    cxy22xueyi     v1.0.0  账管查询接口
 *
 *
 */
package com.asiainfo.crm.so.exe.ws.crmcallams;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.xml.rpc.ServiceException;

import com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.*;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.appframe.ext.exeframe.ws.client.WsUtil;
import com.asiainfo.crm.so.teaminvoke.out.service.interfaces.ICrmFSV;

public class ImsWrapQueryServiceClient {
	/**
	 * cfg_ws_client表中配置	
	 */
	private static final String CFG_WS_CLIENT_CODE = "IMS_WRAP_QUERY";
	private static final String CFG_WS_QUERY_CLIENT_CODE = "IMS_QUERY_SERVICE";
	
	private static ImsWrapQueryServiceClient client = null;
	
	private static transient Log log = LogFactory.getLog(ImsWrapQueryServiceClient.class);
	
	public static ImsWrapQueryServiceClient getInstance() throws Exception {
		if (null == client) {
			client = new ImsWrapQueryServiceClient();
		}
		return client;
	}
	
	private IImsWrapQueryService_ServiceLocator service = null;
	private IImsQueryService_ServiceLocator queryService = null;
	
	private ImsWrapQueryServiceClient() {
		super();
		service = new IImsWrapQueryService_ServiceLocator();
		queryService = new IImsQueryService_ServiceLocator();
	}
	
	public IImsWrapQueryService_ServiceLocator getService() {
		return service;
	}
	
	private ICrmFSV iCrmFSV(){
		return (ICrmFSV)ServiceFactory.getService(ICrmFSV.class);
	}
	
	//获取服务
	public IImsWrapQueryServiceWs getImsWrapQueryService() throws ServiceException, Exception {
		URL portAddress = WsUtil.getUrlAddress(CFG_WS_CLIENT_CODE);
		if(log.isInfoEnabled()){
			log.debug(new StringBuffer().append(portAddress.getHost()).append(":").append(portAddress.getPort()));
		}
		IImsWrapQueryServiceWs imsWrapQueryService = getService().getIImsWrapQueryService(portAddress);
		return imsWrapQueryService;
	}
	
	public IImsQueryService_ServiceLocator getQueryService() {
		return queryService;
	}
	
	//获取IImsQueryServiceWs服务
	public IImsQueryServiceWs getImsQueryServiceWs() throws ServiceException, Exception {
		URL portAddress = WsUtil.getUrlAddress(CFG_WS_QUERY_CLIENT_CODE);
		if(log.isInfoEnabled()){
			log.debug(new StringBuffer().append(portAddress.getHost()).append(":").append(portAddress.getPort()));
		}
		IImsQueryServiceWs imsQueryServiceWs = getQueryService().getIImsQueryService(portAddress);
		return imsQueryServiceWs;
	}
	
	/** 
	 * 
	 * @Function: com.asiainfo.crm.so.exe.ws.crmcallams.ImsWrapQueryServiceClient.do_queryDeposit
	 * @Description:押金查询
	 * @Remrk SPocket中 amount 余额
	 * @param transactionID   业务流水号   orderCode，有责传，没有则传空
	 * @param tenantId  多账户标识 
	 * @param accountId 账户ID  queryLevel为1时accountId必传
	 * @param userId  用户ID    queryLevel为0时userId必传
	 * @param itemId  押金科目  10555 具体问billing
	 * @param ownerType  查询等级  0：用户级  1：账户级  2：当前账户级和用户级   3：当前账户级和账户下的所有用户级       用户级是私有的，账户级是共享的，可以有多个用户共享
	 * @return  SPocket[]  科目信息列表
	 * @throws java.rmi.RemoteException
	 * @throws Exception
	 *
	 * @version:v1.0.0
	 * @author:zhangxiang3
	 * @date:2013-10-30上午9:46:46
	 *
	 * Modification History:
	 * Date         Author      Version     Description
	 * -----------------------------------------------------------------
	 * 2013-10-30    zhangxiang3      v1.0.0   押金查询
	 */
	public SPocket[] do_queryDeposit(String transactionID,String tenantId,String accountId,long userId,Integer itemId,int ownerType)throws java.rmi.RemoteException, Exception{
		// 构建请求报文头
		RequestHead requestHead = buildRequestHead(transactionID, CrmCallAmsWsConstants.DEFAULT_TENANT_ID,CrmCallAmsWsConstants.QUERY_DEPOSIT_BUSI_CODE);
		SPocket[] sPockets = null;
		// 请求参数
		SMngQueryDepositReq req = new SMngQueryDepositReq();
		// 账户编号
		req.setOuter_acct_id(accountId);
		// 用户ID
		req.setResource_id(userId);
		// 押金科目ID
		req.setPocket_item(itemId);
		// 查询级别
		req.setOwner_type(ownerType);
		DoSMngQueryDepositResponse depositReponse = getImsWrapQueryService().doQueryDeposit(requestHead, req);
		if (depositReponse != null) {
			log.debug(new StringBuilder()
					.append("DO_QUERYDEPOSIT Debug Info : ").append("ResponsInfo ResCode:").append(depositReponse.getResponseHead().getRspCode())
					.append(" DESC: ").append(depositReponse.getResponseHead().getRspDesc())
					.append(" TransactionID: ").append(depositReponse.getResponseHead().getRspTransactionID()).append(" CRM TransactionID: ").append(requestHead.getTransactionID()));
			sPockets = depositReponse.getPocketList();
		}	
		return sPockets;
	}	
	
	/**
	 * 
	 * 
	 * @Function: com.asiainfo.crm.so.exe.ws.crmcallams.ImsWrapQueryServiceClient.do_query
	 * * @Description:查询接口
	 * queryTypeList 
	 * 1：查询用户信息
	 * 2：查询余额
     * 3：查询信用度
     * 5：查询免费资源
     * 7：查询历史账单
	 * @param transactionID  custOrderId
	 * @param tenantId  传1
	 * @param queryTypeList
	 * @param queryParam
	 * @return
	 * @throws java.rmi.RemoteException
	 * @throws Exception
	 *
	 * @version:v1.0.0
	 * @author:cxy22xueyi
	 * @date:2013-10-30上午10:28:34
	 *
	 * Modification History:
	 * Date         Author      Version     Description
	 * -----------------------------------------------------------------
	 * 2013-10-30    cxy22xueyi    v1.0.0   查询接口
	 */
	public DoQueryResponse do_query(String transactionID,String tenantId, QueryType[] queryTypeList, SQueryParam queryParam)throws java.rmi.RemoteException,Exception{
		//构建请求报文头
		RequestHead requestHead = buildRequestHead(transactionID,CrmCallAmsWsConstants.DEFAULT_TENANT_ID,CrmCallAmsWsConstants.QUERY_BUSI_CODE);		
		return getImsWrapQueryService().doQuery(requestHead,queryTypeList,queryParam);
	}
	
	/**
	 * 
	 * @Function: com.asiainfo.crm.so.exe.ws.crmcallams.ImsWrapQueryServiceClient.do_queryBalance
	 * @Description:查询余额
	 *
	 * @param transactionID   业务流水号   orderCode，有责传，没有则传空
	 * @param tenantId
	 * @param queryParam  out_acct_id 账户id user_id 用户id phone_id 用户号码  
	 * @return
	 * @throws java.rmi.RemoteException
	 * @throws Exception
	 *
	 * @version:v1.0.0
	 * @author:zhangxiang3
	 * @date:2013-11-4下午2:05:22
	 *
	 * Modification History:
	 * Date         Author      Version     Description
	 * -----------------------------------------------------------------
	 * 2013-11-4    zhangxiang3   v1.0.0     查询余额
	 */
	public double do_queryBalance(String transactionID,String tenantId, SQueryParam queryParam)throws java.rmi.RemoteException,Exception{
		long remainBalance = 0;
		//构建请求报文头
		RequestHead requestHead = buildRequestHead(transactionID,CrmCallAmsWsConstants.DEFAULT_TENANT_ID,CrmCallAmsWsConstants.QUERY_BUSI_CODE);		
		QueryType[] queryTypeList = new QueryType[1];
		QueryType queryType = new QueryType();
		queryType.setQueryType(CrmCallAmsWsConstants.QUERY_BALANCE);
		queryTypeList[0] = queryType;
		DoQueryResponse resp = getImsWrapQueryService().doQuery(requestHead,queryTypeList,queryParam);
		if(resp!=null){
			log.debug(new StringBuilder()
			.append("DO_QUERYBALANCE Debug Info : ").append("ResponsInfo ResCode:").append(resp.getResponseHead().getRspCode())
			.append(" DESC: ").append(resp.getResponseHead().getRspDesc())
			.append(" TransactionID: ").append(resp.getResponseHead().getRspTransactionID()).append(" CRM TransactionID: ").append(requestHead.getTransactionID()));
		}
		if(resp!=null&&resp.getBalance()!=null&&resp.getBalance().length>0){
			for(int i=0;i<resp.getBalance().length;i++){				
				remainBalance+=resp.getBalance()[i].getAmount();
			}		
		}
		return remainBalance;
	}
	
	/**
	 * 
	 * @Function: com.asiainfo.crm.so.exe.ws.crmcallams.ImsWrapQueryServiceClient.do_queryCredit
	 * @Description:查询信用度
	 * @param transactionID   业务流水号   orderCode，有责传，没有则传空
	 * @param tenantId
	 * @param queryParam out_acct_id CRM侧账户id user_id 用户id phone_id query_level 1：用户级 2：账户级 3：用户和账户级     
	 * @return CreditLimit[] credit_item_id 信用度科目 unlimited_flag 无限额标志
	 *         remain_credit 剩余信用度 credit 信用额度 advance_payment 预缴金额 usage 使用量
	 *         unpaid_payment 未缴金额 temp_credit 临时信用度 measure_id 货币单位 credit_type
	 *         1 信用度类型 unbilled_amount 未出账金额 next_bill_date 下次出账日 last_bill_date
	 *         最后一次出账日 recurring_fee 固费 onetime_fee 一次性费用 subscriber_exempt_list
	 *         List<SubscriberExempt> 用户免催免停列表 exempt_credit_flag 免催信用度标志
	 *         excempt_valid_date 免催生效时间 excempt_expire_date 免催失效时间 itemType
	 *         是否专款信用度
	 * @throws java.rmi.RemoteException
	 * @throws Exception
	 * @version:v1.0.0
	 * @author:zhangxiang3
	 * @date:2013-11-4下午3:00:18
	 */
	public CreditLimit[] do_queryCredit(String transactionID,String tenantId, SQueryParam queryParam)throws java.rmi.RemoteException,Exception{
		//构建请求报文头
		RequestHead requestHead = buildRequestHead(transactionID,CrmCallAmsWsConstants.DEFAULT_TENANT_ID,CrmCallAmsWsConstants.QUERY_BUSI_CODE);		
		QueryType[] queryTypeList = new QueryType[1];
		QueryType queryType = new QueryType();
		queryType.setQueryType(CrmCallAmsWsConstants.QUERY_CREDIT);
		queryTypeList[0] = queryType;
		DoQueryResponse resp = getImsWrapQueryService().doQuery(requestHead,queryTypeList,queryParam);
		if(resp!=null){
			log.debug(new StringBuilder()
			.append("DO_QUERYCREDIT Debug Info : ").append("ResponsInfo ResCode:").append(resp.getResponseHead().getRspCode())
			.append(" DESC: ").append(resp.getResponseHead().getRspDesc())
			.append(" TransactionID: ").append(resp.getResponseHead().getRspTransactionID()).append(" CRM TransactionID: ").append(requestHead.getTransactionID()));
		}
		if(resp!=null&&resp.getCredit()!=null){
			return resp.getCredit();
		}
		return null;
	}
	
	/**
	 * 
	 * @Function: com.asiainfo.crm.so.exe.ws.crmcallams.ImsWrapQueryServiceClient.do_queryHisBillFee
	 * @Description:查询历史账单总费用
	 *
	 * @param transactionID  业务流水号   orderId，有责传，没有则传空
	 * @param tenantId
	 * @param queryParam  out_acct_id CRM侧账户id  user_id 用户id phone_id 用户号码   Start_date("2013-10-01 00:00:00")  End_date("2013-10-31 00:00:00")  query_level 1：用户级 2：账户级  对应userId acctId为必传
	 * @return
	 * @throws java.rmi.RemoteException
	 * @throws Exception
	 *
	 * @version:v1.0.0
	 * @author:zhangxiang3
	 * @date:2013-11-4下午3:24:02
	 *
	 * Modification History:
	 * Date         Author      Version     Description
	 * -----------------------------------------------------------------
	 * 2013-11-4    zhangxiang3    v1.0.0          查询历史账单总费用
	 */
	public double do_queryHisBillFee(String transactionID,String tenantId, SQueryParam queryParam)throws java.rmi.RemoteException,Exception{
		long totalBillFee = 0;
		//构建请求报文头
		RequestHead requestHead = buildRequestHead(transactionID,CrmCallAmsWsConstants.DEFAULT_TENANT_ID,CrmCallAmsWsConstants.QUERY_BUSI_CODE);		
		QueryType[] queryTypeList = new QueryType[1];
		QueryType queryType = new QueryType();
		queryType.setQueryType(CrmCallAmsWsConstants.QUERY_HISTORY_BILL);
		queryTypeList[0] = queryType;
		DoQueryResponse resp = getImsWrapQueryService().doQuery(requestHead,queryTypeList,queryParam);
		if(resp!=null){
			log.debug(new StringBuilder()
			.append("DO_QUERYHISBILLFEE Debug Info : ").append("ResponsInfo ResCode:").append(resp.getResponseHead().getRspCode())
			.append(" DESC: ").append(resp.getResponseHead().getRspDesc())
			.append(" TransactionID: ").append(resp.getResponseHead().getRspTransactionID()).append(" CRM TransactionID: ").append(requestHead.getTransactionID()));
		}
		if(resp!=null&&resp.getBillInfo()!=null&&resp.getBillInfo().length>0){
			for(int i=0;i<resp.getBillInfo().length;i++){				
				totalBillFee+=resp.getBillInfo()[i].getPrimFee();
			}		
		}
		return totalBillFee;
	}

	/**
	 * 
	 * @Function: com.asiainfo.crm.so.exe.ws.crmcallams.ImsWrapQueryServiceClient.do_queryUnPayFee
	 * @Description:查询未结清账单  返回值>0表示有未结清账单
	 *
	 * @param transactionID   业务流水号   orderCode，有责传，没有则传空
	 * @param tenantId
	 * @param acctId  账户标识
	 * @param userId  用户标识   账户级未结清传0
	 * @param startMon  开始月      不传默认为最早欠费月   yyyyMM
	 * @param endMon   结束月         不传默认为当前月  yyyyMM
	 * @return
	 * @throws java.rmi.RemoteException
	 * @throws Exception
	 *
	 * @version:v1.0.0
	 * @author:zhangxiang3
	 * @date:2013-10-30下午3:49:20
	 *
	 * Modification History:
	 * Date         Author      Version     Description
	 * -----------------------------------------------------------------
	 * 2013-10-30    zhangxiang3      v1.0.0  查询未结清账单
	 */
	public long do_queryUnPayFee(String transactionID, String tenantId,String acctId, long userId, String startMon, String endMon)throws java.rmi.RemoteException, Exception {
		long unPayFee = 0;
		// 构建请求报文头
		RequestHead requestHead = buildRequestHead(transactionID, CrmCallAmsWsConstants.DEFAULT_TENANT_ID,CrmCallAmsWsConstants.QUERY_UNPAYFEE_BUSI_CODE);
		// 请求参数
		QueryUnPayFeeReq req = new QueryUnPayFeeReq();
		req.setOuterAcctId(acctId);
		if (0 != userId) {
			req.setResourceId(userId);
		}
		if (StringUtils.isNotBlank(startMon)) {
			req.setStartMonth(startMon);
		}
		if (StringUtils.isNotBlank(endMon)) {
			req.setEndMonth(endMon);
		}
//		DoQueryUnPayFeeResponse unpayFeeResponse = getImsWrapQueryService().doQueryUnPayFee(requestHead, req);
//		if(unpayFeeResponse!=null){
//			String str = new StringBuilder()
//			.append("DO_QUERYUNPAYFEE Debug Info : ").append("ResponsInfo ResCode:").append(unpayFeeResponse.getResponseHead().getRspCode())
//			.append(" DESC: ").append(unpayFeeResponse.getResponseHead().getRspDesc())
//			.append(" TransactionID: ").append(unpayFeeResponse.getResponseHead().getRspTransactionID()).append(" CRM TransactionID: ").append(requestHead.getTransactionID()).toString();
//			iCrmFSV().saveCRMCallBillingWebServiceLog(str,userId,"do_queryUnPayFee");
//		}
//		if (unpayFeeResponse != null && null!=unpayFeeResponse.getUnpayFee()) {
//			unPayFee = unpayFeeResponse.getUnpayFee();
//		}
		return unPayFee;
	}

	 /**
     * @Function: com.asiainfo.crm.so.exe.ws.crmcallams.ImsWrapQueryServiceClient.do_queryPayResult
     * @Description:查询付费结果
     *
     * @param transactionID   业务流水号   orderCode，有责传，没有则传空
     * @param tenantId
     * @param orderCode 订单流水号 为订购时候传给billing的order_id字段
     * @param start_date 订单开始时间   yyyy-MM-dd HH:mm:ss
     * @param end_date 订单结束时间 yyyy-MM-dd HH:mm:ss
     * @param acct_id 账户ID
     * @return 付费结果  0未处理,1成功,2失败,-1 撤单
     * @throws java.rmi.RemoteException
     * @throws Exception
     *
     * @version:v1.0.0 
     * @author:cxy22xueyi
     * @date:2013-11-1上午10:10:59
     *
     * Modification History:
     * Date         Author      Version     Description
     * -----------------------------------------------------------------
     * 2013-11-1    zhangxiang3     v1.0.0   查询付费结果
     */
	public int do_queryPayResult(String transactionID,String tenantId,String order_id,String start_date,String end_date,String acct_id)throws java.rmi.RemoteException,Exception{
		/*付费结果  0:无需支付
		1:未支付
		2:支付中
		3:支付完成
		4:支付失败*/

		int payResult = 0;
		//构建请求报文头
    	RequestHead requestHead = buildRequestHead("",CrmCallAmsWsConstants.DEFAULT_TENANT_ID,CrmCallAmsWsConstants.QUERY_PAYRESULT_BUSI_CODE);
    	SQueryPayInfoReq req = new SQueryPayInfoReq();
    	req.setOuterAcctId(acct_id);
    	req.setOrderId(order_id);
//    	DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    	String nowDate = start_date.split(" ")[0];
    	start_date = nowDate + " 00:00:00";
    	end_date = nowDate + " 23:59:59";
    	req.setStartDate(start_date);
    	req.setEndDate(end_date);
    	DoQueryPayInfoResponse payInfoResponse = getImsWrapQueryService().doQueryPayInfo(requestHead,req);
    	if(log.isInfoEnabled()) {
			log.info("START_DATE:" + start_date + "END_DATE:" + end_date + "ACCTID:" + acct_id + "ORDERID:" + order_id);
    	}
    	if(payInfoResponse!=null){
			String str = new StringBuilder()
			.append("DO_QUERYPAYRESULT Debug Info : ").append("orderId:").append(order_id).append("ResponsInfo ResCode:").append(payInfoResponse.getResponseHead().getRspCode())
			.append(" DESC: ").append(payInfoResponse.getResponseHead().getRspDesc())
			.append(" TransactionID: ").append(payInfoResponse.getResponseHead().getRspTransactionID()).append(" CRM TransactionID: ").append(requestHead.getTransactionID()).append("payResult:").append(payInfoResponse.getOrderInfoOut().getPaySts()).toString();
			iCrmFSV().saveCRMCallBillingWebServiceLog(str, 0, "do_queryPayResult");
    	}
    	if(!"0".equals(payInfoResponse.getResponseHead().getRspCode())){
    		throw new Exception("query payment info error:"+payInfoResponse.getResponseHead().getRspDesc());
    	}
		payResult = payInfoResponse.getOrderInfoOut().getPaySts();
		if(log.isInfoEnabled()) {
			log.info(new StringBuilder().append("getOrderInfoOut().getPaySts():").append(payInfoResponse.getOrderInfoOut().getPaySts()).append(" 0NotHanddle,1Success,2Failure,-1CancleTheOrder"));
		}
    	return payResult;
	}
    
	/**
     * 
     * @Function: com.asiainfo.crm.so.exe.ws.crmcallams.ImsWrapQueryServiceClient.do_queryPoint
     * @Description:积分查询
     *
     * @param transactionID   业务流水号   orderCode，有责传，没有则传空
     * @param tenantId
     * @param acct_id  ownerType为1acct_id必传
     * @param user_id  ownerType为0user_id必传
     * @param ownerType  0:用户级  1:账户级
     * @return
     * @throws java.rmi.RemoteException
     * @throws Exception
     *
     * @version:v1.0.0
     * @author:cxy22xueyi
     * @date:2013-11-4下午3:07:34
     *
     * Modification History:
     * Date         Author      Version     Description
     * -----------------------------------------------------------------
     * 2013-11-4    cxy22xueyi  v1.0.0      积分查询
     */
    public QryPointOut[] do_queryPoint(String transactionID,String tenantId,String acct_id,long user_id,int ownerType) throws java.rmi.RemoteException, Exception{    	
    	//构建请求报文头
    	RequestHead requestHead = buildRequestHead(transactionID,CrmCallAmsWsConstants.DEFAULT_TENANT_ID,CrmCallAmsWsConstants.QUERY_POINT_BUSI_CODE);
    	//请求参数
    	SQryPointInfoReq req = new SQryPointInfoReq();
    	if(acct_id!=null&&!"".equals(acct_id)){
    		req.setOuterAcctId(acct_id);
    	}
    	if(user_id!=0){
    		req.setResourceId(user_id);
    	}    	   	
    	req.setOwnerType(ownerType);
    	//需要对端提供积分合计值
    	DoQueryPointInfoResponse pointInfoResponse = getImsWrapQueryService().doQueryPoint(requestHead,req);  
    	if(pointInfoResponse!=null){
    		log.debug(new StringBuilder()
			.append("DO_QUERYPOINT Debug Info : ").append("ResponsInfo ResCode:").append(pointInfoResponse.getResponseHead().getRspCode())
			.append(" DESC: ").append(pointInfoResponse.getResponseHead().getRspDesc())
			.append(" TransactionID: ").append(pointInfoResponse.getResponseHead().getRspTransactionID()).append(" CRM TransactionID: ").append(requestHead.getTransactionID()));
		}
    	return pointInfoResponse.getQryPointOutList();
    }

    /**   
     * @Function: com.asiainfo.crm.so.exe.ws.crmcallams.ImsWrapQueryServiceClient.do_queryProdycleInfo
     * @Description: 产品周期信息查询
     * @param transactionID   业务流水号   orderCode，有则传，没有则传空
     * @param tenantId
     * @return：
     * @throws：异常描述
     *
     * @version: v1.0.0
     * @author: zhouwu
     * @date: Dec 12, 2014 3:47:39 PM  
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * Dec 12, 2014      zhouwu           v1.0.0               修改原因
     */
    public DoQueryProdCycleInfoResponse do_queryProdycleInfo(String transactionID,String tenantId,long object_id,int object_type,long product_id,short billing_type,Calendar beginDate,Calendar endDate) throws java.rmi.RemoteException, Exception{    	
    	//构建请求报文头
    	RequestHead requestHead = buildRequestHead(transactionID,CrmCallAmsWsConstants.DEFAULT_TENANT_ID,CrmCallAmsWsConstants.QUERY_PRODCYC_BUSI_CODE);
    	//请求参数
    	DoQueryProdCycleInfoReq req = new DoQueryProdCycleInfoReq();
    	req.setObjectId(object_id);
    	req.setObjectType(object_type);
    	req.setProductId(product_id);
    	req.setBillingType(billing_type);
    	req.setBeginDate(beginDate);
    	req.setEndDate(endDate);
    	DoQueryProdCycleInfoResponse prodCycleInfoResponse = getImsQueryServiceWs().doQueryProdCycleInfo(requestHead, req);  
    	if(prodCycleInfoResponse!=null){
    		log.debug(new StringBuilder()
			.append("DO_QUERYPRODYCLEINFO Debug Info : ").append("ResponsInfo ResCode:").append(prodCycleInfoResponse.getResponseHead().getRspCode())
			.append(" DESC: ").append(prodCycleInfoResponse.getResponseHead().getRspDesc())
			.append(" TransactionID: ").append(prodCycleInfoResponse.getResponseHead().getRspTransactionID()).append(" CRM TransactionID: ").append(requestHead.getTransactionID()));
		}
    	return prodCycleInfoResponse;
    }
    
    /**
     * 反悔订单支付的查询接口
     * @param transactionID
     * @param acctId
     * @param orderDate
     * @param orderId
     * @param queryType 1：查询订单支付信息；2：查询用户的支付信息
     * @param userId
     * @return
     * @throws java.rmi.RemoteException
     * @throws Exception
     */
    public DoQueryRegretDeductInfoResponse do_queryRegretDeductInfo (String transactionID,long acctId,Date orderDate,
    		String orderId,int queryType,long userId,SRegretOffer[] offerList) throws java.rmi.RemoteException, Exception{    	
    	//构建请求报文头
    	RequestHead requestHead = buildRequestHead(transactionID,CrmCallAmsWsConstants.DEFAULT_TENANT_ID,CrmCallAmsWsConstants.Query_Regret_Deduct_BUSI_CODE);
    	//请求参数
    	Calendar calendarOrderDate = Calendar. getInstance(); 
		if (null != orderDate) {
			calendarOrderDate.setTime(orderDate);
		}
    	SQueryRegretInfo queryRegretInfo = new SQueryRegretInfo();
    	queryRegretInfo.setAcctId(acctId);
    	queryRegretInfo.setOrderId(orderId);
    	queryRegretInfo.setOrderDate(calendarOrderDate);
    	queryRegretInfo.setQueryType(queryType);
    	queryRegretInfo.setResourceId(userId);
    	if(offerList != null && offerList.length>0){
    		queryRegretInfo.setOfferList(offerList);
    	}
    	
    	DoQueryRegretDeductInfoResponse queryRegretDeductInfoResponse = getImsWrapQueryService().doQueryRegretDeductInfo(requestHead, queryRegretInfo);  
    	if(queryRegretDeductInfoResponse!=null){
    		log.debug(new StringBuilder()
			.append("DO_queryRegretDeductInfo Debug Info : ").append("ResponsInfo ResCode:").append(queryRegretDeductInfoResponse.getResponseHead().getRspCode())
			.append(" DESC: ").append(queryRegretDeductInfoResponse.getResponseHead().getRspDesc())
			.append(" TransactionID: ").append(queryRegretDeductInfoResponse.getResponseHead().getRspTransactionID()).append(" CRM TransactionID: ").append(requestHead.getTransactionID()));
		}
    	return queryRegretDeductInfoResponse;
    }
    
    /**
     * 反悔校验查询
     * @param transactionID
     * @param acctId
     * @param orderDate
     * @param orderId
     * @param queryType
     * @param userId
     * @param offerList
     * @return
     * @throws java.rmi.RemoteException
     * @throws Exception
     */
    public DoQueryRegretStsResponse do_queryRegretSts(String transactionID,long acctId,Date orderDate,
    		String orderId,int queryType,long userId,List<Map<String,Object>> offerList) throws java.rmi.RemoteException, Exception{
    	//构建请求报文头
    	RequestHead requestHead = buildRequestHead(transactionID,CrmCallAmsWsConstants.DEFAULT_TENANT_ID,CrmCallAmsWsConstants.Query_Regret_Sts_BUSI_CODE);
    	//请求参数
    	Calendar calendarOrderDate = Calendar. getInstance(); 
		if (null != orderDate) {
			calendarOrderDate.setTime(orderDate);
		}
    	SQueryRegretInfo queryRegretInfo = new SQueryRegretInfo();
    	queryRegretInfo.setAcctId(acctId);
    	queryRegretInfo.setOrderId(orderId);
    	queryRegretInfo.setOrderDate(calendarOrderDate);
    	queryRegretInfo.setQueryType(queryType);
    	queryRegretInfo.setResourceId(userId);
    	SRegretOffer[] offerArrays = null;
    	if(offerList!=null && offerList.size()>0){
    		offerArrays = new SRegretOffer[offerList.size()];
    		for(int i=0;i<offerList.size();i++){
    			SRegretOffer regretOffer = new SRegretOffer();
    			regretOffer.setUpcOfferId(Long.parseLong((String)offerList.get(i).get("OfferId")));
    			regretOffer.setImei((String)offerList.get(i).get("IMEI"));
    			offerArrays[i] = regretOffer;
    		}
    		
    	}
    	queryRegretInfo.setOfferList(offerArrays);
    	DoQueryRegretStsResponse queryRegretStsResponse = getImsWrapQueryService().doQueryRegretSts(requestHead, queryRegretInfo);
    	return queryRegretStsResponse;
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
		return requestHead;
	}
	public long do_queryPastFee(String transactionID, String tenantId,String acctId, long userId, String startMon, String endMon)throws java.rmi.RemoteException, Exception {
		long pastFee = 0;
		// 构建请求报文头
		RequestHead requestHead = buildRequestHead(transactionID, CrmCallAmsWsConstants.DEFAULT_TENANT_ID,CrmCallAmsWsConstants.QUERY_PASTFEE_BUSI_CODE);
		// 请求参数
		QueryBillAmountParam req = new QueryBillAmountParam();
		req.setOuterAcctId(acctId);
		//req.setAcctId(Long.valueOf(acctId));

		BillAmountResponse billAmtResponse = getImsWrapQueryService().doQueryBillAmount(requestHead, req);  
    	if(billAmtResponse!=null){
    		log.debug(new StringBuilder()
			.append("DoQueryBillAmount Debug Info : ").append("ResponsInfo ResCode:").append(billAmtResponse.getResponseHead().getRspCode())
			.append(" DESC: ").append(billAmtResponse.getResponseHead().getRspDesc())
			.append(" TransactionID: ").append(billAmtResponse.getResponseHead().getRspTransactionID()).append(" CRM TransactionID: ").append(requestHead.getTransactionID()));
		}
    	return billAmtResponse.getPastDueAmount();
	}
	
	public long do_queryBillAmountByType(String transactionID, String tenantId,String acctId, int queryType, String startMon, String endMon)throws java.rmi.RemoteException, Exception {
		// 构建请求报文头
		RequestHead requestHead = buildRequestHead(transactionID, CrmCallAmsWsConstants.DEFAULT_TENANT_ID,CrmCallAmsWsConstants.QUERY_PASTFEE_BY_TYPE_BUSI_CODE);
		// 请求参数
		QueryBillAmountReq req = new QueryBillAmountReq();
		req.setOuterAcctId(acctId);
		req.setQueryType(queryType);
		//req.setAcctId(Long.valueOf(acctId));

		 BillAmountResponse billAmtResponse = getImsWrapQueryService().doQueryBillAmountByType(requestHead, req);  
    	if(billAmtResponse!=null){
    		log.debug(new StringBuilder()
			.append("DoQueryBillAmount Debug Info : ").append("ResponsInfo ResCode:").append(billAmtResponse.getResponseHead().getRspCode())
			.append(" DESC: ").append(billAmtResponse.getResponseHead().getRspDesc())
			.append(" TransactionID: ").append(billAmtResponse.getResponseHead().getRspTransactionID()).append(" CRM TransactionID: ").append(requestHead.getTransactionID()));
		}
    	return billAmtResponse.getPastDueAmount();
	}
	
	public DoQueryAllowanceDtlResp do_QueryAllowanceDtls (String transactionID,long acctId) throws java.rmi.RemoteException, Exception{    	
    	RequestHead requestHead = buildRequestHead(transactionID,CrmCallAmsWsConstants.DEFAULT_TENANT_ID,CrmCallAmsWsConstants.Query_Allowance_BUSI_CODE);
    	DoQueryAllowanceDtlReq req = new DoQueryAllowanceDtlReq();
    	req.setAcctId(acctId);
    	DoQueryAllowanceDtlResp response = getImsWrapQueryService().doQueryAllowanceDtls(requestHead, req);
    	if(response!=null){
    		log.debug(new StringBuilder()
			.append("do_QueryAllowanceDtls Debug Info : ").append("ResponsInfo ResCode:").append(response.getResponseHead().getRspCode())
			.append(" DESC: ").append(response.getResponseHead().getRspDesc())
			.append(" TransactionID: ").append(response.getResponseHead().getRspTransactionID()).append(" CRM TransactionID: ").append(requestHead.getTransactionID()));
		}
    	return response;
    }
	
	public DoQueryInstallmenInfoResponse doQueryInstallmentInfo(String transactionID,long acctId) throws java.rmi.RemoteException, Exception{
    	RequestHead requestHead = buildRequestHead(transactionID,CrmCallAmsWsConstants.DEFAULT_TENANT_ID,CrmCallAmsWsConstants.Query_Installment_BUSI_CODE);
    	SQueryInstallmentInfoReq  req = new SQueryInstallmentInfoReq();
    	req.setAcctId(acctId);
    	DoQueryInstallmenInfoResponse response = getImsWrapQueryService().doQueryInstallmentInfo(requestHead, req);
    	if(response!=null){
    		log.debug(new StringBuilder()
			.append("DoQueryInstallmentInfo Debug Info : ").append("ResponsInfo ResCode:").append(response.getResponseHead().getRspCode())
			.append(" DESC: ").append(response.getResponseHead().getRspDesc())
			.append(" TransactionID: ").append(response.getResponseHead().getRspTransactionID()).append(" CRM TransactionID: ").append(requestHead.getTransactionID()));
		}
    	return response;
	}
	
	public OrderInfoResp doQueryUnifiedPay(RequestHead head,OrderInfoReq req) throws java.rmi.RemoteException, Exception{
		OrderInfoResp response = getImsWrapQueryService().doQueryUnifiedPay(head, req);
    	if(response!=null){
    		log.debug(new StringBuilder()
			.append("doQueryUnifiedPay Debug Info : ").append("ResponsInfo ResCode:").append(response.getResponseHead().getRspCode())
			.append(" DESC: ").append(response.getResponseHead().getRspDesc())
			.append(" TransactionID: ").append(response.getResponseHead().getRspTransactionID()).append(" CRM TransactionID: ").append(head.getTransactionID()));
		}
    	return response;
	}
	/**
	 * 20220610 查询offer免费资源接口封装 tanyan
	 * @param transactionID
	 * @param offerIds
	 * @return
	 * @throws java.rmi.RemoteException
	 * @throws Exception
	 */
	public SimpleMapOfLongListOfFreeResInfo doQueryFreeResInfo(RequestHead requestHead,long[] offerIds)throws java.rmi.RemoteException, Exception{
		SimpleMapOfLongListOfFreeResInfo mapFreeResInfo = null;
		FreeResInfoResp freeResInfoReponse = getImsWrapQueryService().doQueryFreeResInfo(requestHead, offerIds);
		if (freeResInfoReponse != null) {
			if(freeResInfoReponse.getResponseHead() != null) {
				if(freeResInfoReponse.getResponseHead().getRspCode().equals("0")) {
					mapFreeResInfo = freeResInfoReponse.getMapFreeResInfo();				
				}else {
					log.error("doQueryFreeResInfo Erorr Info : DoQueryFreeResInfoResponse.ResponseHead.RspCode is not 0 success. ");
				}
				log.debug(new StringBuilder()
						.append("doQueryFreeResInfo Debug Info : ").append("ResponsInfo ResCode:").append(freeResInfoReponse.getResponseHead().getRspCode())
						.append(" DESC: ").append(freeResInfoReponse.getResponseHead().getRspDesc())
						.append(" TransactionID: ").append(freeResInfoReponse.getResponseHead().getRspTransactionID()).append(" CRM TransactionID: ").append(requestHead.getTransactionID()));
			}else {
				log.error("doQueryFreeResInfo Erorr Info : DoQueryFreeResInfoResponse.ResponseHead is null. ");
			}
		}else {
			log.error("doQueryFreeResInfo Erorr Info : DoQueryFreeResInfoResponse is null. ");
		}
		return mapFreeResInfo;
	}

	/**
	*@Description 通过mainOfferId 和 listItemId 查询资费信息
	*@param requestHead
	*@param req
	*@return com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.TariffResInfo[]
	*@Author Yan_zt
	*@date 2022/9/6
	*/
	public TariffResInfo[] doQueryTariffInfo(RequestHead requestHead, TariffResInfoReq req)throws java.rmi.RemoteException, Exception{
		TariffResInfo[] listTariffResInfo = null;
		TariffResInfoResp tariffResInfoResp = getImsWrapQueryService().doQueryTariffInfo(requestHead, req);
		if (tariffResInfoResp != null){
			if (tariffResInfoResp.getResponseHead() != null ){
				if(tariffResInfoResp.getResponseHead().getRspCode().equals("0")) {
					listTariffResInfo = tariffResInfoResp.getListTariffResInfo();
				}else {
					log.error("doQueryTariffInfo Erorr Info : DoQueryTariffInfoResponse.ResponseHead.RspCode is not 0 success. ");
				}
				log.debug(new StringBuilder()
						.append("doQueryFreeResInfo Debug Info : ").append("ResponsInfo ResCode:").append(tariffResInfoResp.getResponseHead().getRspCode())
						.append(" DESC: ").append(tariffResInfoResp.getResponseHead().getRspDesc())
						.append(" TransactionID: ").append(tariffResInfoResp.getResponseHead().getRspTransactionID()).append(" CRM TransactionID: ").append(requestHead.getTransactionID()));
			}else{
				log.error("doQueryTariffInfo Erorr Info : DoQueryTariffInfoResponse.ResponseHead is null. ");
			}
		}else {
			log.error("doQueryTariffInfo Erorr Info : DoQueryTariffInfoResponse is null. ");
		}
		return listTariffResInfo;
	}
}
