/**
 * TeradataPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.campaign;

import java.rmi.RemoteException;
import java.util.Map;

public interface TeradataPortType extends java.rmi.Remote {
	/*public PostSubscriberEventResponse postSubscriberEvent(
			RequestHeader requestHeader, PostSubEventRequestBody parameters)
			throws RemoteException;*/
	
	public Map postSubscriberEvent( Map bodyMap)
			throws RemoteException;

	public CreatePromotionTaskResponse createPromotionTask(
			RequestHeader requestHeader, CreatePromotionTaskRequest parameters)
			throws RemoteException;

	public QueryPublishedCampaignsResponse queryPublishedCampaigns(
			RequestHeader requestHeader,
			QueryPublishedCampaignsRequestBody parameters)
			throws RemoteException;
}
