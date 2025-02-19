package com.asiainfo.crm.cm.customer.group.service.impl;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.customer.group.dao.interfaces.ICmGroupStaffAmountDAO;
import com.asiainfo.crm.cm.customer.group.service.interfaces.ICmParentGroupStaffAmountSV;

public class CmParentGroupStaffAmountSVImpl implements ICmParentGroupStaffAmountSV{

	public int queryParentGroupAmount(long custId, String tenantId)
			throws Exception {
		
		ICmGroupStaffAmountDAO dao = (ICmGroupStaffAmountDAO) ServiceFactory.getService(ICmGroupStaffAmountDAO.class);
		DataContainer[] datas = dao.queryGroupStaffAmount(custId, tenantId);
		if(null!=datas && datas.length>0){
			return datas[0].getAsInt("STAFF_AMOUNT");
		}
		return 0;
	}

	public long[] queryParentGroupCust(String tenantId, String regionId)
			throws Exception {
		ICmGroupStaffAmountDAO dao = (ICmGroupStaffAmountDAO) ServiceFactory.getService(ICmGroupStaffAmountDAO.class);
		DataContainer[] datas = dao.queryParentGroup(tenantId, regionId);
		long[] custIds = null;
		if(null!=datas && datas.length>0){
			custIds = new long[datas.length];
			for(int i=0;i<datas.length;i++){
				custIds[i] = datas[i].getAsLong("CUST_ID");
			}
		}
		return custIds;
	}

}
