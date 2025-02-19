/**
 * ShipmentBusinessServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.sap;

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

public class ShipmentBusinessServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.asiainfo.crm.inter.exe.webservice.client.sap.ShipmentBusinessServiceSoapPort {
	
	private static Log log = LogFactory.getLog(ShipmentBusinessServiceSoapBindingStub.class);
	
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[12];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createDoc");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "createDocRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "createDocRequest"), com.asiainfo.crm.inter.exe.webservice.client.sap.CreateDocRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "createDocResponse"));
        oper.setReturnClass(com.asiainfo.crm.inter.exe.webservice.client.sap.CreateDocResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "createDocResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cancelDoc");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "cancelDocRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "cancelDocRequest"), com.asiainfo.crm.inter.exe.webservice.client.sap.CancelDocRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "cancelDocResponse"));
        oper.setReturnClass(com.asiainfo.crm.inter.exe.webservice.client.sap.CancelDocResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "cancelDocResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateDoc");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "updateDocRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "updateDocRequest"), com.asiainfo.crm.inter.exe.webservice.client.sap.UpdateDocRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "updateDocResponse"));
        oper.setReturnClass(com.asiainfo.crm.inter.exe.webservice.client.sap.UpdateDocResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "updateDocResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createDoc2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "createDoc2Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "createDoc2Request"), com.asiainfo.crm.inter.exe.webservice.client.sap.CreateDoc2Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "createDoc2Response"));
        oper.setReturnClass(com.asiainfo.crm.inter.exe.webservice.client.sap.CreateDoc2Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "createDoc2Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cancelDoc2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "cancelDoc2Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "cancelDoc2Request"), com.asiainfo.crm.inter.exe.webservice.client.sap.CancelDoc2Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "cancelDoc2Response"));
        oper.setReturnClass(com.asiainfo.crm.inter.exe.webservice.client.sap.CancelDoc2Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "cancelDoc2Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateDoc2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "updateDoc2Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "updateDoc2Request"), com.asiainfo.crm.inter.exe.webservice.client.sap.UpdateDoc2Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "updateDoc2Response"));
        oper.setReturnClass(com.asiainfo.crm.inter.exe.webservice.client.sap.UpdateDoc2Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "updateDoc2Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createGoodsIssue");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "createGoodsIssueRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "createGoodsIssueRequest"), com.asiainfo.crm.inter.exe.webservice.client.sap.CreateGoodsIssueRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "createGoodsIssueResponse"));
        oper.setReturnClass(com.asiainfo.crm.inter.exe.webservice.client.sap.CreateGoodsIssueResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "createGoodsIssueResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPreOrderLimit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "getPreOrderLimitRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "getPreOrderLimitRequest"), com.asiainfo.crm.inter.exe.webservice.client.sap.GetPreOrderLimitRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "getPreOrderLimitResponse"));
        oper.setReturnClass(com.asiainfo.crm.inter.exe.webservice.client.sap.GetPreOrderLimitResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "getPreOrderLimitResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getStockList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "getStockListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "getStockListRequest"), com.asiainfo.crm.inter.exe.webservice.client.sap.GetStockListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "getStockListResponse"));
        oper.setReturnClass(com.asiainfo.crm.inter.exe.webservice.client.sap.GetStockListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "getStockListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updatePartner");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "updatePartnerRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "updatePartnerRequest"), com.asiainfo.crm.inter.exe.webservice.client.sap.UpdatePartnerRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "updatePartnerResponse"));
        oper.setReturnClass(com.asiainfo.crm.inter.exe.webservice.client.sap.UpdatePartnerResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "updatePartnerResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createPartner");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "createPartnerRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "createPartnerRequest"), com.asiainfo.crm.inter.exe.webservice.client.sap.CreatePartnerRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "createPartnerResponse"));
        oper.setReturnClass(com.asiainfo.crm.inter.exe.webservice.client.sap.CreatePartnerResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "createPartnerResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getFutureStockList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "getFutureStockListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "getFutureStockListRequest"), com.asiainfo.crm.inter.exe.webservice.client.sap.GetFuturestockListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "getFutureStockListResponse"));
        oper.setReturnClass(com.asiainfo.crm.inter.exe.webservice.client.sap.GetFuturestockListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "getFutureStockListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

    }

    public ShipmentBusinessServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ShipmentBusinessServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ShipmentBusinessServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
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
            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/sap/common", "char1");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/sap/common", "char20");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/sap/common", "char220");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/sap/common", "numeric3");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/sap/common", "YwsReturn");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.YwsReturn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "cancelDoc2Request");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.CancelDoc2Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "CancelDoc2RequestBody");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.CancelDoc2RequestBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "cancelDoc2Response");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.CancelDoc2Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "CancelDoc2ResponseBody");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.CancelDoc2ResponseBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "cancelDocRequest");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.CancelDocRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "CancelDocRequestBody");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.CancelDocRequestBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "cancelDocResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.CancelDocResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "CancelDocResponseBody");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.CancelDocResponseBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "char1");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "char10");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "char11");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "char12");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "char16");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "char18");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "char2");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "char20");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "char240");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "char241");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "char255");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "char3");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "char30");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "char4");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "char40");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "char4096");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "char5");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "char60");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "char72");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "char8");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "char81");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "createDoc2Request");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.CreateDoc2Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "CreateDoc2RequestBody");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.CreateDoc2RequestBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "createDoc2Response");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.CreateDoc2Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "CreateDoc2ResponseBody");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.CreateDoc2ResponseBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "createDocRequest");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.CreateDocRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "CreateDocRequestBody");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.CreateDocRequestBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "createDocResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.CreateDocResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "CreateDocResponseBody");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.CreateDocResponseBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "createGoodsIssueRequest");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.CreateGoodsIssueRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "CreateGoodsIssueRequestBody");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.CreateGoodsIssueRequestBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "createGoodsIssueResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.CreateGoodsIssueResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "CreateGoodsIssueResponseBody");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.CreateGoodsIssueResponseBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "createPartnerRequest");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.CreatePartnerRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "CreatePartnerRequestBody");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.CreatePartnerRequestBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "createPartnerResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.CreatePartnerResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "CreatePartnerResponseBody");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.CreatePartnerResponseBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "cuky5");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "date10");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "decimal23.4");
            cachedSerQNames.add(qName);
            cls = java.math.BigDecimal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "decimal9.5");
            cachedSerQNames.add(qName);
            cls = java.math.BigDecimal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "getFutureStockListRequest");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.GetFuturestockListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "getFutureStockListRequestBody");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.GetFuturestockListRequestBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "getFutureStockListResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.GetFuturestockListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "getFutureStockListResponseBody");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.GetFuturestockListResponseBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "getPreOrderLimitRequest");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.GetPreOrderLimitRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "GetPreOrderLimitRequestBody");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.GetPreOrderLimitRequestBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "getPreOrderLimitResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.GetPreOrderLimitResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "GetPreOrderLimitResponseBody");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.GetPreOrderLimitResponseBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "getStockListRequest");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.GetStockListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "GetStockListRequestBody");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.GetStockListRequestBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "getStockListResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.GetStockListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "GetStockListResponseBody");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.GetStockListResponseBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "lang");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "numeric6");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "quantum13.3");
            cachedSerQNames.add(qName);
            cls = java.math.BigDecimal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "TableOfYwsSoItem");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSoItem");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "TableOfYwsSoItemAttDocu");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemAttDocu[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSoItemAttDocu");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "TableOfYwsSoItemAttDocuUpd");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemAttDocuUpd[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSoItemAttDocuUpd");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "TableOfYwsSoItemData");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSoItemData");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "TableOfYwsSoItemDataOut");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemDataOut[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSoItemDataOut");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "TableOfYwsSoItemDataUpd");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemDataUpd[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSoItemDataUpd");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "TableOfYwsSoItemDataUpdOut");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemDataUpdOut[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSoItemDataUpdOut");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "TableOfYwsSoItemDeliMeth");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemDeliMeth[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSoItemDeliMeth");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "TableOfYwsSoItemDeliMethUpd");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemDeliMethUpd[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSoItemDeliMethUpd");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "TableOfYwsSoItemLongText");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemLongText[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSoItemLongText");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "TableOfYwsSoItemLongTextUpd");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemLongTextUpd[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSoItemLongTextUpd");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "TableOfYwsSoItemPartnerData");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemPartnerData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSoItemPartnerData");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "TableOfYwsSoItemPartnerDataUpd");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemPartnerDataUpd[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSoItemPartnerDataUpd");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "TableOfYwsSoPreOrderLimit");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoPreOrderLimit[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSoPreOrderLimit");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "unit3");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "updateDoc2Request");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.UpdateDoc2Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "UpdateDoc2RequestBody");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.UpdateDoc2RequestBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "updateDoc2Response");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.UpdateDoc2Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "UpdateDoc2ResponseBody");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.UpdateDoc2ResponseBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "updateDocRequest");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.UpdateDocRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "UpdateDocRequestBody");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.UpdateDocRequestBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "updateDocResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.UpdateDocResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "UpdateDocResponseBody");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.UpdateDocResponseBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "updatePartnerRequest");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.UpdatePartnerRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "UpdatePartnerRequestBody");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.UpdatePartnerRequestBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "updatePartnerResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.UpdatePartnerResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "UpdatePartnerResponseBody");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.UpdatePartnerResponseBody.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YTT_MATERIALS");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "char18");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YttFutureStockList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.YwsFutureStockList[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsFutureStockList");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YttFutureStockOutlets");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.YwsFutureStockOutlet[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsFutureStockOutlet");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YttFutureStocks");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.YwsFutureStock[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsFutureStock");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    }
    private void addBindings1() {
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
            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YttMaterials");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "char18");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YttOutlets");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "char10");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YttStockListMaterials");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.YttStockListMaterials.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YttStockListOutlets");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.YwsStockListOutlet[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsStockListOutlet");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsFutureStock");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.YwsFutureStock.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsFutureStockList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.YwsFutureStockList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsFutureStockOutlet");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.YwsFutureStockOutlet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSdPsCommonPartnerChng");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSdPsCommonPartnerChng.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSdPsCommonPartnerCreat");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSdPsCommonPartnerCreat.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSdPsDealerChange");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSdPsDealerChange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSdPsDealerCreate");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSdPsDealerCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSdPsIcChange");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSdPsIcChange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSdPsIcCreate");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSdPsIcCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSdPsOutletChange");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSdPsOutletChange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSdPsOutletCreate");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSdPsOutletCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSdPsSccpChange");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSdPsSccpChange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSdPsSccpCreate");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSdPsSccpCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSdSoControlData");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSdSoControlData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSoHeaderData");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoHeaderData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSoHeaderDataUpd");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoHeaderDataUpd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSoItem");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSoItemAttDocu");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemAttDocu.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSoItemAttDocuUpd");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemAttDocuUpd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSoItemData");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSoItemDataOut");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemDataOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSoItemDataUpd");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemDataUpd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSoItemDataUpdOut");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemDataUpdOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSoItemDeliMeth");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemDeliMeth.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSoItemDeliMethUpd");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemDeliMethUpd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSoItemLongText");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemLongText.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSoItemLongTextUpd");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemLongTextUpd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSoItemPartnerData");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemPartnerData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSoItemPartnerDataUpd");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemPartnerDataUpd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSoPreOrderLimit");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoPreOrderLimit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsStockListOutlet");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.sap.YwsStockListOutlet.class;
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

    public com.asiainfo.crm.inter.exe.webservice.client.sap.CreateDocResponse createDoc(com.asiainfo.crm.inter.exe.webservice.client.sap.CreateDocRequest parameters) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "createDoc"));
        setHeader(getRequestHeaders());
        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.inter.exe.webservice.client.sap.CreateDocResponse) _resp;
            } catch (java.lang.Exception _exception) {
            	if(log.isInfoEnabled()){
            		log.info("", _exception);
            	}
                return (com.asiainfo.crm.inter.exe.webservice.client.sap.CreateDocResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.inter.exe.webservice.client.sap.CreateDocResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.inter.exe.webservice.client.sap.CancelDocResponse cancelDoc(com.asiainfo.crm.inter.exe.webservice.client.sap.CancelDocRequest parameters) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "cancelDoc"));
        setHeader(getRequestHeaders());
        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.inter.exe.webservice.client.sap.CancelDocResponse) _resp;
            } catch (java.lang.Exception _exception) {
            	if(log.isInfoEnabled()){
            		log.info("", _exception);
            	}
                return (com.asiainfo.crm.inter.exe.webservice.client.sap.CancelDocResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.inter.exe.webservice.client.sap.CancelDocResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.inter.exe.webservice.client.sap.UpdateDocResponse updateDoc(com.asiainfo.crm.inter.exe.webservice.client.sap.UpdateDocRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "updateDoc"));
        setHeader(getRequestHeaders());
        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.inter.exe.webservice.client.sap.UpdateDocResponse) _resp;
            } catch (java.lang.Exception _exception) {
            	if(log.isInfoEnabled()){
            		log.info("", _exception);
            	}
                return (com.asiainfo.crm.inter.exe.webservice.client.sap.UpdateDocResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.inter.exe.webservice.client.sap.UpdateDocResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.inter.exe.webservice.client.sap.CreateDoc2Response createDoc2(com.asiainfo.crm.inter.exe.webservice.client.sap.CreateDoc2Request parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "createDoc2"));
        setHeader(getRequestHeaders());
        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.inter.exe.webservice.client.sap.CreateDoc2Response) _resp;
            } catch (java.lang.Exception _exception) {
            	if(log.isInfoEnabled()){
            		log.info("", _exception);
            	}
                return (com.asiainfo.crm.inter.exe.webservice.client.sap.CreateDoc2Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.inter.exe.webservice.client.sap.CreateDoc2Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.inter.exe.webservice.client.sap.CancelDoc2Response cancelDoc2(com.asiainfo.crm.inter.exe.webservice.client.sap.CancelDoc2Request parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "cancelDoc2"));
        setHeader(getRequestHeaders());
        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.inter.exe.webservice.client.sap.CancelDoc2Response) _resp;
            } catch (java.lang.Exception _exception) {
            	if(log.isInfoEnabled()){
            		log.info("", _exception);
            	}
                return (com.asiainfo.crm.inter.exe.webservice.client.sap.CancelDoc2Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.inter.exe.webservice.client.sap.CancelDoc2Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.inter.exe.webservice.client.sap.UpdateDoc2Response updateDoc2(com.asiainfo.crm.inter.exe.webservice.client.sap.UpdateDoc2Request parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "updateDoc2"));
        setHeader(getRequestHeaders());
        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.inter.exe.webservice.client.sap.UpdateDoc2Response) _resp;
            } catch (java.lang.Exception _exception) {
            	if(log.isInfoEnabled()){
            		log.info("", _exception);
            	}
                return (com.asiainfo.crm.inter.exe.webservice.client.sap.UpdateDoc2Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.inter.exe.webservice.client.sap.UpdateDoc2Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.inter.exe.webservice.client.sap.CreateGoodsIssueResponse createGoodsIssue(com.asiainfo.crm.inter.exe.webservice.client.sap.CreateGoodsIssueRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "createGoodsIssue"));
        setHeader(getRequestHeaders());
        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.inter.exe.webservice.client.sap.CreateGoodsIssueResponse) _resp;
            } catch (java.lang.Exception _exception) {
            	if(log.isInfoEnabled()){
            		log.info("", _exception);
            	}
                return (com.asiainfo.crm.inter.exe.webservice.client.sap.CreateGoodsIssueResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.inter.exe.webservice.client.sap.CreateGoodsIssueResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.inter.exe.webservice.client.sap.GetPreOrderLimitResponse getPreOrderLimit(com.asiainfo.crm.inter.exe.webservice.client.sap.GetPreOrderLimitRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getPreOrderLimit"));
        setHeader(getRequestHeaders());
        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.inter.exe.webservice.client.sap.GetPreOrderLimitResponse) _resp;
            } catch (java.lang.Exception _exception) {
            	if(log.isInfoEnabled()){
            		log.info("", _exception);
            	}
                return (com.asiainfo.crm.inter.exe.webservice.client.sap.GetPreOrderLimitResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.inter.exe.webservice.client.sap.GetPreOrderLimitResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.inter.exe.webservice.client.sap.GetStockListResponse getStockList(com.asiainfo.crm.inter.exe.webservice.client.sap.GetStockListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getStockList"));
        setHeader(getRequestHeaders());
        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.inter.exe.webservice.client.sap.GetStockListResponse) _resp;
            } catch (java.lang.Exception _exception) {
            	if(log.isInfoEnabled()){
            		log.info("", _exception);
            	}
                return (com.asiainfo.crm.inter.exe.webservice.client.sap.GetStockListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.inter.exe.webservice.client.sap.GetStockListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.inter.exe.webservice.client.sap.UpdatePartnerResponse updatePartner(com.asiainfo.crm.inter.exe.webservice.client.sap.UpdatePartnerRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "updatePartner"));
        setHeader(getRequestHeaders());
        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.inter.exe.webservice.client.sap.UpdatePartnerResponse) _resp;
            } catch (java.lang.Exception _exception) {
            	if(log.isInfoEnabled()){
            		log.info("", _exception);
            	}
                return (com.asiainfo.crm.inter.exe.webservice.client.sap.UpdatePartnerResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.inter.exe.webservice.client.sap.UpdatePartnerResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.inter.exe.webservice.client.sap.CreatePartnerResponse createPartner(com.asiainfo.crm.inter.exe.webservice.client.sap.CreatePartnerRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "createPartner"));
        setHeader(getRequestHeaders());
        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.inter.exe.webservice.client.sap.CreatePartnerResponse) _resp;
            } catch (java.lang.Exception _exception) {
            	if(log.isInfoEnabled()){
            		log.info("", _exception);
            	}
                return (com.asiainfo.crm.inter.exe.webservice.client.sap.CreatePartnerResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.inter.exe.webservice.client.sap.CreatePartnerResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.inter.exe.webservice.client.sap.GetFuturestockListResponse getFuturestockList(com.asiainfo.crm.inter.exe.webservice.client.sap.GetFuturestockListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getFutureStockList"));
        setHeader(getRequestHeaders());
        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.inter.exe.webservice.client.sap.GetFuturestockListResponse) _resp;
            } catch (java.lang.Exception _exception) {
            	if(log.isInfoEnabled()){
            		log.info("", _exception);
            	}
                return (com.asiainfo.crm.inter.exe.webservice.client.sap.GetFuturestockListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.inter.exe.webservice.client.sap.GetFuturestockListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
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
            String staffId = null;
            String tenantId = null;
            UserInfoInterface user = SessionManager.getUser();
            if (null != user)
            {
                tenantId = user.getTenantId();
                staffId = user.get("STAFF_ID") == null ? "" : user.get("STAFF_ID").toString();
            }
            try
            {
                soapHeaderElement.setPrefix("soa");
                soapHeaderElement.setNamespaceURI("http://soa.ailk.telenor.com/wsdl/soa");
                soapHeaderElement.addChild(new MessageElement(new QName("AppKey"), "8000000001"));
                soapHeaderElement.addChild(new MessageElement(new QName("TransactionID"), transactionID));
                soapHeaderElement.addChild(new MessageElement(new QName("ReqTime"), ReqTime));
                soapHeaderElement.addChild(new MessageElement(new QName("Version"), "0.1"));
                soapHeaderElement.addChild(new MessageElement(new QName("AcceptChannelType"), "0"));
                soapHeaderElement.addChild(new MessageElement(new QName("TenantId"), tenantId));
                soapHeaderElement.addChild(new MessageElement(new QName("AcceptStaffId"), staffId));
                soapHeaderElement.addChild(new MessageElement(new QName("AcceptOpId"), 1));
            }
            catch (SOAPException e)
            {
                // TODO Auto-generated catch block
            	log.info(e.getMessage());
            }
            return soapHeaderElement;
        }

}
