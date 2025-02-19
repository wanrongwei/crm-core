package com.asiainfo.crm.cm.inner.customer.dao.interfaces;

import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustSegmentRelaValue;

public interface ICmCustSegmentRelaDAO {
	public void save(IBOCmCustSegmentRelaValue value)throws Exception;
	
	public IBOCmCustSegmentRelaValue querySegmentByCustId(long custId)throws Exception;
}
