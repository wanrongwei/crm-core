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
import java.rmi.RemoteException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.rpc.ServiceException;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.common.SessionManager;
import com.ai.appframe2.complex.tab.split.TenantIDFactory;
import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.appframe.ext.exeframe.ws.client.WsUtil;
import com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AdjustMultiBillDtl;
import com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AdjustMultiBillInReq;
import com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AdjustMultiBillResponse;
import com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AdjustPointReq;
import com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAdjustPointResponse;
import com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCancelInstalmentResponse;
import com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCancelOrderReq;
import com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCancelOrderResponse;
import com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoChangeOrderInfoResponse;
import com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoInsertOrderInfoResponse;
import com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoInstalChangeResponse;
import com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoRegretFeeResponse;
import com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoRegretRefundResponse;
import com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoRollbackPaymentResponse;
import com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoTransferResponse;
import com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoUnifiedPayReq;
import com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoUnifiedPayResponse;
import com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.IImsWrapServiceWs;
import com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.IImsWrapService_ServiceLocator;
import com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.OfferInfo;
import com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.OneTimeFee;
import com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.OrderUserInfo;
import com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead;
import com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SAdjustFinesReq;
import com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SAdjustFinesResp;
import com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SAmountDetailInfo;
import com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SCancelInstalmentReq;
import com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SChangeOrderParam;
import com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SFeeItem;
import com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SInstalChangeReq;
import com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SInstalChangeWeb;
import com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SOrderInfo;
import com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SPayInfo;
import com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SReceiptInfoReq;
import com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SRegretInfo;
import com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SRegretOrderInfo;
import com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SRegretRefundReq;
import com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.STransferReq;
import com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SchangeOfferInfo;
import com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SchangeOrderInfo;
import com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SchangeOrderInfoResp;
import com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SconfirmFutrueInfo;
import com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SconfirmOrder;
import com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SconfirmOrderResp;
import com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SsOfferInfo;
import com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.UpdateOrderUserIdResp;
import com.asiainfo.crm.so.teaminvoke.out.service.interfaces.ICrmFSV;

public class ImsWrapServiceClient {
	/**
	 * cfg_ws_client表中配置	
	 */
	private static final String CFG_WS_CLIENT_CODE = "IMS_WRAP_SERVICE";
	
	private static ImsWrapServiceClient client = null;
	
	private static transient Log log = LogFactory.getLog(ImsWrapServiceClient.class);
		
	public static ImsWrapServiceClient getInstance() throws Exception {
		if (null == client) {
			synchronized(ImsWrapServiceClient.class) {
				if (null == client)
					client = new ImsWrapServiceClient();
			}
		}
		return client;
	}
	
	private IImsWrapService_ServiceLocator service = null;
	
	private ImsWrapServiceClient() {
		super();
		service = new IImsWrapService_ServiceLocator();
	}
	
	public IImsWrapService_ServiceLocator getService() {
		return service;
	}
	
	private ICrmFSV iCrmFSV(){
		return (ICrmFSV)ServiceFactory.getService(ICrmFSV.class);
	}
	
	//获取服务
	public IImsWrapServiceWs getImsWrapService() throws ServiceException, Exception {
		URL portAddress = WsUtil.getUrlAddress(CFG_WS_CLIENT_CODE);
		if(log.isInfoEnabled()){
			String str = new StringBuffer().append(portAddress.getHost()).append(":").append(portAddress.getPort()).toString();
			iCrmFSV().saveCRMCallBillingWebServiceLog(str, 0, "getImsWrapService");
		}
		IImsWrapServiceWs imsWrapService = getService().getIImsWrapService(portAddress);
		return imsWrapService;
	}

