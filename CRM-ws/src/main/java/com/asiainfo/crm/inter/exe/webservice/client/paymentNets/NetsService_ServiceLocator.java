/**
 * NetsService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.paymentNets;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;

import org.apache.axis.client.Service;
import org.apache.axis.client.Stub;

import com.ai.appframe2.complex.cache.CacheFactory;
import com.asiainfo.appframe.ext.exeframe.ws.client.cache.WsClientCacheImpl;
import com.asiainfo.appframe.ext.exeframe.ws.query.impl.po.CfgWsClient;

public class NetsService_ServiceLocator extends Service implements NetsService_Service {

    public NetsService_ServiceLocator() {
    }


    public NetsService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public NetsService_ServiceLocator(String wsdlLoc, QName sName) throws ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for NetsService
    private String NetsService_address = "";

    public String getNetsServiceAddress() {
        return NetsService_address;
    }

    // The WSDD service name defaults to the port name.
    private String NetsServiceWSDDServiceName = "NetsService";

    public String getNetsServiceWSDDServiceName() {
        return NetsServiceWSDDServiceName;
    }

    public void setNetsServiceWSDDServiceName(String name) {
        NetsServiceWSDDServiceName = name;
    }

    public NetsServiceSoapPort getNetsService() throws ServiceException {
       java.net.URL endpoint;
        try {
        	CfgWsClient objCfgWsClient = (CfgWsClient)CacheFactory.get(WsClientCacheImpl.class, "C^" + "CRM_PaymentNets_URL");
            endpoint = new java.net.URL(objCfgWsClient.getUrlAddress());
        }
        catch (Exception e) {
            throw new ServiceException(e);
        }
        return getNetsService(endpoint);
    }

    public NetsServiceSoapPort getNetsService(java.net.URL portAddress) throws ServiceException {
        try {
            NetsServiceSoapBindingStub _stub = new NetsServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getNetsServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setNetsServiceEndpointAddress(String address) {
        NetsService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws ServiceException {
        try {
            if (NetsServiceSoapPort.class.isAssignableFrom(serviceEndpointInterface)) {
                NetsServiceSoapBindingStub _stub = new NetsServiceSoapBindingStub(new java.net.URL(NetsService_address), this);
                _stub.setPortName(getNetsServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (Throwable t) {
            throw new ServiceException(t);
        }
        throw new ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(QName portName, Class serviceEndpointInterface) throws ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        String inputPortName = portName.getLocalPart();
        if ("NetsService".equals(inputPortName)) {
            return getNetsService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public QName getServiceName() {
        return new QName("http://soa.ailk.telenor.com/wsdl/soa", "NetsService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new QName("http://soa.ailk.telenor.com/wsdl/soa", "NetsService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws ServiceException {
        
if ("NetsService".equals(portName)) {
            setNetsServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(QName portName, String address) throws ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
