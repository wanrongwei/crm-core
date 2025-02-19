/**
 * NetsService_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.paymentNets;

import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;

public interface NetsService_Service extends Service {
    public java.lang.String getNetsServiceAddress();

    public NetsServiceSoapPort getNetsService() throws ServiceException;

    public NetsServiceSoapPort getNetsService(java.net.URL portAddress) throws ServiceException;
}
