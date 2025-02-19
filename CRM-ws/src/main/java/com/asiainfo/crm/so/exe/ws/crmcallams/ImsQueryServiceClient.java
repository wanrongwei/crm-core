package com.asiainfo.crm.so.exe.ws.crmcallams;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.rpc.ServiceException;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.appframe.ext.exeframe.ws.client.WsUtil;
import com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.AcctStatusParamReq;
import com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.AcctStatusResponse;
import com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.IImsQueryServiceWs;
import com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.IImsQueryService_ServiceLocator;
import com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.RequestHead;
import com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.SOrderProductFeeRequest;
import com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.SOrderProductFeeResponse;
import com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.SProductOrder;
import com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.SUnOrderProductFeeResponse;
import com.asiainfo.crm.so.teaminvoke.out.service.interfaces.ICrmFSV;


public class ImsQueryServiceClient {
	/**
	 * cfg_ws_client表中配置	
	 */
	private static final String CFG_WS_QUERY_CLIENT_CODE = "IMS_QUERY_SERVICE";
	
	private static ImsQueryServiceClient client = null;
	
	private static transient Log log = LogFactory.getLog(ImsQueryServiceClient.class);
	
	public static ImsQueryServiceClient getInstance() throws Exception {
		if (null == client) {
			client = new ImsQueryServiceClient();
		}
		return client;
	}
	
	private IImsQueryService_ServiceLocator queryService = null;
	
	private ImsQueryServiceClient() {
		queryService = new IImsQueryService_ServiceLocator();
	}
	
	public IImsQueryService_ServiceLocator getQueryService() {
		return queryService;
	}
	
