package com.asiainfo.crm.cm.inner.customer.dao.impl;

import java.util.HashMap;

import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.customer.custmgr.bo.BOCmCustAdditionalInfoEngine;
import com.asiainfo.crm.cm.customer.custmgr.bo.BOCmCustAdditionalInfoHEngine;
import com.asiainfo.crm.cm.customer.custmgr.ivalues.IBOCmCustAdditionalInfoHValue;
import com.asiainfo.crm.cm.customer.custmgr.ivalues.IBOCmCustAdditionalInfoValue;
import com.asiainfo.crm.cm.inner.customer.dao.interfaces.ICMCustAdditionalInfoDAO;
import com.asiainfo.crm.cm.ln.common.ivalues.IBOLnCmInsCmRelValue;

public class CMCustAdditionalInfoDAOImpl implements ICMCustAdditionalInfoDAO {

	public IBOCmCustAdditionalInfoValue[] queryCustAdditionalInfo(long custId) throws Exception {
		
		if (custId <= 0) {
			ExceptionUtil.throwBusinessException("CMS5000001");
		}
		HashMap parameter = new HashMap();
		StringBuilder condition = new StringBuilder(" 1=1 ");
		condition.append(" AND ").append(IBOLnCmInsCmRelValue.S_CustId).append(" =:CUST_ID ");
		parameter.put("CUST_ID", Long.valueOf(custId));
		return BOCmCustAdditionalInfoEngine.getBeans(condition.toString(), parameter);
	}

	public void saveCustAdditionalInfo(IBOCmCustAdditionalInfoValue[] boCustAdditionalHisInfo) throws Exception {
		
		BOCmCustAdditionalInfoEngine.save(boCustAdditionalHisInfo);
	}
	
	public void saveCustAdditionalHisInfo(IBOCmCustAdditionalInfoHValue[] boCustAdditionalHisInfo) throws Exception {
		for(int i = 0;boCustAdditionalHisInfo!=null && i<boCustAdditionalHisInfo.length;i++) {
			if(boCustAdditionalHisInfo[i].getCustInfoId()<=0L) {
				boCustAdditionalHisInfo[i].setCustInfoId(BOCmCustAdditionalInfoHEngine.getNewId().longValue());
			}
		}
		BOCmCustAdditionalInfoHEngine.save(boCustAdditionalHisInfo);
	}
}
