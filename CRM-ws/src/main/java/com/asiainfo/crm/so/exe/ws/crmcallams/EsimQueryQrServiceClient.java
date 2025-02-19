package com.asiainfo.crm.so.exe.ws.crmcallams;

import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.ai.common.util.StaticDataUtil;
import com.ai.secframe.common.OrgModelConstants;
import com.asiainfo.appframe.ext.exeframe.ws.client.WsUtil;
import com.asiainfo.crm.constant.RBossConst;
import com.asiainfo.crm.so.exe.ws.crmcallams.esimqueryqrservice.*;
import com.asiainfo.crm.so.order.rboss.service.interfaces.IRecordLogSV;
import com.google.gson.Gson;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.xml.rpc.ServiceException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;
public class EsimQueryQrServiceClient {
	/**
	 * cfg_ws_client表中配置
	 */
	private static final String CFG_WS_SET_CLIENT_CODE = "CRM_ESIM_QUERY_QR_URL";
	private static final String CRM_ESIM_PROFILE_STATUSES_URL = "CRM_ESIM_PROFILE_STATUSES_URL";
	private static final String CRM_ESIM_RELEASE_PROFILE_URL = "CRM_ESIM_RELEASE_PROFILE_URL";
	private static final String CRM_ESIM_UNRELEASE_PROFILE_URL = "CRM_ESIM_UNRELEASE_PROFILE_URL";

	private static EsimQueryQrServiceClient client = null;
	private static transient Log log = LogFactory.getLog(EsimQueryQrServiceClient.class);

	public static EsimQueryQrServiceClient getInstance() throws Exception {
		if (null == client) {
			synchronized(EsimQueryQrServiceClient.class) {
				if (null == client)
					client = new EsimQueryQrServiceClient();
			}
		}
		return client;
	}
	private GetEsimQRbyIccIDServiceLocator esimQueryQRService = null;
	private GetProfilesStatusesServiceLocator esimProfileStatusService = null;

	private ReleaseProfilePortBindingQSServiceLocator releaseProfileService = null;
	private UnreleaseProfileServiceLocator unreleaseProfileService = null;
	private EsimQueryQrServiceClient() {
		super();
		esimQueryQRService = new GetEsimQRbyIccIDServiceLocator();
		esimProfileStatusService = new GetProfilesStatusesServiceLocator();
		releaseProfileService = new ReleaseProfilePortBindingQSServiceLocator();
		unreleaseProfileService = new UnreleaseProfileServiceLocator();
	}
	
	public GetEsimQRbyIccIDServiceLocator getEsimQRbyIccIDServiceLocator() {
		return esimQueryQRService;
	}
	public GetProfilesStatusesServiceLocator getEsimProfileStatusLocator() {
		return esimProfileStatusService;
	}
	public ReleaseProfilePortBindingQSServiceLocator getReleaseProfileServiceLocator() {
		return releaseProfileService;
	}
	public UnreleaseProfileServiceLocator getUnreleaseProfileServiceLocator() {
		return unreleaseProfileService;
	}
	
	public GetEsimQRbyIccIDPort_PortType getEsimQueryQRService() throws ServiceException, Exception {
		URL portAddress = WsUtil.getUrlAddress(CFG_WS_SET_CLIENT_CODE);
		if(log.isInfoEnabled()){
			log.debug(new StringBuffer().append(portAddress.getHost()).append(":").append(portAddress.getPort()));
		}
		return getEsimQRbyIccIDServiceLocator().getGetEsimQRbyIccIDPort(portAddress);
//		return null;
	}

	public GetProfilesStatusesPort getEsimProfileStatusService() throws ServiceException, Exception {
//		URL portAddress = new URL("http://10.1.248.207:8381/TelenorDK/ConsumerAccessServices/3rdParty/ProxyServices/GetProfilesStatuses?wsdl");
		URL portAddress = WsUtil.getUrlAddress(CRM_ESIM_PROFILE_STATUSES_URL);
		if(log.isInfoEnabled()){
			log.debug(new StringBuffer().append(portAddress.getHost()).append(":").append(portAddress.getPort()));
		}
		return getEsimProfileStatusLocator().getGetProfilesStatusesPort(portAddress);
	}

