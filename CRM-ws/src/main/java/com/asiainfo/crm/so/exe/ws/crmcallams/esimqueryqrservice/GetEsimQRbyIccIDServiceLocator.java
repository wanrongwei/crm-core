/**
 * GetEsimQRbyIccIDServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.esimqueryqrservice;

import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.common.service.interfaces.ICmCommonSV;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class GetEsimQRbyIccIDServiceLocator extends org.apache.axis.client.Service implements GetEsimQRbyIccIDService {

/**
 * OSB Service
 */

    private static transient Log log = LogFactory.getLog(GetEsimQRbyIccIDServiceLocator.class);

    public GetEsimQRbyIccIDServiceLocator() {
    }


    public GetEsimQRbyIccIDServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GetEsimQRbyIccIDServiceLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GetEsimQRbyIccIDPort
    private String GetEsimQRbyIccIDPort_address = this.getWsUrl();

    public String getGetEsimQRbyIccIDPortAddress() {
        return GetEsimQRbyIccIDPort_address;
    }

    // The WSDD service name defaults to the port name.
    private String GetEsimQRbyIccIDPortWSDDServiceName = "GetEsimQRbyIccIDPort";

    public String getGetEsimQRbyIccIDPortWSDDServiceName() {
        return GetEsimQRbyIccIDPortWSDDServiceName;
    }

    public void setGetEsimQRbyIccIDPortWSDDServiceName(String name) {
        GetEsimQRbyIccIDPortWSDDServiceName = name;
    }

    public GetEsimQRbyIccIDPort_PortType getGetEsimQRbyIccIDPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GetEsimQRbyIccIDPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGetEsimQRbyIccIDPort(endpoint);
    }

    public GetEsimQRbyIccIDPort_PortType getGetEsimQRbyIccIDPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            GetEsimQRbyIccIDPortBindingStub _stub = new GetEsimQRbyIccIDPortBindingStub(portAddress, this);
            _stub.setPortName(getGetEsimQRbyIccIDPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGetEsimQRbyIccIDPortEndpointAddress(String address) {
        GetEsimQRbyIccIDPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (GetEsimQRbyIccIDPort_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                GetEsimQRbyIccIDPortBindingStub _stub = new GetEsimQRbyIccIDPortBindingStub(new java.net.URL(GetEsimQRbyIccIDPort_address), this);
                _stub.setPortName(getGetEsimQRbyIccIDPortWSDDServiceName());
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
        if ("GetEsimQRbyIccIDPort".equals(inputPortName)) {
            return getGetEsimQRbyIccIDPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "GetEsimQRbyIccIDService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "GetEsimQRbyIccIDPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {
        
if ("GetEsimQRbyIccIDPort".equals(portName)) {
            setGetEsimQRbyIccIDPortEndpointAddress(address);
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
            url = cmCommonSV.getCfgWsClientByCode("CRM_ESIM_QUERY_QR_URL").getUrlAddress();
        } catch (Exception e) {
            log.error("ERROR",e);
            e.printStackTrace();
        }
        String[] temp = url.split("\\?");
        return temp[0];
    }
}
