/**
 * TrsServiceSoap_BindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.transact;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;

import com.asiainfo.crm.util.XmlParseUtil;
import org.apache.axis.message.MessageElement;
import org.apache.axis.message.SOAPHeaderElement;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.common.SessionManager;
import com.ai.appframe2.complex.cache.CacheFactory;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.asiainfo.appframe.ext.exeframe.ws.client.cache.WsClientCacheImpl;
import com.asiainfo.appframe.ext.exeframe.ws.query.impl.po.CfgWsClient;
import com.asiainfo.crm.util.CommonUtil;
import com.asiainfo.crm.util.XmlMapTransformUtil;

public class TransactServiceClient extends org.apache.axis.client.Stub implements TrsServiceSoap_PortType {
	
	private  static Log log = LogFactory.getLog(TransactServiceClient.class);
	
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[1];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TrsXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "TrsXMLRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", ">TrsXMLRequest"), TrsXMLRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", ">TrsXMLResponse"));
        oper.setReturnClass(TrsXMLResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "TrsXMLResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

    }

    public TransactServiceClient() throws org.apache.axis.AxisFault {
         this(null);
    }

    public TransactServiceClient(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public TransactServiceClient(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", ">TrsXMLRequest");
            cachedSerQNames.add(qName);
            cls = TrsXMLRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", ">TrsXMLResponse");
            cachedSerQNames.add(qName);
            cls = TrsXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "trsXMLRequestBody");
            cachedSerQNames.add(qName);
            cls = TrsXMLRequestBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "trsXMLResponseBody");
            cachedSerQNames.add(qName);
            cls = TrsXMLResponseBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            CfgWsClient objCfgWsClient = (CfgWsClient)CacheFactory.get(WsClientCacheImpl.class, "C^" + "CRM_TS_URL");
    		String tsUrl = objCfgWsClient.getUrlAddress();
            _call.setTargetEndpointAddress(tsUrl);
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Exception t) {
            log.error(t.getMessage(), t);
            return null;
        }
    }
    protected SOAPHeaderElement getRequestHeaders() throws org.apache.axis.AxisFault{        
    	SOAPHeaderElement soapHeaderElement = new SOAPHeaderElement(new QName("soa",
    		        "RequestHeader"));
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
			staffId = user.get("STAFF_ID") == null ? "" : user.get("STAFF_ID").toString();
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
    public String getMethod(String method) throws Exception{
    	CfgWsClient objCfgWsClient = (CfgWsClient)CacheFactory.get(WsClientCacheImpl.class, "C^" + "CRM_TS_XSL_URL");
		String tsXslUrl = objCfgWsClient.getUrlAddress();
    	String methodExtra="<?xml-stylesheet type=\"text/xsl\" href=\""+tsXslUrl+method+".XSL\" ?>";
    	return methodExtra;
    }
    public Map trsXML(Map map) throws Exception {
       
//    	log.error("transact starting==========");
//    	log.error("inMap=========="+map);
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/TrsXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "TrsXML"));
		String methodName = (String)map.get("METHOD");
		String methodExtra=this.getMethod(methodName);
		map.remove("METHOD");
		String param = XmlMapTransformUtil.map2Xml(map);
	    param=param.replace("<WebXmlData>", methodExtra+"\n"+"<WebXmlData>");
		param = param.replaceAll("<AICRMSERVICE>", "");
		param = param.replaceAll("</AICRMSERVICE>", "");
		TrsXMLRequest trsXMLRequest = new TrsXMLRequest();
		TrsXMLRequestBody trsXMLRequestBody = new TrsXMLRequestBody();
		trsXMLRequestBody.setXmlString(param);
		trsXMLRequest.setRequestBody(trsXMLRequestBody);
		SOAPHeaderElement header = this.getRequestHeaders();
		setHeader(header);
		setRequestHeaders(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {trsXMLRequest});
//        log.error(_resp);
//    	log.error("transact returning=============");
        TrsXMLResponse trsXMLResponse = (TrsXMLResponse)_resp;
        TrsXMLResponseBody  trsXMLResponseBody = trsXMLResponse.getResponseBody();
        String xmlResult = trsXMLResponseBody.getTrsXMLResult();
        Map result = XmlParseUtil.getMapFromXml((String)xmlResult);
		Map retMap = new HashMap();
		retMap.put("TransactXmlData", result);
		return retMap;
    }
    
public static void main(String[] args) throws Exception {
		
		Map sys = new HashMap();
		sys.put("Application_type", "I");
		
		Map legal = new HashMap();
		legal.put("CPR", "0101680487");
		legal.put("KOB", "");
		legal.put("Surname_firm_name", "Olsen");
		legal.put("First_name_contact_person", "Tim Nyby");
		legal.put("O_Address", "Malmbergsvej");
		legal.put("O_House_no", "10");
		legal.put("O_House_letter", "");
		legal.put("O_Floor", "ST");
		legal.put("O_Position", "TV");
		legal.put("O_Door_No", "");
		legal.put("O_Post_code", "2850");
		legal.put("O_City", "N&#230;rum");
		legal.put("CO_Address", "");
		legal.put("Protected_number", "N");
		legal.put("Protected_address", "N");
		
		Map pay = new HashMap();
		pay.put("Payment_method", "N");
		
		Map product = new HashMap();
		product.put("Number_of_SIM_cards", "1");
		product.put("Limit", "0");
		product.put("Transfer_of_mobile_number", "N");
		product.put("Agent_id", "00004");
		product.put("Conversion_of_prepaid", "N");
		product.put("Applicant_ID", "100000000069454");
		product.put("Activation_type", "");
		product.put("Application_source_sys_id", "200");
		product.put("Simcard_issued", "N");
		product.put("numberOfInstallmentPlans", "0");
		
		Map xmlWeb = new HashMap();
		xmlWeb.put("System_Field", sys);
		xmlWeb.put("Legal_owner", legal);
		xmlWeb.put("Payment", pay);
		xmlWeb.put("Product_other_info", product);
		//Map method = new HashMap();
		Map map = new HashMap();
		map.put("METHOD","Decision_Initial");
		map.put("WebXmlData", xmlWeb);
		System.out.println(new TransactServiceClient().trsXML(map));
	}

}