	/**
	 * 
	 * @Function: com.asiainfo.crm.so.exe.ws.crmcallams.ImsWrapServiceClient.insertReceiptInfo
	 * @Description:提交费用及打印信息
	 *
	 * @param transactionID   业务流水号   orderCode，有责传，没有则传空
	 * @param tenantId
	 * @param acct_id    账户ID
	 * @param user_id    用户ID
	 * @param phone_id   手机号码
	 * @param orderCode   订单流水号
	 * @param order_date  订单日期   当前日期
	 * @param crm_busi_mode  业务名称
	 * @param cust_name   客户名称
	 * @param op_id   操作员ID
	 * @param op_name  操作员名称
	 * @param feeItemList   费用列表
	 * @return
	 * @throws java.rmi.RemoteException
	 * @throws Exception
	 *
	 * @version:v1.0.0
	 * @author:cxy22xueyi
	 * @date:2013-11-1下午4:55:28
	 *
	 * Modification History:
	 * Date         Author      Version     Description
	 * -----------------------------------------------------------------
	 * 2013-11-1    cxy22xueyi      v1.0.0      提交费用及打印信息
	 */
	public boolean insertReceiptInfo(String transactionID,String tenantId,String acct_id,long user_id,String phone_id,String order_id,String order_date,String crm_busi_mode,String cust_name,long op_id,String op_name,SOrderInfo orderInfo  )throws java.rmi.RemoteException, Exception{
		//构建请求报文头
		RequestHead requestHead = buildRequestHead(transactionID,
				CrmCallAmsWsConstants.DEFAULT_TENANT_ID,
				CrmCallAmsWsConstants.INSERT_RECEIPT_BUSI_CODE);
//    	SReceiptInfoReq req = new SReceiptInfoReq();
//    	req.setOuterAcctId(acct_id);
//    	req.setResourceId(user_id);
//    	req.setPhoneId(phone_id);
//    	req.setOrderDate(order_date);
//    	req.setOrderId(order_id);
//    	req.setCrmBusiMode(crm_busi_mode);
//    	req.setAcctName(cust_name);
//    	req.setOpId(op_id);
//    	req.setOpName(op_name);
//    	req.setFeeItemList(feeItemList);
    	String str = new StringBuilder().append("===TENANT_ID: ").
    			append(requestHead.getTenantId()).append(" acct_id: ")
    			.append(acct_id).append(" user_id: ").append(user_id)
    			.append(" phone_id: ").append(phone_id).append(" order_date: ")
    			.append(order_date).append(" order_id: ").append(order_id)
    			.append(" crm_busi_mode: ").append(crm_busi_mode)
    			.append(" cust_name: ").append(" op_id: ").append(op_id)
    			.append(" op_name: ").append(op_name)
    			.append(" transactionID: ").append(transactionID).toString();
		iCrmFSV().saveCRMCallBillingWebServiceLog(str, user_id, "insertReceiptInfo");
//    	DoInsertReceiptInfoResponse  insertReceiptResponse = getImsWrapService().doInsertReceiptInfo(requestHead, req);
    	DoInsertOrderInfoResponse  insertReceiptResponse = getImsWrapService().doInsertOrderInfo(requestHead, orderInfo);

		if (insertReceiptResponse != null) {
			String string = new StringBuilder().append("INSERTRECEIPTINFO Debug Info : ").append("ResponsInfo ResCode:").append(insertReceiptResponse.getResponseHead().getRspCode()).append(" DESC: ")
					.append(insertReceiptResponse.getResponseHead().getRspDesc()).append(" TransactionID: ").append(insertReceiptResponse.getResponseHead().getRspTransactionID())
					.append(" CRM TransactionID: ").append(requestHead.getTransactionID()).toString();
			iCrmFSV().saveCRMCallBillingWebServiceLog(string, user_id, "insertReceiptInfo");
		}
    	if(insertReceiptResponse!=null&&insertReceiptResponse.getResponseHead()!=null){
    		if("0".equals(insertReceiptResponse.getResponseHead().getRspCode())){
    			String string = new StringBuilder().append("insertReceiptResponse.getResponseHead().getRspCode():").
    					append(insertReceiptResponse.getResponseHead().getRspCode()).toString(); 
    			iCrmFSV().saveCRMCallBillingWebServiceLog(string, user_id, "insertReceiptInfo");    			
    			return true;
    		}else{
    			return false;
    		}
    	}else{
    		return false;
    	}
	}
	public boolean doChangeOrderInfo(String transactionID,String tenantId,String acct_id,long user_id,String phone_id,String order_id,Calendar order_date,int  modifyType,long op_id,OfferInfo[] iMEIList  )throws java.rmi.RemoteException, Exception{
		return doChangeOrderInfo(transactionID, tenantId, acct_id, user_id, phone_id, order_id, order_date, modifyType, op_id, "", iMEIList);
	}
	public boolean doChangeOrderInfo(String transactionID,String tenantId,String acct_id,long user_id,String phone_id,String order_id,Calendar order_date,int  modifyType,long op_id,String sapOrderId,OfferInfo[] iMEIList  )throws java.rmi.RemoteException, Exception{
		//构建请求报文头
		RequestHead requestHead = buildRequestHead(transactionID,
				CrmCallAmsWsConstants.DEFAULT_TENANT_ID,
				CrmCallAmsWsConstants.DO_CHANGE_ORDER_INFO_BUSI_CODE);
    	String str = new StringBuilder().append("doChangeOrderInfo===TENANT_ID: ").
    			append(requestHead.getTenantId()).append(" acct_id: ")
    			.append(acct_id).append(" user_id: ").append(user_id)
    			.append(" phone_id: ").append(phone_id).append(" order_date: ")
    			.append(order_date).append(" order_id: ").append(order_id)
    			.append(" crm_busi_mode: ")
    			.append(" transactionID: ").append(transactionID).toString();
		iCrmFSV().saveCRMCallBillingWebServiceLog(str, user_id, "doChangeOrderInfo");
		SChangeOrderParam changeOrder = new SChangeOrderParam();
		changeOrder.setAcctId(Long.parseLong(acct_id));
		changeOrder.setModifyType(modifyType);
		changeOrder.setOrderDate(order_date);
		changeOrder.setOrderId(order_id);
		changeOrder.setPhoneId(phone_id);
		changeOrder.setResourceId(user_id);
		if(StringUtils.isNotBlank(sapOrderId)) {
			changeOrder.setSapOrderId(sapOrderId);
		}
		changeOrder.setIMEIList(iMEIList);
		DoChangeOrderInfoResponse  insertReceiptResponse = getImsWrapService().doChangeOrderInfo(requestHead, changeOrder);

		if (insertReceiptResponse != null) {
			String string = new StringBuilder().append("doChangeOrderInfo Debug Info : ").append("ResponsInfo ResCode:").append(insertReceiptResponse.getResponseHead().getRspCode()).append(" DESC: ")
					.append(insertReceiptResponse.getResponseHead().getRspDesc()).append(" TransactionID: ").append(insertReceiptResponse.getResponseHead().getRspTransactionID())
					.append(" CRM TransactionID: ").append(requestHead.getTransactionID()).toString();
			iCrmFSV().saveCRMCallBillingWebServiceLog(string, user_id, "doChangeOrderInfo");
		}
    	if(insertReceiptResponse!=null&&insertReceiptResponse.getResponseHead()!=null){
    		if("0".equals(insertReceiptResponse.getResponseHead().getRspCode())){
    			String string = new StringBuilder().append("DoChangeOrderInfoResponse.getResponseHead().getRspCode():").
    					append(insertReceiptResponse.getResponseHead().getRspCode()).toString(); 
    			iCrmFSV().saveCRMCallBillingWebServiceLog(string, user_id, "doChangeOrderInfo");    			
    			return true;
    		}else{
    			return false;
    		}
    	}else{
    		return false;
    	}
	}
	
