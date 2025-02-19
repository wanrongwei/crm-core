package com.asiainfo.crm.inter.exe.webservice.client.sf.auto;

import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;

public interface SfServerSVImplService extends Service {

	public String getSF4CRMAddress();

	public SfAutoService getSF4CRM() throws ServiceException;

	public SfAutoService getSF4CRM(java.net.URL portAddress) throws ServiceException;

}
