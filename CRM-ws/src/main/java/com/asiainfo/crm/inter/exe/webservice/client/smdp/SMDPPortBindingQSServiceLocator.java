/**
 * SMDPPortBindingQSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.smdp;

import com.ai.appframe2.complex.cache.CacheFactory;
import com.asiainfo.appframe.ext.exeframe.ws.client.cache.WsClientCacheImpl;
import com.asiainfo.appframe.ext.exeframe.ws.query.impl.po.CfgWsClient;

public class SMDPPortBindingQSServiceLocator extends org.apache.axis.client.Service implements com.asiainfo.crm.inter.exe.webservice.client.smdp.SMDPPortBindingQSService {

    public SMDPPortBindingQSServiceLocator() {
    }


    public SMDPPortBindingQSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SMDPPortBindingQSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SMDPPortBindingQSPort
    private java.lang.String SMDPPortBindingQSPort_address = null ; //"http://10.19.18.28:8381/TelenorDK/ConsumerAccessServices/ESIM/ProxyServices/SMDPSevice";

    public java.lang.String getSMDPPortBindingQSPortAddress() {
        return SMDPPortBindingQSPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SMDPPortBindingQSPortWSDDServiceName = "SMDPPortBindingQSPort";

    public java.lang.String getSMDPPortBindingQSPortWSDDServiceName() {
        return SMDPPortBindingQSPortWSDDServiceName;
    }

    public void setSMDPPortBindingQSPortWSDDServiceName(java.lang.String name) {
        SMDPPortBindingQSPortWSDDServiceName = name;
    }

    public com.asiainfo.crm.inter.exe.webservice.client.smdp.SMDP getSMDPPortBindingQSPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
        	CfgWsClient objCfgWsClient = (CfgWsClient)CacheFactory.get(WsClientCacheImpl.class, "C^" + "CRM_SMDP_URL");
            endpoint = new java.net.URL(objCfgWsClient.getUrlAddress());
        }
        catch (Exception e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSMDPPortBindingQSPort(endpoint);
    }

    public com.asiainfo.crm.inter.exe.webservice.client.smdp.SMDP getSMDPPortBindingQSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.asiainfo.crm.inter.exe.webservice.client.smdp.SMDPPortBindingStub _stub = new com.asiainfo.crm.inter.exe.webservice.client.smdp.SMDPPortBindingStub(portAddress, this);
            _stub.setPortName(getSMDPPortBindingQSPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSMDPPortBindingQSPortEndpointAddress(java.lang.String address) {
        SMDPPortBindingQSPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.asiainfo.crm.inter.exe.webservice.client.smdp.SMDP.class.isAssignableFrom(serviceEndpointInterface)) {
                com.asiainfo.crm.inter.exe.webservice.client.smdp.SMDPPortBindingStub _stub = new com.asiainfo.crm.inter.exe.webservice.client.smdp.SMDPPortBindingStub(new java.net.URL(SMDPPortBindingQSPort_address), this);
                _stub.setPortName(getSMDPPortBindingQSPortWSDDServiceName());
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
        if ("SMDPPortBindingQSPort".equals(inputPortName)) {
            return getSMDPPortBindingQSPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "SMDPPortBindingQSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "SMDPPortBindingQSPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SMDPPortBindingQSPort".equals(portName)) {
            setSMDPPortBindingQSPortEndpointAddress(address);
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