	/**
	 * 未来订单改单接口
	 * @param orderId 
	 * @param acct_id
	 * @param changeType
	 * @param orderDate
	 * @param offerInfoList
	 * @return
	 * @throws Exception
	 */
	public boolean doChangeFutureOrderInfo(String orderId,long acct_id,int changeType,Calendar orderDate,List<SchangeOfferInfo> offerInfoList) throws Exception{
		
		RequestHead requestHead = buildRequestHead(orderId, CrmCallAmsWsConstants.DEFAULT_TENANT_ID, CrmCallAmsWsConstants.DO_CHANGE_FUTURE_ORDER_BUSI_CODE);
		String str = new StringBuilder().append("doChangeOrderInfo===TENANT_ID: ").
    			append(requestHead.getTenantId()).append(" acct_id: ")
    			.append(" order_date: ").append(orderDate)
    			.append(" order_id: ").append(orderId)
    			.append(" crm_busi_mode: ")
    			.append(" transactionID: ").append(orderId).toString();
		iCrmFSV().saveCRMCallBillingWebServiceLog(str, 0L, "DoChangeFutrueOrder");
		
		SchangeOrderInfo orderInfo = new SchangeOrderInfo();
		orderInfo.setAcctId(acct_id);
		orderInfo.setChangeType(changeType);
		orderInfo.setOrderDate(orderDate);
		orderInfo.setOrderId(orderId);
		if(offerInfoList!=null) orderInfo.setOfferInfo(offerInfoList.toArray(new SchangeOfferInfo[]{}));
		SchangeOrderInfoResp resp = getImsWrapService().doChangeFutrueOrder(requestHead, orderInfo);
		
		if(resp!=null){
			
			String resstr = new StringBuilder()
			.append("DO_TRANSFER Debug Info : ").append("ResponsInfo ResCode:").append(resp.getResponseHead().getRspCode())
			.append(" DESC: ").append(resp.getResponseHead().getRspDesc())
			.append(" TransactionID: ").append(resp.getResponseHead().getRspTransactionID()).append(" CRM TransactionID: ").append(requestHead.getTransactionID()).toString();
			iCrmFSV().saveCRMCallBillingWebServiceLog(resstr, 0, "do_transfer");
			if(resp.getIsSuccess()!=null && resp.getIsSuccess()==0){
				return true;
			}
		}
		return false;
	}	
	
	
	public boolean doConfirmFutureOrderInfo(String shoppingId,Calendar shoppingDate,List<SconfirmOrder> orderList) throws Exception{
		
		RequestHead requestHead = buildRequestHead(shoppingId, CrmCallAmsWsConstants.DEFAULT_TENANT_ID, CrmCallAmsWsConstants.DO_CONFIRM_ORDER_BUSI_CODE);
		String str = new StringBuilder().append("doChangeOrderInfo===TENANT_ID: ").
				append(requestHead.getTenantId()).append(" acct_id: ")
				.append(" shopping_date: ").append(shoppingDate)
				.append(" shopping_id: ").append(shoppingId)
				.append(" crm_busi_mode: ").toString();
		iCrmFSV().saveCRMCallBillingWebServiceLog(str, 0L, "doConfirmFutureOrderInfo");
		
		SconfirmFutrueInfo futureCartInfo = new SconfirmFutrueInfo();
		futureCartInfo.setShoppingDate(shoppingDate);
		futureCartInfo.setShoppingId(shoppingId);
		futureCartInfo.setOrderList(orderList.toArray(new SconfirmOrder[]{}));
		SconfirmOrderResp resp = getImsWrapService().doConfirmFutrueOrder(requestHead, futureCartInfo);
		
		if(resp!=null){
			
			String resstr = new StringBuilder()
			.append("DO_TRANSFER Debug Info : ").append("ResponsInfo ResCode:").append(resp.getResponseHead().getRspCode())
			.append(" DESC: ").append(resp.getResponseHead().getRspDesc()).append("isSuccess:").append(resp.getIsSuccess())
			.append(" TransactionID: ").append(resp.getResponseHead().getRspTransactionID()).append(" CRM TransactionID: ").append(requestHead.getTransactionID()).toString();
			iCrmFSV().saveCRMCallBillingWebServiceLog(resstr, 0, "doConfirmFutureOrderInfo");
			if(resp.getIsSuccess()!=null && resp.getIsSuccess()==0){
				return true;
			}
		}
		return false;
	}
	/**
	 * 
	 * @Function: com.asiainfo.crm.so.exe.ws.crmcallams.ImsWrapServiceClient.do_transfer
	 * @Description:积分转移转换
	 *
	 * @param transactionID   业务流水号   orderCode，有责传，没有则传空
	 * @param tenantId
	 * @param sTransferReq
	 * @param notification_flag 通知标识  1：发消息  0：不发消息
	 * @param oneTimeFee  一次性费用
	 * @return
	 * @throws java.rmi.RemoteException
	 * @throws Exception
	 *
	 * @version:v1.0.0
	 * @author:cxy22xueyi
	 * @date:2013-11-4下午5:05:52
	 *
	 * Modification History:
	 * Date         Author      Version     Description
	 * -----------------------------------------------------------------
	 * 2013-11-4    cxy22xueyi    v1.0.0    积分转移转换
	 */
    public boolean do_transfer(String transactionID,String tenantId, STransferReq sTransferReq,Short notification_flag, OneTimeFee oneTimeFee) throws java.rmi.RemoteException,Exception{
    	//构建请求报文头
    	RequestHead requestHead = buildRequestHead(transactionID,CrmCallAmsWsConstants.DEFAULT_TENANT_ID,CrmCallAmsWsConstants.INSERT_RECEIPT_BUSI_CODE);
    	DoTransferResponse resp = getImsWrapService().doTransfer(requestHead, sTransferReq, notification_flag, oneTimeFee);
    	if(resp!=null){
			String str = new StringBuilder()
			.append("DO_TRANSFER Debug Info : ").append("ResponsInfo ResCode:").append(resp.getResponseHead().getRspCode())
			.append(" DESC: ").append(resp.getResponseHead().getRspDesc())
			.append(" TransactionID: ").append(resp.getResponseHead().getRspTransactionID()).append(" CRM TransactionID: ").append(requestHead.getTransactionID()).toString();
			iCrmFSV().saveCRMCallBillingWebServiceLog(str, 0, "do_transfer");
		}
    	if(resp!=null&&"0".equals(resp.getResponseHead())){
    		return true;
    	}else{
    		return false;
    	}
    }

