package com.asiainfo.crm.inter.exe.webservice.client.phobook.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.common.ServiceManager;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.ai.common.util.StaticDataUtil;
import com.asiainfo.crm.inter.exe.webservice.client.phobook.bo.BOIntPhoSubBean;
import com.asiainfo.crm.inter.exe.webservice.client.phobook.bo.BOIntPhoSubEngine;
import com.asiainfo.crm.inter.exe.webservice.client.phobook.bo.QBOResAddressBean;
import com.asiainfo.crm.inter.exe.webservice.client.phobook.bo.QBOResAddressEngine;
import com.asiainfo.crm.inter.exe.webservice.client.phobook.ivalues.IBOIntPhoSubValue;
import com.asiainfo.crm.inter.exe.webservice.client.phobook.ivalues.IQBOResAddressValue;
import com.asiainfo.crm.inter.exe.webservice.client.phobook.service.interfaces.IIntPhoAddrSV;

public class IntPhoAddrSVImpl implements IIntPhoAddrSV {

	private static Log log = LogFactory.getLog(IIntPhoAddrSV.class);

	private final static String PHONEBOOK_PARAM = "PHONEBOOK_PARAM";
	private final static String TYPE_CODE = "TYPE_CODE";

/*	private static String getTypeCondition() {
		String condition = "";
		try {
			IBOBsStaticDataValue staticData = StaticDataUtil.getStaticData(PHONEBOOK_PARAM, TYPE_CODE);
			condition = staticData.getCodeName();
		} catch (Exception e) {
			log.error("Static Data Error, Get Mobile and Fixline Data Together.", e);
		}
		return condition;
	}*/

	/**
	 * 获得号簿增量数据
	 */
	public BOIntPhoSubBean[] getAddBeans(int start, int count) throws Exception {
		// TODO Auto-generated method stub
		String condition = IBOIntPhoSubValue.S_CreateDate + " BETWEEN DATE_SUB( CURDATE(), INTERVAL 1 DAY) AND CURDATE() limit " + start + "," + count;
		Map parameter = new HashMap();
		BOIntPhoSubBean[] bean2Xml = BOIntPhoSubEngine.getBeans(condition, parameter);
		return bean2Xml;
	}

	/**
	 * 获得号簿周一增量数据
	 */
	public BOIntPhoSubBean[] getMonAddBeans(int start, int count) throws Exception {
		// TODO Auto-generated method stub
		String condition = IBOIntPhoSubValue.S_CreateDate + " BETWEEN DATE_SUB( CURDATE(), INTERVAL 3 DAY) AND CURDATE() limit " + start + "," + count;
		Map parameter = new HashMap();
		BOIntPhoSubBean[] bean2Xml = BOIntPhoSubEngine.getBeans(condition, parameter);
		return bean2Xml;
	}

	/**
	 * 获得号簿全量数据
	 */
	public BOIntPhoSubBean[] getAllBeans(int start, int count) throws Exception {
		Map parameter = new HashMap();
		parameter.put(IBOIntPhoSubValue.S_Status, IBOIntPhoSubValue.USED);

		StringBuilder sb = new StringBuilder();
		sb.append(IBOIntPhoSubValue.S_Status).append("=:").append(IBOIntPhoSubValue.S_Status).append(" ");
		sb.append(" AND ").append(IBOIntPhoSubValue.S_CreateDate).append("< CURDATE() ");
		sb.append(" limit ").append(start).append(",").append(count);

		BOIntPhoSubBean[] bean2Xml = BOIntPhoSubEngine.getBeans(sb.toString(), parameter);
		return bean2Xml;
	}

	@Override
	public int getCount() throws Exception {
		Map parameter = new HashMap();

		parameter.put(IQBOResAddressValue.S_Status, IQBOResAddressValue.USED);

		StringBuilder sb = new StringBuilder();

		sb.append(IQBOResAddressValue.S_Status).append("=:").append(IQBOResAddressValue.S_Status);
		//modify by liaopeng
		sb.append(" AND ").append(IQBOResAddressValue.S_CreateDate).append("< CURDATE() +1");
	
		return QBOResAddressEngine.getBeansCount(sb.toString(), parameter);
	}

	/**
	 * 获得总记录数 周一 2 周五 6
	 */
	public int getCount(int week) throws Exception {
		// TODO Auto-generated method stub
		Map parameter = new HashMap();
		int count = 0;
		if (week == 2) {
//			String condition = IBOIntPhoSubValue.S_CreateDate + " BETWEEN DATE_SUB( CURDATE(), INTERVAL 3 DAY) AND CURDATE()";
//			count = BOIntPhoSubEngine.getBeansCount(condition, parameter);
			//modify by liaopeng
			String condition = IQBOResAddressValue.S_CreateDate + " BETWEEN DATE_SUB( CURDATE(), INTERVAL 3 DAY) AND CURDATE()";
			count = QBOResAddressEngine.getBeansCount(condition, parameter);
		} else if (week == 6) {
//			count = BOIntPhoSubEngine.getBeansCount("", parameter);
			count = QBOResAddressEngine.getBeansCount("", parameter);
		} else {
//			String condition = IBOIntPhoSubValue.S_CreateDate + " BETWEEN DATE_SUB( CURDATE(), INTERVAL 1 DAY) AND CURDATE()";
//			count = BOIntPhoSubEngine.getBeansCount(condition, parameter);
			
			String condition = IQBOResAddressValue.S_CreateDate + " BETWEEN DATE_SUB( CURDATE(), INTERVAL 1 DAY) AND CURDATE()";
			count = QBOResAddressEngine.getBeansCount(condition, parameter);
		}
		return count;
	}

	@Override
	public long getSequence(String sequencename) throws Exception {
		return ServiceManager.getIdGenerator().getNewId(sequencename).longValue();
	}
	
	/**
	 * @add by liaopeng
	 */
	public QBOResAddressBean[] getAddResBeans(int start, int count) throws Exception{
		// TODO Auto-generated method stub
		String condition = IQBOResAddressValue.S_CreateDate + " BETWEEN DATE_SUB( CURDATE(), INTERVAL 1 DAY) AND CURDATE() limit " + start + "," + count;
		Map parameter = new HashMap();
		QBOResAddressBean[] bean2Xml = QBOResAddressEngine.getBeans(condition, parameter);
		return bean2Xml;
	}
	
	/**
	 * 获得号簿增量数据
	 */
	public QBOResAddressBean[] getAllResBeans(int start, int count) throws Exception{
		Map parameter = new HashMap();
		parameter.put(IQBOResAddressValue.S_Status, IQBOResAddressValue.USED);

		StringBuilder sb = new StringBuilder();
		sb.append(IQBOResAddressValue.S_Status).append("=:").append(IQBOResAddressValue.S_Status).append(" ");
		//modify by liaopeng
		sb.append(" AND ").append(IQBOResAddressValue.S_CreateDate).append("< CURDATE() +1");
		sb.append(" limit ").append(start).append(",").append(count);

		QBOResAddressBean[] bean2Xml = QBOResAddressEngine.getBeans(sb.toString(), parameter);
		return bean2Xml;
	}

	public QBOResAddressBean[] getMonAddResBeans(int start, int count) throws Exception{
		// TODO Auto-generated method stub
		String condition = IQBOResAddressValue.S_CreateDate + " BETWEEN DATE_SUB( CURDATE(), INTERVAL 3 DAY) AND CURDATE() limit " + start + "," + count;
		Map parameter = new HashMap();
		QBOResAddressBean[] bean2Xml = QBOResAddressEngine.getBeans(condition, parameter);
		return bean2Xml;
	}


}
