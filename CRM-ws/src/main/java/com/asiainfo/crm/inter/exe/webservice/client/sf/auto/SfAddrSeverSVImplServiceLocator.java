/**
 * ResCrmSeverSVImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.sf.auto;

import com.ai.appframe2.complex.cache.CacheFactory;
import com.asiainfo.appframe.ext.exeframe.ws.client.cache.WsClientCacheImpl;
import com.asiainfo.appframe.ext.exeframe.ws.query.impl.po.CfgWsClient;

public class SfAddrSeverSVImplServiceLocator extends org.apache.axis.client.Service implements SfAddrSeverSVImplService {

	private static final long serialVersionUID = 2786855939067089755L;

	public SfAddrSeverSVImplServiceLocator() {
	}

	public SfAddrSeverSVImplServiceLocator(org.apache.axis.EngineConfiguration config) {
		super(config);
	}

	public SfAddrSeverSVImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName)
			throws javax.xml.rpc.ServiceException {
		super(wsdlLoc, sName);
	}

	public java.lang.String getRESaddr4CRMAddress() {
		try {
			CfgWsClient objCfgWsClient = (CfgWsClient) CacheFactory.get(WsClientCacheImpl.class, "C^" + "SFF2CustMgr");
			return objCfgWsClient.getUrlAddress();
		} catch (Exception e) {
			return null;
		}
	}

	// The WSDD service name defaults to the port name.
	private java.lang.String RESaddr4CRMWSDDServiceName = "RESaddr4CRM";

	public java.lang.String getRESaddr4CRMWSDDServiceName() {
		return RESaddr4CRMWSDDServiceName;
	}

	public void setRESaddr4CRMWSDDServiceName(java.lang.String name) {
		RESaddr4CRMWSDDServiceName = name;
	}

	public SfAutoAddrService getRESaddr4CRM() throws javax.xml.rpc.ServiceException {
		java.net.URL endpoint;
		try {
			endpoint = new java.net.URL(getRESaddr4CRMAddress());
		} catch (java.net.MalformedURLException e) {
			throw new javax.xml.rpc.ServiceException(e);
		}
		return getRESaddr4CRM(endpoint);
	}

	public SfAutoAddrService getRESaddr4CRM(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
		try {
			SfAutoAddrStub _stub = new SfAutoAddrStub(portAddress, this);
			_stub.setPortName(getRESaddr4CRMWSDDServiceName());
			return _stub;
		} catch (org.apache.axis.AxisFault e) {
			return null;
		}
	}

	/**
	 * For the given interface, get the stub implementation. If this service has
	 * no port for the given interface, then ServiceException is thrown.
	 */
	public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
		try {
			if (SfAutoAddrService.class.isAssignableFrom(serviceEndpointInterface)) {
				SfAutoAddrStub _stub = new SfAutoAddrStub(new java.net.URL(getRESaddr4CRMAddress()), this);
				_stub.setPortName(getRESaddr4CRMWSDDServiceName());
				return _stub;
			}
		} catch (Exception t) {
			throw new javax.xml.rpc.ServiceException(t);
		}
		throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  "
				+ (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
	}

	/**
	 * For the given interface, get the stub implementation. If this service has
	 * no port for the given interface, then ServiceException is thrown.
	 */
	public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface)
			throws javax.xml.rpc.ServiceException {
		if (portName == null) {
			return getPort(serviceEndpointInterface);
		}
		java.lang.String inputPortName = portName.getLocalPart();
		if ("RESaddr4CRM".equals(inputPortName)) {
			return getRESaddr4CRM();
		} else {
			java.rmi.Remote _stub = getPort(serviceEndpointInterface);
			((org.apache.axis.client.Stub) _stub).setPortName(portName);
			return _stub;
		}
	}

}
