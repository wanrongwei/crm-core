/**
 * ResCrmSeverSVImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.resaddr4crm;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ResCrmSeverSVImplServiceLocator extends org.apache.axis.client.Service implements ResCrmSeverSVImplService {

	private static Log log = LogFactory.getLog(ResCrmSeverSVImplServiceLocator.class);
	
    public ResCrmSeverSVImplServiceLocator() {
    }


    public ResCrmSeverSVImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ResCrmSeverSVImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for RESaddr4CRM
    private java.lang.String RESaddr4CRM_address = null;

    public java.lang.String getRESaddr4CRMAddress() {
        return RESaddr4CRM_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String RESaddr4CRMWSDDServiceName = "RESaddr4CRM";

    public java.lang.String getRESaddr4CRMWSDDServiceName() {
        return RESaddr4CRMWSDDServiceName;
    }

    public void setRESaddr4CRMWSDDServiceName(java.lang.String name) {
        RESaddr4CRMWSDDServiceName = name;
    }

    public ResCrmSeverSVImpl getRESaddr4CRM() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(null); // new java.net.URL("http://10.11.20.107:31032/services/RESaddr4CRM");
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getRESaddr4CRM(endpoint);
    }

    public ResCrmSeverSVImpl getRESaddr4CRM(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            RESaddr4CRMSoapBindingStub _stub = new RESaddr4CRMSoapBindingStub(portAddress, this);
            _stub.setPortName(getRESaddr4CRMWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
        	if(log.isDebugEnabled()){
        		log.debug("", e);
        	}
            return null;
        }
    }

    public void setRESaddr4CRMEndpointAddress(java.lang.String address) {
        RESaddr4CRM_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ResCrmSeverSVImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                RESaddr4CRMSoapBindingStub _stub = new RESaddr4CRMSoapBindingStub(new java.net.URL(null), this);  // "http://10.11.20.107:31032/services/RESaddr4CRM"
                _stub.setPortName(getRESaddr4CRMWSDDServiceName());
                return _stub;
            }
        }
        catch (Exception t) {
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
        if ("RESaddr4CRM".equals(inputPortName)) {
            return getRESaddr4CRM();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName(null);  // http://10.11.20.107:31032/services/RESaddr4CRM", "ResCrmSeverSVImplService
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName(null));  // http://10.11.20.107:31032/services/RESaddr4CRM", "RESaddr4CRM
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("RESaddr4CRM".equals(portName)) {
            setRESaddr4CRMEndpointAddress(address);
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
