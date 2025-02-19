package com.asiainfo.crm.inter.exe.webservice.client.cpa;

import java.net.URL;
import java.sql.Timestamp;
import java.util.Enumeration;
import java.util.Vector;

import javax.xml.namespace.QName;

import org.apache.axis.AxisFault;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.client.Stub;
import org.apache.axis.constants.Style;
import org.apache.axis.constants.Use;
import org.apache.axis.description.OperationDesc;
import org.apache.axis.description.ParameterDesc;
import org.apache.axis.encoding.DeserializerFactory;
import org.apache.axis.encoding.SerializerFactory;
import org.apache.axis.encoding.ser.BeanDeserializerFactory;
import org.apache.axis.encoding.ser.BeanSerializerFactory;
import org.apache.axis.utils.JavaUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.inter.exe.webservice.client.cpa.bo.BOCpaUserBean;
import com.asiainfo.crm.inter.exe.webservice.client.cpa.service.interfaces.ICpaServiceSV;

public class CPAFileInterfacePortBindingStub extends Stub implements CPAFileInterface {
	
	private transient static Log log = LogFactory.getLog(CPAFileInterfacePortBindingStub.class);
	
	private Vector cachedSerClasses = new Vector();
	private Vector cachedSerQNames = new Vector();
	private Vector cachedSerFactories = new Vector();
	private Vector cachedDeserFactories = new Vector();

	static OperationDesc[] _operations;

	static {
		_operations = new OperationDesc[1];
		_initOperationDesc1();
	}

	private static void _initOperationDesc1() {
		OperationDesc oper;
		ParameterDesc param;
		oper = new OperationDesc();
		oper.setName("syncIncrementalSubscriberInfo");
		param = new ParameterDesc(new QName("http://soa.ailk.telenor.com/wsdl/soa",
				"syncIncrementalSubscriberInfoRequest"), ParameterDesc.IN, new QName(
				"http://soa.ailk.telenor.com/wsdl/busi", "syncIncrementalSubscriberInfoRequest"),
				SyncIncrementalSubscriberInfoRequest.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new QName("http://soa.ailk.telenor.com/wsdl/busi", "syncIncrementalSubscriberInfoResponse"));
		oper.setReturnClass(SyncIncrementalSubscriberInfoResponse.class);
		oper.setReturnQName(new QName("http://soa.ailk.telenor.com/wsdl/soa", "syncIncrementalSubscriberInfoResponse"));
		oper.setStyle(Style.DOCUMENT);
		oper.setUse(Use.LITERAL);
		_operations[0] = oper;

	}

	public CPAFileInterfacePortBindingStub() throws AxisFault {
		this(null);
	}

	public CPAFileInterfacePortBindingStub(URL endpointURL, Service service) throws AxisFault {
		this(service);
		super.cachedEndpoint = endpointURL;
	}

	public CPAFileInterfacePortBindingStub(Service service) throws AxisFault {
		if (service == null) {
			super.service = new Service();
		} else {
			super.service = service;
		}
		((Service) super.service).setTypeMappingVersion("1.2");
		Class cls;
		QName qName;
		Class beansf = BeanSerializerFactory.class;
		Class beandf = BeanDeserializerFactory.class;
		qName = new QName("http://soa.ailk.telenor.com/wsdl/busi", "syncIncrementalSubscriberInfoRequest");
		cachedSerQNames.add(qName);
		cls = SyncIncrementalSubscriberInfoRequest.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://soa.ailk.telenor.com/wsdl/busi", "syncIncrementalSubscriberInfoRequestBody");
		cachedSerQNames.add(qName);
		cls = SyncIncrementalSubscriberInfoRequestBody.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://soa.ailk.telenor.com/wsdl/busi", "syncIncrementalSubscriberInfoResponse");
		cachedSerQNames.add(qName);
		cls = SyncIncrementalSubscriberInfoResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://soa.ailk.telenor.com/wsdl/busi", "syncIncrementalSubscriberInfoResponseBody");
		cachedSerQNames.add(qName);
		cls = SyncIncrementalSubscriberInfoResponseBody.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

	}

