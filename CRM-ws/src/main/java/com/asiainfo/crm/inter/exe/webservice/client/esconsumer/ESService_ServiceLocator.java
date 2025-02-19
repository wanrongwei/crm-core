/**
 * ESService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.esconsumer;

import com.ai.appframe2.complex.cache.CacheFactory;
import com.asiainfo.appframe.ext.exeframe.ws.client.cache.WsClientCacheImpl;
import com.asiainfo.appframe.ext.exeframe.ws.query.impl.po.CfgWsClient;

public class ESService_ServiceLocator extends org.apache.axis.client.Service implements com.asiainfo.crm.inter.exe.webservice.client.esconsumer.ESService_Service {

    public ESService_ServiceLocator() {
    }


    public ESService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ESService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ESService
    private java.lang.String ESService_address = null; //"http://10.19.18.28:8381/TelenorDK/ConsumerAccessServices/ESIM/ProxyServices/ESConsumerService";

    public java.lang.String getESServiceAddress() {
        return ESService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ESServiceWSDDServiceName = "ESService";

    public java.lang.String getESServiceWSDDServiceName() {
        return ESServiceWSDDServiceName;
    }

    public void setESServiceWSDDServiceName(java.lang.String name) {
        ESServiceWSDDServiceName = name;
    }

    public com.asiainfo.crm.inter.exe.webservice.client.esconsumer.ESServiceSoapPort getESService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
        	CfgWsClient objCfgWsClient = (CfgWsClient)CacheFactory.get(WsClientCacheImpl.class, "C^" + "CRM_ES_URL");
            endpoint = new java.net.URL(objCfgWsClient.getUrlAddress());
        }
        catch (Exception e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getESService(endpoint);
    }

    public com.asiainfo.crm.inter.exe.webservice.client.esconsumer.ESServiceSoapPort getESService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.asiainfo.crm.inter.exe.webservice.client.esconsumer.ESServiceSoapBindingStub _stub = new com.asiainfo.crm.inter.exe.webservice.client.esconsumer.ESServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getESServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setESServiceEndpointAddress(java.lang.String address) {
        ESService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.asiainfo.crm.inter.exe.webservice.client.esconsumer.ESServiceSoapPort.class.isAssignableFrom(serviceEndpointInterface)) {
                com.asiainfo.crm.inter.exe.webservice.client.esconsumer.ESServiceSoapBindingStub _stub = new com.asiainfo.crm.inter.exe.webservice.client.esconsumer.ESServiceSoapBindingStub(new java.net.URL(ESService_address), this);
                _stub.setPortName(getESServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
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
        if ("ESService".equals(inputPortName)) {
            return getESService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://nbi.mdm.alu.com/", "ESService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://nbi.mdm.alu.com/", "ESService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ESService".equals(portName)) {
            setESServiceEndpointAddress(address);
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
