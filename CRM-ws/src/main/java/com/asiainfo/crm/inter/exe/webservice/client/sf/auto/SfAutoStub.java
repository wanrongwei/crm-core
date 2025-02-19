/**
 * SF4CRMSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.sf.auto;

import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.namespace.QName;

import org.apache.axis.AxisEngine;
import org.apache.axis.AxisFault;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.client.Stub;
import org.apache.axis.constants.Style;
import org.apache.axis.constants.Use;
import org.apache.axis.description.OperationDesc;
import org.apache.axis.description.ParameterDesc;
import org.apache.axis.soap.SOAPConstants;
import org.apache.axis.utils.JavaUtils;

public class SfAutoStub extends Stub implements SfAutoService {

	static OperationDesc[] _operations;

	static {
		_operations = new OperationDesc[2];
		_initOperationDesc1();
	}

	private static void _initOperationDesc1() {
		OperationDesc oper;
		ParameterDesc param;

		oper = new OperationDesc();
		oper.setName("queryCoListCount");
		param = new ParameterDesc(new QName("", "districtID"), ParameterDesc.IN, new QName(
				"http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
		oper.addParameter(param);
		param = new ParameterDesc(new QName("", "coName"), ParameterDesc.IN, new QName(
				"http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
		oper.addParameter(param);
		param = new ParameterDesc(new QName("", "longName"), ParameterDesc.IN, new QName(
				"http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new QName("http://www.w3.org/2001/XMLSchema", "int"));
		oper.setReturnClass(int.class);
		oper.setReturnQName(new QName("", "queryCoListCountReturn"));
		oper.setStyle(Style.RPC);
		oper.setUse(Use.LITERAL);
		_operations[0] = oper;

		oper = new OperationDesc();
		oper.setName("queryCoList");
		param = new ParameterDesc(new QName("", "districtID"), ParameterDesc.IN, new QName(
				"http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
		oper.addParameter(param);
		param = new ParameterDesc(new QName("", "coName"), ParameterDesc.IN, new QName(
				"http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
		oper.addParameter(param);
		param = new ParameterDesc(new QName("", "longName"), ParameterDesc.IN, new QName(
				"http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
		oper.addParameter(param);
		param = new ParameterDesc(new QName("", "startIndex"), ParameterDesc.IN, new QName(
				"http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
		oper.addParameter(param);
		param = new ParameterDesc(new QName("", "endIndex"), ParameterDesc.IN, new QName(
				"http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(String.class);
		oper.setReturnQName(new QName("", "queryCoListReturn"));
		oper.setStyle(Style.RPC);
		oper.setUse(Use.LITERAL);
		_operations[1] = oper;

	}

	public SfAutoStub() throws AxisFault {
		this(null);
	}

	public SfAutoStub(URL endpointURL, Service service) throws AxisFault {
		this(service);
		super.cachedEndpoint = endpointURL;
	}

	public SfAutoStub(Service service) throws AxisFault {
		if (service == null) {
			super.service = new Service();
		} else {
			super.service = service;
		}
		((Service) super.service).setTypeMappingVersion("1.2");
	}

	protected Call createCall() throws RemoteException {
		try {
			Call _call = super._createCall();
			if (super.maintainSessionSet) {
				_call.setMaintainSession(super.maintainSession);
			}
			if (super.cachedUsername != null) {
				_call.setUsername(super.cachedUsername);
			}
			if (super.cachedPassword != null) {
				_call.setPassword(super.cachedPassword);
			}
			if (super.cachedEndpoint != null) {
				_call.setTargetEndpointAddress(super.cachedEndpoint);
			}
			if (super.cachedTimeout != null) {
				_call.setTimeout(super.cachedTimeout);
			}
			if (super.cachedPortName != null) {
				_call.setPortName(super.cachedPortName);
			}
			java.util.Enumeration keys = super.cachedProperties.keys();
			while (keys.hasMoreElements()) {
				String key = (String) keys.nextElement();
				_call.setProperty(key, super.cachedProperties.get(key));
			}
			return _call;
		} catch (Exception _t) {
			throw new AxisFault("Failure trying to get the Call object", _t);
		}
	}

	@Override
	public int queryCoListCount(String districtID, String coName, String longName) throws RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		Call _call = createCall();
		_call.setOperation(_operations[0]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setEncodingStyle(null);
		_call.setProperty(Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new QName("http://impl.service.crm.sys.inter.sf.tn.oss.ai.com", "queryCoListCount"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			Object _resp = _call.invoke(new Object[] { districtID, coName, longName });

			if (_resp instanceof RemoteException) {
				throw (RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return ((Integer) _resp).intValue();
				} catch (Exception _exception) {
					return ((Integer) JavaUtils.convert(_resp, int.class)).intValue();
				}
			}
		} catch (AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	@Override
	public String queryCoList(String districtID, String coName, String longName, int startIndex, int endIndex)
			throws RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		Call _call = createCall();
		_call.setOperation(_operations[1]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setEncodingStyle(null);
		_call.setProperty(Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new QName("http://impl.service.crm.sys.inter.sf.tn.oss.ai.com", "queryCoList"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			Object _resp = _call.invoke(new Object[] { districtID, coName, longName, new Integer(startIndex),
					new Integer(endIndex) });

			if (_resp instanceof RemoteException) {
				throw (RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (String) _resp;
				} catch (Exception _exception) {
					return (String) JavaUtils.convert(_resp, String.class);
				}
			}
		} catch (AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

}
