/**
 * TeradataService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.campaign;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.Remote;
import java.util.HashSet;
import java.util.Iterator;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;

import org.apache.axis.AxisFault;
import org.apache.axis.EngineConfiguration;
import org.apache.axis.client.Service;

import com.ai.appframe2.complex.cache.CacheFactory;
import com.asiainfo.appframe.ext.exeframe.ws.client.cache.WsClientCacheImpl;
import com.asiainfo.appframe.ext.exeframe.ws.query.impl.po.CfgWsClient;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class TeradataService_ServiceLocator extends Service implements
		TeradataService_Service {
	
	private static transient Log log = LogFactory.getLog(TeradataService_ServiceLocator.class);

	public TeradataService_ServiceLocator() {
	}

	public TeradataService_ServiceLocator(EngineConfiguration config) {
		super(config);
	}

	public TeradataService_ServiceLocator(String wsdlLoc, QName sName)
			throws ServiceException {
		super(wsdlLoc, sName);
	}

	// Use to get a proxy class for TeradataService
	private String TeradataService_address = "";

	public String getTeradataServiceAddress() {
		return TeradataService_address;
	}

	// The WSDD service name defaults to the port name.
	private String TeradataServiceWSDDServiceName = "TeradataService";

	public String getTeradataServiceWSDDServiceName() {
		return TeradataServiceWSDDServiceName;
	}

	public void setTeradataServiceWSDDServiceName(String name) {
		TeradataServiceWSDDServiceName = name;
	}

	public TeradataPortType getTeradataService() throws ServiceException {
		URL endpoint;
		try {
			CfgWsClient objCfgWsClient = (CfgWsClient)CacheFactory.get(WsClientCacheImpl.class, "C^" + "CRM_TeradataService_URL");
            endpoint = new java.net.URL(objCfgWsClient.getUrlAddress());
		} catch (Exception e) {
			throw new ServiceException(e);
		}
		return getTeradataService(endpoint);
	}

	public TeradataPortType getTeradataService(URL portAddress)
			throws ServiceException {
		try {
			TeradataSoapBindingStub _stub = new TeradataSoapBindingStub(
					portAddress, this);
			_stub.setPortName(getTeradataServiceWSDDServiceName());
			return _stub;
		} catch (AxisFault e) {
			if(log.isDebugEnabled()){
				log.debug("" ,e );
			}
			return null;
		}
	}

	public void setTeradataServiceEndpointAddress(String address) {
		TeradataService_address = address;
	}

	/**
	 * For the given interface, get the stub implementation. If this service has
	 * no port for the given interface, then ServiceException is thrown.
	 */
	public Remote getPort(Class serviceEndpointInterface)
			throws ServiceException {
		try {
			if (TeradataPortType.class
					.isAssignableFrom(serviceEndpointInterface)) {
				TeradataSoapBindingStub _stub = new TeradataSoapBindingStub(
						new URL(TeradataService_address), this);
				_stub.setPortName(getTeradataServiceWSDDServiceName());
				return _stub;
			}
		} catch (Exception t) {
			throw new ServiceException(t);
		}
		throw new ServiceException(
				"There is no stub implementation for the interface:  "
						+ (serviceEndpointInterface == null ? "null"
								: serviceEndpointInterface.getName()));
	}

	/**
	 * For the given interface, get the stub implementation. If this service has
	 * no port for the given interface, then ServiceException is thrown.
	 */
	public Remote getPort(QName portName, Class serviceEndpointInterface)
			throws ServiceException {
		if (portName == null) {
			return getPort(serviceEndpointInterface);
		}
		String inputPortName = portName.getLocalPart();
		if ("TeradataService".equals(inputPortName)) {
			return getTeradataService();
		} else {
			java.rmi.Remote _stub = getPort(serviceEndpointInterface);
			((org.apache.axis.client.Stub) _stub).setPortName(portName);
			return _stub;
		}
	}

	public QName getServiceName() {
		return new QName("http://soa.ailk.telenor.com/wsdl/soa/",
				"TeradataService");
	}

	private HashSet ports = null;

	public Iterator getPorts() {
		if (ports == null) {
			ports = new HashSet();
			ports.add(new QName("http://soa.ailk.telenor.com/wsdl/soa/",
					"TeradataService"));
		}
		return ports.iterator();
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(String portName, String address)
			throws ServiceException {

		if ("TeradataService".equals(portName)) {
			setTeradataServiceEndpointAddress(address);
		} else { // Unknown Port Name
			throw new ServiceException(
					" Cannot set Endpoint Address for Unknown Port" + portName);
		}
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(QName portName, String address)
			throws ServiceException {
		setEndpointAddress(portName.getLocalPart(), address);
	}

}
