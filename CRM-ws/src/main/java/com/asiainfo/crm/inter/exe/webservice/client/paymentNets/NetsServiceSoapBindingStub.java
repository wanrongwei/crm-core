/**
 * NetsServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.paymentNets;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.rpc.Service;

import org.apache.axis.description.OperationDesc;
import org.apache.axis.description.ParameterDesc;
import org.apache.axis.encoding.DeserializerFactory;
import org.apache.axis.encoding.SerializerFactory;
import org.apache.axis.encoding.XMLType;
import org.apache.axis.encoding.ser.ArrayDeserializerFactory;
import org.apache.axis.encoding.ser.ArraySerializerFactory;
import org.apache.axis.encoding.ser.BeanDeserializerFactory;
import org.apache.axis.encoding.ser.BeanSerializerFactory;
import org.apache.axis.encoding.ser.EnumDeserializerFactory;
import org.apache.axis.encoding.ser.EnumSerializerFactory;
import org.apache.axis.encoding.ser.SimpleDeserializerFactory;
import org.apache.axis.encoding.ser.SimpleListDeserializerFactory;
import org.apache.axis.encoding.ser.SimpleListSerializerFactory;
import org.apache.axis.encoding.ser.SimpleSerializerFactory;
import org.apache.axis.message.SOAPHeaderElement;

import com.ai.appframe2.common.SessionManager;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.asiainfo.crm.util.CommonUtil;

public class NetsServiceSoapBindingStub extends org.apache.axis.client.Stub implements NetsServiceSoapPort {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static OperationDesc [] _operations;

    static {
        _operations = new OperationDesc[1];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        OperationDesc oper;
        ParameterDesc param;
        oper = new OperationDesc();
        oper.setName("checkBankAccount");
        param = new ParameterDesc(new QName("http://soa.ailk.telenor.com/wsdl/soa", "RequestHeader"), ParameterDesc.IN, new QName("http://soa.ailk.telenor.com/schema/soa/common", "RequestHeader"), RequestHeader.class, true, true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://soa.ailk.telenor.com/wsdl/soa", "checkBankAccountRequest"), ParameterDesc.IN, new QName("http://soa.ailk.telenor.com/schema/soa/busi", "checkBankAccountRequest"), CheckBankAccountRequest.class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://soa.ailk.telenor.com/wsdl/soa", "ResponseHeader"), ParameterDesc.OUT, new QName("http://soa.ailk.telenor.com/schema/soa/common", "ResponseHeader"), ResponseHeader.class, true, true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://soa.ailk.telenor.com/wsdl/soa", "checkBankAccountResponse"), ParameterDesc.OUT, new QName("http://soa.ailk.telenor.com/schema/soa/busi", "checkBankAccountResponse"), CheckBankAccountResponse.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

    }

    public NetsServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public NetsServiceSoapBindingStub(java.net.URL endpointURL, Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public NetsServiceSoapBindingStub(Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            Class cls;
            QName qName;
            QName qName2;
            Class beansf = BeanSerializerFactory.class;
            Class beandf = BeanDeserializerFactory.class;
            Class enumsf = EnumSerializerFactory.class;
            Class enumdf = EnumDeserializerFactory.class;
            Class arraysf = ArraySerializerFactory.class;
            Class arraydf = ArrayDeserializerFactory.class;
            Class simplesf = SimpleSerializerFactory.class;
            Class simpledf = SimpleDeserializerFactory.class;
            Class simplelistsf = SimpleListSerializerFactory.class;
            Class simplelistdf = SimpleListDeserializerFactory.class;
            qName = new QName("http://soa.ailk.telenor.com/schema/soa/busi", "checkBankAccountRequest");
            cachedSerQNames.add(qName);
            cls = CheckBankAccountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new QName("http://soa.ailk.telenor.com/schema/soa/busi", "checkBankAccountRequestBody");
            cachedSerQNames.add(qName);
            cls = CheckBankAccountRequestBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new QName("http://soa.ailk.telenor.com/schema/soa/busi", "checkBankAccountResponse");
            cachedSerQNames.add(qName);
            cls = CheckBankAccountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new QName("http://soa.ailk.telenor.com/schema/soa/busi", "checkBankAccountResponseBody");
            cachedSerQNames.add(qName);
            cls = CheckBankAccountResponseBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new QName("http://soa.ailk.telenor.com/schema/soa/common", "RequestHeader");
            cachedSerQNames.add(qName);
            cls = RequestHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new QName("http://soa.ailk.telenor.com/schema/soa/common", "ResponseHeader");
            cachedSerQNames.add(qName);
            cls = ResponseHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call call = super._createCall();
            if (super.maintainSessionSet) {
                call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        Class cls = (Class) cachedSerClasses.get(i);
                        QName qName =
                                (QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            Class sf = (Class)
                                 cachedSerFactories.get(i);
                            Class df = (Class)
                                 cachedDeserFactories.get(i);
                            call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof SerializerFactory) {
                        	SerializerFactory sf = (SerializerFactory)
                                 cachedSerFactories.get(i);
                            DeserializerFactory df = (DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public RequestHeader getRequestHeader(){
    	
    	SOAPHeaderElement soapHeaderElement = new SOAPHeaderElement("", "RequestHeader");
        String appKey = "8000000001";
        String date8 = new SimpleDateFormat("yyyyMMdd").format(new Date());
        String date10=CommonUtil.getTransactionNum(1999999999, 10);
        String transactionID = appKey + date8 + date10;
        String reqTime = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        String staffId = null;
        String tenantId = null;
        UserInfoInterface user = SessionManager.getUser();
	if(null!=user){
		tenantId=user.getTenantId();
		staffId = user.get("STAFF_ID") == null ? "" : user.get("STAFF_ID").toString();
	}
    	RequestHeader header = new RequestHeader();
    	header.setAppKey(appKey);
    	header.setTransactionID(transactionID);
    	header.setReqTime(reqTime);
    	header.setVersion("1.0");
    	header.setAcceptChannelType("CRM");
    	header.setTenantId(tenantId);
    	header.setAcceptStaffId(staffId);
    	header.setAcceptOpId("0");
    	return header;
    	
    }
    public Map checkBankAccount(CheckBankAccountRequest parameters) throws Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call call = createCall();
        call.setOperation(_operations[0]);
        call.setUseSOAPAction(true);
        call.setSOAPActionURI("");
        call.setEncodingStyle(null);
        call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        call.setOperationName(new QName("", "checkBankAccount"));
        setRequestHeaders(_call);
        setAttachments(call);
        Map retMap = new HashMap();
        CheckBankAccountResponse checkBankAccountResponse = null;
       
        ResponseHeader responseHeader = null;
 try {        java.lang.Object _resp = call.invoke(new java.lang.Object[] {this.getRequestHeader(),parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {

            extractAttachments(call);
            Map output = call.getOutputParams();
            try {
            	responseHeader= (ResponseHeader) output.get(new QName("http://soa.ailk.telenor.com/wsdl/soa", "ResponseHeader"));
            } catch (java.lang.Exception _exception) {
            	responseHeader = (ResponseHeader) org.apache.axis.utils.JavaUtils.convert(output.get(new QName("http://soa.ailk.telenor.com/wsdl/soa", "ResponseHeader")), ResponseHeader.class);
            }
            try {
            	checkBankAccountResponse = (CheckBankAccountResponse) output.get(new QName("http://soa.ailk.telenor.com/wsdl/soa", "checkBankAccountResponse"));
            } catch (java.lang.Exception _exception) {
            	checkBankAccountResponse = (CheckBankAccountResponse) org.apache.axis.utils.JavaUtils.convert(output.get(new QName("http://soa.ailk.telenor.com/wsdl/soa", "checkBankAccountResponse")), CheckBankAccountResponse.class);
            }
            retMap.put("Response", checkBankAccountResponse);
            retMap.put("ResponseHeader", responseHeader);
            return retMap;
        }
  } catch (Exception e ) {
  throw e;
}
    }

}
