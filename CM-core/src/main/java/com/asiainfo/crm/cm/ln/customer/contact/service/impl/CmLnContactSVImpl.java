package com.asiainfo.crm.cm.ln.customer.contact.service.impl;

import java.util.HashMap;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractCmCommonDealModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.account.bo.BOCmAcctContactBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupContactQryEngine;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupContactQryValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.ln.customer.contact.bo.BOLnCmxPartyContactBean;
import com.asiainfo.crm.cm.ln.customer.contact.ivalues.IBOLnCmxPartyContactValue;
import com.asiainfo.crm.cm.ln.customer.contact.service.interfaces.ICmLnContactSV;

public class CmLnContactSVImpl implements ICmLnContactSV {

	public void saveCmxPartyContacts(IBOLnCmxPartyContactValue[] partyContactValues) throws Exception {
		int len = partyContactValues.length;
		BOLnCmxPartyContactBean[] partyContactBeans = new BOLnCmxPartyContactBean[len];
		for (int i = 0; i < len; i++) {
			partyContactBeans[i] = new BOLnCmxPartyContactBean();
			partyContactBeans[i].copy(partyContactValues[i]);
			if(StringUtils.isBlank(partyContactBeans[i].getState())){
				partyContactBeans[i].setState(CmConstants.RecordState.USE);
			}
		}
		CmInnerServiceFactory.getCommonInnerSV().saveBeans(partyContactBeans);
	}

	public IBOLnCmxPartyContactValue queryPartyContactByContId(long contId) throws Exception {
		IBOLnCmxPartyContactValue cmxPartyContactValue = new BOLnCmxPartyContactBean();
		cmxPartyContactValue.setContId(contId);
		DataContainerInterface dc = CmInnerServiceFactory.getCommonInnerSV().getBean((DataContainerInterface) cmxPartyContactValue);
		return (IBOLnCmxPartyContactValue) dc;
	}

	public void saveData(DataContainer[] values) throws Exception
	{
		for(DataContainer value:values)
		{
			if(value.isNew())
				((BOCmAcctContactBean)value).setAcctContId(CmCommonUtil.getNewSequence(BOCmAcctContactBean.class));
		}
		((AbstractCmCommonDealModelImpl) CmServiceFactory.getBusiMode(AbstractCmCommonDealModelImpl.class)).saveData(values);
	
	}

	public IBOCmGroupContactQryValue[] queryGroupContactByCustId(long custId)
			throws Exception {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(" 1=1 ");
	
		if (custId > 0) {
			condition.append(" AND ").append(IBOCmGroupContactQryValue.S_CustId).append(" = :custId ");
			paraMap.put("custId", Long.valueOf(custId));
		}
		return BOCmGroupContactQryEngine.getBeans(condition.toString(), paraMap);
	}

}