	/**
	 * 
	 * 
	 * @Function: com.asiainfo.crm.so.exe.ws.crmcallams.ImsWrapServiceClient.do_adjustPoint
	 * @Description:积分调整
	 *
	 * @param transactionID  custOrderId
	 * @param tenantId   传1
	 * @param adjustPointReq   生失效期：给账户增加积分有效---标明了积分的生失效时间，如果不传，则默认账户的生效时间为该积分的生效时间，永久有效
	 *        OwnerType传0时候，传resourceId(手机号)  OwnerType传1时候，传acctId(账户) 为2就都传吧  
	 * @return
	 * @throws java.rmi.RemoteException
	 * @throws Exception
	 *
	 * @version:v1.0.0
	 * @author:cxy22xueyi
	 * @date:2013-11-1下午5:31:55
	 *
	 * Modification History:
	 * Date         Author      Version     Description
	 * -----------------------------------------------------------------
	 * 2013-11-1    cxy22xueyi   v1.0.0              积分调整
	 */
    public boolean do_adjustPoint(String transactionID,String tenantId,AdjustPointReq adjustPointReq)throws java.rmi.RemoteException,Exception{
    	//构建请求报文头
    	RequestHead requestHead = buildRequestHead(transactionID,CrmCallAmsWsConstants.DEFAULT_TENANT_ID,CrmCallAmsWsConstants.ADJUST_POINT_BUSI_CODE);
    	DoAdjustPointResponse response = getImsWrapService().doAdjustPoint(requestHead, adjustPointReq);
    	if(response!=null){
			String str = new StringBuilder()
			.append("DO_ADJUSTPOINT Debug Info : ").append("ResponsInfo ResCode:").append(response.getResponseHead().getRspCode())
			.append(" DESC: ").append(response.getResponseHead().getRspDesc())
			.append(" TransactionID: ").append(response.getResponseHead().getRspTransactionID()).append(" CRM TransactionID: ").append(requestHead.getTransactionID()).toString();
			iCrmFSV().saveCRMCallBillingWebServiceLog(str, 0, "do_adjustPoint");
		}
    	if(response!=null&&response.getResponseHead()!=null){
    		if("0".equals(response.getResponseHead().getRspCode())){
    			return true;
    		}else{
    			return false;
    		}
    	}else{
    		return false;
    	}
    }
    
    
    /**
	 * 
	 * 
	 * @Function: com.asiainfo.crm.so.exe.ws.crmcallams.ImsWrapServiceClient.do_rollbackPayment
	 * @Description: 回滚缴费
	 *
	 * @param transactionID   业务流水号   orderCode，有责传，没有则传空
	 * @param tenantId
	 * @param busiCode
	 * @return
	 * @throws java.rmi.RemoteException
	 * @throws Exception
	 *
	 * @version:v1.0.0
	 * @author:zhangxiang3
	 * @date:2013-11-1下午4:49:30
	 *
	 * Modification History:
	 * Date         Author      Version     Description
	 * -----------------------------------------------------------------
	 * 2013-11-1    zhangxiang3      v1.0.0  构建报文头
	 */
    
