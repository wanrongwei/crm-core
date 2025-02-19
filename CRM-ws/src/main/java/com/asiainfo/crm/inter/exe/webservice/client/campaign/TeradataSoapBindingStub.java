/**
 * TeradataSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.campaign;

import java.math.BigDecimal;
import java.net.URL;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import javax.xml.namespace.QName;
import javax.xml.rpc.Service;
import javax.xml.rpc.encoding.SerializerFactory;

import org.apache.axis.AxisEngine;
import org.apache.axis.AxisFault;
import org.apache.axis.NoEndPointException;
import org.apache.axis.client.Call;
import org.apache.axis.client.Stub;
import org.apache.axis.constants.Style;
import org.apache.axis.constants.Use;
import org.apache.axis.description.OperationDesc;
import org.apache.axis.description.ParameterDesc;
import org.apache.axis.encoding.ser.ArrayDeserializerFactory;
import org.apache.axis.encoding.ser.ArraySerializerFactory;
import org.apache.axis.encoding.ser.BeanDeserializerFactory;
import org.apache.axis.encoding.ser.BeanSerializerFactory;
import org.apache.axis.soap.SOAPConstants;
import org.apache.axis.utils.JavaUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.common.DataType;
import com.ai.appframe2.common.SessionManager;
import com.ai.appframe2.complex.cache.CacheFactory;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.asiainfo.appframe.ext.exeframe.ws.client.cache.WsClientCacheImpl;
import com.asiainfo.appframe.ext.exeframe.ws.query.impl.po.CfgWsClient;
import com.asiainfo.crm.util.CommonUtil;

public class TeradataSoapBindingStub extends Stub implements TeradataPortType {
	private Vector cachedSerClasses = new Vector();
	private Vector cachedSerQNames = new Vector();
	private Vector cachedSerFactories = new Vector();
	private Vector cachedDeserFactories = new Vector();

	private static Log log = LogFactory.getLog(TeradataSoapBindingStub.class);

	static OperationDesc[] _operations;

	static {
		_operations = new OperationDesc[3];
		_initOperationDesc1();
	}

	private static void _initOperationDesc1() {
		OperationDesc oper;
		ParameterDesc param;
		oper = new OperationDesc();
		oper.setName("postSubscriberEvent");
		param = new ParameterDesc(new QName(
				"http://soa.ailk.telenor.com/wsdl/soa/", "RequestHeader"),
				ParameterDesc.IN, new QName(
						"http://soa.ailk.telenor.com/schema/soa/common",
						"RequestHeader"), RequestHeader.class, true, false);
		oper.addParameter(param);
		param = new ParameterDesc(new QName(
				"http://soa.ailk.telenor.com/wsdl/soa/",
				"postSubEventRequestBody"), ParameterDesc.IN, new QName(
				"http://soa.ailk.telenor.com/schema/soa/Campaign/",
				"postSubEventRequestBody"), PostSubEventRequestBody.class,
				false, false);
		oper.addParameter(param);
		oper.setReturnType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/Campaign/",
				"postSubscriberEventResponse"));
		oper.setReturnClass(PostSubscriberEventResponse.class);
		oper.setReturnQName(new QName("http://soa.ailk.telenor.com/wsdl/soa/",
				"postSubscriberEventResponse"));
		oper.setStyle(Style.DOCUMENT);
		oper.setUse(Use.LITERAL);
		_operations[0] = oper;

		oper = new OperationDesc();
		oper.setName("CreatePromotionTask");
		param = new ParameterDesc(new QName(
				"http://soa.ailk.telenor.com/wsdl/soa/", "RequestHeader"),
				ParameterDesc.IN, new QName(
						"http://soa.ailk.telenor.com/schema/soa/common",
						"RequestHeader"), RequestHeader.class, true, false);
		oper.addParameter(param);
		param = new ParameterDesc(new javax.xml.namespace.QName(
				"http://soa.ailk.telenor.com/wsdl/soa/",
				"CreatePromotionTaskRequest"), ParameterDesc.IN, new QName(
				"http://soa.ailk.telenor.com/schema/soa/Campaign/",
				"CreatePromotionTaskRequest"),
				CreatePromotionTaskRequest.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/Campaign/",
				"CreatePromotionTaskResponse"));
		oper.setReturnClass(CreatePromotionTaskResponse.class);
		oper.setReturnQName(new QName("http://soa.ailk.telenor.com/wsdl/soa/",
				"CreatePromotionTaskResponse"));
		oper.setStyle(Style.DOCUMENT);
		oper.setUse(Use.LITERAL);
		_operations[1] = oper;

		oper = new OperationDesc();
		oper.setName("QueryPublishedCampaigns");
		param = new ParameterDesc(new QName(
				"http://soa.ailk.telenor.com/wsdl/soa/", "RequestHeader"),
				ParameterDesc.IN, new QName(
						"http://soa.ailk.telenor.com/schema/soa/common",
						"RequestHeader"), RequestHeader.class, true, false);
		oper.addParameter(param);
		param = new ParameterDesc(new QName(
				"http://soa.ailk.telenor.com/wsdl/soa/",
				"QueryPublishedCampaignsRequestBody"), ParameterDesc.IN,
				new QName("http://soa.ailk.telenor.com/schema/soa/Campaign/",
						"QueryPublishedCampaignsRequestBody"),
				QueryPublishedCampaignsRequestBody.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/Campaign/",
				"QueryPublishedCampaignsResponse"));
		oper.setReturnClass(QueryPublishedCampaignsResponse.class);
		oper.setReturnQName(new QName("http://soa.ailk.telenor.com/wsdl/soa/",
				"QueryPublishedCampaignsResponse"));
		oper.setStyle(Style.DOCUMENT);
		oper.setUse(Use.LITERAL);
		_operations[2] = oper;

	}

	public TeradataSoapBindingStub() throws AxisFault {
		this(null);
	}

	public TeradataSoapBindingStub(URL endpointURL, Service service)
			throws AxisFault {
		this(service);
		super.cachedEndpoint = endpointURL;
	}

	public TeradataSoapBindingStub(Service service) throws AxisFault {
		if (service == null) {
			super.service = new org.apache.axis.client.Service();
		} else {
			super.service = service;
		}
		((org.apache.axis.client.Service) super.service)
				.setTypeMappingVersion("1.2");
		Class cls;
		QName qName;
		QName qName2;
		Class beansf = BeanSerializerFactory.class;
		Class beandf = BeanDeserializerFactory.class;
//		Class enumsf = EnumSerializerFactory.class;
//		Class enumdf = EnumDeserializerFactory.class;
//		Class arraysf = ArraySerializerFactory.class;
//		Class arraydf = ArrayDeserializerFactory.class;
//		Class simplesf = SimpleSerializerFactory.class;
//		Class simpledf = SimpleDeserializerFactory.class;
//		Class simplelistsf = SimpleListSerializerFactory.class;
//		Class simplelistdf = SimpleListDeserializerFactory.class;
		qName = new QName("http://soa.ailk.telenor.com/schema/soa/Campaign/",
				"CreatePromotionTaskRequest");
		cachedSerQNames.add(qName);
		cls = CreatePromotionTaskRequest.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://soa.ailk.telenor.com/schema/soa/Campaign/",
				"CreatePromotionTaskResponse");
		cachedSerQNames.add(qName);
		cls = CreatePromotionTaskResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://soa.ailk.telenor.com/schema/soa/Campaign/",
				"CreateProRequestBody");
		cachedSerQNames.add(qName);
		cls = CreateProRequestBody.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://soa.ailk.telenor.com/schema/soa/Campaign/",
				"CreateProResponseBody");
		cachedSerQNames.add(qName);
		cls = CreateProResponseBody.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://soa.ailk.telenor.com/schema/soa/Campaign/",
				"CurrentSubEvent");
		cachedSerQNames.add(qName);
		cls = CurrentSubEvent.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://soa.ailk.telenor.com/schema/soa/Campaign/",
				"CurrentSubEvents");
		cachedSerQNames.add(qName);
		cls = CurrentSubEvent[].class;
		cachedSerClasses.add(cls);
		qName = new QName("http://soa.ailk.telenor.com/schema/soa/Campaign/",
				"CurrentSubEvent");
		qName2 = new QName("", "CurrentSubEvent");
		cachedSerFactories.add(new ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new ArrayDeserializerFactory());

		qName = new QName("http://soa.ailk.telenor.com/schema/soa/Campaign/",
				"postSubEventRequestBody");
		cachedSerQNames.add(qName);
		cls = PostSubEventRequestBody.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://soa.ailk.telenor.com/schema/soa/Campaign/",
				"postSubscriberEventResponse");
		cachedSerQNames.add(qName);
		cls = PostSubscriberEventResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://soa.ailk.telenor.com/schema/soa/Campaign/",
				"QueryPublishedCampaignsRequestBody");
		cachedSerQNames.add(qName);
		cls = QueryPublishedCampaignsRequestBody.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://soa.ailk.telenor.com/schema/soa/Campaign/",
				"QueryPublishedCampaignsResponse");
		cachedSerQNames.add(qName);
		cls = QueryPublishedCampaignsResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://soa.ailk.telenor.com/schema/soa/Campaign/",
				"QueryPublishedCampaignsResponseBody");
		cachedSerQNames.add(qName);
		cls = QueryPublishedCampaignsResponseBody.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://soa.ailk.telenor.com/schema/soa/Campaign/",
				"ResponseHead");
		cachedSerQNames.add(qName);
		cls = ResponseHead.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://soa.ailk.telenor.com/schema/soa/Campaign/",
				"VwCurrentMessage");
		cachedSerQNames.add(qName);
		cls = VwCurrentMessage.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://soa.ailk.telenor.com/schema/soa/Campaign/",
				"VwCurrentMessages");
		cachedSerQNames.add(qName);
		cls = VwCurrentMessages.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new QName("http://soa.ailk.telenor.com/schema/soa/common",
				"RequestHeader");
		cachedSerQNames.add(qName);
		cls = RequestHeader.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

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
			Enumeration keys = super.cachedProperties.keys();
			while (keys.hasMoreElements()) {
				java.lang.String key = (java.lang.String) keys.nextElement();
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
							org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory) cachedSerFactories
									.get(i);
							org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory) cachedDeserFactories
									.get(i);
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

	public Map postSubscriberEvent(Map bodyMap)
			throws RemoteException {
		/*if (super.cachedEndpoint == null) {
			throw new NoEndPointException();
		}*/

		RequestHeader head = convertHead(setHeadMap());
		PostSubEventRequestBody body = null;

		try {
			body = convertBody(bodyMap);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			if (log.isErrorEnabled()) {
				log.error(e1);
			}
			e1.printStackTrace();
		}

		Call _call = createCall();
		_call.setOperation(_operations[0]);
		_call.setEncodingStyle(null);
		_call.setProperty(Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new QName("", "postSubscriberEvent"));

		CfgWsClient objCfgWsClient = null;
		try {
			objCfgWsClient = (CfgWsClient) CacheFactory.get(
					WsClientCacheImpl.class, "C^" + "CRM_TeradataService_URL");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			if (log.isErrorEnabled()) {
				log.error(e);
			}
			e.printStackTrace();
		}

		_call.setTargetEndpointAddress(objCfgWsClient.getUrlAddress());

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			Object _resp = _call.invoke(new Object[] { head, body });

			if (_resp instanceof RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					//return convertResponse(((PostSubscriberEventResponse) _resp)
							//.getResponseHead());
					PostSubscriberEventResponse response = (PostSubscriberEventResponse) _resp;
					return convertResponse(response.getResponseHead());
				} catch (Exception _exception) {
					if(log.isDebugEnabled()){
						log.debug("", _exception);
					}
					return null;
				}
			}
		} catch (AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	/**
	 * 
	 * @param headMap
	 * @return
	 */
	public RequestHeader convertHead(Map headMap) {
		RequestHeader head = new RequestHeader();
		
		if (DataType.getAsString(headMap.get("appKey")) != null) {
			head.setAppKey(DataType.getAsString(headMap.get("appKey")));
		}
		
		if (DataType.getAsString(headMap.get("acceptChannelType")) != null) {
			head.setAcceptChannelType(DataType.getAsString(headMap
					.get("acceptChannelType")));
		}

		if (DataType.getAsString(headMap.get("reqTime")) != null) {
			head.setReqTime(DataType.getAsString(headMap.get("reqTime")));
		}

		// 【10位发起方系统ID】＋【8位日期编码YYYYMMDD】＋【10位流水号】
		// 【10位发起方系统ID】这个指的是appkey
		if (DataType.getAsString(headMap.get("transactionID")) != null) {
			head.setTransactionID(DataType.getAsString(headMap
					.get("transactionID")));
		}

		if (DataType.getAsString(headMap.get("tenantId")) != null) {
			head.setTenantId(DataType.getAsString(headMap.get("tenantId")));
		}else{
			head.setTenantId("");
		}

		if (DataType.getAsString(headMap.get("acceptStaffId")) != null) {
			head.setAcceptStaffId(DataType.getAsString(headMap.get("acceptStaffId")));
		}else{
			head.setAcceptStaffId("");
		}
		
		if (DataType.getAsString(headMap.get("acceptOpId")) != null) {
			head.setAcceptOpId(DataType.getAsString(headMap.get("acceptOpId")));
		}
		
		if (DataType.getAsString(headMap.get("version")) != null) {
			head.setVersion(DataType.getAsString(headMap.get("version")));
		}
		return head;

	}

	/**
	 * 
	 * @param bodyMap
	 * @return
	 * @throws Exception
	 */
	public PostSubEventRequestBody convertBody(Map bodyMap) throws Exception {

		CurrentSubEvent subEvent = new CurrentSubEvent();

		if (StringUtils.isNotBlank(DataType.getAsString(bodyMap.get("EventCd")))) {
			subEvent.setEventCd(DataType.getAsString(bodyMap.get("EventCd")));
		}

		if (StringUtils.isNotBlank(DataType.getAsString(bodyMap.get("EventDttm")))) {
			subEvent.setEventDttm(DataType.getAsString(bodyMap.get("EventDttm")));
		}

		if (StringUtils.isNotBlank(DataType.getAsString(bodyMap.get("EventValueAmt")))){

			subEvent.setEventValueAmt(new BigDecimal(DataType
					.getAsString(bodyMap.get("EventValueAmt"))));
		}

		if (StringUtils.isNotBlank(DataType.getAsString(bodyMap.get("SubscriberId")))) {
			subEvent.setSubscriberId(DataType.getAsString(bodyMap
					.get("SubscriberId")));
		}

		return new PostSubEventRequestBody(new CurrentSubEvent[] { subEvent });

	}

	public Map convertResponse(ResponseHead responseHead) {
		Map map = new HashMap();
		if (responseHead.getAcceptChannelCode() != null) {
			map.put("acceptChannelCode", responseHead.getAcceptChannelCode());
		}
		if (responseHead.getAcceptChannelType() != null) {
			map.put("acceptChannelType", responseHead.getAcceptChannelType());
		}

		if (responseHead.getAppKey() != null) {
			map.put("appKey", responseHead.getAppKey());
		}

		if (responseHead.getReqTime() != null) {
			map.put("reqTime", responseHead.getReqTime());
		}

		if (responseHead.getSign() != null) {
			map.put("sign", responseHead.getSign());
		}

		if (responseHead.getTenantId() != null) {
			map.put("tenantId", responseHead.getTenantId());
		}

		if (responseHead.getTransactionID() != null) {
			map.put("transactionID", responseHead.getTransactionID());
		}

		return map;
	}

	public CreatePromotionTaskResponse createPromotionTask(
			RequestHeader requestHeader, CreatePromotionTaskRequest parameters)
			throws RemoteException {
		if (super.cachedEndpoint == null) {
			throw new NoEndPointException();
		}
		Call _call = createCall();
		_call.setOperation(_operations[1]);
		_call.setEncodingStyle(null);
		_call.setProperty(Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new QName("", "CreatePromotionTask"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			Object _resp = _call.invoke(new Object[] { requestHeader,
					parameters });

			if (_resp instanceof RemoteException) {
				throw (RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (CreatePromotionTaskResponse) _resp;
				} catch (Exception _exception) {
					if(log.isDebugEnabled()){
						log.debug("", _exception);
					}
					return (CreatePromotionTaskResponse) JavaUtils.convert(
							_resp, CreatePromotionTaskResponse.class);
				}
			}
		} catch (AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public QueryPublishedCampaignsResponse queryPublishedCampaigns(
			RequestHeader requestHeader,
			QueryPublishedCampaignsRequestBody parameters)
			throws RemoteException {
		if (super.cachedEndpoint == null) {
			throw new NoEndPointException();
		}
		Call _call = createCall();
		_call.setOperation(_operations[2]);
		_call.setEncodingStyle(null);
		_call.setProperty(Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new QName("", "QueryPublishedCampaigns"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			Object _resp = _call.invoke(new Object[] { requestHeader,
					parameters });

			if (_resp instanceof RemoteException) {
				throw (RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (QueryPublishedCampaignsResponse) _resp;
				} catch (Exception _exception) {
					if(log.isDebugEnabled()){
						log.debug("", _exception);
					}
					return (QueryPublishedCampaignsResponse) JavaUtils.convert(
							_resp, QueryPublishedCampaignsResponse.class);
				}
			}
		} catch (AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}
	
	public  Map setHeadMap(){
		
		Map headMap = new HashMap();
		String appKey = "8000000001";
 		String date8 = new SimpleDateFormat("yyyyMMdd").format(new Date());
		String date10=CommonUtil.getTransactionNum(1999999999, 10);
 		String transactionID = appKey+date8+date10;
 		String ReqTime=new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
 		String staffId=null;
 		String tenantId=null;
 		UserInfoInterface user = SessionManager.getUser();
		if(null!=user){
			tenantId=user.getTenantId();
			staffId=user.get("STAFF_ID").toString();
		}
		headMap.put("appKey", appKey);
		headMap.put("acceptChannelType", "23");
		headMap.put("reqTime", ReqTime);
		headMap.put("version", "V1.0");
		headMap.put("transactionID", transactionID);
		headMap.put("tenantId", tenantId);
		headMap.put("acceptStaffId", staffId);
		headMap.put("acceptOpId", "1");
		return headMap;
		
	}

	public static void main(String[] args) {
		/*
		 * RequestHeader head = new RequestHeader();
		 * 
		 * head.setAcceptChannelCode("?"); head.setAcceptChannelType("?");
		 * head.setAppKey("8000920001"); head.setReqTime("20140721143815");
		 * head.setTransactionID("8000920001201312310000001131");
		 * head.setTenantId("TenantId"); head.setSign("password");
		 * head.setVersion("V1.0");
		 * 
		 * CurrentSubEvent subEvent = new CurrentSubEvent();
		 * subEvent.setEventCd("1000c2ppp6j1"); subEvent.setEventDttm(new
		 * Date(2014, 11, 16, 0, 0, 0)); subEvent.setEventValueAmt(new
		 * BigDecimal("1234.62")); subEvent.setSubscriberId("10072046062");
		 * 
		 * PostSubEventRequestBody body = new PostSubEventRequestBody( new
		 * CurrentSubEvent[] { subEvent });
		 * 
		 * try { TeradataSoapBindingStub stub = new TeradataSoapBindingStub( new
		 * URL( "" +
		 * "http://10.1.249.84:8011/TelenorEsb/ConsumerAccessServices/Campaign/ProxyServices/TeradataService?wsdl"
		 * ), new TeradataService_ServiceLocator());
		 * 
		 * PostSubscriberEventResponse response = stub.postSubscriberEvent(
		 * head, body);
		 * 
		 * System.out.println(response.getResponseHead()
		 * .getAcceptChannelCode()); } catch (AxisFault e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); } catch (Exception e)
		 * { // TODO Auto-generated catch block e.printStackTrace(); }
		 */
		/*Map headMap = new HashMap();

		headMap.put("acceptChannelCode", "?");
		headMap.put("acceptChannelType", "?");
		headMap.put("appKey", "8000920001");
		headMap.put("reqTime", "20140721143815");
		headMap.put("transactionID", "8000920001201312310000001131");
		headMap.put("tenantId", "TenantId");
		headMap.put("sign", "password");*/

		Map bodyMap = new HashMap();
		bodyMap.put("EventCd", "1000c2ppp6j1");
		bodyMap.put("EventDttm", "2014-11-16 17:45:40");

		bodyMap.put("EventValueAmt", "");
		bodyMap.put("SubscriberId", "10072046062");

		try {
			TeradataSoapBindingStub stub = new TeradataSoapBindingStub();
			Map retMap = stub.postSubscriberEvent( bodyMap);
            System.out.println(retMap);
//			System.out.println(retMap.get("appKey"));
		} catch (AxisFault e) {
			if(log.isDebugEnabled()){
				log.debug("", e);
			}
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			if(log.isDebugEnabled()){
				log.debug("", e);
			}
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
