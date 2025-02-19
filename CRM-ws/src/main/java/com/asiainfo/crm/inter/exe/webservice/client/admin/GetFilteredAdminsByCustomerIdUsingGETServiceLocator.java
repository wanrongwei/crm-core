/**
 * GetFilteredAdminsByCustomerIdUsingGETServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.admin;

import com.ai.appframe2.complex.cache.CacheFactory;
import com.asiainfo.appframe.ext.exeframe.ws.client.cache.WsClientCacheImpl;
import com.asiainfo.appframe.ext.exeframe.ws.query.impl.po.CfgWsClient;

public class GetFilteredAdminsByCustomerIdUsingGETServiceLocator extends org.apache.axis.client.Service implements com.asiainfo.crm.inter.exe.webservice.client.admin.GetFilteredAdminsByCustomerIdUsingGETService {

/**
 * OSB Service
 */

    public GetFilteredAdminsByCustomerIdUsingGETServiceLocator() {
    }


    public GetFilteredAdminsByCustomerIdUsingGETServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GetFilteredAdminsByCustomerIdUsingGETServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for getFilteredAdminsByCustomerIdUsingGETPort
    private java.lang.String getFilteredAdminsByCustomerIdUsingGETPort_address;

    public java.lang.String getgetFilteredAdminsByCustomerIdUsingGETPortAddress() {
        return getFilteredAdminsByCustomerIdUsingGETPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String getFilteredAdminsByCustomerIdUsingGETPortWSDDServiceName = "getFilteredAdminsByCustomerIdUsingGETPort";

    public java.lang.String getgetFilteredAdminsByCustomerIdUsingGETPortWSDDServiceName() {
        return getFilteredAdminsByCustomerIdUsingGETPortWSDDServiceName;
    }

    public void setgetFilteredAdminsByCustomerIdUsingGETPortWSDDServiceName(java.lang.String name) {
        getFilteredAdminsByCustomerIdUsingGETPortWSDDServiceName = name;
    }

    public com.asiainfo.crm.inter.exe.webservice.client.admin.GetFilteredAdminsByCustomerIdUsingGETPort getgetFilteredAdminsByCustomerIdUsingGETPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint = null;
        CfgWsClient objCfgWsClient;
		try {
			objCfgWsClient = (CfgWsClient) CacheFactory.get(WsClientCacheImpl.class, "C^" + "CRM_OSB_ADMIN");
			endpoint = new java.net.URL(objCfgWsClient.getUrlAddress());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return getgetFilteredAdminsByCustomerIdUsingGETPort(endpoint);
    }

    public com.asiainfo.crm.inter.exe.webservice.client.admin.GetFilteredAdminsByCustomerIdUsingGETPort getgetFilteredAdminsByCustomerIdUsingGETPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.asiainfo.crm.inter.exe.webservice.client.admin.GetFilteredAdminsByCustomerIdUsingGETPortBindingStub _stub = new com.asiainfo.crm.inter.exe.webservice.client.admin.GetFilteredAdminsByCustomerIdUsingGETPortBindingStub(portAddress, this);
            _stub.setPortName(getgetFilteredAdminsByCustomerIdUsingGETPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setgetFilteredAdminsByCustomerIdUsingGETPortEndpointAddress(java.lang.String address) {
        getFilteredAdminsByCustomerIdUsingGETPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.asiainfo.crm.inter.exe.webservice.client.admin.GetFilteredAdminsByCustomerIdUsingGETPort.class.isAssignableFrom(serviceEndpointInterface)) {
                com.asiainfo.crm.inter.exe.webservice.client.admin.GetFilteredAdminsByCustomerIdUsingGETPortBindingStub _stub = new com.asiainfo.crm.inter.exe.webservice.client.admin.GetFilteredAdminsByCustomerIdUsingGETPortBindingStub(new java.net.URL(getFilteredAdminsByCustomerIdUsingGETPort_address), this);
                _stub.setPortName(getgetFilteredAdminsByCustomerIdUsingGETPortWSDDServiceName());
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
        if ("getFilteredAdminsByCustomerIdUsingGETPort".equals(inputPortName)) {
            return getgetFilteredAdminsByCustomerIdUsingGETPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "getFilteredAdminsByCustomerIdUsingGETService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "getFilteredAdminsByCustomerIdUsingGETPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("getFilteredAdminsByCustomerIdUsingGETPort".equals(portName)) {
            setgetFilteredAdminsByCustomerIdUsingGETPortEndpointAddress(address);
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