    public boolean do_rollbackPayment(String transactionID,String tenantId,String acct_id,String custOrderId,SFeeItem[] feeItemList,String order_date)throws java.rmi.RemoteException,Exception{
    	//构建请求报文头
    	RequestHead requestHead = buildRequestHead(transactionID,CrmCallAmsWsConstants.DEFAULT_TENANT_ID,CrmCallAmsWsConstants.ROLL_BACK_PAYMENT_BUSI_CODE);
    	SReceiptInfoReq req = new SReceiptInfoReq();
    	//req.setFeeItemList(feeItemList);
    	req.setOuterAcctId(acct_id);
    	req.setOrderId(custOrderId);
    	req.setOrderDate(order_date);
    	String string = new StringBuilder().append("acctId:").append(acct_id)
    			.append(" custOrderId:").append(custOrderId)
    			.append(" order_date:").append(order_date).toString();
    	iCrmFSV().saveCRMCallBillingWebServiceLog(string, 0, "do_rollbackPayment");
    	
    	DoRollbackPaymentResponse paymentResponse = getImsWrapService().doRollbackPayment(requestHead, req);
    	if(paymentResponse!=null){
    		String str = new StringBuilder().append("acctId:").append(acct_id)
        			.append(" custOrderId:").append(custOrderId)
        			.append(" order_date:").append(order_date).toString();
        	iCrmFSV().saveCRMCallBillingWebServiceLog(str, 0, "do_rollbackPayment");
		}
		if (paymentResponse != null && "0".equals(paymentResponse.getResponseHead().getRspCode())) {
			String str1 = new StringBuilder().append("paymentResponse.getResponseHead().getRspCode():").append(paymentResponse.getResponseHead().getRspCode()).toString();
			iCrmFSV().saveCRMCallBillingWebServiceLog(str1, 0, "do_rollbackPayment");
			return true;
		} else {
			return false;
		}
    }

    

