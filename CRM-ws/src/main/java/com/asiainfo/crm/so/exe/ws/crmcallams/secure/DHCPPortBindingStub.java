/**
 * DHCPPortBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.secure;

public class DHCPPortBindingStub extends org.apache.axis.client.Stub implements DHCP {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[10];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddStaticIPToCoasSubscriber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "AddStaticIPToCoasSubscriberRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "AddStaticIPToCoasSubscriberRequest"), AddStaticIPToCoasSubscriberRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "AddStaticIPToCoasSubscriberResponse"));
        oper.setReturnClass(AddStaticIPToCoasSubscriberResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "AddStaticIPToCoasSubscriberResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteStaticIPToCoasSubscriber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "DeleteStaticIPToCoasSubscriberRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "DeleteStaticIPToCoasSubscriberRequest"), DeleteStaticIPToCoasSubscriberRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "DeleteStaticIPToCoasSubscriberResponse"));
        oper.setReturnClass(DeleteStaticIPToCoasSubscriberResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "DeleteStaticIPToCoasSubscriberResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAllStaticIPsAssignedList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "GetAllStaticIPsAssignedListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "GetAllStaticIPsAssignedListRequest"), GetAllStaticIPsAssignedListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "GetAllStaticIPsAssignedListResponse"));
        oper.setReturnClass(GetAllStaticIPsAssignedListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "GetAllStaticIPsAssignedListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetStatusDSLFiber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "GetStatusDSLFiberRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "GetStatusDSLFiberRequest"), GetStatusDSLFiberRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "GetStatusDSLFiberResponse"));
        oper.setReturnClass(GetStatusDSLFiberResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "GetStatusDSLFiberResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProvisioDSLFiber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "ProvisioDSLFiberRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "ProvisioDSLFiberRequest"), ProvisioDSLFiberRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "ProvisioDSLFiberResponse"));
        oper.setReturnClass(ProvisioDSLFiberResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "ProvisioDSLFiberResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RemoveDSLFiber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "RemoveDSLFiberRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "RemoveDSLFiberRequest"), RemoveDSLFiberRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "RemoveDSLFiberResponse"));
        oper.setReturnClass(RemoveDSLFiberResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "RemoveDSLFiberResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetStatusCoax");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "GetStatusCoaxRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "GetStatusCoaxRequest"), GetStatusCoaxRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "GetStatusCoaxResponse"));
        oper.setReturnClass(GetStatusCoaxResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "GetStatusCoaxResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProvisionCoax");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "ProvisionCoaxRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "ProvisionCoaxRequest"), ProvisionCoaxRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "ProvisionCoaxResponse"));
        oper.setReturnClass(ProvisionCoaxResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "ProvisionCoaxResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RemoveCoax");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "RemoveCoaxRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "RemoveCoaxRequest"), RemoveCoaxRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "RemoveCoaxResponse"));
        oper.setReturnClass(RemoveCoaxResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "RemoveCoaxResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RemoveCoaxOne");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "RemoveCoaxOneRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "RemoveCoaxOneRequest"), RemoveCoaxOneRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "RemoveCoaxOneResponse"));
        oper.setReturnClass(RemoveCoaxOneResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "RemoveCoaxOneResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    public DHCPPortBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public DHCPPortBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public DHCPPortBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.1");
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
            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "AddStaticIPToCoasSubscriberRequest");
            cachedSerQNames.add(qName);
            cls = AddStaticIPToCoasSubscriberRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "AddStaticIPToCoasSubscriberRequestBody");
            cachedSerQNames.add(qName);
            cls = AddStaticIPToCoasSubscriberRequestBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "AddStaticIPToCoasSubscriberResponse");
            cachedSerQNames.add(qName);
            cls = AddStaticIPToCoasSubscriberResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "AddStaticIPToCoasSubscriberResponseBody");
            cachedSerQNames.add(qName);
            cls = AddStaticIPToCoasSubscriberResponseBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "DeleteStaticIPToCoasSubscriberRequest");
            cachedSerQNames.add(qName);
            cls = DeleteStaticIPToCoasSubscriberRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "DeleteStaticIPToCoasSubscriberRequestBody");
            cachedSerQNames.add(qName);
            cls = DeleteStaticIPToCoasSubscriberRequestBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "DeleteStaticIPToCoasSubscriberResponse");
            cachedSerQNames.add(qName);
            cls = DeleteStaticIPToCoasSubscriberResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "DeleteStaticIPToCoasSubscriberResponseBody");
            cachedSerQNames.add(qName);
            cls = DeleteStaticIPToCoasSubscriberResponseBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "GetAllStaticIPsAssignedListRequest");
            cachedSerQNames.add(qName);
            cls = GetAllStaticIPsAssignedListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "GetAllStaticIPsAssignedListRequestBody");
            cachedSerQNames.add(qName);
            cls = GetAllStaticIPsAssignedListRequestBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "GetAllStaticIPsAssignedListResponse");
            cachedSerQNames.add(qName);
            cls = GetAllStaticIPsAssignedListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "GetAllStaticIPsAssignedListResponseBody");
            cachedSerQNames.add(qName);
            cls = GetAllStaticIPsAssignedListResponseBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "GetStatusCoaxRequest");
            cachedSerQNames.add(qName);
            cls = GetStatusCoaxRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "GetStatusCoaxRequestBody");
            cachedSerQNames.add(qName);
            cls = GetStatusCoaxRequestBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "GetStatusCoaxResponse");
            cachedSerQNames.add(qName);
            cls = GetStatusCoaxResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "GetStatusCoaxResponseBody");
            cachedSerQNames.add(qName);
            cls = GetStatusCoaxResponseBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "GetStatusDSLFiberRequest");
            cachedSerQNames.add(qName);
            cls = GetStatusDSLFiberRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "GetStatusDSLFiberRequestBody");
            cachedSerQNames.add(qName);
            cls = GetStatusDSLFiberRequestBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "GetStatusDSLFiberResponse");
            cachedSerQNames.add(qName);
            cls = GetStatusDSLFiberResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "GetStatusDSLFiberResponseBody");
            cachedSerQNames.add(qName);
            cls = GetStatusDSLFiberResponseBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "ProvisioDSLFiberRequest");
            cachedSerQNames.add(qName);
            cls = ProvisioDSLFiberRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "ProvisioDSLFiberRequestBody");
            cachedSerQNames.add(qName);
            cls = ProvisioDSLFiberRequestBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "ProvisioDSLFiberResponse");
            cachedSerQNames.add(qName);
            cls = ProvisioDSLFiberResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "ProvisioDSLFiberResponseBody");
            cachedSerQNames.add(qName);
            cls = ProvisioDSLFiberResponseBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "ProvisionCoaxRequest");
            cachedSerQNames.add(qName);
            cls = ProvisionCoaxRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "ProvisionCoaxRequestBody");
            cachedSerQNames.add(qName);
            cls = ProvisionCoaxRequestBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "ProvisionCoaxResponse");
            cachedSerQNames.add(qName);
            cls = ProvisionCoaxResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "ProvisionCoaxResponseBody");
            cachedSerQNames.add(qName);
            cls = ProvisionCoaxResponseBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "RemoveCoaxOneRequest");
            cachedSerQNames.add(qName);
            cls = RemoveCoaxOneRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "RemoveCoaxOneRequestBody");
            cachedSerQNames.add(qName);
            cls = RemoveCoaxOneRequestBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "RemoveCoaxOneResponse");
            cachedSerQNames.add(qName);
            cls = RemoveCoaxOneResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "RemoveCoaxOneResponseBody");
            cachedSerQNames.add(qName);
            cls = RemoveCoaxOneResponseBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "RemoveCoaxRequest");
            cachedSerQNames.add(qName);
            cls = RemoveCoaxRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "RemoveCoaxRequestBody");
            cachedSerQNames.add(qName);
            cls = RemoveCoaxRequestBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "RemoveCoaxResponse");
            cachedSerQNames.add(qName);
            cls = RemoveCoaxResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "RemoveCoaxResponseBody");
            cachedSerQNames.add(qName);
            cls = RemoveCoaxResponseBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "RemoveDSLFiberRequest");
            cachedSerQNames.add(qName);
            cls = RemoveDSLFiberRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "RemoveDSLFiberRequestBody");
            cachedSerQNames.add(qName);
            cls = RemoveDSLFiberRequestBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "RemoveDSLFiberResponse");
            cachedSerQNames.add(qName);
            cls = RemoveDSLFiberResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "RemoveDSLFiberResponseBody");
            cachedSerQNames.add(qName);
            cls = RemoveDSLFiberResponseBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "staticIPsInfo");
            cachedSerQNames.add(qName);
            cls = StaticIPsInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "staticIPsList");
            cachedSerQNames.add(qName);
            cls = StaticIPsInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "staticIPsInfo");
            qName2 = new javax.xml.namespace.QName("", "staticIPsInfos");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

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

    public AddStaticIPToCoasSubscriberResponse addStaticIPToCoasSubscriber(AddStaticIPToCoasSubscriberRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AddStaticIPToCoasSubscriber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AddStaticIPToCoasSubscriberResponse) _resp;
            } catch (Exception _exception) {
                return (AddStaticIPToCoasSubscriberResponse) org.apache.axis.utils.JavaUtils.convert(_resp, AddStaticIPToCoasSubscriberResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DeleteStaticIPToCoasSubscriberResponse deleteStaticIPToCoasSubscriber(DeleteStaticIPToCoasSubscriberRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteStaticIPToCoasSubscriber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DeleteStaticIPToCoasSubscriberResponse) _resp;
            } catch (Exception _exception) {
                return (DeleteStaticIPToCoasSubscriberResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DeleteStaticIPToCoasSubscriberResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public GetAllStaticIPsAssignedListResponse getAllStaticIPsAssignedList(GetAllStaticIPsAssignedListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAllStaticIPsAssignedList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (GetAllStaticIPsAssignedListResponse) _resp;
            } catch (Exception _exception) {
                return (GetAllStaticIPsAssignedListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, GetAllStaticIPsAssignedListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public GetStatusDSLFiberResponse getStatusDSLFiber(GetStatusDSLFiberRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetStatusDSLFiber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (GetStatusDSLFiberResponse) _resp;
            } catch (Exception _exception) {
                return (GetStatusDSLFiberResponse) org.apache.axis.utils.JavaUtils.convert(_resp, GetStatusDSLFiberResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ProvisioDSLFiberResponse provisioDSLFiber(ProvisioDSLFiberRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ProvisioDSLFiber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ProvisioDSLFiberResponse) _resp;
            } catch (Exception _exception) {
                return (ProvisioDSLFiberResponse) org.apache.axis.utils.JavaUtils.convert(_resp, ProvisioDSLFiberResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public RemoveDSLFiberResponse removeDSLFiber(RemoveDSLFiberRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "RemoveDSLFiber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (RemoveDSLFiberResponse) _resp;
            } catch (Exception _exception) {
                return (RemoveDSLFiberResponse) org.apache.axis.utils.JavaUtils.convert(_resp, RemoveDSLFiberResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public GetStatusCoaxResponse getStatusCoax(GetStatusCoaxRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetStatusCoax"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (GetStatusCoaxResponse) _resp;
            } catch (Exception _exception) {
                return (GetStatusCoaxResponse) org.apache.axis.utils.JavaUtils.convert(_resp, GetStatusCoaxResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ProvisionCoaxResponse provisionCoax(ProvisionCoaxRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ProvisionCoax"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ProvisionCoaxResponse) _resp;
            } catch (Exception _exception) {
                return (ProvisionCoaxResponse) org.apache.axis.utils.JavaUtils.convert(_resp, ProvisionCoaxResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public RemoveCoaxResponse removeCoax(RemoveCoaxRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "RemoveCoax"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (RemoveCoaxResponse) _resp;
            } catch (Exception _exception) {
                return (RemoveCoaxResponse) org.apache.axis.utils.JavaUtils.convert(_resp, RemoveCoaxResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public RemoveCoaxOneResponse removeCoaxOne(RemoveCoaxOneRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "RemoveCoaxOne"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (RemoveCoaxOneResponse) _resp;
            } catch (Exception _exception) {
                return (RemoveCoaxOneResponse) org.apache.axis.utils.JavaUtils.convert(_resp, RemoveCoaxOneResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
