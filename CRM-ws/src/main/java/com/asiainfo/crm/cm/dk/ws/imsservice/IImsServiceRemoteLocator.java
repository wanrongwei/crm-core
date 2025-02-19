/**
 * IImsServiceRemoteLocator.java
 * 
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsservice;

import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.common.service.interfaces.ICmCommonSV;

public class IImsServiceRemoteLocator extends org.apache.axis.client.Service implements com.asiainfo.crm.cm.dk.ws.imsservice.IImsServiceRemote {

	public IImsServiceRemoteLocator() {
	}

	public IImsServiceRemoteLocator(org.apache.axis.EngineConfiguration config) {
		super(config);
	}

	public IImsServiceRemoteLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
		super(wsdlLoc, sName);
	}

	private String getWsUrl() {
		ICmCommonSV cmCommonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		String url = "";
		try {
			url = cmCommonSV.getCfgWsClientByCode("IMS_SERVICE").getUrlAddress();
		} catch (Exception e) {
			e.printStackTrace();
		}
		String temp[] = url.split("\\?");
		return temp[0];
	}

	// Use to get a proxy class for IImsQueryService
	private java.lang.String IImsService_address = getWsUrl();

	public java.lang.String getIImsServiceAddress() {
		return IImsService_address;
	}

	// The WSDD service name defaults to the port name.
	private java.lang.String IImsServiceWSDDServiceName = "IImsService";

	public java.lang.String getIImsServiceWSDDServiceName() {
		return IImsServiceWSDDServiceName;
	}

	public void setIImsServiceWSDDServiceName(java.lang.String name) {
		IImsServiceWSDDServiceName = name;
	}

	public com.asiainfo.crm.cm.dk.ws.imsservice.IImsServiceWs getIImsService() throws javax.xml.rpc.ServiceException {
		java.net.URL endpoint;
		try {
			endpoint = new java.net.URL(IImsService_address);
		} catch (java.net.MalformedURLException e) {
			throw new javax.xml.rpc.ServiceException(e);
		}
		return getIImsService(endpoint);
	}

	public com.asiainfo.crm.cm.dk.ws.imsservice.IImsServiceWs getIImsService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
		try {
			com.asiainfo.crm.cm.dk.ws.imsservice.IImsServiceRemoteSoapBindingStub _stub = new com.asiainfo.crm.cm.dk.ws.imsservice.IImsServiceRemoteSoapBindingStub(portAddress,
					this);
			_stub.setPortName(getIImsServiceWSDDServiceName());
			return _stub;
		} catch (org.apache.axis.AxisFault e) {
			return null;
		}
	}

	public void setIImsServiceEndpointAddress(java.lang.String address) {
		IImsService_address = address;
	}

	/**
	 * For the given interface, get the stub implementation.
	 * If this service has no port for the given interface,
	 * then ServiceException is thrown.
	 */
	public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
		try {
			if (com.asiainfo.crm.cm.dk.ws.imsservice.IImsServiceWs.class.isAssignableFrom(serviceEndpointInterface)) {
				com.asiainfo.crm.cm.dk.ws.imsservice.IImsServiceRemoteSoapBindingStub _stub = new com.asiainfo.crm.cm.dk.ws.imsservice.IImsServiceRemoteSoapBindingStub(
						new java.net.URL(IImsService_address), this);
				_stub.setPortName(getIImsServiceWSDDServiceName());
				return _stub;
			}
		} catch (java.lang.Throwable t) {
			throw new javax.xml.rpc.ServiceException(t);
		}
		throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  "
				+ (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
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
		if ("IImsService".equals(inputPortName)) {
			return getIImsService();
		} else {
			java.rmi.Remote _stub = getPort(serviceEndpointInterface);
			((org.apache.axis.client.Stub) _stub).setPortName(portName);
			return _stub;
		}
	}

	public javax.xml.namespace.QName getServiceName() {
		return new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "IImsServiceRemote");
	}

	private java.util.HashSet ports = null;

	public java.util.Iterator getPorts() {
		if (ports == null) {
			ports = new java.util.HashSet();
			ports.add(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "IImsService"));
		}
		return ports.iterator();
	}

	/**
	* Set the endpoint address for the specified port name.
	*/
	public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {

		if ("IImsService".equals(portName)) {
			setIImsServiceEndpointAddress(address);
		} else { // Unknown Port Name
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
