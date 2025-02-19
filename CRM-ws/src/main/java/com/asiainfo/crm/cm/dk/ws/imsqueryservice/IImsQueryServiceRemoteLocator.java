/**
 * IImsQueryServiceRemoteLocator.java
 * 
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsqueryservice;

import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.common.service.interfaces.ICmCommonSV;

public class IImsQueryServiceRemoteLocator extends org.apache.axis.client.Service implements com.asiainfo.crm.cm.dk.ws.imsqueryservice.IImsQueryServiceRemote {

	public IImsQueryServiceRemoteLocator() {
	}

	public IImsQueryServiceRemoteLocator(org.apache.axis.EngineConfiguration config) {
		super(config);
	}

	public IImsQueryServiceRemoteLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
		super(wsdlLoc, sName);
	}

	private String getWsUrl() {
		ICmCommonSV cmCommonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		String url = "";
		try {
			url = cmCommonSV.getCfgWsClientByCode("IMS_QUERY_SERVICE").getUrlAddress();
		} catch (Exception e) {
			e.printStackTrace();
		}
		String temp[] = url.split("\\?");
		return temp[0];
	}

	// Use to get a proxy class for IImsQueryService
	private java.lang.String IImsQueryService_address = getWsUrl();

	public java.lang.String getIImsQueryServiceAddress() {
		return IImsQueryService_address;
	}

	// The WSDD service name defaults to the port name.
	private java.lang.String IImsQueryServiceWSDDServiceName = "IImsQueryService";

	public java.lang.String getIImsQueryServiceWSDDServiceName() {
		return IImsQueryServiceWSDDServiceName;
	}

	public void setIImsQueryServiceWSDDServiceName(java.lang.String name) {
		IImsQueryServiceWSDDServiceName = name;
	}

	public com.asiainfo.crm.cm.dk.ws.imsqueryservice.IImsQueryServiceWs getIImsQueryService() throws javax.xml.rpc.ServiceException {
		java.net.URL endpoint;
		try {
			endpoint = new java.net.URL(IImsQueryService_address);
		} catch (java.net.MalformedURLException e) {
			throw new javax.xml.rpc.ServiceException(e);
		}
		return getIImsQueryService(endpoint);
	}

	public com.asiainfo.crm.cm.dk.ws.imsqueryservice.IImsQueryServiceWs getIImsQueryService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
		try {
			com.asiainfo.crm.cm.dk.ws.imsqueryservice.IImsQueryServiceRemoteSoapBindingStub _stub = new com.asiainfo.crm.cm.dk.ws.imsqueryservice.IImsQueryServiceRemoteSoapBindingStub(
					portAddress, this);
			_stub.setPortName(getIImsQueryServiceWSDDServiceName());
			return _stub;
		} catch (org.apache.axis.AxisFault e) {
			return null;
		}
	}

	public void setIImsQueryServiceEndpointAddress(java.lang.String address) {
		IImsQueryService_address = address;
	}

	/**
	 * For the given interface, get the stub implementation.
	 * If this service has no port for the given interface,
	 * then ServiceException is thrown.
	 */
	public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
		try {
			if (com.asiainfo.crm.cm.dk.ws.imsqueryservice.IImsQueryServiceWs.class.isAssignableFrom(serviceEndpointInterface)) {
				com.asiainfo.crm.cm.dk.ws.imsqueryservice.IImsQueryServiceRemoteSoapBindingStub _stub = new com.asiainfo.crm.cm.dk.ws.imsqueryservice.IImsQueryServiceRemoteSoapBindingStub(
						new java.net.URL(IImsQueryService_address), this);
				_stub.setPortName(getIImsQueryServiceWSDDServiceName());
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
		if ("IImsQueryService".equals(inputPortName)) {
			return getIImsQueryService();
		} else {
			java.rmi.Remote _stub = getPort(serviceEndpointInterface);
			((org.apache.axis.client.Stub) _stub).setPortName(portName);
			return _stub;
		}
	}

	public javax.xml.namespace.QName getServiceName() {
		return new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "IImsQueryServiceRemote");
	}

	private java.util.HashSet ports = null;

	public java.util.Iterator getPorts() {
		if (ports == null) {
			ports = new java.util.HashSet();
			ports.add(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "IImsQueryService"));
		}
		return ports.iterator();
	}

	/**
	* Set the endpoint address for the specified port name.
	*/
	public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {

		if ("IImsQueryService".equals(portName)) {
			setIImsQueryServiceEndpointAddress(address);
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
