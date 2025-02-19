/**
 * DawsPortBindingQSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.dawa;

import com.ai.appframe2.complex.cache.CacheFactory;
import com.asiainfo.appframe.ext.exeframe.ws.client.cache.WsClientCacheImpl;
import com.asiainfo.appframe.ext.exeframe.ws.query.impl.po.CfgWsClient;

public class DawsPortBindingQSServiceLocator extends org.apache.axis.client.Service implements com.asiainfo.crm.inter.exe.webservice.client.dawa.DawsPortBindingQSService {

    public DawsPortBindingQSServiceLocator() {
    }


    public DawsPortBindingQSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DawsPortBindingQSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for dawsPortBindingQSPort
    private java.lang.String dawsPortBindingQSPort_address = ""; //"http://10.19.18.28:8381/TelenorDK/ConsumerAccessServices/Dawa/ProxyServices/dawaService";

    public java.lang.String getdawsPortBindingQSPortAddress() {
        return dawsPortBindingQSPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String dawsPortBindingQSPortWSDDServiceName = "dawsPortBindingQSPort";

    public java.lang.String getdawsPortBindingQSPortWSDDServiceName() {
        return dawsPortBindingQSPortWSDDServiceName;
    }

    public void setdawsPortBindingQSPortWSDDServiceName(java.lang.String name) {
        dawsPortBindingQSPortWSDDServiceName = name;
    }

    public com.asiainfo.crm.inter.exe.webservice.client.dawa.Daws getdawsPortBindingQSPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
        	CfgWsClient objCfgWsClient = (CfgWsClient)CacheFactory.get(WsClientCacheImpl.class, "C^" + "CRM_DAWA_URL");
            endpoint = new java.net.URL(objCfgWsClient.getUrlAddress());
        }
        catch (Exception e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getdawsPortBindingQSPort(endpoint);
    }

    public com.asiainfo.crm.inter.exe.webservice.client.dawa.Daws getdawsPortBindingQSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.asiainfo.crm.inter.exe.webservice.client.dawa.DawsPortBindingStub _stub = new com.asiainfo.crm.inter.exe.webservice.client.dawa.DawsPortBindingStub(portAddress, this);
            _stub.setPortName(getdawsPortBindingQSPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setdawsPortBindingQSPortEndpointAddress(java.lang.String address) {
        dawsPortBindingQSPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.asiainfo.crm.inter.exe.webservice.client.dawa.Daws.class.isAssignableFrom(serviceEndpointInterface)) {
                com.asiainfo.crm.inter.exe.webservice.client.dawa.DawsPortBindingStub _stub = new com.asiainfo.crm.inter.exe.webservice.client.dawa.DawsPortBindingStub(new java.net.URL(dawsPortBindingQSPort_address), this);
                _stub.setPortName(getdawsPortBindingQSPortWSDDServiceName());
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
        if ("dawsPortBindingQSPort".equals(inputPortName)) {
            return getdawsPortBindingQSPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "dawsPortBindingQSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "dawsPortBindingQSPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("dawsPortBindingQSPort".equals(portName)) {
            setdawsPortBindingQSPortEndpointAddress(address);
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
