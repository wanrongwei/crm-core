package com.asiainfo.crm.inter.exe.webservice.client.np;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import javax.xml.namespace.QName;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.client.Stub;
import org.apache.axis.description.OperationDesc;
import org.apache.axis.description.ParameterDesc;
import org.apache.axis.encoding.DeserializerFactory;
import org.apache.axis.encoding.SerializerFactory;
import org.apache.axis.encoding.ser.ArrayDeserializerFactory;
import org.apache.axis.encoding.ser.ArraySerializerFactory;
import org.apache.axis.encoding.ser.BeanDeserializerFactory;
import org.apache.axis.encoding.ser.BeanSerializerFactory;

import com.ai.appframe2.common.SessionManager;
import com.ai.appframe2.complex.cache.CacheFactory;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.asiainfo.appframe.ext.exeframe.ws.client.cache.WsClientCacheImpl;
import com.asiainfo.appframe.ext.exeframe.ws.query.impl.po.CfgWsClient;
import com.asiainfo.crm.util.BeanUtils;
import com.asiainfo.crm.util.CommonUtil;

public final class NPServiceClient extends Stub {

	private Vector cachedSerClasses = new Vector();
	private Vector cachedSerQNames = new Vector();
	private Vector cachedSerFactories = new Vector();
	private Vector cachedDeserFactories = new Vector();

	private QName qName;
	private QName qName2;
	private Class beansf = BeanSerializerFactory.class;
	private Class beandf = BeanDeserializerFactory.class;
	private Class clazz;

	private static Map map = new HashMap();
	
//	private  static Log log = LogFactory.getLog(NPServiceClient.class);

