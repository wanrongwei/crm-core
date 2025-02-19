/**
 * CreditScoreService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.noitso;

import com.ai.appframe2.complex.cache.CacheFactory;
import com.asiainfo.appframe.ext.exeframe.ws.client.cache.WsClientCacheImpl;
import com.asiainfo.appframe.ext.exeframe.ws.query.impl.po.CfgWsClient;

public class CreditScoreService_ServiceLocator extends org.apache.axis.client.Service implements com.asiainfo.crm.inter.exe.webservice.client.noitso.CreditScoreService_Service {

    public CreditScoreService_ServiceLocator() {
    }


    public CreditScoreService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CreditScoreService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CreditScoreService
    private java.lang.String CreditScoreService_address = null ; // "http://10.19.18.28:8381/TelenorDK/ConsumerAccessServices/CreditScore/ProxyServices/CreditScoreService";

    public java.lang.String getCreditScoreServiceAddress() {
        return CreditScoreService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CreditScoreServiceWSDDServiceName = "CreditScoreService";

    public java.lang.String getCreditScoreServiceWSDDServiceName() {
        return CreditScoreServiceWSDDServiceName;
    }

    public void setCreditScoreServiceWSDDServiceName(java.lang.String name) {
        CreditScoreServiceWSDDServiceName = name;
    }

    public com.asiainfo.crm.inter.exe.webservice.client.noitso.CreditScoreServiceSoapPort getCreditScoreService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            CfgWsClient objCfgWsClient = (CfgWsClient)CacheFactory.get(WsClientCacheImpl.class, "C^" + "CRM_NOITSO_URL");
            endpoint = new java.net.URL(objCfgWsClient.getUrlAddress());
        }
        catch (Exception e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCreditScoreService(endpoint);
    }

    public com.asiainfo.crm.inter.exe.webservice.client.noitso.CreditScoreServiceSoapPort getCreditScoreService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.asiainfo.crm.inter.exe.webservice.client.noitso.CreditScoreServiceSoapBindingStub _stub = new com.asiainfo.crm.inter.exe.webservice.client.noitso.CreditScoreServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getCreditScoreServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCreditScoreServiceEndpointAddress(java.lang.String address) {
        CreditScoreService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.asiainfo.crm.inter.exe.webservice.client.noitso.CreditScoreServiceSoapPort.class.isAssignableFrom(serviceEndpointInterface)) {
                com.asiainfo.crm.inter.exe.webservice.client.noitso.CreditScoreServiceSoapBindingStub _stub = new com.asiainfo.crm.inter.exe.webservice.client.noitso.CreditScoreServiceSoapBindingStub(new java.net.URL(CreditScoreService_address), this);
                _stub.setPortName(getCreditScoreServiceWSDDServiceName());
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
        if ("CreditScoreService".equals(inputPortName)) {
            return getCreditScoreService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "CreditScoreService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "CreditScoreService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CreditScoreService".equals(portName)) {
            setCreditScoreServiceEndpointAddress(address);
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
