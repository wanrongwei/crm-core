/**
 * SBBUpermissionServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.sbbupermissionservice;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


import com.ai.appframe2.service.ServiceFactory;

import com.asiainfo.crm.cm.common.service.interfaces.ICmCommonSV;

public class SetSbbuPermissionServiceLocator extends org.apache.axis.client.Service implements com.asiainfo.crm.so.exe.ws.crmcallams.sbbupermissionservice.SetSbbuPermissionService {

	private static transient Log log = LogFactory.getLog(SetSbbuPermissionServiceLocator.class);
	
/**
 * OSB Service
 */

    public SetSbbuPermissionServiceLocator() {
    }


    public SetSbbuPermissionServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SetSbbuPermissionServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SBBUpermissionPort
    private java.lang.String SBBUpermissionPort_address =this.getWsUrl();
    		
    
    public java.lang.String getSBBUpermissionPortAddress() {
        return SBBUpermissionPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SBBUpermissionPortWSDDServiceName = "SBBUpermissionPort";

    public java.lang.String getSBBUpermissionPortWSDDServiceName() {
        return SBBUpermissionPortWSDDServiceName;
    }

    public void setSBBUpermissionPortWSDDServiceName(java.lang.String name) {
        SBBUpermissionPortWSDDServiceName = name;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.sbbupermissionservice.SetSbbuPermissionPort_PortType getSBBUpermissionPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SBBUpermissionPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSBBUpermissionPort(endpoint);
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.sbbupermissionservice.SetSbbuPermissionPort_PortType getSBBUpermissionPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.asiainfo.crm.so.exe.ws.crmcallams.sbbupermissionservice.SetSbbuPermissionPortBindingStub _stub = new com.asiainfo.crm.so.exe.ws.crmcallams.sbbupermissionservice.SetSbbuPermissionPortBindingStub(portAddress, this);
            _stub.setPortName(getSBBUpermissionPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSBBUpermissionPortEndpointAddress(java.lang.String address) {
        SBBUpermissionPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.asiainfo.crm.so.exe.ws.crmcallams.sbbupermissionservice.SetSbbuPermissionPort_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.asiainfo.crm.so.exe.ws.crmcallams.sbbupermissionservice.SetSbbuPermissionPortBindingStub _stub = new com.asiainfo.crm.so.exe.ws.crmcallams.sbbupermissionservice.SetSbbuPermissionPortBindingStub(new java.net.URL(SBBUpermissionPort_address), this);
                _stub.setPortName(getSBBUpermissionPortWSDDServiceName());
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
        if ("SBBUpermissionPort".equals(inputPortName)) {
            return getSBBUpermissionPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "SBBUpermissionService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "SBBUpermissionPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SBBUpermissionPort".equals(portName)) {
            setSBBUpermissionPortEndpointAddress(address);
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
    
    private String getWsUrl() {
        ICmCommonSV cmCommonSV = (ICmCommonSV)ServiceFactory.getService(ICmCommonSV.class);
        String url = "";
        try {
          url = cmCommonSV.getCfgWsClientByCode("CRM_SETSBBUPERMISSION_URL").getUrlAddress();
        } catch (Exception e) {
        	log.error("ERROR",e);
          e.printStackTrace();
        }
        String[] temp = url.split("\\?");
        return temp[0];
      }

}
