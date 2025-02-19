package com.asiainfo.crm.inter.exe.webservice.client.cpr;

import com.ai.appframe2.common.DataType;
import com.ai.appframe2.common.SessionManager;
import com.ai.appframe2.complex.cache.CacheFactory;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.appframe.ext.exeframe.msg.jetty.util.log.Log;
import com.asiainfo.appframe.ext.exeframe.ws.client.cache.WsClientCacheImpl;
import com.asiainfo.appframe.ext.exeframe.ws.query.impl.po.CfgWsClient;
import com.asiainfo.crm.util.BeanUtils;
import com.asiainfo.crm.util.CommonUtil;
import com.asiainfo.crm.util.XmlMapTransformUtil;
import com.asiainfo.crm.inter.exe.webservice.client.cpr.log.bo.FejlnrErrorInfo;
import com.asiainfo.crm.inter.exe.webservice.client.cpr.log.service.interfaces.IInterCallLogSV;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.constants.Style;
import org.apache.axis.constants.Use;
import org.apache.axis.description.OperationDesc;
import org.apache.axis.description.ParameterDesc;
import org.apache.axis.message.MessageElement;
import org.apache.axis.message.SOAPHeaderElement;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import java.net.URL;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public final class CPRServiceClient extends org.apache.axis.client.Stub{
	
	protected SOAPHeaderElement getRequestHeaders() throws org.apache.axis.AxisFault{    
		
		    SOAPHeaderElement soapHeaderElement = new SOAPHeaderElement("", "RequestHeader");
	        String appKey = "8000000001";
	        String date8 = new SimpleDateFormat("yyyyMMdd").format(new Date());
	        String date10=CommonUtil.getTransactionNum(1999999999, 10);
	        String transactionID = appKey + date8 + date10;
	        String ReqTime = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
	        String staffId = null;
	        String tenantId = null;
	        UserInfoInterface user = SessionManager.getUser();
		if(null!=user){
			tenantId=user.getTenantId();
			staffId = user.get("STAFF_ID") == null ? "" : user.get("STAFF_ID").toString();
		}
    	 try {
    		soapHeaderElement.setPrefix("soa");
            soapHeaderElement.setNamespaceURI("http://soa.ailk.telenor.com/wsdl/soa");
			soapHeaderElement.addChild(new MessageElement(new QName("AppKey"), appKey));
			soapHeaderElement.addChild(new MessageElement(new QName("TransactionID"), transactionID));
			soapHeaderElement.addChild(new MessageElement(new QName("ReqTime"), ReqTime));
			soapHeaderElement.addChild(new MessageElement(new QName("Version"),"0.1"));
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
	 * @param params
	 * @return
	 * @throws Exception
	 */
	public void setHeader(Call call)throws Exception{
		SOAPHeaderElement header = this.getRequestHeaders();
		setHeader(header);
		setRequestHeaders(call);
	}
	public static Map queryInfo(Map params) throws Exception {
		 
		  CfgWsClient objCfgWsClient = (CfgWsClient)CacheFactory.get(WsClientCacheImpl.class, "C^" + "CRM_CPR_URL");
		  String cprUrl = objCfgWsClient.getUrlAddress();
		  OperationDesc oper = getOper("queryInfo", QueryInfoRequest.class, QueryInfoResponse.class);
		  Call call = getCallByOper(oper);
		  QueryInfoRequest req = new QueryInfoRequest();
		  Object body = BeanUtils.setProperties(QueryInfoRequestBody.class, params);
		  req.setRequestBody((QueryInfoRequestBody) body);
		 
		  call.setTargetEndpointAddress(new URL(cprUrl));
		  // WSDL里面描述的操作名称
		  call.setOperationName(new QName("", "queryInfo"));
		  // 给方法传递参数，并且调用方法
          new CPRServiceClient().setHeader(call);	  
		  QueryInfoResponse result = (QueryInfoResponse) call.invoke(new Object[] { req }); 
		  String dataXml = result.getResponseBody().getDATA();
		  Map dataMap = null;
		  try {
		   dataMap = XmlMapTransformUtil.xml2Map(dataXml);
		  } catch (Exception e) {
		      Log.info(e.getMessage(),e);
		      dataMap = null;
		  }
		  // INSERT INTO base.`bs_i18n_resource` VALUES('INSCM00001', 'CPR文件内容异常', 'content of CPR is error', 'U', '');
		  if (null == dataMap) {
		   ExceptionUtil.throwBusinessException("INSCM00001");
		  }
		  Map queryResults = new HashMap();
		  queryResults.put("KUNDENR", result.getResponseBody().getKUNDENR());
		  queryResults.put("ABON_TYPE", result.getResponseBody().getABON_TYPE());
		  queryResults.put("DATA_TYPE", result.getResponseBody().getDATA_TYPE());
		  queryResults.put("TOKEN", result.getResponseBody().getTOKEN());
		  queryResults.put("USERID", result.getResponseBody().getUSERID());
		  queryResults.put("FEJLNR", result.getResponseBody().getFEJLNR());
		  queryResults.put("LENGTH", result.getResponseBody().getLENGTH());
		  queryResults.put("DATA", dataMap);
		  
		  //写入调用接口日志到数据库
		  String status =  result.getResponseBody().getFEJLNR();
		  FejlnrErrorInfo fejlnrError = new FejlnrErrorInfo();
		  String status_descrip = fejlnrError.getErrorValueByKey(status);
		  IInterCallLogSV sv = (IInterCallLogSV)ServiceFactory.getService(IInterCallLogSV.class);
		  sv.saveInterCallLog(DataType.getAsString(params.get("PNR")), new Timestamp(System.currentTimeMillis()), status, status_descrip);
		  
		  return queryResults;
		 }

	
	/**
	 * 匹配信息
	 * @param params
	 * @return
	 * @throws Exception
	 */
	public static Map matchInfo(Map params) throws Exception {
		
		CfgWsClient objCfgWsClient = (CfgWsClient)CacheFactory.get(WsClientCacheImpl.class, "C^" + "CRM_CPR_URL");
		String cprUrl = objCfgWsClient.getUrlAddress();
		OperationDesc oper = getOper("matchInfo", QueryInfoRequest.class, QueryInfoResponse.class);
		Call call = getCallByOper(oper);

		Object body = BeanUtils.setProperties(MatchInfoRequestBody.class, params);
		MatchInfoRequest req = new MatchInfoRequest();
		req.setRequestBody((MatchInfoRequestBody) body);

		call.setTargetEndpointAddress(new URL(cprUrl));
		// WSDL里面描述的操作名称
		call.setOperationName(new QName("", "matchInfo"));
		MatchInfoResponse matchInfo = (MatchInfoResponse) call.invoke(new Object[] { req }); 
		
		Map matchResults = new HashMap();
		matchResults.put("KUNDENR", matchInfo.getResponseBody().getKUNDENR());
		matchResults.put("ABON_TYPE", matchInfo.getResponseBody().getABON_TYPE());
		matchResults.put("DATA_TYPE", matchInfo.getResponseBody().getDATA_TYPE());
		matchResults.put("TOKEN", matchInfo.getResponseBody().getTOKEN());
		matchResults.put("USERID", matchInfo.getResponseBody().getUSERID());
		matchResults.put("FEJLNR", matchInfo.getResponseBody().getFEJLNR());
		matchResults.put("LENGTH", matchInfo.getResponseBody().getLENGTH());
		matchResults.put("DATA", matchInfo.getResponseBody().getDATA());
		
		return matchResults;
	}
		
	private static OperationDesc getOper(String msg, Class reqClass, Class rspClass) {
		OperationDesc oper = new OperationDesc();
		String reqStr = msg + "Request";
		String rspStr = msg + "Response";
		oper.setName(msg);
		ParameterDesc param = new ParameterDesc(
				new QName("http://soa.ailk.telenor.com/wsdl/soa", reqStr),
				ParameterDesc.IN, 
				new QName("http://soa.ailk.telenor.com/schema/soa/busi", reqClass.getSimpleName()), 
				reqClass, false, false);
		oper.addParameter(param);
		oper.setReturnType(
				new QName("http://soa.ailk.telenor.com/schema/soa/busi", rspClass.getSimpleName()));
		oper.setReturnClass(rspClass);
		oper.setReturnQName(
				new QName("http://soa.ailk.telenor.com/wsdl/soa", rspStr));
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
//		params.put("PNR", "0703610013");
		Map result = CPRServiceClient.queryInfo(params);
		System.out.println(result);
	}

}

