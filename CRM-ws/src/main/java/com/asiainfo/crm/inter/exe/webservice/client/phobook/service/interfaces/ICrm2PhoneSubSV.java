package com.asiainfo.crm.inter.exe.webservice.client.phobook.service.interfaces;

import com.asiainfo.crm.cm.common.util.ws.address;
import com.asiainfo.crm.inter.exe.webservice.client.phobook.bo.BOIntPhoSubBean;
import com.asiainfo.crm.so.common.party.ivalues.IBOInsxUserAddressValue;

import java.util.Map;

public interface ICrm2PhoneSubSV {

	public void saveBean(Map m) throws Exception;

	public void changeBean( Map m) throws Exception;

	public void deleteBean(String userId,String billId) throws Exception;
	public void deleteBean(String userId) throws Exception;

	public BOIntPhoSubBean[] getBean(String userId,String billId) throws Exception;
	public BOIntPhoSubBean[] getBean(String userId) throws Exception;
	
//	/**
//	 * 
//	 * @add by liaopeng
//	 * @throws Exception
//	 */
//	public void saveResBean(Map m) throws Exception;
//
//	public void changeResBean( Map m) throws Exception;
//
//	public void deleteResBean(String userId) throws Exception;
//
//	public QBOResAddressBean[] getQBOBean(String userId) throws Exception;

	/**
	 *
	 * @param m
	 * @param legalAddress
	 */
	public void initForeinAddressMapFromLegalAddress(Map<String, Object> m, address legalAddress);

	/**
	 *
	 * @param m
	 * @param insxUserAddrs
	 */
	public void initForeinAddressFromInsxUserAddress(Map<String, Object> m, IBOInsxUserAddressValue insxUserAddrs);

}
