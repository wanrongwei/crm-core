package com.asiainfo.crm.inter.exe.webservice.client.cbb;

import java.net.URL;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.constants.Style;
import org.apache.axis.constants.Use;
import org.apache.axis.description.OperationDesc;
import org.apache.axis.description.ParameterDesc;
import org.apache.axis.message.MessageElement;
import org.apache.axis.message.SOAPHeaderElement;

import com.ai.appframe2.common.DataType;
import com.ai.appframe2.common.SessionManager;
import com.ai.appframe2.complex.cache.CacheFactory;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.appframe.ext.exeframe.ws.client.cache.WsClientCacheImpl;
import com.asiainfo.appframe.ext.exeframe.ws.query.impl.po.CfgWsClient;
import com.asiainfo.crm.util.CommonUtil;
import com.asiainfo.crm.inter.exe.webservice.client.cpr.CPRServiceClient;
import com.asiainfo.crm.inter.exe.webservice.client.cpr.log.service.interfaces.IInterCallLogSV;

public class CbbServiceClient extends org.apache.axis.client.Stub {

	protected SOAPHeaderElement getRequestHeaders() throws org.apache.axis.AxisFault {

		SOAPHeaderElement soapHeaderElement = new SOAPHeaderElement("", "RequestHeader");
		String appKey = "8000040051";
		String date8 = new SimpleDateFormat("yyyyMMdd").format(new Date());
		String date10 = CommonUtil.getTransactionNum(1999999999, 10);
		String transactionID = appKey + date8 + date10;
		String ReqTime = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		String staffId = null;
		String tenantId = null;
		UserInfoInterface user = SessionManager.getUser();
		if (null != user) {
			tenantId = user.getTenantId();
			staffId = user.get("STAFF_ID") == null ? "" : user.get("STAFF_ID").toString();
		}
		try {
			soapHeaderElement.setPrefix("soa");
			soapHeaderElement.setNamespaceURI("http://services.pl.telenor.dk/veris/messages");
			soapHeaderElement.addChild(new MessageElement(new QName("AppKey"), appKey));
			soapHeaderElement.addChild(new MessageElement(new QName("TransactionID"), transactionID));
			soapHeaderElement.addChild(new MessageElement(new QName("ReqTime"), ReqTime));
			soapHeaderElement.addChild(new MessageElement(new QName("Version"), "0.1"));
			soapHeaderElement.addChild(new MessageElement(new QName("AcceptChannelType"), "23"));
			soapHeaderElement.addChild(new MessageElement(new QName("TenantId"), tenantId));
			soapHeaderElement.addChild(new MessageElement(new QName("AcceptStaffId"), staffId));
			soapHeaderElement.addChild(new MessageElement(new QName("AcceptOpId"), 1));
		} catch (SOAPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return soapHeaderElement;
	}

	/**
	 * 查询信息
	 * 
	 * @param params
	 * @return
	 * @throws Exception
	 */
	public void setHeader(Call call) throws Exception {
		SOAPHeaderElement header = this.getRequestHeaders();
		setHeader(header);
		setRequestHeaders(call);
	}

	public static Map deleteNumber(Map params) throws Exception {

		CfgWsClient objCfgWsClient = (CfgWsClient) CacheFactory.get(WsClientCacheImpl.class, "C^" + "CRM_CBB_URL");
		String cbbUrl = objCfgWsClient.getUrlAddress();
		OperationDesc oper = getOper("DeleteNumber", DeleteNumberRequest.class, DeleteNumberResponse.class);
		Call call = getCallByOper(oper);
		DeleteNumberRequest req = new DeleteNumberRequest();
		DeleteNumberRequestBody body = new DeleteNumberRequestBody();
		org.apache.commons.beanutils.BeanUtils.copyProperties(body, params);
		req.setRequestBody((DeleteNumberRequestBody) body);

		call.setTargetEndpointAddress(new URL(cbbUrl));
		// WSDL里面描述的操作名称
		call.setOperationName(new QName("", "DeleteNumber"));
		// 给方法传递参数，并且调用方法
		new CbbServiceClient().setHeader(call);
		//new CPRServiceClient().setHeader(call);
		DeleteNumberResponse result = (DeleteNumberResponse) call.invoke(new Object[] { req });
		DeleteNumberResponseBody responseBody = result.getResponseBody();
		Map queryResults = new HashMap();
		queryResults.put("resultFlag", responseBody.getResultFlag());
		queryResults.put("errorCode", responseBody.getErrorCode());
		queryResults.put("errorMessage", responseBody.getErrorMessage());

		// 写入调用接口日志到数据库
		IInterCallLogSV sv = (IInterCallLogSV) ServiceFactory.getService(IInterCallLogSV.class);
		sv.saveInterCallLog(DataType.getAsString(params.get("MSISDN")), new Timestamp(System.currentTimeMillis()), responseBody.getResultFlag(),
				responseBody.getErrorCode() + ":" + responseBody.getErrorMessage());

		return queryResults;
	}
	
	public static Map notifyDeleteResult(Map params) throws Exception {

		CfgWsClient objCfgWsClient = (CfgWsClient) CacheFactory.get(WsClientCacheImpl.class, "C^" + "CRM_CBB_URL");
		String cbbUrl = objCfgWsClient.getUrlAddress();
		OperationDesc oper = getOper("NotifyDeleteResult", NotifyDeleteResultRequest.class, NotifyDeleteResultResponse.class);
		Call call = getCallByOper(oper);
		NotifyDeleteResultRequest req = new NotifyDeleteResultRequest();
		
		NotifyDeleteRequestBody body = new NotifyDeleteRequestBody();
		org.apache.commons.beanutils.BeanUtils.copyProperties(body, params);
		//Object body = BeanUtils.setProperties(NotifyDeleteRequestBody.class, params);
		req.setRequestBody((NotifyDeleteRequestBody) body);

		call.setTargetEndpointAddress(new URL(cbbUrl));
		// WSDL里面描述的操作名称
		call.setOperationName(new QName("", "NotifyDeleteResult"));
		// 给方法传递参数，并且调用方法
		new CbbServiceClient().setHeader(call);
		//new CPRServiceClient().setHeader(call);
		NotifyDeleteResultResponse result = (NotifyDeleteResultResponse) call.invoke(new Object[] { req });
		NotifyDeleteResponseBody responseBody = result.getResponseBody();
		Map queryResults = new HashMap();
		queryResults.put("resultFlag", responseBody.getResultFlag());
		queryResults.put("errorCode", responseBody.getErrorCode());
		queryResults.put("errorMessage", responseBody.getErrorMessage());
		// 写入调用接口日志到数据库
		IInterCallLogSV sv = (IInterCallLogSV) ServiceFactory.getService(IInterCallLogSV.class);
		sv.saveInterCallLog(DataType.getAsString(params.get("MSISDN")), new Timestamp(System.currentTimeMillis()), responseBody.getResultFlag(),
				responseBody.getErrorCode() + ":" + responseBody.getErrorMessage());

		return queryResults;
	}

	private static OperationDesc getOper(String msg, Class reqClass, Class rspClass) {
		OperationDesc oper = new OperationDesc();
		String reqStr = msg + "Request";
		String rspStr = msg + "Response";
		oper.setName(msg);
		ParameterDesc param = new ParameterDesc(new QName("http://services.pl.telenor.dk/veris/messages", reqStr),
				ParameterDesc.IN, new QName("http://services.pl.telenor.dk/veris/types", reqClass.getSimpleName()),
				reqClass, false, false);
		oper.addParameter(param);
		oper.setReturnType(new QName("http://services.pl.telenor.dk/veris/types", rspClass.getSimpleName()));
		oper.setReturnClass(rspClass);
		oper.setReturnQName(new QName("http://services.pl.telenor.dk/veris/types", rspStr));
		oper.setStyle(Style.DOCUMENT);
		oper.setUse(Use.LITERAL);
		return oper;
	}

	private static Call getCallByOper(OperationDesc oper) throws Exception {
		Service service = new Service();
		Call call = null;
		call = (Call) service.createCall();
		call.setOperation(oper);
		return call;
	}

	public static void main(String[] args) throws Exception {
		Map params = new HashMap();
		params.put("PNR", "1312814435");
//	params.put("PNR", "0703610013");
		Map result = CPRServiceClient.queryInfo(params);
		System.out.println(result);
	}

}
