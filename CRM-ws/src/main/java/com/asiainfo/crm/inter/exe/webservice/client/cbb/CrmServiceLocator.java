/**
 * CrmServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.cbb;

public class CrmServiceLocator extends org.apache.axis.client.Service implements com.asiainfo.crm.inter.exe.webservice.client.cbb.CrmService {

    public CrmServiceLocator() {
    }


    public CrmServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CrmServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CrmService4CBB
    private java.lang.String CrmService4CBB_address = "http://soa.ailk.telenor.com/webservices";

    public java.lang.String getCrmService4CBBAddress() {
        return CrmService4CBB_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CrmService4CBBWSDDServiceName = "CrmService4CBB";

    public java.lang.String getCrmService4CBBWSDDServiceName() {
        return CrmService4CBBWSDDServiceName;
    }

    public void setCrmService4CBBWSDDServiceName(java.lang.String name) {
        CrmService4CBBWSDDServiceName = name;
    }

    public com.asiainfo.crm.inter.exe.webservice.client.cbb.CrmService4CBBSoapPort getCrmService4CBB() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CrmService4CBB_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCrmService4CBB(endpoint);
    }

    public com.asiainfo.crm.inter.exe.webservice.client.cbb.CrmService4CBBSoapPort getCrmService4CBB(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.asiainfo.crm.inter.exe.webservice.client.cbb.CrmService4CBBSoapBindingStub _stub = new com.asiainfo.crm.inter.exe.webservice.client.cbb.CrmService4CBBSoapBindingStub(portAddress, this);
            _stub.setPortName(getCrmService4CBBWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCrmService4CBBEndpointAddress(java.lang.String address) {
        CrmService4CBB_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.asiainfo.crm.inter.exe.webservice.client.cbb.CrmService4CBBSoapPort.class.isAssignableFrom(serviceEndpointInterface)) {
                com.asiainfo.crm.inter.exe.webservice.client.cbb.CrmService4CBBSoapBindingStub _stub = new com.asiainfo.crm.inter.exe.webservice.client.cbb.CrmService4CBBSoapBindingStub(new java.net.URL(CrmService4CBB_address), this);
                _stub.setPortName(getCrmService4CBBWSDDServiceName());
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
        if ("CrmService4CBB".equals(inputPortName)) {
            return getCrmService4CBB();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "CrmService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "CrmService4CBB"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CrmService4CBB".equals(portName)) {
            setCrmService4CBBEndpointAddress(address);
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
