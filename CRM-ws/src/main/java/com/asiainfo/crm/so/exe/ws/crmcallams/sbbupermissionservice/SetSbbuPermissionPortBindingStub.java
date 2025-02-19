/**
 * SBBUpermissionPortBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.sbbupermissionservice;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;

import org.apache.axis.client.Call;
import org.apache.axis.message.MessageElement;
import org.apache.axis.message.SOAPHeaderElement;

import com.ai.appframe2.common.SessionManager;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.asiainfo.crm.util.CommonUtil;

public class SetSbbuPermissionPortBindingStub extends org.apache.axis.client.Stub implements com.asiainfo.crm.so.exe.ws.crmcallams.sbbupermissionservice.SetSbbuPermissionPort_PortType {
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
        oper.setName("SBBUpermission");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "SBBUpermissionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "SBBUpermissionRequest"), com.asiainfo.crm.so.exe.ws.crmcallams.sbbupermissionservice.SetSbbuPermissionRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "SBBUpermissionResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.sbbupermissionservice.SetSbbuPermissionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "SBBUpermissionResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

    }

    public SetSbbuPermissionPortBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public SetSbbuPermissionPortBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public SetSbbuPermissionPortBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "SBBUpermissionRequest");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.sbbupermissionservice.SetSbbuPermissionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "SBBUpermissionRequestBody");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.sbbupermissionservice.SetSbbuPermissionRequestBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "SBBUpermissionResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.sbbupermissionservice.SetSbbuPermissionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "SBBUpermissionResponseBody");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.sbbupermissionservice.SetSbbuPermissionResponseBody.class;
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
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
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
    
    public com.asiainfo.crm.so.exe.ws.crmcallams.sbbupermissionservice.SetSbbuPermissionResponse SBBUpermission(com.asiainfo.crm.so.exe.ws.crmcallams.sbbupermissionservice.SetSbbuPermissionRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SBBUpermission"));

        try {
			setHeader(_call);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
//        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.sbbupermissionservice.SetSbbuPermissionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.sbbupermissionservice.SetSbbuPermissionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.sbbupermissionservice.SetSbbuPermissionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