	public ReleaseProfilePort getReleaseProfileService() throws ServiceException, Exception {
//		URL portAddress = new URL("http://10.1.248.207:8381/TelenorDK/ConsumerAccessServices/3rdParty/ProxyServices/ReleaseProfile?wsdl");
		URL portAddress = WsUtil.getUrlAddress(CRM_ESIM_RELEASE_PROFILE_URL);
		if(log.isInfoEnabled()){
			log.debug(new StringBuffer().append(portAddress.getHost()).append(":").append(portAddress.getPort()));
		}
		return getReleaseProfileServiceLocator().getReleaseProfilePortBindingQSPort(portAddress);
	}

	public UnreleaseProfilePort getUnreleaseProfileService() throws ServiceException, Exception {
		URL portAddress = WsUtil.getUrlAddress(CRM_ESIM_UNRELEASE_PROFILE_URL);
		if(log.isInfoEnabled()){
			log.debug(new StringBuffer().append(portAddress.getHost()).append(":").append(portAddress.getPort()));
		}
		return getUnreleaseProfileServiceLocator().getUnreleaseProfilePort(portAddress);
	}

	//customerId内容： {"conset":true,"customerId":"123444"}
	public EsimQrCodeResponseBean getEsimQRbyIccID(long customerOrderId, String iccid, String format) throws RemoteException, ServiceException, Exception {
		boolean success=false;
		GetEsimQRbyIccIDRequestBody reqestBody = new GetEsimQRbyIccIDRequestBody();
		reqestBody.setIccId(iccid);
		reqestBody.setFormat(format);
		GetEsimQRbyIccIDRequest request=new GetEsimQRbyIccIDRequest();
		request.setRequestBody(reqestBody);
		
		String results="";
		EsimQrCodeResponseBean esimQRCodeBody = new EsimQrCodeResponseBean();
		try {
			GetEsimQRbyIccIDResponse esimQRbyIccIDResponse = getEsimQueryQRService().getEsimQRbyIccID(request);
			if (esimQRbyIccIDResponse!=null&&esimQRbyIccIDResponse.getResponseBody()!=null) {
				results=esimQRbyIccIDResponse.getResponseBody().getResults();
			}
			if(StringUtils.isNotBlank(results)){
				Gson gson = new Gson();
				esimQRCodeBody = gson.fromJson(results,EsimQrCodeResponseBean.class);
			}
			return esimQRCodeBody;
		} catch (Exception e) {
			log.error(e.getMessage());
			results=e.getMessage();
		}finally {
			String detailInfo = "interfaceName:getEsimQRbyIccID ;request:"+reqestBody.toString()+" results:"+results;
			IRecordLogSV reLogSV = (IRecordLogSV) ServiceFactory.getService(IRecordLogSV.class);
			reLogSV.saveLog(0, customerOrderId, 0, null, 0, RBossConst.UAPI_INTERFACE, detailInfo,RBossConst.CRM_CALL_OUT, null);
		}
		return esimQRCodeBody;
		
	}

	public EsimProfilesStatusResponseBean getEsimProfilesStatus(long customerOrderId,String inputJson) throws RemoteException, ServiceException, Exception {
		boolean success=false;
		GetProfilesStatusesRequest request = new GetProfilesStatusesRequest();
		GetProfilesStatusesRequestBody requestBody = new GetProfilesStatusesRequestBody();
		requestBody.setInput(inputJson);
		request.setRequestBody(requestBody);
		String results="";
		EsimProfilesStatusResponseBean profileStatusesBody = new EsimProfilesStatusResponseBean();
		try {
			GetProfilesStatusesResponse esimProfileStatusResponse = getEsimProfileStatusService().getProfilesStatuses(request);
			if (esimProfileStatusResponse!=null&&esimProfileStatusResponse.getResponseBody()!=null) {
				results=esimProfileStatusResponse.getResponseBody().getResults();
			}
			if(StringUtils.isNotBlank(results)){
				Gson gson = new Gson();
				profileStatusesBody = gson.fromJson(results,EsimProfilesStatusResponseBean.class);
			}
			return profileStatusesBody;
		} catch (Exception e) {
			log.error(e.getMessage());
			results=e.getMessage();
		}finally {
			String detailInfo = "interfaceName:GetProfilesStatuses ;request:"+inputJson+" results:"+results;
			IRecordLogSV reLogSV = (IRecordLogSV) ServiceFactory.getService(IRecordLogSV.class);
			reLogSV.saveLog(0, customerOrderId, 0, null, 0, RBossConst.UAPI_INTERFACE, detailInfo,RBossConst.CRM_CALL_OUT, "GetProfilesStatuses");
		}
		return profileStatusesBody;

	}

