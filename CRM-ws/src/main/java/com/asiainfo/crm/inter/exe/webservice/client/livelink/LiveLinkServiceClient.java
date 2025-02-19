/**
 * LiveLinkSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.livelink;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;

import org.apache.axis.AxisEngine;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.client.Stub;
import org.apache.axis.description.OperationDesc;
import org.apache.axis.description.ParameterDesc;
import org.apache.axis.encoding.DeserializerFactory;
import org.apache.axis.encoding.SerializerFactory;
import org.apache.axis.encoding.ser.ArrayDeserializerFactory;
import org.apache.axis.encoding.ser.ArraySerializerFactory;
import org.apache.axis.encoding.ser.BeanDeserializerFactory;
import org.apache.axis.encoding.ser.BeanSerializerFactory;
import org.apache.axis.encoding.ser.EnumDeserializerFactory;
import org.apache.axis.encoding.ser.EnumSerializerFactory;
import org.apache.axis.message.MessageElement;
import org.apache.axis.message.SOAPHeaderElement;
import org.apache.axis.soap.SOAPConstants;

import com.ai.appframe2.common.SessionManager;
import com.ai.appframe2.complex.cache.CacheFactory;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.asiainfo.appframe.ext.exeframe.ws.client.cache.WsClientCacheImpl;
import com.asiainfo.appframe.ext.exeframe.ws.query.impl.po.CfgWsClient;
import com.asiainfo.crm.util.BeanUtils;
import com.asiainfo.crm.util.CommonUtil;


public class LiveLinkServiceClient extends Stub {
	
    private Vector cachedSerClasses = new Vector();
    private Vector cachedSerQNames = new Vector();
    private Vector cachedSerFactories = new Vector();
    private Vector cachedDeserFactories = new Vector();
    
    private QName qName;
    private QName qName2;
	private Class beansf = BeanSerializerFactory.class;
	private Class beandf = BeanDeserializerFactory.class;
    private Class enumsf = EnumSerializerFactory.class;
    private Class enumdf = EnumDeserializerFactory.class;

	private static Map map = new HashMap();
	
	static {
		map.put(byte[][].class, "ArrayOfbase64Binary");
		map.put(SimpleAttributeTypeType.class, ">SimpleAttributeType>Type");
		map.put(AssignMetadataRequest.class, "assignMetadataRequest");
		map.put(AssignMetadataRequestBody.class, "assignMetadataRequestBody");
		map.put(AssignMetadataResponse.class, "assignMetadataResponse");
		map.put(AssignMetadataResponseBody.class, "assignMetadataResponseBody");
		map.put(AuthenticationRequest.class, "authenticationRequest");
		map.put(AuthenticationRequestBody.class, "authenticationRequestBody");
		map.put(AuthenticationResponse.class, "authenticationResponse");
		map.put(AuthenticationResponseBody.class, "authenticationResponseBody");
		map.put(SimpleAttributeType[].class, "ComplexAttributeType");
		map.put(CreateDocumentRequest.class, "createDocumentRequest");
		map.put(CreateDocumentRequestBody.class, "createDocumentRequestBody");
		map.put(CreateDocumentResponse.class, "createDocumentResponse");
		map.put(CreateDocumentResponseBody.class, "createDocumentResponseBody");
		map.put(DeleteDocumentRequest.class, "deleteDocumentRequest");
		map.put(DeleteDocumentRequestBody.class, "deleteDocumentRequestBody");
		map.put(DeleteDocumentResponse.class, "deleteDocumentResponse");
		map.put(DeleteDocumentResponseBody.class, "deleteDocumentResponseBody");
		map.put(DeleteResponseType.class, "DeleteResponseType");
		map.put(GetDocumentByBarcodeRequest.class, "getDocumentByBarcodeRequest");
		map.put(GetDocumentByBarcodeRequestBody.class, "getDocumentByBarcodeRequestBody");
		map.put(GetDocumentByBarcodeResponse.class, "getDocumentByBarcodeResponse");
		map.put(GetDocumentByBarcodeResponseBody.class, "getDocumentByBarcodeResponseBody");
		map.put(GetDocumentRequest.class, "getDocumentRequest");
		map.put(GetDocumentRequestBody.class, "getDocumentRequestBody");
		map.put(GetDocumentResponse.class, "getDocumentResponse");
		map.put(GetDocumentResponseBody.class, "getDocumentResponseBody");
		map.put(MetadataStructureType.class, "MetadataStructureType");
		map.put(NotifyDocumentRequest.class, "NotifyDocumentRequest");
		map.put(NotifyDocumentRequestBody.class, "NotifyDocumentRequestBody");
		map.put(NotifyDocumentResponse.class, "NotifyDocumentResponse");
		map.put(NotifyDocumentResponseBody.class, "NotifyDocumentResponseBody");
		
		map.put(SignDocumentLTVRequest.class, "SignDocumentLTVRequest");
		map.put(SignDocumentLTVRequestBody.class, "SignDocumentLTVRequestBody");
		map.put(SignDocumentLTVResponse.class, "SignDocumentLTVResponse");
		map.put(SignDocumentLTVResponseBody.class, "SignDocumentLTVResponseBody");
		map.put(SignDocumentRequest.class, "SignDocumentRequest");
		map.put(SignDocumentRequestBody.class, "SignDocumentRequestBody");
		map.put(SignDocumentResponse.class, "SignDocumentResponse");
		map.put(SignDocumentResponseBody.class, "SignDocumentResponseBody");
		map.put(SignDocumentWithSigTimestampRequest.class, "SignDocumentWithSigTimestampRequest");
		map.put(SignDocumentWithSigTimestampRequestBody.class, "SignDocumentWithSigTimestampRequestBody");
		map.put(SignDocumentWithSigTimestampResponse.class, "SignDocumentWithSigTimestampResponse");
		map.put(SignDocumentWithSigTimestampResponseBody.class, "SignDocumentWithSigTimestampResponseBody");
		
		map.put(SimpleAttributeType.class, "SimpleAttributeType");
	}
    

    public LiveLinkServiceClient() throws Exception {
         this(null);
    }

    public void registerClasses() throws Exception
    {
    	Set keys = map.keySet();
    	for (Object key : keys) {
    		Class clazz = (Class)key;
			qName = new QName("http://soa.ailk.telenor.com/schema/soa/EdocumentStorage", 
					(String)map.get(key));
			cachedSerQNames.add(qName);
			cachedSerClasses.add(clazz);
			if (clazz.isAssignableFrom(SimpleAttributeTypeType.class)) {
				cachedSerFactories.add(enumsf);
	            cachedDeserFactories.add(enumdf);
			} else if (clazz.isArray() && clazz.getSimpleName().equals("SimpleAttributeType[]")) {
				qName = new QName("http://soa.ailk.telenor.com/schema/soa/EdocumentStorage", 
						"SimpleAttributeType");
				qName2 = new QName("", "SimpleAttribute");
				cachedSerFactories.add(new ArraySerializerFactory(qName, qName2));
	            cachedDeserFactories.add(new ArrayDeserializerFactory());
			} else if (clazz.isArray() && clazz.getSimpleName().equals("byte[][]"))
			{
	            qName = new QName("http://www.w3.org/2001/XMLSchema", "base64Binary");
	            qName2 = new QName("", "base64Binary");
	            cachedSerFactories.add(new ArraySerializerFactory(qName, qName2));
	            cachedDeserFactories.add(new ArrayDeserializerFactory());
			} else
			{
				cachedSerFactories.add(beansf);
	            cachedDeserFactories.add(beandf);
			}
		}
    }

	public LiveLinkServiceClient(Service service) throws Exception {
		if (service == null) {
			super.service = new Service();
		} else {
			super.service = service;
		}
		registerClasses();
	}

	protected org.apache.axis.client.Call createCall() throws Exception {

		Call call = super._createCall();
		synchronized (this) {
			if (firstCall()) {
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

		CfgWsClient objCfgWsClient = (CfgWsClient)CacheFactory.get(WsClientCacheImpl.class, "C^" + "CRM_LIV_URL");
		String liveLinkUrl = objCfgWsClient.getUrlAddress();
		call.setTargetEndpointAddress(new URL(liveLinkUrl));
		call.setUseSOAPAction(true);
		call.setEncodingStyle(null);
		call.setProperty(Call.SEND_TYPE_ATTR, Boolean.FALSE);
		call.setProperty(AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
		return call;

	}
    
    public OperationDesc getOper(String operation, Class reqClazz, Class rspClazz) {
    	OperationDesc oper = new OperationDesc();
    	ParameterDesc param = null;
    	String req = operation + "Request";
    	String rsp = operation + "Response";
    	
    	oper.setName(operation);
    	param = new ParameterDesc(new QName("http://soa.ailk.telenor.com/wsdl/soa", req), 
    			ParameterDesc.IN, new QName("http://soa.ailk.telenor.com/schema/soa/EdocumentStorage", req), 
    			reqClazz, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://soa.ailk.telenor.com/schema/soa/EdocumentStorage", rsp));
        oper.setReturnClass(rspClazz);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", rsp));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
    	return oper;
    }

    public Map createDocument(CreateDocumentRequest parameters) throws Exception {
    	OperationDesc oper = getOper("createDocument", CreateDocumentRequest.class, 
    			CreateDocumentResponse.class);
        Call call = createCall();
        call.setOperation(oper);
        call.setEncodingStyle(null);
        call.setProperty(Call.SEND_TYPE_ATTR, Boolean.FALSE);
        call.setProperty(AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
        call.setOperationName(new QName("", "createDocument"));
        SOAPHeaderElement header = this.getRequestHeaders();
		setHeader(header);
		setRequestHeaders(call);
        Object resp = call.invoke(new Object[] {parameters});
        return BeanUtils.getProperties(resp);
    }

    public Map getDocument(Map parameters) throws Exception {
    	OperationDesc oper = getOper("getDocument", GetDocumentRequest.class, 
    			GetDocumentResponse.class);
		Call call = createCall();
		call.setOperation(oper);
		call.setEncodingStyle(null);
		call.setProperty(Call.SEND_TYPE_ATTR, Boolean.FALSE);
		call.setProperty(AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
		call.setOperationName(new QName("", "getDocument"));
		GetDocumentRequestBody reqBody = (GetDocumentRequestBody) 
				BeanUtils.setProperties(GetDocumentRequestBody.class, parameters);
		GetDocumentRequest req = new GetDocumentRequest();
		req.setRequestBody(reqBody);
		SOAPHeaderElement header = this.getRequestHeaders();
		setHeader(header);
		setRequestHeaders(call);
		Object resp = call.invoke(new Object[] { req });
		return BeanUtils.getProperties(resp);
       
    }

    public Map getDocumentByBarcode(Map parameters) throws Exception {
    	OperationDesc oper = getOper("getDocumentByBarcode", GetDocumentByBarcodeRequest.class, 
    			GetDocumentByBarcodeResponse.class);
        Call call = createCall();
        call.setOperation(oper);
        call.setEncodingStyle(null);
        call.setProperty(Call.SEND_TYPE_ATTR, Boolean.FALSE);
        call.setProperty(AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
        call.setOperationName(new QName("", "getDocumentByBarcode"));
        GetDocumentByBarcodeRequestBody reqBody = (GetDocumentByBarcodeRequestBody) 
        		BeanUtils.setProperties(GetDocumentByBarcodeRequestBody.class, parameters);
        GetDocumentByBarcodeRequest req = new GetDocumentByBarcodeRequest();
        req.setRequestBody(reqBody);
        SOAPHeaderElement header = this.getRequestHeaders();
		setHeader(header);
		setRequestHeaders(call);
        Object resp = call.invoke(new Object[] {req});
        return BeanUtils.getProperties(resp);
    }

    public Map deleteDocument(Map parameters) throws Exception {

    	OperationDesc oper = getOper("deleteDocument", DeleteDocumentRequest.class, 
    			DeleteDocumentResponse.class);
        Call call = createCall();
        call.setOperation(oper);
        call.setEncodingStyle(null);
        call.setProperty(Call.SEND_TYPE_ATTR, Boolean.FALSE);
        call.setProperty(AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
        call.setOperationName(new QName("", "deleteDocument"));
        DeleteDocumentRequestBody reqBody = (DeleteDocumentRequestBody) 
        		BeanUtils.setProperties(DeleteDocumentRequestBody.class, parameters);
        DeleteDocumentRequest req = new DeleteDocumentRequest();
        req.setRequestBody(reqBody);
        SOAPHeaderElement header = this.getRequestHeaders();
		setHeader(header);
		setRequestHeaders(call);
        Object resp = call.invoke(new Object[] {req});
        return BeanUtils.getProperties(resp);
    }

    public Map assignMetadata(AssignMetadataRequest parameters) throws Exception {
    	OperationDesc oper = getOper("assignMetadata", AssignMetadataRequest.class, 
    			AssignMetadataResponse.class);
        Call call = createCall();
        call.setOperation(oper);
        call.setEncodingStyle(null);
        call.setProperty(Call.SEND_TYPE_ATTR, Boolean.FALSE);
        call.setProperty(AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
        call.setOperationName(new QName("", "assignMetadata"));
        SOAPHeaderElement header = this.getRequestHeaders();
		setHeader(header);
		setRequestHeaders(call);
        Object resp = call.invoke(new Object[] {parameters});
        return BeanUtils.getProperties(resp);
    }

    public Map authentication(Map parameters) throws Exception {

		OperationDesc oper = getOper("authentication", AuthenticationRequest.class, 
				AuthenticationResponse.class);
		Call call = createCall();
		call.setOperation(oper);
		call.setEncodingStyle(null);
		call.setProperty(Call.SEND_TYPE_ATTR, Boolean.FALSE);
		call.setProperty(AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
		call.setOperationName(new QName("", "authentication"));
		String pwd = (String) parameters.get("PassWord");
		byte[] pwdArr = pwd.getBytes();
		List pwds = new ArrayList();
		for (int i = 0; i < pwdArr.length; i++) {
			pwds.add(pwdArr[i]);
		}
		parameters.put("Password", pwds);
		parameters.remove("PassWord");
		AuthenticationRequestBody reqBody = (AuthenticationRequestBody) 
				BeanUtils.setProperties(AuthenticationRequestBody.class, parameters);
		AuthenticationRequest req = new AuthenticationRequest();
		req.setRequestBody(reqBody);
		SOAPHeaderElement header = this.getRequestHeaders();
		setHeader(header);
		setRequestHeaders(call);
		Object resp = call.invoke(new Object[] { req });
		return BeanUtils.getProperties(resp);
	}

    public Map notifyDocument(Map parameters) throws Exception {

    	OperationDesc oper = getOper("notifyDocument", NotifyDocumentRequest.class, 
    			NotifyDocumentResponse.class);
        Call call = createCall();
        call.setOperation(oper);
        call.setEncodingStyle(null);
        call.setProperty(Call.SEND_TYPE_ATTR, Boolean.FALSE);
        call.setProperty(AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
        call.setOperationName(new QName("", "notifyDocument"));
        NotifyDocumentRequestBody reqBody = (NotifyDocumentRequestBody) 
        		BeanUtils.setProperties(NotifyDocumentRequestBody.class, parameters);
        NotifyDocumentRequest req = new NotifyDocumentRequest();
        req.setRequestBody(reqBody);
        SOAPHeaderElement header = this.getRequestHeaders();
		setHeader(header);
		setRequestHeaders(call);
        Object resp = call.invoke(new Object[] {req});
        return BeanUtils.getProperties(resp);
    }
    
    
    public Map signDocument(Map parameters) throws Exception {
    	OperationDesc oper = getOper("SignDocument", SignDocumentRequest.class, 
    			SignDocumentResponse.class);
        Call call = createCall();
        call.setOperation(oper);
        call.setEncodingStyle(null);
        call.setProperty(Call.SEND_TYPE_ATTR, Boolean.FALSE);
        call.setProperty(AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
        call.setOperationName(new QName("", "SignDocument"));
        SignDocumentRequestBody reqBody = (SignDocumentRequestBody) 
        		BeanUtils.setProperties(SignDocumentRequestBody.class, parameters);
        SignDocumentRequest req = new SignDocumentRequest();
        req.setRequestBody(reqBody);
        SOAPHeaderElement header = this.getRequestHeaders();
		setHeader(header);
		setRequestHeaders(call);
        Object resp = call.invoke(new Object[] {req});
        return BeanUtils.getProperties(resp);
        
    }

    public Map signDocumentLTV(Map parameters) throws Exception {
    	
    	OperationDesc oper = getOper("SignDocumentLTV", SignDocumentLTVRequest.class, 
    			SignDocumentLTVResponse.class);
        Call call = createCall();
        call.setOperation(oper);
        call.setEncodingStyle(null);
        call.setProperty(Call.SEND_TYPE_ATTR, Boolean.FALSE);
        call.setProperty(AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
        call.setOperationName(new QName("", "SignDocumentLTV"));
        SignDocumentLTVRequestBody reqBody = (SignDocumentLTVRequestBody) 
        		BeanUtils.setProperties(SignDocumentLTVRequestBody.class, parameters);
        SignDocumentLTVRequest req = new SignDocumentLTVRequest();
        req.setRequestBody(reqBody);
        SOAPHeaderElement header = this.getRequestHeaders();
		setHeader(header);
		setRequestHeaders(call);
        Object resp = call.invoke(new Object[] {req});
        return BeanUtils.getProperties(resp);
    }

    public Map signDocumentWithSigTimestamp(Map parameters) throws Exception {
        
    	OperationDesc oper = getOper("SignDocumentWithSigTimestamp", SignDocumentWithSigTimestampRequest.class, 
    			SignDocumentWithSigTimestampResponse.class);
        Call call = createCall();
        call.setOperation(oper);
        call.setEncodingStyle(null);
        call.setProperty(Call.SEND_TYPE_ATTR, Boolean.FALSE);
        call.setProperty(AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
        call.setOperationName(new QName("", "SignDocumentWithSigTimestamp"));
        SignDocumentWithSigTimestampRequestBody reqBody = (SignDocumentWithSigTimestampRequestBody) 
        		BeanUtils.setProperties(SignDocumentWithSigTimestampRequestBody.class, parameters);
        SignDocumentWithSigTimestampRequest req = new SignDocumentWithSigTimestampRequest();
        req.setRequestBody(reqBody);
        SOAPHeaderElement header = this.getRequestHeaders();
		setHeader(header);
		setRequestHeaders(call);
        Object resp = call.invoke(new Object[] {req});
        return BeanUtils.getProperties(resp);
    }
    
    protected SOAPHeaderElement getRequestHeaders() throws org.apache.axis.AxisFault{        
    	SOAPHeaderElement soapHeaderElement = new SOAPHeaderElement("", "RequestHeader"); 
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
    	 try {
    		soapHeaderElement.setPrefix("soa");
            soapHeaderElement.setNamespaceURI("http://soa.ailk.telenor.com/wsdl/soa");
			soapHeaderElement.addChild(new MessageElement(new QName("AppKey"), "8000000001"));
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
    
    public static void main(String[] args) throws Exception {
    	LiveLinkServiceClient l = new LiveLinkServiceClient();
    	
    	Map params = new HashMap();
//    	params.put("UserName", "");
//    	byte[] pwds = "dys1985".getBytes();
//    	
//    	List pwd = new ArrayList();
//    	for (int i = 0; i < pwds.length; i++) {
//			pwd.add(pwds[i]);
//		}
//    	params.put("Password", pwd);
//    	Map map = l.authentication(params);
//    	Map m = (Map) map.get("ResponseBody");
//    	System.out.println(m.get("SessionId"));
//    	System.out.println(m.get("Status"));
    	
//    	params.put("CountryCode", "DK");
//    	params.put("DocumentId", "1");
//    	params.put("DocumentType", "1");
//    	params.put("Barcode", "1");
//    	Map map = l.notifyDocument(params);
//    	System.out.println(map);
    	
//    	params.put("SessionId", "1");
//    	params.put("CountryCode", "DK");
//    	params.put("DocumentType", "1");
//    	List docIds = new ArrayList();
//    	for (int i = 0; i < 3; i++) {
//			docIds.add(i + "");
//		}
//    	params.put("DocumentIds", docIds);
//    	Map map = l.deleteDocument(params);
//    	System.out.println(map);
    	
//    	params.put("SessionId", "1");
//    	params.put("CountryCode", "DK");
//    	params.put("DocumentType", "1");
//    	params.put("Barcode", "1");
//    	Map map = l.getDocumentByBarcode(params);
//    	System.out.println(map);
//    	
//    	params.put("SessionId", "ZGVtb1pHVnRidz09");
//    	params.put("CountryCode", "DK");
//    	params.put("DocumentType", "100");
//    	params.put("DocumentId", "c3RyaW5n");
//    	Map map = l.getDocument(params);
//    	System.out.println(map);
    	
    	byte[] b = "ZGVtb1pHVnRidz09".getBytes();
    	List bytes = new ArrayList();
    	for (int i = 0; i < b.length; i++) {
    		bytes.add(b[i]);
		}
    	params.put("InputPdf", bytes);
    	params.put("CountryCode", "DK");
    	params.put("DocumentType", "100");
    	params.put("DocumentId", "c3RyaW5n");
    	Map map = l.signDocument(params);
    	System.out.println(map);
    } 

}