	static {
		map.put(CheckAgreementResponseBodyDataNode.class, ">>checkAgreementResponseBody>Data>Node");
		map.put(CheckAgreementResponseBodyDataOperatorConract.class,
				">>checkAgreementResponseBody>Data>OperatorConract");
		map.put(CheckAgreementRequest.class, ">checkAgreementRequest");
		map.put(CheckAgreementResponseBodyData.class, ">checkAgreementResponseBody>Data");
		map.put(CrmCancelRequest.class, ">crmCancelRequest");
		map.put(CrmNotifyPoaResultRequest.class, ">crmNotifyPoaResultRequest");
		map.put(CrmOrderFinishedRequest.class, ">crmOrderFinishedRequest");
		map.put(ModConfirmDateRequest.class, ">modConfirmDateRequest");
		map.put(NumberChangeRequestRequest.class, ">numberChangeRequestRequest");
		map.put(PortInRequestDKRequest.class, ">portInRequestDKRequest");
		map.put(PortInRequestHURequest.class, ">portInRequestHURequest");
		map.put(PortOutResponseRequest.class, ">portOutResponseRequest");
		map.put(RangeChangeRequestRequest.class, ">rangeChangeRequestRequest");
		map.put(ResaleRequestRequest.class, ">resaleRequestRequest");
		map.put(ResaleResponseRequest.class, ">resaleResponseRequest");
		map.put(ReturnNumberRequest.class, ">returnNumberRequest");
		map.put(CheckAgreementRequestBody.class, "checkAgreementRequestBody");
		map.put(CheckAgreementResponse.class, "checkAgreementResponse");
		map.put(CheckAgreementResponseBody.class, "checkAgreementResponseBody");
		map.put(PortOutResponse4WholesaleRequest.class, ">PortOutResponse4WholesaleRequest");
		map.put(PortOutResponse4WholesaleRequestBody.class, ">PortOutResponse4WholesaleRequestBody");
		map.put(CommonResponse.class, "CommonResponse");
		map.put(CrmCancelRequestBody.class, "crmCancelRequestBody");
		map.put(CrmNotifyPoaResultRequestBody.class, "crmNotifyPoaResultRequestBody");
		map.put(CrmOrderFinishedRequestBody.class, "crmOrderFinishedRequestBody");
		map.put(ModConfirmDateRequestBody.class, "modConfirmDateRequestBody");
		map.put(NumberChangeRequestRequestBody.class, "numberChangeRequestRequestBody");
		map.put(NumberSeries.class, "NumberSeries");
		map.put(PortInRequestDKRequestBody.class, "portInRequestDKRequestBody");
		map.put(PortInRequestHURequestBody.class, "portInRequestHURequestBody");
		map.put(PortOutResponseRequestBody.class, "portOutResponseRequestBody");
		map.put(RangeChangeRequestRequestBody.class, "rangeChangeRequestRequestBody");
		map.put(ResaleRequestRequestBody.class, "resaleRequestRequestBody");
		map.put(ResaleResponseRequestBody.class, "resaleResponseRequestBody");
		map.put(ResponseBody.class, "ResponseBody");
		map.put(ReturnNumberRequestBody.class, "returnNumberRequestBody");
		map.put(RequestHeader.class, "RequestHeader");
		map.put(ResponseHeader.class, "ResponseHeader");
		map.put(QrySpNpExportOrderInfoRequest.class, ">qrySpNpExportOrderInfoRequest");
		map.put(QrySpNpExportOrderInfoResponseBodyPortData.class, ">qrySpNpExportOrderInfoResponseBody>PortData");
		map.put(QrySpNpImportOrderInfoRequest.class, ">qrySpNpImportOrderInfoRequest");
		map.put(QrySpNpImportOrderInfoResponseBodyPortData.class, ">qrySpNpImportOrderInfoResponseBody>PortData");
		map.put(QrySpNpExportOrderInfoRequestBody.class, "qrySpNpExportOrderInfoRequestBody");
		map.put(QrySpNpExportOrderInfoResponse.class, "qrySpNpExportOrderInfoResponse");
		map.put(QrySpNpImportOrderInfoRequestBody.class, "qrySpNpImportOrderInfoRequestBody");
		map.put(QrySpNpImportOrderInfoResponse.class, "qrySpNpImportOrderInfoResponse");
		map.put(GetNumberInfoRequest.class, ">GetNumberInfoRequest");
		map.put(GetNumberInfoRequestBody.class, "GetNumberInfoRequestBody");
		map.put(GetNumberInfoResponse.class, ">GetNumberInfoResponse");
		map.put(GetNumberInfoResponseBody.class, "GetNumberInfoResponseBody");
		map.put(SyncOperatorInfoRequest.class, ">SyncOperatorInfoRequest");
		map.put(SyncOperatorInfoRequestBody.class, "SyncOperatorInfoRequestBody");
		map.put(SyncOperatorInfoResponse.class, ">SyncOperatorInfoResponse");
		map.put(SyncOperatorInfoResponseBody.class, "SyncOperatorInfoResponseBody");
		map.put(Operators.class, "Operators");
	}

	public NPServiceClient() throws Exception {
		this(null);
	}

	public NPServiceClient(Service service) throws Exception {
		if (service == null) {
			super.service = new Service();
		} else {
			super.service = service;
		}
		registerClasses();
		registerArray();
	}

	private void registerClasses() throws Exception {

		Set keys = map.keySet();
		for (Object key : keys) {

			String name = ((Class) key).getSimpleName();
			if (name.equals("ResponseHeader") || name.equals("RequestHeader")) {
				qName = new QName("http://soa.ailk.telenor.com/schema/soa/common", (String) map.get(key));
			} else {
				qName = new QName("http://soa.ailk.telenor.com/wsdl/soa", (String) map.get(key));
			}
			cachedSerQNames.add(qName);
			cachedSerClasses.add((Class) key);
			cachedSerFactories.add(beansf);
			cachedDeserFactories.add(beandf);
		}
	}
	
