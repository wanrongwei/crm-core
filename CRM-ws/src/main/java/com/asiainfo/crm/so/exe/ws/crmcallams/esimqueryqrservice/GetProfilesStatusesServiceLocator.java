/**
 * GetProfilesStatusesServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.esimqueryqrservice;

public class GetProfilesStatusesServiceLocator extends org.apache.axis.client.Service implements GetProfilesStatusesService {

/**
 * OSB Service
 */

    public GetProfilesStatusesServiceLocator() {
    }


    public GetProfilesStatusesServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GetProfilesStatusesServiceLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GetProfilesStatusesPort
    private String GetProfilesStatusesPort_address = "http://10.1.248.207:8381/TelenorDK/ConsumerAccessServices/3rdParty/ProxyServices/GetProfilesStatuses";

    public String getGetProfilesStatusesPortAddress() {
        return GetProfilesStatusesPort_address;
    }

    // The WSDD service name defaults to the port name.
    private String GetProfilesStatusesPortWSDDServiceName = "GetProfilesStatusesPort";

    public String getGetProfilesStatusesPortWSDDServiceName() {
        return GetProfilesStatusesPortWSDDServiceName;
    }

    public void setGetProfilesStatusesPortWSDDServiceName(String name) {
        GetProfilesStatusesPortWSDDServiceName = name;
    }

    public GetProfilesStatusesPort getGetProfilesStatusesPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GetProfilesStatusesPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGetProfilesStatusesPort(endpoint);
    }

    public GetProfilesStatusesPort getGetProfilesStatusesPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            GetProfilesStatusesPortBindingStub _stub = new GetProfilesStatusesPortBindingStub(portAddress, this);
            _stub.setPortName(getGetProfilesStatusesPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGetProfilesStatusesPortEndpointAddress(String address) {
        GetProfilesStatusesPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (GetProfilesStatusesPort.class.isAssignableFrom(serviceEndpointInterface)) {
                GetProfilesStatusesPortBindingStub _stub = new GetProfilesStatusesPortBindingStub(new java.net.URL(GetProfilesStatusesPort_address), this);
                _stub.setPortName(getGetProfilesStatusesPortWSDDServiceName());
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
        if ("GetProfilesStatusesPort".equals(inputPortName)) {
            return getGetProfilesStatusesPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "GetProfilesStatusesService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "GetProfilesStatusesPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {
        
if ("GetProfilesStatusesPort".equals(portName)) {
            setGetProfilesStatusesPortEndpointAddress(address);
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
