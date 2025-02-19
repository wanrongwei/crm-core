/**
 * AppleDEPServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.dep;

import com.ai.appframe2.complex.cache.CacheFactory;
import com.asiainfo.appframe.ext.exeframe.ws.client.cache.WsClientCacheImpl;
import com.asiainfo.appframe.ext.exeframe.ws.query.impl.po.CfgWsClient;

public class AppleDEPServiceLocator extends org.apache.axis.client.Service implements com.asiainfo.crm.inter.exe.webservice.client.dep.AppleDEPService {

    public AppleDEPServiceLocator() {
    }


    public AppleDEPServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AppleDEPServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AppleDEPSYNCPort
    private java.lang.String AppleDEPSYNCPort_address ;

    public java.lang.String getAppleDEPSYNCPortAddress() {
        return AppleDEPSYNCPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AppleDEPSYNCPortWSDDServiceName = "AppleDEPSYNCPort";

    public java.lang.String getAppleDEPSYNCPortWSDDServiceName() {
        return AppleDEPSYNCPortWSDDServiceName;
    }

    public void setAppleDEPSYNCPortWSDDServiceName(java.lang.String name) {
        AppleDEPSYNCPortWSDDServiceName = name;
    }
   
    public com.asiainfo.crm.inter.exe.webservice.client.dep.AppleDEP getAppleDEPSYNCPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
        	CfgWsClient objCfgWsClient = (CfgWsClient)CacheFactory.get(WsClientCacheImpl.class, "C^" + "CRM_DEP_URL");
        	endpoint = new java.net.URL(objCfgWsClient.getUrlAddress());
        }
        catch (Exception e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAppleDEPSYNCPort(endpoint);
    }

    public com.asiainfo.crm.inter.exe.webservice.client.dep.AppleDEP getAppleDEPSYNCPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.asiainfo.crm.inter.exe.webservice.client.dep.AppleDEPPortBindingStub _stub = new com.asiainfo.crm.inter.exe.webservice.client.dep.AppleDEPPortBindingStub(portAddress, this);
            _stub.setPortName(getAppleDEPSYNCPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAppleDEPSYNCPortEndpointAddress(java.lang.String address) {
        AppleDEPSYNCPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.asiainfo.crm.inter.exe.webservice.client.dep.AppleDEP.class.isAssignableFrom(serviceEndpointInterface)) {
                com.asiainfo.crm.inter.exe.webservice.client.dep.AppleDEPPortBindingStub _stub = new com.asiainfo.crm.inter.exe.webservice.client.dep.AppleDEPPortBindingStub(new java.net.URL(AppleDEPSYNCPort_address), this);
                _stub.setPortName(getAppleDEPSYNCPortWSDDServiceName());
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
        if ("AppleDEPSYNCPort".equals(inputPortName)) {
            return getAppleDEPSYNCPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "AppleDEPService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "AppleDEPSYNCPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AppleDEPSYNCPort".equals(portName)) {
            setAppleDEPSYNCPortEndpointAddress(address);
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
