package com.asiainfo.crm.cm.hu.teaminvoke.out.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.hu.account.service.interfaces.ICmHUAccountSV;
import com.asiainfo.crm.cm.hu.teaminvoke.out.service.interfaces.ICm2InterHUSV;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmContactContMediumPojoBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmCustContactMediumBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmContactContMediumPojoValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustContactMediumValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmCustContMediumAndTypeValue;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;

public class Cm2InterHUSVImpl implements ICm2InterHUSV {
	private transient static Log log = LogFactory.getLog(Cm2InterHUSVImpl.class);
	public void saveCustContMediums(IBOCmCustContactMediumValue[] custContactMediumValues) throws Exception {
		if (custContactMediumValues != null || custContactMediumValues.length > 0) {
			ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			long relaId = 0;
			IBOCmCustContactMediumValue temp = null;
			List result = new ArrayList();
			for (int i = 0; i < custContactMediumValues.length; i++) {
				relaId = custContactMediumValues[i].getCustContRelaId();
				if (relaId > 0) {
					temp = new BOCmCustContactMediumBean();
					IQBOCmCustContMediumAndTypeValue custContMediumAndTypeValue = customerSV.queryCustContactMedium(relaId);
					if (custContMediumAndTypeValue != null) {
						temp.copy(custContMediumAndTypeValue);
						temp.setIsNoDisturbing(custContactMediumValues[i].getIsNoDisturbing());
						temp.setPriority(custContactMediumValues[i].getPriority());
						if (StringUtils.isNotBlank(custContactMediumValues[i].getContNumber())) {
							temp.setContNumber(custContactMediumValues[i].getContNumber());
						}
						if (StringUtils.isNotBlank(custContactMediumValues[i].getEmailAddress())) {
							temp.setEmailAddress(custContactMediumValues[i].getEmailAddress());
						}
						if (StringUtils.isNotBlank(custContactMediumValues[i].getRemarks())) {
							temp.setRemarks(custContactMediumValues[i].getRemarks());
						}
						if (StringUtils.isNotBlank(custContactMediumValues[i].getFaxNumber())) {
							temp.setFaxNumber(custContactMediumValues[i].getFaxNumber());
						}
						if (custContactMediumValues[i].getContMedTypeId() > 0) {
							temp.setContMedTypeId(custContactMediumValues[i].getContMedTypeId());
						}
						result.add(temp);
					}
				} else {
					custContactMediumValues[i].setRegionId(CmCommonUtil.getDefaultRegionId());
					custContactMediumValues[i].setState(CmConstants.RecordState.USE);
					custContactMediumValues[i].setStsToNew();
					result.add(custContactMediumValues[i]);
				}
			}
			if (!result.isEmpty()) {
				customerSV.saveCustContMedium((IBOCmCustContactMediumValue[]) result.toArray(new IBOCmCustContactMediumValue[0]));
			}
		}

	}

	/**
	 *保存party 对应的联系媒介
	 */
	public void saveContactContMediums(IBOCmContactContMediumPojoValue[] contactContMediumValues) throws Exception {
		if(null!=contactContMediumValues&&contactContMediumValues.length>0){
			List result = new ArrayList();
			ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			for (int i = 0; i < contactContMediumValues.length; i++) {
				long lo_ContRelaId = contactContMediumValues[i].getContRelaId();
				BOCmContactContMediumPojoBean contactContMediumBean_copy = null;
				if(lo_ContRelaId>0){
					IBOCmContactContMediumPojoValue[] contactContMediumValue =  customerSV.queryContactContMediumValueByContRelaId(lo_ContRelaId);
					if(null!=contactContMediumValue&&contactContMediumValue.length>0){
						contactContMediumBean_copy = new BOCmContactContMediumPojoBean();
						contactContMediumBean_copy.copy(contactContMediumValue[0]);
						if(null!=contactContMediumValues[i].getEmailAddress()&&contactContMediumValues[i].getEmailAddress().length()>0&&!"null".equalsIgnoreCase(contactContMediumValues[i].getEmailAddress())){
							contactContMediumBean_copy.setEmailAddress(contactContMediumValues[i].getEmailAddress());
						}
						
						if(null!=contactContMediumValues[i].getFaxNumber()&&contactContMediumValues[i].getFaxNumber().length()>0&&!"null".equalsIgnoreCase(contactContMediumValues[i].getFaxNumber())){
							contactContMediumBean_copy.setFaxNumber(contactContMediumValues[i].getFaxNumber());
						}
						
						if(null!=contactContMediumValues[i].getContNumber()&&contactContMediumValues[i].getContNumber().length()>0&&!"null".equalsIgnoreCase(contactContMediumValues[i].getContNumber())){
							contactContMediumBean_copy.setContNumber(contactContMediumValues[i].getContNumber());
						}
						contactContMediumBean_copy.setIsNoDisturbing(contactContMediumValues[i].getIsNoDisturbing());
						contactContMediumBean_copy.setPriority(contactContMediumValues[i].getPriority());
						contactContMediumBean_copy.setContMedTypeId(contactContMediumValues[i].getContMedTypeId());
						contactContMediumBean_copy.setRemarks(contactContMediumValues[i].getRemarks());
						result.add(contactContMediumBean_copy);
					}
				}else{
					long priority_long =  contactContMediumValues[i].getPriority();
					if(priority_long<1){
						ExceptionUtil.throwBusinessException("INS10034", "Priority");
					}
					long IsNo_long =  contactContMediumValues[i].getIsNoDisturbing();
					if(StringUtils.isNotBlank(String.valueOf(IsNo_long)) && StringUtils.isNumeric(String.valueOf(IsNo_long))) {
						if (IsNo_long != 0L && IsNo_long != 1L ) {
							throw new RuntimeException("Please input correct IsNoDisturbing [0,1]" );
						}
					}else{
						contactContMediumValues[i].setIsNoDisturbing(1);
					}
					contactContMediumValues[i].setRegionId(CmCommonUtil.getDefaultRegionId());
					contactContMediumValues[i].setState(CmConstants.RecordState.USE);
					contactContMediumValues[i].setStsToNew();
					//设置新的cont_rela_id
					contactContMediumValues[i].setContRelaId(CmCommonUtil.getNewSequence(BOCmContactContMediumPojoBean.class));
					contactContMediumBean_copy = new BOCmContactContMediumPojoBean();
					contactContMediumBean_copy.copy(contactContMediumValues[i]);
					result.add(contactContMediumBean_copy);
				}
			}
			if(result.size()>0){
				customerSV.saveContactContMediumForOSE((BOCmContactContMediumPojoBean[]) result.toArray(new BOCmContactContMediumPojoBean[0]));
			}
		}
	}
	
	public DataContainerInterface[] queryPayerAccts(long custId) throws Exception {
		ICmHUAccountSV accountSV = (ICmHUAccountSV) ServiceFactory.getService(ICmHUAccountSV.class);
		return accountSV.queryPayerAccts(custId);
	}

}
