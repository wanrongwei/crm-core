/**
 * CPAFileInterfaceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.cpa;

import com.ai.appframe2.complex.cache.CacheFactory;
import com.asiainfo.appframe.ext.exeframe.ws.client.cache.WsClientCacheImpl;
import com.asiainfo.appframe.ext.exeframe.ws.query.impl.po.CfgWsClient;

public class CPAFileInterfaceServiceLocator extends org.apache.axis.client.Service implements com.asiainfo.crm.inter.exe.webservice.client.cpa.CPAFileInterfaceService {

    public CPAFileInterfaceServiceLocator() {
    }


    public CPAFileInterfaceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CPAFileInterfaceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CPAFileInterfacePort
    private java.lang.String CPAFileInterfacePort_address = "";

    public java.lang.String getCPAFileInterfacePortAddress() {
        return CPAFileInterfacePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CPAFileInterfacePortWSDDServiceName = "CPAFileInterfacePort";

    public java.lang.String getCPAFileInterfacePortWSDDServiceName() {
        return CPAFileInterfacePortWSDDServiceName;
    }

    public void setCPAFileInterfacePortWSDDServiceName(java.lang.String name) {
        CPAFileInterfacePortWSDDServiceName = name;
    }

    public com.asiainfo.crm.inter.exe.webservice.client.cpa.CPAFileInterface getCPAFileInterfacePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
        	
        	CfgWsClient objCfgWsClient = (CfgWsClient)CacheFactory.get(WsClientCacheImpl.class, "C^" + "CRM_CPA_URL");
            endpoint = new java.net.URL(objCfgWsClient.getUrlAddress());
            System.out.println(endpoint);
//            endpoint = new java.net.URL(CPAFileInterfacePort_address);
        }
        catch (Exception e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCPAFileInterfacePort(endpoint);
    }

    public com.asiainfo.crm.inter.exe.webservice.client.cpa.CPAFileInterface getCPAFileInterfacePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.asiainfo.crm.inter.exe.webservice.client.cpa.CPAFileInterfacePortBindingStub _stub = new com.asiainfo.crm.inter.exe.webservice.client.cpa.CPAFileInterfacePortBindingStub(portAddress, this);
            _stub.setPortName(getCPAFileInterfacePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCPAFileInterfacePortEndpointAddress(java.lang.String address) {
        CPAFileInterfacePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.asiainfo.crm.inter.exe.webservice.client.cpa.CPAFileInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                com.asiainfo.crm.inter.exe.webservice.client.cpa.CPAFileInterfacePortBindingStub _stub = new com.asiainfo.crm.inter.exe.webservice.client.cpa.CPAFileInterfacePortBindingStub(new java.net.URL(CPAFileInterfacePort_address), this);
                _stub.setPortName(getCPAFileInterfacePortWSDDServiceName());
                return _stub;
            }
        }
        catch (Exception t) {
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
        if ("CPAFileInterfacePort".equals(inputPortName)) {
            return getCPAFileInterfacePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "CPAFileInterfaceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "CPAFileInterfacePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CPAFileInterfacePort".equals(portName)) {
            setCPAFileInterfacePortEndpointAddress(address);
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