	private void registerArray() throws Exception {
		qName = new QName("http://soa.ailk.telenor.com/wsdl/soa", "qrySpNpExportOrderInfoResponseBody");
        cachedSerQNames.add(qName);
        clazz = QrySpNpExportOrderInfoResponseBodyPortData[].class;
        cachedSerClasses.add(clazz);
        qName = new QName("http://soa.ailk.telenor.com/wsdl/soa", ">qrySpNpExportOrderInfoResponseBody>PortData");
        qName2 = new QName("", "PortData");
        cachedSerFactories.add(new ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new ArrayDeserializerFactory());
        
        qName = new QName("http://soa.ailk.telenor.com/wsdl/soa", "qrySpNpImportOrderInfoResponseBody");
        cachedSerQNames.add(qName);
        clazz = QrySpNpImportOrderInfoResponseBodyPortData[].class;
        cachedSerClasses.add(clazz);
        qName = new QName("http://soa.ailk.telenor.com/wsdl/soa", ">qrySpNpImportOrderInfoResponseBody>PortData");
        qName2 = new QName("", "PortData");
        cachedSerFactories.add(new ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new ArrayDeserializerFactory());
	}

	public Call stepOne(String operation, Class req, Class rsp) throws Exception {
		OperationDesc oper = new OperationDesc();
		ParameterDesc param;
		String reqStr = operation + "Request";
		String rspStr = operation + "Response";
		String rspName = rsp.getSimpleName();
		String actionUrl = "http://www.telenor.org/NPService/" + operation;
		oper.setName(operation);
		param = new ParameterDesc(new QName("http://soa.ailk.telenor.com/wsdl/soa", "RequestHeader"),
				ParameterDesc.IN, new QName("http://soa.ailk.telenor.com/schema/soa/common", "RequestHeader"),
				RequestHeader.class, true, true);
		oper.addParameter(param);
		param = new ParameterDesc(new QName("http://soa.ailk.telenor.com/wsdl/soa", reqStr), ParameterDesc.IN,
				new QName("http://soa.ailk.telenor.com/wsdl/soa", ">" + reqStr), req, false, false);
		oper.addParameter(param);
		param = new ParameterDesc(new QName("http://soa.ailk.telenor.com/wsdl/soa", "ResponseHeader"),
				ParameterDesc.OUT, new QName("http://soa.ailk.telenor.com/schema/soa/common", "ResponseHeader"),
				ResponseHeader.class, true, true);
		oper.addParameter(param);
		param = new ParameterDesc(new QName("http://soa.ailk.telenor.com/wsdl/soa", rspStr), ParameterDesc.OUT,
				new QName("http://soa.ailk.telenor.com/wsdl/soa", rspName), rsp, false, false);
		oper.addParameter(param);
		oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		Call call = getCall(oper);
		call.setSOAPActionURI(actionUrl);
		call.setOperationName(new QName("", operation));
		return call;

	}
	public static Map setHeader() throws Exception {
		
		Map headers = new HashMap();
		UserInfoInterface user = SessionManager.getUser();
		String appKey="8000000001";
		String date8 = new SimpleDateFormat("yyyyMMdd").format(new Date());
		String date10=CommonUtil.getTransactionNum(1999999999, 10);
 		String transactionID = appKey+date8+date10;
		if(null!=user){
			 headers.put("TenantId",user.getTenantId());
			 headers.put("AcceptStaffId", user.get("STAFF_ID") == null ? "" : user.get("STAFF_ID").toString());
		}
	    headers.put("AppKey", appKey);
		headers.put("TransactionID",transactionID);
		headers.put("ReqTime", new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
		headers.put("Version", "0.1");
		headers.put("AcceptChannelType", "23");
	    return headers;
	}

	public Map portInRequestDK(Map params) throws Exception {

		Call call = null;
		String msg = "portInRequestDK";
		Class clazz = PortInRequestDKRequest.class;
		Class rspClazz = CommonResponse.class;
		call = stepOne(msg, clazz, rspClazz);
		Map headers = setHeader();
		Object header = BeanUtils.setProperties(RequestHeader.class, headers);

		PortInRequestDKRequest req = new PortInRequestDKRequest();

		Object body = BeanUtils.setProperties(PortInRequestDKRequestBody.class, params);
		req.setRequestBody((PortInRequestDKRequestBody) body);

		call.invoke(new Object[] { header, req });
		Map retMap = call.getOutputParams();
		Map outMap = new HashMap();
		Set keys = retMap.keySet();
		for (Object key : keys) {
			Object response = retMap.get(key);
			if (response instanceof ResponseHeader) {
				outMap = BeanUtils.getProperties(response);
			}
		}
		return outMap;
	}

	public Map portOutResponse(Map params) throws Exception {

		Call call = null;
		String msg = "portOutResponse";
		Class clazz = PortOutResponseRequest.class;
		Class rspClazz = CommonResponse.class;
		call = stepOne(msg, clazz, rspClazz);
		Map headers = setHeader();
		Object header = BeanUtils.setProperties(RequestHeader.class, headers);

		PortOutResponseRequest req = new PortOutResponseRequest();

		Object body = BeanUtils.setProperties(PortOutResponseRequestBody.class, params);
		req.setRequestBody((PortOutResponseRequestBody) body);

		call.invoke(new Object[] { header, req });
		Map retMap = call.getOutputParams();
		Map outMap = new HashMap();
		Set keys = retMap.keySet();
		for (Object key : keys) {
			Object response = retMap.get(key);
			if (response instanceof ResponseHeader) {
				outMap = BeanUtils.getProperties(response);
			}
		}
		return outMap;
	}

	public Map crmOrderFinished(Map params) throws Exception {

		Call call = null;
		String msg = "crmOrderFinished";
		Class clazz = CrmOrderFinishedRequest.class;
		Class rspClazz = CommonResponse.class;
		call = stepOne(msg, clazz, rspClazz);
		Map headers = setHeader();
		Object header = BeanUtils.setProperties(RequestHeader.class, headers);
		CrmOrderFinishedRequest req = new CrmOrderFinishedRequest();
		Object body = BeanUtils.setProperties(CrmOrderFinishedRequestBody.class, params);
		req.setRequestBody((CrmOrderFinishedRequestBody) body);

		call.invoke(new Object[] { header, req });
		Map retMap = call.getOutputParams();
		Map outMap = new HashMap();
		Set keys = retMap.keySet();
		for (Object key : keys) {
			Object response = retMap.get(key);
			if (response instanceof ResponseHeader) {
				outMap = BeanUtils.getProperties(response);
			}
		}
		return outMap;
	}

	public Map returnNumber(Map params) throws Exception {

		Call call = null;
		String msg = "returnNumber";
		Class clazz = ReturnNumberRequest.class;
		Class rspClazz = CommonResponse.class;
		call = stepOne(msg, clazz, rspClazz);
		Map headers = setHeader();
		Object header = BeanUtils.setProperties(RequestHeader.class, headers);
		ReturnNumberRequest req = new ReturnNumberRequest();
		Object body = BeanUtils.setProperties(ReturnNumberRequestBody.class, params);
		req.setRequestBody((ReturnNumberRequestBody) body);

		call.invoke(new Object[] { header, req });
		Map retMap = call.getOutputParams();
		Map outMap = new HashMap();
		Set keys = retMap.keySet();
		for (Object key : keys) {
			Object response = retMap.get(key);
			if (response instanceof ResponseHeader) {
				outMap = BeanUtils.getProperties(response);
			}
		}
		return outMap;

	}

	public Map modConfirmDate(Map params) throws Exception {

		Call call = null;
		String msg = "modConfirmDate";
		Class clazz = ModConfirmDateRequest.class;
		Class rspClazz = CommonResponse.class;
		call = stepOne(msg, clazz, rspClazz);
		Map headers = setHeader();
		Object header = BeanUtils.setProperties(RequestHeader.class, headers);
		ModConfirmDateRequest req = new ModConfirmDateRequest();
		Object body = BeanUtils.setProperties(ModConfirmDateRequestBody.class, params);
		req.setRequestBody((ModConfirmDateRequestBody) body);

		call.invoke(new Object[] { header, req });
		Map retMap = call.getOutputParams();
		Map outMap = new HashMap();
		Set keys = retMap.keySet();
		for (Object key : keys) {
			Object response = retMap.get(key);
			if (response instanceof ResponseHeader) {
				outMap = BeanUtils.getProperties(response);
			}
		}
		return outMap;

	}

	public Map crmCancel(Map params) throws Exception {

		Call call = null;
		String msg = "crmCancel";
		Class clazz = CrmCancelRequest.class;
		Class rspClazz = CommonResponse.class;
		call = stepOne(msg, clazz, rspClazz);
		Map headers = setHeader();
		Object header = BeanUtils.setProperties(RequestHeader.class, headers);
		CrmCancelRequest req = new CrmCancelRequest();
		Object body = BeanUtils.setProperties(CrmCancelRequestBody.class, params);
		req.setRequestBody((CrmCancelRequestBody) body);

		call.invoke(new Object[] { header, req });
		Map retMap = call.getOutputParams();
		Map outMap = new HashMap();
		Set keys = retMap.keySet();
		for (Object key : keys) {
			Object response = retMap.get(key);
			if (response instanceof ResponseHeader) {
				outMap = BeanUtils.getProperties(response);
			}
		}
		return outMap;

	}
	 public Map crmNotifyPoaResult(Map params) throws Exception {
		    Call call = null;
			String msg = "crmNotifyPoaResult";
			Class clazz = CrmNotifyPoaResultRequest.class;
			Class rspClazz = CommonResponse.class;
			call = stepOne(msg, clazz, rspClazz);
			Map headers = setHeader();
			Object header = BeanUtils.setProperties(RequestHeader.class, headers);
			CrmNotifyPoaResultRequest req = new CrmNotifyPoaResultRequest();
			Object body = BeanUtils.setProperties(CrmNotifyPoaResultRequestBody.class, params);
			req.setRequestBody((CrmNotifyPoaResultRequestBody) body);
			call.invoke(new Object[] { header, req });
			Map retMap = call.getOutputParams();
			Map outMap = new HashMap();
			Set keys = retMap.keySet();
			for (Object key : keys) {
				Object response = retMap.get(key);
				if (response instanceof ResponseHeader) {
					outMap = BeanUtils.getProperties(response);
				}
			}
			return outMap;
	    }
	public Map numberChangeRequest(Map params) throws Exception {

		Call call = null;
		String msg = "numberChangeRequest";
		Class clazz = NumberChangeRequestRequest.class;
		Class rspClazz = CommonResponse.class;
		call = stepOne(msg, clazz, rspClazz);
		Map headers = setHeader();
		Object header = BeanUtils.setProperties(RequestHeader.class, headers);
		NumberChangeRequestRequest req = new NumberChangeRequestRequest();
		Object body = BeanUtils.setProperties(NumberChangeRequestRequestBody.class, params);
		req.setRequestBody((NumberChangeRequestRequestBody) body);

		call.invoke(new Object[] { header, req });
		Map output = call.getOutputParams();
		return output;

	}

	public Map rangeChangeRequest(Map params) throws Exception {

		Call call = null;
		String msg = "rangeChangeRequest";
		Class clazz = RangeChangeRequestRequest.class;
		Class rspClazz = CommonResponse.class;
		call = stepOne(msg, clazz, rspClazz);
		Map headers = setHeader();
		Object header = BeanUtils.setProperties(RequestHeader.class, headers);
		RangeChangeRequestRequest req = new RangeChangeRequestRequest();
		Object body = BeanUtils.setProperties(RangeChangeRequestRequestBody.class, params);
		req.setRequestBody((RangeChangeRequestRequestBody) body);

		call.invoke(new Object[] { header, req });
		Map retMap = call.getOutputParams();
		Map outMap = new HashMap();
		Set keys = retMap.keySet();
		for (Object key : keys) {
			Object response = retMap.get(key);
			if (response instanceof ResponseHeader) {
				outMap = BeanUtils.getProperties(response);
			}
		}
		return outMap;

	}
	public Map portOutResponse4Wholesale(Map params) throws Exception {
		Call call = null;
		String msg = "portOutResponse4Wholesale";
		Class clazz = PortOutResponse4WholesaleRequest.class;
		Class rspClazz = CommonResponse.class;
		call = stepOne(msg, clazz, rspClazz);
		Map headers = setHeader();
		Object header = BeanUtils.setProperties(RequestHeader.class, headers);
		PortOutResponse4WholesaleRequest req = new PortOutResponse4WholesaleRequest();
		Object body = BeanUtils.setProperties(PortOutResponse4WholesaleRequestBody.class, params);
		req.setRequestBody((PortOutResponse4WholesaleRequestBody) body);
		call.invoke(new Object[] { header, req });
		Map retMap = call.getOutputParams();
		Set keys = retMap.keySet();
		Map outMap = new HashMap();
		for (Object key : keys) {
			Object response = retMap.get(key);
			if (response instanceof ResponseHeader) {
				outMap = BeanUtils.getProperties(response);
			}
		}
		return outMap;
    }
	public Map checkAgreement(Map params) throws Exception {

		Call call = null;
		String msg = "checkAgreement";
		Class clazz = CheckAgreementRequest.class;
		Class rspClazz = CheckAgreementResponse.class;
		call = stepOne(msg, clazz, rspClazz);
		Map headers = setHeader();
		Object header = BeanUtils.setProperties(RequestHeader.class, headers);
		CheckAgreementRequest req = new CheckAgreementRequest();
		Object body = BeanUtils.setProperties(CheckAgreementRequestBody.class, params);
		req.setRequestBody((CheckAgreementRequestBody) body);
		call.invoke(new Object[] { header, req });
		Map retMap = call.getOutputParams();
		Map outMap = null;
		Set keys = retMap.keySet();//checkAgreementResponse
		for (Object key : keys) {
			Object response = retMap.get(key);
			if(response instanceof CheckAgreementResponse){
				CheckAgreementResponse chkRsp = (CheckAgreementResponse) response;
				CheckAgreementResponseBody rspBody = chkRsp.getResponseBody();
				outMap = BeanUtils.getProperties(rspBody);
			}
		}
		return outMap;
	}

	public Map qrySpNpImportOrderInfo(Map params)throws Exception {
		
		Call call = null;
		String msg = "qrySpNpImportOrderInfo";
		Class clazz = QrySpNpImportOrderInfoRequest.class;
		Class rspClazz = QrySpNpImportOrderInfoResponse.class;
		call = stepOne(msg, clazz, rspClazz);
		Map headers = setHeader();
		Object header = BeanUtils.setProperties(RequestHeader.class, headers);
		QrySpNpImportOrderInfoRequest req = new QrySpNpImportOrderInfoRequest();
		Object body = BeanUtils.setProperties(QrySpNpImportOrderInfoRequestBody.class, params);
		req.setRequestBody((QrySpNpImportOrderInfoRequestBody) body);
		call.invoke(new Object[] { header, req });
		Map retMap = call.getOutputParams();
		Map outMap = new HashMap();
		List rspBodyList = new ArrayList();
		Set keys = retMap.keySet();
		for (Object key : keys) {
			Object response = retMap.get(key);
			if (response instanceof QrySpNpImportOrderInfoResponse) {
				QrySpNpImportOrderInfoResponse qryRsp = (QrySpNpImportOrderInfoResponse) response;
				QrySpNpImportOrderInfoResponseBodyPortData[] rspBody =  qryRsp.getResponseBody();
				for(int i=0;i<rspBody.length;i++){
					Map tempMap = new HashMap();
					tempMap = BeanUtils.getProperties(rspBody[i]);
					rspBodyList.add(tempMap);
				}
			}
		}
		outMap.put("PortData", rspBodyList);
		return outMap;
	}

	public Map qrySpNpExportOrderInfo(Map params)throws Exception {
		
		Call call = null;
		String msg = "qrySpNpExportOrderInfo";
		Class clazz = QrySpNpExportOrderInfoRequest.class;
		Class rspClazz = QrySpNpExportOrderInfoResponse.class;
		call = stepOne(msg, clazz, rspClazz);
		Map headers = setHeader();
		Object header = BeanUtils.setProperties(RequestHeader.class, headers);
		QrySpNpExportOrderInfoRequest req = new QrySpNpExportOrderInfoRequest();
		Object body = BeanUtils.setProperties(QrySpNpExportOrderInfoRequestBody.class, params);
		req.setRequestBody((QrySpNpExportOrderInfoRequestBody) body);
		call.invoke(new Object[] { header, req });
		Map retMap = call.getOutputParams();
		Map outMap = new HashMap();
		List rspBodyList = new ArrayList();
		Set keys = retMap.keySet();
		for (Object key : keys) {
			Object response = retMap.get(key);
			if (response instanceof QrySpNpExportOrderInfoResponse) {
				QrySpNpExportOrderInfoResponse qryRsp = (QrySpNpExportOrderInfoResponse) response;
				QrySpNpExportOrderInfoResponseBodyPortData[] rspBody =  qryRsp.getResponseBody();
				for(int i=0;i<rspBody.length;i++){
					Map tempMap = new HashMap();
					tempMap = BeanUtils.getProperties(rspBody[i]);
					rspBodyList.add(tempMap);
				}
			}
		}
		outMap.put("PortData", rspBodyList);
		return outMap;
	}

	private Call getCall(OperationDesc oper) throws Exception {

		CfgWsClient objCfgWsClient = (CfgWsClient)CacheFactory.get(WsClientCacheImpl.class, "C^" + "CRM_NP_URL");
		String npUrl = objCfgWsClient.getUrlAddress();
		Call call = super._createCall();
		synchronized (this) {
			if (firstCall()) {

				call.setEncodingStyle(null);
				for (int i = 0; i < cachedSerFactories.size(); ++i) {
					Class cls = (Class) cachedSerClasses.get(i);
					QName qName = (QName) cachedSerQNames.get(i);
					Object x = cachedSerFactories.get(i);
					if (x instanceof Class) {
						Class sf = (Class) cachedSerFactories.get(i);
						Class df = (Class) cachedDeserFactories.get(i);
						call.registerTypeMapping(cls, qName, sf, df, false);
					} else if (x instanceof SerializerFactory) {
						SerializerFactory sf = (SerializerFactory) cachedSerFactories.get(i);
						DeserializerFactory df = (DeserializerFactory) cachedDeserFactories.get(i);
						call.registerTypeMapping(cls, qName, sf, df, false);
					}
				}
			}
		}
		call.setOperation(oper);
		call.setUseSOAPAction(true);
		call.setEncodingStyle(null);
		call.setProperty(Call.SEND_TYPE_ATTR, Boolean.FALSE);
		call.setTargetEndpointAddress(new URL(npUrl));
		return call;
	}
	
	public Map getNumberInfo(Map params) throws Exception {

		Call call = null;
		String msg = "getNumberInfo";
		Class clazz = GetNumberInfoRequest.class;
		Class rspClazz = GetNumberInfoResponse.class;
		call = stepOne(msg, clazz, rspClazz);
		Map headers = setHeader();
		Object header = BeanUtils.setProperties(RequestHeader.class, headers);

		GetNumberInfoRequest req = new GetNumberInfoRequest();

		Object body = BeanUtils.setProperties(GetNumberInfoRequestBody.class, params);
		req.setRequestBody((GetNumberInfoRequestBody) body);

		call.invoke(new Object[] { header, req });
		Map retMap = call.getOutputParams();
		Map outMap = new HashMap();
		Set keys = retMap.keySet();
		for (Object key : keys) {
			Object response = retMap.get(key);
			if(response instanceof GetNumberInfoResponse){
				GetNumberInfoResponse NumberInfoRsp = (GetNumberInfoResponse) response;
				GetNumberInfoResponseBody rspBody = NumberInfoRsp.getResponseBody();
				outMap = BeanUtils.getProperties(rspBody);
			}
		}
		return outMap;
	}
	  public Map syncOperatorInfo(Map params) throws Exception {
	       
		    Call call = null;
		    String msg = "syncOperatorInfo";
		    Class clazz = SyncOperatorInfoRequest.class;
			Class rspClazz = SyncOperatorInfoResponse.class;
			call = stepOne(msg, clazz, rspClazz);
			Map headers = setHeader();
			Object header = BeanUtils.setProperties(RequestHeader.class, headers);
			
			SyncOperatorInfoRequest req = new SyncOperatorInfoRequest();
			
			Object body = BeanUtils.setProperties(SyncOperatorInfoRequestBody.class, params);
			req.setRequestBody((SyncOperatorInfoRequestBody) body);
			call.invoke(new Object[] { header, req });
			Map retMap = call.getOutputParams();
			Map outMap = new HashMap();
			Set keys = retMap.keySet();
			for (Object key : keys) {
				Object response = retMap.get(key);
				if(response instanceof SyncOperatorInfoResponse){
					SyncOperatorInfoResponse syncOperatorInfoRsp = (SyncOperatorInfoResponse) response;
					SyncOperatorInfoResponseBody rspBody = syncOperatorInfoRsp.getResponseBody();
					outMap = BeanUtils.getProperties(rspBody);
				}
			}
			return outMap;
		}
	public static void main(String[] args) throws Exception {
		NPServiceClient np = new NPServiceClient();
		Map map = new HashMap();
//		map.put("OrderId", "100000000001");
//		map.put("TerminateDate", "30000001");
//		map.put("UserId", "GSM");
//		map.put("ReturnOperator", "DK");
//		map.put("MainNumber", "DK");
//		
//		
//		List list = new ArrayList();
//		Map ser1 = new HashMap();
//		ser1.put("SeriesStart", "1");
//		ser1.put("SeriesEnd", "2");
//		list.add(ser1);
//		
//		Map ser2 = new HashMap();
//		ser2.put("SeriesStart", "3");
//		ser2.put("SeriesEnd", "4");
//		list.add(ser2);
//		
//		map.put("NumberSeries", list);
		
//		map.put("CountryCode", "DK");
//		map.put("TelephoneNumber", "62000002");
//		map.put("CustomerType", "100000000001");
		//{ResponseType=0, RejectCode=, RejectDesc=null, RejectReason=null, CrmOrderId=39100110195100, OrderId=66666, DebitAmount=null,
		 //ConfirmedExecutionDate=2015-08-10 00:00:00, ConfirmationStatus=null}
//		map.put("ResponseType", "confirm");
//		map.put("RejectCode", "");
//		map.put("RejectDesc", null);
//		map.put("RejectReason", "0");
//		map.put("CrmOrderId", "87655");
//		map.put("OrderId", null);
//		map.put("DebitAmount", null);
		map.put("OperatorCode", "01097");
		//map.put("TelephoneNumber", "");
//		np.portOutResponse4Wholesale(map);
		System.out.println(np.syncOperatorInfo(map));
//		System.out.println(np.qrySpNpExportOrderInfo(map));
	}

}
