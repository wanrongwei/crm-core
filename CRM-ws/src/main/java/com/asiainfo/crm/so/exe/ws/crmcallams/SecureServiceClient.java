/**
 * Copyright (C) 2013 Asiainfo-Linkage
 *
 *
 * @className:com.asiainfo.crm.so.exe.ws.crmcallams.ImsWrapServiceClient
 * @description:账管业务办理
 * 
 * @version:v1.0.0 
 * @author:cxy22xueyi
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2013-10-28    cxy22xueyi     v1.0.0   账管业务办理
 *
 *
 */
package com.asiainfo.crm.so.exe.ws.crmcallams;

import com.asiainfo.appframe.ext.exeframe.ws.client.WsUtil;
import com.asiainfo.crm.so.exe.ws.crmcallams.secure.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.xml.rpc.ServiceException;
import java.net.URL;

public class SecureServiceClient {
	/**
	 * cfg_ws_client表中配置
	 */
	private static final String CFG_WS_CLIENT_CODE = "SECURE_DNS_SERVICE";

	private static SecureServiceClient client = null;

	private static transient Log log = LogFactory.getLog(SecureServiceClient.class);

	public static SecureServiceClient getInstance() throws Exception {
		if (null == client) {
			client = new SecureServiceClient();
		}
		return client;
	}

	private DHCPPortBindingQSServiceLocator service = null;

	private SecureServiceClient() {
		super();
		service = new DHCPPortBindingQSServiceLocator();
	}
	
	public DHCPPortBindingQSServiceLocator getService() {
		return service;
	}
	
	//获取服务
	public DHCP getDHCPService() throws ServiceException, Exception {
		URL portAddress = WsUtil.getUrlAddress(CFG_WS_CLIENT_CODE);
		if(log.isInfoEnabled()){
			log.error(new StringBuffer().append(portAddress.getHost()).append(":").append(portAddress.getPort()));
		}
		DHCP dhcp = getService().getDHCPPortBindingQSPort(portAddress);
		return dhcp;
	}
	

	public ProvisioDSLFiberResponse provisioDSLFiber(String dslId,String productcode) throws java.rmi.RemoteException, Exception{
		ProvisioDSLFiberRequest parameters=new ProvisioDSLFiberRequest();
		ProvisioDSLFiberRequestBody body=new ProvisioDSLFiberRequestBody();
		body.setProduct(productcode);
		body.setDSL_ID(dslId);
		parameters.setRequestBody(body);
		ProvisioDSLFiberResponse response = getDHCPService().provisioDSLFiber(parameters);
		if(response==null || response.getResponseBody()==null){
			new Exception("provisioDSLFiber error.");
		}else if(!response.getResponseBody().getResults().startsWith("2")){
			new Exception("provisioDSLFiber error.errorCode:"+response.getResponseBody().getResults());
		}
		return response;
	}

	public ProvisionCoaxResponse  provisionCoax(String dslId,String productcode,String mac) throws java.rmi.RemoteException, Exception{
		ProvisionCoaxRequest  parameters=new ProvisionCoaxRequest();
		ProvisionCoaxRequestBody  body=new ProvisionCoaxRequestBody();
		body.setProduct(productcode);
		body.setDSL_ID(dslId);
		body.setMAC(mac);
		parameters.setRequestBody(body);
		ProvisionCoaxResponse response = getDHCPService().provisionCoax(parameters);
		if(response==null || response.getResponseBody()==null){
			new Exception("provisionCoax error.");
		}else if(!response.getResponseBody().getResults().startsWith("2")){
			new Exception("provisionCoax error.errorCode:"+response.getResponseBody().getResults());
		}
		return response;
	}

	public RemoveCoaxResponse deProvisionCoax(String dslId) throws java.rmi.RemoteException, Exception{
		RemoveCoaxRequest  parameters=new RemoveCoaxRequest();
		RemoveCoaxRequestBody  body=new RemoveCoaxRequestBody();
		body.setDSL_ID(dslId);
 		parameters.setRequestBody(body);
		RemoveCoaxResponse response = getDHCPService().removeCoax(parameters);
		if(response==null || response.getResponseBody()==null){
			new Exception("deProvisionCoax error.");
		}else if(!response.getResponseBody().getResults().startsWith("2")){
			new Exception("deProvisionCoax error.errorCode:"+response.getResponseBody().getResults());
		}
		return response;
	}

	public RemoveCoaxOneResponse deProvisionCoax(String dslId,String mac) throws java.rmi.RemoteException, Exception{
		RemoveCoaxOneRequest  parameters=new RemoveCoaxOneRequest();
		RemoveCoaxOneRequestBody  body=new RemoveCoaxOneRequestBody();
		body.setDSL_ID(dslId);
		body.setMAC(mac);
		parameters.setRequestBody(body);
		RemoveCoaxOneResponse response = getDHCPService().removeCoaxOne(parameters);
		if(response==null || response.getResponseBody()==null){
			new Exception("deProvisionCoax error.");
		}else if(!response.getResponseBody().getResults().startsWith("2")){
			new Exception("deProvisionCoax error.errorCode:"+response.getResponseBody().getResults());
		}
		return response;
	}

	public RemoveDSLFiberResponse deProvisionFiberDsl(String dslId) throws java.rmi.RemoteException, Exception{
		RemoveDSLFiberRequest  parameters=new RemoveDSLFiberRequest();
		RemoveDSLFiberRequestBody  body=new RemoveDSLFiberRequestBody();
		body.setDSL_ID(dslId);
		parameters.setRequestBody(body);
		RemoveDSLFiberResponse response = getDHCPService().removeDSLFiber(parameters);
		if(response==null || response.getResponseBody()==null){
			new Exception("deProvisionFiberDsl error.");
		}else if(!response.getResponseBody().getResults().startsWith("2")){
			new Exception("deProvisionFiberDsl error.errorCode:"+response.getResponseBody().getResults());
		}
		return response;
	}
	

}
