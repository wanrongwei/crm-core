package com.asiainfo.crm.inter.exe.webservice.client.copydan;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;

import org.apache.axis.client.Call;
import org.apache.axis.client.Stub;
import org.apache.axis.message.MessageElement;
import org.apache.axis.message.SOAPHeaderElement;
import org.apache.log4j.Logger;

import com.ai.appframe2.common.SessionManager;
import com.ai.appframe2.complex.cache.CacheFactory;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.asiainfo.appframe.ext.exeframe.ws.client.cache.WsClientCacheImpl;
import com.asiainfo.appframe.ext.exeframe.ws.query.impl.po.CfgWsClient;
import com.asiainfo.crm.util.CommonUtil;
import com.google.gson.Gson;

public class CopyDanServiceClient extends Stub {
	private static Logger log = Logger.getLogger(CopyDanServiceClient.class);
	public static SOAPHeaderElement getRequestHeaders() throws org.apache.axis.AxisFault {

		SOAPHeaderElement soapHeaderElement = new SOAPHeaderElement("", "RequestHeader");
		String appKey = "T20220509";  //provided by huihong
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
			soapHeaderElement.setNamespaceURI("http://soa.ailk.telenor.com/wsdl/soa");
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
	
	public void setHeader(Call call) throws Exception {
		SOAPHeaderElement header = this.getRequestHeaders();
		setHeader(header);
		setRequestHeaders(call);
	}
	
	public static List getAllCustomers() throws Exception{
		
		CfgWsClient objCfgWsClient = (CfgWsClient) CacheFactory.get(WsClientCacheImpl.class, "C^" + "CRM_COPYDAN_URL");
		String copyDanUrl = objCfgWsClient.getUrlAddress();
//		String copyDanUrl = "http://10.1.248.207:8381/TelenorDK/ConsumerAccessServices/3rdParty/ProxyServices/GetAllCustomers?wsdl";
		GetAllCustomersServiceLocator serviceLocator = new GetAllCustomersServiceLocator();
		serviceLocator.setGetAllCustomersPortEndpointAddress(copyDanUrl);
		GetAllCustomersPortBindingStub stub = new GetAllCustomersPortBindingStub(new URL(copyDanUrl),serviceLocator);
		stub.setHeader(getRequestHeaders());
		GetAllCustomersRequest request = new GetAllCustomersRequest();
		GetAllCustomersRequestBody requestBody = new GetAllCustomersRequestBody("T20220509");
		request.setRequestBody(requestBody);
		GetAllCustomersResponse response = stub.getAllCustomers(request);
		String results = response.getResponseBody().getResults();
		Gson gson = new Gson();
		List list = gson.fromJson(results,List.class);
		return list;
	}
	
//	public static void main(String[] args) {
//		
//		try {
//			long  start = System.currentTimeMillis();
//			List list = new CopyDanServiceClient().getAllCustomers();
//			long  end = System.currentTimeMillis();
//			System.out.println(list.size() +"cost:"+(end-start)+"ms");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
}
