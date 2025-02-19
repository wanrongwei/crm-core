/**
 * NetaxeptComponentServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.payment;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import javax.xml.namespace.QName;

import org.apache.axis.AxisEngine;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.client.Stub;
import org.apache.axis.constants.Style;
import org.apache.axis.constants.Use;
import org.apache.axis.description.OperationDesc;
import org.apache.axis.description.ParameterDesc;
import org.apache.axis.encoding.DeserializerFactory;
import org.apache.axis.encoding.SerializerFactory;
import org.apache.axis.encoding.ser.ArrayDeserializerFactory;
import org.apache.axis.encoding.ser.ArraySerializerFactory;
import org.apache.axis.encoding.ser.BeanDeserializerFactory;
import org.apache.axis.encoding.ser.BeanSerializerFactory;
import org.apache.axis.message.MessageElement;
import org.apache.axis.message.SOAPHeaderElement;
import org.apache.axis.soap.SOAPConstants;

import com.ai.appframe2.common.SessionManager;
import com.ai.appframe2.complex.cache.CacheFactory;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.appframe.ext.exeframe.ws.client.cache.WsClientCacheImpl;
import com.asiainfo.appframe.ext.exeframe.ws.query.impl.po.CfgWsClient;
import com.asiainfo.crm.util.BeanUtils;
import com.asiainfo.crm.util.CommonUtil;
import com.asiainfo.crm.inter.service.interfaces.IBaseServiceSV;

public class NetaxeptComponentServiceClient extends Stub {
    private Vector cachedSerClasses = new Vector();
    private Vector cachedSerQNames = new Vector();
    private Vector cachedSerFactories = new Vector();
    private Vector cachedDeserFactories = new Vector();
    private QName qName;
    private QName qName2;
    private Class beansf = BeanSerializerFactory.class;
    private Class beandf = BeanDeserializerFactory.class;;
    
    private static Map classMap = new HashMap();
    private static Map contryCode = new HashMap();
    private static Map currencyType = new HashMap();
    
    static {
    	classMap.put(AuthenticationInformation.class, "authenticationInformation");
    	classMap.put(AvtaleGiro.class, "avtaleGiro");
    	classMap.put(AvtaleGiroInformation.class, "avtaleGiroInformation");
    	classMap.put(CardInfo.class, "cardInfo");
    	classMap.put(CardInformation.class, "cardInformation");
    	classMap.put(Customer.class, "customer");
    	classMap.put(CustomerInformation.class, "customerInformation");
    	classMap.put(DnBNorDirectPayment.class, "dnBNorDirectPayment");
    	classMap.put(DnBNorDirectPaymentInformation.class, "dnBNorDirectPaymentInformation");
    	classMap.put(Environment.class, "environment");
    	classMap.put(FinancialSummary.class, "financialSummary");
    	classMap.put(FraudAnalysis.class, "fraudAnalysis");
    	classMap.put(InvoiceInformation.class, "invoiceInformation");
    	classMap.put(MobileInformation.class, "mobileInformation");
    	classMap.put(NetaxeptPaymentInfo.class, "netaxeptPaymentInfo");
    	classMap.put(NetaxeptQueryRequest.class, "netaxeptQueryRequest");
    	classMap.put(Order.class, "order");
    	classMap.put(OrderInformation.class, "orderInformation");
    	classMap.put(PaymentError.class, "paymentError");
    	classMap.put(PaymentMethodAction.class, "paymentMethodAction");
    	
    	classMap.put(QueryNetaxeptRequest.class, "QueryNetaxeptRequest");
    	classMap.put(QueryNetaxeptRequestBody.class, "QueryNetaxeptRequestBody");
    	classMap.put(QueryNetaxeptResponse.class, "QueryNetaxeptResponse");
    	classMap.put(QueryResponse.class, "queryResponse");
    	
    	classMap.put(Recurring.class, "recurring");
    	classMap.put(RegisterNetaxeptRequest.class, "RegisterNetaxeptRequest");
    	classMap.put(RegisterNetaxeptRequestBody.class, "RegisterNetaxeptRequestBody");
    	classMap.put(RegisterNetaxeptResponse.class, "RegisterNetaxeptResponse");
    	classMap.put(RegisterRequest.class, "registerRequest");
    	classMap.put(RegisterResponse.class, "registerResponse");
    	classMap.put(SecurityInformation.class, "securityInformation");
    	classMap.put(Terminal.class, "terminal");
    	classMap.put(TerminalInformation.class, "terminalInformation");
    	classMap.put(TransactionLogLine.class, "transactionLogLine");
    	
    	contryCode.put("21", "DK");
    	contryCode.put("01", "DK");
    	currencyType.put("21", "DKK");
    	currencyType.put("01", "DKK");
    }

    public NetaxeptComponentServiceClient() throws Exception {
         this(null);
    }
    
    public OperationDesc getOper(String operation, Class reqClazz, Class rspClazz)
    {
    	OperationDesc oper = new OperationDesc();
    	ParameterDesc param = null;
    	String req = operation + "Request";
    	String rsp = operation + "Response";
    	String reqName = reqClazz.getSimpleName();
    	String rspName = rspClazz.getSimpleName();
    	oper.setName(operation);
    	param = new ParameterDesc(new QName("http://soa.ailk.telenor.com/wsdl/soa", req), 
    			ParameterDesc.IN, new QName("http://soa.ailk.telenor.com/schema/soa/busi", reqName), 
    			reqClazz, false, false);
    	oper.addParameter(param);
		oper.setReturnType(new QName("http://soa.ailk.telenor.com/schema/soa/busi", rspName));
		oper.setReturnClass(rspClazz);
		oper.setReturnQName(new QName("http://soa.ailk.telenor.com/wsdl/soa", rsp));
		oper.setStyle(Style.DOCUMENT);
		oper.setUse(Use.LITERAL);
    	return oper;
    }
    
    public void registerClassArr() {
    	 qName = new QName("http://soa.ailk.telenor.com/schema/soa/busi", "arrayOfPaymentError");
         cachedSerQNames.add(qName);
         cachedSerClasses.add(PaymentError[].class);
         qName = new QName("http://soa.ailk.telenor.com/schema/soa/busi", "paymentError");
         qName2 = new QName("", "PaymentError");
         cachedSerFactories.add(new ArraySerializerFactory(qName, qName2));
         cachedDeserFactories.add(new ArrayDeserializerFactory());

         qName = new QName("http://soa.ailk.telenor.com/schema/soa/busi", "arrayOfTransactionLogLine");
         cachedSerQNames.add(qName);
         cachedSerClasses.add(TransactionLogLine[].class);
         qName = new QName("http://soa.ailk.telenor.com/schema/soa/busi", "transactionLogLine");
         qName2 = new QName("", "TransactionLogLine");
         cachedSerFactories.add(new ArraySerializerFactory(qName, qName2));
         cachedDeserFactories.add(new ArrayDeserializerFactory());
    }
    
    public void registerClass() {
    	Set keys = classMap.keySet();
    	for (Object key : keys) {
			//Class clazz = (Class) key;
			qName = new QName("http://soa.ailk.telenor.com/schema/soa/busi",
					(String) classMap.get(key));
			cachedSerQNames.add(qName);
			cachedSerClasses.add(key);
			cachedSerFactories.add(beansf);
			cachedDeserFactories.add(beandf);
		}
    }

    public NetaxeptComponentServiceClient(javax.xml.rpc.Service service) throws Exception {
        if (service == null) {
            super.service = new Service();
        } else {
            super.service = service;
        }
        ((Service)super.service).setTypeMappingVersion("1.2");
           
        registerClass();
        registerClassArr();
    }

    protected Call createCall() throws Exception {
		Call call = super._createCall();
		synchronized (this) {
			if (firstCall()) {
				// must set encoding style before registering serializers
				call.setEncodingStyle(null);
				for (int i = 0; i < cachedSerFactories.size(); ++i) {
					Class cls = (Class) cachedSerClasses.get(i);
					QName qName = (QName) cachedSerQNames.get(i);
					Object x = cachedSerFactories.get(i);
					if (x instanceof Class) {
						Class sf = (Class) cachedSerFactories.get(i);
						Class df = (Class) cachedDeserFactories.get(i);
						call.registerTypeMapping(cls, qName, sf, df, false);
					} else if (x instanceof SerializerFactory) {
						SerializerFactory sf = (SerializerFactory) cachedSerFactories.get(i);
						DeserializerFactory df = (DeserializerFactory) cachedDeserFactories.get(i);
						call.registerTypeMapping(cls, qName, sf, df, false);
					}
				}
			}
		}

		CfgWsClient objCfgWsClient = (CfgWsClient) CacheFactory.get(
				WsClientCacheImpl.class, "C^" + "CRM_PAYMENT_URL");
		String liveLinkUrl = objCfgWsClient.getUrlAddress();
		call.setTargetEndpointAddress(new URL(liveLinkUrl));
		call.setUseSOAPAction(true);
		call.setSOAPActionURI("");
		call.setEncodingStyle(null);
		call.setProperty(Call.SEND_TYPE_ATTR, Boolean.FALSE);
		call.setProperty(AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
		return call;
    }


    public void setHeader() throws Exception {
    	
    	SOAPHeaderElement header = new SOAPHeaderElement("", "RequestHeader"); 
    	String appKey = "8000000001";
 		String date8 = new SimpleDateFormat("yyyyMMdd").format(new Date());
		String date10=CommonUtil.getTransactionNum(1999999999, 10);
 		String transactionID = appKey+date8+date10;
 		String ReqTime=new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
 		String staffId=null;
 		String tenantId=null;
 		UserInfoInterface user = SessionManager.getUser();
		if(null!=user){
			tenantId=user.getTenantId();
			staffId=user.get("STAFF_ID").toString();
		}
    	header.addChild(new MessageElement(new QName("AppKey"), "8000000001"));
    	header.addChild(new MessageElement(new QName("TransactionID"), transactionID));
    	header.addChild(new MessageElement(new QName("ReqTime"), ReqTime));
    	header.addChild(new MessageElement(new QName("Version"),"0.1"));
    	header.addChild(new MessageElement(new QName("TenantId"), tenantId));
    	header.addChild(new MessageElement(new QName("AcceptStaffId"), staffId));
    	header.addChild(new MessageElement(new QName("AcceptOpId"), 1));
    	setHeader(header);
    }
    
	public String registerNetaxept(String redirectUrl) throws Exception {

		OperationDesc oper = getOper("registerNetaxept", RegisterNetaxeptRequest.class, RegisterNetaxeptResponse.class);
		setHeader();
		Call call = createCall();
		call.setOperation(oper);
		call.setOperationName(new QName("", "registerNetaxept"));
		setRequestHeaders(call);
		setAttachments(call);
		RegisterNetaxeptRequest req = new RegisterNetaxeptRequest();
		RegisterNetaxeptRequestBody body = new RegisterNetaxeptRequestBody();
		RegisterRequest request = new RegisterRequest();
		
		Order order = new Order();
		order.setAmount("2000");
		String tenantId = System.getProperty("tenant.id");
		order.setCurrencyCode((String)currencyType.get(tenantId));
		IBaseServiceSV sv = (IBaseServiceSV) ServiceFactory.getService(IBaseServiceSV.class);
		long id = sv.getSeq("PAYMENT_NETAXEPT");
		String orderNum = (String)contryCode.get(tenantId) + "CM" + id;
		order.setOrderNumber(orderNum);
		
		Recurring rec = new Recurring();
		rec.setType("R");
		rec.setFrequency("1");
		rec.setExpiryDate("20371231");
		
		Terminal terminal = new Terminal();
		terminal.setRedirectUrl(redirectUrl);
		
		request.setOrder(order);
		request.setRecurring(rec);
		request.setTerminal(terminal);
		request.setServiceType("B");
		
		body.setRequest(request);
		req.setRequestBody(body);
		setRequestHeaders(call);
		Object resp = call.invoke(new Object[] { req });
		RegisterNetaxeptResponse response = (RegisterNetaxeptResponse)resp;
		if (null != response) {
			RegisterResponse responseBody = response.getResponseBody();
			if (null != responseBody) {
				return responseBody.getTransactionId();
			}
		}
		
		return null;

	}
	
	
	public Map queryNetaxept(String transactionId) throws Exception {
		OperationDesc oper = getOper("queryNetaxept",
				QueryNetaxeptRequest.class, QueryNetaxeptResponse.class);
		setHeader();
		Call call = createCall();
		call.setOperation(oper);
		call.setOperationName(new QName("", "queryNetaxept"));
		setRequestHeaders(call);
		setAttachments(call);
		QueryNetaxeptRequest request = new QueryNetaxeptRequest();
		QueryNetaxeptRequestBody requestBody = new QueryNetaxeptRequestBody();
		NetaxeptQueryRequest req = new NetaxeptQueryRequest();
		req.setTransactionId(transactionId);
		requestBody.setRequest(req);
		request.setRequestBody(requestBody);
		setRequestHeaders(call);
		Object resp = call.invoke(new java.lang.Object[] { request });
		QueryNetaxeptResponse rsp = (QueryNetaxeptResponse) resp;
		if (null != rsp) {
			NetaxeptPaymentInfo rspBody = rsp.getResponseBody();
			if (null != rspBody) {
				CardInformation card = rspBody.getCardInformation();
				if (null != card) {
					return BeanUtils.getProperties(card);
				}
			}

		}
		return null;
	}

	
	public static void main(String[] args) throws Exception {
		
		NetaxeptComponentServiceClient nc = new NetaxeptComponentServiceClient();
//		System.out.println(nc.registerNetaxept("http://www.baidu.com"));
		System.out.println(nc.queryNetaxept("f4660c8d31ea41779800b01291a0f8d3"));
	}
}
