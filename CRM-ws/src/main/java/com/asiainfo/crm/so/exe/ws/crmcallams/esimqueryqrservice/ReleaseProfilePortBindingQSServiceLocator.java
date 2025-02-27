/**
 * ReleaseProfilePortBindingQSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.esimqueryqrservice;

public class ReleaseProfilePortBindingQSServiceLocator extends org.apache.axis.client.Service implements ReleaseProfilePortBindingQSService {

/**
 * OSB Service
 */

    public ReleaseProfilePortBindingQSServiceLocator() {
    }


    public ReleaseProfilePortBindingQSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ReleaseProfilePortBindingQSServiceLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ReleaseProfilePortBindingQSPort
    private String ReleaseProfilePortBindingQSPort_address = "http://10.1.248.207:8381/TelenorDK/ConsumerAccessServices/3rdParty/ProxyServices/ReleaseProfile";

    public String getReleaseProfilePortBindingQSPortAddress() {
        return ReleaseProfilePortBindingQSPort_address;
    }

    // The WSDD service name defaults to the port name.
    private String ReleaseProfilePortBindingQSPortWSDDServiceName = "ReleaseProfilePortBindingQSPort";

    public String getReleaseProfilePortBindingQSPortWSDDServiceName() {
        return ReleaseProfilePortBindingQSPortWSDDServiceName;
    }

    public void setReleaseProfilePortBindingQSPortWSDDServiceName(String name) {
        ReleaseProfilePortBindingQSPortWSDDServiceName = name;
    }

    public ReleaseProfilePort getReleaseProfilePortBindingQSPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ReleaseProfilePortBindingQSPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getReleaseProfilePortBindingQSPort(endpoint);
    }

    public ReleaseProfilePort getReleaseProfilePortBindingQSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ReleaseProfilePortBindingStub _stub = new ReleaseProfilePortBindingStub(portAddress, this);
            _stub.setPortName(getReleaseProfilePortBindingQSPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setReleaseProfilePortBindingQSPortEndpointAddress(String address) {
        ReleaseProfilePortBindingQSPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ReleaseProfilePort.class.isAssignableFrom(serviceEndpointInterface)) {
                ReleaseProfilePortBindingStub _stub = new ReleaseProfilePortBindingStub(new java.net.URL(ReleaseProfilePortBindingQSPort_address), this);
                _stub.setPortName(getReleaseProfilePortBindingQSPortWSDDServiceName());
                return _stub;
            }
        }
        catch (Throwable t) {
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
        String inputPortName = portName.getLocalPart();
        if ("ReleaseProfilePortBindingQSPort".equals(inputPortName)) {
            return getReleaseProfilePortBindingQSPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "ReleaseProfilePortBindingQSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "ReleaseProfilePortBindingQSPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {
        
if ("ReleaseProfilePortBindingQSPort".equals(portName)) {
            setReleaseProfilePortBindingQSPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