	protected Call createCall() throws java.rmi.RemoteException {
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
			Enumeration keys = super.cachedProperties.keys();
			while (keys.hasMoreElements()) {
				String key = (String) keys.nextElement();
				_call.setProperty(key, super.cachedProperties.get(key));
			}
			// All the type mapping information is registered
			// when the first call is made.
			// The type mapping information is actually registered in
			// the TypeMappingRegistry of the service, which
			// is the reason why registration is only needed for the first call.
			synchronized (this) {
				if (firstCall()) {
					// must set encoding style before registering serializers
					_call.setEncodingStyle(null);
					for (int i = 0; i < cachedSerFactories.size(); ++i) {
						Class cls = (Class) cachedSerClasses.get(i);
						QName qName = (QName) cachedSerQNames.get(i);
						Object x = cachedSerFactories.get(i);
						if (x instanceof Class) {
							Class sf = (Class) cachedSerFactories.get(i);
							Class df = (Class) cachedDeserFactories.get(i);
							_call.registerTypeMapping(cls, qName, sf, df, false);
						} else if (x instanceof SerializerFactory) {
							SerializerFactory sf = (SerializerFactory) cachedSerFactories.get(i);
							DeserializerFactory df = (DeserializerFactory) cachedDeserFactories.get(i);
							_call.registerTypeMapping(cls, qName, sf, df, false);
						}
					}
				}
			}
			return _call;
		} catch (Exception _t) {
			throw new AxisFault("Failure trying to get the Call object", _t);
		}
	}

	public SyncIncrementalSubscriberInfoResponse syncIncrementalSubscriberInfo(
			SyncIncrementalSubscriberInfoRequest parameters) throws java.rmi.RemoteException {
		SyncIncrementalSubscriberInfoResponse resp = null;
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		Call _call = createCall();
		_call.setOperation(_operations[0]);
		_call.setEncodingStyle(null);
		_call.setProperty(Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new QName("", "syncIncrementalSubscriberInfo"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			Object _resp = _call.invoke(new Object[] { parameters });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					resp = (SyncIncrementalSubscriberInfoResponse) _resp;
					return resp;
				} catch (Exception _exception) {
					resp = (SyncIncrementalSubscriberInfoResponse) JavaUtils.convert(_resp,
							SyncIncrementalSubscriberInfoResponse.class);
					return resp;
				}
			}
		} catch (AxisFault axisFaultException) {
			throw axisFaultException;
		} finally {
			SyncIncrementalSubscriberInfoRequestBody requestBody = parameters.getRequestBody();
			if (requestBody != null) {
				try {
					ICpaServiceSV cpaServiceSV = (ICpaServiceSV) ServiceFactory.getService(ICpaServiceSV.class);
					Timestamp timestamp = cpaServiceSV.getCpaUserSysDate();
					BOCpaUserBean bean = new BOCpaUserBean();
					bean.setCpaUserSeq(cpaServiceSV.getCpaUserNewId());
					bean.setCreateDate(timestamp);
					bean.setStateDate(timestamp);
					bean.setState("U");
					bean.setSubcriberNo(requestBody.getSubcriberNo());
					bean.setCustomerId(String.valueOf(requestBody.getCustomerId()));
					bean.setSubscriberId(String.valueOf(requestBody.getSubscriberId()));
					bean.setSubStatus(requestBody.getSubStatus());
					bean.setImsi(requestBody.getIMSI());
					bean.setBan(String.valueOf(requestBody.getBAN()));
					bean.setCustomerSegment(requestBody.getCustomerSegment());
					bean.setTenantId(String.valueOf(requestBody.getTenantId()));
					bean.setSubscriberCompany(requestBody.getSubscriberCompany());
					bean.setTestSimFlag(requestBody.getTestSimFlag());
					bean.setMvnoBrand(requestBody.getMVNOBrand());
					bean.setEquipmentNo(requestBody.getEquipmentNo());
					bean.setCycleType(String.valueOf(requestBody.getCycleType()));
					bean.setCycleUnit(String.valueOf(requestBody.getCycleUnit()));
					bean.setFirstBillDate(String.valueOf(requestBody.getFirstBilldate()));
					bean.setOriginalInitDate(new Timestamp(requestBody.getOriginalInitDate().getTimeInMillis()));
					bean.setProducts(requestBody.getProducts());
					bean.setSuspensionReasonCode(requestBody.getSuspensionReasonCode());
					bean.setDmlAction(requestBody.getDmlAction());

					cpaServiceSV.saveCpaUser(bean);
				} catch (Exception e) {
					log.error("CPA UserInfo Save Fail", e);
				}
			}
		}
	}

}
