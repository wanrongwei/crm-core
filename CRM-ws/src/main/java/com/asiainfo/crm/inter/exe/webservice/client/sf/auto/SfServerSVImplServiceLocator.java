package com.asiainfo.crm.inter.exe.webservice.client.sf.auto;

import java.rmi.Remote;

import javax.xml.rpc.ServiceException;

import org.apache.axis.client.Service;
import org.apache.axis.client.Stub;

import com.ai.appframe2.complex.cache.CacheFactory;
import com.asiainfo.appframe.ext.exeframe.ws.client.cache.WsClientCacheImpl;
import com.asiainfo.appframe.ext.exeframe.ws.query.impl.po.CfgWsClient;

public class SfServerSVImplServiceLocator extends Service implements SfServerSVImplService {

	private static final long serialVersionUID = -9035293164334875127L;

	public SfServerSVImplServiceLocator() {
	}

	public String getSF4CRMAddress() {
		try {
			CfgWsClient objCfgWsClient = (CfgWsClient) CacheFactory
					.get(WsClientCacheImpl.class, "C^" + "SF4CRMService");
			return objCfgWsClient.getUrlAddress();
		} catch (Exception e) {
			return null;
		}
	}

	// The WSDD service name defaults to the port name.
	private String SF4CRMWSDDServiceName = "SF4CRM";

	public String getSF4CRMWSDDServiceName() {
		return SF4CRMWSDDServiceName;
	}

	public SfAutoService getSF4CRM() throws ServiceException {
		java.net.URL endpoint;
		try {
			endpoint = new java.net.URL(getSF4CRMAddress());
		} catch (java.net.MalformedURLException e) {
			throw new ServiceException(e);
		}
		return getSF4CRM(endpoint);
	}

	public SfAutoService getSF4CRM(java.net.URL portAddress) throws ServiceException {
		try {
			SfAutoStub _stub = new SfAutoStub(portAddress, this);
			_stub.setPortName(getSF4CRMWSDDServiceName());
			return _stub;
		} catch (org.apache.axis.AxisFault e) {
			return null;
		}
	}

	/**
	 * For the given interface, get the stub implementation. If this service has
	 * no port for the given interface, then ServiceException is thrown.
	 */
	public Remote getPort(Class serviceEndpointInterface) throws ServiceException {
		try {
			if (SfAutoService.class.isAssignableFrom(serviceEndpointInterface)) {
				SfAutoStub _stub = new SfAutoStub(new java.net.URL(getSF4CRMAddress()), this);
				_stub.setPortName(getSF4CRMWSDDServiceName());
				return _stub;
			}
		} catch (Exception t) {
			throw new ServiceException(t);
		}
		throw new ServiceException("There is no stub implementation for the interface:  "
				+ (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
	}

	/**
	 * For the given interface, get the stub implementation. If this service has
	 * no port for the given interface, then ServiceException is thrown.
	 */
	public Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws ServiceException {
		if (portName == null) {
			return getPort(serviceEndpointInterface);
		}
		String inputPortName = portName.getLocalPart();
		if ("SF4CRM".equals(inputPortName)) {
			return getSF4CRM();
		} else {
			Remote _stub = getPort(serviceEndpointInterface);
			((Stub) _stub).setPortName(portName);
			return _stub;
		}
	}

}
