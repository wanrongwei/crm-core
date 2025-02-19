/**
 * RoamingProvisioningLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.arp;

import com.ai.appframe2.complex.cache.CacheFactory;
import com.asiainfo.appframe.ext.exeframe.ws.client.cache.WsClientCacheImpl;
import com.asiainfo.appframe.ext.exeframe.ws.query.impl.po.CfgWsClient;

public class RoamingProvisioningLocator extends org.apache.axis.client.Service implements com.asiainfo.crm.inter.exe.webservice.client.arp.RoamingProvisioning {

/**
 * ***add URI to OMA documentation here***
 */

    public RoamingProvisioningLocator() {
    }


    public RoamingProvisioningLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public RoamingProvisioningLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ServiceUpdate
    private java.lang.String ServiceUpdate_address ;

    public java.lang.String getServiceUpdateAddress() {
        return ServiceUpdate_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ServiceUpdateWSDDServiceName = "ServiceUpdate";

    public java.lang.String getServiceUpdateWSDDServiceName() {
        return ServiceUpdateWSDDServiceName;
    }

    public void setServiceUpdateWSDDServiceName(java.lang.String name) {
        ServiceUpdateWSDDServiceName = name;
    }

    public com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceUpdate_PortType getServiceUpdate() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
        	CfgWsClient wsClient = (CfgWsClient)CacheFactory.get(WsClientCacheImpl.class, "C^" + "CRM_ARP_URL");
            endpoint = new java.net.URL(wsClient.getUrlAddress());
        }
        catch (Exception e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getServiceUpdate(endpoint);
    }

    public com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceUpdate_PortType getServiceUpdate(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceUpdateBindingStub _stub = new com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceUpdateBindingStub(portAddress, this);
            _stub.setPortName(getServiceUpdateWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setServiceUpdateEndpointAddress(java.lang.String address) {
        ServiceUpdate_address = address;
    }


    // Use to get a proxy class for ServiceDeactivation
    private java.lang.String ServiceDeactivation_address ;

    public java.lang.String getServiceDeactivationAddress() {
        return ServiceDeactivation_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ServiceDeactivationWSDDServiceName = "ServiceDeactivation";

    public java.lang.String getServiceDeactivationWSDDServiceName() {
        return ServiceDeactivationWSDDServiceName;
    }

    public void setServiceDeactivationWSDDServiceName(java.lang.String name) {
        ServiceDeactivationWSDDServiceName = name;
    }

    public com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceDeactivation_PortType getServiceDeactivation() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
        	CfgWsClient wsClient = (CfgWsClient)CacheFactory.get(WsClientCacheImpl.class, "C^" + "CRM_ARP_URL");
            endpoint = new java.net.URL(wsClient.getUrlAddress());
        }
        catch (Exception e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getServiceDeactivation(endpoint);
    }

    public com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceDeactivation_PortType getServiceDeactivation(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceDeactivationBindingStub _stub = new com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceDeactivationBindingStub(portAddress, this);
            _stub.setPortName(getServiceDeactivationWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setServiceDeactivationEndpointAddress(java.lang.String address) {
        ServiceDeactivation_address = address;
    }


    // Use to get a proxy class for ServiceSuspension
    private java.lang.String ServiceSuspension_address  ;

    public java.lang.String getServiceSuspensionAddress() {
        return ServiceSuspension_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ServiceSuspensionWSDDServiceName = "ServiceSuspension";

    public java.lang.String getServiceSuspensionWSDDServiceName() {
        return ServiceSuspensionWSDDServiceName;
    }

    public void setServiceSuspensionWSDDServiceName(java.lang.String name) {
        ServiceSuspensionWSDDServiceName = name;
    }

    public com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceSuspension_PortType getServiceSuspension() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
        	CfgWsClient wsClient = (CfgWsClient)CacheFactory.get(WsClientCacheImpl.class, "C^" + "CRM_ARP_URL");
            endpoint = new java.net.URL(wsClient.getUrlAddress());
        }
        catch (Exception e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getServiceSuspension(endpoint);
    }

    public com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceSuspension_PortType getServiceSuspension(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceSuspensionBindingStub _stub = new com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceSuspensionBindingStub(portAddress, this);
            _stub.setPortName(getServiceSuspensionWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setServiceSuspensionEndpointAddress(java.lang.String address) {
        ServiceSuspension_address = address;
    }


    // Use to get a proxy class for ServiceActivation
    private java.lang.String ServiceActivation_address ;

    public java.lang.String getServiceActivationAddress() {
        return ServiceActivation_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ServiceActivationWSDDServiceName = "ServiceActivation";

    public java.lang.String getServiceActivationWSDDServiceName() {
        return ServiceActivationWSDDServiceName;
    }

    public void setServiceActivationWSDDServiceName(java.lang.String name) {
        ServiceActivationWSDDServiceName = name;
    }

    public com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceActivation_PortType getServiceActivation() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
        	CfgWsClient wsClient = (CfgWsClient)CacheFactory.get(WsClientCacheImpl.class, "C^" + "CRM_ARP_URL");
            endpoint = new java.net.URL(wsClient.getUrlAddress());
        }
        catch (Exception e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getServiceActivation(endpoint);
    }

    public com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceActivation_PortType getServiceActivation(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceActivationBindingStub _stub = new com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceActivationBindingStub(portAddress, this);
            _stub.setPortName(getServiceActivationWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setServiceActivationEndpointAddress(java.lang.String address) {
        ServiceActivation_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceUpdate_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
            	CfgWsClient wsClient = (CfgWsClient)CacheFactory.get(WsClientCacheImpl.class, "C^" + "CRM_ARP_URL");
                com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceUpdateBindingStub _stub = new com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceUpdateBindingStub(new java.net.URL(wsClient.getUrlAddress()), this);
                _stub.setPortName(getServiceUpdateWSDDServiceName());
                return _stub;
            }
            if (com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceDeactivation_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
            	CfgWsClient wsClient = (CfgWsClient)CacheFactory.get(WsClientCacheImpl.class, "C^" + "CRM_ARP_URL");
                com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceDeactivationBindingStub _stub = new com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceDeactivationBindingStub(new java.net.URL(wsClient.getUrlAddress()), this);
                _stub.setPortName(getServiceDeactivationWSDDServiceName());
                return _stub;
            }
            if (com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceSuspension_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
            	CfgWsClient wsClient = (CfgWsClient)CacheFactory.get(WsClientCacheImpl.class, "C^" + "CRM_ARP_URL");
                com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceSuspensionBindingStub _stub = new com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceSuspensionBindingStub(new java.net.URL(wsClient.getUrlAddress()), this);
                _stub.setPortName(getServiceSuspensionWSDDServiceName());
                return _stub;
            }
            if (com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceActivation_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
            	CfgWsClient wsClient = (CfgWsClient)CacheFactory.get(WsClientCacheImpl.class, "C^" + "CRM_ARP_URL");
                com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceActivationBindingStub _stub = new com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceActivationBindingStub(new java.net.URL(wsClient.getUrlAddress()), this);
                _stub.setPortName(getServiceActivationWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Exception t) {
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
        if ("ServiceUpdate".equals(inputPortName)) {
            return getServiceUpdate();
        }
        else if ("ServiceDeactivation".equals(inputPortName)) {
            return getServiceDeactivation();
        }
        else if ("ServiceSuspension".equals(inputPortName)) {
            return getServiceSuspension();
        }
        else if ("ServiceActivation".equals(inputPortName)) {
            return getServiceActivation();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.openmobilealliance.org/tech/wsdl/roamingprovisioning-v1_0.zip#arp_service", "RoamingProvisioning");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.openmobilealliance.org/tech/wsdl/roamingprovisioning-v1_0.zip#arp_service", "ServiceUpdate"));
            ports.add(new javax.xml.namespace.QName("http://www.openmobilealliance.org/tech/wsdl/roamingprovisioning-v1_0.zip#arp_service", "ServiceDeactivation"));
            ports.add(new javax.xml.namespace.QName("http://www.openmobilealliance.org/tech/wsdl/roamingprovisioning-v1_0.zip#arp_service", "ServiceSuspension"));
            ports.add(new javax.xml.namespace.QName("http://www.openmobilealliance.org/tech/wsdl/roamingprovisioning-v1_0.zip#arp_service", "ServiceActivation"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ServiceUpdate".equals(portName)) {
            setServiceUpdateEndpointAddress(address);
        }
        else 
if ("ServiceDeactivation".equals(portName)) {
            setServiceDeactivationEndpointAddress(address);
        }
        else 
if ("ServiceSuspension".equals(portName)) {
            setServiceSuspensionEndpointAddress(address);
        }
        else 
if ("ServiceActivation".equals(portName)) {
            setServiceActivationEndpointAddress(address);
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
