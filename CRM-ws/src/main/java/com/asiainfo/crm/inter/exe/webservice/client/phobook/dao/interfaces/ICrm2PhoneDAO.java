package com.asiainfo.crm.inter.exe.webservice.client.phobook.dao.interfaces;

import java.util.Map;

import com.asiainfo.crm.inter.exe.webservice.client.phobook.bo.BOIntPhoSubBean;
import com.asiainfo.crm.inter.exe.webservice.client.phobook.bo.BOResAddressBean;
import com.asiainfo.crm.inter.exe.webservice.client.phobook.bo.QBOResAddressBean;

public interface ICrm2PhoneDAO {

	public void saveBean(BOIntPhoSubBean b) throws Exception;

	public void changeBean(BOIntPhoSubBean b) throws Exception;

	public BOIntPhoSubBean[] getBeans(String condition, Map parameter) throws Exception;
	
	/** 
	 * @Add by liaopeng
	 * @throws Exception
	 */
	public void saveResBean(BOResAddressBean b) throws Exception;

	public void changeResBean(BOResAddressBean b) throws Exception;
	
	public BOResAddressBean[] getResBeans(String cond, Map par) throws Exception;

	public QBOResAddressBean[] getQResBeans(String cond, Map par) throws Exception;
	
}
