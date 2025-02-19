/**
 * ESServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.esconsumer;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.common.SessionManager;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.asiainfo.crm.util.CommonUtil;
import com.asiainfo.crm.inter.exe.webservice.client.esconsumer.holders.ResponseHeaderHolder;

public class ESServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.asiainfo.crm.inter.exe.webservice.client.esconsumer.ESServiceSoapPort {
	
	private static Log LOG = LogFactory.getLog(ESServiceSoapBindingStub.class);
	
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
        oper.setName("raiseEvent");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "RequestHeader"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/common", "RequestHeader"), com.asiainfo.crm.inter.exe.webservice.client.esconsumer.RequestHeader.class, true, true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nbi.mdm.alu.com/", "raiseEvent"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://nbi.mdm.alu.com/", ">raiseEvent"), com.asiainfo.crm.inter.exe.webservice.client.esconsumer.RaiseEvent.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "ResponseHeader"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/common", "ResponseHeader"), com.asiainfo.crm.inter.exe.webservice.client.esconsumer.ResponseHeader.class, true, true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://nbi.mdm.alu.com/", "raiseEventResponse"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://nbi.mdm.alu.com/", ">raiseEventResponse"), com.asiainfo.crm.inter.exe.webservice.client.esconsumer.RaiseEventResponse.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

    }

    public ESServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ESServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ESServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://nbi.mdm.alu.com/", ">raiseEvent");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.esconsumer.RaiseEvent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://nbi.mdm.alu.com/", ">raiseEventResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.esconsumer.RaiseEventResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://nbi.mdm.alu.com/", "deviceReferenceRequest");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.esconsumer.DeviceReferenceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://nbi.mdm.alu.com/", "nbiCustomEvent");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.esconsumer.NbiCustomEvent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://nbi.mdm.alu.com/", "nbiDeviceTriplet");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.esconsumer.NbiDeviceTriplet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://nbi.mdm.alu.com/", "nbiEvent");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.esconsumer.NbiEvent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/common", "RequestHeader");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.esconsumer.RequestHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/common", "ResponseHeader");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.esconsumer.ResponseHeader.class;
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

	public ResponseHeaderHolder raiseEvent(
			com.asiainfo.crm.inter.exe.webservice.client.esconsumer.RaiseEvent parameters)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[0]);
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "raiseEvent"));

		RequestHeader header = new RequestHeader();
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
        header.setAppKey(appKey);
        header.setTransactionID(transactionID);
        header.setReqTime(ReqTime);
        header.setTenantId(tenantId);
        header.setAcceptStaffId(code);
        header.setAcceptChannelType("CRM");

		setRequestHeaders(_call);
		setAttachments(_call);
		com.asiainfo.crm.inter.exe.webservice.client.esconsumer.holders.ResponseHeaderHolder rsp = new ResponseHeaderHolder();
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] { header, parameters });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				java.util.Map _output;
				_output = _call.getOutputParams();
				try {
					rsp.value = (com.asiainfo.crm.inter.exe.webservice.client.esconsumer.ResponseHeader) _output.get(
							new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "ResponseHeader"));
				} catch (java.lang.Exception _exception) {
					if(LOG.isInfoEnabled()) {
						LOG.info(_exception);
					}
					rsp.value = (com.asiainfo.crm.inter.exe.webservice.client.esconsumer.ResponseHeader) org.apache.axis.utils.JavaUtils
							.convert(
									_output.get(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa",
											"ResponseHeader")),
									com.asiainfo.crm.inter.exe.webservice.client.esconsumer.ResponseHeader.class);
				}

			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
		return rsp;
	}

}
