/**
 * OpenTextDMSInterfaceV1Locator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.livelink;

public class OpenTextDMSInterfaceV1Locator extends org.apache.axis.client.Service implements com.asiainfo.crm.inter.exe.webservice.client.livelink.OpenTextDMSInterfaceV1 {

    public OpenTextDMSInterfaceV1Locator() {
    }


    public OpenTextDMSInterfaceV1Locator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public OpenTextDMSInterfaceV1Locator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for OpenTextDMSInterfaceSOAP
    private java.lang.String OpenTextDMSInterfaceSOAP_address = "http://example.pgsm.hu/";

    public java.lang.String getOpenTextDMSInterfaceSOAPAddress() {
        return OpenTextDMSInterfaceSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String OpenTextDMSInterfaceSOAPWSDDServiceName = "OpenTextDMSInterfaceSOAP";

    public java.lang.String getOpenTextDMSInterfaceSOAPWSDDServiceName() {
        return OpenTextDMSInterfaceSOAPWSDDServiceName;
    }

    public void setOpenTextDMSInterfaceSOAPWSDDServiceName(java.lang.String name) {
        OpenTextDMSInterfaceSOAPWSDDServiceName = name;
    }

    public com.asiainfo.crm.inter.exe.webservice.client.livelink.OpentextOperations getOpenTextDMSInterfaceSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(OpenTextDMSInterfaceSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getOpenTextDMSInterfaceSOAP(endpoint);
    }

    public com.asiainfo.crm.inter.exe.webservice.client.livelink.OpentextOperations getOpenTextDMSInterfaceSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.asiainfo.crm.inter.exe.webservice.client.livelink.OpenTextDMSInterfaceSOAPStub _stub = new com.asiainfo.crm.inter.exe.webservice.client.livelink.OpenTextDMSInterfaceSOAPStub(portAddress, this);
            _stub.setPortName(getOpenTextDMSInterfaceSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setOpenTextDMSInterfaceSOAPEndpointAddress(java.lang.String address) {
        OpenTextDMSInterfaceSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.asiainfo.crm.inter.exe.webservice.client.livelink.OpentextOperations.class.isAssignableFrom(serviceEndpointInterface)) {
                com.asiainfo.crm.inter.exe.webservice.client.livelink.OpenTextDMSInterfaceSOAPStub _stub = new com.asiainfo.crm.inter.exe.webservice.client.livelink.OpenTextDMSInterfaceSOAPStub(new java.net.URL(OpenTextDMSInterfaceSOAP_address), this);
                _stub.setPortName(getOpenTextDMSInterfaceSOAPWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Exception t) {
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
        if ("OpenTextDMSInterfaceSOAP".equals(inputPortName)) {
            return getOpenTextDMSInterfaceSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://example.pgsm.hu/OpenTextDMSInterface/", "OpenTextDMSInterfaceV1");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://example.pgsm.hu/OpenTextDMSInterface/", "OpenTextDMSInterfaceSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("OpenTextDMSInterfaceSOAP".equals(portName)) {
            setOpenTextDMSInterfaceSOAPEndpointAddress(address);
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
