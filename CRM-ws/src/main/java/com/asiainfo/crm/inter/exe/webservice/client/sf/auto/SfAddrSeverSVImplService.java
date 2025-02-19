/**
 * ResCrmSeverSVImplService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.sf.auto;

import java.net.URL;

import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;

public interface SfAddrSeverSVImplService extends Service {

	public String getRESaddr4CRMAddress();

	public SfAutoAddrService getRESaddr4CRM() throws ServiceException;

	public SfAutoAddrService getRESaddr4CRM(URL portAddress) throws ServiceException;

}