		/**
		 * 
		 * 
		 * @Function: com.asiainfo.crm.so.exe.ws.crmcallams.ImsWrapServiceClient.buildRequestHead
		 * @Description: 构建RequestHead
		 *
		 * @param transactionID  custOrderId
		 * @param tenantId
		 * @param busiCode
		 * @return
		 * @throws java.rmi.RemoteException
		 * @throws Exception
		 *
		 * @version:v1.0.0
		 * @author:cxy22xueyi
		 * @date:2013-11-1下午4:49:30
		 *
		 * Modification History:
		 * Date         Author      Version     Description
		 * -----------------------------------------------------------------
		 * 2013-11-1    cxy22xueyi      v1.0.0  构建报文头
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
			//多租户标识
			if(StringUtils.isBlank(tenantId)){
				tenantId = CrmCallAmsWsConstants.DEFAULT_TENANT_ID;
			}
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
			String reqTime = sdf.format(new Date());
			String opId = (SessionManager.getUser()!=null) 
					? SessionManager.getUser().getID()+"":"";
			//新建RequestHead对象
			RequestHead requestHead = new RequestHead();
			//业务编码
			requestHead.setAppKey("SO101");
			requestHead.setReqTime(reqTime);
			requestHead.setChargeFlag("0");
			requestHead.setNotifyFlag("0");
			requestHead.setBusiCode(busiCode);
			requestHead.setTransactionID(transactionID);
			requestHead.setTenantId(CrmCallAmsWsConstants.getTenantId());
			requestHead.setAcceptChannelType(CrmCallAmsWsConstants.ACCEPT_CHANNEL_TYPE);
			requestHead.setAcceptChannelCode(CrmCallAmsWsConstants.ACCEP_CHANNEL_CODE);
			requestHead.setAcceptOpId(opId);
			requestHead.setAcceptStaffId(opId);
			return requestHead;
		}
		
		
		public DoInstalChangeResponse do_instalChange(String transactionID,SInstalChangeWeb instalChangeWeb) throws java.rmi.RemoteException,Exception{
			//构建请求报文头
	    	RequestHead requestHead = buildRequestHead(transactionID,CrmCallAmsWsConstants.DEFAULT_TENANT_ID,CrmCallAmsWsConstants.INSTAL_CHANGE_BUSI_CODE);
	    	SInstalChangeReq req = new SInstalChangeReq();
	    	req.setInstalChangeWeb(instalChangeWeb);
	    	DoInstalChangeResponse response = getImsWrapService().doInstalChange(requestHead, req);
	    	return response;
		}
		
		public AdjustMultiBillResponse do_adjustMultiBill(String transactionID,long acctId,long resourceId,int measureId,
				String adjustReason,List<AdjustMultiBillDtl> listAdjustDtl)  throws java.rmi.RemoteException,Exception{
			//构建请求报文头
	    	RequestHead requestHead = buildRequestHead(transactionID,CrmCallAmsWsConstants.DEFAULT_TENANT_ID,CrmCallAmsWsConstants.ADJUST_MUTIL_BILL_BUSI_CODE);
	    	AdjustMultiBillInReq req = new AdjustMultiBillInReq();
	    	req.setAcctId(acctId);
	    	req.setResourceId(resourceId);
	    	req.setMeasureId(measureId);
	    	req.setAdjustReason(adjustReason);
	    	req.setListAdjustDtl((AdjustMultiBillDtl[])listAdjustDtl.toArray(new AdjustMultiBillDtl[0]));
	    	AdjustMultiBillResponse response = getImsWrapService().doAdjustMultiBill(requestHead,req);
			return response;
		}
		
		public SAdjustFinesResp do_adjustFines(String transactionID,long acctId,long resourceId,List<SAmountDetailInfo> detailInfoList)  throws java.rmi.RemoteException,Exception{
			//构建请求报文头
	    	RequestHead requestHead = buildRequestHead(transactionID,CrmCallAmsWsConstants.DEFAULT_TENANT_ID,CrmCallAmsWsConstants.ADJUST_FINES_BILL_BUSI_CODE);
	    	SAdjustFinesReq req = new SAdjustFinesReq();
	    	req.setAcctId(acctId);
	    	req.setResourceId(resourceId);
	    	req.setSAmountDetailInfo((SAmountDetailInfo[])detailInfoList.toArray(new SAmountDetailInfo[0]));
	    	SAdjustFinesResp response = getImsWrapService().doAdjustFines(requestHead, req);
			return response;
		}
		
	public DoRegretRefundResponse do_regretRefund(String transactionID,	long resourceId, List<SRegretOrderInfo> orderList)
			throws RemoteException, Exception {
			//构建请求报文头
	    	RequestHead requestHead = buildRequestHead(transactionID,CrmCallAmsWsConstants.DEFAULT_TENANT_ID,CrmCallAmsWsConstants.BUSI_CODE_REGRET_REFUND);
	    	SRegretRefundReq sRegretRefundReq = new SRegretRefundReq();
	    	sRegretRefundReq.setResourceId(resourceId);
	    	if(orderList != null && !orderList.isEmpty()){
		    	sRegretRefundReq.setOrderList((SRegretOrderInfo[])orderList.toArray(new SRegretOrderInfo[0]));

	    	}
	    	DoRegretRefundResponse response = getImsWrapService().doRegretRefund(requestHead, sRegretRefundReq);
			return response;
		}
	
	public DoUnifiedPayResponse do_osePay(String transactionID, String shoppingId, Timestamp shoppingDate) throws RemoteException, Exception {
		DoUnifiedPayResponse response = null;
		// 业务流水号
		if (StringUtils.isNotBlank(transactionID)) {
			if(!transactionID.contains(CrmCallAmsWsConstants.SYSTEM_ID)){
				transactionID = CrmCallAmsWsConstants.SYSTEM_ID + transactionID;
			}
		} else {
			SimpleDateFormat df = new SimpleDateFormat(CrmCallAmsWsConstants.TIME_FORMATE_STR);// 设置日期格式
			String dateTimeStr = df.format(new Date());
			transactionID = CrmCallAmsWsConstants.SYSTEM_ID + dateTimeStr + "1063";
		}
		if (log.isInfoEnabled()) {
			String str = transactionID.toString();
			iCrmFSV().saveCRMCallBillingWebServiceLog(str, Long.parseLong(shoppingId), "DoUnifiedPayResponse");
		}
		String tenantId = TenantIDFactory.getTenant();
		RequestHead head = this.buildRequestHead(transactionID, tenantId, "1063");
		DoUnifiedPayReq req = new DoUnifiedPayReq();
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(shoppingDate);
		SPayInfo sPayInfo = new SPayInfo();
		sPayInfo.setShoppingId(shoppingId);
		sPayInfo.setShoppingDate(calendar);
		sPayInfo.setPaymentStatus((short)2);
		sPayInfo.setRetailInvoiceType(0);
		req.setPayInfo(sPayInfo);
		response = getImsWrapService().doUnifiedPay(head, req);
		if(response!=null){
			String str = new StringBuilder()
			.append("DO_OSEPAY Debug Info : ").append("ResponsInfo ResCode:").append(response.getResponseHead().getRspCode())
			.append(" DESC: ").append(response.getResponseHead().getRspDesc())
			.append(" TransactionID: ").append(response.getResponseHead().getRspTransactionID())
			.append(" shoppingId: ").append(shoppingId)
			.append(" PaymentStatus: ").append(2)
			.append(" CRM TransactionID: ").append(head.getTransactionID()).toString();
			iCrmFSV().saveCRMCallBillingWebServiceLog(str, Long.parseLong(shoppingId), "DoUnifiedPayResponse");
		}
		return response;
	}
	
	/**
	 * @Function: com.asiainfo.crm.so.exe.ws.crmcallams.ImsWrapServiceClient.do_updateOrderUserId
	 * @Description: 修改分期订购用户id接口
	 * @Description: 构建RequestHead
	 * @param orderUserInfo
	 *            OrderUserInfo
	 *            com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.OrderUserInfo结构： 约束为1 
	 *            参数名称 		约束 		类型 		描述 
	 *            orderId 	1 		Long	 订单编号
	 *            orderDate 1 		Date 	订单时间 
	 *            accId 	1 		Long 	统一支付账户ID 
	 *            userId	1 		Long   	修改后的用户ID  
	 *            phoneNumber 1 	String 	与用户ID对应电话号码
	 * @return：
	 * @throws：异常描述
	 * 
	 * @version:
	 * @author:
	 * @date:
	 * 
	 *        Modification History: Date Author Version Description
	 *        ---------------------------------------------------------*
	 *        2015/9/14 wangyu18
	 */
	public UpdateOrderUserIdResp do_updateOrderUserId(String transactionID,long accId,Date orderDate,long  orderId,String phoneNumber,long userId
			) throws java.rmi.RemoteException,
			Exception {
		// 构建请求报文头
		RequestHead requestHead = buildRequestHead(transactionID,
				CrmCallAmsWsConstants.DEFAULT_TENANT_ID,
				CrmCallAmsWsConstants.Update_OrderUserID_BUSI_CODE);
		Calendar calendarOrderDate = Calendar. getInstance(); 
		if (null != orderDate) {
			calendarOrderDate.setTime(orderDate);
		}
		OrderUserInfo orderUserInfo = new OrderUserInfo();
		orderUserInfo.setAccId(accId);
		orderUserInfo.setOrderDate(calendarOrderDate);
		orderUserInfo.setOrderId(orderId);
		orderUserInfo.setPhoneNumber(phoneNumber);
		orderUserInfo.setUserId(userId);
		
		UpdateOrderUserIdResp nUpdateOrderUserIdResp = getImsWrapService()
				.doUpdateOrderUserId(requestHead, orderUserInfo);
		if (nUpdateOrderUserIdResp != null) {
			String str = new StringBuilder()
					.append("Do_updateOrderUserId Debug Info : ")
					.append("ResponsInfo ResCode: ")
					.append(nUpdateOrderUserIdResp.getResponseHead()
							.getRspCode())
					.append(" DESC: ")
					.append(nUpdateOrderUserIdResp.getResponseHead()
							.getRspDesc())
					.append(" TransactionID: ")
					.append(nUpdateOrderUserIdResp.getResponseHead()
							.getRspTransactionID())
					.append(" CRM TransactionID: ")
					.append(requestHead.getTransactionID()).toString();
			iCrmFSV().saveCRMCallBillingWebServiceLog(str, 0L,
					"do_updateOrderUserId");
		}
		return nUpdateOrderUserIdResp;
	}
	
