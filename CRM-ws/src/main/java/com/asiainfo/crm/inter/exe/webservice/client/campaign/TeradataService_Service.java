/**
 * TeradataService_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.campaign;

import java.net.URL;

import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;

public interface TeradataService_Service extends Service {
	public String getTeradataServiceAddress();

	public TeradataPortType getTeradataService() throws ServiceException;

	public TeradataPortType getTeradataService(URL portAddress)
			throws ServiceException;
}
