package com.asiainfo.crm.cm.inner.customer.service.impl;

import com.ai.appframe2.common.DataStructInterface;
import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.inner.customer.dao.interfaces.ICmCustSegmentRelaDAO;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustSegmentRelaValue;
import com.asiainfo.crm.cm.inner.customer.service.interfaces.ICmCustSegmentRelaSV;
import com.asiainfo.crm.cm.inner.log.bo.BOCmHisRecordBean;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.service.interfaces.ICmBusiLogSV;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;

public class CmCustSegmentRelaSVImpl implements ICmCustSegmentRelaSV{

	public void saveSegmentRela(IBOCmCustSegmentRelaValue value)
			throws Exception {
		ICmCustSegmentRelaDAO dao = (ICmCustSegmentRelaDAO) ServiceFactory.getService(ICmCustSegmentRelaDAO.class);
		//客户细分修改记录历史变更记录
		if(value.isModified()){
			ICmCustomerSV cmCustomerSV = (ICmCustomerSV)ServiceFactory.getService(ICmCustomerSV.class);
			ICustomerValue customerValue = cmCustomerSV.queryCustomerByCustId(value.getCustId());
			ICmBusiLogSV sv = (ICmBusiLogSV) ServiceFactory
					.getService(ICmBusiLogSV.class);
			BOCmHisRecordBean recordBean = sv
					.convertHisRecord(
							new DataStructInterface[] {value},CmConstants.HisRecordType.SEGMENT,
							customerValue.getCustName(), customerValue
									.getCustId());
			sv.saveHisRecord(recordBean);
		}
		dao.save(value);
	}

	public IBOCmCustSegmentRelaValue querySegmentRelaByCustId(long custId)
			throws Exception {
		ICmCustSegmentRelaDAO dao = (ICmCustSegmentRelaDAO) ServiceFactory.getService(ICmCustSegmentRelaDAO.class);
		return dao.querySegmentByCustId(custId);
	}

}