	private ICrmFSV iCrmFSV(){
		return (ICrmFSV)ServiceFactory.getService(ICrmFSV.class);
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
	 * 
	 * @Function: buildRequestHead
	 * @Description:构建RequestHead
	 *
	 * @param transactionID  custOrderId
	 * @param tenantId regionId
	 * @param busiCode
	 * @return
	 * @throws java.rmi.RemoteException
	 * @throws Exception
	 *
	 * @version:
	 * @author:
	 * @date:
	 *
	 * Modification History:
	 * Date         Author      Version     Description
	 * -----------------------------------------------------------------
	 * 
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
	
	 /**   
     * @Function: com.asiainfo.crm.so.exe.ws.crmcallams.ImsQueryServiceClient.do_queryNoSubscriptionFee
     * @Description: 未订购产品费用查询接口
     * @param transactionID   业务流水号   orderCode，有则传，没有则传空
     * @param tenantId
     * @param object_id 账户或用户ID   约束为1
     * @param object_type 对象类型 0:用户,1:帐户   约束为1
     * @param billing_type 是否算税0：不算税,1:算税   约束为1
     * @param productOrderList  产品结构    约束为1
			productOrderList结构：
			参数名称                                                   约束                                       类型                                       描述
			prodItemList         1       SProductOrder[]   产品数组
			 
			 
			com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.SProductOrder结构：
			参数名称                                                   约束                                       类型                                       描述
			offerId              1           Long          销售品id
			productId            1           Long          产品id
			reguidPriceParam     ?       ExtendParamList   二次议价参数列表
			paramList            ?       SProductParamList 特征值参数列表
			validDate            1           Date          产品生效时间
			expireDate           1           Date          产品失效时间
			 
			ExtendParamList结构
			参数名称                                                   约束                                       类型                                       描述
			extendParamListItem  1       ExtendParam[]     议价参数数组
			 
			com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.ExtendParam结构
			参数名称                                                   约束                                       类型                                       描述
			paramName            1           String        参数id
			paramValue           1           String        参数取值
			validDate            1           Date          参数生效时间
			expireDate           1           Date          参数失效时间
			groupId              1           Long          分组编号(默认值-999)
			 
			SProductParamList结构
			参数名称                                                             约束                                       类型                                       描述
			sProductParamListItem   1      SProductParam[]   特征值参数数组
			 
			com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.SProductParam结构
			参数名称                                                   约束                                       类型                                       描述
			paramId              1          Integer       特征值参数id
			paramName            1          String        参数名称
			paramValue           1          String        参数取值
			groupId              1          Long          分组编号(默认值-999)
			validDate            1          Date          参数生效时间
			expireDate           1          Date          参数失效时间
     * @return：
     * @throws：异常描述
     *
     * @version: v1.0.0
     * @author: zhouwu
     * @date: 2015 07 29 
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * 2015/7/30    zhaofx   
     */
    public SUnOrderProductFeeResponse do_queryNoSubscriptionFee(String transactionID,String tenantId,long object_id,long object_type,long product_id,long billing_type,SProductOrder[] productOrderList)throws java.rmi.RemoteException, Exception{ 
    	//构建请求报文头
    	RequestHead requestHead = buildRequestHead(transactionID,CrmCallAmsWsConstants.DEFAULT_TENANT_ID,CrmCallAmsWsConstants.Query_No_Subscription_Fee_BUSI_CODE);
    	
    	SOrderProductFeeRequest orderProductFeeRequest = new SOrderProductFeeRequest();
    	orderProductFeeRequest.setObjectId(object_id);//账户或用户ID
    	orderProductFeeRequest.setObjectType(object_type);//对象类型 0:用户,1:帐户
    	orderProductFeeRequest.setTax_flag(billing_type);//是否算税0：不算税,1:算税
    	orderProductFeeRequest.setProdOrderList(productOrderList);//产品结构  
    	SUnOrderProductFeeResponse  nOrderProductFeeResponse = getImsQueryServiceWs().doQueryUnOrderProductFee(requestHead, orderProductFeeRequest);
    	if(nOrderProductFeeResponse!=null){
    		String str = new StringBuilder()
			.append("Do_queryNoSubscriptionFee Debug Info : ").append("ResponsInfo ResCode:").append(nOrderProductFeeResponse.getResponseHead().getRspCode())
			.append(" DESC: ").append(nOrderProductFeeResponse.getResponseHead().getRspDesc())
			.append(" TransactionID: ").append(nOrderProductFeeResponse.getResponseHead().getRspTransactionID()).append(" CRM TransactionID: ").append(requestHead.getTransactionID()).toString();
			 iCrmFSV().saveCRMCallBillingWebServiceLog(str,0L,"do_queryUnPayFee");
		}
    	return nOrderProductFeeResponse;
    	
    }
    
    /**   
     * @Function: com.asiainfo.crm.so.exe.ws.crmcallams.ImsQueryServiceClient.do_querySubscriptionFee
     * @Description: 已订购产品费用查询接口
     * @param transactionID   业务流水号   orderCode，有则传，没有则传空
     * @param tenantId
     * @param object_id 账户或用户ID    约束为1
     * @param object_type 对象类型 0:用户,1:帐户     约束为1
     * productOrderList 里面对象: com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.SProductOrder结构：     约束为1
		参数名称                  约束          类型                   描述          
		offerId    1   Long     销售品id
		productId  1   Long     产品id
		validDate  1   Date     产品生效时间
		expireDate 1   Date     产品失效时间
     * @return：
     * @throws：异常描述
     *
     * @version: v1.0.0
     * @author: zhouwu
     * @date: 2015 07 29 
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * 2015/7/30    zhaofx
     */
    public SOrderProductFeeResponse do_querySubscriptionFee(String transactionID,String tenantId,long object_id,long object_type,SProductOrder[] productOrderList)throws java.rmi.RemoteException, Exception{ 
    	//构建请求报文头
    	RequestHead requestHead = buildRequestHead(transactionID,CrmCallAmsWsConstants.DEFAULT_TENANT_ID,CrmCallAmsWsConstants.Query_Subscription_Fee_BUSI_CODE);
    	SOrderProductFeeRequest orderProductFeeRequest = new SOrderProductFeeRequest();
    	orderProductFeeRequest.setObjectId(object_id);//账户或用户ID
    	orderProductFeeRequest.setObjectType(object_type);//对象类型 0:用户,1:帐户
    	orderProductFeeRequest.setProdOrderList(productOrderList);//产品结构  
    	SOrderProductFeeResponse  nOrderProductFeeResponse = getImsQueryServiceWs().doQueryOrderProductFee(requestHead, orderProductFeeRequest);
    	if(nOrderProductFeeResponse!=null){
    		String str = new StringBuilder()
			.append("Do_querySubscriptionFee Debug Info : ").append("ResponsInfo ResCode:").append(nOrderProductFeeResponse.getResponseHead().getRspCode())
			.append(" DESC: ").append(nOrderProductFeeResponse.getResponseHead().getRspDesc())
			.append(" TransactionID: ").append(nOrderProductFeeResponse.getResponseHead().getRspTransactionID()).append(" CRM TransactionID: ").append(requestHead.getTransactionID()).toString();
			 iCrmFSV().saveCRMCallBillingWebServiceLog(str,0L,"do_queryUnPayFee");
		}
    	return nOrderProductFeeResponse;
    }
    
    public AcctStatusResponse do_queryAcctStatus(String transactionID,long acctId)throws Exception{ 
    	//构建请求报文头
    	RequestHead requestHead = buildRequestHead(transactionID,CrmCallAmsWsConstants.DEFAULT_TENANT_ID,CrmCallAmsWsConstants.Query_Account_Status);
    	AcctStatusParamReq acctStatusParamReq = new AcctStatusParamReq();
    	acctStatusParamReq.setAcctId(acctId);//账户Id
    	
    	AcctStatusResponse  acctStatusResponse = getImsQueryServiceWs().doQueryAcctStatus(requestHead, acctStatusParamReq);
    	if(acctStatusResponse != null){
    		String str = new StringBuilder()
			.append("Do_queryAcctStatus Debug Info : ").append("ResponsInfo ResCode:").append(acctStatusResponse.getResponseHead().getRspCode())
			.append(" DESC: ").append(acctStatusResponse.getResponseHead().getRspDesc())
			.append(" TransactionID: ").append(acctStatusResponse.getResponseHead().getRspTransactionID()).append(" CRM TransactionID: ").append(requestHead.getTransactionID()).toString();
			 iCrmFSV().saveCRMCallBillingWebServiceLog(str,0L,"do_queryAcctStatus");
		}
    	return acctStatusResponse;
    }

}
