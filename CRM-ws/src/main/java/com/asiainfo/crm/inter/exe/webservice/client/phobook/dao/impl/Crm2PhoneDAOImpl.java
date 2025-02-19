package com.asiainfo.crm.inter.exe.webservice.client.phobook.dao.impl;

import java.util.Map;

import com.asiainfo.crm.inter.exe.webservice.client.phobook.bo.BOIntPhoSubBean;
import com.asiainfo.crm.inter.exe.webservice.client.phobook.bo.BOIntPhoSubEngine;
import com.asiainfo.crm.inter.exe.webservice.client.phobook.bo.BOResAddressBean;
import com.asiainfo.crm.inter.exe.webservice.client.phobook.bo.BOResAddressEngine;
import com.asiainfo.crm.inter.exe.webservice.client.phobook.bo.QBOResAddressBean;
import com.asiainfo.crm.inter.exe.webservice.client.phobook.bo.QBOResAddressEngine;
import com.asiainfo.crm.inter.exe.webservice.client.phobook.dao.interfaces.ICrm2PhoneDAO;

public class Crm2PhoneDAOImpl implements ICrm2PhoneDAO {

	@Override
	public void saveBean(BOIntPhoSubBean b) throws Exception {
		long subId = BOIntPhoSubEngine.getNewId().longValue();
		b.setSubId(subId);
		BOIntPhoSubEngine.save(b);
				
	}

	public void changeBean(BOIntPhoSubBean b) throws Exception {
		BOIntPhoSubEngine.save(b);
	}

	@Override
	public BOIntPhoSubBean[] getBeans(String condition, Map parameter) throws Exception {
		return BOIntPhoSubEngine.getBeans(condition, parameter);
	}
	
	//
	
	@Override
	public QBOResAddressBean[] getQResBeans(String cond, Map par) throws Exception {
		return QBOResAddressEngine.getBeans(cond, par);
	}
	
	@Override
	public BOResAddressBean[] getResBeans(String cond, Map par) throws Exception {
		return BOResAddressEngine.getBeans(cond, par);
	}
	
	@Override
	public void saveResBean(BOResAddressBean b) throws Exception {
		BOResAddressEngine.save(b);
		
	}

	@Override
	public void changeResBean(BOResAddressBean b) throws Exception {
		// TODO Auto-generated method stub
		BOResAddressEngine.save(b);
		
	}
	

}