	public ReleaseProfileResponseBean releaseProfile(long customerOrderId,String inputJson) throws RemoteException, ServiceException, Exception {
		boolean success=false;
//		GetProfilesStatusesRequest request = new GetProfilesStatusesRequest();
		ReleaseProfileRequest request = new ReleaseProfileRequest();
		ReleaseProfileRequestBody requestBody = new ReleaseProfileRequestBody();
		requestBody.setInput(inputJson);
		request.setRequestBody(requestBody);
		String results="";
		ReleaseProfileResponseBean releaseProfileResponseBean = new ReleaseProfileResponseBean();
		try {
			ReleaseProfileResponse releaseProfileResponse = getReleaseProfileService().releaseProfile(request);
			if (releaseProfileResponse!=null&&releaseProfileResponse.getResponseBody()!=null) {
				results=releaseProfileResponse.getResponseBody().getResults();
			}
			if(StringUtils.isNotBlank(results)){
				Gson gson = new Gson();
				releaseProfileResponseBean = gson.fromJson(results,ReleaseProfileResponseBean.class);
			}
			return releaseProfileResponseBean;
		} catch (Exception e) {
			log.error(e.getMessage());
			results=e.getMessage();
		}finally {
			String detailInfo = "interfaceName:ReleaseProfile ;request:"+inputJson+" results:"+results;
			IRecordLogSV reLogSV = (IRecordLogSV) ServiceFactory.getService(IRecordLogSV.class);
			reLogSV.saveLog(0, customerOrderId, 0, null, 0, RBossConst.UAPI_INTERFACE, detailInfo,RBossConst.CRM_CALL_OUT, "ReleaseProfile");
		}
		return releaseProfileResponseBean;

	}

	public UnreleaseProfileResponseBean unreleaseProfile(String iccid) throws RemoteException, ServiceException, Exception {
		Map in = new HashMap();
		String requestCodeType = "ESIM_REQUEST_ID";
		String callCodeType = "ESIM_CALL_ID";
		String requesterIdentifier = getCodeValue(requestCodeType);
		String callIdentifier = getCodeValue(callCodeType);
		in.put("callIdentifier",callIdentifier);
		in.put("requesterIdentifier",requesterIdentifier);
		in.put("iccid",iccid);
		UnreleaseProfileRequest request = new UnreleaseProfileRequest();
		UnreleaseProfileRequestBody requestBody = new UnreleaseProfileRequestBody();
		String inJson = new Gson().toJson(in);
		requestBody.setInput(inJson);
		request.setRequestBody(requestBody);
		UnreleaseProfileResponseBean responseBean = new UnreleaseProfileResponseBean();
		String results = "";
		try{
			UnreleaseProfileResponse unreleaseProfileResponse = getUnreleaseProfileService().unreleaseProfile(request);
			if (unreleaseProfileResponse!=null&&unreleaseProfileResponse.getResponseBody()!=null) {
				results=unreleaseProfileResponse.getResponseBody().getResults();
			}
			if(StringUtils.isNotBlank(results)){
				Gson gson = new Gson();
				responseBean = gson.fromJson(results,UnreleaseProfileResponseBean.class);
			}
		}
		catch(Exception e){
			log.error(e.getMessage());
			results=e.getMessage();
		}
		finally {
			String detailInfo = "interfaceName:UnreleaseProfile ;request:"+inJson+" results:"+results;
			IRecordLogSV reLogSV = (IRecordLogSV) ServiceFactory.getService(IRecordLogSV.class);
			reLogSV.saveLog(0, 0, 0, iccid, 0, RBossConst.UAPI_INTERFACE, detailInfo,RBossConst.CRM_CALL_OUT, "UnreleaseProfile");
		}
		return responseBean;
	}

