package com.asiainfo.crm.inter.exe.webservice.client.phobook.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.inter.exe.webservice.client.phobook.bo.BOIntPhoSubBean;
import com.asiainfo.crm.inter.exe.webservice.client.phobook.bo.BOResAddressBean;
import com.asiainfo.crm.inter.exe.webservice.client.phobook.bo.QBOResAddressBean;
import com.asiainfo.crm.inter.exe.webservice.client.phobook.dao.interfaces.ICrm2PhoneDAO;
import com.asiainfo.crm.inter.exe.webservice.client.phobook.ivalues.IBOIntPhoSubValue;
import com.asiainfo.crm.inter.exe.webservice.client.phobook.ivalues.IBOResAddressValue;
import com.asiainfo.crm.inter.exe.webservice.client.phobook.ivalues.IQBOResAddressValue;
import com.asiainfo.crm.inter.exe.webservice.client.phobook.service.interfaces.IIntPhoSubSV;

public class IntPhoSubSVImpl implements IIntPhoSubSV {

	@Override
	public void saveBean(BOIntPhoSubBean bean) throws Exception {
		ICrm2PhoneDAO cpd = (ICrm2PhoneDAO) ServiceFactory.getService(ICrm2PhoneDAO.class);
		// AI-1214 -int_telephone_sub table ext3,ext4 need insert fixed value
		if(null != bean) {
			bean.setExt3("FALSE");
			bean.setExt4("customer does not give consent");
		}
		cpd.saveBean(bean);
	}

	@Override
	public void changeBean(BOIntPhoSubBean bean) throws Exception {
		ICrm2PhoneDAO cpd = (ICrm2PhoneDAO) ServiceFactory.getService(ICrm2PhoneDAO.class);
		// AI-1214 -int_telephone_sub table ext3,ext4 need insert fixed value
		if(null != bean) {
			bean.setExt3("FALSE");
			bean.setExt4("customer does not give consent");
		}
		cpd.changeBean(bean);
	}

	@Override
	public BOIntPhoSubBean[] getBeans(String userId) throws Exception {
		ICrm2PhoneDAO cpd = (ICrm2PhoneDAO) ServiceFactory.getService(ICrm2PhoneDAO.class);

		StringBuilder condition = new StringBuilder();
		condition.append(IBOIntPhoSubValue.S_TelephoSub).append("=:").append(IBOIntPhoSubValue.S_TelephoSub);
		condition.append(" AND ").append(IBOIntPhoSubValue.S_Status).append("=:").append(IBOIntPhoSubValue.S_Status);

		Map parameter = new HashMap();
		parameter.put(IBOIntPhoSubValue.S_TelephoSub, userId);
		parameter.put(IBOIntPhoSubValue.S_Status, IBOIntPhoSubValue.USED);

		return cpd.getBeans(condition.toString(), parameter);
	}
	//add by sunjing3
	public BOIntPhoSubBean[] getBeans(String userId,String billId) throws Exception {
		ICrm2PhoneDAO cpd = (ICrm2PhoneDAO) ServiceFactory.getService(ICrm2PhoneDAO.class);

		StringBuilder condition = new StringBuilder();
		condition.append(IBOIntPhoSubValue.S_TelephoSub).append("=:").append(IBOIntPhoSubValue.S_TelephoSub);
		condition.append(" AND ").append(IBOIntPhoSubValue.S_DanishTelephoNumId).append("=:").append(IBOIntPhoSubValue.S_DanishTelephoNumId);
		condition.append(" AND ").append(IBOIntPhoSubValue.S_Status).append("=:").append(IBOIntPhoSubValue.S_Status);

		Map parameter = new HashMap();
		parameter.put(IBOIntPhoSubValue.S_TelephoSub, userId);
		parameter.put(IBOIntPhoSubValue.S_DanishTelephoNumId, billId);
		parameter.put(IBOIntPhoSubValue.S_Status, IBOIntPhoSubValue.USED);

		return cpd.getBeans(condition.toString(), parameter);
	}
	
//	/**
//	 * @add by liaopeng
//	 */	
//	public void saveResBean(BOResAddressBean b) throws Exception{
//		ICrm2PhoneDAO cpd = (ICrm2PhoneDAO) ServiceFactory.getService(ICrm2PhoneDAO.class);
//		cpd.saveResBean(b);
//	}
//
//	public void changeResBean(BOResAddressBean b) throws Exception{
//		ICrm2PhoneDAO cpd = (ICrm2PhoneDAO) ServiceFactory.getService(ICrm2PhoneDAO.class);
//		cpd.saveResBean(b);
//	}
//	
//	public BOResAddressBean[] getResBeans(String userId) throws Exception{		
//		StringBuilder condition = new StringBuilder();
//		condition.append(IBOResAddressValue.S_UserId).append("=:").append(IBOResAddressValue.S_UserId);
//		condition.append(" AND ").append(IBOResAddressValue.S_State).append("=:").append(IBOResAddressValue.S_State);
//
//		Map parameter = new HashMap();
//		parameter.put(IBOResAddressValue.S_UserId, userId);
//		parameter.put(IBOResAddressValue.S_State, IQBOResAddressValue.USED);
//		ICrm2PhoneDAO cpd = (ICrm2PhoneDAO) ServiceFactory.getService(ICrm2PhoneDAO.class);
//		return cpd.getResBeans(condition.toString(), parameter);
//	}
//
//	public QBOResAddressBean[] getQResBeans(String userId) throws Exception{		
//		StringBuilder condition = new StringBuilder();
//		condition.append(IQBOResAddressValue.S_TelephoSub).append("=:").append(IQBOResAddressValue.S_TelephoSub);
//		condition.append(" AND ").append(IQBOResAddressValue.S_Status).append("=:").append(IQBOResAddressValue.S_Status);
//
//		Map parameter = new HashMap();
//		parameter.put(IQBOResAddressValue.S_TelephoSub, userId);
//		parameter.put(IQBOResAddressValue.S_Status, IQBOResAddressValue.USED);
//		ICrm2PhoneDAO cpd = (ICrm2PhoneDAO) ServiceFactory.getService(ICrm2PhoneDAO.class);
//		return cpd.getQResBeans(condition.toString(), parameter);
//	}

}
