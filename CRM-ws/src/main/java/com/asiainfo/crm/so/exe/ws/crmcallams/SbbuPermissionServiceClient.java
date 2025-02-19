package com.asiainfo.crm.so.exe.ws.crmcallams;

import java.net.URL;
import java.rmi.RemoteException;
import java.util.Map;

import javax.xml.rpc.ServiceException;

import org.apache.commons.collections.MapUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.asiainfo.appframe.ext.exeframe.ws.client.WsUtil;
import com.asiainfo.crm.constant.RBossConst;
import com.asiainfo.crm.so.exe.ws.crmcallams.sbbupermissionservice.SetSbbuPermissionPort_PortType;
import com.asiainfo.crm.so.exe.ws.crmcallams.sbbupermissionservice.SetSbbuPermissionRequest;
import com.asiainfo.crm.so.exe.ws.crmcallams.sbbupermissionservice.SetSbbuPermissionRequestBody;
import com.asiainfo.crm.so.exe.ws.crmcallams.sbbupermissionservice.SetSbbuPermissionResponse;
import com.asiainfo.crm.so.exe.ws.crmcallams.sbbupermissionservice.SetSbbuPermissionServiceLocator;
import com.asiainfo.crm.so.order.rboss.service.interfaces.IRecordLogSV;

import com.ai.appframe2.service.ServiceFactory;
public class SbbuPermissionServiceClient {
	/**
	 * cfg_ws_client表中配置	
	 */
	private static final String CFG_WS_SET_CLIENT_CODE = "CRM_SETSBBUPERMISSION_URL";

	
	private static SbbuPermissionServiceClient client = null;
	
	private static transient Log log = LogFactory.getLog(SbbuPermissionServiceClient.class);
		
	public static SbbuPermissionServiceClient getInstance() throws Exception {
		if (null == client) {
			synchronized(SbbuPermissionServiceClient.class) {
				if (null == client)
					client = new SbbuPermissionServiceClient();
			}
		}
		return client;
	}
	private SetSbbuPermissionServiceLocator setPermissionservice = null;
	
	private SbbuPermissionServiceClient() {
		super();
		setPermissionservice = new SetSbbuPermissionServiceLocator();
	}
	
	public SetSbbuPermissionServiceLocator getSetPermissionService() {
		return setPermissionservice;
	}
	
	
	
	public SetSbbuPermissionPort_PortType getSetSbbuPermissionService() throws ServiceException, Exception {
		URL portAddress = WsUtil.getUrlAddress(CFG_WS_SET_CLIENT_CODE);
		if(log.isInfoEnabled()){
			log.debug(new StringBuffer().append(portAddress.getHost()).append(":").append(portAddress.getPort()));
		}
		SetSbbuPermissionPort_PortType SetSbbupermissionService = getSetPermissionService().getSBBUpermissionPort(portAddress);
		return SetSbbupermissionService;
	}
	
	//customerId内容： {"conset":true,"customerId":"123444"}
	public void setSBBUPermission(Map orderInfo) throws RemoteException, ServiceException, Exception {
		boolean success=false;
		SetSbbuPermissionRequestBody reqestBody = new SetSbbuPermissionRequestBody();
		reqestBody.setCustomerID(orderInfo.get("jsonValue").toString());
		SetSbbuPermissionRequest  request=new SetSbbuPermissionRequest();
		request.setRequestBody(reqestBody);
		
		String results="";
		try {
			SetSbbuPermissionResponse setPermissionResopnse=getSetSbbuPermissionService().SBBUpermission(request);	
			if (setPermissionResopnse!=null&&setPermissionResopnse.getResponseBody()!=null) {
				results=setPermissionResopnse.getResponseBody().getResults();
			}
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e.getMessage());
			results=e.getMessage();
		}finally {
			String detailInfo = "interfaceName:setSbbuPermission ;request:"+orderInfo.get("jsonValue").toString()+"results:"+results;
			IRecordLogSV reLogSV = (IRecordLogSV) ServiceFactory.getService(IRecordLogSV.class);
			long orderId = MapUtils.getLong(orderInfo, "orderId") ;
			reLogSV.saveLog(0, orderId, 0, null, 0, RBossConst.UAPI_INTERFACE, detailInfo,RBossConst.CRM_CALL_OUT, null);
		}
				
		
	}
			
	
	
}
