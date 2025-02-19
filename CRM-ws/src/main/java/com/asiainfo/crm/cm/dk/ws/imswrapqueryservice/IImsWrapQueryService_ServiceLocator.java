/**
 * IImsWrapQueryService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapqueryservice;

public class IImsWrapQueryService_ServiceLocator extends org.apache.axis.client.Service implements com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.IImsWrapQueryService_Service {

    public IImsWrapQueryService_ServiceLocator() {
    }


    public IImsWrapQueryService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public IImsWrapQueryService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for IImsWrapQueryService
    private java.lang.String IImsWrapQueryService_address = "http://10.10.12.84:8182/infosystem/ws/imsintf_iImsWrapQueryService";

    public java.lang.String getIImsWrapQueryServiceAddress() {
        return IImsWrapQueryService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String IImsWrapQueryServiceWSDDServiceName = "IImsWrapQueryService";

    public java.lang.String getIImsWrapQueryServiceWSDDServiceName() {
        return IImsWrapQueryServiceWSDDServiceName;
    }

    public void setIImsWrapQueryServiceWSDDServiceName(java.lang.String name) {
        IImsWrapQueryServiceWSDDServiceName = name;
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.IImsWrapQueryServiceWs getIImsWrapQueryService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(IImsWrapQueryService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getIImsWrapQueryService(endpoint);
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.IImsWrapQueryServiceWs getIImsWrapQueryService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.IImsWrapQueryServiceSoapBindingStub _stub = new com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.IImsWrapQueryServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getIImsWrapQueryServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setIImsWrapQueryServiceEndpointAddress(java.lang.String address) {
        IImsWrapQueryService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.IImsWrapQueryServiceWs.class.isAssignableFrom(serviceEndpointInterface)) {
                com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.IImsWrapQueryServiceSoapBindingStub _stub = new com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.IImsWrapQueryServiceSoapBindingStub(new java.net.URL(IImsWrapQueryService_address), this);
                _stub.setPortName(getIImsWrapQueryServiceWSDDServiceName());
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
        if ("IImsWrapQueryService".equals(inputPortName)) {
            return getIImsWrapQueryService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "IImsWrapQueryService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "IImsWrapQueryService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("IImsWrapQueryService".equals(portName)) {
            setIImsWrapQueryServiceEndpointAddress(address);
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
