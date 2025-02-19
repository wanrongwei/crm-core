/**
 * ReleaseProfilePortBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.esimqueryqrservice;

import com.ai.appframe2.common.SessionManager;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.asiainfo.crm.util.CommonUtil;
import org.apache.axis.message.MessageElement;
import org.apache.axis.message.SOAPHeaderElement;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReleaseProfilePortBindingStub extends org.apache.axis.client.Stub implements ReleaseProfilePort {
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
        oper.setName("ReleaseProfile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "ReleaseProfileRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "ReleaseProfileRequest"), ReleaseProfileRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "ReleaseProfileResponse"));
        oper.setReturnClass(ReleaseProfileResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "ReleaseProfileResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

    }

    public ReleaseProfilePortBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ReleaseProfilePortBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ReleaseProfilePortBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "ReleaseProfileRequest");
            cachedSerQNames.add(qName);
            cls = ReleaseProfileRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "ReleaseProfileRequestBody");
            cachedSerQNames.add(qName);
            cls = ReleaseProfileRequestBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "ReleaseProfileResponse");
            cachedSerQNames.add(qName);
            cls = ReleaseProfileResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "ReleaseProfileResponseBody");
            cachedSerQNames.add(qName);
            cls = ReleaseProfileResponseBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                String key = (String) keys.nextElement();
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
                        Class cls = (Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            Class sf = (Class)
                                 cachedSerFactories.get(i);
                            Class df = (Class)
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
        catch (Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public ReleaseProfileResponse releaseProfile(ReleaseProfileRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ReleaseProfile"));

        SOAPHeaderElement header = this.getRequestHeaders();
        setHeader(header);
        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ReleaseProfileResponse) _resp;
            } catch (Exception _exception) {
                return (ReleaseProfileResponse) org.apache.axis.utils.JavaUtils.convert(_resp, ReleaseProfileResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    protected SOAPHeaderElement getRequestHeaders() throws org.apache.axis.AxisFault {

        SOAPHeaderElement soapHeaderElement = new SOAPHeaderElement("", "RequestHeader");
        String appKey = "1000000001";
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
}
