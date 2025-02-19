/**
 * GetAllCustomersServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.copydan;

public class GetAllCustomersServiceLocator extends org.apache.axis.client.Service implements com.asiainfo.crm.inter.exe.webservice.client.copydan.GetAllCustomersService {

/**
 * OSB Service
 */

    public GetAllCustomersServiceLocator() {
    }


    public GetAllCustomersServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GetAllCustomersServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GetAllCustomersPort
    private java.lang.String GetAllCustomersPort_address = "http://10.1.248.207:8381/TelenorDK/ConsumerAccessServices/3rdParty/ProxyServices/GetAllCustomers";

    public java.lang.String getGetAllCustomersPortAddress() {
        return GetAllCustomersPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GetAllCustomersPortWSDDServiceName = "GetAllCustomersPort";

    public java.lang.String getGetAllCustomersPortWSDDServiceName() {
        return GetAllCustomersPortWSDDServiceName;
    }

    public void setGetAllCustomersPortWSDDServiceName(java.lang.String name) {
        GetAllCustomersPortWSDDServiceName = name;
    }

    public com.asiainfo.crm.inter.exe.webservice.client.copydan.GetAllCustomersPort_PortType getGetAllCustomersPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GetAllCustomersPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGetAllCustomersPort(endpoint);
    }

    public com.asiainfo.crm.inter.exe.webservice.client.copydan.GetAllCustomersPort_PortType getGetAllCustomersPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.asiainfo.crm.inter.exe.webservice.client.copydan.GetAllCustomersPortBindingStub _stub = new com.asiainfo.crm.inter.exe.webservice.client.copydan.GetAllCustomersPortBindingStub(portAddress, this);
            _stub.setPortName(getGetAllCustomersPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGetAllCustomersPortEndpointAddress(java.lang.String address) {
        GetAllCustomersPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.asiainfo.crm.inter.exe.webservice.client.copydan.GetAllCustomersPort_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.asiainfo.crm.inter.exe.webservice.client.copydan.GetAllCustomersPortBindingStub _stub = new com.asiainfo.crm.inter.exe.webservice.client.copydan.GetAllCustomersPortBindingStub(new java.net.URL(GetAllCustomersPort_address), this);
                _stub.setPortName(getGetAllCustomersPortWSDDServiceName());
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
        if ("GetAllCustomersPort".equals(inputPortName)) {
            return getGetAllCustomersPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "GetAllCustomersService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "GetAllCustomersPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GetAllCustomersPort".equals(portName)) {
            setGetAllCustomersPortEndpointAddress(address);
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