	public CancelOrderResponseBean cancelOrder(String iccid) throws RemoteException, ServiceException, Exception {
		Map in = new HashMap();
		String requestCodeType = "ESIM_REQUEST_ID";
		String callCodeType = "ESIM_CALL_ID";
		String finalProfileStatusIndicatorCodeType = "ESIM_finalProfileStatusIndicator";

		String requesterIdentifier = getCodeValue(requestCodeType);
		String callIdentifier = getCodeValue(callCodeType);
		String finalProfileStatusIndicator = getCodeValue(finalProfileStatusIndicatorCodeType);

		in.put("callIdentifier",callIdentifier);
		in.put("requesterIdentifier",requesterIdentifier);
		in.put("iccid",iccid);
		in.put("finalProfileStatusIndicator",finalProfileStatusIndicator);

        CancelOrderRequest request = new CancelOrderRequest();
        CancelOrderRequestBody requestBody = new CancelOrderRequestBody();
		String inJson = new Gson().toJson(in);
		requestBody.setInput(inJson);
		request.setRequestBody(requestBody);
        CancelOrderResponseBean responseBean = new CancelOrderResponseBean();
		String results = "";
		try{
            CancelOrderResponse cancelOrderResponse = getUnreleaseProfileService().cancelOrder(request);
			if (cancelOrderResponse!=null&&cancelOrderResponse.getResponseBody()!=null) {
				results=cancelOrderResponse.getResponseBody().getResults();
			}
			if(StringUtils.isNotBlank(results)){
				Gson gson = new Gson();
				responseBean = gson.fromJson(results,CancelOrderResponseBean.class);
			}
		}
		catch(Exception e){
			log.error(e.getMessage());
			results=e.getMessage();
		}
		finally {
			String detailInfo = "interfaceName:CancelOrder ;request:"+inJson+" results:"+results;
			IRecordLogSV reLogSV = (IRecordLogSV) ServiceFactory.getService(IRecordLogSV.class);
			reLogSV.saveLog(0, 0, 0, iccid, 0, RBossConst.UAPI_INTERFACE, detailInfo,RBossConst.CRM_CALL_OUT, "CancelOrder");
		}
		return responseBean;
	}

	public DownloadOrderResponseBean downloadOrder(String iccid) throws RemoteException, ServiceException, Exception {
		Map in = new HashMap();
		String requestCodeType = "ESIM_REQUEST_ID";
		String callCodeType = "ESIM_CALL_ID";
		String requesterIdentifier = getCodeValue(requestCodeType);
		String callIdentifier = getCodeValue(callCodeType);
		in.put("callIdentifier",callIdentifier);
		in.put("requesterIdentifier",requesterIdentifier);
		in.put("iccid",iccid);
        DownloadOrderRequest request = new DownloadOrderRequest();
        DownloadOrderRequestBody requestBody = new DownloadOrderRequestBody();
		String inJson = new Gson().toJson(in);
		requestBody.setInput(inJson);
		request.setRequestBody(requestBody);
        DownloadOrderResponseBean responseBean = new DownloadOrderResponseBean();
		String results = "";
		try{
            DownloadOrderResponse downloadOrderResponse = getUnreleaseProfileService().downloadOrder(request);
			if (downloadOrderResponse!=null&&downloadOrderResponse.getResponseBody()!=null) {
				results=downloadOrderResponse.getResponseBody().getResults();
			}
			if(StringUtils.isNotBlank(results)){
				Gson gson = new Gson();
				responseBean = gson.fromJson(results,DownloadOrderResponseBean.class);
			}
		}
		catch(Exception e){
			log.error(e.getMessage());
			results=e.getMessage();
		}
		finally {
			String detailInfo = "interfaceName:DownloadOrder ;request:"+inJson+" results:"+results;
			IRecordLogSV reLogSV = (IRecordLogSV) ServiceFactory.getService(IRecordLogSV.class);
			reLogSV.saveLog(0, 0, 0, iccid, 0, RBossConst.UAPI_INTERFACE, detailInfo,RBossConst.CRM_CALL_OUT, "DownloadOrder");
		}
		return responseBean;
	}


	private String getCodeValue(String codeType) throws Exception {
		String requesterIdentifier = "";
		IBOBsStaticDataValue[] requestStaticDataValues = StaticDataUtil.getStaticData(codeType);
		if(requestStaticDataValues!=null && requestStaticDataValues.length>0){
			requesterIdentifier = requestStaticDataValues[0].getCodeValue();
		}
		return requesterIdentifier;
	}

	public static void main(String[] args) throws Exception {
			System.setProperty("tenant.id", "21");
			UserInfoInterface user;
			try {
				user = ServiceManager.getNewBlankUserInfo();
				user.setCode("21wangwy");
				user.setName("21wangwy");
				user.setID(410001030L);
				user.setTenantId("21");
				user.set(RBossConst.PUBINFO_CHANNEL_TYPE, "10006");
				user.set(OrgModelConstants.REGION_ID, "2106");
				user.set(OrgModelConstants.DISTRICT_ID, "1005050");
				user.setOrgId(21000000L);
				ServiceManager.setServiceUserInfo(user);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		EsimQueryQrServiceClient client  = new EsimQueryQrServiceClient();
		UnreleaseProfileResponseBean bean = client.unreleaseProfile("1232323");
	}
}
