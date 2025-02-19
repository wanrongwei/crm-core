package com.asiainfo.crm.inter.exe.webservice.client.phobook.service.interfaces;

import com.asiainfo.crm.inter.exe.webservice.client.phobook.bo.BOIntPhoSubBean;
import com.asiainfo.crm.inter.exe.webservice.client.phobook.bo.QBOResAddressBean;

public interface IIntPhoAddrSV {

	public BOIntPhoSubBean[] getAddBeans(int start, int count) throws Exception;

	public BOIntPhoSubBean[] getAllBeans(int start, int count) throws Exception;

	public BOIntPhoSubBean[] getMonAddBeans(int start, int count) throws Exception;

	public int getCount(int week) throws Exception;

	public int getCount() throws Exception;
	
	public long getSequence(String sequencename) throws Exception;
	
	/**
	 * @add by liaopeng
	 */
	public QBOResAddressBean[] getAddResBeans(int start, int count) throws Exception;

	public QBOResAddressBean[] getAllResBeans(int start, int count) throws Exception;

	public QBOResAddressBean[] getMonAddResBeans(int start, int count) throws Exception;

	

}
