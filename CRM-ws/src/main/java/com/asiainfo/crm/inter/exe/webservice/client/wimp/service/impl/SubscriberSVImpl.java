package com.asiainfo.crm.inter.exe.webservice.client.wimp.service.impl;

import java.io.BufferedReader;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.inter.exe.webservice.client.wimp.bo.BOActivateWimpSubscriberBean;
import com.asiainfo.crm.inter.exe.webservice.client.wimp.bo.BOActivateWimpSubscriberEngine;
import com.asiainfo.crm.inter.exe.webservice.client.wimp.bo.IBOActivateWimpSubscriberValue;
import com.asiainfo.crm.inter.exe.webservice.client.wimp.dao.interfaces.IActWimpSubscriberDAO;
import com.asiainfo.crm.inter.exe.webservice.client.wimp.service.interfaces.ISubscriberSV;
import com.asiainfo.crm.so.teaminvoke.out.service.interfaces.ICrmFSV;

public class SubscriberSVImpl implements ISubscriberSV {

	private static int BATCH_SIZE = 1000;// 每次批量提交的数据大小

	private static Log log = LogFactory.getLog(SubscriberSVImpl.class);

	private IBOActivateWimpSubscriberValue[] aValues = null;

	private int i = 0;

	@Override
	public void parseData(BufferedReader reader, String fileDate)
			throws Exception {
		String data = null;

		i = 0;// 数组索引
		int lineNum = 1;

		aValues = new IBOActivateWimpSubscriberValue[BATCH_SIZE];
		IActWimpSubscriberDAO actWimpSubscribeDAO = (IActWimpSubscriberDAO) ServiceFactory
				.getService(IActWimpSubscriberDAO.class);
		while ((data = reader.readLine()) != null) {
			if (lineNum == 1) {
				// 校验第一栏的头部信息
				if (!data
						.equalsIgnoreCase("username;activation_date;last_stream_date;extract_date;customerid")) {
					if (log.isErrorEnabled()) {
						log.error("Header information is not correct");
					}
					return;
				}

			} else {

				IBOActivateWimpSubscriberValue aValue = transfer(data, fileDate);
				if (aValue == null) {// 这行数据有问题,回退
					if (log.isErrorEnabled()) {
						log.error( lineNum + "row data into the value of failure:" + data);  //行数据转化为value失败：
					}
					throw new Exception( lineNum + "row data into the value of failure:"   //行数据转化为value失败：
							+ data);
				} else {
					aValues[i++] = aValue;
					if (i == BATCH_SIZE) {
						actWimpSubscribeDAO.save(aValues);
						reInit();
					}

				}

			}
			lineNum++;
		}
		if (i != 0) {
			int length = i;
			IBOActivateWimpSubscriberValue[] tempValues = new IBOActivateWimpSubscriberValue[length];
			System.arraycopy(aValues, 0, tempValues, 0, length);
			actWimpSubscribeDAO.save(tempValues);
		}

	}

	public void reInit() {
		i = 0;
	}

	/**
	 * 将数据转化为IValue
	 * username;activation_date;last_stream_date;extract_date;customerid
	 * 
	 * @param data
	 * @return
	 */
	public IBOActivateWimpSubscriberValue transfer(String data, String fileDate) {
		IBOActivateWimpSubscriberValue aValue = null;
		try {

			aValue = new BOActivateWimpSubscriberBean();
			String[] fields = data.split(";");
			if (fields.length != 5) {
				return null;
			}

			// 校验username

			if (fields[0].length() > 50) {// 长度不符合要求
				return null;
			}

			// 待实现
			aValue.setUsername(fields[0]);

			SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
			Date date = sf.parse(fields[1]);
			aValue.setActivationDate(new java.sql.Date(date.getTime()));

			date = sf.parse(fields[2]);
			aValue.setLastStreamDate(new java.sql.Date(date.getTime()));

			date = sf.parse(fields[3]);
			aValue.setExtractDate(new java.sql.Date(date.getTime()));

			// 校验customerid
			// Vers CustomerId link Vers SubscriptionId via '_', Such as
			// customerId_subscriptionId

			if (fields[4].length() > 50) {// 长度不符合要求
				return null;
			}
			if (!fields[4].contains("_")) {
				return null;
			}

			// 待实现
			aValue.setCustomerid(fields[4]);
			aValue.setSubscriberid(BOActivateWimpSubscriberEngine.getNewId()
					.longValue());

			aValue.setInsertTime(BOActivateWimpSubscriberEngine.getSysDate());

			aValue.setFiledate(fileDate);

			aValue.setStsToNew();
		} catch (Exception e) {
			if (log.isErrorEnabled()) {
				log.error(e);
			}
			return null;
		}
		return aValue;
	}

	public static void main(String[] args) {

		try {
			System.setProperty("tenant.id", "21");//设置租户
			SubscriberSVImpl subscriberSVImpl = new SubscriberSVImpl();
			subscriberSVImpl.updateWimpActiveState("20141223");
		} catch (Exception e) {
			if(log.isDebugEnabled()){
				log.debug("", e);
			}
			e.printStackTrace();
		}

	}

	
	public void updateWimpActiveState(String batchId) throws Exception {
		// TODO Auto-generated method stub
		
		IActWimpSubscriberDAO actWimpSubscribeDAO = (IActWimpSubscriberDAO) ServiceFactory
				.getService(IActWimpSubscriberDAO.class);

		ICrmFSV crmFSV = (ICrmFSV) ServiceFactory.getService(ICrmFSV.class);

		IBOActivateWimpSubscriberValue[] aValues = actWimpSubscribeDAO
				.queryByBatchId(batchId);

		if (aValues == null || aValues.length == 0) {
			if (log.isErrorEnabled()) {
				log.error("The batch" + batchId + "no WIMP data");  //此次批次没有WIMP数据
			}
			return;
		}
		for (IBOActivateWimpSubscriberValue value : aValues) {
			//String partenUserId = "1325387315_1325387315";
			String partenUserId = value.getCustomerid();
			crmFSV.updateWimpActiveState(partenUserId);
		}

	}

}
