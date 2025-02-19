/**
 * SMDPPortBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.smdp;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;

import org.apache.axis.message.MessageElement;
import org.apache.axis.message.SOAPHeaderElement;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.common.SessionManager;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.asiainfo.crm.util.CommonUtil;

public class SMDPPortBindingStub extends org.apache.axis.client.Stub implements com.asiainfo.crm.inter.exe.webservice.client.smdp.SMDP {
	
	private static Log LOG = LogFactory.getLog(SMDPPortBindingStub.class);
	
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[2];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("confirmOrder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "confirmOrderRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "confirmOrderRequest"), com.asiainfo.crm.inter.exe.webservice.client.smdp.ConfirmOrderRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "confirmOrderResponse"));
        oper.setReturnClass(com.asiainfo.crm.inter.exe.webservice.client.smdp.ConfirmOrderResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "confirmOrderResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeProfile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "removeProfileRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "removeProfileRequest"), com.asiainfo.crm.inter.exe.webservice.client.smdp.RemoveProfileRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "removeProfileResponse"));
        oper.setReturnClass(com.asiainfo.crm.inter.exe.webservice.client.smdp.RemoveProfileResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "removeProfileResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

    }

    public SMDPPortBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public SMDPPortBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public SMDPPortBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "confirmOrderRequest");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.smdp.ConfirmOrderRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "confirmOrderRequestBody");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.smdp.ConfirmOrderRequestBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "confirmOrderResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.smdp.ConfirmOrderResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "confirmOrderResponseBody");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.smdp.ConfirmOrderResponseBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "iccidList");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "iccid");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "removeProfileRequest");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.smdp.RemoveProfileRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "removeProfileRequestBody");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.smdp.RemoveProfileRequestBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "removeProfileResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.smdp.RemoveProfileResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "removeProfileResponseBody");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.smdp.RemoveProfileResponseBody.class;
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

    public com.asiainfo.crm.inter.exe.webservice.client.smdp.ConfirmOrderResponse confirmOrder(com.asiainfo.crm.inter.exe.webservice.client.smdp.ConfirmOrderRequest parameters) throws Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "confirmOrder"));
        SOAPHeaderElement header = this.getRequestHeaders();
        setHeader(header);
        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});
 	
        checkRspStatus();
 		
        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.inter.exe.webservice.client.smdp.ConfirmOrderResponse) _resp;
            } catch (java.lang.Exception _exception) {
            	if(LOG.isInfoEnabled()) {
            		LOG.info(_exception);
            	}
                return (com.asiainfo.crm.inter.exe.webservice.client.smdp.ConfirmOrderResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.inter.exe.webservice.client.smdp.ConfirmOrderResponse.class);
            }
        }

    }

	public com.asiainfo.crm.inter.exe.webservice.client.smdp.RemoveProfileResponse removeProfile(
			com.asiainfo.crm.inter.exe.webservice.client.smdp.RemoveProfileRequest parameters) throws Exception {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[1]);
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "removeProfile"));
		SOAPHeaderElement header = this.getRequestHeaders();
		setHeader(header);
		setRequestHeaders(_call);
		setAttachments(_call);
		java.lang.Object _resp = _call.invoke(new java.lang.Object[] { parameters });

		checkRspStatus();

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException) _resp;
		} else {
			extractAttachments(_call);
			try {
				return (com.asiainfo.crm.inter.exe.webservice.client.smdp.RemoveProfileResponse) _resp;
			} catch (java.lang.Exception _exception) {
				if(LOG.isInfoEnabled()) {
            		LOG.info(_exception);
            	}
				return (com.asiainfo.crm.inter.exe.webservice.client.smdp.RemoveProfileResponse) org.apache.axis.utils.JavaUtils
						.convert(_resp, com.asiainfo.crm.inter.exe.webservice.client.smdp.RemoveProfileResponse.class);
			}
		}

	}
    
    private void checkRspStatus() throws Exception{
    	String rspCode = null;
    	String rspDesc = null;
  		try {
  			SOAPHeaderElement rspheader = getResponseHeader("http://soa.ailk.telenor.com/wsdl/soa", "ResponseHeader");
  			if(null != rspheader) {
  				rspCode = (String)rspheader.getChildElement(new QName("RspCode")).getObjectValue(String.class);
  				rspDesc = (String)rspheader.getChildElement(new QName("RspDesc")).getObjectValue(String.class);
  			}

  		}catch (Exception exp) {
  			if(LOG.isInfoEnabled()) {
  				LOG.info(exp);
  			}
  		}
  		
  		if(!"0000".equals(rspCode)) {
  			throw new Exception("Call SMDP Error: " + rspDesc);
  		}
    }
    
    protected SOAPHeaderElement getRequestHeaders()
            throws org.apache.axis.AxisFault
        {
            SOAPHeaderElement soapHeaderElement = new SOAPHeaderElement("", "RequestHeader");
            String appKey = "8000000001";
            String date8 = new SimpleDateFormat("yyyyMMdd").format(new Date());
            String date10=CommonUtil.getTransactionNum(1999999999, 10);
            String transactionID = appKey + date8 + date10;
            String ReqTime = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
            String code = null;
            String tenantId = null;
            UserInfoInterface user = SessionManager.getUser();
            if (null != user)
            {
                tenantId = user.getTenantId();
                code = user.get("CODE") == null ? "" : user.get("CODE").toString();
            }
            try
            {
                soapHeaderElement.setPrefix("soa");
                soapHeaderElement.setNamespaceURI("http://soa.ailk.telenor.com/wsdl/soa");
                soapHeaderElement.addChild(new MessageElement(new QName("AppKey"), "8000000001"));
                soapHeaderElement.addChild(new MessageElement(new QName("TransactionID"), transactionID));
                soapHeaderElement.addChild(new MessageElement(new QName("ReqTime"), ReqTime));
                soapHeaderElement.addChild(new MessageElement(new QName("Version"), "0.1"));
                soapHeaderElement.addChild(new MessageElement(new QName("AcceptChannelType"), "CRM"));
                soapHeaderElement.addChild(new MessageElement(new QName("TenantId"), tenantId));
                soapHeaderElement.addChild(new MessageElement(new QName("AcceptStaffId"), code));
                soapHeaderElement.addChild(new MessageElement(new QName("AcceptOpId"), 1));
            }
            catch (SOAPException e)
            {
                // TODO Auto-generated catch block
                LOG.info(e.getMessage());
            }
            return soapHeaderElement;
        }

}
