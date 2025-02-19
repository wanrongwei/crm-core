/**
 * UnreleaseProfileServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.esimqueryqrservice;

public class UnreleaseProfileServiceLocator extends org.apache.axis.client.Service implements UnreleaseProfileService {

/**
 * OSB Service
 */

    public UnreleaseProfileServiceLocator() {
    }


    public UnreleaseProfileServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public UnreleaseProfileServiceLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for UnreleaseProfilePort
    private String UnreleaseProfilePort_address = "http://10.1.248.207:8381/TelenorDK/ConsumerAccessServices/3rdParty/ProxyServices/UnreleaseProfile";

    public String getUnreleaseProfilePortAddress() {
        return UnreleaseProfilePort_address;
    }

    // The WSDD service name defaults to the port name.
    private String UnreleaseProfilePortWSDDServiceName = "UnreleaseProfilePort";

    public String getUnreleaseProfilePortWSDDServiceName() {
        return UnreleaseProfilePortWSDDServiceName;
    }

    public void setUnreleaseProfilePortWSDDServiceName(String name) {
        UnreleaseProfilePortWSDDServiceName = name;
    }

    public UnreleaseProfilePort getUnreleaseProfilePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(UnreleaseProfilePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getUnreleaseProfilePort(endpoint);
    }

    public UnreleaseProfilePort getUnreleaseProfilePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            UnreleaseProfilePortBindingStub _stub = new UnreleaseProfilePortBindingStub(portAddress, this);
            _stub.setPortName(getUnreleaseProfilePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setUnreleaseProfilePortEndpointAddress(String address) {
        UnreleaseProfilePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (UnreleaseProfilePort.class.isAssignableFrom(serviceEndpointInterface)) {
                UnreleaseProfilePortBindingStub _stub = new UnreleaseProfilePortBindingStub(new java.net.URL(UnreleaseProfilePort_address), this);
                _stub.setPortName(getUnreleaseProfilePortWSDDServiceName());
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
        if ("UnreleaseProfilePort".equals(inputPortName)) {
            return getUnreleaseProfilePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "UnreleaseProfileService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "UnreleaseProfilePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {
        
if ("UnreleaseProfilePort".equals(portName)) {
            setUnreleaseProfilePortEndpointAddress(address);
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
