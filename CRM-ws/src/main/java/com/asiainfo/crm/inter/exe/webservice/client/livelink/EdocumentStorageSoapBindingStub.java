/**
 * EdocumentStorageSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.livelink;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;

import org.apache.axis.message.MessageElement;
import org.apache.axis.message.SOAPHeaderElement;

import com.ai.appframe2.common.SessionManager;
import com.ai.appframe2.complex.cache.CacheFactory;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.asiainfo.appframe.ext.exeframe.msg.jetty.util.log.Log;
import com.asiainfo.appframe.ext.exeframe.ws.client.cache.WsClientCacheImpl;
import com.asiainfo.appframe.ext.exeframe.ws.query.impl.po.CfgWsClient;
import com.asiainfo.crm.util.CommonUtil;

public class EdocumentStorageSoapBindingStub extends org.apache.axis.client.Stub implements EdocumentStoragePortType
{
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    
    private java.util.Vector cachedDeserFactories = new java.util.Vector();
    
    static org.apache.axis.description.OperationDesc[] _operations;
    
    static
    {
        _operations = new org.apache.axis.description.OperationDesc[8];
        _initOperationDesc1();
    }
    
    private static void _initOperationDesc1()
    {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createDocument");
        param =
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestBody"),
                org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName(
                    "http://soa.ailk.telenor.com/wsdl/soa", "createDocumentRequestBody"),
                CreateDocumentRequestBody.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa",
            "createDocumentResponseBody"));
        oper.setReturnClass(CreateDocumentResponseBody.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ResponseBody"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;
        
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDocument");
        param =
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestBody"),
                org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName(
                    "http://soa.ailk.telenor.com/wsdl/soa", "getDocumentRequestBody"), GetDocumentRequestBody.class,
                false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa",
            "getDocumentResponseBody"));
        oper.setReturnClass(GetDocumentResponseBody.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ResponseBody"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;
        
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDocumentByBarcode");
        param =
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestBody"),
                org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName(
                    "http://soa.ailk.telenor.com/wsdl/soa", "getDocumentByBarcodeRequestBody"),
                GetDocumentByBarcodeRequestBody.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa",
            "getDocumentByBarcodeResponseBody"));
        oper.setReturnClass(GetDocumentByBarcodeResponseBody.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ResponseBody"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;
        
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteDocument");
        param =
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestBody"),
                org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName(
                    "http://soa.ailk.telenor.com/wsdl/soa", "deleteDocumentRequestBody"),
                DeleteDocumentRequestBody.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa",
            "deleteDocumentResponseBody"));
        oper.setReturnClass(DeleteDocumentResponseBody.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ResponseBody"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;
        
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("assignMetadata");
        param =
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestBody"),
                org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName(
                    "http://soa.ailk.telenor.com/wsdl/soa", "assignMetadataRequestBody"),
                AssignMetadataRequestBody.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa",
            "assignMetadataResponseBody"));
        oper.setReturnClass(AssignMetadataResponseBody.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ResponseBody"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;
        
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("authentication");
        param =
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestBody"),
                org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName(
                    "http://soa.ailk.telenor.com/wsdl/soa", "authenticationRequestBody"),
                AuthenticationRequestBody.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa",
            "authenticationResponseBody"));
        oper.setReturnClass(AuthenticationResponseBody.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ResponseBody"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;
        
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SignDocumentLTV");
        param =
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestBody"),
                org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName(
                    "http://soa.ailk.telenor.com/wsdl/soa", "SignDocumentLTVRequestBody"),
                SignDocumentLTVRequestBody.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa",
            "SignDocumentLTVResponseBody"));
        oper.setReturnClass(SignDocumentLTVResponseBody.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ResponseBody"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;
        
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SignDocumentWithSigTimestamp");
        param =
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestBody"),
                org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName(
                    "http://soa.ailk.telenor.com/wsdl/soa", "SignDocumentWithSigTimestampRequestBody"),
                SignDocumentWithSigTimestampRequestBody.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa",
            "SignDocumentWithSigTimestampResponseBody"));
        oper.setReturnClass(SignDocumentWithSigTimestampResponseBody.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ResponseBody"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;
        
    }
    
    public EdocumentStorageSoapBindingStub()
        throws org.apache.axis.AxisFault
    {
        this(null);
    }
    
    public EdocumentStorageSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service)
        throws org.apache.axis.AxisFault
    {
        this(service);
        super.cachedEndpoint = endpointURL;
    }
    
    public EdocumentStorageSoapBindingStub(javax.xml.rpc.Service service)
        throws org.apache.axis.AxisFault
    {
        if (service == null)
        {
            super.service = new org.apache.axis.client.Service();
        }
        else
        {
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
        /*java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
        java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
        java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
        java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
        java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
        java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;*/
        qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", ">SimpleAttributeType>Type");
        cachedSerQNames.add(qName);
        cls = SimpleAttributeTypeType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);
        
        qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "ArrayOfbase64Binary");
        cachedSerQNames.add(qName);
        cls = byte[][].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary");
        qName2 = new javax.xml.namespace.QName("", "base64Binary");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());
        
        qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "assignMetadataRequestBody");
        cachedSerQNames.add(qName);
        cls = AssignMetadataRequestBody.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);
        
        qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "assignMetadataResponseBody");
        cachedSerQNames.add(qName);
        cls = AssignMetadataResponseBody.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);
        
        qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "authenticationRequestBody");
        cachedSerQNames.add(qName);
        cls = AuthenticationRequestBody.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);
        
        qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "authenticationResponseBody");
        cachedSerQNames.add(qName);
        cls = AuthenticationResponseBody.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);
        
        qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "ComplexAttributeType");
        cachedSerQNames.add(qName);
        cls = SimpleAttributeType[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "SimpleAttributeType");
        qName2 = new javax.xml.namespace.QName("", "SimpleAttribute");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());
        
        qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "createDocumentRequestBody");
        cachedSerQNames.add(qName);
        cls = CreateDocumentRequestBody.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);
        
        qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "createDocumentResponseBody");
        cachedSerQNames.add(qName);
        cls = CreateDocumentResponseBody.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);
        
        qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "deleteDocumentRequestBody");
        cachedSerQNames.add(qName);
        cls = DeleteDocumentRequestBody.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);
        
        qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "deleteDocumentResponseBody");
        cachedSerQNames.add(qName);
        cls = DeleteDocumentResponseBody.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);
        
        qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "DeleteResponseType");
        cachedSerQNames.add(qName);
        cls = DeleteResponseType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);
        
        qName =
            new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "getDocumentByBarcodeRequestBody");
        cachedSerQNames.add(qName);
        cls = GetDocumentByBarcodeRequestBody.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);
        
        qName =
            new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "getDocumentByBarcodeResponseBody");
        cachedSerQNames.add(qName);
        cls = GetDocumentByBarcodeResponseBody.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);
        
        qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "getDocumentRequestBody");
        cachedSerQNames.add(qName);
        cls = GetDocumentRequestBody.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);
        
        qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "getDocumentResponseBody");
        cachedSerQNames.add(qName);
        cls = GetDocumentResponseBody.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);
        
        qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "MetadataStructureType");
        cachedSerQNames.add(qName);
        cls = MetadataStructureType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);
        
        qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "SignDocumentLTVRequestBody");
        cachedSerQNames.add(qName);
        cls = SignDocumentLTVRequestBody.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);
        
        qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "SignDocumentLTVResponseBody");
        cachedSerQNames.add(qName);
        cls = SignDocumentLTVResponseBody.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);
        
        qName =
            new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa",
                "SignDocumentWithSigTimestampRequestBody");
        cachedSerQNames.add(qName);
        cls = SignDocumentWithSigTimestampRequestBody.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);
        
        qName =
            new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa",
                "SignDocumentWithSigTimestampResponseBody");
        cachedSerQNames.add(qName);
        cls = SignDocumentWithSigTimestampResponseBody.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);
        
        qName = new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "SimpleAttributeType");
        cachedSerQNames.add(qName);
        cls = SimpleAttributeType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);
        
    }
    
    protected org.apache.axis.client.Call createCall()
        throws java.rmi.RemoteException
    {
        try
        {
            org.apache.axis.client.Call _call = super._createCall();
            CfgWsClient objCfgWsClient = (CfgWsClient)CacheFactory.get(WsClientCacheImpl.class, "C^" + "CRM_LIV_URL");
            String liveLinkUrl = objCfgWsClient.getUrlAddress();
            _call.setMaintainSession(super.maintainSession);
            _call.setUsername(super.cachedUsername);
            _call.setPassword(super.cachedPassword);
            _call.setTargetEndpointAddress(new URL(liveLinkUrl));
            _call.setTimeout(super.cachedTimeout);
            _call.setPortName(super.cachedPortName);
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements())
            {
                java.lang.String key = (java.lang.String)keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this)
            {
                if (firstCall())
                {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i)
                    {
                        java.lang.Class cls = (java.lang.Class)cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName = (javax.xml.namespace.QName)cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class)
                        {
                            java.lang.Class sf = (java.lang.Class)cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory)
                        {
                            org.apache.axis.encoding.SerializerFactory sf =
                                (org.apache.axis.encoding.SerializerFactory)cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df =
                                (org.apache.axis.encoding.DeserializerFactory)cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (Exception e)
        {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", e);
        }
    }
    
    public CreateDocumentResponseBody createDocument(CreateDocumentRequestBody requestBody)
        throws java.rmi.RemoteException
    {
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "createDocument"));
        SOAPHeaderElement header = this.getRequestHeaders();
        setHeader(header);
        setRequestHeaders(_call);
        setAttachments(_call);
        try
        {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestBody });
            
            if (_resp instanceof java.rmi.RemoteException)
            {
                throw (java.rmi.RemoteException)_resp;
            }
            else
            {
                extractAttachments(_call);
                try
                {
                    return (CreateDocumentResponseBody)_resp;
                }
                catch (java.lang.Exception _exception)
                {
                    Log.info(_exception.getMessage());
                    return (CreateDocumentResponseBody)org.apache.axis.utils.JavaUtils.convert(_resp,
                        CreateDocumentResponseBody.class);
                }
            }
        }
        catch (org.apache.axis.AxisFault axisFaultException)
        {
            throw axisFaultException;
        }
    }
    
    public GetDocumentResponseBody getDocument(GetDocumentRequestBody requestBody)
        throws java.rmi.RemoteException
    {
       
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "getDocument"));
        SOAPHeaderElement header = this.getRequestHeaders();
        setHeader(header);
        setRequestHeaders(_call);
        setAttachments(_call);
        try
        {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestBody });
            
            if (_resp instanceof java.rmi.RemoteException)
            {
                throw (java.rmi.RemoteException)_resp;
            }
            else
            {
                extractAttachments(_call);
                try
                {
                    return (GetDocumentResponseBody)_resp;
                }
                catch (java.lang.Exception _exception)
                {
                    Log.info(_exception.getMessage());
                    return (GetDocumentResponseBody)org.apache.axis.utils.JavaUtils.convert(_resp,
                        GetDocumentResponseBody.class);
                }
            }
        }
        catch (org.apache.axis.AxisFault axisFaultException)
        {
            throw axisFaultException;
        }
    }
    
    public GetDocumentByBarcodeResponseBody getDocumentByBarcode(GetDocumentByBarcodeRequestBody requestBody)
        throws java.rmi.RemoteException
    {
       
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa",
            "getDocumentByBarcode"));
        SOAPHeaderElement header = this.getRequestHeaders();
        setHeader(header);
        setRequestHeaders(_call);
        setAttachments(_call);
        try
        {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestBody });
            
            if (_resp instanceof java.rmi.RemoteException)
            {
                throw (java.rmi.RemoteException)_resp;
            }
            else
            {
                extractAttachments(_call);
                try
                {
                    return (GetDocumentByBarcodeResponseBody)_resp;
                }
                catch (java.lang.Exception _exception)
                {
                    Log.info(_exception.getMessage());
                    return (GetDocumentByBarcodeResponseBody)org.apache.axis.utils.JavaUtils.convert(_resp,
                        GetDocumentByBarcodeResponseBody.class);
                }
            }
        }
        catch (org.apache.axis.AxisFault axisFaultException)
        {
            throw axisFaultException;
        }
    }
    
    public DeleteDocumentResponseBody deleteDocument(DeleteDocumentRequestBody requestBody)
        throws java.rmi.RemoteException
    {
        
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "deleteDocument"));
        SOAPHeaderElement header = this.getRequestHeaders();
        setHeader(header);
        setRequestHeaders(_call);
        setAttachments(_call);
        try
        {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestBody });
            
            if (_resp instanceof java.rmi.RemoteException)
            {
                throw (java.rmi.RemoteException)_resp;
            }
            else
            {
                extractAttachments(_call);
                try
                {
                    return (DeleteDocumentResponseBody)_resp;
                }
                catch (java.lang.Exception _exception)
                {
                    Log.info(_exception.getMessage());
                    return (DeleteDocumentResponseBody)org.apache.axis.utils.JavaUtils.convert(_resp,
                        DeleteDocumentResponseBody.class);
                }
            }
        }
        catch (org.apache.axis.AxisFault axisFaultException)
        {
            throw axisFaultException;
        }
    }
    
    public AssignMetadataResponseBody assignMetadata(AssignMetadataRequestBody requestBody)
        throws java.rmi.RemoteException
    {
       
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "assignMetadata"));
        SOAPHeaderElement header = this.getRequestHeaders();
        setHeader(header);
        setRequestHeaders(_call);
        setAttachments(_call);
        try
        {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestBody });
            
            if (_resp instanceof java.rmi.RemoteException)
            {
                throw (java.rmi.RemoteException)_resp;
            }
            else
            {
                extractAttachments(_call);
                try
                {
                    return (AssignMetadataResponseBody)_resp;
                }
                catch (java.lang.Exception _exception)
                {
                    Log.info(_exception.getMessage());
                    return (AssignMetadataResponseBody)org.apache.axis.utils.JavaUtils.convert(_resp,
                        AssignMetadataResponseBody.class);
                }
            }
        }
        catch (org.apache.axis.AxisFault axisFaultException)
        {
            throw axisFaultException;
        }
    }
    
    public AuthenticationResponseBody authentication(AuthenticationRequestBody requestBody)
        throws java.rmi.RemoteException
    {
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "authentication"));
        SOAPHeaderElement header = this.getRequestHeaders();
        setHeader(header);
        setRequestHeaders(_call);
        setAttachments(_call);
        try
        {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestBody });
            
            if (_resp instanceof java.rmi.RemoteException)
            {
                throw (java.rmi.RemoteException)_resp;
            }
            else
            {
                extractAttachments(_call);
                try
                {
                    return (AuthenticationResponseBody)_resp;
                }
                catch (java.lang.Exception _exception)
                {
                    Log.info(_exception.getMessage());
                    return (AuthenticationResponseBody)org.apache.axis.utils.JavaUtils.convert(_resp,
                        AuthenticationResponseBody.class);
                }
            }
        }
        catch (org.apache.axis.AxisFault axisFaultException)
        {
            throw axisFaultException;
        }
    }
    
    public SignDocumentLTVResponseBody signDocumentLTV(SignDocumentLTVRequestBody requestBody)
        throws java.rmi.RemoteException
    {
       
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "SignDocumentLTV"));
        SOAPHeaderElement header = this.getRequestHeaders();
        setHeader(header);
        setRequestHeaders(_call);
        setAttachments(_call);
        try
        {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestBody });
            
            if (_resp instanceof java.rmi.RemoteException)
            {
                throw (java.rmi.RemoteException)_resp;
            }
            else
            {
                extractAttachments(_call);
                try
                {
                    return (SignDocumentLTVResponseBody)_resp;
                }
                catch (java.lang.Exception _exception)
                {
                    Log.info(_exception.getMessage());
                    return (SignDocumentLTVResponseBody)org.apache.axis.utils.JavaUtils.convert(_resp,
                        SignDocumentLTVResponseBody.class);
                }
            }
        }
        catch (org.apache.axis.AxisFault axisFaultException)
        {
            throw axisFaultException;
        }
    }
    
    public SignDocumentWithSigTimestampResponseBody signDocumentWithSigTimestamp(
        SignDocumentWithSigTimestampRequestBody requestBody)
        throws java.rmi.RemoteException
    {
        
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa",
            "SignDocumentWithSigTimestamp"));
        SOAPHeaderElement header = this.getRequestHeaders();
        setHeader(header);
        setRequestHeaders(_call);
        setAttachments(_call);
        try
        {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestBody });
            
            if (_resp instanceof java.rmi.RemoteException)
            {
                throw (java.rmi.RemoteException)_resp;
            }
            else
            {
                extractAttachments(_call);
                try
                {
                    return (SignDocumentWithSigTimestampResponseBody)_resp;
                }
                catch (java.lang.Exception _exception)
                {
                    Log.info(_exception.getMessage());
                    return (SignDocumentWithSigTimestampResponseBody)org.apache.axis.utils.JavaUtils.convert(_resp,
                        SignDocumentWithSigTimestampResponseBody.class);
                }
            }
        }
        catch (org.apache.axis.AxisFault axisFaultException)
        {
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
            soapHeaderElement.addChild(new MessageElement(new QName("AcceptChannelType"), "23"));
            soapHeaderElement.addChild(new MessageElement(new QName("TenantId"), tenantId));
            soapHeaderElement.addChild(new MessageElement(new QName("AcceptStaffId"), staffId));
            soapHeaderElement.addChild(new MessageElement(new QName("AcceptOpId"), 1));
        }
        catch (SOAPException e)
        {
            // TODO Auto-generated catch block
            Log.info(e.getMessage());
        }
        return soapHeaderElement;
    }
    
//    public static void main(String[] args)
//        throws Exception
//    {
//        EdocumentStorageSoapBindingStub sub = new EdocumentStorageSoapBindingStub();
//        
//        String UserName = "test";
//        String password = "test";
//        byte[] pwdArr = password.getBytes();
//        List pwds = new ArrayList();
//        for (int i = 0; i < pwdArr.length; i++)
//        {
//            pwds.add(pwdArr[i]);
//        }
//        AuthenticationRequestBody reqBody = new AuthenticationRequestBody(UserName, pwdArr);
//        
//        AuthenticationResponseBody resp = sub.authentication(reqBody);
//        System.out.println(BeanUtils.getProperties(resp));
//    }
    
}