	/**
	 * 反悔退费接口
	 * @param transactionID
	 * @param acctId
	 * @param orderDate
	 * @param orderId
	 * @param regretType1:反悔一次性费用;2:开户全反悔;3:只反悔终端
	 * @param userId
	 * @param imei
	 * @param upcOfferId
	 * @return
	 * @throws java.rmi.RemoteException
	 * @throws Exception
	 */
	public DoRegretFeeResponse do_regretFee(String transactionID,long acctId,Date orderDate,String orderId,int regretType,long userId,
			String imei,long upcOfferId) throws java.rmi.RemoteException,
			Exception {
		// 构建请求报文头
		RequestHead requestHead = buildRequestHead(transactionID,
				CrmCallAmsWsConstants.DEFAULT_TENANT_ID,
				CrmCallAmsWsConstants.Regret_fee_BUSI_CODE);
		Calendar calendarOrderDate = Calendar. getInstance(); 
		if (null != orderDate) {
			calendarOrderDate.setTime(orderDate);
		}
		SRegretInfo regretInfo = new SRegretInfo();
		regretInfo.setAcctId(acctId);
		regretInfo.setOrderDate(calendarOrderDate);
		regretInfo.setOrderId(orderId);
		regretInfo.setRegretType(regretType);
		regretInfo.setResourceId(userId);
		if( upcOfferId>0){
			List<SsOfferInfo> offerInfos = new ArrayList<SsOfferInfo>();
			SsOfferInfo offerInfo = new SsOfferInfo();
			offerInfo.setIMEI(imei);
			offerInfo.setUpcOfferId(upcOfferId);
			offerInfos.add(offerInfo);
			regretInfo.setOfferInfo((SsOfferInfo[])offerInfos.toArray(new SsOfferInfo[0]));
		}
		log.info("requestHead:"+requestHead);
		log.info("regretInfo.getOfferInfo:"+regretInfo.getOfferInfo());
		DoRegretFeeResponse regretRefundResponse = getImsWrapService()
				.doRegretFee(requestHead, regretInfo);
		if (regretRefundResponse != null) {
			String str = new StringBuilder()
					.append("Do_regretFee Debug Info : ")
					.append("ResponsInfo ResCode: ")
					.append(regretRefundResponse.getResponseHead()
							.getRspCode())
					.append(" DESC: ")
					.append(regretRefundResponse.getResponseHead()
							.getRspDesc())
					.append(" TransactionID: ")
					.append(regretRefundResponse.getResponseHead()
							.getRspTransactionID())
					.append(" CRM TransactionID: ")
					.append(requestHead.getTransactionID()).toString();
			iCrmFSV().saveCRMCallBillingWebServiceLog(str, userId,
					"do_regretFee");
		}
		return regretRefundResponse;
	}

