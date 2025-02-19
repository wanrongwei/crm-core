/**
 * EdocumentStorageService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.livelink;

import com.ai.appframe2.complex.cache.CacheFactory;
import com.asiainfo.appframe.ext.exeframe.msg.jetty.util.log.Log;
import com.asiainfo.appframe.ext.exeframe.ws.client.cache.WsClientCacheImpl;
import com.asiainfo.appframe.ext.exeframe.ws.query.impl.po.CfgWsClient;

public class EdocumentStorageService_ServiceLocator extends org.apache.axis.client.Service implements EdocumentStorageService_Service {

    public EdocumentStorageService_ServiceLocator() throws Exception {
        CfgWsClient objCfgWsClient = (CfgWsClient)CacheFactory.get(WsClientCacheImpl.class, "C^" + "CRM_LIV_URL");
        EdocumentStorageService_address = objCfgWsClient.getUrlAddress();
    }

    public EdocumentStorageService_ServiceLocator(org.apache.axis.EngineConfiguration config) throws Exception {
        super(config);
        CfgWsClient objCfgWsClient = (CfgWsClient)CacheFactory.get(WsClientCacheImpl.class, "C^" + "CRM_LIV_URL");
        EdocumentStorageService_address = objCfgWsClient.getUrlAddress();
    }

    public EdocumentStorageService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws Exception {
        super(wsdlLoc, sName);
        CfgWsClient objCfgWsClient = (CfgWsClient)CacheFactory.get(WsClientCacheImpl.class, "C^" + "CRM_LIV_URL");
        EdocumentStorageService_address = objCfgWsClient.getUrlAddress();
    }

    // Use to get a proxy class for EdocumentStorageService
    
    private java.lang.String EdocumentStorageService_address;

    public java.lang.String getEdocumentStorageServiceAddress() {
        return EdocumentStorageService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EdocumentStorageServiceWSDDServiceName = "EdocumentStorageService";

    public java.lang.String getEdocumentStorageServiceWSDDServiceName() {
        return EdocumentStorageServiceWSDDServiceName;
    }

    public void setEdocumentStorageServiceWSDDServiceName(java.lang.String name) {
        EdocumentStorageServiceWSDDServiceName = name;
    }

    public EdocumentStoragePortType getEdocumentStorageService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EdocumentStorageService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEdocumentStorageService(endpoint);
    }

    public EdocumentStoragePortType getEdocumentStorageService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            EdocumentStorageSoapBindingStub _stub = new EdocumentStorageSoapBindingStub(portAddress, this);
            _stub.setPortName(getEdocumentStorageServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            Log.info(e.getMessage());
            return null;
        }
    }

    public void setEdocumentStorageServiceEndpointAddress(java.lang.String address) {
        EdocumentStorageService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (EdocumentStoragePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                EdocumentStorageSoapBindingStub _stub = new EdocumentStorageSoapBindingStub(new java.net.URL(EdocumentStorageService_address), this);
                _stub.setPortName(getEdocumentStorageServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (Exception e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("EdocumentStorageService".equals(inputPortName)) {
            return getEdocumentStorageService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "EdocumentStorageService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "EdocumentStorageService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("EdocumentStorageService".equals(portName)) {
            setEdocumentStorageServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
