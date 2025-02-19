/**
 * AgreementGetServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.poa;

import com.ai.appframe2.complex.cache.CacheFactory;
import com.asiainfo.appframe.ext.exeframe.ws.client.cache.WsClientCacheImpl;
import com.asiainfo.appframe.ext.exeframe.ws.query.impl.po.CfgWsClient;

public class AgreementGetServiceLocator extends org.apache.axis.client.Service implements com.asiainfo.crm.inter.exe.webservice.client.poa.AgreementGetService {

/**
 * OSB Service
 */

    public AgreementGetServiceLocator() {
    }


    public AgreementGetServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AgreementGetServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AgreementGetPort
    private java.lang.String AgreementGetPort_address = null; //"http://10.1.248.207:8381/TelenorDK/ConsumerAccessServices/3rdParty/ProxyServices/AgreementGet";

    public com.asiainfo.crm.inter.exe.webservice.client.poa.AgreementGetPort getAgreementGetPort() throws javax.xml.rpc.ServiceException {
            java.net.URL endpoint = null; 
		CfgWsClient objCfgWsClient;
		try {
			objCfgWsClient = (CfgWsClient) CacheFactory.get(WsClientCacheImpl.class, "C^" + "CRM_POA_URL");
			endpoint = new java.net.URL(objCfgWsClient.getUrlAddress());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return getAgreementGetPort(endpoint);
    }

    public java.lang.String getAgreementGetPortAddress() {
        return AgreementGetPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AgreementGetPortWSDDServiceName = "AgreementGetPort";

    public java.lang.String getAgreementGetPortWSDDServiceName() {
        return AgreementGetPortWSDDServiceName;
    }

    public void setAgreementGetPortWSDDServiceName(java.lang.String name) {
        AgreementGetPortWSDDServiceName = name;
    }


    public com.asiainfo.crm.inter.exe.webservice.client.poa.AgreementGetPort getAgreementGetPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.asiainfo.crm.inter.exe.webservice.client.poa.AgreementGetPortBindingStub _stub = new com.asiainfo.crm.inter.exe.webservice.client.poa.AgreementGetPortBindingStub(portAddress, this);
            _stub.setPortName(getAgreementGetPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAgreementGetPortEndpointAddress(java.lang.String address) {
        AgreementGetPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.asiainfo.crm.inter.exe.webservice.client.poa.AgreementGetPort.class.isAssignableFrom(serviceEndpointInterface)) {
                com.asiainfo.crm.inter.exe.webservice.client.poa.AgreementGetPortBindingStub _stub = new com.asiainfo.crm.inter.exe.webservice.client.poa.AgreementGetPortBindingStub(new java.net.URL(AgreementGetPort_address), this);
                _stub.setPortName(getAgreementGetPortWSDDServiceName());
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
        if ("AgreementGetPort".equals(inputPortName)) {
            return getAgreementGetPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "AgreementGetService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "AgreementGetPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AgreementGetPort".equals(portName)) {
            setAgreementGetPortEndpointAddress(address);
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
