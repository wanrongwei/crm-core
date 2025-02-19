package com.asiainfo.crm.cm.service.impl;

import com.asiainfo.crm.cm.busimodel.impl.equipment.AbstractRepaireCenterQueryModelImpl;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.bo.BOFactoryInfoBean;
import com.asiainfo.crm.cm.common.ivalues.IBOFactoryInfoValue;
import com.asiainfo.crm.cm.model.ivalues.ICmParaMaintainValue;
import com.asiainfo.crm.cm.service.interfaces.ICmEquRepareCenterSV;

public class CmEquRepareCenterSVImpl implements ICmEquRepareCenterSV {

	
	public ICmParaMaintainValue[] queryEquRepareCenter(String criteria,
			int startNum, int endNum) throws Exception {
	return (ICmParaMaintainValue[]) ((AbstractRepaireCenterQueryModelImpl) CmServiceFactory.getBusiMode(AbstractRepaireCenterQueryModelImpl.class)).queryData(criteria, startNum, endNum);
	}
	
	public int queryEquRepareCenterCount(String criteria) throws Exception {
		// TODO Auto-generated method stub
		return ((AbstractRepaireCenterQueryModelImpl) CmServiceFactory.getBusiMode(AbstractRepaireCenterQueryModelImpl.class)).queryCount(criteria);
	}

	public void saveEquRepareCenters(ICmParaMaintainValue[] values)
			throws Exception {
		// TODO Auto-generated method stub
		((AbstractRepaireCenterQueryModelImpl) CmServiceFactory.getBusiMode(AbstractRepaireCenterQueryModelImpl.class)).saveRepaireCenterQuerys(values);
	}

	public IBOFactoryInfoValue[] findEquRepareCentersById()//<root></root>
			throws Exception {
		// TODO Auto-generated method stub
		return (IBOFactoryInfoValue[]) ((AbstractRepaireCenterQueryModelImpl) CmServiceFactory.getBusiMode(AbstractRepaireCenterQueryModelImpl.class)).queryAllData(new BOFactoryInfoBean[]{new BOFactoryInfoBean()}, -1, -1);
	}



}
