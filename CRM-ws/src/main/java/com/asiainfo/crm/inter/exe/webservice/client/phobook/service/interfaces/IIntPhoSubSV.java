package com.asiainfo.crm.inter.exe.webservice.client.phobook.service.interfaces;

import java.util.Map;

import com.asiainfo.crm.inter.exe.webservice.client.phobook.bo.BOIntPhoSubBean;
import com.asiainfo.crm.inter.exe.webservice.client.phobook.bo.BOResAddressBean;
import com.asiainfo.crm.inter.exe.webservice.client.phobook.bo.QBOResAddressBean;

public interface IIntPhoSubSV {

	public void saveBean(BOIntPhoSubBean b) throws Exception;

	public void changeBean(BOIntPhoSubBean b) throws Exception;

	public BOIntPhoSubBean[] getBeans(String userId) throws Exception;
	
	//add by sunjing3
	public BOIntPhoSubBean[] getBeans(String userId,String billId) throws Exception;
	
//	/**
//	 * @add by liaopeng
//	 */	
//	public void saveResBean(BOResAddressBean b) throws Exception;
//
//	public void changeResBean(BOResAddressBean b) throws Exception;
//	
//	public BOResAddressBean[] getResBeans(String userId) throws Exception;
//
//	public QBOResAddressBean[] getQResBeans(String userId) throws Exception;

}
