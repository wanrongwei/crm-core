package com.asiainfo.crm.cm.inner.customer.service.interfaces;

import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustSegmentRelaValue;

public interface ICmCustSegmentRelaSV {
	public void saveSegmentRela(IBOCmCustSegmentRelaValue value)throws Exception;
	
	public IBOCmCustSegmentRelaValue querySegmentRelaByCustId(long custId)throws Exception; 
	
}
