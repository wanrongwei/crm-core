/**
 * TrsServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.transact;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
public class TrsServiceLocator extends org.apache.axis.client.Service implements com.asiainfo.crm.inter.exe.webservice.client.transact.TrsService {

	private static transient Log log = LogFactory.getLog(TrsServiceLocator.class);
    public TrsServiceLocator() {
    }


    public TrsServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TrsServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TrsServiceSoap
    private java.lang.String TrsServiceSoap_address = "";

    public java.lang.String getTrsServiceSoapAddress() {
        return TrsServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TrsServiceSoapWSDDServiceName = "TrsServiceSoap";

    public java.lang.String getTrsServiceSoapWSDDServiceName() {
        return TrsServiceSoapWSDDServiceName;
    }

    public void setTrsServiceSoapWSDDServiceName(java.lang.String name) {
        TrsServiceSoapWSDDServiceName = name;
    }

    public com.asiainfo.crm.inter.exe.webservice.client.transact.TrsServiceSoap_PortType getTrsServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TrsServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTrsServiceSoap(endpoint);
    }

    public com.asiainfo.crm.inter.exe.webservice.client.transact.TrsServiceSoap_PortType getTrsServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.asiainfo.crm.inter.exe.webservice.client.transact.TransactServiceClient _stub = new com.asiainfo.crm.inter.exe.webservice.client.transact.TransactServiceClient(portAddress, this);
            _stub.setPortName(getTrsServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTrsServiceSoapEndpointAddress(java.lang.String address) {
        TrsServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.asiainfo.crm.inter.exe.webservice.client.transact.TrsServiceSoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.asiainfo.crm.inter.exe.webservice.client.transact.TransactServiceClient _stub = new com.asiainfo.crm.inter.exe.webservice.client.transact.TransactServiceClient(new java.net.URL(TrsServiceSoap_address), this);
                _stub.setPortName(getTrsServiceSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Exception t) {
        	log.error(t.getMessage(), t);
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
        if ("TrsServiceSoap".equals(inputPortName)) {
            return getTrsServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "TrsService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "TrsServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TrsServiceSoap".equals(portName)) {
            setTrsServiceSoapEndpointAddress(address);
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
