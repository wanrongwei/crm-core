/**
 * IImsHisQueryService_ServiceLocator.java
 * 
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imshisqueryservice;

import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.common.service.interfaces.ICmCommonSV;

public class IImsHisQueryService_ServiceLocator extends org.apache.axis.client.Service implements com.asiainfo.crm.cm.dk.ws.imshisqueryservice.IImsHisQueryService_Service {

	public IImsHisQueryService_ServiceLocator() {
	}

	public IImsHisQueryService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
		super(config);
	}

	public IImsHisQueryService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
		super(wsdlLoc, sName);
	}

	private String getWsUrl() {
		ICmCommonSV cmCommonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		String url = "";
		try {
			url = cmCommonSV.getCfgWsClientByCode("IMS_HIS_QUERY").getUrlAddress();
		} catch (Exception e) {
			e.printStackTrace();
		}
		String temp[] = url.split("\\?");
		return temp[0];
	}

	// Use to get a proxy class for IImsHisQueryService
	private java.lang.String IImsHisQueryService_address = getWsUrl();

	public java.lang.String getIImsHisQueryServiceAddress() {
		return IImsHisQueryService_address;
	}

	// The WSDD service name defaults to the port name.
	private java.lang.String IImsHisQueryServiceWSDDServiceName = "IImsHisQueryService";

	public java.lang.String getIImsHisQueryServiceWSDDServiceName() {
		return IImsHisQueryServiceWSDDServiceName;
	}

	public void setIImsHisQueryServiceWSDDServiceName(java.lang.String name) {
		IImsHisQueryServiceWSDDServiceName = name;
	}

	public com.asiainfo.crm.cm.dk.ws.imshisqueryservice.IImsHisQueryServiceWs getIImsHisQueryService() throws javax.xml.rpc.ServiceException {
		java.net.URL endpoint;
		try {
			endpoint = new java.net.URL(IImsHisQueryService_address);
		} catch (java.net.MalformedURLException e) {
			throw new javax.xml.rpc.ServiceException(e);
		}
		return getIImsHisQueryService(endpoint);
	}

	public com.asiainfo.crm.cm.dk.ws.imshisqueryservice.IImsHisQueryServiceWs getIImsHisQueryService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
		try {
			com.asiainfo.crm.cm.dk.ws.imshisqueryservice.IImsHisQueryServiceSoapBindingStub _stub = new com.asiainfo.crm.cm.dk.ws.imshisqueryservice.IImsHisQueryServiceSoapBindingStub(
					portAddress, this);
			_stub.setPortName(getIImsHisQueryServiceWSDDServiceName());
			return _stub;
		} catch (org.apache.axis.AxisFault e) {
			return null;
		}
	}

	public void setIImsHisQueryServiceEndpointAddress(java.lang.String address) {
		IImsHisQueryService_address = address;
	}

	/**
	 * For the given interface, get the stub implementation.
	 * If this service has no port for the given interface,
	 * then ServiceException is thrown.
	 */
	public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
		try {
			if (com.asiainfo.crm.cm.dk.ws.imshisqueryservice.IImsHisQueryServiceWs.class.isAssignableFrom(serviceEndpointInterface)) {
				com.asiainfo.crm.cm.dk.ws.imshisqueryservice.IImsHisQueryServiceSoapBindingStub _stub = new com.asiainfo.crm.cm.dk.ws.imshisqueryservice.IImsHisQueryServiceSoapBindingStub(
						new java.net.URL(IImsHisQueryService_address), this);
				_stub.setPortName(getIImsHisQueryServiceWSDDServiceName());
				return _stub;
			}
		} catch (java.lang.Exception t) {
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
		if ("IImsHisQueryService".equals(inputPortName)) {
			return getIImsHisQueryService();
		} else {
			java.rmi.Remote _stub = getPort(serviceEndpointInterface);
			((org.apache.axis.client.Stub) _stub).setPortName(portName);
			return _stub;
		}
	}

	public javax.xml.namespace.QName getServiceName() {
		return new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "IImsHisQueryService");
	}

	private java.util.HashSet ports = null;

	public java.util.Iterator getPorts() {
		if (ports == null) {
			ports = new java.util.HashSet();
			ports.add(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "IImsHisQueryService"));
		}
		return ports.iterator();
	}

	/**
	* Set the endpoint address for the specified port name.
	*/
	public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {

		if ("IImsHisQueryService".equals(portName)) {
			setIImsHisQueryServiceEndpointAddress(address);
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
