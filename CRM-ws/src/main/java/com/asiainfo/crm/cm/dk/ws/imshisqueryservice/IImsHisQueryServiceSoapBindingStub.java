/**
 * IImsHisQueryServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imshisqueryservice;

public class IImsHisQueryServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.asiainfo.crm.cm.dk.ws.imshisqueryservice.IImsHisQueryServiceWs {
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
        oper.setName("DoQueryHisBillInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imshisqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sQueryHisBillReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryHisBillReq"), com.asiainfo.crm.cm.dk.ws.imshisqueryservice.SQueryHisBillReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryHisBillInfoResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imshisqueryservice.DoQueryHisBillInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoQueryUnPayFee");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imshisqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryUnPayFeeReq"), com.asiainfo.crm.cm.dk.ws.imshisqueryservice.QueryUnPayFeeReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryUnPayFeeResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imshisqueryservice.DoQueryUnPayFeeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

    }

    public IImsHisQueryServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public IImsHisQueryServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public IImsHisQueryServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "baseResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imshisqueryservice.BaseResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "billDetail");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imshisqueryservice.BillDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "billDetailList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imshisqueryservice.BillDetail[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "billDetail");
            qName2 = new javax.xml.namespace.QName("", "billDetailListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "billinfo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imshisqueryservice.Billinfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "billinfoList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imshisqueryservice.Billinfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "billinfo");
            qName2 = new javax.xml.namespace.QName("", "billinfoListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "billItem");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imshisqueryservice.BillItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "billItemList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imshisqueryservice.BillItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "billItem");
            qName2 = new javax.xml.namespace.QName("", "billItemListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "caBill");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imshisqueryservice.CaBill.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "caBillItem");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imshisqueryservice.CaBillItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "caBillItemList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imshisqueryservice.CaBillItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "caBillItem");
            qName2 = new javax.xml.namespace.QName("", "caBillItemListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "caBillList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imshisqueryservice.CaBill[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "caBill");
            qName2 = new javax.xml.namespace.QName("", "billListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "caBillProd");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imshisqueryservice.CaBillProd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "caBillProdList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imshisqueryservice.CaBillProd[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "caBillProd");
            qName2 = new javax.xml.namespace.QName("", "caBillProdListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "caBillTax");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imshisqueryservice.CaBillTax.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "caBillTaxList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imshisqueryservice.CaBillTax[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "caBillTax");
            qName2 = new javax.xml.namespace.QName("", "caBillTaxListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "crmBaseResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imshisqueryservice.CrmBaseResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryHisBillInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imshisqueryservice.DoQueryHisBillInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryUnPayFeeResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imshisqueryservice.DoQueryUnPayFeeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "invoiceDetails");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imshisqueryservice.InvoiceDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryUnPayFeeReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imshisqueryservice.QueryUnPayFeeReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imshisqueryservice.RequestHead.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "responseHead");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imshisqueryservice.ResponseHead.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryHisBillReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imshisqueryservice.SQueryHisBillReq.class;
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
        catch (java.lang.Exception _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.asiainfo.crm.cm.dk.ws.imshisqueryservice.DoQueryHisBillInfoResponse doQueryHisBillInfo(com.asiainfo.crm.cm.dk.ws.imshisqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imshisqueryservice.SQueryHisBillReq sQueryHisBillReq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoQueryHisBillInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sQueryHisBillReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.cm.dk.ws.imshisqueryservice.DoQueryHisBillInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imshisqueryservice.DoQueryHisBillInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imshisqueryservice.DoQueryHisBillInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imshisqueryservice.DoQueryUnPayFeeResponse doQueryUnPayFee(com.asiainfo.crm.cm.dk.ws.imshisqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imshisqueryservice.QueryUnPayFeeReq req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoQueryUnPayFee"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.cm.dk.ws.imshisqueryservice.DoQueryUnPayFeeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imshisqueryservice.DoQueryUnPayFeeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imshisqueryservice.DoQueryUnPayFeeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