	/**
	 * 反悔退费接口
	 * @param transactionID
	 * @param acctId
	 * @param orderDate
	 * @param orderId
	 * @param regretType1:反悔一次性费用;2:开户全反悔;3:只反悔终端
	 * @param userId
	 * @param terminalList
	 * @return
	 * @throws java.rmi.RemoteException
	 * @throws Exception
	 */
	public DoRegretFeeResponse do_regretFeeNew(String transactionID,long acctId,Date orderDate,String orderId,int regretType,long userId,List<SsOfferInfo> terminalList)
			throws java.rmi.RemoteException,
			Exception {
		// 构建请求报文头
		RequestHead requestHead = buildRequestHead(transactionID,
				CrmCallAmsWsConstants.DEFAULT_TENANT_ID,
				CrmCallAmsWsConstants.Regret_fee_BUSI_CODE);
		Calendar calendarOrderDate = Calendar. getInstance(); 
		if (null != orderDate) {
			calendarOrderDate.setTime(orderDate);
		}
		SRegretInfo regretInfo = new SRegretInfo();
		regretInfo.setAcctId(acctId);
		regretInfo.setOrderDate(calendarOrderDate);
		regretInfo.setOrderId(orderId);
		regretInfo.setRegretType(regretType);
		regretInfo.setResourceId(userId);
		if( terminalList!=null && terminalList.size()>0){
			regretInfo.setOfferInfo((SsOfferInfo[])terminalList.toArray(new SsOfferInfo[0]));
		}
		log.info("requestHead:"+requestHead);
		log.info("regretInfo.getOfferInfo:"+regretInfo.getOfferInfo());
		DoRegretFeeResponse regretRefundResponse = getImsWrapService()
				.doRegretFee(requestHead, regretInfo);
		if (regretRefundResponse != null) {
			String str = new StringBuilder()
					.append("Do_regretFee Debug Info : ")
					.append("ResponsInfo ResCode: ")
					.append(regretRefundResponse.getResponseHead()
							.getRspCode())
					.append(" DESC: ")
					.append(regretRefundResponse.getResponseHead()
							.getRspDesc())
					.append(" TransactionID: ")
					.append(regretRefundResponse.getResponseHead()
							.getRspTransactionID())
					.append(" CRM TransactionID: ")
					.append(requestHead.getTransactionID()).toString();
			iCrmFSV().saveCRMCallBillingWebServiceLog(str, userId,
					"do_regretFee");
		}
		return regretRefundResponse;
	}
	
	public DoCancelInstalmentResponse doCancelInstalment(long instalId,long acctId,String orderId,Date validDate) throws Exception{
		RequestHead requestHead = buildRequestHead(orderId, CrmCallAmsWsConstants.DEFAULT_TENANT_ID, CrmCallAmsWsConstants.DO_CANCEL_INSTALMENT_BUSI_CODE);
		String str = new StringBuilder().append("doChangeOrderInfo===TENANT_ID: ").
				append(requestHead.getTenantId())
				.append(" instalId: ").append(instalId)
				.append(" acctId: ").append(acctId)
				.append(" orderId: ").append(orderId)
				.append(" validDate: ").append(validDate).toString();
		iCrmFSV().saveCRMCallBillingWebServiceLog(str, 0L, "doCancelInstalment");
		
		SCancelInstalmentReq cancelInstalmentReq = new SCancelInstalmentReq();
		cancelInstalmentReq.setInstalId(instalId);
		cancelInstalmentReq.setOuterAcctId(String.valueOf(acctId));
		cancelInstalmentReq.setOrderId(orderId);
		Calendar calendarValidDate = Calendar. getInstance(); 
		if (null != validDate) {
			calendarValidDate.setTime(validDate);
		}
		cancelInstalmentReq.setValidDate(calendarValidDate);
		DoCancelInstalmentResponse resp = getImsWrapService().doCancelInstalment(requestHead, cancelInstalmentReq);
		
		if(resp!=null){
			
			String resstr = new StringBuilder()
			.append("DoCancelInstalment Debug Info : ").append("ResponsInfo ResCode:").append(resp.getResponseHead().getRspCode())
			.append(" DESC: ").append(resp.getResponseHead().getRspDesc())
			.append(" TransactionID: ").append(resp.getResponseHead().getRspTransactionID()).append(" CRM TransactionID: ").append(requestHead.getTransactionID()).toString();
			iCrmFSV().saveCRMCallBillingWebServiceLog(resstr, 0, "doCancelInstalment");
		}
		return resp;
	}
	
	public boolean doCancelOrder(long userId,String transactionID,SOrderInfo orderInfo) throws java.rmi.RemoteException, Exception{
		RequestHead requestHead = buildRequestHead(transactionID, CrmCallAmsWsConstants.DEFAULT_TENANT_ID, CrmCallAmsWsConstants.DO_CANCEL_ORDER_BUSI_CODE);
		DoCancelOrderReq doCancelOrderReq = new DoCancelOrderReq(orderInfo);
		String str = new StringBuilder().append("doCancelOrder===TENANT_ID: ").
    			append(requestHead.getTenantId()).append(" acct_id: ")
    			.append(orderInfo.getAcctId()).append(" user_id: ").append(userId)
    			.append(" phone_id: ").append(orderInfo.getPhoneId()).append(" order_date: ")
    			.append(orderInfo.getOrderDate()).append(" order_id: ").append(orderInfo.getOrderId())
    			.append(" transactionID: ").append(transactionID).toString();
		iCrmFSV().saveCRMCallBillingWebServiceLog(str, userId, "doCancelOrder");
		
		DoCancelOrderResponse  cancelOrderResponse = getImsWrapService().doCancelOrder(requestHead, doCancelOrderReq);
    	if(cancelOrderResponse != null && cancelOrderResponse.getResponseHead() != null){
    		String string = new StringBuilder().append("doCancelOrder Debug Info : ").append("ResponsInfo ResCode:").append(cancelOrderResponse.getResponseHead().getRspCode()).append(" DESC: ")
					.append(cancelOrderResponse.getResponseHead().getRspDesc()).append(" TransactionID: ").append(cancelOrderResponse.getResponseHead().getRspTransactionID())
					.append(" CRM TransactionID: ").append(requestHead.getTransactionID()).toString();
			iCrmFSV().saveCRMCallBillingWebServiceLog(string, userId, "doCancelOrder");
    		
    		if("0".equals(cancelOrderResponse.getResponseHead().getRspCode())){
    			return true;
    		}else{
    			return false;
    		}
    	}else{
    		return false;
    	}
	}
}
