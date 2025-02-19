/**
 * DHCPPortBindingQSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.secure;

import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.common.service.interfaces.ICmCommonSV;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class DHCPPortBindingQSServiceLocator extends org.apache.axis.client.Service implements DHCPPortBindingQSService {

/**
 * OSB Service
 */
private transient Log log = LogFactory.getLog(DHCPPortBindingQSServiceLocator.class);
    public DHCPPortBindingQSServiceLocator() {
    }


    public DHCPPortBindingQSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DHCPPortBindingQSServiceLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DHCPPortBindingQSPort
    private String DHCPPortBindingQSPort_address = this.getWsUrl();

    public String getDHCPPortBindingQSPortAddress() {
        return DHCPPortBindingQSPort_address;
    }

    // The WSDD service name defaults to the port name.
    private String DHCPPortBindingQSPortWSDDServiceName = "DHCPPortBindingQSPort";

    public String getDHCPPortBindingQSPortWSDDServiceName() {
        return DHCPPortBindingQSPortWSDDServiceName;
    }

    public void setDHCPPortBindingQSPortWSDDServiceName(String name) {
        DHCPPortBindingQSPortWSDDServiceName = name;
    }

    public DHCP getDHCPPortBindingQSPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DHCPPortBindingQSPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDHCPPortBindingQSPort(endpoint);
    }

    public DHCP getDHCPPortBindingQSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            DHCPPortBindingStub _stub = new DHCPPortBindingStub(portAddress, this);
            _stub.setPortName(getDHCPPortBindingQSPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDHCPPortBindingQSPortEndpointAddress(String address) {
        DHCPPortBindingQSPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (DHCP.class.isAssignableFrom(serviceEndpointInterface)) {
                DHCPPortBindingStub _stub = new DHCPPortBindingStub(new java.net.URL(DHCPPortBindingQSPort_address), this);
                _stub.setPortName(getDHCPPortBindingQSPortWSDDServiceName());
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
        if ("DHCPPortBindingQSPort".equals(inputPortName)) {
            return getDHCPPortBindingQSPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "DHCPPortBindingQSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "DHCPPortBindingQSPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {
        
if ("DHCPPortBindingQSPort".equals(portName)) {
            setDHCPPortBindingQSPortEndpointAddress(address);
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

    private String getWsUrl() {
        ICmCommonSV cmCommonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
        String url = "";
        try {
            url = cmCommonSV.getCfgWsClientByCode("SECURE_DNS_SERVICE").getUrlAddress();
        } catch (Exception e) {
            log.error("ERROR:",e);
        }
        String[] temp = url.split("\\?");
        return temp[0];
    }

}
