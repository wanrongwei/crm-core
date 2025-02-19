/**
 * ServiceSuspensionBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.arp;

public class ServiceSuspensionBindingStub extends org.apache.axis.client.Stub implements com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceSuspension_PortType {
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
        oper.setName("RoamingSuspended");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "roamingSuspended"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "RoamingSuspended"), com.asiainfo.crm.inter.exe.webservice.client.arp.RoamingSuspended.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "Ack"));
        oper.setReturnClass(com.asiainfo.crm.inter.exe.webservice.client.arp.Ack.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "ack"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:oma:wsdl:pxprof:common:1:types", "PolicyException"),
                      "com.asiainfo.crm.inter.exe.webservice.client.arp.PolicyException",
                      new javax.xml.namespace.QName("urn:oma:wsdl:pxprof:common:1:types", "PolicyException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:oma:wsdl:pxprof:common:1:types", "ServiceException"),
                      "com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceException",
                      new javax.xml.namespace.QName("urn:oma:wsdl:pxprof:common:1:types", "ServiceException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RoamingUnSuspended");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "roamingUnSuspended"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "RoamingUnSuspended"), com.asiainfo.crm.inter.exe.webservice.client.arp.RoamingUnSuspended.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "Ack"));
        oper.setReturnClass(com.asiainfo.crm.inter.exe.webservice.client.arp.Ack.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "ack"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:oma:wsdl:pxprof:common:1:types", "PolicyException"),
                      "com.asiainfo.crm.inter.exe.webservice.client.arp.PolicyException",
                      new javax.xml.namespace.QName("urn:oma:wsdl:pxprof:common:1:types", "PolicyException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:oma:wsdl:pxprof:common:1:types", "ServiceException"),
                      "com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceException",
                      new javax.xml.namespace.QName("urn:oma:wsdl:pxprof:common:1:types", "ServiceException"), 
                      true
                     ));
        _operations[1] = oper;

    }

    public ServiceSuspensionBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ServiceSuspensionBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ServiceSuspensionBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("urn:oma:wsdl:pxprof:common:1:types", "PolicyException");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.arp.PolicyException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oma:wsdl:pxprof:common:1:types", "ServiceException");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "Ack");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.arp.Ack.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "BilateralInformation");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "BilateralSuspensionCode");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "LocalSuspensionCode");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "NotificationDescription");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "RoamingSuspended");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.arp.RoamingSuspended.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "RoamingUnSuspended");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.arp.RoamingUnSuspended.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "StandardSuspensionCode");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.arp.StandardSuspensionCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "SubscriptionId");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "SuspensionCode");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.arp.SuspensionCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "Tadig");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "TransactionId");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

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
        catch (java.lang.Exception _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.asiainfo.crm.inter.exe.webservice.client.arp.Ack roamingSuspended(com.asiainfo.crm.inter.exe.webservice.client.arp.RoamingSuspended body) throws java.rmi.RemoteException, com.asiainfo.crm.inter.exe.webservice.client.arp.PolicyException, com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.openmobilealliance.org/RoamingSuspended");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "RoamingSuspended"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.inter.exe.webservice.client.arp.Ack) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.inter.exe.webservice.client.arp.Ack) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.inter.exe.webservice.client.arp.Ack.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.asiainfo.crm.inter.exe.webservice.client.arp.PolicyException) {
              throw (com.asiainfo.crm.inter.exe.webservice.client.arp.PolicyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceException) {
              throw (com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.inter.exe.webservice.client.arp.Ack roamingUnSuspended(com.asiainfo.crm.inter.exe.webservice.client.arp.RoamingUnSuspended body) throws java.rmi.RemoteException, com.asiainfo.crm.inter.exe.webservice.client.arp.PolicyException, com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.openmobilealliance.org/RoamingUnSuspended");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "RoamingUnSuspended"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.inter.exe.webservice.client.arp.Ack) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.inter.exe.webservice.client.arp.Ack) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.inter.exe.webservice.client.arp.Ack.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.asiainfo.crm.inter.exe.webservice.client.arp.PolicyException) {
              throw (com.asiainfo.crm.inter.exe.webservice.client.arp.PolicyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceException) {
              throw (com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
